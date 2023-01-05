/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import javax.annotation.Generated;

/**
 * <p>
 * Information about instance capacity usage for a Capacity Reservation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/CapacityAllocation" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CapacityAllocation implements Serializable, Cloneable {

    /**
     * <p>
     * The usage type. <code>used</code> indicates that the instance capacity is in use by instances that are running in
     * the Capacity Reservation.
     * </p>
     */
    private String allocationType;
    /**
     * <p>
     * The amount of instance capacity associated with the usage. For example a value of <code>4</code> indicates that
     * instance capacity for 4 instances is currently in use.
     * </p>
     */
    private Integer count;

    /**
     * <p>
     * The usage type. <code>used</code> indicates that the instance capacity is in use by instances that are running in
     * the Capacity Reservation.
     * </p>
     * 
     * @param allocationType
     *        The usage type. <code>used</code> indicates that the instance capacity is in use by instances that are
     *        running in the Capacity Reservation.
     * @see AllocationType
     */

    public void setAllocationType(String allocationType) {
        this.allocationType = allocationType;
    }

    /**
     * <p>
     * The usage type. <code>used</code> indicates that the instance capacity is in use by instances that are running in
     * the Capacity Reservation.
     * </p>
     * 
     * @return The usage type. <code>used</code> indicates that the instance capacity is in use by instances that are
     *         running in the Capacity Reservation.
     * @see AllocationType
     */

    public String getAllocationType() {
        return this.allocationType;
    }

    /**
     * <p>
     * The usage type. <code>used</code> indicates that the instance capacity is in use by instances that are running in
     * the Capacity Reservation.
     * </p>
     * 
     * @param allocationType
     *        The usage type. <code>used</code> indicates that the instance capacity is in use by instances that are
     *        running in the Capacity Reservation.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AllocationType
     */

    public CapacityAllocation withAllocationType(String allocationType) {
        setAllocationType(allocationType);
        return this;
    }

    /**
     * <p>
     * The usage type. <code>used</code> indicates that the instance capacity is in use by instances that are running in
     * the Capacity Reservation.
     * </p>
     * 
     * @param allocationType
     *        The usage type. <code>used</code> indicates that the instance capacity is in use by instances that are
     *        running in the Capacity Reservation.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AllocationType
     */

    public CapacityAllocation withAllocationType(AllocationType allocationType) {
        this.allocationType = allocationType.toString();
        return this;
    }

    /**
     * <p>
     * The amount of instance capacity associated with the usage. For example a value of <code>4</code> indicates that
     * instance capacity for 4 instances is currently in use.
     * </p>
     * 
     * @param count
     *        The amount of instance capacity associated with the usage. For example a value of <code>4</code> indicates
     *        that instance capacity for 4 instances is currently in use.
     */

    public void setCount(Integer count) {
        this.count = count;
    }

    /**
     * <p>
     * The amount of instance capacity associated with the usage. For example a value of <code>4</code> indicates that
     * instance capacity for 4 instances is currently in use.
     * </p>
     * 
     * @return The amount of instance capacity associated with the usage. For example a value of <code>4</code>
     *         indicates that instance capacity for 4 instances is currently in use.
     */

    public Integer getCount() {
        return this.count;
    }

    /**
     * <p>
     * The amount of instance capacity associated with the usage. For example a value of <code>4</code> indicates that
     * instance capacity for 4 instances is currently in use.
     * </p>
     * 
     * @param count
     *        The amount of instance capacity associated with the usage. For example a value of <code>4</code> indicates
     *        that instance capacity for 4 instances is currently in use.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CapacityAllocation withCount(Integer count) {
        setCount(count);
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
        if (getAllocationType() != null)
            sb.append("AllocationType: ").append(getAllocationType()).append(",");
        if (getCount() != null)
            sb.append("Count: ").append(getCount());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CapacityAllocation == false)
            return false;
        CapacityAllocation other = (CapacityAllocation) obj;
        if (other.getAllocationType() == null ^ this.getAllocationType() == null)
            return false;
        if (other.getAllocationType() != null && other.getAllocationType().equals(this.getAllocationType()) == false)
            return false;
        if (other.getCount() == null ^ this.getCount() == null)
            return false;
        if (other.getCount() != null && other.getCount().equals(this.getCount()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAllocationType() == null) ? 0 : getAllocationType().hashCode());
        hashCode = prime * hashCode + ((getCount() == null) ? 0 : getCount().hashCode());
        return hashCode;
    }

    @Override
    public CapacityAllocation clone() {
        try {
            return (CapacityAllocation) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
