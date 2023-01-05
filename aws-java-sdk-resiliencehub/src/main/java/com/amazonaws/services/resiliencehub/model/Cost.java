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
package com.amazonaws.services.resiliencehub.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Defines a cost object.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resiliencehub-2020-04-30/Cost" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Cost implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The cost amount.
     * </p>
     */
    private Double amount;
    /**
     * <p>
     * The cost currency, for example <code>USD</code>.
     * </p>
     */
    private String currency;
    /**
     * <p>
     * The cost frequency.
     * </p>
     */
    private String frequency;

    /**
     * <p>
     * The cost amount.
     * </p>
     * 
     * @param amount
     *        The cost amount.
     */

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    /**
     * <p>
     * The cost amount.
     * </p>
     * 
     * @return The cost amount.
     */

    public Double getAmount() {
        return this.amount;
    }

    /**
     * <p>
     * The cost amount.
     * </p>
     * 
     * @param amount
     *        The cost amount.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Cost withAmount(Double amount) {
        setAmount(amount);
        return this;
    }

    /**
     * <p>
     * The cost currency, for example <code>USD</code>.
     * </p>
     * 
     * @param currency
     *        The cost currency, for example <code>USD</code>.
     */

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    /**
     * <p>
     * The cost currency, for example <code>USD</code>.
     * </p>
     * 
     * @return The cost currency, for example <code>USD</code>.
     */

    public String getCurrency() {
        return this.currency;
    }

    /**
     * <p>
     * The cost currency, for example <code>USD</code>.
     * </p>
     * 
     * @param currency
     *        The cost currency, for example <code>USD</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Cost withCurrency(String currency) {
        setCurrency(currency);
        return this;
    }

    /**
     * <p>
     * The cost frequency.
     * </p>
     * 
     * @param frequency
     *        The cost frequency.
     * @see CostFrequency
     */

    public void setFrequency(String frequency) {
        this.frequency = frequency;
    }

    /**
     * <p>
     * The cost frequency.
     * </p>
     * 
     * @return The cost frequency.
     * @see CostFrequency
     */

    public String getFrequency() {
        return this.frequency;
    }

    /**
     * <p>
     * The cost frequency.
     * </p>
     * 
     * @param frequency
     *        The cost frequency.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CostFrequency
     */

    public Cost withFrequency(String frequency) {
        setFrequency(frequency);
        return this;
    }

    /**
     * <p>
     * The cost frequency.
     * </p>
     * 
     * @param frequency
     *        The cost frequency.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CostFrequency
     */

    public Cost withFrequency(CostFrequency frequency) {
        this.frequency = frequency.toString();
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
        if (getAmount() != null)
            sb.append("Amount: ").append(getAmount()).append(",");
        if (getCurrency() != null)
            sb.append("Currency: ").append(getCurrency()).append(",");
        if (getFrequency() != null)
            sb.append("Frequency: ").append(getFrequency());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Cost == false)
            return false;
        Cost other = (Cost) obj;
        if (other.getAmount() == null ^ this.getAmount() == null)
            return false;
        if (other.getAmount() != null && other.getAmount().equals(this.getAmount()) == false)
            return false;
        if (other.getCurrency() == null ^ this.getCurrency() == null)
            return false;
        if (other.getCurrency() != null && other.getCurrency().equals(this.getCurrency()) == false)
            return false;
        if (other.getFrequency() == null ^ this.getFrequency() == null)
            return false;
        if (other.getFrequency() != null && other.getFrequency().equals(this.getFrequency()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAmount() == null) ? 0 : getAmount().hashCode());
        hashCode = prime * hashCode + ((getCurrency() == null) ? 0 : getCurrency().hashCode());
        hashCode = prime * hashCode + ((getFrequency() == null) ? 0 : getFrequency().hashCode());
        return hashCode;
    }

    @Override
    public Cost clone() {
        try {
            return (Cost) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.resiliencehub.model.transform.CostMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
