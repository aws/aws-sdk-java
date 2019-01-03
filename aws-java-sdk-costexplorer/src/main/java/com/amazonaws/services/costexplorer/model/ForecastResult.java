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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The forecast created for your query.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ce-2017-10-25/ForecastResult" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ForecastResult implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The period of time that the forecast covers.
     * </p>
     */
    private DateInterval timePeriod;
    /**
     * <p>
     * The mean value of the forecast.
     * </p>
     */
    private String meanValue;
    /**
     * <p>
     * The lower limit for the prediction interval.
     * </p>
     */
    private String predictionIntervalLowerBound;
    /**
     * <p>
     * The upper limit for the prediction interval.
     * </p>
     */
    private String predictionIntervalUpperBound;

    /**
     * <p>
     * The period of time that the forecast covers.
     * </p>
     * 
     * @param timePeriod
     *        The period of time that the forecast covers.
     */

    public void setTimePeriod(DateInterval timePeriod) {
        this.timePeriod = timePeriod;
    }

    /**
     * <p>
     * The period of time that the forecast covers.
     * </p>
     * 
     * @return The period of time that the forecast covers.
     */

    public DateInterval getTimePeriod() {
        return this.timePeriod;
    }

    /**
     * <p>
     * The period of time that the forecast covers.
     * </p>
     * 
     * @param timePeriod
     *        The period of time that the forecast covers.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ForecastResult withTimePeriod(DateInterval timePeriod) {
        setTimePeriod(timePeriod);
        return this;
    }

    /**
     * <p>
     * The mean value of the forecast.
     * </p>
     * 
     * @param meanValue
     *        The mean value of the forecast.
     */

    public void setMeanValue(String meanValue) {
        this.meanValue = meanValue;
    }

    /**
     * <p>
     * The mean value of the forecast.
     * </p>
     * 
     * @return The mean value of the forecast.
     */

    public String getMeanValue() {
        return this.meanValue;
    }

    /**
     * <p>
     * The mean value of the forecast.
     * </p>
     * 
     * @param meanValue
     *        The mean value of the forecast.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ForecastResult withMeanValue(String meanValue) {
        setMeanValue(meanValue);
        return this;
    }

    /**
     * <p>
     * The lower limit for the prediction interval.
     * </p>
     * 
     * @param predictionIntervalLowerBound
     *        The lower limit for the prediction interval.
     */

    public void setPredictionIntervalLowerBound(String predictionIntervalLowerBound) {
        this.predictionIntervalLowerBound = predictionIntervalLowerBound;
    }

    /**
     * <p>
     * The lower limit for the prediction interval.
     * </p>
     * 
     * @return The lower limit for the prediction interval.
     */

    public String getPredictionIntervalLowerBound() {
        return this.predictionIntervalLowerBound;
    }

    /**
     * <p>
     * The lower limit for the prediction interval.
     * </p>
     * 
     * @param predictionIntervalLowerBound
     *        The lower limit for the prediction interval.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ForecastResult withPredictionIntervalLowerBound(String predictionIntervalLowerBound) {
        setPredictionIntervalLowerBound(predictionIntervalLowerBound);
        return this;
    }

    /**
     * <p>
     * The upper limit for the prediction interval.
     * </p>
     * 
     * @param predictionIntervalUpperBound
     *        The upper limit for the prediction interval.
     */

    public void setPredictionIntervalUpperBound(String predictionIntervalUpperBound) {
        this.predictionIntervalUpperBound = predictionIntervalUpperBound;
    }

    /**
     * <p>
     * The upper limit for the prediction interval.
     * </p>
     * 
     * @return The upper limit for the prediction interval.
     */

    public String getPredictionIntervalUpperBound() {
        return this.predictionIntervalUpperBound;
    }

    /**
     * <p>
     * The upper limit for the prediction interval.
     * </p>
     * 
     * @param predictionIntervalUpperBound
     *        The upper limit for the prediction interval.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ForecastResult withPredictionIntervalUpperBound(String predictionIntervalUpperBound) {
        setPredictionIntervalUpperBound(predictionIntervalUpperBound);
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
        if (getTimePeriod() != null)
            sb.append("TimePeriod: ").append(getTimePeriod()).append(",");
        if (getMeanValue() != null)
            sb.append("MeanValue: ").append(getMeanValue()).append(",");
        if (getPredictionIntervalLowerBound() != null)
            sb.append("PredictionIntervalLowerBound: ").append(getPredictionIntervalLowerBound()).append(",");
        if (getPredictionIntervalUpperBound() != null)
            sb.append("PredictionIntervalUpperBound: ").append(getPredictionIntervalUpperBound());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ForecastResult == false)
            return false;
        ForecastResult other = (ForecastResult) obj;
        if (other.getTimePeriod() == null ^ this.getTimePeriod() == null)
            return false;
        if (other.getTimePeriod() != null && other.getTimePeriod().equals(this.getTimePeriod()) == false)
            return false;
        if (other.getMeanValue() == null ^ this.getMeanValue() == null)
            return false;
        if (other.getMeanValue() != null && other.getMeanValue().equals(this.getMeanValue()) == false)
            return false;
        if (other.getPredictionIntervalLowerBound() == null ^ this.getPredictionIntervalLowerBound() == null)
            return false;
        if (other.getPredictionIntervalLowerBound() != null && other.getPredictionIntervalLowerBound().equals(this.getPredictionIntervalLowerBound()) == false)
            return false;
        if (other.getPredictionIntervalUpperBound() == null ^ this.getPredictionIntervalUpperBound() == null)
            return false;
        if (other.getPredictionIntervalUpperBound() != null && other.getPredictionIntervalUpperBound().equals(this.getPredictionIntervalUpperBound()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTimePeriod() == null) ? 0 : getTimePeriod().hashCode());
        hashCode = prime * hashCode + ((getMeanValue() == null) ? 0 : getMeanValue().hashCode());
        hashCode = prime * hashCode + ((getPredictionIntervalLowerBound() == null) ? 0 : getPredictionIntervalLowerBound().hashCode());
        hashCode = prime * hashCode + ((getPredictionIntervalUpperBound() == null) ? 0 : getPredictionIntervalUpperBound().hashCode());
        return hashCode;
    }

    @Override
    public ForecastResult clone() {
        try {
            return (ForecastResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.costexplorer.model.transform.ForecastResultMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
