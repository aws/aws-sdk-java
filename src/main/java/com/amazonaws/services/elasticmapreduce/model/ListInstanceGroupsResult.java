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
package com.amazonaws.services.elasticmapreduce.model;

import java.io.Serializable;


/**
 * <p>
 * This input determines which instance groups to retrieve.
 * </p>
 */
public class ListInstanceGroupsResult implements Serializable {

    /**
     * The list of instance groups for the cluster and given filters.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<InstanceGroup> instanceGroups;

    /**
     * The pagination token that indicates the next set of results to
     * retrieve.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     */
    private String marker;

    /**
     * The list of instance groups for the cluster and given filters.
     *
     * @return The list of instance groups for the cluster and given filters.
     */
    public java.util.List<InstanceGroup> getInstanceGroups() {
        if (instanceGroups == null) {
              instanceGroups = new com.amazonaws.internal.ListWithAutoConstructFlag<InstanceGroup>();
              instanceGroups.setAutoConstruct(true);
        }
        return instanceGroups;
    }
    
    /**
     * The list of instance groups for the cluster and given filters.
     *
     * @param instanceGroups The list of instance groups for the cluster and given filters.
     */
    public void setInstanceGroups(java.util.Collection<InstanceGroup> instanceGroups) {
        if (instanceGroups == null) {
            this.instanceGroups = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<InstanceGroup> instanceGroupsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<InstanceGroup>(instanceGroups.size());
        instanceGroupsCopy.addAll(instanceGroups);
        this.instanceGroups = instanceGroupsCopy;
    }
    
    /**
     * The list of instance groups for the cluster and given filters.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param instanceGroups The list of instance groups for the cluster and given filters.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ListInstanceGroupsResult withInstanceGroups(InstanceGroup... instanceGroups) {
        if (getInstanceGroups() == null) setInstanceGroups(new java.util.ArrayList<InstanceGroup>(instanceGroups.length));
        for (InstanceGroup value : instanceGroups) {
            getInstanceGroups().add(value);
        }
        return this;
    }
    
    /**
     * The list of instance groups for the cluster and given filters.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param instanceGroups The list of instance groups for the cluster and given filters.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ListInstanceGroupsResult withInstanceGroups(java.util.Collection<InstanceGroup> instanceGroups) {
        if (instanceGroups == null) {
            this.instanceGroups = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<InstanceGroup> instanceGroupsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<InstanceGroup>(instanceGroups.size());
            instanceGroupsCopy.addAll(instanceGroups);
            this.instanceGroups = instanceGroupsCopy;
        }

        return this;
    }

    /**
     * The pagination token that indicates the next set of results to
     * retrieve.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     *
     * @return The pagination token that indicates the next set of results to
     *         retrieve.
     */
    public String getMarker() {
        return marker;
    }
    
    /**
     * The pagination token that indicates the next set of results to
     * retrieve.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     *
     * @param marker The pagination token that indicates the next set of results to
     *         retrieve.
     */
    public void setMarker(String marker) {
        this.marker = marker;
    }
    
    /**
     * The pagination token that indicates the next set of results to
     * retrieve.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     *
     * @param marker The pagination token that indicates the next set of results to
     *         retrieve.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ListInstanceGroupsResult withMarker(String marker) {
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
        if (getInstanceGroups() != null) sb.append("InstanceGroups: " + getInstanceGroups() + ",");
        if (getMarker() != null) sb.append("Marker: " + getMarker() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getInstanceGroups() == null) ? 0 : getInstanceGroups().hashCode()); 
        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof ListInstanceGroupsResult == false) return false;
        ListInstanceGroupsResult other = (ListInstanceGroupsResult)obj;
        
        if (other.getInstanceGroups() == null ^ this.getInstanceGroups() == null) return false;
        if (other.getInstanceGroups() != null && other.getInstanceGroups().equals(this.getInstanceGroups()) == false) return false; 
        if (other.getMarker() == null ^ this.getMarker() == null) return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false) return false; 
        return true;
    }
    
}
    