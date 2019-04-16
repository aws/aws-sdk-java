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
package com.amazonaws.services.redshift.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Describes a reserved node offering.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/ReservedNodeOffering" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ReservedNodeOffering implements Serializable, Cloneable {

    /**
     * <p>
     * The offering identifier.
     * </p>
     */
    private String reservedNodeOfferingId;
    /**
     * <p>
     * The node type offered by the reserved node offering.
     * </p>
     */
    private String nodeType;
    /**
     * <p>
     * The duration, in seconds, for which the offering will reserve the node.
     * </p>
     */
    private Integer duration;
    /**
     * <p>
     * The upfront fixed charge you will pay to purchase the specific reserved node offering.
     * </p>
     */
    private Double fixedPrice;
    /**
     * <p>
     * The rate you are charged for each hour the cluster that is using the offering is running.
     * </p>
     */
    private Double usagePrice;
    /**
     * <p>
     * The currency code for the compute nodes offering.
     * </p>
     */
    private String currencyCode;
    /**
     * <p>
     * The anticipated utilization of the reserved node, as defined in the reserved node offering.
     * </p>
     */
    private String offeringType;
    /**
     * <p>
     * The charge to your account regardless of whether you are creating any clusters using the node offering. Recurring
     * charges are only in effect for heavy-utilization reserved nodes.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<RecurringCharge> recurringCharges;
    /** <p/> */
    private String reservedNodeOfferingType;

    /**
     * <p>
     * The offering identifier.
     * </p>
     * 
     * @param reservedNodeOfferingId
     *        The offering identifier.
     */

    public void setReservedNodeOfferingId(String reservedNodeOfferingId) {
        this.reservedNodeOfferingId = reservedNodeOfferingId;
    }

    /**
     * <p>
     * The offering identifier.
     * </p>
     * 
     * @return The offering identifier.
     */

    public String getReservedNodeOfferingId() {
        return this.reservedNodeOfferingId;
    }

    /**
     * <p>
     * The offering identifier.
     * </p>
     * 
     * @param reservedNodeOfferingId
     *        The offering identifier.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReservedNodeOffering withReservedNodeOfferingId(String reservedNodeOfferingId) {
        setReservedNodeOfferingId(reservedNodeOfferingId);
        return this;
    }

    /**
     * <p>
     * The node type offered by the reserved node offering.
     * </p>
     * 
     * @param nodeType
     *        The node type offered by the reserved node offering.
     */

    public void setNodeType(String nodeType) {
        this.nodeType = nodeType;
    }

    /**
     * <p>
     * The node type offered by the reserved node offering.
     * </p>
     * 
     * @return The node type offered by the reserved node offering.
     */

    public String getNodeType() {
        return this.nodeType;
    }

    /**
     * <p>
     * The node type offered by the reserved node offering.
     * </p>
     * 
     * @param nodeType
     *        The node type offered by the reserved node offering.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReservedNodeOffering withNodeType(String nodeType) {
        setNodeType(nodeType);
        return this;
    }

    /**
     * <p>
     * The duration, in seconds, for which the offering will reserve the node.
     * </p>
     * 
     * @param duration
     *        The duration, in seconds, for which the offering will reserve the node.
     */

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    /**
     * <p>
     * The duration, in seconds, for which the offering will reserve the node.
     * </p>
     * 
     * @return The duration, in seconds, for which the offering will reserve the node.
     */

    public Integer getDuration() {
        return this.duration;
    }

    /**
     * <p>
     * The duration, in seconds, for which the offering will reserve the node.
     * </p>
     * 
     * @param duration
     *        The duration, in seconds, for which the offering will reserve the node.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReservedNodeOffering withDuration(Integer duration) {
        setDuration(duration);
        return this;
    }

    /**
     * <p>
     * The upfront fixed charge you will pay to purchase the specific reserved node offering.
     * </p>
     * 
     * @param fixedPrice
     *        The upfront fixed charge you will pay to purchase the specific reserved node offering.
     */

    public void setFixedPrice(Double fixedPrice) {
        this.fixedPrice = fixedPrice;
    }

    /**
     * <p>
     * The upfront fixed charge you will pay to purchase the specific reserved node offering.
     * </p>
     * 
     * @return The upfront fixed charge you will pay to purchase the specific reserved node offering.
     */

    public Double getFixedPrice() {
        return this.fixedPrice;
    }

    /**
     * <p>
     * The upfront fixed charge you will pay to purchase the specific reserved node offering.
     * </p>
     * 
     * @param fixedPrice
     *        The upfront fixed charge you will pay to purchase the specific reserved node offering.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReservedNodeOffering withFixedPrice(Double fixedPrice) {
        setFixedPrice(fixedPrice);
        return this;
    }

    /**
     * <p>
     * The rate you are charged for each hour the cluster that is using the offering is running.
     * </p>
     * 
     * @param usagePrice
     *        The rate you are charged for each hour the cluster that is using the offering is running.
     */

    public void setUsagePrice(Double usagePrice) {
        this.usagePrice = usagePrice;
    }

    /**
     * <p>
     * The rate you are charged for each hour the cluster that is using the offering is running.
     * </p>
     * 
     * @return The rate you are charged for each hour the cluster that is using the offering is running.
     */

    public Double getUsagePrice() {
        return this.usagePrice;
    }

    /**
     * <p>
     * The rate you are charged for each hour the cluster that is using the offering is running.
     * </p>
     * 
     * @param usagePrice
     *        The rate you are charged for each hour the cluster that is using the offering is running.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReservedNodeOffering withUsagePrice(Double usagePrice) {
        setUsagePrice(usagePrice);
        return this;
    }

    /**
     * <p>
     * The currency code for the compute nodes offering.
     * </p>
     * 
     * @param currencyCode
     *        The currency code for the compute nodes offering.
     */

    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    /**
     * <p>
     * The currency code for the compute nodes offering.
     * </p>
     * 
     * @return The currency code for the compute nodes offering.
     */

    public String getCurrencyCode() {
        return this.currencyCode;
    }

    /**
     * <p>
     * The currency code for the compute nodes offering.
     * </p>
     * 
     * @param currencyCode
     *        The currency code for the compute nodes offering.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReservedNodeOffering withCurrencyCode(String currencyCode) {
        setCurrencyCode(currencyCode);
        return this;
    }

    /**
     * <p>
     * The anticipated utilization of the reserved node, as defined in the reserved node offering.
     * </p>
     * 
     * @param offeringType
     *        The anticipated utilization of the reserved node, as defined in the reserved node offering.
     */

    public void setOfferingType(String offeringType) {
        this.offeringType = offeringType;
    }

    /**
     * <p>
     * The anticipated utilization of the reserved node, as defined in the reserved node offering.
     * </p>
     * 
     * @return The anticipated utilization of the reserved node, as defined in the reserved node offering.
     */

    public String getOfferingType() {
        return this.offeringType;
    }

    /**
     * <p>
     * The anticipated utilization of the reserved node, as defined in the reserved node offering.
     * </p>
     * 
     * @param offeringType
     *        The anticipated utilization of the reserved node, as defined in the reserved node offering.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReservedNodeOffering withOfferingType(String offeringType) {
        setOfferingType(offeringType);
        return this;
    }

    /**
     * <p>
     * The charge to your account regardless of whether you are creating any clusters using the node offering. Recurring
     * charges are only in effect for heavy-utilization reserved nodes.
     * </p>
     * 
     * @return The charge to your account regardless of whether you are creating any clusters using the node offering.
     *         Recurring charges are only in effect for heavy-utilization reserved nodes.
     */

    public java.util.List<RecurringCharge> getRecurringCharges() {
        if (recurringCharges == null) {
            recurringCharges = new com.amazonaws.internal.SdkInternalList<RecurringCharge>();
        }
        return recurringCharges;
    }

    /**
     * <p>
     * The charge to your account regardless of whether you are creating any clusters using the node offering. Recurring
     * charges are only in effect for heavy-utilization reserved nodes.
     * </p>
     * 
     * @param recurringCharges
     *        The charge to your account regardless of whether you are creating any clusters using the node offering.
     *        Recurring charges are only in effect for heavy-utilization reserved nodes.
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
     * The charge to your account regardless of whether you are creating any clusters using the node offering. Recurring
     * charges are only in effect for heavy-utilization reserved nodes.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRecurringCharges(java.util.Collection)} or {@link #withRecurringCharges(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param recurringCharges
     *        The charge to your account regardless of whether you are creating any clusters using the node offering.
     *        Recurring charges are only in effect for heavy-utilization reserved nodes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReservedNodeOffering withRecurringCharges(RecurringCharge... recurringCharges) {
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
     * The charge to your account regardless of whether you are creating any clusters using the node offering. Recurring
     * charges are only in effect for heavy-utilization reserved nodes.
     * </p>
     * 
     * @param recurringCharges
     *        The charge to your account regardless of whether you are creating any clusters using the node offering.
     *        Recurring charges are only in effect for heavy-utilization reserved nodes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReservedNodeOffering withRecurringCharges(java.util.Collection<RecurringCharge> recurringCharges) {
        setRecurringCharges(recurringCharges);
        return this;
    }

    /**
     * <p/>
     * 
     * @param reservedNodeOfferingType
     * @see ReservedNodeOfferingType
     */

    public void setReservedNodeOfferingType(String reservedNodeOfferingType) {
        this.reservedNodeOfferingType = reservedNodeOfferingType;
    }

    /**
     * <p/>
     * 
     * @return
     * @see ReservedNodeOfferingType
     */

    public String getReservedNodeOfferingType() {
        return this.reservedNodeOfferingType;
    }

    /**
     * <p/>
     * 
     * @param reservedNodeOfferingType
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ReservedNodeOfferingType
     */

    public ReservedNodeOffering withReservedNodeOfferingType(String reservedNodeOfferingType) {
        setReservedNodeOfferingType(reservedNodeOfferingType);
        return this;
    }

    /**
     * <p/>
     * 
     * @param reservedNodeOfferingType
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ReservedNodeOfferingType
     */

    public ReservedNodeOffering withReservedNodeOfferingType(ReservedNodeOfferingType reservedNodeOfferingType) {
        this.reservedNodeOfferingType = reservedNodeOfferingType.toString();
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
        if (getReservedNodeOfferingId() != null)
            sb.append("ReservedNodeOfferingId: ").append(getReservedNodeOfferingId()).append(",");
        if (getNodeType() != null)
            sb.append("NodeType: ").append(getNodeType()).append(",");
        if (getDuration() != null)
            sb.append("Duration: ").append(getDuration()).append(",");
        if (getFixedPrice() != null)
            sb.append("FixedPrice: ").append(getFixedPrice()).append(",");
        if (getUsagePrice() != null)
            sb.append("UsagePrice: ").append(getUsagePrice()).append(",");
        if (getCurrencyCode() != null)
            sb.append("CurrencyCode: ").append(getCurrencyCode()).append(",");
        if (getOfferingType() != null)
            sb.append("OfferingType: ").append(getOfferingType()).append(",");
        if (getRecurringCharges() != null)
            sb.append("RecurringCharges: ").append(getRecurringCharges()).append(",");
        if (getReservedNodeOfferingType() != null)
            sb.append("ReservedNodeOfferingType: ").append(getReservedNodeOfferingType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ReservedNodeOffering == false)
            return false;
        ReservedNodeOffering other = (ReservedNodeOffering) obj;
        if (other.getReservedNodeOfferingId() == null ^ this.getReservedNodeOfferingId() == null)
            return false;
        if (other.getReservedNodeOfferingId() != null && other.getReservedNodeOfferingId().equals(this.getReservedNodeOfferingId()) == false)
            return false;
        if (other.getNodeType() == null ^ this.getNodeType() == null)
            return false;
        if (other.getNodeType() != null && other.getNodeType().equals(this.getNodeType()) == false)
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
        if (other.getOfferingType() == null ^ this.getOfferingType() == null)
            return false;
        if (other.getOfferingType() != null && other.getOfferingType().equals(this.getOfferingType()) == false)
            return false;
        if (other.getRecurringCharges() == null ^ this.getRecurringCharges() == null)
            return false;
        if (other.getRecurringCharges() != null && other.getRecurringCharges().equals(this.getRecurringCharges()) == false)
            return false;
        if (other.getReservedNodeOfferingType() == null ^ this.getReservedNodeOfferingType() == null)
            return false;
        if (other.getReservedNodeOfferingType() != null && other.getReservedNodeOfferingType().equals(this.getReservedNodeOfferingType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getReservedNodeOfferingId() == null) ? 0 : getReservedNodeOfferingId().hashCode());
        hashCode = prime * hashCode + ((getNodeType() == null) ? 0 : getNodeType().hashCode());
        hashCode = prime * hashCode + ((getDuration() == null) ? 0 : getDuration().hashCode());
        hashCode = prime * hashCode + ((getFixedPrice() == null) ? 0 : getFixedPrice().hashCode());
        hashCode = prime * hashCode + ((getUsagePrice() == null) ? 0 : getUsagePrice().hashCode());
        hashCode = prime * hashCode + ((getCurrencyCode() == null) ? 0 : getCurrencyCode().hashCode());
        hashCode = prime * hashCode + ((getOfferingType() == null) ? 0 : getOfferingType().hashCode());
        hashCode = prime * hashCode + ((getRecurringCharges() == null) ? 0 : getRecurringCharges().hashCode());
        hashCode = prime * hashCode + ((getReservedNodeOfferingType() == null) ? 0 : getReservedNodeOfferingType().hashCode());
        return hashCode;
    }

    @Override
    public ReservedNodeOffering clone() {
        try {
            return (ReservedNodeOffering) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
