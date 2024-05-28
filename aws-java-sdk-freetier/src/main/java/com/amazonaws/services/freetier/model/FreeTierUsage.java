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
package com.amazonaws.services.freetier.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Consists of a Amazon Web Services Free Tier offer’s metadata and your data usage for the offer.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/freetier-2023-09-07/FreeTierUsage" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FreeTierUsage implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Describes the actual usage accrued month-to-day (MTD) that you've used so far.
     * </p>
     */
    private Double actualUsageAmount;
    /**
     * <p>
     * The description of the Free Tier offer.
     * </p>
     */
    private String description;
    /**
     * <p>
     * Describes the forecasted usage by the month that you're expected to use.
     * </p>
     */
    private Double forecastedUsageAmount;
    /**
     * <p>
     * Describes the type of the Free Tier offer. For example, the offer can be <code>"12 Months Free"</code>,
     * <code>"Always Free"</code>, and <code>"Free Trial"</code>.
     * </p>
     */
    private String freeTierType;
    /**
     * <p>
     * Describes the maximum usage allowed in Free Tier.
     * </p>
     */
    private Double limit;
    /**
     * <p>
     * Describes <code>usageType</code> more granularly with the specific Amazon Web Service API operation. For example,
     * this can be the <code>RunInstances</code> API operation for Amazon Elastic Compute Cloud.
     * </p>
     */
    private String operation;
    /**
     * <p>
     * Describes the Amazon Web Services Region for which this offer is applicable
     * </p>
     */
    private String region;
    /**
     * <p>
     * The name of the Amazon Web Service providing the Free Tier offer. For example, this can be Amazon Elastic Compute
     * Cloud.
     * </p>
     */
    private String service;
    /**
     * <p>
     * Describes the unit of the <code>usageType</code>, such as <code>Hrs</code>.
     * </p>
     */
    private String unit;
    /**
     * <p>
     * Describes the usage details of the offer. For example, this might be <code>Global-BoxUsage:freetrial</code>.
     * </p>
     */
    private String usageType;

    /**
     * <p>
     * Describes the actual usage accrued month-to-day (MTD) that you've used so far.
     * </p>
     * 
     * @param actualUsageAmount
     *        Describes the actual usage accrued month-to-day (MTD) that you've used so far.
     */

    public void setActualUsageAmount(Double actualUsageAmount) {
        this.actualUsageAmount = actualUsageAmount;
    }

    /**
     * <p>
     * Describes the actual usage accrued month-to-day (MTD) that you've used so far.
     * </p>
     * 
     * @return Describes the actual usage accrued month-to-day (MTD) that you've used so far.
     */

    public Double getActualUsageAmount() {
        return this.actualUsageAmount;
    }

    /**
     * <p>
     * Describes the actual usage accrued month-to-day (MTD) that you've used so far.
     * </p>
     * 
     * @param actualUsageAmount
     *        Describes the actual usage accrued month-to-day (MTD) that you've used so far.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FreeTierUsage withActualUsageAmount(Double actualUsageAmount) {
        setActualUsageAmount(actualUsageAmount);
        return this;
    }

    /**
     * <p>
     * The description of the Free Tier offer.
     * </p>
     * 
     * @param description
     *        The description of the Free Tier offer.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the Free Tier offer.
     * </p>
     * 
     * @return The description of the Free Tier offer.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of the Free Tier offer.
     * </p>
     * 
     * @param description
     *        The description of the Free Tier offer.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FreeTierUsage withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * Describes the forecasted usage by the month that you're expected to use.
     * </p>
     * 
     * @param forecastedUsageAmount
     *        Describes the forecasted usage by the month that you're expected to use.
     */

    public void setForecastedUsageAmount(Double forecastedUsageAmount) {
        this.forecastedUsageAmount = forecastedUsageAmount;
    }

    /**
     * <p>
     * Describes the forecasted usage by the month that you're expected to use.
     * </p>
     * 
     * @return Describes the forecasted usage by the month that you're expected to use.
     */

    public Double getForecastedUsageAmount() {
        return this.forecastedUsageAmount;
    }

    /**
     * <p>
     * Describes the forecasted usage by the month that you're expected to use.
     * </p>
     * 
     * @param forecastedUsageAmount
     *        Describes the forecasted usage by the month that you're expected to use.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FreeTierUsage withForecastedUsageAmount(Double forecastedUsageAmount) {
        setForecastedUsageAmount(forecastedUsageAmount);
        return this;
    }

    /**
     * <p>
     * Describes the type of the Free Tier offer. For example, the offer can be <code>"12 Months Free"</code>,
     * <code>"Always Free"</code>, and <code>"Free Trial"</code>.
     * </p>
     * 
     * @param freeTierType
     *        Describes the type of the Free Tier offer. For example, the offer can be <code>"12 Months Free"</code>,
     *        <code>"Always Free"</code>, and <code>"Free Trial"</code>.
     */

    public void setFreeTierType(String freeTierType) {
        this.freeTierType = freeTierType;
    }

    /**
     * <p>
     * Describes the type of the Free Tier offer. For example, the offer can be <code>"12 Months Free"</code>,
     * <code>"Always Free"</code>, and <code>"Free Trial"</code>.
     * </p>
     * 
     * @return Describes the type of the Free Tier offer. For example, the offer can be <code>"12 Months Free"</code>,
     *         <code>"Always Free"</code>, and <code>"Free Trial"</code>.
     */

    public String getFreeTierType() {
        return this.freeTierType;
    }

    /**
     * <p>
     * Describes the type of the Free Tier offer. For example, the offer can be <code>"12 Months Free"</code>,
     * <code>"Always Free"</code>, and <code>"Free Trial"</code>.
     * </p>
     * 
     * @param freeTierType
     *        Describes the type of the Free Tier offer. For example, the offer can be <code>"12 Months Free"</code>,
     *        <code>"Always Free"</code>, and <code>"Free Trial"</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FreeTierUsage withFreeTierType(String freeTierType) {
        setFreeTierType(freeTierType);
        return this;
    }

    /**
     * <p>
     * Describes the maximum usage allowed in Free Tier.
     * </p>
     * 
     * @param limit
     *        Describes the maximum usage allowed in Free Tier.
     */

    public void setLimit(Double limit) {
        this.limit = limit;
    }

    /**
     * <p>
     * Describes the maximum usage allowed in Free Tier.
     * </p>
     * 
     * @return Describes the maximum usage allowed in Free Tier.
     */

    public Double getLimit() {
        return this.limit;
    }

    /**
     * <p>
     * Describes the maximum usage allowed in Free Tier.
     * </p>
     * 
     * @param limit
     *        Describes the maximum usage allowed in Free Tier.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FreeTierUsage withLimit(Double limit) {
        setLimit(limit);
        return this;
    }

    /**
     * <p>
     * Describes <code>usageType</code> more granularly with the specific Amazon Web Service API operation. For example,
     * this can be the <code>RunInstances</code> API operation for Amazon Elastic Compute Cloud.
     * </p>
     * 
     * @param operation
     *        Describes <code>usageType</code> more granularly with the specific Amazon Web Service API operation. For
     *        example, this can be the <code>RunInstances</code> API operation for Amazon Elastic Compute Cloud.
     */

    public void setOperation(String operation) {
        this.operation = operation;
    }

    /**
     * <p>
     * Describes <code>usageType</code> more granularly with the specific Amazon Web Service API operation. For example,
     * this can be the <code>RunInstances</code> API operation for Amazon Elastic Compute Cloud.
     * </p>
     * 
     * @return Describes <code>usageType</code> more granularly with the specific Amazon Web Service API operation. For
     *         example, this can be the <code>RunInstances</code> API operation for Amazon Elastic Compute Cloud.
     */

    public String getOperation() {
        return this.operation;
    }

    /**
     * <p>
     * Describes <code>usageType</code> more granularly with the specific Amazon Web Service API operation. For example,
     * this can be the <code>RunInstances</code> API operation for Amazon Elastic Compute Cloud.
     * </p>
     * 
     * @param operation
     *        Describes <code>usageType</code> more granularly with the specific Amazon Web Service API operation. For
     *        example, this can be the <code>RunInstances</code> API operation for Amazon Elastic Compute Cloud.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FreeTierUsage withOperation(String operation) {
        setOperation(operation);
        return this;
    }

    /**
     * <p>
     * Describes the Amazon Web Services Region for which this offer is applicable
     * </p>
     * 
     * @param region
     *        Describes the Amazon Web Services Region for which this offer is applicable
     */

    public void setRegion(String region) {
        this.region = region;
    }

    /**
     * <p>
     * Describes the Amazon Web Services Region for which this offer is applicable
     * </p>
     * 
     * @return Describes the Amazon Web Services Region for which this offer is applicable
     */

    public String getRegion() {
        return this.region;
    }

    /**
     * <p>
     * Describes the Amazon Web Services Region for which this offer is applicable
     * </p>
     * 
     * @param region
     *        Describes the Amazon Web Services Region for which this offer is applicable
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FreeTierUsage withRegion(String region) {
        setRegion(region);
        return this;
    }

    /**
     * <p>
     * The name of the Amazon Web Service providing the Free Tier offer. For example, this can be Amazon Elastic Compute
     * Cloud.
     * </p>
     * 
     * @param service
     *        The name of the Amazon Web Service providing the Free Tier offer. For example, this can be Amazon Elastic
     *        Compute Cloud.
     */

    public void setService(String service) {
        this.service = service;
    }

    /**
     * <p>
     * The name of the Amazon Web Service providing the Free Tier offer. For example, this can be Amazon Elastic Compute
     * Cloud.
     * </p>
     * 
     * @return The name of the Amazon Web Service providing the Free Tier offer. For example, this can be Amazon Elastic
     *         Compute Cloud.
     */

    public String getService() {
        return this.service;
    }

    /**
     * <p>
     * The name of the Amazon Web Service providing the Free Tier offer. For example, this can be Amazon Elastic Compute
     * Cloud.
     * </p>
     * 
     * @param service
     *        The name of the Amazon Web Service providing the Free Tier offer. For example, this can be Amazon Elastic
     *        Compute Cloud.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FreeTierUsage withService(String service) {
        setService(service);
        return this;
    }

    /**
     * <p>
     * Describes the unit of the <code>usageType</code>, such as <code>Hrs</code>.
     * </p>
     * 
     * @param unit
     *        Describes the unit of the <code>usageType</code>, such as <code>Hrs</code>.
     */

    public void setUnit(String unit) {
        this.unit = unit;
    }

    /**
     * <p>
     * Describes the unit of the <code>usageType</code>, such as <code>Hrs</code>.
     * </p>
     * 
     * @return Describes the unit of the <code>usageType</code>, such as <code>Hrs</code>.
     */

    public String getUnit() {
        return this.unit;
    }

    /**
     * <p>
     * Describes the unit of the <code>usageType</code>, such as <code>Hrs</code>.
     * </p>
     * 
     * @param unit
     *        Describes the unit of the <code>usageType</code>, such as <code>Hrs</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FreeTierUsage withUnit(String unit) {
        setUnit(unit);
        return this;
    }

    /**
     * <p>
     * Describes the usage details of the offer. For example, this might be <code>Global-BoxUsage:freetrial</code>.
     * </p>
     * 
     * @param usageType
     *        Describes the usage details of the offer. For example, this might be
     *        <code>Global-BoxUsage:freetrial</code>.
     */

    public void setUsageType(String usageType) {
        this.usageType = usageType;
    }

    /**
     * <p>
     * Describes the usage details of the offer. For example, this might be <code>Global-BoxUsage:freetrial</code>.
     * </p>
     * 
     * @return Describes the usage details of the offer. For example, this might be
     *         <code>Global-BoxUsage:freetrial</code>.
     */

    public String getUsageType() {
        return this.usageType;
    }

    /**
     * <p>
     * Describes the usage details of the offer. For example, this might be <code>Global-BoxUsage:freetrial</code>.
     * </p>
     * 
     * @param usageType
     *        Describes the usage details of the offer. For example, this might be
     *        <code>Global-BoxUsage:freetrial</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FreeTierUsage withUsageType(String usageType) {
        setUsageType(usageType);
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
        if (getActualUsageAmount() != null)
            sb.append("ActualUsageAmount: ").append(getActualUsageAmount()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getForecastedUsageAmount() != null)
            sb.append("ForecastedUsageAmount: ").append(getForecastedUsageAmount()).append(",");
        if (getFreeTierType() != null)
            sb.append("FreeTierType: ").append(getFreeTierType()).append(",");
        if (getLimit() != null)
            sb.append("Limit: ").append(getLimit()).append(",");
        if (getOperation() != null)
            sb.append("Operation: ").append(getOperation()).append(",");
        if (getRegion() != null)
            sb.append("Region: ").append(getRegion()).append(",");
        if (getService() != null)
            sb.append("Service: ").append(getService()).append(",");
        if (getUnit() != null)
            sb.append("Unit: ").append(getUnit()).append(",");
        if (getUsageType() != null)
            sb.append("UsageType: ").append(getUsageType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof FreeTierUsage == false)
            return false;
        FreeTierUsage other = (FreeTierUsage) obj;
        if (other.getActualUsageAmount() == null ^ this.getActualUsageAmount() == null)
            return false;
        if (other.getActualUsageAmount() != null && other.getActualUsageAmount().equals(this.getActualUsageAmount()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getForecastedUsageAmount() == null ^ this.getForecastedUsageAmount() == null)
            return false;
        if (other.getForecastedUsageAmount() != null && other.getForecastedUsageAmount().equals(this.getForecastedUsageAmount()) == false)
            return false;
        if (other.getFreeTierType() == null ^ this.getFreeTierType() == null)
            return false;
        if (other.getFreeTierType() != null && other.getFreeTierType().equals(this.getFreeTierType()) == false)
            return false;
        if (other.getLimit() == null ^ this.getLimit() == null)
            return false;
        if (other.getLimit() != null && other.getLimit().equals(this.getLimit()) == false)
            return false;
        if (other.getOperation() == null ^ this.getOperation() == null)
            return false;
        if (other.getOperation() != null && other.getOperation().equals(this.getOperation()) == false)
            return false;
        if (other.getRegion() == null ^ this.getRegion() == null)
            return false;
        if (other.getRegion() != null && other.getRegion().equals(this.getRegion()) == false)
            return false;
        if (other.getService() == null ^ this.getService() == null)
            return false;
        if (other.getService() != null && other.getService().equals(this.getService()) == false)
            return false;
        if (other.getUnit() == null ^ this.getUnit() == null)
            return false;
        if (other.getUnit() != null && other.getUnit().equals(this.getUnit()) == false)
            return false;
        if (other.getUsageType() == null ^ this.getUsageType() == null)
            return false;
        if (other.getUsageType() != null && other.getUsageType().equals(this.getUsageType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getActualUsageAmount() == null) ? 0 : getActualUsageAmount().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getForecastedUsageAmount() == null) ? 0 : getForecastedUsageAmount().hashCode());
        hashCode = prime * hashCode + ((getFreeTierType() == null) ? 0 : getFreeTierType().hashCode());
        hashCode = prime * hashCode + ((getLimit() == null) ? 0 : getLimit().hashCode());
        hashCode = prime * hashCode + ((getOperation() == null) ? 0 : getOperation().hashCode());
        hashCode = prime * hashCode + ((getRegion() == null) ? 0 : getRegion().hashCode());
        hashCode = prime * hashCode + ((getService() == null) ? 0 : getService().hashCode());
        hashCode = prime * hashCode + ((getUnit() == null) ? 0 : getUnit().hashCode());
        hashCode = prime * hashCode + ((getUsageType() == null) ? 0 : getUsageType().hashCode());
        return hashCode;
    }

    @Override
    public FreeTierUsage clone() {
        try {
            return (FreeTierUsage) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.freetier.model.transform.FreeTierUsageMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
