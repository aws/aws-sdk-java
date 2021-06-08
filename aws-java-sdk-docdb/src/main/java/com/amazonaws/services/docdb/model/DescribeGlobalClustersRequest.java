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
package com.amazonaws.services.docdb.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/docdb-2014-10-31/DescribeGlobalClusters" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeGlobalClustersRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The user-supplied cluster identifier. If this parameter is specified, information from only the specific cluster
     * is returned. This parameter isn't case-sensitive.
     * </p>
     */
    private String globalClusterIdentifier;
    /**
     * <p>
     * A filter that specifies one or more global DB clusters to describe.
     * </p>
     * <p>
     * Supported filters: <code>db-cluster-id</code> accepts cluster identifiers and cluster Amazon Resource Names
     * (ARNs). The results list will only include information about the clusters identified by these ARNs.
     * </p>
     */
    private java.util.List<Filter> filters;
    /**
     * <p>
     * The maximum number of records to include in the response. If more records exist than the specified
     * <code>MaxRecords</code> value, a pagination token called a marker is included in the response so that you can
     * retrieve the remaining results.
     * </p>
     */
    private Integer maxRecords;
    /**
     * <p>
     * An optional pagination token provided by a previous <code>DescribeGlobalClusters</code> request. If this
     * parameter is specified, the response includes only records beyond the marker, up to the value specified by
     * <code>MaxRecords</code>.
     * </p>
     */
    private String marker;

    /**
     * <p>
     * The user-supplied cluster identifier. If this parameter is specified, information from only the specific cluster
     * is returned. This parameter isn't case-sensitive.
     * </p>
     * 
     * @param globalClusterIdentifier
     *        The user-supplied cluster identifier. If this parameter is specified, information from only the specific
     *        cluster is returned. This parameter isn't case-sensitive.
     */

    public void setGlobalClusterIdentifier(String globalClusterIdentifier) {
        this.globalClusterIdentifier = globalClusterIdentifier;
    }

    /**
     * <p>
     * The user-supplied cluster identifier. If this parameter is specified, information from only the specific cluster
     * is returned. This parameter isn't case-sensitive.
     * </p>
     * 
     * @return The user-supplied cluster identifier. If this parameter is specified, information from only the specific
     *         cluster is returned. This parameter isn't case-sensitive.
     */

    public String getGlobalClusterIdentifier() {
        return this.globalClusterIdentifier;
    }

    /**
     * <p>
     * The user-supplied cluster identifier. If this parameter is specified, information from only the specific cluster
     * is returned. This parameter isn't case-sensitive.
     * </p>
     * 
     * @param globalClusterIdentifier
     *        The user-supplied cluster identifier. If this parameter is specified, information from only the specific
     *        cluster is returned. This parameter isn't case-sensitive.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeGlobalClustersRequest withGlobalClusterIdentifier(String globalClusterIdentifier) {
        setGlobalClusterIdentifier(globalClusterIdentifier);
        return this;
    }

    /**
     * <p>
     * A filter that specifies one or more global DB clusters to describe.
     * </p>
     * <p>
     * Supported filters: <code>db-cluster-id</code> accepts cluster identifiers and cluster Amazon Resource Names
     * (ARNs). The results list will only include information about the clusters identified by these ARNs.
     * </p>
     * 
     * @return A filter that specifies one or more global DB clusters to describe.</p>
     *         <p>
     *         Supported filters: <code>db-cluster-id</code> accepts cluster identifiers and cluster Amazon Resource
     *         Names (ARNs). The results list will only include information about the clusters identified by these ARNs.
     */

    public java.util.List<Filter> getFilters() {
        return filters;
    }

    /**
     * <p>
     * A filter that specifies one or more global DB clusters to describe.
     * </p>
     * <p>
     * Supported filters: <code>db-cluster-id</code> accepts cluster identifiers and cluster Amazon Resource Names
     * (ARNs). The results list will only include information about the clusters identified by these ARNs.
     * </p>
     * 
     * @param filters
     *        A filter that specifies one or more global DB clusters to describe.</p>
     *        <p>
     *        Supported filters: <code>db-cluster-id</code> accepts cluster identifiers and cluster Amazon Resource
     *        Names (ARNs). The results list will only include information about the clusters identified by these ARNs.
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
     * A filter that specifies one or more global DB clusters to describe.
     * </p>
     * <p>
     * Supported filters: <code>db-cluster-id</code> accepts cluster identifiers and cluster Amazon Resource Names
     * (ARNs). The results list will only include information about the clusters identified by these ARNs.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFilters(java.util.Collection)} or {@link #withFilters(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param filters
     *        A filter that specifies one or more global DB clusters to describe.</p>
     *        <p>
     *        Supported filters: <code>db-cluster-id</code> accepts cluster identifiers and cluster Amazon Resource
     *        Names (ARNs). The results list will only include information about the clusters identified by these ARNs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeGlobalClustersRequest withFilters(Filter... filters) {
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
     * A filter that specifies one or more global DB clusters to describe.
     * </p>
     * <p>
     * Supported filters: <code>db-cluster-id</code> accepts cluster identifiers and cluster Amazon Resource Names
     * (ARNs). The results list will only include information about the clusters identified by these ARNs.
     * </p>
     * 
     * @param filters
     *        A filter that specifies one or more global DB clusters to describe.</p>
     *        <p>
     *        Supported filters: <code>db-cluster-id</code> accepts cluster identifiers and cluster Amazon Resource
     *        Names (ARNs). The results list will only include information about the clusters identified by these ARNs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeGlobalClustersRequest withFilters(java.util.Collection<Filter> filters) {
        setFilters(filters);
        return this;
    }

    /**
     * <p>
     * The maximum number of records to include in the response. If more records exist than the specified
     * <code>MaxRecords</code> value, a pagination token called a marker is included in the response so that you can
     * retrieve the remaining results.
     * </p>
     * 
     * @param maxRecords
     *        The maximum number of records to include in the response. If more records exist than the specified
     *        <code>MaxRecords</code> value, a pagination token called a marker is included in the response so that you
     *        can retrieve the remaining results.
     */

    public void setMaxRecords(Integer maxRecords) {
        this.maxRecords = maxRecords;
    }

    /**
     * <p>
     * The maximum number of records to include in the response. If more records exist than the specified
     * <code>MaxRecords</code> value, a pagination token called a marker is included in the response so that you can
     * retrieve the remaining results.
     * </p>
     * 
     * @return The maximum number of records to include in the response. If more records exist than the specified
     *         <code>MaxRecords</code> value, a pagination token called a marker is included in the response so that you
     *         can retrieve the remaining results.
     */

    public Integer getMaxRecords() {
        return this.maxRecords;
    }

    /**
     * <p>
     * The maximum number of records to include in the response. If more records exist than the specified
     * <code>MaxRecords</code> value, a pagination token called a marker is included in the response so that you can
     * retrieve the remaining results.
     * </p>
     * 
     * @param maxRecords
     *        The maximum number of records to include in the response. If more records exist than the specified
     *        <code>MaxRecords</code> value, a pagination token called a marker is included in the response so that you
     *        can retrieve the remaining results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeGlobalClustersRequest withMaxRecords(Integer maxRecords) {
        setMaxRecords(maxRecords);
        return this;
    }

    /**
     * <p>
     * An optional pagination token provided by a previous <code>DescribeGlobalClusters</code> request. If this
     * parameter is specified, the response includes only records beyond the marker, up to the value specified by
     * <code>MaxRecords</code>.
     * </p>
     * 
     * @param marker
     *        An optional pagination token provided by a previous <code>DescribeGlobalClusters</code> request. If this
     *        parameter is specified, the response includes only records beyond the marker, up to the value specified by
     *        <code>MaxRecords</code>.
     */

    public void setMarker(String marker) {
        this.marker = marker;
    }

    /**
     * <p>
     * An optional pagination token provided by a previous <code>DescribeGlobalClusters</code> request. If this
     * parameter is specified, the response includes only records beyond the marker, up to the value specified by
     * <code>MaxRecords</code>.
     * </p>
     * 
     * @return An optional pagination token provided by a previous <code>DescribeGlobalClusters</code> request. If this
     *         parameter is specified, the response includes only records beyond the marker, up to the value specified
     *         by <code>MaxRecords</code>.
     */

    public String getMarker() {
        return this.marker;
    }

    /**
     * <p>
     * An optional pagination token provided by a previous <code>DescribeGlobalClusters</code> request. If this
     * parameter is specified, the response includes only records beyond the marker, up to the value specified by
     * <code>MaxRecords</code>.
     * </p>
     * 
     * @param marker
     *        An optional pagination token provided by a previous <code>DescribeGlobalClusters</code> request. If this
     *        parameter is specified, the response includes only records beyond the marker, up to the value specified by
     *        <code>MaxRecords</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeGlobalClustersRequest withMarker(String marker) {
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
        if (getGlobalClusterIdentifier() != null)
            sb.append("GlobalClusterIdentifier: ").append(getGlobalClusterIdentifier()).append(",");
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

        if (obj instanceof DescribeGlobalClustersRequest == false)
            return false;
        DescribeGlobalClustersRequest other = (DescribeGlobalClustersRequest) obj;
        if (other.getGlobalClusterIdentifier() == null ^ this.getGlobalClusterIdentifier() == null)
            return false;
        if (other.getGlobalClusterIdentifier() != null && other.getGlobalClusterIdentifier().equals(this.getGlobalClusterIdentifier()) == false)
            return false;
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

        hashCode = prime * hashCode + ((getGlobalClusterIdentifier() == null) ? 0 : getGlobalClusterIdentifier().hashCode());
        hashCode = prime * hashCode + ((getFilters() == null) ? 0 : getFilters().hashCode());
        hashCode = prime * hashCode + ((getMaxRecords() == null) ? 0 : getMaxRecords().hashCode());
        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode());
        return hashCode;
    }

    @Override
    public DescribeGlobalClustersRequest clone() {
        return (DescribeGlobalClustersRequest) super.clone();
    }

}
