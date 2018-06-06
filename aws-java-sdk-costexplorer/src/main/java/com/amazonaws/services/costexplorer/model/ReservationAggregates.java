/*
 * Copyright 2013-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * The aggregated numbers for your RI usage.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ce-2017-10-25/ReservationAggregates" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ReservationAggregates implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The percentage of RI time that you used.
     * </p>
     */
    private String utilizationPercentage;
    /**
     * <p>
     * How many RI hours that you purchased.
     * </p>
     */
    private String purchasedHours;
    /**
     * <p>
     * The total number of RI hours that you used.
     * </p>
     */
    private String totalActualHours;
    /**
     * <p>
     * The number of RI hours that you didn't use.
     * </p>
     */
    private String unusedHours;
    /**
     * <p>
     * How much your RIs would cost if charged On-Demand rates.
     * </p>
     */
    private String onDemandCostOfRIHoursUsed;
    /**
     * <p>
     * How much you saved due to purchasing and utilizing RIs. This is calculated by subtracting the
     * <code>TotalAmortizedFee</code> from the <code>OnDemandCostOfRIHoursUsed</code>.
     * </p>
     */
    private String netRISavings;
    /**
     * <p>
     * How much you could save if you use your entire reservation.
     * </p>
     */
    private String totalPotentialRISavings;
    /**
     * <p>
     * The upfront cost of your RI, amortized over the RI period.
     * </p>
     */
    private String amortizedUpfrontFee;
    /**
     * <p>
     * The monthly cost of your RI, amortized over the RI period.
     * </p>
     */
    private String amortizedRecurringFee;
    /**
     * <p>
     * The total cost of your RI, amortized over the RI period.
     * </p>
     */
    private String totalAmortizedFee;

    /**
     * <p>
     * The percentage of RI time that you used.
     * </p>
     * 
     * @param utilizationPercentage
     *        The percentage of RI time that you used.
     */

    public void setUtilizationPercentage(String utilizationPercentage) {
        this.utilizationPercentage = utilizationPercentage;
    }

    /**
     * <p>
     * The percentage of RI time that you used.
     * </p>
     * 
     * @return The percentage of RI time that you used.
     */

    public String getUtilizationPercentage() {
        return this.utilizationPercentage;
    }

    /**
     * <p>
     * The percentage of RI time that you used.
     * </p>
     * 
     * @param utilizationPercentage
     *        The percentage of RI time that you used.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReservationAggregates withUtilizationPercentage(String utilizationPercentage) {
        setUtilizationPercentage(utilizationPercentage);
        return this;
    }

    /**
     * <p>
     * How many RI hours that you purchased.
     * </p>
     * 
     * @param purchasedHours
     *        How many RI hours that you purchased.
     */

    public void setPurchasedHours(String purchasedHours) {
        this.purchasedHours = purchasedHours;
    }

    /**
     * <p>
     * How many RI hours that you purchased.
     * </p>
     * 
     * @return How many RI hours that you purchased.
     */

    public String getPurchasedHours() {
        return this.purchasedHours;
    }

    /**
     * <p>
     * How many RI hours that you purchased.
     * </p>
     * 
     * @param purchasedHours
     *        How many RI hours that you purchased.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReservationAggregates withPurchasedHours(String purchasedHours) {
        setPurchasedHours(purchasedHours);
        return this;
    }

    /**
     * <p>
     * The total number of RI hours that you used.
     * </p>
     * 
     * @param totalActualHours
     *        The total number of RI hours that you used.
     */

    public void setTotalActualHours(String totalActualHours) {
        this.totalActualHours = totalActualHours;
    }

    /**
     * <p>
     * The total number of RI hours that you used.
     * </p>
     * 
     * @return The total number of RI hours that you used.
     */

    public String getTotalActualHours() {
        return this.totalActualHours;
    }

    /**
     * <p>
     * The total number of RI hours that you used.
     * </p>
     * 
     * @param totalActualHours
     *        The total number of RI hours that you used.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReservationAggregates withTotalActualHours(String totalActualHours) {
        setTotalActualHours(totalActualHours);
        return this;
    }

    /**
     * <p>
     * The number of RI hours that you didn't use.
     * </p>
     * 
     * @param unusedHours
     *        The number of RI hours that you didn't use.
     */

    public void setUnusedHours(String unusedHours) {
        this.unusedHours = unusedHours;
    }

    /**
     * <p>
     * The number of RI hours that you didn't use.
     * </p>
     * 
     * @return The number of RI hours that you didn't use.
     */

    public String getUnusedHours() {
        return this.unusedHours;
    }

    /**
     * <p>
     * The number of RI hours that you didn't use.
     * </p>
     * 
     * @param unusedHours
     *        The number of RI hours that you didn't use.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReservationAggregates withUnusedHours(String unusedHours) {
        setUnusedHours(unusedHours);
        return this;
    }

    /**
     * <p>
     * How much your RIs would cost if charged On-Demand rates.
     * </p>
     * 
     * @param onDemandCostOfRIHoursUsed
     *        How much your RIs would cost if charged On-Demand rates.
     */

    public void setOnDemandCostOfRIHoursUsed(String onDemandCostOfRIHoursUsed) {
        this.onDemandCostOfRIHoursUsed = onDemandCostOfRIHoursUsed;
    }

    /**
     * <p>
     * How much your RIs would cost if charged On-Demand rates.
     * </p>
     * 
     * @return How much your RIs would cost if charged On-Demand rates.
     */

    public String getOnDemandCostOfRIHoursUsed() {
        return this.onDemandCostOfRIHoursUsed;
    }

    /**
     * <p>
     * How much your RIs would cost if charged On-Demand rates.
     * </p>
     * 
     * @param onDemandCostOfRIHoursUsed
     *        How much your RIs would cost if charged On-Demand rates.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReservationAggregates withOnDemandCostOfRIHoursUsed(String onDemandCostOfRIHoursUsed) {
        setOnDemandCostOfRIHoursUsed(onDemandCostOfRIHoursUsed);
        return this;
    }

    /**
     * <p>
     * How much you saved due to purchasing and utilizing RIs. This is calculated by subtracting the
     * <code>TotalAmortizedFee</code> from the <code>OnDemandCostOfRIHoursUsed</code>.
     * </p>
     * 
     * @param netRISavings
     *        How much you saved due to purchasing and utilizing RIs. This is calculated by subtracting the
     *        <code>TotalAmortizedFee</code> from the <code>OnDemandCostOfRIHoursUsed</code>.
     */

    public void setNetRISavings(String netRISavings) {
        this.netRISavings = netRISavings;
    }

    /**
     * <p>
     * How much you saved due to purchasing and utilizing RIs. This is calculated by subtracting the
     * <code>TotalAmortizedFee</code> from the <code>OnDemandCostOfRIHoursUsed</code>.
     * </p>
     * 
     * @return How much you saved due to purchasing and utilizing RIs. This is calculated by subtracting the
     *         <code>TotalAmortizedFee</code> from the <code>OnDemandCostOfRIHoursUsed</code>.
     */

    public String getNetRISavings() {
        return this.netRISavings;
    }

    /**
     * <p>
     * How much you saved due to purchasing and utilizing RIs. This is calculated by subtracting the
     * <code>TotalAmortizedFee</code> from the <code>OnDemandCostOfRIHoursUsed</code>.
     * </p>
     * 
     * @param netRISavings
     *        How much you saved due to purchasing and utilizing RIs. This is calculated by subtracting the
     *        <code>TotalAmortizedFee</code> from the <code>OnDemandCostOfRIHoursUsed</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReservationAggregates withNetRISavings(String netRISavings) {
        setNetRISavings(netRISavings);
        return this;
    }

    /**
     * <p>
     * How much you could save if you use your entire reservation.
     * </p>
     * 
     * @param totalPotentialRISavings
     *        How much you could save if you use your entire reservation.
     */

    public void setTotalPotentialRISavings(String totalPotentialRISavings) {
        this.totalPotentialRISavings = totalPotentialRISavings;
    }

    /**
     * <p>
     * How much you could save if you use your entire reservation.
     * </p>
     * 
     * @return How much you could save if you use your entire reservation.
     */

    public String getTotalPotentialRISavings() {
        return this.totalPotentialRISavings;
    }

    /**
     * <p>
     * How much you could save if you use your entire reservation.
     * </p>
     * 
     * @param totalPotentialRISavings
     *        How much you could save if you use your entire reservation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReservationAggregates withTotalPotentialRISavings(String totalPotentialRISavings) {
        setTotalPotentialRISavings(totalPotentialRISavings);
        return this;
    }

    /**
     * <p>
     * The upfront cost of your RI, amortized over the RI period.
     * </p>
     * 
     * @param amortizedUpfrontFee
     *        The upfront cost of your RI, amortized over the RI period.
     */

    public void setAmortizedUpfrontFee(String amortizedUpfrontFee) {
        this.amortizedUpfrontFee = amortizedUpfrontFee;
    }

    /**
     * <p>
     * The upfront cost of your RI, amortized over the RI period.
     * </p>
     * 
     * @return The upfront cost of your RI, amortized over the RI period.
     */

    public String getAmortizedUpfrontFee() {
        return this.amortizedUpfrontFee;
    }

    /**
     * <p>
     * The upfront cost of your RI, amortized over the RI period.
     * </p>
     * 
     * @param amortizedUpfrontFee
     *        The upfront cost of your RI, amortized over the RI period.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReservationAggregates withAmortizedUpfrontFee(String amortizedUpfrontFee) {
        setAmortizedUpfrontFee(amortizedUpfrontFee);
        return this;
    }

    /**
     * <p>
     * The monthly cost of your RI, amortized over the RI period.
     * </p>
     * 
     * @param amortizedRecurringFee
     *        The monthly cost of your RI, amortized over the RI period.
     */

    public void setAmortizedRecurringFee(String amortizedRecurringFee) {
        this.amortizedRecurringFee = amortizedRecurringFee;
    }

    /**
     * <p>
     * The monthly cost of your RI, amortized over the RI period.
     * </p>
     * 
     * @return The monthly cost of your RI, amortized over the RI period.
     */

    public String getAmortizedRecurringFee() {
        return this.amortizedRecurringFee;
    }

    /**
     * <p>
     * The monthly cost of your RI, amortized over the RI period.
     * </p>
     * 
     * @param amortizedRecurringFee
     *        The monthly cost of your RI, amortized over the RI period.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReservationAggregates withAmortizedRecurringFee(String amortizedRecurringFee) {
        setAmortizedRecurringFee(amortizedRecurringFee);
        return this;
    }

    /**
     * <p>
     * The total cost of your RI, amortized over the RI period.
     * </p>
     * 
     * @param totalAmortizedFee
     *        The total cost of your RI, amortized over the RI period.
     */

    public void setTotalAmortizedFee(String totalAmortizedFee) {
        this.totalAmortizedFee = totalAmortizedFee;
    }

    /**
     * <p>
     * The total cost of your RI, amortized over the RI period.
     * </p>
     * 
     * @return The total cost of your RI, amortized over the RI period.
     */

    public String getTotalAmortizedFee() {
        return this.totalAmortizedFee;
    }

    /**
     * <p>
     * The total cost of your RI, amortized over the RI period.
     * </p>
     * 
     * @param totalAmortizedFee
     *        The total cost of your RI, amortized over the RI period.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReservationAggregates withTotalAmortizedFee(String totalAmortizedFee) {
        setTotalAmortizedFee(totalAmortizedFee);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getUtilizationPercentage() != null)
            sb.append("UtilizationPercentage: ").append(getUtilizationPercentage()).append(",");
        if (getPurchasedHours() != null)
            sb.append("PurchasedHours: ").append(getPurchasedHours()).append(",");
        if (getTotalActualHours() != null)
            sb.append("TotalActualHours: ").append(getTotalActualHours()).append(",");
        if (getUnusedHours() != null)
            sb.append("UnusedHours: ").append(getUnusedHours()).append(",");
        if (getOnDemandCostOfRIHoursUsed() != null)
            sb.append("OnDemandCostOfRIHoursUsed: ").append(getOnDemandCostOfRIHoursUsed()).append(",");
        if (getNetRISavings() != null)
            sb.append("NetRISavings: ").append(getNetRISavings()).append(",");
        if (getTotalPotentialRISavings() != null)
            sb.append("TotalPotentialRISavings: ").append(getTotalPotentialRISavings()).append(",");
        if (getAmortizedUpfrontFee() != null)
            sb.append("AmortizedUpfrontFee: ").append(getAmortizedUpfrontFee()).append(",");
        if (getAmortizedRecurringFee() != null)
            sb.append("AmortizedRecurringFee: ").append(getAmortizedRecurringFee()).append(",");
        if (getTotalAmortizedFee() != null)
            sb.append("TotalAmortizedFee: ").append(getTotalAmortizedFee());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ReservationAggregates == false)
            return false;
        ReservationAggregates other = (ReservationAggregates) obj;
        if (other.getUtilizationPercentage() == null ^ this.getUtilizationPercentage() == null)
            return false;
        if (other.getUtilizationPercentage() != null && other.getUtilizationPercentage().equals(this.getUtilizationPercentage()) == false)
            return false;
        if (other.getPurchasedHours() == null ^ this.getPurchasedHours() == null)
            return false;
        if (other.getPurchasedHours() != null && other.getPurchasedHours().equals(this.getPurchasedHours()) == false)
            return false;
        if (other.getTotalActualHours() == null ^ this.getTotalActualHours() == null)
            return false;
        if (other.getTotalActualHours() != null && other.getTotalActualHours().equals(this.getTotalActualHours()) == false)
            return false;
        if (other.getUnusedHours() == null ^ this.getUnusedHours() == null)
            return false;
        if (other.getUnusedHours() != null && other.getUnusedHours().equals(this.getUnusedHours()) == false)
            return false;
        if (other.getOnDemandCostOfRIHoursUsed() == null ^ this.getOnDemandCostOfRIHoursUsed() == null)
            return false;
        if (other.getOnDemandCostOfRIHoursUsed() != null && other.getOnDemandCostOfRIHoursUsed().equals(this.getOnDemandCostOfRIHoursUsed()) == false)
            return false;
        if (other.getNetRISavings() == null ^ this.getNetRISavings() == null)
            return false;
        if (other.getNetRISavings() != null && other.getNetRISavings().equals(this.getNetRISavings()) == false)
            return false;
        if (other.getTotalPotentialRISavings() == null ^ this.getTotalPotentialRISavings() == null)
            return false;
        if (other.getTotalPotentialRISavings() != null && other.getTotalPotentialRISavings().equals(this.getTotalPotentialRISavings()) == false)
            return false;
        if (other.getAmortizedUpfrontFee() == null ^ this.getAmortizedUpfrontFee() == null)
            return false;
        if (other.getAmortizedUpfrontFee() != null && other.getAmortizedUpfrontFee().equals(this.getAmortizedUpfrontFee()) == false)
            return false;
        if (other.getAmortizedRecurringFee() == null ^ this.getAmortizedRecurringFee() == null)
            return false;
        if (other.getAmortizedRecurringFee() != null && other.getAmortizedRecurringFee().equals(this.getAmortizedRecurringFee()) == false)
            return false;
        if (other.getTotalAmortizedFee() == null ^ this.getTotalAmortizedFee() == null)
            return false;
        if (other.getTotalAmortizedFee() != null && other.getTotalAmortizedFee().equals(this.getTotalAmortizedFee()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getUtilizationPercentage() == null) ? 0 : getUtilizationPercentage().hashCode());
        hashCode = prime * hashCode + ((getPurchasedHours() == null) ? 0 : getPurchasedHours().hashCode());
        hashCode = prime * hashCode + ((getTotalActualHours() == null) ? 0 : getTotalActualHours().hashCode());
        hashCode = prime * hashCode + ((getUnusedHours() == null) ? 0 : getUnusedHours().hashCode());
        hashCode = prime * hashCode + ((getOnDemandCostOfRIHoursUsed() == null) ? 0 : getOnDemandCostOfRIHoursUsed().hashCode());
        hashCode = prime * hashCode + ((getNetRISavings() == null) ? 0 : getNetRISavings().hashCode());
        hashCode = prime * hashCode + ((getTotalPotentialRISavings() == null) ? 0 : getTotalPotentialRISavings().hashCode());
        hashCode = prime * hashCode + ((getAmortizedUpfrontFee() == null) ? 0 : getAmortizedUpfrontFee().hashCode());
        hashCode = prime * hashCode + ((getAmortizedRecurringFee() == null) ? 0 : getAmortizedRecurringFee().hashCode());
        hashCode = prime * hashCode + ((getTotalAmortizedFee() == null) ? 0 : getTotalAmortizedFee().hashCode());
        return hashCode;
    }

    @Override
    public ReservationAggregates clone() {
        try {
            return (ReservationAggregates) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.costexplorer.model.transform.ReservationAggregatesMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
