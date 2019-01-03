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
 * <p/>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/DescribeReservedDBInstances" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeReservedDBInstancesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The reserved DB instance identifier filter value. Specify this parameter to show only the reservation that
     * matches the specified reservation ID.
     * </p>
     */
    private String reservedDBInstanceId;
    /**
     * <p>
     * The offering identifier filter value. Specify this parameter to show only purchased reservations matching the
     * specified offering identifier.
     * </p>
     */
    private String reservedDBInstancesOfferingId;
    /**
     * <p>
     * The DB instance class filter value. Specify this parameter to show only those reservations matching the specified
     * DB instances class.
     * </p>
     */
    private String dBInstanceClass;
    /**
     * <p>
     * The duration filter value, specified in years or seconds. Specify this parameter to show only reservations for
     * this duration.
     * </p>
     * <p>
     * Valid Values: <code>1 | 3 | 31536000 | 94608000</code>
     * </p>
     */
    private String duration;
    /**
     * <p>
     * The product description filter value. Specify this parameter to show only those reservations matching the
     * specified product description.
     * </p>
     */
    private String productDescription;
    /**
     * <p>
     * The offering type filter value. Specify this parameter to show only the available offerings matching the
     * specified offering type.
     * </p>
     * <p>
     * Valid Values: <code>"Partial Upfront" | "All Upfront" | "No Upfront" </code>
     * </p>
     */
    private String offeringType;
    /**
     * <p>
     * The Multi-AZ filter value. Specify this parameter to show only those reservations matching the specified Multi-AZ
     * parameter.
     * </p>
     */
    private Boolean multiAZ;
    /**
     * <p>
     * This parameter is not currently supported.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Filter> filters;
    /**
     * <p>
     * The maximum number of records to include in the response. If more than the <code>MaxRecords</code> value is
     * available, a pagination token called a marker is included in the response so that the following results can be
     * retrieved.
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
     * An optional pagination token provided by a previous request. If this parameter is specified, the response
     * includes only records beyond the marker, up to the value specified by <code>MaxRecords</code>.
     * </p>
     */
    private String marker;

    /**
     * <p>
     * The reserved DB instance identifier filter value. Specify this parameter to show only the reservation that
     * matches the specified reservation ID.
     * </p>
     * 
     * @param reservedDBInstanceId
     *        The reserved DB instance identifier filter value. Specify this parameter to show only the reservation that
     *        matches the specified reservation ID.
     */

    public void setReservedDBInstanceId(String reservedDBInstanceId) {
        this.reservedDBInstanceId = reservedDBInstanceId;
    }

    /**
     * <p>
     * The reserved DB instance identifier filter value. Specify this parameter to show only the reservation that
     * matches the specified reservation ID.
     * </p>
     * 
     * @return The reserved DB instance identifier filter value. Specify this parameter to show only the reservation
     *         that matches the specified reservation ID.
     */

    public String getReservedDBInstanceId() {
        return this.reservedDBInstanceId;
    }

    /**
     * <p>
     * The reserved DB instance identifier filter value. Specify this parameter to show only the reservation that
     * matches the specified reservation ID.
     * </p>
     * 
     * @param reservedDBInstanceId
     *        The reserved DB instance identifier filter value. Specify this parameter to show only the reservation that
     *        matches the specified reservation ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeReservedDBInstancesRequest withReservedDBInstanceId(String reservedDBInstanceId) {
        setReservedDBInstanceId(reservedDBInstanceId);
        return this;
    }

    /**
     * <p>
     * The offering identifier filter value. Specify this parameter to show only purchased reservations matching the
     * specified offering identifier.
     * </p>
     * 
     * @param reservedDBInstancesOfferingId
     *        The offering identifier filter value. Specify this parameter to show only purchased reservations matching
     *        the specified offering identifier.
     */

    public void setReservedDBInstancesOfferingId(String reservedDBInstancesOfferingId) {
        this.reservedDBInstancesOfferingId = reservedDBInstancesOfferingId;
    }

    /**
     * <p>
     * The offering identifier filter value. Specify this parameter to show only purchased reservations matching the
     * specified offering identifier.
     * </p>
     * 
     * @return The offering identifier filter value. Specify this parameter to show only purchased reservations matching
     *         the specified offering identifier.
     */

    public String getReservedDBInstancesOfferingId() {
        return this.reservedDBInstancesOfferingId;
    }

    /**
     * <p>
     * The offering identifier filter value. Specify this parameter to show only purchased reservations matching the
     * specified offering identifier.
     * </p>
     * 
     * @param reservedDBInstancesOfferingId
     *        The offering identifier filter value. Specify this parameter to show only purchased reservations matching
     *        the specified offering identifier.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeReservedDBInstancesRequest withReservedDBInstancesOfferingId(String reservedDBInstancesOfferingId) {
        setReservedDBInstancesOfferingId(reservedDBInstancesOfferingId);
        return this;
    }

    /**
     * <p>
     * The DB instance class filter value. Specify this parameter to show only those reservations matching the specified
     * DB instances class.
     * </p>
     * 
     * @param dBInstanceClass
     *        The DB instance class filter value. Specify this parameter to show only those reservations matching the
     *        specified DB instances class.
     */

    public void setDBInstanceClass(String dBInstanceClass) {
        this.dBInstanceClass = dBInstanceClass;
    }

    /**
     * <p>
     * The DB instance class filter value. Specify this parameter to show only those reservations matching the specified
     * DB instances class.
     * </p>
     * 
     * @return The DB instance class filter value. Specify this parameter to show only those reservations matching the
     *         specified DB instances class.
     */

    public String getDBInstanceClass() {
        return this.dBInstanceClass;
    }

    /**
     * <p>
     * The DB instance class filter value. Specify this parameter to show only those reservations matching the specified
     * DB instances class.
     * </p>
     * 
     * @param dBInstanceClass
     *        The DB instance class filter value. Specify this parameter to show only those reservations matching the
     *        specified DB instances class.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeReservedDBInstancesRequest withDBInstanceClass(String dBInstanceClass) {
        setDBInstanceClass(dBInstanceClass);
        return this;
    }

    /**
     * <p>
     * The duration filter value, specified in years or seconds. Specify this parameter to show only reservations for
     * this duration.
     * </p>
     * <p>
     * Valid Values: <code>1 | 3 | 31536000 | 94608000</code>
     * </p>
     * 
     * @param duration
     *        The duration filter value, specified in years or seconds. Specify this parameter to show only reservations
     *        for this duration.</p>
     *        <p>
     *        Valid Values: <code>1 | 3 | 31536000 | 94608000</code>
     */

    public void setDuration(String duration) {
        this.duration = duration;
    }

    /**
     * <p>
     * The duration filter value, specified in years or seconds. Specify this parameter to show only reservations for
     * this duration.
     * </p>
     * <p>
     * Valid Values: <code>1 | 3 | 31536000 | 94608000</code>
     * </p>
     * 
     * @return The duration filter value, specified in years or seconds. Specify this parameter to show only
     *         reservations for this duration.</p>
     *         <p>
     *         Valid Values: <code>1 | 3 | 31536000 | 94608000</code>
     */

    public String getDuration() {
        return this.duration;
    }

    /**
     * <p>
     * The duration filter value, specified in years or seconds. Specify this parameter to show only reservations for
     * this duration.
     * </p>
     * <p>
     * Valid Values: <code>1 | 3 | 31536000 | 94608000</code>
     * </p>
     * 
     * @param duration
     *        The duration filter value, specified in years or seconds. Specify this parameter to show only reservations
     *        for this duration.</p>
     *        <p>
     *        Valid Values: <code>1 | 3 | 31536000 | 94608000</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeReservedDBInstancesRequest withDuration(String duration) {
        setDuration(duration);
        return this;
    }

    /**
     * <p>
     * The product description filter value. Specify this parameter to show only those reservations matching the
     * specified product description.
     * </p>
     * 
     * @param productDescription
     *        The product description filter value. Specify this parameter to show only those reservations matching the
     *        specified product description.
     */

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    /**
     * <p>
     * The product description filter value. Specify this parameter to show only those reservations matching the
     * specified product description.
     * </p>
     * 
     * @return The product description filter value. Specify this parameter to show only those reservations matching the
     *         specified product description.
     */

    public String getProductDescription() {
        return this.productDescription;
    }

    /**
     * <p>
     * The product description filter value. Specify this parameter to show only those reservations matching the
     * specified product description.
     * </p>
     * 
     * @param productDescription
     *        The product description filter value. Specify this parameter to show only those reservations matching the
     *        specified product description.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeReservedDBInstancesRequest withProductDescription(String productDescription) {
        setProductDescription(productDescription);
        return this;
    }

    /**
     * <p>
     * The offering type filter value. Specify this parameter to show only the available offerings matching the
     * specified offering type.
     * </p>
     * <p>
     * Valid Values: <code>"Partial Upfront" | "All Upfront" | "No Upfront" </code>
     * </p>
     * 
     * @param offeringType
     *        The offering type filter value. Specify this parameter to show only the available offerings matching the
     *        specified offering type.</p>
     *        <p>
     *        Valid Values: <code>"Partial Upfront" | "All Upfront" | "No Upfront" </code>
     */

    public void setOfferingType(String offeringType) {
        this.offeringType = offeringType;
    }

    /**
     * <p>
     * The offering type filter value. Specify this parameter to show only the available offerings matching the
     * specified offering type.
     * </p>
     * <p>
     * Valid Values: <code>"Partial Upfront" | "All Upfront" | "No Upfront" </code>
     * </p>
     * 
     * @return The offering type filter value. Specify this parameter to show only the available offerings matching the
     *         specified offering type.</p>
     *         <p>
     *         Valid Values: <code>"Partial Upfront" | "All Upfront" | "No Upfront" </code>
     */

    public String getOfferingType() {
        return this.offeringType;
    }

    /**
     * <p>
     * The offering type filter value. Specify this parameter to show only the available offerings matching the
     * specified offering type.
     * </p>
     * <p>
     * Valid Values: <code>"Partial Upfront" | "All Upfront" | "No Upfront" </code>
     * </p>
     * 
     * @param offeringType
     *        The offering type filter value. Specify this parameter to show only the available offerings matching the
     *        specified offering type.</p>
     *        <p>
     *        Valid Values: <code>"Partial Upfront" | "All Upfront" | "No Upfront" </code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeReservedDBInstancesRequest withOfferingType(String offeringType) {
        setOfferingType(offeringType);
        return this;
    }

    /**
     * <p>
     * The Multi-AZ filter value. Specify this parameter to show only those reservations matching the specified Multi-AZ
     * parameter.
     * </p>
     * 
     * @param multiAZ
     *        The Multi-AZ filter value. Specify this parameter to show only those reservations matching the specified
     *        Multi-AZ parameter.
     */

    public void setMultiAZ(Boolean multiAZ) {
        this.multiAZ = multiAZ;
    }

    /**
     * <p>
     * The Multi-AZ filter value. Specify this parameter to show only those reservations matching the specified Multi-AZ
     * parameter.
     * </p>
     * 
     * @return The Multi-AZ filter value. Specify this parameter to show only those reservations matching the specified
     *         Multi-AZ parameter.
     */

    public Boolean getMultiAZ() {
        return this.multiAZ;
    }

    /**
     * <p>
     * The Multi-AZ filter value. Specify this parameter to show only those reservations matching the specified Multi-AZ
     * parameter.
     * </p>
     * 
     * @param multiAZ
     *        The Multi-AZ filter value. Specify this parameter to show only those reservations matching the specified
     *        Multi-AZ parameter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeReservedDBInstancesRequest withMultiAZ(Boolean multiAZ) {
        setMultiAZ(multiAZ);
        return this;
    }

    /**
     * <p>
     * The Multi-AZ filter value. Specify this parameter to show only those reservations matching the specified Multi-AZ
     * parameter.
     * </p>
     * 
     * @return The Multi-AZ filter value. Specify this parameter to show only those reservations matching the specified
     *         Multi-AZ parameter.
     */

    public Boolean isMultiAZ() {
        return this.multiAZ;
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

        this.filters = new com.amazonaws.internal.SdkInternalList<Filter>(filters);
    }

    /**
     * <p>
     * This parameter is not currently supported.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFilters(java.util.Collection)} or {@link #withFilters(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param filters
     *        This parameter is not currently supported.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeReservedDBInstancesRequest withFilters(Filter... filters) {
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
     * This parameter is not currently supported.
     * </p>
     * 
     * @param filters
     *        This parameter is not currently supported.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeReservedDBInstancesRequest withFilters(java.util.Collection<Filter> filters) {
        setFilters(filters);
        return this;
    }

    /**
     * <p>
     * The maximum number of records to include in the response. If more than the <code>MaxRecords</code> value is
     * available, a pagination token called a marker is included in the response so that the following results can be
     * retrieved.
     * </p>
     * <p>
     * Default: 100
     * </p>
     * <p>
     * Constraints: Minimum 20, maximum 100.
     * </p>
     * 
     * @param maxRecords
     *        The maximum number of records to include in the response. If more than the <code>MaxRecords</code> value
     *        is available, a pagination token called a marker is included in the response so that the following results
     *        can be retrieved. </p>
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
     * The maximum number of records to include in the response. If more than the <code>MaxRecords</code> value is
     * available, a pagination token called a marker is included in the response so that the following results can be
     * retrieved.
     * </p>
     * <p>
     * Default: 100
     * </p>
     * <p>
     * Constraints: Minimum 20, maximum 100.
     * </p>
     * 
     * @return The maximum number of records to include in the response. If more than the <code>MaxRecords</code> value
     *         is available, a pagination token called a marker is included in the response so that the following
     *         results can be retrieved. </p>
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
     * The maximum number of records to include in the response. If more than the <code>MaxRecords</code> value is
     * available, a pagination token called a marker is included in the response so that the following results can be
     * retrieved.
     * </p>
     * <p>
     * Default: 100
     * </p>
     * <p>
     * Constraints: Minimum 20, maximum 100.
     * </p>
     * 
     * @param maxRecords
     *        The maximum number of records to include in the response. If more than the <code>MaxRecords</code> value
     *        is available, a pagination token called a marker is included in the response so that the following results
     *        can be retrieved. </p>
     *        <p>
     *        Default: 100
     *        </p>
     *        <p>
     *        Constraints: Minimum 20, maximum 100.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeReservedDBInstancesRequest withMaxRecords(Integer maxRecords) {
        setMaxRecords(maxRecords);
        return this;
    }

    /**
     * <p>
     * An optional pagination token provided by a previous request. If this parameter is specified, the response
     * includes only records beyond the marker, up to the value specified by <code>MaxRecords</code>.
     * </p>
     * 
     * @param marker
     *        An optional pagination token provided by a previous request. If this parameter is specified, the response
     *        includes only records beyond the marker, up to the value specified by <code>MaxRecords</code>.
     */

    public void setMarker(String marker) {
        this.marker = marker;
    }

    /**
     * <p>
     * An optional pagination token provided by a previous request. If this parameter is specified, the response
     * includes only records beyond the marker, up to the value specified by <code>MaxRecords</code>.
     * </p>
     * 
     * @return An optional pagination token provided by a previous request. If this parameter is specified, the response
     *         includes only records beyond the marker, up to the value specified by <code>MaxRecords</code>.
     */

    public String getMarker() {
        return this.marker;
    }

    /**
     * <p>
     * An optional pagination token provided by a previous request. If this parameter is specified, the response
     * includes only records beyond the marker, up to the value specified by <code>MaxRecords</code>.
     * </p>
     * 
     * @param marker
     *        An optional pagination token provided by a previous request. If this parameter is specified, the response
     *        includes only records beyond the marker, up to the value specified by <code>MaxRecords</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeReservedDBInstancesRequest withMarker(String marker) {
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
        if (getReservedDBInstanceId() != null)
            sb.append("ReservedDBInstanceId: ").append(getReservedDBInstanceId()).append(",");
        if (getReservedDBInstancesOfferingId() != null)
            sb.append("ReservedDBInstancesOfferingId: ").append(getReservedDBInstancesOfferingId()).append(",");
        if (getDBInstanceClass() != null)
            sb.append("DBInstanceClass: ").append(getDBInstanceClass()).append(",");
        if (getDuration() != null)
            sb.append("Duration: ").append(getDuration()).append(",");
        if (getProductDescription() != null)
            sb.append("ProductDescription: ").append(getProductDescription()).append(",");
        if (getOfferingType() != null)
            sb.append("OfferingType: ").append(getOfferingType()).append(",");
        if (getMultiAZ() != null)
            sb.append("MultiAZ: ").append(getMultiAZ()).append(",");
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

        if (obj instanceof DescribeReservedDBInstancesRequest == false)
            return false;
        DescribeReservedDBInstancesRequest other = (DescribeReservedDBInstancesRequest) obj;
        if (other.getReservedDBInstanceId() == null ^ this.getReservedDBInstanceId() == null)
            return false;
        if (other.getReservedDBInstanceId() != null && other.getReservedDBInstanceId().equals(this.getReservedDBInstanceId()) == false)
            return false;
        if (other.getReservedDBInstancesOfferingId() == null ^ this.getReservedDBInstancesOfferingId() == null)
            return false;
        if (other.getReservedDBInstancesOfferingId() != null
                && other.getReservedDBInstancesOfferingId().equals(this.getReservedDBInstancesOfferingId()) == false)
            return false;
        if (other.getDBInstanceClass() == null ^ this.getDBInstanceClass() == null)
            return false;
        if (other.getDBInstanceClass() != null && other.getDBInstanceClass().equals(this.getDBInstanceClass()) == false)
            return false;
        if (other.getDuration() == null ^ this.getDuration() == null)
            return false;
        if (other.getDuration() != null && other.getDuration().equals(this.getDuration()) == false)
            return false;
        if (other.getProductDescription() == null ^ this.getProductDescription() == null)
            return false;
        if (other.getProductDescription() != null && other.getProductDescription().equals(this.getProductDescription()) == false)
            return false;
        if (other.getOfferingType() == null ^ this.getOfferingType() == null)
            return false;
        if (other.getOfferingType() != null && other.getOfferingType().equals(this.getOfferingType()) == false)
            return false;
        if (other.getMultiAZ() == null ^ this.getMultiAZ() == null)
            return false;
        if (other.getMultiAZ() != null && other.getMultiAZ().equals(this.getMultiAZ()) == false)
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

        hashCode = prime * hashCode + ((getReservedDBInstanceId() == null) ? 0 : getReservedDBInstanceId().hashCode());
        hashCode = prime * hashCode + ((getReservedDBInstancesOfferingId() == null) ? 0 : getReservedDBInstancesOfferingId().hashCode());
        hashCode = prime * hashCode + ((getDBInstanceClass() == null) ? 0 : getDBInstanceClass().hashCode());
        hashCode = prime * hashCode + ((getDuration() == null) ? 0 : getDuration().hashCode());
        hashCode = prime * hashCode + ((getProductDescription() == null) ? 0 : getProductDescription().hashCode());
        hashCode = prime * hashCode + ((getOfferingType() == null) ? 0 : getOfferingType().hashCode());
        hashCode = prime * hashCode + ((getMultiAZ() == null) ? 0 : getMultiAZ().hashCode());
        hashCode = prime * hashCode + ((getFilters() == null) ? 0 : getFilters().hashCode());
        hashCode = prime * hashCode + ((getMaxRecords() == null) ? 0 : getMaxRecords().hashCode());
        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode());
        return hashCode;
    }

    @Override
    public DescribeReservedDBInstancesRequest clone() {
        return (DescribeReservedDBInstancesRequest) super.clone();
    }

}
