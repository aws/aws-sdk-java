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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/forecast-2018-06-26/DescribeAutoPredictor" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeAutoPredictorResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the predictor
     * </p>
     */
    private String predictorArn;
    /**
     * <p>
     * The name of the predictor.
     * </p>
     */
    private String predictorName;
    /**
     * <p>
     * The number of time-steps that the model predicts. The forecast horizon is also called the prediction length.
     * </p>
     */
    private Integer forecastHorizon;
    /**
     * <p>
     * The forecast types used during predictor training. Default value is ["0.1","0.5","0.9"].
     * </p>
     */
    private java.util.List<String> forecastTypes;
    /**
     * <p>
     * The frequency of predictions in a forecast.
     * </p>
     * <p>
     * Valid intervals are Y (Year), M (Month), W (Week), D (Day), H (Hour), 30min (30 minutes), 15min (15 minutes),
     * 10min (10 minutes), 5min (5 minutes), and 1min (1 minute). For example, "Y" indicates every year and "5min"
     * indicates every five minutes.
     * </p>
     */
    private String forecastFrequency;
    /**
     * <p>
     * An array of dimension (field) names that specify the attributes used to group your time series.
     * </p>
     */
    private java.util.List<String> forecastDimensions;
    /**
     * <p>
     * An array of the ARNs of the dataset import jobs used to import training data for the predictor.
     * </p>
     */
    private java.util.List<String> datasetImportJobArns;
    /**
     * <p>
     * The data configuration for your dataset group and any additional datasets.
     * </p>
     */
    private DataConfig dataConfig;

    private EncryptionConfig encryptionConfig;
    /**
     * <p>
     * The ARN and state of the reference predictor. This parameter is only valid for retrained or upgraded predictors.
     * </p>
     */
    private ReferencePredictorSummary referencePredictorSummary;
    /**
     * <p>
     * The estimated time remaining in minutes for the predictor training job to complete.
     * </p>
     */
    private Long estimatedTimeRemainingInMinutes;
    /**
     * <p>
     * The status of the predictor. States include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ACTIVE</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CREATE_PENDING</code>, <code>CREATE_IN_PROGRESS</code>, <code>CREATE_FAILED</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CREATE_STOPPING</code>, <code>CREATE_STOPPED</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETE_PENDING</code>, <code>DELETE_IN_PROGRESS</code>, <code>DELETE_FAILED</code>
     * </p>
     * </li>
     * </ul>
     */
    private String status;
    /**
     * <p>
     * In the event of an error, a message detailing the cause of the error.
     * </p>
     */
    private String message;
    /**
     * <p>
     * The timestamp of the CreateAutoPredictor request.
     * </p>
     */
    private java.util.Date creationTime;
    /**
     * <p>
     * The last time the resource was modified. The timestamp depends on the status of the job:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CREATE_PENDING</code> - The <code>CreationTime</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CREATE_IN_PROGRESS</code> - The current timestamp.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CREATE_STOPPING</code> - The current timestamp.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CREATE_STOPPED</code> - When the job stopped.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ACTIVE</code> or <code>CREATE_FAILED</code> - When the job finished or failed.
     * </p>
     * </li>
     * </ul>
     */
    private java.util.Date lastModificationTime;
    /**
     * <p>
     * The accuracy metric used to optimize the predictor.
     * </p>
     */
    private String optimizationMetric;
    /**
     * <p>
     * Provides the status and ARN of the Predictor Explainability.
     * </p>
     */
    private ExplainabilityInfo explainabilityInfo;
    /**
     * <p>
     * A object with the Amazon Resource Name (ARN) and status of the monitor resource.
     * </p>
     */
    private MonitorInfo monitorInfo;
    /**
     * <p>
     * The time boundary Forecast uses when aggregating data.
     * </p>
     */
    private TimeAlignmentBoundary timeAlignmentBoundary;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the predictor
     * </p>
     * 
     * @param predictorArn
     *        The Amazon Resource Name (ARN) of the predictor
     */

    public void setPredictorArn(String predictorArn) {
        this.predictorArn = predictorArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the predictor
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the predictor
     */

    public String getPredictorArn() {
        return this.predictorArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the predictor
     * </p>
     * 
     * @param predictorArn
     *        The Amazon Resource Name (ARN) of the predictor
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAutoPredictorResult withPredictorArn(String predictorArn) {
        setPredictorArn(predictorArn);
        return this;
    }

    /**
     * <p>
     * The name of the predictor.
     * </p>
     * 
     * @param predictorName
     *        The name of the predictor.
     */

    public void setPredictorName(String predictorName) {
        this.predictorName = predictorName;
    }

    /**
     * <p>
     * The name of the predictor.
     * </p>
     * 
     * @return The name of the predictor.
     */

    public String getPredictorName() {
        return this.predictorName;
    }

    /**
     * <p>
     * The name of the predictor.
     * </p>
     * 
     * @param predictorName
     *        The name of the predictor.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAutoPredictorResult withPredictorName(String predictorName) {
        setPredictorName(predictorName);
        return this;
    }

    /**
     * <p>
     * The number of time-steps that the model predicts. The forecast horizon is also called the prediction length.
     * </p>
     * 
     * @param forecastHorizon
     *        The number of time-steps that the model predicts. The forecast horizon is also called the prediction
     *        length.
     */

    public void setForecastHorizon(Integer forecastHorizon) {
        this.forecastHorizon = forecastHorizon;
    }

    /**
     * <p>
     * The number of time-steps that the model predicts. The forecast horizon is also called the prediction length.
     * </p>
     * 
     * @return The number of time-steps that the model predicts. The forecast horizon is also called the prediction
     *         length.
     */

    public Integer getForecastHorizon() {
        return this.forecastHorizon;
    }

    /**
     * <p>
     * The number of time-steps that the model predicts. The forecast horizon is also called the prediction length.
     * </p>
     * 
     * @param forecastHorizon
     *        The number of time-steps that the model predicts. The forecast horizon is also called the prediction
     *        length.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAutoPredictorResult withForecastHorizon(Integer forecastHorizon) {
        setForecastHorizon(forecastHorizon);
        return this;
    }

    /**
     * <p>
     * The forecast types used during predictor training. Default value is ["0.1","0.5","0.9"].
     * </p>
     * 
     * @return The forecast types used during predictor training. Default value is ["0.1","0.5","0.9"].
     */

    public java.util.List<String> getForecastTypes() {
        return forecastTypes;
    }

    /**
     * <p>
     * The forecast types used during predictor training. Default value is ["0.1","0.5","0.9"].
     * </p>
     * 
     * @param forecastTypes
     *        The forecast types used during predictor training. Default value is ["0.1","0.5","0.9"].
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
     * The forecast types used during predictor training. Default value is ["0.1","0.5","0.9"].
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setForecastTypes(java.util.Collection)} or {@link #withForecastTypes(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param forecastTypes
     *        The forecast types used during predictor training. Default value is ["0.1","0.5","0.9"].
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAutoPredictorResult withForecastTypes(String... forecastTypes) {
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
     * The forecast types used during predictor training. Default value is ["0.1","0.5","0.9"].
     * </p>
     * 
     * @param forecastTypes
     *        The forecast types used during predictor training. Default value is ["0.1","0.5","0.9"].
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAutoPredictorResult withForecastTypes(java.util.Collection<String> forecastTypes) {
        setForecastTypes(forecastTypes);
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
     * 
     * @param forecastFrequency
     *        The frequency of predictions in a forecast.</p>
     *        <p>
     *        Valid intervals are Y (Year), M (Month), W (Week), D (Day), H (Hour), 30min (30 minutes), 15min (15
     *        minutes), 10min (10 minutes), 5min (5 minutes), and 1min (1 minute). For example, "Y" indicates every year
     *        and "5min" indicates every five minutes.
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
     * 
     * @return The frequency of predictions in a forecast.</p>
     *         <p>
     *         Valid intervals are Y (Year), M (Month), W (Week), D (Day), H (Hour), 30min (30 minutes), 15min (15
     *         minutes), 10min (10 minutes), 5min (5 minutes), and 1min (1 minute). For example, "Y" indicates every
     *         year and "5min" indicates every five minutes.
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
     * 
     * @param forecastFrequency
     *        The frequency of predictions in a forecast.</p>
     *        <p>
     *        Valid intervals are Y (Year), M (Month), W (Week), D (Day), H (Hour), 30min (30 minutes), 15min (15
     *        minutes), 10min (10 minutes), 5min (5 minutes), and 1min (1 minute). For example, "Y" indicates every year
     *        and "5min" indicates every five minutes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAutoPredictorResult withForecastFrequency(String forecastFrequency) {
        setForecastFrequency(forecastFrequency);
        return this;
    }

    /**
     * <p>
     * An array of dimension (field) names that specify the attributes used to group your time series.
     * </p>
     * 
     * @return An array of dimension (field) names that specify the attributes used to group your time series.
     */

    public java.util.List<String> getForecastDimensions() {
        return forecastDimensions;
    }

    /**
     * <p>
     * An array of dimension (field) names that specify the attributes used to group your time series.
     * </p>
     * 
     * @param forecastDimensions
     *        An array of dimension (field) names that specify the attributes used to group your time series.
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
     * An array of dimension (field) names that specify the attributes used to group your time series.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setForecastDimensions(java.util.Collection)} or {@link #withForecastDimensions(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param forecastDimensions
     *        An array of dimension (field) names that specify the attributes used to group your time series.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAutoPredictorResult withForecastDimensions(String... forecastDimensions) {
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
     * An array of dimension (field) names that specify the attributes used to group your time series.
     * </p>
     * 
     * @param forecastDimensions
     *        An array of dimension (field) names that specify the attributes used to group your time series.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAutoPredictorResult withForecastDimensions(java.util.Collection<String> forecastDimensions) {
        setForecastDimensions(forecastDimensions);
        return this;
    }

    /**
     * <p>
     * An array of the ARNs of the dataset import jobs used to import training data for the predictor.
     * </p>
     * 
     * @return An array of the ARNs of the dataset import jobs used to import training data for the predictor.
     */

    public java.util.List<String> getDatasetImportJobArns() {
        return datasetImportJobArns;
    }

    /**
     * <p>
     * An array of the ARNs of the dataset import jobs used to import training data for the predictor.
     * </p>
     * 
     * @param datasetImportJobArns
     *        An array of the ARNs of the dataset import jobs used to import training data for the predictor.
     */

    public void setDatasetImportJobArns(java.util.Collection<String> datasetImportJobArns) {
        if (datasetImportJobArns == null) {
            this.datasetImportJobArns = null;
            return;
        }

        this.datasetImportJobArns = new java.util.ArrayList<String>(datasetImportJobArns);
    }

    /**
     * <p>
     * An array of the ARNs of the dataset import jobs used to import training data for the predictor.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDatasetImportJobArns(java.util.Collection)} or {@link #withDatasetImportJobArns(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param datasetImportJobArns
     *        An array of the ARNs of the dataset import jobs used to import training data for the predictor.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAutoPredictorResult withDatasetImportJobArns(String... datasetImportJobArns) {
        if (this.datasetImportJobArns == null) {
            setDatasetImportJobArns(new java.util.ArrayList<String>(datasetImportJobArns.length));
        }
        for (String ele : datasetImportJobArns) {
            this.datasetImportJobArns.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of the ARNs of the dataset import jobs used to import training data for the predictor.
     * </p>
     * 
     * @param datasetImportJobArns
     *        An array of the ARNs of the dataset import jobs used to import training data for the predictor.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAutoPredictorResult withDatasetImportJobArns(java.util.Collection<String> datasetImportJobArns) {
        setDatasetImportJobArns(datasetImportJobArns);
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

    public DescribeAutoPredictorResult withDataConfig(DataConfig dataConfig) {
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

    public DescribeAutoPredictorResult withEncryptionConfig(EncryptionConfig encryptionConfig) {
        setEncryptionConfig(encryptionConfig);
        return this;
    }

    /**
     * <p>
     * The ARN and state of the reference predictor. This parameter is only valid for retrained or upgraded predictors.
     * </p>
     * 
     * @param referencePredictorSummary
     *        The ARN and state of the reference predictor. This parameter is only valid for retrained or upgraded
     *        predictors.
     */

    public void setReferencePredictorSummary(ReferencePredictorSummary referencePredictorSummary) {
        this.referencePredictorSummary = referencePredictorSummary;
    }

    /**
     * <p>
     * The ARN and state of the reference predictor. This parameter is only valid for retrained or upgraded predictors.
     * </p>
     * 
     * @return The ARN and state of the reference predictor. This parameter is only valid for retrained or upgraded
     *         predictors.
     */

    public ReferencePredictorSummary getReferencePredictorSummary() {
        return this.referencePredictorSummary;
    }

    /**
     * <p>
     * The ARN and state of the reference predictor. This parameter is only valid for retrained or upgraded predictors.
     * </p>
     * 
     * @param referencePredictorSummary
     *        The ARN and state of the reference predictor. This parameter is only valid for retrained or upgraded
     *        predictors.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAutoPredictorResult withReferencePredictorSummary(ReferencePredictorSummary referencePredictorSummary) {
        setReferencePredictorSummary(referencePredictorSummary);
        return this;
    }

    /**
     * <p>
     * The estimated time remaining in minutes for the predictor training job to complete.
     * </p>
     * 
     * @param estimatedTimeRemainingInMinutes
     *        The estimated time remaining in minutes for the predictor training job to complete.
     */

    public void setEstimatedTimeRemainingInMinutes(Long estimatedTimeRemainingInMinutes) {
        this.estimatedTimeRemainingInMinutes = estimatedTimeRemainingInMinutes;
    }

    /**
     * <p>
     * The estimated time remaining in minutes for the predictor training job to complete.
     * </p>
     * 
     * @return The estimated time remaining in minutes for the predictor training job to complete.
     */

    public Long getEstimatedTimeRemainingInMinutes() {
        return this.estimatedTimeRemainingInMinutes;
    }

    /**
     * <p>
     * The estimated time remaining in minutes for the predictor training job to complete.
     * </p>
     * 
     * @param estimatedTimeRemainingInMinutes
     *        The estimated time remaining in minutes for the predictor training job to complete.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAutoPredictorResult withEstimatedTimeRemainingInMinutes(Long estimatedTimeRemainingInMinutes) {
        setEstimatedTimeRemainingInMinutes(estimatedTimeRemainingInMinutes);
        return this;
    }

    /**
     * <p>
     * The status of the predictor. States include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ACTIVE</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CREATE_PENDING</code>, <code>CREATE_IN_PROGRESS</code>, <code>CREATE_FAILED</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CREATE_STOPPING</code>, <code>CREATE_STOPPED</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETE_PENDING</code>, <code>DELETE_IN_PROGRESS</code>, <code>DELETE_FAILED</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        The status of the predictor. States include: </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ACTIVE</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CREATE_PENDING</code>, <code>CREATE_IN_PROGRESS</code>, <code>CREATE_FAILED</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CREATE_STOPPING</code>, <code>CREATE_STOPPED</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DELETE_PENDING</code>, <code>DELETE_IN_PROGRESS</code>, <code>DELETE_FAILED</code>
     *        </p>
     *        </li>
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the predictor. States include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ACTIVE</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CREATE_PENDING</code>, <code>CREATE_IN_PROGRESS</code>, <code>CREATE_FAILED</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CREATE_STOPPING</code>, <code>CREATE_STOPPED</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETE_PENDING</code>, <code>DELETE_IN_PROGRESS</code>, <code>DELETE_FAILED</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @return The status of the predictor. States include: </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>ACTIVE</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>CREATE_PENDING</code>, <code>CREATE_IN_PROGRESS</code>, <code>CREATE_FAILED</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>CREATE_STOPPING</code>, <code>CREATE_STOPPED</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>DELETE_PENDING</code>, <code>DELETE_IN_PROGRESS</code>, <code>DELETE_FAILED</code>
     *         </p>
     *         </li>
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the predictor. States include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ACTIVE</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CREATE_PENDING</code>, <code>CREATE_IN_PROGRESS</code>, <code>CREATE_FAILED</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CREATE_STOPPING</code>, <code>CREATE_STOPPED</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETE_PENDING</code>, <code>DELETE_IN_PROGRESS</code>, <code>DELETE_FAILED</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        The status of the predictor. States include: </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ACTIVE</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CREATE_PENDING</code>, <code>CREATE_IN_PROGRESS</code>, <code>CREATE_FAILED</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CREATE_STOPPING</code>, <code>CREATE_STOPPED</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DELETE_PENDING</code>, <code>DELETE_IN_PROGRESS</code>, <code>DELETE_FAILED</code>
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAutoPredictorResult withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * In the event of an error, a message detailing the cause of the error.
     * </p>
     * 
     * @param message
     *        In the event of an error, a message detailing the cause of the error.
     */

    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * <p>
     * In the event of an error, a message detailing the cause of the error.
     * </p>
     * 
     * @return In the event of an error, a message detailing the cause of the error.
     */

    public String getMessage() {
        return this.message;
    }

    /**
     * <p>
     * In the event of an error, a message detailing the cause of the error.
     * </p>
     * 
     * @param message
     *        In the event of an error, a message detailing the cause of the error.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAutoPredictorResult withMessage(String message) {
        setMessage(message);
        return this;
    }

    /**
     * <p>
     * The timestamp of the CreateAutoPredictor request.
     * </p>
     * 
     * @param creationTime
     *        The timestamp of the CreateAutoPredictor request.
     */

    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * The timestamp of the CreateAutoPredictor request.
     * </p>
     * 
     * @return The timestamp of the CreateAutoPredictor request.
     */

    public java.util.Date getCreationTime() {
        return this.creationTime;
    }

    /**
     * <p>
     * The timestamp of the CreateAutoPredictor request.
     * </p>
     * 
     * @param creationTime
     *        The timestamp of the CreateAutoPredictor request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAutoPredictorResult withCreationTime(java.util.Date creationTime) {
        setCreationTime(creationTime);
        return this;
    }

    /**
     * <p>
     * The last time the resource was modified. The timestamp depends on the status of the job:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CREATE_PENDING</code> - The <code>CreationTime</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CREATE_IN_PROGRESS</code> - The current timestamp.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CREATE_STOPPING</code> - The current timestamp.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CREATE_STOPPED</code> - When the job stopped.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ACTIVE</code> or <code>CREATE_FAILED</code> - When the job finished or failed.
     * </p>
     * </li>
     * </ul>
     * 
     * @param lastModificationTime
     *        The last time the resource was modified. The timestamp depends on the status of the job:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>CREATE_PENDING</code> - The <code>CreationTime</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CREATE_IN_PROGRESS</code> - The current timestamp.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CREATE_STOPPING</code> - The current timestamp.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CREATE_STOPPED</code> - When the job stopped.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ACTIVE</code> or <code>CREATE_FAILED</code> - When the job finished or failed.
     *        </p>
     *        </li>
     */

    public void setLastModificationTime(java.util.Date lastModificationTime) {
        this.lastModificationTime = lastModificationTime;
    }

    /**
     * <p>
     * The last time the resource was modified. The timestamp depends on the status of the job:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CREATE_PENDING</code> - The <code>CreationTime</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CREATE_IN_PROGRESS</code> - The current timestamp.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CREATE_STOPPING</code> - The current timestamp.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CREATE_STOPPED</code> - When the job stopped.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ACTIVE</code> or <code>CREATE_FAILED</code> - When the job finished or failed.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The last time the resource was modified. The timestamp depends on the status of the job:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>CREATE_PENDING</code> - The <code>CreationTime</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>CREATE_IN_PROGRESS</code> - The current timestamp.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>CREATE_STOPPING</code> - The current timestamp.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>CREATE_STOPPED</code> - When the job stopped.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ACTIVE</code> or <code>CREATE_FAILED</code> - When the job finished or failed.
     *         </p>
     *         </li>
     */

    public java.util.Date getLastModificationTime() {
        return this.lastModificationTime;
    }

    /**
     * <p>
     * The last time the resource was modified. The timestamp depends on the status of the job:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CREATE_PENDING</code> - The <code>CreationTime</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CREATE_IN_PROGRESS</code> - The current timestamp.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CREATE_STOPPING</code> - The current timestamp.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CREATE_STOPPED</code> - When the job stopped.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ACTIVE</code> or <code>CREATE_FAILED</code> - When the job finished or failed.
     * </p>
     * </li>
     * </ul>
     * 
     * @param lastModificationTime
     *        The last time the resource was modified. The timestamp depends on the status of the job:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>CREATE_PENDING</code> - The <code>CreationTime</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CREATE_IN_PROGRESS</code> - The current timestamp.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CREATE_STOPPING</code> - The current timestamp.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CREATE_STOPPED</code> - When the job stopped.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ACTIVE</code> or <code>CREATE_FAILED</code> - When the job finished or failed.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAutoPredictorResult withLastModificationTime(java.util.Date lastModificationTime) {
        setLastModificationTime(lastModificationTime);
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

    public DescribeAutoPredictorResult withOptimizationMetric(String optimizationMetric) {
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

    public DescribeAutoPredictorResult withOptimizationMetric(OptimizationMetric optimizationMetric) {
        this.optimizationMetric = optimizationMetric.toString();
        return this;
    }

    /**
     * <p>
     * Provides the status and ARN of the Predictor Explainability.
     * </p>
     * 
     * @param explainabilityInfo
     *        Provides the status and ARN of the Predictor Explainability.
     */

    public void setExplainabilityInfo(ExplainabilityInfo explainabilityInfo) {
        this.explainabilityInfo = explainabilityInfo;
    }

    /**
     * <p>
     * Provides the status and ARN of the Predictor Explainability.
     * </p>
     * 
     * @return Provides the status and ARN of the Predictor Explainability.
     */

    public ExplainabilityInfo getExplainabilityInfo() {
        return this.explainabilityInfo;
    }

    /**
     * <p>
     * Provides the status and ARN of the Predictor Explainability.
     * </p>
     * 
     * @param explainabilityInfo
     *        Provides the status and ARN of the Predictor Explainability.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAutoPredictorResult withExplainabilityInfo(ExplainabilityInfo explainabilityInfo) {
        setExplainabilityInfo(explainabilityInfo);
        return this;
    }

    /**
     * <p>
     * A object with the Amazon Resource Name (ARN) and status of the monitor resource.
     * </p>
     * 
     * @param monitorInfo
     *        A object with the Amazon Resource Name (ARN) and status of the monitor resource.
     */

    public void setMonitorInfo(MonitorInfo monitorInfo) {
        this.monitorInfo = monitorInfo;
    }

    /**
     * <p>
     * A object with the Amazon Resource Name (ARN) and status of the monitor resource.
     * </p>
     * 
     * @return A object with the Amazon Resource Name (ARN) and status of the monitor resource.
     */

    public MonitorInfo getMonitorInfo() {
        return this.monitorInfo;
    }

    /**
     * <p>
     * A object with the Amazon Resource Name (ARN) and status of the monitor resource.
     * </p>
     * 
     * @param monitorInfo
     *        A object with the Amazon Resource Name (ARN) and status of the monitor resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAutoPredictorResult withMonitorInfo(MonitorInfo monitorInfo) {
        setMonitorInfo(monitorInfo);
        return this;
    }

    /**
     * <p>
     * The time boundary Forecast uses when aggregating data.
     * </p>
     * 
     * @param timeAlignmentBoundary
     *        The time boundary Forecast uses when aggregating data.
     */

    public void setTimeAlignmentBoundary(TimeAlignmentBoundary timeAlignmentBoundary) {
        this.timeAlignmentBoundary = timeAlignmentBoundary;
    }

    /**
     * <p>
     * The time boundary Forecast uses when aggregating data.
     * </p>
     * 
     * @return The time boundary Forecast uses when aggregating data.
     */

    public TimeAlignmentBoundary getTimeAlignmentBoundary() {
        return this.timeAlignmentBoundary;
    }

    /**
     * <p>
     * The time boundary Forecast uses when aggregating data.
     * </p>
     * 
     * @param timeAlignmentBoundary
     *        The time boundary Forecast uses when aggregating data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAutoPredictorResult withTimeAlignmentBoundary(TimeAlignmentBoundary timeAlignmentBoundary) {
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
        if (getPredictorArn() != null)
            sb.append("PredictorArn: ").append(getPredictorArn()).append(",");
        if (getPredictorName() != null)
            sb.append("PredictorName: ").append(getPredictorName()).append(",");
        if (getForecastHorizon() != null)
            sb.append("ForecastHorizon: ").append(getForecastHorizon()).append(",");
        if (getForecastTypes() != null)
            sb.append("ForecastTypes: ").append(getForecastTypes()).append(",");
        if (getForecastFrequency() != null)
            sb.append("ForecastFrequency: ").append(getForecastFrequency()).append(",");
        if (getForecastDimensions() != null)
            sb.append("ForecastDimensions: ").append(getForecastDimensions()).append(",");
        if (getDatasetImportJobArns() != null)
            sb.append("DatasetImportJobArns: ").append(getDatasetImportJobArns()).append(",");
        if (getDataConfig() != null)
            sb.append("DataConfig: ").append(getDataConfig()).append(",");
        if (getEncryptionConfig() != null)
            sb.append("EncryptionConfig: ").append(getEncryptionConfig()).append(",");
        if (getReferencePredictorSummary() != null)
            sb.append("ReferencePredictorSummary: ").append(getReferencePredictorSummary()).append(",");
        if (getEstimatedTimeRemainingInMinutes() != null)
            sb.append("EstimatedTimeRemainingInMinutes: ").append(getEstimatedTimeRemainingInMinutes()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getMessage() != null)
            sb.append("Message: ").append(getMessage()).append(",");
        if (getCreationTime() != null)
            sb.append("CreationTime: ").append(getCreationTime()).append(",");
        if (getLastModificationTime() != null)
            sb.append("LastModificationTime: ").append(getLastModificationTime()).append(",");
        if (getOptimizationMetric() != null)
            sb.append("OptimizationMetric: ").append(getOptimizationMetric()).append(",");
        if (getExplainabilityInfo() != null)
            sb.append("ExplainabilityInfo: ").append(getExplainabilityInfo()).append(",");
        if (getMonitorInfo() != null)
            sb.append("MonitorInfo: ").append(getMonitorInfo()).append(",");
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

        if (obj instanceof DescribeAutoPredictorResult == false)
            return false;
        DescribeAutoPredictorResult other = (DescribeAutoPredictorResult) obj;
        if (other.getPredictorArn() == null ^ this.getPredictorArn() == null)
            return false;
        if (other.getPredictorArn() != null && other.getPredictorArn().equals(this.getPredictorArn()) == false)
            return false;
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
        if (other.getForecastFrequency() == null ^ this.getForecastFrequency() == null)
            return false;
        if (other.getForecastFrequency() != null && other.getForecastFrequency().equals(this.getForecastFrequency()) == false)
            return false;
        if (other.getForecastDimensions() == null ^ this.getForecastDimensions() == null)
            return false;
        if (other.getForecastDimensions() != null && other.getForecastDimensions().equals(this.getForecastDimensions()) == false)
            return false;
        if (other.getDatasetImportJobArns() == null ^ this.getDatasetImportJobArns() == null)
            return false;
        if (other.getDatasetImportJobArns() != null && other.getDatasetImportJobArns().equals(this.getDatasetImportJobArns()) == false)
            return false;
        if (other.getDataConfig() == null ^ this.getDataConfig() == null)
            return false;
        if (other.getDataConfig() != null && other.getDataConfig().equals(this.getDataConfig()) == false)
            return false;
        if (other.getEncryptionConfig() == null ^ this.getEncryptionConfig() == null)
            return false;
        if (other.getEncryptionConfig() != null && other.getEncryptionConfig().equals(this.getEncryptionConfig()) == false)
            return false;
        if (other.getReferencePredictorSummary() == null ^ this.getReferencePredictorSummary() == null)
            return false;
        if (other.getReferencePredictorSummary() != null && other.getReferencePredictorSummary().equals(this.getReferencePredictorSummary()) == false)
            return false;
        if (other.getEstimatedTimeRemainingInMinutes() == null ^ this.getEstimatedTimeRemainingInMinutes() == null)
            return false;
        if (other.getEstimatedTimeRemainingInMinutes() != null
                && other.getEstimatedTimeRemainingInMinutes().equals(this.getEstimatedTimeRemainingInMinutes()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getMessage() == null ^ this.getMessage() == null)
            return false;
        if (other.getMessage() != null && other.getMessage().equals(this.getMessage()) == false)
            return false;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        if (other.getLastModificationTime() == null ^ this.getLastModificationTime() == null)
            return false;
        if (other.getLastModificationTime() != null && other.getLastModificationTime().equals(this.getLastModificationTime()) == false)
            return false;
        if (other.getOptimizationMetric() == null ^ this.getOptimizationMetric() == null)
            return false;
        if (other.getOptimizationMetric() != null && other.getOptimizationMetric().equals(this.getOptimizationMetric()) == false)
            return false;
        if (other.getExplainabilityInfo() == null ^ this.getExplainabilityInfo() == null)
            return false;
        if (other.getExplainabilityInfo() != null && other.getExplainabilityInfo().equals(this.getExplainabilityInfo()) == false)
            return false;
        if (other.getMonitorInfo() == null ^ this.getMonitorInfo() == null)
            return false;
        if (other.getMonitorInfo() != null && other.getMonitorInfo().equals(this.getMonitorInfo()) == false)
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

        hashCode = prime * hashCode + ((getPredictorArn() == null) ? 0 : getPredictorArn().hashCode());
        hashCode = prime * hashCode + ((getPredictorName() == null) ? 0 : getPredictorName().hashCode());
        hashCode = prime * hashCode + ((getForecastHorizon() == null) ? 0 : getForecastHorizon().hashCode());
        hashCode = prime * hashCode + ((getForecastTypes() == null) ? 0 : getForecastTypes().hashCode());
        hashCode = prime * hashCode + ((getForecastFrequency() == null) ? 0 : getForecastFrequency().hashCode());
        hashCode = prime * hashCode + ((getForecastDimensions() == null) ? 0 : getForecastDimensions().hashCode());
        hashCode = prime * hashCode + ((getDatasetImportJobArns() == null) ? 0 : getDatasetImportJobArns().hashCode());
        hashCode = prime * hashCode + ((getDataConfig() == null) ? 0 : getDataConfig().hashCode());
        hashCode = prime * hashCode + ((getEncryptionConfig() == null) ? 0 : getEncryptionConfig().hashCode());
        hashCode = prime * hashCode + ((getReferencePredictorSummary() == null) ? 0 : getReferencePredictorSummary().hashCode());
        hashCode = prime * hashCode + ((getEstimatedTimeRemainingInMinutes() == null) ? 0 : getEstimatedTimeRemainingInMinutes().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getMessage() == null) ? 0 : getMessage().hashCode());
        hashCode = prime * hashCode + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode + ((getLastModificationTime() == null) ? 0 : getLastModificationTime().hashCode());
        hashCode = prime * hashCode + ((getOptimizationMetric() == null) ? 0 : getOptimizationMetric().hashCode());
        hashCode = prime * hashCode + ((getExplainabilityInfo() == null) ? 0 : getExplainabilityInfo().hashCode());
        hashCode = prime * hashCode + ((getMonitorInfo() == null) ? 0 : getMonitorInfo().hashCode());
        hashCode = prime * hashCode + ((getTimeAlignmentBoundary() == null) ? 0 : getTimeAlignmentBoundary().hashCode());
        return hashCode;
    }

    @Override
    public DescribeAutoPredictorResult clone() {
        try {
            return (DescribeAutoPredictorResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
