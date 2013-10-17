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
package com.amazonaws.services.redshift.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.redshift.AmazonRedshift#describeReservedNodeOfferings(DescribeReservedNodeOfferingsRequest) DescribeReservedNodeOfferings operation}.
 * <p>
 * Returns a list of the available reserved node offerings by Amazon Redshift with their descriptions including the node type, the fixed and recurring
 * costs of reserving the node and duration the node will be reserved for you. These descriptions help you determine which reserve node offering you want
 * to purchase. You then use the unique offering ID in you call to PurchaseReservedNodeOffering to reserve one or more nodes for your Amazon Redshift
 * cluster.
 * </p>
 * <p>
 * For more information about managing parameter groups, go to <a
 * href="http://docs.aws.amazon.com/redshift/latest/mgmt/purchase-reserved-node-instance.html"> Purchasing Reserved Nodes </a> in the <i>Amazon Redshift
 * Management Guide</i> .
 * 
 * 
 * </p>
 *
 * @see com.amazonaws.services.redshift.AmazonRedshift#describeReservedNodeOfferings(DescribeReservedNodeOfferingsRequest)
 */
public class DescribeReservedNodeOfferingsRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * The unique identifier for the offering.
     */
    private String reservedNodeOfferingId;

    /**
     * The maximum number of records to include in the response. If more
     * records exist than the specified <code>MaxRecords</code> value, a
     * marker is included in the response so that the remaining results may
     * be retrieved. <p>Default: <code>100</code> <p>Constraints: minimum 20,
     * maximum 100.
     */
    private Integer maxRecords;

    /**
     * An optional marker returned by a previous
     * <a>DescribeReservedNodeOfferings</a> request to indicate the first
     * offering that the request will return. <p>You can specify either a
     * <b>Marker</b> parameter or a <b>ClusterIdentifier</b> parameter in a
     * <a>DescribeClusters</a> request, but not both.
     */
    private String marker;

    /**
     * The unique identifier for the offering.
     *
     * @return The unique identifier for the offering.
     */
    public String getReservedNodeOfferingId() {
        return reservedNodeOfferingId;
    }
    
    /**
     * The unique identifier for the offering.
     *
     * @param reservedNodeOfferingId The unique identifier for the offering.
     */
    public void setReservedNodeOfferingId(String reservedNodeOfferingId) {
        this.reservedNodeOfferingId = reservedNodeOfferingId;
    }
    
    /**
     * The unique identifier for the offering.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param reservedNodeOfferingId The unique identifier for the offering.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeReservedNodeOfferingsRequest withReservedNodeOfferingId(String reservedNodeOfferingId) {
        this.reservedNodeOfferingId = reservedNodeOfferingId;
        return this;
    }

    /**
     * The maximum number of records to include in the response. If more
     * records exist than the specified <code>MaxRecords</code> value, a
     * marker is included in the response so that the remaining results may
     * be retrieved. <p>Default: <code>100</code> <p>Constraints: minimum 20,
     * maximum 100.
     *
     * @return The maximum number of records to include in the response. If more
     *         records exist than the specified <code>MaxRecords</code> value, a
     *         marker is included in the response so that the remaining results may
     *         be retrieved. <p>Default: <code>100</code> <p>Constraints: minimum 20,
     *         maximum 100.
     */
    public Integer getMaxRecords() {
        return maxRecords;
    }
    
    /**
     * The maximum number of records to include in the response. If more
     * records exist than the specified <code>MaxRecords</code> value, a
     * marker is included in the response so that the remaining results may
     * be retrieved. <p>Default: <code>100</code> <p>Constraints: minimum 20,
     * maximum 100.
     *
     * @param maxRecords The maximum number of records to include in the response. If more
     *         records exist than the specified <code>MaxRecords</code> value, a
     *         marker is included in the response so that the remaining results may
     *         be retrieved. <p>Default: <code>100</code> <p>Constraints: minimum 20,
     *         maximum 100.
     */
    public void setMaxRecords(Integer maxRecords) {
        this.maxRecords = maxRecords;
    }
    
    /**
     * The maximum number of records to include in the response. If more
     * records exist than the specified <code>MaxRecords</code> value, a
     * marker is included in the response so that the remaining results may
     * be retrieved. <p>Default: <code>100</code> <p>Constraints: minimum 20,
     * maximum 100.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param maxRecords The maximum number of records to include in the response. If more
     *         records exist than the specified <code>MaxRecords</code> value, a
     *         marker is included in the response so that the remaining results may
     *         be retrieved. <p>Default: <code>100</code> <p>Constraints: minimum 20,
     *         maximum 100.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeReservedNodeOfferingsRequest withMaxRecords(Integer maxRecords) {
        this.maxRecords = maxRecords;
        return this;
    }

    /**
     * An optional marker returned by a previous
     * <a>DescribeReservedNodeOfferings</a> request to indicate the first
     * offering that the request will return. <p>You can specify either a
     * <b>Marker</b> parameter or a <b>ClusterIdentifier</b> parameter in a
     * <a>DescribeClusters</a> request, but not both.
     *
     * @return An optional marker returned by a previous
     *         <a>DescribeReservedNodeOfferings</a> request to indicate the first
     *         offering that the request will return. <p>You can specify either a
     *         <b>Marker</b> parameter or a <b>ClusterIdentifier</b> parameter in a
     *         <a>DescribeClusters</a> request, but not both.
     */
    public String getMarker() {
        return marker;
    }
    
    /**
     * An optional marker returned by a previous
     * <a>DescribeReservedNodeOfferings</a> request to indicate the first
     * offering that the request will return. <p>You can specify either a
     * <b>Marker</b> parameter or a <b>ClusterIdentifier</b> parameter in a
     * <a>DescribeClusters</a> request, but not both.
     *
     * @param marker An optional marker returned by a previous
     *         <a>DescribeReservedNodeOfferings</a> request to indicate the first
     *         offering that the request will return. <p>You can specify either a
     *         <b>Marker</b> parameter or a <b>ClusterIdentifier</b> parameter in a
     *         <a>DescribeClusters</a> request, but not both.
     */
    public void setMarker(String marker) {
        this.marker = marker;
    }
    
    /**
     * An optional marker returned by a previous
     * <a>DescribeReservedNodeOfferings</a> request to indicate the first
     * offering that the request will return. <p>You can specify either a
     * <b>Marker</b> parameter or a <b>ClusterIdentifier</b> parameter in a
     * <a>DescribeClusters</a> request, but not both.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param marker An optional marker returned by a previous
     *         <a>DescribeReservedNodeOfferings</a> request to indicate the first
     *         offering that the request will return. <p>You can specify either a
     *         <b>Marker</b> parameter or a <b>ClusterIdentifier</b> parameter in a
     *         <a>DescribeClusters</a> request, but not both.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeReservedNodeOfferingsRequest withMarker(String marker) {
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
        if (getReservedNodeOfferingId() != null) sb.append("ReservedNodeOfferingId: " + getReservedNodeOfferingId() + ",");
        if (getMaxRecords() != null) sb.append("MaxRecords: " + getMaxRecords() + ",");
        if (getMarker() != null) sb.append("Marker: " + getMarker() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getReservedNodeOfferingId() == null) ? 0 : getReservedNodeOfferingId().hashCode()); 
        hashCode = prime * hashCode + ((getMaxRecords() == null) ? 0 : getMaxRecords().hashCode()); 
        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DescribeReservedNodeOfferingsRequest == false) return false;
        DescribeReservedNodeOfferingsRequest other = (DescribeReservedNodeOfferingsRequest)obj;
        
        if (other.getReservedNodeOfferingId() == null ^ this.getReservedNodeOfferingId() == null) return false;
        if (other.getReservedNodeOfferingId() != null && other.getReservedNodeOfferingId().equals(this.getReservedNodeOfferingId()) == false) return false; 
        if (other.getMaxRecords() == null ^ this.getMaxRecords() == null) return false;
        if (other.getMaxRecords() != null && other.getMaxRecords().equals(this.getMaxRecords()) == false) return false; 
        if (other.getMarker() == null ^ this.getMarker() == null) return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false) return false; 
        return true;
    }
    
}
    