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
package com.amazonaws.services.elasticmapreduce.model;

import java.io.Serializable;

/**
 * <p>
 * The Amazon EC2 location for the job flow.
 * </p>
 */
public class PlacementType implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon EC2 Availability Zone for the job flow.
     * </p>
     */
    private String availabilityZone;

    /**
     * Default constructor for PlacementType object. Callers should use the setter or fluent setter (with...) methods to
     * initialize the object after creating it.
     */
    public PlacementType() {
    }

    /**
     * Constructs a new PlacementType object. Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param availabilityZone
     *        The Amazon EC2 Availability Zone for the job flow.
     */
    public PlacementType(String availabilityZone) {
        setAvailabilityZone(availabilityZone);
    }

    /**
     * <p>
     * The Amazon EC2 Availability Zone for the job flow.
     * </p>
     * 
     * @param availabilityZone
     *        The Amazon EC2 Availability Zone for the job flow.
     */

    public void setAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
    }

    /**
     * <p>
     * The Amazon EC2 Availability Zone for the job flow.
     * </p>
     * 
     * @return The Amazon EC2 Availability Zone for the job flow.
     */

    public String getAvailabilityZone() {
        return this.availabilityZone;
    }

    /**
     * <p>
     * The Amazon EC2 Availability Zone for the job flow.
     * </p>
     * 
     * @param availabilityZone
     *        The Amazon EC2 Availability Zone for the job flow.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PlacementType withAvailabilityZone(String availabilityZone) {
        setAvailabilityZone(availabilityZone);
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
            sb.append("AvailabilityZone: " + getAvailabilityZone());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PlacementType == false)
            return false;
        PlacementType other = (PlacementType) obj;
        if (other.getAvailabilityZone() == null ^ this.getAvailabilityZone() == null)
            return false;
        if (other.getAvailabilityZone() != null && other.getAvailabilityZone().equals(this.getAvailabilityZone()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAvailabilityZone() == null) ? 0 : getAvailabilityZone().hashCode());
        return hashCode;
    }

    @Override
    public PlacementType clone() {
        try {
            return (PlacementType) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
