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
 * Information about a Capacity Reservation in a Capacity Reservation Fleet.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/FleetCapacityReservation" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FleetCapacityReservation implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the Capacity Reservation.
     * </p>
     */
    private String capacityReservationId;
    /**
     * <p>
     * The ID of the Availability Zone in which the Capacity Reservation reserves capacity.
     * </p>
     */
    private String availabilityZoneId;
    /**
     * <p>
     * The instance type for which the Capacity Reservation reserves capacity.
     * </p>
     */
    private String instanceType;
    /**
     * <p>
     * The type of operating system for which the Capacity Reservation reserves capacity.
     * </p>
     */
    private String instancePlatform;
    /**
     * <p>
     * The Availability Zone in which the Capacity Reservation reserves capacity.
     * </p>
     */
    private String availabilityZone;
    /**
     * <p>
     * The total number of instances for which the Capacity Reservation reserves capacity.
     * </p>
     */
    private Integer totalInstanceCount;
    /**
     * <p>
     * The number of capacity units fulfilled by the Capacity Reservation. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/crfleet-concepts.html#target-capacity"> Total target
     * capacity</a> in the Amazon EC2 User Guide.
     * </p>
     */
    private Double fulfilledCapacity;
    /**
     * <p>
     * Indicates whether the Capacity Reservation reserves capacity for EBS-optimized instance types.
     * </p>
     */
    private Boolean ebsOptimized;
    /**
     * <p>
     * The date and time at which the Capacity Reservation was created.
     * </p>
     */
    private java.util.Date createDate;
    /**
     * <p>
     * The weight of the instance type in the Capacity Reservation Fleet. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/crfleet-concepts.html#instance-weight"> Instance type
     * weight</a> in the Amazon EC2 User Guide.
     * </p>
     */
    private Double weight;
    /**
     * <p>
     * The priority of the instance type in the Capacity Reservation Fleet. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/crfleet-concepts.html#instance-priority"> Instance type
     * priority</a> in the Amazon EC2 User Guide.
     * </p>
     */
    private Integer priority;

    /**
     * <p>
     * The ID of the Capacity Reservation.
     * </p>
     * 
     * @param capacityReservationId
     *        The ID of the Capacity Reservation.
     */

    public void setCapacityReservationId(String capacityReservationId) {
        this.capacityReservationId = capacityReservationId;
    }

    /**
     * <p>
     * The ID of the Capacity Reservation.
     * </p>
     * 
     * @return The ID of the Capacity Reservation.
     */

    public String getCapacityReservationId() {
        return this.capacityReservationId;
    }

    /**
     * <p>
     * The ID of the Capacity Reservation.
     * </p>
     * 
     * @param capacityReservationId
     *        The ID of the Capacity Reservation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FleetCapacityReservation withCapacityReservationId(String capacityReservationId) {
        setCapacityReservationId(capacityReservationId);
        return this;
    }

    /**
     * <p>
     * The ID of the Availability Zone in which the Capacity Reservation reserves capacity.
     * </p>
     * 
     * @param availabilityZoneId
     *        The ID of the Availability Zone in which the Capacity Reservation reserves capacity.
     */

    public void setAvailabilityZoneId(String availabilityZoneId) {
        this.availabilityZoneId = availabilityZoneId;
    }

    /**
     * <p>
     * The ID of the Availability Zone in which the Capacity Reservation reserves capacity.
     * </p>
     * 
     * @return The ID of the Availability Zone in which the Capacity Reservation reserves capacity.
     */

    public String getAvailabilityZoneId() {
        return this.availabilityZoneId;
    }

    /**
     * <p>
     * The ID of the Availability Zone in which the Capacity Reservation reserves capacity.
     * </p>
     * 
     * @param availabilityZoneId
     *        The ID of the Availability Zone in which the Capacity Reservation reserves capacity.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FleetCapacityReservation withAvailabilityZoneId(String availabilityZoneId) {
        setAvailabilityZoneId(availabilityZoneId);
        return this;
    }

    /**
     * <p>
     * The instance type for which the Capacity Reservation reserves capacity.
     * </p>
     * 
     * @param instanceType
     *        The instance type for which the Capacity Reservation reserves capacity.
     * @see InstanceType
     */

    public void setInstanceType(String instanceType) {
        this.instanceType = instanceType;
    }

    /**
     * <p>
     * The instance type for which the Capacity Reservation reserves capacity.
     * </p>
     * 
     * @return The instance type for which the Capacity Reservation reserves capacity.
     * @see InstanceType
     */

    public String getInstanceType() {
        return this.instanceType;
    }

    /**
     * <p>
     * The instance type for which the Capacity Reservation reserves capacity.
     * </p>
     * 
     * @param instanceType
     *        The instance type for which the Capacity Reservation reserves capacity.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InstanceType
     */

    public FleetCapacityReservation withInstanceType(String instanceType) {
        setInstanceType(instanceType);
        return this;
    }

    /**
     * <p>
     * The instance type for which the Capacity Reservation reserves capacity.
     * </p>
     * 
     * @param instanceType
     *        The instance type for which the Capacity Reservation reserves capacity.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InstanceType
     */

    public FleetCapacityReservation withInstanceType(InstanceType instanceType) {
        this.instanceType = instanceType.toString();
        return this;
    }

    /**
     * <p>
     * The type of operating system for which the Capacity Reservation reserves capacity.
     * </p>
     * 
     * @param instancePlatform
     *        The type of operating system for which the Capacity Reservation reserves capacity.
     * @see CapacityReservationInstancePlatform
     */

    public void setInstancePlatform(String instancePlatform) {
        this.instancePlatform = instancePlatform;
    }

    /**
     * <p>
     * The type of operating system for which the Capacity Reservation reserves capacity.
     * </p>
     * 
     * @return The type of operating system for which the Capacity Reservation reserves capacity.
     * @see CapacityReservationInstancePlatform
     */

    public String getInstancePlatform() {
        return this.instancePlatform;
    }

    /**
     * <p>
     * The type of operating system for which the Capacity Reservation reserves capacity.
     * </p>
     * 
     * @param instancePlatform
     *        The type of operating system for which the Capacity Reservation reserves capacity.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CapacityReservationInstancePlatform
     */

    public FleetCapacityReservation withInstancePlatform(String instancePlatform) {
        setInstancePlatform(instancePlatform);
        return this;
    }

    /**
     * <p>
     * The type of operating system for which the Capacity Reservation reserves capacity.
     * </p>
     * 
     * @param instancePlatform
     *        The type of operating system for which the Capacity Reservation reserves capacity.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CapacityReservationInstancePlatform
     */

    public FleetCapacityReservation withInstancePlatform(CapacityReservationInstancePlatform instancePlatform) {
        this.instancePlatform = instancePlatform.toString();
        return this;
    }

    /**
     * <p>
     * The Availability Zone in which the Capacity Reservation reserves capacity.
     * </p>
     * 
     * @param availabilityZone
     *        The Availability Zone in which the Capacity Reservation reserves capacity.
     */

    public void setAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
    }

    /**
     * <p>
     * The Availability Zone in which the Capacity Reservation reserves capacity.
     * </p>
     * 
     * @return The Availability Zone in which the Capacity Reservation reserves capacity.
     */

    public String getAvailabilityZone() {
        return this.availabilityZone;
    }

    /**
     * <p>
     * The Availability Zone in which the Capacity Reservation reserves capacity.
     * </p>
     * 
     * @param availabilityZone
     *        The Availability Zone in which the Capacity Reservation reserves capacity.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FleetCapacityReservation withAvailabilityZone(String availabilityZone) {
        setAvailabilityZone(availabilityZone);
        return this;
    }

    /**
     * <p>
     * The total number of instances for which the Capacity Reservation reserves capacity.
     * </p>
     * 
     * @param totalInstanceCount
     *        The total number of instances for which the Capacity Reservation reserves capacity.
     */

    public void setTotalInstanceCount(Integer totalInstanceCount) {
        this.totalInstanceCount = totalInstanceCount;
    }

    /**
     * <p>
     * The total number of instances for which the Capacity Reservation reserves capacity.
     * </p>
     * 
     * @return The total number of instances for which the Capacity Reservation reserves capacity.
     */

    public Integer getTotalInstanceCount() {
        return this.totalInstanceCount;
    }

    /**
     * <p>
     * The total number of instances for which the Capacity Reservation reserves capacity.
     * </p>
     * 
     * @param totalInstanceCount
     *        The total number of instances for which the Capacity Reservation reserves capacity.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FleetCapacityReservation withTotalInstanceCount(Integer totalInstanceCount) {
        setTotalInstanceCount(totalInstanceCount);
        return this;
    }

    /**
     * <p>
     * The number of capacity units fulfilled by the Capacity Reservation. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/crfleet-concepts.html#target-capacity"> Total target
     * capacity</a> in the Amazon EC2 User Guide.
     * </p>
     * 
     * @param fulfilledCapacity
     *        The number of capacity units fulfilled by the Capacity Reservation. For more information, see <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/crfleet-concepts.html#target-capacity"> Total
     *        target capacity</a> in the Amazon EC2 User Guide.
     */

    public void setFulfilledCapacity(Double fulfilledCapacity) {
        this.fulfilledCapacity = fulfilledCapacity;
    }

    /**
     * <p>
     * The number of capacity units fulfilled by the Capacity Reservation. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/crfleet-concepts.html#target-capacity"> Total target
     * capacity</a> in the Amazon EC2 User Guide.
     * </p>
     * 
     * @return The number of capacity units fulfilled by the Capacity Reservation. For more information, see <a
     *         href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/crfleet-concepts.html#target-capacity"> Total
     *         target capacity</a> in the Amazon EC2 User Guide.
     */

    public Double getFulfilledCapacity() {
        return this.fulfilledCapacity;
    }

    /**
     * <p>
     * The number of capacity units fulfilled by the Capacity Reservation. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/crfleet-concepts.html#target-capacity"> Total target
     * capacity</a> in the Amazon EC2 User Guide.
     * </p>
     * 
     * @param fulfilledCapacity
     *        The number of capacity units fulfilled by the Capacity Reservation. For more information, see <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/crfleet-concepts.html#target-capacity"> Total
     *        target capacity</a> in the Amazon EC2 User Guide.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FleetCapacityReservation withFulfilledCapacity(Double fulfilledCapacity) {
        setFulfilledCapacity(fulfilledCapacity);
        return this;
    }

    /**
     * <p>
     * Indicates whether the Capacity Reservation reserves capacity for EBS-optimized instance types.
     * </p>
     * 
     * @param ebsOptimized
     *        Indicates whether the Capacity Reservation reserves capacity for EBS-optimized instance types.
     */

    public void setEbsOptimized(Boolean ebsOptimized) {
        this.ebsOptimized = ebsOptimized;
    }

    /**
     * <p>
     * Indicates whether the Capacity Reservation reserves capacity for EBS-optimized instance types.
     * </p>
     * 
     * @return Indicates whether the Capacity Reservation reserves capacity for EBS-optimized instance types.
     */

    public Boolean getEbsOptimized() {
        return this.ebsOptimized;
    }

    /**
     * <p>
     * Indicates whether the Capacity Reservation reserves capacity for EBS-optimized instance types.
     * </p>
     * 
     * @param ebsOptimized
     *        Indicates whether the Capacity Reservation reserves capacity for EBS-optimized instance types.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FleetCapacityReservation withEbsOptimized(Boolean ebsOptimized) {
        setEbsOptimized(ebsOptimized);
        return this;
    }

    /**
     * <p>
     * Indicates whether the Capacity Reservation reserves capacity for EBS-optimized instance types.
     * </p>
     * 
     * @return Indicates whether the Capacity Reservation reserves capacity for EBS-optimized instance types.
     */

    public Boolean isEbsOptimized() {
        return this.ebsOptimized;
    }

    /**
     * <p>
     * The date and time at which the Capacity Reservation was created.
     * </p>
     * 
     * @param createDate
     *        The date and time at which the Capacity Reservation was created.
     */

    public void setCreateDate(java.util.Date createDate) {
        this.createDate = createDate;
    }

    /**
     * <p>
     * The date and time at which the Capacity Reservation was created.
     * </p>
     * 
     * @return The date and time at which the Capacity Reservation was created.
     */

    public java.util.Date getCreateDate() {
        return this.createDate;
    }

    /**
     * <p>
     * The date and time at which the Capacity Reservation was created.
     * </p>
     * 
     * @param createDate
     *        The date and time at which the Capacity Reservation was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FleetCapacityReservation withCreateDate(java.util.Date createDate) {
        setCreateDate(createDate);
        return this;
    }

    /**
     * <p>
     * The weight of the instance type in the Capacity Reservation Fleet. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/crfleet-concepts.html#instance-weight"> Instance type
     * weight</a> in the Amazon EC2 User Guide.
     * </p>
     * 
     * @param weight
     *        The weight of the instance type in the Capacity Reservation Fleet. For more information, see <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/crfleet-concepts.html#instance-weight"> Instance
     *        type weight</a> in the Amazon EC2 User Guide.
     */

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    /**
     * <p>
     * The weight of the instance type in the Capacity Reservation Fleet. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/crfleet-concepts.html#instance-weight"> Instance type
     * weight</a> in the Amazon EC2 User Guide.
     * </p>
     * 
     * @return The weight of the instance type in the Capacity Reservation Fleet. For more information, see <a
     *         href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/crfleet-concepts.html#instance-weight">
     *         Instance type weight</a> in the Amazon EC2 User Guide.
     */

    public Double getWeight() {
        return this.weight;
    }

    /**
     * <p>
     * The weight of the instance type in the Capacity Reservation Fleet. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/crfleet-concepts.html#instance-weight"> Instance type
     * weight</a> in the Amazon EC2 User Guide.
     * </p>
     * 
     * @param weight
     *        The weight of the instance type in the Capacity Reservation Fleet. For more information, see <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/crfleet-concepts.html#instance-weight"> Instance
     *        type weight</a> in the Amazon EC2 User Guide.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FleetCapacityReservation withWeight(Double weight) {
        setWeight(weight);
        return this;
    }

    /**
     * <p>
     * The priority of the instance type in the Capacity Reservation Fleet. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/crfleet-concepts.html#instance-priority"> Instance type
     * priority</a> in the Amazon EC2 User Guide.
     * </p>
     * 
     * @param priority
     *        The priority of the instance type in the Capacity Reservation Fleet. For more information, see <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/crfleet-concepts.html#instance-priority">
     *        Instance type priority</a> in the Amazon EC2 User Guide.
     */

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    /**
     * <p>
     * The priority of the instance type in the Capacity Reservation Fleet. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/crfleet-concepts.html#instance-priority"> Instance type
     * priority</a> in the Amazon EC2 User Guide.
     * </p>
     * 
     * @return The priority of the instance type in the Capacity Reservation Fleet. For more information, see <a
     *         href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/crfleet-concepts.html#instance-priority">
     *         Instance type priority</a> in the Amazon EC2 User Guide.
     */

    public Integer getPriority() {
        return this.priority;
    }

    /**
     * <p>
     * The priority of the instance type in the Capacity Reservation Fleet. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/crfleet-concepts.html#instance-priority"> Instance type
     * priority</a> in the Amazon EC2 User Guide.
     * </p>
     * 
     * @param priority
     *        The priority of the instance type in the Capacity Reservation Fleet. For more information, see <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/crfleet-concepts.html#instance-priority">
     *        Instance type priority</a> in the Amazon EC2 User Guide.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FleetCapacityReservation withPriority(Integer priority) {
        setPriority(priority);
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
        if (getCapacityReservationId() != null)
            sb.append("CapacityReservationId: ").append(getCapacityReservationId()).append(",");
        if (getAvailabilityZoneId() != null)
            sb.append("AvailabilityZoneId: ").append(getAvailabilityZoneId()).append(",");
        if (getInstanceType() != null)
            sb.append("InstanceType: ").append(getInstanceType()).append(",");
        if (getInstancePlatform() != null)
            sb.append("InstancePlatform: ").append(getInstancePlatform()).append(",");
        if (getAvailabilityZone() != null)
            sb.append("AvailabilityZone: ").append(getAvailabilityZone()).append(",");
        if (getTotalInstanceCount() != null)
            sb.append("TotalInstanceCount: ").append(getTotalInstanceCount()).append(",");
        if (getFulfilledCapacity() != null)
            sb.append("FulfilledCapacity: ").append(getFulfilledCapacity()).append(",");
        if (getEbsOptimized() != null)
            sb.append("EbsOptimized: ").append(getEbsOptimized()).append(",");
        if (getCreateDate() != null)
            sb.append("CreateDate: ").append(getCreateDate()).append(",");
        if (getWeight() != null)
            sb.append("Weight: ").append(getWeight()).append(",");
        if (getPriority() != null)
            sb.append("Priority: ").append(getPriority());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof FleetCapacityReservation == false)
            return false;
        FleetCapacityReservation other = (FleetCapacityReservation) obj;
        if (other.getCapacityReservationId() == null ^ this.getCapacityReservationId() == null)
            return false;
        if (other.getCapacityReservationId() != null && other.getCapacityReservationId().equals(this.getCapacityReservationId()) == false)
            return false;
        if (other.getAvailabilityZoneId() == null ^ this.getAvailabilityZoneId() == null)
            return false;
        if (other.getAvailabilityZoneId() != null && other.getAvailabilityZoneId().equals(this.getAvailabilityZoneId()) == false)
            return false;
        if (other.getInstanceType() == null ^ this.getInstanceType() == null)
            return false;
        if (other.getInstanceType() != null && other.getInstanceType().equals(this.getInstanceType()) == false)
            return false;
        if (other.getInstancePlatform() == null ^ this.getInstancePlatform() == null)
            return false;
        if (other.getInstancePlatform() != null && other.getInstancePlatform().equals(this.getInstancePlatform()) == false)
            return false;
        if (other.getAvailabilityZone() == null ^ this.getAvailabilityZone() == null)
            return false;
        if (other.getAvailabilityZone() != null && other.getAvailabilityZone().equals(this.getAvailabilityZone()) == false)
            return false;
        if (other.getTotalInstanceCount() == null ^ this.getTotalInstanceCount() == null)
            return false;
        if (other.getTotalInstanceCount() != null && other.getTotalInstanceCount().equals(this.getTotalInstanceCount()) == false)
            return false;
        if (other.getFulfilledCapacity() == null ^ this.getFulfilledCapacity() == null)
            return false;
        if (other.getFulfilledCapacity() != null && other.getFulfilledCapacity().equals(this.getFulfilledCapacity()) == false)
            return false;
        if (other.getEbsOptimized() == null ^ this.getEbsOptimized() == null)
            return false;
        if (other.getEbsOptimized() != null && other.getEbsOptimized().equals(this.getEbsOptimized()) == false)
            return false;
        if (other.getCreateDate() == null ^ this.getCreateDate() == null)
            return false;
        if (other.getCreateDate() != null && other.getCreateDate().equals(this.getCreateDate()) == false)
            return false;
        if (other.getWeight() == null ^ this.getWeight() == null)
            return false;
        if (other.getWeight() != null && other.getWeight().equals(this.getWeight()) == false)
            return false;
        if (other.getPriority() == null ^ this.getPriority() == null)
            return false;
        if (other.getPriority() != null && other.getPriority().equals(this.getPriority()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCapacityReservationId() == null) ? 0 : getCapacityReservationId().hashCode());
        hashCode = prime * hashCode + ((getAvailabilityZoneId() == null) ? 0 : getAvailabilityZoneId().hashCode());
        hashCode = prime * hashCode + ((getInstanceType() == null) ? 0 : getInstanceType().hashCode());
        hashCode = prime * hashCode + ((getInstancePlatform() == null) ? 0 : getInstancePlatform().hashCode());
        hashCode = prime * hashCode + ((getAvailabilityZone() == null) ? 0 : getAvailabilityZone().hashCode());
        hashCode = prime * hashCode + ((getTotalInstanceCount() == null) ? 0 : getTotalInstanceCount().hashCode());
        hashCode = prime * hashCode + ((getFulfilledCapacity() == null) ? 0 : getFulfilledCapacity().hashCode());
        hashCode = prime * hashCode + ((getEbsOptimized() == null) ? 0 : getEbsOptimized().hashCode());
        hashCode = prime * hashCode + ((getCreateDate() == null) ? 0 : getCreateDate().hashCode());
        hashCode = prime * hashCode + ((getWeight() == null) ? 0 : getWeight().hashCode());
        hashCode = prime * hashCode + ((getPriority() == null) ? 0 : getPriority().hashCode());
        return hashCode;
    }

    @Override
    public FleetCapacityReservation clone() {
        try {
            return (FleetCapacityReservation) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
