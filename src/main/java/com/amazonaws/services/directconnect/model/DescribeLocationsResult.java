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
package com.amazonaws.services.directconnect.model;

import java.io.Serializable;


/**
 * Describe Locations Result
 */
public class DescribeLocationsResult implements Serializable {

    private com.amazonaws.internal.ListWithAutoConstructFlag<Location> locations;

    /**
     * Returns the value of the Locations property for this object.
     *
     * @return The value of the Locations property for this object.
     */
    public java.util.List<Location> getLocations() {
        if (locations == null) {
              locations = new com.amazonaws.internal.ListWithAutoConstructFlag<Location>();
              locations.setAutoConstruct(true);
        }
        return locations;
    }
    
    /**
     * Sets the value of the Locations property for this object.
     *
     * @param locations The new value for the Locations property for this object.
     */
    public void setLocations(java.util.Collection<Location> locations) {
        if (locations == null) {
            this.locations = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<Location> locationsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<Location>(locations.size());
        locationsCopy.addAll(locations);
        this.locations = locationsCopy;
    }
    
    /**
     * Sets the value of the Locations property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param locations The new value for the Locations property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeLocationsResult withLocations(Location... locations) {
        if (getLocations() == null) setLocations(new java.util.ArrayList<Location>(locations.length));
        for (Location value : locations) {
            getLocations().add(value);
        }
        return this;
    }
    
    /**
     * Sets the value of the Locations property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param locations The new value for the Locations property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeLocationsResult withLocations(java.util.Collection<Location> locations) {
        if (locations == null) {
            this.locations = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<Location> locationsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<Location>(locations.size());
            locationsCopy.addAll(locations);
            this.locations = locationsCopy;
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
        if (getLocations() != null) sb.append("Locations: " + getLocations() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getLocations() == null) ? 0 : getLocations().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DescribeLocationsResult == false) return false;
        DescribeLocationsResult other = (DescribeLocationsResult)obj;
        
        if (other.getLocations() == null ^ this.getLocations() == null) return false;
        if (other.getLocations() != null && other.getLocations().equals(this.getLocations()) == false) return false; 
        return true;
    }
    
}
    