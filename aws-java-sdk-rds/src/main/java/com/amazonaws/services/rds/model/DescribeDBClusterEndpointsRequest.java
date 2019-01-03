/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/DescribeDBClusterEndpoints" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeDBClusterEndpointsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The DB cluster identifier of the DB cluster associated with the endpoint. This parameter is stored as a lowercase
     * string.
     * </p>
     */
    private String dBClusterIdentifier;
    /**
     * <p>
     * The identifier of the endpoint to describe. This parameter is stored as a lowercase string.
     * </p>
     */
    private String dBClusterEndpointIdentifier;
    /**
     * <p>
     * A set of name-value pairs that define which endpoints to include in the output. The filters are specified as
     * name-value pairs, in the format
     * <code>Name=<i>endpoint_type</i>,Values=<i>endpoint_type1</i>,<i>endpoint_type2</i>,...</code>. <code>Name</code>
     * can be one of: <code>db-cluster-endpoint-type</code>, <code>db-cluster-endpoint-custom-type</code>,
     * <code>db-cluster-endpoint-id</code>, <code>db-cluster-endpoint-status</code>. <code>Values</code> for the
     * <code> db-cluster-endpoint-type</code> filter can be one or more of: <code>reader</code>, <code>writer</code>,
     * <code>custom</code>. <code>Values</code> for the <code>db-cluster-endpoint-custom-type</code> filter can be one
     * or more of: <code>reader</code>, <code>any</code>. <code>Values</code> for the
     * <code>db-cluster-endpoint-status</code> filter can be one or more of: <code>available</code>,
     * <code>creating</code>, <code>deleting</code>, <code>modifying</code>.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Filter> filters;
    /**
     * <p>
     * The maximum number of records to include in the response. If more records exist than the specified
     * <code>MaxRecords</code> value, a pagination token called a marker is included in the response so that the
     * remaining results can be retrieved.
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
     * An optional pagination token provided by a previous <a>DescribeDBClusterEndpoints</a> request. If this parameter
     * is specified, the response includes only records beyond the marker, up to the value specified by
     * <code>MaxRecords</code>.
     * </p>
     */
    private String marker;

    /**
     * <p>
     * The DB cluster identifier of the DB cluster associated with the endpoint. This parameter is stored as a lowercase
     * string.
     * </p>
     * 
     * @param dBClusterIdentifier
     *        The DB cluster identifier of the DB cluster associated with the endpoint. This parameter is stored as a
     *        lowercase string.
     */

    public void setDBClusterIdentifier(String dBClusterIdentifier) {
        this.dBClusterIdentifier = dBClusterIdentifier;
    }

    /**
     * <p>
     * The DB cluster identifier of the DB cluster associated with the endpoint. This parameter is stored as a lowercase
     * string.
     * </p>
     * 
     * @return The DB cluster identifier of the DB cluster associated with the endpoint. This parameter is stored as a
     *         lowercase string.
     */

    public String getDBClusterIdentifier() {
        return this.dBClusterIdentifier;
    }

    /**
     * <p>
     * The DB cluster identifier of the DB cluster associated with the endpoint. This parameter is stored as a lowercase
     * string.
     * </p>
     * 
     * @param dBClusterIdentifier
     *        The DB cluster identifier of the DB cluster associated with the endpoint. This parameter is stored as a
     *        lowercase string.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDBClusterEndpointsRequest withDBClusterIdentifier(String dBClusterIdentifier) {
        setDBClusterIdentifier(dBClusterIdentifier);
        return this;
    }

    /**
     * <p>
     * The identifier of the endpoint to describe. This parameter is stored as a lowercase string.
     * </p>
     * 
     * @param dBClusterEndpointIdentifier
     *        The identifier of the endpoint to describe. This parameter is stored as a lowercase string.
     */

    public void setDBClusterEndpointIdentifier(String dBClusterEndpointIdentifier) {
        this.dBClusterEndpointIdentifier = dBClusterEndpointIdentifier;
    }

    /**
     * <p>
     * The identifier of the endpoint to describe. This parameter is stored as a lowercase string.
     * </p>
     * 
     * @return The identifier of the endpoint to describe. This parameter is stored as a lowercase string.
     */

    public String getDBClusterEndpointIdentifier() {
        return this.dBClusterEndpointIdentifier;
    }

    /**
     * <p>
     * The identifier of the endpoint to describe. This parameter is stored as a lowercase string.
     * </p>
     * 
     * @param dBClusterEndpointIdentifier
     *        The identifier of the endpoint to describe. This parameter is stored as a lowercase string.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDBClusterEndpointsRequest withDBClusterEndpointIdentifier(String dBClusterEndpointIdentifier) {
        setDBClusterEndpointIdentifier(dBClusterEndpointIdentifier);
        return this;
    }

    /**
     * <p>
     * A set of name-value pairs that define which endpoints to include in the output. The filters are specified as
     * name-value pairs, in the format
     * <code>Name=<i>endpoint_type</i>,Values=<i>endpoint_type1</i>,<i>endpoint_type2</i>,...</code>. <code>Name</code>
     * can be one of: <code>db-cluster-endpoint-type</code>, <code>db-cluster-endpoint-custom-type</code>,
     * <code>db-cluster-endpoint-id</code>, <code>db-cluster-endpoint-status</code>. <code>Values</code> for the
     * <code> db-cluster-endpoint-type</code> filter can be one or more of: <code>reader</code>, <code>writer</code>,
     * <code>custom</code>. <code>Values</code> for the <code>db-cluster-endpoint-custom-type</code> filter can be one
     * or more of: <code>reader</code>, <code>any</code>. <code>Values</code> for the
     * <code>db-cluster-endpoint-status</code> filter can be one or more of: <code>available</code>,
     * <code>creating</code>, <code>deleting</code>, <code>modifying</code>.
     * </p>
     * 
     * @return A set of name-value pairs that define which endpoints to include in the output. The filters are specified
     *         as name-value pairs, in the format
     *         <code>Name=<i>endpoint_type</i>,Values=<i>endpoint_type1</i>,<i>endpoint_type2</i>,...</code>.
     *         <code>Name</code> can be one of: <code>db-cluster-endpoint-type</code>,
     *         <code>db-cluster-endpoint-custom-type</code>, <code>db-cluster-endpoint-id</code>,
     *         <code>db-cluster-endpoint-status</code>. <code>Values</code> for the
     *         <code> db-cluster-endpoint-type</code> filter can be one or more of: <code>reader</code>,
     *         <code>writer</code>, <code>custom</code>. <code>Values</code> for the
     *         <code>db-cluster-endpoint-custom-type</code> filter can be one or more of: <code>reader</code>,
     *         <code>any</code>. <code>Values</code> for the <code>db-cluster-endpoint-status</code> filter can be one
     *         or more of: <code>available</code>, <code>creating</code>, <code>deleting</code>, <code>modifying</code>.
     */

    public java.util.List<Filter> getFilters() {
        if (filters == null) {
            filters = new com.amazonaws.internal.SdkInternalList<Filter>();
        }
        return filters;
    }

    /**
     * <p>
     * A set of name-value pairs that define which endpoints to include in the output. The filters are specified as
     * name-value pairs, in the format
     * <code>Name=<i>endpoint_type</i>,Values=<i>endpoint_type1</i>,<i>endpoint_type2</i>,...</code>. <code>Name</code>
     * can be one of: <code>db-cluster-endpoint-type</code>, <code>db-cluster-endpoint-custom-type</code>,
     * <code>db-cluster-endpoint-id</code>, <code>db-cluster-endpoint-status</code>. <code>Values</code> for the
     * <code> db-cluster-endpoint-type</code> filter can be one or more of: <code>reader</code>, <code>writer</code>,
     * <code>custom</code>. <code>Values</code> for the <code>db-cluster-endpoint-custom-type</code> filter can be one
     * or more of: <code>reader</code>, <code>any</code>. <code>Values</code> for the
     * <code>db-cluster-endpoint-status</code> filter can be one or more of: <code>available</code>,
     * <code>creating</code>, <code>deleting</code>, <code>modifying</code>.
     * </p>
     * 
     * @param filters
     *        A set of name-value pairs that define which endpoints to include in the output. The filters are specified
     *        as name-value pairs, in the format
     *        <code>Name=<i>endpoint_type</i>,Values=<i>endpoint_type1</i>,<i>endpoint_type2</i>,...</code>.
     *        <code>Name</code> can be one of: <code>db-cluster-endpoint-type</code>,
     *        <code>db-cluster-endpoint-custom-type</code>, <code>db-cluster-endpoint-id</code>,
     *        <code>db-cluster-endpoint-status</code>. <code>Values</code> for the
     *        <code> db-cluster-endpoint-type</code> filter can be one or more of: <code>reader</code>,
     *        <code>writer</code>, <code>custom</code>. <code>Values</code> for the
     *        <code>db-cluster-endpoint-custom-type</code> filter can be one or more of: <code>reader</code>,
     *        <code>any</code>. <code>Values</code> for the <code>db-cluster-endpoint-status</code> filter can be one or
     *        more of: <code>available</code>, <code>creating</code>, <code>deleting</code>, <code>modifying</code>.
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
     * A set of name-value pairs that define which endpoints to include in the output. The filters are specified as
     * name-value pairs, in the format
     * <code>Name=<i>endpoint_type</i>,Values=<i>endpoint_type1</i>,<i>endpoint_type2</i>,...</code>. <code>Name</code>
     * can be one of: <code>db-cluster-endpoint-type</code>, <code>db-cluster-endpoint-custom-type</code>,
     * <code>db-cluster-endpoint-id</code>, <code>db-cluster-endpoint-status</code>. <code>Values</code> for the
     * <code> db-cluster-endpoint-type</code> filter can be one or more of: <code>reader</code>, <code>writer</code>,
     * <code>custom</code>. <code>Values</code> for the <code>db-cluster-endpoint-custom-type</code> filter can be one
     * or more of: <code>reader</code>, <code>any</code>. <code>Values</code> for the
     * <code>db-cluster-endpoint-status</code> filter can be one or more of: <code>available</code>,
     * <code>creating</code>, <code>deleting</code>, <code>modifying</code>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFilters(java.util.Collection)} or {@link #withFilters(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param filters
     *        A set of name-value pairs that define which endpoints to include in the output. The filters are specified
     *        as name-value pairs, in the format
     *        <code>Name=<i>endpoint_type</i>,Values=<i>endpoint_type1</i>,<i>endpoint_type2</i>,...</code>.
     *        <code>Name</code> can be one of: <code>db-cluster-endpoint-type</code>,
     *        <code>db-cluster-endpoint-custom-type</code>, <code>db-cluster-endpoint-id</code>,
     *        <code>db-cluster-endpoint-status</code>. <code>Values</code> for the
     *        <code> db-cluster-endpoint-type</code> filter can be one or more of: <code>reader</code>,
     *        <code>writer</code>, <code>custom</code>. <code>Values</code> for the
     *        <code>db-cluster-endpoint-custom-type</code> filter can be one or more of: <code>reader</code>,
     *        <code>any</code>. <code>Values</code> for the <code>db-cluster-endpoint-status</code> filter can be one or
     *        more of: <code>available</code>, <code>creating</code>, <code>deleting</code>, <code>modifying</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDBClusterEndpointsRequest withFilters(Filter... filters) {
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
     * A set of name-value pairs that define which endpoints to include in the output. The filters are specified as
     * name-value pairs, in the format
     * <code>Name=<i>endpoint_type</i>,Values=<i>endpoint_type1</i>,<i>endpoint_type2</i>,...</code>. <code>Name</code>
     * can be one of: <code>db-cluster-endpoint-type</code>, <code>db-cluster-endpoint-custom-type</code>,
     * <code>db-cluster-endpoint-id</code>, <code>db-cluster-endpoint-status</code>. <code>Values</code> for the
     * <code> db-cluster-endpoint-type</code> filter can be one or more of: <code>reader</code>, <code>writer</code>,
     * <code>custom</code>. <code>Values</code> for the <code>db-cluster-endpoint-custom-type</code> filter can be one
     * or more of: <code>reader</code>, <code>any</code>. <code>Values</code> for the
     * <code>db-cluster-endpoint-status</code> filter can be one or more of: <code>available</code>,
     * <code>creating</code>, <code>deleting</code>, <code>modifying</code>.
     * </p>
     * 
     * @param filters
     *        A set of name-value pairs that define which endpoints to include in the output. The filters are specified
     *        as name-value pairs, in the format
     *        <code>Name=<i>endpoint_type</i>,Values=<i>endpoint_type1</i>,<i>endpoint_type2</i>,...</code>.
     *        <code>Name</code> can be one of: <code>db-cluster-endpoint-type</code>,
     *        <code>db-cluster-endpoint-custom-type</code>, <code>db-cluster-endpoint-id</code>,
     *        <code>db-cluster-endpoint-status</code>. <code>Values</code> for the
     *        <code> db-cluster-endpoint-type</code> filter can be one or more of: <code>reader</code>,
     *        <code>writer</code>, <code>custom</code>. <code>Values</code> for the
     *        <code>db-cluster-endpoint-custom-type</code> filter can be one or more of: <code>reader</code>,
     *        <code>any</code>. <code>Values</code> for the <code>db-cluster-endpoint-status</code> filter can be one or
     *        more of: <code>available</code>, <code>creating</code>, <code>deleting</code>, <code>modifying</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDBClusterEndpointsRequest withFilters(java.util.Collection<Filter> filters) {
        setFilters(filters);
        return this;
    }

    /**
     * <p>
     * The maximum number of records to include in the response. If more records exist than the specified
     * <code>MaxRecords</code> value, a pagination token called a marker is included in the response so that the
     * remaining results can be retrieved.
     * </p>
     * <p>
     * Default: 100
     * </p>
     * <p>
     * Constraints: Minimum 20, maximum 100.
     * </p>
     * 
     * @param maxRecords
     *        The maximum number of records to include in the response. If more records exist than the specified
     *        <code>MaxRecords</code> value, a pagination token called a marker is included in the response so that the
     *        remaining results can be retrieved. </p>
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
     * The maximum number of records to include in the response. If more records exist than the specified
     * <code>MaxRecords</code> value, a pagination token called a marker is included in the response so that the
     * remaining results can be retrieved.
     * </p>
     * <p>
     * Default: 100
     * </p>
     * <p>
     * Constraints: Minimum 20, maximum 100.
     * </p>
     * 
     * @return The maximum number of records to include in the response. If more records exist than the specified
     *         <code>MaxRecords</code> value, a pagination token called a marker is included in the response so that the
     *         remaining results can be retrieved. </p>
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
     * The maximum number of records to include in the response. If more records exist than the specified
     * <code>MaxRecords</code> value, a pagination token called a marker is included in the response so that the
     * remaining results can be retrieved.
     * </p>
     * <p>
     * Default: 100
     * </p>
     * <p>
     * Constraints: Minimum 20, maximum 100.
     * </p>
     * 
     * @param maxRecords
     *        The maximum number of records to include in the response. If more records exist than the specified
     *        <code>MaxRecords</code> value, a pagination token called a marker is included in the response so that the
     *        remaining results can be retrieved. </p>
     *        <p>
     *        Default: 100
     *        </p>
     *        <p>
     *        Constraints: Minimum 20, maximum 100.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDBClusterEndpointsRequest withMaxRecords(Integer maxRecords) {
        setMaxRecords(maxRecords);
        return this;
    }

    /**
     * <p>
     * An optional pagination token provided by a previous <a>DescribeDBClusterEndpoints</a> request. If this parameter
     * is specified, the response includes only records beyond the marker, up to the value specified by
     * <code>MaxRecords</code>.
     * </p>
     * 
     * @param marker
     *        An optional pagination token provided by a previous <a>DescribeDBClusterEndpoints</a> request. If this
     *        parameter is specified, the response includes only records beyond the marker, up to the value specified by
     *        <code>MaxRecords</code>.
     */

    public void setMarker(String marker) {
        this.marker = marker;
    }

    /**
     * <p>
     * An optional pagination token provided by a previous <a>DescribeDBClusterEndpoints</a> request. If this parameter
     * is specified, the response includes only records beyond the marker, up to the value specified by
     * <code>MaxRecords</code>.
     * </p>
     * 
     * @return An optional pagination token provided by a previous <a>DescribeDBClusterEndpoints</a> request. If this
     *         parameter is specified, the response includes only records beyond the marker, up to the value specified
     *         by <code>MaxRecords</code>.
     */

    public String getMarker() {
        return this.marker;
    }

    /**
     * <p>
     * An optional pagination token provided by a previous <a>DescribeDBClusterEndpoints</a> request. If this parameter
     * is specified, the response includes only records beyond the marker, up to the value specified by
     * <code>MaxRecords</code>.
     * </p>
     * 
     * @param marker
     *        An optional pagination token provided by a previous <a>DescribeDBClusterEndpoints</a> request. If this
     *        parameter is specified, the response includes only records beyond the marker, up to the value specified by
     *        <code>MaxRecords</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDBClusterEndpointsRequest withMarker(String marker) {
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
        if (getDBClusterIdentifier() != null)
            sb.append("DBClusterIdentifier: ").append(getDBClusterIdentifier()).append(",");
        if (getDBClusterEndpointIdentifier() != null)
            sb.append("DBClusterEndpointIdentifier: ").append(getDBClusterEndpointIdentifier()).append(",");
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

        if (obj instanceof DescribeDBClusterEndpointsRequest == false)
            return false;
        DescribeDBClusterEndpointsRequest other = (DescribeDBClusterEndpointsRequest) obj;
        if (other.getDBClusterIdentifier() == null ^ this.getDBClusterIdentifier() == null)
            return false;
        if (other.getDBClusterIdentifier() != null && other.getDBClusterIdentifier().equals(this.getDBClusterIdentifier()) == false)
            return false;
        if (other.getDBClusterEndpointIdentifier() == null ^ this.getDBClusterEndpointIdentifier() == null)
            return false;
        if (other.getDBClusterEndpointIdentifier() != null && other.getDBClusterEndpointIdentifier().equals(this.getDBClusterEndpointIdentifier()) == false)
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

        hashCode = prime * hashCode + ((getDBClusterIdentifier() == null) ? 0 : getDBClusterIdentifier().hashCode());
        hashCode = prime * hashCode + ((getDBClusterEndpointIdentifier() == null) ? 0 : getDBClusterEndpointIdentifier().hashCode());
        hashCode = prime * hashCode + ((getFilters() == null) ? 0 : getFilters().hashCode());
        hashCode = prime * hashCode + ((getMaxRecords() == null) ? 0 : getMaxRecords().hashCode());
        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode());
        return hashCode;
    }

    @Override
    public DescribeDBClusterEndpointsRequest clone() {
        return (DescribeDBClusterEndpointsRequest) super.clone();
    }

}
