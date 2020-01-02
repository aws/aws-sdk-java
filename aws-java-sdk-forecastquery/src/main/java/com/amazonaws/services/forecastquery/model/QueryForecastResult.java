/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.forecastquery.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/forecastquery-2018-06-26/QueryForecast" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class QueryForecastResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The forecast.
     * </p>
     */
    private Forecast forecast;

    /**
     * <p>
     * The forecast.
     * </p>
     * 
     * @param forecast
     *        The forecast.
     */

    public void setForecast(Forecast forecast) {
        this.forecast = forecast;
    }

    /**
     * <p>
     * The forecast.
     * </p>
     * 
     * @return The forecast.
     */

    public Forecast getForecast() {
        return this.forecast;
    }

    /**
     * <p>
     * The forecast.
     * </p>
     * 
     * @param forecast
     *        The forecast.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public QueryForecastResult withForecast(Forecast forecast) {
        setForecast(forecast);
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
        if (getForecast() != null)
            sb.append("Forecast: ").append(getForecast());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof QueryForecastResult == false)
            return false;
        QueryForecastResult other = (QueryForecastResult) obj;
        if (other.getForecast() == null ^ this.getForecast() == null)
            return false;
        if (other.getForecast() != null && other.getForecast().equals(this.getForecast()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getForecast() == null) ? 0 : getForecast().hashCode());
        return hashCode;
    }

    @Override
    public QueryForecastResult clone() {
        try {
            return (QueryForecastResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
