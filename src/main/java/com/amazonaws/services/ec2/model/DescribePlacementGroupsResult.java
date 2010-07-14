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
package com.amazonaws.services.ec2.model;

/**
 * <p>
 * </p>
 */
public class DescribePlacementGroupsResult {

    /**
     * Contains information about the specified <code>PlacementGroups</code>.
     */
    private java.util.List<PlacementGroup> placementGroups;

    /**
     * Contains information about the specified <code>PlacementGroups</code>.
     *
     * @return Contains information about the specified <code>PlacementGroups</code>.
     */
    public java.util.List<PlacementGroup> getPlacementGroups() {
        if (placementGroups == null) {
            placementGroups = new java.util.ArrayList<PlacementGroup>();
        }
        return placementGroups;
    }
    
    /**
     * Contains information about the specified <code>PlacementGroups</code>.
     *
     * @param placementGroups Contains information about the specified <code>PlacementGroups</code>.
     */
    public void setPlacementGroups(java.util.Collection<PlacementGroup> placementGroups) {
        java.util.List<PlacementGroup> placementGroupsCopy = new java.util.ArrayList<PlacementGroup>();
        if (placementGroups != null) {
            placementGroupsCopy.addAll(placementGroups);
        }
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
        java.util.List<PlacementGroup> placementGroupsCopy = new java.util.ArrayList<PlacementGroup>();
        if (placementGroups != null) {
            placementGroupsCopy.addAll(placementGroups);
        }
        this.placementGroups = placementGroupsCopy;

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
        sb.append("PlacementGroups: " + placementGroups + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    