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
 * An AWS Direct Connect location where connections and interconnects can be requested.
 * </p>
 */
public class Location implements Serializable, Cloneable {

    /**
     * <p>
     * The code used to indicate the AWS Direct Connect location.
     * </p>
     */
    private String locationCode;
    /**
     * <p>
     * The name of the AWS Direct Connect location. The name includes the colocation partner name and the physical site
     * of the lit building.
     * </p>
     */
    private String locationName;

    /**
     * <p>
     * The code used to indicate the AWS Direct Connect location.
     * </p>
     * 
     * @param locationCode
     *        The code used to indicate the AWS Direct Connect location.
     */

    public void setLocationCode(String locationCode) {
        this.locationCode = locationCode;
    }

    /**
     * <p>
     * The code used to indicate the AWS Direct Connect location.
     * </p>
     * 
     * @return The code used to indicate the AWS Direct Connect location.
     */

    public String getLocationCode() {
        return this.locationCode;
    }

    /**
     * <p>
     * The code used to indicate the AWS Direct Connect location.
     * </p>
     * 
     * @param locationCode
     *        The code used to indicate the AWS Direct Connect location.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Location withLocationCode(String locationCode) {
        setLocationCode(locationCode);
        return this;
    }

    /**
     * <p>
     * The name of the AWS Direct Connect location. The name includes the colocation partner name and the physical site
     * of the lit building.
     * </p>
     * 
     * @param locationName
     *        The name of the AWS Direct Connect location. The name includes the colocation partner name and the
     *        physical site of the lit building.
     */

    public void setLocationName(String locationName) {
        this.locationName = locationName;
    }

    /**
     * <p>
     * The name of the AWS Direct Connect location. The name includes the colocation partner name and the physical site
     * of the lit building.
     * </p>
     * 
     * @return The name of the AWS Direct Connect location. The name includes the colocation partner name and the
     *         physical site of the lit building.
     */

    public String getLocationName() {
        return this.locationName;
    }

    /**
     * <p>
     * The name of the AWS Direct Connect location. The name includes the colocation partner name and the physical site
     * of the lit building.
     * </p>
     * 
     * @param locationName
     *        The name of the AWS Direct Connect location. The name includes the colocation partner name and the
     *        physical site of the lit building.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Location withLocationName(String locationName) {
        setLocationName(locationName);
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
        if (getLocationCode() != null)
            sb.append("LocationCode: " + getLocationCode() + ",");
        if (getLocationName() != null)
            sb.append("LocationName: " + getLocationName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Location == false)
            return false;
        Location other = (Location) obj;
        if (other.getLocationCode() == null ^ this.getLocationCode() == null)
            return false;
        if (other.getLocationCode() != null && other.getLocationCode().equals(this.getLocationCode()) == false)
            return false;
        if (other.getLocationName() == null ^ this.getLocationName() == null)
            return false;
        if (other.getLocationName() != null && other.getLocationName().equals(this.getLocationName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLocationCode() == null) ? 0 : getLocationCode().hashCode());
        hashCode = prime * hashCode + ((getLocationName() == null) ? 0 : getLocationName().hashCode());
        return hashCode;
    }

    @Override
    public Location clone() {
        try {
            return (Location) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
