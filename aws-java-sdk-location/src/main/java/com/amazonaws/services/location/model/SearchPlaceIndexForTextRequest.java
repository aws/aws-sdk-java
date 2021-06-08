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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/location-2020-11-19/SearchPlaceIndexForText" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SearchPlaceIndexForTextRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Searches for results closest to the given position. An optional parameter defined by longitude, and latitude.
     * </p>
     * <ul>
     * <li>
     * <p>
     * The first <code>bias</code> position is the X coordinate, or longitude.
     * </p>
     * </li>
     * <li>
     * <p>
     * The second <code>bias</code> position is the Y coordinate, or latitude.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For example, <code>bias=xLongitude&amp;bias=yLatitude</code>.
     * </p>
     */
    private java.util.List<Double> biasPosition;
    /**
     * <p>
     * Filters the results by returning only Places within the provided bounding box. An optional parameter.
     * </p>
     * <p>
     * The first 2 <code>bbox</code> parameters describe the lower southwest corner:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The first <code>bbox</code> position is the X coordinate or longitude of the lower southwest corner.
     * </p>
     * </li>
     * <li>
     * <p>
     * The second <code>bbox</code> position is the Y coordinate or latitude of the lower southwest corner.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For example, <code>bbox=xLongitudeSW&amp;bbox=yLatitudeSW</code>.
     * </p>
     * <p>
     * The next <code>bbox</code> parameters describe the upper northeast corner:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The third <code>bbox</code> position is the X coordinate, or longitude of the upper northeast corner.
     * </p>
     * </li>
     * <li>
     * <p>
     * The fourth <code>bbox</code> position is the Y coordinate, or longitude of the upper northeast corner.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For example, <code>bbox=xLongitudeNE&amp;bbox=yLatitudeNE</code>
     * </p>
     */
    private java.util.List<Double> filterBBox;
    /**
     * <p>
     * Limits the search to the given a list of countries/regions. An optional parameter.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Use the <a href="https://www.iso.org/iso-3166-country-codes.html">ISO 3166</a> 3-digit country code. For example,
     * Australia uses three upper-case characters: <code>AUS</code>.
     * </p>
     * </li>
     * </ul>
     */
    private java.util.List<String> filterCountries;
    /**
     * <p>
     * The name of the place index resource you want to use for the search.
     * </p>
     */
    private String indexName;
    /**
     * <p>
     * An optional parameter. The maximum number of results returned per request.
     * </p>
     * <p>
     * The default: <code>50</code>
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * The address, name, city, or region to be used in the search. In free-form text format. For example,
     * <code>123 Any Street</code>.
     * </p>
     */
    private String text;

    /**
     * <p>
     * Searches for results closest to the given position. An optional parameter defined by longitude, and latitude.
     * </p>
     * <ul>
     * <li>
     * <p>
     * The first <code>bias</code> position is the X coordinate, or longitude.
     * </p>
     * </li>
     * <li>
     * <p>
     * The second <code>bias</code> position is the Y coordinate, or latitude.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For example, <code>bias=xLongitude&amp;bias=yLatitude</code>.
     * </p>
     * 
     * @return Searches for results closest to the given position. An optional parameter defined by longitude, and
     *         latitude.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         The first <code>bias</code> position is the X coordinate, or longitude.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The second <code>bias</code> position is the Y coordinate, or latitude.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         For example, <code>bias=xLongitude&amp;bias=yLatitude</code>.
     */

    public java.util.List<Double> getBiasPosition() {
        return biasPosition;
    }

    /**
     * <p>
     * Searches for results closest to the given position. An optional parameter defined by longitude, and latitude.
     * </p>
     * <ul>
     * <li>
     * <p>
     * The first <code>bias</code> position is the X coordinate, or longitude.
     * </p>
     * </li>
     * <li>
     * <p>
     * The second <code>bias</code> position is the Y coordinate, or latitude.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For example, <code>bias=xLongitude&amp;bias=yLatitude</code>.
     * </p>
     * 
     * @param biasPosition
     *        Searches for results closest to the given position. An optional parameter defined by longitude, and
     *        latitude.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        The first <code>bias</code> position is the X coordinate, or longitude.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The second <code>bias</code> position is the Y coordinate, or latitude.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        For example, <code>bias=xLongitude&amp;bias=yLatitude</code>.
     */

    public void setBiasPosition(java.util.Collection<Double> biasPosition) {
        if (biasPosition == null) {
            this.biasPosition = null;
            return;
        }

        this.biasPosition = new java.util.ArrayList<Double>(biasPosition);
    }

    /**
     * <p>
     * Searches for results closest to the given position. An optional parameter defined by longitude, and latitude.
     * </p>
     * <ul>
     * <li>
     * <p>
     * The first <code>bias</code> position is the X coordinate, or longitude.
     * </p>
     * </li>
     * <li>
     * <p>
     * The second <code>bias</code> position is the Y coordinate, or latitude.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For example, <code>bias=xLongitude&amp;bias=yLatitude</code>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setBiasPosition(java.util.Collection)} or {@link #withBiasPosition(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param biasPosition
     *        Searches for results closest to the given position. An optional parameter defined by longitude, and
     *        latitude.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        The first <code>bias</code> position is the X coordinate, or longitude.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The second <code>bias</code> position is the Y coordinate, or latitude.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        For example, <code>bias=xLongitude&amp;bias=yLatitude</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchPlaceIndexForTextRequest withBiasPosition(Double... biasPosition) {
        if (this.biasPosition == null) {
            setBiasPosition(new java.util.ArrayList<Double>(biasPosition.length));
        }
        for (Double ele : biasPosition) {
            this.biasPosition.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Searches for results closest to the given position. An optional parameter defined by longitude, and latitude.
     * </p>
     * <ul>
     * <li>
     * <p>
     * The first <code>bias</code> position is the X coordinate, or longitude.
     * </p>
     * </li>
     * <li>
     * <p>
     * The second <code>bias</code> position is the Y coordinate, or latitude.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For example, <code>bias=xLongitude&amp;bias=yLatitude</code>.
     * </p>
     * 
     * @param biasPosition
     *        Searches for results closest to the given position. An optional parameter defined by longitude, and
     *        latitude.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        The first <code>bias</code> position is the X coordinate, or longitude.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The second <code>bias</code> position is the Y coordinate, or latitude.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        For example, <code>bias=xLongitude&amp;bias=yLatitude</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchPlaceIndexForTextRequest withBiasPosition(java.util.Collection<Double> biasPosition) {
        setBiasPosition(biasPosition);
        return this;
    }

    /**
     * <p>
     * Filters the results by returning only Places within the provided bounding box. An optional parameter.
     * </p>
     * <p>
     * The first 2 <code>bbox</code> parameters describe the lower southwest corner:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The first <code>bbox</code> position is the X coordinate or longitude of the lower southwest corner.
     * </p>
     * </li>
     * <li>
     * <p>
     * The second <code>bbox</code> position is the Y coordinate or latitude of the lower southwest corner.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For example, <code>bbox=xLongitudeSW&amp;bbox=yLatitudeSW</code>.
     * </p>
     * <p>
     * The next <code>bbox</code> parameters describe the upper northeast corner:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The third <code>bbox</code> position is the X coordinate, or longitude of the upper northeast corner.
     * </p>
     * </li>
     * <li>
     * <p>
     * The fourth <code>bbox</code> position is the Y coordinate, or longitude of the upper northeast corner.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For example, <code>bbox=xLongitudeNE&amp;bbox=yLatitudeNE</code>
     * </p>
     * 
     * @return Filters the results by returning only Places within the provided bounding box. An optional parameter.</p>
     *         <p>
     *         The first 2 <code>bbox</code> parameters describe the lower southwest corner:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         The first <code>bbox</code> position is the X coordinate or longitude of the lower southwest corner.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The second <code>bbox</code> position is the Y coordinate or latitude of the lower southwest corner.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         For example, <code>bbox=xLongitudeSW&amp;bbox=yLatitudeSW</code>.
     *         </p>
     *         <p>
     *         The next <code>bbox</code> parameters describe the upper northeast corner:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         The third <code>bbox</code> position is the X coordinate, or longitude of the upper northeast corner.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The fourth <code>bbox</code> position is the Y coordinate, or longitude of the upper northeast corner.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         For example, <code>bbox=xLongitudeNE&amp;bbox=yLatitudeNE</code>
     */

    public java.util.List<Double> getFilterBBox() {
        return filterBBox;
    }

    /**
     * <p>
     * Filters the results by returning only Places within the provided bounding box. An optional parameter.
     * </p>
     * <p>
     * The first 2 <code>bbox</code> parameters describe the lower southwest corner:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The first <code>bbox</code> position is the X coordinate or longitude of the lower southwest corner.
     * </p>
     * </li>
     * <li>
     * <p>
     * The second <code>bbox</code> position is the Y coordinate or latitude of the lower southwest corner.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For example, <code>bbox=xLongitudeSW&amp;bbox=yLatitudeSW</code>.
     * </p>
     * <p>
     * The next <code>bbox</code> parameters describe the upper northeast corner:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The third <code>bbox</code> position is the X coordinate, or longitude of the upper northeast corner.
     * </p>
     * </li>
     * <li>
     * <p>
     * The fourth <code>bbox</code> position is the Y coordinate, or longitude of the upper northeast corner.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For example, <code>bbox=xLongitudeNE&amp;bbox=yLatitudeNE</code>
     * </p>
     * 
     * @param filterBBox
     *        Filters the results by returning only Places within the provided bounding box. An optional parameter.</p>
     *        <p>
     *        The first 2 <code>bbox</code> parameters describe the lower southwest corner:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        The first <code>bbox</code> position is the X coordinate or longitude of the lower southwest corner.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The second <code>bbox</code> position is the Y coordinate or latitude of the lower southwest corner.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        For example, <code>bbox=xLongitudeSW&amp;bbox=yLatitudeSW</code>.
     *        </p>
     *        <p>
     *        The next <code>bbox</code> parameters describe the upper northeast corner:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        The third <code>bbox</code> position is the X coordinate, or longitude of the upper northeast corner.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The fourth <code>bbox</code> position is the Y coordinate, or longitude of the upper northeast corner.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        For example, <code>bbox=xLongitudeNE&amp;bbox=yLatitudeNE</code>
     */

    public void setFilterBBox(java.util.Collection<Double> filterBBox) {
        if (filterBBox == null) {
            this.filterBBox = null;
            return;
        }

        this.filterBBox = new java.util.ArrayList<Double>(filterBBox);
    }

    /**
     * <p>
     * Filters the results by returning only Places within the provided bounding box. An optional parameter.
     * </p>
     * <p>
     * The first 2 <code>bbox</code> parameters describe the lower southwest corner:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The first <code>bbox</code> position is the X coordinate or longitude of the lower southwest corner.
     * </p>
     * </li>
     * <li>
     * <p>
     * The second <code>bbox</code> position is the Y coordinate or latitude of the lower southwest corner.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For example, <code>bbox=xLongitudeSW&amp;bbox=yLatitudeSW</code>.
     * </p>
     * <p>
     * The next <code>bbox</code> parameters describe the upper northeast corner:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The third <code>bbox</code> position is the X coordinate, or longitude of the upper northeast corner.
     * </p>
     * </li>
     * <li>
     * <p>
     * The fourth <code>bbox</code> position is the Y coordinate, or longitude of the upper northeast corner.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For example, <code>bbox=xLongitudeNE&amp;bbox=yLatitudeNE</code>
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFilterBBox(java.util.Collection)} or {@link #withFilterBBox(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param filterBBox
     *        Filters the results by returning only Places within the provided bounding box. An optional parameter.</p>
     *        <p>
     *        The first 2 <code>bbox</code> parameters describe the lower southwest corner:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        The first <code>bbox</code> position is the X coordinate or longitude of the lower southwest corner.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The second <code>bbox</code> position is the Y coordinate or latitude of the lower southwest corner.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        For example, <code>bbox=xLongitudeSW&amp;bbox=yLatitudeSW</code>.
     *        </p>
     *        <p>
     *        The next <code>bbox</code> parameters describe the upper northeast corner:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        The third <code>bbox</code> position is the X coordinate, or longitude of the upper northeast corner.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The fourth <code>bbox</code> position is the Y coordinate, or longitude of the upper northeast corner.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        For example, <code>bbox=xLongitudeNE&amp;bbox=yLatitudeNE</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchPlaceIndexForTextRequest withFilterBBox(Double... filterBBox) {
        if (this.filterBBox == null) {
            setFilterBBox(new java.util.ArrayList<Double>(filterBBox.length));
        }
        for (Double ele : filterBBox) {
            this.filterBBox.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Filters the results by returning only Places within the provided bounding box. An optional parameter.
     * </p>
     * <p>
     * The first 2 <code>bbox</code> parameters describe the lower southwest corner:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The first <code>bbox</code> position is the X coordinate or longitude of the lower southwest corner.
     * </p>
     * </li>
     * <li>
     * <p>
     * The second <code>bbox</code> position is the Y coordinate or latitude of the lower southwest corner.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For example, <code>bbox=xLongitudeSW&amp;bbox=yLatitudeSW</code>.
     * </p>
     * <p>
     * The next <code>bbox</code> parameters describe the upper northeast corner:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The third <code>bbox</code> position is the X coordinate, or longitude of the upper northeast corner.
     * </p>
     * </li>
     * <li>
     * <p>
     * The fourth <code>bbox</code> position is the Y coordinate, or longitude of the upper northeast corner.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For example, <code>bbox=xLongitudeNE&amp;bbox=yLatitudeNE</code>
     * </p>
     * 
     * @param filterBBox
     *        Filters the results by returning only Places within the provided bounding box. An optional parameter.</p>
     *        <p>
     *        The first 2 <code>bbox</code> parameters describe the lower southwest corner:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        The first <code>bbox</code> position is the X coordinate or longitude of the lower southwest corner.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The second <code>bbox</code> position is the Y coordinate or latitude of the lower southwest corner.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        For example, <code>bbox=xLongitudeSW&amp;bbox=yLatitudeSW</code>.
     *        </p>
     *        <p>
     *        The next <code>bbox</code> parameters describe the upper northeast corner:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        The third <code>bbox</code> position is the X coordinate, or longitude of the upper northeast corner.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The fourth <code>bbox</code> position is the Y coordinate, or longitude of the upper northeast corner.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        For example, <code>bbox=xLongitudeNE&amp;bbox=yLatitudeNE</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchPlaceIndexForTextRequest withFilterBBox(java.util.Collection<Double> filterBBox) {
        setFilterBBox(filterBBox);
        return this;
    }

    /**
     * <p>
     * Limits the search to the given a list of countries/regions. An optional parameter.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Use the <a href="https://www.iso.org/iso-3166-country-codes.html">ISO 3166</a> 3-digit country code. For example,
     * Australia uses three upper-case characters: <code>AUS</code>.
     * </p>
     * </li>
     * </ul>
     * 
     * @return Limits the search to the given a list of countries/regions. An optional parameter.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         Use the <a href="https://www.iso.org/iso-3166-country-codes.html">ISO 3166</a> 3-digit country code. For
     *         example, Australia uses three upper-case characters: <code>AUS</code>.
     *         </p>
     *         </li>
     */

    public java.util.List<String> getFilterCountries() {
        return filterCountries;
    }

    /**
     * <p>
     * Limits the search to the given a list of countries/regions. An optional parameter.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Use the <a href="https://www.iso.org/iso-3166-country-codes.html">ISO 3166</a> 3-digit country code. For example,
     * Australia uses three upper-case characters: <code>AUS</code>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param filterCountries
     *        Limits the search to the given a list of countries/regions. An optional parameter.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        Use the <a href="https://www.iso.org/iso-3166-country-codes.html">ISO 3166</a> 3-digit country code. For
     *        example, Australia uses three upper-case characters: <code>AUS</code>.
     *        </p>
     *        </li>
     */

    public void setFilterCountries(java.util.Collection<String> filterCountries) {
        if (filterCountries == null) {
            this.filterCountries = null;
            return;
        }

        this.filterCountries = new java.util.ArrayList<String>(filterCountries);
    }

    /**
     * <p>
     * Limits the search to the given a list of countries/regions. An optional parameter.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Use the <a href="https://www.iso.org/iso-3166-country-codes.html">ISO 3166</a> 3-digit country code. For example,
     * Australia uses three upper-case characters: <code>AUS</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFilterCountries(java.util.Collection)} or {@link #withFilterCountries(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param filterCountries
     *        Limits the search to the given a list of countries/regions. An optional parameter.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        Use the <a href="https://www.iso.org/iso-3166-country-codes.html">ISO 3166</a> 3-digit country code. For
     *        example, Australia uses three upper-case characters: <code>AUS</code>.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchPlaceIndexForTextRequest withFilterCountries(String... filterCountries) {
        if (this.filterCountries == null) {
            setFilterCountries(new java.util.ArrayList<String>(filterCountries.length));
        }
        for (String ele : filterCountries) {
            this.filterCountries.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Limits the search to the given a list of countries/regions. An optional parameter.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Use the <a href="https://www.iso.org/iso-3166-country-codes.html">ISO 3166</a> 3-digit country code. For example,
     * Australia uses three upper-case characters: <code>AUS</code>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param filterCountries
     *        Limits the search to the given a list of countries/regions. An optional parameter.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        Use the <a href="https://www.iso.org/iso-3166-country-codes.html">ISO 3166</a> 3-digit country code. For
     *        example, Australia uses three upper-case characters: <code>AUS</code>.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchPlaceIndexForTextRequest withFilterCountries(java.util.Collection<String> filterCountries) {
        setFilterCountries(filterCountries);
        return this;
    }

    /**
     * <p>
     * The name of the place index resource you want to use for the search.
     * </p>
     * 
     * @param indexName
     *        The name of the place index resource you want to use for the search.
     */

    public void setIndexName(String indexName) {
        this.indexName = indexName;
    }

    /**
     * <p>
     * The name of the place index resource you want to use for the search.
     * </p>
     * 
     * @return The name of the place index resource you want to use for the search.
     */

    public String getIndexName() {
        return this.indexName;
    }

    /**
     * <p>
     * The name of the place index resource you want to use for the search.
     * </p>
     * 
     * @param indexName
     *        The name of the place index resource you want to use for the search.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchPlaceIndexForTextRequest withIndexName(String indexName) {
        setIndexName(indexName);
        return this;
    }

    /**
     * <p>
     * An optional parameter. The maximum number of results returned per request.
     * </p>
     * <p>
     * The default: <code>50</code>
     * </p>
     * 
     * @param maxResults
     *        An optional parameter. The maximum number of results returned per request. </p>
     *        <p>
     *        The default: <code>50</code>
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * An optional parameter. The maximum number of results returned per request.
     * </p>
     * <p>
     * The default: <code>50</code>
     * </p>
     * 
     * @return An optional parameter. The maximum number of results returned per request. </p>
     *         <p>
     *         The default: <code>50</code>
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * An optional parameter. The maximum number of results returned per request.
     * </p>
     * <p>
     * The default: <code>50</code>
     * </p>
     * 
     * @param maxResults
     *        An optional parameter. The maximum number of results returned per request. </p>
     *        <p>
     *        The default: <code>50</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchPlaceIndexForTextRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * The address, name, city, or region to be used in the search. In free-form text format. For example,
     * <code>123 Any Street</code>.
     * </p>
     * 
     * @param text
     *        The address, name, city, or region to be used in the search. In free-form text format. For example,
     *        <code>123 Any Street</code>.
     */

    public void setText(String text) {
        this.text = text;
    }

    /**
     * <p>
     * The address, name, city, or region to be used in the search. In free-form text format. For example,
     * <code>123 Any Street</code>.
     * </p>
     * 
     * @return The address, name, city, or region to be used in the search. In free-form text format. For example,
     *         <code>123 Any Street</code>.
     */

    public String getText() {
        return this.text;
    }

    /**
     * <p>
     * The address, name, city, or region to be used in the search. In free-form text format. For example,
     * <code>123 Any Street</code>.
     * </p>
     * 
     * @param text
     *        The address, name, city, or region to be used in the search. In free-form text format. For example,
     *        <code>123 Any Street</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchPlaceIndexForTextRequest withText(String text) {
        setText(text);
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
        if (getBiasPosition() != null)
            sb.append("BiasPosition: ").append("***Sensitive Data Redacted***").append(",");
        if (getFilterBBox() != null)
            sb.append("FilterBBox: ").append("***Sensitive Data Redacted***").append(",");
        if (getFilterCountries() != null)
            sb.append("FilterCountries: ").append(getFilterCountries()).append(",");
        if (getIndexName() != null)
            sb.append("IndexName: ").append(getIndexName()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
        if (getText() != null)
            sb.append("Text: ").append("***Sensitive Data Redacted***");
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SearchPlaceIndexForTextRequest == false)
            return false;
        SearchPlaceIndexForTextRequest other = (SearchPlaceIndexForTextRequest) obj;
        if (other.getBiasPosition() == null ^ this.getBiasPosition() == null)
            return false;
        if (other.getBiasPosition() != null && other.getBiasPosition().equals(this.getBiasPosition()) == false)
            return false;
        if (other.getFilterBBox() == null ^ this.getFilterBBox() == null)
            return false;
        if (other.getFilterBBox() != null && other.getFilterBBox().equals(this.getFilterBBox()) == false)
            return false;
        if (other.getFilterCountries() == null ^ this.getFilterCountries() == null)
            return false;
        if (other.getFilterCountries() != null && other.getFilterCountries().equals(this.getFilterCountries()) == false)
            return false;
        if (other.getIndexName() == null ^ this.getIndexName() == null)
            return false;
        if (other.getIndexName() != null && other.getIndexName().equals(this.getIndexName()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getText() == null ^ this.getText() == null)
            return false;
        if (other.getText() != null && other.getText().equals(this.getText()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBiasPosition() == null) ? 0 : getBiasPosition().hashCode());
        hashCode = prime * hashCode + ((getFilterBBox() == null) ? 0 : getFilterBBox().hashCode());
        hashCode = prime * hashCode + ((getFilterCountries() == null) ? 0 : getFilterCountries().hashCode());
        hashCode = prime * hashCode + ((getIndexName() == null) ? 0 : getIndexName().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getText() == null) ? 0 : getText().hashCode());
        return hashCode;
    }

    @Override
    public SearchPlaceIndexForTextRequest clone() {
        return (SearchPlaceIndexForTextRequest) super.clone();
    }

}
