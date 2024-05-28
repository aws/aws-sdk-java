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
package com.amazonaws.services.lightsail.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An estimate that's associated with a time period.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/EstimateByTime" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EstimateByTime implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The amount of cost or usage that's measured for the cost estimate.
     * </p>
     */
    private Double usageCost;
    /**
     * <p>
     * The unit of measurement that's used for the cost estimate.
     * </p>
     */
    private String pricingUnit;
    /**
     * <p>
     * The number of pricing units used to calculate the total number of hours. For example, 1 unit equals 1 hour.
     * </p>
     */
    private Double unit;
    /**
     * <p>
     * The currency of the estimate in USD.
     * </p>
     */
    private String currency;
    /**
     * <p>
     * The period of time, in days, that an estimate covers. The period has a start date and an end date. The start date
     * must come before the end date.
     * </p>
     */
    private TimePeriod timePeriod;

    /**
     * <p>
     * The amount of cost or usage that's measured for the cost estimate.
     * </p>
     * 
     * @param usageCost
     *        The amount of cost or usage that's measured for the cost estimate.
     */

    public void setUsageCost(Double usageCost) {
        this.usageCost = usageCost;
    }

    /**
     * <p>
     * The amount of cost or usage that's measured for the cost estimate.
     * </p>
     * 
     * @return The amount of cost or usage that's measured for the cost estimate.
     */

    public Double getUsageCost() {
        return this.usageCost;
    }

    /**
     * <p>
     * The amount of cost or usage that's measured for the cost estimate.
     * </p>
     * 
     * @param usageCost
     *        The amount of cost or usage that's measured for the cost estimate.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EstimateByTime withUsageCost(Double usageCost) {
        setUsageCost(usageCost);
        return this;
    }

    /**
     * <p>
     * The unit of measurement that's used for the cost estimate.
     * </p>
     * 
     * @param pricingUnit
     *        The unit of measurement that's used for the cost estimate.
     * @see PricingUnit
     */

    public void setPricingUnit(String pricingUnit) {
        this.pricingUnit = pricingUnit;
    }

    /**
     * <p>
     * The unit of measurement that's used for the cost estimate.
     * </p>
     * 
     * @return The unit of measurement that's used for the cost estimate.
     * @see PricingUnit
     */

    public String getPricingUnit() {
        return this.pricingUnit;
    }

    /**
     * <p>
     * The unit of measurement that's used for the cost estimate.
     * </p>
     * 
     * @param pricingUnit
     *        The unit of measurement that's used for the cost estimate.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PricingUnit
     */

    public EstimateByTime withPricingUnit(String pricingUnit) {
        setPricingUnit(pricingUnit);
        return this;
    }

    /**
     * <p>
     * The unit of measurement that's used for the cost estimate.
     * </p>
     * 
     * @param pricingUnit
     *        The unit of measurement that's used for the cost estimate.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PricingUnit
     */

    public EstimateByTime withPricingUnit(PricingUnit pricingUnit) {
        this.pricingUnit = pricingUnit.toString();
        return this;
    }

    /**
     * <p>
     * The number of pricing units used to calculate the total number of hours. For example, 1 unit equals 1 hour.
     * </p>
     * 
     * @param unit
     *        The number of pricing units used to calculate the total number of hours. For example, 1 unit equals 1
     *        hour.
     */

    public void setUnit(Double unit) {
        this.unit = unit;
    }

    /**
     * <p>
     * The number of pricing units used to calculate the total number of hours. For example, 1 unit equals 1 hour.
     * </p>
     * 
     * @return The number of pricing units used to calculate the total number of hours. For example, 1 unit equals 1
     *         hour.
     */

    public Double getUnit() {
        return this.unit;
    }

    /**
     * <p>
     * The number of pricing units used to calculate the total number of hours. For example, 1 unit equals 1 hour.
     * </p>
     * 
     * @param unit
     *        The number of pricing units used to calculate the total number of hours. For example, 1 unit equals 1
     *        hour.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EstimateByTime withUnit(Double unit) {
        setUnit(unit);
        return this;
    }

    /**
     * <p>
     * The currency of the estimate in USD.
     * </p>
     * 
     * @param currency
     *        The currency of the estimate in USD.
     * @see Currency
     */

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    /**
     * <p>
     * The currency of the estimate in USD.
     * </p>
     * 
     * @return The currency of the estimate in USD.
     * @see Currency
     */

    public String getCurrency() {
        return this.currency;
    }

    /**
     * <p>
     * The currency of the estimate in USD.
     * </p>
     * 
     * @param currency
     *        The currency of the estimate in USD.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Currency
     */

    public EstimateByTime withCurrency(String currency) {
        setCurrency(currency);
        return this;
    }

    /**
     * <p>
     * The currency of the estimate in USD.
     * </p>
     * 
     * @param currency
     *        The currency of the estimate in USD.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Currency
     */

    public EstimateByTime withCurrency(Currency currency) {
        this.currency = currency.toString();
        return this;
    }

    /**
     * <p>
     * The period of time, in days, that an estimate covers. The period has a start date and an end date. The start date
     * must come before the end date.
     * </p>
     * 
     * @param timePeriod
     *        The period of time, in days, that an estimate covers. The period has a start date and an end date. The
     *        start date must come before the end date.
     */

    public void setTimePeriod(TimePeriod timePeriod) {
        this.timePeriod = timePeriod;
    }

    /**
     * <p>
     * The period of time, in days, that an estimate covers. The period has a start date and an end date. The start date
     * must come before the end date.
     * </p>
     * 
     * @return The period of time, in days, that an estimate covers. The period has a start date and an end date. The
     *         start date must come before the end date.
     */

    public TimePeriod getTimePeriod() {
        return this.timePeriod;
    }

    /**
     * <p>
     * The period of time, in days, that an estimate covers. The period has a start date and an end date. The start date
     * must come before the end date.
     * </p>
     * 
     * @param timePeriod
     *        The period of time, in days, that an estimate covers. The period has a start date and an end date. The
     *        start date must come before the end date.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EstimateByTime withTimePeriod(TimePeriod timePeriod) {
        setTimePeriod(timePeriod);
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
        if (getUsageCost() != null)
            sb.append("UsageCost: ").append(getUsageCost()).append(",");
        if (getPricingUnit() != null)
            sb.append("PricingUnit: ").append(getPricingUnit()).append(",");
        if (getUnit() != null)
            sb.append("Unit: ").append(getUnit()).append(",");
        if (getCurrency() != null)
            sb.append("Currency: ").append(getCurrency()).append(",");
        if (getTimePeriod() != null)
            sb.append("TimePeriod: ").append(getTimePeriod());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EstimateByTime == false)
            return false;
        EstimateByTime other = (EstimateByTime) obj;
        if (other.getUsageCost() == null ^ this.getUsageCost() == null)
            return false;
        if (other.getUsageCost() != null && other.getUsageCost().equals(this.getUsageCost()) == false)
            return false;
        if (other.getPricingUnit() == null ^ this.getPricingUnit() == null)
            return false;
        if (other.getPricingUnit() != null && other.getPricingUnit().equals(this.getPricingUnit()) == false)
            return false;
        if (other.getUnit() == null ^ this.getUnit() == null)
            return false;
        if (other.getUnit() != null && other.getUnit().equals(this.getUnit()) == false)
            return false;
        if (other.getCurrency() == null ^ this.getCurrency() == null)
            return false;
        if (other.getCurrency() != null && other.getCurrency().equals(this.getCurrency()) == false)
            return false;
        if (other.getTimePeriod() == null ^ this.getTimePeriod() == null)
            return false;
        if (other.getTimePeriod() != null && other.getTimePeriod().equals(this.getTimePeriod()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getUsageCost() == null) ? 0 : getUsageCost().hashCode());
        hashCode = prime * hashCode + ((getPricingUnit() == null) ? 0 : getPricingUnit().hashCode());
        hashCode = prime * hashCode + ((getUnit() == null) ? 0 : getUnit().hashCode());
        hashCode = prime * hashCode + ((getCurrency() == null) ? 0 : getCurrency().hashCode());
        hashCode = prime * hashCode + ((getTimePeriod() == null) ? 0 : getTimePeriod().hashCode());
        return hashCode;
    }

    @Override
    public EstimateByTime clone() {
        try {
            return (EstimateByTime) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lightsail.model.transform.EstimateByTimeMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
