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
 * The forecast computation configuration.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/ForecastComputation" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ForecastComputation implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ID for a computation.
     * </p>
     */
    private String computationId;
    /**
     * <p>
     * The name of a computation.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The time field that is used in a computation.
     * </p>
     */
    private DimensionField time;
    /**
     * <p>
     * The value field that is used in a computation.
     * </p>
     */
    private MeasureField value;
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
     * <code>AUTOMATIC</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CUSTOM</code>: Checks the custom seasonality value.
     * </p>
     * </li>
     * </ul>
     */
    private String seasonality;
    /**
     * <p>
     * The custom seasonality value setup of a forecast computation.
     * </p>
     */
    private Integer customSeasonalityValue;

    /**
     * <p>
     * The ID for a computation.
     * </p>
     * 
     * @param computationId
     *        The ID for a computation.
     */

    public void setComputationId(String computationId) {
        this.computationId = computationId;
    }

    /**
     * <p>
     * The ID for a computation.
     * </p>
     * 
     * @return The ID for a computation.
     */

    public String getComputationId() {
        return this.computationId;
    }

    /**
     * <p>
     * The ID for a computation.
     * </p>
     * 
     * @param computationId
     *        The ID for a computation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ForecastComputation withComputationId(String computationId) {
        setComputationId(computationId);
        return this;
    }

    /**
     * <p>
     * The name of a computation.
     * </p>
     * 
     * @param name
     *        The name of a computation.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of a computation.
     * </p>
     * 
     * @return The name of a computation.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of a computation.
     * </p>
     * 
     * @param name
     *        The name of a computation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ForecastComputation withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The time field that is used in a computation.
     * </p>
     * 
     * @param time
     *        The time field that is used in a computation.
     */

    public void setTime(DimensionField time) {
        this.time = time;
    }

    /**
     * <p>
     * The time field that is used in a computation.
     * </p>
     * 
     * @return The time field that is used in a computation.
     */

    public DimensionField getTime() {
        return this.time;
    }

    /**
     * <p>
     * The time field that is used in a computation.
     * </p>
     * 
     * @param time
     *        The time field that is used in a computation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ForecastComputation withTime(DimensionField time) {
        setTime(time);
        return this;
    }

    /**
     * <p>
     * The value field that is used in a computation.
     * </p>
     * 
     * @param value
     *        The value field that is used in a computation.
     */

    public void setValue(MeasureField value) {
        this.value = value;
    }

    /**
     * <p>
     * The value field that is used in a computation.
     * </p>
     * 
     * @return The value field that is used in a computation.
     */

    public MeasureField getValue() {
        return this.value;
    }

    /**
     * <p>
     * The value field that is used in a computation.
     * </p>
     * 
     * @param value
     *        The value field that is used in a computation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ForecastComputation withValue(MeasureField value) {
        setValue(value);
        return this;
    }

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

    public ForecastComputation withPeriodsForward(Integer periodsForward) {
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

    public ForecastComputation withPeriodsBackward(Integer periodsBackward) {
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

    public ForecastComputation withUpperBoundary(Double upperBoundary) {
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

    public ForecastComputation withLowerBoundary(Double lowerBoundary) {
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

    public ForecastComputation withPredictionInterval(Integer predictionInterval) {
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
     * <code>AUTOMATIC</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CUSTOM</code>: Checks the custom seasonality value.
     * </p>
     * </li>
     * </ul>
     * 
     * @param seasonality
     *        The seasonality setup of a forecast computation. Choose one of the following options:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>AUTOMATIC</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CUSTOM</code>: Checks the custom seasonality value.
     *        </p>
     *        </li>
     * @see ForecastComputationSeasonality
     */

    public void setSeasonality(String seasonality) {
        this.seasonality = seasonality;
    }

    /**
     * <p>
     * The seasonality setup of a forecast computation. Choose one of the following options:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>AUTOMATIC</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CUSTOM</code>: Checks the custom seasonality value.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The seasonality setup of a forecast computation. Choose one of the following options:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>AUTOMATIC</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>CUSTOM</code>: Checks the custom seasonality value.
     *         </p>
     *         </li>
     * @see ForecastComputationSeasonality
     */

    public String getSeasonality() {
        return this.seasonality;
    }

    /**
     * <p>
     * The seasonality setup of a forecast computation. Choose one of the following options:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>AUTOMATIC</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CUSTOM</code>: Checks the custom seasonality value.
     * </p>
     * </li>
     * </ul>
     * 
     * @param seasonality
     *        The seasonality setup of a forecast computation. Choose one of the following options:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>AUTOMATIC</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CUSTOM</code>: Checks the custom seasonality value.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ForecastComputationSeasonality
     */

    public ForecastComputation withSeasonality(String seasonality) {
        setSeasonality(seasonality);
        return this;
    }

    /**
     * <p>
     * The seasonality setup of a forecast computation. Choose one of the following options:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>AUTOMATIC</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CUSTOM</code>: Checks the custom seasonality value.
     * </p>
     * </li>
     * </ul>
     * 
     * @param seasonality
     *        The seasonality setup of a forecast computation. Choose one of the following options:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>AUTOMATIC</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CUSTOM</code>: Checks the custom seasonality value.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ForecastComputationSeasonality
     */

    public ForecastComputation withSeasonality(ForecastComputationSeasonality seasonality) {
        this.seasonality = seasonality.toString();
        return this;
    }

    /**
     * <p>
     * The custom seasonality value setup of a forecast computation.
     * </p>
     * 
     * @param customSeasonalityValue
     *        The custom seasonality value setup of a forecast computation.
     */

    public void setCustomSeasonalityValue(Integer customSeasonalityValue) {
        this.customSeasonalityValue = customSeasonalityValue;
    }

    /**
     * <p>
     * The custom seasonality value setup of a forecast computation.
     * </p>
     * 
     * @return The custom seasonality value setup of a forecast computation.
     */

    public Integer getCustomSeasonalityValue() {
        return this.customSeasonalityValue;
    }

    /**
     * <p>
     * The custom seasonality value setup of a forecast computation.
     * </p>
     * 
     * @param customSeasonalityValue
     *        The custom seasonality value setup of a forecast computation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ForecastComputation withCustomSeasonalityValue(Integer customSeasonalityValue) {
        setCustomSeasonalityValue(customSeasonalityValue);
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
        if (getComputationId() != null)
            sb.append("ComputationId: ").append(getComputationId()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getTime() != null)
            sb.append("Time: ").append(getTime()).append(",");
        if (getValue() != null)
            sb.append("Value: ").append(getValue()).append(",");
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
            sb.append("Seasonality: ").append(getSeasonality()).append(",");
        if (getCustomSeasonalityValue() != null)
            sb.append("CustomSeasonalityValue: ").append(getCustomSeasonalityValue());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ForecastComputation == false)
            return false;
        ForecastComputation other = (ForecastComputation) obj;
        if (other.getComputationId() == null ^ this.getComputationId() == null)
            return false;
        if (other.getComputationId() != null && other.getComputationId().equals(this.getComputationId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getTime() == null ^ this.getTime() == null)
            return false;
        if (other.getTime() != null && other.getTime().equals(this.getTime()) == false)
            return false;
        if (other.getValue() == null ^ this.getValue() == null)
            return false;
        if (other.getValue() != null && other.getValue().equals(this.getValue()) == false)
            return false;
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
        if (other.getCustomSeasonalityValue() == null ^ this.getCustomSeasonalityValue() == null)
            return false;
        if (other.getCustomSeasonalityValue() != null && other.getCustomSeasonalityValue().equals(this.getCustomSeasonalityValue()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getComputationId() == null) ? 0 : getComputationId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getTime() == null) ? 0 : getTime().hashCode());
        hashCode = prime * hashCode + ((getValue() == null) ? 0 : getValue().hashCode());
        hashCode = prime * hashCode + ((getPeriodsForward() == null) ? 0 : getPeriodsForward().hashCode());
        hashCode = prime * hashCode + ((getPeriodsBackward() == null) ? 0 : getPeriodsBackward().hashCode());
        hashCode = prime * hashCode + ((getUpperBoundary() == null) ? 0 : getUpperBoundary().hashCode());
        hashCode = prime * hashCode + ((getLowerBoundary() == null) ? 0 : getLowerBoundary().hashCode());
        hashCode = prime * hashCode + ((getPredictionInterval() == null) ? 0 : getPredictionInterval().hashCode());
        hashCode = prime * hashCode + ((getSeasonality() == null) ? 0 : getSeasonality().hashCode());
        hashCode = prime * hashCode + ((getCustomSeasonalityValue() == null) ? 0 : getCustomSeasonalityValue().hashCode());
        return hashCode;
    }

    @Override
    public ForecastComputation clone() {
        try {
            return (ForecastComputation) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.ForecastComputationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
