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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/forecast-2018-06-26/CreateAutoPredictor" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateAutoPredictorRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A unique name for the predictor
     * </p>
     */
    private String predictorName;
    /**
     * <p>
     * The number of time-steps that the model predicts. The forecast horizon is also called the prediction length.
     * </p>
     * <p>
     * The maximum forecast horizon is the lesser of 500 time-steps or 1/4 of the TARGET_TIME_SERIES dataset length. If
     * you are retraining an existing AutoPredictor, then the maximum forecast horizon is the lesser of 500 time-steps
     * or 1/3 of the TARGET_TIME_SERIES dataset length.
     * </p>
     * <p>
     * If you are upgrading to an AutoPredictor or retraining an existing AutoPredictor, you cannot update the forecast
     * horizon parameter. You can meet this requirement by providing longer time-series in the dataset.
     * </p>
     */
    private Integer forecastHorizon;
    /**
     * <p>
     * The forecast types used to train a predictor. You can specify up to five forecast types. Forecast types can be
     * quantiles from 0.01 to 0.99, by increments of 0.01 or higher. You can also specify the mean forecast with
     * <code>mean</code>.
     * </p>
     */
    private java.util.List<String> forecastTypes;
    /**
     * <p>
     * An array of dimension (field) names that specify how to group the generated forecast.
     * </p>
     * <p>
     * For example, if you are generating forecasts for item sales across all your stores, and your dataset contains a
     * <code>store_id</code> field, you would specify <code>store_id</code> as a dimension to group sales forecasts for
     * each store.
     * </p>
     */
    private java.util.List<String> forecastDimensions;
    /**
     * <p>
     * The frequency of predictions in a forecast.
     * </p>
     * <p>
     * Valid intervals are Y (Year), M (Month), W (Week), D (Day), H (Hour), 30min (30 minutes), 15min (15 minutes),
     * 10min (10 minutes), 5min (5 minutes), and 1min (1 minute). For example, "Y" indicates every year and "5min"
     * indicates every five minutes.
     * </p>
     * <p>
     * The frequency must be greater than or equal to the TARGET_TIME_SERIES dataset frequency.
     * </p>
     * <p>
     * When a RELATED_TIME_SERIES dataset is provided, the frequency must be equal to the RELATED_TIME_SERIES dataset
     * frequency.
     * </p>
     */
    private String forecastFrequency;
    /**
     * <p>
     * The data configuration for your dataset group and any additional datasets.
     * </p>
     */
    private DataConfig dataConfig;

    private EncryptionConfig encryptionConfig;
    /**
     * <p>
     * The ARN of the predictor to retrain or upgrade. This parameter is only used when retraining or upgrading a
     * predictor. When creating a new predictor, do not specify a value for this parameter.
     * </p>
     * <p>
     * When upgrading or retraining a predictor, only specify values for the <code>ReferencePredictorArn</code> and
     * <code>PredictorName</code>. The value for <code>PredictorName</code> must be a unique predictor name.
     * </p>
     */
    private String referencePredictorArn;
    /**
     * <p>
     * The accuracy metric used to optimize the predictor.
     * </p>
     */
    private String optimizationMetric;
    /**
     * <p>
     * Create an Explainability resource for the predictor.
     * </p>
     */
    private Boolean explainPredictor;
    /**
     * <p>
     * Optional metadata to help you categorize and organize your predictors. Each tag consists of a key and an optional
     * value, both of which you define. Tag keys and values are case sensitive.
     * </p>
     * <p>
     * The following restrictions apply to tags:
     * </p>
     * <ul>
     * <li>
     * <p>
     * For each resource, each tag key must be unique and each tag key must have one value.
     * </p>
     * </li>
     * <li>
     * <p>
     * Maximum number of tags per resource: 50.
     * </p>
     * </li>
     * <li>
     * <p>
     * Maximum key length: 128 Unicode characters in UTF-8.
     * </p>
     * </li>
     * <li>
     * <p>
     * Maximum value length: 256 Unicode characters in UTF-8.
     * </p>
     * </li>
     * <li>
     * <p>
     * Accepted characters: all letters and numbers, spaces representable in UTF-8, and + - = . _ : / @. If your tagging
     * schema is used across other services and resources, the character restrictions of those services also apply.
     * </p>
     * </li>
     * <li>
     * <p>
     * Key prefixes cannot include any upper or lowercase combination of <code>aws:</code> or <code>AWS:</code>. Values
     * can have this prefix. If a tag value has <code>aws</code> as its prefix but the key does not, Forecast considers
     * it to be a user tag and will count against the limit of 50 tags. Tags with only the key prefix of
     * <code>aws</code> do not count against your tags per resource limit. You cannot edit or delete tag keys with this
     * prefix.
     * </p>
     * </li>
     * </ul>
     */
    private java.util.List<Tag> tags;
    /**
     * <p>
     * The configuration details for predictor monitoring. Provide a name for the monitor resource to enable predictor
     * monitoring.
     * </p>
     * <p>
     * Predictor monitoring allows you to see how your predictor's performance changes over time. For more information,
     * see <a href="https://docs.aws.amazon.com/forecast/latest/dg/predictor-monitoring.html">Predictor Monitoring</a>.
     * </p>
     */
    private MonitorConfig monitorConfig;
    /**
     * <p>
     * The time boundary Forecast uses to align and aggregate any data that doesn't align with your forecast frequency.
     * Provide the unit of time and the time boundary as a key value pair. For more information on specifying a time
     * boundary, see <a
     * href="https://docs.aws.amazon.com/forecast/latest/dg/data-aggregation.html#specifying-time-boundary">Specifying a
     * Time Boundary</a>. If you don't provide a time boundary, Forecast uses a set of <a
     * href="https://docs.aws.amazon.com/forecast/latest/dg/data-aggregation.html#default-time-boundaries">Default Time
     * Boundaries</a>.
     * </p>
     */
    private TimeAlignmentBoundary timeAlignmentBoundary;

    /**
     * <p>
     * A unique name for the predictor
     * </p>
     * 
     * @param predictorName
     *        A unique name for the predictor
     */

    public void setPredictorName(String predictorName) {
        this.predictorName = predictorName;
    }

    /**
     * <p>
     * A unique name for the predictor
     * </p>
     * 
     * @return A unique name for the predictor
     */

    public String getPredictorName() {
        return this.predictorName;
    }

    /**
     * <p>
     * A unique name for the predictor
     * </p>
     * 
     * @param predictorName
     *        A unique name for the predictor
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAutoPredictorRequest withPredictorName(String predictorName) {
        setPredictorName(predictorName);
        return this;
    }

    /**
     * <p>
     * The number of time-steps that the model predicts. The forecast horizon is also called the prediction length.
     * </p>
     * <p>
     * The maximum forecast horizon is the lesser of 500 time-steps or 1/4 of the TARGET_TIME_SERIES dataset length. If
     * you are retraining an existing AutoPredictor, then the maximum forecast horizon is the lesser of 500 time-steps
     * or 1/3 of the TARGET_TIME_SERIES dataset length.
     * </p>
     * <p>
     * If you are upgrading to an AutoPredictor or retraining an existing AutoPredictor, you cannot update the forecast
     * horizon parameter. You can meet this requirement by providing longer time-series in the dataset.
     * </p>
     * 
     * @param forecastHorizon
     *        The number of time-steps that the model predicts. The forecast horizon is also called the prediction
     *        length.</p>
     *        <p>
     *        The maximum forecast horizon is the lesser of 500 time-steps or 1/4 of the TARGET_TIME_SERIES dataset
     *        length. If you are retraining an existing AutoPredictor, then the maximum forecast horizon is the lesser
     *        of 500 time-steps or 1/3 of the TARGET_TIME_SERIES dataset length.
     *        </p>
     *        <p>
     *        If you are upgrading to an AutoPredictor or retraining an existing AutoPredictor, you cannot update the
     *        forecast horizon parameter. You can meet this requirement by providing longer time-series in the dataset.
     */

    public void setForecastHorizon(Integer forecastHorizon) {
        this.forecastHorizon = forecastHorizon;
    }

    /**
     * <p>
     * The number of time-steps that the model predicts. The forecast horizon is also called the prediction length.
     * </p>
     * <p>
     * The maximum forecast horizon is the lesser of 500 time-steps or 1/4 of the TARGET_TIME_SERIES dataset length. If
     * you are retraining an existing AutoPredictor, then the maximum forecast horizon is the lesser of 500 time-steps
     * or 1/3 of the TARGET_TIME_SERIES dataset length.
     * </p>
     * <p>
     * If you are upgrading to an AutoPredictor or retraining an existing AutoPredictor, you cannot update the forecast
     * horizon parameter. You can meet this requirement by providing longer time-series in the dataset.
     * </p>
     * 
     * @return The number of time-steps that the model predicts. The forecast horizon is also called the prediction
     *         length.</p>
     *         <p>
     *         The maximum forecast horizon is the lesser of 500 time-steps or 1/4 of the TARGET_TIME_SERIES dataset
     *         length. If you are retraining an existing AutoPredictor, then the maximum forecast horizon is the lesser
     *         of 500 time-steps or 1/3 of the TARGET_TIME_SERIES dataset length.
     *         </p>
     *         <p>
     *         If you are upgrading to an AutoPredictor or retraining an existing AutoPredictor, you cannot update the
     *         forecast horizon parameter. You can meet this requirement by providing longer time-series in the dataset.
     */

    public Integer getForecastHorizon() {
        return this.forecastHorizon;
    }

    /**
     * <p>
     * The number of time-steps that the model predicts. The forecast horizon is also called the prediction length.
     * </p>
     * <p>
     * The maximum forecast horizon is the lesser of 500 time-steps or 1/4 of the TARGET_TIME_SERIES dataset length. If
     * you are retraining an existing AutoPredictor, then the maximum forecast horizon is the lesser of 500 time-steps
     * or 1/3 of the TARGET_TIME_SERIES dataset length.
     * </p>
     * <p>
     * If you are upgrading to an AutoPredictor or retraining an existing AutoPredictor, you cannot update the forecast
     * horizon parameter. You can meet this requirement by providing longer time-series in the dataset.
     * </p>
     * 
     * @param forecastHorizon
     *        The number of time-steps that the model predicts. The forecast horizon is also called the prediction
     *        length.</p>
     *        <p>
     *        The maximum forecast horizon is the lesser of 500 time-steps or 1/4 of the TARGET_TIME_SERIES dataset
     *        length. If you are retraining an existing AutoPredictor, then the maximum forecast horizon is the lesser
     *        of 500 time-steps or 1/3 of the TARGET_TIME_SERIES dataset length.
     *        </p>
     *        <p>
     *        If you are upgrading to an AutoPredictor or retraining an existing AutoPredictor, you cannot update the
     *        forecast horizon parameter. You can meet this requirement by providing longer time-series in the dataset.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAutoPredictorRequest withForecastHorizon(Integer forecastHorizon) {
        setForecastHorizon(forecastHorizon);
        return this;
    }

    /**
     * <p>
     * The forecast types used to train a predictor. You can specify up to five forecast types. Forecast types can be
     * quantiles from 0.01 to 0.99, by increments of 0.01 or higher. You can also specify the mean forecast with
     * <code>mean</code>.
     * </p>
     * 
     * @return The forecast types used to train a predictor. You can specify up to five forecast types. Forecast types
     *         can be quantiles from 0.01 to 0.99, by increments of 0.01 or higher. You can also specify the mean
     *         forecast with <code>mean</code>.
     */

    public java.util.List<String> getForecastTypes() {
        return forecastTypes;
    }

    /**
     * <p>
     * The forecast types used to train a predictor. You can specify up to five forecast types. Forecast types can be
     * quantiles from 0.01 to 0.99, by increments of 0.01 or higher. You can also specify the mean forecast with
     * <code>mean</code>.
     * </p>
     * 
     * @param forecastTypes
     *        The forecast types used to train a predictor. You can specify up to five forecast types. Forecast types
     *        can be quantiles from 0.01 to 0.99, by increments of 0.01 or higher. You can also specify the mean
     *        forecast with <code>mean</code>.
     */

    public void setForecastTypes(java.util.Collection<String> forecastTypes) {
        if (forecastTypes == null) {
            this.forecastTypes = null;
            return;
        }

        this.forecastTypes = new java.util.ArrayList<String>(forecastTypes);
    }

    /**
     * <p>
     * The forecast types used to train a predictor. You can specify up to five forecast types. Forecast types can be
     * quantiles from 0.01 to 0.99, by increments of 0.01 or higher. You can also specify the mean forecast with
     * <code>mean</code>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setForecastTypes(java.util.Collection)} or {@link #withForecastTypes(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param forecastTypes
     *        The forecast types used to train a predictor. You can specify up to five forecast types. Forecast types
     *        can be quantiles from 0.01 to 0.99, by increments of 0.01 or higher. You can also specify the mean
     *        forecast with <code>mean</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAutoPredictorRequest withForecastTypes(String... forecastTypes) {
        if (this.forecastTypes == null) {
            setForecastTypes(new java.util.ArrayList<String>(forecastTypes.length));
        }
        for (String ele : forecastTypes) {
            this.forecastTypes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The forecast types used to train a predictor. You can specify up to five forecast types. Forecast types can be
     * quantiles from 0.01 to 0.99, by increments of 0.01 or higher. You can also specify the mean forecast with
     * <code>mean</code>.
     * </p>
     * 
     * @param forecastTypes
     *        The forecast types used to train a predictor. You can specify up to five forecast types. Forecast types
     *        can be quantiles from 0.01 to 0.99, by increments of 0.01 or higher. You can also specify the mean
     *        forecast with <code>mean</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAutoPredictorRequest withForecastTypes(java.util.Collection<String> forecastTypes) {
        setForecastTypes(forecastTypes);
        return this;
    }

    /**
     * <p>
     * An array of dimension (field) names that specify how to group the generated forecast.
     * </p>
     * <p>
     * For example, if you are generating forecasts for item sales across all your stores, and your dataset contains a
     * <code>store_id</code> field, you would specify <code>store_id</code> as a dimension to group sales forecasts for
     * each store.
     * </p>
     * 
     * @return An array of dimension (field) names that specify how to group the generated forecast.</p>
     *         <p>
     *         For example, if you are generating forecasts for item sales across all your stores, and your dataset
     *         contains a <code>store_id</code> field, you would specify <code>store_id</code> as a dimension to group
     *         sales forecasts for each store.
     */

    public java.util.List<String> getForecastDimensions() {
        return forecastDimensions;
    }

    /**
     * <p>
     * An array of dimension (field) names that specify how to group the generated forecast.
     * </p>
     * <p>
     * For example, if you are generating forecasts for item sales across all your stores, and your dataset contains a
     * <code>store_id</code> field, you would specify <code>store_id</code> as a dimension to group sales forecasts for
     * each store.
     * </p>
     * 
     * @param forecastDimensions
     *        An array of dimension (field) names that specify how to group the generated forecast.</p>
     *        <p>
     *        For example, if you are generating forecasts for item sales across all your stores, and your dataset
     *        contains a <code>store_id</code> field, you would specify <code>store_id</code> as a dimension to group
     *        sales forecasts for each store.
     */

    public void setForecastDimensions(java.util.Collection<String> forecastDimensions) {
        if (forecastDimensions == null) {
            this.forecastDimensions = null;
            return;
        }

        this.forecastDimensions = new java.util.ArrayList<String>(forecastDimensions);
    }

    /**
     * <p>
     * An array of dimension (field) names that specify how to group the generated forecast.
     * </p>
     * <p>
     * For example, if you are generating forecasts for item sales across all your stores, and your dataset contains a
     * <code>store_id</code> field, you would specify <code>store_id</code> as a dimension to group sales forecasts for
     * each store.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setForecastDimensions(java.util.Collection)} or {@link #withForecastDimensions(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param forecastDimensions
     *        An array of dimension (field) names that specify how to group the generated forecast.</p>
     *        <p>
     *        For example, if you are generating forecasts for item sales across all your stores, and your dataset
     *        contains a <code>store_id</code> field, you would specify <code>store_id</code> as a dimension to group
     *        sales forecasts for each store.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAutoPredictorRequest withForecastDimensions(String... forecastDimensions) {
        if (this.forecastDimensions == null) {
            setForecastDimensions(new java.util.ArrayList<String>(forecastDimensions.length));
        }
        for (String ele : forecastDimensions) {
            this.forecastDimensions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of dimension (field) names that specify how to group the generated forecast.
     * </p>
     * <p>
     * For example, if you are generating forecasts for item sales across all your stores, and your dataset contains a
     * <code>store_id</code> field, you would specify <code>store_id</code> as a dimension to group sales forecasts for
     * each store.
     * </p>
     * 
     * @param forecastDimensions
     *        An array of dimension (field) names that specify how to group the generated forecast.</p>
     *        <p>
     *        For example, if you are generating forecasts for item sales across all your stores, and your dataset
     *        contains a <code>store_id</code> field, you would specify <code>store_id</code> as a dimension to group
     *        sales forecasts for each store.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAutoPredictorRequest withForecastDimensions(java.util.Collection<String> forecastDimensions) {
        setForecastDimensions(forecastDimensions);
        return this;
    }

    /**
     * <p>
     * The frequency of predictions in a forecast.
     * </p>
     * <p>
     * Valid intervals are Y (Year), M (Month), W (Week), D (Day), H (Hour), 30min (30 minutes), 15min (15 minutes),
     * 10min (10 minutes), 5min (5 minutes), and 1min (1 minute). For example, "Y" indicates every year and "5min"
     * indicates every five minutes.
     * </p>
     * <p>
     * The frequency must be greater than or equal to the TARGET_TIME_SERIES dataset frequency.
     * </p>
     * <p>
     * When a RELATED_TIME_SERIES dataset is provided, the frequency must be equal to the RELATED_TIME_SERIES dataset
     * frequency.
     * </p>
     * 
     * @param forecastFrequency
     *        The frequency of predictions in a forecast.</p>
     *        <p>
     *        Valid intervals are Y (Year), M (Month), W (Week), D (Day), H (Hour), 30min (30 minutes), 15min (15
     *        minutes), 10min (10 minutes), 5min (5 minutes), and 1min (1 minute). For example, "Y" indicates every year
     *        and "5min" indicates every five minutes.
     *        </p>
     *        <p>
     *        The frequency must be greater than or equal to the TARGET_TIME_SERIES dataset frequency.
     *        </p>
     *        <p>
     *        When a RELATED_TIME_SERIES dataset is provided, the frequency must be equal to the RELATED_TIME_SERIES
     *        dataset frequency.
     */

    public void setForecastFrequency(String forecastFrequency) {
        this.forecastFrequency = forecastFrequency;
    }

    /**
     * <p>
     * The frequency of predictions in a forecast.
     * </p>
     * <p>
     * Valid intervals are Y (Year), M (Month), W (Week), D (Day), H (Hour), 30min (30 minutes), 15min (15 minutes),
     * 10min (10 minutes), 5min (5 minutes), and 1min (1 minute). For example, "Y" indicates every year and "5min"
     * indicates every five minutes.
     * </p>
     * <p>
     * The frequency must be greater than or equal to the TARGET_TIME_SERIES dataset frequency.
     * </p>
     * <p>
     * When a RELATED_TIME_SERIES dataset is provided, the frequency must be equal to the RELATED_TIME_SERIES dataset
     * frequency.
     * </p>
     * 
     * @return The frequency of predictions in a forecast.</p>
     *         <p>
     *         Valid intervals are Y (Year), M (Month), W (Week), D (Day), H (Hour), 30min (30 minutes), 15min (15
     *         minutes), 10min (10 minutes), 5min (5 minutes), and 1min (1 minute). For example, "Y" indicates every
     *         year and "5min" indicates every five minutes.
     *         </p>
     *         <p>
     *         The frequency must be greater than or equal to the TARGET_TIME_SERIES dataset frequency.
     *         </p>
     *         <p>
     *         When a RELATED_TIME_SERIES dataset is provided, the frequency must be equal to the RELATED_TIME_SERIES
     *         dataset frequency.
     */

    public String getForecastFrequency() {
        return this.forecastFrequency;
    }

    /**
     * <p>
     * The frequency of predictions in a forecast.
     * </p>
     * <p>
     * Valid intervals are Y (Year), M (Month), W (Week), D (Day), H (Hour), 30min (30 minutes), 15min (15 minutes),
     * 10min (10 minutes), 5min (5 minutes), and 1min (1 minute). For example, "Y" indicates every year and "5min"
     * indicates every five minutes.
     * </p>
     * <p>
     * The frequency must be greater than or equal to the TARGET_TIME_SERIES dataset frequency.
     * </p>
     * <p>
     * When a RELATED_TIME_SERIES dataset is provided, the frequency must be equal to the RELATED_TIME_SERIES dataset
     * frequency.
     * </p>
     * 
     * @param forecastFrequency
     *        The frequency of predictions in a forecast.</p>
     *        <p>
     *        Valid intervals are Y (Year), M (Month), W (Week), D (Day), H (Hour), 30min (30 minutes), 15min (15
     *        minutes), 10min (10 minutes), 5min (5 minutes), and 1min (1 minute). For example, "Y" indicates every year
     *        and "5min" indicates every five minutes.
     *        </p>
     *        <p>
     *        The frequency must be greater than or equal to the TARGET_TIME_SERIES dataset frequency.
     *        </p>
     *        <p>
     *        When a RELATED_TIME_SERIES dataset is provided, the frequency must be equal to the RELATED_TIME_SERIES
     *        dataset frequency.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAutoPredictorRequest withForecastFrequency(String forecastFrequency) {
        setForecastFrequency(forecastFrequency);
        return this;
    }

    /**
     * <p>
     * The data configuration for your dataset group and any additional datasets.
     * </p>
     * 
     * @param dataConfig
     *        The data configuration for your dataset group and any additional datasets.
     */

    public void setDataConfig(DataConfig dataConfig) {
        this.dataConfig = dataConfig;
    }

    /**
     * <p>
     * The data configuration for your dataset group and any additional datasets.
     * </p>
     * 
     * @return The data configuration for your dataset group and any additional datasets.
     */

    public DataConfig getDataConfig() {
        return this.dataConfig;
    }

    /**
     * <p>
     * The data configuration for your dataset group and any additional datasets.
     * </p>
     * 
     * @param dataConfig
     *        The data configuration for your dataset group and any additional datasets.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAutoPredictorRequest withDataConfig(DataConfig dataConfig) {
        setDataConfig(dataConfig);
        return this;
    }

    /**
     * @param encryptionConfig
     */

    public void setEncryptionConfig(EncryptionConfig encryptionConfig) {
        this.encryptionConfig = encryptionConfig;
    }

    /**
     * @return
     */

    public EncryptionConfig getEncryptionConfig() {
        return this.encryptionConfig;
    }

    /**
     * @param encryptionConfig
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAutoPredictorRequest withEncryptionConfig(EncryptionConfig encryptionConfig) {
        setEncryptionConfig(encryptionConfig);
        return this;
    }

    /**
     * <p>
     * The ARN of the predictor to retrain or upgrade. This parameter is only used when retraining or upgrading a
     * predictor. When creating a new predictor, do not specify a value for this parameter.
     * </p>
     * <p>
     * When upgrading or retraining a predictor, only specify values for the <code>ReferencePredictorArn</code> and
     * <code>PredictorName</code>. The value for <code>PredictorName</code> must be a unique predictor name.
     * </p>
     * 
     * @param referencePredictorArn
     *        The ARN of the predictor to retrain or upgrade. This parameter is only used when retraining or upgrading a
     *        predictor. When creating a new predictor, do not specify a value for this parameter.</p>
     *        <p>
     *        When upgrading or retraining a predictor, only specify values for the <code>ReferencePredictorArn</code>
     *        and <code>PredictorName</code>. The value for <code>PredictorName</code> must be a unique predictor name.
     */

    public void setReferencePredictorArn(String referencePredictorArn) {
        this.referencePredictorArn = referencePredictorArn;
    }

    /**
     * <p>
     * The ARN of the predictor to retrain or upgrade. This parameter is only used when retraining or upgrading a
     * predictor. When creating a new predictor, do not specify a value for this parameter.
     * </p>
     * <p>
     * When upgrading or retraining a predictor, only specify values for the <code>ReferencePredictorArn</code> and
     * <code>PredictorName</code>. The value for <code>PredictorName</code> must be a unique predictor name.
     * </p>
     * 
     * @return The ARN of the predictor to retrain or upgrade. This parameter is only used when retraining or upgrading
     *         a predictor. When creating a new predictor, do not specify a value for this parameter.</p>
     *         <p>
     *         When upgrading or retraining a predictor, only specify values for the <code>ReferencePredictorArn</code>
     *         and <code>PredictorName</code>. The value for <code>PredictorName</code> must be a unique predictor name.
     */

    public String getReferencePredictorArn() {
        return this.referencePredictorArn;
    }

    /**
     * <p>
     * The ARN of the predictor to retrain or upgrade. This parameter is only used when retraining or upgrading a
     * predictor. When creating a new predictor, do not specify a value for this parameter.
     * </p>
     * <p>
     * When upgrading or retraining a predictor, only specify values for the <code>ReferencePredictorArn</code> and
     * <code>PredictorName</code>. The value for <code>PredictorName</code> must be a unique predictor name.
     * </p>
     * 
     * @param referencePredictorArn
     *        The ARN of the predictor to retrain or upgrade. This parameter is only used when retraining or upgrading a
     *        predictor. When creating a new predictor, do not specify a value for this parameter.</p>
     *        <p>
     *        When upgrading or retraining a predictor, only specify values for the <code>ReferencePredictorArn</code>
     *        and <code>PredictorName</code>. The value for <code>PredictorName</code> must be a unique predictor name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAutoPredictorRequest withReferencePredictorArn(String referencePredictorArn) {
        setReferencePredictorArn(referencePredictorArn);
        return this;
    }

    /**
     * <p>
     * The accuracy metric used to optimize the predictor.
     * </p>
     * 
     * @param optimizationMetric
     *        The accuracy metric used to optimize the predictor.
     * @see OptimizationMetric
     */

    public void setOptimizationMetric(String optimizationMetric) {
        this.optimizationMetric = optimizationMetric;
    }

    /**
     * <p>
     * The accuracy metric used to optimize the predictor.
     * </p>
     * 
     * @return The accuracy metric used to optimize the predictor.
     * @see OptimizationMetric
     */

    public String getOptimizationMetric() {
        return this.optimizationMetric;
    }

    /**
     * <p>
     * The accuracy metric used to optimize the predictor.
     * </p>
     * 
     * @param optimizationMetric
     *        The accuracy metric used to optimize the predictor.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OptimizationMetric
     */

    public CreateAutoPredictorRequest withOptimizationMetric(String optimizationMetric) {
        setOptimizationMetric(optimizationMetric);
        return this;
    }

    /**
     * <p>
     * The accuracy metric used to optimize the predictor.
     * </p>
     * 
     * @param optimizationMetric
     *        The accuracy metric used to optimize the predictor.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OptimizationMetric
     */

    public CreateAutoPredictorRequest withOptimizationMetric(OptimizationMetric optimizationMetric) {
        this.optimizationMetric = optimizationMetric.toString();
        return this;
    }

    /**
     * <p>
     * Create an Explainability resource for the predictor.
     * </p>
     * 
     * @param explainPredictor
     *        Create an Explainability resource for the predictor.
     */

    public void setExplainPredictor(Boolean explainPredictor) {
        this.explainPredictor = explainPredictor;
    }

    /**
     * <p>
     * Create an Explainability resource for the predictor.
     * </p>
     * 
     * @return Create an Explainability resource for the predictor.
     */

    public Boolean getExplainPredictor() {
        return this.explainPredictor;
    }

    /**
     * <p>
     * Create an Explainability resource for the predictor.
     * </p>
     * 
     * @param explainPredictor
     *        Create an Explainability resource for the predictor.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAutoPredictorRequest withExplainPredictor(Boolean explainPredictor) {
        setExplainPredictor(explainPredictor);
        return this;
    }

    /**
     * <p>
     * Create an Explainability resource for the predictor.
     * </p>
     * 
     * @return Create an Explainability resource for the predictor.
     */

    public Boolean isExplainPredictor() {
        return this.explainPredictor;
    }

    /**
     * <p>
     * Optional metadata to help you categorize and organize your predictors. Each tag consists of a key and an optional
     * value, both of which you define. Tag keys and values are case sensitive.
     * </p>
     * <p>
     * The following restrictions apply to tags:
     * </p>
     * <ul>
     * <li>
     * <p>
     * For each resource, each tag key must be unique and each tag key must have one value.
     * </p>
     * </li>
     * <li>
     * <p>
     * Maximum number of tags per resource: 50.
     * </p>
     * </li>
     * <li>
     * <p>
     * Maximum key length: 128 Unicode characters in UTF-8.
     * </p>
     * </li>
     * <li>
     * <p>
     * Maximum value length: 256 Unicode characters in UTF-8.
     * </p>
     * </li>
     * <li>
     * <p>
     * Accepted characters: all letters and numbers, spaces representable in UTF-8, and + - = . _ : / @. If your tagging
     * schema is used across other services and resources, the character restrictions of those services also apply.
     * </p>
     * </li>
     * <li>
     * <p>
     * Key prefixes cannot include any upper or lowercase combination of <code>aws:</code> or <code>AWS:</code>. Values
     * can have this prefix. If a tag value has <code>aws</code> as its prefix but the key does not, Forecast considers
     * it to be a user tag and will count against the limit of 50 tags. Tags with only the key prefix of
     * <code>aws</code> do not count against your tags per resource limit. You cannot edit or delete tag keys with this
     * prefix.
     * </p>
     * </li>
     * </ul>
     * 
     * @return Optional metadata to help you categorize and organize your predictors. Each tag consists of a key and an
     *         optional value, both of which you define. Tag keys and values are case sensitive.</p>
     *         <p>
     *         The following restrictions apply to tags:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         For each resource, each tag key must be unique and each tag key must have one value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Maximum number of tags per resource: 50.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Maximum key length: 128 Unicode characters in UTF-8.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Maximum value length: 256 Unicode characters in UTF-8.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Accepted characters: all letters and numbers, spaces representable in UTF-8, and + - = . _ : / @. If your
     *         tagging schema is used across other services and resources, the character restrictions of those services
     *         also apply.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Key prefixes cannot include any upper or lowercase combination of <code>aws:</code> or <code>AWS:</code>.
     *         Values can have this prefix. If a tag value has <code>aws</code> as its prefix but the key does not,
     *         Forecast considers it to be a user tag and will count against the limit of 50 tags. Tags with only the
     *         key prefix of <code>aws</code> do not count against your tags per resource limit. You cannot edit or
     *         delete tag keys with this prefix.
     *         </p>
     *         </li>
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * Optional metadata to help you categorize and organize your predictors. Each tag consists of a key and an optional
     * value, both of which you define. Tag keys and values are case sensitive.
     * </p>
     * <p>
     * The following restrictions apply to tags:
     * </p>
     * <ul>
     * <li>
     * <p>
     * For each resource, each tag key must be unique and each tag key must have one value.
     * </p>
     * </li>
     * <li>
     * <p>
     * Maximum number of tags per resource: 50.
     * </p>
     * </li>
     * <li>
     * <p>
     * Maximum key length: 128 Unicode characters in UTF-8.
     * </p>
     * </li>
     * <li>
     * <p>
     * Maximum value length: 256 Unicode characters in UTF-8.
     * </p>
     * </li>
     * <li>
     * <p>
     * Accepted characters: all letters and numbers, spaces representable in UTF-8, and + - = . _ : / @. If your tagging
     * schema is used across other services and resources, the character restrictions of those services also apply.
     * </p>
     * </li>
     * <li>
     * <p>
     * Key prefixes cannot include any upper or lowercase combination of <code>aws:</code> or <code>AWS:</code>. Values
     * can have this prefix. If a tag value has <code>aws</code> as its prefix but the key does not, Forecast considers
     * it to be a user tag and will count against the limit of 50 tags. Tags with only the key prefix of
     * <code>aws</code> do not count against your tags per resource limit. You cannot edit or delete tag keys with this
     * prefix.
     * </p>
     * </li>
     * </ul>
     * 
     * @param tags
     *        Optional metadata to help you categorize and organize your predictors. Each tag consists of a key and an
     *        optional value, both of which you define. Tag keys and values are case sensitive.</p>
     *        <p>
     *        The following restrictions apply to tags:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        For each resource, each tag key must be unique and each tag key must have one value.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Maximum number of tags per resource: 50.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Maximum key length: 128 Unicode characters in UTF-8.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Maximum value length: 256 Unicode characters in UTF-8.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Accepted characters: all letters and numbers, spaces representable in UTF-8, and + - = . _ : / @. If your
     *        tagging schema is used across other services and resources, the character restrictions of those services
     *        also apply.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Key prefixes cannot include any upper or lowercase combination of <code>aws:</code> or <code>AWS:</code>.
     *        Values can have this prefix. If a tag value has <code>aws</code> as its prefix but the key does not,
     *        Forecast considers it to be a user tag and will count against the limit of 50 tags. Tags with only the key
     *        prefix of <code>aws</code> do not count against your tags per resource limit. You cannot edit or delete
     *        tag keys with this prefix.
     *        </p>
     *        </li>
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
     * Optional metadata to help you categorize and organize your predictors. Each tag consists of a key and an optional
     * value, both of which you define. Tag keys and values are case sensitive.
     * </p>
     * <p>
     * The following restrictions apply to tags:
     * </p>
     * <ul>
     * <li>
     * <p>
     * For each resource, each tag key must be unique and each tag key must have one value.
     * </p>
     * </li>
     * <li>
     * <p>
     * Maximum number of tags per resource: 50.
     * </p>
     * </li>
     * <li>
     * <p>
     * Maximum key length: 128 Unicode characters in UTF-8.
     * </p>
     * </li>
     * <li>
     * <p>
     * Maximum value length: 256 Unicode characters in UTF-8.
     * </p>
     * </li>
     * <li>
     * <p>
     * Accepted characters: all letters and numbers, spaces representable in UTF-8, and + - = . _ : / @. If your tagging
     * schema is used across other services and resources, the character restrictions of those services also apply.
     * </p>
     * </li>
     * <li>
     * <p>
     * Key prefixes cannot include any upper or lowercase combination of <code>aws:</code> or <code>AWS:</code>. Values
     * can have this prefix. If a tag value has <code>aws</code> as its prefix but the key does not, Forecast considers
     * it to be a user tag and will count against the limit of 50 tags. Tags with only the key prefix of
     * <code>aws</code> do not count against your tags per resource limit. You cannot edit or delete tag keys with this
     * prefix.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        Optional metadata to help you categorize and organize your predictors. Each tag consists of a key and an
     *        optional value, both of which you define. Tag keys and values are case sensitive.</p>
     *        <p>
     *        The following restrictions apply to tags:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        For each resource, each tag key must be unique and each tag key must have one value.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Maximum number of tags per resource: 50.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Maximum key length: 128 Unicode characters in UTF-8.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Maximum value length: 256 Unicode characters in UTF-8.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Accepted characters: all letters and numbers, spaces representable in UTF-8, and + - = . _ : / @. If your
     *        tagging schema is used across other services and resources, the character restrictions of those services
     *        also apply.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Key prefixes cannot include any upper or lowercase combination of <code>aws:</code> or <code>AWS:</code>.
     *        Values can have this prefix. If a tag value has <code>aws</code> as its prefix but the key does not,
     *        Forecast considers it to be a user tag and will count against the limit of 50 tags. Tags with only the key
     *        prefix of <code>aws</code> do not count against your tags per resource limit. You cannot edit or delete
     *        tag keys with this prefix.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAutoPredictorRequest withTags(Tag... tags) {
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
     * Optional metadata to help you categorize and organize your predictors. Each tag consists of a key and an optional
     * value, both of which you define. Tag keys and values are case sensitive.
     * </p>
     * <p>
     * The following restrictions apply to tags:
     * </p>
     * <ul>
     * <li>
     * <p>
     * For each resource, each tag key must be unique and each tag key must have one value.
     * </p>
     * </li>
     * <li>
     * <p>
     * Maximum number of tags per resource: 50.
     * </p>
     * </li>
     * <li>
     * <p>
     * Maximum key length: 128 Unicode characters in UTF-8.
     * </p>
     * </li>
     * <li>
     * <p>
     * Maximum value length: 256 Unicode characters in UTF-8.
     * </p>
     * </li>
     * <li>
     * <p>
     * Accepted characters: all letters and numbers, spaces representable in UTF-8, and + - = . _ : / @. If your tagging
     * schema is used across other services and resources, the character restrictions of those services also apply.
     * </p>
     * </li>
     * <li>
     * <p>
     * Key prefixes cannot include any upper or lowercase combination of <code>aws:</code> or <code>AWS:</code>. Values
     * can have this prefix. If a tag value has <code>aws</code> as its prefix but the key does not, Forecast considers
     * it to be a user tag and will count against the limit of 50 tags. Tags with only the key prefix of
     * <code>aws</code> do not count against your tags per resource limit. You cannot edit or delete tag keys with this
     * prefix.
     * </p>
     * </li>
     * </ul>
     * 
     * @param tags
     *        Optional metadata to help you categorize and organize your predictors. Each tag consists of a key and an
     *        optional value, both of which you define. Tag keys and values are case sensitive.</p>
     *        <p>
     *        The following restrictions apply to tags:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        For each resource, each tag key must be unique and each tag key must have one value.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Maximum number of tags per resource: 50.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Maximum key length: 128 Unicode characters in UTF-8.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Maximum value length: 256 Unicode characters in UTF-8.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Accepted characters: all letters and numbers, spaces representable in UTF-8, and + - = . _ : / @. If your
     *        tagging schema is used across other services and resources, the character restrictions of those services
     *        also apply.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Key prefixes cannot include any upper or lowercase combination of <code>aws:</code> or <code>AWS:</code>.
     *        Values can have this prefix. If a tag value has <code>aws</code> as its prefix but the key does not,
     *        Forecast considers it to be a user tag and will count against the limit of 50 tags. Tags with only the key
     *        prefix of <code>aws</code> do not count against your tags per resource limit. You cannot edit or delete
     *        tag keys with this prefix.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAutoPredictorRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
        return this;
    }

    /**
     * <p>
     * The configuration details for predictor monitoring. Provide a name for the monitor resource to enable predictor
     * monitoring.
     * </p>
     * <p>
     * Predictor monitoring allows you to see how your predictor's performance changes over time. For more information,
     * see <a href="https://docs.aws.amazon.com/forecast/latest/dg/predictor-monitoring.html">Predictor Monitoring</a>.
     * </p>
     * 
     * @param monitorConfig
     *        The configuration details for predictor monitoring. Provide a name for the monitor resource to enable
     *        predictor monitoring.</p>
     *        <p>
     *        Predictor monitoring allows you to see how your predictor's performance changes over time. For more
     *        information, see <a
     *        href="https://docs.aws.amazon.com/forecast/latest/dg/predictor-monitoring.html">Predictor Monitoring</a>.
     */

    public void setMonitorConfig(MonitorConfig monitorConfig) {
        this.monitorConfig = monitorConfig;
    }

    /**
     * <p>
     * The configuration details for predictor monitoring. Provide a name for the monitor resource to enable predictor
     * monitoring.
     * </p>
     * <p>
     * Predictor monitoring allows you to see how your predictor's performance changes over time. For more information,
     * see <a href="https://docs.aws.amazon.com/forecast/latest/dg/predictor-monitoring.html">Predictor Monitoring</a>.
     * </p>
     * 
     * @return The configuration details for predictor monitoring. Provide a name for the monitor resource to enable
     *         predictor monitoring.</p>
     *         <p>
     *         Predictor monitoring allows you to see how your predictor's performance changes over time. For more
     *         information, see <a
     *         href="https://docs.aws.amazon.com/forecast/latest/dg/predictor-monitoring.html">Predictor Monitoring</a>.
     */

    public MonitorConfig getMonitorConfig() {
        return this.monitorConfig;
    }

    /**
     * <p>
     * The configuration details for predictor monitoring. Provide a name for the monitor resource to enable predictor
     * monitoring.
     * </p>
     * <p>
     * Predictor monitoring allows you to see how your predictor's performance changes over time. For more information,
     * see <a href="https://docs.aws.amazon.com/forecast/latest/dg/predictor-monitoring.html">Predictor Monitoring</a>.
     * </p>
     * 
     * @param monitorConfig
     *        The configuration details for predictor monitoring. Provide a name for the monitor resource to enable
     *        predictor monitoring.</p>
     *        <p>
     *        Predictor monitoring allows you to see how your predictor's performance changes over time. For more
     *        information, see <a
     *        href="https://docs.aws.amazon.com/forecast/latest/dg/predictor-monitoring.html">Predictor Monitoring</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAutoPredictorRequest withMonitorConfig(MonitorConfig monitorConfig) {
        setMonitorConfig(monitorConfig);
        return this;
    }

    /**
     * <p>
     * The time boundary Forecast uses to align and aggregate any data that doesn't align with your forecast frequency.
     * Provide the unit of time and the time boundary as a key value pair. For more information on specifying a time
     * boundary, see <a
     * href="https://docs.aws.amazon.com/forecast/latest/dg/data-aggregation.html#specifying-time-boundary">Specifying a
     * Time Boundary</a>. If you don't provide a time boundary, Forecast uses a set of <a
     * href="https://docs.aws.amazon.com/forecast/latest/dg/data-aggregation.html#default-time-boundaries">Default Time
     * Boundaries</a>.
     * </p>
     * 
     * @param timeAlignmentBoundary
     *        The time boundary Forecast uses to align and aggregate any data that doesn't align with your forecast
     *        frequency. Provide the unit of time and the time boundary as a key value pair. For more information on
     *        specifying a time boundary, see <a
     *        href="https://docs.aws.amazon.com/forecast/latest/dg/data-aggregation.html#specifying-time-boundary"
     *        >Specifying a Time Boundary</a>. If you don't provide a time boundary, Forecast uses a set of <a
     *        href="https://docs.aws.amazon.com/forecast/latest/dg/data-aggregation.html#default-time-boundaries"
     *        >Default Time Boundaries</a>.
     */

    public void setTimeAlignmentBoundary(TimeAlignmentBoundary timeAlignmentBoundary) {
        this.timeAlignmentBoundary = timeAlignmentBoundary;
    }

    /**
     * <p>
     * The time boundary Forecast uses to align and aggregate any data that doesn't align with your forecast frequency.
     * Provide the unit of time and the time boundary as a key value pair. For more information on specifying a time
     * boundary, see <a
     * href="https://docs.aws.amazon.com/forecast/latest/dg/data-aggregation.html#specifying-time-boundary">Specifying a
     * Time Boundary</a>. If you don't provide a time boundary, Forecast uses a set of <a
     * href="https://docs.aws.amazon.com/forecast/latest/dg/data-aggregation.html#default-time-boundaries">Default Time
     * Boundaries</a>.
     * </p>
     * 
     * @return The time boundary Forecast uses to align and aggregate any data that doesn't align with your forecast
     *         frequency. Provide the unit of time and the time boundary as a key value pair. For more information on
     *         specifying a time boundary, see <a
     *         href="https://docs.aws.amazon.com/forecast/latest/dg/data-aggregation.html#specifying-time-boundary"
     *         >Specifying a Time Boundary</a>. If you don't provide a time boundary, Forecast uses a set of <a
     *         href="https://docs.aws.amazon.com/forecast/latest/dg/data-aggregation.html#default-time-boundaries"
     *         >Default Time Boundaries</a>.
     */

    public TimeAlignmentBoundary getTimeAlignmentBoundary() {
        return this.timeAlignmentBoundary;
    }

    /**
     * <p>
     * The time boundary Forecast uses to align and aggregate any data that doesn't align with your forecast frequency.
     * Provide the unit of time and the time boundary as a key value pair. For more information on specifying a time
     * boundary, see <a
     * href="https://docs.aws.amazon.com/forecast/latest/dg/data-aggregation.html#specifying-time-boundary">Specifying a
     * Time Boundary</a>. If you don't provide a time boundary, Forecast uses a set of <a
     * href="https://docs.aws.amazon.com/forecast/latest/dg/data-aggregation.html#default-time-boundaries">Default Time
     * Boundaries</a>.
     * </p>
     * 
     * @param timeAlignmentBoundary
     *        The time boundary Forecast uses to align and aggregate any data that doesn't align with your forecast
     *        frequency. Provide the unit of time and the time boundary as a key value pair. For more information on
     *        specifying a time boundary, see <a
     *        href="https://docs.aws.amazon.com/forecast/latest/dg/data-aggregation.html#specifying-time-boundary"
     *        >Specifying a Time Boundary</a>. If you don't provide a time boundary, Forecast uses a set of <a
     *        href="https://docs.aws.amazon.com/forecast/latest/dg/data-aggregation.html#default-time-boundaries"
     *        >Default Time Boundaries</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAutoPredictorRequest withTimeAlignmentBoundary(TimeAlignmentBoundary timeAlignmentBoundary) {
        setTimeAlignmentBoundary(timeAlignmentBoundary);
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
        if (getPredictorName() != null)
            sb.append("PredictorName: ").append(getPredictorName()).append(",");
        if (getForecastHorizon() != null)
            sb.append("ForecastHorizon: ").append(getForecastHorizon()).append(",");
        if (getForecastTypes() != null)
            sb.append("ForecastTypes: ").append(getForecastTypes()).append(",");
        if (getForecastDimensions() != null)
            sb.append("ForecastDimensions: ").append(getForecastDimensions()).append(",");
        if (getForecastFrequency() != null)
            sb.append("ForecastFrequency: ").append(getForecastFrequency()).append(",");
        if (getDataConfig() != null)
            sb.append("DataConfig: ").append(getDataConfig()).append(",");
        if (getEncryptionConfig() != null)
            sb.append("EncryptionConfig: ").append(getEncryptionConfig()).append(",");
        if (getReferencePredictorArn() != null)
            sb.append("ReferencePredictorArn: ").append(getReferencePredictorArn()).append(",");
        if (getOptimizationMetric() != null)
            sb.append("OptimizationMetric: ").append(getOptimizationMetric()).append(",");
        if (getExplainPredictor() != null)
            sb.append("ExplainPredictor: ").append(getExplainPredictor()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
        if (getMonitorConfig() != null)
            sb.append("MonitorConfig: ").append(getMonitorConfig()).append(",");
        if (getTimeAlignmentBoundary() != null)
            sb.append("TimeAlignmentBoundary: ").append(getTimeAlignmentBoundary());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateAutoPredictorRequest == false)
            return false;
        CreateAutoPredictorRequest other = (CreateAutoPredictorRequest) obj;
        if (other.getPredictorName() == null ^ this.getPredictorName() == null)
            return false;
        if (other.getPredictorName() != null && other.getPredictorName().equals(this.getPredictorName()) == false)
            return false;
        if (other.getForecastHorizon() == null ^ this.getForecastHorizon() == null)
            return false;
        if (other.getForecastHorizon() != null && other.getForecastHorizon().equals(this.getForecastHorizon()) == false)
            return false;
        if (other.getForecastTypes() == null ^ this.getForecastTypes() == null)
            return false;
        if (other.getForecastTypes() != null && other.getForecastTypes().equals(this.getForecastTypes()) == false)
            return false;
        if (other.getForecastDimensions() == null ^ this.getForecastDimensions() == null)
            return false;
        if (other.getForecastDimensions() != null && other.getForecastDimensions().equals(this.getForecastDimensions()) == false)
            return false;
        if (other.getForecastFrequency() == null ^ this.getForecastFrequency() == null)
            return false;
        if (other.getForecastFrequency() != null && other.getForecastFrequency().equals(this.getForecastFrequency()) == false)
            return false;
        if (other.getDataConfig() == null ^ this.getDataConfig() == null)
            return false;
        if (other.getDataConfig() != null && other.getDataConfig().equals(this.getDataConfig()) == false)
            return false;
        if (other.getEncryptionConfig() == null ^ this.getEncryptionConfig() == null)
            return false;
        if (other.getEncryptionConfig() != null && other.getEncryptionConfig().equals(this.getEncryptionConfig()) == false)
            return false;
        if (other.getReferencePredictorArn() == null ^ this.getReferencePredictorArn() == null)
            return false;
        if (other.getReferencePredictorArn() != null && other.getReferencePredictorArn().equals(this.getReferencePredictorArn()) == false)
            return false;
        if (other.getOptimizationMetric() == null ^ this.getOptimizationMetric() == null)
            return false;
        if (other.getOptimizationMetric() != null && other.getOptimizationMetric().equals(this.getOptimizationMetric()) == false)
            return false;
        if (other.getExplainPredictor() == null ^ this.getExplainPredictor() == null)
            return false;
        if (other.getExplainPredictor() != null && other.getExplainPredictor().equals(this.getExplainPredictor()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getMonitorConfig() == null ^ this.getMonitorConfig() == null)
            return false;
        if (other.getMonitorConfig() != null && other.getMonitorConfig().equals(this.getMonitorConfig()) == false)
            return false;
        if (other.getTimeAlignmentBoundary() == null ^ this.getTimeAlignmentBoundary() == null)
            return false;
        if (other.getTimeAlignmentBoundary() != null && other.getTimeAlignmentBoundary().equals(this.getTimeAlignmentBoundary()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPredictorName() == null) ? 0 : getPredictorName().hashCode());
        hashCode = prime * hashCode + ((getForecastHorizon() == null) ? 0 : getForecastHorizon().hashCode());
        hashCode = prime * hashCode + ((getForecastTypes() == null) ? 0 : getForecastTypes().hashCode());
        hashCode = prime * hashCode + ((getForecastDimensions() == null) ? 0 : getForecastDimensions().hashCode());
        hashCode = prime * hashCode + ((getForecastFrequency() == null) ? 0 : getForecastFrequency().hashCode());
        hashCode = prime * hashCode + ((getDataConfig() == null) ? 0 : getDataConfig().hashCode());
        hashCode = prime * hashCode + ((getEncryptionConfig() == null) ? 0 : getEncryptionConfig().hashCode());
        hashCode = prime * hashCode + ((getReferencePredictorArn() == null) ? 0 : getReferencePredictorArn().hashCode());
        hashCode = prime * hashCode + ((getOptimizationMetric() == null) ? 0 : getOptimizationMetric().hashCode());
        hashCode = prime * hashCode + ((getExplainPredictor() == null) ? 0 : getExplainPredictor().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getMonitorConfig() == null) ? 0 : getMonitorConfig().hashCode());
        hashCode = prime * hashCode + ((getTimeAlignmentBoundary() == null) ? 0 : getTimeAlignmentBoundary().hashCode());
        return hashCode;
    }

    @Override
    public CreateAutoPredictorRequest clone() {
        return (CreateAutoPredictorRequest) super.clone();
    }

}
