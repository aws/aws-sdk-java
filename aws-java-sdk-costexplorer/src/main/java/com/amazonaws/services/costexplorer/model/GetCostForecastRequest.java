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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ce-2017-10-25/GetCostForecast" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetCostForecastRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The period of time that you want the forecast to cover.
     * </p>
     */
    private DateInterval timePeriod;
    /**
     * <p>
     * Which metric Cost Explorer uses to create your forecast. For more information about blended and unblended rates,
     * see <a href="https://aws.amazon.com/premiumsupport/knowledge-center/blended-rates-intro/">Why does the "blended"
     * annotation appear on some line items in my bill?</a>.
     * </p>
     * <p>
     * Valid values for a <code>GetCostForecast</code> call are the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * AmortizedCost
     * </p>
     * </li>
     * <li>
     * <p>
     * BlendedCost
     * </p>
     * </li>
     * <li>
     * <p>
     * NetAmortizedCost
     * </p>
     * </li>
     * <li>
     * <p>
     * NetUnblendedCost
     * </p>
     * </li>
     * <li>
     * <p>
     * UnblendedCost
     * </p>
     * </li>
     * </ul>
     */
    private String metric;
    /**
     * <p>
     * How granular you want the forecast to be. You can get 3 months of <code>DAILY</code> forecasts or 12 months of
     * <code>MONTHLY</code> forecasts.
     * </p>
     * <p>
     * The <code>GetCostForecast</code> operation supports only <code>DAILY</code> and <code>MONTHLY</code>
     * granularities.
     * </p>
     */
    private String granularity;
    /**
     * <p>
     * The filters that you want to use to filter your forecast. Cost Explorer API supports all of the Cost Explorer
     * filters.
     * </p>
     */
    private Expression filter;
    /**
     * <p>
     * Cost Explorer always returns the mean forecast as a single point. You can request a prediction interval around
     * the mean by specifying a confidence level. The higher the confidence level, the more confident Cost Explorer is
     * about the actual value falling in the prediction interval. Higher confidence levels result in wider prediction
     * intervals.
     * </p>
     */
    private Integer predictionIntervalLevel;

    /**
     * <p>
     * The period of time that you want the forecast to cover.
     * </p>
     * 
     * @param timePeriod
     *        The period of time that you want the forecast to cover.
     */

    public void setTimePeriod(DateInterval timePeriod) {
        this.timePeriod = timePeriod;
    }

    /**
     * <p>
     * The period of time that you want the forecast to cover.
     * </p>
     * 
     * @return The period of time that you want the forecast to cover.
     */

    public DateInterval getTimePeriod() {
        return this.timePeriod;
    }

    /**
     * <p>
     * The period of time that you want the forecast to cover.
     * </p>
     * 
     * @param timePeriod
     *        The period of time that you want the forecast to cover.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetCostForecastRequest withTimePeriod(DateInterval timePeriod) {
        setTimePeriod(timePeriod);
        return this;
    }

    /**
     * <p>
     * Which metric Cost Explorer uses to create your forecast. For more information about blended and unblended rates,
     * see <a href="https://aws.amazon.com/premiumsupport/knowledge-center/blended-rates-intro/">Why does the "blended"
     * annotation appear on some line items in my bill?</a>.
     * </p>
     * <p>
     * Valid values for a <code>GetCostForecast</code> call are the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * AmortizedCost
     * </p>
     * </li>
     * <li>
     * <p>
     * BlendedCost
     * </p>
     * </li>
     * <li>
     * <p>
     * NetAmortizedCost
     * </p>
     * </li>
     * <li>
     * <p>
     * NetUnblendedCost
     * </p>
     * </li>
     * <li>
     * <p>
     * UnblendedCost
     * </p>
     * </li>
     * </ul>
     * 
     * @param metric
     *        Which metric Cost Explorer uses to create your forecast. For more information about blended and unblended
     *        rates, see <a href="https://aws.amazon.com/premiumsupport/knowledge-center/blended-rates-intro/">Why does
     *        the "blended" annotation appear on some line items in my bill?</a>. </p>
     *        <p>
     *        Valid values for a <code>GetCostForecast</code> call are the following:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        AmortizedCost
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        BlendedCost
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        NetAmortizedCost
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        NetUnblendedCost
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        UnblendedCost
     *        </p>
     *        </li>
     * @see Metric
     */

    public void setMetric(String metric) {
        this.metric = metric;
    }

    /**
     * <p>
     * Which metric Cost Explorer uses to create your forecast. For more information about blended and unblended rates,
     * see <a href="https://aws.amazon.com/premiumsupport/knowledge-center/blended-rates-intro/">Why does the "blended"
     * annotation appear on some line items in my bill?</a>.
     * </p>
     * <p>
     * Valid values for a <code>GetCostForecast</code> call are the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * AmortizedCost
     * </p>
     * </li>
     * <li>
     * <p>
     * BlendedCost
     * </p>
     * </li>
     * <li>
     * <p>
     * NetAmortizedCost
     * </p>
     * </li>
     * <li>
     * <p>
     * NetUnblendedCost
     * </p>
     * </li>
     * <li>
     * <p>
     * UnblendedCost
     * </p>
     * </li>
     * </ul>
     * 
     * @return Which metric Cost Explorer uses to create your forecast. For more information about blended and unblended
     *         rates, see <a href="https://aws.amazon.com/premiumsupport/knowledge-center/blended-rates-intro/">Why does
     *         the "blended" annotation appear on some line items in my bill?</a>. </p>
     *         <p>
     *         Valid values for a <code>GetCostForecast</code> call are the following:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         AmortizedCost
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         BlendedCost
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         NetAmortizedCost
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         NetUnblendedCost
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         UnblendedCost
     *         </p>
     *         </li>
     * @see Metric
     */

    public String getMetric() {
        return this.metric;
    }

    /**
     * <p>
     * Which metric Cost Explorer uses to create your forecast. For more information about blended and unblended rates,
     * see <a href="https://aws.amazon.com/premiumsupport/knowledge-center/blended-rates-intro/">Why does the "blended"
     * annotation appear on some line items in my bill?</a>.
     * </p>
     * <p>
     * Valid values for a <code>GetCostForecast</code> call are the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * AmortizedCost
     * </p>
     * </li>
     * <li>
     * <p>
     * BlendedCost
     * </p>
     * </li>
     * <li>
     * <p>
     * NetAmortizedCost
     * </p>
     * </li>
     * <li>
     * <p>
     * NetUnblendedCost
     * </p>
     * </li>
     * <li>
     * <p>
     * UnblendedCost
     * </p>
     * </li>
     * </ul>
     * 
     * @param metric
     *        Which metric Cost Explorer uses to create your forecast. For more information about blended and unblended
     *        rates, see <a href="https://aws.amazon.com/premiumsupport/knowledge-center/blended-rates-intro/">Why does
     *        the "blended" annotation appear on some line items in my bill?</a>. </p>
     *        <p>
     *        Valid values for a <code>GetCostForecast</code> call are the following:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        AmortizedCost
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        BlendedCost
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        NetAmortizedCost
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        NetUnblendedCost
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        UnblendedCost
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Metric
     */

    public GetCostForecastRequest withMetric(String metric) {
        setMetric(metric);
        return this;
    }

    /**
     * <p>
     * Which metric Cost Explorer uses to create your forecast. For more information about blended and unblended rates,
     * see <a href="https://aws.amazon.com/premiumsupport/knowledge-center/blended-rates-intro/">Why does the "blended"
     * annotation appear on some line items in my bill?</a>.
     * </p>
     * <p>
     * Valid values for a <code>GetCostForecast</code> call are the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * AmortizedCost
     * </p>
     * </li>
     * <li>
     * <p>
     * BlendedCost
     * </p>
     * </li>
     * <li>
     * <p>
     * NetAmortizedCost
     * </p>
     * </li>
     * <li>
     * <p>
     * NetUnblendedCost
     * </p>
     * </li>
     * <li>
     * <p>
     * UnblendedCost
     * </p>
     * </li>
     * </ul>
     * 
     * @param metric
     *        Which metric Cost Explorer uses to create your forecast. For more information about blended and unblended
     *        rates, see <a href="https://aws.amazon.com/premiumsupport/knowledge-center/blended-rates-intro/">Why does
     *        the "blended" annotation appear on some line items in my bill?</a>. </p>
     *        <p>
     *        Valid values for a <code>GetCostForecast</code> call are the following:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        AmortizedCost
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        BlendedCost
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        NetAmortizedCost
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        NetUnblendedCost
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        UnblendedCost
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Metric
     */

    public GetCostForecastRequest withMetric(Metric metric) {
        this.metric = metric.toString();
        return this;
    }

    /**
     * <p>
     * How granular you want the forecast to be. You can get 3 months of <code>DAILY</code> forecasts or 12 months of
     * <code>MONTHLY</code> forecasts.
     * </p>
     * <p>
     * The <code>GetCostForecast</code> operation supports only <code>DAILY</code> and <code>MONTHLY</code>
     * granularities.
     * </p>
     * 
     * @param granularity
     *        How granular you want the forecast to be. You can get 3 months of <code>DAILY</code> forecasts or 12
     *        months of <code>MONTHLY</code> forecasts.</p>
     *        <p>
     *        The <code>GetCostForecast</code> operation supports only <code>DAILY</code> and <code>MONTHLY</code>
     *        granularities.
     * @see Granularity
     */

    public void setGranularity(String granularity) {
        this.granularity = granularity;
    }

    /**
     * <p>
     * How granular you want the forecast to be. You can get 3 months of <code>DAILY</code> forecasts or 12 months of
     * <code>MONTHLY</code> forecasts.
     * </p>
     * <p>
     * The <code>GetCostForecast</code> operation supports only <code>DAILY</code> and <code>MONTHLY</code>
     * granularities.
     * </p>
     * 
     * @return How granular you want the forecast to be. You can get 3 months of <code>DAILY</code> forecasts or 12
     *         months of <code>MONTHLY</code> forecasts.</p>
     *         <p>
     *         The <code>GetCostForecast</code> operation supports only <code>DAILY</code> and <code>MONTHLY</code>
     *         granularities.
     * @see Granularity
     */

    public String getGranularity() {
        return this.granularity;
    }

    /**
     * <p>
     * How granular you want the forecast to be. You can get 3 months of <code>DAILY</code> forecasts or 12 months of
     * <code>MONTHLY</code> forecasts.
     * </p>
     * <p>
     * The <code>GetCostForecast</code> operation supports only <code>DAILY</code> and <code>MONTHLY</code>
     * granularities.
     * </p>
     * 
     * @param granularity
     *        How granular you want the forecast to be. You can get 3 months of <code>DAILY</code> forecasts or 12
     *        months of <code>MONTHLY</code> forecasts.</p>
     *        <p>
     *        The <code>GetCostForecast</code> operation supports only <code>DAILY</code> and <code>MONTHLY</code>
     *        granularities.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Granularity
     */

    public GetCostForecastRequest withGranularity(String granularity) {
        setGranularity(granularity);
        return this;
    }

    /**
     * <p>
     * How granular you want the forecast to be. You can get 3 months of <code>DAILY</code> forecasts or 12 months of
     * <code>MONTHLY</code> forecasts.
     * </p>
     * <p>
     * The <code>GetCostForecast</code> operation supports only <code>DAILY</code> and <code>MONTHLY</code>
     * granularities.
     * </p>
     * 
     * @param granularity
     *        How granular you want the forecast to be. You can get 3 months of <code>DAILY</code> forecasts or 12
     *        months of <code>MONTHLY</code> forecasts.</p>
     *        <p>
     *        The <code>GetCostForecast</code> operation supports only <code>DAILY</code> and <code>MONTHLY</code>
     *        granularities.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Granularity
     */

    public GetCostForecastRequest withGranularity(Granularity granularity) {
        this.granularity = granularity.toString();
        return this;
    }

    /**
     * <p>
     * The filters that you want to use to filter your forecast. Cost Explorer API supports all of the Cost Explorer
     * filters.
     * </p>
     * 
     * @param filter
     *        The filters that you want to use to filter your forecast. Cost Explorer API supports all of the Cost
     *        Explorer filters.
     */

    public void setFilter(Expression filter) {
        this.filter = filter;
    }

    /**
     * <p>
     * The filters that you want to use to filter your forecast. Cost Explorer API supports all of the Cost Explorer
     * filters.
     * </p>
     * 
     * @return The filters that you want to use to filter your forecast. Cost Explorer API supports all of the Cost
     *         Explorer filters.
     */

    public Expression getFilter() {
        return this.filter;
    }

    /**
     * <p>
     * The filters that you want to use to filter your forecast. Cost Explorer API supports all of the Cost Explorer
     * filters.
     * </p>
     * 
     * @param filter
     *        The filters that you want to use to filter your forecast. Cost Explorer API supports all of the Cost
     *        Explorer filters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetCostForecastRequest withFilter(Expression filter) {
        setFilter(filter);
        return this;
    }

    /**
     * <p>
     * Cost Explorer always returns the mean forecast as a single point. You can request a prediction interval around
     * the mean by specifying a confidence level. The higher the confidence level, the more confident Cost Explorer is
     * about the actual value falling in the prediction interval. Higher confidence levels result in wider prediction
     * intervals.
     * </p>
     * 
     * @param predictionIntervalLevel
     *        Cost Explorer always returns the mean forecast as a single point. You can request a prediction interval
     *        around the mean by specifying a confidence level. The higher the confidence level, the more confident Cost
     *        Explorer is about the actual value falling in the prediction interval. Higher confidence levels result in
     *        wider prediction intervals.
     */

    public void setPredictionIntervalLevel(Integer predictionIntervalLevel) {
        this.predictionIntervalLevel = predictionIntervalLevel;
    }

    /**
     * <p>
     * Cost Explorer always returns the mean forecast as a single point. You can request a prediction interval around
     * the mean by specifying a confidence level. The higher the confidence level, the more confident Cost Explorer is
     * about the actual value falling in the prediction interval. Higher confidence levels result in wider prediction
     * intervals.
     * </p>
     * 
     * @return Cost Explorer always returns the mean forecast as a single point. You can request a prediction interval
     *         around the mean by specifying a confidence level. The higher the confidence level, the more confident
     *         Cost Explorer is about the actual value falling in the prediction interval. Higher confidence levels
     *         result in wider prediction intervals.
     */

    public Integer getPredictionIntervalLevel() {
        return this.predictionIntervalLevel;
    }

    /**
     * <p>
     * Cost Explorer always returns the mean forecast as a single point. You can request a prediction interval around
     * the mean by specifying a confidence level. The higher the confidence level, the more confident Cost Explorer is
     * about the actual value falling in the prediction interval. Higher confidence levels result in wider prediction
     * intervals.
     * </p>
     * 
     * @param predictionIntervalLevel
     *        Cost Explorer always returns the mean forecast as a single point. You can request a prediction interval
     *        around the mean by specifying a confidence level. The higher the confidence level, the more confident Cost
     *        Explorer is about the actual value falling in the prediction interval. Higher confidence levels result in
     *        wider prediction intervals.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetCostForecastRequest withPredictionIntervalLevel(Integer predictionIntervalLevel) {
        setPredictionIntervalLevel(predictionIntervalLevel);
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
        if (getMetric() != null)
            sb.append("Metric: ").append(getMetric()).append(",");
        if (getGranularity() != null)
            sb.append("Granularity: ").append(getGranularity()).append(",");
        if (getFilter() != null)
            sb.append("Filter: ").append(getFilter()).append(",");
        if (getPredictionIntervalLevel() != null)
            sb.append("PredictionIntervalLevel: ").append(getPredictionIntervalLevel());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetCostForecastRequest == false)
            return false;
        GetCostForecastRequest other = (GetCostForecastRequest) obj;
        if (other.getTimePeriod() == null ^ this.getTimePeriod() == null)
            return false;
        if (other.getTimePeriod() != null && other.getTimePeriod().equals(this.getTimePeriod()) == false)
            return false;
        if (other.getMetric() == null ^ this.getMetric() == null)
            return false;
        if (other.getMetric() != null && other.getMetric().equals(this.getMetric()) == false)
            return false;
        if (other.getGranularity() == null ^ this.getGranularity() == null)
            return false;
        if (other.getGranularity() != null && other.getGranularity().equals(this.getGranularity()) == false)
            return false;
        if (other.getFilter() == null ^ this.getFilter() == null)
            return false;
        if (other.getFilter() != null && other.getFilter().equals(this.getFilter()) == false)
            return false;
        if (other.getPredictionIntervalLevel() == null ^ this.getPredictionIntervalLevel() == null)
            return false;
        if (other.getPredictionIntervalLevel() != null && other.getPredictionIntervalLevel().equals(this.getPredictionIntervalLevel()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTimePeriod() == null) ? 0 : getTimePeriod().hashCode());
        hashCode = prime * hashCode + ((getMetric() == null) ? 0 : getMetric().hashCode());
        hashCode = prime * hashCode + ((getGranularity() == null) ? 0 : getGranularity().hashCode());
        hashCode = prime * hashCode + ((getFilter() == null) ? 0 : getFilter().hashCode());
        hashCode = prime * hashCode + ((getPredictionIntervalLevel() == null) ? 0 : getPredictionIntervalLevel().hashCode());
        return hashCode;
    }

    @Override
    public GetCostForecastRequest clone() {
        return (GetCostForecastRequest) super.clone();
    }

}
