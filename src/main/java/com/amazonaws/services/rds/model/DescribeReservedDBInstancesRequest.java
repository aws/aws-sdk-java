/*
 * Copyright 2010-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Container for the parameters to the {@link com.amazonaws.services.rds.AmazonRDS#describeReservedDBInstances(DescribeReservedDBInstancesRequest) DescribeReservedDBInstances operation}.
 * <p>
 * Returns information about reserved DB instances for this account, or about a specified reserved DB instance.
 * </p>
 *
 * @see com.amazonaws.services.rds.AmazonRDS#describeReservedDBInstances(DescribeReservedDBInstancesRequest)
 */
public class DescribeReservedDBInstancesRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * The reserved DB instance identifier filter value. Specify this
     * parameter to show only the reservation that matches the specified
     * reservation ID.
     */
    private String reservedDBInstanceId;

    /**
     * The offering identifier filter value. Specify this parameter to show
     * only purchased reservations matching the specified offering
     * identifier.
     */
    private String reservedDBInstancesOfferingId;

    /**
     * The DB instance class filter value. Specify this parameter to show
     * only those reservations matching the specified DB instances class.
     */
    private String dBInstanceClass;

    /**
     * The duration filter value, specified in years or seconds. Specify this
     * parameter to show only reservations for this duration. <p>Valid
     * Values: <code>1 | 3 | 31536000 | 94608000</code>
     */
    private String duration;

    /**
     * The product description filter value. Specify this parameter to show
     * only those reservations matching the specified product description.
     */
    private String productDescription;

    /**
     * The offering type filter value. Specify this parameter to show only
     * the available offerings matching the specified offering type. <p>Valid
     * Values: <code>"Light Utilization" | "Medium Utilization" | "Heavy
     * Utilization" </code>
     */
    private String offeringType;

    /**
     * The Multi-AZ filter value. Specify this parameter to show only those
     * reservations matching the specified Multi-AZ parameter.
     */
    private Boolean multiAZ;

    /**
     * This parameter is not currently supported.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<Filter> filters;

    /**
     * The maximum number of records to include in the response. If more than
     * the <code>MaxRecords</code> value is available, a pagination token
     * called a marker is included in the response so that the following
     * results can be retrieved. <p>Default: 100 <p>Constraints: minimum 20,
     * maximum 100
     */
    private Integer maxRecords;

    /**
     * An optional pagination token provided by a previous request. If this
     * parameter is specified, the response includes only records beyond the
     * marker, up to the value specified by <code>MaxRecords</code>.
     */
    private String marker;

    /**
     * Default constructor for a new DescribeReservedDBInstancesRequest object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public DescribeReservedDBInstancesRequest() {}
    
    /**
     * The reserved DB instance identifier filter value. Specify this
     * parameter to show only the reservation that matches the specified
     * reservation ID.
     *
     * @return The reserved DB instance identifier filter value. Specify this
     *         parameter to show only the reservation that matches the specified
     *         reservation ID.
     */
    public String getReservedDBInstanceId() {
        return reservedDBInstanceId;
    }
    
    /**
     * The reserved DB instance identifier filter value. Specify this
     * parameter to show only the reservation that matches the specified
     * reservation ID.
     *
     * @param reservedDBInstanceId The reserved DB instance identifier filter value. Specify this
     *         parameter to show only the reservation that matches the specified
     *         reservation ID.
     */
    public void setReservedDBInstanceId(String reservedDBInstanceId) {
        this.reservedDBInstanceId = reservedDBInstanceId;
    }
    
    /**
     * The reserved DB instance identifier filter value. Specify this
     * parameter to show only the reservation that matches the specified
     * reservation ID.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param reservedDBInstanceId The reserved DB instance identifier filter value. Specify this
     *         parameter to show only the reservation that matches the specified
     *         reservation ID.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeReservedDBInstancesRequest withReservedDBInstanceId(String reservedDBInstanceId) {
        this.reservedDBInstanceId = reservedDBInstanceId;
        return this;
    }

    /**
     * The offering identifier filter value. Specify this parameter to show
     * only purchased reservations matching the specified offering
     * identifier.
     *
     * @return The offering identifier filter value. Specify this parameter to show
     *         only purchased reservations matching the specified offering
     *         identifier.
     */
    public String getReservedDBInstancesOfferingId() {
        return reservedDBInstancesOfferingId;
    }
    
    /**
     * The offering identifier filter value. Specify this parameter to show
     * only purchased reservations matching the specified offering
     * identifier.
     *
     * @param reservedDBInstancesOfferingId The offering identifier filter value. Specify this parameter to show
     *         only purchased reservations matching the specified offering
     *         identifier.
     */
    public void setReservedDBInstancesOfferingId(String reservedDBInstancesOfferingId) {
        this.reservedDBInstancesOfferingId = reservedDBInstancesOfferingId;
    }
    
    /**
     * The offering identifier filter value. Specify this parameter to show
     * only purchased reservations matching the specified offering
     * identifier.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param reservedDBInstancesOfferingId The offering identifier filter value. Specify this parameter to show
     *         only purchased reservations matching the specified offering
     *         identifier.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeReservedDBInstancesRequest withReservedDBInstancesOfferingId(String reservedDBInstancesOfferingId) {
        this.reservedDBInstancesOfferingId = reservedDBInstancesOfferingId;
        return this;
    }

    /**
     * The DB instance class filter value. Specify this parameter to show
     * only those reservations matching the specified DB instances class.
     *
     * @return The DB instance class filter value. Specify this parameter to show
     *         only those reservations matching the specified DB instances class.
     */
    public String getDBInstanceClass() {
        return dBInstanceClass;
    }
    
    /**
     * The DB instance class filter value. Specify this parameter to show
     * only those reservations matching the specified DB instances class.
     *
     * @param dBInstanceClass The DB instance class filter value. Specify this parameter to show
     *         only those reservations matching the specified DB instances class.
     */
    public void setDBInstanceClass(String dBInstanceClass) {
        this.dBInstanceClass = dBInstanceClass;
    }
    
    /**
     * The DB instance class filter value. Specify this parameter to show
     * only those reservations matching the specified DB instances class.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param dBInstanceClass The DB instance class filter value. Specify this parameter to show
     *         only those reservations matching the specified DB instances class.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeReservedDBInstancesRequest withDBInstanceClass(String dBInstanceClass) {
        this.dBInstanceClass = dBInstanceClass;
        return this;
    }

    /**
     * The duration filter value, specified in years or seconds. Specify this
     * parameter to show only reservations for this duration. <p>Valid
     * Values: <code>1 | 3 | 31536000 | 94608000</code>
     *
     * @return The duration filter value, specified in years or seconds. Specify this
     *         parameter to show only reservations for this duration. <p>Valid
     *         Values: <code>1 | 3 | 31536000 | 94608000</code>
     */
    public String getDuration() {
        return duration;
    }
    
    /**
     * The duration filter value, specified in years or seconds. Specify this
     * parameter to show only reservations for this duration. <p>Valid
     * Values: <code>1 | 3 | 31536000 | 94608000</code>
     *
     * @param duration The duration filter value, specified in years or seconds. Specify this
     *         parameter to show only reservations for this duration. <p>Valid
     *         Values: <code>1 | 3 | 31536000 | 94608000</code>
     */
    public void setDuration(String duration) {
        this.duration = duration;
    }
    
    /**
     * The duration filter value, specified in years or seconds. Specify this
     * parameter to show only reservations for this duration. <p>Valid
     * Values: <code>1 | 3 | 31536000 | 94608000</code>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param duration The duration filter value, specified in years or seconds. Specify this
     *         parameter to show only reservations for this duration. <p>Valid
     *         Values: <code>1 | 3 | 31536000 | 94608000</code>
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeReservedDBInstancesRequest withDuration(String duration) {
        this.duration = duration;
        return this;
    }

    /**
     * The product description filter value. Specify this parameter to show
     * only those reservations matching the specified product description.
     *
     * @return The product description filter value. Specify this parameter to show
     *         only those reservations matching the specified product description.
     */
    public String getProductDescription() {
        return productDescription;
    }
    
    /**
     * The product description filter value. Specify this parameter to show
     * only those reservations matching the specified product description.
     *
     * @param productDescription The product description filter value. Specify this parameter to show
     *         only those reservations matching the specified product description.
     */
    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }
    
    /**
     * The product description filter value. Specify this parameter to show
     * only those reservations matching the specified product description.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param productDescription The product description filter value. Specify this parameter to show
     *         only those reservations matching the specified product description.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeReservedDBInstancesRequest withProductDescription(String productDescription) {
        this.productDescription = productDescription;
        return this;
    }

    /**
     * The offering type filter value. Specify this parameter to show only
     * the available offerings matching the specified offering type. <p>Valid
     * Values: <code>"Light Utilization" | "Medium Utilization" | "Heavy
     * Utilization" </code>
     *
     * @return The offering type filter value. Specify this parameter to show only
     *         the available offerings matching the specified offering type. <p>Valid
     *         Values: <code>"Light Utilization" | "Medium Utilization" | "Heavy
     *         Utilization" </code>
     */
    public String getOfferingType() {
        return offeringType;
    }
    
    /**
     * The offering type filter value. Specify this parameter to show only
     * the available offerings matching the specified offering type. <p>Valid
     * Values: <code>"Light Utilization" | "Medium Utilization" | "Heavy
     * Utilization" </code>
     *
     * @param offeringType The offering type filter value. Specify this parameter to show only
     *         the available offerings matching the specified offering type. <p>Valid
     *         Values: <code>"Light Utilization" | "Medium Utilization" | "Heavy
     *         Utilization" </code>
     */
    public void setOfferingType(String offeringType) {
        this.offeringType = offeringType;
    }
    
    /**
     * The offering type filter value. Specify this parameter to show only
     * the available offerings matching the specified offering type. <p>Valid
     * Values: <code>"Light Utilization" | "Medium Utilization" | "Heavy
     * Utilization" </code>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param offeringType The offering type filter value. Specify this parameter to show only
     *         the available offerings matching the specified offering type. <p>Valid
     *         Values: <code>"Light Utilization" | "Medium Utilization" | "Heavy
     *         Utilization" </code>
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeReservedDBInstancesRequest withOfferingType(String offeringType) {
        this.offeringType = offeringType;
        return this;
    }

    /**
     * The Multi-AZ filter value. Specify this parameter to show only those
     * reservations matching the specified Multi-AZ parameter.
     *
     * @return The Multi-AZ filter value. Specify this parameter to show only those
     *         reservations matching the specified Multi-AZ parameter.
     */
    public Boolean isMultiAZ() {
        return multiAZ;
    }
    
    /**
     * The Multi-AZ filter value. Specify this parameter to show only those
     * reservations matching the specified Multi-AZ parameter.
     *
     * @param multiAZ The Multi-AZ filter value. Specify this parameter to show only those
     *         reservations matching the specified Multi-AZ parameter.
     */
    public void setMultiAZ(Boolean multiAZ) {
        this.multiAZ = multiAZ;
    }
    
    /**
     * The Multi-AZ filter value. Specify this parameter to show only those
     * reservations matching the specified Multi-AZ parameter.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param multiAZ The Multi-AZ filter value. Specify this parameter to show only those
     *         reservations matching the specified Multi-AZ parameter.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeReservedDBInstancesRequest withMultiAZ(Boolean multiAZ) {
        this.multiAZ = multiAZ;
        return this;
    }

    /**
     * The Multi-AZ filter value. Specify this parameter to show only those
     * reservations matching the specified Multi-AZ parameter.
     *
     * @return The Multi-AZ filter value. Specify this parameter to show only those
     *         reservations matching the specified Multi-AZ parameter.
     */
    public Boolean getMultiAZ() {
        return multiAZ;
    }

    /**
     * This parameter is not currently supported.
     *
     * @return This parameter is not currently supported.
     */
    public java.util.List<Filter> getFilters() {
        if (filters == null) {
              filters = new com.amazonaws.internal.ListWithAutoConstructFlag<Filter>();
              filters.setAutoConstruct(true);
        }
        return filters;
    }
    
    /**
     * This parameter is not currently supported.
     *
     * @param filters This parameter is not currently supported.
     */
    public void setFilters(java.util.Collection<Filter> filters) {
        if (filters == null) {
            this.filters = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<Filter> filtersCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<Filter>(filters.size());
        filtersCopy.addAll(filters);
        this.filters = filtersCopy;
    }
    
    /**
     * This parameter is not currently supported.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param filters This parameter is not currently supported.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeReservedDBInstancesRequest withFilters(Filter... filters) {
        if (getFilters() == null) setFilters(new java.util.ArrayList<Filter>(filters.length));
        for (Filter value : filters) {
            getFilters().add(value);
        }
        return this;
    }
    
    /**
     * This parameter is not currently supported.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param filters This parameter is not currently supported.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeReservedDBInstancesRequest withFilters(java.util.Collection<Filter> filters) {
        if (filters == null) {
            this.filters = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<Filter> filtersCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<Filter>(filters.size());
            filtersCopy.addAll(filters);
            this.filters = filtersCopy;
        }

        return this;
    }

    /**
     * The maximum number of records to include in the response. If more than
     * the <code>MaxRecords</code> value is available, a pagination token
     * called a marker is included in the response so that the following
     * results can be retrieved. <p>Default: 100 <p>Constraints: minimum 20,
     * maximum 100
     *
     * @return The maximum number of records to include in the response. If more than
     *         the <code>MaxRecords</code> value is available, a pagination token
     *         called a marker is included in the response so that the following
     *         results can be retrieved. <p>Default: 100 <p>Constraints: minimum 20,
     *         maximum 100
     */
    public Integer getMaxRecords() {
        return maxRecords;
    }
    
    /**
     * The maximum number of records to include in the response. If more than
     * the <code>MaxRecords</code> value is available, a pagination token
     * called a marker is included in the response so that the following
     * results can be retrieved. <p>Default: 100 <p>Constraints: minimum 20,
     * maximum 100
     *
     * @param maxRecords The maximum number of records to include in the response. If more than
     *         the <code>MaxRecords</code> value is available, a pagination token
     *         called a marker is included in the response so that the following
     *         results can be retrieved. <p>Default: 100 <p>Constraints: minimum 20,
     *         maximum 100
     */
    public void setMaxRecords(Integer maxRecords) {
        this.maxRecords = maxRecords;
    }
    
    /**
     * The maximum number of records to include in the response. If more than
     * the <code>MaxRecords</code> value is available, a pagination token
     * called a marker is included in the response so that the following
     * results can be retrieved. <p>Default: 100 <p>Constraints: minimum 20,
     * maximum 100
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param maxRecords The maximum number of records to include in the response. If more than
     *         the <code>MaxRecords</code> value is available, a pagination token
     *         called a marker is included in the response so that the following
     *         results can be retrieved. <p>Default: 100 <p>Constraints: minimum 20,
     *         maximum 100
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeReservedDBInstancesRequest withMaxRecords(Integer maxRecords) {
        this.maxRecords = maxRecords;
        return this;
    }

    /**
     * An optional pagination token provided by a previous request. If this
     * parameter is specified, the response includes only records beyond the
     * marker, up to the value specified by <code>MaxRecords</code>.
     *
     * @return An optional pagination token provided by a previous request. If this
     *         parameter is specified, the response includes only records beyond the
     *         marker, up to the value specified by <code>MaxRecords</code>.
     */
    public String getMarker() {
        return marker;
    }
    
    /**
     * An optional pagination token provided by a previous request. If this
     * parameter is specified, the response includes only records beyond the
     * marker, up to the value specified by <code>MaxRecords</code>.
     *
     * @param marker An optional pagination token provided by a previous request. If this
     *         parameter is specified, the response includes only records beyond the
     *         marker, up to the value specified by <code>MaxRecords</code>.
     */
    public void setMarker(String marker) {
        this.marker = marker;
    }
    
    /**
     * An optional pagination token provided by a previous request. If this
     * parameter is specified, the response includes only records beyond the
     * marker, up to the value specified by <code>MaxRecords</code>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param marker An optional pagination token provided by a previous request. If this
     *         parameter is specified, the response includes only records beyond the
     *         marker, up to the value specified by <code>MaxRecords</code>.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeReservedDBInstancesRequest withMarker(String marker) {
        this.marker = marker;
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
        if (getReservedDBInstanceId() != null) sb.append("ReservedDBInstanceId: " + getReservedDBInstanceId() + ",");
        if (getReservedDBInstancesOfferingId() != null) sb.append("ReservedDBInstancesOfferingId: " + getReservedDBInstancesOfferingId() + ",");
        if (getDBInstanceClass() != null) sb.append("DBInstanceClass: " + getDBInstanceClass() + ",");
        if (getDuration() != null) sb.append("Duration: " + getDuration() + ",");
        if (getProductDescription() != null) sb.append("ProductDescription: " + getProductDescription() + ",");
        if (getOfferingType() != null) sb.append("OfferingType: " + getOfferingType() + ",");
        if (isMultiAZ() != null) sb.append("MultiAZ: " + isMultiAZ() + ",");
        if (getFilters() != null) sb.append("Filters: " + getFilters() + ",");
        if (getMaxRecords() != null) sb.append("MaxRecords: " + getMaxRecords() + ",");
        if (getMarker() != null) sb.append("Marker: " + getMarker() );
        sb.append("}");
        return sb.toString();
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
        hashCode = prime * hashCode + ((isMultiAZ() == null) ? 0 : isMultiAZ().hashCode()); 
        hashCode = prime * hashCode + ((getFilters() == null) ? 0 : getFilters().hashCode()); 
        hashCode = prime * hashCode + ((getMaxRecords() == null) ? 0 : getMaxRecords().hashCode()); 
        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DescribeReservedDBInstancesRequest == false) return false;
        DescribeReservedDBInstancesRequest other = (DescribeReservedDBInstancesRequest)obj;
        
        if (other.getReservedDBInstanceId() == null ^ this.getReservedDBInstanceId() == null) return false;
        if (other.getReservedDBInstanceId() != null && other.getReservedDBInstanceId().equals(this.getReservedDBInstanceId()) == false) return false; 
        if (other.getReservedDBInstancesOfferingId() == null ^ this.getReservedDBInstancesOfferingId() == null) return false;
        if (other.getReservedDBInstancesOfferingId() != null && other.getReservedDBInstancesOfferingId().equals(this.getReservedDBInstancesOfferingId()) == false) return false; 
        if (other.getDBInstanceClass() == null ^ this.getDBInstanceClass() == null) return false;
        if (other.getDBInstanceClass() != null && other.getDBInstanceClass().equals(this.getDBInstanceClass()) == false) return false; 
        if (other.getDuration() == null ^ this.getDuration() == null) return false;
        if (other.getDuration() != null && other.getDuration().equals(this.getDuration()) == false) return false; 
        if (other.getProductDescription() == null ^ this.getProductDescription() == null) return false;
        if (other.getProductDescription() != null && other.getProductDescription().equals(this.getProductDescription()) == false) return false; 
        if (other.getOfferingType() == null ^ this.getOfferingType() == null) return false;
        if (other.getOfferingType() != null && other.getOfferingType().equals(this.getOfferingType()) == false) return false; 
        if (other.isMultiAZ() == null ^ this.isMultiAZ() == null) return false;
        if (other.isMultiAZ() != null && other.isMultiAZ().equals(this.isMultiAZ()) == false) return false; 
        if (other.getFilters() == null ^ this.getFilters() == null) return false;
        if (other.getFilters() != null && other.getFilters().equals(this.getFilters()) == false) return false; 
        if (other.getMaxRecords() == null ^ this.getMaxRecords() == null) return false;
        if (other.getMaxRecords() != null && other.getMaxRecords().equals(this.getMaxRecords()) == false) return false; 
        if (other.getMarker() == null ^ this.getMarker() == null) return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false) return false; 
        return true;
    }
    
}
    