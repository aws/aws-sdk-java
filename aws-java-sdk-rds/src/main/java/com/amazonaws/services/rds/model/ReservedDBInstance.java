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
 * This data type is used as a response element in the <a>DescribeReservedDBInstances</a> and
 * <a>PurchaseReservedDBInstancesOffering</a> actions.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/ReservedDBInstance" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ReservedDBInstance implements Serializable, Cloneable {

    /**
     * <p>
     * The unique identifier for the reservation.
     * </p>
     */
    private String reservedDBInstanceId;
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
     * The time the reservation started.
     * </p>
     */
    private java.util.Date startTime;
    /**
     * <p>
     * The duration of the reservation in seconds.
     * </p>
     */
    private Integer duration;
    /**
     * <p>
     * The fixed price charged for this reserved DB instance.
     * </p>
     */
    private Double fixedPrice;
    /**
     * <p>
     * The hourly price charged for this reserved DB instance.
     * </p>
     */
    private Double usagePrice;
    /**
     * <p>
     * The currency code for the reserved DB instance.
     * </p>
     */
    private String currencyCode;
    /**
     * <p>
     * The number of reserved DB instances.
     * </p>
     */
    private Integer dBInstanceCount;
    /**
     * <p>
     * The description of the reserved DB instance.
     * </p>
     */
    private String productDescription;
    /**
     * <p>
     * The offering type of this reserved DB instance.
     * </p>
     */
    private String offeringType;
    /**
     * <p>
     * Indicates if the reservation applies to Multi-AZ deployments.
     * </p>
     */
    private Boolean multiAZ;
    /**
     * <p>
     * The state of the reserved DB instance.
     * </p>
     */
    private String state;
    /**
     * <p>
     * The recurring price charged to run this reserved DB instance.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<RecurringCharge> recurringCharges;
    /**
     * <p>
     * The Amazon Resource Name (ARN) for the reserved DB instance.
     * </p>
     */
    private String reservedDBInstanceArn;

    /**
     * <p>
     * The unique identifier for the reservation.
     * </p>
     * 
     * @param reservedDBInstanceId
     *        The unique identifier for the reservation.
     */

    public void setReservedDBInstanceId(String reservedDBInstanceId) {
        this.reservedDBInstanceId = reservedDBInstanceId;
    }

    /**
     * <p>
     * The unique identifier for the reservation.
     * </p>
     * 
     * @return The unique identifier for the reservation.
     */

    public String getReservedDBInstanceId() {
        return this.reservedDBInstanceId;
    }

    /**
     * <p>
     * The unique identifier for the reservation.
     * </p>
     * 
     * @param reservedDBInstanceId
     *        The unique identifier for the reservation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReservedDBInstance withReservedDBInstanceId(String reservedDBInstanceId) {
        setReservedDBInstanceId(reservedDBInstanceId);
        return this;
    }

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

    public ReservedDBInstance withReservedDBInstancesOfferingId(String reservedDBInstancesOfferingId) {
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

    public ReservedDBInstance withDBInstanceClass(String dBInstanceClass) {
        setDBInstanceClass(dBInstanceClass);
        return this;
    }

    /**
     * <p>
     * The time the reservation started.
     * </p>
     * 
     * @param startTime
     *        The time the reservation started.
     */

    public void setStartTime(java.util.Date startTime) {
        this.startTime = startTime;
    }

    /**
     * <p>
     * The time the reservation started.
     * </p>
     * 
     * @return The time the reservation started.
     */

    public java.util.Date getStartTime() {
        return this.startTime;
    }

    /**
     * <p>
     * The time the reservation started.
     * </p>
     * 
     * @param startTime
     *        The time the reservation started.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReservedDBInstance withStartTime(java.util.Date startTime) {
        setStartTime(startTime);
        return this;
    }

    /**
     * <p>
     * The duration of the reservation in seconds.
     * </p>
     * 
     * @param duration
     *        The duration of the reservation in seconds.
     */

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    /**
     * <p>
     * The duration of the reservation in seconds.
     * </p>
     * 
     * @return The duration of the reservation in seconds.
     */

    public Integer getDuration() {
        return this.duration;
    }

    /**
     * <p>
     * The duration of the reservation in seconds.
     * </p>
     * 
     * @param duration
     *        The duration of the reservation in seconds.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReservedDBInstance withDuration(Integer duration) {
        setDuration(duration);
        return this;
    }

    /**
     * <p>
     * The fixed price charged for this reserved DB instance.
     * </p>
     * 
     * @param fixedPrice
     *        The fixed price charged for this reserved DB instance.
     */

    public void setFixedPrice(Double fixedPrice) {
        this.fixedPrice = fixedPrice;
    }

    /**
     * <p>
     * The fixed price charged for this reserved DB instance.
     * </p>
     * 
     * @return The fixed price charged for this reserved DB instance.
     */

    public Double getFixedPrice() {
        return this.fixedPrice;
    }

    /**
     * <p>
     * The fixed price charged for this reserved DB instance.
     * </p>
     * 
     * @param fixedPrice
     *        The fixed price charged for this reserved DB instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReservedDBInstance withFixedPrice(Double fixedPrice) {
        setFixedPrice(fixedPrice);
        return this;
    }

    /**
     * <p>
     * The hourly price charged for this reserved DB instance.
     * </p>
     * 
     * @param usagePrice
     *        The hourly price charged for this reserved DB instance.
     */

    public void setUsagePrice(Double usagePrice) {
        this.usagePrice = usagePrice;
    }

    /**
     * <p>
     * The hourly price charged for this reserved DB instance.
     * </p>
     * 
     * @return The hourly price charged for this reserved DB instance.
     */

    public Double getUsagePrice() {
        return this.usagePrice;
    }

    /**
     * <p>
     * The hourly price charged for this reserved DB instance.
     * </p>
     * 
     * @param usagePrice
     *        The hourly price charged for this reserved DB instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReservedDBInstance withUsagePrice(Double usagePrice) {
        setUsagePrice(usagePrice);
        return this;
    }

    /**
     * <p>
     * The currency code for the reserved DB instance.
     * </p>
     * 
     * @param currencyCode
     *        The currency code for the reserved DB instance.
     */

    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    /**
     * <p>
     * The currency code for the reserved DB instance.
     * </p>
     * 
     * @return The currency code for the reserved DB instance.
     */

    public String getCurrencyCode() {
        return this.currencyCode;
    }

    /**
     * <p>
     * The currency code for the reserved DB instance.
     * </p>
     * 
     * @param currencyCode
     *        The currency code for the reserved DB instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReservedDBInstance withCurrencyCode(String currencyCode) {
        setCurrencyCode(currencyCode);
        return this;
    }

    /**
     * <p>
     * The number of reserved DB instances.
     * </p>
     * 
     * @param dBInstanceCount
     *        The number of reserved DB instances.
     */

    public void setDBInstanceCount(Integer dBInstanceCount) {
        this.dBInstanceCount = dBInstanceCount;
    }

    /**
     * <p>
     * The number of reserved DB instances.
     * </p>
     * 
     * @return The number of reserved DB instances.
     */

    public Integer getDBInstanceCount() {
        return this.dBInstanceCount;
    }

    /**
     * <p>
     * The number of reserved DB instances.
     * </p>
     * 
     * @param dBInstanceCount
     *        The number of reserved DB instances.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReservedDBInstance withDBInstanceCount(Integer dBInstanceCount) {
        setDBInstanceCount(dBInstanceCount);
        return this;
    }

    /**
     * <p>
     * The description of the reserved DB instance.
     * </p>
     * 
     * @param productDescription
     *        The description of the reserved DB instance.
     */

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    /**
     * <p>
     * The description of the reserved DB instance.
     * </p>
     * 
     * @return The description of the reserved DB instance.
     */

    public String getProductDescription() {
        return this.productDescription;
    }

    /**
     * <p>
     * The description of the reserved DB instance.
     * </p>
     * 
     * @param productDescription
     *        The description of the reserved DB instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReservedDBInstance withProductDescription(String productDescription) {
        setProductDescription(productDescription);
        return this;
    }

    /**
     * <p>
     * The offering type of this reserved DB instance.
     * </p>
     * 
     * @param offeringType
     *        The offering type of this reserved DB instance.
     */

    public void setOfferingType(String offeringType) {
        this.offeringType = offeringType;
    }

    /**
     * <p>
     * The offering type of this reserved DB instance.
     * </p>
     * 
     * @return The offering type of this reserved DB instance.
     */

    public String getOfferingType() {
        return this.offeringType;
    }

    /**
     * <p>
     * The offering type of this reserved DB instance.
     * </p>
     * 
     * @param offeringType
     *        The offering type of this reserved DB instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReservedDBInstance withOfferingType(String offeringType) {
        setOfferingType(offeringType);
        return this;
    }

    /**
     * <p>
     * Indicates if the reservation applies to Multi-AZ deployments.
     * </p>
     * 
     * @param multiAZ
     *        Indicates if the reservation applies to Multi-AZ deployments.
     */

    public void setMultiAZ(Boolean multiAZ) {
        this.multiAZ = multiAZ;
    }

    /**
     * <p>
     * Indicates if the reservation applies to Multi-AZ deployments.
     * </p>
     * 
     * @return Indicates if the reservation applies to Multi-AZ deployments.
     */

    public Boolean getMultiAZ() {
        return this.multiAZ;
    }

    /**
     * <p>
     * Indicates if the reservation applies to Multi-AZ deployments.
     * </p>
     * 
     * @param multiAZ
     *        Indicates if the reservation applies to Multi-AZ deployments.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReservedDBInstance withMultiAZ(Boolean multiAZ) {
        setMultiAZ(multiAZ);
        return this;
    }

    /**
     * <p>
     * Indicates if the reservation applies to Multi-AZ deployments.
     * </p>
     * 
     * @return Indicates if the reservation applies to Multi-AZ deployments.
     */

    public Boolean isMultiAZ() {
        return this.multiAZ;
    }

    /**
     * <p>
     * The state of the reserved DB instance.
     * </p>
     * 
     * @param state
     *        The state of the reserved DB instance.
     */

    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * The state of the reserved DB instance.
     * </p>
     * 
     * @return The state of the reserved DB instance.
     */

    public String getState() {
        return this.state;
    }

    /**
     * <p>
     * The state of the reserved DB instance.
     * </p>
     * 
     * @param state
     *        The state of the reserved DB instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReservedDBInstance withState(String state) {
        setState(state);
        return this;
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

    public ReservedDBInstance withRecurringCharges(RecurringCharge... recurringCharges) {
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

    public ReservedDBInstance withRecurringCharges(java.util.Collection<RecurringCharge> recurringCharges) {
        setRecurringCharges(recurringCharges);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the reserved DB instance.
     * </p>
     * 
     * @param reservedDBInstanceArn
     *        The Amazon Resource Name (ARN) for the reserved DB instance.
     */

    public void setReservedDBInstanceArn(String reservedDBInstanceArn) {
        this.reservedDBInstanceArn = reservedDBInstanceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the reserved DB instance.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) for the reserved DB instance.
     */

    public String getReservedDBInstanceArn() {
        return this.reservedDBInstanceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the reserved DB instance.
     * </p>
     * 
     * @param reservedDBInstanceArn
     *        The Amazon Resource Name (ARN) for the reserved DB instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReservedDBInstance withReservedDBInstanceArn(String reservedDBInstanceArn) {
        setReservedDBInstanceArn(reservedDBInstanceArn);
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
        if (getReservedDBInstanceId() != null)
            sb.append("ReservedDBInstanceId: ").append(getReservedDBInstanceId()).append(",");
        if (getReservedDBInstancesOfferingId() != null)
            sb.append("ReservedDBInstancesOfferingId: ").append(getReservedDBInstancesOfferingId()).append(",");
        if (getDBInstanceClass() != null)
            sb.append("DBInstanceClass: ").append(getDBInstanceClass()).append(",");
        if (getStartTime() != null)
            sb.append("StartTime: ").append(getStartTime()).append(",");
        if (getDuration() != null)
            sb.append("Duration: ").append(getDuration()).append(",");
        if (getFixedPrice() != null)
            sb.append("FixedPrice: ").append(getFixedPrice()).append(",");
        if (getUsagePrice() != null)
            sb.append("UsagePrice: ").append(getUsagePrice()).append(",");
        if (getCurrencyCode() != null)
            sb.append("CurrencyCode: ").append(getCurrencyCode()).append(",");
        if (getDBInstanceCount() != null)
            sb.append("DBInstanceCount: ").append(getDBInstanceCount()).append(",");
        if (getProductDescription() != null)
            sb.append("ProductDescription: ").append(getProductDescription()).append(",");
        if (getOfferingType() != null)
            sb.append("OfferingType: ").append(getOfferingType()).append(",");
        if (getMultiAZ() != null)
            sb.append("MultiAZ: ").append(getMultiAZ()).append(",");
        if (getState() != null)
            sb.append("State: ").append(getState()).append(",");
        if (getRecurringCharges() != null)
            sb.append("RecurringCharges: ").append(getRecurringCharges()).append(",");
        if (getReservedDBInstanceArn() != null)
            sb.append("ReservedDBInstanceArn: ").append(getReservedDBInstanceArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ReservedDBInstance == false)
            return false;
        ReservedDBInstance other = (ReservedDBInstance) obj;
        if (other.getReservedDBInstanceId() == null ^ this.getReservedDBInstanceId() == null)
            return false;
        if (other.getReservedDBInstanceId() != null && other.getReservedDBInstanceId().equals(this.getReservedDBInstanceId()) == false)
            return false;
        if (other.getReservedDBInstancesOfferingId() == null ^ this.getReservedDBInstancesOfferingId() == null)
            return false;
        if (other.getReservedDBInstancesOfferingId() != null
                && other.getReservedDBInstancesOfferingId().equals(this.getReservedDBInstancesOfferingId()) == false)
            return false;
        if (other.getDBInstanceClass() == null ^ this.getDBInstanceClass() == null)
            return false;
        if (other.getDBInstanceClass() != null && other.getDBInstanceClass().equals(this.getDBInstanceClass()) == false)
            return false;
        if (other.getStartTime() == null ^ this.getStartTime() == null)
            return false;
        if (other.getStartTime() != null && other.getStartTime().equals(this.getStartTime()) == false)
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
        if (other.getDBInstanceCount() == null ^ this.getDBInstanceCount() == null)
            return false;
        if (other.getDBInstanceCount() != null && other.getDBInstanceCount().equals(this.getDBInstanceCount()) == false)
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
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        if (other.getRecurringCharges() == null ^ this.getRecurringCharges() == null)
            return false;
        if (other.getRecurringCharges() != null && other.getRecurringCharges().equals(this.getRecurringCharges()) == false)
            return false;
        if (other.getReservedDBInstanceArn() == null ^ this.getReservedDBInstanceArn() == null)
            return false;
        if (other.getReservedDBInstanceArn() != null && other.getReservedDBInstanceArn().equals(this.getReservedDBInstanceArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getReservedDBInstanceId() == null) ? 0 : getReservedDBInstanceId().hashCode());
        hashCode = prime * hashCode + ((getReservedDBInstancesOfferingId() == null) ? 0 : getReservedDBInstancesOfferingId().hashCode());
        hashCode = prime * hashCode + ((getDBInstanceClass() == null) ? 0 : getDBInstanceClass().hashCode());
        hashCode = prime * hashCode + ((getStartTime() == null) ? 0 : getStartTime().hashCode());
        hashCode = prime * hashCode + ((getDuration() == null) ? 0 : getDuration().hashCode());
        hashCode = prime * hashCode + ((getFixedPrice() == null) ? 0 : getFixedPrice().hashCode());
        hashCode = prime * hashCode + ((getUsagePrice() == null) ? 0 : getUsagePrice().hashCode());
        hashCode = prime * hashCode + ((getCurrencyCode() == null) ? 0 : getCurrencyCode().hashCode());
        hashCode = prime * hashCode + ((getDBInstanceCount() == null) ? 0 : getDBInstanceCount().hashCode());
        hashCode = prime * hashCode + ((getProductDescription() == null) ? 0 : getProductDescription().hashCode());
        hashCode = prime * hashCode + ((getOfferingType() == null) ? 0 : getOfferingType().hashCode());
        hashCode = prime * hashCode + ((getMultiAZ() == null) ? 0 : getMultiAZ().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        hashCode = prime * hashCode + ((getRecurringCharges() == null) ? 0 : getRecurringCharges().hashCode());
        hashCode = prime * hashCode + ((getReservedDBInstanceArn() == null) ? 0 : getReservedDBInstanceArn().hashCode());
        return hashCode;
    }

    @Override
    public ReservedDBInstance clone() {
        try {
            return (ReservedDBInstance) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
