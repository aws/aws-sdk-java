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
 * Describes a schedule that is available for your Scheduled Instances.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/ScheduledInstanceAvailability" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ScheduledInstanceAvailability implements Serializable, Cloneable {

    /**
     * <p>
     * The Availability Zone.
     * </p>
     */
    private String availabilityZone;
    /**
     * <p>
     * The number of available instances.
     * </p>
     */
    private Integer availableInstanceCount;
    /**
     * <p>
     * The time period for the first schedule to start.
     * </p>
     */
    private java.util.Date firstSlotStartTime;
    /**
     * <p>
     * The hourly price for a single instance.
     * </p>
     */
    private String hourlyPrice;
    /**
     * <p>
     * The instance type. You can specify one of the C3, C4, M4, or R3 instance types.
     * </p>
     */
    private String instanceType;
    /**
     * <p>
     * The maximum term. The only possible value is 365 days.
     * </p>
     */
    private Integer maxTermDurationInDays;
    /**
     * <p>
     * The minimum term. The only possible value is 365 days.
     * </p>
     */
    private Integer minTermDurationInDays;
    /**
     * <p>
     * The network platform (<code>EC2-Classic</code> or <code>EC2-VPC</code>).
     * </p>
     */
    private String networkPlatform;
    /**
     * <p>
     * The platform (<code>Linux/UNIX</code> or <code>Windows</code>).
     * </p>
     */
    private String platform;
    /**
     * <p>
     * The purchase token. This token expires in two hours.
     * </p>
     */
    private String purchaseToken;
    /**
     * <p>
     * The schedule recurrence.
     * </p>
     */
    private ScheduledInstanceRecurrence recurrence;
    /**
     * <p>
     * The number of hours in the schedule.
     * </p>
     */
    private Integer slotDurationInHours;
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

    public ScheduledInstanceAvailability withAvailabilityZone(String availabilityZone) {
        setAvailabilityZone(availabilityZone);
        return this;
    }

    /**
     * <p>
     * The number of available instances.
     * </p>
     * 
     * @param availableInstanceCount
     *        The number of available instances.
     */

    public void setAvailableInstanceCount(Integer availableInstanceCount) {
        this.availableInstanceCount = availableInstanceCount;
    }

    /**
     * <p>
     * The number of available instances.
     * </p>
     * 
     * @return The number of available instances.
     */

    public Integer getAvailableInstanceCount() {
        return this.availableInstanceCount;
    }

    /**
     * <p>
     * The number of available instances.
     * </p>
     * 
     * @param availableInstanceCount
     *        The number of available instances.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScheduledInstanceAvailability withAvailableInstanceCount(Integer availableInstanceCount) {
        setAvailableInstanceCount(availableInstanceCount);
        return this;
    }

    /**
     * <p>
     * The time period for the first schedule to start.
     * </p>
     * 
     * @param firstSlotStartTime
     *        The time period for the first schedule to start.
     */

    public void setFirstSlotStartTime(java.util.Date firstSlotStartTime) {
        this.firstSlotStartTime = firstSlotStartTime;
    }

    /**
     * <p>
     * The time period for the first schedule to start.
     * </p>
     * 
     * @return The time period for the first schedule to start.
     */

    public java.util.Date getFirstSlotStartTime() {
        return this.firstSlotStartTime;
    }

    /**
     * <p>
     * The time period for the first schedule to start.
     * </p>
     * 
     * @param firstSlotStartTime
     *        The time period for the first schedule to start.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScheduledInstanceAvailability withFirstSlotStartTime(java.util.Date firstSlotStartTime) {
        setFirstSlotStartTime(firstSlotStartTime);
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

    public ScheduledInstanceAvailability withHourlyPrice(String hourlyPrice) {
        setHourlyPrice(hourlyPrice);
        return this;
    }

    /**
     * <p>
     * The instance type. You can specify one of the C3, C4, M4, or R3 instance types.
     * </p>
     * 
     * @param instanceType
     *        The instance type. You can specify one of the C3, C4, M4, or R3 instance types.
     */

    public void setInstanceType(String instanceType) {
        this.instanceType = instanceType;
    }

    /**
     * <p>
     * The instance type. You can specify one of the C3, C4, M4, or R3 instance types.
     * </p>
     * 
     * @return The instance type. You can specify one of the C3, C4, M4, or R3 instance types.
     */

    public String getInstanceType() {
        return this.instanceType;
    }

    /**
     * <p>
     * The instance type. You can specify one of the C3, C4, M4, or R3 instance types.
     * </p>
     * 
     * @param instanceType
     *        The instance type. You can specify one of the C3, C4, M4, or R3 instance types.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScheduledInstanceAvailability withInstanceType(String instanceType) {
        setInstanceType(instanceType);
        return this;
    }

    /**
     * <p>
     * The maximum term. The only possible value is 365 days.
     * </p>
     * 
     * @param maxTermDurationInDays
     *        The maximum term. The only possible value is 365 days.
     */

    public void setMaxTermDurationInDays(Integer maxTermDurationInDays) {
        this.maxTermDurationInDays = maxTermDurationInDays;
    }

    /**
     * <p>
     * The maximum term. The only possible value is 365 days.
     * </p>
     * 
     * @return The maximum term. The only possible value is 365 days.
     */

    public Integer getMaxTermDurationInDays() {
        return this.maxTermDurationInDays;
    }

    /**
     * <p>
     * The maximum term. The only possible value is 365 days.
     * </p>
     * 
     * @param maxTermDurationInDays
     *        The maximum term. The only possible value is 365 days.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScheduledInstanceAvailability withMaxTermDurationInDays(Integer maxTermDurationInDays) {
        setMaxTermDurationInDays(maxTermDurationInDays);
        return this;
    }

    /**
     * <p>
     * The minimum term. The only possible value is 365 days.
     * </p>
     * 
     * @param minTermDurationInDays
     *        The minimum term. The only possible value is 365 days.
     */

    public void setMinTermDurationInDays(Integer minTermDurationInDays) {
        this.minTermDurationInDays = minTermDurationInDays;
    }

    /**
     * <p>
     * The minimum term. The only possible value is 365 days.
     * </p>
     * 
     * @return The minimum term. The only possible value is 365 days.
     */

    public Integer getMinTermDurationInDays() {
        return this.minTermDurationInDays;
    }

    /**
     * <p>
     * The minimum term. The only possible value is 365 days.
     * </p>
     * 
     * @param minTermDurationInDays
     *        The minimum term. The only possible value is 365 days.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScheduledInstanceAvailability withMinTermDurationInDays(Integer minTermDurationInDays) {
        setMinTermDurationInDays(minTermDurationInDays);
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

    public ScheduledInstanceAvailability withNetworkPlatform(String networkPlatform) {
        setNetworkPlatform(networkPlatform);
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

    public ScheduledInstanceAvailability withPlatform(String platform) {
        setPlatform(platform);
        return this;
    }

    /**
     * <p>
     * The purchase token. This token expires in two hours.
     * </p>
     * 
     * @param purchaseToken
     *        The purchase token. This token expires in two hours.
     */

    public void setPurchaseToken(String purchaseToken) {
        this.purchaseToken = purchaseToken;
    }

    /**
     * <p>
     * The purchase token. This token expires in two hours.
     * </p>
     * 
     * @return The purchase token. This token expires in two hours.
     */

    public String getPurchaseToken() {
        return this.purchaseToken;
    }

    /**
     * <p>
     * The purchase token. This token expires in two hours.
     * </p>
     * 
     * @param purchaseToken
     *        The purchase token. This token expires in two hours.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScheduledInstanceAvailability withPurchaseToken(String purchaseToken) {
        setPurchaseToken(purchaseToken);
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

    public ScheduledInstanceAvailability withRecurrence(ScheduledInstanceRecurrence recurrence) {
        setRecurrence(recurrence);
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

    public ScheduledInstanceAvailability withSlotDurationInHours(Integer slotDurationInHours) {
        setSlotDurationInHours(slotDurationInHours);
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

    public ScheduledInstanceAvailability withTotalScheduledInstanceHours(Integer totalScheduledInstanceHours) {
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
        if (getAvailableInstanceCount() != null)
            sb.append("AvailableInstanceCount: ").append(getAvailableInstanceCount()).append(",");
        if (getFirstSlotStartTime() != null)
            sb.append("FirstSlotStartTime: ").append(getFirstSlotStartTime()).append(",");
        if (getHourlyPrice() != null)
            sb.append("HourlyPrice: ").append(getHourlyPrice()).append(",");
        if (getInstanceType() != null)
            sb.append("InstanceType: ").append(getInstanceType()).append(",");
        if (getMaxTermDurationInDays() != null)
            sb.append("MaxTermDurationInDays: ").append(getMaxTermDurationInDays()).append(",");
        if (getMinTermDurationInDays() != null)
            sb.append("MinTermDurationInDays: ").append(getMinTermDurationInDays()).append(",");
        if (getNetworkPlatform() != null)
            sb.append("NetworkPlatform: ").append(getNetworkPlatform()).append(",");
        if (getPlatform() != null)
            sb.append("Platform: ").append(getPlatform()).append(",");
        if (getPurchaseToken() != null)
            sb.append("PurchaseToken: ").append(getPurchaseToken()).append(",");
        if (getRecurrence() != null)
            sb.append("Recurrence: ").append(getRecurrence()).append(",");
        if (getSlotDurationInHours() != null)
            sb.append("SlotDurationInHours: ").append(getSlotDurationInHours()).append(",");
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

        if (obj instanceof ScheduledInstanceAvailability == false)
            return false;
        ScheduledInstanceAvailability other = (ScheduledInstanceAvailability) obj;
        if (other.getAvailabilityZone() == null ^ this.getAvailabilityZone() == null)
            return false;
        if (other.getAvailabilityZone() != null && other.getAvailabilityZone().equals(this.getAvailabilityZone()) == false)
            return false;
        if (other.getAvailableInstanceCount() == null ^ this.getAvailableInstanceCount() == null)
            return false;
        if (other.getAvailableInstanceCount() != null && other.getAvailableInstanceCount().equals(this.getAvailableInstanceCount()) == false)
            return false;
        if (other.getFirstSlotStartTime() == null ^ this.getFirstSlotStartTime() == null)
            return false;
        if (other.getFirstSlotStartTime() != null && other.getFirstSlotStartTime().equals(this.getFirstSlotStartTime()) == false)
            return false;
        if (other.getHourlyPrice() == null ^ this.getHourlyPrice() == null)
            return false;
        if (other.getHourlyPrice() != null && other.getHourlyPrice().equals(this.getHourlyPrice()) == false)
            return false;
        if (other.getInstanceType() == null ^ this.getInstanceType() == null)
            return false;
        if (other.getInstanceType() != null && other.getInstanceType().equals(this.getInstanceType()) == false)
            return false;
        if (other.getMaxTermDurationInDays() == null ^ this.getMaxTermDurationInDays() == null)
            return false;
        if (other.getMaxTermDurationInDays() != null && other.getMaxTermDurationInDays().equals(this.getMaxTermDurationInDays()) == false)
            return false;
        if (other.getMinTermDurationInDays() == null ^ this.getMinTermDurationInDays() == null)
            return false;
        if (other.getMinTermDurationInDays() != null && other.getMinTermDurationInDays().equals(this.getMinTermDurationInDays()) == false)
            return false;
        if (other.getNetworkPlatform() == null ^ this.getNetworkPlatform() == null)
            return false;
        if (other.getNetworkPlatform() != null && other.getNetworkPlatform().equals(this.getNetworkPlatform()) == false)
            return false;
        if (other.getPlatform() == null ^ this.getPlatform() == null)
            return false;
        if (other.getPlatform() != null && other.getPlatform().equals(this.getPlatform()) == false)
            return false;
        if (other.getPurchaseToken() == null ^ this.getPurchaseToken() == null)
            return false;
        if (other.getPurchaseToken() != null && other.getPurchaseToken().equals(this.getPurchaseToken()) == false)
            return false;
        if (other.getRecurrence() == null ^ this.getRecurrence() == null)
            return false;
        if (other.getRecurrence() != null && other.getRecurrence().equals(this.getRecurrence()) == false)
            return false;
        if (other.getSlotDurationInHours() == null ^ this.getSlotDurationInHours() == null)
            return false;
        if (other.getSlotDurationInHours() != null && other.getSlotDurationInHours().equals(this.getSlotDurationInHours()) == false)
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
        hashCode = prime * hashCode + ((getAvailableInstanceCount() == null) ? 0 : getAvailableInstanceCount().hashCode());
        hashCode = prime * hashCode + ((getFirstSlotStartTime() == null) ? 0 : getFirstSlotStartTime().hashCode());
        hashCode = prime * hashCode + ((getHourlyPrice() == null) ? 0 : getHourlyPrice().hashCode());
        hashCode = prime * hashCode + ((getInstanceType() == null) ? 0 : getInstanceType().hashCode());
        hashCode = prime * hashCode + ((getMaxTermDurationInDays() == null) ? 0 : getMaxTermDurationInDays().hashCode());
        hashCode = prime * hashCode + ((getMinTermDurationInDays() == null) ? 0 : getMinTermDurationInDays().hashCode());
        hashCode = prime * hashCode + ((getNetworkPlatform() == null) ? 0 : getNetworkPlatform().hashCode());
        hashCode = prime * hashCode + ((getPlatform() == null) ? 0 : getPlatform().hashCode());
        hashCode = prime * hashCode + ((getPurchaseToken() == null) ? 0 : getPurchaseToken().hashCode());
        hashCode = prime * hashCode + ((getRecurrence() == null) ? 0 : getRecurrence().hashCode());
        hashCode = prime * hashCode + ((getSlotDurationInHours() == null) ? 0 : getSlotDurationInHours().hashCode());
        hashCode = prime * hashCode + ((getTotalScheduledInstanceHours() == null) ? 0 : getTotalScheduledInstanceHours().hashCode());
        return hashCode;
    }

    @Override
    public ScheduledInstanceAvailability clone() {
        try {
            return (ScheduledInstanceAvailability) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
