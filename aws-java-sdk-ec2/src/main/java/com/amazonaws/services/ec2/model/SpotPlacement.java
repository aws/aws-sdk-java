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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;

/**
 * <p>
 * Describes Spot instance placement.
 * </p>
 */
public class SpotPlacement implements Serializable, Cloneable {

    /**
     * <p>
     * The Availability Zone.
     * </p>
     * <p>
     * [Spot fleet only] To specify multiple Availability Zones, separate them using commas; for example,
     * "us-west-2a, us-west-2b".
     * </p>
     */
    private String availabilityZone;
    /**
     * <p>
     * The name of the placement group (for cluster instances).
     * </p>
     */
    private String groupName;

    /**
     * Default constructor for SpotPlacement object. Callers should use the setter or fluent setter (with...) methods to
     * initialize the object after creating it.
     */
    public SpotPlacement() {
    }

    /**
     * Constructs a new SpotPlacement object. Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param availabilityZone
     *        The Availability Zone.</p>
     *        <p>
     *        [Spot fleet only] To specify multiple Availability Zones, separate them using commas; for example,
     *        "us-west-2a, us-west-2b".
     */
    public SpotPlacement(String availabilityZone) {
        setAvailabilityZone(availabilityZone);
    }

    /**
     * <p>
     * The Availability Zone.
     * </p>
     * <p>
     * [Spot fleet only] To specify multiple Availability Zones, separate them using commas; for example,
     * "us-west-2a, us-west-2b".
     * </p>
     * 
     * @param availabilityZone
     *        The Availability Zone.</p>
     *        <p>
     *        [Spot fleet only] To specify multiple Availability Zones, separate them using commas; for example,
     *        "us-west-2a, us-west-2b".
     */

    public void setAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
    }

    /**
     * <p>
     * The Availability Zone.
     * </p>
     * <p>
     * [Spot fleet only] To specify multiple Availability Zones, separate them using commas; for example,
     * "us-west-2a, us-west-2b".
     * </p>
     * 
     * @return The Availability Zone.</p>
     *         <p>
     *         [Spot fleet only] To specify multiple Availability Zones, separate them using commas; for example,
     *         "us-west-2a, us-west-2b".
     */

    public String getAvailabilityZone() {
        return this.availabilityZone;
    }

    /**
     * <p>
     * The Availability Zone.
     * </p>
     * <p>
     * [Spot fleet only] To specify multiple Availability Zones, separate them using commas; for example,
     * "us-west-2a, us-west-2b".
     * </p>
     * 
     * @param availabilityZone
     *        The Availability Zone.</p>
     *        <p>
     *        [Spot fleet only] To specify multiple Availability Zones, separate them using commas; for example,
     *        "us-west-2a, us-west-2b".
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SpotPlacement withAvailabilityZone(String availabilityZone) {
        setAvailabilityZone(availabilityZone);
        return this;
    }

    /**
     * <p>
     * The name of the placement group (for cluster instances).
     * </p>
     * 
     * @param groupName
     *        The name of the placement group (for cluster instances).
     */

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    /**
     * <p>
     * The name of the placement group (for cluster instances).
     * </p>
     * 
     * @return The name of the placement group (for cluster instances).
     */

    public String getGroupName() {
        return this.groupName;
    }

    /**
     * <p>
     * The name of the placement group (for cluster instances).
     * </p>
     * 
     * @param groupName
     *        The name of the placement group (for cluster instances).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SpotPlacement withGroupName(String groupName) {
        setGroupName(groupName);
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
        if (getGroupName() != null)
            sb.append("GroupName: " + getGroupName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SpotPlacement == false)
            return false;
        SpotPlacement other = (SpotPlacement) obj;
        if (other.getAvailabilityZone() == null ^ this.getAvailabilityZone() == null)
            return false;
        if (other.getAvailabilityZone() != null && other.getAvailabilityZone().equals(this.getAvailabilityZone()) == false)
            return false;
        if (other.getGroupName() == null ^ this.getGroupName() == null)
            return false;
        if (other.getGroupName() != null && other.getGroupName().equals(this.getGroupName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAvailabilityZone() == null) ? 0 : getAvailabilityZone().hashCode());
        hashCode = prime * hashCode + ((getGroupName() == null) ? 0 : getGroupName().hashCode());
        return hashCode;
    }

    @Override
    public SpotPlacement clone() {
        try {
            return (SpotPlacement) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
