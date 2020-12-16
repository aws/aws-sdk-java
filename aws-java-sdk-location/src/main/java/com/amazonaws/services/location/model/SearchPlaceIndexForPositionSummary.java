/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * A summary of the reverse geocoding request sent using <code>SearchPlaceIndexForPosition</code>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/location-2020-11-19/SearchPlaceIndexForPositionSummary"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SearchPlaceIndexForPositionSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The data provider of geospatial data for the Place index resource.
     * </p>
     */
    private String dataSource;
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
     * The position given in the reverse geocoding request.
     * </p>
     */
    private java.util.List<Double> position;

    /**
     * <p>
     * The data provider of geospatial data for the Place index resource.
     * </p>
     * 
     * @param dataSource
     *        The data provider of geospatial data for the Place index resource.
     */

    public void setDataSource(String dataSource) {
        this.dataSource = dataSource;
    }

    /**
     * <p>
     * The data provider of geospatial data for the Place index resource.
     * </p>
     * 
     * @return The data provider of geospatial data for the Place index resource.
     */

    public String getDataSource() {
        return this.dataSource;
    }

    /**
     * <p>
     * The data provider of geospatial data for the Place index resource.
     * </p>
     * 
     * @param dataSource
     *        The data provider of geospatial data for the Place index resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchPlaceIndexForPositionSummary withDataSource(String dataSource) {
        setDataSource(dataSource);
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
     *        An optional parameter. The maximum number of results returned per request. </p>
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
     * @return An optional parameter. The maximum number of results returned per request. </p>
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
     *        An optional parameter. The maximum number of results returned per request. </p>
     *        <p>
     *        Default value: <code>50</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchPlaceIndexForPositionSummary withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * The position given in the reverse geocoding request.
     * </p>
     * 
     * @return The position given in the reverse geocoding request.
     */

    public java.util.List<Double> getPosition() {
        return position;
    }

    /**
     * <p>
     * The position given in the reverse geocoding request.
     * </p>
     * 
     * @param position
     *        The position given in the reverse geocoding request.
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
     * The position given in the reverse geocoding request.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPosition(java.util.Collection)} or {@link #withPosition(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param position
     *        The position given in the reverse geocoding request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchPlaceIndexForPositionSummary withPosition(Double... position) {
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
     * The position given in the reverse geocoding request.
     * </p>
     * 
     * @param position
     *        The position given in the reverse geocoding request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchPlaceIndexForPositionSummary withPosition(java.util.Collection<Double> position) {
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
        if (getDataSource() != null)
            sb.append("DataSource: ").append(getDataSource()).append(",");
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

        if (obj instanceof SearchPlaceIndexForPositionSummary == false)
            return false;
        SearchPlaceIndexForPositionSummary other = (SearchPlaceIndexForPositionSummary) obj;
        if (other.getDataSource() == null ^ this.getDataSource() == null)
            return false;
        if (other.getDataSource() != null && other.getDataSource().equals(this.getDataSource()) == false)
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

        hashCode = prime * hashCode + ((getDataSource() == null) ? 0 : getDataSource().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getPosition() == null) ? 0 : getPosition().hashCode());
        return hashCode;
    }

    @Override
    public SearchPlaceIndexForPositionSummary clone() {
        try {
            return (SearchPlaceIndexForPositionSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.location.model.transform.SearchPlaceIndexForPositionSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
