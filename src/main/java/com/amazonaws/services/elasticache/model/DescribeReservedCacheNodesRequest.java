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
package com.amazonaws.services.elasticache.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.elasticache.AmazonElastiCache#describeReservedCacheNodes(DescribeReservedCacheNodesRequest) DescribeReservedCacheNodes operation}.
 * <p>
 * The <i>DescribeReservedCacheNodes</i> operation returns information about reserved cache nodes for this account, or about a specified reserved cache
 * node.
 * </p>
 *
 * @see com.amazonaws.services.elasticache.AmazonElastiCache#describeReservedCacheNodes(DescribeReservedCacheNodesRequest)
 */
public class DescribeReservedCacheNodesRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * The reserved cache node identifier filter value. Use this parameter to
     * show only the reservation that matches the specified reservation ID.
     */
    private String reservedCacheNodeId;

    /**
     * The offering identifier filter value. Use this parameter to show only
     * purchased reservations matching the specified offering identifier.
     */
    private String reservedCacheNodesOfferingId;

    /**
     * The cache node type filter value. Use this parameter to show only
     * those reservations matching the specified cache node type.
     */
    private String cacheNodeType;

    /**
     * The duration filter value, specified in years or seconds. Use this
     * parameter to show only reservations for this duration. <p>Valid
     * Values: <code>1 | 3 | 31536000 | 94608000</code>
     */
    private String duration;

    /**
     * The product description filter value. Use this parameter to show only
     * those reservations matching the specified product description.
     */
    private String productDescription;

    /**
     * The offering type filter value. Use this parameter to show only the
     * available offerings matching the specified offering type. <p>Valid
     * values: <code>"Light Utilization" | "Medium Utilization" | "Heavy
     * Utilization" </code>
     */
    private String offeringType;

    /**
     * The maximum number of records to include in the response. If more
     * records exist than the specified <code>MaxRecords</code> value, a
     * marker is included in the response so that the remaining results can
     * be retrieved. <p>Default: 100<p>Constraints: minimum 20; maximum 100.
     */
    private Integer maxRecords;

    /**
     * An optional marker returned from a prior request. Use this marker for
     * pagination of results from this operation. If this parameter is
     * specified, the response includes only records beyond the marker, up to
     * the value specified by <i>MaxRecords</i>.
     */
    private String marker;

    /**
     * The reserved cache node identifier filter value. Use this parameter to
     * show only the reservation that matches the specified reservation ID.
     *
     * @return The reserved cache node identifier filter value. Use this parameter to
     *         show only the reservation that matches the specified reservation ID.
     */
    public String getReservedCacheNodeId() {
        return reservedCacheNodeId;
    }
    
    /**
     * The reserved cache node identifier filter value. Use this parameter to
     * show only the reservation that matches the specified reservation ID.
     *
     * @param reservedCacheNodeId The reserved cache node identifier filter value. Use this parameter to
     *         show only the reservation that matches the specified reservation ID.
     */
    public void setReservedCacheNodeId(String reservedCacheNodeId) {
        this.reservedCacheNodeId = reservedCacheNodeId;
    }
    
    /**
     * The reserved cache node identifier filter value. Use this parameter to
     * show only the reservation that matches the specified reservation ID.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param reservedCacheNodeId The reserved cache node identifier filter value. Use this parameter to
     *         show only the reservation that matches the specified reservation ID.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeReservedCacheNodesRequest withReservedCacheNodeId(String reservedCacheNodeId) {
        this.reservedCacheNodeId = reservedCacheNodeId;
        return this;
    }

    /**
     * The offering identifier filter value. Use this parameter to show only
     * purchased reservations matching the specified offering identifier.
     *
     * @return The offering identifier filter value. Use this parameter to show only
     *         purchased reservations matching the specified offering identifier.
     */
    public String getReservedCacheNodesOfferingId() {
        return reservedCacheNodesOfferingId;
    }
    
    /**
     * The offering identifier filter value. Use this parameter to show only
     * purchased reservations matching the specified offering identifier.
     *
     * @param reservedCacheNodesOfferingId The offering identifier filter value. Use this parameter to show only
     *         purchased reservations matching the specified offering identifier.
     */
    public void setReservedCacheNodesOfferingId(String reservedCacheNodesOfferingId) {
        this.reservedCacheNodesOfferingId = reservedCacheNodesOfferingId;
    }
    
    /**
     * The offering identifier filter value. Use this parameter to show only
     * purchased reservations matching the specified offering identifier.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param reservedCacheNodesOfferingId The offering identifier filter value. Use this parameter to show only
     *         purchased reservations matching the specified offering identifier.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeReservedCacheNodesRequest withReservedCacheNodesOfferingId(String reservedCacheNodesOfferingId) {
        this.reservedCacheNodesOfferingId = reservedCacheNodesOfferingId;
        return this;
    }

    /**
     * The cache node type filter value. Use this parameter to show only
     * those reservations matching the specified cache node type.
     *
     * @return The cache node type filter value. Use this parameter to show only
     *         those reservations matching the specified cache node type.
     */
    public String getCacheNodeType() {
        return cacheNodeType;
    }
    
    /**
     * The cache node type filter value. Use this parameter to show only
     * those reservations matching the specified cache node type.
     *
     * @param cacheNodeType The cache node type filter value. Use this parameter to show only
     *         those reservations matching the specified cache node type.
     */
    public void setCacheNodeType(String cacheNodeType) {
        this.cacheNodeType = cacheNodeType;
    }
    
    /**
     * The cache node type filter value. Use this parameter to show only
     * those reservations matching the specified cache node type.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param cacheNodeType The cache node type filter value. Use this parameter to show only
     *         those reservations matching the specified cache node type.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeReservedCacheNodesRequest withCacheNodeType(String cacheNodeType) {
        this.cacheNodeType = cacheNodeType;
        return this;
    }

    /**
     * The duration filter value, specified in years or seconds. Use this
     * parameter to show only reservations for this duration. <p>Valid
     * Values: <code>1 | 3 | 31536000 | 94608000</code>
     *
     * @return The duration filter value, specified in years or seconds. Use this
     *         parameter to show only reservations for this duration. <p>Valid
     *         Values: <code>1 | 3 | 31536000 | 94608000</code>
     */
    public String getDuration() {
        return duration;
    }
    
    /**
     * The duration filter value, specified in years or seconds. Use this
     * parameter to show only reservations for this duration. <p>Valid
     * Values: <code>1 | 3 | 31536000 | 94608000</code>
     *
     * @param duration The duration filter value, specified in years or seconds. Use this
     *         parameter to show only reservations for this duration. <p>Valid
     *         Values: <code>1 | 3 | 31536000 | 94608000</code>
     */
    public void setDuration(String duration) {
        this.duration = duration;
    }
    
    /**
     * The duration filter value, specified in years or seconds. Use this
     * parameter to show only reservations for this duration. <p>Valid
     * Values: <code>1 | 3 | 31536000 | 94608000</code>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param duration The duration filter value, specified in years or seconds. Use this
     *         parameter to show only reservations for this duration. <p>Valid
     *         Values: <code>1 | 3 | 31536000 | 94608000</code>
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeReservedCacheNodesRequest withDuration(String duration) {
        this.duration = duration;
        return this;
    }

    /**
     * The product description filter value. Use this parameter to show only
     * those reservations matching the specified product description.
     *
     * @return The product description filter value. Use this parameter to show only
     *         those reservations matching the specified product description.
     */
    public String getProductDescription() {
        return productDescription;
    }
    
    /**
     * The product description filter value. Use this parameter to show only
     * those reservations matching the specified product description.
     *
     * @param productDescription The product description filter value. Use this parameter to show only
     *         those reservations matching the specified product description.
     */
    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }
    
    /**
     * The product description filter value. Use this parameter to show only
     * those reservations matching the specified product description.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param productDescription The product description filter value. Use this parameter to show only
     *         those reservations matching the specified product description.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeReservedCacheNodesRequest withProductDescription(String productDescription) {
        this.productDescription = productDescription;
        return this;
    }

    /**
     * The offering type filter value. Use this parameter to show only the
     * available offerings matching the specified offering type. <p>Valid
     * values: <code>"Light Utilization" | "Medium Utilization" | "Heavy
     * Utilization" </code>
     *
     * @return The offering type filter value. Use this parameter to show only the
     *         available offerings matching the specified offering type. <p>Valid
     *         values: <code>"Light Utilization" | "Medium Utilization" | "Heavy
     *         Utilization" </code>
     */
    public String getOfferingType() {
        return offeringType;
    }
    
    /**
     * The offering type filter value. Use this parameter to show only the
     * available offerings matching the specified offering type. <p>Valid
     * values: <code>"Light Utilization" | "Medium Utilization" | "Heavy
     * Utilization" </code>
     *
     * @param offeringType The offering type filter value. Use this parameter to show only the
     *         available offerings matching the specified offering type. <p>Valid
     *         values: <code>"Light Utilization" | "Medium Utilization" | "Heavy
     *         Utilization" </code>
     */
    public void setOfferingType(String offeringType) {
        this.offeringType = offeringType;
    }
    
    /**
     * The offering type filter value. Use this parameter to show only the
     * available offerings matching the specified offering type. <p>Valid
     * values: <code>"Light Utilization" | "Medium Utilization" | "Heavy
     * Utilization" </code>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param offeringType The offering type filter value. Use this parameter to show only the
     *         available offerings matching the specified offering type. <p>Valid
     *         values: <code>"Light Utilization" | "Medium Utilization" | "Heavy
     *         Utilization" </code>
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeReservedCacheNodesRequest withOfferingType(String offeringType) {
        this.offeringType = offeringType;
        return this;
    }

    /**
     * The maximum number of records to include in the response. If more
     * records exist than the specified <code>MaxRecords</code> value, a
     * marker is included in the response so that the remaining results can
     * be retrieved. <p>Default: 100<p>Constraints: minimum 20; maximum 100.
     *
     * @return The maximum number of records to include in the response. If more
     *         records exist than the specified <code>MaxRecords</code> value, a
     *         marker is included in the response so that the remaining results can
     *         be retrieved. <p>Default: 100<p>Constraints: minimum 20; maximum 100.
     */
    public Integer getMaxRecords() {
        return maxRecords;
    }
    
    /**
     * The maximum number of records to include in the response. If more
     * records exist than the specified <code>MaxRecords</code> value, a
     * marker is included in the response so that the remaining results can
     * be retrieved. <p>Default: 100<p>Constraints: minimum 20; maximum 100.
     *
     * @param maxRecords The maximum number of records to include in the response. If more
     *         records exist than the specified <code>MaxRecords</code> value, a
     *         marker is included in the response so that the remaining results can
     *         be retrieved. <p>Default: 100<p>Constraints: minimum 20; maximum 100.
     */
    public void setMaxRecords(Integer maxRecords) {
        this.maxRecords = maxRecords;
    }
    
    /**
     * The maximum number of records to include in the response. If more
     * records exist than the specified <code>MaxRecords</code> value, a
     * marker is included in the response so that the remaining results can
     * be retrieved. <p>Default: 100<p>Constraints: minimum 20; maximum 100.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param maxRecords The maximum number of records to include in the response. If more
     *         records exist than the specified <code>MaxRecords</code> value, a
     *         marker is included in the response so that the remaining results can
     *         be retrieved. <p>Default: 100<p>Constraints: minimum 20; maximum 100.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeReservedCacheNodesRequest withMaxRecords(Integer maxRecords) {
        this.maxRecords = maxRecords;
        return this;
    }

    /**
     * An optional marker returned from a prior request. Use this marker for
     * pagination of results from this operation. If this parameter is
     * specified, the response includes only records beyond the marker, up to
     * the value specified by <i>MaxRecords</i>.
     *
     * @return An optional marker returned from a prior request. Use this marker for
     *         pagination of results from this operation. If this parameter is
     *         specified, the response includes only records beyond the marker, up to
     *         the value specified by <i>MaxRecords</i>.
     */
    public String getMarker() {
        return marker;
    }
    
    /**
     * An optional marker returned from a prior request. Use this marker for
     * pagination of results from this operation. If this parameter is
     * specified, the response includes only records beyond the marker, up to
     * the value specified by <i>MaxRecords</i>.
     *
     * @param marker An optional marker returned from a prior request. Use this marker for
     *         pagination of results from this operation. If this parameter is
     *         specified, the response includes only records beyond the marker, up to
     *         the value specified by <i>MaxRecords</i>.
     */
    public void setMarker(String marker) {
        this.marker = marker;
    }
    
    /**
     * An optional marker returned from a prior request. Use this marker for
     * pagination of results from this operation. If this parameter is
     * specified, the response includes only records beyond the marker, up to
     * the value specified by <i>MaxRecords</i>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param marker An optional marker returned from a prior request. Use this marker for
     *         pagination of results from this operation. If this parameter is
     *         specified, the response includes only records beyond the marker, up to
     *         the value specified by <i>MaxRecords</i>.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeReservedCacheNodesRequest withMarker(String marker) {
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
        if (getReservedCacheNodeId() != null) sb.append("ReservedCacheNodeId: " + getReservedCacheNodeId() + ",");
        if (getReservedCacheNodesOfferingId() != null) sb.append("ReservedCacheNodesOfferingId: " + getReservedCacheNodesOfferingId() + ",");
        if (getCacheNodeType() != null) sb.append("CacheNodeType: " + getCacheNodeType() + ",");
        if (getDuration() != null) sb.append("Duration: " + getDuration() + ",");
        if (getProductDescription() != null) sb.append("ProductDescription: " + getProductDescription() + ",");
        if (getOfferingType() != null) sb.append("OfferingType: " + getOfferingType() + ",");
        if (getMaxRecords() != null) sb.append("MaxRecords: " + getMaxRecords() + ",");
        if (getMarker() != null) sb.append("Marker: " + getMarker() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getReservedCacheNodeId() == null) ? 0 : getReservedCacheNodeId().hashCode()); 
        hashCode = prime * hashCode + ((getReservedCacheNodesOfferingId() == null) ? 0 : getReservedCacheNodesOfferingId().hashCode()); 
        hashCode = prime * hashCode + ((getCacheNodeType() == null) ? 0 : getCacheNodeType().hashCode()); 
        hashCode = prime * hashCode + ((getDuration() == null) ? 0 : getDuration().hashCode()); 
        hashCode = prime * hashCode + ((getProductDescription() == null) ? 0 : getProductDescription().hashCode()); 
        hashCode = prime * hashCode + ((getOfferingType() == null) ? 0 : getOfferingType().hashCode()); 
        hashCode = prime * hashCode + ((getMaxRecords() == null) ? 0 : getMaxRecords().hashCode()); 
        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DescribeReservedCacheNodesRequest == false) return false;
        DescribeReservedCacheNodesRequest other = (DescribeReservedCacheNodesRequest)obj;
        
        if (other.getReservedCacheNodeId() == null ^ this.getReservedCacheNodeId() == null) return false;
        if (other.getReservedCacheNodeId() != null && other.getReservedCacheNodeId().equals(this.getReservedCacheNodeId()) == false) return false; 
        if (other.getReservedCacheNodesOfferingId() == null ^ this.getReservedCacheNodesOfferingId() == null) return false;
        if (other.getReservedCacheNodesOfferingId() != null && other.getReservedCacheNodesOfferingId().equals(this.getReservedCacheNodesOfferingId()) == false) return false; 
        if (other.getCacheNodeType() == null ^ this.getCacheNodeType() == null) return false;
        if (other.getCacheNodeType() != null && other.getCacheNodeType().equals(this.getCacheNodeType()) == false) return false; 
        if (other.getDuration() == null ^ this.getDuration() == null) return false;
        if (other.getDuration() != null && other.getDuration().equals(this.getDuration()) == false) return false; 
        if (other.getProductDescription() == null ^ this.getProductDescription() == null) return false;
        if (other.getProductDescription() != null && other.getProductDescription().equals(this.getProductDescription()) == false) return false; 
        if (other.getOfferingType() == null ^ this.getOfferingType() == null) return false;
        if (other.getOfferingType() != null && other.getOfferingType().equals(this.getOfferingType()) == false) return false; 
        if (other.getMaxRecords() == null ^ this.getMaxRecords() == null) return false;
        if (other.getMaxRecords() != null && other.getMaxRecords().equals(this.getMaxRecords()) == false) return false; 
        if (other.getMarker() == null ^ this.getMarker() == null) return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false) return false; 
        return true;
    }
    
}
    