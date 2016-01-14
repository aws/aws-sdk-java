/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.ec2.model;

import java.io.Serializable;

/**
 * <p>
 * Describes a Scheduled Instance.
 * </p>
 */
public class ScheduledInstance implements Serializable, Cloneable {

    /**
     * The Scheduled Instance ID.
     */
    private String scheduledInstanceId;

    /**
     * The instance type.
     */
    private String instanceType;

    /**
     * The platform (<code>Linux/UNIX</code> or <code>Windows</code>).
     */
    private String platform;

    /**
     * The network platform (<code>EC2-Classic</code> or
     * <code>EC2-VPC</code>).
     */
    private String networkPlatform;

    /**
     * The Availability Zone.
     */
    private String availabilityZone;

    /**
     * The number of hours in the schedule.
     */
    private Integer slotDurationInHours;

    /**
     * The schedule recurrence.
     */
    private ScheduledInstanceRecurrence recurrence;

    /**
     * The time that the previous schedule ended or will end.
     */
    private java.util.Date previousSlotEndTime;

    /**
     * The time for the next schedule to start.
     */
    private java.util.Date nextSlotStartTime;

    /**
     * The hourly price for a single instance.
     */
    private String hourlyPrice;

    /**
     * The total number of hours for a single instance for the entire term.
     */
    private Integer totalScheduledInstanceHours;

    /**
     * The number of instances.
     */
    private Integer instanceCount;

    /**
     * The start date for the Scheduled Instance.
     */
    private java.util.Date termStartDate;

    /**
     * The end date for the Scheduled Instance.
     */
    private java.util.Date termEndDate;

    /**
     * The date when the Scheduled Instance was purchased.
     */
    private java.util.Date createDate;

    /**
     * The Scheduled Instance ID.
     *
     * @return The Scheduled Instance ID.
     */
    public String getScheduledInstanceId() {
        return scheduledInstanceId;
    }
    
    /**
     * The Scheduled Instance ID.
     *
     * @param scheduledInstanceId The Scheduled Instance ID.
     */
    public void setScheduledInstanceId(String scheduledInstanceId) {
        this.scheduledInstanceId = scheduledInstanceId;
    }
    
    /**
     * The Scheduled Instance ID.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param scheduledInstanceId The Scheduled Instance ID.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ScheduledInstance withScheduledInstanceId(String scheduledInstanceId) {
        this.scheduledInstanceId = scheduledInstanceId;
        return this;
    }

    /**
     * The instance type.
     *
     * @return The instance type.
     */
    public String getInstanceType() {
        return instanceType;
    }
    
    /**
     * The instance type.
     *
     * @param instanceType The instance type.
     */
    public void setInstanceType(String instanceType) {
        this.instanceType = instanceType;
    }
    
    /**
     * The instance type.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param instanceType The instance type.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ScheduledInstance withInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }

    /**
     * The platform (<code>Linux/UNIX</code> or <code>Windows</code>).
     *
     * @return The platform (<code>Linux/UNIX</code> or <code>Windows</code>).
     */
    public String getPlatform() {
        return platform;
    }
    
    /**
     * The platform (<code>Linux/UNIX</code> or <code>Windows</code>).
     *
     * @param platform The platform (<code>Linux/UNIX</code> or <code>Windows</code>).
     */
    public void setPlatform(String platform) {
        this.platform = platform;
    }
    
    /**
     * The platform (<code>Linux/UNIX</code> or <code>Windows</code>).
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param platform The platform (<code>Linux/UNIX</code> or <code>Windows</code>).
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ScheduledInstance withPlatform(String platform) {
        this.platform = platform;
        return this;
    }

    /**
     * The network platform (<code>EC2-Classic</code> or
     * <code>EC2-VPC</code>).
     *
     * @return The network platform (<code>EC2-Classic</code> or
     *         <code>EC2-VPC</code>).
     */
    public String getNetworkPlatform() {
        return networkPlatform;
    }
    
