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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * The recommended Capacity Block that fits your search requirements.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/CapacityBlockOffering" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CapacityBlockOffering implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the Capacity Block offering.
     * </p>
     */
    private String capacityBlockOfferingId;
    /**
     * <p>
     * The instance type of the Capacity Block offering.
     * </p>
     */
    private String instanceType;
    /**
     * <p>
     * The Availability Zone of the Capacity Block offering.
     * </p>
     */
    private String availabilityZone;
    /**
     * <p>
     * The number of instances in the Capacity Block offering.
     * </p>
     */
    private Integer instanceCount;
    /**
     * <p>
     * The start date of the Capacity Block offering.
     * </p>
     */
    private java.util.Date startDate;
    /**
     * <p>
     * The end date of the Capacity Block offering.
     * </p>
     */
    private java.util.Date endDate;
    /**
     * <p>
     * The amount of time of the Capacity Block reservation in hours.
     * </p>
     */
    private Integer capacityBlockDurationHours;
    /**
     * <p>
     * The total price to be paid up front.
     * </p>
     */
    private String upfrontFee;
    /**
     * <p>
     * The currency of the payment for the Capacity Block.
     * </p>
     */
    private String currencyCode;
    /**
     * <p>
     * The tenancy of the Capacity Block.
     * </p>
     */
    private String tenancy;

    /**
     * <p>
     * The ID of the Capacity Block offering.
     * </p>
     * 
     * @param capacityBlockOfferingId
     *        The ID of the Capacity Block offering.
     */

    public void setCapacityBlockOfferingId(String capacityBlockOfferingId) {
        this.capacityBlockOfferingId = capacityBlockOfferingId;
    }

    /**
     * <p>
     * The ID of the Capacity Block offering.
     * </p>
     * 
     * @return The ID of the Capacity Block offering.
     */

    public String getCapacityBlockOfferingId() {
        return this.capacityBlockOfferingId;
    }

    /**
     * <p>
     * The ID of the Capacity Block offering.
     * </p>
     * 
     * @param capacityBlockOfferingId
     *        The ID of the Capacity Block offering.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CapacityBlockOffering withCapacityBlockOfferingId(String capacityBlockOfferingId) {
        setCapacityBlockOfferingId(capacityBlockOfferingId);
        return this;
    }

    /**
     * <p>
     * The instance type of the Capacity Block offering.
     * </p>
     * 
     * @param instanceType
     *        The instance type of the Capacity Block offering.
     */

    public void setInstanceType(String instanceType) {
        this.instanceType = instanceType;
    }

    /**
     * <p>
     * The instance type of the Capacity Block offering.
     * </p>
     * 
     * @return The instance type of the Capacity Block offering.
     */

    public String getInstanceType() {
        return this.instanceType;
    }

    /**
     * <p>
     * The instance type of the Capacity Block offering.
     * </p>
     * 
     * @param instanceType
     *        The instance type of the Capacity Block offering.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CapacityBlockOffering withInstanceType(String instanceType) {
        setInstanceType(instanceType);
        return this;
    }

    /**
     * <p>
     * The Availability Zone of the Capacity Block offering.
     * </p>
     * 
     * @param availabilityZone
     *        The Availability Zone of the Capacity Block offering.
     */

    public void setAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
    }

    /**
     * <p>
     * The Availability Zone of the Capacity Block offering.
     * </p>
     * 
     * @return The Availability Zone of the Capacity Block offering.
     */

    public String getAvailabilityZone() {
        return this.availabilityZone;
    }

    /**
     * <p>
     * The Availability Zone of the Capacity Block offering.
     * </p>
     * 
     * @param availabilityZone
     *        The Availability Zone of the Capacity Block offering.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CapacityBlockOffering withAvailabilityZone(String availabilityZone) {
        setAvailabilityZone(availabilityZone);
        return this;
    }

    /**
     * <p>
     * The number of instances in the Capacity Block offering.
     * </p>
     * 
     * @param instanceCount
     *        The number of instances in the Capacity Block offering.
     */

    public void setInstanceCount(Integer instanceCount) {
        this.instanceCount = instanceCount;
    }

    /**
     * <p>
     * The number of instances in the Capacity Block offering.
     * </p>
     * 
     * @return The number of instances in the Capacity Block offering.
     */

    public Integer getInstanceCount() {
        return this.instanceCount;
    }

    /**
     * <p>
     * The number of instances in the Capacity Block offering.
     * </p>
     * 
     * @param instanceCount
     *        The number of instances in the Capacity Block offering.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CapacityBlockOffering withInstanceCount(Integer instanceCount) {
        setInstanceCount(instanceCount);
        return this;
    }

    /**
     * <p>
     * The start date of the Capacity Block offering.
     * </p>
     * 
     * @param startDate
     *        The start date of the Capacity Block offering.
     */

    public void setStartDate(java.util.Date startDate) {
        this.startDate = startDate;
    }

    /**
     * <p>
     * The start date of the Capacity Block offering.
     * </p>
     * 
     * @return The start date of the Capacity Block offering.
     */

    public java.util.Date getStartDate() {
        return this.startDate;
    }

    /**
     * <p>
     * The start date of the Capacity Block offering.
     * </p>
     * 
     * @param startDate
     *        The start date of the Capacity Block offering.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CapacityBlockOffering withStartDate(java.util.Date startDate) {
        setStartDate(startDate);
        return this;
    }

    /**
     * <p>
     * The end date of the Capacity Block offering.
     * </p>
     * 
     * @param endDate
     *        The end date of the Capacity Block offering.
     */

    public void setEndDate(java.util.Date endDate) {
        this.endDate = endDate;
    }

    /**
     * <p>
     * The end date of the Capacity Block offering.
     * </p>
     * 
     * @return The end date of the Capacity Block offering.
     */

    public java.util.Date getEndDate() {
        return this.endDate;
    }

    /**
     * <p>
     * The end date of the Capacity Block offering.
     * </p>
     * 
     * @param endDate
     *        The end date of the Capacity Block offering.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CapacityBlockOffering withEndDate(java.util.Date endDate) {
        setEndDate(endDate);
        return this;
    }

    /**
     * <p>
     * The amount of time of the Capacity Block reservation in hours.
     * </p>
     * 
     * @param capacityBlockDurationHours
     *        The amount of time of the Capacity Block reservation in hours.
     */

    public void setCapacityBlockDurationHours(Integer capacityBlockDurationHours) {
        this.capacityBlockDurationHours = capacityBlockDurationHours;
    }

    /**
     * <p>
     * The amount of time of the Capacity Block reservation in hours.
     * </p>
     * 
     * @return The amount of time of the Capacity Block reservation in hours.
     */

    public Integer getCapacityBlockDurationHours() {
        return this.capacityBlockDurationHours;
    }

    /**
     * <p>
     * The amount of time of the Capacity Block reservation in hours.
     * </p>
     * 
     * @param capacityBlockDurationHours
     *        The amount of time of the Capacity Block reservation in hours.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CapacityBlockOffering withCapacityBlockDurationHours(Integer capacityBlockDurationHours) {
        setCapacityBlockDurationHours(capacityBlockDurationHours);
        return this;
    }

    /**
     * <p>
     * The total price to be paid up front.
     * </p>
     * 
     * @param upfrontFee
     *        The total price to be paid up front.
     */

    public void setUpfrontFee(String upfrontFee) {
        this.upfrontFee = upfrontFee;
    }

    /**
     * <p>
     * The total price to be paid up front.
     * </p>
     * 
     * @return The total price to be paid up front.
     */

    public String getUpfrontFee() {
        return this.upfrontFee;
    }

    /**
     * <p>
     * The total price to be paid up front.
     * </p>
     * 
     * @param upfrontFee
     *        The total price to be paid up front.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CapacityBlockOffering withUpfrontFee(String upfrontFee) {
        setUpfrontFee(upfrontFee);
        return this;
    }

    /**
     * <p>
     * The currency of the payment for the Capacity Block.
     * </p>
     * 
     * @param currencyCode
     *        The currency of the payment for the Capacity Block.
     */

    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    /**
     * <p>
     * The currency of the payment for the Capacity Block.
     * </p>
     * 
     * @return The currency of the payment for the Capacity Block.
     */

    public String getCurrencyCode() {
        return this.currencyCode;
    }

    /**
     * <p>
     * The currency of the payment for the Capacity Block.
     * </p>
     * 
     * @param currencyCode
     *        The currency of the payment for the Capacity Block.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CapacityBlockOffering withCurrencyCode(String currencyCode) {
        setCurrencyCode(currencyCode);
        return this;
    }

    /**
     * <p>
     * The tenancy of the Capacity Block.
     * </p>
     * 
     * @param tenancy
     *        The tenancy of the Capacity Block.
     * @see CapacityReservationTenancy
     */

    public void setTenancy(String tenancy) {
        this.tenancy = tenancy;
    }

    /**
     * <p>
     * The tenancy of the Capacity Block.
     * </p>
     * 
     * @return The tenancy of the Capacity Block.
     * @see CapacityReservationTenancy
     */

    public String getTenancy() {
        return this.tenancy;
    }

    /**
     * <p>
     * The tenancy of the Capacity Block.
     * </p>
     * 
     * @param tenancy
     *        The tenancy of the Capacity Block.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CapacityReservationTenancy
     */

    public CapacityBlockOffering withTenancy(String tenancy) {
        setTenancy(tenancy);
        return this;
    }

    /**
     * <p>
     * The tenancy of the Capacity Block.
     * </p>
     * 
     * @param tenancy
     *        The tenancy of the Capacity Block.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CapacityReservationTenancy
     */

    public CapacityBlockOffering withTenancy(CapacityReservationTenancy tenancy) {
        this.tenancy = tenancy.toString();
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
        if (getCapacityBlockOfferingId() != null)
            sb.append("CapacityBlockOfferingId: ").append(getCapacityBlockOfferingId()).append(",");
        if (getInstanceType() != null)
            sb.append("InstanceType: ").append(getInstanceType()).append(",");
        if (getAvailabilityZone() != null)
            sb.append("AvailabilityZone: ").append(getAvailabilityZone()).append(",");
        if (getInstanceCount() != null)
            sb.append("InstanceCount: ").append(getInstanceCount()).append(",");
        if (getStartDate() != null)
            sb.append("StartDate: ").append(getStartDate()).append(",");
        if (getEndDate() != null)
            sb.append("EndDate: ").append(getEndDate()).append(",");
        if (getCapacityBlockDurationHours() != null)
            sb.append("CapacityBlockDurationHours: ").append(getCapacityBlockDurationHours()).append(",");
        if (getUpfrontFee() != null)
            sb.append("UpfrontFee: ").append(getUpfrontFee()).append(",");
        if (getCurrencyCode() != null)
            sb.append("CurrencyCode: ").append(getCurrencyCode()).append(",");
        if (getTenancy() != null)
            sb.append("Tenancy: ").append(getTenancy());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CapacityBlockOffering == false)
            return false;
        CapacityBlockOffering other = (CapacityBlockOffering) obj;
        if (other.getCapacityBlockOfferingId() == null ^ this.getCapacityBlockOfferingId() == null)
            return false;
        if (other.getCapacityBlockOfferingId() != null && other.getCapacityBlockOfferingId().equals(this.getCapacityBlockOfferingId()) == false)
            return false;
        if (other.getInstanceType() == null ^ this.getInstanceType() == null)
            return false;
        if (other.getInstanceType() != null && other.getInstanceType().equals(this.getInstanceType()) == false)
            return false;
        if (other.getAvailabilityZone() == null ^ this.getAvailabilityZone() == null)
            return false;
        if (other.getAvailabilityZone() != null && other.getAvailabilityZone().equals(this.getAvailabilityZone()) == false)
            return false;
        if (other.getInstanceCount() == null ^ this.getInstanceCount() == null)
            return false;
        if (other.getInstanceCount() != null && other.getInstanceCount().equals(this.getInstanceCount()) == false)
            return false;
        if (other.getStartDate() == null ^ this.getStartDate() == null)
            return false;
        if (other.getStartDate() != null && other.getStartDate().equals(this.getStartDate()) == false)
            return false;
        if (other.getEndDate() == null ^ this.getEndDate() == null)
            return false;
        if (other.getEndDate() != null && other.getEndDate().equals(this.getEndDate()) == false)
            return false;
        if (other.getCapacityBlockDurationHours() == null ^ this.getCapacityBlockDurationHours() == null)
            return false;
        if (other.getCapacityBlockDurationHours() != null && other.getCapacityBlockDurationHours().equals(this.getCapacityBlockDurationHours()) == false)
            return false;
        if (other.getUpfrontFee() == null ^ this.getUpfrontFee() == null)
            return false;
        if (other.getUpfrontFee() != null && other.getUpfrontFee().equals(this.getUpfrontFee()) == false)
            return false;
        if (other.getCurrencyCode() == null ^ this.getCurrencyCode() == null)
            return false;
        if (other.getCurrencyCode() != null && other.getCurrencyCode().equals(this.getCurrencyCode()) == false)
            return false;
        if (other.getTenancy() == null ^ this.getTenancy() == null)
            return false;
        if (other.getTenancy() != null && other.getTenancy().equals(this.getTenancy()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCapacityBlockOfferingId() == null) ? 0 : getCapacityBlockOfferingId().hashCode());
        hashCode = prime * hashCode + ((getInstanceType() == null) ? 0 : getInstanceType().hashCode());
        hashCode = prime * hashCode + ((getAvailabilityZone() == null) ? 0 : getAvailabilityZone().hashCode());
        hashCode = prime * hashCode + ((getInstanceCount() == null) ? 0 : getInstanceCount().hashCode());
        hashCode = prime * hashCode + ((getStartDate() == null) ? 0 : getStartDate().hashCode());
        hashCode = prime * hashCode + ((getEndDate() == null) ? 0 : getEndDate().hashCode());
        hashCode = prime * hashCode + ((getCapacityBlockDurationHours() == null) ? 0 : getCapacityBlockDurationHours().hashCode());
        hashCode = prime * hashCode + ((getUpfrontFee() == null) ? 0 : getUpfrontFee().hashCode());
        hashCode = prime * hashCode + ((getCurrencyCode() == null) ? 0 : getCurrencyCode().hashCode());
        hashCode = prime * hashCode + ((getTenancy() == null) ? 0 : getTenancy().hashCode());
        return hashCode;
    }

    @Override
    public CapacityBlockOffering clone() {
        try {
            return (CapacityBlockOffering) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
