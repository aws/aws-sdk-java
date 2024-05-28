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
package com.amazonaws.services.marketplaceagreement.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An individual installment of the payment that includes the date and amount of the charge.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/marketplace-agreement-2020-03-01/ScheduleItem" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ScheduleItem implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The price that the customer would pay on the scheduled date (chargeDate).
     * </p>
     */
    private String chargeAmount;
    /**
     * <p>
     * The date that the customer would pay the price defined in this payment schedule term. Invoices are generated on
     * the date provided.
     * </p>
     */
    private java.util.Date chargeDate;

    /**
     * <p>
     * The price that the customer would pay on the scheduled date (chargeDate).
     * </p>
     * 
     * @param chargeAmount
     *        The price that the customer would pay on the scheduled date (chargeDate).
     */

    public void setChargeAmount(String chargeAmount) {
        this.chargeAmount = chargeAmount;
    }

    /**
     * <p>
     * The price that the customer would pay on the scheduled date (chargeDate).
     * </p>
     * 
     * @return The price that the customer would pay on the scheduled date (chargeDate).
     */

    public String getChargeAmount() {
        return this.chargeAmount;
    }

    /**
     * <p>
     * The price that the customer would pay on the scheduled date (chargeDate).
     * </p>
     * 
     * @param chargeAmount
     *        The price that the customer would pay on the scheduled date (chargeDate).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScheduleItem withChargeAmount(String chargeAmount) {
        setChargeAmount(chargeAmount);
        return this;
    }

    /**
     * <p>
     * The date that the customer would pay the price defined in this payment schedule term. Invoices are generated on
     * the date provided.
     * </p>
     * 
     * @param chargeDate
     *        The date that the customer would pay the price defined in this payment schedule term. Invoices are
     *        generated on the date provided.
     */

    public void setChargeDate(java.util.Date chargeDate) {
        this.chargeDate = chargeDate;
    }

    /**
     * <p>
     * The date that the customer would pay the price defined in this payment schedule term. Invoices are generated on
     * the date provided.
     * </p>
     * 
     * @return The date that the customer would pay the price defined in this payment schedule term. Invoices are
     *         generated on the date provided.
     */

    public java.util.Date getChargeDate() {
        return this.chargeDate;
    }

    /**
     * <p>
     * The date that the customer would pay the price defined in this payment schedule term. Invoices are generated on
     * the date provided.
     * </p>
     * 
     * @param chargeDate
     *        The date that the customer would pay the price defined in this payment schedule term. Invoices are
     *        generated on the date provided.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScheduleItem withChargeDate(java.util.Date chargeDate) {
        setChargeDate(chargeDate);
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
        if (getChargeAmount() != null)
            sb.append("ChargeAmount: ").append(getChargeAmount()).append(",");
        if (getChargeDate() != null)
            sb.append("ChargeDate: ").append(getChargeDate());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ScheduleItem == false)
            return false;
        ScheduleItem other = (ScheduleItem) obj;
        if (other.getChargeAmount() == null ^ this.getChargeAmount() == null)
            return false;
        if (other.getChargeAmount() != null && other.getChargeAmount().equals(this.getChargeAmount()) == false)
            return false;
        if (other.getChargeDate() == null ^ this.getChargeDate() == null)
            return false;
        if (other.getChargeDate() != null && other.getChargeDate().equals(this.getChargeDate()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getChargeAmount() == null) ? 0 : getChargeAmount().hashCode());
        hashCode = prime * hashCode + ((getChargeDate() == null) ? 0 : getChargeDate().hashCode());
        return hashCode;
    }

    @Override
    public ScheduleItem clone() {
        try {
            return (ScheduleItem) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.marketplaceagreement.model.transform.ScheduleItemMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
