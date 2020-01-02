/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.costexplorer.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Context about the current instance.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ce-2017-10-25/CurrentInstance" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CurrentInstance implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Resource ID of the current instance.
     * </p>
     */
    private String resourceId;
    /**
     * <p>
     * Cost allocation resource tags applied to the instance.
     * </p>
     */
    private java.util.List<TagValues> tags;
    /**
     * <p>
     * Details about the resource and utilization.
     * </p>
     */
    private ResourceDetails resourceDetails;
    /**
     * <p>
     * Utilization information of the current instance during the lookback period.
     * </p>
     */
    private ResourceUtilization resourceUtilization;
    /**
     * <p>
     * Number of hours during the lookback period covered by reservations.
     * </p>
     */
    private String reservationCoveredHoursInLookbackPeriod;
    /**
     * <p>
     * Number of hours during the lookback period covered by Savings Plans.
     * </p>
     */
    private String savingsPlansCoveredHoursInLookbackPeriod;
    /**
     * <p>
     * Number of hours during the lookback period billed at On Demand rates.
     * </p>
     */
    private String onDemandHoursInLookbackPeriod;
    /**
     * <p>
     * The total number of hours the instance ran during the lookback period.
     * </p>
     */
    private String totalRunningHoursInLookbackPeriod;
    /**
     * <p>
     * Current On Demand cost of operating this instance on a monthly basis.
     * </p>
     */
    private String monthlyCost;
    /**
     * <p>
     * The currency code that Amazon Web Services used to calculate the costs for this instance.
     * </p>
     */
    private String currencyCode;

    /**
     * <p>
     * Resource ID of the current instance.
     * </p>
     * 
     * @param resourceId
     *        Resource ID of the current instance.
     */

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    /**
     * <p>
     * Resource ID of the current instance.
     * </p>
     * 
     * @return Resource ID of the current instance.
     */

    public String getResourceId() {
        return this.resourceId;
    }

    /**
     * <p>
     * Resource ID of the current instance.
     * </p>
     * 
     * @param resourceId
     *        Resource ID of the current instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CurrentInstance withResourceId(String resourceId) {
        setResourceId(resourceId);
        return this;
    }

    /**
     * <p>
     * Cost allocation resource tags applied to the instance.
     * </p>
     * 
     * @return Cost allocation resource tags applied to the instance.
     */

    public java.util.List<TagValues> getTags() {
        return tags;
    }

    /**
     * <p>
     * Cost allocation resource tags applied to the instance.
     * </p>
     * 
     * @param tags
     *        Cost allocation resource tags applied to the instance.
     */

    public void setTags(java.util.Collection<TagValues> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<TagValues>(tags);
    }

    /**
     * <p>
     * Cost allocation resource tags applied to the instance.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        Cost allocation resource tags applied to the instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CurrentInstance withTags(TagValues... tags) {
        if (this.tags == null) {
            setTags(new java.util.ArrayList<TagValues>(tags.length));
        }
        for (TagValues ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Cost allocation resource tags applied to the instance.
     * </p>
     * 
     * @param tags
     *        Cost allocation resource tags applied to the instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CurrentInstance withTags(java.util.Collection<TagValues> tags) {
        setTags(tags);
        return this;
    }

    /**
     * <p>
     * Details about the resource and utilization.
     * </p>
     * 
     * @param resourceDetails
     *        Details about the resource and utilization.
     */

    public void setResourceDetails(ResourceDetails resourceDetails) {
        this.resourceDetails = resourceDetails;
    }

    /**
     * <p>
     * Details about the resource and utilization.
     * </p>
     * 
     * @return Details about the resource and utilization.
     */

    public ResourceDetails getResourceDetails() {
        return this.resourceDetails;
    }

    /**
     * <p>
     * Details about the resource and utilization.
     * </p>
     * 
     * @param resourceDetails
     *        Details about the resource and utilization.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CurrentInstance withResourceDetails(ResourceDetails resourceDetails) {
        setResourceDetails(resourceDetails);
        return this;
    }

    /**
     * <p>
     * Utilization information of the current instance during the lookback period.
     * </p>
     * 
     * @param resourceUtilization
     *        Utilization information of the current instance during the lookback period.
     */

    public void setResourceUtilization(ResourceUtilization resourceUtilization) {
        this.resourceUtilization = resourceUtilization;
    }

    /**
     * <p>
     * Utilization information of the current instance during the lookback period.
     * </p>
     * 
     * @return Utilization information of the current instance during the lookback period.
     */

    public ResourceUtilization getResourceUtilization() {
        return this.resourceUtilization;
    }

    /**
     * <p>
     * Utilization information of the current instance during the lookback period.
     * </p>
     * 
     * @param resourceUtilization
     *        Utilization information of the current instance during the lookback period.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CurrentInstance withResourceUtilization(ResourceUtilization resourceUtilization) {
        setResourceUtilization(resourceUtilization);
        return this;
    }

    /**
     * <p>
     * Number of hours during the lookback period covered by reservations.
     * </p>
     * 
     * @param reservationCoveredHoursInLookbackPeriod
     *        Number of hours during the lookback period covered by reservations.
     */

    public void setReservationCoveredHoursInLookbackPeriod(String reservationCoveredHoursInLookbackPeriod) {
        this.reservationCoveredHoursInLookbackPeriod = reservationCoveredHoursInLookbackPeriod;
    }

    /**
     * <p>
     * Number of hours during the lookback period covered by reservations.
     * </p>
     * 
     * @return Number of hours during the lookback period covered by reservations.
     */

    public String getReservationCoveredHoursInLookbackPeriod() {
        return this.reservationCoveredHoursInLookbackPeriod;
    }

    /**
     * <p>
     * Number of hours during the lookback period covered by reservations.
     * </p>
     * 
     * @param reservationCoveredHoursInLookbackPeriod
     *        Number of hours during the lookback period covered by reservations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CurrentInstance withReservationCoveredHoursInLookbackPeriod(String reservationCoveredHoursInLookbackPeriod) {
        setReservationCoveredHoursInLookbackPeriod(reservationCoveredHoursInLookbackPeriod);
        return this;
    }

    /**
     * <p>
     * Number of hours during the lookback period covered by Savings Plans.
     * </p>
     * 
     * @param savingsPlansCoveredHoursInLookbackPeriod
     *        Number of hours during the lookback period covered by Savings Plans.
     */

    public void setSavingsPlansCoveredHoursInLookbackPeriod(String savingsPlansCoveredHoursInLookbackPeriod) {
        this.savingsPlansCoveredHoursInLookbackPeriod = savingsPlansCoveredHoursInLookbackPeriod;
    }

    /**
     * <p>
     * Number of hours during the lookback period covered by Savings Plans.
     * </p>
     * 
     * @return Number of hours during the lookback period covered by Savings Plans.
     */

    public String getSavingsPlansCoveredHoursInLookbackPeriod() {
        return this.savingsPlansCoveredHoursInLookbackPeriod;
    }

    /**
     * <p>
     * Number of hours during the lookback period covered by Savings Plans.
     * </p>
     * 
     * @param savingsPlansCoveredHoursInLookbackPeriod
     *        Number of hours during the lookback period covered by Savings Plans.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CurrentInstance withSavingsPlansCoveredHoursInLookbackPeriod(String savingsPlansCoveredHoursInLookbackPeriod) {
        setSavingsPlansCoveredHoursInLookbackPeriod(savingsPlansCoveredHoursInLookbackPeriod);
        return this;
    }

    /**
     * <p>
     * Number of hours during the lookback period billed at On Demand rates.
     * </p>
     * 
     * @param onDemandHoursInLookbackPeriod
     *        Number of hours during the lookback period billed at On Demand rates.
     */

    public void setOnDemandHoursInLookbackPeriod(String onDemandHoursInLookbackPeriod) {
        this.onDemandHoursInLookbackPeriod = onDemandHoursInLookbackPeriod;
    }

    /**
     * <p>
     * Number of hours during the lookback period billed at On Demand rates.
     * </p>
     * 
     * @return Number of hours during the lookback period billed at On Demand rates.
     */

    public String getOnDemandHoursInLookbackPeriod() {
        return this.onDemandHoursInLookbackPeriod;
    }

    /**
     * <p>
     * Number of hours during the lookback period billed at On Demand rates.
     * </p>
     * 
     * @param onDemandHoursInLookbackPeriod
     *        Number of hours during the lookback period billed at On Demand rates.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CurrentInstance withOnDemandHoursInLookbackPeriod(String onDemandHoursInLookbackPeriod) {
        setOnDemandHoursInLookbackPeriod(onDemandHoursInLookbackPeriod);
        return this;
    }

    /**
     * <p>
     * The total number of hours the instance ran during the lookback period.
     * </p>
     * 
     * @param totalRunningHoursInLookbackPeriod
     *        The total number of hours the instance ran during the lookback period.
     */

    public void setTotalRunningHoursInLookbackPeriod(String totalRunningHoursInLookbackPeriod) {
        this.totalRunningHoursInLookbackPeriod = totalRunningHoursInLookbackPeriod;
    }

    /**
     * <p>
     * The total number of hours the instance ran during the lookback period.
     * </p>
     * 
     * @return The total number of hours the instance ran during the lookback period.
     */

    public String getTotalRunningHoursInLookbackPeriod() {
        return this.totalRunningHoursInLookbackPeriod;
    }

    /**
     * <p>
     * The total number of hours the instance ran during the lookback period.
     * </p>
     * 
     * @param totalRunningHoursInLookbackPeriod
     *        The total number of hours the instance ran during the lookback period.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CurrentInstance withTotalRunningHoursInLookbackPeriod(String totalRunningHoursInLookbackPeriod) {
        setTotalRunningHoursInLookbackPeriod(totalRunningHoursInLookbackPeriod);
        return this;
    }

    /**
     * <p>
     * Current On Demand cost of operating this instance on a monthly basis.
     * </p>
     * 
     * @param monthlyCost
     *        Current On Demand cost of operating this instance on a monthly basis.
     */

    public void setMonthlyCost(String monthlyCost) {
        this.monthlyCost = monthlyCost;
    }

    /**
     * <p>
     * Current On Demand cost of operating this instance on a monthly basis.
     * </p>
     * 
     * @return Current On Demand cost of operating this instance on a monthly basis.
     */

    public String getMonthlyCost() {
        return this.monthlyCost;
    }

    /**
     * <p>
     * Current On Demand cost of operating this instance on a monthly basis.
     * </p>
     * 
     * @param monthlyCost
     *        Current On Demand cost of operating this instance on a monthly basis.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CurrentInstance withMonthlyCost(String monthlyCost) {
        setMonthlyCost(monthlyCost);
        return this;
    }

    /**
     * <p>
     * The currency code that Amazon Web Services used to calculate the costs for this instance.
     * </p>
     * 
     * @param currencyCode
     *        The currency code that Amazon Web Services used to calculate the costs for this instance.
     */

    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    /**
     * <p>
     * The currency code that Amazon Web Services used to calculate the costs for this instance.
     * </p>
     * 
     * @return The currency code that Amazon Web Services used to calculate the costs for this instance.
     */

    public String getCurrencyCode() {
        return this.currencyCode;
    }

    /**
     * <p>
     * The currency code that Amazon Web Services used to calculate the costs for this instance.
     * </p>
     * 
     * @param currencyCode
     *        The currency code that Amazon Web Services used to calculate the costs for this instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CurrentInstance withCurrencyCode(String currencyCode) {
        setCurrencyCode(currencyCode);
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
        if (getResourceId() != null)
            sb.append("ResourceId: ").append(getResourceId()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
        if (getResourceDetails() != null)
            sb.append("ResourceDetails: ").append(getResourceDetails()).append(",");
        if (getResourceUtilization() != null)
            sb.append("ResourceUtilization: ").append(getResourceUtilization()).append(",");
        if (getReservationCoveredHoursInLookbackPeriod() != null)
            sb.append("ReservationCoveredHoursInLookbackPeriod: ").append(getReservationCoveredHoursInLookbackPeriod()).append(",");
        if (getSavingsPlansCoveredHoursInLookbackPeriod() != null)
            sb.append("SavingsPlansCoveredHoursInLookbackPeriod: ").append(getSavingsPlansCoveredHoursInLookbackPeriod()).append(",");
        if (getOnDemandHoursInLookbackPeriod() != null)
            sb.append("OnDemandHoursInLookbackPeriod: ").append(getOnDemandHoursInLookbackPeriod()).append(",");
        if (getTotalRunningHoursInLookbackPeriod() != null)
            sb.append("TotalRunningHoursInLookbackPeriod: ").append(getTotalRunningHoursInLookbackPeriod()).append(",");
        if (getMonthlyCost() != null)
            sb.append("MonthlyCost: ").append(getMonthlyCost()).append(",");
        if (getCurrencyCode() != null)
            sb.append("CurrencyCode: ").append(getCurrencyCode());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CurrentInstance == false)
            return false;
        CurrentInstance other = (CurrentInstance) obj;
        if (other.getResourceId() == null ^ this.getResourceId() == null)
            return false;
        if (other.getResourceId() != null && other.getResourceId().equals(this.getResourceId()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getResourceDetails() == null ^ this.getResourceDetails() == null)
            return false;
        if (other.getResourceDetails() != null && other.getResourceDetails().equals(this.getResourceDetails()) == false)
            return false;
        if (other.getResourceUtilization() == null ^ this.getResourceUtilization() == null)
            return false;
        if (other.getResourceUtilization() != null && other.getResourceUtilization().equals(this.getResourceUtilization()) == false)
            return false;
        if (other.getReservationCoveredHoursInLookbackPeriod() == null ^ this.getReservationCoveredHoursInLookbackPeriod() == null)
            return false;
        if (other.getReservationCoveredHoursInLookbackPeriod() != null
                && other.getReservationCoveredHoursInLookbackPeriod().equals(this.getReservationCoveredHoursInLookbackPeriod()) == false)
            return false;
        if (other.getSavingsPlansCoveredHoursInLookbackPeriod() == null ^ this.getSavingsPlansCoveredHoursInLookbackPeriod() == null)
            return false;
        if (other.getSavingsPlansCoveredHoursInLookbackPeriod() != null
                && other.getSavingsPlansCoveredHoursInLookbackPeriod().equals(this.getSavingsPlansCoveredHoursInLookbackPeriod()) == false)
            return false;
        if (other.getOnDemandHoursInLookbackPeriod() == null ^ this.getOnDemandHoursInLookbackPeriod() == null)
            return false;
        if (other.getOnDemandHoursInLookbackPeriod() != null
                && other.getOnDemandHoursInLookbackPeriod().equals(this.getOnDemandHoursInLookbackPeriod()) == false)
            return false;
        if (other.getTotalRunningHoursInLookbackPeriod() == null ^ this.getTotalRunningHoursInLookbackPeriod() == null)
            return false;
        if (other.getTotalRunningHoursInLookbackPeriod() != null
                && other.getTotalRunningHoursInLookbackPeriod().equals(this.getTotalRunningHoursInLookbackPeriod()) == false)
            return false;
        if (other.getMonthlyCost() == null ^ this.getMonthlyCost() == null)
            return false;
        if (other.getMonthlyCost() != null && other.getMonthlyCost().equals(this.getMonthlyCost()) == false)
            return false;
        if (other.getCurrencyCode() == null ^ this.getCurrencyCode() == null)
            return false;
        if (other.getCurrencyCode() != null && other.getCurrencyCode().equals(this.getCurrencyCode()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getResourceId() == null) ? 0 : getResourceId().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getResourceDetails() == null) ? 0 : getResourceDetails().hashCode());
        hashCode = prime * hashCode + ((getResourceUtilization() == null) ? 0 : getResourceUtilization().hashCode());
        hashCode = prime * hashCode + ((getReservationCoveredHoursInLookbackPeriod() == null) ? 0 : getReservationCoveredHoursInLookbackPeriod().hashCode());
        hashCode = prime * hashCode + ((getSavingsPlansCoveredHoursInLookbackPeriod() == null) ? 0 : getSavingsPlansCoveredHoursInLookbackPeriod().hashCode());
        hashCode = prime * hashCode + ((getOnDemandHoursInLookbackPeriod() == null) ? 0 : getOnDemandHoursInLookbackPeriod().hashCode());
        hashCode = prime * hashCode + ((getTotalRunningHoursInLookbackPeriod() == null) ? 0 : getTotalRunningHoursInLookbackPeriod().hashCode());
        hashCode = prime * hashCode + ((getMonthlyCost() == null) ? 0 : getMonthlyCost().hashCode());
        hashCode = prime * hashCode + ((getCurrencyCode() == null) ? 0 : getCurrencyCode().hashCode());
        return hashCode;
    }

    @Override
    public CurrentInstance clone() {
        try {
            return (CurrentInstance) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.costexplorer.model.transform.CurrentInstanceMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
