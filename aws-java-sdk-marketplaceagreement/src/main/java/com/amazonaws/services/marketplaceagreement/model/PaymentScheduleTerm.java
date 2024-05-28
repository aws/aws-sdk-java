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
 * Defines an installment-based pricing model where customers are charged a fixed price on different dates during the
 * agreement validity period. This is used most commonly for flexible payment schedule pricing.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/marketplace-agreement-2020-03-01/PaymentScheduleTerm"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PaymentScheduleTerm implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Defines the currency for the prices mentioned in the term.
     * </p>
     */
    private String currencyCode;
    /**
     * <p>
     * List of the payment schedule where each element defines one installment of payment. It contains the information
     * necessary for calculating the price.
     * </p>
     */
    private java.util.List<ScheduleItem> schedule;
    /**
     * <p>
     * Type of the term.
     * </p>
     */
    private String type;

    /**
     * <p>
     * Defines the currency for the prices mentioned in the term.
     * </p>
     * 
     * @param currencyCode
     *        Defines the currency for the prices mentioned in the term.
     */

    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    /**
     * <p>
     * Defines the currency for the prices mentioned in the term.
     * </p>
     * 
     * @return Defines the currency for the prices mentioned in the term.
     */

    public String getCurrencyCode() {
        return this.currencyCode;
    }

    /**
     * <p>
     * Defines the currency for the prices mentioned in the term.
     * </p>
     * 
     * @param currencyCode
     *        Defines the currency for the prices mentioned in the term.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PaymentScheduleTerm withCurrencyCode(String currencyCode) {
        setCurrencyCode(currencyCode);
        return this;
    }

    /**
     * <p>
     * List of the payment schedule where each element defines one installment of payment. It contains the information
     * necessary for calculating the price.
     * </p>
     * 
     * @return List of the payment schedule where each element defines one installment of payment. It contains the
     *         information necessary for calculating the price.
     */

    public java.util.List<ScheduleItem> getSchedule() {
        return schedule;
    }

    /**
     * <p>
     * List of the payment schedule where each element defines one installment of payment. It contains the information
     * necessary for calculating the price.
     * </p>
     * 
     * @param schedule
     *        List of the payment schedule where each element defines one installment of payment. It contains the
     *        information necessary for calculating the price.
     */

    public void setSchedule(java.util.Collection<ScheduleItem> schedule) {
        if (schedule == null) {
            this.schedule = null;
            return;
        }

        this.schedule = new java.util.ArrayList<ScheduleItem>(schedule);
    }

    /**
     * <p>
     * List of the payment schedule where each element defines one installment of payment. It contains the information
     * necessary for calculating the price.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSchedule(java.util.Collection)} or {@link #withSchedule(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param schedule
     *        List of the payment schedule where each element defines one installment of payment. It contains the
     *        information necessary for calculating the price.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PaymentScheduleTerm withSchedule(ScheduleItem... schedule) {
        if (this.schedule == null) {
            setSchedule(new java.util.ArrayList<ScheduleItem>(schedule.length));
        }
        for (ScheduleItem ele : schedule) {
            this.schedule.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * List of the payment schedule where each element defines one installment of payment. It contains the information
     * necessary for calculating the price.
     * </p>
     * 
     * @param schedule
     *        List of the payment schedule where each element defines one installment of payment. It contains the
     *        information necessary for calculating the price.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PaymentScheduleTerm withSchedule(java.util.Collection<ScheduleItem> schedule) {
        setSchedule(schedule);
        return this;
    }

    /**
     * <p>
     * Type of the term.
     * </p>
     * 
     * @param type
     *        Type of the term.
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * Type of the term.
     * </p>
     * 
     * @return Type of the term.
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * Type of the term.
     * </p>
     * 
     * @param type
     *        Type of the term.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PaymentScheduleTerm withType(String type) {
        setType(type);
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
        if (getCurrencyCode() != null)
            sb.append("CurrencyCode: ").append(getCurrencyCode()).append(",");
        if (getSchedule() != null)
            sb.append("Schedule: ").append(getSchedule()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PaymentScheduleTerm == false)
            return false;
        PaymentScheduleTerm other = (PaymentScheduleTerm) obj;
        if (other.getCurrencyCode() == null ^ this.getCurrencyCode() == null)
            return false;
        if (other.getCurrencyCode() != null && other.getCurrencyCode().equals(this.getCurrencyCode()) == false)
            return false;
        if (other.getSchedule() == null ^ this.getSchedule() == null)
            return false;
        if (other.getSchedule() != null && other.getSchedule().equals(this.getSchedule()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCurrencyCode() == null) ? 0 : getCurrencyCode().hashCode());
        hashCode = prime * hashCode + ((getSchedule() == null) ? 0 : getSchedule().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        return hashCode;
    }

    @Override
    public PaymentScheduleTerm clone() {
        try {
            return (PaymentScheduleTerm) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.marketplaceagreement.model.transform.PaymentScheduleTermMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
