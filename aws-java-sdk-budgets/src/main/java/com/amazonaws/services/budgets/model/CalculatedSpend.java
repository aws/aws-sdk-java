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
 * A structure holds the actual and forecasted spend for a budget.
 */
public class CalculatedSpend implements Serializable, Cloneable {

    private Spend actualSpend;

    private Spend forecastedSpend;

    /**
     * @param actualSpend
     */

    public void setActualSpend(Spend actualSpend) {
        this.actualSpend = actualSpend;
    }

    /**
     * @return
     */

    public Spend getActualSpend() {
        return this.actualSpend;
    }

    /**
     * @param actualSpend
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CalculatedSpend withActualSpend(Spend actualSpend) {
        setActualSpend(actualSpend);
        return this;
    }

    /**
     * @param forecastedSpend
     */

    public void setForecastedSpend(Spend forecastedSpend) {
        this.forecastedSpend = forecastedSpend;
    }

    /**
     * @return
     */

    public Spend getForecastedSpend() {
        return this.forecastedSpend;
    }

    /**
     * @param forecastedSpend
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CalculatedSpend withForecastedSpend(Spend forecastedSpend) {
        setForecastedSpend(forecastedSpend);
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
        if (getActualSpend() != null)
            sb.append("ActualSpend: " + getActualSpend() + ",");
        if (getForecastedSpend() != null)
            sb.append("ForecastedSpend: " + getForecastedSpend());
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
}