    /**
     * The network platform (<code>EC2-Classic</code> or
     * <code>EC2-VPC</code>).
     *
     * @param networkPlatform The network platform (<code>EC2-Classic</code> or
     *         <code>EC2-VPC</code>).
     */
    public void setNetworkPlatform(String networkPlatform) {
        this.networkPlatform = networkPlatform;
    }
    
    /**
     * The network platform (<code>EC2-Classic</code> or
     * <code>EC2-VPC</code>).
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param networkPlatform The network platform (<code>EC2-Classic</code> or
     *         <code>EC2-VPC</code>).
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ScheduledInstance withNetworkPlatform(String networkPlatform) {
        this.networkPlatform = networkPlatform;
        return this;
    }

    /**
     * The Availability Zone.
     *
     * @return The Availability Zone.
     */
    public String getAvailabilityZone() {
        return availabilityZone;
    }
    
    /**
     * The Availability Zone.
     *
     * @param availabilityZone The Availability Zone.
     */
    public void setAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
    }
    
    /**
     * The Availability Zone.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param availabilityZone The Availability Zone.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ScheduledInstance withAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
        return this;
    }

    /**
     * The number of hours in the schedule.
     *
     * @return The number of hours in the schedule.
     */
    public Integer getSlotDurationInHours() {
        return slotDurationInHours;
    }
    
    /**
     * The number of hours in the schedule.
     *
     * @param slotDurationInHours The number of hours in the schedule.
     */
    public void setSlotDurationInHours(Integer slotDurationInHours) {
        this.slotDurationInHours = slotDurationInHours;
    }
    
    /**
     * The number of hours in the schedule.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param slotDurationInHours The number of hours in the schedule.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ScheduledInstance withSlotDurationInHours(Integer slotDurationInHours) {
        this.slotDurationInHours = slotDurationInHours;
        return this;
    }

    /**
     * The schedule recurrence.
     *
     * @return The schedule recurrence.
     */
    public ScheduledInstanceRecurrence getRecurrence() {
        return recurrence;
    }
    
    /**
     * The schedule recurrence.
     *
     * @param recurrence The schedule recurrence.
     */
    public void setRecurrence(ScheduledInstanceRecurrence recurrence) {
        this.recurrence = recurrence;
    }
    
    /**
     * The schedule recurrence.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param recurrence The schedule recurrence.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ScheduledInstance withRecurrence(ScheduledInstanceRecurrence recurrence) {
        this.recurrence = recurrence;
        return this;
    }

    /**
     * The time that the previous schedule ended or will end.
     *
     * @return The time that the previous schedule ended or will end.
     */
    public java.util.Date getPreviousSlotEndTime() {
        return previousSlotEndTime;
    }
    
    /**
     * The time that the previous schedule ended or will end.
     *
     * @param previousSlotEndTime The time that the previous schedule ended or will end.
     */
    public void setPreviousSlotEndTime(java.util.Date previousSlotEndTime) {
        this.previousSlotEndTime = previousSlotEndTime;
    }
    
    /**
     * The time that the previous schedule ended or will end.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param previousSlotEndTime The time that the previous schedule ended or will end.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ScheduledInstance withPreviousSlotEndTime(java.util.Date previousSlotEndTime) {
        this.previousSlotEndTime = previousSlotEndTime;
        return this;
    }

    /**
     * The time for the next schedule to start.
     *
     * @return The time for the next schedule to start.
     */
    public java.util.Date getNextSlotStartTime() {
        return nextSlotStartTime;
    }
    
    /**
     * The time for the next schedule to start.
     *
     * @param nextSlotStartTime The time for the next schedule to start.
     */
    public void setNextSlotStartTime(java.util.Date nextSlotStartTime) {
        this.nextSlotStartTime = nextSlotStartTime;
    }
    
    /**
     * The time for the next schedule to start.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param nextSlotStartTime The time for the next schedule to start.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ScheduledInstance withNextSlotStartTime(java.util.Date nextSlotStartTime) {
        this.nextSlotStartTime = nextSlotStartTime;
        return this;
    }

    /**
     * The hourly price for a single instance.
     *
     * @return The hourly price for a single instance.
     */
    public String getHourlyPrice() {
        return hourlyPrice;
    }
    
    /**
     * The hourly price for a single instance.
     *
     * @param hourlyPrice The hourly price for a single instance.
     */
    public void setHourlyPrice(String hourlyPrice) {
        this.hourlyPrice = hourlyPrice;
    }
    
    /**
     * The hourly price for a single instance.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param hourlyPrice The hourly price for a single instance.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ScheduledInstance withHourlyPrice(String hourlyPrice) {
        this.hourlyPrice = hourlyPrice;
        return this;
    }

    /**
     * The total number of hours for a single instance for the entire term.
     *
     * @return The total number of hours for a single instance for the entire term.
     */
    public Integer getTotalScheduledInstanceHours() {
        return totalScheduledInstanceHours;
    }
    
    /**
     * The total number of hours for a single instance for the entire term.
     *
     * @param totalScheduledInstanceHours The total number of hours for a single instance for the entire term.
     */
    public void setTotalScheduledInstanceHours(Integer totalScheduledInstanceHours) {
        this.totalScheduledInstanceHours = totalScheduledInstanceHours;
    }
    
    /**
     * The total number of hours for a single instance for the entire term.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param totalScheduledInstanceHours The total number of hours for a single instance for the entire term.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ScheduledInstance withTotalScheduledInstanceHours(Integer totalScheduledInstanceHours) {
        this.totalScheduledInstanceHours = totalScheduledInstanceHours;
        return this;
    }

    /**
     * The number of instances.
     *
     * @return The number of instances.
     */
    public Integer getInstanceCount() {
        return instanceCount;
    }
    
    /**
     * The number of instances.
     *
     * @param instanceCount The number of instances.
     */
    public void setInstanceCount(Integer instanceCount) {
        this.instanceCount = instanceCount;
    }
    
    /**
     * The number of instances.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param instanceCount The number of instances.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ScheduledInstance withInstanceCount(Integer instanceCount) {
        this.instanceCount = instanceCount;
        return this;
    }

    /**
     * The start date for the Scheduled Instance.
     *
     * @return The start date for the Scheduled Instance.
     */
    public java.util.Date getTermStartDate() {
        return termStartDate;
    }
    
    /**
     * The start date for the Scheduled Instance.
     *
     * @param termStartDate The start date for the Scheduled Instance.
     */
    public void setTermStartDate(java.util.Date termStartDate) {
        this.termStartDate = termStartDate;
    }
    
    /**
     * The start date for the Scheduled Instance.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param termStartDate The start date for the Scheduled Instance.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ScheduledInstance withTermStartDate(java.util.Date termStartDate) {
        this.termStartDate = termStartDate;
        return this;
    }

    /**
     * The end date for the Scheduled Instance.
     *
     * @return The end date for the Scheduled Instance.
     */
    public java.util.Date getTermEndDate() {
        return termEndDate;
    }
    
    /**
     * The end date for the Scheduled Instance.
     *
     * @param termEndDate The end date for the Scheduled Instance.
     */
    public void setTermEndDate(java.util.Date termEndDate) {
        this.termEndDate = termEndDate;
    }
    
    /**
     * The end date for the Scheduled Instance.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param termEndDate The end date for the Scheduled Instance.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ScheduledInstance withTermEndDate(java.util.Date termEndDate) {
        this.termEndDate = termEndDate;
        return this;
    }

    /**
     * The date when the Scheduled Instance was purchased.
     *
     * @return The date when the Scheduled Instance was purchased.
     */
    public java.util.Date getCreateDate() {
        return createDate;
    }
    
    /**
     * The date when the Scheduled Instance was purchased.
     *
     * @param createDate The date when the Scheduled Instance was purchased.
     */
    public void setCreateDate(java.util.Date createDate) {
        this.createDate = createDate;
    }
    
    /**
     * The date when the Scheduled Instance was purchased.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param createDate The date when the Scheduled Instance was purchased.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ScheduledInstance withCreateDate(java.util.Date createDate) {
        this.createDate = createDate;
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getScheduledInstanceId() != null) sb.append("ScheduledInstanceId: " + getScheduledInstanceId() + ",");
        if (getInstanceType() != null) sb.append("InstanceType: " + getInstanceType() + ",");
        if (getPlatform() != null) sb.append("Platform: " + getPlatform() + ",");
        if (getNetworkPlatform() != null) sb.append("NetworkPlatform: " + getNetworkPlatform() + ",");
        if (getAvailabilityZone() != null) sb.append("AvailabilityZone: " + getAvailabilityZone() + ",");
        if (getSlotDurationInHours() != null) sb.append("SlotDurationInHours: " + getSlotDurationInHours() + ",");
        if (getRecurrence() != null) sb.append("Recurrence: " + getRecurrence() + ",");
        if (getPreviousSlotEndTime() != null) sb.append("PreviousSlotEndTime: " + getPreviousSlotEndTime() + ",");
        if (getNextSlotStartTime() != null) sb.append("NextSlotStartTime: " + getNextSlotStartTime() + ",");
        if (getHourlyPrice() != null) sb.append("HourlyPrice: " + getHourlyPrice() + ",");
        if (getTotalScheduledInstanceHours() != null) sb.append("TotalScheduledInstanceHours: " + getTotalScheduledInstanceHours() + ",");
        if (getInstanceCount() != null) sb.append("InstanceCount: " + getInstanceCount() + ",");
        if (getTermStartDate() != null) sb.append("TermStartDate: " + getTermStartDate() + ",");
        if (getTermEndDate() != null) sb.append("TermEndDate: " + getTermEndDate() + ",");
        if (getCreateDate() != null) sb.append("CreateDate: " + getCreateDate() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getScheduledInstanceId() == null) ? 0 : getScheduledInstanceId().hashCode()); 
        hashCode = prime * hashCode + ((getInstanceType() == null) ? 0 : getInstanceType().hashCode()); 
        hashCode = prime * hashCode + ((getPlatform() == null) ? 0 : getPlatform().hashCode()); 
        hashCode = prime * hashCode + ((getNetworkPlatform() == null) ? 0 : getNetworkPlatform().hashCode()); 
        hashCode = prime * hashCode + ((getAvailabilityZone() == null) ? 0 : getAvailabilityZone().hashCode()); 
        hashCode = prime * hashCode + ((getSlotDurationInHours() == null) ? 0 : getSlotDurationInHours().hashCode()); 
        hashCode = prime * hashCode + ((getRecurrence() == null) ? 0 : getRecurrence().hashCode()); 
        hashCode = prime * hashCode + ((getPreviousSlotEndTime() == null) ? 0 : getPreviousSlotEndTime().hashCode()); 
        hashCode = prime * hashCode + ((getNextSlotStartTime() == null) ? 0 : getNextSlotStartTime().hashCode()); 
        hashCode = prime * hashCode + ((getHourlyPrice() == null) ? 0 : getHourlyPrice().hashCode()); 
        hashCode = prime * hashCode + ((getTotalScheduledInstanceHours() == null) ? 0 : getTotalScheduledInstanceHours().hashCode()); 
        hashCode = prime * hashCode + ((getInstanceCount() == null) ? 0 : getInstanceCount().hashCode()); 
        hashCode = prime * hashCode + ((getTermStartDate() == null) ? 0 : getTermStartDate().hashCode()); 
        hashCode = prime * hashCode + ((getTermEndDate() == null) ? 0 : getTermEndDate().hashCode()); 
        hashCode = prime * hashCode + ((getCreateDate() == null) ? 0 : getCreateDate().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof ScheduledInstance == false) return false;
        ScheduledInstance other = (ScheduledInstance)obj;
        
        if (other.getScheduledInstanceId() == null ^ this.getScheduledInstanceId() == null) return false;
        if (other.getScheduledInstanceId() != null && other.getScheduledInstanceId().equals(this.getScheduledInstanceId()) == false) return false; 
        if (other.getInstanceType() == null ^ this.getInstanceType() == null) return false;
        if (other.getInstanceType() != null && other.getInstanceType().equals(this.getInstanceType()) == false) return false; 
        if (other.getPlatform() == null ^ this.getPlatform() == null) return false;
        if (other.getPlatform() != null && other.getPlatform().equals(this.getPlatform()) == false) return false; 
        if (other.getNetworkPlatform() == null ^ this.getNetworkPlatform() == null) return false;
        if (other.getNetworkPlatform() != null && other.getNetworkPlatform().equals(this.getNetworkPlatform()) == false) return false; 
        if (other.getAvailabilityZone() == null ^ this.getAvailabilityZone() == null) return false;
        if (other.getAvailabilityZone() != null && other.getAvailabilityZone().equals(this.getAvailabilityZone()) == false) return false; 
        if (other.getSlotDurationInHours() == null ^ this.getSlotDurationInHours() == null) return false;
        if (other.getSlotDurationInHours() != null && other.getSlotDurationInHours().equals(this.getSlotDurationInHours()) == false) return false; 
        if (other.getRecurrence() == null ^ this.getRecurrence() == null) return false;
        if (other.getRecurrence() != null && other.getRecurrence().equals(this.getRecurrence()) == false) return false; 
        if (other.getPreviousSlotEndTime() == null ^ this.getPreviousSlotEndTime() == null) return false;
        if (other.getPreviousSlotEndTime() != null && other.getPreviousSlotEndTime().equals(this.getPreviousSlotEndTime()) == false) return false; 
        if (other.getNextSlotStartTime() == null ^ this.getNextSlotStartTime() == null) return false;
        if (other.getNextSlotStartTime() != null && other.getNextSlotStartTime().equals(this.getNextSlotStartTime()) == false) return false; 
        if (other.getHourlyPrice() == null ^ this.getHourlyPrice() == null) return false;
        if (other.getHourlyPrice() != null && other.getHourlyPrice().equals(this.getHourlyPrice()) == false) return false; 
        if (other.getTotalScheduledInstanceHours() == null ^ this.getTotalScheduledInstanceHours() == null) return false;
        if (other.getTotalScheduledInstanceHours() != null && other.getTotalScheduledInstanceHours().equals(this.getTotalScheduledInstanceHours()) == false) return false; 
        if (other.getInstanceCount() == null ^ this.getInstanceCount() == null) return false;
        if (other.getInstanceCount() != null && other.getInstanceCount().equals(this.getInstanceCount()) == false) return false; 
        if (other.getTermStartDate() == null ^ this.getTermStartDate() == null) return false;
        if (other.getTermStartDate() != null && other.getTermStartDate().equals(this.getTermStartDate()) == false) return false; 
        if (other.getTermEndDate() == null ^ this.getTermEndDate() == null) return false;
        if (other.getTermEndDate() != null && other.getTermEndDate().equals(this.getTermEndDate()) == false) return false; 
        if (other.getCreateDate() == null ^ this.getCreateDate() == null) return false;
        if (other.getCreateDate() != null && other.getCreateDate().equals(this.getCreateDate()) == false) return false; 
        return true;
    }
    
    @Override
    public ScheduledInstance clone() {
        try {
            return (ScheduledInstance) super.clone();
        
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                    + "even though we're Cloneable!",
                    e);
        }
        
    }

}
    