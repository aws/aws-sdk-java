/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.iottwinmaker.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The pricing plan.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iottwinmaker-2021-11-29/PricingPlan" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PricingPlan implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The billable entity count.
     * </p>
     */
    private Long billableEntityCount;
    /**
     * <p>
     * The pricing plan's bundle information.
     * </p>
     */
    private BundleInformation bundleInformation;
    /**
     * <p>
     * The effective date and time of the pricing plan.
     * </p>
     */
    private java.util.Date effectiveDateTime;
    /**
     * <p>
     * The pricing mode.
     * </p>
     */
    private String pricingMode;
    /**
     * <p>
     * The set date and time for updating a pricing plan.
     * </p>
     */
    private java.util.Date updateDateTime;
    /**
     * <p>
     * The update reason, for changing a pricing plan.
     * </p>
     */
    private String updateReason;

    /**
     * <p>
     * The billable entity count.
     * </p>
     * 
     * @param billableEntityCount
     *        The billable entity count.
     */

    public void setBillableEntityCount(Long billableEntityCount) {
        this.billableEntityCount = billableEntityCount;
    }

    /**
     * <p>
     * The billable entity count.
     * </p>
     * 
     * @return The billable entity count.
     */

    public Long getBillableEntityCount() {
        return this.billableEntityCount;
    }

    /**
     * <p>
     * The billable entity count.
     * </p>
     * 
     * @param billableEntityCount
     *        The billable entity count.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PricingPlan withBillableEntityCount(Long billableEntityCount) {
        setBillableEntityCount(billableEntityCount);
        return this;
    }

    /**
     * <p>
     * The pricing plan's bundle information.
     * </p>
     * 
     * @param bundleInformation
     *        The pricing plan's bundle information.
     */

    public void setBundleInformation(BundleInformation bundleInformation) {
        this.bundleInformation = bundleInformation;
    }

    /**
     * <p>
     * The pricing plan's bundle information.
     * </p>
     * 
     * @return The pricing plan's bundle information.
     */

    public BundleInformation getBundleInformation() {
        return this.bundleInformation;
    }

    /**
     * <p>
     * The pricing plan's bundle information.
     * </p>
     * 
     * @param bundleInformation
     *        The pricing plan's bundle information.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PricingPlan withBundleInformation(BundleInformation bundleInformation) {
        setBundleInformation(bundleInformation);
        return this;
    }

    /**
     * <p>
     * The effective date and time of the pricing plan.
     * </p>
     * 
     * @param effectiveDateTime
     *        The effective date and time of the pricing plan.
     */

    public void setEffectiveDateTime(java.util.Date effectiveDateTime) {
        this.effectiveDateTime = effectiveDateTime;
    }

    /**
     * <p>
     * The effective date and time of the pricing plan.
     * </p>
     * 
     * @return The effective date and time of the pricing plan.
     */

    public java.util.Date getEffectiveDateTime() {
        return this.effectiveDateTime;
    }

    /**
     * <p>
     * The effective date and time of the pricing plan.
     * </p>
     * 
     * @param effectiveDateTime
     *        The effective date and time of the pricing plan.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PricingPlan withEffectiveDateTime(java.util.Date effectiveDateTime) {
        setEffectiveDateTime(effectiveDateTime);
        return this;
    }

    /**
     * <p>
     * The pricing mode.
     * </p>
     * 
     * @param pricingMode
     *        The pricing mode.
     * @see PricingMode
     */

    public void setPricingMode(String pricingMode) {
        this.pricingMode = pricingMode;
    }

    /**
     * <p>
     * The pricing mode.
     * </p>
     * 
     * @return The pricing mode.
     * @see PricingMode
     */

    public String getPricingMode() {
        return this.pricingMode;
    }

    /**
     * <p>
     * The pricing mode.
     * </p>
     * 
     * @param pricingMode
     *        The pricing mode.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PricingMode
     */

    public PricingPlan withPricingMode(String pricingMode) {
        setPricingMode(pricingMode);
        return this;
    }

    /**
     * <p>
     * The pricing mode.
     * </p>
     * 
     * @param pricingMode
     *        The pricing mode.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PricingMode
     */

    public PricingPlan withPricingMode(PricingMode pricingMode) {
        this.pricingMode = pricingMode.toString();
        return this;
    }

    /**
     * <p>
     * The set date and time for updating a pricing plan.
     * </p>
     * 
     * @param updateDateTime
     *        The set date and time for updating a pricing plan.
     */

    public void setUpdateDateTime(java.util.Date updateDateTime) {
        this.updateDateTime = updateDateTime;
    }

    /**
     * <p>
     * The set date and time for updating a pricing plan.
     * </p>
     * 
     * @return The set date and time for updating a pricing plan.
     */

    public java.util.Date getUpdateDateTime() {
        return this.updateDateTime;
    }

    /**
     * <p>
     * The set date and time for updating a pricing plan.
     * </p>
     * 
     * @param updateDateTime
     *        The set date and time for updating a pricing plan.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PricingPlan withUpdateDateTime(java.util.Date updateDateTime) {
        setUpdateDateTime(updateDateTime);
        return this;
    }

    /**
     * <p>
     * The update reason, for changing a pricing plan.
     * </p>
     * 
     * @param updateReason
     *        The update reason, for changing a pricing plan.
     * @see UpdateReason
     */

    public void setUpdateReason(String updateReason) {
        this.updateReason = updateReason;
    }

    /**
     * <p>
     * The update reason, for changing a pricing plan.
     * </p>
     * 
     * @return The update reason, for changing a pricing plan.
     * @see UpdateReason
     */

    public String getUpdateReason() {
        return this.updateReason;
    }

    /**
     * <p>
     * The update reason, for changing a pricing plan.
     * </p>
     * 
     * @param updateReason
     *        The update reason, for changing a pricing plan.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see UpdateReason
     */

    public PricingPlan withUpdateReason(String updateReason) {
        setUpdateReason(updateReason);
        return this;
    }

    /**
     * <p>
     * The update reason, for changing a pricing plan.
     * </p>
     * 
     * @param updateReason
     *        The update reason, for changing a pricing plan.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see UpdateReason
     */

    public PricingPlan withUpdateReason(UpdateReason updateReason) {
        this.updateReason = updateReason.toString();
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
        if (getBillableEntityCount() != null)
            sb.append("BillableEntityCount: ").append(getBillableEntityCount()).append(",");
        if (getBundleInformation() != null)
            sb.append("BundleInformation: ").append(getBundleInformation()).append(",");
        if (getEffectiveDateTime() != null)
            sb.append("EffectiveDateTime: ").append(getEffectiveDateTime()).append(",");
        if (getPricingMode() != null)
            sb.append("PricingMode: ").append(getPricingMode()).append(",");
        if (getUpdateDateTime() != null)
            sb.append("UpdateDateTime: ").append(getUpdateDateTime()).append(",");
        if (getUpdateReason() != null)
            sb.append("UpdateReason: ").append(getUpdateReason());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PricingPlan == false)
            return false;
        PricingPlan other = (PricingPlan) obj;
        if (other.getBillableEntityCount() == null ^ this.getBillableEntityCount() == null)
            return false;
        if (other.getBillableEntityCount() != null && other.getBillableEntityCount().equals(this.getBillableEntityCount()) == false)
            return false;
        if (other.getBundleInformation() == null ^ this.getBundleInformation() == null)
            return false;
        if (other.getBundleInformation() != null && other.getBundleInformation().equals(this.getBundleInformation()) == false)
            return false;
        if (other.getEffectiveDateTime() == null ^ this.getEffectiveDateTime() == null)
            return false;
        if (other.getEffectiveDateTime() != null && other.getEffectiveDateTime().equals(this.getEffectiveDateTime()) == false)
            return false;
        if (other.getPricingMode() == null ^ this.getPricingMode() == null)
            return false;
        if (other.getPricingMode() != null && other.getPricingMode().equals(this.getPricingMode()) == false)
            return false;
        if (other.getUpdateDateTime() == null ^ this.getUpdateDateTime() == null)
            return false;
        if (other.getUpdateDateTime() != null && other.getUpdateDateTime().equals(this.getUpdateDateTime()) == false)
            return false;
        if (other.getUpdateReason() == null ^ this.getUpdateReason() == null)
            return false;
        if (other.getUpdateReason() != null && other.getUpdateReason().equals(this.getUpdateReason()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBillableEntityCount() == null) ? 0 : getBillableEntityCount().hashCode());
        hashCode = prime * hashCode + ((getBundleInformation() == null) ? 0 : getBundleInformation().hashCode());
        hashCode = prime * hashCode + ((getEffectiveDateTime() == null) ? 0 : getEffectiveDateTime().hashCode());
        hashCode = prime * hashCode + ((getPricingMode() == null) ? 0 : getPricingMode().hashCode());
        hashCode = prime * hashCode + ((getUpdateDateTime() == null) ? 0 : getUpdateDateTime().hashCode());
        hashCode = prime * hashCode + ((getUpdateReason() == null) ? 0 : getUpdateReason().hashCode());
        return hashCode;
    }

    @Override
    public PricingPlan clone() {
        try {
            return (PricingPlan) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iottwinmaker.model.transform.PricingPlanMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
