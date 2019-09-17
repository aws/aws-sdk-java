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
package com.amazonaws.services.forecastquery.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Provides information about a forecast. Returned as part of the <a>QueryForecast</a> response.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/forecastquery-2018-06-26/Forecast" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Forecast implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The forecast.
     * </p>
     * <p>
     * The <i>string</i> of the string to array map is one of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * mean
     * </p>
     * </li>
     * <li>
     * <p>
     * p10
     * </p>
     * </li>
     * <li>
     * <p>
     * p50
     * </p>
     * </li>
     * <li>
     * <p>
     * p90
     * </p>
     * </li>
     * </ul>
     */
    private java.util.Map<String, java.util.List<DataPoint>> predictions;

    /**
     * <p>
     * The forecast.
     * </p>
     * <p>
     * The <i>string</i> of the string to array map is one of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * mean
     * </p>
     * </li>
     * <li>
     * <p>
     * p10
     * </p>
     * </li>
     * <li>
     * <p>
     * p50
     * </p>
     * </li>
     * <li>
     * <p>
     * p90
     * </p>
     * </li>
     * </ul>
     * 
     * @return The forecast.</p>
     *         <p>
     *         The <i>string</i> of the string to array map is one of the following values:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         mean
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         p10
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         p50
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         p90
     *         </p>
     *         </li>
     */

    public java.util.Map<String, java.util.List<DataPoint>> getPredictions() {
        return predictions;
    }

    /**
     * <p>
     * The forecast.
     * </p>
     * <p>
     * The <i>string</i> of the string to array map is one of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * mean
     * </p>
     * </li>
     * <li>
     * <p>
     * p10
     * </p>
     * </li>
     * <li>
     * <p>
     * p50
     * </p>
     * </li>
     * <li>
     * <p>
     * p90
     * </p>
     * </li>
     * </ul>
     * 
     * @param predictions
     *        The forecast.</p>
     *        <p>
     *        The <i>string</i> of the string to array map is one of the following values:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        mean
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        p10
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        p50
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        p90
     *        </p>
     *        </li>
     */

    public void setPredictions(java.util.Map<String, java.util.List<DataPoint>> predictions) {
        this.predictions = predictions;
    }

    /**
     * <p>
     * The forecast.
     * </p>
     * <p>
     * The <i>string</i> of the string to array map is one of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * mean
     * </p>
     * </li>
     * <li>
     * <p>
     * p10
     * </p>
     * </li>
     * <li>
     * <p>
     * p50
     * </p>
     * </li>
     * <li>
     * <p>
     * p90
     * </p>
     * </li>
     * </ul>
     * 
     * @param predictions
     *        The forecast.</p>
     *        <p>
     *        The <i>string</i> of the string to array map is one of the following values:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        mean
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        p10
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        p50
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        p90
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Forecast withPredictions(java.util.Map<String, java.util.List<DataPoint>> predictions) {
        setPredictions(predictions);
        return this;
    }

    public Forecast addPredictionsEntry(String key, java.util.List<DataPoint> value) {
        if (null == this.predictions) {
            this.predictions = new java.util.HashMap<String, java.util.List<DataPoint>>();
        }
        if (this.predictions.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.predictions.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Predictions.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Forecast clearPredictionsEntries() {
        this.predictions = null;
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
        if (getPredictions() != null)
            sb.append("Predictions: ").append(getPredictions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Forecast == false)
            return false;
        Forecast other = (Forecast) obj;
        if (other.getPredictions() == null ^ this.getPredictions() == null)
            return false;
        if (other.getPredictions() != null && other.getPredictions().equals(this.getPredictions()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPredictions() == null) ? 0 : getPredictions().hashCode());
        return hashCode;
    }

    @Override
    public Forecast clone() {
        try {
            return (Forecast) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.forecastquery.model.transform.ForecastMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
