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
 * Describes a schedule that is available for your Scheduled Instances.
 * </p>
 */
public class ScheduledInstanceAvailability implements Serializable, Cloneable {

    /**
     * The instance type. You can specify one of the C3, C4, M4, or R3
     * instance types.
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
     * The purchase token. This token expires in two hours.
     */
    private String purchaseToken;

    /**
     * The number of hours in the schedule.
     */
    private Integer slotDurationInHours;

    /**
     * The schedule recurrence.
     */
    private ScheduledInstanceRecurrence recurrence;

    /**
     * The time period for the first schedule to start.
     */
    private java.util.Date firstSlotStartTime;

    /**
     * The hourly price for a single instance.
     */
    private String hourlyPrice;

    /**
     * The total number of hours for a single instance for the entire term.
     */
    private Integer totalScheduledInstanceHours;

    /**
     * The number of available instances.
     */
    private Integer availableInstanceCount;

    /**
     * The minimum term. The only possible value is 365 days.
     */
    private Integer minTermDurationInDays;

    /**
     * The maximum term. The only possible value is 365 days.
     */
    private Integer maxTermDurationInDays;

    /**
     * The instance type. You can specify one of the C3, C4, M4, or R3
     * instance types.
     *
     * @return The instance type. You can specify one of the C3, C4, M4, or R3
     *         instance types.
     */
    public String getInstanceType() {
        return instanceType;
    }
    
    /**
     * The instance type. You can specify one of the C3, C4, M4, or R3
     * instance types.
     *
     * @param instanceType The instance type. You can specify one of the C3, C4, M4, or R3
     *         instance types.
     */
    public void setInstanceType(String instanceType) {
        this.instanceType = instanceType;
    }
    
    /**
     * The instance type. You can specify one of the C3, C4, M4, or R3
     * instance types.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param instanceType The instance type. You can specify one of the C3, C4, M4, or R3
     *         instance types.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ScheduledInstanceAvailability withInstanceType(String instanceType) {
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
    public ScheduledInstanceAvailability withPlatform(String platform) {
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
    public ScheduledInstanceAvailability withNetworkPlatform(String networkPlatform) {
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
    public ScheduledInstanceAvailability withAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
        return this;
    }

    /**
     * The purchase token. This token expires in two hours.
     *
     * @return The purchase token. This token expires in two hours.
     */
    public String getPurchaseToken() {
        return purchaseToken;
    }
    
    /**
     * The purchase token. This token expires in two hours.
     *
     * @param purchaseToken The purchase token. This token expires in two hours.
     */
    public void setPurchaseToken(String purchaseToken) {
        this.purchaseToken = purchaseToken;
    }
    
    /**
     * The purchase token. This token expires in two hours.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param purchaseToken The purchase token. This token expires in two hours.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ScheduledInstanceAvailability withPurchaseToken(String purchaseToken) {
        this.purchaseToken = purchaseToken;
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
    public ScheduledInstanceAvailability withSlotDurationInHours(Integer slotDurationInHours) {
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
    public ScheduledInstanceAvailability withRecurrence(ScheduledInstanceRecurrence recurrence) {
        this.recurrence = recurrence;
        return this;
    }

    /**
     * The time period for the first schedule to start.
     *
     * @return The time period for the first schedule to start.
     */
    public java.util.Date getFirstSlotStartTime() {
        return firstSlotStartTime;
    }
    
    /**
     * The time period for the first schedule to start.
     *
     * @param firstSlotStartTime The time period for the first schedule to start.
     */
    public void setFirstSlotStartTime(java.util.Date firstSlotStartTime) {
        this.firstSlotStartTime = firstSlotStartTime;
    }
    
    /**
     * The time period for the first schedule to start.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param firstSlotStartTime The time period for the first schedule to start.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ScheduledInstanceAvailability withFirstSlotStartTime(java.util.Date firstSlotStartTime) {
        this.firstSlotStartTime = firstSlotStartTime;
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
    public ScheduledInstanceAvailability withHourlyPrice(String hourlyPrice) {
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
    public ScheduledInstanceAvailability withTotalScheduledInstanceHours(Integer totalScheduledInstanceHours) {
        this.totalScheduledInstanceHours = totalScheduledInstanceHours;
        return this;
    }

    /**
     * The number of available instances.
     *
     * @return The number of available instances.
     */
    public Integer getAvailableInstanceCount() {
        return availableInstanceCount;
    }
    
