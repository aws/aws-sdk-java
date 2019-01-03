/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Describes a Scheduled Instance.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/ScheduledInstance" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ScheduledInstance implements Serializable, Cloneable {

    /**
     * <p>
     * The Availability Zone.
     * </p>
     */
    private String availabilityZone;
    /**
     * <p>
     * The date when the Scheduled Instance was purchased.
     * </p>
     */
    private java.util.Date createDate;
    /**
     * <p>
     * The hourly price for a single instance.
     * </p>
     */
    private String hourlyPrice;
    /**
     * <p>
     * The number of instances.
     * </p>
     */
    private Integer instanceCount;
    /**
     * <p>
     * The instance type.
     * </p>
     */
    private String instanceType;
    /**
     * <p>
     * The network platform (<code>EC2-Classic</code> or <code>EC2-VPC</code>).
     * </p>
     */
    private String networkPlatform;
    /**
     * <p>
     * The time for the next schedule to start.
     * </p>
     */
    private java.util.Date nextSlotStartTime;
    /**
     * <p>
     * The platform (<code>Linux/UNIX</code> or <code>Windows</code>).
     * </p>
     */
    private String platform;
    /**
     * <p>
     * The time that the previous schedule ended or will end.
     * </p>
     */
    private java.util.Date previousSlotEndTime;
    /**
     * <p>
     * The schedule recurrence.
     * </p>
     */
    private ScheduledInstanceRecurrence recurrence;
    /**
     * <p>
     * The Scheduled Instance ID.
     * </p>
     */
    private String scheduledInstanceId;
    /**
     * <p>
     * The number of hours in the schedule.
     * </p>
     */
    private Integer slotDurationInHours;
    /**
     * <p>
     * The end date for the Scheduled Instance.
     * </p>
     */
    private java.util.Date termEndDate;
    /**
     * <p>
     * The start date for the Scheduled Instance.
     * </p>
     */
    private java.util.Date termStartDate;
    /**
     * <p>
     * The total number of hours for a single instance for the entire term.
     * </p>
     */
    private Integer totalScheduledInstanceHours;

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

    public ScheduledInstance withAvailabilityZone(String availabilityZone) {
        setAvailabilityZone(availabilityZone);
        return this;
    }

    /**
     * <p>
     * The date when the Scheduled Instance was purchased.
     * </p>
     * 
     * @param createDate
     *        The date when the Scheduled Instance was purchased.
     */

    public void setCreateDate(java.util.Date createDate) {
        this.createDate = createDate;
    }

    /**
     * <p>
     * The date when the Scheduled Instance was purchased.
     * </p>
     * 
     * @return The date when the Scheduled Instance was purchased.
     */

    public java.util.Date getCreateDate() {
        return this.createDate;
    }

    /**
     * <p>
     * The date when the Scheduled Instance was purchased.
     * </p>
     * 
     * @param createDate
     *        The date when the Scheduled Instance was purchased.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScheduledInstance withCreateDate(java.util.Date createDate) {
        setCreateDate(createDate);
        return this;
    }

    /**
     * <p>
     * The hourly price for a single instance.
     * </p>
     * 
     * @param hourlyPrice
     *        The hourly price for a single instance.
     */

    public void setHourlyPrice(String hourlyPrice) {
        this.hourlyPrice = hourlyPrice;
    }

    /**
     * <p>
     * The hourly price for a single instance.
     * </p>
     * 
     * @return The hourly price for a single instance.
     */

    public String getHourlyPrice() {
        return this.hourlyPrice;
    }

    /**
     * <p>
     * The hourly price for a single instance.
     * </p>
     * 
     * @param hourlyPrice
     *        The hourly price for a single instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScheduledInstance withHourlyPrice(String hourlyPrice) {
        setHourlyPrice(hourlyPrice);
        return this;
    }

    /**
     * <p>
     * The number of instances.
     * </p>
     * 
     * @param instanceCount
     *        The number of instances.
     */

    public void setInstanceCount(Integer instanceCount) {
        this.instanceCount = instanceCount;
    }

    /**
     * <p>
     * The number of instances.
     * </p>
     * 
     * @return The number of instances.
     */

    public Integer getInstanceCount() {
        return this.instanceCount;
    }

    /**
     * <p>
     * The number of instances.
     * </p>
     * 
     * @param instanceCount
     *        The number of instances.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScheduledInstance withInstanceCount(Integer instanceCount) {
        setInstanceCount(instanceCount);
        return this;
    }

    /**
     * <p>
     * The instance type.
     * </p>
     * 
     * @param instanceType
     *        The instance type.
     */

    public void setInstanceType(String instanceType) {
        this.instanceType = instanceType;
    }

    /**
     * <p>
     * The instance type.
     * </p>
     * 
     * @return The instance type.
     */

    public String getInstanceType() {
        return this.instanceType;
    }

    /**
     * <p>
     * The instance type.
     * </p>
     * 
     * @param instanceType
     *        The instance type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScheduledInstance withInstanceType(String instanceType) {
        setInstanceType(instanceType);
        return this;
    }

    /**
     * <p>
     * The network platform (<code>EC2-Classic</code> or <code>EC2-VPC</code>).
     * </p>
     * 
     * @param networkPlatform
     *        The network platform (<code>EC2-Classic</code> or <code>EC2-VPC</code>).
     */

    public void setNetworkPlatform(String networkPlatform) {
        this.networkPlatform = networkPlatform;
    }

    /**
     * <p>
     * The network platform (<code>EC2-Classic</code> or <code>EC2-VPC</code>).
     * </p>
     * 
     * @return The network platform (<code>EC2-Classic</code> or <code>EC2-VPC</code>).
     */

    public String getNetworkPlatform() {
        return this.networkPlatform;
    }

    /**
     * <p>
     * The network platform (<code>EC2-Classic</code> or <code>EC2-VPC</code>).
     * </p>
     * 
     * @param networkPlatform
     *        The network platform (<code>EC2-Classic</code> or <code>EC2-VPC</code>).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScheduledInstance withNetworkPlatform(String networkPlatform) {
        setNetworkPlatform(networkPlatform);
        return this;
    }

    /**
     * <p>
     * The time for the next schedule to start.
     * </p>
     * 
     * @param nextSlotStartTime
     *        The time for the next schedule to start.
     */

    public void setNextSlotStartTime(java.util.Date nextSlotStartTime) {
        this.nextSlotStartTime = nextSlotStartTime;
    }

    /**
     * <p>
     * The time for the next schedule to start.
     * </p>
     * 
     * @return The time for the next schedule to start.
     */

    public java.util.Date getNextSlotStartTime() {
        return this.nextSlotStartTime;
    }

    /**
     * <p>
     * The time for the next schedule to start.
     * </p>
     * 
     * @param nextSlotStartTime
     *        The time for the next schedule to start.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScheduledInstance withNextSlotStartTime(java.util.Date nextSlotStartTime) {
        setNextSlotStartTime(nextSlotStartTime);
        return this;
    }

    /**
     * <p>
     * The platform (<code>Linux/UNIX</code> or <code>Windows</code>).
     * </p>
     * 
     * @param platform
     *        The platform (<code>Linux/UNIX</code> or <code>Windows</code>).
     */

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    /**
     * <p>
     * The platform (<code>Linux/UNIX</code> or <code>Windows</code>).
     * </p>
     * 
     * @return The platform (<code>Linux/UNIX</code> or <code>Windows</code>).
     */

    public String getPlatform() {
        return this.platform;
    }

    /**
     * <p>
     * The platform (<code>Linux/UNIX</code> or <code>Windows</code>).
     * </p>
     * 
     * @param platform
     *        The platform (<code>Linux/UNIX</code> or <code>Windows</code>).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScheduledInstance withPlatform(String platform) {
        setPlatform(platform);
        return this;
    }

    /**
     * <p>
     * The time that the previous schedule ended or will end.
     * </p>
     * 
     * @param previousSlotEndTime
     *        The time that the previous schedule ended or will end.
     */

    public void setPreviousSlotEndTime(java.util.Date previousSlotEndTime) {
        this.previousSlotEndTime = previousSlotEndTime;
    }

    /**
     * <p>
     * The time that the previous schedule ended or will end.
     * </p>
     * 
     * @return The time that the previous schedule ended or will end.
     */

    public java.util.Date getPreviousSlotEndTime() {
        return this.previousSlotEndTime;
    }

    /**
     * <p>
     * The time that the previous schedule ended or will end.
     * </p>
     * 
     * @param previousSlotEndTime
     *        The time that the previous schedule ended or will end.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScheduledInstance withPreviousSlotEndTime(java.util.Date previousSlotEndTime) {
        setPreviousSlotEndTime(previousSlotEndTime);
        return this;
    }

    /**
     * <p>
     * The schedule recurrence.
     * </p>
     * 
     * @param recurrence
     *        The schedule recurrence.
     */

    public void setRecurrence(ScheduledInstanceRecurrence recurrence) {
        this.recurrence = recurrence;
    }

    /**
     * <p>
     * The schedule recurrence.
     * </p>
     * 
     * @return The schedule recurrence.
     */

    public ScheduledInstanceRecurrence getRecurrence() {
        return this.recurrence;
    }

    /**
     * <p>
     * The schedule recurrence.
     * </p>
     * 
     * @param recurrence
     *        The schedule recurrence.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScheduledInstance withRecurrence(ScheduledInstanceRecurrence recurrence) {
        setRecurrence(recurrence);
        return this;
    }

    /**
     * <p>
     * The Scheduled Instance ID.
     * </p>
     * 
     * @param scheduledInstanceId
     *        The Scheduled Instance ID.
     */

    public void setScheduledInstanceId(String scheduledInstanceId) {
        this.scheduledInstanceId = scheduledInstanceId;
    }

    /**
     * <p>
     * The Scheduled Instance ID.
     * </p>
     * 
     * @return The Scheduled Instance ID.
     */

    public String getScheduledInstanceId() {
        return this.scheduledInstanceId;
    }

    /**
     * <p>
     * The Scheduled Instance ID.
     * </p>
     * 
     * @param scheduledInstanceId
     *        The Scheduled Instance ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScheduledInstance withScheduledInstanceId(String scheduledInstanceId) {
        setScheduledInstanceId(scheduledInstanceId);
        return this;
    }

    /**
     * <p>
     * The number of hours in the schedule.
     * </p>
     * 
     * @param slotDurationInHours
     *        The number of hours in the schedule.
     */

    public void setSlotDurationInHours(Integer slotDurationInHours) {
        this.slotDurationInHours = slotDurationInHours;
    }

    /**
     * <p>
     * The number of hours in the schedule.
     * </p>
     * 
     * @return The number of hours in the schedule.
     */

    public Integer getSlotDurationInHours() {
        return this.slotDurationInHours;
    }

    /**
     * <p>
     * The number of hours in the schedule.
     * </p>
     * 
     * @param slotDurationInHours
     *        The number of hours in the schedule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScheduledInstance withSlotDurationInHours(Integer slotDurationInHours) {
        setSlotDurationInHours(slotDurationInHours);
        return this;
    }

    /**
     * <p>
     * The end date for the Scheduled Instance.
     * </p>
     * 
     * @param termEndDate
     *        The end date for the Scheduled Instance.
     */

    public void setTermEndDate(java.util.Date termEndDate) {
        this.termEndDate = termEndDate;
    }

    /**
     * <p>
     * The end date for the Scheduled Instance.
     * </p>
     * 
     * @return The end date for the Scheduled Instance.
     */

    public java.util.Date getTermEndDate() {
        return this.termEndDate;
    }

    /**
     * <p>
     * The end date for the Scheduled Instance.
     * </p>
     * 
     * @param termEndDate
     *        The end date for the Scheduled Instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScheduledInstance withTermEndDate(java.util.Date termEndDate) {
        setTermEndDate(termEndDate);
        return this;
    }

    /**
     * <p>
     * The start date for the Scheduled Instance.
     * </p>
     * 
     * @param termStartDate
     *        The start date for the Scheduled Instance.
     */

    public void setTermStartDate(java.util.Date termStartDate) {
        this.termStartDate = termStartDate;
    }

    /**
     * <p>
     * The start date for the Scheduled Instance.
     * </p>
     * 
     * @return The start date for the Scheduled Instance.
     */

    public java.util.Date getTermStartDate() {
        return this.termStartDate;
    }

    /**
     * <p>
     * The start date for the Scheduled Instance.
     * </p>
     * 
     * @param termStartDate
     *        The start date for the Scheduled Instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScheduledInstance withTermStartDate(java.util.Date termStartDate) {
        setTermStartDate(termStartDate);
        return this;
    }

    /**
     * <p>
     * The total number of hours for a single instance for the entire term.
     * </p>
     * 
     * @param totalScheduledInstanceHours
     *        The total number of hours for a single instance for the entire term.
     */

    public void setTotalScheduledInstanceHours(Integer totalScheduledInstanceHours) {
        this.totalScheduledInstanceHours = totalScheduledInstanceHours;
    }

    /**
     * <p>
     * The total number of hours for a single instance for the entire term.
     * </p>
     * 
     * @return The total number of hours for a single instance for the entire term.
     */

    public Integer getTotalScheduledInstanceHours() {
        return this.totalScheduledInstanceHours;
    }

    /**
     * <p>
     * The total number of hours for a single instance for the entire term.
     * </p>
     * 
     * @param totalScheduledInstanceHours
     *        The total number of hours for a single instance for the entire term.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScheduledInstance withTotalScheduledInstanceHours(Integer totalScheduledInstanceHours) {
        setTotalScheduledInstanceHours(totalScheduledInstanceHours);
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
        if (getAvailabilityZone() != null)
            sb.append("AvailabilityZone: ").append(getAvailabilityZone()).append(",");
        if (getCreateDate() != null)
            sb.append("CreateDate: ").append(getCreateDate()).append(",");
        if (getHourlyPrice() != null)
            sb.append("HourlyPrice: ").append(getHourlyPrice()).append(",");
        if (getInstanceCount() != null)
            sb.append("InstanceCount: ").append(getInstanceCount()).append(",");
        if (getInstanceType() != null)
            sb.append("InstanceType: ").append(getInstanceType()).append(",");
        if (getNetworkPlatform() != null)
            sb.append("NetworkPlatform: ").append(getNetworkPlatform()).append(",");
        if (getNextSlotStartTime() != null)
            sb.append("NextSlotStartTime: ").append(getNextSlotStartTime()).append(",");
        if (getPlatform() != null)
            sb.append("Platform: ").append(getPlatform()).append(",");
        if (getPreviousSlotEndTime() != null)
            sb.append("PreviousSlotEndTime: ").append(getPreviousSlotEndTime()).append(",");
        if (getRecurrence() != null)
            sb.append("Recurrence: ").append(getRecurrence()).append(",");
        if (getScheduledInstanceId() != null)
            sb.append("ScheduledInstanceId: ").append(getScheduledInstanceId()).append(",");
        if (getSlotDurationInHours() != null)
            sb.append("SlotDurationInHours: ").append(getSlotDurationInHours()).append(",");
        if (getTermEndDate() != null)
            sb.append("TermEndDate: ").append(getTermEndDate()).append(",");
        if (getTermStartDate() != null)
            sb.append("TermStartDate: ").append(getTermStartDate()).append(",");
        if (getTotalScheduledInstanceHours() != null)
            sb.append("TotalScheduledInstanceHours: ").append(getTotalScheduledInstanceHours());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ScheduledInstance == false)
            return false;
        ScheduledInstance other = (ScheduledInstance) obj;
        if (other.getAvailabilityZone() == null ^ this.getAvailabilityZone() == null)
            return false;
        if (other.getAvailabilityZone() != null && other.getAvailabilityZone().equals(this.getAvailabilityZone()) == false)
            return false;
        if (other.getCreateDate() == null ^ this.getCreateDate() == null)
            return false;
        if (other.getCreateDate() != null && other.getCreateDate().equals(this.getCreateDate()) == false)
            return false;
        if (other.getHourlyPrice() == null ^ this.getHourlyPrice() == null)
            return false;
        if (other.getHourlyPrice() != null && other.getHourlyPrice().equals(this.getHourlyPrice()) == false)
            return false;
        if (other.getInstanceCount() == null ^ this.getInstanceCount() == null)
            return false;
        if (other.getInstanceCount() != null && other.getInstanceCount().equals(this.getInstanceCount()) == false)
            return false;
        if (other.getInstanceType() == null ^ this.getInstanceType() == null)
            return false;
        if (other.getInstanceType() != null && other.getInstanceType().equals(this.getInstanceType()) == false)
            return false;
        if (other.getNetworkPlatform() == null ^ this.getNetworkPlatform() == null)
            return false;
        if (other.getNetworkPlatform() != null && other.getNetworkPlatform().equals(this.getNetworkPlatform()) == false)
            return false;
        if (other.getNextSlotStartTime() == null ^ this.getNextSlotStartTime() == null)
            return false;
        if (other.getNextSlotStartTime() != null && other.getNextSlotStartTime().equals(this.getNextSlotStartTime()) == false)
            return false;
        if (other.getPlatform() == null ^ this.getPlatform() == null)
            return false;
        if (other.getPlatform() != null && other.getPlatform().equals(this.getPlatform()) == false)
            return false;
        if (other.getPreviousSlotEndTime() == null ^ this.getPreviousSlotEndTime() == null)
            return false;
        if (other.getPreviousSlotEndTime() != null && other.getPreviousSlotEndTime().equals(this.getPreviousSlotEndTime()) == false)
            return false;
        if (other.getRecurrence() == null ^ this.getRecurrence() == null)
            return false;
        if (other.getRecurrence() != null && other.getRecurrence().equals(this.getRecurrence()) == false)
            return false;
        if (other.getScheduledInstanceId() == null ^ this.getScheduledInstanceId() == null)
            return false;
        if (other.getScheduledInstanceId() != null && other.getScheduledInstanceId().equals(this.getScheduledInstanceId()) == false)
            return false;
        if (other.getSlotDurationInHours() == null ^ this.getSlotDurationInHours() == null)
            return false;
        if (other.getSlotDurationInHours() != null && other.getSlotDurationInHours().equals(this.getSlotDurationInHours()) == false)
            return false;
        if (other.getTermEndDate() == null ^ this.getTermEndDate() == null)
            return false;
        if (other.getTermEndDate() != null && other.getTermEndDate().equals(this.getTermEndDate()) == false)
            return false;
        if (other.getTermStartDate() == null ^ this.getTermStartDate() == null)
            return false;
        if (other.getTermStartDate() != null && other.getTermStartDate().equals(this.getTermStartDate()) == false)
            return false;
        if (other.getTotalScheduledInstanceHours() == null ^ this.getTotalScheduledInstanceHours() == null)
            return false;
        if (other.getTotalScheduledInstanceHours() != null && other.getTotalScheduledInstanceHours().equals(this.getTotalScheduledInstanceHours()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAvailabilityZone() == null) ? 0 : getAvailabilityZone().hashCode());
        hashCode = prime * hashCode + ((getCreateDate() == null) ? 0 : getCreateDate().hashCode());
        hashCode = prime * hashCode + ((getHourlyPrice() == null) ? 0 : getHourlyPrice().hashCode());
        hashCode = prime * hashCode + ((getInstanceCount() == null) ? 0 : getInstanceCount().hashCode());
        hashCode = prime * hashCode + ((getInstanceType() == null) ? 0 : getInstanceType().hashCode());
        hashCode = prime * hashCode + ((getNetworkPlatform() == null) ? 0 : getNetworkPlatform().hashCode());
        hashCode = prime * hashCode + ((getNextSlotStartTime() == null) ? 0 : getNextSlotStartTime().hashCode());
        hashCode = prime * hashCode + ((getPlatform() == null) ? 0 : getPlatform().hashCode());
        hashCode = prime * hashCode + ((getPreviousSlotEndTime() == null) ? 0 : getPreviousSlotEndTime().hashCode());
        hashCode = prime * hashCode + ((getRecurrence() == null) ? 0 : getRecurrence().hashCode());
        hashCode = prime * hashCode + ((getScheduledInstanceId() == null) ? 0 : getScheduledInstanceId().hashCode());
        hashCode = prime * hashCode + ((getSlotDurationInHours() == null) ? 0 : getSlotDurationInHours().hashCode());
        hashCode = prime * hashCode + ((getTermEndDate() == null) ? 0 : getTermEndDate().hashCode());
        hashCode = prime * hashCode + ((getTermStartDate() == null) ? 0 : getTermStartDate().hashCode());
        hashCode = prime * hashCode + ((getTotalScheduledInstanceHours() == null) ? 0 : getTotalScheduledInstanceHours().hashCode());
        return hashCode;
    }

    @Override
    public ScheduledInstance clone() {
        try {
            return (ScheduledInstance) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
