/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.quicksight.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The forecast properties setup of a forecast in the line chart.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/TimeBasedForecastProperties"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TimeBasedForecastProperties implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The periods forward setup of a forecast computation.
     * </p>
     */
    private Integer periodsForward;
    /**
     * <p>
     * The periods backward setup of a forecast computation.
     * </p>
     */
    private Integer periodsBackward;
    /**
     * <p>
     * The upper boundary setup of a forecast computation.
     * </p>
     */
    private Double upperBoundary;
    /**
     * <p>
     * The lower boundary setup of a forecast computation.
     * </p>
     */
    private Double lowerBoundary;
    /**
     * <p>
     * The prediction interval setup of a forecast computation.
     * </p>
     */
    private Integer predictionInterval;
    /**
     * <p>
     * The seasonality setup of a forecast computation. Choose one of the following options:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>NULL</code>: The input is set to <code>NULL</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NON_NULL</code>: The input is set to a custom value.
     * </p>
     * </li>
     * </ul>
     */
    private Integer seasonality;

    /**
     * <p>
     * The periods forward setup of a forecast computation.
     * </p>
     * 
     * @param periodsForward
     *        The periods forward setup of a forecast computation.
     */

    public void setPeriodsForward(Integer periodsForward) {
        this.periodsForward = periodsForward;
    }

    /**
     * <p>
     * The periods forward setup of a forecast computation.
     * </p>
     * 
     * @return The periods forward setup of a forecast computation.
     */

    public Integer getPeriodsForward() {
        return this.periodsForward;
    }

    /**
     * <p>
     * The periods forward setup of a forecast computation.
     * </p>
     * 
     * @param periodsForward
     *        The periods forward setup of a forecast computation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TimeBasedForecastProperties withPeriodsForward(Integer periodsForward) {
        setPeriodsForward(periodsForward);
        return this;
    }

    /**
     * <p>
     * The periods backward setup of a forecast computation.
     * </p>
     * 
     * @param periodsBackward
     *        The periods backward setup of a forecast computation.
     */

    public void setPeriodsBackward(Integer periodsBackward) {
        this.periodsBackward = periodsBackward;
    }

    /**
     * <p>
     * The periods backward setup of a forecast computation.
     * </p>
     * 
     * @return The periods backward setup of a forecast computation.
     */

    public Integer getPeriodsBackward() {
        return this.periodsBackward;
    }

    /**
     * <p>
     * The periods backward setup of a forecast computation.
     * </p>
     * 
     * @param periodsBackward
     *        The periods backward setup of a forecast computation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TimeBasedForecastProperties withPeriodsBackward(Integer periodsBackward) {
        setPeriodsBackward(periodsBackward);
        return this;
    }

    /**
     * <p>
     * The upper boundary setup of a forecast computation.
     * </p>
     * 
     * @param upperBoundary
     *        The upper boundary setup of a forecast computation.
     */

    public void setUpperBoundary(Double upperBoundary) {
        this.upperBoundary = upperBoundary;
    }

    /**
     * <p>
     * The upper boundary setup of a forecast computation.
     * </p>
     * 
     * @return The upper boundary setup of a forecast computation.
     */

    public Double getUpperBoundary() {
        return this.upperBoundary;
    }

    /**
     * <p>
     * The upper boundary setup of a forecast computation.
     * </p>
     * 
     * @param upperBoundary
     *        The upper boundary setup of a forecast computation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TimeBasedForecastProperties withUpperBoundary(Double upperBoundary) {
        setUpperBoundary(upperBoundary);
        return this;
    }

    /**
     * <p>
     * The lower boundary setup of a forecast computation.
     * </p>
     * 
     * @param lowerBoundary
     *        The lower boundary setup of a forecast computation.
     */

    public void setLowerBoundary(Double lowerBoundary) {
        this.lowerBoundary = lowerBoundary;
    }

    /**
     * <p>
     * The lower boundary setup of a forecast computation.
     * </p>
     * 
     * @return The lower boundary setup of a forecast computation.
     */

    public Double getLowerBoundary() {
        return this.lowerBoundary;
    }

    /**
     * <p>
     * The lower boundary setup of a forecast computation.
     * </p>
     * 
     * @param lowerBoundary
     *        The lower boundary setup of a forecast computation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TimeBasedForecastProperties withLowerBoundary(Double lowerBoundary) {
        setLowerBoundary(lowerBoundary);
        return this;
    }

    /**
     * <p>
     * The prediction interval setup of a forecast computation.
     * </p>
     * 
     * @param predictionInterval
     *        The prediction interval setup of a forecast computation.
     */

    public void setPredictionInterval(Integer predictionInterval) {
        this.predictionInterval = predictionInterval;
    }

    /**
     * <p>
     * The prediction interval setup of a forecast computation.
     * </p>
     * 
     * @return The prediction interval setup of a forecast computation.
     */

    public Integer getPredictionInterval() {
        return this.predictionInterval;
    }

    /**
     * <p>
     * The prediction interval setup of a forecast computation.
     * </p>
     * 
     * @param predictionInterval
     *        The prediction interval setup of a forecast computation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TimeBasedForecastProperties withPredictionInterval(Integer predictionInterval) {
        setPredictionInterval(predictionInterval);
        return this;
    }

    /**
     * <p>
     * The seasonality setup of a forecast computation. Choose one of the following options:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>NULL</code>: The input is set to <code>NULL</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NON_NULL</code>: The input is set to a custom value.
     * </p>
     * </li>
     * </ul>
     * 
     * @param seasonality
     *        The seasonality setup of a forecast computation. Choose one of the following options:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>NULL</code>: The input is set to <code>NULL</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>NON_NULL</code>: The input is set to a custom value.
     *        </p>
     *        </li>
     */

    public void setSeasonality(Integer seasonality) {
        this.seasonality = seasonality;
    }

    /**
     * <p>
     * The seasonality setup of a forecast computation. Choose one of the following options:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>NULL</code>: The input is set to <code>NULL</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NON_NULL</code>: The input is set to a custom value.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The seasonality setup of a forecast computation. Choose one of the following options:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>NULL</code>: The input is set to <code>NULL</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>NON_NULL</code>: The input is set to a custom value.
     *         </p>
     *         </li>
     */

    public Integer getSeasonality() {
        return this.seasonality;
    }

    /**
     * <p>
     * The seasonality setup of a forecast computation. Choose one of the following options:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>NULL</code>: The input is set to <code>NULL</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NON_NULL</code>: The input is set to a custom value.
     * </p>
     * </li>
     * </ul>
     * 
     * @param seasonality
     *        The seasonality setup of a forecast computation. Choose one of the following options:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>NULL</code>: The input is set to <code>NULL</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>NON_NULL</code>: The input is set to a custom value.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TimeBasedForecastProperties withSeasonality(Integer seasonality) {
        setSeasonality(seasonality);
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
        if (getPeriodsForward() != null)
            sb.append("PeriodsForward: ").append(getPeriodsForward()).append(",");
        if (getPeriodsBackward() != null)
            sb.append("PeriodsBackward: ").append(getPeriodsBackward()).append(",");
        if (getUpperBoundary() != null)
            sb.append("UpperBoundary: ").append(getUpperBoundary()).append(",");
        if (getLowerBoundary() != null)
            sb.append("LowerBoundary: ").append(getLowerBoundary()).append(",");
        if (getPredictionInterval() != null)
            sb.append("PredictionInterval: ").append(getPredictionInterval()).append(",");
        if (getSeasonality() != null)
            sb.append("Seasonality: ").append(getSeasonality());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TimeBasedForecastProperties == false)
            return false;
        TimeBasedForecastProperties other = (TimeBasedForecastProperties) obj;
        if (other.getPeriodsForward() == null ^ this.getPeriodsForward() == null)
            return false;
        if (other.getPeriodsForward() != null && other.getPeriodsForward().equals(this.getPeriodsForward()) == false)
            return false;
        if (other.getPeriodsBackward() == null ^ this.getPeriodsBackward() == null)
            return false;
        if (other.getPeriodsBackward() != null && other.getPeriodsBackward().equals(this.getPeriodsBackward()) == false)
            return false;
        if (other.getUpperBoundary() == null ^ this.getUpperBoundary() == null)
            return false;
        if (other.getUpperBoundary() != null && other.getUpperBoundary().equals(this.getUpperBoundary()) == false)
            return false;
        if (other.getLowerBoundary() == null ^ this.getLowerBoundary() == null)
            return false;
        if (other.getLowerBoundary() != null && other.getLowerBoundary().equals(this.getLowerBoundary()) == false)
            return false;
        if (other.getPredictionInterval() == null ^ this.getPredictionInterval() == null)
            return false;
        if (other.getPredictionInterval() != null && other.getPredictionInterval().equals(this.getPredictionInterval()) == false)
            return false;
        if (other.getSeasonality() == null ^ this.getSeasonality() == null)
            return false;
        if (other.getSeasonality() != null && other.getSeasonality().equals(this.getSeasonality()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPeriodsForward() == null) ? 0 : getPeriodsForward().hashCode());
        hashCode = prime * hashCode + ((getPeriodsBackward() == null) ? 0 : getPeriodsBackward().hashCode());
        hashCode = prime * hashCode + ((getUpperBoundary() == null) ? 0 : getUpperBoundary().hashCode());
        hashCode = prime * hashCode + ((getLowerBoundary() == null) ? 0 : getLowerBoundary().hashCode());
        hashCode = prime * hashCode + ((getPredictionInterval() == null) ? 0 : getPredictionInterval().hashCode());
        hashCode = prime * hashCode + ((getSeasonality() == null) ? 0 : getSeasonality().hashCode());
        return hashCode;
    }

    @Override
    public TimeBasedForecastProperties clone() {
        try {
            return (TimeBasedForecastProperties) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.TimeBasedForecastPropertiesMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
