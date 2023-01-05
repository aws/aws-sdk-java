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
 * The computation union that is used in an insight visual.
 * </p>
 * <p>
 * This is a union type structure. For this structure to be valid, only one of the attributes can be defined.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/Computation" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Computation implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The top ranked and bottom ranked computation configuration.
     * </p>
     */
    private TopBottomRankedComputation topBottomRanked;
    /**
     * <p>
     * The top movers and bottom movers computation configuration.
     * </p>
     */
    private TopBottomMoversComputation topBottomMovers;
    /**
     * <p>
     * The total aggregation computation configuration.
     * </p>
     */
    private TotalAggregationComputation totalAggregation;
    /**
     * <p>
     * The maximum and minimum computation configuration.
     * </p>
     */
    private MaximumMinimumComputation maximumMinimum;
    /**
     * <p>
     * The metric comparison computation configuration.
     * </p>
     */
    private MetricComparisonComputation metricComparison;
    /**
     * <p>
     * The period over period computation configuration.
     * </p>
     */
    private PeriodOverPeriodComputation periodOverPeriod;
    /**
     * <p>
     * The period to <code>DataSetIdentifier</code> computation configuration.
     * </p>
     */
    private PeriodToDateComputation periodToDate;
    /**
     * <p>
     * The growth rate computation configuration.
     * </p>
     */
    private GrowthRateComputation growthRate;
    /**
     * <p>
     * The unique values computation configuration.
     * </p>
     */
    private UniqueValuesComputation uniqueValues;
    /**
     * <p>
     * The forecast computation configuration.
     * </p>
     */
    private ForecastComputation forecast;

    /**
     * <p>
     * The top ranked and bottom ranked computation configuration.
     * </p>
     * 
     * @param topBottomRanked
     *        The top ranked and bottom ranked computation configuration.
     */

    public void setTopBottomRanked(TopBottomRankedComputation topBottomRanked) {
        this.topBottomRanked = topBottomRanked;
    }

    /**
     * <p>
     * The top ranked and bottom ranked computation configuration.
     * </p>
     * 
     * @return The top ranked and bottom ranked computation configuration.
     */

    public TopBottomRankedComputation getTopBottomRanked() {
        return this.topBottomRanked;
    }

    /**
     * <p>
     * The top ranked and bottom ranked computation configuration.
     * </p>
     * 
     * @param topBottomRanked
     *        The top ranked and bottom ranked computation configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Computation withTopBottomRanked(TopBottomRankedComputation topBottomRanked) {
        setTopBottomRanked(topBottomRanked);
        return this;
    }

    /**
     * <p>
     * The top movers and bottom movers computation configuration.
     * </p>
     * 
     * @param topBottomMovers
     *        The top movers and bottom movers computation configuration.
     */

    public void setTopBottomMovers(TopBottomMoversComputation topBottomMovers) {
        this.topBottomMovers = topBottomMovers;
    }

    /**
     * <p>
     * The top movers and bottom movers computation configuration.
     * </p>
     * 
     * @return The top movers and bottom movers computation configuration.
     */

    public TopBottomMoversComputation getTopBottomMovers() {
        return this.topBottomMovers;
    }

    /**
     * <p>
     * The top movers and bottom movers computation configuration.
     * </p>
     * 
     * @param topBottomMovers
     *        The top movers and bottom movers computation configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Computation withTopBottomMovers(TopBottomMoversComputation topBottomMovers) {
        setTopBottomMovers(topBottomMovers);
        return this;
    }

    /**
     * <p>
     * The total aggregation computation configuration.
     * </p>
     * 
     * @param totalAggregation
     *        The total aggregation computation configuration.
     */

    public void setTotalAggregation(TotalAggregationComputation totalAggregation) {
        this.totalAggregation = totalAggregation;
    }

    /**
     * <p>
     * The total aggregation computation configuration.
     * </p>
     * 
     * @return The total aggregation computation configuration.
     */

    public TotalAggregationComputation getTotalAggregation() {
        return this.totalAggregation;
    }

    /**
     * <p>
     * The total aggregation computation configuration.
     * </p>
     * 
     * @param totalAggregation
     *        The total aggregation computation configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Computation withTotalAggregation(TotalAggregationComputation totalAggregation) {
        setTotalAggregation(totalAggregation);
        return this;
    }

    /**
     * <p>
     * The maximum and minimum computation configuration.
     * </p>
     * 
     * @param maximumMinimum
     *        The maximum and minimum computation configuration.
     */

    public void setMaximumMinimum(MaximumMinimumComputation maximumMinimum) {
        this.maximumMinimum = maximumMinimum;
    }

    /**
     * <p>
     * The maximum and minimum computation configuration.
     * </p>
     * 
     * @return The maximum and minimum computation configuration.
     */

    public MaximumMinimumComputation getMaximumMinimum() {
        return this.maximumMinimum;
    }

    /**
     * <p>
     * The maximum and minimum computation configuration.
     * </p>
     * 
     * @param maximumMinimum
     *        The maximum and minimum computation configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Computation withMaximumMinimum(MaximumMinimumComputation maximumMinimum) {
        setMaximumMinimum(maximumMinimum);
        return this;
    }

    /**
     * <p>
     * The metric comparison computation configuration.
     * </p>
     * 
     * @param metricComparison
     *        The metric comparison computation configuration.
     */

    public void setMetricComparison(MetricComparisonComputation metricComparison) {
        this.metricComparison = metricComparison;
    }

    /**
     * <p>
     * The metric comparison computation configuration.
     * </p>
     * 
     * @return The metric comparison computation configuration.
     */

    public MetricComparisonComputation getMetricComparison() {
        return this.metricComparison;
    }

    /**
     * <p>
     * The metric comparison computation configuration.
     * </p>
     * 
     * @param metricComparison
     *        The metric comparison computation configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Computation withMetricComparison(MetricComparisonComputation metricComparison) {
        setMetricComparison(metricComparison);
        return this;
    }

    /**
     * <p>
     * The period over period computation configuration.
     * </p>
     * 
     * @param periodOverPeriod
     *        The period over period computation configuration.
     */

    public void setPeriodOverPeriod(PeriodOverPeriodComputation periodOverPeriod) {
        this.periodOverPeriod = periodOverPeriod;
    }

    /**
     * <p>
     * The period over period computation configuration.
     * </p>
     * 
     * @return The period over period computation configuration.
     */

    public PeriodOverPeriodComputation getPeriodOverPeriod() {
        return this.periodOverPeriod;
    }

    /**
     * <p>
     * The period over period computation configuration.
     * </p>
     * 
     * @param periodOverPeriod
     *        The period over period computation configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Computation withPeriodOverPeriod(PeriodOverPeriodComputation periodOverPeriod) {
        setPeriodOverPeriod(periodOverPeriod);
        return this;
    }

    /**
     * <p>
     * The period to <code>DataSetIdentifier</code> computation configuration.
     * </p>
     * 
     * @param periodToDate
     *        The period to <code>DataSetIdentifier</code> computation configuration.
     */

    public void setPeriodToDate(PeriodToDateComputation periodToDate) {
        this.periodToDate = periodToDate;
    }

    /**
     * <p>
     * The period to <code>DataSetIdentifier</code> computation configuration.
     * </p>
     * 
     * @return The period to <code>DataSetIdentifier</code> computation configuration.
     */

    public PeriodToDateComputation getPeriodToDate() {
        return this.periodToDate;
    }

    /**
     * <p>
     * The period to <code>DataSetIdentifier</code> computation configuration.
     * </p>
     * 
     * @param periodToDate
     *        The period to <code>DataSetIdentifier</code> computation configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Computation withPeriodToDate(PeriodToDateComputation periodToDate) {
        setPeriodToDate(periodToDate);
        return this;
    }

    /**
     * <p>
     * The growth rate computation configuration.
     * </p>
     * 
     * @param growthRate
     *        The growth rate computation configuration.
     */

    public void setGrowthRate(GrowthRateComputation growthRate) {
        this.growthRate = growthRate;
    }

    /**
     * <p>
     * The growth rate computation configuration.
     * </p>
     * 
     * @return The growth rate computation configuration.
     */

    public GrowthRateComputation getGrowthRate() {
        return this.growthRate;
    }

    /**
     * <p>
     * The growth rate computation configuration.
     * </p>
     * 
     * @param growthRate
     *        The growth rate computation configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Computation withGrowthRate(GrowthRateComputation growthRate) {
        setGrowthRate(growthRate);
        return this;
    }

    /**
     * <p>
     * The unique values computation configuration.
     * </p>
     * 
     * @param uniqueValues
     *        The unique values computation configuration.
     */

    public void setUniqueValues(UniqueValuesComputation uniqueValues) {
        this.uniqueValues = uniqueValues;
    }

    /**
     * <p>
     * The unique values computation configuration.
     * </p>
     * 
     * @return The unique values computation configuration.
     */

    public UniqueValuesComputation getUniqueValues() {
        return this.uniqueValues;
    }

    /**
     * <p>
     * The unique values computation configuration.
     * </p>
     * 
     * @param uniqueValues
     *        The unique values computation configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Computation withUniqueValues(UniqueValuesComputation uniqueValues) {
        setUniqueValues(uniqueValues);
        return this;
    }

    /**
     * <p>
     * The forecast computation configuration.
     * </p>
     * 
     * @param forecast
     *        The forecast computation configuration.
     */

    public void setForecast(ForecastComputation forecast) {
        this.forecast = forecast;
    }

    /**
     * <p>
     * The forecast computation configuration.
     * </p>
     * 
     * @return The forecast computation configuration.
     */

    public ForecastComputation getForecast() {
        return this.forecast;
    }

    /**
     * <p>
     * The forecast computation configuration.
     * </p>
     * 
     * @param forecast
     *        The forecast computation configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Computation withForecast(ForecastComputation forecast) {
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
        if (getTopBottomRanked() != null)
            sb.append("TopBottomRanked: ").append(getTopBottomRanked()).append(",");
        if (getTopBottomMovers() != null)
            sb.append("TopBottomMovers: ").append(getTopBottomMovers()).append(",");
        if (getTotalAggregation() != null)
            sb.append("TotalAggregation: ").append(getTotalAggregation()).append(",");
        if (getMaximumMinimum() != null)
            sb.append("MaximumMinimum: ").append(getMaximumMinimum()).append(",");
        if (getMetricComparison() != null)
            sb.append("MetricComparison: ").append(getMetricComparison()).append(",");
        if (getPeriodOverPeriod() != null)
            sb.append("PeriodOverPeriod: ").append(getPeriodOverPeriod()).append(",");
        if (getPeriodToDate() != null)
            sb.append("PeriodToDate: ").append(getPeriodToDate()).append(",");
        if (getGrowthRate() != null)
            sb.append("GrowthRate: ").append(getGrowthRate()).append(",");
        if (getUniqueValues() != null)
            sb.append("UniqueValues: ").append(getUniqueValues()).append(",");
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

        if (obj instanceof Computation == false)
            return false;
        Computation other = (Computation) obj;
        if (other.getTopBottomRanked() == null ^ this.getTopBottomRanked() == null)
            return false;
        if (other.getTopBottomRanked() != null && other.getTopBottomRanked().equals(this.getTopBottomRanked()) == false)
            return false;
        if (other.getTopBottomMovers() == null ^ this.getTopBottomMovers() == null)
            return false;
        if (other.getTopBottomMovers() != null && other.getTopBottomMovers().equals(this.getTopBottomMovers()) == false)
            return false;
        if (other.getTotalAggregation() == null ^ this.getTotalAggregation() == null)
            return false;
        if (other.getTotalAggregation() != null && other.getTotalAggregation().equals(this.getTotalAggregation()) == false)
            return false;
        if (other.getMaximumMinimum() == null ^ this.getMaximumMinimum() == null)
            return false;
        if (other.getMaximumMinimum() != null && other.getMaximumMinimum().equals(this.getMaximumMinimum()) == false)
            return false;
        if (other.getMetricComparison() == null ^ this.getMetricComparison() == null)
            return false;
        if (other.getMetricComparison() != null && other.getMetricComparison().equals(this.getMetricComparison()) == false)
            return false;
        if (other.getPeriodOverPeriod() == null ^ this.getPeriodOverPeriod() == null)
            return false;
        if (other.getPeriodOverPeriod() != null && other.getPeriodOverPeriod().equals(this.getPeriodOverPeriod()) == false)
            return false;
        if (other.getPeriodToDate() == null ^ this.getPeriodToDate() == null)
            return false;
        if (other.getPeriodToDate() != null && other.getPeriodToDate().equals(this.getPeriodToDate()) == false)
            return false;
        if (other.getGrowthRate() == null ^ this.getGrowthRate() == null)
            return false;
        if (other.getGrowthRate() != null && other.getGrowthRate().equals(this.getGrowthRate()) == false)
            return false;
        if (other.getUniqueValues() == null ^ this.getUniqueValues() == null)
            return false;
        if (other.getUniqueValues() != null && other.getUniqueValues().equals(this.getUniqueValues()) == false)
            return false;
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

        hashCode = prime * hashCode + ((getTopBottomRanked() == null) ? 0 : getTopBottomRanked().hashCode());
        hashCode = prime * hashCode + ((getTopBottomMovers() == null) ? 0 : getTopBottomMovers().hashCode());
        hashCode = prime * hashCode + ((getTotalAggregation() == null) ? 0 : getTotalAggregation().hashCode());
        hashCode = prime * hashCode + ((getMaximumMinimum() == null) ? 0 : getMaximumMinimum().hashCode());
        hashCode = prime * hashCode + ((getMetricComparison() == null) ? 0 : getMetricComparison().hashCode());
        hashCode = prime * hashCode + ((getPeriodOverPeriod() == null) ? 0 : getPeriodOverPeriod().hashCode());
        hashCode = prime * hashCode + ((getPeriodToDate() == null) ? 0 : getPeriodToDate().hashCode());
        hashCode = prime * hashCode + ((getGrowthRate() == null) ? 0 : getGrowthRate().hashCode());
        hashCode = prime * hashCode + ((getUniqueValues() == null) ? 0 : getUniqueValues().hashCode());
        hashCode = prime * hashCode + ((getForecast() == null) ? 0 : getForecast().hashCode());
        return hashCode;
    }

    @Override
    public Computation clone() {
        try {
            return (Computation) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.ComputationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
