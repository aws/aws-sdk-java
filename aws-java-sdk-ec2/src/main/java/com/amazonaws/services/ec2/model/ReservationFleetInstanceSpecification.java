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
 * Information about an instance type to use in a Capacity Reservation Fleet.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/ReservationFleetInstanceSpecification"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ReservationFleetInstanceSpecification implements Serializable, Cloneable {

    /**
     * <p>
     * The instance type for which the Capacity Reservation Fleet reserves capacity.
     * </p>
     */
    private String instanceType;
    /**
     * <p>
     * The type of operating system for which the Capacity Reservation Fleet reserves capacity.
     * </p>
     */
    private String instancePlatform;
    /**
     * <p>
     * The number of capacity units provided by the specified instance type. This value, together with the total target
     * capacity that you specify for the Fleet determine the number of instances for which the Fleet reserves capacity.
     * Both values are based on units that make sense for your workload. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/crfleet-concepts.html#target-capacity">Total target
     * capacity</a> in the Amazon EC2 User Guide.
     * </p>
     */
    private Double weight;
    /**
     * <p>
     * The Availability Zone in which the Capacity Reservation Fleet reserves the capacity. A Capacity Reservation Fleet
     * can't span Availability Zones. All instance type specifications that you specify for the Fleet must use the same
     * Availability Zone.
     * </p>
     */
    private String availabilityZone;
    /**
     * <p>
     * The ID of the Availability Zone in which the Capacity Reservation Fleet reserves the capacity. A Capacity
     * Reservation Fleet can't span Availability Zones. All instance type specifications that you specify for the Fleet
     * must use the same Availability Zone.
     * </p>
     */
    private String availabilityZoneId;
    /**
     * <p>
     * Indicates whether the Capacity Reservation Fleet supports EBS-optimized instances types. This optimization
     * provides dedicated throughput to Amazon EBS and an optimized configuration stack to provide optimal I/O
     * performance. This optimization isn't available with all instance types. Additional usage charges apply when using
     * EBS-optimized instance types.
     * </p>
     */
    private Boolean ebsOptimized;
    /**
     * <p>
     * The priority to assign to the instance type. This value is used to determine which of the instance types
     * specified for the Fleet should be prioritized for use. A lower value indicates a high priority. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/crfleet-concepts.html#instance-priority">Instance type
     * priority</a> in the Amazon EC2 User Guide.
     * </p>
     */
    private Integer priority;

    /**
     * <p>
     * The instance type for which the Capacity Reservation Fleet reserves capacity.
     * </p>
     * 
     * @param instanceType
     *        The instance type for which the Capacity Reservation Fleet reserves capacity.
     * @see InstanceType
     */

    public void setInstanceType(String instanceType) {
        this.instanceType = instanceType;
    }

    /**
     * <p>
     * The instance type for which the Capacity Reservation Fleet reserves capacity.
     * </p>
     * 
     * @return The instance type for which the Capacity Reservation Fleet reserves capacity.
     * @see InstanceType
     */

    public String getInstanceType() {
        return this.instanceType;
    }

    /**
     * <p>
     * The instance type for which the Capacity Reservation Fleet reserves capacity.
     * </p>
     * 
     * @param instanceType
     *        The instance type for which the Capacity Reservation Fleet reserves capacity.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InstanceType
     */

    public ReservationFleetInstanceSpecification withInstanceType(String instanceType) {
        setInstanceType(instanceType);
        return this;
    }

    /**
     * <p>
     * The instance type for which the Capacity Reservation Fleet reserves capacity.
     * </p>
     * 
     * @param instanceType
     *        The instance type for which the Capacity Reservation Fleet reserves capacity.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InstanceType
     */

    public ReservationFleetInstanceSpecification withInstanceType(InstanceType instanceType) {
        this.instanceType = instanceType.toString();
        return this;
    }

    /**
     * <p>
     * The type of operating system for which the Capacity Reservation Fleet reserves capacity.
     * </p>
     * 
     * @param instancePlatform
     *        The type of operating system for which the Capacity Reservation Fleet reserves capacity.
     * @see CapacityReservationInstancePlatform
     */

    public void setInstancePlatform(String instancePlatform) {
        this.instancePlatform = instancePlatform;
    }

    /**
     * <p>
     * The type of operating system for which the Capacity Reservation Fleet reserves capacity.
     * </p>
     * 
     * @return The type of operating system for which the Capacity Reservation Fleet reserves capacity.
     * @see CapacityReservationInstancePlatform
     */

    public String getInstancePlatform() {
        return this.instancePlatform;
    }

    /**
     * <p>
     * The type of operating system for which the Capacity Reservation Fleet reserves capacity.
     * </p>
     * 
     * @param instancePlatform
     *        The type of operating system for which the Capacity Reservation Fleet reserves capacity.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CapacityReservationInstancePlatform
     */

    public ReservationFleetInstanceSpecification withInstancePlatform(String instancePlatform) {
        setInstancePlatform(instancePlatform);
        return this;
    }

    /**
     * <p>
     * The type of operating system for which the Capacity Reservation Fleet reserves capacity.
     * </p>
     * 
     * @param instancePlatform
     *        The type of operating system for which the Capacity Reservation Fleet reserves capacity.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CapacityReservationInstancePlatform
     */

    public ReservationFleetInstanceSpecification withInstancePlatform(CapacityReservationInstancePlatform instancePlatform) {
        this.instancePlatform = instancePlatform.toString();
        return this;
    }

    /**
     * <p>
     * The number of capacity units provided by the specified instance type. This value, together with the total target
     * capacity that you specify for the Fleet determine the number of instances for which the Fleet reserves capacity.
     * Both values are based on units that make sense for your workload. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/crfleet-concepts.html#target-capacity">Total target
     * capacity</a> in the Amazon EC2 User Guide.
     * </p>
     * 
     * @param weight
     *        The number of capacity units provided by the specified instance type. This value, together with the total
     *        target capacity that you specify for the Fleet determine the number of instances for which the Fleet
     *        reserves capacity. Both values are based on units that make sense for your workload. For more information,
     *        see <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/crfleet-concepts.html#target-capacity">Total
     *        target capacity</a> in the Amazon EC2 User Guide.
     */

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    /**
     * <p>
     * The number of capacity units provided by the specified instance type. This value, together with the total target
     * capacity that you specify for the Fleet determine the number of instances for which the Fleet reserves capacity.
     * Both values are based on units that make sense for your workload. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/crfleet-concepts.html#target-capacity">Total target
     * capacity</a> in the Amazon EC2 User Guide.
     * </p>
     * 
     * @return The number of capacity units provided by the specified instance type. This value, together with the total
     *         target capacity that you specify for the Fleet determine the number of instances for which the Fleet
     *         reserves capacity. Both values are based on units that make sense for your workload. For more
     *         information, see <a
     *         href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/crfleet-concepts.html#target-capacity">Total
     *         target capacity</a> in the Amazon EC2 User Guide.
     */

    public Double getWeight() {
        return this.weight;
    }

    /**
     * <p>
     * The number of capacity units provided by the specified instance type. This value, together with the total target
     * capacity that you specify for the Fleet determine the number of instances for which the Fleet reserves capacity.
     * Both values are based on units that make sense for your workload. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/crfleet-concepts.html#target-capacity">Total target
     * capacity</a> in the Amazon EC2 User Guide.
     * </p>
     * 
     * @param weight
     *        The number of capacity units provided by the specified instance type. This value, together with the total
     *        target capacity that you specify for the Fleet determine the number of instances for which the Fleet
     *        reserves capacity. Both values are based on units that make sense for your workload. For more information,
     *        see <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/crfleet-concepts.html#target-capacity">Total
     *        target capacity</a> in the Amazon EC2 User Guide.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReservationFleetInstanceSpecification withWeight(Double weight) {
        setWeight(weight);
        return this;
    }

    /**
     * <p>
     * The Availability Zone in which the Capacity Reservation Fleet reserves the capacity. A Capacity Reservation Fleet
     * can't span Availability Zones. All instance type specifications that you specify for the Fleet must use the same
     * Availability Zone.
     * </p>
     * 
     * @param availabilityZone
     *        The Availability Zone in which the Capacity Reservation Fleet reserves the capacity. A Capacity
     *        Reservation Fleet can't span Availability Zones. All instance type specifications that you specify for the
     *        Fleet must use the same Availability Zone.
     */

    public void setAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
    }

    /**
     * <p>
     * The Availability Zone in which the Capacity Reservation Fleet reserves the capacity. A Capacity Reservation Fleet
     * can't span Availability Zones. All instance type specifications that you specify for the Fleet must use the same
     * Availability Zone.
     * </p>
     * 
     * @return The Availability Zone in which the Capacity Reservation Fleet reserves the capacity. A Capacity
     *         Reservation Fleet can't span Availability Zones. All instance type specifications that you specify for
     *         the Fleet must use the same Availability Zone.
     */

    public String getAvailabilityZone() {
        return this.availabilityZone;
    }

    /**
     * <p>
     * The Availability Zone in which the Capacity Reservation Fleet reserves the capacity. A Capacity Reservation Fleet
     * can't span Availability Zones. All instance type specifications that you specify for the Fleet must use the same
     * Availability Zone.
     * </p>
     * 
     * @param availabilityZone
     *        The Availability Zone in which the Capacity Reservation Fleet reserves the capacity. A Capacity
     *        Reservation Fleet can't span Availability Zones. All instance type specifications that you specify for the
     *        Fleet must use the same Availability Zone.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReservationFleetInstanceSpecification withAvailabilityZone(String availabilityZone) {
        setAvailabilityZone(availabilityZone);
        return this;
    }

    /**
     * <p>
     * The ID of the Availability Zone in which the Capacity Reservation Fleet reserves the capacity. A Capacity
     * Reservation Fleet can't span Availability Zones. All instance type specifications that you specify for the Fleet
     * must use the same Availability Zone.
     * </p>
     * 
     * @param availabilityZoneId
     *        The ID of the Availability Zone in which the Capacity Reservation Fleet reserves the capacity. A Capacity
     *        Reservation Fleet can't span Availability Zones. All instance type specifications that you specify for the
     *        Fleet must use the same Availability Zone.
     */

    public void setAvailabilityZoneId(String availabilityZoneId) {
        this.availabilityZoneId = availabilityZoneId;
    }

    /**
     * <p>
     * The ID of the Availability Zone in which the Capacity Reservation Fleet reserves the capacity. A Capacity
     * Reservation Fleet can't span Availability Zones. All instance type specifications that you specify for the Fleet
     * must use the same Availability Zone.
     * </p>
     * 
     * @return The ID of the Availability Zone in which the Capacity Reservation Fleet reserves the capacity. A Capacity
     *         Reservation Fleet can't span Availability Zones. All instance type specifications that you specify for
     *         the Fleet must use the same Availability Zone.
     */

    public String getAvailabilityZoneId() {
        return this.availabilityZoneId;
    }

    /**
     * <p>
     * The ID of the Availability Zone in which the Capacity Reservation Fleet reserves the capacity. A Capacity
     * Reservation Fleet can't span Availability Zones. All instance type specifications that you specify for the Fleet
     * must use the same Availability Zone.
     * </p>
     * 
     * @param availabilityZoneId
     *        The ID of the Availability Zone in which the Capacity Reservation Fleet reserves the capacity. A Capacity
     *        Reservation Fleet can't span Availability Zones. All instance type specifications that you specify for the
     *        Fleet must use the same Availability Zone.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReservationFleetInstanceSpecification withAvailabilityZoneId(String availabilityZoneId) {
        setAvailabilityZoneId(availabilityZoneId);
        return this;
    }

    /**
     * <p>
     * Indicates whether the Capacity Reservation Fleet supports EBS-optimized instances types. This optimization
     * provides dedicated throughput to Amazon EBS and an optimized configuration stack to provide optimal I/O
     * performance. This optimization isn't available with all instance types. Additional usage charges apply when using
     * EBS-optimized instance types.
     * </p>
     * 
     * @param ebsOptimized
     *        Indicates whether the Capacity Reservation Fleet supports EBS-optimized instances types. This optimization
     *        provides dedicated throughput to Amazon EBS and an optimized configuration stack to provide optimal I/O
     *        performance. This optimization isn't available with all instance types. Additional usage charges apply
     *        when using EBS-optimized instance types.
     */

    public void setEbsOptimized(Boolean ebsOptimized) {
        this.ebsOptimized = ebsOptimized;
    }

    /**
     * <p>
     * Indicates whether the Capacity Reservation Fleet supports EBS-optimized instances types. This optimization
     * provides dedicated throughput to Amazon EBS and an optimized configuration stack to provide optimal I/O
     * performance. This optimization isn't available with all instance types. Additional usage charges apply when using
     * EBS-optimized instance types.
     * </p>
     * 
     * @return Indicates whether the Capacity Reservation Fleet supports EBS-optimized instances types. This
     *         optimization provides dedicated throughput to Amazon EBS and an optimized configuration stack to provide
     *         optimal I/O performance. This optimization isn't available with all instance types. Additional usage
     *         charges apply when using EBS-optimized instance types.
     */

    public Boolean getEbsOptimized() {
        return this.ebsOptimized;
    }

    /**
     * <p>
     * Indicates whether the Capacity Reservation Fleet supports EBS-optimized instances types. This optimization
     * provides dedicated throughput to Amazon EBS and an optimized configuration stack to provide optimal I/O
     * performance. This optimization isn't available with all instance types. Additional usage charges apply when using
     * EBS-optimized instance types.
     * </p>
     * 
     * @param ebsOptimized
     *        Indicates whether the Capacity Reservation Fleet supports EBS-optimized instances types. This optimization
     *        provides dedicated throughput to Amazon EBS and an optimized configuration stack to provide optimal I/O
     *        performance. This optimization isn't available with all instance types. Additional usage charges apply
     *        when using EBS-optimized instance types.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReservationFleetInstanceSpecification withEbsOptimized(Boolean ebsOptimized) {
        setEbsOptimized(ebsOptimized);
        return this;
    }

    /**
     * <p>
     * Indicates whether the Capacity Reservation Fleet supports EBS-optimized instances types. This optimization
     * provides dedicated throughput to Amazon EBS and an optimized configuration stack to provide optimal I/O
     * performance. This optimization isn't available with all instance types. Additional usage charges apply when using
     * EBS-optimized instance types.
     * </p>
     * 
     * @return Indicates whether the Capacity Reservation Fleet supports EBS-optimized instances types. This
     *         optimization provides dedicated throughput to Amazon EBS and an optimized configuration stack to provide
     *         optimal I/O performance. This optimization isn't available with all instance types. Additional usage
     *         charges apply when using EBS-optimized instance types.
     */

    public Boolean isEbsOptimized() {
        return this.ebsOptimized;
    }

    /**
     * <p>
     * The priority to assign to the instance type. This value is used to determine which of the instance types
     * specified for the Fleet should be prioritized for use. A lower value indicates a high priority. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/crfleet-concepts.html#instance-priority">Instance type
     * priority</a> in the Amazon EC2 User Guide.
     * </p>
     * 
     * @param priority
     *        The priority to assign to the instance type. This value is used to determine which of the instance types
     *        specified for the Fleet should be prioritized for use. A lower value indicates a high priority. For more
     *        information, see <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/crfleet-concepts.html#instance-priority"
     *        >Instance type priority</a> in the Amazon EC2 User Guide.
     */

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    /**
     * <p>
     * The priority to assign to the instance type. This value is used to determine which of the instance types
     * specified for the Fleet should be prioritized for use. A lower value indicates a high priority. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/crfleet-concepts.html#instance-priority">Instance type
     * priority</a> in the Amazon EC2 User Guide.
     * </p>
     * 
     * @return The priority to assign to the instance type. This value is used to determine which of the instance types
     *         specified for the Fleet should be prioritized for use. A lower value indicates a high priority. For more
     *         information, see <a
     *         href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/crfleet-concepts.html#instance-priority"
     *         >Instance type priority</a> in the Amazon EC2 User Guide.
     */

    public Integer getPriority() {
        return this.priority;
    }

    /**
     * <p>
     * The priority to assign to the instance type. This value is used to determine which of the instance types
     * specified for the Fleet should be prioritized for use. A lower value indicates a high priority. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/crfleet-concepts.html#instance-priority">Instance type
     * priority</a> in the Amazon EC2 User Guide.
     * </p>
     * 
     * @param priority
     *        The priority to assign to the instance type. This value is used to determine which of the instance types
     *        specified for the Fleet should be prioritized for use. A lower value indicates a high priority. For more
     *        information, see <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/crfleet-concepts.html#instance-priority"
     *        >Instance type priority</a> in the Amazon EC2 User Guide.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReservationFleetInstanceSpecification withPriority(Integer priority) {
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
        if (getInstanceType() != null)
            sb.append("InstanceType: ").append(getInstanceType()).append(",");
        if (getInstancePlatform() != null)
            sb.append("InstancePlatform: ").append(getInstancePlatform()).append(",");
        if (getWeight() != null)
            sb.append("Weight: ").append(getWeight()).append(",");
        if (getAvailabilityZone() != null)
            sb.append("AvailabilityZone: ").append(getAvailabilityZone()).append(",");
        if (getAvailabilityZoneId() != null)
            sb.append("AvailabilityZoneId: ").append(getAvailabilityZoneId()).append(",");
        if (getEbsOptimized() != null)
            sb.append("EbsOptimized: ").append(getEbsOptimized()).append(",");
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

        if (obj instanceof ReservationFleetInstanceSpecification == false)
            return false;
        ReservationFleetInstanceSpecification other = (ReservationFleetInstanceSpecification) obj;
        if (other.getInstanceType() == null ^ this.getInstanceType() == null)
            return false;
        if (other.getInstanceType() != null && other.getInstanceType().equals(this.getInstanceType()) == false)
            return false;
        if (other.getInstancePlatform() == null ^ this.getInstancePlatform() == null)
            return false;
        if (other.getInstancePlatform() != null && other.getInstancePlatform().equals(this.getInstancePlatform()) == false)
            return false;
        if (other.getWeight() == null ^ this.getWeight() == null)
            return false;
        if (other.getWeight() != null && other.getWeight().equals(this.getWeight()) == false)
            return false;
        if (other.getAvailabilityZone() == null ^ this.getAvailabilityZone() == null)
            return false;
        if (other.getAvailabilityZone() != null && other.getAvailabilityZone().equals(this.getAvailabilityZone()) == false)
            return false;
        if (other.getAvailabilityZoneId() == null ^ this.getAvailabilityZoneId() == null)
            return false;
        if (other.getAvailabilityZoneId() != null && other.getAvailabilityZoneId().equals(this.getAvailabilityZoneId()) == false)
            return false;
        if (other.getEbsOptimized() == null ^ this.getEbsOptimized() == null)
            return false;
        if (other.getEbsOptimized() != null && other.getEbsOptimized().equals(this.getEbsOptimized()) == false)
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

        hashCode = prime * hashCode + ((getInstanceType() == null) ? 0 : getInstanceType().hashCode());
        hashCode = prime * hashCode + ((getInstancePlatform() == null) ? 0 : getInstancePlatform().hashCode());
        hashCode = prime * hashCode + ((getWeight() == null) ? 0 : getWeight().hashCode());
        hashCode = prime * hashCode + ((getAvailabilityZone() == null) ? 0 : getAvailabilityZone().hashCode());
        hashCode = prime * hashCode + ((getAvailabilityZoneId() == null) ? 0 : getAvailabilityZoneId().hashCode());
        hashCode = prime * hashCode + ((getEbsOptimized() == null) ? 0 : getEbsOptimized().hashCode());
        hashCode = prime * hashCode + ((getPriority() == null) ? 0 : getPriority().hashCode());
        return hashCode;
    }

    @Override
    public ReservationFleetInstanceSpecification clone() {
        try {
            return (ReservationFleetInstanceSpecification) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
