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
 * The spend objects that are associated with this budget. The <code>actualSpend</code> tracks how much you've used,
 * cost, usage, or RI units, and the <code>forecastedSpend</code> tracks how much you are predicted to spend if your
 * current usage remains steady.
 * </p>
 * <p>
 * For example, if it is the 20th of the month and you have spent <code>50</code> dollars on Amazon EC2, your
 * <code>actualSpend</code> is <code>50 USD</code>, and your <code>forecastedSpend</code> is <code>75 USD</code>.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CalculatedSpend implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The amount of cost, usage, or RI units that you have used.
     * </p>
     */
    private Spend actualSpend;
    /**
     * <p>
     * The amount of cost, usage, or RI units that you are forecasted to use.
     * </p>
     */
    private Spend forecastedSpend;

    /**
     * <p>
     * The amount of cost, usage, or RI units that you have used.
     * </p>
     * 
     * @param actualSpend
     *        The amount of cost, usage, or RI units that you have used.
     */

    public void setActualSpend(Spend actualSpend) {
        this.actualSpend = actualSpend;
    }

    /**
     * <p>
     * The amount of cost, usage, or RI units that you have used.
     * </p>
     * 
     * @return The amount of cost, usage, or RI units that you have used.
     */

    public Spend getActualSpend() {
        return this.actualSpend;
    }

    /**
     * <p>
     * The amount of cost, usage, or RI units that you have used.
     * </p>
     * 
     * @param actualSpend
     *        The amount of cost, usage, or RI units that you have used.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CalculatedSpend withActualSpend(Spend actualSpend) {
        setActualSpend(actualSpend);
        return this;
    }

    /**
     * <p>
     * The amount of cost, usage, or RI units that you are forecasted to use.
     * </p>
     * 
     * @param forecastedSpend
     *        The amount of cost, usage, or RI units that you are forecasted to use.
     */

    public void setForecastedSpend(Spend forecastedSpend) {
        this.forecastedSpend = forecastedSpend;
    }

    /**
     * <p>
     * The amount of cost, usage, or RI units that you are forecasted to use.
     * </p>
     * 
     * @return The amount of cost, usage, or RI units that you are forecasted to use.
     */

    public Spend getForecastedSpend() {
        return this.forecastedSpend;
    }

    /**
     * <p>
     * The amount of cost, usage, or RI units that you are forecasted to use.
     * </p>
     * 
     * @param forecastedSpend
     *        The amount of cost, usage, or RI units that you are forecasted to use.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CalculatedSpend withForecastedSpend(Spend forecastedSpend) {
        setForecastedSpend(forecastedSpend);
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
        if (getActualSpend() != null)
            sb.append("ActualSpend: ").append(getActualSpend()).append(",");
        if (getForecastedSpend() != null)
            sb.append("ForecastedSpend: ").append(getForecastedSpend());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CalculatedSpend == false)
            return false;
        CalculatedSpend other = (CalculatedSpend) obj;
        if (other.getActualSpend() == null ^ this.getActualSpend() == null)
            return false;
        if (other.getActualSpend() != null && other.getActualSpend().equals(this.getActualSpend()) == false)
            return false;
        if (other.getForecastedSpend() == null ^ this.getForecastedSpend() == null)
            return false;
        if (other.getForecastedSpend() != null && other.getForecastedSpend().equals(this.getForecastedSpend()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getActualSpend() == null) ? 0 : getActualSpend().hashCode());
        hashCode = prime * hashCode + ((getForecastedSpend() == null) ? 0 : getForecastedSpend().hashCode());
        return hashCode;
    }

    @Override
    public CalculatedSpend clone() {
        try {
            return (CalculatedSpend) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.budgets.model.transform.CalculatedSpendMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
