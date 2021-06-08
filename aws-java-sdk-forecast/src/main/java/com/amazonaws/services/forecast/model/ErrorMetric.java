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
package com.amazonaws.services.forecast.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Provides detailed error metrics to evaluate the performance of a predictor. This object is part of the <a>Metrics</a>
 * object.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/forecast-2018-06-26/ErrorMetric" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ErrorMetric implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Forecast type used to compute WAPE and RMSE.
     * </p>
     */
    private String forecastType;
    /**
     * <p>
     * The weighted absolute percentage error (WAPE).
     * </p>
     */
    private Double wAPE;
    /**
     * <p>
     * The root-mean-square error (RMSE).
     * </p>
     */
    private Double rMSE;

    /**
     * <p>
     * The Forecast type used to compute WAPE and RMSE.
     * </p>
     * 
     * @param forecastType
     *        The Forecast type used to compute WAPE and RMSE.
     */

    public void setForecastType(String forecastType) {
        this.forecastType = forecastType;
    }

    /**
     * <p>
     * The Forecast type used to compute WAPE and RMSE.
     * </p>
     * 
     * @return The Forecast type used to compute WAPE and RMSE.
     */

    public String getForecastType() {
        return this.forecastType;
    }

    /**
     * <p>
     * The Forecast type used to compute WAPE and RMSE.
     * </p>
     * 
     * @param forecastType
     *        The Forecast type used to compute WAPE and RMSE.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ErrorMetric withForecastType(String forecastType) {
        setForecastType(forecastType);
        return this;
    }

    /**
     * <p>
     * The weighted absolute percentage error (WAPE).
     * </p>
     * 
     * @param wAPE
     *        The weighted absolute percentage error (WAPE).
     */

    public void setWAPE(Double wAPE) {
        this.wAPE = wAPE;
    }

    /**
     * <p>
     * The weighted absolute percentage error (WAPE).
     * </p>
     * 
     * @return The weighted absolute percentage error (WAPE).
     */

    public Double getWAPE() {
        return this.wAPE;
    }

    /**
     * <p>
     * The weighted absolute percentage error (WAPE).
     * </p>
     * 
     * @param wAPE
     *        The weighted absolute percentage error (WAPE).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ErrorMetric withWAPE(Double wAPE) {
        setWAPE(wAPE);
        return this;
    }

    /**
     * <p>
     * The root-mean-square error (RMSE).
     * </p>
     * 
     * @param rMSE
     *        The root-mean-square error (RMSE).
     */

    public void setRMSE(Double rMSE) {
        this.rMSE = rMSE;
    }

    /**
     * <p>
     * The root-mean-square error (RMSE).
     * </p>
     * 
     * @return The root-mean-square error (RMSE).
     */

    public Double getRMSE() {
        return this.rMSE;
    }

    /**
     * <p>
     * The root-mean-square error (RMSE).
     * </p>
     * 
     * @param rMSE
     *        The root-mean-square error (RMSE).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ErrorMetric withRMSE(Double rMSE) {
        setRMSE(rMSE);
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
        if (getForecastType() != null)
            sb.append("ForecastType: ").append(getForecastType()).append(",");
        if (getWAPE() != null)
            sb.append("WAPE: ").append(getWAPE()).append(",");
        if (getRMSE() != null)
            sb.append("RMSE: ").append(getRMSE());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ErrorMetric == false)
            return false;
        ErrorMetric other = (ErrorMetric) obj;
        if (other.getForecastType() == null ^ this.getForecastType() == null)
            return false;
        if (other.getForecastType() != null && other.getForecastType().equals(this.getForecastType()) == false)
            return false;
        if (other.getWAPE() == null ^ this.getWAPE() == null)
            return false;
        if (other.getWAPE() != null && other.getWAPE().equals(this.getWAPE()) == false)
            return false;
        if (other.getRMSE() == null ^ this.getRMSE() == null)
            return false;
        if (other.getRMSE() != null && other.getRMSE().equals(this.getRMSE()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getForecastType() == null) ? 0 : getForecastType().hashCode());
        hashCode = prime * hashCode + ((getWAPE() == null) ? 0 : getWAPE().hashCode());
        hashCode = prime * hashCode + ((getRMSE() == null) ? 0 : getRMSE().hashCode());
        return hashCode;
    }

    @Override
    public ErrorMetric clone() {
        try {
            return (ErrorMetric) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.forecast.model.transform.ErrorMetricMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
