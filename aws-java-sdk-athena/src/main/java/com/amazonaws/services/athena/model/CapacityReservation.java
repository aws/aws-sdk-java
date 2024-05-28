/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.athena.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A reservation for a specified number of data processing units (DPUs). When a reservation is initially created, it has
 * no DPUs. Athena allocates DPUs until the allocated amount equals the requested amount.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/athena-2017-05-18/CapacityReservation" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CapacityReservation implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the capacity reservation.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The status of the capacity reservation.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The number of data processing units requested.
     * </p>
     */
    private Integer targetDpus;
    /**
     * <p>
     * The number of data processing units currently allocated.
     * </p>
     */
    private Integer allocatedDpus;

    private CapacityAllocation lastAllocation;
    /**
     * <p>
     * The time of the most recent capacity allocation that succeeded.
     * </p>
     */
    private java.util.Date lastSuccessfulAllocationTime;
    /**
     * <p>
     * The time in UTC epoch millis when the capacity reservation was created.
     * </p>
     */
    private java.util.Date creationTime;

    /**
     * <p>
     * The name of the capacity reservation.
     * </p>
     * 
     * @param name
     *        The name of the capacity reservation.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the capacity reservation.
     * </p>
     * 
     * @return The name of the capacity reservation.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the capacity reservation.
     * </p>
     * 
     * @param name
     *        The name of the capacity reservation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CapacityReservation withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The status of the capacity reservation.
     * </p>
     * 
     * @param status
     *        The status of the capacity reservation.
     * @see CapacityReservationStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the capacity reservation.
     * </p>
     * 
     * @return The status of the capacity reservation.
     * @see CapacityReservationStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the capacity reservation.
     * </p>
     * 
     * @param status
     *        The status of the capacity reservation.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CapacityReservationStatus
     */

    public CapacityReservation withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the capacity reservation.
     * </p>
     * 
     * @param status
     *        The status of the capacity reservation.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CapacityReservationStatus
     */

    public CapacityReservation withStatus(CapacityReservationStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The number of data processing units requested.
     * </p>
     * 
     * @param targetDpus
     *        The number of data processing units requested.
     */

    public void setTargetDpus(Integer targetDpus) {
        this.targetDpus = targetDpus;
    }

    /**
     * <p>
     * The number of data processing units requested.
     * </p>
     * 
     * @return The number of data processing units requested.
     */

    public Integer getTargetDpus() {
        return this.targetDpus;
    }

    /**
     * <p>
     * The number of data processing units requested.
     * </p>
     * 
     * @param targetDpus
     *        The number of data processing units requested.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CapacityReservation withTargetDpus(Integer targetDpus) {
        setTargetDpus(targetDpus);
        return this;
    }

    /**
     * <p>
     * The number of data processing units currently allocated.
     * </p>
     * 
     * @param allocatedDpus
     *        The number of data processing units currently allocated.
     */

    public void setAllocatedDpus(Integer allocatedDpus) {
        this.allocatedDpus = allocatedDpus;
    }

    /**
     * <p>
     * The number of data processing units currently allocated.
     * </p>
     * 
     * @return The number of data processing units currently allocated.
     */

    public Integer getAllocatedDpus() {
        return this.allocatedDpus;
    }

    /**
     * <p>
     * The number of data processing units currently allocated.
     * </p>
     * 
     * @param allocatedDpus
     *        The number of data processing units currently allocated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CapacityReservation withAllocatedDpus(Integer allocatedDpus) {
        setAllocatedDpus(allocatedDpus);
        return this;
    }

    /**
     * @param lastAllocation
     */

    public void setLastAllocation(CapacityAllocation lastAllocation) {
        this.lastAllocation = lastAllocation;
    }

    /**
     * @return
     */

    public CapacityAllocation getLastAllocation() {
        return this.lastAllocation;
    }

    /**
     * @param lastAllocation
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CapacityReservation withLastAllocation(CapacityAllocation lastAllocation) {
        setLastAllocation(lastAllocation);
        return this;
    }

    /**
     * <p>
     * The time of the most recent capacity allocation that succeeded.
     * </p>
     * 
     * @param lastSuccessfulAllocationTime
     *        The time of the most recent capacity allocation that succeeded.
     */

    public void setLastSuccessfulAllocationTime(java.util.Date lastSuccessfulAllocationTime) {
        this.lastSuccessfulAllocationTime = lastSuccessfulAllocationTime;
    }

    /**
     * <p>
     * The time of the most recent capacity allocation that succeeded.
     * </p>
     * 
     * @return The time of the most recent capacity allocation that succeeded.
     */

    public java.util.Date getLastSuccessfulAllocationTime() {
        return this.lastSuccessfulAllocationTime;
    }

    /**
     * <p>
     * The time of the most recent capacity allocation that succeeded.
     * </p>
     * 
     * @param lastSuccessfulAllocationTime
     *        The time of the most recent capacity allocation that succeeded.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CapacityReservation withLastSuccessfulAllocationTime(java.util.Date lastSuccessfulAllocationTime) {
        setLastSuccessfulAllocationTime(lastSuccessfulAllocationTime);
        return this;
    }

    /**
     * <p>
     * The time in UTC epoch millis when the capacity reservation was created.
     * </p>
     * 
     * @param creationTime
     *        The time in UTC epoch millis when the capacity reservation was created.
     */

    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * The time in UTC epoch millis when the capacity reservation was created.
     * </p>
     * 
     * @return The time in UTC epoch millis when the capacity reservation was created.
     */

    public java.util.Date getCreationTime() {
        return this.creationTime;
    }

    /**
     * <p>
     * The time in UTC epoch millis when the capacity reservation was created.
     * </p>
     * 
     * @param creationTime
     *        The time in UTC epoch millis when the capacity reservation was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CapacityReservation withCreationTime(java.util.Date creationTime) {
        setCreationTime(creationTime);
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getTargetDpus() != null)
            sb.append("TargetDpus: ").append(getTargetDpus()).append(",");
        if (getAllocatedDpus() != null)
            sb.append("AllocatedDpus: ").append(getAllocatedDpus()).append(",");
        if (getLastAllocation() != null)
            sb.append("LastAllocation: ").append(getLastAllocation()).append(",");
        if (getLastSuccessfulAllocationTime() != null)
            sb.append("LastSuccessfulAllocationTime: ").append(getLastSuccessfulAllocationTime()).append(",");
        if (getCreationTime() != null)
            sb.append("CreationTime: ").append(getCreationTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CapacityReservation == false)
            return false;
        CapacityReservation other = (CapacityReservation) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getTargetDpus() == null ^ this.getTargetDpus() == null)
            return false;
        if (other.getTargetDpus() != null && other.getTargetDpus().equals(this.getTargetDpus()) == false)
            return false;
        if (other.getAllocatedDpus() == null ^ this.getAllocatedDpus() == null)
            return false;
        if (other.getAllocatedDpus() != null && other.getAllocatedDpus().equals(this.getAllocatedDpus()) == false)
            return false;
        if (other.getLastAllocation() == null ^ this.getLastAllocation() == null)
            return false;
        if (other.getLastAllocation() != null && other.getLastAllocation().equals(this.getLastAllocation()) == false)
            return false;
        if (other.getLastSuccessfulAllocationTime() == null ^ this.getLastSuccessfulAllocationTime() == null)
            return false;
        if (other.getLastSuccessfulAllocationTime() != null && other.getLastSuccessfulAllocationTime().equals(this.getLastSuccessfulAllocationTime()) == false)
            return false;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getTargetDpus() == null) ? 0 : getTargetDpus().hashCode());
        hashCode = prime * hashCode + ((getAllocatedDpus() == null) ? 0 : getAllocatedDpus().hashCode());
        hashCode = prime * hashCode + ((getLastAllocation() == null) ? 0 : getLastAllocation().hashCode());
        hashCode = prime * hashCode + ((getLastSuccessfulAllocationTime() == null) ? 0 : getLastSuccessfulAllocationTime().hashCode());
        hashCode = prime * hashCode + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        return hashCode;
    }

    @Override
    public CapacityReservation clone() {
        try {
            return (CapacityReservation) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.athena.model.transform.CapacityReservationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