    /**
     * The number of available instances.
     *
     * @param availableInstanceCount The number of available instances.
     */
    public void setAvailableInstanceCount(Integer availableInstanceCount) {
        this.availableInstanceCount = availableInstanceCount;
    }
    
    /**
     * The number of available instances.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param availableInstanceCount The number of available instances.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ScheduledInstanceAvailability withAvailableInstanceCount(Integer availableInstanceCount) {
        this.availableInstanceCount = availableInstanceCount;
        return this;
    }

    /**
     * The minimum term. The only possible value is 365 days.
     *
     * @return The minimum term. The only possible value is 365 days.
     */
    public Integer getMinTermDurationInDays() {
        return minTermDurationInDays;
    }
    
    /**
     * The minimum term. The only possible value is 365 days.
     *
     * @param minTermDurationInDays The minimum term. The only possible value is 365 days.
     */
    public void setMinTermDurationInDays(Integer minTermDurationInDays) {
        this.minTermDurationInDays = minTermDurationInDays;
    }
    
    /**
     * The minimum term. The only possible value is 365 days.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param minTermDurationInDays The minimum term. The only possible value is 365 days.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ScheduledInstanceAvailability withMinTermDurationInDays(Integer minTermDurationInDays) {
        this.minTermDurationInDays = minTermDurationInDays;
        return this;
    }

    /**
     * The maximum term. The only possible value is 365 days.
     *
     * @return The maximum term. The only possible value is 365 days.
     */
    public Integer getMaxTermDurationInDays() {
        return maxTermDurationInDays;
    }
    
    /**
     * The maximum term. The only possible value is 365 days.
     *
     * @param maxTermDurationInDays The maximum term. The only possible value is 365 days.
     */
    public void setMaxTermDurationInDays(Integer maxTermDurationInDays) {
        this.maxTermDurationInDays = maxTermDurationInDays;
    }
    
