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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dms-2016-01-01/DescribeDataProviders" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeDataProvidersResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

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
     * A description of data providers.
     * </p>
     */
    private java.util.List<DataProvider> dataProviders;

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

    public DescribeDataProvidersResult withMarker(String marker) {
        setMarker(marker);
        return this;
    }

    /**
     * <p>
     * A description of data providers.
     * </p>
     * 
     * @return A description of data providers.
     */

    public java.util.List<DataProvider> getDataProviders() {
        return dataProviders;
    }

    /**
     * <p>
     * A description of data providers.
     * </p>
     * 
     * @param dataProviders
     *        A description of data providers.
     */

    public void setDataProviders(java.util.Collection<DataProvider> dataProviders) {
        if (dataProviders == null) {
            this.dataProviders = null;
            return;
        }

        this.dataProviders = new java.util.ArrayList<DataProvider>(dataProviders);
    }

    /**
     * <p>
     * A description of data providers.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDataProviders(java.util.Collection)} or {@link #withDataProviders(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param dataProviders
     *        A description of data providers.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDataProvidersResult withDataProviders(DataProvider... dataProviders) {
        if (this.dataProviders == null) {
            setDataProviders(new java.util.ArrayList<DataProvider>(dataProviders.length));
        }
        for (DataProvider ele : dataProviders) {
            this.dataProviders.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A description of data providers.
     * </p>
     * 
     * @param dataProviders
     *        A description of data providers.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDataProvidersResult withDataProviders(java.util.Collection<DataProvider> dataProviders) {
        setDataProviders(dataProviders);
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
        if (getMarker() != null)
            sb.append("Marker: ").append(getMarker()).append(",");
        if (getDataProviders() != null)
            sb.append("DataProviders: ").append(getDataProviders());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeDataProvidersResult == false)
            return false;
        DescribeDataProvidersResult other = (DescribeDataProvidersResult) obj;
        if (other.getMarker() == null ^ this.getMarker() == null)
            return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false)
            return false;
        if (other.getDataProviders() == null ^ this.getDataProviders() == null)
            return false;
        if (other.getDataProviders() != null && other.getDataProviders().equals(this.getDataProviders()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode());
        hashCode = prime * hashCode + ((getDataProviders() == null) ? 0 : getDataProviders().hashCode());
        return hashCode;
    }

    @Override
    public DescribeDataProvidersResult clone() {
        try {
            return (DescribeDataProvidersResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
