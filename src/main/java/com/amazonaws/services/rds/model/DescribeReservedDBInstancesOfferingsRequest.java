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
 * 
 *
 * @see com.amazonaws.services.rds.AmazonRDS#describeReservedDBInstancesOfferings(DescribeReservedDBInstancesOfferingsRequest)
 */
public class DescribeReservedDBInstancesOfferingsRequest extends AmazonWebServiceRequest {

    private String reservedDBInstancesOfferingId;

    private String dBInstanceClass;

    private String duration;

    private String productDescription;

    private Boolean multiAZ;

    private Integer maxRecords;

    private String marker;

    /**
     * Default constructor for a new DescribeReservedDBInstancesOfferingsRequest object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public DescribeReservedDBInstancesOfferingsRequest() {}
    
    /**
     * Returns the value of the ReservedDBInstancesOfferingId property for
     * this object.
     *
     * @return The value of the ReservedDBInstancesOfferingId property for this
     *         object.
     */
    public String getReservedDBInstancesOfferingId() {
        return reservedDBInstancesOfferingId;
    }
    
    /**
     * Sets the value of the ReservedDBInstancesOfferingId property for this
     * object.
     *
     * @param reservedDBInstancesOfferingId The new value for the ReservedDBInstancesOfferingId property for this
     *         object.
     */
    public void setReservedDBInstancesOfferingId(String reservedDBInstancesOfferingId) {
        this.reservedDBInstancesOfferingId = reservedDBInstancesOfferingId;
    }
    
    /**
     * Sets the value of the ReservedDBInstancesOfferingId property for this
     * object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param reservedDBInstancesOfferingId The new value for the ReservedDBInstancesOfferingId property for this
     *         object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeReservedDBInstancesOfferingsRequest withReservedDBInstancesOfferingId(String reservedDBInstancesOfferingId) {
        this.reservedDBInstancesOfferingId = reservedDBInstancesOfferingId;
        return this;
    }
    
    
    /**
     * Returns the value of the DBInstanceClass property for this object.
     *
     * @return The value of the DBInstanceClass property for this object.
     */
    public String getDBInstanceClass() {
        return dBInstanceClass;
    }
    
    /**
     * Sets the value of the DBInstanceClass property for this object.
     *
     * @param dBInstanceClass The new value for the DBInstanceClass property for this object.
     */
    public void setDBInstanceClass(String dBInstanceClass) {
        this.dBInstanceClass = dBInstanceClass;
    }
    
    /**
     * Sets the value of the DBInstanceClass property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param dBInstanceClass The new value for the DBInstanceClass property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeReservedDBInstancesOfferingsRequest withDBInstanceClass(String dBInstanceClass) {
        this.dBInstanceClass = dBInstanceClass;
        return this;
    }
    
    
    /**
     * Returns the value of the Duration property for this object.
     *
     * @return The value of the Duration property for this object.
     */
    public String getDuration() {
        return duration;
    }
    
    /**
     * Sets the value of the Duration property for this object.
     *
     * @param duration The new value for the Duration property for this object.
     */
    public void setDuration(String duration) {
        this.duration = duration;
    }
    
    /**
     * Sets the value of the Duration property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param duration The new value for the Duration property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeReservedDBInstancesOfferingsRequest withDuration(String duration) {
        this.duration = duration;
        return this;
    }
    
    
    /**
     * Returns the value of the ProductDescription property for this object.
     *
     * @return The value of the ProductDescription property for this object.
     */
    public String getProductDescription() {
        return productDescription;
    }
    
    /**
     * Sets the value of the ProductDescription property for this object.
     *
     * @param productDescription The new value for the ProductDescription property for this object.
     */
    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }
    
    /**
     * Sets the value of the ProductDescription property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param productDescription The new value for the ProductDescription property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeReservedDBInstancesOfferingsRequest withProductDescription(String productDescription) {
        this.productDescription = productDescription;
        return this;
    }
    
    
    /**
     * Returns the value of the MultiAZ property for this object.
     *
     * @return The value of the MultiAZ property for this object.
     */
    public Boolean isMultiAZ() {
        return multiAZ;
    }
    
    /**
     * Sets the value of the MultiAZ property for this object.
     *
     * @param multiAZ The new value for the MultiAZ property for this object.
     */
    public void setMultiAZ(Boolean multiAZ) {
        this.multiAZ = multiAZ;
    }
    
    /**
     * Sets the value of the MultiAZ property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param multiAZ The new value for the MultiAZ property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeReservedDBInstancesOfferingsRequest withMultiAZ(Boolean multiAZ) {
        this.multiAZ = multiAZ;
        return this;
    }
    
    
    /**
     * Returns the value of the MultiAZ property for this object.
     *
     * @return The value of the MultiAZ property for this object.
     */
    public Boolean getMultiAZ() {
        return multiAZ;
    }
    
    /**
     * Returns the value of the MaxRecords property for this object.
     *
     * @return The value of the MaxRecords property for this object.
     */
    public Integer getMaxRecords() {
        return maxRecords;
    }
    
    /**
     * Sets the value of the MaxRecords property for this object.
     *
     * @param maxRecords The new value for the MaxRecords property for this object.
     */
    public void setMaxRecords(Integer maxRecords) {
        this.maxRecords = maxRecords;
    }
    
    /**
     * Sets the value of the MaxRecords property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param maxRecords The new value for the MaxRecords property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeReservedDBInstancesOfferingsRequest withMaxRecords(Integer maxRecords) {
        this.maxRecords = maxRecords;
        return this;
    }
    
    
    /**
     * Returns the value of the Marker property for this object.
     *
     * @return The value of the Marker property for this object.
     */
    public String getMarker() {
        return marker;
    }
    
    /**
     * Sets the value of the Marker property for this object.
     *
     * @param marker The new value for the Marker property for this object.
     */
    public void setMarker(String marker) {
        this.marker = marker;
    }
    
    /**
     * Sets the value of the Marker property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param marker The new value for the Marker property for this object.
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
    