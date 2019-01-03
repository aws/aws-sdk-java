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
package com.amazonaws.services.budgets.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The amount of cost or usage that is measured for a budget.
 * </p>
 * <p>
 * For example, a <code>Spend</code> for <code>3 GB</code> of S3 usage would have the following parameters:
 * </p>
 * <ul>
 * <li>
 * <p>
 * An <code>Amount</code> of <code>3</code>
 * </p>
 * </li>
 * <li>
 * <p>
 * A <code>unit</code> of <code>GB</code>
 * </p>
 * </li>
 * </ul>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Spend implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The cost or usage amount that is associated with a budget forecast, actual spend, or budget threshold.
     * </p>
     */
    private java.math.BigDecimal amount;
    /**
     * <p>
     * The unit of measurement that is used for the budget forecast, actual spend, or budget threshold, such as dollars
     * or GB.
     * </p>
     */
    private String unit;

    /**
     * <p>
     * The cost or usage amount that is associated with a budget forecast, actual spend, or budget threshold.
     * </p>
     * 
     * @param amount
     *        The cost or usage amount that is associated with a budget forecast, actual spend, or budget threshold.
     */

    public void setAmount(java.math.BigDecimal amount) {
        this.amount = amount;
    }

    /**
     * <p>
     * The cost or usage amount that is associated with a budget forecast, actual spend, or budget threshold.
     * </p>
     * 
     * @return The cost or usage amount that is associated with a budget forecast, actual spend, or budget threshold.
     */

    public java.math.BigDecimal getAmount() {
        return this.amount;
    }

    /**
     * <p>
     * The cost or usage amount that is associated with a budget forecast, actual spend, or budget threshold.
     * </p>
     * 
     * @param amount
     *        The cost or usage amount that is associated with a budget forecast, actual spend, or budget threshold.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Spend withAmount(java.math.BigDecimal amount) {
        setAmount(amount);
        return this;
    }

    /**
     * <p>
     * The unit of measurement that is used for the budget forecast, actual spend, or budget threshold, such as dollars
     * or GB.
     * </p>
     * 
     * @param unit
     *        The unit of measurement that is used for the budget forecast, actual spend, or budget threshold, such as
     *        dollars or GB.
     */

    public void setUnit(String unit) {
        this.unit = unit;
    }

    /**
     * <p>
     * The unit of measurement that is used for the budget forecast, actual spend, or budget threshold, such as dollars
     * or GB.
     * </p>
     * 
     * @return The unit of measurement that is used for the budget forecast, actual spend, or budget threshold, such as
     *         dollars or GB.
     */

    public String getUnit() {
        return this.unit;
    }

    /**
     * <p>
     * The unit of measurement that is used for the budget forecast, actual spend, or budget threshold, such as dollars
     * or GB.
     * </p>
     * 
     * @param unit
     *        The unit of measurement that is used for the budget forecast, actual spend, or budget threshold, such as
     *        dollars or GB.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Spend withUnit(String unit) {
        setUnit(unit);
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
        if (getUnit() != null)
            sb.append("Unit: ").append(getUnit());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Spend == false)
            return false;
        Spend other = (Spend) obj;
        if (other.getAmount() == null ^ this.getAmount() == null)
            return false;
        if (other.getAmount() != null && other.getAmount().equals(this.getAmount()) == false)
            return false;
        if (other.getUnit() == null ^ this.getUnit() == null)
            return false;
        if (other.getUnit() != null && other.getUnit().equals(this.getUnit()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAmount() == null) ? 0 : getAmount().hashCode());
        hashCode = prime * hashCode + ((getUnit() == null) ? 0 : getUnit().hashCode());
        return hashCode;
    }

    @Override
    public Spend clone() {
        try {
            return (Spend) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.budgets.model.transform.SpendMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
