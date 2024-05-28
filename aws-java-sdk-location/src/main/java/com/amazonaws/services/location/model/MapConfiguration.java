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
     * Specifies the political view for the style. Leave unset to not use a political view, or, for styles that support
     * specific political views, you can choose a view, such as <code>IND</code> for the Indian view.
     * </p>
     * <p>
     * Default is unset.
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
     * Specifies the map style selected from an available data provider.
     * </p>
     * <p>
     * Valid <a href="https://docs.aws.amazon.com/location/latest/developerguide/esri.html">Esri map styles</a>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>VectorEsriNavigation</code> – The Esri Navigation map style, which provides a detailed basemap for the
     * world symbolized with a custom navigation map style that's designed for use during the day in mobile devices. It
     * also includes a richer set of places, such as shops, services, restaurants, attractions, and other points of
     * interest. Enable the <code>POI</code> layer by setting it in CustomLayers to leverage the additional places data.
     * </p>
     * <p/></li>
     * <li>
     * <p>
     * <code>RasterEsriImagery</code> – The Esri Imagery map style. A raster basemap that provides one meter or better
     * satellite and aerial imagery in many parts of the world and lower resolution satellite imagery worldwide.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>VectorEsriLightGrayCanvas</code> – The Esri Light Gray Canvas map style, which provides a detailed vector
     * basemap with a light gray, neutral background style with minimal colors, labels, and features that's designed to
     * draw attention to your thematic content.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>VectorEsriTopographic</code> – The Esri Light map style, which provides a detailed vector basemap with a
     * classic Esri map style.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>VectorEsriStreets</code> – The Esri Street Map style, which provides a detailed vector basemap for the
     * world symbolized with a classic Esri street map style. The vector tile layer is similar in content and style to
     * the World Street Map raster map.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>VectorEsriDarkGrayCanvas</code> – The Esri Dark Gray Canvas map style. A vector basemap with a dark gray,
     * neutral background with minimal colors, labels, and features that's designed to draw attention to your thematic
     * content.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Valid <a href="https://docs.aws.amazon.com/location/latest/developerguide/HERE.html">HERE Technologies map
     * styles</a>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>VectorHereExplore</code> – A default HERE map style containing a neutral, global map and its features
     * including roads, buildings, landmarks, and water features. It also now includes a fully designed map of Japan.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RasterHereExploreSatellite</code> – A global map containing high resolution satellite imagery.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>HybridHereExploreSatellite</code> – A global map displaying the road network, street names, and city labels
     * over satellite imagery. This style will automatically retrieve both raster and vector tiles, and your charges
     * will be based on total tiles retrieved.
     * </p>
     * <note>
     * <p>
     * Hybrid styles use both vector and raster tiles when rendering the map that you see. This means that more tiles
     * are retrieved than when using either vector or raster tiles alone. Your charges will include all tiles retrieved.
     * </p>
     * </note></li>
     * <li>
     * <p>
     * <code>VectorHereContrast</code> – The HERE Contrast (Berlin) map style is a high contrast detailed base map of
     * the world that blends 3D and 2D rendering.
     * </p>
     * <note>
     * <p>
     * The <code>VectorHereContrast</code> style has been renamed from <code>VectorHereBerlin</code>.
     * <code>VectorHereBerlin</code> has been deprecated, but will continue to work in applications that use it.
     * </p>
     * </note></li>
     * <li>
     * <p>
     * <code>VectorHereExploreTruck</code> – A global map containing truck restrictions and attributes (e.g. width /
     * height / HAZMAT) symbolized with highlighted segments and icons on top of HERE Explore to support use cases
     * within transport and logistics.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Valid <a href="https://docs.aws.amazon.com/location/latest/developerguide/grab.html">GrabMaps map styles</a>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>VectorGrabStandardLight</code> – The Grab Standard Light map style provides a basemap with detailed land
     * use coloring, area names, roads, landmarks, and points of interest covering Southeast Asia.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>VectorGrabStandardDark</code> – The Grab Standard Dark map style provides a dark variation of the standard
     * basemap covering Southeast Asia.
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * Grab provides maps only for countries in Southeast Asia, and is only available in the Asia Pacific (Singapore)
     * Region (<code>ap-southeast-1</code>). For more information, see <a
     * href="https://docs.aws.amazon.com/location/latest/developerguide/grab.html#grab-coverage-area">GrabMaps countries
     * and area covered</a>.
     * </p>
     * </note>
     * <p>
     * Valid <a href="https://docs.aws.amazon.com/location/latest/developerguide/open-data.html">Open Data map
     * styles</a>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>VectorOpenDataStandardLight</code> – The Open Data Standard Light map style provides a detailed basemap for
     * the world suitable for website and mobile application use. The map includes highways major roads, minor roads,
     * railways, water features, cities, parks, landmarks, building footprints, and administrative boundaries.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>VectorOpenDataStandardDark</code> – Open Data Standard Dark is a dark-themed map style that provides a
     * detailed basemap for the world suitable for website and mobile application use. The map includes highways major
     * roads, minor roads, railways, water features, cities, parks, landmarks, building footprints, and administrative
     * boundaries.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>VectorOpenDataVisualizationLight</code> – The Open Data Visualization Light map style is a light-themed
     * style with muted colors and fewer features that aids in understanding overlaid data.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>VectorOpenDataVisualizationDark</code> – The Open Data Visualization Dark map style is a dark-themed style
     * with muted colors and fewer features that aids in understanding overlaid data.
     * </p>
     * </li>
     * </ul>
     */
    private String style;

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

    public MapConfiguration withCustomLayers(String... customLayers) {
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

    public MapConfiguration withCustomLayers(java.util.Collection<String> customLayers) {
        setCustomLayers(customLayers);
        return this;
    }

    /**
     * <p>
     * Specifies the political view for the style. Leave unset to not use a political view, or, for styles that support
     * specific political views, you can choose a view, such as <code>IND</code> for the Indian view.
     * </p>
     * <p>
     * Default is unset.
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
     *        Specifies the political view for the style. Leave unset to not use a political view, or, for styles that
     *        support specific political views, you can choose a view, such as <code>IND</code> for the Indian view.</p>
     *        <p>
     *        Default is unset.
     *        </p>
     *        <note>
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
     * Specifies the political view for the style. Leave unset to not use a political view, or, for styles that support
     * specific political views, you can choose a view, such as <code>IND</code> for the Indian view.
     * </p>
     * <p>
     * Default is unset.
     * </p>
     * <note>
     * <p>
     * Not all map resources or styles support political view styles. See <a
     * href="https://docs.aws.amazon.com/location/latest/developerguide/map-concepts.html#political-views">Political
     * views</a> for more information.
     * </p>
     * </note>
     * 
     * @return Specifies the political view for the style. Leave unset to not use a political view, or, for styles that
     *         support specific political views, you can choose a view, such as <code>IND</code> for the Indian
     *         view.</p>
     *         <p>
     *         Default is unset.
     *         </p>
     *         <note>
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
     * Specifies the political view for the style. Leave unset to not use a political view, or, for styles that support
     * specific political views, you can choose a view, such as <code>IND</code> for the Indian view.
     * </p>
     * <p>
     * Default is unset.
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
     *        Specifies the political view for the style. Leave unset to not use a political view, or, for styles that
     *        support specific political views, you can choose a view, such as <code>IND</code> for the Indian view.</p>
     *        <p>
     *        Default is unset.
     *        </p>
     *        <note>
     *        <p>
     *        Not all map resources or styles support political view styles. See <a
     *        href="https://docs.aws.amazon.com/location/latest/developerguide/map-concepts.html#political-views"
     *        >Political views</a> for more information.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MapConfiguration withPoliticalView(String politicalView) {
        setPoliticalView(politicalView);
        return this;
    }

    /**
     * <p>
     * Specifies the map style selected from an available data provider.
     * </p>
     * <p>
     * Valid <a href="https://docs.aws.amazon.com/location/latest/developerguide/esri.html">Esri map styles</a>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>VectorEsriNavigation</code> – The Esri Navigation map style, which provides a detailed basemap for the
     * world symbolized with a custom navigation map style that's designed for use during the day in mobile devices. It
     * also includes a richer set of places, such as shops, services, restaurants, attractions, and other points of
     * interest. Enable the <code>POI</code> layer by setting it in CustomLayers to leverage the additional places data.
     * </p>
     * <p/></li>
     * <li>
     * <p>
     * <code>RasterEsriImagery</code> – The Esri Imagery map style. A raster basemap that provides one meter or better
     * satellite and aerial imagery in many parts of the world and lower resolution satellite imagery worldwide.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>VectorEsriLightGrayCanvas</code> – The Esri Light Gray Canvas map style, which provides a detailed vector
     * basemap with a light gray, neutral background style with minimal colors, labels, and features that's designed to
     * draw attention to your thematic content.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>VectorEsriTopographic</code> – The Esri Light map style, which provides a detailed vector basemap with a
     * classic Esri map style.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>VectorEsriStreets</code> – The Esri Street Map style, which provides a detailed vector basemap for the
     * world symbolized with a classic Esri street map style. The vector tile layer is similar in content and style to
     * the World Street Map raster map.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>VectorEsriDarkGrayCanvas</code> – The Esri Dark Gray Canvas map style. A vector basemap with a dark gray,
     * neutral background with minimal colors, labels, and features that's designed to draw attention to your thematic
     * content.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Valid <a href="https://docs.aws.amazon.com/location/latest/developerguide/HERE.html">HERE Technologies map
     * styles</a>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>VectorHereExplore</code> – A default HERE map style containing a neutral, global map and its features
     * including roads, buildings, landmarks, and water features. It also now includes a fully designed map of Japan.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RasterHereExploreSatellite</code> – A global map containing high resolution satellite imagery.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>HybridHereExploreSatellite</code> – A global map displaying the road network, street names, and city labels
     * over satellite imagery. This style will automatically retrieve both raster and vector tiles, and your charges
     * will be based on total tiles retrieved.
     * </p>
     * <note>
     * <p>
     * Hybrid styles use both vector and raster tiles when rendering the map that you see. This means that more tiles
     * are retrieved than when using either vector or raster tiles alone. Your charges will include all tiles retrieved.
     * </p>
     * </note></li>
     * <li>
     * <p>
     * <code>VectorHereContrast</code> – The HERE Contrast (Berlin) map style is a high contrast detailed base map of
     * the world that blends 3D and 2D rendering.
     * </p>
     * <note>
     * <p>
     * The <code>VectorHereContrast</code> style has been renamed from <code>VectorHereBerlin</code>.
     * <code>VectorHereBerlin</code> has been deprecated, but will continue to work in applications that use it.
     * </p>
     * </note></li>
     * <li>
     * <p>
     * <code>VectorHereExploreTruck</code> – A global map containing truck restrictions and attributes (e.g. width /
     * height / HAZMAT) symbolized with highlighted segments and icons on top of HERE Explore to support use cases
     * within transport and logistics.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Valid <a href="https://docs.aws.amazon.com/location/latest/developerguide/grab.html">GrabMaps map styles</a>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>VectorGrabStandardLight</code> – The Grab Standard Light map style provides a basemap with detailed land
     * use coloring, area names, roads, landmarks, and points of interest covering Southeast Asia.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>VectorGrabStandardDark</code> – The Grab Standard Dark map style provides a dark variation of the standard
     * basemap covering Southeast Asia.
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * Grab provides maps only for countries in Southeast Asia, and is only available in the Asia Pacific (Singapore)
     * Region (<code>ap-southeast-1</code>). For more information, see <a
     * href="https://docs.aws.amazon.com/location/latest/developerguide/grab.html#grab-coverage-area">GrabMaps countries
     * and area covered</a>.
     * </p>
     * </note>
     * <p>
     * Valid <a href="https://docs.aws.amazon.com/location/latest/developerguide/open-data.html">Open Data map
     * styles</a>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>VectorOpenDataStandardLight</code> – The Open Data Standard Light map style provides a detailed basemap for
     * the world suitable for website and mobile application use. The map includes highways major roads, minor roads,
     * railways, water features, cities, parks, landmarks, building footprints, and administrative boundaries.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>VectorOpenDataStandardDark</code> – Open Data Standard Dark is a dark-themed map style that provides a
     * detailed basemap for the world suitable for website and mobile application use. The map includes highways major
     * roads, minor roads, railways, water features, cities, parks, landmarks, building footprints, and administrative
     * boundaries.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>VectorOpenDataVisualizationLight</code> – The Open Data Visualization Light map style is a light-themed
     * style with muted colors and fewer features that aids in understanding overlaid data.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>VectorOpenDataVisualizationDark</code> – The Open Data Visualization Dark map style is a dark-themed style
     * with muted colors and fewer features that aids in understanding overlaid data.
     * </p>
     * </li>
     * </ul>
     * 
     * @param style
     *        Specifies the map style selected from an available data provider.</p>
     *        <p>
     *        Valid <a href="https://docs.aws.amazon.com/location/latest/developerguide/esri.html">Esri map styles</a>:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>VectorEsriNavigation</code> – The Esri Navigation map style, which provides a detailed basemap for
     *        the world symbolized with a custom navigation map style that's designed for use during the day in mobile
     *        devices. It also includes a richer set of places, such as shops, services, restaurants, attractions, and
     *        other points of interest. Enable the <code>POI</code> layer by setting it in CustomLayers to leverage the
     *        additional places data.
     *        </p>
     *        <p/></li>
     *        <li>
     *        <p>
     *        <code>RasterEsriImagery</code> – The Esri Imagery map style. A raster basemap that provides one meter or
     *        better satellite and aerial imagery in many parts of the world and lower resolution satellite imagery
     *        worldwide.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>VectorEsriLightGrayCanvas</code> – The Esri Light Gray Canvas map style, which provides a detailed
     *        vector basemap with a light gray, neutral background style with minimal colors, labels, and features
     *        that's designed to draw attention to your thematic content.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>VectorEsriTopographic</code> – The Esri Light map style, which provides a detailed vector basemap
     *        with a classic Esri map style.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>VectorEsriStreets</code> – The Esri Street Map style, which provides a detailed vector basemap for
     *        the world symbolized with a classic Esri street map style. The vector tile layer is similar in content and
     *        style to the World Street Map raster map.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>VectorEsriDarkGrayCanvas</code> – The Esri Dark Gray Canvas map style. A vector basemap with a dark
     *        gray, neutral background with minimal colors, labels, and features that's designed to draw attention to
     *        your thematic content.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Valid <a href="https://docs.aws.amazon.com/location/latest/developerguide/HERE.html">HERE Technologies map
     *        styles</a>:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>VectorHereExplore</code> – A default HERE map style containing a neutral, global map and its
     *        features including roads, buildings, landmarks, and water features. It also now includes a fully designed
     *        map of Japan.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>RasterHereExploreSatellite</code> – A global map containing high resolution satellite imagery.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>HybridHereExploreSatellite</code> – A global map displaying the road network, street names, and city
     *        labels over satellite imagery. This style will automatically retrieve both raster and vector tiles, and
     *        your charges will be based on total tiles retrieved.
     *        </p>
     *        <note>
     *        <p>
     *        Hybrid styles use both vector and raster tiles when rendering the map that you see. This means that more
     *        tiles are retrieved than when using either vector or raster tiles alone. Your charges will include all
     *        tiles retrieved.
     *        </p>
     *        </note></li>
     *        <li>
     *        <p>
     *        <code>VectorHereContrast</code> – The HERE Contrast (Berlin) map style is a high contrast detailed base
     *        map of the world that blends 3D and 2D rendering.
     *        </p>
     *        <note>
     *        <p>
     *        The <code>VectorHereContrast</code> style has been renamed from <code>VectorHereBerlin</code>.
     *        <code>VectorHereBerlin</code> has been deprecated, but will continue to work in applications that use it.
     *        </p>
     *        </note></li>
     *        <li>
     *        <p>
     *        <code>VectorHereExploreTruck</code> – A global map containing truck restrictions and attributes (e.g.
     *        width / height / HAZMAT) symbolized with highlighted segments and icons on top of HERE Explore to support
     *        use cases within transport and logistics.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Valid <a href="https://docs.aws.amazon.com/location/latest/developerguide/grab.html">GrabMaps map
     *        styles</a>:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>VectorGrabStandardLight</code> – The Grab Standard Light map style provides a basemap with detailed
     *        land use coloring, area names, roads, landmarks, and points of interest covering Southeast Asia.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>VectorGrabStandardDark</code> – The Grab Standard Dark map style provides a dark variation of the
     *        standard basemap covering Southeast Asia.
     *        </p>
     *        </li>
     *        </ul>
     *        <note>
     *        <p>
     *        Grab provides maps only for countries in Southeast Asia, and is only available in the Asia Pacific
     *        (Singapore) Region (<code>ap-southeast-1</code>). For more information, see <a
     *        href="https://docs.aws.amazon.com/location/latest/developerguide/grab.html#grab-coverage-area">GrabMaps
     *        countries and area covered</a>.
     *        </p>
     *        </note>
     *        <p>
     *        Valid <a href="https://docs.aws.amazon.com/location/latest/developerguide/open-data.html">Open Data map
     *        styles</a>:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>VectorOpenDataStandardLight</code> – The Open Data Standard Light map style provides a detailed
     *        basemap for the world suitable for website and mobile application use. The map includes highways major
     *        roads, minor roads, railways, water features, cities, parks, landmarks, building footprints, and
     *        administrative boundaries.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>VectorOpenDataStandardDark</code> – Open Data Standard Dark is a dark-themed map style that provides
     *        a detailed basemap for the world suitable for website and mobile application use. The map includes
     *        highways major roads, minor roads, railways, water features, cities, parks, landmarks, building
     *        footprints, and administrative boundaries.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>VectorOpenDataVisualizationLight</code> – The Open Data Visualization Light map style is a
     *        light-themed style with muted colors and fewer features that aids in understanding overlaid data.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>VectorOpenDataVisualizationDark</code> – The Open Data Visualization Dark map style is a dark-themed
     *        style with muted colors and fewer features that aids in understanding overlaid data.
     *        </p>
     *        </li>
     */

    public void setStyle(String style) {
        this.style = style;
    }

    /**
     * <p>
     * Specifies the map style selected from an available data provider.
     * </p>
     * <p>
     * Valid <a href="https://docs.aws.amazon.com/location/latest/developerguide/esri.html">Esri map styles</a>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>VectorEsriNavigation</code> – The Esri Navigation map style, which provides a detailed basemap for the
     * world symbolized with a custom navigation map style that's designed for use during the day in mobile devices. It
     * also includes a richer set of places, such as shops, services, restaurants, attractions, and other points of
     * interest. Enable the <code>POI</code> layer by setting it in CustomLayers to leverage the additional places data.
     * </p>
     * <p/></li>
     * <li>
     * <p>
     * <code>RasterEsriImagery</code> – The Esri Imagery map style. A raster basemap that provides one meter or better
     * satellite and aerial imagery in many parts of the world and lower resolution satellite imagery worldwide.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>VectorEsriLightGrayCanvas</code> – The Esri Light Gray Canvas map style, which provides a detailed vector
     * basemap with a light gray, neutral background style with minimal colors, labels, and features that's designed to
     * draw attention to your thematic content.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>VectorEsriTopographic</code> – The Esri Light map style, which provides a detailed vector basemap with a
     * classic Esri map style.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>VectorEsriStreets</code> – The Esri Street Map style, which provides a detailed vector basemap for the
     * world symbolized with a classic Esri street map style. The vector tile layer is similar in content and style to
     * the World Street Map raster map.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>VectorEsriDarkGrayCanvas</code> – The Esri Dark Gray Canvas map style. A vector basemap with a dark gray,
     * neutral background with minimal colors, labels, and features that's designed to draw attention to your thematic
     * content.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Valid <a href="https://docs.aws.amazon.com/location/latest/developerguide/HERE.html">HERE Technologies map
     * styles</a>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>VectorHereExplore</code> – A default HERE map style containing a neutral, global map and its features
     * including roads, buildings, landmarks, and water features. It also now includes a fully designed map of Japan.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RasterHereExploreSatellite</code> – A global map containing high resolution satellite imagery.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>HybridHereExploreSatellite</code> – A global map displaying the road network, street names, and city labels
     * over satellite imagery. This style will automatically retrieve both raster and vector tiles, and your charges
     * will be based on total tiles retrieved.
     * </p>
     * <note>
     * <p>
     * Hybrid styles use both vector and raster tiles when rendering the map that you see. This means that more tiles
     * are retrieved than when using either vector or raster tiles alone. Your charges will include all tiles retrieved.
     * </p>
     * </note></li>
     * <li>
     * <p>
     * <code>VectorHereContrast</code> – The HERE Contrast (Berlin) map style is a high contrast detailed base map of
     * the world that blends 3D and 2D rendering.
     * </p>
     * <note>
     * <p>
     * The <code>VectorHereContrast</code> style has been renamed from <code>VectorHereBerlin</code>.
     * <code>VectorHereBerlin</code> has been deprecated, but will continue to work in applications that use it.
     * </p>
     * </note></li>
     * <li>
     * <p>
     * <code>VectorHereExploreTruck</code> – A global map containing truck restrictions and attributes (e.g. width /
     * height / HAZMAT) symbolized with highlighted segments and icons on top of HERE Explore to support use cases
     * within transport and logistics.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Valid <a href="https://docs.aws.amazon.com/location/latest/developerguide/grab.html">GrabMaps map styles</a>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>VectorGrabStandardLight</code> – The Grab Standard Light map style provides a basemap with detailed land
     * use coloring, area names, roads, landmarks, and points of interest covering Southeast Asia.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>VectorGrabStandardDark</code> – The Grab Standard Dark map style provides a dark variation of the standard
     * basemap covering Southeast Asia.
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * Grab provides maps only for countries in Southeast Asia, and is only available in the Asia Pacific (Singapore)
     * Region (<code>ap-southeast-1</code>). For more information, see <a
     * href="https://docs.aws.amazon.com/location/latest/developerguide/grab.html#grab-coverage-area">GrabMaps countries
     * and area covered</a>.
     * </p>
     * </note>
     * <p>
     * Valid <a href="https://docs.aws.amazon.com/location/latest/developerguide/open-data.html">Open Data map
     * styles</a>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>VectorOpenDataStandardLight</code> – The Open Data Standard Light map style provides a detailed basemap for
     * the world suitable for website and mobile application use. The map includes highways major roads, minor roads,
     * railways, water features, cities, parks, landmarks, building footprints, and administrative boundaries.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>VectorOpenDataStandardDark</code> – Open Data Standard Dark is a dark-themed map style that provides a
     * detailed basemap for the world suitable for website and mobile application use. The map includes highways major
     * roads, minor roads, railways, water features, cities, parks, landmarks, building footprints, and administrative
     * boundaries.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>VectorOpenDataVisualizationLight</code> – The Open Data Visualization Light map style is a light-themed
     * style with muted colors and fewer features that aids in understanding overlaid data.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>VectorOpenDataVisualizationDark</code> – The Open Data Visualization Dark map style is a dark-themed style
     * with muted colors and fewer features that aids in understanding overlaid data.
     * </p>
     * </li>
     * </ul>
     * 
     * @return Specifies the map style selected from an available data provider.</p>
     *         <p>
     *         Valid <a href="https://docs.aws.amazon.com/location/latest/developerguide/esri.html">Esri map styles</a>:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>VectorEsriNavigation</code> – The Esri Navigation map style, which provides a detailed basemap for
     *         the world symbolized with a custom navigation map style that's designed for use during the day in mobile
     *         devices. It also includes a richer set of places, such as shops, services, restaurants, attractions, and
     *         other points of interest. Enable the <code>POI</code> layer by setting it in CustomLayers to leverage the
     *         additional places data.
     *         </p>
     *         <p/></li>
     *         <li>
     *         <p>
     *         <code>RasterEsriImagery</code> – The Esri Imagery map style. A raster basemap that provides one meter or
     *         better satellite and aerial imagery in many parts of the world and lower resolution satellite imagery
     *         worldwide.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>VectorEsriLightGrayCanvas</code> – The Esri Light Gray Canvas map style, which provides a detailed
     *         vector basemap with a light gray, neutral background style with minimal colors, labels, and features
     *         that's designed to draw attention to your thematic content.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>VectorEsriTopographic</code> – The Esri Light map style, which provides a detailed vector basemap
     *         with a classic Esri map style.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>VectorEsriStreets</code> – The Esri Street Map style, which provides a detailed vector basemap for
     *         the world symbolized with a classic Esri street map style. The vector tile layer is similar in content
     *         and style to the World Street Map raster map.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>VectorEsriDarkGrayCanvas</code> – The Esri Dark Gray Canvas map style. A vector basemap with a dark
     *         gray, neutral background with minimal colors, labels, and features that's designed to draw attention to
     *         your thematic content.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         Valid <a href="https://docs.aws.amazon.com/location/latest/developerguide/HERE.html">HERE Technologies
     *         map styles</a>:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>VectorHereExplore</code> – A default HERE map style containing a neutral, global map and its
     *         features including roads, buildings, landmarks, and water features. It also now includes a fully designed
     *         map of Japan.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>RasterHereExploreSatellite</code> – A global map containing high resolution satellite imagery.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>HybridHereExploreSatellite</code> – A global map displaying the road network, street names, and
     *         city labels over satellite imagery. This style will automatically retrieve both raster and vector tiles,
     *         and your charges will be based on total tiles retrieved.
     *         </p>
     *         <note>
     *         <p>
     *         Hybrid styles use both vector and raster tiles when rendering the map that you see. This means that more
     *         tiles are retrieved than when using either vector or raster tiles alone. Your charges will include all
     *         tiles retrieved.
     *         </p>
     *         </note></li>
     *         <li>
     *         <p>
     *         <code>VectorHereContrast</code> – The HERE Contrast (Berlin) map style is a high contrast detailed base
     *         map of the world that blends 3D and 2D rendering.
     *         </p>
     *         <note>
     *         <p>
     *         The <code>VectorHereContrast</code> style has been renamed from <code>VectorHereBerlin</code>.
     *         <code>VectorHereBerlin</code> has been deprecated, but will continue to work in applications that use it.
     *         </p>
     *         </note></li>
     *         <li>
     *         <p>
     *         <code>VectorHereExploreTruck</code> – A global map containing truck restrictions and attributes (e.g.
     *         width / height / HAZMAT) symbolized with highlighted segments and icons on top of HERE Explore to support
     *         use cases within transport and logistics.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         Valid <a href="https://docs.aws.amazon.com/location/latest/developerguide/grab.html">GrabMaps map
     *         styles</a>:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>VectorGrabStandardLight</code> – The Grab Standard Light map style provides a basemap with detailed
     *         land use coloring, area names, roads, landmarks, and points of interest covering Southeast Asia.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>VectorGrabStandardDark</code> – The Grab Standard Dark map style provides a dark variation of the
     *         standard basemap covering Southeast Asia.
     *         </p>
     *         </li>
     *         </ul>
     *         <note>
     *         <p>
     *         Grab provides maps only for countries in Southeast Asia, and is only available in the Asia Pacific
     *         (Singapore) Region (<code>ap-southeast-1</code>). For more information, see <a
     *         href="https://docs.aws.amazon.com/location/latest/developerguide/grab.html#grab-coverage-area">GrabMaps
     *         countries and area covered</a>.
     *         </p>
     *         </note>
     *         <p>
     *         Valid <a href="https://docs.aws.amazon.com/location/latest/developerguide/open-data.html">Open Data map
     *         styles</a>:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>VectorOpenDataStandardLight</code> – The Open Data Standard Light map style provides a detailed
     *         basemap for the world suitable for website and mobile application use. The map includes highways major
     *         roads, minor roads, railways, water features, cities, parks, landmarks, building footprints, and
     *         administrative boundaries.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>VectorOpenDataStandardDark</code> – Open Data Standard Dark is a dark-themed map style that
     *         provides a detailed basemap for the world suitable for website and mobile application use. The map
     *         includes highways major roads, minor roads, railways, water features, cities, parks, landmarks, building
     *         footprints, and administrative boundaries.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>VectorOpenDataVisualizationLight</code> – The Open Data Visualization Light map style is a
     *         light-themed style with muted colors and fewer features that aids in understanding overlaid data.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>VectorOpenDataVisualizationDark</code> – The Open Data Visualization Dark map style is a
     *         dark-themed style with muted colors and fewer features that aids in understanding overlaid data.
     *         </p>
     *         </li>
     */

    public String getStyle() {
        return this.style;
    }

    /**
     * <p>
     * Specifies the map style selected from an available data provider.
     * </p>
     * <p>
     * Valid <a href="https://docs.aws.amazon.com/location/latest/developerguide/esri.html">Esri map styles</a>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>VectorEsriNavigation</code> – The Esri Navigation map style, which provides a detailed basemap for the
     * world symbolized with a custom navigation map style that's designed for use during the day in mobile devices. It
     * also includes a richer set of places, such as shops, services, restaurants, attractions, and other points of
     * interest. Enable the <code>POI</code> layer by setting it in CustomLayers to leverage the additional places data.
     * </p>
     * <p/></li>
     * <li>
     * <p>
     * <code>RasterEsriImagery</code> – The Esri Imagery map style. A raster basemap that provides one meter or better
     * satellite and aerial imagery in many parts of the world and lower resolution satellite imagery worldwide.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>VectorEsriLightGrayCanvas</code> – The Esri Light Gray Canvas map style, which provides a detailed vector
     * basemap with a light gray, neutral background style with minimal colors, labels, and features that's designed to
     * draw attention to your thematic content.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>VectorEsriTopographic</code> – The Esri Light map style, which provides a detailed vector basemap with a
     * classic Esri map style.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>VectorEsriStreets</code> – The Esri Street Map style, which provides a detailed vector basemap for the
     * world symbolized with a classic Esri street map style. The vector tile layer is similar in content and style to
     * the World Street Map raster map.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>VectorEsriDarkGrayCanvas</code> – The Esri Dark Gray Canvas map style. A vector basemap with a dark gray,
     * neutral background with minimal colors, labels, and features that's designed to draw attention to your thematic
     * content.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Valid <a href="https://docs.aws.amazon.com/location/latest/developerguide/HERE.html">HERE Technologies map
     * styles</a>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>VectorHereExplore</code> – A default HERE map style containing a neutral, global map and its features
     * including roads, buildings, landmarks, and water features. It also now includes a fully designed map of Japan.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RasterHereExploreSatellite</code> – A global map containing high resolution satellite imagery.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>HybridHereExploreSatellite</code> – A global map displaying the road network, street names, and city labels
     * over satellite imagery. This style will automatically retrieve both raster and vector tiles, and your charges
     * will be based on total tiles retrieved.
     * </p>
     * <note>
     * <p>
     * Hybrid styles use both vector and raster tiles when rendering the map that you see. This means that more tiles
     * are retrieved than when using either vector or raster tiles alone. Your charges will include all tiles retrieved.
     * </p>
     * </note></li>
     * <li>
     * <p>
     * <code>VectorHereContrast</code> – The HERE Contrast (Berlin) map style is a high contrast detailed base map of
     * the world that blends 3D and 2D rendering.
     * </p>
     * <note>
     * <p>
     * The <code>VectorHereContrast</code> style has been renamed from <code>VectorHereBerlin</code>.
     * <code>VectorHereBerlin</code> has been deprecated, but will continue to work in applications that use it.
     * </p>
     * </note></li>
     * <li>
     * <p>
     * <code>VectorHereExploreTruck</code> – A global map containing truck restrictions and attributes (e.g. width /
     * height / HAZMAT) symbolized with highlighted segments and icons on top of HERE Explore to support use cases
     * within transport and logistics.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Valid <a href="https://docs.aws.amazon.com/location/latest/developerguide/grab.html">GrabMaps map styles</a>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>VectorGrabStandardLight</code> – The Grab Standard Light map style provides a basemap with detailed land
     * use coloring, area names, roads, landmarks, and points of interest covering Southeast Asia.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>VectorGrabStandardDark</code> – The Grab Standard Dark map style provides a dark variation of the standard
     * basemap covering Southeast Asia.
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * Grab provides maps only for countries in Southeast Asia, and is only available in the Asia Pacific (Singapore)
     * Region (<code>ap-southeast-1</code>). For more information, see <a
     * href="https://docs.aws.amazon.com/location/latest/developerguide/grab.html#grab-coverage-area">GrabMaps countries
     * and area covered</a>.
     * </p>
     * </note>
     * <p>
     * Valid <a href="https://docs.aws.amazon.com/location/latest/developerguide/open-data.html">Open Data map
     * styles</a>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>VectorOpenDataStandardLight</code> – The Open Data Standard Light map style provides a detailed basemap for
     * the world suitable for website and mobile application use. The map includes highways major roads, minor roads,
     * railways, water features, cities, parks, landmarks, building footprints, and administrative boundaries.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>VectorOpenDataStandardDark</code> – Open Data Standard Dark is a dark-themed map style that provides a
     * detailed basemap for the world suitable for website and mobile application use. The map includes highways major
     * roads, minor roads, railways, water features, cities, parks, landmarks, building footprints, and administrative
     * boundaries.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>VectorOpenDataVisualizationLight</code> – The Open Data Visualization Light map style is a light-themed
     * style with muted colors and fewer features that aids in understanding overlaid data.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>VectorOpenDataVisualizationDark</code> – The Open Data Visualization Dark map style is a dark-themed style
     * with muted colors and fewer features that aids in understanding overlaid data.
     * </p>
     * </li>
     * </ul>
     * 
     * @param style
     *        Specifies the map style selected from an available data provider.</p>
     *        <p>
     *        Valid <a href="https://docs.aws.amazon.com/location/latest/developerguide/esri.html">Esri map styles</a>:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>VectorEsriNavigation</code> – The Esri Navigation map style, which provides a detailed basemap for
     *        the world symbolized with a custom navigation map style that's designed for use during the day in mobile
     *        devices. It also includes a richer set of places, such as shops, services, restaurants, attractions, and
     *        other points of interest. Enable the <code>POI</code> layer by setting it in CustomLayers to leverage the
     *        additional places data.
     *        </p>
     *        <p/></li>
     *        <li>
     *        <p>
     *        <code>RasterEsriImagery</code> – The Esri Imagery map style. A raster basemap that provides one meter or
     *        better satellite and aerial imagery in many parts of the world and lower resolution satellite imagery
     *        worldwide.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>VectorEsriLightGrayCanvas</code> – The Esri Light Gray Canvas map style, which provides a detailed
     *        vector basemap with a light gray, neutral background style with minimal colors, labels, and features
     *        that's designed to draw attention to your thematic content.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>VectorEsriTopographic</code> – The Esri Light map style, which provides a detailed vector basemap
     *        with a classic Esri map style.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>VectorEsriStreets</code> – The Esri Street Map style, which provides a detailed vector basemap for
     *        the world symbolized with a classic Esri street map style. The vector tile layer is similar in content and
     *        style to the World Street Map raster map.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>VectorEsriDarkGrayCanvas</code> – The Esri Dark Gray Canvas map style. A vector basemap with a dark
     *        gray, neutral background with minimal colors, labels, and features that's designed to draw attention to
     *        your thematic content.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Valid <a href="https://docs.aws.amazon.com/location/latest/developerguide/HERE.html">HERE Technologies map
     *        styles</a>:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>VectorHereExplore</code> – A default HERE map style containing a neutral, global map and its
     *        features including roads, buildings, landmarks, and water features. It also now includes a fully designed
     *        map of Japan.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>RasterHereExploreSatellite</code> – A global map containing high resolution satellite imagery.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>HybridHereExploreSatellite</code> – A global map displaying the road network, street names, and city
     *        labels over satellite imagery. This style will automatically retrieve both raster and vector tiles, and
     *        your charges will be based on total tiles retrieved.
     *        </p>
     *        <note>
     *        <p>
     *        Hybrid styles use both vector and raster tiles when rendering the map that you see. This means that more
     *        tiles are retrieved than when using either vector or raster tiles alone. Your charges will include all
     *        tiles retrieved.
     *        </p>
     *        </note></li>
     *        <li>
     *        <p>
     *        <code>VectorHereContrast</code> – The HERE Contrast (Berlin) map style is a high contrast detailed base
     *        map of the world that blends 3D and 2D rendering.
     *        </p>
     *        <note>
     *        <p>
     *        The <code>VectorHereContrast</code> style has been renamed from <code>VectorHereBerlin</code>.
     *        <code>VectorHereBerlin</code> has been deprecated, but will continue to work in applications that use it.
     *        </p>
     *        </note></li>
     *        <li>
     *        <p>
     *        <code>VectorHereExploreTruck</code> – A global map containing truck restrictions and attributes (e.g.
     *        width / height / HAZMAT) symbolized with highlighted segments and icons on top of HERE Explore to support
     *        use cases within transport and logistics.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Valid <a href="https://docs.aws.amazon.com/location/latest/developerguide/grab.html">GrabMaps map
     *        styles</a>:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>VectorGrabStandardLight</code> – The Grab Standard Light map style provides a basemap with detailed
     *        land use coloring, area names, roads, landmarks, and points of interest covering Southeast Asia.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>VectorGrabStandardDark</code> – The Grab Standard Dark map style provides a dark variation of the
     *        standard basemap covering Southeast Asia.
     *        </p>
     *        </li>
     *        </ul>
     *        <note>
     *        <p>
     *        Grab provides maps only for countries in Southeast Asia, and is only available in the Asia Pacific
     *        (Singapore) Region (<code>ap-southeast-1</code>). For more information, see <a
     *        href="https://docs.aws.amazon.com/location/latest/developerguide/grab.html#grab-coverage-area">GrabMaps
     *        countries and area covered</a>.
     *        </p>
     *        </note>
     *        <p>
     *        Valid <a href="https://docs.aws.amazon.com/location/latest/developerguide/open-data.html">Open Data map
     *        styles</a>:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>VectorOpenDataStandardLight</code> – The Open Data Standard Light map style provides a detailed
     *        basemap for the world suitable for website and mobile application use. The map includes highways major
     *        roads, minor roads, railways, water features, cities, parks, landmarks, building footprints, and
     *        administrative boundaries.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>VectorOpenDataStandardDark</code> – Open Data Standard Dark is a dark-themed map style that provides
     *        a detailed basemap for the world suitable for website and mobile application use. The map includes
     *        highways major roads, minor roads, railways, water features, cities, parks, landmarks, building
     *        footprints, and administrative boundaries.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>VectorOpenDataVisualizationLight</code> – The Open Data Visualization Light map style is a
     *        light-themed style with muted colors and fewer features that aids in understanding overlaid data.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>VectorOpenDataVisualizationDark</code> – The Open Data Visualization Dark map style is a dark-themed
     *        style with muted colors and fewer features that aids in understanding overlaid data.
     *        </p>
     *        </li>
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
        if (getCustomLayers() != null)
            sb.append("CustomLayers: ").append(getCustomLayers()).append(",");
        if (getPoliticalView() != null)
            sb.append("PoliticalView: ").append(getPoliticalView()).append(",");
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
        if (other.getCustomLayers() == null ^ this.getCustomLayers() == null)
            return false;
        if (other.getCustomLayers() != null && other.getCustomLayers().equals(this.getCustomLayers()) == false)
            return false;
        if (other.getPoliticalView() == null ^ this.getPoliticalView() == null)
            return false;
        if (other.getPoliticalView() != null && other.getPoliticalView().equals(this.getPoliticalView()) == false)
            return false;
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

        hashCode = prime * hashCode + ((getCustomLayers() == null) ? 0 : getCustomLayers().hashCode());
        hashCode = prime * hashCode + ((getPoliticalView() == null) ? 0 : getPoliticalView().hashCode());
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
