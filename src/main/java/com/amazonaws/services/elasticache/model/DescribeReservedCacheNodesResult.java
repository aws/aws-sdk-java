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


/**
 * <p>
 * Represents the output of a <i>DescribeReservedCacheNodes</i> operation.
 * </p>
 */
public class DescribeReservedCacheNodesResult implements Serializable {

    /**
     * Provides an identifier to allow retrieval of paginated results.
     */
    private String marker;

    /**
     * A list of reserved cache nodes. Each element in the list contains
     * detailed information about one node.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<ReservedCacheNode> reservedCacheNodes;

    /**
     * Provides an identifier to allow retrieval of paginated results.
     *
     * @return Provides an identifier to allow retrieval of paginated results.
     */
    public String getMarker() {
        return marker;
    }
    
    /**
     * Provides an identifier to allow retrieval of paginated results.
     *
     * @param marker Provides an identifier to allow retrieval of paginated results.
     */
    public void setMarker(String marker) {
        this.marker = marker;
    }
    
    /**
     * Provides an identifier to allow retrieval of paginated results.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param marker Provides an identifier to allow retrieval of paginated results.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeReservedCacheNodesResult withMarker(String marker) {
        this.marker = marker;
        return this;
    }

    /**
     * A list of reserved cache nodes. Each element in the list contains
     * detailed information about one node.
     *
     * @return A list of reserved cache nodes. Each element in the list contains
     *         detailed information about one node.
     */
    public java.util.List<ReservedCacheNode> getReservedCacheNodes() {
        if (reservedCacheNodes == null) {
              reservedCacheNodes = new com.amazonaws.internal.ListWithAutoConstructFlag<ReservedCacheNode>();
              reservedCacheNodes.setAutoConstruct(true);
        }
        return reservedCacheNodes;
    }
    
    /**
     * A list of reserved cache nodes. Each element in the list contains
     * detailed information about one node.
     *
     * @param reservedCacheNodes A list of reserved cache nodes. Each element in the list contains
     *         detailed information about one node.
     */
    public void setReservedCacheNodes(java.util.Collection<ReservedCacheNode> reservedCacheNodes) {
        if (reservedCacheNodes == null) {
            this.reservedCacheNodes = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<ReservedCacheNode> reservedCacheNodesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<ReservedCacheNode>(reservedCacheNodes.size());
        reservedCacheNodesCopy.addAll(reservedCacheNodes);
        this.reservedCacheNodes = reservedCacheNodesCopy;
    }
    
    /**
     * A list of reserved cache nodes. Each element in the list contains
     * detailed information about one node.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param reservedCacheNodes A list of reserved cache nodes. Each element in the list contains
     *         detailed information about one node.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeReservedCacheNodesResult withReservedCacheNodes(ReservedCacheNode... reservedCacheNodes) {
        if (getReservedCacheNodes() == null) setReservedCacheNodes(new java.util.ArrayList<ReservedCacheNode>(reservedCacheNodes.length));
        for (ReservedCacheNode value : reservedCacheNodes) {
            getReservedCacheNodes().add(value);
        }
        return this;
    }
    
    /**
     * A list of reserved cache nodes. Each element in the list contains
     * detailed information about one node.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param reservedCacheNodes A list of reserved cache nodes. Each element in the list contains
     *         detailed information about one node.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeReservedCacheNodesResult withReservedCacheNodes(java.util.Collection<ReservedCacheNode> reservedCacheNodes) {
        if (reservedCacheNodes == null) {
            this.reservedCacheNodes = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<ReservedCacheNode> reservedCacheNodesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<ReservedCacheNode>(reservedCacheNodes.size());
            reservedCacheNodesCopy.addAll(reservedCacheNodes);
            this.reservedCacheNodes = reservedCacheNodesCopy;
        }

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
        if (getMarker() != null) sb.append("Marker: " + getMarker() + ",");
        if (getReservedCacheNodes() != null) sb.append("ReservedCacheNodes: " + getReservedCacheNodes() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode()); 
        hashCode = prime * hashCode + ((getReservedCacheNodes() == null) ? 0 : getReservedCacheNodes().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DescribeReservedCacheNodesResult == false) return false;
        DescribeReservedCacheNodesResult other = (DescribeReservedCacheNodesResult)obj;
        
        if (other.getMarker() == null ^ this.getMarker() == null) return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false) return false; 
        if (other.getReservedCacheNodes() == null ^ this.getReservedCacheNodes() == null) return false;
        if (other.getReservedCacheNodes() != null && other.getReservedCacheNodes().equals(this.getReservedCacheNodes()) == false) return false; 
        return true;
    }
    
}
    