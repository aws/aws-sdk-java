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
     * An optional paramer. The maximum number of results returned per request.
     * </p>
     * <p>
     * Default value: <code>50</code>
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * Specifies a coordinate for the query defined by a longitude, and latitude.
     * </p>
     * <ul>
     * <li>
     * <p>
     * The first position is the X coordinate, or longitude.
     * </p>
     * </li>
     * <li>
     * <p>
     * The second position is the Y coordinate, or latitude.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For example, <code>position=xLongitude&amp;position=yLatitude</code> .
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
     * An optional paramer. The maximum number of results returned per request.
     * </p>
     * <p>
     * Default value: <code>50</code>
     * </p>
     * 
     * @param maxResults
     *        An optional paramer. The maximum number of results returned per request. </p>
     *        <p>
     *        Default value: <code>50</code>
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * An optional paramer. The maximum number of results returned per request.
     * </p>
     * <p>
     * Default value: <code>50</code>
     * </p>
     * 
     * @return An optional paramer. The maximum number of results returned per request. </p>
     *         <p>
     *         Default value: <code>50</code>
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * An optional paramer. The maximum number of results returned per request.
     * </p>
     * <p>
     * Default value: <code>50</code>
     * </p>
     * 
     * @param maxResults
     *        An optional paramer. The maximum number of results returned per request. </p>
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
     * Specifies a coordinate for the query defined by a longitude, and latitude.
     * </p>
     * <ul>
     * <li>
     * <p>
     * The first position is the X coordinate, or longitude.
     * </p>
     * </li>
     * <li>
     * <p>
     * The second position is the Y coordinate, or latitude.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For example, <code>position=xLongitude&amp;position=yLatitude</code> .
     * </p>
     * 
     * @return Specifies a coordinate for the query defined by a longitude, and latitude.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         The first position is the X coordinate, or longitude.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The second position is the Y coordinate, or latitude.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         For example, <code>position=xLongitude&amp;position=yLatitude</code> .
     */

    public java.util.List<Double> getPosition() {
        return position;
    }

    /**
     * <p>
     * Specifies a coordinate for the query defined by a longitude, and latitude.
     * </p>
     * <ul>
     * <li>
     * <p>
     * The first position is the X coordinate, or longitude.
     * </p>
     * </li>
     * <li>
     * <p>
     * The second position is the Y coordinate, or latitude.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For example, <code>position=xLongitude&amp;position=yLatitude</code> .
     * </p>
     * 
     * @param position
     *        Specifies a coordinate for the query defined by a longitude, and latitude.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        The first position is the X coordinate, or longitude.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The second position is the Y coordinate, or latitude.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        For example, <code>position=xLongitude&amp;position=yLatitude</code> .
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
     * Specifies a coordinate for the query defined by a longitude, and latitude.
     * </p>
     * <ul>
     * <li>
     * <p>
     * The first position is the X coordinate, or longitude.
     * </p>
     * </li>
     * <li>
     * <p>
     * The second position is the Y coordinate, or latitude.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For example, <code>position=xLongitude&amp;position=yLatitude</code> .
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPosition(java.util.Collection)} or {@link #withPosition(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param position
     *        Specifies a coordinate for the query defined by a longitude, and latitude.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        The first position is the X coordinate, or longitude.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The second position is the Y coordinate, or latitude.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        For example, <code>position=xLongitude&amp;position=yLatitude</code> .
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
     * Specifies a coordinate for the query defined by a longitude, and latitude.
     * </p>
     * <ul>
     * <li>
     * <p>
     * The first position is the X coordinate, or longitude.
     * </p>
     * </li>
     * <li>
     * <p>
     * The second position is the Y coordinate, or latitude.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For example, <code>position=xLongitude&amp;position=yLatitude</code> .
     * </p>
     * 
     * @param position
     *        Specifies a coordinate for the query defined by a longitude, and latitude.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        The first position is the X coordinate, or longitude.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The second position is the Y coordinate, or latitude.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        For example, <code>position=xLongitude&amp;position=yLatitude</code> .
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
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getPosition() == null) ? 0 : getPosition().hashCode());
        return hashCode;
    }

    @Override
    public SearchPlaceIndexForPositionRequest clone() {
        return (SearchPlaceIndexForPositionRequest) super.clone();
    }

}
