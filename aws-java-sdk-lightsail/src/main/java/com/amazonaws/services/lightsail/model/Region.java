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
 * Describes the AWS Region.
 * </p>
 */
public class Region implements Serializable, Cloneable {

    /**
     * <p>
     * The continent code (e.g., <code>NA</code>, meaning North America).
     * </p>
     */
    private String continentCode;
    /**
     * <p>
     * The description of the AWS Region (e.g.,
     * <code>This region is recommended to serve users in the eastern United States and eastern Canada</code>).
     * </p>
     */
    private String description;
    /**
     * <p>
     * The display name (e.g., <code>Virginia</code>).
     * </p>
     */
    private String displayName;
    /**
     * <p>
     * The region name (e.g., <code>us-east-1</code>).
     * </p>
     */
    private String name;
    /**
     * <p>
     * The Availability Zones.
     * </p>
     */
    private java.util.List<AvailabilityZone> availabilityZones;

    /**
     * <p>
     * The continent code (e.g., <code>NA</code>, meaning North America).
     * </p>
     * 
     * @param continentCode
     *        The continent code (e.g., <code>NA</code>, meaning North America).
     */

    public void setContinentCode(String continentCode) {
        this.continentCode = continentCode;
    }

    /**
     * <p>
     * The continent code (e.g., <code>NA</code>, meaning North America).
     * </p>
     * 
     * @return The continent code (e.g., <code>NA</code>, meaning North America).
     */

    public String getContinentCode() {
        return this.continentCode;
    }

    /**
     * <p>
     * The continent code (e.g., <code>NA</code>, meaning North America).
     * </p>
     * 
     * @param continentCode
     *        The continent code (e.g., <code>NA</code>, meaning North America).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Region withContinentCode(String continentCode) {
        setContinentCode(continentCode);
        return this;
    }

    /**
     * <p>
     * The description of the AWS Region (e.g.,
     * <code>This region is recommended to serve users in the eastern United States and eastern Canada</code>).
     * </p>
     * 
     * @param description
     *        The description of the AWS Region (e.g.,
     *        <code>This region is recommended to serve users in the eastern United States and eastern Canada</code>).
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the AWS Region (e.g.,
     * <code>This region is recommended to serve users in the eastern United States and eastern Canada</code>).
     * </p>
     * 
     * @return The description of the AWS Region (e.g.,
     *         <code>This region is recommended to serve users in the eastern United States and eastern Canada</code>).
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of the AWS Region (e.g.,
     * <code>This region is recommended to serve users in the eastern United States and eastern Canada</code>).
     * </p>
     * 
     * @param description
     *        The description of the AWS Region (e.g.,
     *        <code>This region is recommended to serve users in the eastern United States and eastern Canada</code>).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Region withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The display name (e.g., <code>Virginia</code>).
     * </p>
     * 
     * @param displayName
     *        The display name (e.g., <code>Virginia</code>).
     */

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    /**
     * <p>
     * The display name (e.g., <code>Virginia</code>).
     * </p>
     * 
     * @return The display name (e.g., <code>Virginia</code>).
     */

    public String getDisplayName() {
        return this.displayName;
    }

    /**
     * <p>
     * The display name (e.g., <code>Virginia</code>).
     * </p>
     * 
     * @param displayName
     *        The display name (e.g., <code>Virginia</code>).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Region withDisplayName(String displayName) {
        setDisplayName(displayName);
        return this;
    }

    /**
     * <p>
     * The region name (e.g., <code>us-east-1</code>).
     * </p>
     * 
     * @param name
     *        The region name (e.g., <code>us-east-1</code>).
     * @see RegionName
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The region name (e.g., <code>us-east-1</code>).
     * </p>
     * 
     * @return The region name (e.g., <code>us-east-1</code>).
     * @see RegionName
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The region name (e.g., <code>us-east-1</code>).
     * </p>
     * 
     * @param name
     *        The region name (e.g., <code>us-east-1</code>).
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RegionName
     */

    public Region withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The region name (e.g., <code>us-east-1</code>).
     * </p>
     * 
     * @param name
     *        The region name (e.g., <code>us-east-1</code>).
     * @see RegionName
     */

    public void setName(RegionName name) {
        this.name = name.toString();
    }

    /**
     * <p>
     * The region name (e.g., <code>us-east-1</code>).
     * </p>
     * 
     * @param name
     *        The region name (e.g., <code>us-east-1</code>).
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RegionName
     */

    public Region withName(RegionName name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The Availability Zones.
     * </p>
     * 
     * @return The Availability Zones.
     */

    public java.util.List<AvailabilityZone> getAvailabilityZones() {
        return availabilityZones;
    }

    /**
     * <p>
     * The Availability Zones.
     * </p>
     * 
     * @param availabilityZones
     *        The Availability Zones.
     */

    public void setAvailabilityZones(java.util.Collection<AvailabilityZone> availabilityZones) {
        if (availabilityZones == null) {
            this.availabilityZones = null;
            return;
        }

        this.availabilityZones = new java.util.ArrayList<AvailabilityZone>(availabilityZones);
    }

    /**
     * <p>
     * The Availability Zones.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAvailabilityZones(java.util.Collection)} or {@link #withAvailabilityZones(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param availabilityZones
     *        The Availability Zones.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Region withAvailabilityZones(AvailabilityZone... availabilityZones) {
        if (this.availabilityZones == null) {
            setAvailabilityZones(new java.util.ArrayList<AvailabilityZone>(availabilityZones.length));
        }
        for (AvailabilityZone ele : availabilityZones) {
            this.availabilityZones.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The Availability Zones.
     * </p>
     * 
     * @param availabilityZones
     *        The Availability Zones.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Region withAvailabilityZones(java.util.Collection<AvailabilityZone> availabilityZones) {
        setAvailabilityZones(availabilityZones);
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
        if (getContinentCode() != null)
            sb.append("ContinentCode: " + getContinentCode() + ",");
        if (getDescription() != null)
            sb.append("Description: " + getDescription() + ",");
        if (getDisplayName() != null)
            sb.append("DisplayName: " + getDisplayName() + ",");
        if (getName() != null)
            sb.append("Name: " + getName() + ",");
        if (getAvailabilityZones() != null)
            sb.append("AvailabilityZones: " + getAvailabilityZones());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Region == false)
            return false;
        Region other = (Region) obj;
        if (other.getContinentCode() == null ^ this.getContinentCode() == null)
            return false;
        if (other.getContinentCode() != null && other.getContinentCode().equals(this.getContinentCode()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getDisplayName() == null ^ this.getDisplayName() == null)
            return false;
        if (other.getDisplayName() != null && other.getDisplayName().equals(this.getDisplayName()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getAvailabilityZones() == null ^ this.getAvailabilityZones() == null)
            return false;
        if (other.getAvailabilityZones() != null && other.getAvailabilityZones().equals(this.getAvailabilityZones()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getContinentCode() == null) ? 0 : getContinentCode().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getDisplayName() == null) ? 0 : getDisplayName().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getAvailabilityZones() == null) ? 0 : getAvailabilityZones().hashCode());
        return hashCode;
    }

    @Override
    public Region clone() {
        try {
            return (Region) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
