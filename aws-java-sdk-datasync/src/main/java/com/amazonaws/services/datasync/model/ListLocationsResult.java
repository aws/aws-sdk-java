/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.datasync.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * ListLocationsResponse
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datasync-2018-11-09/ListLocations" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListLocationsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * An array that contains a list of locations.
     * </p>
     */
    private java.util.List<LocationListEntry> locations;
    /**
     * <p>
     * An opaque string that indicates the position at which to begin returning the next list of locations.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * An array that contains a list of locations.
     * </p>
     * 
     * @return An array that contains a list of locations.
     */

    public java.util.List<LocationListEntry> getLocations() {
        return locations;
    }

    /**
     * <p>
     * An array that contains a list of locations.
     * </p>
     * 
     * @param locations
     *        An array that contains a list of locations.
     */

    public void setLocations(java.util.Collection<LocationListEntry> locations) {
        if (locations == null) {
            this.locations = null;
            return;
        }

        this.locations = new java.util.ArrayList<LocationListEntry>(locations);
    }

    /**
     * <p>
     * An array that contains a list of locations.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setLocations(java.util.Collection)} or {@link #withLocations(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param locations
     *        An array that contains a list of locations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListLocationsResult withLocations(LocationListEntry... locations) {
        if (this.locations == null) {
            setLocations(new java.util.ArrayList<LocationListEntry>(locations.length));
        }
        for (LocationListEntry ele : locations) {
            this.locations.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array that contains a list of locations.
     * </p>
     * 
     * @param locations
     *        An array that contains a list of locations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListLocationsResult withLocations(java.util.Collection<LocationListEntry> locations) {
        setLocations(locations);
        return this;
    }

    /**
     * <p>
     * An opaque string that indicates the position at which to begin returning the next list of locations.
     * </p>
     * 
     * @param nextToken
     *        An opaque string that indicates the position at which to begin returning the next list of locations.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * An opaque string that indicates the position at which to begin returning the next list of locations.
     * </p>
     * 
     * @return An opaque string that indicates the position at which to begin returning the next list of locations.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * An opaque string that indicates the position at which to begin returning the next list of locations.
     * </p>
     * 
     * @param nextToken
     *        An opaque string that indicates the position at which to begin returning the next list of locations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListLocationsResult withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
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
            sb.append("Locations: ").append(getLocations()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListLocationsResult == false)
            return false;
        ListLocationsResult other = (ListLocationsResult) obj;
        if (other.getLocations() == null ^ this.getLocations() == null)
            return false;
        if (other.getLocations() != null && other.getLocations().equals(this.getLocations()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLocations() == null) ? 0 : getLocations().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListLocationsResult clone() {
        try {
            return (ListLocationsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
