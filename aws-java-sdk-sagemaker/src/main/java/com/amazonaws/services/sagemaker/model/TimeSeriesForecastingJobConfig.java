/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.sagemaker.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The collection of settings used by an AutoML job V2 for the time-series forecasting problem type.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/TimeSeriesForecastingJobConfig"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TimeSeriesForecastingJobConfig implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A URL to the Amazon S3 data source containing additional selected features that complement the target, itemID,
     * timestamp, and grouped columns set in <code>TimeSeriesConfig</code>. When not provided, the AutoML job V2
     * includes all the columns from the original dataset that are not already declared in <code>TimeSeriesConfig</code>
     * . If provided, the AutoML job V2 only considers these additional columns as a complement to the ones declared in
     * <code>TimeSeriesConfig</code>.
     * </p>
     * <p>
     * You can input <code>FeatureAttributeNames</code> (optional) in JSON format as shown below:
     * </p>
     * <p>
     * <code>{ "FeatureAttributeNames":["col1", "col2", ...] }</code>.
     * </p>
     * <p>
     * You can also specify the data type of the feature (optional) in the format shown below:
     * </p>
     * <p>
     * <code>{ "FeatureDataTypes":{"col1":"numeric", "col2":"categorical" ... } }</code>
     * </p>
     * <p>
     * Autopilot supports the following data types: <code>numeric</code>, <code>categorical</code>, <code>text</code>,
     * and <code>datetime</code>.
     * </p>
     * <note>
     * <p>
     * These column keys must not include any column set in <code>TimeSeriesConfig</code>.
     * </p>
     * </note>
     */
    private String featureSpecificationS3Uri;

    private AutoMLJobCompletionCriteria completionCriteria;
    /**
     * <p>
     * The frequency of predictions in a forecast.
     * </p>
     * <p>
     * Valid intervals are an integer followed by Y (Year), M (Month), W (Week), D (Day), H (Hour), and min (Minute).
     * For example, <code>1D</code> indicates every day and <code>15min</code> indicates every 15 minutes. The value of
     * a frequency must not overlap with the next larger frequency. For example, you must use a frequency of
     * <code>1H</code> instead of <code>60min</code>.
     * </p>
     * <p>
     * The valid values for each frequency are the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Minute - 1-59
     * </p>
     * </li>
     * <li>
     * <p>
     * Hour - 1-23
     * </p>
     * </li>
     * <li>
     * <p>
     * Day - 1-6
     * </p>
     * </li>
     * <li>
     * <p>
     * Week - 1-4
     * </p>
     * </li>
     * <li>
     * <p>
     * Month - 1-11
     * </p>
     * </li>
     * <li>
     * <p>
     * Year - 1
     * </p>
     * </li>
     * </ul>
     */
    private String forecastFrequency;
    /**
     * <p>
     * The number of time-steps that the model predicts. The forecast horizon is also called the prediction length. The
     * maximum forecast horizon is the lesser of 500 time-steps or 1/4 of the time-steps in the dataset.
     * </p>
     */
    private Integer forecastHorizon;
    /**
     * <p>
     * The quantiles used to train the model for forecasts at a specified quantile. You can specify quantiles from
     * <code>0.01</code> (p1) to <code>0.99</code> (p99), by increments of 0.01 or higher. Up to five forecast quantiles
     * can be specified. When <code>ForecastQuantiles</code> is not provided, the AutoML job uses the quantiles p10,
     * p50, and p90 as default.
     * </p>
     */
    private java.util.List<String> forecastQuantiles;
    /**
     * <p>
     * The transformations modifying specific attributes of the time-series, such as filling strategies for missing
     * values.
     * </p>
     */
    private TimeSeriesTransformations transformations;
    /**
     * <p>
     * The collection of components that defines the time-series.
     * </p>
     */
    private TimeSeriesConfig timeSeriesConfig;
    /**
     * <p>
     * The collection of holiday featurization attributes used to incorporate national holiday information into your
     * forecasting model.
     * </p>
     */
    private java.util.List<HolidayConfigAttributes> holidayConfig;

    /**
     * <p>
     * A URL to the Amazon S3 data source containing additional selected features that complement the target, itemID,
     * timestamp, and grouped columns set in <code>TimeSeriesConfig</code>. When not provided, the AutoML job V2
     * includes all the columns from the original dataset that are not already declared in <code>TimeSeriesConfig</code>
     * . If provided, the AutoML job V2 only considers these additional columns as a complement to the ones declared in
     * <code>TimeSeriesConfig</code>.
     * </p>
     * <p>
     * You can input <code>FeatureAttributeNames</code> (optional) in JSON format as shown below:
     * </p>
     * <p>
     * <code>{ "FeatureAttributeNames":["col1", "col2", ...] }</code>.
     * </p>
     * <p>
     * You can also specify the data type of the feature (optional) in the format shown below:
     * </p>
     * <p>
     * <code>{ "FeatureDataTypes":{"col1":"numeric", "col2":"categorical" ... } }</code>
     * </p>
     * <p>
     * Autopilot supports the following data types: <code>numeric</code>, <code>categorical</code>, <code>text</code>,
     * and <code>datetime</code>.
     * </p>
     * <note>
     * <p>
     * These column keys must not include any column set in <code>TimeSeriesConfig</code>.
     * </p>
     * </note>
     * 
     * @param featureSpecificationS3Uri
     *        A URL to the Amazon S3 data source containing additional selected features that complement the target,
     *        itemID, timestamp, and grouped columns set in <code>TimeSeriesConfig</code>. When not provided, the AutoML
     *        job V2 includes all the columns from the original dataset that are not already declared in
     *        <code>TimeSeriesConfig</code>. If provided, the AutoML job V2 only considers these additional columns as a
     *        complement to the ones declared in <code>TimeSeriesConfig</code>.</p>
     *        <p>
     *        You can input <code>FeatureAttributeNames</code> (optional) in JSON format as shown below:
     *        </p>
     *        <p>
     *        <code>{ "FeatureAttributeNames":["col1", "col2", ...] }</code>.
     *        </p>
     *        <p>
     *        You can also specify the data type of the feature (optional) in the format shown below:
     *        </p>
     *        <p>
     *        <code>{ "FeatureDataTypes":{"col1":"numeric", "col2":"categorical" ... } }</code>
     *        </p>
     *        <p>
     *        Autopilot supports the following data types: <code>numeric</code>, <code>categorical</code>,
     *        <code>text</code>, and <code>datetime</code>.
     *        </p>
     *        <note>
     *        <p>
     *        These column keys must not include any column set in <code>TimeSeriesConfig</code>.
     *        </p>
     */

    public void setFeatureSpecificationS3Uri(String featureSpecificationS3Uri) {
        this.featureSpecificationS3Uri = featureSpecificationS3Uri;
    }

    /**
     * <p>
     * A URL to the Amazon S3 data source containing additional selected features that complement the target, itemID,
     * timestamp, and grouped columns set in <code>TimeSeriesConfig</code>. When not provided, the AutoML job V2
     * includes all the columns from the original dataset that are not already declared in <code>TimeSeriesConfig</code>
     * . If provided, the AutoML job V2 only considers these additional columns as a complement to the ones declared in
     * <code>TimeSeriesConfig</code>.
     * </p>
     * <p>
     * You can input <code>FeatureAttributeNames</code> (optional) in JSON format as shown below:
     * </p>
     * <p>
     * <code>{ "FeatureAttributeNames":["col1", "col2", ...] }</code>.
     * </p>
     * <p>
     * You can also specify the data type of the feature (optional) in the format shown below:
     * </p>
     * <p>
     * <code>{ "FeatureDataTypes":{"col1":"numeric", "col2":"categorical" ... } }</code>
     * </p>
     * <p>
     * Autopilot supports the following data types: <code>numeric</code>, <code>categorical</code>, <code>text</code>,
     * and <code>datetime</code>.
     * </p>
     * <note>
     * <p>
     * These column keys must not include any column set in <code>TimeSeriesConfig</code>.
     * </p>
     * </note>
     * 
     * @return A URL to the Amazon S3 data source containing additional selected features that complement the target,
     *         itemID, timestamp, and grouped columns set in <code>TimeSeriesConfig</code>. When not provided, the
     *         AutoML job V2 includes all the columns from the original dataset that are not already declared in
     *         <code>TimeSeriesConfig</code>. If provided, the AutoML job V2 only considers these additional columns as
     *         a complement to the ones declared in <code>TimeSeriesConfig</code>.</p>
     *         <p>
     *         You can input <code>FeatureAttributeNames</code> (optional) in JSON format as shown below:
     *         </p>
     *         <p>
     *         <code>{ "FeatureAttributeNames":["col1", "col2", ...] }</code>.
     *         </p>
     *         <p>
     *         You can also specify the data type of the feature (optional) in the format shown below:
     *         </p>
     *         <p>
     *         <code>{ "FeatureDataTypes":{"col1":"numeric", "col2":"categorical" ... } }</code>
     *         </p>
     *         <p>
     *         Autopilot supports the following data types: <code>numeric</code>, <code>categorical</code>,
     *         <code>text</code>, and <code>datetime</code>.
     *         </p>
     *         <note>
     *         <p>
     *         These column keys must not include any column set in <code>TimeSeriesConfig</code>.
     *         </p>
     */

    public String getFeatureSpecificationS3Uri() {
        return this.featureSpecificationS3Uri;
    }

    /**
     * <p>
     * A URL to the Amazon S3 data source containing additional selected features that complement the target, itemID,
     * timestamp, and grouped columns set in <code>TimeSeriesConfig</code>. When not provided, the AutoML job V2
     * includes all the columns from the original dataset that are not already declared in <code>TimeSeriesConfig</code>
     * . If provided, the AutoML job V2 only considers these additional columns as a complement to the ones declared in
     * <code>TimeSeriesConfig</code>.
     * </p>
     * <p>
     * You can input <code>FeatureAttributeNames</code> (optional) in JSON format as shown below:
     * </p>
     * <p>
     * <code>{ "FeatureAttributeNames":["col1", "col2", ...] }</code>.
     * </p>
     * <p>
     * You can also specify the data type of the feature (optional) in the format shown below:
     * </p>
     * <p>
     * <code>{ "FeatureDataTypes":{"col1":"numeric", "col2":"categorical" ... } }</code>
     * </p>
     * <p>
     * Autopilot supports the following data types: <code>numeric</code>, <code>categorical</code>, <code>text</code>,
     * and <code>datetime</code>.
     * </p>
     * <note>
     * <p>
     * These column keys must not include any column set in <code>TimeSeriesConfig</code>.
     * </p>
     * </note>
     * 
     * @param featureSpecificationS3Uri
     *        A URL to the Amazon S3 data source containing additional selected features that complement the target,
     *        itemID, timestamp, and grouped columns set in <code>TimeSeriesConfig</code>. When not provided, the AutoML
     *        job V2 includes all the columns from the original dataset that are not already declared in
     *        <code>TimeSeriesConfig</code>. If provided, the AutoML job V2 only considers these additional columns as a
     *        complement to the ones declared in <code>TimeSeriesConfig</code>.</p>
     *        <p>
     *        You can input <code>FeatureAttributeNames</code> (optional) in JSON format as shown below:
     *        </p>
     *        <p>
     *        <code>{ "FeatureAttributeNames":["col1", "col2", ...] }</code>.
     *        </p>
     *        <p>
     *        You can also specify the data type of the feature (optional) in the format shown below:
     *        </p>
     *        <p>
     *        <code>{ "FeatureDataTypes":{"col1":"numeric", "col2":"categorical" ... } }</code>
     *        </p>
     *        <p>
     *        Autopilot supports the following data types: <code>numeric</code>, <code>categorical</code>,
     *        <code>text</code>, and <code>datetime</code>.
     *        </p>
     *        <note>
     *        <p>
     *        These column keys must not include any column set in <code>TimeSeriesConfig</code>.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TimeSeriesForecastingJobConfig withFeatureSpecificationS3Uri(String featureSpecificationS3Uri) {
        setFeatureSpecificationS3Uri(featureSpecificationS3Uri);
        return this;
    }

    /**
     * @param completionCriteria
     */

    public void setCompletionCriteria(AutoMLJobCompletionCriteria completionCriteria) {
        this.completionCriteria = completionCriteria;
    }

    /**
     * @return
     */

    public AutoMLJobCompletionCriteria getCompletionCriteria() {
        return this.completionCriteria;
    }

    /**
     * @param completionCriteria
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TimeSeriesForecastingJobConfig withCompletionCriteria(AutoMLJobCompletionCriteria completionCriteria) {
        setCompletionCriteria(completionCriteria);
        return this;
    }

    /**
     * <p>
     * The frequency of predictions in a forecast.
     * </p>
     * <p>
     * Valid intervals are an integer followed by Y (Year), M (Month), W (Week), D (Day), H (Hour), and min (Minute).
     * For example, <code>1D</code> indicates every day and <code>15min</code> indicates every 15 minutes. The value of
     * a frequency must not overlap with the next larger frequency. For example, you must use a frequency of
     * <code>1H</code> instead of <code>60min</code>.
     * </p>
     * <p>
     * The valid values for each frequency are the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Minute - 1-59
     * </p>
     * </li>
     * <li>
     * <p>
     * Hour - 1-23
     * </p>
     * </li>
     * <li>
     * <p>
     * Day - 1-6
     * </p>
     * </li>
     * <li>
     * <p>
     * Week - 1-4
     * </p>
     * </li>
     * <li>
     * <p>
     * Month - 1-11
     * </p>
     * </li>
     * <li>
     * <p>
     * Year - 1
     * </p>
     * </li>
     * </ul>
     * 
     * @param forecastFrequency
     *        The frequency of predictions in a forecast.</p>
     *        <p>
     *        Valid intervals are an integer followed by Y (Year), M (Month), W (Week), D (Day), H (Hour), and min
     *        (Minute). For example, <code>1D</code> indicates every day and <code>15min</code> indicates every 15
     *        minutes. The value of a frequency must not overlap with the next larger frequency. For example, you must
     *        use a frequency of <code>1H</code> instead of <code>60min</code>.
     *        </p>
     *        <p>
     *        The valid values for each frequency are the following:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Minute - 1-59
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Hour - 1-23
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Day - 1-6
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Week - 1-4
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Month - 1-11
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Year - 1
     *        </p>
     *        </li>
     */

    public void setForecastFrequency(String forecastFrequency) {
        this.forecastFrequency = forecastFrequency;
    }

    /**
     * <p>
     * The frequency of predictions in a forecast.
     * </p>
     * <p>
     * Valid intervals are an integer followed by Y (Year), M (Month), W (Week), D (Day), H (Hour), and min (Minute).
     * For example, <code>1D</code> indicates every day and <code>15min</code> indicates every 15 minutes. The value of
     * a frequency must not overlap with the next larger frequency. For example, you must use a frequency of
     * <code>1H</code> instead of <code>60min</code>.
     * </p>
     * <p>
     * The valid values for each frequency are the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Minute - 1-59
     * </p>
     * </li>
     * <li>
     * <p>
     * Hour - 1-23
     * </p>
     * </li>
     * <li>
     * <p>
     * Day - 1-6
     * </p>
     * </li>
     * <li>
     * <p>
     * Week - 1-4
     * </p>
     * </li>
     * <li>
     * <p>
     * Month - 1-11
     * </p>
     * </li>
     * <li>
     * <p>
     * Year - 1
     * </p>
     * </li>
     * </ul>
     * 
     * @return The frequency of predictions in a forecast.</p>
     *         <p>
     *         Valid intervals are an integer followed by Y (Year), M (Month), W (Week), D (Day), H (Hour), and min
     *         (Minute). For example, <code>1D</code> indicates every day and <code>15min</code> indicates every 15
     *         minutes. The value of a frequency must not overlap with the next larger frequency. For example, you must
     *         use a frequency of <code>1H</code> instead of <code>60min</code>.
     *         </p>
     *         <p>
     *         The valid values for each frequency are the following:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Minute - 1-59
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Hour - 1-23
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Day - 1-6
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Week - 1-4
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Month - 1-11
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Year - 1
     *         </p>
     *         </li>
     */

    public String getForecastFrequency() {
        return this.forecastFrequency;
    }

    /**
     * <p>
     * The frequency of predictions in a forecast.
     * </p>
     * <p>
     * Valid intervals are an integer followed by Y (Year), M (Month), W (Week), D (Day), H (Hour), and min (Minute).
     * For example, <code>1D</code> indicates every day and <code>15min</code> indicates every 15 minutes. The value of
     * a frequency must not overlap with the next larger frequency. For example, you must use a frequency of
     * <code>1H</code> instead of <code>60min</code>.
     * </p>
     * <p>
     * The valid values for each frequency are the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Minute - 1-59
     * </p>
     * </li>
     * <li>
     * <p>
     * Hour - 1-23
     * </p>
     * </li>
     * <li>
     * <p>
     * Day - 1-6
     * </p>
     * </li>
     * <li>
     * <p>
     * Week - 1-4
     * </p>
     * </li>
     * <li>
     * <p>
     * Month - 1-11
     * </p>
     * </li>
     * <li>
     * <p>
     * Year - 1
     * </p>
     * </li>
     * </ul>
     * 
     * @param forecastFrequency
     *        The frequency of predictions in a forecast.</p>
     *        <p>
     *        Valid intervals are an integer followed by Y (Year), M (Month), W (Week), D (Day), H (Hour), and min
     *        (Minute). For example, <code>1D</code> indicates every day and <code>15min</code> indicates every 15
     *        minutes. The value of a frequency must not overlap with the next larger frequency. For example, you must
     *        use a frequency of <code>1H</code> instead of <code>60min</code>.
     *        </p>
     *        <p>
     *        The valid values for each frequency are the following:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Minute - 1-59
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Hour - 1-23
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Day - 1-6
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Week - 1-4
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Month - 1-11
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Year - 1
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TimeSeriesForecastingJobConfig withForecastFrequency(String forecastFrequency) {
        setForecastFrequency(forecastFrequency);
        return this;
    }

    /**
     * <p>
     * The number of time-steps that the model predicts. The forecast horizon is also called the prediction length. The
     * maximum forecast horizon is the lesser of 500 time-steps or 1/4 of the time-steps in the dataset.
     * </p>
     * 
     * @param forecastHorizon
     *        The number of time-steps that the model predicts. The forecast horizon is also called the prediction
     *        length. The maximum forecast horizon is the lesser of 500 time-steps or 1/4 of the time-steps in the
     *        dataset.
     */

    public void setForecastHorizon(Integer forecastHorizon) {
        this.forecastHorizon = forecastHorizon;
    }

    /**
     * <p>
     * The number of time-steps that the model predicts. The forecast horizon is also called the prediction length. The
     * maximum forecast horizon is the lesser of 500 time-steps or 1/4 of the time-steps in the dataset.
     * </p>
     * 
     * @return The number of time-steps that the model predicts. The forecast horizon is also called the prediction
     *         length. The maximum forecast horizon is the lesser of 500 time-steps or 1/4 of the time-steps in the
     *         dataset.
     */

    public Integer getForecastHorizon() {
        return this.forecastHorizon;
    }

    /**
     * <p>
     * The number of time-steps that the model predicts. The forecast horizon is also called the prediction length. The
     * maximum forecast horizon is the lesser of 500 time-steps or 1/4 of the time-steps in the dataset.
     * </p>
     * 
     * @param forecastHorizon
     *        The number of time-steps that the model predicts. The forecast horizon is also called the prediction
     *        length. The maximum forecast horizon is the lesser of 500 time-steps or 1/4 of the time-steps in the
     *        dataset.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TimeSeriesForecastingJobConfig withForecastHorizon(Integer forecastHorizon) {
        setForecastHorizon(forecastHorizon);
        return this;
    }

    /**
     * <p>
     * The quantiles used to train the model for forecasts at a specified quantile. You can specify quantiles from
     * <code>0.01</code> (p1) to <code>0.99</code> (p99), by increments of 0.01 or higher. Up to five forecast quantiles
     * can be specified. When <code>ForecastQuantiles</code> is not provided, the AutoML job uses the quantiles p10,
     * p50, and p90 as default.
     * </p>
     * 
     * @return The quantiles used to train the model for forecasts at a specified quantile. You can specify quantiles
     *         from <code>0.01</code> (p1) to <code>0.99</code> (p99), by increments of 0.01 or higher. Up to five
     *         forecast quantiles can be specified. When <code>ForecastQuantiles</code> is not provided, the AutoML job
     *         uses the quantiles p10, p50, and p90 as default.
     */

    public java.util.List<String> getForecastQuantiles() {
        return forecastQuantiles;
    }

    /**
     * <p>
     * The quantiles used to train the model for forecasts at a specified quantile. You can specify quantiles from
     * <code>0.01</code> (p1) to <code>0.99</code> (p99), by increments of 0.01 or higher. Up to five forecast quantiles
     * can be specified. When <code>ForecastQuantiles</code> is not provided, the AutoML job uses the quantiles p10,
     * p50, and p90 as default.
     * </p>
     * 
     * @param forecastQuantiles
     *        The quantiles used to train the model for forecasts at a specified quantile. You can specify quantiles
     *        from <code>0.01</code> (p1) to <code>0.99</code> (p99), by increments of 0.01 or higher. Up to five
     *        forecast quantiles can be specified. When <code>ForecastQuantiles</code> is not provided, the AutoML job
     *        uses the quantiles p10, p50, and p90 as default.
     */

    public void setForecastQuantiles(java.util.Collection<String> forecastQuantiles) {
        if (forecastQuantiles == null) {
            this.forecastQuantiles = null;
            return;
        }

        this.forecastQuantiles = new java.util.ArrayList<String>(forecastQuantiles);
    }

    /**
     * <p>
     * The quantiles used to train the model for forecasts at a specified quantile. You can specify quantiles from
     * <code>0.01</code> (p1) to <code>0.99</code> (p99), by increments of 0.01 or higher. Up to five forecast quantiles
     * can be specified. When <code>ForecastQuantiles</code> is not provided, the AutoML job uses the quantiles p10,
     * p50, and p90 as default.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setForecastQuantiles(java.util.Collection)} or {@link #withForecastQuantiles(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param forecastQuantiles
     *        The quantiles used to train the model for forecasts at a specified quantile. You can specify quantiles
     *        from <code>0.01</code> (p1) to <code>0.99</code> (p99), by increments of 0.01 or higher. Up to five
     *        forecast quantiles can be specified. When <code>ForecastQuantiles</code> is not provided, the AutoML job
     *        uses the quantiles p10, p50, and p90 as default.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TimeSeriesForecastingJobConfig withForecastQuantiles(String... forecastQuantiles) {
        if (this.forecastQuantiles == null) {
            setForecastQuantiles(new java.util.ArrayList<String>(forecastQuantiles.length));
        }
        for (String ele : forecastQuantiles) {
            this.forecastQuantiles.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The quantiles used to train the model for forecasts at a specified quantile. You can specify quantiles from
     * <code>0.01</code> (p1) to <code>0.99</code> (p99), by increments of 0.01 or higher. Up to five forecast quantiles
     * can be specified. When <code>ForecastQuantiles</code> is not provided, the AutoML job uses the quantiles p10,
     * p50, and p90 as default.
     * </p>
     * 
     * @param forecastQuantiles
     *        The quantiles used to train the model for forecasts at a specified quantile. You can specify quantiles
     *        from <code>0.01</code> (p1) to <code>0.99</code> (p99), by increments of 0.01 or higher. Up to five
     *        forecast quantiles can be specified. When <code>ForecastQuantiles</code> is not provided, the AutoML job
     *        uses the quantiles p10, p50, and p90 as default.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TimeSeriesForecastingJobConfig withForecastQuantiles(java.util.Collection<String> forecastQuantiles) {
        setForecastQuantiles(forecastQuantiles);
        return this;
    }

    /**
     * <p>
     * The transformations modifying specific attributes of the time-series, such as filling strategies for missing
     * values.
     * </p>
     * 
     * @param transformations
     *        The transformations modifying specific attributes of the time-series, such as filling strategies for
     *        missing values.
     */

    public void setTransformations(TimeSeriesTransformations transformations) {
        this.transformations = transformations;
    }

    /**
     * <p>
     * The transformations modifying specific attributes of the time-series, such as filling strategies for missing
     * values.
     * </p>
     * 
     * @return The transformations modifying specific attributes of the time-series, such as filling strategies for
     *         missing values.
     */

    public TimeSeriesTransformations getTransformations() {
        return this.transformations;
    }

    /**
     * <p>
     * The transformations modifying specific attributes of the time-series, such as filling strategies for missing
     * values.
     * </p>
     * 
     * @param transformations
     *        The transformations modifying specific attributes of the time-series, such as filling strategies for
     *        missing values.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TimeSeriesForecastingJobConfig withTransformations(TimeSeriesTransformations transformations) {
        setTransformations(transformations);
        return this;
    }

    /**
     * <p>
     * The collection of components that defines the time-series.
     * </p>
     * 
     * @param timeSeriesConfig
     *        The collection of components that defines the time-series.
     */

    public void setTimeSeriesConfig(TimeSeriesConfig timeSeriesConfig) {
        this.timeSeriesConfig = timeSeriesConfig;
    }

    /**
     * <p>
     * The collection of components that defines the time-series.
     * </p>
     * 
     * @return The collection of components that defines the time-series.
     */

    public TimeSeriesConfig getTimeSeriesConfig() {
        return this.timeSeriesConfig;
    }

    /**
     * <p>
     * The collection of components that defines the time-series.
     * </p>
     * 
     * @param timeSeriesConfig
     *        The collection of components that defines the time-series.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TimeSeriesForecastingJobConfig withTimeSeriesConfig(TimeSeriesConfig timeSeriesConfig) {
        setTimeSeriesConfig(timeSeriesConfig);
        return this;
    }

    /**
     * <p>
     * The collection of holiday featurization attributes used to incorporate national holiday information into your
     * forecasting model.
     * </p>
     * 
     * @return The collection of holiday featurization attributes used to incorporate national holiday information into
     *         your forecasting model.
     */

    public java.util.List<HolidayConfigAttributes> getHolidayConfig() {
        return holidayConfig;
    }

    /**
     * <p>
     * The collection of holiday featurization attributes used to incorporate national holiday information into your
     * forecasting model.
     * </p>
     * 
     * @param holidayConfig
     *        The collection of holiday featurization attributes used to incorporate national holiday information into
     *        your forecasting model.
     */

    public void setHolidayConfig(java.util.Collection<HolidayConfigAttributes> holidayConfig) {
        if (holidayConfig == null) {
            this.holidayConfig = null;
            return;
        }

        this.holidayConfig = new java.util.ArrayList<HolidayConfigAttributes>(holidayConfig);
    }

    /**
     * <p>
     * The collection of holiday featurization attributes used to incorporate national holiday information into your
     * forecasting model.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setHolidayConfig(java.util.Collection)} or {@link #withHolidayConfig(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param holidayConfig
     *        The collection of holiday featurization attributes used to incorporate national holiday information into
     *        your forecasting model.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TimeSeriesForecastingJobConfig withHolidayConfig(HolidayConfigAttributes... holidayConfig) {
        if (this.holidayConfig == null) {
            setHolidayConfig(new java.util.ArrayList<HolidayConfigAttributes>(holidayConfig.length));
        }
        for (HolidayConfigAttributes ele : holidayConfig) {
            this.holidayConfig.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The collection of holiday featurization attributes used to incorporate national holiday information into your
     * forecasting model.
     * </p>
     * 
     * @param holidayConfig
     *        The collection of holiday featurization attributes used to incorporate national holiday information into
     *        your forecasting model.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TimeSeriesForecastingJobConfig withHolidayConfig(java.util.Collection<HolidayConfigAttributes> holidayConfig) {
        setHolidayConfig(holidayConfig);
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
        if (getFeatureSpecificationS3Uri() != null)
            sb.append("FeatureSpecificationS3Uri: ").append(getFeatureSpecificationS3Uri()).append(",");
        if (getCompletionCriteria() != null)
            sb.append("CompletionCriteria: ").append(getCompletionCriteria()).append(",");
        if (getForecastFrequency() != null)
            sb.append("ForecastFrequency: ").append(getForecastFrequency()).append(",");
        if (getForecastHorizon() != null)
            sb.append("ForecastHorizon: ").append(getForecastHorizon()).append(",");
        if (getForecastQuantiles() != null)
            sb.append("ForecastQuantiles: ").append(getForecastQuantiles()).append(",");
        if (getTransformations() != null)
            sb.append("Transformations: ").append(getTransformations()).append(",");
        if (getTimeSeriesConfig() != null)
            sb.append("TimeSeriesConfig: ").append(getTimeSeriesConfig()).append(",");
        if (getHolidayConfig() != null)
            sb.append("HolidayConfig: ").append(getHolidayConfig());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TimeSeriesForecastingJobConfig == false)
            return false;
        TimeSeriesForecastingJobConfig other = (TimeSeriesForecastingJobConfig) obj;
        if (other.getFeatureSpecificationS3Uri() == null ^ this.getFeatureSpecificationS3Uri() == null)
            return false;
        if (other.getFeatureSpecificationS3Uri() != null && other.getFeatureSpecificationS3Uri().equals(this.getFeatureSpecificationS3Uri()) == false)
            return false;
        if (other.getCompletionCriteria() == null ^ this.getCompletionCriteria() == null)
            return false;
        if (other.getCompletionCriteria() != null && other.getCompletionCriteria().equals(this.getCompletionCriteria()) == false)
            return false;
        if (other.getForecastFrequency() == null ^ this.getForecastFrequency() == null)
            return false;
        if (other.getForecastFrequency() != null && other.getForecastFrequency().equals(this.getForecastFrequency()) == false)
            return false;
        if (other.getForecastHorizon() == null ^ this.getForecastHorizon() == null)
            return false;
        if (other.getForecastHorizon() != null && other.getForecastHorizon().equals(this.getForecastHorizon()) == false)
            return false;
        if (other.getForecastQuantiles() == null ^ this.getForecastQuantiles() == null)
            return false;
        if (other.getForecastQuantiles() != null && other.getForecastQuantiles().equals(this.getForecastQuantiles()) == false)
            return false;
        if (other.getTransformations() == null ^ this.getTransformations() == null)
            return false;
        if (other.getTransformations() != null && other.getTransformations().equals(this.getTransformations()) == false)
            return false;
        if (other.getTimeSeriesConfig() == null ^ this.getTimeSeriesConfig() == null)
            return false;
        if (other.getTimeSeriesConfig() != null && other.getTimeSeriesConfig().equals(this.getTimeSeriesConfig()) == false)
            return false;
        if (other.getHolidayConfig() == null ^ this.getHolidayConfig() == null)
            return false;
        if (other.getHolidayConfig() != null && other.getHolidayConfig().equals(this.getHolidayConfig()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFeatureSpecificationS3Uri() == null) ? 0 : getFeatureSpecificationS3Uri().hashCode());
        hashCode = prime * hashCode + ((getCompletionCriteria() == null) ? 0 : getCompletionCriteria().hashCode());
        hashCode = prime * hashCode + ((getForecastFrequency() == null) ? 0 : getForecastFrequency().hashCode());
        hashCode = prime * hashCode + ((getForecastHorizon() == null) ? 0 : getForecastHorizon().hashCode());
        hashCode = prime * hashCode + ((getForecastQuantiles() == null) ? 0 : getForecastQuantiles().hashCode());
        hashCode = prime * hashCode + ((getTransformations() == null) ? 0 : getTransformations().hashCode());
        hashCode = prime * hashCode + ((getTimeSeriesConfig() == null) ? 0 : getTimeSeriesConfig().hashCode());
        hashCode = prime * hashCode + ((getHolidayConfig() == null) ? 0 : getHolidayConfig().hashCode());
        return hashCode;
    }

    @Override
    public TimeSeriesForecastingJobConfig clone() {
        try {
            return (TimeSeriesForecastingJobConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.TimeSeriesForecastingJobConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
