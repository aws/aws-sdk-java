/*
 * Copyright 2010 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.rds.AmazonRDS#describeReservedDBInstancesOfferings(DescribeReservedDBInstancesOfferingsRequest) DescribeReservedDBInstancesOfferings operation}.
 * <p>
 * Lists available reserved DB Instance offerings.
 * </p>
 *
 * @see com.amazonaws.services.rds.AmazonRDS#describeReservedDBInstancesOfferings(DescribeReservedDBInstancesOfferingsRequest)
 */
public class DescribeReservedDBInstancesOfferingsRequest extends AmazonWebServiceRequest {

    /**
     * The offering identifier filter value. Specify this parameter to show
     * only the available offering that matches the specified reservation
     * identifier.
     */
    private String reservedDBInstancesOfferingId;

    /**
     * The DB Instance class filter value. Specify this parameter to show
     * only the available offerings matching the specified DB Instance class.
     */
    private String dBInstanceClass;

    /**
     * Duration filter value, specified in years or seconds. Specify this
     * parameter to show only reservations for this duration.
     */
    private String duration;

    /**
     * Product description filter value. Specify this parameter to show only
     * the available offerings matching the specified product description.
     */
    private String productDescription;

    /**
     * The Multi-AZ filter value. Specify this parameter to show only the
     * available offerings matching the specified Multi-AZ parameter.
     */
    private Boolean multiAZ;

    /**
     * The maximum number of records to include in the response. If more than
     * the <code>MaxRecords</code> value is available, a marker is included
     * in the response so that the following results can be retrieved.
     */
    private Integer maxRecords;

    /**
     * The marker provided in the previous request. If this parameter is
     * specified, the response includes records beyond the marker only, up to
     * <code>MaxRecords</code>.
     */
    private String marker;

    /**
     * Default constructor for a new DescribeReservedDBInstancesOfferingsRequest object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public DescribeReservedDBInstancesOfferingsRequest() {}
    
    /**
     * The offering identifier filter value. Specify this parameter to show
     * only the available offering that matches the specified reservation
     * identifier.
     *
     * @return The offering identifier filter value. Specify this parameter to show
     *         only the available offering that matches the specified reservation
     *         identifier.
     */
    public String getReservedDBInstancesOfferingId() {
        return reservedDBInstancesOfferingId;
    }
    
    /**
     * The offering identifier filter value. Specify this parameter to show
     * only the available offering that matches the specified reservation
     * identifier.
     *
     * @param reservedDBInstancesOfferingId The offering identifier filter value. Specify this parameter to show
     *         only the available offering that matches the specified reservation
     *         identifier.
     */
    public void setReservedDBInstancesOfferingId(String reservedDBInstancesOfferingId) {
        this.reservedDBInstancesOfferingId = reservedDBInstancesOfferingId;
    }
    
    /**
     * The offering identifier filter value. Specify this parameter to show
     * only the available offering that matches the specified reservation
     * identifier.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param reservedDBInstancesOfferingId The offering identifier filter value. Specify this parameter to show
     *         only the available offering that matches the specified reservation
     *         identifier.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeReservedDBInstancesOfferingsRequest withReservedDBInstancesOfferingId(String reservedDBInstancesOfferingId) {
        this.reservedDBInstancesOfferingId = reservedDBInstancesOfferingId;
        return this;
    }
    
    
    /**
     * The DB Instance class filter value. Specify this parameter to show
     * only the available offerings matching the specified DB Instance class.
     *
     * @return The DB Instance class filter value. Specify this parameter to show
     *         only the available offerings matching the specified DB Instance class.
     */
    public String getDBInstanceClass() {
        return dBInstanceClass;
    }
    
    /**
     * The DB Instance class filter value. Specify this parameter to show
     * only the available offerings matching the specified DB Instance class.
     *
     * @param dBInstanceClass The DB Instance class filter value. Specify this parameter to show
     *         only the available offerings matching the specified DB Instance class.
     */
    public void setDBInstanceClass(String dBInstanceClass) {
        this.dBInstanceClass = dBInstanceClass;
    }
    
    /**
     * The DB Instance class filter value. Specify this parameter to show
     * only the available offerings matching the specified DB Instance class.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param dBInstanceClass The DB Instance class filter value. Specify this parameter to show
     *         only the available offerings matching the specified DB Instance class.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeReservedDBInstancesOfferingsRequest withDBInstanceClass(String dBInstanceClass) {
        this.dBInstanceClass = dBInstanceClass;
        return this;
    }
    
    
    /**
     * Duration filter value, specified in years or seconds. Specify this
     * parameter to show only reservations for this duration.
     *
     * @return Duration filter value, specified in years or seconds. Specify this
     *         parameter to show only reservations for this duration.
     */
    public String getDuration() {
        return duration;
    }
    
    /**
     * Duration filter value, specified in years or seconds. Specify this
     * parameter to show only reservations for this duration.
     *
     * @param duration Duration filter value, specified in years or seconds. Specify this
     *         parameter to show only reservations for this duration.
     */
    public void setDuration(String duration) {
        this.duration = duration;
    }
    
    /**
     * Duration filter value, specified in years or seconds. Specify this
     * parameter to show only reservations for this duration.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param duration Duration filter value, specified in years or seconds. Specify this
     *         parameter to show only reservations for this duration.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeReservedDBInstancesOfferingsRequest withDuration(String duration) {
        this.duration = duration;
        return this;
    }
    
    
    /**
     * Product description filter value. Specify this parameter to show only
     * the available offerings matching the specified product description.
     *
     * @return Product description filter value. Specify this parameter to show only
     *         the available offerings matching the specified product description.
     */
    public String getProductDescription() {
        return productDescription;
    }
    
