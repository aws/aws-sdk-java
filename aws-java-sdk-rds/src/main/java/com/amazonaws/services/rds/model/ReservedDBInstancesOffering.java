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
package com.amazonaws.services.rds.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * This data type is used as a response element in the <a>DescribeReservedDBInstancesOfferings</a> action.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/ReservedDBInstancesOffering" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ReservedDBInstancesOffering implements Serializable, Cloneable {

    /**
     * <p>
     * The offering identifier.
     * </p>
     */
    private String reservedDBInstancesOfferingId;
    /**
     * <p>
     * The DB instance class for the reserved DB instance.
     * </p>
     */
    private String dBInstanceClass;
    /**
     * <p>
     * The duration of the offering in seconds.
     * </p>
     */
    private Integer duration;
    /**
     * <p>
     * The fixed price charged for this offering.
     * </p>
     */
    private Double fixedPrice;
    /**
     * <p>
     * The hourly price charged for this offering.
     * </p>
     */
    private Double usagePrice;
    /**
     * <p>
     * The currency code for the reserved DB instance offering.
     * </p>
     */
    private String currencyCode;
    /**
     * <p>
     * The database engine used by the offering.
     * </p>
     */
    private String productDescription;
    /**
     * <p>
     * The offering type.
     * </p>
     */
    private String offeringType;
    /**
     * <p>
     * Indicates if the offering applies to Multi-AZ deployments.
     * </p>
     */
    private Boolean multiAZ;
    /**
     * <p>
     * The recurring price charged to run this reserved DB instance.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<RecurringCharge> recurringCharges;

    /**
     * <p>
     * The offering identifier.
     * </p>
     * 
     * @param reservedDBInstancesOfferingId
     *        The offering identifier.
     */

    public void setReservedDBInstancesOfferingId(String reservedDBInstancesOfferingId) {
        this.reservedDBInstancesOfferingId = reservedDBInstancesOfferingId;
    }

    /**
     * <p>
     * The offering identifier.
     * </p>
     * 
     * @return The offering identifier.
     */

    public String getReservedDBInstancesOfferingId() {
        return this.reservedDBInstancesOfferingId;
    }

    /**
     * <p>
     * The offering identifier.
     * </p>
     * 
     * @param reservedDBInstancesOfferingId
     *        The offering identifier.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReservedDBInstancesOffering withReservedDBInstancesOfferingId(String reservedDBInstancesOfferingId) {
        setReservedDBInstancesOfferingId(reservedDBInstancesOfferingId);
        return this;
    }

    /**
     * <p>
     * The DB instance class for the reserved DB instance.
     * </p>
     * 
     * @param dBInstanceClass
     *        The DB instance class for the reserved DB instance.
     */

    public void setDBInstanceClass(String dBInstanceClass) {
        this.dBInstanceClass = dBInstanceClass;
    }

    /**
     * <p>
     * The DB instance class for the reserved DB instance.
     * </p>
     * 
     * @return The DB instance class for the reserved DB instance.
     */

    public String getDBInstanceClass() {
        return this.dBInstanceClass;
    }

    /**
     * <p>
     * The DB instance class for the reserved DB instance.
     * </p>
     * 
     * @param dBInstanceClass
     *        The DB instance class for the reserved DB instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReservedDBInstancesOffering withDBInstanceClass(String dBInstanceClass) {
        setDBInstanceClass(dBInstanceClass);
        return this;
    }

    /**
     * <p>
     * The duration of the offering in seconds.
     * </p>
     * 
     * @param duration
     *        The duration of the offering in seconds.
     */

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    /**
     * <p>
     * The duration of the offering in seconds.
     * </p>
     * 
     * @return The duration of the offering in seconds.
     */

    public Integer getDuration() {
        return this.duration;
    }

    /**
     * <p>
     * The duration of the offering in seconds.
     * </p>
     * 
     * @param duration
     *        The duration of the offering in seconds.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReservedDBInstancesOffering withDuration(Integer duration) {
        setDuration(duration);
        return this;
    }

    /**
     * <p>
     * The fixed price charged for this offering.
     * </p>
     * 
     * @param fixedPrice
     *        The fixed price charged for this offering.
     */

    public void setFixedPrice(Double fixedPrice) {
        this.fixedPrice = fixedPrice;
    }

    /**
     * <p>
     * The fixed price charged for this offering.
     * </p>
     * 
     * @return The fixed price charged for this offering.
     */

    public Double getFixedPrice() {
        return this.fixedPrice;
    }

    /**
     * <p>
     * The fixed price charged for this offering.
     * </p>
     * 
     * @param fixedPrice
     *        The fixed price charged for this offering.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReservedDBInstancesOffering withFixedPrice(Double fixedPrice) {
        setFixedPrice(fixedPrice);
        return this;
    }

    /**
     * <p>
     * The hourly price charged for this offering.
     * </p>
     * 
     * @param usagePrice
     *        The hourly price charged for this offering.
     */

    public void setUsagePrice(Double usagePrice) {
        this.usagePrice = usagePrice;
    }

    /**
     * <p>
     * The hourly price charged for this offering.
     * </p>
     * 
     * @return The hourly price charged for this offering.
     */

    public Double getUsagePrice() {
        return this.usagePrice;
    }

    /**
     * <p>
     * The hourly price charged for this offering.
     * </p>
     * 
     * @param usagePrice
     *        The hourly price charged for this offering.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReservedDBInstancesOffering withUsagePrice(Double usagePrice) {
        setUsagePrice(usagePrice);
        return this;
    }

    /**
     * <p>
     * The currency code for the reserved DB instance offering.
     * </p>
     * 
     * @param currencyCode
     *        The currency code for the reserved DB instance offering.
     */

    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    /**
     * <p>
     * The currency code for the reserved DB instance offering.
     * </p>
     * 
     * @return The currency code for the reserved DB instance offering.
     */

    public String getCurrencyCode() {
        return this.currencyCode;
    }

    /**
     * <p>
     * The currency code for the reserved DB instance offering.
     * </p>
     * 
     * @param currencyCode
     *        The currency code for the reserved DB instance offering.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReservedDBInstancesOffering withCurrencyCode(String currencyCode) {
        setCurrencyCode(currencyCode);
        return this;
    }

    /**
     * <p>
     * The database engine used by the offering.
     * </p>
     * 
     * @param productDescription
     *        The database engine used by the offering.
     */

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    /**
     * <p>
     * The database engine used by the offering.
     * </p>
     * 
     * @return The database engine used by the offering.
     */

    public String getProductDescription() {
        return this.productDescription;
    }

    /**
     * <p>
     * The database engine used by the offering.
     * </p>
     * 
     * @param productDescription
     *        The database engine used by the offering.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReservedDBInstancesOffering withProductDescription(String productDescription) {
        setProductDescription(productDescription);
        return this;
    }

    /**
     * <p>
     * The offering type.
     * </p>
     * 
     * @param offeringType
     *        The offering type.
     */

    public void setOfferingType(String offeringType) {
        this.offeringType = offeringType;
    }

    /**
     * <p>
     * The offering type.
     * </p>
     * 
     * @return The offering type.
     */

    public String getOfferingType() {
        return this.offeringType;
    }

    /**
     * <p>
     * The offering type.
     * </p>
     * 
     * @param offeringType
     *        The offering type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReservedDBInstancesOffering withOfferingType(String offeringType) {
        setOfferingType(offeringType);
        return this;
    }

    /**
     * <p>
     * Indicates if the offering applies to Multi-AZ deployments.
     * </p>
     * 
     * @param multiAZ
     *        Indicates if the offering applies to Multi-AZ deployments.
     */

    public void setMultiAZ(Boolean multiAZ) {
        this.multiAZ = multiAZ;
    }

    /**
     * <p>
     * Indicates if the offering applies to Multi-AZ deployments.
     * </p>
     * 
     * @return Indicates if the offering applies to Multi-AZ deployments.
     */

    public Boolean getMultiAZ() {
        return this.multiAZ;
    }

    /**
     * <p>
     * Indicates if the offering applies to Multi-AZ deployments.
     * </p>
     * 
     * @param multiAZ
     *        Indicates if the offering applies to Multi-AZ deployments.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReservedDBInstancesOffering withMultiAZ(Boolean multiAZ) {
        setMultiAZ(multiAZ);
        return this;
    }

    /**
     * <p>
     * Indicates if the offering applies to Multi-AZ deployments.
     * </p>
     * 
     * @return Indicates if the offering applies to Multi-AZ deployments.
     */

    public Boolean isMultiAZ() {
        return this.multiAZ;
    }

    /**
     * <p>
     * The recurring price charged to run this reserved DB instance.
     * </p>
     * 
     * @return The recurring price charged to run this reserved DB instance.
     */

    public java.util.List<RecurringCharge> getRecurringCharges() {
        if (recurringCharges == null) {
            recurringCharges = new com.amazonaws.internal.SdkInternalList<RecurringCharge>();
        }
        return recurringCharges;
    }

    /**
     * <p>
     * The recurring price charged to run this reserved DB instance.
     * </p>
     * 
     * @param recurringCharges
     *        The recurring price charged to run this reserved DB instance.
     */

    public void setRecurringCharges(java.util.Collection<RecurringCharge> recurringCharges) {
        if (recurringCharges == null) {
            this.recurringCharges = null;
            return;
        }

        this.recurringCharges = new com.amazonaws.internal.SdkInternalList<RecurringCharge>(recurringCharges);
    }

    /**
     * <p>
     * The recurring price charged to run this reserved DB instance.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRecurringCharges(java.util.Collection)} or {@link #withRecurringCharges(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param recurringCharges
     *        The recurring price charged to run this reserved DB instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReservedDBInstancesOffering withRecurringCharges(RecurringCharge... recurringCharges) {
        if (this.recurringCharges == null) {
            setRecurringCharges(new com.amazonaws.internal.SdkInternalList<RecurringCharge>(recurringCharges.length));
        }
        for (RecurringCharge ele : recurringCharges) {
            this.recurringCharges.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The recurring price charged to run this reserved DB instance.
     * </p>
     * 
     * @param recurringCharges
     *        The recurring price charged to run this reserved DB instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReservedDBInstancesOffering withRecurringCharges(java.util.Collection<RecurringCharge> recurringCharges) {
        setRecurringCharges(recurringCharges);
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
        if (getReservedDBInstancesOfferingId() != null)
            sb.append("ReservedDBInstancesOfferingId: ").append(getReservedDBInstancesOfferingId()).append(",");
        if (getDBInstanceClass() != null)
            sb.append("DBInstanceClass: ").append(getDBInstanceClass()).append(",");
        if (getDuration() != null)
            sb.append("Duration: ").append(getDuration()).append(",");
        if (getFixedPrice() != null)
            sb.append("FixedPrice: ").append(getFixedPrice()).append(",");
        if (getUsagePrice() != null)
            sb.append("UsagePrice: ").append(getUsagePrice()).append(",");
        if (getCurrencyCode() != null)
            sb.append("CurrencyCode: ").append(getCurrencyCode()).append(",");
        if (getProductDescription() != null)
            sb.append("ProductDescription: ").append(getProductDescription()).append(",");
        if (getOfferingType() != null)
            sb.append("OfferingType: ").append(getOfferingType()).append(",");
        if (getMultiAZ() != null)
            sb.append("MultiAZ: ").append(getMultiAZ()).append(",");
        if (getRecurringCharges() != null)
            sb.append("RecurringCharges: ").append(getRecurringCharges());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ReservedDBInstancesOffering == false)
            return false;
        ReservedDBInstancesOffering other = (ReservedDBInstancesOffering) obj;
        if (other.getReservedDBInstancesOfferingId() == null ^ this.getReservedDBInstancesOfferingId() == null)
            return false;
        if (other.getReservedDBInstancesOfferingId() != null
                && other.getReservedDBInstancesOfferingId().equals(this.getReservedDBInstancesOfferingId()) == false)
            return false;
        if (other.getDBInstanceClass() == null ^ this.getDBInstanceClass() == null)
            return false;
        if (other.getDBInstanceClass() != null && other.getDBInstanceClass().equals(this.getDBInstanceClass()) == false)
            return false;
        if (other.getDuration() == null ^ this.getDuration() == null)
            return false;
        if (other.getDuration() != null && other.getDuration().equals(this.getDuration()) == false)
            return false;
        if (other.getFixedPrice() == null ^ this.getFixedPrice() == null)
            return false;
        if (other.getFixedPrice() != null && other.getFixedPrice().equals(this.getFixedPrice()) == false)
            return false;
        if (other.getUsagePrice() == null ^ this.getUsagePrice() == null)
            return false;
        if (other.getUsagePrice() != null && other.getUsagePrice().equals(this.getUsagePrice()) == false)
            return false;
        if (other.getCurrencyCode() == null ^ this.getCurrencyCode() == null)
            return false;
        if (other.getCurrencyCode() != null && other.getCurrencyCode().equals(this.getCurrencyCode()) == false)
            return false;
        if (other.getProductDescription() == null ^ this.getProductDescription() == null)
            return false;
        if (other.getProductDescription() != null && other.getProductDescription().equals(this.getProductDescription()) == false)
            return false;
        if (other.getOfferingType() == null ^ this.getOfferingType() == null)
            return false;
        if (other.getOfferingType() != null && other.getOfferingType().equals(this.getOfferingType()) == false)
            return false;
        if (other.getMultiAZ() == null ^ this.getMultiAZ() == null)
            return false;
        if (other.getMultiAZ() != null && other.getMultiAZ().equals(this.getMultiAZ()) == false)
            return false;
        if (other.getRecurringCharges() == null ^ this.getRecurringCharges() == null)
            return false;
        if (other.getRecurringCharges() != null && other.getRecurringCharges().equals(this.getRecurringCharges()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getReservedDBInstancesOfferingId() == null) ? 0 : getReservedDBInstancesOfferingId().hashCode());
        hashCode = prime * hashCode + ((getDBInstanceClass() == null) ? 0 : getDBInstanceClass().hashCode());
        hashCode = prime * hashCode + ((getDuration() == null) ? 0 : getDuration().hashCode());
        hashCode = prime * hashCode + ((getFixedPrice() == null) ? 0 : getFixedPrice().hashCode());
        hashCode = prime * hashCode + ((getUsagePrice() == null) ? 0 : getUsagePrice().hashCode());
        hashCode = prime * hashCode + ((getCurrencyCode() == null) ? 0 : getCurrencyCode().hashCode());
        hashCode = prime * hashCode + ((getProductDescription() == null) ? 0 : getProductDescription().hashCode());
        hashCode = prime * hashCode + ((getOfferingType() == null) ? 0 : getOfferingType().hashCode());
        hashCode = prime * hashCode + ((getMultiAZ() == null) ? 0 : getMultiAZ().hashCode());
        hashCode = prime * hashCode + ((getRecurringCharges() == null) ? 0 : getRecurringCharges().hashCode());
        return hashCode;
    }

    @Override
    public ReservedDBInstancesOffering clone() {
        try {
            return (ReservedDBInstancesOffering) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
