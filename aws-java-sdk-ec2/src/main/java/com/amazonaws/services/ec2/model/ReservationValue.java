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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * The cost associated with the Reserved Instance.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/ReservationValue" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ReservationValue implements Serializable, Cloneable {

    /**
     * <p>
     * The hourly rate of the reservation.
     * </p>
     */
    private String hourlyPrice;
    /**
     * <p>
     * The balance of the total value (the sum of remainingUpfrontValue + hourlyPrice * number of hours remaining).
     * </p>
     */
    private String remainingTotalValue;
    /**
     * <p>
     * The remaining upfront cost of the reservation.
     * </p>
     */
    private String remainingUpfrontValue;

    /**
     * <p>
     * The hourly rate of the reservation.
     * </p>
     * 
     * @param hourlyPrice
     *        The hourly rate of the reservation.
     */

    public void setHourlyPrice(String hourlyPrice) {
        this.hourlyPrice = hourlyPrice;
    }

    /**
     * <p>
     * The hourly rate of the reservation.
     * </p>
     * 
     * @return The hourly rate of the reservation.
     */

    public String getHourlyPrice() {
        return this.hourlyPrice;
    }

    /**
     * <p>
     * The hourly rate of the reservation.
     * </p>
     * 
     * @param hourlyPrice
     *        The hourly rate of the reservation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReservationValue withHourlyPrice(String hourlyPrice) {
        setHourlyPrice(hourlyPrice);
        return this;
    }

    /**
     * <p>
     * The balance of the total value (the sum of remainingUpfrontValue + hourlyPrice * number of hours remaining).
     * </p>
     * 
     * @param remainingTotalValue
     *        The balance of the total value (the sum of remainingUpfrontValue + hourlyPrice * number of hours
     *        remaining).
     */

    public void setRemainingTotalValue(String remainingTotalValue) {
        this.remainingTotalValue = remainingTotalValue;
    }

    /**
     * <p>
     * The balance of the total value (the sum of remainingUpfrontValue + hourlyPrice * number of hours remaining).
     * </p>
     * 
     * @return The balance of the total value (the sum of remainingUpfrontValue + hourlyPrice * number of hours
     *         remaining).
     */

    public String getRemainingTotalValue() {
        return this.remainingTotalValue;
    }

    /**
     * <p>
     * The balance of the total value (the sum of remainingUpfrontValue + hourlyPrice * number of hours remaining).
     * </p>
     * 
     * @param remainingTotalValue
     *        The balance of the total value (the sum of remainingUpfrontValue + hourlyPrice * number of hours
     *        remaining).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReservationValue withRemainingTotalValue(String remainingTotalValue) {
        setRemainingTotalValue(remainingTotalValue);
        return this;
    }

    /**
     * <p>
     * The remaining upfront cost of the reservation.
     * </p>
     * 
     * @param remainingUpfrontValue
     *        The remaining upfront cost of the reservation.
     */

    public void setRemainingUpfrontValue(String remainingUpfrontValue) {
        this.remainingUpfrontValue = remainingUpfrontValue;
    }

    /**
     * <p>
     * The remaining upfront cost of the reservation.
     * </p>
     * 
     * @return The remaining upfront cost of the reservation.
     */

    public String getRemainingUpfrontValue() {
        return this.remainingUpfrontValue;
    }

    /**
     * <p>
     * The remaining upfront cost of the reservation.
     * </p>
     * 
     * @param remainingUpfrontValue
     *        The remaining upfront cost of the reservation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReservationValue withRemainingUpfrontValue(String remainingUpfrontValue) {
        setRemainingUpfrontValue(remainingUpfrontValue);
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
        if (getHourlyPrice() != null)
            sb.append("HourlyPrice: ").append(getHourlyPrice()).append(",");
        if (getRemainingTotalValue() != null)
            sb.append("RemainingTotalValue: ").append(getRemainingTotalValue()).append(",");
        if (getRemainingUpfrontValue() != null)
            sb.append("RemainingUpfrontValue: ").append(getRemainingUpfrontValue());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ReservationValue == false)
            return false;
        ReservationValue other = (ReservationValue) obj;
        if (other.getHourlyPrice() == null ^ this.getHourlyPrice() == null)
            return false;
        if (other.getHourlyPrice() != null && other.getHourlyPrice().equals(this.getHourlyPrice()) == false)
            return false;
        if (other.getRemainingTotalValue() == null ^ this.getRemainingTotalValue() == null)
            return false;
        if (other.getRemainingTotalValue() != null && other.getRemainingTotalValue().equals(this.getRemainingTotalValue()) == false)
            return false;
        if (other.getRemainingUpfrontValue() == null ^ this.getRemainingUpfrontValue() == null)
            return false;
        if (other.getRemainingUpfrontValue() != null && other.getRemainingUpfrontValue().equals(this.getRemainingUpfrontValue()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getHourlyPrice() == null) ? 0 : getHourlyPrice().hashCode());
        hashCode = prime * hashCode + ((getRemainingTotalValue() == null) ? 0 : getRemainingTotalValue().hashCode());
        hashCode = prime * hashCode + ((getRemainingUpfrontValue() == null) ? 0 : getRemainingUpfrontValue().hashCode());
        return hashCode;
    }

    @Override
    public ReservationValue clone() {
        try {
            return (ReservationValue) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
