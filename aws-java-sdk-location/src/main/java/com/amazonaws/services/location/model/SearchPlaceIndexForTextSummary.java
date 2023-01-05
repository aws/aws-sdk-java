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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A summary of the request sent by using <code>SearchPlaceIndexForText</code>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/location-2020-11-19/SearchPlaceIndexForTextSummary"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SearchPlaceIndexForTextSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Contains the coordinates for the optional bias position specified in the request.
     * </p>
     * <p>
     * This parameter contains a pair of numbers. The first number represents the X coordinate, or longitude; the second
     * number represents the Y coordinate, or latitude.
     * </p>
     * <p>
     * For example, <code>[-123.1174, 49.2847]</code> represents the position with longitude <code>-123.1174</code> and
     * latitude <code>49.2847</code>.
     * </p>
     */
    private java.util.List<Double> biasPosition;
    /**
     * <p>
     * The geospatial data provider attached to the place index resource specified in the request. Values can be one of
     * the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Esri
     * </p>
     * </li>
     * <li>
     * <p>
     * Here
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information about data providers, see <a
     * href="https://docs.aws.amazon.com/location/latest/developerguide/what-is-data-provider.html">Amazon Location
     * Service data providers</a>.
     * </p>
     */
    private String dataSource;
    /**
     * <p>
     * Contains the coordinates for the optional bounding box specified in the request.
     * </p>
     */
    private java.util.List<Double> filterBBox;
    /**
     * <p>
     * Contains the optional country filter specified in the request.
     * </p>
     */
    private java.util.List<String> filterCountries;
    /**
     * <p>
     * The preferred language used to return results. Matches the language in the request. The value is a valid <a
     * href="https://tools.ietf.org/search/bcp47">BCP 47</a> language tag, for example, <code>en</code> for English.
     * </p>
     */
    private String language;
    /**
     * <p>
     * Contains the optional result count limit specified in the request.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * The bounding box that fully contains all search results.
     * </p>
     * <note>
     * <p>
     * If you specified the optional <code>FilterBBox</code> parameter in the request, <code>ResultBBox</code> is
     * contained within <code>FilterBBox</code>.
     * </p>
     * </note>
     */
    private java.util.List<Double> resultBBox;
    /**
     * <p>
     * The search text specified in the request.
     * </p>
     */
    private String text;

    /**
     * <p>
     * Contains the coordinates for the optional bias position specified in the request.
     * </p>
     * <p>
     * This parameter contains a pair of numbers. The first number represents the X coordinate, or longitude; the second
     * number represents the Y coordinate, or latitude.
     * </p>
     * <p>
     * For example, <code>[-123.1174, 49.2847]</code> represents the position with longitude <code>-123.1174</code> and
     * latitude <code>49.2847</code>.
     * </p>
     * 
     * @return Contains the coordinates for the optional bias position specified in the request.</p>
     *         <p>
     *         This parameter contains a pair of numbers. The first number represents the X coordinate, or longitude;
     *         the second number represents the Y coordinate, or latitude.
     *         </p>
     *         <p>
     *         For example, <code>[-123.1174, 49.2847]</code> represents the position with longitude
     *         <code>-123.1174</code> and latitude <code>49.2847</code>.
     */

    public java.util.List<Double> getBiasPosition() {
        return biasPosition;
    }

    /**
     * <p>
     * Contains the coordinates for the optional bias position specified in the request.
     * </p>
     * <p>
     * This parameter contains a pair of numbers. The first number represents the X coordinate, or longitude; the second
     * number represents the Y coordinate, or latitude.
     * </p>
     * <p>
     * For example, <code>[-123.1174, 49.2847]</code> represents the position with longitude <code>-123.1174</code> and
     * latitude <code>49.2847</code>.
     * </p>
     * 
     * @param biasPosition
     *        Contains the coordinates for the optional bias position specified in the request.</p>
     *        <p>
     *        This parameter contains a pair of numbers. The first number represents the X coordinate, or longitude; the
     *        second number represents the Y coordinate, or latitude.
     *        </p>
     *        <p>
     *        For example, <code>[-123.1174, 49.2847]</code> represents the position with longitude
     *        <code>-123.1174</code> and latitude <code>49.2847</code>.
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
     * Contains the coordinates for the optional bias position specified in the request.
     * </p>
     * <p>
     * This parameter contains a pair of numbers. The first number represents the X coordinate, or longitude; the second
     * number represents the Y coordinate, or latitude.
     * </p>
     * <p>
     * For example, <code>[-123.1174, 49.2847]</code> represents the position with longitude <code>-123.1174</code> and
     * latitude <code>49.2847</code>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setBiasPosition(java.util.Collection)} or {@link #withBiasPosition(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param biasPosition
     *        Contains the coordinates for the optional bias position specified in the request.</p>
     *        <p>
     *        This parameter contains a pair of numbers. The first number represents the X coordinate, or longitude; the
     *        second number represents the Y coordinate, or latitude.
     *        </p>
     *        <p>
     *        For example, <code>[-123.1174, 49.2847]</code> represents the position with longitude
     *        <code>-123.1174</code> and latitude <code>49.2847</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchPlaceIndexForTextSummary withBiasPosition(Double... biasPosition) {
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
     * Contains the coordinates for the optional bias position specified in the request.
     * </p>
     * <p>
     * This parameter contains a pair of numbers. The first number represents the X coordinate, or longitude; the second
     * number represents the Y coordinate, or latitude.
     * </p>
     * <p>
     * For example, <code>[-123.1174, 49.2847]</code> represents the position with longitude <code>-123.1174</code> and
     * latitude <code>49.2847</code>.
     * </p>
     * 
     * @param biasPosition
     *        Contains the coordinates for the optional bias position specified in the request.</p>
     *        <p>
     *        This parameter contains a pair of numbers. The first number represents the X coordinate, or longitude; the
     *        second number represents the Y coordinate, or latitude.
     *        </p>
     *        <p>
     *        For example, <code>[-123.1174, 49.2847]</code> represents the position with longitude
     *        <code>-123.1174</code> and latitude <code>49.2847</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchPlaceIndexForTextSummary withBiasPosition(java.util.Collection<Double> biasPosition) {
        setBiasPosition(biasPosition);
        return this;
    }

    /**
     * <p>
     * The geospatial data provider attached to the place index resource specified in the request. Values can be one of
     * the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Esri
     * </p>
     * </li>
     * <li>
     * <p>
     * Here
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information about data providers, see <a
     * href="https://docs.aws.amazon.com/location/latest/developerguide/what-is-data-provider.html">Amazon Location
     * Service data providers</a>.
     * </p>
     * 
     * @param dataSource
     *        The geospatial data provider attached to the place index resource specified in the request. Values can be
     *        one of the following:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        Esri
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Here
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        For more information about data providers, see <a
     *        href="https://docs.aws.amazon.com/location/latest/developerguide/what-is-data-provider.html">Amazon
     *        Location Service data providers</a>.
     */

    public void setDataSource(String dataSource) {
        this.dataSource = dataSource;
    }

    /**
     * <p>
     * The geospatial data provider attached to the place index resource specified in the request. Values can be one of
     * the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Esri
     * </p>
     * </li>
     * <li>
     * <p>
     * Here
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information about data providers, see <a
     * href="https://docs.aws.amazon.com/location/latest/developerguide/what-is-data-provider.html">Amazon Location
     * Service data providers</a>.
     * </p>
     * 
     * @return The geospatial data provider attached to the place index resource specified in the request. Values can be
     *         one of the following:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         Esri
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Here
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         For more information about data providers, see <a
     *         href="https://docs.aws.amazon.com/location/latest/developerguide/what-is-data-provider.html">Amazon
     *         Location Service data providers</a>.
     */

    public String getDataSource() {
        return this.dataSource;
    }

    /**
     * <p>
     * The geospatial data provider attached to the place index resource specified in the request. Values can be one of
     * the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Esri
     * </p>
     * </li>
     * <li>
     * <p>
     * Here
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information about data providers, see <a
     * href="https://docs.aws.amazon.com/location/latest/developerguide/what-is-data-provider.html">Amazon Location
     * Service data providers</a>.
     * </p>
     * 
     * @param dataSource
     *        The geospatial data provider attached to the place index resource specified in the request. Values can be
     *        one of the following:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        Esri
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Here
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        For more information about data providers, see <a
     *        href="https://docs.aws.amazon.com/location/latest/developerguide/what-is-data-provider.html">Amazon
     *        Location Service data providers</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchPlaceIndexForTextSummary withDataSource(String dataSource) {
        setDataSource(dataSource);
        return this;
    }

    /**
     * <p>
     * Contains the coordinates for the optional bounding box specified in the request.
     * </p>
     * 
     * @return Contains the coordinates for the optional bounding box specified in the request.
     */

    public java.util.List<Double> getFilterBBox() {
        return filterBBox;
    }

    /**
     * <p>
     * Contains the coordinates for the optional bounding box specified in the request.
     * </p>
     * 
     * @param filterBBox
     *        Contains the coordinates for the optional bounding box specified in the request.
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
     * Contains the coordinates for the optional bounding box specified in the request.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFilterBBox(java.util.Collection)} or {@link #withFilterBBox(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param filterBBox
     *        Contains the coordinates for the optional bounding box specified in the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchPlaceIndexForTextSummary withFilterBBox(Double... filterBBox) {
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
     * Contains the coordinates for the optional bounding box specified in the request.
     * </p>
     * 
     * @param filterBBox
     *        Contains the coordinates for the optional bounding box specified in the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchPlaceIndexForTextSummary withFilterBBox(java.util.Collection<Double> filterBBox) {
        setFilterBBox(filterBBox);
        return this;
    }

    /**
     * <p>
     * Contains the optional country filter specified in the request.
     * </p>
     * 
     * @return Contains the optional country filter specified in the request.
     */

    public java.util.List<String> getFilterCountries() {
        return filterCountries;
    }

    /**
     * <p>
     * Contains the optional country filter specified in the request.
     * </p>
     * 
     * @param filterCountries
     *        Contains the optional country filter specified in the request.
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
     * Contains the optional country filter specified in the request.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFilterCountries(java.util.Collection)} or {@link #withFilterCountries(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param filterCountries
     *        Contains the optional country filter specified in the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchPlaceIndexForTextSummary withFilterCountries(String... filterCountries) {
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
     * Contains the optional country filter specified in the request.
     * </p>
     * 
     * @param filterCountries
     *        Contains the optional country filter specified in the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchPlaceIndexForTextSummary withFilterCountries(java.util.Collection<String> filterCountries) {
        setFilterCountries(filterCountries);
        return this;
    }

    /**
     * <p>
     * The preferred language used to return results. Matches the language in the request. The value is a valid <a
     * href="https://tools.ietf.org/search/bcp47">BCP 47</a> language tag, for example, <code>en</code> for English.
     * </p>
     * 
     * @param language
     *        The preferred language used to return results. Matches the language in the request. The value is a valid
     *        <a href="https://tools.ietf.org/search/bcp47">BCP 47</a> language tag, for example, <code>en</code> for
     *        English.
     */

    public void setLanguage(String language) {
        this.language = language;
    }

    /**
     * <p>
     * The preferred language used to return results. Matches the language in the request. The value is a valid <a
     * href="https://tools.ietf.org/search/bcp47">BCP 47</a> language tag, for example, <code>en</code> for English.
     * </p>
     * 
     * @return The preferred language used to return results. Matches the language in the request. The value is a valid
     *         <a href="https://tools.ietf.org/search/bcp47">BCP 47</a> language tag, for example, <code>en</code> for
     *         English.
     */

    public String getLanguage() {
        return this.language;
    }

    /**
     * <p>
     * The preferred language used to return results. Matches the language in the request. The value is a valid <a
     * href="https://tools.ietf.org/search/bcp47">BCP 47</a> language tag, for example, <code>en</code> for English.
     * </p>
     * 
     * @param language
     *        The preferred language used to return results. Matches the language in the request. The value is a valid
     *        <a href="https://tools.ietf.org/search/bcp47">BCP 47</a> language tag, for example, <code>en</code> for
     *        English.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchPlaceIndexForTextSummary withLanguage(String language) {
        setLanguage(language);
        return this;
    }

    /**
     * <p>
     * Contains the optional result count limit specified in the request.
     * </p>
     * 
     * @param maxResults
     *        Contains the optional result count limit specified in the request.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * Contains the optional result count limit specified in the request.
     * </p>
     * 
     * @return Contains the optional result count limit specified in the request.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * Contains the optional result count limit specified in the request.
     * </p>
     * 
     * @param maxResults
     *        Contains the optional result count limit specified in the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchPlaceIndexForTextSummary withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * The bounding box that fully contains all search results.
     * </p>
     * <note>
     * <p>
     * If you specified the optional <code>FilterBBox</code> parameter in the request, <code>ResultBBox</code> is
     * contained within <code>FilterBBox</code>.
     * </p>
     * </note>
     * 
     * @return The bounding box that fully contains all search results.</p> <note>
     *         <p>
     *         If you specified the optional <code>FilterBBox</code> parameter in the request, <code>ResultBBox</code>
     *         is contained within <code>FilterBBox</code>.
     *         </p>
     */

    public java.util.List<Double> getResultBBox() {
        return resultBBox;
    }

    /**
     * <p>
     * The bounding box that fully contains all search results.
     * </p>
     * <note>
     * <p>
     * If you specified the optional <code>FilterBBox</code> parameter in the request, <code>ResultBBox</code> is
     * contained within <code>FilterBBox</code>.
     * </p>
     * </note>
     * 
     * @param resultBBox
     *        The bounding box that fully contains all search results.</p> <note>
     *        <p>
     *        If you specified the optional <code>FilterBBox</code> parameter in the request, <code>ResultBBox</code> is
     *        contained within <code>FilterBBox</code>.
     *        </p>
     */

    public void setResultBBox(java.util.Collection<Double> resultBBox) {
        if (resultBBox == null) {
            this.resultBBox = null;
            return;
        }

        this.resultBBox = new java.util.ArrayList<Double>(resultBBox);
    }

    /**
     * <p>
     * The bounding box that fully contains all search results.
     * </p>
     * <note>
     * <p>
     * If you specified the optional <code>FilterBBox</code> parameter in the request, <code>ResultBBox</code> is
     * contained within <code>FilterBBox</code>.
     * </p>
     * </note>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setResultBBox(java.util.Collection)} or {@link #withResultBBox(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param resultBBox
     *        The bounding box that fully contains all search results.</p> <note>
     *        <p>
     *        If you specified the optional <code>FilterBBox</code> parameter in the request, <code>ResultBBox</code> is
     *        contained within <code>FilterBBox</code>.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchPlaceIndexForTextSummary withResultBBox(Double... resultBBox) {
        if (this.resultBBox == null) {
            setResultBBox(new java.util.ArrayList<Double>(resultBBox.length));
        }
        for (Double ele : resultBBox) {
            this.resultBBox.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The bounding box that fully contains all search results.
     * </p>
     * <note>
     * <p>
     * If you specified the optional <code>FilterBBox</code> parameter in the request, <code>ResultBBox</code> is
     * contained within <code>FilterBBox</code>.
     * </p>
     * </note>
     * 
     * @param resultBBox
     *        The bounding box that fully contains all search results.</p> <note>
     *        <p>
     *        If you specified the optional <code>FilterBBox</code> parameter in the request, <code>ResultBBox</code> is
     *        contained within <code>FilterBBox</code>.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchPlaceIndexForTextSummary withResultBBox(java.util.Collection<Double> resultBBox) {
        setResultBBox(resultBBox);
        return this;
    }

    /**
     * <p>
     * The search text specified in the request.
     * </p>
     * 
     * @param text
     *        The search text specified in the request.
     */

    public void setText(String text) {
        this.text = text;
    }

    /**
     * <p>
     * The search text specified in the request.
     * </p>
     * 
     * @return The search text specified in the request.
     */

    public String getText() {
        return this.text;
    }

    /**
     * <p>
     * The search text specified in the request.
     * </p>
     * 
     * @param text
     *        The search text specified in the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchPlaceIndexForTextSummary withText(String text) {
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
        if (getDataSource() != null)
            sb.append("DataSource: ").append(getDataSource()).append(",");
        if (getFilterBBox() != null)
            sb.append("FilterBBox: ").append("***Sensitive Data Redacted***").append(",");
        if (getFilterCountries() != null)
            sb.append("FilterCountries: ").append(getFilterCountries()).append(",");
        if (getLanguage() != null)
            sb.append("Language: ").append(getLanguage()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
        if (getResultBBox() != null)
            sb.append("ResultBBox: ").append("***Sensitive Data Redacted***").append(",");
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

        if (obj instanceof SearchPlaceIndexForTextSummary == false)
            return false;
        SearchPlaceIndexForTextSummary other = (SearchPlaceIndexForTextSummary) obj;
        if (other.getBiasPosition() == null ^ this.getBiasPosition() == null)
            return false;
        if (other.getBiasPosition() != null && other.getBiasPosition().equals(this.getBiasPosition()) == false)
            return false;
        if (other.getDataSource() == null ^ this.getDataSource() == null)
            return false;
        if (other.getDataSource() != null && other.getDataSource().equals(this.getDataSource()) == false)
            return false;
        if (other.getFilterBBox() == null ^ this.getFilterBBox() == null)
            return false;
        if (other.getFilterBBox() != null && other.getFilterBBox().equals(this.getFilterBBox()) == false)
            return false;
        if (other.getFilterCountries() == null ^ this.getFilterCountries() == null)
            return false;
        if (other.getFilterCountries() != null && other.getFilterCountries().equals(this.getFilterCountries()) == false)
            return false;
        if (other.getLanguage() == null ^ this.getLanguage() == null)
            return false;
        if (other.getLanguage() != null && other.getLanguage().equals(this.getLanguage()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getResultBBox() == null ^ this.getResultBBox() == null)
            return false;
        if (other.getResultBBox() != null && other.getResultBBox().equals(this.getResultBBox()) == false)
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
        hashCode = prime * hashCode + ((getDataSource() == null) ? 0 : getDataSource().hashCode());
        hashCode = prime * hashCode + ((getFilterBBox() == null) ? 0 : getFilterBBox().hashCode());
        hashCode = prime * hashCode + ((getFilterCountries() == null) ? 0 : getFilterCountries().hashCode());
        hashCode = prime * hashCode + ((getLanguage() == null) ? 0 : getLanguage().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getResultBBox() == null) ? 0 : getResultBBox().hashCode());
        hashCode = prime * hashCode + ((getText() == null) ? 0 : getText().hashCode());
        return hashCode;
    }

    @Override
    public SearchPlaceIndexForTextSummary clone() {
        try {
            return (SearchPlaceIndexForTextSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.location.model.transform.SearchPlaceIndexForTextSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
