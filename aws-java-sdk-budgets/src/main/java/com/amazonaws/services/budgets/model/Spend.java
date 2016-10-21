/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

/**
 * A structure represent either a cost spend or usage spend. Contains an amount and a unit.
 */
public class Spend implements Serializable, Cloneable {

    private java.math.BigDecimal amount;

    private String unit;

    /**
     * @param amount
     */

    public void setAmount(java.math.BigDecimal amount) {
        this.amount = amount;
    }

    /**
     * @return
     */

    public java.math.BigDecimal getAmount() {
        return this.amount;
    }

    /**
     * @param amount
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Spend withAmount(java.math.BigDecimal amount) {
        setAmount(amount);
        return this;
    }

    /**
     * @param unit
     */

    public void setUnit(String unit) {
        this.unit = unit;
    }

    /**
     * @return
     */

    public String getUnit() {
        return this.unit;
    }

    /**
     * @param unit
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Spend withUnit(String unit) {
        setUnit(unit);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
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
            sb.append("Amount: " + getAmount() + ",");
        if (getUnit() != null)
            sb.append("Unit: " + getUnit());
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
}
