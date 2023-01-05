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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/location-2020-11-19/SearchPlaceIndexForPosition"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SearchPlaceIndexForPositionRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

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
     * This setting affects the languages used in the results, but not the results themselves. If no language is
     * specified, or not supported for a particular result, the partner automatically chooses a language for the result.
     * </p>
     * <p>
     * For an example, we'll use the Greek language. You search for a location around Athens, Greece, with the
     * <code>language</code> parameter set to <code>en</code>. The <code>city</code> in the results will most likely be
     * returned as <code>Athens</code>.
     * </p>
     * <p>
     * If you set the <code>language</code> parameter to <code>el</code>, for Greek, then the <code>city</code> in the
     * results will more likely be returned as <code>Αθήνα</code>.
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
     * Default value: <code>50</code>
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * Specifies the longitude and latitude of the position to query.
     * </p>
     * <p>
     * This parameter must contain a pair of numbers. The first number represents the X coordinate, or longitude; the
     * second number represents the Y coordinate, or latitude.
     * </p>
     * <p>
     * For example, <code>[-123.1174, 49.2847]</code> represents a position with longitude <code>-123.1174</code> and
     * latitude <code>49.2847</code>.
     * </p>
     */
    private java.util.List<Double> position;

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

    public SearchPlaceIndexForPositionRequest withIndexName(String indexName) {
        setIndexName(indexName);
        return this;
    }

    /**
     * <p>
     * The preferred language used to return results. The value must be a valid <a
     * href="https://tools.ietf.org/search/bcp47">BCP 47</a> language tag, for example, <code>en</code> for English.
     * </p>
     * <p>
     * This setting affects the languages used in the results, but not the results themselves. If no language is
     * specified, or not supported for a particular result, the partner automatically chooses a language for the result.
     * </p>
     * <p>
     * For an example, we'll use the Greek language. You search for a location around Athens, Greece, with the
     * <code>language</code> parameter set to <code>en</code>. The <code>city</code> in the results will most likely be
     * returned as <code>Athens</code>.
     * </p>
     * <p>
     * If you set the <code>language</code> parameter to <code>el</code>, for Greek, then the <code>city</code> in the
     * results will more likely be returned as <code>Αθήνα</code>.
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
     *        This setting affects the languages used in the results, but not the results themselves. If no language is
     *        specified, or not supported for a particular result, the partner automatically chooses a language for the
     *        result.
     *        </p>
     *        <p>
     *        For an example, we'll use the Greek language. You search for a location around Athens, Greece, with the
     *        <code>language</code> parameter set to <code>en</code>. The <code>city</code> in the results will most
     *        likely be returned as <code>Athens</code>.
     *        </p>
     *        <p>
     *        If you set the <code>language</code> parameter to <code>el</code>, for Greek, then the <code>city</code>
     *        in the results will more likely be returned as <code>Αθήνα</code>.
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
     * This setting affects the languages used in the results, but not the results themselves. If no language is
     * specified, or not supported for a particular result, the partner automatically chooses a language for the result.
     * </p>
     * <p>
     * For an example, we'll use the Greek language. You search for a location around Athens, Greece, with the
     * <code>language</code> parameter set to <code>en</code>. The <code>city</code> in the results will most likely be
     * returned as <code>Athens</code>.
     * </p>
     * <p>
     * If you set the <code>language</code> parameter to <code>el</code>, for Greek, then the <code>city</code> in the
     * results will more likely be returned as <code>Αθήνα</code>.
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
     *         This setting affects the languages used in the results, but not the results themselves. If no language is
     *         specified, or not supported for a particular result, the partner automatically chooses a language for the
     *         result.
     *         </p>
     *         <p>
     *         For an example, we'll use the Greek language. You search for a location around Athens, Greece, with the
     *         <code>language</code> parameter set to <code>en</code>. The <code>city</code> in the results will most
     *         likely be returned as <code>Athens</code>.
     *         </p>
     *         <p>
     *         If you set the <code>language</code> parameter to <code>el</code>, for Greek, then the <code>city</code>
     *         in the results will more likely be returned as <code>Αθήνα</code>.
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
     * This setting affects the languages used in the results, but not the results themselves. If no language is
     * specified, or not supported for a particular result, the partner automatically chooses a language for the result.
     * </p>
     * <p>
     * For an example, we'll use the Greek language. You search for a location around Athens, Greece, with the
     * <code>language</code> parameter set to <code>en</code>. The <code>city</code> in the results will most likely be
     * returned as <code>Athens</code>.
     * </p>
     * <p>
     * If you set the <code>language</code> parameter to <code>el</code>, for Greek, then the <code>city</code> in the
     * results will more likely be returned as <code>Αθήνα</code>.
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
     *        This setting affects the languages used in the results, but not the results themselves. If no language is
     *        specified, or not supported for a particular result, the partner automatically chooses a language for the
     *        result.
     *        </p>
     *        <p>
     *        For an example, we'll use the Greek language. You search for a location around Athens, Greece, with the
     *        <code>language</code> parameter set to <code>en</code>. The <code>city</code> in the results will most
     *        likely be returned as <code>Athens</code>.
     *        </p>
     *        <p>
     *        If you set the <code>language</code> parameter to <code>el</code>, for Greek, then the <code>city</code>
     *        in the results will more likely be returned as <code>Αθήνα</code>.
     *        </p>
     *        <p>
     *        If the data provider does not have a value for Greek, the result will be in a language that the provider
     *        does support.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchPlaceIndexForPositionRequest withLanguage(String language) {
        setLanguage(language);
        return this;
    }

    /**
     * <p>
     * An optional parameter. The maximum number of results returned per request.
     * </p>
     * <p>
     * Default value: <code>50</code>
     * </p>
     * 
     * @param maxResults
     *        An optional parameter. The maximum number of results returned per request.</p>
     *        <p>
     *        Default value: <code>50</code>
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * An optional parameter. The maximum number of results returned per request.
     * </p>
     * <p>
     * Default value: <code>50</code>
     * </p>
     * 
     * @return An optional parameter. The maximum number of results returned per request.</p>
     *         <p>
     *         Default value: <code>50</code>
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * An optional parameter. The maximum number of results returned per request.
     * </p>
     * <p>
     * Default value: <code>50</code>
     * </p>
     * 
     * @param maxResults
     *        An optional parameter. The maximum number of results returned per request.</p>
     *        <p>
     *        Default value: <code>50</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchPlaceIndexForPositionRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * Specifies the longitude and latitude of the position to query.
     * </p>
     * <p>
     * This parameter must contain a pair of numbers. The first number represents the X coordinate, or longitude; the
     * second number represents the Y coordinate, or latitude.
     * </p>
     * <p>
     * For example, <code>[-123.1174, 49.2847]</code> represents a position with longitude <code>-123.1174</code> and
     * latitude <code>49.2847</code>.
     * </p>
     * 
     * @return Specifies the longitude and latitude of the position to query.</p>
     *         <p>
     *         This parameter must contain a pair of numbers. The first number represents the X coordinate, or
     *         longitude; the second number represents the Y coordinate, or latitude.
     *         </p>
     *         <p>
     *         For example, <code>[-123.1174, 49.2847]</code> represents a position with longitude
     *         <code>-123.1174</code> and latitude <code>49.2847</code>.
     */

    public java.util.List<Double> getPosition() {
        return position;
    }

    /**
     * <p>
     * Specifies the longitude and latitude of the position to query.
     * </p>
     * <p>
     * This parameter must contain a pair of numbers. The first number represents the X coordinate, or longitude; the
     * second number represents the Y coordinate, or latitude.
     * </p>
     * <p>
     * For example, <code>[-123.1174, 49.2847]</code> represents a position with longitude <code>-123.1174</code> and
     * latitude <code>49.2847</code>.
     * </p>
     * 
     * @param position
     *        Specifies the longitude and latitude of the position to query.</p>
     *        <p>
     *        This parameter must contain a pair of numbers. The first number represents the X coordinate, or longitude;
     *        the second number represents the Y coordinate, or latitude.
     *        </p>
     *        <p>
     *        For example, <code>[-123.1174, 49.2847]</code> represents a position with longitude <code>-123.1174</code>
     *        and latitude <code>49.2847</code>.
     */

    public void setPosition(java.util.Collection<Double> position) {
        if (position == null) {
            this.position = null;
            return;
        }

        this.position = new java.util.ArrayList<Double>(position);
    }

    /**
     * <p>
     * Specifies the longitude and latitude of the position to query.
     * </p>
     * <p>
     * This parameter must contain a pair of numbers. The first number represents the X coordinate, or longitude; the
     * second number represents the Y coordinate, or latitude.
     * </p>
     * <p>
     * For example, <code>[-123.1174, 49.2847]</code> represents a position with longitude <code>-123.1174</code> and
     * latitude <code>49.2847</code>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPosition(java.util.Collection)} or {@link #withPosition(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param position
     *        Specifies the longitude and latitude of the position to query.</p>
     *        <p>
     *        This parameter must contain a pair of numbers. The first number represents the X coordinate, or longitude;
     *        the second number represents the Y coordinate, or latitude.
     *        </p>
     *        <p>
     *        For example, <code>[-123.1174, 49.2847]</code> represents a position with longitude <code>-123.1174</code>
     *        and latitude <code>49.2847</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchPlaceIndexForPositionRequest withPosition(Double... position) {
        if (this.position == null) {
            setPosition(new java.util.ArrayList<Double>(position.length));
        }
        for (Double ele : position) {
            this.position.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Specifies the longitude and latitude of the position to query.
     * </p>
     * <p>
     * This parameter must contain a pair of numbers. The first number represents the X coordinate, or longitude; the
     * second number represents the Y coordinate, or latitude.
     * </p>
     * <p>
     * For example, <code>[-123.1174, 49.2847]</code> represents a position with longitude <code>-123.1174</code> and
     * latitude <code>49.2847</code>.
     * </p>
     * 
     * @param position
     *        Specifies the longitude and latitude of the position to query.</p>
     *        <p>
     *        This parameter must contain a pair of numbers. The first number represents the X coordinate, or longitude;
     *        the second number represents the Y coordinate, or latitude.
     *        </p>
     *        <p>
     *        For example, <code>[-123.1174, 49.2847]</code> represents a position with longitude <code>-123.1174</code>
     *        and latitude <code>49.2847</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchPlaceIndexForPositionRequest withPosition(java.util.Collection<Double> position) {
        setPosition(position);
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
        if (getIndexName() != null)
            sb.append("IndexName: ").append(getIndexName()).append(",");
        if (getLanguage() != null)
            sb.append("Language: ").append(getLanguage()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
        if (getPosition() != null)
            sb.append("Position: ").append("***Sensitive Data Redacted***");
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SearchPlaceIndexForPositionRequest == false)
            return false;
        SearchPlaceIndexForPositionRequest other = (SearchPlaceIndexForPositionRequest) obj;
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
        if (other.getPosition() == null ^ this.getPosition() == null)
            return false;
        if (other.getPosition() != null && other.getPosition().equals(this.getPosition()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIndexName() == null) ? 0 : getIndexName().hashCode());
        hashCode = prime * hashCode + ((getLanguage() == null) ? 0 : getLanguage().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getPosition() == null) ? 0 : getPosition().hashCode());
        return hashCode;
    }

    @Override
    public SearchPlaceIndexForPositionRequest clone() {
        return (SearchPlaceIndexForPositionRequest) super.clone();
    }

}
