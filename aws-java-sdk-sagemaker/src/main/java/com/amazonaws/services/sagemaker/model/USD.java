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
package com.amazonaws.services.sagemaker.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Represents an amount of money in United States dollars/
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/USD" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class USD implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The whole number of dollars in the amount.
     * </p>
     */
    private Integer dollars;
    /**
     * <p>
     * The fractional portion, in cents, of the amount.
     * </p>
     */
    private Integer cents;
    /**
     * <p>
     * Fractions of a cent, in tenths.
     * </p>
     */
    private Integer tenthFractionsOfACent;

    /**
     * <p>
     * The whole number of dollars in the amount.
     * </p>
     * 
     * @param dollars
     *        The whole number of dollars in the amount.
     */

    public void setDollars(Integer dollars) {
        this.dollars = dollars;
    }

    /**
     * <p>
     * The whole number of dollars in the amount.
     * </p>
     * 
     * @return The whole number of dollars in the amount.
     */

    public Integer getDollars() {
        return this.dollars;
    }

    /**
     * <p>
     * The whole number of dollars in the amount.
     * </p>
     * 
     * @param dollars
     *        The whole number of dollars in the amount.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public USD withDollars(Integer dollars) {
        setDollars(dollars);
        return this;
    }

    /**
     * <p>
     * The fractional portion, in cents, of the amount.
     * </p>
     * 
     * @param cents
     *        The fractional portion, in cents, of the amount.
     */

    public void setCents(Integer cents) {
        this.cents = cents;
    }

    /**
     * <p>
     * The fractional portion, in cents, of the amount.
     * </p>
     * 
     * @return The fractional portion, in cents, of the amount.
     */

    public Integer getCents() {
        return this.cents;
    }

    /**
     * <p>
     * The fractional portion, in cents, of the amount.
     * </p>
     * 
     * @param cents
     *        The fractional portion, in cents, of the amount.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public USD withCents(Integer cents) {
        setCents(cents);
        return this;
    }

    /**
     * <p>
     * Fractions of a cent, in tenths.
     * </p>
     * 
     * @param tenthFractionsOfACent
     *        Fractions of a cent, in tenths.
     */

    public void setTenthFractionsOfACent(Integer tenthFractionsOfACent) {
        this.tenthFractionsOfACent = tenthFractionsOfACent;
    }

    /**
     * <p>
     * Fractions of a cent, in tenths.
     * </p>
     * 
     * @return Fractions of a cent, in tenths.
     */

    public Integer getTenthFractionsOfACent() {
        return this.tenthFractionsOfACent;
    }

    /**
     * <p>
     * Fractions of a cent, in tenths.
     * </p>
     * 
     * @param tenthFractionsOfACent
     *        Fractions of a cent, in tenths.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public USD withTenthFractionsOfACent(Integer tenthFractionsOfACent) {
        setTenthFractionsOfACent(tenthFractionsOfACent);
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
        if (getDollars() != null)
            sb.append("Dollars: ").append(getDollars()).append(",");
        if (getCents() != null)
            sb.append("Cents: ").append(getCents()).append(",");
        if (getTenthFractionsOfACent() != null)
            sb.append("TenthFractionsOfACent: ").append(getTenthFractionsOfACent());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof USD == false)
            return false;
        USD other = (USD) obj;
        if (other.getDollars() == null ^ this.getDollars() == null)
            return false;
        if (other.getDollars() != null && other.getDollars().equals(this.getDollars()) == false)
            return false;
        if (other.getCents() == null ^ this.getCents() == null)
            return false;
        if (other.getCents() != null && other.getCents().equals(this.getCents()) == false)
            return false;
        if (other.getTenthFractionsOfACent() == null ^ this.getTenthFractionsOfACent() == null)
            return false;
        if (other.getTenthFractionsOfACent() != null && other.getTenthFractionsOfACent().equals(this.getTenthFractionsOfACent()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDollars() == null) ? 0 : getDollars().hashCode());
        hashCode = prime * hashCode + ((getCents() == null) ? 0 : getCents().hashCode());
        hashCode = prime * hashCode + ((getTenthFractionsOfACent() == null) ? 0 : getTenthFractionsOfACent().hashCode());
        return hashCode;
    }

    @Override
    public USD clone() {
        try {
            return (USD) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.USDMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
