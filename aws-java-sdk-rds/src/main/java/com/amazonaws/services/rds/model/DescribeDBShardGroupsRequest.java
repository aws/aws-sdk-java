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
package com.amazonaws.services.rds.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/DescribeDBShardGroups" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeDBShardGroupsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The user-supplied DB shard group identifier or the Amazon Resource Name (ARN) of the DB shard group. If this
     * parameter is specified, information for only the specific DB shard group is returned. This parameter isn't
     * case-sensitive.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If supplied, must match an existing DB shard group identifier.
     * </p>
     * </li>
     * </ul>
     */
    private String dBShardGroupIdentifier;
    /**
     * <p>
     * A filter that specifies one or more DB shard groups to describe.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Filter> filters;
    /**
     * <p>
     * An optional pagination token provided by a previous <code>DescribeDBShardGroups</code> request. If this parameter
     * is specified, the response includes only records beyond the marker, up to the value specified by
     * <code>MaxRecords</code>.
     * </p>
     */
    private String marker;
    /**
     * <p>
     * The maximum number of records to include in the response. If more records exist than the specified
     * <code>MaxRecords</code> value, a pagination token called a marker is included in the response so you can retrieve
     * the remaining results.
     * </p>
     * <p>
     * Default: 100
     * </p>
     * <p>
     * Constraints: Minimum 20, maximum 100
     * </p>
     */
    private Integer maxRecords;

    /**
     * <p>
     * The user-supplied DB shard group identifier or the Amazon Resource Name (ARN) of the DB shard group. If this
     * parameter is specified, information for only the specific DB shard group is returned. This parameter isn't
     * case-sensitive.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If supplied, must match an existing DB shard group identifier.
     * </p>
     * </li>
     * </ul>
     * 
     * @param dBShardGroupIdentifier
     *        The user-supplied DB shard group identifier or the Amazon Resource Name (ARN) of the DB shard group. If
     *        this parameter is specified, information for only the specific DB shard group is returned. This parameter
     *        isn't case-sensitive.</p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        If supplied, must match an existing DB shard group identifier.
     *        </p>
     *        </li>
     */

    public void setDBShardGroupIdentifier(String dBShardGroupIdentifier) {
        this.dBShardGroupIdentifier = dBShardGroupIdentifier;
    }

    /**
     * <p>
     * The user-supplied DB shard group identifier or the Amazon Resource Name (ARN) of the DB shard group. If this
     * parameter is specified, information for only the specific DB shard group is returned. This parameter isn't
     * case-sensitive.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If supplied, must match an existing DB shard group identifier.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The user-supplied DB shard group identifier or the Amazon Resource Name (ARN) of the DB shard group. If
     *         this parameter is specified, information for only the specific DB shard group is returned. This parameter
     *         isn't case-sensitive.</p>
     *         <p>
     *         Constraints:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         If supplied, must match an existing DB shard group identifier.
     *         </p>
     *         </li>
     */

    public String getDBShardGroupIdentifier() {
        return this.dBShardGroupIdentifier;
    }

    /**
     * <p>
     * The user-supplied DB shard group identifier or the Amazon Resource Name (ARN) of the DB shard group. If this
     * parameter is specified, information for only the specific DB shard group is returned. This parameter isn't
     * case-sensitive.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If supplied, must match an existing DB shard group identifier.
     * </p>
     * </li>
     * </ul>
     * 
     * @param dBShardGroupIdentifier
     *        The user-supplied DB shard group identifier or the Amazon Resource Name (ARN) of the DB shard group. If
     *        this parameter is specified, information for only the specific DB shard group is returned. This parameter
     *        isn't case-sensitive.</p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        If supplied, must match an existing DB shard group identifier.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDBShardGroupsRequest withDBShardGroupIdentifier(String dBShardGroupIdentifier) {
        setDBShardGroupIdentifier(dBShardGroupIdentifier);
        return this;
    }

    /**
     * <p>
     * A filter that specifies one or more DB shard groups to describe.
     * </p>
     * 
     * @return A filter that specifies one or more DB shard groups to describe.
     */

    public java.util.List<Filter> getFilters() {
        if (filters == null) {
            filters = new com.amazonaws.internal.SdkInternalList<Filter>();
        }
        return filters;
    }

    /**
     * <p>
     * A filter that specifies one or more DB shard groups to describe.
     * </p>
     * 
     * @param filters
     *        A filter that specifies one or more DB shard groups to describe.
     */

    public void setFilters(java.util.Collection<Filter> filters) {
        if (filters == null) {
            this.filters = null;
            return;
        }

        this.filters = new com.amazonaws.internal.SdkInternalList<Filter>(filters);
    }

    /**
     * <p>
     * A filter that specifies one or more DB shard groups to describe.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFilters(java.util.Collection)} or {@link #withFilters(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param filters
     *        A filter that specifies one or more DB shard groups to describe.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDBShardGroupsRequest withFilters(Filter... filters) {
        if (this.filters == null) {
            setFilters(new com.amazonaws.internal.SdkInternalList<Filter>(filters.length));
        }
        for (Filter ele : filters) {
            this.filters.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A filter that specifies one or more DB shard groups to describe.
     * </p>
     * 
     * @param filters
     *        A filter that specifies one or more DB shard groups to describe.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDBShardGroupsRequest withFilters(java.util.Collection<Filter> filters) {
        setFilters(filters);
        return this;
    }

    /**
     * <p>
     * An optional pagination token provided by a previous <code>DescribeDBShardGroups</code> request. If this parameter
     * is specified, the response includes only records beyond the marker, up to the value specified by
     * <code>MaxRecords</code>.
     * </p>
     * 
     * @param marker
     *        An optional pagination token provided by a previous <code>DescribeDBShardGroups</code> request. If this
     *        parameter is specified, the response includes only records beyond the marker, up to the value specified by
     *        <code>MaxRecords</code>.
     */

    public void setMarker(String marker) {
        this.marker = marker;
    }

    /**
     * <p>
     * An optional pagination token provided by a previous <code>DescribeDBShardGroups</code> request. If this parameter
     * is specified, the response includes only records beyond the marker, up to the value specified by
     * <code>MaxRecords</code>.
     * </p>
     * 
     * @return An optional pagination token provided by a previous <code>DescribeDBShardGroups</code> request. If this
     *         parameter is specified, the response includes only records beyond the marker, up to the value specified
     *         by <code>MaxRecords</code>.
     */

    public String getMarker() {
        return this.marker;
    }

    /**
     * <p>
     * An optional pagination token provided by a previous <code>DescribeDBShardGroups</code> request. If this parameter
     * is specified, the response includes only records beyond the marker, up to the value specified by
     * <code>MaxRecords</code>.
     * </p>
     * 
     * @param marker
     *        An optional pagination token provided by a previous <code>DescribeDBShardGroups</code> request. If this
     *        parameter is specified, the response includes only records beyond the marker, up to the value specified by
     *        <code>MaxRecords</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDBShardGroupsRequest withMarker(String marker) {
        setMarker(marker);
        return this;
    }

    /**
     * <p>
     * The maximum number of records to include in the response. If more records exist than the specified
     * <code>MaxRecords</code> value, a pagination token called a marker is included in the response so you can retrieve
     * the remaining results.
     * </p>
     * <p>
     * Default: 100
     * </p>
     * <p>
     * Constraints: Minimum 20, maximum 100
     * </p>
     * 
     * @param maxRecords
     *        The maximum number of records to include in the response. If more records exist than the specified
     *        <code>MaxRecords</code> value, a pagination token called a marker is included in the response so you can
     *        retrieve the remaining results.</p>
     *        <p>
     *        Default: 100
     *        </p>
     *        <p>
     *        Constraints: Minimum 20, maximum 100
     */

    public void setMaxRecords(Integer maxRecords) {
        this.maxRecords = maxRecords;
    }

    /**
     * <p>
     * The maximum number of records to include in the response. If more records exist than the specified
     * <code>MaxRecords</code> value, a pagination token called a marker is included in the response so you can retrieve
     * the remaining results.
     * </p>
     * <p>
     * Default: 100
     * </p>
     * <p>
     * Constraints: Minimum 20, maximum 100
     * </p>
     * 
     * @return The maximum number of records to include in the response. If more records exist than the specified
     *         <code>MaxRecords</code> value, a pagination token called a marker is included in the response so you can
     *         retrieve the remaining results.</p>
     *         <p>
     *         Default: 100
     *         </p>
     *         <p>
     *         Constraints: Minimum 20, maximum 100
     */

    public Integer getMaxRecords() {
        return this.maxRecords;
    }

    /**
     * <p>
     * The maximum number of records to include in the response. If more records exist than the specified
     * <code>MaxRecords</code> value, a pagination token called a marker is included in the response so you can retrieve
     * the remaining results.
     * </p>
     * <p>
     * Default: 100
     * </p>
     * <p>
     * Constraints: Minimum 20, maximum 100
     * </p>
     * 
     * @param maxRecords
     *        The maximum number of records to include in the response. If more records exist than the specified
     *        <code>MaxRecords</code> value, a pagination token called a marker is included in the response so you can
     *        retrieve the remaining results.</p>
     *        <p>
     *        Default: 100
     *        </p>
     *        <p>
     *        Constraints: Minimum 20, maximum 100
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDBShardGroupsRequest withMaxRecords(Integer maxRecords) {
        setMaxRecords(maxRecords);
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
        if (getDBShardGroupIdentifier() != null)
            sb.append("DBShardGroupIdentifier: ").append(getDBShardGroupIdentifier()).append(",");
        if (getFilters() != null)
            sb.append("Filters: ").append(getFilters()).append(",");
        if (getMarker() != null)
            sb.append("Marker: ").append(getMarker()).append(",");
        if (getMaxRecords() != null)
            sb.append("MaxRecords: ").append(getMaxRecords());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeDBShardGroupsRequest == false)
            return false;
        DescribeDBShardGroupsRequest other = (DescribeDBShardGroupsRequest) obj;
        if (other.getDBShardGroupIdentifier() == null ^ this.getDBShardGroupIdentifier() == null)
            return false;
        if (other.getDBShardGroupIdentifier() != null && other.getDBShardGroupIdentifier().equals(this.getDBShardGroupIdentifier()) == false)
            return false;
        if (other.getFilters() == null ^ this.getFilters() == null)
            return false;
        if (other.getFilters() != null && other.getFilters().equals(this.getFilters()) == false)
            return false;
        if (other.getMarker() == null ^ this.getMarker() == null)
            return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false)
            return false;
        if (other.getMaxRecords() == null ^ this.getMaxRecords() == null)
            return false;
        if (other.getMaxRecords() != null && other.getMaxRecords().equals(this.getMaxRecords()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDBShardGroupIdentifier() == null) ? 0 : getDBShardGroupIdentifier().hashCode());
        hashCode = prime * hashCode + ((getFilters() == null) ? 0 : getFilters().hashCode());
        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode());
        hashCode = prime * hashCode + ((getMaxRecords() == null) ? 0 : getMaxRecords().hashCode());
        return hashCode;
    }

    @Override
    public DescribeDBShardGroupsRequest clone() {
        return (DescribeDBShardGroupsRequest) super.clone();
    }

}
