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
package com.amazonaws.services.forecast.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/forecast-2018-06-26/CreateForecast" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateForecastRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name for the forecast.
     * </p>
     */
    private String forecastName;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the predictor to use to generate the forecast.
     * </p>
     */
    private String predictorArn;

    /**
     * <p>
     * The name for the forecast.
     * </p>
     * 
     * @param forecastName
     *        The name for the forecast.
     */

    public void setForecastName(String forecastName) {
        this.forecastName = forecastName;
    }

    /**
     * <p>
     * The name for the forecast.
     * </p>
     * 
     * @return The name for the forecast.
     */

    public String getForecastName() {
        return this.forecastName;
    }

    /**
     * <p>
     * The name for the forecast.
     * </p>
     * 
     * @param forecastName
     *        The name for the forecast.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateForecastRequest withForecastName(String forecastName) {
        setForecastName(forecastName);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the predictor to use to generate the forecast.
     * </p>
     * 
     * @param predictorArn
     *        The Amazon Resource Name (ARN) of the predictor to use to generate the forecast.
     */

    public void setPredictorArn(String predictorArn) {
        this.predictorArn = predictorArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the predictor to use to generate the forecast.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the predictor to use to generate the forecast.
     */

    public String getPredictorArn() {
        return this.predictorArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the predictor to use to generate the forecast.
     * </p>
     * 
     * @param predictorArn
     *        The Amazon Resource Name (ARN) of the predictor to use to generate the forecast.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateForecastRequest withPredictorArn(String predictorArn) {
        setPredictorArn(predictorArn);
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
        if (getForecastName() != null)
            sb.append("ForecastName: ").append(getForecastName()).append(",");
        if (getPredictorArn() != null)
            sb.append("PredictorArn: ").append(getPredictorArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateForecastRequest == false)
            return false;
        CreateForecastRequest other = (CreateForecastRequest) obj;
        if (other.getForecastName() == null ^ this.getForecastName() == null)
            return false;
        if (other.getForecastName() != null && other.getForecastName().equals(this.getForecastName()) == false)
            return false;
        if (other.getPredictorArn() == null ^ this.getPredictorArn() == null)
            return false;
        if (other.getPredictorArn() != null && other.getPredictorArn().equals(this.getPredictorArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getForecastName() == null) ? 0 : getForecastName().hashCode());
        hashCode = prime * hashCode + ((getPredictorArn() == null) ? 0 : getPredictorArn().hashCode());
        return hashCode;
    }

    @Override
    public CreateForecastRequest clone() {
        return (CreateForecastRequest) super.clone();
    }

}