    /**
     * Product description filter value. Specify this parameter to show only
     * the available offerings matching the specified product description.
     *
     * @param productDescription Product description filter value. Specify this parameter to show only
     *         the available offerings matching the specified product description.
     */
    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }
    
    /**
     * Product description filter value. Specify this parameter to show only
     * the available offerings matching the specified product description.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param productDescription Product description filter value. Specify this parameter to show only
     *         the available offerings matching the specified product description.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeReservedDBInstancesOfferingsRequest withProductDescription(String productDescription) {
        this.productDescription = productDescription;
        return this;
    }
    
    
    /**
     * The Multi-AZ filter value. Specify this parameter to show only the
     * available offerings matching the specified Multi-AZ parameter.
     *
     * @return The Multi-AZ filter value. Specify this parameter to show only the
     *         available offerings matching the specified Multi-AZ parameter.
     */
    public Boolean isMultiAZ() {
        return multiAZ;
    }
    
    /**
     * The Multi-AZ filter value. Specify this parameter to show only the
     * available offerings matching the specified Multi-AZ parameter.
     *
     * @param multiAZ The Multi-AZ filter value. Specify this parameter to show only the
     *         available offerings matching the specified Multi-AZ parameter.
     */
    public void setMultiAZ(Boolean multiAZ) {
        this.multiAZ = multiAZ;
    }
    
    /**
     * The Multi-AZ filter value. Specify this parameter to show only the
     * available offerings matching the specified Multi-AZ parameter.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param multiAZ The Multi-AZ filter value. Specify this parameter to show only the
     *         available offerings matching the specified Multi-AZ parameter.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeReservedDBInstancesOfferingsRequest withMultiAZ(Boolean multiAZ) {
        this.multiAZ = multiAZ;
        return this;
    }
    
    
    /**
     * The Multi-AZ filter value. Specify this parameter to show only the
     * available offerings matching the specified Multi-AZ parameter.
     *
     * @return The Multi-AZ filter value. Specify this parameter to show only the
     *         available offerings matching the specified Multi-AZ parameter.
     */
    public Boolean getMultiAZ() {
        return multiAZ;
    }
    
    /**
     * The maximum number of records to include in the response. If more than
     * the <code>MaxRecords</code> value is available, a marker is included
     * in the response so that the following results can be retrieved.
     *
     * @return The maximum number of records to include in the response. If more than
     *         the <code>MaxRecords</code> value is available, a marker is included
     *         in the response so that the following results can be retrieved.
     */
    public Integer getMaxRecords() {
        return maxRecords;
    }
    
    /**
     * The maximum number of records to include in the response. If more than
     * the <code>MaxRecords</code> value is available, a marker is included
     * in the response so that the following results can be retrieved.
     *
     * @param maxRecords The maximum number of records to include in the response. If more than
     *         the <code>MaxRecords</code> value is available, a marker is included
     *         in the response so that the following results can be retrieved.
     */
    public void setMaxRecords(Integer maxRecords) {
        this.maxRecords = maxRecords;
    }
    
    /**
     * The maximum number of records to include in the response. If more than
     * the <code>MaxRecords</code> value is available, a marker is included
     * in the response so that the following results can be retrieved.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param maxRecords The maximum number of records to include in the response. If more than
     *         the <code>MaxRecords</code> value is available, a marker is included
     *         in the response so that the following results can be retrieved.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeReservedDBInstancesOfferingsRequest withMaxRecords(Integer maxRecords) {
        this.maxRecords = maxRecords;
        return this;
    }
    
    
    /**
     * The marker provided in the previous request. If this parameter is
     * specified, the response includes records beyond the marker only, up to
     * <code>MaxRecords</code>.
     *
     * @return The marker provided in the previous request. If this parameter is
     *         specified, the response includes records beyond the marker only, up to
     *         <code>MaxRecords</code>.
     */
    public String getMarker() {
        return marker;
    }
    
    /**
     * The marker provided in the previous request. If this parameter is
     * specified, the response includes records beyond the marker only, up to
     * <code>MaxRecords</code>.
     *
     * @param marker The marker provided in the previous request. If this parameter is
     *         specified, the response includes records beyond the marker only, up to
     *         <code>MaxRecords</code>.
     */
    public void setMarker(String marker) {
        this.marker = marker;
    }
    
    /**
     * The marker provided in the previous request. If this parameter is
     * specified, the response includes records beyond the marker only, up to
     * <code>MaxRecords</code>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param marker The marker provided in the previous request. If this parameter is
     *         specified, the response includes records beyond the marker only, up to
     *         <code>MaxRecords</code>.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeReservedDBInstancesOfferingsRequest withMarker(String marker) {
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
        sb.append("ReservedDBInstancesOfferingId: " + reservedDBInstancesOfferingId + ", ");
        sb.append("DBInstanceClass: " + dBInstanceClass + ", ");
        sb.append("Duration: " + duration + ", ");
        sb.append("ProductDescription: " + productDescription + ", ");
        sb.append("MultiAZ: " + multiAZ + ", ");
        sb.append("MaxRecords: " + maxRecords + ", ");
        sb.append("Marker: " + marker + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    