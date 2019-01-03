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
package com.amazonaws.services.costexplorer.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ce-2017-10-25/GetCostForecast" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetCostForecastResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * How much you are forecasted to spend over the forecast period, in <code>USD</code>.
     * </p>
     */
    private MetricValue total;
    /**
     * <p>
     * The forecasts for your query, in order. For <code>DAILY</code> forecasts, this is a list of days. For
     * <code>MONTHLY</code> forecasts, this is a list of months.
     * </p>
     */
    private java.util.List<ForecastResult> forecastResultsByTime;

    /**
     * <p>
     * How much you are forecasted to spend over the forecast period, in <code>USD</code>.
     * </p>
     * 
     * @param total
     *        How much you are forecasted to spend over the forecast period, in <code>USD</code>.
     */

    public void setTotal(MetricValue total) {
        this.total = total;
    }

    /**
     * <p>
     * How much you are forecasted to spend over the forecast period, in <code>USD</code>.
     * </p>
     * 
     * @return How much you are forecasted to spend over the forecast period, in <code>USD</code>.
     */

    public MetricValue getTotal() {
        return this.total;
    }

    /**
     * <p>
     * How much you are forecasted to spend over the forecast period, in <code>USD</code>.
     * </p>
     * 
     * @param total
     *        How much you are forecasted to spend over the forecast period, in <code>USD</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetCostForecastResult withTotal(MetricValue total) {
        setTotal(total);
        return this;
    }

    /**
     * <p>
     * The forecasts for your query, in order. For <code>DAILY</code> forecasts, this is a list of days. For
     * <code>MONTHLY</code> forecasts, this is a list of months.
     * </p>
     * 
     * @return The forecasts for your query, in order. For <code>DAILY</code> forecasts, this is a list of days. For
     *         <code>MONTHLY</code> forecasts, this is a list of months.
     */

    public java.util.List<ForecastResult> getForecastResultsByTime() {
        return forecastResultsByTime;
    }

    /**
     * <p>
     * The forecasts for your query, in order. For <code>DAILY</code> forecasts, this is a list of days. For
     * <code>MONTHLY</code> forecasts, this is a list of months.
     * </p>
     * 
     * @param forecastResultsByTime
     *        The forecasts for your query, in order. For <code>DAILY</code> forecasts, this is a list of days. For
     *        <code>MONTHLY</code> forecasts, this is a list of months.
     */

    public void setForecastResultsByTime(java.util.Collection<ForecastResult> forecastResultsByTime) {
        if (forecastResultsByTime == null) {
            this.forecastResultsByTime = null;
            return;
        }

        this.forecastResultsByTime = new java.util.ArrayList<ForecastResult>(forecastResultsByTime);
    }

    /**
     * <p>
     * The forecasts for your query, in order. For <code>DAILY</code> forecasts, this is a list of days. For
     * <code>MONTHLY</code> forecasts, this is a list of months.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setForecastResultsByTime(java.util.Collection)} or
     * {@link #withForecastResultsByTime(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param forecastResultsByTime
     *        The forecasts for your query, in order. For <code>DAILY</code> forecasts, this is a list of days. For
     *        <code>MONTHLY</code> forecasts, this is a list of months.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetCostForecastResult withForecastResultsByTime(ForecastResult... forecastResultsByTime) {
        if (this.forecastResultsByTime == null) {
            setForecastResultsByTime(new java.util.ArrayList<ForecastResult>(forecastResultsByTime.length));
        }
        for (ForecastResult ele : forecastResultsByTime) {
            this.forecastResultsByTime.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The forecasts for your query, in order. For <code>DAILY</code> forecasts, this is a list of days. For
     * <code>MONTHLY</code> forecasts, this is a list of months.
     * </p>
     * 
     * @param forecastResultsByTime
     *        The forecasts for your query, in order. For <code>DAILY</code> forecasts, this is a list of days. For
     *        <code>MONTHLY</code> forecasts, this is a list of months.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetCostForecastResult withForecastResultsByTime(java.util.Collection<ForecastResult> forecastResultsByTime) {
        setForecastResultsByTime(forecastResultsByTime);
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
        if (getTotal() != null)
            sb.append("Total: ").append(getTotal()).append(",");
        if (getForecastResultsByTime() != null)
            sb.append("ForecastResultsByTime: ").append(getForecastResultsByTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetCostForecastResult == false)
            return false;
        GetCostForecastResult other = (GetCostForecastResult) obj;
        if (other.getTotal() == null ^ this.getTotal() == null)
            return false;
        if (other.getTotal() != null && other.getTotal().equals(this.getTotal()) == false)
            return false;
        if (other.getForecastResultsByTime() == null ^ this.getForecastResultsByTime() == null)
            return false;
        if (other.getForecastResultsByTime() != null && other.getForecastResultsByTime().equals(this.getForecastResultsByTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTotal() == null) ? 0 : getTotal().hashCode());
        hashCode = prime * hashCode + ((getForecastResultsByTime() == null) ? 0 : getForecastResultsByTime().hashCode());
        return hashCode;
    }

    @Override
    public GetCostForecastResult clone() {
        try {
            return (GetCostForecastResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
