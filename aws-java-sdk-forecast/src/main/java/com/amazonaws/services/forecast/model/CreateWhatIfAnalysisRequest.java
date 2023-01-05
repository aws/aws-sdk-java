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
package com.amazonaws.services.forecast.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/forecast-2018-06-26/CreateWhatIfAnalysis" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateWhatIfAnalysisRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the what-if analysis. Each name must be unique.
     * </p>
     */
    private String whatIfAnalysisName;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the baseline forecast.
     * </p>
     */
    private String forecastArn;
    /**
     * <p>
     * Defines the set of time series that are used in the what-if analysis with a <code>TimeSeriesIdentifiers</code>
     * object. What-if analyses are performed only for the time series in this object.
     * </p>
     * <p>
     * The <code>TimeSeriesIdentifiers</code> object needs the following information:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>DataSource</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Format</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Schema</code>
     * </p>
     * </li>
     * </ul>
     */
    private TimeSeriesSelector timeSeriesSelector;
    /**
     * <p>
     * A list of <a href="https://docs.aws.amazon.com/forecast/latest/dg/tagging-forecast-resources.html">tags</a> to
     * apply to the what if forecast.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * The name of the what-if analysis. Each name must be unique.
     * </p>
     * 
     * @param whatIfAnalysisName
     *        The name of the what-if analysis. Each name must be unique.
     */

    public void setWhatIfAnalysisName(String whatIfAnalysisName) {
        this.whatIfAnalysisName = whatIfAnalysisName;
    }

    /**
     * <p>
     * The name of the what-if analysis. Each name must be unique.
     * </p>
     * 
     * @return The name of the what-if analysis. Each name must be unique.
     */

    public String getWhatIfAnalysisName() {
        return this.whatIfAnalysisName;
    }

    /**
     * <p>
     * The name of the what-if analysis. Each name must be unique.
     * </p>
     * 
     * @param whatIfAnalysisName
     *        The name of the what-if analysis. Each name must be unique.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateWhatIfAnalysisRequest withWhatIfAnalysisName(String whatIfAnalysisName) {
        setWhatIfAnalysisName(whatIfAnalysisName);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the baseline forecast.
     * </p>
     * 
     * @param forecastArn
     *        The Amazon Resource Name (ARN) of the baseline forecast.
     */

    public void setForecastArn(String forecastArn) {
        this.forecastArn = forecastArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the baseline forecast.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the baseline forecast.
     */

    public String getForecastArn() {
        return this.forecastArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the baseline forecast.
     * </p>
     * 
     * @param forecastArn
     *        The Amazon Resource Name (ARN) of the baseline forecast.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateWhatIfAnalysisRequest withForecastArn(String forecastArn) {
        setForecastArn(forecastArn);
        return this;
    }

    /**
     * <p>
     * Defines the set of time series that are used in the what-if analysis with a <code>TimeSeriesIdentifiers</code>
     * object. What-if analyses are performed only for the time series in this object.
     * </p>
     * <p>
     * The <code>TimeSeriesIdentifiers</code> object needs the following information:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>DataSource</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Format</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Schema</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param timeSeriesSelector
     *        Defines the set of time series that are used in the what-if analysis with a
     *        <code>TimeSeriesIdentifiers</code> object. What-if analyses are performed only for the time series in this
     *        object.</p>
     *        <p>
     *        The <code>TimeSeriesIdentifiers</code> object needs the following information:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>DataSource</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Format</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Schema</code>
     *        </p>
     *        </li>
     */

    public void setTimeSeriesSelector(TimeSeriesSelector timeSeriesSelector) {
        this.timeSeriesSelector = timeSeriesSelector;
    }

    /**
     * <p>
     * Defines the set of time series that are used in the what-if analysis with a <code>TimeSeriesIdentifiers</code>
     * object. What-if analyses are performed only for the time series in this object.
     * </p>
     * <p>
     * The <code>TimeSeriesIdentifiers</code> object needs the following information:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>DataSource</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Format</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Schema</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @return Defines the set of time series that are used in the what-if analysis with a
     *         <code>TimeSeriesIdentifiers</code> object. What-if analyses are performed only for the time series in
     *         this object.</p>
     *         <p>
     *         The <code>TimeSeriesIdentifiers</code> object needs the following information:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>DataSource</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Format</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Schema</code>
     *         </p>
     *         </li>
     */

    public TimeSeriesSelector getTimeSeriesSelector() {
        return this.timeSeriesSelector;
    }

    /**
     * <p>
     * Defines the set of time series that are used in the what-if analysis with a <code>TimeSeriesIdentifiers</code>
     * object. What-if analyses are performed only for the time series in this object.
     * </p>
     * <p>
     * The <code>TimeSeriesIdentifiers</code> object needs the following information:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>DataSource</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Format</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Schema</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param timeSeriesSelector
     *        Defines the set of time series that are used in the what-if analysis with a
     *        <code>TimeSeriesIdentifiers</code> object. What-if analyses are performed only for the time series in this
     *        object.</p>
     *        <p>
     *        The <code>TimeSeriesIdentifiers</code> object needs the following information:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>DataSource</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Format</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Schema</code>
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateWhatIfAnalysisRequest withTimeSeriesSelector(TimeSeriesSelector timeSeriesSelector) {
        setTimeSeriesSelector(timeSeriesSelector);
        return this;
    }

    /**
     * <p>
     * A list of <a href="https://docs.aws.amazon.com/forecast/latest/dg/tagging-forecast-resources.html">tags</a> to
     * apply to the what if forecast.
     * </p>
     * 
     * @return A list of <a
     *         href="https://docs.aws.amazon.com/forecast/latest/dg/tagging-forecast-resources.html">tags</a> to apply
     *         to the what if forecast.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * A list of <a href="https://docs.aws.amazon.com/forecast/latest/dg/tagging-forecast-resources.html">tags</a> to
     * apply to the what if forecast.
     * </p>
     * 
     * @param tags
     *        A list of <a
     *        href="https://docs.aws.amazon.com/forecast/latest/dg/tagging-forecast-resources.html">tags</a> to apply to
     *        the what if forecast.
     */

    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<Tag>(tags);
    }

    /**
     * <p>
     * A list of <a href="https://docs.aws.amazon.com/forecast/latest/dg/tagging-forecast-resources.html">tags</a> to
     * apply to the what if forecast.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        A list of <a
     *        href="https://docs.aws.amazon.com/forecast/latest/dg/tagging-forecast-resources.html">tags</a> to apply to
     *        the what if forecast.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateWhatIfAnalysisRequest withTags(Tag... tags) {
        if (this.tags == null) {
            setTags(new java.util.ArrayList<Tag>(tags.length));
        }
        for (Tag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of <a href="https://docs.aws.amazon.com/forecast/latest/dg/tagging-forecast-resources.html">tags</a> to
     * apply to the what if forecast.
     * </p>
     * 
     * @param tags
     *        A list of <a
     *        href="https://docs.aws.amazon.com/forecast/latest/dg/tagging-forecast-resources.html">tags</a> to apply to
     *        the what if forecast.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateWhatIfAnalysisRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
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
        if (getWhatIfAnalysisName() != null)
            sb.append("WhatIfAnalysisName: ").append(getWhatIfAnalysisName()).append(",");
        if (getForecastArn() != null)
            sb.append("ForecastArn: ").append(getForecastArn()).append(",");
        if (getTimeSeriesSelector() != null)
            sb.append("TimeSeriesSelector: ").append(getTimeSeriesSelector()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateWhatIfAnalysisRequest == false)
            return false;
        CreateWhatIfAnalysisRequest other = (CreateWhatIfAnalysisRequest) obj;
        if (other.getWhatIfAnalysisName() == null ^ this.getWhatIfAnalysisName() == null)
            return false;
        if (other.getWhatIfAnalysisName() != null && other.getWhatIfAnalysisName().equals(this.getWhatIfAnalysisName()) == false)
            return false;
        if (other.getForecastArn() == null ^ this.getForecastArn() == null)
            return false;
        if (other.getForecastArn() != null && other.getForecastArn().equals(this.getForecastArn()) == false)
            return false;
        if (other.getTimeSeriesSelector() == null ^ this.getTimeSeriesSelector() == null)
            return false;
        if (other.getTimeSeriesSelector() != null && other.getTimeSeriesSelector().equals(this.getTimeSeriesSelector()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getWhatIfAnalysisName() == null) ? 0 : getWhatIfAnalysisName().hashCode());
        hashCode = prime * hashCode + ((getForecastArn() == null) ? 0 : getForecastArn().hashCode());
        hashCode = prime * hashCode + ((getTimeSeriesSelector() == null) ? 0 : getTimeSeriesSelector().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateWhatIfAnalysisRequest clone() {
        return (CreateWhatIfAnalysisRequest) super.clone();
    }

}
