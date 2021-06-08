/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.guardduty.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains the total usage with the corresponding currency unit for that value.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/Total" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Total implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The total usage.
     * </p>
     */
    private String amount;
    /**
     * <p>
     * The currency unit that the amount is given in.
     * </p>
     */
    private String unit;

    /**
     * <p>
     * The total usage.
     * </p>
     * 
     * @param amount
     *        The total usage.
     */

    public void setAmount(String amount) {
        this.amount = amount;
    }

    /**
     * <p>
     * The total usage.
     * </p>
     * 
     * @return The total usage.
     */

    public String getAmount() {
        return this.amount;
    }

    /**
     * <p>
     * The total usage.
     * </p>
     * 
     * @param amount
     *        The total usage.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Total withAmount(String amount) {
        setAmount(amount);
        return this;
    }

    /**
     * <p>
     * The currency unit that the amount is given in.
     * </p>
     * 
     * @param unit
     *        The currency unit that the amount is given in.
     */

    public void setUnit(String unit) {
        this.unit = unit;
    }

    /**
     * <p>
     * The currency unit that the amount is given in.
     * </p>
     * 
     * @return The currency unit that the amount is given in.
     */

    public String getUnit() {
        return this.unit;
    }

    /**
     * <p>
     * The currency unit that the amount is given in.
     * </p>
     * 
     * @param unit
     *        The currency unit that the amount is given in.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Total withUnit(String unit) {
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

        if (obj instanceof Total == false)
            return false;
        Total other = (Total) obj;
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
    public Total clone() {
        try {
            return (Total) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.guardduty.model.transform.TotalMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
