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
package com.amazonaws.services.costexplorer.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The aggregated numbers for your reservation usage.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ce-2017-10-25/ReservationAggregates" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ReservationAggregates implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The percentage of reservation time that you used.
     * </p>
     */
    private String utilizationPercentage;
    /**
     * <p>
     * The percentage of Amazon EC2 reservation time that you used, converted to normalized units. Normalized units are
     * available only for Amazon EC2 usage after November 11, 2017.
     * </p>
     */
    private String utilizationPercentageInUnits;
    /**
     * <p>
     * How many reservation hours that you purchased.
     * </p>
     */
    private String purchasedHours;
    /**
     * <p>
     * How many Amazon EC2 reservation hours that you purchased, converted to normalized units. Normalized units are
     * available only for Amazon EC2 usage after November 11, 2017.
     * </p>
     */
    private String purchasedUnits;
    /**
     * <p>
     * The total number of reservation hours that you used.
     * </p>
     */
    private String totalActualHours;
    /**
     * <p>
     * The total number of Amazon EC2 reservation hours that you used, converted to normalized units. Normalized units
     * are available only for Amazon EC2 usage after November 11, 2017.
     * </p>
     */
    private String totalActualUnits;
    /**
     * <p>
     * The number of reservation hours that you didn't use.
     * </p>
     */
    private String unusedHours;
    /**
     * <p>
     * The number of Amazon EC2 reservation hours that you didn't use, converted to normalized units. Normalized units
     * are available only for Amazon EC2 usage after November 11, 2017.
     * </p>
     */
    private String unusedUnits;
    /**
     * <p>
     * How much your reservation would cost if charged On-Demand rates.
     * </p>
     */
    private String onDemandCostOfRIHoursUsed;
    /**
     * <p>
     * How much you saved due to purchasing and utilizing reservation. AWS calculates this by subtracting
     * <code>TotalAmortizedFee</code> from <code>OnDemandCostOfRIHoursUsed</code>.
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
     * The upfront cost of your reservation, amortized over the reservation period.
     * </p>
     */
    private String amortizedUpfrontFee;
    /**
     * <p>
     * The monthly cost of your reservation, amortized over the reservation period.
     * </p>
     */
    private String amortizedRecurringFee;
    /**
     * <p>
     * The total cost of your reservation, amortized over the reservation period.
     * </p>
     */
    private String totalAmortizedFee;

    /**
     * <p>
     * The percentage of reservation time that you used.
     * </p>
     * 
     * @param utilizationPercentage
     *        The percentage of reservation time that you used.
     */

    public void setUtilizationPercentage(String utilizationPercentage) {
        this.utilizationPercentage = utilizationPercentage;
    }

    /**
     * <p>
     * The percentage of reservation time that you used.
     * </p>
     * 
     * @return The percentage of reservation time that you used.
     */

    public String getUtilizationPercentage() {
        return this.utilizationPercentage;
    }

    /**
     * <p>
     * The percentage of reservation time that you used.
     * </p>
     * 
     * @param utilizationPercentage
     *        The percentage of reservation time that you used.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReservationAggregates withUtilizationPercentage(String utilizationPercentage) {
        setUtilizationPercentage(utilizationPercentage);
        return this;
    }

    /**
     * <p>
     * The percentage of Amazon EC2 reservation time that you used, converted to normalized units. Normalized units are
     * available only for Amazon EC2 usage after November 11, 2017.
     * </p>
     * 
     * @param utilizationPercentageInUnits
     *        The percentage of Amazon EC2 reservation time that you used, converted to normalized units. Normalized
     *        units are available only for Amazon EC2 usage after November 11, 2017.
     */

    public void setUtilizationPercentageInUnits(String utilizationPercentageInUnits) {
        this.utilizationPercentageInUnits = utilizationPercentageInUnits;
    }

    /**
     * <p>
     * The percentage of Amazon EC2 reservation time that you used, converted to normalized units. Normalized units are
     * available only for Amazon EC2 usage after November 11, 2017.
     * </p>
     * 
     * @return The percentage of Amazon EC2 reservation time that you used, converted to normalized units. Normalized
     *         units are available only for Amazon EC2 usage after November 11, 2017.
     */

    public String getUtilizationPercentageInUnits() {
        return this.utilizationPercentageInUnits;
    }

    /**
     * <p>
     * The percentage of Amazon EC2 reservation time that you used, converted to normalized units. Normalized units are
     * available only for Amazon EC2 usage after November 11, 2017.
     * </p>
     * 
     * @param utilizationPercentageInUnits
     *        The percentage of Amazon EC2 reservation time that you used, converted to normalized units. Normalized
     *        units are available only for Amazon EC2 usage after November 11, 2017.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReservationAggregates withUtilizationPercentageInUnits(String utilizationPercentageInUnits) {
        setUtilizationPercentageInUnits(utilizationPercentageInUnits);
        return this;
    }

    /**
     * <p>
     * How many reservation hours that you purchased.
     * </p>
     * 
     * @param purchasedHours
     *        How many reservation hours that you purchased.
     */

    public void setPurchasedHours(String purchasedHours) {
        this.purchasedHours = purchasedHours;
    }

    /**
     * <p>
     * How many reservation hours that you purchased.
     * </p>
     * 
     * @return How many reservation hours that you purchased.
     */

    public String getPurchasedHours() {
        return this.purchasedHours;
    }

    /**
     * <p>
     * How many reservation hours that you purchased.
     * </p>
     * 
     * @param purchasedHours
     *        How many reservation hours that you purchased.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReservationAggregates withPurchasedHours(String purchasedHours) {
        setPurchasedHours(purchasedHours);
        return this;
    }

    /**
     * <p>
     * How many Amazon EC2 reservation hours that you purchased, converted to normalized units. Normalized units are
     * available only for Amazon EC2 usage after November 11, 2017.
     * </p>
     * 
     * @param purchasedUnits
     *        How many Amazon EC2 reservation hours that you purchased, converted to normalized units. Normalized units
     *        are available only for Amazon EC2 usage after November 11, 2017.
     */

    public void setPurchasedUnits(String purchasedUnits) {
        this.purchasedUnits = purchasedUnits;
    }

    /**
     * <p>
     * How many Amazon EC2 reservation hours that you purchased, converted to normalized units. Normalized units are
     * available only for Amazon EC2 usage after November 11, 2017.
     * </p>
     * 
     * @return How many Amazon EC2 reservation hours that you purchased, converted to normalized units. Normalized units
     *         are available only for Amazon EC2 usage after November 11, 2017.
     */

    public String getPurchasedUnits() {
        return this.purchasedUnits;
    }

    /**
     * <p>
     * How many Amazon EC2 reservation hours that you purchased, converted to normalized units. Normalized units are
     * available only for Amazon EC2 usage after November 11, 2017.
     * </p>
     * 
     * @param purchasedUnits
     *        How many Amazon EC2 reservation hours that you purchased, converted to normalized units. Normalized units
     *        are available only for Amazon EC2 usage after November 11, 2017.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReservationAggregates withPurchasedUnits(String purchasedUnits) {
        setPurchasedUnits(purchasedUnits);
        return this;
    }

    /**
     * <p>
     * The total number of reservation hours that you used.
     * </p>
     * 
     * @param totalActualHours
     *        The total number of reservation hours that you used.
     */

    public void setTotalActualHours(String totalActualHours) {
        this.totalActualHours = totalActualHours;
    }

    /**
     * <p>
     * The total number of reservation hours that you used.
     * </p>
     * 
     * @return The total number of reservation hours that you used.
     */

    public String getTotalActualHours() {
        return this.totalActualHours;
    }

    /**
     * <p>
     * The total number of reservation hours that you used.
     * </p>
     * 
     * @param totalActualHours
     *        The total number of reservation hours that you used.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReservationAggregates withTotalActualHours(String totalActualHours) {
        setTotalActualHours(totalActualHours);
        return this;
    }

    /**
     * <p>
     * The total number of Amazon EC2 reservation hours that you used, converted to normalized units. Normalized units
     * are available only for Amazon EC2 usage after November 11, 2017.
     * </p>
     * 
     * @param totalActualUnits
     *        The total number of Amazon EC2 reservation hours that you used, converted to normalized units. Normalized
     *        units are available only for Amazon EC2 usage after November 11, 2017.
     */

    public void setTotalActualUnits(String totalActualUnits) {
        this.totalActualUnits = totalActualUnits;
    }

    /**
     * <p>
     * The total number of Amazon EC2 reservation hours that you used, converted to normalized units. Normalized units
     * are available only for Amazon EC2 usage after November 11, 2017.
     * </p>
     * 
     * @return The total number of Amazon EC2 reservation hours that you used, converted to normalized units. Normalized
     *         units are available only for Amazon EC2 usage after November 11, 2017.
     */

    public String getTotalActualUnits() {
        return this.totalActualUnits;
    }

    /**
     * <p>
     * The total number of Amazon EC2 reservation hours that you used, converted to normalized units. Normalized units
     * are available only for Amazon EC2 usage after November 11, 2017.
     * </p>
     * 
     * @param totalActualUnits
     *        The total number of Amazon EC2 reservation hours that you used, converted to normalized units. Normalized
     *        units are available only for Amazon EC2 usage after November 11, 2017.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReservationAggregates withTotalActualUnits(String totalActualUnits) {
        setTotalActualUnits(totalActualUnits);
        return this;
    }

    /**
     * <p>
     * The number of reservation hours that you didn't use.
     * </p>
     * 
     * @param unusedHours
     *        The number of reservation hours that you didn't use.
     */

    public void setUnusedHours(String unusedHours) {
        this.unusedHours = unusedHours;
    }

    /**
     * <p>
     * The number of reservation hours that you didn't use.
     * </p>
     * 
     * @return The number of reservation hours that you didn't use.
     */

    public String getUnusedHours() {
        return this.unusedHours;
    }

    /**
     * <p>
     * The number of reservation hours that you didn't use.
     * </p>
     * 
     * @param unusedHours
     *        The number of reservation hours that you didn't use.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReservationAggregates withUnusedHours(String unusedHours) {
        setUnusedHours(unusedHours);
        return this;
    }

    /**
     * <p>
     * The number of Amazon EC2 reservation hours that you didn't use, converted to normalized units. Normalized units
     * are available only for Amazon EC2 usage after November 11, 2017.
     * </p>
     * 
     * @param unusedUnits
     *        The number of Amazon EC2 reservation hours that you didn't use, converted to normalized units. Normalized
     *        units are available only for Amazon EC2 usage after November 11, 2017.
     */

    public void setUnusedUnits(String unusedUnits) {
        this.unusedUnits = unusedUnits;
    }

    /**
     * <p>
     * The number of Amazon EC2 reservation hours that you didn't use, converted to normalized units. Normalized units
     * are available only for Amazon EC2 usage after November 11, 2017.
     * </p>
     * 
     * @return The number of Amazon EC2 reservation hours that you didn't use, converted to normalized units. Normalized
     *         units are available only for Amazon EC2 usage after November 11, 2017.
     */

    public String getUnusedUnits() {
        return this.unusedUnits;
    }

    /**
     * <p>
     * The number of Amazon EC2 reservation hours that you didn't use, converted to normalized units. Normalized units
     * are available only for Amazon EC2 usage after November 11, 2017.
     * </p>
     * 
     * @param unusedUnits
     *        The number of Amazon EC2 reservation hours that you didn't use, converted to normalized units. Normalized
     *        units are available only for Amazon EC2 usage after November 11, 2017.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReservationAggregates withUnusedUnits(String unusedUnits) {
        setUnusedUnits(unusedUnits);
        return this;
    }

    /**
     * <p>
     * How much your reservation would cost if charged On-Demand rates.
     * </p>
     * 
     * @param onDemandCostOfRIHoursUsed
     *        How much your reservation would cost if charged On-Demand rates.
     */

    public void setOnDemandCostOfRIHoursUsed(String onDemandCostOfRIHoursUsed) {
        this.onDemandCostOfRIHoursUsed = onDemandCostOfRIHoursUsed;
    }

    /**
     * <p>
     * How much your reservation would cost if charged On-Demand rates.
     * </p>
     * 
     * @return How much your reservation would cost if charged On-Demand rates.
     */

    public String getOnDemandCostOfRIHoursUsed() {
        return this.onDemandCostOfRIHoursUsed;
    }

    /**
     * <p>
     * How much your reservation would cost if charged On-Demand rates.
     * </p>
     * 
     * @param onDemandCostOfRIHoursUsed
     *        How much your reservation would cost if charged On-Demand rates.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReservationAggregates withOnDemandCostOfRIHoursUsed(String onDemandCostOfRIHoursUsed) {
        setOnDemandCostOfRIHoursUsed(onDemandCostOfRIHoursUsed);
        return this;
    }

    /**
     * <p>
     * How much you saved due to purchasing and utilizing reservation. AWS calculates this by subtracting
     * <code>TotalAmortizedFee</code> from <code>OnDemandCostOfRIHoursUsed</code>.
     * </p>
     * 
     * @param netRISavings
     *        How much you saved due to purchasing and utilizing reservation. AWS calculates this by subtracting
     *        <code>TotalAmortizedFee</code> from <code>OnDemandCostOfRIHoursUsed</code>.
     */

    public void setNetRISavings(String netRISavings) {
        this.netRISavings = netRISavings;
    }

    /**
     * <p>
     * How much you saved due to purchasing and utilizing reservation. AWS calculates this by subtracting
     * <code>TotalAmortizedFee</code> from <code>OnDemandCostOfRIHoursUsed</code>.
     * </p>
     * 
     * @return How much you saved due to purchasing and utilizing reservation. AWS calculates this by subtracting
     *         <code>TotalAmortizedFee</code> from <code>OnDemandCostOfRIHoursUsed</code>.
     */

    public String getNetRISavings() {
        return this.netRISavings;
    }

    /**
     * <p>
     * How much you saved due to purchasing and utilizing reservation. AWS calculates this by subtracting
     * <code>TotalAmortizedFee</code> from <code>OnDemandCostOfRIHoursUsed</code>.
     * </p>
     * 
     * @param netRISavings
     *        How much you saved due to purchasing and utilizing reservation. AWS calculates this by subtracting
     *        <code>TotalAmortizedFee</code> from <code>OnDemandCostOfRIHoursUsed</code>.
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
     * The upfront cost of your reservation, amortized over the reservation period.
     * </p>
     * 
     * @param amortizedUpfrontFee
     *        The upfront cost of your reservation, amortized over the reservation period.
     */

    public void setAmortizedUpfrontFee(String amortizedUpfrontFee) {
        this.amortizedUpfrontFee = amortizedUpfrontFee;
    }

    /**
     * <p>
     * The upfront cost of your reservation, amortized over the reservation period.
     * </p>
     * 
     * @return The upfront cost of your reservation, amortized over the reservation period.
     */

    public String getAmortizedUpfrontFee() {
        return this.amortizedUpfrontFee;
    }

    /**
     * <p>
     * The upfront cost of your reservation, amortized over the reservation period.
     * </p>
     * 
     * @param amortizedUpfrontFee
     *        The upfront cost of your reservation, amortized over the reservation period.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReservationAggregates withAmortizedUpfrontFee(String amortizedUpfrontFee) {
        setAmortizedUpfrontFee(amortizedUpfrontFee);
        return this;
    }

    /**
     * <p>
     * The monthly cost of your reservation, amortized over the reservation period.
     * </p>
     * 
     * @param amortizedRecurringFee
     *        The monthly cost of your reservation, amortized over the reservation period.
     */

    public void setAmortizedRecurringFee(String amortizedRecurringFee) {
        this.amortizedRecurringFee = amortizedRecurringFee;
    }

    /**
     * <p>
     * The monthly cost of your reservation, amortized over the reservation period.
     * </p>
     * 
     * @return The monthly cost of your reservation, amortized over the reservation period.
     */

    public String getAmortizedRecurringFee() {
        return this.amortizedRecurringFee;
    }

    /**
     * <p>
     * The monthly cost of your reservation, amortized over the reservation period.
     * </p>
     * 
     * @param amortizedRecurringFee
     *        The monthly cost of your reservation, amortized over the reservation period.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReservationAggregates withAmortizedRecurringFee(String amortizedRecurringFee) {
        setAmortizedRecurringFee(amortizedRecurringFee);
        return this;
    }

    /**
     * <p>
     * The total cost of your reservation, amortized over the reservation period.
     * </p>
     * 
     * @param totalAmortizedFee
     *        The total cost of your reservation, amortized over the reservation period.
     */

    public void setTotalAmortizedFee(String totalAmortizedFee) {
        this.totalAmortizedFee = totalAmortizedFee;
    }

    /**
     * <p>
     * The total cost of your reservation, amortized over the reservation period.
     * </p>
     * 
     * @return The total cost of your reservation, amortized over the reservation period.
     */

    public String getTotalAmortizedFee() {
        return this.totalAmortizedFee;
    }

    /**
     * <p>
     * The total cost of your reservation, amortized over the reservation period.
     * </p>
     * 
     * @param totalAmortizedFee
     *        The total cost of your reservation, amortized over the reservation period.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReservationAggregates withTotalAmortizedFee(String totalAmortizedFee) {
        setTotalAmortizedFee(totalAmortizedFee);
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
        if (getUtilizationPercentage() != null)
            sb.append("UtilizationPercentage: ").append(getUtilizationPercentage()).append(",");
        if (getUtilizationPercentageInUnits() != null)
            sb.append("UtilizationPercentageInUnits: ").append(getUtilizationPercentageInUnits()).append(",");
        if (getPurchasedHours() != null)
            sb.append("PurchasedHours: ").append(getPurchasedHours()).append(",");
        if (getPurchasedUnits() != null)
            sb.append("PurchasedUnits: ").append(getPurchasedUnits()).append(",");
        if (getTotalActualHours() != null)
            sb.append("TotalActualHours: ").append(getTotalActualHours()).append(",");
        if (getTotalActualUnits() != null)
            sb.append("TotalActualUnits: ").append(getTotalActualUnits()).append(",");
        if (getUnusedHours() != null)
            sb.append("UnusedHours: ").append(getUnusedHours()).append(",");
        if (getUnusedUnits() != null)
            sb.append("UnusedUnits: ").append(getUnusedUnits()).append(",");
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
        if (other.getUtilizationPercentageInUnits() == null ^ this.getUtilizationPercentageInUnits() == null)
            return false;
        if (other.getUtilizationPercentageInUnits() != null && other.getUtilizationPercentageInUnits().equals(this.getUtilizationPercentageInUnits()) == false)
            return false;
        if (other.getPurchasedHours() == null ^ this.getPurchasedHours() == null)
            return false;
        if (other.getPurchasedHours() != null && other.getPurchasedHours().equals(this.getPurchasedHours()) == false)
            return false;
        if (other.getPurchasedUnits() == null ^ this.getPurchasedUnits() == null)
            return false;
        if (other.getPurchasedUnits() != null && other.getPurchasedUnits().equals(this.getPurchasedUnits()) == false)
            return false;
        if (other.getTotalActualHours() == null ^ this.getTotalActualHours() == null)
            return false;
        if (other.getTotalActualHours() != null && other.getTotalActualHours().equals(this.getTotalActualHours()) == false)
            return false;
        if (other.getTotalActualUnits() == null ^ this.getTotalActualUnits() == null)
            return false;
        if (other.getTotalActualUnits() != null && other.getTotalActualUnits().equals(this.getTotalActualUnits()) == false)
            return false;
        if (other.getUnusedHours() == null ^ this.getUnusedHours() == null)
            return false;
        if (other.getUnusedHours() != null && other.getUnusedHours().equals(this.getUnusedHours()) == false)
            return false;
        if (other.getUnusedUnits() == null ^ this.getUnusedUnits() == null)
            return false;
        if (other.getUnusedUnits() != null && other.getUnusedUnits().equals(this.getUnusedUnits()) == false)
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
        hashCode = prime * hashCode + ((getUtilizationPercentageInUnits() == null) ? 0 : getUtilizationPercentageInUnits().hashCode());
        hashCode = prime * hashCode + ((getPurchasedHours() == null) ? 0 : getPurchasedHours().hashCode());
        hashCode = prime * hashCode + ((getPurchasedUnits() == null) ? 0 : getPurchasedUnits().hashCode());
        hashCode = prime * hashCode + ((getTotalActualHours() == null) ? 0 : getTotalActualHours().hashCode());
        hashCode = prime * hashCode + ((getTotalActualUnits() == null) ? 0 : getTotalActualUnits().hashCode());
        hashCode = prime * hashCode + ((getUnusedHours() == null) ? 0 : getUnusedHours().hashCode());
        hashCode = prime * hashCode + ((getUnusedUnits() == null) ? 0 : getUnusedUnits().hashCode());
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
