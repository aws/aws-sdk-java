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


/**
 * <p>
 * Contains the output from the DescribeReservedNodes action.
 * </p>
 */
public class DescribeReservedNodesResult implements Serializable {

    /**
     * A marker that can be used to retrieve paginated results.
     */
    private String marker;

    /**
     * The list of reserved nodes.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<ReservedNode> reservedNodes;

    /**
     * A marker that can be used to retrieve paginated results.
     *
     * @return A marker that can be used to retrieve paginated results.
     */
    public String getMarker() {
        return marker;
    }
    
    /**
     * A marker that can be used to retrieve paginated results.
     *
     * @param marker A marker that can be used to retrieve paginated results.
     */
    public void setMarker(String marker) {
        this.marker = marker;
    }
    
    /**
     * A marker that can be used to retrieve paginated results.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param marker A marker that can be used to retrieve paginated results.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeReservedNodesResult withMarker(String marker) {
        this.marker = marker;
        return this;
    }

    /**
     * The list of reserved nodes.
     *
     * @return The list of reserved nodes.
     */
    public java.util.List<ReservedNode> getReservedNodes() {
        if (reservedNodes == null) {
              reservedNodes = new com.amazonaws.internal.ListWithAutoConstructFlag<ReservedNode>();
              reservedNodes.setAutoConstruct(true);
        }
        return reservedNodes;
    }
    
    /**
     * The list of reserved nodes.
     *
     * @param reservedNodes The list of reserved nodes.
     */
    public void setReservedNodes(java.util.Collection<ReservedNode> reservedNodes) {
        if (reservedNodes == null) {
            this.reservedNodes = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<ReservedNode> reservedNodesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<ReservedNode>(reservedNodes.size());
        reservedNodesCopy.addAll(reservedNodes);
        this.reservedNodes = reservedNodesCopy;
    }
    
    /**
     * The list of reserved nodes.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param reservedNodes The list of reserved nodes.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeReservedNodesResult withReservedNodes(ReservedNode... reservedNodes) {
        if (getReservedNodes() == null) setReservedNodes(new java.util.ArrayList<ReservedNode>(reservedNodes.length));
        for (ReservedNode value : reservedNodes) {
            getReservedNodes().add(value);
        }
        return this;
    }
    
    /**
     * The list of reserved nodes.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param reservedNodes The list of reserved nodes.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeReservedNodesResult withReservedNodes(java.util.Collection<ReservedNode> reservedNodes) {
        if (reservedNodes == null) {
            this.reservedNodes = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<ReservedNode> reservedNodesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<ReservedNode>(reservedNodes.size());
            reservedNodesCopy.addAll(reservedNodes);
            this.reservedNodes = reservedNodesCopy;
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
        if (getReservedNodes() != null) sb.append("ReservedNodes: " + getReservedNodes() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode()); 
        hashCode = prime * hashCode + ((getReservedNodes() == null) ? 0 : getReservedNodes().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DescribeReservedNodesResult == false) return false;
        DescribeReservedNodesResult other = (DescribeReservedNodesResult)obj;
        
        if (other.getMarker() == null ^ this.getMarker() == null) return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false) return false; 
        if (other.getReservedNodes() == null ^ this.getReservedNodes() == null) return false;
        if (other.getReservedNodes() != null && other.getReservedNodes().equals(this.getReservedNodes()) == false) return false; 
        return true;
    }
    
}
    