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
package com.amazonaws.services.lightsail.model;

import java.io.Serializable;

/**
 * <p>
 * Describes the resource location.
 * </p>
 */
public class ResourceLocation implements Serializable, Cloneable {

    /**
     * <p>
     * The Availability Zone.
     * </p>
     */
    private String availabilityZone;
    /**
     * <p>
     * The AWS Region name.
     * </p>
     */
    private String regionName;

    /**
     * <p>
     * The Availability Zone.
     * </p>
     * 
     * @param availabilityZone
     *        The Availability Zone.
     */

    public void setAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
    }

    /**
     * <p>
     * The Availability Zone.
     * </p>
     * 
     * @return The Availability Zone.
     */

    public String getAvailabilityZone() {
        return this.availabilityZone;
    }

    /**
     * <p>
     * The Availability Zone.
     * </p>
     * 
     * @param availabilityZone
     *        The Availability Zone.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceLocation withAvailabilityZone(String availabilityZone) {
        setAvailabilityZone(availabilityZone);
        return this;
    }

    /**
     * <p>
     * The AWS Region name.
     * </p>
     * 
     * @param regionName
     *        The AWS Region name.
     * @see RegionName
     */

    public void setRegionName(String regionName) {
        this.regionName = regionName;
    }

    /**
     * <p>
     * The AWS Region name.
     * </p>
     * 
     * @return The AWS Region name.
     * @see RegionName
     */

    public String getRegionName() {
        return this.regionName;
    }

    /**
     * <p>
     * The AWS Region name.
     * </p>
     * 
     * @param regionName
     *        The AWS Region name.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RegionName
     */

    public ResourceLocation withRegionName(String regionName) {
        setRegionName(regionName);
        return this;
    }

    /**
     * <p>
     * The AWS Region name.
     * </p>
     * 
     * @param regionName
     *        The AWS Region name.
     * @see RegionName
     */

    public void setRegionName(RegionName regionName) {
        this.regionName = regionName.toString();
    }

    /**
     * <p>
     * The AWS Region name.
     * </p>
     * 
     * @param regionName
     *        The AWS Region name.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RegionName
     */

    public ResourceLocation withRegionName(RegionName regionName) {
        setRegionName(regionName);
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
        if (getAvailabilityZone() != null)
            sb.append("AvailabilityZone: " + getAvailabilityZone() + ",");
        if (getRegionName() != null)
            sb.append("RegionName: " + getRegionName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ResourceLocation == false)
            return false;
        ResourceLocation other = (ResourceLocation) obj;
        if (other.getAvailabilityZone() == null ^ this.getAvailabilityZone() == null)
            return false;
        if (other.getAvailabilityZone() != null && other.getAvailabilityZone().equals(this.getAvailabilityZone()) == false)
            return false;
        if (other.getRegionName() == null ^ this.getRegionName() == null)
            return false;
        if (other.getRegionName() != null && other.getRegionName().equals(this.getRegionName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAvailabilityZone() == null) ? 0 : getAvailabilityZone().hashCode());
        hashCode = prime * hashCode + ((getRegionName() == null) ? 0 : getRegionName().hashCode());
        return hashCode;
    }

    @Override
    public ResourceLocation clone() {
        try {
            return (ResourceLocation) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
