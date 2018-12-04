/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights
 * Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.services.rds.model;

import java.io.Serializable;
import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p/>
 */
public class DescribeDBClusterSnapshotsRequest extends AmazonWebServiceRequest
        implements Serializable, Cloneable {

    /**
     * <p>
     * A DB cluster identifier to retrieve the list of DB cluster snapshots for.
     * This parameter cannot be used in conjunction with the
     * <code>DBClusterSnapshotIdentifier</code> parameter. This parameter is not
     * case-sensitive.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>Must contain from 1 to 63 alphanumeric characters or hyphens</li>
     * <li>First character must be a letter</li>
     * <li>Cannot end with a hyphen or contain two consecutive hyphens</li>
     * </ul>
     */
    private String dBClusterIdentifier;
    /**
     * <p>
     * A specific DB cluster snapshot identifier to describe. This parameter
     * cannot be used in conjunction with the <code>DBClusterIdentifier</code>
     * parameter. This value is stored as a lowercase string.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>Must be 1 to 255 alphanumeric characters</li>
     * <li>First character must be a letter</li>
     * <li>Cannot end with a hyphen or contain two consecutive hyphens</li>
     * <li>If this is the identifier of an automated snapshot, the
     * <code>SnapshotType</code> parameter must also be specified.</li>
     * </ul>
     */
    private String dBClusterSnapshotIdentifier;
    /**
     * <p>
     * The type of DB cluster snapshots that will be returned. Values can be
     * <code>automated</code> or <code>manual</code>. If this parameter is not
     * specified, the returned results will include all snapshot types.
     * </p>
     */
    private String snapshotType;
    /**
     * <p>
     * This parameter is not currently supported.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Filter> filters;
    /**
     * <p>
     * The maximum number of records to include in the response. If more records
     * exist than the specified <code>MaxRecords</code> value, a pagination
     * token called a marker is included in the response so that the remaining
     * results can be retrieved.
     * </p>
     * <p>
     * Default: 100
     * </p>
     * <p>
     * Constraints: Minimum 20, maximum 100.
     * </p>
     */
    private Integer maxRecords;
    /**
     * <p>
     * An optional pagination token provided by a previous
     * <code>DescribeDBClusterSnapshots</code> request. If this parameter is
     * specified, the response includes only records beyond the marker, up to
     * the value specified by <code>MaxRecords</code>.
     * </p>
     */
    private String marker;

    /**
     * <p>
     * A DB cluster identifier to retrieve the list of DB cluster snapshots for.
     * This parameter cannot be used in conjunction with the
     * <code>DBClusterSnapshotIdentifier</code> parameter. This parameter is not
     * case-sensitive.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>Must contain from 1 to 63 alphanumeric characters or hyphens</li>
     * <li>First character must be a letter</li>
     * <li>Cannot end with a hyphen or contain two consecutive hyphens</li>
     * </ul>
     * 
     * @param dBClusterIdentifier
     *        A DB cluster identifier to retrieve the list of DB cluster
     *        snapshots for. This parameter cannot be used in conjunction with
     *        the <code>DBClusterSnapshotIdentifier</code> parameter. This
     *        parameter is not case-sensitive. </p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>Must contain from 1 to 63 alphanumeric characters or hyphens</li>
     *        <li>First character must be a letter</li>
     *        <li>Cannot end with a hyphen or contain two consecutive hyphens</li>
     */

    public void setDBClusterIdentifier(String dBClusterIdentifier) {
        this.dBClusterIdentifier = dBClusterIdentifier;
    }

    /**
     * <p>
     * A DB cluster identifier to retrieve the list of DB cluster snapshots for.
     * This parameter cannot be used in conjunction with the
     * <code>DBClusterSnapshotIdentifier</code> parameter. This parameter is not
     * case-sensitive.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>Must contain from 1 to 63 alphanumeric characters or hyphens</li>
     * <li>First character must be a letter</li>
     * <li>Cannot end with a hyphen or contain two consecutive hyphens</li>
     * </ul>
     * 
     * @return A DB cluster identifier to retrieve the list of DB cluster
     *         snapshots for. This parameter cannot be used in conjunction with
     *         the <code>DBClusterSnapshotIdentifier</code> parameter. This
     *         parameter is not case-sensitive. </p>
     *         <p>
     *         Constraints:
     *         </p>
     *         <ul>
     *         <li>Must contain from 1 to 63 alphanumeric characters or hyphens</li>
     *         <li>First character must be a letter</li>
     *         <li>Cannot end with a hyphen or contain two consecutive hyphens</li>
     */

    public String getDBClusterIdentifier() {
        return this.dBClusterIdentifier;
    }

    /**
     * <p>
     * A DB cluster identifier to retrieve the list of DB cluster snapshots for.
     * This parameter cannot be used in conjunction with the
     * <code>DBClusterSnapshotIdentifier</code> parameter. This parameter is not
     * case-sensitive.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>Must contain from 1 to 63 alphanumeric characters or hyphens</li>
     * <li>First character must be a letter</li>
     * <li>Cannot end with a hyphen or contain two consecutive hyphens</li>
     * </ul>
     * 
     * @param dBClusterIdentifier
     *        A DB cluster identifier to retrieve the list of DB cluster
     *        snapshots for. This parameter cannot be used in conjunction with
     *        the <code>DBClusterSnapshotIdentifier</code> parameter. This
     *        parameter is not case-sensitive. </p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>Must contain from 1 to 63 alphanumeric characters or hyphens</li>
     *        <li>First character must be a letter</li>
     *        <li>Cannot end with a hyphen or contain two consecutive hyphens</li>
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public DescribeDBClusterSnapshotsRequest withDBClusterIdentifier(
            String dBClusterIdentifier) {
        setDBClusterIdentifier(dBClusterIdentifier);
        return this;
    }

    /**
     * <p>
     * A specific DB cluster snapshot identifier to describe. This parameter
     * cannot be used in conjunction with the <code>DBClusterIdentifier</code>
     * parameter. This value is stored as a lowercase string.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>Must be 1 to 255 alphanumeric characters</li>
     * <li>First character must be a letter</li>
     * <li>Cannot end with a hyphen or contain two consecutive hyphens</li>
     * <li>If this is the identifier of an automated snapshot, the
     * <code>SnapshotType</code> parameter must also be specified.</li>
     * </ul>
     * 
     * @param dBClusterSnapshotIdentifier
     *        A specific DB cluster snapshot identifier to describe. This
     *        parameter cannot be used in conjunction with the
     *        <code>DBClusterIdentifier</code> parameter. This value is stored
     *        as a lowercase string. </p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>Must be 1 to 255 alphanumeric characters</li>
     *        <li>First character must be a letter</li>
     *        <li>Cannot end with a hyphen or contain two consecutive hyphens</li>
     *        <li>If this is the identifier of an automated snapshot, the
     *        <code>SnapshotType</code> parameter must also be specified.</li>
     */

    public void setDBClusterSnapshotIdentifier(
            String dBClusterSnapshotIdentifier) {
        this.dBClusterSnapshotIdentifier = dBClusterSnapshotIdentifier;
    }

    /**
     * <p>
     * A specific DB cluster snapshot identifier to describe. This parameter
     * cannot be used in conjunction with the <code>DBClusterIdentifier</code>
     * parameter. This value is stored as a lowercase string.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>Must be 1 to 255 alphanumeric characters</li>
     * <li>First character must be a letter</li>
     * <li>Cannot end with a hyphen or contain two consecutive hyphens</li>
     * <li>If this is the identifier of an automated snapshot, the
     * <code>SnapshotType</code> parameter must also be specified.</li>
     * </ul>
     * 
     * @return A specific DB cluster snapshot identifier to describe. This
     *         parameter cannot be used in conjunction with the
     *         <code>DBClusterIdentifier</code> parameter. This value is stored
     *         as a lowercase string. </p>
     *         <p>
     *         Constraints:
     *         </p>
     *         <ul>
     *         <li>Must be 1 to 255 alphanumeric characters</li>
     *         <li>First character must be a letter</li>
     *         <li>Cannot end with a hyphen or contain two consecutive hyphens</li>
     *         <li>If this is the identifier of an automated snapshot, the
     *         <code>SnapshotType</code> parameter must also be specified.</li>
     */

    public String getDBClusterSnapshotIdentifier() {
        return this.dBClusterSnapshotIdentifier;
    }

    /**
     * <p>
     * A specific DB cluster snapshot identifier to describe. This parameter
     * cannot be used in conjunction with the <code>DBClusterIdentifier</code>
     * parameter. This value is stored as a lowercase string.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>Must be 1 to 255 alphanumeric characters</li>
     * <li>First character must be a letter</li>
     * <li>Cannot end with a hyphen or contain two consecutive hyphens</li>
     * <li>If this is the identifier of an automated snapshot, the
     * <code>SnapshotType</code> parameter must also be specified.</li>
     * </ul>
     * 
     * @param dBClusterSnapshotIdentifier
     *        A specific DB cluster snapshot identifier to describe. This
     *        parameter cannot be used in conjunction with the
     *        <code>DBClusterIdentifier</code> parameter. This value is stored
     *        as a lowercase string. </p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>Must be 1 to 255 alphanumeric characters</li>
     *        <li>First character must be a letter</li>
     *        <li>Cannot end with a hyphen or contain two consecutive hyphens</li>
     *        <li>If this is the identifier of an automated snapshot, the
     *        <code>SnapshotType</code> parameter must also be specified.</li>
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public DescribeDBClusterSnapshotsRequest withDBClusterSnapshotIdentifier(
            String dBClusterSnapshotIdentifier) {
        setDBClusterSnapshotIdentifier(dBClusterSnapshotIdentifier);
        return this;
    }

    /**
     * <p>
     * The type of DB cluster snapshots that will be returned. Values can be
     * <code>automated</code> or <code>manual</code>. If this parameter is not
     * specified, the returned results will include all snapshot types.
     * </p>
     * 
     * @param snapshotType
     *        The type of DB cluster snapshots that will be returned. Values can
     *        be <code>automated</code> or <code>manual</code>. If this
     *        parameter is not specified, the returned results will include all
     *        snapshot types.
     */

    public void setSnapshotType(String snapshotType) {
        this.snapshotType = snapshotType;
    }

    /**
     * <p>
     * The type of DB cluster snapshots that will be returned. Values can be
     * <code>automated</code> or <code>manual</code>. If this parameter is not
     * specified, the returned results will include all snapshot types.
     * </p>
     * 
     * @return The type of DB cluster snapshots that will be returned. Values
     *         can be <code>automated</code> or <code>manual</code>. If this
     *         parameter is not specified, the returned results will include all
     *         snapshot types.
     */

    public String getSnapshotType() {
        return this.snapshotType;
    }

    /**
     * <p>
     * The type of DB cluster snapshots that will be returned. Values can be
     * <code>automated</code> or <code>manual</code>. If this parameter is not
     * specified, the returned results will include all snapshot types.
     * </p>
     * 
     * @param snapshotType
     *        The type of DB cluster snapshots that will be returned. Values can
     *        be <code>automated</code> or <code>manual</code>. If this
     *        parameter is not specified, the returned results will include all
     *        snapshot types.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public DescribeDBClusterSnapshotsRequest withSnapshotType(
            String snapshotType) {
        setSnapshotType(snapshotType);
        return this;
    }

    /**
     * <p>
     * This parameter is not currently supported.
     * </p>
     * 
     * @return This parameter is not currently supported.
     */

    public java.util.List<Filter> getFilters() {
        if (filters == null) {
            filters = new com.amazonaws.internal.SdkInternalList<Filter>();
        }
        return filters;
    }

    /**
     * <p>
     * This parameter is not currently supported.
     * </p>
     * 
     * @param filters
     *        This parameter is not currently supported.
     */

    public void setFilters(java.util.Collection<Filter> filters) {
        if (filters == null) {
            this.filters = null;
            return;
        }

        this.filters = new com.amazonaws.internal.SdkInternalList<Filter>(
                filters);
    }

    /**
     * <p>
     * This parameter is not currently supported.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setFilters(java.util.Collection)} or
     * {@link #withFilters(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param filters
     *        This parameter is not currently supported.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public DescribeDBClusterSnapshotsRequest withFilters(Filter... filters) {
        if (this.filters == null) {
            setFilters(new com.amazonaws.internal.SdkInternalList<Filter>(
                    filters.length));
        }
        for (Filter ele : filters) {
            this.filters.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * This parameter is not currently supported.
     * </p>
     * 
     * @param filters
     *        This parameter is not currently supported.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public DescribeDBClusterSnapshotsRequest withFilters(
            java.util.Collection<Filter> filters) {
        setFilters(filters);
        return this;
    }

    /**
     * <p>
     * The maximum number of records to include in the response. If more records
     * exist than the specified <code>MaxRecords</code> value, a pagination
     * token called a marker is included in the response so that the remaining
     * results can be retrieved.
     * </p>
     * <p>
     * Default: 100
     * </p>
     * <p>
     * Constraints: Minimum 20, maximum 100.
     * </p>
     * 
     * @param maxRecords
     *        The maximum number of records to include in the response. If more
     *        records exist than the specified <code>MaxRecords</code> value, a
     *        pagination token called a marker is included in the response so
     *        that the remaining results can be retrieved. </p>
     *        <p>
     *        Default: 100
     *        </p>
     *        <p>
     *        Constraints: Minimum 20, maximum 100.
     */

    public void setMaxRecords(Integer maxRecords) {
        this.maxRecords = maxRecords;
    }

    /**
     * <p>
     * The maximum number of records to include in the response. If more records
     * exist than the specified <code>MaxRecords</code> value, a pagination
     * token called a marker is included in the response so that the remaining
     * results can be retrieved.
     * </p>
     * <p>
     * Default: 100
     * </p>
     * <p>
     * Constraints: Minimum 20, maximum 100.
     * </p>
     * 
     * @return The maximum number of records to include in the response. If more
     *         records exist than the specified <code>MaxRecords</code> value, a
     *         pagination token called a marker is included in the response so
     *         that the remaining results can be retrieved. </p>
     *         <p>
     *         Default: 100
     *         </p>
     *         <p>
     *         Constraints: Minimum 20, maximum 100.
     */

    public Integer getMaxRecords() {
        return this.maxRecords;
    }

    /**
     * <p>
     * The maximum number of records to include in the response. If more records
     * exist than the specified <code>MaxRecords</code> value, a pagination
     * token called a marker is included in the response so that the remaining
     * results can be retrieved.
     * </p>
     * <p>
     * Default: 100
     * </p>
     * <p>
     * Constraints: Minimum 20, maximum 100.
     * </p>
     * 
     * @param maxRecords
     *        The maximum number of records to include in the response. If more
     *        records exist than the specified <code>MaxRecords</code> value, a
     *        pagination token called a marker is included in the response so
     *        that the remaining results can be retrieved. </p>
     *        <p>
     *        Default: 100
     *        </p>
     *        <p>
     *        Constraints: Minimum 20, maximum 100.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public DescribeDBClusterSnapshotsRequest withMaxRecords(Integer maxRecords) {
        setMaxRecords(maxRecords);
        return this;
    }

    /**
     * <p>
     * An optional pagination token provided by a previous
     * <code>DescribeDBClusterSnapshots</code> request. If this parameter is
     * specified, the response includes only records beyond the marker, up to
     * the value specified by <code>MaxRecords</code>.
     * </p>
     * 
     * @param marker
     *        An optional pagination token provided by a previous
     *        <code>DescribeDBClusterSnapshots</code> request. If this parameter
     *        is specified, the response includes only records beyond the
     *        marker, up to the value specified by <code>MaxRecords</code>.
     */

    public void setMarker(String marker) {
        this.marker = marker;
    }

    /**
     * <p>
     * An optional pagination token provided by a previous
     * <code>DescribeDBClusterSnapshots</code> request. If this parameter is
     * specified, the response includes only records beyond the marker, up to
     * the value specified by <code>MaxRecords</code>.
     * </p>
     * 
     * @return An optional pagination token provided by a previous
     *         <code>DescribeDBClusterSnapshots</code> request. If this
     *         parameter is specified, the response includes only records beyond
     *         the marker, up to the value specified by <code>MaxRecords</code>.
     */

    public String getMarker() {
        return this.marker;
    }

    /**
     * <p>
     * An optional pagination token provided by a previous
     * <code>DescribeDBClusterSnapshots</code> request. If this parameter is
     * specified, the response includes only records beyond the marker, up to
     * the value specified by <code>MaxRecords</code>.
     * </p>
     * 
     * @param marker
     *        An optional pagination token provided by a previous
     *        <code>DescribeDBClusterSnapshots</code> request. If this parameter
     *        is specified, the response includes only records beyond the
     *        marker, up to the value specified by <code>MaxRecords</code>.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public DescribeDBClusterSnapshotsRequest withMarker(String marker) {
        setMarker(marker);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getDBClusterIdentifier() != null)
            sb.append("DBClusterIdentifier: " + getDBClusterIdentifier() + ",");
        if (getDBClusterSnapshotIdentifier() != null)
            sb.append("DBClusterSnapshotIdentifier: "
                    + getDBClusterSnapshotIdentifier() + ",");
        if (getSnapshotType() != null)
            sb.append("SnapshotType: " + getSnapshotType() + ",");
        if (getFilters() != null)
            sb.append("Filters: " + getFilters() + ",");
        if (getMaxRecords() != null)
            sb.append("MaxRecords: " + getMaxRecords() + ",");
        if (getMarker() != null)
            sb.append("Marker: " + getMarker());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeDBClusterSnapshotsRequest == false)
            return false;
        DescribeDBClusterSnapshotsRequest other = (DescribeDBClusterSnapshotsRequest) obj;
        if (other.getDBClusterIdentifier() == null
                ^ this.getDBClusterIdentifier() == null)
            return false;
        if (other.getDBClusterIdentifier() != null
                && other.getDBClusterIdentifier().equals(
                        this.getDBClusterIdentifier()) == false)
            return false;
        if (other.getDBClusterSnapshotIdentifier() == null
                ^ this.getDBClusterSnapshotIdentifier() == null)
            return false;
        if (other.getDBClusterSnapshotIdentifier() != null
                && other.getDBClusterSnapshotIdentifier().equals(
                        this.getDBClusterSnapshotIdentifier()) == false)
            return false;
        if (other.getSnapshotType() == null ^ this.getSnapshotType() == null)
            return false;
        if (other.getSnapshotType() != null
                && other.getSnapshotType().equals(this.getSnapshotType()) == false)
            return false;
        if (other.getFilters() == null ^ this.getFilters() == null)
            return false;
        if (other.getFilters() != null
                && other.getFilters().equals(this.getFilters()) == false)
            return false;
        if (other.getMaxRecords() == null ^ this.getMaxRecords() == null)
            return false;
        if (other.getMaxRecords() != null
                && other.getMaxRecords().equals(this.getMaxRecords()) == false)
            return false;
        if (other.getMarker() == null ^ this.getMarker() == null)
            return false;
        if (other.getMarker() != null
                && other.getMarker().equals(this.getMarker()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getDBClusterIdentifier() == null) ? 0
                        : getDBClusterIdentifier().hashCode());
        hashCode = prime
                * hashCode
                + ((getDBClusterSnapshotIdentifier() == null) ? 0
                        : getDBClusterSnapshotIdentifier().hashCode());
        hashCode = prime
                * hashCode
                + ((getSnapshotType() == null) ? 0 : getSnapshotType()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getFilters() == null) ? 0 : getFilters().hashCode());
        hashCode = prime * hashCode
                + ((getMaxRecords() == null) ? 0 : getMaxRecords().hashCode());
        hashCode = prime * hashCode
                + ((getMarker() == null) ? 0 : getMarker().hashCode());
        return hashCode;
    }

    @Override
    public DescribeDBClusterSnapshotsRequest clone() {
        return (DescribeDBClusterSnapshotsRequest) super.clone();
    }
}