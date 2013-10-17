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
 * Container for the parameters to the {@link com.amazonaws.services.redshift.AmazonRedshift#describeReservedNodes(DescribeReservedNodesRequest) DescribeReservedNodes operation}.
 * <p>
 * Returns the descriptions of the reserved nodes.
 * </p>
 *
 * @see com.amazonaws.services.redshift.AmazonRedshift#describeReservedNodes(DescribeReservedNodesRequest)
 */
public class DescribeReservedNodesRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * Identifier for the node reservation.
     */
    private String reservedNodeId;

    /**
     * The maximum number of records to include in the response. If more
     * records exist than the specified <code>MaxRecords</code> value, a
     * marker is included in the response so that the remaining results may
     * be retrieved. <p>Default: <code>100</code> <p>Constraints: minimum 20,
     * maximum 100.
     */
    private Integer maxRecords;

    /**
     * An optional marker returned by a previous <a>DescribeReservedNodes</a>
     * request to indicate the first parameter group that the current request
     * will return.
     */
    private String marker;

    /**
     * Identifier for the node reservation.
     *
     * @return Identifier for the node reservation.
     */
    public String getReservedNodeId() {
        return reservedNodeId;
    }
    
    /**
     * Identifier for the node reservation.
     *
     * @param reservedNodeId Identifier for the node reservation.
     */
    public void setReservedNodeId(String reservedNodeId) {
        this.reservedNodeId = reservedNodeId;
    }
    
    /**
     * Identifier for the node reservation.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param reservedNodeId Identifier for the node reservation.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeReservedNodesRequest withReservedNodeId(String reservedNodeId) {
        this.reservedNodeId = reservedNodeId;
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
    public DescribeReservedNodesRequest withMaxRecords(Integer maxRecords) {
        this.maxRecords = maxRecords;
        return this;
    }

    /**
     * An optional marker returned by a previous <a>DescribeReservedNodes</a>
     * request to indicate the first parameter group that the current request
     * will return.
     *
     * @return An optional marker returned by a previous <a>DescribeReservedNodes</a>
     *         request to indicate the first parameter group that the current request
     *         will return.
     */
    public String getMarker() {
        return marker;
    }
    
    /**
     * An optional marker returned by a previous <a>DescribeReservedNodes</a>
     * request to indicate the first parameter group that the current request
     * will return.
     *
     * @param marker An optional marker returned by a previous <a>DescribeReservedNodes</a>
     *         request to indicate the first parameter group that the current request
     *         will return.
     */
    public void setMarker(String marker) {
        this.marker = marker;
    }
    
    /**
     * An optional marker returned by a previous <a>DescribeReservedNodes</a>
     * request to indicate the first parameter group that the current request
     * will return.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param marker An optional marker returned by a previous <a>DescribeReservedNodes</a>
     *         request to indicate the first parameter group that the current request
     *         will return.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeReservedNodesRequest withMarker(String marker) {
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
        if (getReservedNodeId() != null) sb.append("ReservedNodeId: " + getReservedNodeId() + ",");
        if (getMaxRecords() != null) sb.append("MaxRecords: " + getMaxRecords() + ",");
        if (getMarker() != null) sb.append("Marker: " + getMarker() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getReservedNodeId() == null) ? 0 : getReservedNodeId().hashCode()); 
        hashCode = prime * hashCode + ((getMaxRecords() == null) ? 0 : getMaxRecords().hashCode()); 
        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DescribeReservedNodesRequest == false) return false;
        DescribeReservedNodesRequest other = (DescribeReservedNodesRequest)obj;
        
        if (other.getReservedNodeId() == null ^ this.getReservedNodeId() == null) return false;
        if (other.getReservedNodeId() != null && other.getReservedNodeId().equals(this.getReservedNodeId()) == false) return false; 
        if (other.getMaxRecords() == null ^ this.getMaxRecords() == null) return false;
        if (other.getMaxRecords() != null && other.getMaxRecords().equals(this.getMaxRecords()) == false) return false; 
        if (other.getMarker() == null ^ this.getMarker() == null) return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false) return false; 
        return true;
    }
    
}
    