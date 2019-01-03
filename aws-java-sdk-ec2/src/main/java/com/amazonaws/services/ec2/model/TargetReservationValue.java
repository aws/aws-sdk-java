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
 * The total value of the new Convertible Reserved Instances.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/TargetReservationValue" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TargetReservationValue implements Serializable, Cloneable {

    /**
     * <p>
     * The total value of the Convertible Reserved Instances that make up the exchange. This is the sum of the list
     * value, remaining upfront price, and additional upfront cost of the exchange.
     * </p>
     */
    private ReservationValue reservationValue;
    /**
     * <p>
     * The configuration of the Convertible Reserved Instances that make up the exchange.
     * </p>
     */
    private TargetConfiguration targetConfiguration;

    /**
     * <p>
     * The total value of the Convertible Reserved Instances that make up the exchange. This is the sum of the list
     * value, remaining upfront price, and additional upfront cost of the exchange.
     * </p>
     * 
     * @param reservationValue
     *        The total value of the Convertible Reserved Instances that make up the exchange. This is the sum of the
     *        list value, remaining upfront price, and additional upfront cost of the exchange.
     */

    public void setReservationValue(ReservationValue reservationValue) {
        this.reservationValue = reservationValue;
    }

    /**
     * <p>
     * The total value of the Convertible Reserved Instances that make up the exchange. This is the sum of the list
     * value, remaining upfront price, and additional upfront cost of the exchange.
     * </p>
     * 
     * @return The total value of the Convertible Reserved Instances that make up the exchange. This is the sum of the
     *         list value, remaining upfront price, and additional upfront cost of the exchange.
     */

    public ReservationValue getReservationValue() {
        return this.reservationValue;
    }

    /**
     * <p>
     * The total value of the Convertible Reserved Instances that make up the exchange. This is the sum of the list
     * value, remaining upfront price, and additional upfront cost of the exchange.
     * </p>
     * 
     * @param reservationValue
     *        The total value of the Convertible Reserved Instances that make up the exchange. This is the sum of the
     *        list value, remaining upfront price, and additional upfront cost of the exchange.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TargetReservationValue withReservationValue(ReservationValue reservationValue) {
        setReservationValue(reservationValue);
        return this;
    }

    /**
     * <p>
     * The configuration of the Convertible Reserved Instances that make up the exchange.
     * </p>
     * 
     * @param targetConfiguration
     *        The configuration of the Convertible Reserved Instances that make up the exchange.
     */

    public void setTargetConfiguration(TargetConfiguration targetConfiguration) {
        this.targetConfiguration = targetConfiguration;
    }

    /**
     * <p>
     * The configuration of the Convertible Reserved Instances that make up the exchange.
     * </p>
     * 
     * @return The configuration of the Convertible Reserved Instances that make up the exchange.
     */

    public TargetConfiguration getTargetConfiguration() {
        return this.targetConfiguration;
    }

    /**
     * <p>
     * The configuration of the Convertible Reserved Instances that make up the exchange.
     * </p>
     * 
     * @param targetConfiguration
     *        The configuration of the Convertible Reserved Instances that make up the exchange.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TargetReservationValue withTargetConfiguration(TargetConfiguration targetConfiguration) {
        setTargetConfiguration(targetConfiguration);
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
        if (getReservationValue() != null)
            sb.append("ReservationValue: ").append(getReservationValue()).append(",");
        if (getTargetConfiguration() != null)
            sb.append("TargetConfiguration: ").append(getTargetConfiguration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TargetReservationValue == false)
            return false;
        TargetReservationValue other = (TargetReservationValue) obj;
        if (other.getReservationValue() == null ^ this.getReservationValue() == null)
            return false;
        if (other.getReservationValue() != null && other.getReservationValue().equals(this.getReservationValue()) == false)
            return false;
        if (other.getTargetConfiguration() == null ^ this.getTargetConfiguration() == null)
            return false;
        if (other.getTargetConfiguration() != null && other.getTargetConfiguration().equals(this.getTargetConfiguration()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getReservationValue() == null) ? 0 : getReservationValue().hashCode());
        hashCode = prime * hashCode + ((getTargetConfiguration() == null) ? 0 : getTargetConfiguration().hashCode());
        return hashCode;
    }

    @Override
    public TargetReservationValue clone() {
        try {
            return (TargetReservationValue) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
