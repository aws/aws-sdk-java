/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.directconnect.model;

import java.io.Serializable;

/**
 * <p>
 * A location is a network facility where AWS Direct Connect routers are available to be connected. Generally, these are
 * colocation hubs where many network providers have equipment, and where cross connects can be delivered. Locations
 * include a name and facility code, and must be provided when creating a connection.
 * </p>
 */
public class DescribeLocationsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A list of colocation hubs where network providers have equipment. Most regions have multiple locations available.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Location> locations;

    /**
     * <p>
     * A list of colocation hubs where network providers have equipment. Most regions have multiple locations available.
     * </p>
     * 
     * @return A list of colocation hubs where network providers have equipment. Most regions have multiple locations
     *         available.
     */

    public java.util.List<Location> getLocations() {
        if (locations == null) {
            locations = new com.amazonaws.internal.SdkInternalList<Location>();
        }
        return locations;
    }

    /**
     * <p>
     * A list of colocation hubs where network providers have equipment. Most regions have multiple locations available.
     * </p>
     * 
     * @param locations
     *        A list of colocation hubs where network providers have equipment. Most regions have multiple locations
     *        available.
     */

    public void setLocations(java.util.Collection<Location> locations) {
        if (locations == null) {
            this.locations = null;
            return;
        }

        this.locations = new com.amazonaws.internal.SdkInternalList<Location>(locations);
    }

    /**
     * <p>
     * A list of colocation hubs where network providers have equipment. Most regions have multiple locations available.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setLocations(java.util.Collection)} or {@link #withLocations(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param locations
     *        A list of colocation hubs where network providers have equipment. Most regions have multiple locations
     *        available.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeLocationsResult withLocations(Location... locations) {
        if (this.locations == null) {
            setLocations(new com.amazonaws.internal.SdkInternalList<Location>(locations.length));
        }
        for (Location ele : locations) {
            this.locations.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of colocation hubs where network providers have equipment. Most regions have multiple locations available.
     * </p>
     * 
     * @param locations
     *        A list of colocation hubs where network providers have equipment. Most regions have multiple locations
     *        available.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeLocationsResult withLocations(java.util.Collection<Location> locations) {
        setLocations(locations);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getLocations() != null)
            sb.append("Locations: " + getLocations());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeLocationsResult == false)
            return false;
        DescribeLocationsResult other = (DescribeLocationsResult) obj;
        if (other.getLocations() == null ^ this.getLocations() == null)
            return false;
        if (other.getLocations() != null && other.getLocations().equals(this.getLocations()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLocations() == null) ? 0 : getLocations().hashCode());
        return hashCode;
    }

    @Override
    public DescribeLocationsResult clone() {
        try {
            return (DescribeLocationsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
