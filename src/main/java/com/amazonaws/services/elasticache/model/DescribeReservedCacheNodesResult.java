/*
 * Copyright 2010-2012 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

/**
 * <p>
 * Contains the result of a successful invocation of the
 * DescribeReservedCacheNodes action.
 * </p>
 */
public class DescribeReservedCacheNodesResult {

    /**
     * The marker provided for paginated results.
     */
    private String marker;

    /**
     * A list of of reserved Cache Nodes.
     */
    private java.util.List<ReservedCacheNode> reservedCacheNodes;

    /**
     * The marker provided for paginated results.
     *
     * @return The marker provided for paginated results.
     */
    public String getMarker() {
        return marker;
    }
    
    /**
     * The marker provided for paginated results.
     *
     * @param marker The marker provided for paginated results.
     */
    public void setMarker(String marker) {
        this.marker = marker;
    }
    
    /**
     * The marker provided for paginated results.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param marker The marker provided for paginated results.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeReservedCacheNodesResult withMarker(String marker) {
        this.marker = marker;
        return this;
    }
    
    
    /**
     * A list of of reserved Cache Nodes.
     *
     * @return A list of of reserved Cache Nodes.
     */
    public java.util.List<ReservedCacheNode> getReservedCacheNodes() {
        
        if (reservedCacheNodes == null) {
            reservedCacheNodes = new java.util.ArrayList<ReservedCacheNode>();
        }
        return reservedCacheNodes;
    }
    
    /**
     * A list of of reserved Cache Nodes.
     *
     * @param reservedCacheNodes A list of of reserved Cache Nodes.
     */
    public void setReservedCacheNodes(java.util.Collection<ReservedCacheNode> reservedCacheNodes) {
        if (reservedCacheNodes == null) {
            this.reservedCacheNodes = null;
            return;
        }

        java.util.List<ReservedCacheNode> reservedCacheNodesCopy = new java.util.ArrayList<ReservedCacheNode>(reservedCacheNodes.size());
        reservedCacheNodesCopy.addAll(reservedCacheNodes);
        this.reservedCacheNodes = reservedCacheNodesCopy;
    }
    
    /**
     * A list of of reserved Cache Nodes.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param reservedCacheNodes A list of of reserved Cache Nodes.
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
     * A list of of reserved Cache Nodes.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param reservedCacheNodes A list of of reserved Cache Nodes.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeReservedCacheNodesResult withReservedCacheNodes(java.util.Collection<ReservedCacheNode> reservedCacheNodes) {
        if (reservedCacheNodes == null) {
            this.reservedCacheNodes = null;
        } else {
            java.util.List<ReservedCacheNode> reservedCacheNodesCopy = new java.util.ArrayList<ReservedCacheNode>(reservedCacheNodes.size());
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
        if (marker != null) sb.append("Marker: " + marker + ", ");
        if (reservedCacheNodes != null) sb.append("ReservedCacheNodes: " + reservedCacheNodes + ", ");
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
    