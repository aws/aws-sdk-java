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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/forecast-2018-06-26/CreateWhatIfForecast" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateWhatIfForecastRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the what-if forecast. Names must be unique within each what-if analysis.
     * </p>
     */
    private String whatIfForecastName;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the what-if analysis.
     * </p>
     */
    private String whatIfAnalysisArn;
    /**
     * <p>
     * The transformations that are applied to the baseline time series. Each transformation contains an action and a
     * set of conditions. An action is applied only when all conditions are met. If no conditions are provided, the
     * action is applied to all items.
     * </p>
     */
    private java.util.List<TimeSeriesTransformation> timeSeriesTransformations;
    /**
     * <p>
     * The replacement time series dataset, which contains the rows that you want to change in the related time series
     * dataset. A replacement time series does not need to contain all rows that are in the baseline related time
     * series. Include only the rows (measure-dimension combinations) that you want to include in the what-if forecast.
     * This dataset is merged with the original time series to create a transformed dataset that is used for the what-if
     * analysis.
     * </p>
     * <p>
     * This dataset should contain the items to modify (such as item_id or workforce_type), any relevant dimensions, the
     * timestamp column, and at least one of the related time series columns. This file should not contain duplicate
     * timestamps for the same time series.
     * </p>
     * <p>
     * Timestamps and item_ids not included in this dataset are not included in the what-if analysis.
     * </p>
     */
    private TimeSeriesReplacementsDataSource timeSeriesReplacementsDataSource;
    /**
     * <p>
     * A list of <a href="https://docs.aws.amazon.com/forecast/latest/dg/tagging-forecast-resources.html">tags</a> to
     * apply to the what if forecast.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * The name of the what-if forecast. Names must be unique within each what-if analysis.
     * </p>
     * 
     * @param whatIfForecastName
     *        The name of the what-if forecast. Names must be unique within each what-if analysis.
     */

    public void setWhatIfForecastName(String whatIfForecastName) {
        this.whatIfForecastName = whatIfForecastName;
    }

    /**
     * <p>
     * The name of the what-if forecast. Names must be unique within each what-if analysis.
     * </p>
     * 
     * @return The name of the what-if forecast. Names must be unique within each what-if analysis.
     */

    public String getWhatIfForecastName() {
        return this.whatIfForecastName;
    }

    /**
     * <p>
     * The name of the what-if forecast. Names must be unique within each what-if analysis.
     * </p>
     * 
     * @param whatIfForecastName
     *        The name of the what-if forecast. Names must be unique within each what-if analysis.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateWhatIfForecastRequest withWhatIfForecastName(String whatIfForecastName) {
        setWhatIfForecastName(whatIfForecastName);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the what-if analysis.
     * </p>
     * 
     * @param whatIfAnalysisArn
     *        The Amazon Resource Name (ARN) of the what-if analysis.
     */

    public void setWhatIfAnalysisArn(String whatIfAnalysisArn) {
        this.whatIfAnalysisArn = whatIfAnalysisArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the what-if analysis.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the what-if analysis.
     */

    public String getWhatIfAnalysisArn() {
        return this.whatIfAnalysisArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the what-if analysis.
     * </p>
     * 
     * @param whatIfAnalysisArn
     *        The Amazon Resource Name (ARN) of the what-if analysis.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateWhatIfForecastRequest withWhatIfAnalysisArn(String whatIfAnalysisArn) {
        setWhatIfAnalysisArn(whatIfAnalysisArn);
        return this;
    }

    /**
     * <p>
     * The transformations that are applied to the baseline time series. Each transformation contains an action and a
     * set of conditions. An action is applied only when all conditions are met. If no conditions are provided, the
     * action is applied to all items.
     * </p>
     * 
     * @return The transformations that are applied to the baseline time series. Each transformation contains an action
     *         and a set of conditions. An action is applied only when all conditions are met. If no conditions are
     *         provided, the action is applied to all items.
     */

    public java.util.List<TimeSeriesTransformation> getTimeSeriesTransformations() {
        return timeSeriesTransformations;
    }

    /**
     * <p>
     * The transformations that are applied to the baseline time series. Each transformation contains an action and a
     * set of conditions. An action is applied only when all conditions are met. If no conditions are provided, the
     * action is applied to all items.
     * </p>
     * 
     * @param timeSeriesTransformations
     *        The transformations that are applied to the baseline time series. Each transformation contains an action
     *        and a set of conditions. An action is applied only when all conditions are met. If no conditions are
     *        provided, the action is applied to all items.
     */

    public void setTimeSeriesTransformations(java.util.Collection<TimeSeriesTransformation> timeSeriesTransformations) {
        if (timeSeriesTransformations == null) {
            this.timeSeriesTransformations = null;
            return;
        }

        this.timeSeriesTransformations = new java.util.ArrayList<TimeSeriesTransformation>(timeSeriesTransformations);
    }

    /**
     * <p>
     * The transformations that are applied to the baseline time series. Each transformation contains an action and a
     * set of conditions. An action is applied only when all conditions are met. If no conditions are provided, the
     * action is applied to all items.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTimeSeriesTransformations(java.util.Collection)} or
     * {@link #withTimeSeriesTransformations(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param timeSeriesTransformations
     *        The transformations that are applied to the baseline time series. Each transformation contains an action
     *        and a set of conditions. An action is applied only when all conditions are met. If no conditions are
     *        provided, the action is applied to all items.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateWhatIfForecastRequest withTimeSeriesTransformations(TimeSeriesTransformation... timeSeriesTransformations) {
        if (this.timeSeriesTransformations == null) {
            setTimeSeriesTransformations(new java.util.ArrayList<TimeSeriesTransformation>(timeSeriesTransformations.length));
        }
        for (TimeSeriesTransformation ele : timeSeriesTransformations) {
            this.timeSeriesTransformations.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The transformations that are applied to the baseline time series. Each transformation contains an action and a
     * set of conditions. An action is applied only when all conditions are met. If no conditions are provided, the
     * action is applied to all items.
     * </p>
     * 
     * @param timeSeriesTransformations
     *        The transformations that are applied to the baseline time series. Each transformation contains an action
     *        and a set of conditions. An action is applied only when all conditions are met. If no conditions are
     *        provided, the action is applied to all items.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateWhatIfForecastRequest withTimeSeriesTransformations(java.util.Collection<TimeSeriesTransformation> timeSeriesTransformations) {
        setTimeSeriesTransformations(timeSeriesTransformations);
        return this;
    }

    /**
     * <p>
     * The replacement time series dataset, which contains the rows that you want to change in the related time series
     * dataset. A replacement time series does not need to contain all rows that are in the baseline related time
     * series. Include only the rows (measure-dimension combinations) that you want to include in the what-if forecast.
     * This dataset is merged with the original time series to create a transformed dataset that is used for the what-if
     * analysis.
     * </p>
     * <p>
     * This dataset should contain the items to modify (such as item_id or workforce_type), any relevant dimensions, the
     * timestamp column, and at least one of the related time series columns. This file should not contain duplicate
     * timestamps for the same time series.
     * </p>
     * <p>
     * Timestamps and item_ids not included in this dataset are not included in the what-if analysis.
     * </p>
     * 
     * @param timeSeriesReplacementsDataSource
     *        The replacement time series dataset, which contains the rows that you want to change in the related time
     *        series dataset. A replacement time series does not need to contain all rows that are in the baseline
     *        related time series. Include only the rows (measure-dimension combinations) that you want to include in
     *        the what-if forecast. This dataset is merged with the original time series to create a transformed dataset
     *        that is used for the what-if analysis.</p>
     *        <p>
     *        This dataset should contain the items to modify (such as item_id or workforce_type), any relevant
     *        dimensions, the timestamp column, and at least one of the related time series columns. This file should
     *        not contain duplicate timestamps for the same time series.
     *        </p>
     *        <p>
     *        Timestamps and item_ids not included in this dataset are not included in the what-if analysis.
     */

    public void setTimeSeriesReplacementsDataSource(TimeSeriesReplacementsDataSource timeSeriesReplacementsDataSource) {
        this.timeSeriesReplacementsDataSource = timeSeriesReplacementsDataSource;
    }

    /**
     * <p>
     * The replacement time series dataset, which contains the rows that you want to change in the related time series
     * dataset. A replacement time series does not need to contain all rows that are in the baseline related time
     * series. Include only the rows (measure-dimension combinations) that you want to include in the what-if forecast.
     * This dataset is merged with the original time series to create a transformed dataset that is used for the what-if
     * analysis.
     * </p>
     * <p>
     * This dataset should contain the items to modify (such as item_id or workforce_type), any relevant dimensions, the
     * timestamp column, and at least one of the related time series columns. This file should not contain duplicate
     * timestamps for the same time series.
     * </p>
     * <p>
     * Timestamps and item_ids not included in this dataset are not included in the what-if analysis.
     * </p>
     * 
     * @return The replacement time series dataset, which contains the rows that you want to change in the related time
     *         series dataset. A replacement time series does not need to contain all rows that are in the baseline
     *         related time series. Include only the rows (measure-dimension combinations) that you want to include in
     *         the what-if forecast. This dataset is merged with the original time series to create a transformed
     *         dataset that is used for the what-if analysis.</p>
     *         <p>
     *         This dataset should contain the items to modify (such as item_id or workforce_type), any relevant
     *         dimensions, the timestamp column, and at least one of the related time series columns. This file should
     *         not contain duplicate timestamps for the same time series.
     *         </p>
     *         <p>
     *         Timestamps and item_ids not included in this dataset are not included in the what-if analysis.
     */

    public TimeSeriesReplacementsDataSource getTimeSeriesReplacementsDataSource() {
        return this.timeSeriesReplacementsDataSource;
    }

    /**
     * <p>
     * The replacement time series dataset, which contains the rows that you want to change in the related time series
     * dataset. A replacement time series does not need to contain all rows that are in the baseline related time
     * series. Include only the rows (measure-dimension combinations) that you want to include in the what-if forecast.
     * This dataset is merged with the original time series to create a transformed dataset that is used for the what-if
     * analysis.
     * </p>
     * <p>
     * This dataset should contain the items to modify (such as item_id or workforce_type), any relevant dimensions, the
     * timestamp column, and at least one of the related time series columns. This file should not contain duplicate
     * timestamps for the same time series.
     * </p>
     * <p>
     * Timestamps and item_ids not included in this dataset are not included in the what-if analysis.
     * </p>
     * 
     * @param timeSeriesReplacementsDataSource
     *        The replacement time series dataset, which contains the rows that you want to change in the related time
     *        series dataset. A replacement time series does not need to contain all rows that are in the baseline
     *        related time series. Include only the rows (measure-dimension combinations) that you want to include in
     *        the what-if forecast. This dataset is merged with the original time series to create a transformed dataset
     *        that is used for the what-if analysis.</p>
     *        <p>
     *        This dataset should contain the items to modify (such as item_id or workforce_type), any relevant
     *        dimensions, the timestamp column, and at least one of the related time series columns. This file should
     *        not contain duplicate timestamps for the same time series.
     *        </p>
     *        <p>
     *        Timestamps and item_ids not included in this dataset are not included in the what-if analysis.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateWhatIfForecastRequest withTimeSeriesReplacementsDataSource(TimeSeriesReplacementsDataSource timeSeriesReplacementsDataSource) {
        setTimeSeriesReplacementsDataSource(timeSeriesReplacementsDataSource);
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

    public CreateWhatIfForecastRequest withTags(Tag... tags) {
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

    public CreateWhatIfForecastRequest withTags(java.util.Collection<Tag> tags) {
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
        if (getWhatIfForecastName() != null)
            sb.append("WhatIfForecastName: ").append(getWhatIfForecastName()).append(",");
        if (getWhatIfAnalysisArn() != null)
            sb.append("WhatIfAnalysisArn: ").append(getWhatIfAnalysisArn()).append(",");
        if (getTimeSeriesTransformations() != null)
            sb.append("TimeSeriesTransformations: ").append(getTimeSeriesTransformations()).append(",");
        if (getTimeSeriesReplacementsDataSource() != null)
            sb.append("TimeSeriesReplacementsDataSource: ").append(getTimeSeriesReplacementsDataSource()).append(",");
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

        if (obj instanceof CreateWhatIfForecastRequest == false)
            return false;
        CreateWhatIfForecastRequest other = (CreateWhatIfForecastRequest) obj;
        if (other.getWhatIfForecastName() == null ^ this.getWhatIfForecastName() == null)
            return false;
        if (other.getWhatIfForecastName() != null && other.getWhatIfForecastName().equals(this.getWhatIfForecastName()) == false)
            return false;
        if (other.getWhatIfAnalysisArn() == null ^ this.getWhatIfAnalysisArn() == null)
            return false;
        if (other.getWhatIfAnalysisArn() != null && other.getWhatIfAnalysisArn().equals(this.getWhatIfAnalysisArn()) == false)
            return false;
        if (other.getTimeSeriesTransformations() == null ^ this.getTimeSeriesTransformations() == null)
            return false;
        if (other.getTimeSeriesTransformations() != null && other.getTimeSeriesTransformations().equals(this.getTimeSeriesTransformations()) == false)
            return false;
        if (other.getTimeSeriesReplacementsDataSource() == null ^ this.getTimeSeriesReplacementsDataSource() == null)
            return false;
        if (other.getTimeSeriesReplacementsDataSource() != null
                && other.getTimeSeriesReplacementsDataSource().equals(this.getTimeSeriesReplacementsDataSource()) == false)
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

        hashCode = prime * hashCode + ((getWhatIfForecastName() == null) ? 0 : getWhatIfForecastName().hashCode());
        hashCode = prime * hashCode + ((getWhatIfAnalysisArn() == null) ? 0 : getWhatIfAnalysisArn().hashCode());
        hashCode = prime * hashCode + ((getTimeSeriesTransformations() == null) ? 0 : getTimeSeriesTransformations().hashCode());
        hashCode = prime * hashCode + ((getTimeSeriesReplacementsDataSource() == null) ? 0 : getTimeSeriesReplacementsDataSource().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateWhatIfForecastRequest clone() {
        return (CreateWhatIfForecastRequest) super.clone();
    }

}
