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
 * Describes an orderable cluster option.
 * </p>
 */
public class OrderableClusterOption implements Serializable {

    /**
     * The version of the orderable cluster.
     */
    private String clusterVersion;

    /**
     * The cluster type, for example <code>multi-node</code>.
     */
    private String clusterType;

    /**
     * The node type for the orderable cluster.
     */
    private String nodeType;

    /**
     * A list of availability zones for the orderable cluster.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<AvailabilityZone> availabilityZones;

    /**
     * The version of the orderable cluster.
     *
     * @return The version of the orderable cluster.
     */
    public String getClusterVersion() {
        return clusterVersion;
    }
    
    /**
     * The version of the orderable cluster.
     *
     * @param clusterVersion The version of the orderable cluster.
     */
    public void setClusterVersion(String clusterVersion) {
        this.clusterVersion = clusterVersion;
    }
    
    /**
     * The version of the orderable cluster.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param clusterVersion The version of the orderable cluster.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public OrderableClusterOption withClusterVersion(String clusterVersion) {
        this.clusterVersion = clusterVersion;
        return this;
    }

    /**
     * The cluster type, for example <code>multi-node</code>.
     *
     * @return The cluster type, for example <code>multi-node</code>.
     */
    public String getClusterType() {
        return clusterType;
    }
    
    /**
     * The cluster type, for example <code>multi-node</code>.
     *
     * @param clusterType The cluster type, for example <code>multi-node</code>.
     */
    public void setClusterType(String clusterType) {
        this.clusterType = clusterType;
    }
    
    /**
     * The cluster type, for example <code>multi-node</code>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param clusterType The cluster type, for example <code>multi-node</code>.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public OrderableClusterOption withClusterType(String clusterType) {
        this.clusterType = clusterType;
        return this;
    }

    /**
     * The node type for the orderable cluster.
     *
     * @return The node type for the orderable cluster.
     */
    public String getNodeType() {
        return nodeType;
    }
    
    /**
     * The node type for the orderable cluster.
     *
     * @param nodeType The node type for the orderable cluster.
     */
    public void setNodeType(String nodeType) {
        this.nodeType = nodeType;
    }
    
    /**
     * The node type for the orderable cluster.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param nodeType The node type for the orderable cluster.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public OrderableClusterOption withNodeType(String nodeType) {
        this.nodeType = nodeType;
        return this;
    }

    /**
     * A list of availability zones for the orderable cluster.
     *
     * @return A list of availability zones for the orderable cluster.
     */
    public java.util.List<AvailabilityZone> getAvailabilityZones() {
        if (availabilityZones == null) {
              availabilityZones = new com.amazonaws.internal.ListWithAutoConstructFlag<AvailabilityZone>();
              availabilityZones.setAutoConstruct(true);
        }
        return availabilityZones;
    }
    
    /**
     * A list of availability zones for the orderable cluster.
     *
     * @param availabilityZones A list of availability zones for the orderable cluster.
     */
    public void setAvailabilityZones(java.util.Collection<AvailabilityZone> availabilityZones) {
        if (availabilityZones == null) {
            this.availabilityZones = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<AvailabilityZone> availabilityZonesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<AvailabilityZone>(availabilityZones.size());
        availabilityZonesCopy.addAll(availabilityZones);
        this.availabilityZones = availabilityZonesCopy;
    }
    
    /**
     * A list of availability zones for the orderable cluster.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param availabilityZones A list of availability zones for the orderable cluster.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public OrderableClusterOption withAvailabilityZones(AvailabilityZone... availabilityZones) {
        if (getAvailabilityZones() == null) setAvailabilityZones(new java.util.ArrayList<AvailabilityZone>(availabilityZones.length));
        for (AvailabilityZone value : availabilityZones) {
            getAvailabilityZones().add(value);
        }
        return this;
    }
    
    /**
     * A list of availability zones for the orderable cluster.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param availabilityZones A list of availability zones for the orderable cluster.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public OrderableClusterOption withAvailabilityZones(java.util.Collection<AvailabilityZone> availabilityZones) {
        if (availabilityZones == null) {
            this.availabilityZones = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<AvailabilityZone> availabilityZonesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<AvailabilityZone>(availabilityZones.size());
            availabilityZonesCopy.addAll(availabilityZones);
            this.availabilityZones = availabilityZonesCopy;
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
        if (getClusterVersion() != null) sb.append("ClusterVersion: " + getClusterVersion() + ",");
        if (getClusterType() != null) sb.append("ClusterType: " + getClusterType() + ",");
        if (getNodeType() != null) sb.append("NodeType: " + getNodeType() + ",");
        if (getAvailabilityZones() != null) sb.append("AvailabilityZones: " + getAvailabilityZones() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getClusterVersion() == null) ? 0 : getClusterVersion().hashCode()); 
        hashCode = prime * hashCode + ((getClusterType() == null) ? 0 : getClusterType().hashCode()); 
        hashCode = prime * hashCode + ((getNodeType() == null) ? 0 : getNodeType().hashCode()); 
        hashCode = prime * hashCode + ((getAvailabilityZones() == null) ? 0 : getAvailabilityZones().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof OrderableClusterOption == false) return false;
        OrderableClusterOption other = (OrderableClusterOption)obj;
        
        if (other.getClusterVersion() == null ^ this.getClusterVersion() == null) return false;
        if (other.getClusterVersion() != null && other.getClusterVersion().equals(this.getClusterVersion()) == false) return false; 
        if (other.getClusterType() == null ^ this.getClusterType() == null) return false;
        if (other.getClusterType() != null && other.getClusterType().equals(this.getClusterType()) == false) return false; 
        if (other.getNodeType() == null ^ this.getNodeType() == null) return false;
        if (other.getNodeType() != null && other.getNodeType().equals(this.getNodeType()) == false) return false; 
        if (other.getAvailabilityZones() == null ^ this.getAvailabilityZones() == null) return false;
        if (other.getAvailabilityZones() != null && other.getAvailabilityZones().equals(this.getAvailabilityZones()) == false) return false; 
        return true;
    }
    
}
    