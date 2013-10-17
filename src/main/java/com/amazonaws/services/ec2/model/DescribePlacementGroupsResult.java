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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;


/**
 * <p>
 * </p>
 */
public class DescribePlacementGroupsResult implements Serializable {

    /**
     * Contains information about the specified <code>PlacementGroups</code>.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<PlacementGroup> placementGroups;

    /**
     * Contains information about the specified <code>PlacementGroups</code>.
     *
     * @return Contains information about the specified <code>PlacementGroups</code>.
     */
    public java.util.List<PlacementGroup> getPlacementGroups() {
        if (placementGroups == null) {
              placementGroups = new com.amazonaws.internal.ListWithAutoConstructFlag<PlacementGroup>();
              placementGroups.setAutoConstruct(true);
        }
        return placementGroups;
    }
    
    /**
     * Contains information about the specified <code>PlacementGroups</code>.
     *
     * @param placementGroups Contains information about the specified <code>PlacementGroups</code>.
     */
    public void setPlacementGroups(java.util.Collection<PlacementGroup> placementGroups) {
        if (placementGroups == null) {
            this.placementGroups = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<PlacementGroup> placementGroupsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<PlacementGroup>(placementGroups.size());
        placementGroupsCopy.addAll(placementGroups);
        this.placementGroups = placementGroupsCopy;
    }
    
    /**
     * Contains information about the specified <code>PlacementGroups</code>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param placementGroups Contains information about the specified <code>PlacementGroups</code>.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribePlacementGroupsResult withPlacementGroups(PlacementGroup... placementGroups) {
        if (getPlacementGroups() == null) setPlacementGroups(new java.util.ArrayList<PlacementGroup>(placementGroups.length));
        for (PlacementGroup value : placementGroups) {
            getPlacementGroups().add(value);
        }
        return this;
    }
    
    /**
     * Contains information about the specified <code>PlacementGroups</code>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param placementGroups Contains information about the specified <code>PlacementGroups</code>.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribePlacementGroupsResult withPlacementGroups(java.util.Collection<PlacementGroup> placementGroups) {
        if (placementGroups == null) {
            this.placementGroups = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<PlacementGroup> placementGroupsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<PlacementGroup>(placementGroups.size());
            placementGroupsCopy.addAll(placementGroups);
            this.placementGroups = placementGroupsCopy;
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
        if (getPlacementGroups() != null) sb.append("PlacementGroups: " + getPlacementGroups() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getPlacementGroups() == null) ? 0 : getPlacementGroups().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DescribePlacementGroupsResult == false) return false;
        DescribePlacementGroupsResult other = (DescribePlacementGroupsResult)obj;
        
        if (other.getPlacementGroups() == null ^ this.getPlacementGroups() == null) return false;
        if (other.getPlacementGroups() != null && other.getPlacementGroups().equals(this.getPlacementGroups()) == false) return false; 
        return true;
    }
    
}
    