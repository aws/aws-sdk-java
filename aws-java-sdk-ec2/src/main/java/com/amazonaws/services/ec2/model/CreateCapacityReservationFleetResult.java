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

import com.amazonaws.AmazonWebServiceResult;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateCapacityReservationFleetResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * The ID of the Capacity Reservation Fleet.
     * </p>
     */
    private String capacityReservationFleetId;
    /**
     * <p>
     * The status of the Capacity Reservation Fleet.
     * </p>
     */
    private String state;
    /**
     * <p>
     * The total number of capacity units for which the Capacity Reservation Fleet reserves capacity.
     * </p>
     */
    private Integer totalTargetCapacity;
    /**
     * <p>
     * The requested capacity units that have been successfully reserved.
     * </p>
     */
    private Double totalFulfilledCapacity;
    /**
     * <p>
     * The instance matching criteria for the Capacity Reservation Fleet.
     * </p>
     */
    private String instanceMatchCriteria;
    /**
     * <p>
     * The allocation strategy used by the Capacity Reservation Fleet.
     * </p>
     */
    private String allocationStrategy;
    /**
     * <p>
     * The date and time at which the Capacity Reservation Fleet was created.
     * </p>
     */
    private java.util.Date createTime;
    /**
     * <p>
     * The date and time at which the Capacity Reservation Fleet expires.
     * </p>
     */
    private java.util.Date endDate;
    /**
     * <p>
     * Indicates the tenancy of Capacity Reservation Fleet.
     * </p>
     */
    private String tenancy;
    /**
     * <p>
     * Information about the individual Capacity Reservations in the Capacity Reservation Fleet.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<FleetCapacityReservation> fleetCapacityReservations;
    /**
     * <p>
     * The tags assigned to the Capacity Reservation Fleet.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Tag> tags;

    /**
     * <p>
     * The ID of the Capacity Reservation Fleet.
     * </p>
     * 
     * @param capacityReservationFleetId
     *        The ID of the Capacity Reservation Fleet.
     */

    public void setCapacityReservationFleetId(String capacityReservationFleetId) {
        this.capacityReservationFleetId = capacityReservationFleetId;
    }

    /**
     * <p>
     * The ID of the Capacity Reservation Fleet.
     * </p>
     * 
     * @return The ID of the Capacity Reservation Fleet.
     */

    public String getCapacityReservationFleetId() {
        return this.capacityReservationFleetId;
    }

    /**
     * <p>
     * The ID of the Capacity Reservation Fleet.
     * </p>
     * 
     * @param capacityReservationFleetId
     *        The ID of the Capacity Reservation Fleet.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCapacityReservationFleetResult withCapacityReservationFleetId(String capacityReservationFleetId) {
        setCapacityReservationFleetId(capacityReservationFleetId);
        return this;
    }

    /**
     * <p>
     * The status of the Capacity Reservation Fleet.
     * </p>
     * 
     * @param state
     *        The status of the Capacity Reservation Fleet.
     * @see CapacityReservationFleetState
     */

    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * The status of the Capacity Reservation Fleet.
     * </p>
     * 
     * @return The status of the Capacity Reservation Fleet.
     * @see CapacityReservationFleetState
     */

    public String getState() {
        return this.state;
    }

    /**
     * <p>
     * The status of the Capacity Reservation Fleet.
     * </p>
     * 
     * @param state
     *        The status of the Capacity Reservation Fleet.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CapacityReservationFleetState
     */

    public CreateCapacityReservationFleetResult withState(String state) {
        setState(state);
        return this;
    }

    /**
     * <p>
     * The status of the Capacity Reservation Fleet.
     * </p>
     * 
     * @param state
     *        The status of the Capacity Reservation Fleet.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CapacityReservationFleetState
     */

    public CreateCapacityReservationFleetResult withState(CapacityReservationFleetState state) {
        this.state = state.toString();
        return this;
    }

    /**
     * <p>
     * The total number of capacity units for which the Capacity Reservation Fleet reserves capacity.
     * </p>
     * 
     * @param totalTargetCapacity
     *        The total number of capacity units for which the Capacity Reservation Fleet reserves capacity.
     */

    public void setTotalTargetCapacity(Integer totalTargetCapacity) {
        this.totalTargetCapacity = totalTargetCapacity;
    }

    /**
     * <p>
     * The total number of capacity units for which the Capacity Reservation Fleet reserves capacity.
     * </p>
     * 
     * @return The total number of capacity units for which the Capacity Reservation Fleet reserves capacity.
     */

    public Integer getTotalTargetCapacity() {
        return this.totalTargetCapacity;
    }

    /**
     * <p>
     * The total number of capacity units for which the Capacity Reservation Fleet reserves capacity.
     * </p>
     * 
     * @param totalTargetCapacity
     *        The total number of capacity units for which the Capacity Reservation Fleet reserves capacity.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCapacityReservationFleetResult withTotalTargetCapacity(Integer totalTargetCapacity) {
        setTotalTargetCapacity(totalTargetCapacity);
        return this;
    }

    /**
     * <p>
     * The requested capacity units that have been successfully reserved.
     * </p>
     * 
     * @param totalFulfilledCapacity
     *        The requested capacity units that have been successfully reserved.
     */

    public void setTotalFulfilledCapacity(Double totalFulfilledCapacity) {
        this.totalFulfilledCapacity = totalFulfilledCapacity;
    }

    /**
     * <p>
     * The requested capacity units that have been successfully reserved.
     * </p>
     * 
     * @return The requested capacity units that have been successfully reserved.
     */

    public Double getTotalFulfilledCapacity() {
        return this.totalFulfilledCapacity;
    }

    /**
     * <p>
     * The requested capacity units that have been successfully reserved.
     * </p>
     * 
     * @param totalFulfilledCapacity
     *        The requested capacity units that have been successfully reserved.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCapacityReservationFleetResult withTotalFulfilledCapacity(Double totalFulfilledCapacity) {
        setTotalFulfilledCapacity(totalFulfilledCapacity);
        return this;
    }

    /**
     * <p>
     * The instance matching criteria for the Capacity Reservation Fleet.
     * </p>
     * 
     * @param instanceMatchCriteria
     *        The instance matching criteria for the Capacity Reservation Fleet.
     * @see FleetInstanceMatchCriteria
     */

    public void setInstanceMatchCriteria(String instanceMatchCriteria) {
        this.instanceMatchCriteria = instanceMatchCriteria;
    }

    /**
     * <p>
     * The instance matching criteria for the Capacity Reservation Fleet.
     * </p>
     * 
     * @return The instance matching criteria for the Capacity Reservation Fleet.
     * @see FleetInstanceMatchCriteria
     */

    public String getInstanceMatchCriteria() {
        return this.instanceMatchCriteria;
    }

    /**
     * <p>
     * The instance matching criteria for the Capacity Reservation Fleet.
     * </p>
     * 
     * @param instanceMatchCriteria
     *        The instance matching criteria for the Capacity Reservation Fleet.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FleetInstanceMatchCriteria
     */

    public CreateCapacityReservationFleetResult withInstanceMatchCriteria(String instanceMatchCriteria) {
        setInstanceMatchCriteria(instanceMatchCriteria);
        return this;
    }

    /**
     * <p>
     * The instance matching criteria for the Capacity Reservation Fleet.
     * </p>
     * 
     * @param instanceMatchCriteria
     *        The instance matching criteria for the Capacity Reservation Fleet.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FleetInstanceMatchCriteria
     */

    public CreateCapacityReservationFleetResult withInstanceMatchCriteria(FleetInstanceMatchCriteria instanceMatchCriteria) {
        this.instanceMatchCriteria = instanceMatchCriteria.toString();
        return this;
    }

    /**
     * <p>
     * The allocation strategy used by the Capacity Reservation Fleet.
     * </p>
     * 
     * @param allocationStrategy
     *        The allocation strategy used by the Capacity Reservation Fleet.
     */

    public void setAllocationStrategy(String allocationStrategy) {
        this.allocationStrategy = allocationStrategy;
    }

    /**
     * <p>
     * The allocation strategy used by the Capacity Reservation Fleet.
     * </p>
     * 
     * @return The allocation strategy used by the Capacity Reservation Fleet.
     */

    public String getAllocationStrategy() {
        return this.allocationStrategy;
    }

    /**
     * <p>
     * The allocation strategy used by the Capacity Reservation Fleet.
     * </p>
     * 
     * @param allocationStrategy
     *        The allocation strategy used by the Capacity Reservation Fleet.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCapacityReservationFleetResult withAllocationStrategy(String allocationStrategy) {
        setAllocationStrategy(allocationStrategy);
        return this;
    }

    /**
     * <p>
     * The date and time at which the Capacity Reservation Fleet was created.
     * </p>
     * 
     * @param createTime
     *        The date and time at which the Capacity Reservation Fleet was created.
     */

    public void setCreateTime(java.util.Date createTime) {
        this.createTime = createTime;
    }

    /**
     * <p>
     * The date and time at which the Capacity Reservation Fleet was created.
     * </p>
     * 
     * @return The date and time at which the Capacity Reservation Fleet was created.
     */

    public java.util.Date getCreateTime() {
        return this.createTime;
    }

    /**
     * <p>
     * The date and time at which the Capacity Reservation Fleet was created.
     * </p>
     * 
     * @param createTime
     *        The date and time at which the Capacity Reservation Fleet was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCapacityReservationFleetResult withCreateTime(java.util.Date createTime) {
        setCreateTime(createTime);
        return this;
    }

    /**
     * <p>
     * The date and time at which the Capacity Reservation Fleet expires.
     * </p>
     * 
     * @param endDate
     *        The date and time at which the Capacity Reservation Fleet expires.
     */

    public void setEndDate(java.util.Date endDate) {
        this.endDate = endDate;
    }

    /**
     * <p>
     * The date and time at which the Capacity Reservation Fleet expires.
     * </p>
     * 
     * @return The date and time at which the Capacity Reservation Fleet expires.
     */

    public java.util.Date getEndDate() {
        return this.endDate;
    }

    /**
     * <p>
     * The date and time at which the Capacity Reservation Fleet expires.
     * </p>
     * 
     * @param endDate
     *        The date and time at which the Capacity Reservation Fleet expires.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCapacityReservationFleetResult withEndDate(java.util.Date endDate) {
        setEndDate(endDate);
        return this;
    }

    /**
     * <p>
     * Indicates the tenancy of Capacity Reservation Fleet.
     * </p>
     * 
     * @param tenancy
     *        Indicates the tenancy of Capacity Reservation Fleet.
     * @see FleetCapacityReservationTenancy
     */

    public void setTenancy(String tenancy) {
        this.tenancy = tenancy;
    }

    /**
     * <p>
     * Indicates the tenancy of Capacity Reservation Fleet.
     * </p>
     * 
     * @return Indicates the tenancy of Capacity Reservation Fleet.
     * @see FleetCapacityReservationTenancy
     */

    public String getTenancy() {
        return this.tenancy;
    }

    /**
     * <p>
     * Indicates the tenancy of Capacity Reservation Fleet.
     * </p>
     * 
     * @param tenancy
     *        Indicates the tenancy of Capacity Reservation Fleet.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FleetCapacityReservationTenancy
     */

    public CreateCapacityReservationFleetResult withTenancy(String tenancy) {
        setTenancy(tenancy);
        return this;
    }

    /**
     * <p>
     * Indicates the tenancy of Capacity Reservation Fleet.
     * </p>
     * 
     * @param tenancy
     *        Indicates the tenancy of Capacity Reservation Fleet.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FleetCapacityReservationTenancy
     */

    public CreateCapacityReservationFleetResult withTenancy(FleetCapacityReservationTenancy tenancy) {
        this.tenancy = tenancy.toString();
        return this;
    }

    /**
     * <p>
     * Information about the individual Capacity Reservations in the Capacity Reservation Fleet.
     * </p>
     * 
     * @return Information about the individual Capacity Reservations in the Capacity Reservation Fleet.
     */

    public java.util.List<FleetCapacityReservation> getFleetCapacityReservations() {
        if (fleetCapacityReservations == null) {
            fleetCapacityReservations = new com.amazonaws.internal.SdkInternalList<FleetCapacityReservation>();
        }
        return fleetCapacityReservations;
    }

    /**
     * <p>
     * Information about the individual Capacity Reservations in the Capacity Reservation Fleet.
     * </p>
     * 
     * @param fleetCapacityReservations
     *        Information about the individual Capacity Reservations in the Capacity Reservation Fleet.
     */

    public void setFleetCapacityReservations(java.util.Collection<FleetCapacityReservation> fleetCapacityReservations) {
        if (fleetCapacityReservations == null) {
            this.fleetCapacityReservations = null;
            return;
        }

        this.fleetCapacityReservations = new com.amazonaws.internal.SdkInternalList<FleetCapacityReservation>(fleetCapacityReservations);
    }

    /**
     * <p>
     * Information about the individual Capacity Reservations in the Capacity Reservation Fleet.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFleetCapacityReservations(java.util.Collection)} or
     * {@link #withFleetCapacityReservations(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param fleetCapacityReservations
     *        Information about the individual Capacity Reservations in the Capacity Reservation Fleet.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCapacityReservationFleetResult withFleetCapacityReservations(FleetCapacityReservation... fleetCapacityReservations) {
        if (this.fleetCapacityReservations == null) {
            setFleetCapacityReservations(new com.amazonaws.internal.SdkInternalList<FleetCapacityReservation>(fleetCapacityReservations.length));
        }
        for (FleetCapacityReservation ele : fleetCapacityReservations) {
            this.fleetCapacityReservations.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Information about the individual Capacity Reservations in the Capacity Reservation Fleet.
     * </p>
     * 
     * @param fleetCapacityReservations
     *        Information about the individual Capacity Reservations in the Capacity Reservation Fleet.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCapacityReservationFleetResult withFleetCapacityReservations(java.util.Collection<FleetCapacityReservation> fleetCapacityReservations) {
        setFleetCapacityReservations(fleetCapacityReservations);
        return this;
    }

    /**
     * <p>
     * The tags assigned to the Capacity Reservation Fleet.
     * </p>
     * 
     * @return The tags assigned to the Capacity Reservation Fleet.
     */

    public java.util.List<Tag> getTags() {
        if (tags == null) {
            tags = new com.amazonaws.internal.SdkInternalList<Tag>();
        }
        return tags;
    }

    /**
     * <p>
     * The tags assigned to the Capacity Reservation Fleet.
     * </p>
     * 
     * @param tags
     *        The tags assigned to the Capacity Reservation Fleet.
     */

    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new com.amazonaws.internal.SdkInternalList<Tag>(tags);
    }

    /**
     * <p>
     * The tags assigned to the Capacity Reservation Fleet.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        The tags assigned to the Capacity Reservation Fleet.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCapacityReservationFleetResult withTags(Tag... tags) {
        if (this.tags == null) {
            setTags(new com.amazonaws.internal.SdkInternalList<Tag>(tags.length));
        }
        for (Tag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The tags assigned to the Capacity Reservation Fleet.
     * </p>
     * 
     * @param tags
     *        The tags assigned to the Capacity Reservation Fleet.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCapacityReservationFleetResult withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
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
        if (getCapacityReservationFleetId() != null)
            sb.append("CapacityReservationFleetId: ").append(getCapacityReservationFleetId()).append(",");
        if (getState() != null)
            sb.append("State: ").append(getState()).append(",");
        if (getTotalTargetCapacity() != null)
            sb.append("TotalTargetCapacity: ").append(getTotalTargetCapacity()).append(",");
        if (getTotalFulfilledCapacity() != null)
            sb.append("TotalFulfilledCapacity: ").append(getTotalFulfilledCapacity()).append(",");
        if (getInstanceMatchCriteria() != null)
            sb.append("InstanceMatchCriteria: ").append(getInstanceMatchCriteria()).append(",");
        if (getAllocationStrategy() != null)
            sb.append("AllocationStrategy: ").append(getAllocationStrategy()).append(",");
        if (getCreateTime() != null)
            sb.append("CreateTime: ").append(getCreateTime()).append(",");
        if (getEndDate() != null)
            sb.append("EndDate: ").append(getEndDate()).append(",");
        if (getTenancy() != null)
            sb.append("Tenancy: ").append(getTenancy()).append(",");
        if (getFleetCapacityReservations() != null)
            sb.append("FleetCapacityReservations: ").append(getFleetCapacityReservations()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateCapacityReservationFleetResult == false)
            return false;
        CreateCapacityReservationFleetResult other = (CreateCapacityReservationFleetResult) obj;
        if (other.getCapacityReservationFleetId() == null ^ this.getCapacityReservationFleetId() == null)
            return false;
        if (other.getCapacityReservationFleetId() != null && other.getCapacityReservationFleetId().equals(this.getCapacityReservationFleetId()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        if (other.getTotalTargetCapacity() == null ^ this.getTotalTargetCapacity() == null)
            return false;
        if (other.getTotalTargetCapacity() != null && other.getTotalTargetCapacity().equals(this.getTotalTargetCapacity()) == false)
            return false;
        if (other.getTotalFulfilledCapacity() == null ^ this.getTotalFulfilledCapacity() == null)
            return false;
        if (other.getTotalFulfilledCapacity() != null && other.getTotalFulfilledCapacity().equals(this.getTotalFulfilledCapacity()) == false)
            return false;
        if (other.getInstanceMatchCriteria() == null ^ this.getInstanceMatchCriteria() == null)
            return false;
        if (other.getInstanceMatchCriteria() != null && other.getInstanceMatchCriteria().equals(this.getInstanceMatchCriteria()) == false)
            return false;
        if (other.getAllocationStrategy() == null ^ this.getAllocationStrategy() == null)
            return false;
        if (other.getAllocationStrategy() != null && other.getAllocationStrategy().equals(this.getAllocationStrategy()) == false)
            return false;
        if (other.getCreateTime() == null ^ this.getCreateTime() == null)
            return false;
        if (other.getCreateTime() != null && other.getCreateTime().equals(this.getCreateTime()) == false)
            return false;
        if (other.getEndDate() == null ^ this.getEndDate() == null)
            return false;
        if (other.getEndDate() != null && other.getEndDate().equals(this.getEndDate()) == false)
            return false;
        if (other.getTenancy() == null ^ this.getTenancy() == null)
            return false;
        if (other.getTenancy() != null && other.getTenancy().equals(this.getTenancy()) == false)
            return false;
        if (other.getFleetCapacityReservations() == null ^ this.getFleetCapacityReservations() == null)
            return false;
        if (other.getFleetCapacityReservations() != null && other.getFleetCapacityReservations().equals(this.getFleetCapacityReservations()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCapacityReservationFleetId() == null) ? 0 : getCapacityReservationFleetId().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        hashCode = prime * hashCode + ((getTotalTargetCapacity() == null) ? 0 : getTotalTargetCapacity().hashCode());
        hashCode = prime * hashCode + ((getTotalFulfilledCapacity() == null) ? 0 : getTotalFulfilledCapacity().hashCode());
        hashCode = prime * hashCode + ((getInstanceMatchCriteria() == null) ? 0 : getInstanceMatchCriteria().hashCode());
        hashCode = prime * hashCode + ((getAllocationStrategy() == null) ? 0 : getAllocationStrategy().hashCode());
        hashCode = prime * hashCode + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        hashCode = prime * hashCode + ((getEndDate() == null) ? 0 : getEndDate().hashCode());
        hashCode = prime * hashCode + ((getTenancy() == null) ? 0 : getTenancy().hashCode());
        hashCode = prime * hashCode + ((getFleetCapacityReservations() == null) ? 0 : getFleetCapacityReservations().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateCapacityReservationFleetResult clone() {
        try {
            return (CreateCapacityReservationFleetResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
