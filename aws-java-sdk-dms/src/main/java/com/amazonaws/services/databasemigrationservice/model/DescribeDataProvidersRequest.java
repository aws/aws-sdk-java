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
package com.amazonaws.services.databasemigrationservice.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dms-2016-01-01/DescribeDataProviders" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeDataProvidersRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Filters applied to the data providers described in the form of key-value pairs.
     * </p>
     * <p>
     * Valid filter names: data-provider-identifier
     * </p>
     */
    private java.util.List<Filter> filters;
    /**
     * <p>
     * The maximum number of records to include in the response. If more records exist than the specified
     * <code>MaxRecords</code> value, DMS includes a pagination token in the response so that you can retrieve the
     * remaining results.
     * </p>
     */
    private Integer maxRecords;
    /**
     * <p>
     * Specifies the unique pagination token that makes it possible to display the next page of results. If this
     * parameter is specified, the response includes only records beyond the marker, up to the value specified by
     * <code>MaxRecords</code>.
     * </p>
     * <p>
     * If <code>Marker</code> is returned by a previous response, there are more results available. The value of
     * <code>Marker</code> is a unique pagination token for each page. To retrieve the next page, make the call again
     * using the returned token and keeping all other arguments unchanged.
     * </p>
     */
    private String marker;

    /**
     * <p>
     * Filters applied to the data providers described in the form of key-value pairs.
     * </p>
     * <p>
     * Valid filter names: data-provider-identifier
     * </p>
     * 
     * @return Filters applied to the data providers described in the form of key-value pairs.</p>
     *         <p>
     *         Valid filter names: data-provider-identifier
     */

    public java.util.List<Filter> getFilters() {
        return filters;
    }

    /**
     * <p>
     * Filters applied to the data providers described in the form of key-value pairs.
     * </p>
     * <p>
     * Valid filter names: data-provider-identifier
     * </p>
     * 
     * @param filters
     *        Filters applied to the data providers described in the form of key-value pairs.</p>
     *        <p>
     *        Valid filter names: data-provider-identifier
     */

    public void setFilters(java.util.Collection<Filter> filters) {
        if (filters == null) {
            this.filters = null;
            return;
        }

        this.filters = new java.util.ArrayList<Filter>(filters);
    }

    /**
     * <p>
     * Filters applied to the data providers described in the form of key-value pairs.
     * </p>
     * <p>
     * Valid filter names: data-provider-identifier
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFilters(java.util.Collection)} or {@link #withFilters(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param filters
     *        Filters applied to the data providers described in the form of key-value pairs.</p>
     *        <p>
     *        Valid filter names: data-provider-identifier
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDataProvidersRequest withFilters(Filter... filters) {
        if (this.filters == null) {
            setFilters(new java.util.ArrayList<Filter>(filters.length));
        }
        for (Filter ele : filters) {
            this.filters.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Filters applied to the data providers described in the form of key-value pairs.
     * </p>
     * <p>
     * Valid filter names: data-provider-identifier
     * </p>
     * 
     * @param filters
     *        Filters applied to the data providers described in the form of key-value pairs.</p>
     *        <p>
     *        Valid filter names: data-provider-identifier
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDataProvidersRequest withFilters(java.util.Collection<Filter> filters) {
        setFilters(filters);
        return this;
    }

    /**
     * <p>
     * The maximum number of records to include in the response. If more records exist than the specified
     * <code>MaxRecords</code> value, DMS includes a pagination token in the response so that you can retrieve the
     * remaining results.
     * </p>
     * 
     * @param maxRecords
     *        The maximum number of records to include in the response. If more records exist than the specified
     *        <code>MaxRecords</code> value, DMS includes a pagination token in the response so that you can retrieve
     *        the remaining results.
     */

    public void setMaxRecords(Integer maxRecords) {
        this.maxRecords = maxRecords;
    }

    /**
     * <p>
     * The maximum number of records to include in the response. If more records exist than the specified
     * <code>MaxRecords</code> value, DMS includes a pagination token in the response so that you can retrieve the
     * remaining results.
     * </p>
     * 
     * @return The maximum number of records to include in the response. If more records exist than the specified
     *         <code>MaxRecords</code> value, DMS includes a pagination token in the response so that you can retrieve
     *         the remaining results.
     */

    public Integer getMaxRecords() {
        return this.maxRecords;
    }

    /**
     * <p>
     * The maximum number of records to include in the response. If more records exist than the specified
     * <code>MaxRecords</code> value, DMS includes a pagination token in the response so that you can retrieve the
     * remaining results.
     * </p>
     * 
     * @param maxRecords
     *        The maximum number of records to include in the response. If more records exist than the specified
     *        <code>MaxRecords</code> value, DMS includes a pagination token in the response so that you can retrieve
     *        the remaining results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDataProvidersRequest withMaxRecords(Integer maxRecords) {
        setMaxRecords(maxRecords);
        return this;
    }

    /**
     * <p>
     * Specifies the unique pagination token that makes it possible to display the next page of results. If this
     * parameter is specified, the response includes only records beyond the marker, up to the value specified by
     * <code>MaxRecords</code>.
     * </p>
     * <p>
     * If <code>Marker</code> is returned by a previous response, there are more results available. The value of
     * <code>Marker</code> is a unique pagination token for each page. To retrieve the next page, make the call again
     * using the returned token and keeping all other arguments unchanged.
     * </p>
     * 
     * @param marker
     *        Specifies the unique pagination token that makes it possible to display the next page of results. If this
     *        parameter is specified, the response includes only records beyond the marker, up to the value specified by
     *        <code>MaxRecords</code>.</p>
     *        <p>
     *        If <code>Marker</code> is returned by a previous response, there are more results available. The value of
     *        <code>Marker</code> is a unique pagination token for each page. To retrieve the next page, make the call
     *        again using the returned token and keeping all other arguments unchanged.
     */

    public void setMarker(String marker) {
        this.marker = marker;
    }

    /**
     * <p>
     * Specifies the unique pagination token that makes it possible to display the next page of results. If this
     * parameter is specified, the response includes only records beyond the marker, up to the value specified by
     * <code>MaxRecords</code>.
     * </p>
     * <p>
     * If <code>Marker</code> is returned by a previous response, there are more results available. The value of
     * <code>Marker</code> is a unique pagination token for each page. To retrieve the next page, make the call again
     * using the returned token and keeping all other arguments unchanged.
     * </p>
     * 
     * @return Specifies the unique pagination token that makes it possible to display the next page of results. If this
     *         parameter is specified, the response includes only records beyond the marker, up to the value specified
     *         by <code>MaxRecords</code>.</p>
     *         <p>
     *         If <code>Marker</code> is returned by a previous response, there are more results available. The value of
     *         <code>Marker</code> is a unique pagination token for each page. To retrieve the next page, make the call
     *         again using the returned token and keeping all other arguments unchanged.
     */

    public String getMarker() {
        return this.marker;
    }

    /**
     * <p>
     * Specifies the unique pagination token that makes it possible to display the next page of results. If this
     * parameter is specified, the response includes only records beyond the marker, up to the value specified by
     * <code>MaxRecords</code>.
     * </p>
     * <p>
     * If <code>Marker</code> is returned by a previous response, there are more results available. The value of
     * <code>Marker</code> is a unique pagination token for each page. To retrieve the next page, make the call again
     * using the returned token and keeping all other arguments unchanged.
     * </p>
     * 
     * @param marker
     *        Specifies the unique pagination token that makes it possible to display the next page of results. If this
     *        parameter is specified, the response includes only records beyond the marker, up to the value specified by
     *        <code>MaxRecords</code>.</p>
     *        <p>
     *        If <code>Marker</code> is returned by a previous response, there are more results available. The value of
     *        <code>Marker</code> is a unique pagination token for each page. To retrieve the next page, make the call
     *        again using the returned token and keeping all other arguments unchanged.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDataProvidersRequest withMarker(String marker) {
        setMarker(marker);
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
        if (getFilters() != null)
            sb.append("Filters: ").append(getFilters()).append(",");
        if (getMaxRecords() != null)
            sb.append("MaxRecords: ").append(getMaxRecords()).append(",");
        if (getMarker() != null)
            sb.append("Marker: ").append(getMarker());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeDataProvidersRequest == false)
            return false;
        DescribeDataProvidersRequest other = (DescribeDataProvidersRequest) obj;
        if (other.getFilters() == null ^ this.getFilters() == null)
            return false;
        if (other.getFilters() != null && other.getFilters().equals(this.getFilters()) == false)
            return false;
        if (other.getMaxRecords() == null ^ this.getMaxRecords() == null)
            return false;
        if (other.getMaxRecords() != null && other.getMaxRecords().equals(this.getMaxRecords()) == false)
            return false;
        if (other.getMarker() == null ^ this.getMarker() == null)
            return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFilters() == null) ? 0 : getFilters().hashCode());
        hashCode = prime * hashCode + ((getMaxRecords() == null) ? 0 : getMaxRecords().hashCode());
        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode());
        return hashCode;
    }

    @Override
    public DescribeDataProvidersRequest clone() {
        return (DescribeDataProvidersRequest) super.clone();
    }

}
