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
package com.amazonaws.services.location.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/location-2020-11-19/SearchPlaceIndexForSuggestions"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SearchPlaceIndexForSuggestionsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * An optional parameter that indicates a preference for place suggestions that are closer to a specified position.
     * </p>
     * <p>
     * If provided, this parameter must contain a pair of numbers. The first number represents the X coordinate, or
     * longitude; the second number represents the Y coordinate, or latitude.
     * </p>
     * <p>
     * For example, <code>[-123.1174, 49.2847]</code> represents the position with longitude <code>-123.1174</code> and
     * latitude <code>49.2847</code>.
     * </p>
     * <note>
     * <p>
     * <code>BiasPosition</code> and <code>FilterBBox</code> are mutually exclusive. Specifying both options results in
     * an error.
     * </p>
     * </note>
     */
    private java.util.List<Double> biasPosition;
    /**
     * <p>
     * An optional parameter that limits the search results by returning only suggestions within a specified bounding
     * box.
     * </p>
     * <p>
     * If provided, this parameter must contain a total of four consecutive numbers in two pairs. The first pair of
     * numbers represents the X and Y coordinates (longitude and latitude, respectively) of the southwest corner of the
     * bounding box; the second pair of numbers represents the X and Y coordinates (longitude and latitude,
     * respectively) of the northeast corner of the bounding box.
     * </p>
     * <p>
     * For example, <code>[-12.7935, -37.4835, -12.0684, -36.9542]</code> represents a bounding box where the southwest
     * corner has longitude <code>-12.7935</code> and latitude <code>-37.4835</code>, and the northeast corner has
     * longitude <code>-12.0684</code> and latitude <code>-36.9542</code>.
     * </p>
     * <note>
     * <p>
     * <code>FilterBBox</code> and <code>BiasPosition</code> are mutually exclusive. Specifying both options results in
     * an error.
     * </p>
     * </note>
     */
    private java.util.List<Double> filterBBox;
    /**
     * <p>
     * An optional parameter that limits the search results by returning only suggestions within the provided list of
     * countries.
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
     * The preferred language used to return results. The value must be a valid <a
     * href="https://tools.ietf.org/search/bcp47">BCP 47</a> language tag, for example, <code>en</code> for English.
     * </p>
     * <p>
     * This setting affects the languages used in the results. If no language is specified, or not supported for a
     * particular result, the partner automatically chooses a language for the result.
     * </p>
     * <p>
     * For an example, we'll use the Greek language. You search for <code>Athens, Gr</code> to get suggestions with the
     * <code>language</code> parameter set to <code>en</code>. The results found will most likely be returned as
     * <code>Athens, Greece</code>.
     * </p>
     * <p>
     * If you set the <code>language</code> parameter to <code>el</code>, for Greek, then the result found will more
     * likely be returned as <code>Αθήνα, Ελλάδα</code>.
     * </p>
     * <p>
     * If the data provider does not have a value for Greek, the result will be in a language that the provider does
     * support.
     * </p>
     */
    private String language;
    /**
     * <p>
     * An optional parameter. The maximum number of results returned per request.
     * </p>
     * <p>
     * The default: <code>5</code>
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * The free-form partial text to use to generate place suggestions. For example, <code>eiffel tow</code>.
     * </p>
     */
    private String text;

    /**
     * <p>
     * An optional parameter that indicates a preference for place suggestions that are closer to a specified position.
     * </p>
     * <p>
     * If provided, this parameter must contain a pair of numbers. The first number represents the X coordinate, or
     * longitude; the second number represents the Y coordinate, or latitude.
     * </p>
     * <p>
     * For example, <code>[-123.1174, 49.2847]</code> represents the position with longitude <code>-123.1174</code> and
     * latitude <code>49.2847</code>.
     * </p>
     * <note>
     * <p>
     * <code>BiasPosition</code> and <code>FilterBBox</code> are mutually exclusive. Specifying both options results in
     * an error.
     * </p>
     * </note>
     * 
     * @return An optional parameter that indicates a preference for place suggestions that are closer to a specified
     *         position.</p>
     *         <p>
     *         If provided, this parameter must contain a pair of numbers. The first number represents the X coordinate,
     *         or longitude; the second number represents the Y coordinate, or latitude.
     *         </p>
     *         <p>
     *         For example, <code>[-123.1174, 49.2847]</code> represents the position with longitude
     *         <code>-123.1174</code> and latitude <code>49.2847</code>.
     *         </p>
     *         <note>
     *         <p>
     *         <code>BiasPosition</code> and <code>FilterBBox</code> are mutually exclusive. Specifying both options
     *         results in an error.
     *         </p>
     */

    public java.util.List<Double> getBiasPosition() {
        return biasPosition;
    }

    /**
     * <p>
     * An optional parameter that indicates a preference for place suggestions that are closer to a specified position.
     * </p>
     * <p>
     * If provided, this parameter must contain a pair of numbers. The first number represents the X coordinate, or
     * longitude; the second number represents the Y coordinate, or latitude.
     * </p>
     * <p>
     * For example, <code>[-123.1174, 49.2847]</code> represents the position with longitude <code>-123.1174</code> and
     * latitude <code>49.2847</code>.
     * </p>
     * <note>
     * <p>
     * <code>BiasPosition</code> and <code>FilterBBox</code> are mutually exclusive. Specifying both options results in
     * an error.
     * </p>
     * </note>
     * 
     * @param biasPosition
     *        An optional parameter that indicates a preference for place suggestions that are closer to a specified
     *        position.</p>
     *        <p>
     *        If provided, this parameter must contain a pair of numbers. The first number represents the X coordinate,
     *        or longitude; the second number represents the Y coordinate, or latitude.
     *        </p>
     *        <p>
     *        For example, <code>[-123.1174, 49.2847]</code> represents the position with longitude
     *        <code>-123.1174</code> and latitude <code>49.2847</code>.
     *        </p>
     *        <note>
     *        <p>
     *        <code>BiasPosition</code> and <code>FilterBBox</code> are mutually exclusive. Specifying both options
     *        results in an error.
     *        </p>
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
     * An optional parameter that indicates a preference for place suggestions that are closer to a specified position.
     * </p>
     * <p>
     * If provided, this parameter must contain a pair of numbers. The first number represents the X coordinate, or
     * longitude; the second number represents the Y coordinate, or latitude.
     * </p>
     * <p>
     * For example, <code>[-123.1174, 49.2847]</code> represents the position with longitude <code>-123.1174</code> and
     * latitude <code>49.2847</code>.
     * </p>
     * <note>
     * <p>
     * <code>BiasPosition</code> and <code>FilterBBox</code> are mutually exclusive. Specifying both options results in
     * an error.
     * </p>
     * </note>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setBiasPosition(java.util.Collection)} or {@link #withBiasPosition(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param biasPosition
     *        An optional parameter that indicates a preference for place suggestions that are closer to a specified
     *        position.</p>
     *        <p>
     *        If provided, this parameter must contain a pair of numbers. The first number represents the X coordinate,
     *        or longitude; the second number represents the Y coordinate, or latitude.
     *        </p>
     *        <p>
     *        For example, <code>[-123.1174, 49.2847]</code> represents the position with longitude
     *        <code>-123.1174</code> and latitude <code>49.2847</code>.
     *        </p>
     *        <note>
     *        <p>
     *        <code>BiasPosition</code> and <code>FilterBBox</code> are mutually exclusive. Specifying both options
     *        results in an error.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchPlaceIndexForSuggestionsRequest withBiasPosition(Double... biasPosition) {
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
     * An optional parameter that indicates a preference for place suggestions that are closer to a specified position.
     * </p>
     * <p>
     * If provided, this parameter must contain a pair of numbers. The first number represents the X coordinate, or
     * longitude; the second number represents the Y coordinate, or latitude.
     * </p>
     * <p>
     * For example, <code>[-123.1174, 49.2847]</code> represents the position with longitude <code>-123.1174</code> and
     * latitude <code>49.2847</code>.
     * </p>
     * <note>
     * <p>
     * <code>BiasPosition</code> and <code>FilterBBox</code> are mutually exclusive. Specifying both options results in
     * an error.
     * </p>
     * </note>
     * 
     * @param biasPosition
     *        An optional parameter that indicates a preference for place suggestions that are closer to a specified
     *        position.</p>
     *        <p>
     *        If provided, this parameter must contain a pair of numbers. The first number represents the X coordinate,
     *        or longitude; the second number represents the Y coordinate, or latitude.
     *        </p>
     *        <p>
     *        For example, <code>[-123.1174, 49.2847]</code> represents the position with longitude
     *        <code>-123.1174</code> and latitude <code>49.2847</code>.
     *        </p>
     *        <note>
     *        <p>
     *        <code>BiasPosition</code> and <code>FilterBBox</code> are mutually exclusive. Specifying both options
     *        results in an error.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchPlaceIndexForSuggestionsRequest withBiasPosition(java.util.Collection<Double> biasPosition) {
        setBiasPosition(biasPosition);
        return this;
    }

    /**
     * <p>
     * An optional parameter that limits the search results by returning only suggestions within a specified bounding
     * box.
     * </p>
     * <p>
     * If provided, this parameter must contain a total of four consecutive numbers in two pairs. The first pair of
     * numbers represents the X and Y coordinates (longitude and latitude, respectively) of the southwest corner of the
     * bounding box; the second pair of numbers represents the X and Y coordinates (longitude and latitude,
     * respectively) of the northeast corner of the bounding box.
     * </p>
     * <p>
     * For example, <code>[-12.7935, -37.4835, -12.0684, -36.9542]</code> represents a bounding box where the southwest
     * corner has longitude <code>-12.7935</code> and latitude <code>-37.4835</code>, and the northeast corner has
     * longitude <code>-12.0684</code> and latitude <code>-36.9542</code>.
     * </p>
     * <note>
     * <p>
     * <code>FilterBBox</code> and <code>BiasPosition</code> are mutually exclusive. Specifying both options results in
     * an error.
     * </p>
     * </note>
     * 
     * @return An optional parameter that limits the search results by returning only suggestions within a specified
     *         bounding box.</p>
     *         <p>
     *         If provided, this parameter must contain a total of four consecutive numbers in two pairs. The first pair
     *         of numbers represents the X and Y coordinates (longitude and latitude, respectively) of the southwest
     *         corner of the bounding box; the second pair of numbers represents the X and Y coordinates (longitude and
     *         latitude, respectively) of the northeast corner of the bounding box.
     *         </p>
     *         <p>
     *         For example, <code>[-12.7935, -37.4835, -12.0684, -36.9542]</code> represents a bounding box where the
     *         southwest corner has longitude <code>-12.7935</code> and latitude <code>-37.4835</code>, and the
     *         northeast corner has longitude <code>-12.0684</code> and latitude <code>-36.9542</code>.
     *         </p>
     *         <note>
     *         <p>
     *         <code>FilterBBox</code> and <code>BiasPosition</code> are mutually exclusive. Specifying both options
     *         results in an error.
     *         </p>
     */

    public java.util.List<Double> getFilterBBox() {
        return filterBBox;
    }

    /**
     * <p>
     * An optional parameter that limits the search results by returning only suggestions within a specified bounding
     * box.
     * </p>
     * <p>
     * If provided, this parameter must contain a total of four consecutive numbers in two pairs. The first pair of
     * numbers represents the X and Y coordinates (longitude and latitude, respectively) of the southwest corner of the
     * bounding box; the second pair of numbers represents the X and Y coordinates (longitude and latitude,
     * respectively) of the northeast corner of the bounding box.
     * </p>
     * <p>
     * For example, <code>[-12.7935, -37.4835, -12.0684, -36.9542]</code> represents a bounding box where the southwest
     * corner has longitude <code>-12.7935</code> and latitude <code>-37.4835</code>, and the northeast corner has
     * longitude <code>-12.0684</code> and latitude <code>-36.9542</code>.
     * </p>
     * <note>
     * <p>
     * <code>FilterBBox</code> and <code>BiasPosition</code> are mutually exclusive. Specifying both options results in
     * an error.
     * </p>
     * </note>
     * 
     * @param filterBBox
     *        An optional parameter that limits the search results by returning only suggestions within a specified
     *        bounding box.</p>
     *        <p>
     *        If provided, this parameter must contain a total of four consecutive numbers in two pairs. The first pair
     *        of numbers represents the X and Y coordinates (longitude and latitude, respectively) of the southwest
     *        corner of the bounding box; the second pair of numbers represents the X and Y coordinates (longitude and
     *        latitude, respectively) of the northeast corner of the bounding box.
     *        </p>
     *        <p>
     *        For example, <code>[-12.7935, -37.4835, -12.0684, -36.9542]</code> represents a bounding box where the
     *        southwest corner has longitude <code>-12.7935</code> and latitude <code>-37.4835</code>, and the northeast
     *        corner has longitude <code>-12.0684</code> and latitude <code>-36.9542</code>.
     *        </p>
     *        <note>
     *        <p>
     *        <code>FilterBBox</code> and <code>BiasPosition</code> are mutually exclusive. Specifying both options
     *        results in an error.
     *        </p>
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
     * An optional parameter that limits the search results by returning only suggestions within a specified bounding
     * box.
     * </p>
     * <p>
     * If provided, this parameter must contain a total of four consecutive numbers in two pairs. The first pair of
     * numbers represents the X and Y coordinates (longitude and latitude, respectively) of the southwest corner of the
     * bounding box; the second pair of numbers represents the X and Y coordinates (longitude and latitude,
     * respectively) of the northeast corner of the bounding box.
     * </p>
     * <p>
     * For example, <code>[-12.7935, -37.4835, -12.0684, -36.9542]</code> represents a bounding box where the southwest
     * corner has longitude <code>-12.7935</code> and latitude <code>-37.4835</code>, and the northeast corner has
     * longitude <code>-12.0684</code> and latitude <code>-36.9542</code>.
     * </p>
     * <note>
     * <p>
     * <code>FilterBBox</code> and <code>BiasPosition</code> are mutually exclusive. Specifying both options results in
     * an error.
     * </p>
     * </note>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFilterBBox(java.util.Collection)} or {@link #withFilterBBox(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param filterBBox
     *        An optional parameter that limits the search results by returning only suggestions within a specified
     *        bounding box.</p>
     *        <p>
     *        If provided, this parameter must contain a total of four consecutive numbers in two pairs. The first pair
     *        of numbers represents the X and Y coordinates (longitude and latitude, respectively) of the southwest
     *        corner of the bounding box; the second pair of numbers represents the X and Y coordinates (longitude and
     *        latitude, respectively) of the northeast corner of the bounding box.
     *        </p>
     *        <p>
     *        For example, <code>[-12.7935, -37.4835, -12.0684, -36.9542]</code> represents a bounding box where the
     *        southwest corner has longitude <code>-12.7935</code> and latitude <code>-37.4835</code>, and the northeast
     *        corner has longitude <code>-12.0684</code> and latitude <code>-36.9542</code>.
     *        </p>
     *        <note>
     *        <p>
     *        <code>FilterBBox</code> and <code>BiasPosition</code> are mutually exclusive. Specifying both options
     *        results in an error.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchPlaceIndexForSuggestionsRequest withFilterBBox(Double... filterBBox) {
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
     * An optional parameter that limits the search results by returning only suggestions within a specified bounding
     * box.
     * </p>
     * <p>
     * If provided, this parameter must contain a total of four consecutive numbers in two pairs. The first pair of
     * numbers represents the X and Y coordinates (longitude and latitude, respectively) of the southwest corner of the
     * bounding box; the second pair of numbers represents the X and Y coordinates (longitude and latitude,
     * respectively) of the northeast corner of the bounding box.
     * </p>
     * <p>
     * For example, <code>[-12.7935, -37.4835, -12.0684, -36.9542]</code> represents a bounding box where the southwest
     * corner has longitude <code>-12.7935</code> and latitude <code>-37.4835</code>, and the northeast corner has
     * longitude <code>-12.0684</code> and latitude <code>-36.9542</code>.
     * </p>
     * <note>
     * <p>
     * <code>FilterBBox</code> and <code>BiasPosition</code> are mutually exclusive. Specifying both options results in
     * an error.
     * </p>
     * </note>
     * 
     * @param filterBBox
     *        An optional parameter that limits the search results by returning only suggestions within a specified
     *        bounding box.</p>
     *        <p>
     *        If provided, this parameter must contain a total of four consecutive numbers in two pairs. The first pair
     *        of numbers represents the X and Y coordinates (longitude and latitude, respectively) of the southwest
     *        corner of the bounding box; the second pair of numbers represents the X and Y coordinates (longitude and
     *        latitude, respectively) of the northeast corner of the bounding box.
     *        </p>
     *        <p>
     *        For example, <code>[-12.7935, -37.4835, -12.0684, -36.9542]</code> represents a bounding box where the
     *        southwest corner has longitude <code>-12.7935</code> and latitude <code>-37.4835</code>, and the northeast
     *        corner has longitude <code>-12.0684</code> and latitude <code>-36.9542</code>.
     *        </p>
     *        <note>
     *        <p>
     *        <code>FilterBBox</code> and <code>BiasPosition</code> are mutually exclusive. Specifying both options
     *        results in an error.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchPlaceIndexForSuggestionsRequest withFilterBBox(java.util.Collection<Double> filterBBox) {
        setFilterBBox(filterBBox);
        return this;
    }

    /**
     * <p>
     * An optional parameter that limits the search results by returning only suggestions within the provided list of
     * countries.
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
     * @return An optional parameter that limits the search results by returning only suggestions within the provided
     *         list of countries.</p>
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
     * An optional parameter that limits the search results by returning only suggestions within the provided list of
     * countries.
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
     *        An optional parameter that limits the search results by returning only suggestions within the provided
     *        list of countries.</p>
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
     * An optional parameter that limits the search results by returning only suggestions within the provided list of
     * countries.
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
     *        An optional parameter that limits the search results by returning only suggestions within the provided
     *        list of countries.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        Use the <a href="https://www.iso.org/iso-3166-country-codes.html">ISO 3166</a> 3-digit country code. For
     *        example, Australia uses three upper-case characters: <code>AUS</code>.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchPlaceIndexForSuggestionsRequest withFilterCountries(String... filterCountries) {
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
     * An optional parameter that limits the search results by returning only suggestions within the provided list of
     * countries.
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
     *        An optional parameter that limits the search results by returning only suggestions within the provided
     *        list of countries.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        Use the <a href="https://www.iso.org/iso-3166-country-codes.html">ISO 3166</a> 3-digit country code. For
     *        example, Australia uses three upper-case characters: <code>AUS</code>.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchPlaceIndexForSuggestionsRequest withFilterCountries(java.util.Collection<String> filterCountries) {
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

    public SearchPlaceIndexForSuggestionsRequest withIndexName(String indexName) {
        setIndexName(indexName);
        return this;
    }

    /**
     * <p>
     * The preferred language used to return results. The value must be a valid <a
     * href="https://tools.ietf.org/search/bcp47">BCP 47</a> language tag, for example, <code>en</code> for English.
     * </p>
     * <p>
     * This setting affects the languages used in the results. If no language is specified, or not supported for a
     * particular result, the partner automatically chooses a language for the result.
     * </p>
     * <p>
     * For an example, we'll use the Greek language. You search for <code>Athens, Gr</code> to get suggestions with the
     * <code>language</code> parameter set to <code>en</code>. The results found will most likely be returned as
     * <code>Athens, Greece</code>.
     * </p>
     * <p>
     * If you set the <code>language</code> parameter to <code>el</code>, for Greek, then the result found will more
     * likely be returned as <code>Αθήνα, Ελλάδα</code>.
     * </p>
     * <p>
     * If the data provider does not have a value for Greek, the result will be in a language that the provider does
     * support.
     * </p>
     * 
     * @param language
     *        The preferred language used to return results. The value must be a valid <a
     *        href="https://tools.ietf.org/search/bcp47">BCP 47</a> language tag, for example, <code>en</code> for
     *        English.</p>
     *        <p>
     *        This setting affects the languages used in the results. If no language is specified, or not supported for
     *        a particular result, the partner automatically chooses a language for the result.
     *        </p>
     *        <p>
     *        For an example, we'll use the Greek language. You search for <code>Athens, Gr</code> to get suggestions
     *        with the <code>language</code> parameter set to <code>en</code>. The results found will most likely be
     *        returned as <code>Athens, Greece</code>.
     *        </p>
     *        <p>
     *        If you set the <code>language</code> parameter to <code>el</code>, for Greek, then the result found will
     *        more likely be returned as <code>Αθήνα, Ελλάδα</code>.
     *        </p>
     *        <p>
     *        If the data provider does not have a value for Greek, the result will be in a language that the provider
     *        does support.
     */

    public void setLanguage(String language) {
        this.language = language;
    }

    /**
     * <p>
     * The preferred language used to return results. The value must be a valid <a
     * href="https://tools.ietf.org/search/bcp47">BCP 47</a> language tag, for example, <code>en</code> for English.
     * </p>
     * <p>
     * This setting affects the languages used in the results. If no language is specified, or not supported for a
     * particular result, the partner automatically chooses a language for the result.
     * </p>
     * <p>
     * For an example, we'll use the Greek language. You search for <code>Athens, Gr</code> to get suggestions with the
     * <code>language</code> parameter set to <code>en</code>. The results found will most likely be returned as
     * <code>Athens, Greece</code>.
     * </p>
     * <p>
     * If you set the <code>language</code> parameter to <code>el</code>, for Greek, then the result found will more
     * likely be returned as <code>Αθήνα, Ελλάδα</code>.
     * </p>
     * <p>
     * If the data provider does not have a value for Greek, the result will be in a language that the provider does
     * support.
     * </p>
     * 
     * @return The preferred language used to return results. The value must be a valid <a
     *         href="https://tools.ietf.org/search/bcp47">BCP 47</a> language tag, for example, <code>en</code> for
     *         English.</p>
     *         <p>
     *         This setting affects the languages used in the results. If no language is specified, or not supported for
     *         a particular result, the partner automatically chooses a language for the result.
     *         </p>
     *         <p>
     *         For an example, we'll use the Greek language. You search for <code>Athens, Gr</code> to get suggestions
     *         with the <code>language</code> parameter set to <code>en</code>. The results found will most likely be
     *         returned as <code>Athens, Greece</code>.
     *         </p>
     *         <p>
     *         If you set the <code>language</code> parameter to <code>el</code>, for Greek, then the result found will
     *         more likely be returned as <code>Αθήνα, Ελλάδα</code>.
     *         </p>
     *         <p>
     *         If the data provider does not have a value for Greek, the result will be in a language that the provider
     *         does support.
     */

    public String getLanguage() {
        return this.language;
    }

    /**
     * <p>
     * The preferred language used to return results. The value must be a valid <a
     * href="https://tools.ietf.org/search/bcp47">BCP 47</a> language tag, for example, <code>en</code> for English.
     * </p>
     * <p>
     * This setting affects the languages used in the results. If no language is specified, or not supported for a
     * particular result, the partner automatically chooses a language for the result.
     * </p>
     * <p>
     * For an example, we'll use the Greek language. You search for <code>Athens, Gr</code> to get suggestions with the
     * <code>language</code> parameter set to <code>en</code>. The results found will most likely be returned as
     * <code>Athens, Greece</code>.
     * </p>
     * <p>
     * If you set the <code>language</code> parameter to <code>el</code>, for Greek, then the result found will more
     * likely be returned as <code>Αθήνα, Ελλάδα</code>.
     * </p>
     * <p>
     * If the data provider does not have a value for Greek, the result will be in a language that the provider does
     * support.
     * </p>
     * 
     * @param language
     *        The preferred language used to return results. The value must be a valid <a
     *        href="https://tools.ietf.org/search/bcp47">BCP 47</a> language tag, for example, <code>en</code> for
     *        English.</p>
     *        <p>
     *        This setting affects the languages used in the results. If no language is specified, or not supported for
     *        a particular result, the partner automatically chooses a language for the result.
     *        </p>
     *        <p>
     *        For an example, we'll use the Greek language. You search for <code>Athens, Gr</code> to get suggestions
     *        with the <code>language</code> parameter set to <code>en</code>. The results found will most likely be
     *        returned as <code>Athens, Greece</code>.
     *        </p>
     *        <p>
     *        If you set the <code>language</code> parameter to <code>el</code>, for Greek, then the result found will
     *        more likely be returned as <code>Αθήνα, Ελλάδα</code>.
     *        </p>
     *        <p>
     *        If the data provider does not have a value for Greek, the result will be in a language that the provider
     *        does support.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchPlaceIndexForSuggestionsRequest withLanguage(String language) {
        setLanguage(language);
        return this;
    }

    /**
     * <p>
     * An optional parameter. The maximum number of results returned per request.
     * </p>
     * <p>
     * The default: <code>5</code>
     * </p>
     * 
     * @param maxResults
     *        An optional parameter. The maximum number of results returned per request. </p>
     *        <p>
     *        The default: <code>5</code>
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * An optional parameter. The maximum number of results returned per request.
     * </p>
     * <p>
     * The default: <code>5</code>
     * </p>
     * 
     * @return An optional parameter. The maximum number of results returned per request. </p>
     *         <p>
     *         The default: <code>5</code>
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * An optional parameter. The maximum number of results returned per request.
     * </p>
     * <p>
     * The default: <code>5</code>
     * </p>
     * 
     * @param maxResults
     *        An optional parameter. The maximum number of results returned per request. </p>
     *        <p>
     *        The default: <code>5</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchPlaceIndexForSuggestionsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * The free-form partial text to use to generate place suggestions. For example, <code>eiffel tow</code>.
     * </p>
     * 
     * @param text
     *        The free-form partial text to use to generate place suggestions. For example, <code>eiffel tow</code>.
     */

    public void setText(String text) {
        this.text = text;
    }

    /**
     * <p>
     * The free-form partial text to use to generate place suggestions. For example, <code>eiffel tow</code>.
     * </p>
     * 
     * @return The free-form partial text to use to generate place suggestions. For example, <code>eiffel tow</code>.
     */

    public String getText() {
        return this.text;
    }

    /**
     * <p>
     * The free-form partial text to use to generate place suggestions. For example, <code>eiffel tow</code>.
     * </p>
     * 
     * @param text
     *        The free-form partial text to use to generate place suggestions. For example, <code>eiffel tow</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchPlaceIndexForSuggestionsRequest withText(String text) {
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
        if (getLanguage() != null)
            sb.append("Language: ").append(getLanguage()).append(",");
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

        if (obj instanceof SearchPlaceIndexForSuggestionsRequest == false)
            return false;
        SearchPlaceIndexForSuggestionsRequest other = (SearchPlaceIndexForSuggestionsRequest) obj;
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
        if (other.getLanguage() == null ^ this.getLanguage() == null)
            return false;
        if (other.getLanguage() != null && other.getLanguage().equals(this.getLanguage()) == false)
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
        hashCode = prime * hashCode + ((getLanguage() == null) ? 0 : getLanguage().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getText() == null) ? 0 : getText().hashCode());
        return hashCode;
    }

    @Override
    public SearchPlaceIndexForSuggestionsRequest clone() {
        return (SearchPlaceIndexForSuggestionsRequest) super.clone();
    }

}