    /**
     * The maximum term. The only possible value is 365 days.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param maxTermDurationInDays The maximum term. The only possible value is 365 days.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ScheduledInstanceAvailability withMaxTermDurationInDays(Integer maxTermDurationInDays) {
        this.maxTermDurationInDays = maxTermDurationInDays;
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
        if (getInstanceType() != null) sb.append("InstanceType: " + getInstanceType() + ",");
        if (getPlatform() != null) sb.append("Platform: " + getPlatform() + ",");
        if (getNetworkPlatform() != null) sb.append("NetworkPlatform: " + getNetworkPlatform() + ",");
        if (getAvailabilityZone() != null) sb.append("AvailabilityZone: " + getAvailabilityZone() + ",");
        if (getPurchaseToken() != null) sb.append("PurchaseToken: " + getPurchaseToken() + ",");
        if (getSlotDurationInHours() != null) sb.append("SlotDurationInHours: " + getSlotDurationInHours() + ",");
        if (getRecurrence() != null) sb.append("Recurrence: " + getRecurrence() + ",");
        if (getFirstSlotStartTime() != null) sb.append("FirstSlotStartTime: " + getFirstSlotStartTime() + ",");
        if (getHourlyPrice() != null) sb.append("HourlyPrice: " + getHourlyPrice() + ",");
        if (getTotalScheduledInstanceHours() != null) sb.append("TotalScheduledInstanceHours: " + getTotalScheduledInstanceHours() + ",");
        if (getAvailableInstanceCount() != null) sb.append("AvailableInstanceCount: " + getAvailableInstanceCount() + ",");
        if (getMinTermDurationInDays() != null) sb.append("MinTermDurationInDays: " + getMinTermDurationInDays() + ",");
        if (getMaxTermDurationInDays() != null) sb.append("MaxTermDurationInDays: " + getMaxTermDurationInDays() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getInstanceType() == null) ? 0 : getInstanceType().hashCode()); 
        hashCode = prime * hashCode + ((getPlatform() == null) ? 0 : getPlatform().hashCode()); 
        hashCode = prime * hashCode + ((getNetworkPlatform() == null) ? 0 : getNetworkPlatform().hashCode()); 
        hashCode = prime * hashCode + ((getAvailabilityZone() == null) ? 0 : getAvailabilityZone().hashCode()); 
        hashCode = prime * hashCode + ((getPurchaseToken() == null) ? 0 : getPurchaseToken().hashCode()); 
        hashCode = prime * hashCode + ((getSlotDurationInHours() == null) ? 0 : getSlotDurationInHours().hashCode()); 
        hashCode = prime * hashCode + ((getRecurrence() == null) ? 0 : getRecurrence().hashCode()); 
        hashCode = prime * hashCode + ((getFirstSlotStartTime() == null) ? 0 : getFirstSlotStartTime().hashCode()); 
        hashCode = prime * hashCode + ((getHourlyPrice() == null) ? 0 : getHourlyPrice().hashCode()); 
        hashCode = prime * hashCode + ((getTotalScheduledInstanceHours() == null) ? 0 : getTotalScheduledInstanceHours().hashCode()); 
        hashCode = prime * hashCode + ((getAvailableInstanceCount() == null) ? 0 : getAvailableInstanceCount().hashCode()); 
        hashCode = prime * hashCode + ((getMinTermDurationInDays() == null) ? 0 : getMinTermDurationInDays().hashCode()); 
        hashCode = prime * hashCode + ((getMaxTermDurationInDays() == null) ? 0 : getMaxTermDurationInDays().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof ScheduledInstanceAvailability == false) return false;
        ScheduledInstanceAvailability other = (ScheduledInstanceAvailability)obj;
        
        if (other.getInstanceType() == null ^ this.getInstanceType() == null) return false;
        if (other.getInstanceType() != null && other.getInstanceType().equals(this.getInstanceType()) == false) return false; 
        if (other.getPlatform() == null ^ this.getPlatform() == null) return false;
        if (other.getPlatform() != null && other.getPlatform().equals(this.getPlatform()) == false) return false; 
        if (other.getNetworkPlatform() == null ^ this.getNetworkPlatform() == null) return false;
        if (other.getNetworkPlatform() != null && other.getNetworkPlatform().equals(this.getNetworkPlatform()) == false) return false; 
        if (other.getAvailabilityZone() == null ^ this.getAvailabilityZone() == null) return false;
        if (other.getAvailabilityZone() != null && other.getAvailabilityZone().equals(this.getAvailabilityZone()) == false) return false; 
        if (other.getPurchaseToken() == null ^ this.getPurchaseToken() == null) return false;
        if (other.getPurchaseToken() != null && other.getPurchaseToken().equals(this.getPurchaseToken()) == false) return false; 
        if (other.getSlotDurationInHours() == null ^ this.getSlotDurationInHours() == null) return false;
        if (other.getSlotDurationInHours() != null && other.getSlotDurationInHours().equals(this.getSlotDurationInHours()) == false) return false; 
        if (other.getRecurrence() == null ^ this.getRecurrence() == null) return false;
        if (other.getRecurrence() != null && other.getRecurrence().equals(this.getRecurrence()) == false) return false; 
        if (other.getFirstSlotStartTime() == null ^ this.getFirstSlotStartTime() == null) return false;
        if (other.getFirstSlotStartTime() != null && other.getFirstSlotStartTime().equals(this.getFirstSlotStartTime()) == false) return false; 
        if (other.getHourlyPrice() == null ^ this.getHourlyPrice() == null) return false;
        if (other.getHourlyPrice() != null && other.getHourlyPrice().equals(this.getHourlyPrice()) == false) return false; 
        if (other.getTotalScheduledInstanceHours() == null ^ this.getTotalScheduledInstanceHours() == null) return false;
        if (other.getTotalScheduledInstanceHours() != null && other.getTotalScheduledInstanceHours().equals(this.getTotalScheduledInstanceHours()) == false) return false; 
        if (other.getAvailableInstanceCount() == null ^ this.getAvailableInstanceCount() == null) return false;
        if (other.getAvailableInstanceCount() != null && other.getAvailableInstanceCount().equals(this.getAvailableInstanceCount()) == false) return false; 
        if (other.getMinTermDurationInDays() == null ^ this.getMinTermDurationInDays() == null) return false;
        if (other.getMinTermDurationInDays() != null && other.getMinTermDurationInDays().equals(this.getMinTermDurationInDays()) == false) return false; 
        if (other.getMaxTermDurationInDays() == null ^ this.getMaxTermDurationInDays() == null) return false;
        if (other.getMaxTermDurationInDays() != null && other.getMaxTermDurationInDays().equals(this.getMaxTermDurationInDays()) == false) return false; 
        return true;
    }
    
    @Override
    public ScheduledInstanceAvailability clone() {
        try {
            return (ScheduledInstanceAvailability) super.clone();
        
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                    + "even though we're Cloneable!",
                    e);
        }
        
    }

}
    