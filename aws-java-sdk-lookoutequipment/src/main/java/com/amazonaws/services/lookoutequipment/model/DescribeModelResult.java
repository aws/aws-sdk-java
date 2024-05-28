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
package com.amazonaws.services.lookoutequipment.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutequipment-2020-12-15/DescribeModel" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeModelResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the machine learning model being described.
     * </p>
     */
    private String modelName;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the machine learning model being described.
     * </p>
     */
    private String modelArn;
    /**
     * <p>
     * The name of the dataset being used by the machine learning being described.
     * </p>
     */
    private String datasetName;
    /**
     * <p>
     * The Amazon Resouce Name (ARN) of the dataset used to create the machine learning model being described.
     * </p>
     */
    private String datasetArn;
    /**
     * <p>
     * A JSON description of the data that is in each time series dataset, including names, column names, and data
     * types.
     * </p>
     */
    private String schema;
    /**
     * <p>
     * Specifies configuration information about the labels input, including its S3 location.
     * </p>
     */
    private LabelsInputConfiguration labelsInputConfiguration;
    /**
     * <p>
     * Indicates the time reference in the dataset that was used to begin the subset of training data for the machine
     * learning model.
     * </p>
     */
    private java.util.Date trainingDataStartTime;
    /**
     * <p>
     * Indicates the time reference in the dataset that was used to end the subset of training data for the machine
     * learning model.
     * </p>
     */
    private java.util.Date trainingDataEndTime;
    /**
     * <p>
     * Indicates the time reference in the dataset that was used to begin the subset of evaluation data for the machine
     * learning model.
     * </p>
     */
    private java.util.Date evaluationDataStartTime;
    /**
     * <p>
     * Indicates the time reference in the dataset that was used to end the subset of evaluation data for the machine
     * learning model.
     * </p>
     */
    private java.util.Date evaluationDataEndTime;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of a role with permission to access the data source for the machine learning model
     * being described.
     * </p>
     */
    private String roleArn;
    /**
     * <p>
     * The configuration is the <code>TargetSamplingRate</code>, which is the sampling rate of the data after post
     * processing by Amazon Lookout for Equipment. For example, if you provide data that has been collected at a 1
     * second level and you want the system to resample the data at a 1 minute rate before training, the
     * <code>TargetSamplingRate</code> is 1 minute.
     * </p>
     * <p>
     * When providing a value for the <code>TargetSamplingRate</code>, you must attach the prefix "PT" to the rate you
     * want. The value for a 1 second rate is therefore <i>PT1S</i>, the value for a 15 minute rate is <i>PT15M</i>, and
     * the value for a 1 hour rate is <i>PT1H</i>
     * </p>
     */
    private DataPreProcessingConfiguration dataPreProcessingConfiguration;
    /**
     * <p>
     * Specifies the current status of the model being described. Status describes the status of the most recent action
     * of the model.
     * </p>
     */
    private String status;
    /**
     * <p>
     * Indicates the time at which the training of the machine learning model began.
     * </p>
     */
    private java.util.Date trainingExecutionStartTime;
    /**
     * <p>
     * Indicates the time at which the training of the machine learning model was completed.
     * </p>
     */
    private java.util.Date trainingExecutionEndTime;
    /**
     * <p>
     * If the training of the machine learning model failed, this indicates the reason for that failure.
     * </p>
     */
    private String failedReason;
    /**
     * <p>
     * The Model Metrics show an aggregated summary of the model's performance within the evaluation time range. This is
     * the JSON content of the metrics created when evaluating the model.
     * </p>
     */
    private String modelMetrics;
    /**
     * <p>
     * Indicates the last time the machine learning model was updated. The type of update is not specified.
     * </p>
     */
    private java.util.Date lastUpdatedTime;
    /**
     * <p>
     * Indicates the time and date at which the machine learning model was created.
     * </p>
     */
    private java.util.Date createdAt;
    /**
     * <p>
     * Provides the identifier of the KMS key used to encrypt model data by Amazon Lookout for Equipment.
     * </p>
     */
    private String serverSideKmsKeyId;
    /**
     * <p>
     * Indicates that the asset associated with this sensor has been shut off. As long as this condition is met, Lookout
     * for Equipment will not use data from this asset for training, evaluation, or inference.
     * </p>
     */
    private String offCondition;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the source model version. This field appears if the active model version was
     * imported.
     * </p>
     */
    private String sourceModelVersionArn;
    /**
     * <p>
     * The date and time when the import job was started. This field appears if the active model version was imported.
     * </p>
     */
    private java.util.Date importJobStartTime;
    /**
     * <p>
     * The date and time when the import job was completed. This field appears if the active model version was imported.
     * </p>
     */
    private java.util.Date importJobEndTime;
    /**
     * <p>
     * The name of the model version used by the inference schedular when running a scheduled inference execution.
     * </p>
     */
    private Long activeModelVersion;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the model version used by the inference scheduler when running a scheduled
     * inference execution.
     * </p>
     */
    private String activeModelVersionArn;
    /**
     * <p>
     * The date the active model version was activated.
     * </p>
     */
    private java.util.Date modelVersionActivatedAt;
    /**
     * <p>
     * The model version that was set as the active model version prior to the current active model version.
     * </p>
     */
    private Long previousActiveModelVersion;
    /**
     * <p>
     * The ARN of the model version that was set as the active model version prior to the current active model version.
     * </p>
     */
    private String previousActiveModelVersionArn;
    /**
     * <p>
     * The date and time when the previous active model version was activated.
     * </p>
     */
    private java.util.Date previousModelVersionActivatedAt;
    /**
     * <p>
     * If the model version was retrained, this field shows a summary of the performance of the prior model on the new
     * training range. You can use the information in this JSON-formatted object to compare the new model version and
     * the prior model version.
     * </p>
     */
    private String priorModelMetrics;
    /**
     * <p>
     * If the model version was generated by retraining and the training failed, this indicates the reason for that
     * failure.
     * </p>
     */
    private String latestScheduledRetrainingFailedReason;
    /**
     * <p>
     * Indicates the status of the most recent scheduled retraining run.
     * </p>
     */
    private String latestScheduledRetrainingStatus;
    /**
     * <p>
     * Indicates the most recent model version that was generated by retraining.
     * </p>
     */
    private Long latestScheduledRetrainingModelVersion;
    /**
     * <p>
     * Indicates the start time of the most recent scheduled retraining run.
     * </p>
     */
    private java.util.Date latestScheduledRetrainingStartTime;
    /**
     * <p>
     * Indicates the number of days of data used in the most recent scheduled retraining run.
     * </p>
     */
    private Integer latestScheduledRetrainingAvailableDataInDays;
    /**
     * <p>
     * Indicates the date and time that the next scheduled retraining run will start on. Lookout for Equipment truncates
     * the time you provide to the nearest UTC day.
     * </p>
     */
    private java.util.Date nextScheduledRetrainingStartDate;
    /**
     * <p>
     * Indicates the start time of the inference data that has been accumulated.
     * </p>
     */
    private java.util.Date accumulatedInferenceDataStartTime;
    /**
     * <p>
     * Indicates the end time of the inference data that has been accumulated.
     * </p>
     */
    private java.util.Date accumulatedInferenceDataEndTime;
    /**
     * <p>
     * Indicates the status of the retraining scheduler.
     * </p>
     */
    private String retrainingSchedulerStatus;
    /**
     * <p>
     * Configuration information for the model's pointwise model diagnostics.
     * </p>
     */
    private ModelDiagnosticsOutputConfiguration modelDiagnosticsOutputConfiguration;
    /**
     * <p>
     * Provides a quality assessment for a model that uses labels. If Lookout for Equipment determines that the model
     * quality is poor based on training metrics, the value is <code>POOR_QUALITY_DETECTED</code>. Otherwise, the value
     * is <code>QUALITY_THRESHOLD_MET</code>.
     * </p>
     * <p>
     * If the model is unlabeled, the model quality can't be assessed and the value of <code>ModelQuality</code> is
     * <code>CANNOT_DETERMINE_QUALITY</code>. In this situation, you can get a model quality assessment by adding labels
     * to the input dataset and retraining the model.
     * </p>
     * <p>
     * For information about using labels with your models, see <a
     * href="https://docs.aws.amazon.com/lookout-for-equipment/latest/ug/understanding-labeling.html">Understanding
     * labeling</a>.
     * </p>
     * <p>
     * For information about improving the quality of a model, see <a
     * href="https://docs.aws.amazon.com/lookout-for-equipment/latest/ug/best-practices.html">Best practices with Amazon
     * Lookout for Equipment</a>.
     * </p>
     */
    private String modelQuality;

    /**
     * <p>
     * The name of the machine learning model being described.
     * </p>
     * 
     * @param modelName
     *        The name of the machine learning model being described.
     */

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    /**
     * <p>
     * The name of the machine learning model being described.
     * </p>
     * 
     * @return The name of the machine learning model being described.
     */

    public String getModelName() {
        return this.modelName;
    }

    /**
     * <p>
     * The name of the machine learning model being described.
     * </p>
     * 
     * @param modelName
     *        The name of the machine learning model being described.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeModelResult withModelName(String modelName) {
        setModelName(modelName);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the machine learning model being described.
     * </p>
     * 
     * @param modelArn
     *        The Amazon Resource Name (ARN) of the machine learning model being described.
     */

    public void setModelArn(String modelArn) {
        this.modelArn = modelArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the machine learning model being described.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the machine learning model being described.
     */

    public String getModelArn() {
        return this.modelArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the machine learning model being described.
     * </p>
     * 
     * @param modelArn
     *        The Amazon Resource Name (ARN) of the machine learning model being described.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeModelResult withModelArn(String modelArn) {
        setModelArn(modelArn);
        return this;
    }

    /**
     * <p>
     * The name of the dataset being used by the machine learning being described.
     * </p>
     * 
     * @param datasetName
     *        The name of the dataset being used by the machine learning being described.
     */

    public void setDatasetName(String datasetName) {
        this.datasetName = datasetName;
    }

    /**
     * <p>
     * The name of the dataset being used by the machine learning being described.
     * </p>
     * 
     * @return The name of the dataset being used by the machine learning being described.
     */

    public String getDatasetName() {
        return this.datasetName;
    }

    /**
     * <p>
     * The name of the dataset being used by the machine learning being described.
     * </p>
     * 
     * @param datasetName
     *        The name of the dataset being used by the machine learning being described.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeModelResult withDatasetName(String datasetName) {
        setDatasetName(datasetName);
        return this;
    }

    /**
     * <p>
     * The Amazon Resouce Name (ARN) of the dataset used to create the machine learning model being described.
     * </p>
     * 
     * @param datasetArn
     *        The Amazon Resouce Name (ARN) of the dataset used to create the machine learning model being described.
     */

    public void setDatasetArn(String datasetArn) {
        this.datasetArn = datasetArn;
    }

    /**
     * <p>
     * The Amazon Resouce Name (ARN) of the dataset used to create the machine learning model being described.
     * </p>
     * 
     * @return The Amazon Resouce Name (ARN) of the dataset used to create the machine learning model being described.
     */

    public String getDatasetArn() {
        return this.datasetArn;
    }

    /**
     * <p>
     * The Amazon Resouce Name (ARN) of the dataset used to create the machine learning model being described.
     * </p>
     * 
     * @param datasetArn
     *        The Amazon Resouce Name (ARN) of the dataset used to create the machine learning model being described.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeModelResult withDatasetArn(String datasetArn) {
        setDatasetArn(datasetArn);
        return this;
    }

    /**
     * <p>
     * A JSON description of the data that is in each time series dataset, including names, column names, and data
     * types.
     * </p>
     * <p>
     * This field's value must be valid JSON according to RFC 7159, including the opening and closing braces. For
     * example: '{"key": "value"}'.
     * </p>
     * <p>
     * The AWS SDK for Java performs a Base64 encoding on this field before sending this request to the AWS service.
     * Users of the SDK should not perform Base64 encoding on this field.
     * </p>
     * 
     * @param schema
     *        A JSON description of the data that is in each time series dataset, including names, column names, and
     *        data types.
     */

    public void setSchema(String schema) {
        this.schema = schema;
    }

    /**
     * <p>
     * A JSON description of the data that is in each time series dataset, including names, column names, and data
     * types.
     * </p>
     * <p>
     * This field's value will be valid JSON according to RFC 7159, including the opening and closing braces. For
     * example: '{"key": "value"}'.
     * </p>
     * 
     * @return A JSON description of the data that is in each time series dataset, including names, column names, and
     *         data types.
     */

    public String getSchema() {
        return this.schema;
    }

    /**
     * <p>
     * A JSON description of the data that is in each time series dataset, including names, column names, and data
     * types.
     * </p>
     * <p>
     * This field's value must be valid JSON according to RFC 7159, including the opening and closing braces. For
     * example: '{"key": "value"}'.
     * </p>
     * <p>
     * The AWS SDK for Java performs a Base64 encoding on this field before sending this request to the AWS service.
     * Users of the SDK should not perform Base64 encoding on this field.
     * </p>
     * 
     * @param schema
     *        A JSON description of the data that is in each time series dataset, including names, column names, and
     *        data types.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeModelResult withSchema(String schema) {
        setSchema(schema);
        return this;
    }

    /**
     * <p>
     * Specifies configuration information about the labels input, including its S3 location.
     * </p>
     * 
     * @param labelsInputConfiguration
     *        Specifies configuration information about the labels input, including its S3 location.
     */

    public void setLabelsInputConfiguration(LabelsInputConfiguration labelsInputConfiguration) {
        this.labelsInputConfiguration = labelsInputConfiguration;
    }

    /**
     * <p>
     * Specifies configuration information about the labels input, including its S3 location.
     * </p>
     * 
     * @return Specifies configuration information about the labels input, including its S3 location.
     */

    public LabelsInputConfiguration getLabelsInputConfiguration() {
        return this.labelsInputConfiguration;
    }

    /**
     * <p>
     * Specifies configuration information about the labels input, including its S3 location.
     * </p>
     * 
     * @param labelsInputConfiguration
     *        Specifies configuration information about the labels input, including its S3 location.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeModelResult withLabelsInputConfiguration(LabelsInputConfiguration labelsInputConfiguration) {
        setLabelsInputConfiguration(labelsInputConfiguration);
        return this;
    }

    /**
     * <p>
     * Indicates the time reference in the dataset that was used to begin the subset of training data for the machine
     * learning model.
     * </p>
     * 
     * @param trainingDataStartTime
     *        Indicates the time reference in the dataset that was used to begin the subset of training data for the
     *        machine learning model.
     */

    public void setTrainingDataStartTime(java.util.Date trainingDataStartTime) {
        this.trainingDataStartTime = trainingDataStartTime;
    }

    /**
     * <p>
     * Indicates the time reference in the dataset that was used to begin the subset of training data for the machine
     * learning model.
     * </p>
     * 
     * @return Indicates the time reference in the dataset that was used to begin the subset of training data for the
     *         machine learning model.
     */

    public java.util.Date getTrainingDataStartTime() {
        return this.trainingDataStartTime;
    }

    /**
     * <p>
     * Indicates the time reference in the dataset that was used to begin the subset of training data for the machine
     * learning model.
     * </p>
     * 
     * @param trainingDataStartTime
     *        Indicates the time reference in the dataset that was used to begin the subset of training data for the
     *        machine learning model.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeModelResult withTrainingDataStartTime(java.util.Date trainingDataStartTime) {
        setTrainingDataStartTime(trainingDataStartTime);
        return this;
    }

    /**
     * <p>
     * Indicates the time reference in the dataset that was used to end the subset of training data for the machine
     * learning model.
     * </p>
     * 
     * @param trainingDataEndTime
     *        Indicates the time reference in the dataset that was used to end the subset of training data for the
     *        machine learning model.
     */

    public void setTrainingDataEndTime(java.util.Date trainingDataEndTime) {
        this.trainingDataEndTime = trainingDataEndTime;
    }

    /**
     * <p>
     * Indicates the time reference in the dataset that was used to end the subset of training data for the machine
     * learning model.
     * </p>
     * 
     * @return Indicates the time reference in the dataset that was used to end the subset of training data for the
     *         machine learning model.
     */

    public java.util.Date getTrainingDataEndTime() {
        return this.trainingDataEndTime;
    }

    /**
     * <p>
     * Indicates the time reference in the dataset that was used to end the subset of training data for the machine
     * learning model.
     * </p>
     * 
     * @param trainingDataEndTime
     *        Indicates the time reference in the dataset that was used to end the subset of training data for the
     *        machine learning model.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeModelResult withTrainingDataEndTime(java.util.Date trainingDataEndTime) {
        setTrainingDataEndTime(trainingDataEndTime);
        return this;
    }

    /**
     * <p>
     * Indicates the time reference in the dataset that was used to begin the subset of evaluation data for the machine
     * learning model.
     * </p>
     * 
     * @param evaluationDataStartTime
     *        Indicates the time reference in the dataset that was used to begin the subset of evaluation data for the
     *        machine learning model.
     */

    public void setEvaluationDataStartTime(java.util.Date evaluationDataStartTime) {
        this.evaluationDataStartTime = evaluationDataStartTime;
    }

    /**
     * <p>
     * Indicates the time reference in the dataset that was used to begin the subset of evaluation data for the machine
     * learning model.
     * </p>
     * 
     * @return Indicates the time reference in the dataset that was used to begin the subset of evaluation data for the
     *         machine learning model.
     */

    public java.util.Date getEvaluationDataStartTime() {
        return this.evaluationDataStartTime;
    }

    /**
     * <p>
     * Indicates the time reference in the dataset that was used to begin the subset of evaluation data for the machine
     * learning model.
     * </p>
     * 
     * @param evaluationDataStartTime
     *        Indicates the time reference in the dataset that was used to begin the subset of evaluation data for the
     *        machine learning model.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeModelResult withEvaluationDataStartTime(java.util.Date evaluationDataStartTime) {
        setEvaluationDataStartTime(evaluationDataStartTime);
        return this;
    }

    /**
     * <p>
     * Indicates the time reference in the dataset that was used to end the subset of evaluation data for the machine
     * learning model.
     * </p>
     * 
     * @param evaluationDataEndTime
     *        Indicates the time reference in the dataset that was used to end the subset of evaluation data for the
     *        machine learning model.
     */

    public void setEvaluationDataEndTime(java.util.Date evaluationDataEndTime) {
        this.evaluationDataEndTime = evaluationDataEndTime;
    }

    /**
     * <p>
     * Indicates the time reference in the dataset that was used to end the subset of evaluation data for the machine
     * learning model.
     * </p>
     * 
     * @return Indicates the time reference in the dataset that was used to end the subset of evaluation data for the
     *         machine learning model.
     */

    public java.util.Date getEvaluationDataEndTime() {
        return this.evaluationDataEndTime;
    }

    /**
     * <p>
     * Indicates the time reference in the dataset that was used to end the subset of evaluation data for the machine
     * learning model.
     * </p>
     * 
     * @param evaluationDataEndTime
     *        Indicates the time reference in the dataset that was used to end the subset of evaluation data for the
     *        machine learning model.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeModelResult withEvaluationDataEndTime(java.util.Date evaluationDataEndTime) {
        setEvaluationDataEndTime(evaluationDataEndTime);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of a role with permission to access the data source for the machine learning model
     * being described.
     * </p>
     * 
     * @param roleArn
     *        The Amazon Resource Name (ARN) of a role with permission to access the data source for the machine
     *        learning model being described.
     */

    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of a role with permission to access the data source for the machine learning model
     * being described.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of a role with permission to access the data source for the machine
     *         learning model being described.
     */

    public String getRoleArn() {
        return this.roleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of a role with permission to access the data source for the machine learning model
     * being described.
     * </p>
     * 
     * @param roleArn
     *        The Amazon Resource Name (ARN) of a role with permission to access the data source for the machine
     *        learning model being described.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeModelResult withRoleArn(String roleArn) {
        setRoleArn(roleArn);
        return this;
    }

    /**
     * <p>
     * The configuration is the <code>TargetSamplingRate</code>, which is the sampling rate of the data after post
     * processing by Amazon Lookout for Equipment. For example, if you provide data that has been collected at a 1
     * second level and you want the system to resample the data at a 1 minute rate before training, the
     * <code>TargetSamplingRate</code> is 1 minute.
     * </p>
     * <p>
     * When providing a value for the <code>TargetSamplingRate</code>, you must attach the prefix "PT" to the rate you
     * want. The value for a 1 second rate is therefore <i>PT1S</i>, the value for a 15 minute rate is <i>PT15M</i>, and
     * the value for a 1 hour rate is <i>PT1H</i>
     * </p>
     * 
     * @param dataPreProcessingConfiguration
     *        The configuration is the <code>TargetSamplingRate</code>, which is the sampling rate of the data after
     *        post processing by Amazon Lookout for Equipment. For example, if you provide data that has been collected
     *        at a 1 second level and you want the system to resample the data at a 1 minute rate before training, the
     *        <code>TargetSamplingRate</code> is 1 minute.</p>
     *        <p>
     *        When providing a value for the <code>TargetSamplingRate</code>, you must attach the prefix "PT" to the
     *        rate you want. The value for a 1 second rate is therefore <i>PT1S</i>, the value for a 15 minute rate is
     *        <i>PT15M</i>, and the value for a 1 hour rate is <i>PT1H</i>
     */

    public void setDataPreProcessingConfiguration(DataPreProcessingConfiguration dataPreProcessingConfiguration) {
        this.dataPreProcessingConfiguration = dataPreProcessingConfiguration;
    }

    /**
     * <p>
     * The configuration is the <code>TargetSamplingRate</code>, which is the sampling rate of the data after post
     * processing by Amazon Lookout for Equipment. For example, if you provide data that has been collected at a 1
     * second level and you want the system to resample the data at a 1 minute rate before training, the
     * <code>TargetSamplingRate</code> is 1 minute.
     * </p>
     * <p>
     * When providing a value for the <code>TargetSamplingRate</code>, you must attach the prefix "PT" to the rate you
     * want. The value for a 1 second rate is therefore <i>PT1S</i>, the value for a 15 minute rate is <i>PT15M</i>, and
     * the value for a 1 hour rate is <i>PT1H</i>
     * </p>
     * 
     * @return The configuration is the <code>TargetSamplingRate</code>, which is the sampling rate of the data after
     *         post processing by Amazon Lookout for Equipment. For example, if you provide data that has been collected
     *         at a 1 second level and you want the system to resample the data at a 1 minute rate before training, the
     *         <code>TargetSamplingRate</code> is 1 minute.</p>
     *         <p>
     *         When providing a value for the <code>TargetSamplingRate</code>, you must attach the prefix "PT" to the
     *         rate you want. The value for a 1 second rate is therefore <i>PT1S</i>, the value for a 15 minute rate is
     *         <i>PT15M</i>, and the value for a 1 hour rate is <i>PT1H</i>
     */

    public DataPreProcessingConfiguration getDataPreProcessingConfiguration() {
        return this.dataPreProcessingConfiguration;
    }

    /**
     * <p>
     * The configuration is the <code>TargetSamplingRate</code>, which is the sampling rate of the data after post
     * processing by Amazon Lookout for Equipment. For example, if you provide data that has been collected at a 1
     * second level and you want the system to resample the data at a 1 minute rate before training, the
     * <code>TargetSamplingRate</code> is 1 minute.
     * </p>
     * <p>
     * When providing a value for the <code>TargetSamplingRate</code>, you must attach the prefix "PT" to the rate you
     * want. The value for a 1 second rate is therefore <i>PT1S</i>, the value for a 15 minute rate is <i>PT15M</i>, and
     * the value for a 1 hour rate is <i>PT1H</i>
     * </p>
     * 
     * @param dataPreProcessingConfiguration
     *        The configuration is the <code>TargetSamplingRate</code>, which is the sampling rate of the data after
     *        post processing by Amazon Lookout for Equipment. For example, if you provide data that has been collected
     *        at a 1 second level and you want the system to resample the data at a 1 minute rate before training, the
     *        <code>TargetSamplingRate</code> is 1 minute.</p>
     *        <p>
     *        When providing a value for the <code>TargetSamplingRate</code>, you must attach the prefix "PT" to the
     *        rate you want. The value for a 1 second rate is therefore <i>PT1S</i>, the value for a 15 minute rate is
     *        <i>PT15M</i>, and the value for a 1 hour rate is <i>PT1H</i>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeModelResult withDataPreProcessingConfiguration(DataPreProcessingConfiguration dataPreProcessingConfiguration) {
        setDataPreProcessingConfiguration(dataPreProcessingConfiguration);
        return this;
    }

    /**
     * <p>
     * Specifies the current status of the model being described. Status describes the status of the most recent action
     * of the model.
     * </p>
     * 
     * @param status
     *        Specifies the current status of the model being described. Status describes the status of the most recent
     *        action of the model.
     * @see ModelStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * Specifies the current status of the model being described. Status describes the status of the most recent action
     * of the model.
     * </p>
     * 
     * @return Specifies the current status of the model being described. Status describes the status of the most recent
     *         action of the model.
     * @see ModelStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * Specifies the current status of the model being described. Status describes the status of the most recent action
     * of the model.
     * </p>
     * 
     * @param status
     *        Specifies the current status of the model being described. Status describes the status of the most recent
     *        action of the model.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ModelStatus
     */

    public DescribeModelResult withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * Specifies the current status of the model being described. Status describes the status of the most recent action
     * of the model.
     * </p>
     * 
     * @param status
     *        Specifies the current status of the model being described. Status describes the status of the most recent
     *        action of the model.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ModelStatus
     */

    public DescribeModelResult withStatus(ModelStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * Indicates the time at which the training of the machine learning model began.
     * </p>
     * 
     * @param trainingExecutionStartTime
     *        Indicates the time at which the training of the machine learning model began.
     */

    public void setTrainingExecutionStartTime(java.util.Date trainingExecutionStartTime) {
        this.trainingExecutionStartTime = trainingExecutionStartTime;
    }

    /**
     * <p>
     * Indicates the time at which the training of the machine learning model began.
     * </p>
     * 
     * @return Indicates the time at which the training of the machine learning model began.
     */

    public java.util.Date getTrainingExecutionStartTime() {
        return this.trainingExecutionStartTime;
    }

    /**
     * <p>
     * Indicates the time at which the training of the machine learning model began.
     * </p>
     * 
     * @param trainingExecutionStartTime
     *        Indicates the time at which the training of the machine learning model began.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeModelResult withTrainingExecutionStartTime(java.util.Date trainingExecutionStartTime) {
        setTrainingExecutionStartTime(trainingExecutionStartTime);
        return this;
    }

    /**
     * <p>
     * Indicates the time at which the training of the machine learning model was completed.
     * </p>
     * 
     * @param trainingExecutionEndTime
     *        Indicates the time at which the training of the machine learning model was completed.
     */

    public void setTrainingExecutionEndTime(java.util.Date trainingExecutionEndTime) {
        this.trainingExecutionEndTime = trainingExecutionEndTime;
    }

    /**
     * <p>
     * Indicates the time at which the training of the machine learning model was completed.
     * </p>
     * 
     * @return Indicates the time at which the training of the machine learning model was completed.
     */

    public java.util.Date getTrainingExecutionEndTime() {
        return this.trainingExecutionEndTime;
    }

    /**
     * <p>
     * Indicates the time at which the training of the machine learning model was completed.
     * </p>
     * 
     * @param trainingExecutionEndTime
     *        Indicates the time at which the training of the machine learning model was completed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeModelResult withTrainingExecutionEndTime(java.util.Date trainingExecutionEndTime) {
        setTrainingExecutionEndTime(trainingExecutionEndTime);
        return this;
    }

    /**
     * <p>
     * If the training of the machine learning model failed, this indicates the reason for that failure.
     * </p>
     * 
     * @param failedReason
     *        If the training of the machine learning model failed, this indicates the reason for that failure.
     */

    public void setFailedReason(String failedReason) {
        this.failedReason = failedReason;
    }

    /**
     * <p>
     * If the training of the machine learning model failed, this indicates the reason for that failure.
     * </p>
     * 
     * @return If the training of the machine learning model failed, this indicates the reason for that failure.
     */

    public String getFailedReason() {
        return this.failedReason;
    }

    /**
     * <p>
     * If the training of the machine learning model failed, this indicates the reason for that failure.
     * </p>
     * 
     * @param failedReason
     *        If the training of the machine learning model failed, this indicates the reason for that failure.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeModelResult withFailedReason(String failedReason) {
        setFailedReason(failedReason);
        return this;
    }

    /**
     * <p>
     * The Model Metrics show an aggregated summary of the model's performance within the evaluation time range. This is
     * the JSON content of the metrics created when evaluating the model.
     * </p>
     * <p>
     * This field's value must be valid JSON according to RFC 7159, including the opening and closing braces. For
     * example: '{"key": "value"}'.
     * </p>
     * <p>
     * The AWS SDK for Java performs a Base64 encoding on this field before sending this request to the AWS service.
     * Users of the SDK should not perform Base64 encoding on this field.
     * </p>
     * 
     * @param modelMetrics
     *        The Model Metrics show an aggregated summary of the model's performance within the evaluation time range.
     *        This is the JSON content of the metrics created when evaluating the model.
     */

    public void setModelMetrics(String modelMetrics) {
        this.modelMetrics = modelMetrics;
    }

    /**
     * <p>
     * The Model Metrics show an aggregated summary of the model's performance within the evaluation time range. This is
     * the JSON content of the metrics created when evaluating the model.
     * </p>
     * <p>
     * This field's value will be valid JSON according to RFC 7159, including the opening and closing braces. For
     * example: '{"key": "value"}'.
     * </p>
     * 
     * @return The Model Metrics show an aggregated summary of the model's performance within the evaluation time range.
     *         This is the JSON content of the metrics created when evaluating the model.
     */

    public String getModelMetrics() {
        return this.modelMetrics;
    }

    /**
     * <p>
     * The Model Metrics show an aggregated summary of the model's performance within the evaluation time range. This is
     * the JSON content of the metrics created when evaluating the model.
     * </p>
     * <p>
     * This field's value must be valid JSON according to RFC 7159, including the opening and closing braces. For
     * example: '{"key": "value"}'.
     * </p>
     * <p>
     * The AWS SDK for Java performs a Base64 encoding on this field before sending this request to the AWS service.
     * Users of the SDK should not perform Base64 encoding on this field.
     * </p>
     * 
     * @param modelMetrics
     *        The Model Metrics show an aggregated summary of the model's performance within the evaluation time range.
     *        This is the JSON content of the metrics created when evaluating the model.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeModelResult withModelMetrics(String modelMetrics) {
        setModelMetrics(modelMetrics);
        return this;
    }

    /**
     * <p>
     * Indicates the last time the machine learning model was updated. The type of update is not specified.
     * </p>
     * 
     * @param lastUpdatedTime
     *        Indicates the last time the machine learning model was updated. The type of update is not specified.
     */

    public void setLastUpdatedTime(java.util.Date lastUpdatedTime) {
        this.lastUpdatedTime = lastUpdatedTime;
    }

    /**
     * <p>
     * Indicates the last time the machine learning model was updated. The type of update is not specified.
     * </p>
     * 
     * @return Indicates the last time the machine learning model was updated. The type of update is not specified.
     */

    public java.util.Date getLastUpdatedTime() {
        return this.lastUpdatedTime;
    }

    /**
     * <p>
     * Indicates the last time the machine learning model was updated. The type of update is not specified.
     * </p>
     * 
     * @param lastUpdatedTime
     *        Indicates the last time the machine learning model was updated. The type of update is not specified.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeModelResult withLastUpdatedTime(java.util.Date lastUpdatedTime) {
        setLastUpdatedTime(lastUpdatedTime);
        return this;
    }

    /**
     * <p>
     * Indicates the time and date at which the machine learning model was created.
     * </p>
     * 
     * @param createdAt
     *        Indicates the time and date at which the machine learning model was created.
     */

    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * Indicates the time and date at which the machine learning model was created.
     * </p>
     * 
     * @return Indicates the time and date at which the machine learning model was created.
     */

    public java.util.Date getCreatedAt() {
        return this.createdAt;
    }

    /**
     * <p>
     * Indicates the time and date at which the machine learning model was created.
     * </p>
     * 
     * @param createdAt
     *        Indicates the time and date at which the machine learning model was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeModelResult withCreatedAt(java.util.Date createdAt) {
        setCreatedAt(createdAt);
        return this;
    }

    /**
     * <p>
     * Provides the identifier of the KMS key used to encrypt model data by Amazon Lookout for Equipment.
     * </p>
     * 
     * @param serverSideKmsKeyId
     *        Provides the identifier of the KMS key used to encrypt model data by Amazon Lookout for Equipment.
     */

    public void setServerSideKmsKeyId(String serverSideKmsKeyId) {
        this.serverSideKmsKeyId = serverSideKmsKeyId;
    }

    /**
     * <p>
     * Provides the identifier of the KMS key used to encrypt model data by Amazon Lookout for Equipment.
     * </p>
     * 
     * @return Provides the identifier of the KMS key used to encrypt model data by Amazon Lookout for Equipment.
     */

    public String getServerSideKmsKeyId() {
        return this.serverSideKmsKeyId;
    }

    /**
     * <p>
     * Provides the identifier of the KMS key used to encrypt model data by Amazon Lookout for Equipment.
     * </p>
     * 
     * @param serverSideKmsKeyId
     *        Provides the identifier of the KMS key used to encrypt model data by Amazon Lookout for Equipment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeModelResult withServerSideKmsKeyId(String serverSideKmsKeyId) {
        setServerSideKmsKeyId(serverSideKmsKeyId);
        return this;
    }

    /**
     * <p>
     * Indicates that the asset associated with this sensor has been shut off. As long as this condition is met, Lookout
     * for Equipment will not use data from this asset for training, evaluation, or inference.
     * </p>
     * 
     * @param offCondition
     *        Indicates that the asset associated with this sensor has been shut off. As long as this condition is met,
     *        Lookout for Equipment will not use data from this asset for training, evaluation, or inference.
     */

    public void setOffCondition(String offCondition) {
        this.offCondition = offCondition;
    }

    /**
     * <p>
     * Indicates that the asset associated with this sensor has been shut off. As long as this condition is met, Lookout
     * for Equipment will not use data from this asset for training, evaluation, or inference.
     * </p>
     * 
     * @return Indicates that the asset associated with this sensor has been shut off. As long as this condition is met,
     *         Lookout for Equipment will not use data from this asset for training, evaluation, or inference.
     */

    public String getOffCondition() {
        return this.offCondition;
    }

    /**
     * <p>
     * Indicates that the asset associated with this sensor has been shut off. As long as this condition is met, Lookout
     * for Equipment will not use data from this asset for training, evaluation, or inference.
     * </p>
     * 
     * @param offCondition
     *        Indicates that the asset associated with this sensor has been shut off. As long as this condition is met,
     *        Lookout for Equipment will not use data from this asset for training, evaluation, or inference.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeModelResult withOffCondition(String offCondition) {
        setOffCondition(offCondition);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the source model version. This field appears if the active model version was
     * imported.
     * </p>
     * 
     * @param sourceModelVersionArn
     *        The Amazon Resource Name (ARN) of the source model version. This field appears if the active model version
     *        was imported.
     */

    public void setSourceModelVersionArn(String sourceModelVersionArn) {
        this.sourceModelVersionArn = sourceModelVersionArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the source model version. This field appears if the active model version was
     * imported.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the source model version. This field appears if the active model
     *         version was imported.
     */

    public String getSourceModelVersionArn() {
        return this.sourceModelVersionArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the source model version. This field appears if the active model version was
     * imported.
     * </p>
     * 
     * @param sourceModelVersionArn
     *        The Amazon Resource Name (ARN) of the source model version. This field appears if the active model version
     *        was imported.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeModelResult withSourceModelVersionArn(String sourceModelVersionArn) {
        setSourceModelVersionArn(sourceModelVersionArn);
        return this;
    }

    /**
     * <p>
     * The date and time when the import job was started. This field appears if the active model version was imported.
     * </p>
     * 
     * @param importJobStartTime
     *        The date and time when the import job was started. This field appears if the active model version was
     *        imported.
     */

    public void setImportJobStartTime(java.util.Date importJobStartTime) {
        this.importJobStartTime = importJobStartTime;
    }

    /**
     * <p>
     * The date and time when the import job was started. This field appears if the active model version was imported.
     * </p>
     * 
     * @return The date and time when the import job was started. This field appears if the active model version was
     *         imported.
     */

    public java.util.Date getImportJobStartTime() {
        return this.importJobStartTime;
    }

    /**
     * <p>
     * The date and time when the import job was started. This field appears if the active model version was imported.
     * </p>
     * 
     * @param importJobStartTime
     *        The date and time when the import job was started. This field appears if the active model version was
     *        imported.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeModelResult withImportJobStartTime(java.util.Date importJobStartTime) {
        setImportJobStartTime(importJobStartTime);
        return this;
    }

    /**
     * <p>
     * The date and time when the import job was completed. This field appears if the active model version was imported.
     * </p>
     * 
     * @param importJobEndTime
     *        The date and time when the import job was completed. This field appears if the active model version was
     *        imported.
     */

    public void setImportJobEndTime(java.util.Date importJobEndTime) {
        this.importJobEndTime = importJobEndTime;
    }

    /**
     * <p>
     * The date and time when the import job was completed. This field appears if the active model version was imported.
     * </p>
     * 
     * @return The date and time when the import job was completed. This field appears if the active model version was
     *         imported.
     */

    public java.util.Date getImportJobEndTime() {
        return this.importJobEndTime;
    }

    /**
     * <p>
     * The date and time when the import job was completed. This field appears if the active model version was imported.
     * </p>
     * 
     * @param importJobEndTime
     *        The date and time when the import job was completed. This field appears if the active model version was
     *        imported.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeModelResult withImportJobEndTime(java.util.Date importJobEndTime) {
        setImportJobEndTime(importJobEndTime);
        return this;
    }

    /**
     * <p>
     * The name of the model version used by the inference schedular when running a scheduled inference execution.
     * </p>
     * 
     * @param activeModelVersion
     *        The name of the model version used by the inference schedular when running a scheduled inference
     *        execution.
     */

    public void setActiveModelVersion(Long activeModelVersion) {
        this.activeModelVersion = activeModelVersion;
    }

    /**
     * <p>
     * The name of the model version used by the inference schedular when running a scheduled inference execution.
     * </p>
     * 
     * @return The name of the model version used by the inference schedular when running a scheduled inference
     *         execution.
     */

    public Long getActiveModelVersion() {
        return this.activeModelVersion;
    }

    /**
     * <p>
     * The name of the model version used by the inference schedular when running a scheduled inference execution.
     * </p>
     * 
     * @param activeModelVersion
     *        The name of the model version used by the inference schedular when running a scheduled inference
     *        execution.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeModelResult withActiveModelVersion(Long activeModelVersion) {
        setActiveModelVersion(activeModelVersion);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the model version used by the inference scheduler when running a scheduled
     * inference execution.
     * </p>
     * 
     * @param activeModelVersionArn
     *        The Amazon Resource Name (ARN) of the model version used by the inference scheduler when running a
     *        scheduled inference execution.
     */

    public void setActiveModelVersionArn(String activeModelVersionArn) {
        this.activeModelVersionArn = activeModelVersionArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the model version used by the inference scheduler when running a scheduled
     * inference execution.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the model version used by the inference scheduler when running a
     *         scheduled inference execution.
     */

    public String getActiveModelVersionArn() {
        return this.activeModelVersionArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the model version used by the inference scheduler when running a scheduled
     * inference execution.
     * </p>
     * 
     * @param activeModelVersionArn
     *        The Amazon Resource Name (ARN) of the model version used by the inference scheduler when running a
     *        scheduled inference execution.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeModelResult withActiveModelVersionArn(String activeModelVersionArn) {
        setActiveModelVersionArn(activeModelVersionArn);
        return this;
    }

    /**
     * <p>
     * The date the active model version was activated.
     * </p>
     * 
     * @param modelVersionActivatedAt
     *        The date the active model version was activated.
     */

    public void setModelVersionActivatedAt(java.util.Date modelVersionActivatedAt) {
        this.modelVersionActivatedAt = modelVersionActivatedAt;
    }

    /**
     * <p>
     * The date the active model version was activated.
     * </p>
     * 
     * @return The date the active model version was activated.
     */

    public java.util.Date getModelVersionActivatedAt() {
        return this.modelVersionActivatedAt;
    }

    /**
     * <p>
     * The date the active model version was activated.
     * </p>
     * 
     * @param modelVersionActivatedAt
     *        The date the active model version was activated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeModelResult withModelVersionActivatedAt(java.util.Date modelVersionActivatedAt) {
        setModelVersionActivatedAt(modelVersionActivatedAt);
        return this;
    }

    /**
     * <p>
     * The model version that was set as the active model version prior to the current active model version.
     * </p>
     * 
     * @param previousActiveModelVersion
     *        The model version that was set as the active model version prior to the current active model version.
     */

    public void setPreviousActiveModelVersion(Long previousActiveModelVersion) {
        this.previousActiveModelVersion = previousActiveModelVersion;
    }

    /**
     * <p>
     * The model version that was set as the active model version prior to the current active model version.
     * </p>
     * 
     * @return The model version that was set as the active model version prior to the current active model version.
     */

    public Long getPreviousActiveModelVersion() {
        return this.previousActiveModelVersion;
    }

    /**
     * <p>
     * The model version that was set as the active model version prior to the current active model version.
     * </p>
     * 
     * @param previousActiveModelVersion
     *        The model version that was set as the active model version prior to the current active model version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeModelResult withPreviousActiveModelVersion(Long previousActiveModelVersion) {
        setPreviousActiveModelVersion(previousActiveModelVersion);
        return this;
    }

    /**
     * <p>
     * The ARN of the model version that was set as the active model version prior to the current active model version.
     * </p>
     * 
     * @param previousActiveModelVersionArn
     *        The ARN of the model version that was set as the active model version prior to the current active model
     *        version.
     */

    public void setPreviousActiveModelVersionArn(String previousActiveModelVersionArn) {
        this.previousActiveModelVersionArn = previousActiveModelVersionArn;
    }

    /**
     * <p>
     * The ARN of the model version that was set as the active model version prior to the current active model version.
     * </p>
     * 
     * @return The ARN of the model version that was set as the active model version prior to the current active model
     *         version.
     */

    public String getPreviousActiveModelVersionArn() {
        return this.previousActiveModelVersionArn;
    }

    /**
     * <p>
     * The ARN of the model version that was set as the active model version prior to the current active model version.
     * </p>
     * 
     * @param previousActiveModelVersionArn
     *        The ARN of the model version that was set as the active model version prior to the current active model
     *        version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeModelResult withPreviousActiveModelVersionArn(String previousActiveModelVersionArn) {
        setPreviousActiveModelVersionArn(previousActiveModelVersionArn);
        return this;
    }

    /**
     * <p>
     * The date and time when the previous active model version was activated.
     * </p>
     * 
     * @param previousModelVersionActivatedAt
     *        The date and time when the previous active model version was activated.
     */

    public void setPreviousModelVersionActivatedAt(java.util.Date previousModelVersionActivatedAt) {
        this.previousModelVersionActivatedAt = previousModelVersionActivatedAt;
    }

    /**
     * <p>
     * The date and time when the previous active model version was activated.
     * </p>
     * 
     * @return The date and time when the previous active model version was activated.
     */

    public java.util.Date getPreviousModelVersionActivatedAt() {
        return this.previousModelVersionActivatedAt;
    }

    /**
     * <p>
     * The date and time when the previous active model version was activated.
     * </p>
     * 
     * @param previousModelVersionActivatedAt
     *        The date and time when the previous active model version was activated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeModelResult withPreviousModelVersionActivatedAt(java.util.Date previousModelVersionActivatedAt) {
        setPreviousModelVersionActivatedAt(previousModelVersionActivatedAt);
        return this;
    }

    /**
     * <p>
     * If the model version was retrained, this field shows a summary of the performance of the prior model on the new
     * training range. You can use the information in this JSON-formatted object to compare the new model version and
     * the prior model version.
     * </p>
     * <p>
     * This field's value must be valid JSON according to RFC 7159, including the opening and closing braces. For
     * example: '{"key": "value"}'.
     * </p>
     * <p>
     * The AWS SDK for Java performs a Base64 encoding on this field before sending this request to the AWS service.
     * Users of the SDK should not perform Base64 encoding on this field.
     * </p>
     * 
     * @param priorModelMetrics
     *        If the model version was retrained, this field shows a summary of the performance of the prior model on
     *        the new training range. You can use the information in this JSON-formatted object to compare the new model
     *        version and the prior model version.
     */

    public void setPriorModelMetrics(String priorModelMetrics) {
        this.priorModelMetrics = priorModelMetrics;
    }

    /**
     * <p>
     * If the model version was retrained, this field shows a summary of the performance of the prior model on the new
     * training range. You can use the information in this JSON-formatted object to compare the new model version and
     * the prior model version.
     * </p>
     * <p>
     * This field's value will be valid JSON according to RFC 7159, including the opening and closing braces. For
     * example: '{"key": "value"}'.
     * </p>
     * 
     * @return If the model version was retrained, this field shows a summary of the performance of the prior model on
     *         the new training range. You can use the information in this JSON-formatted object to compare the new
     *         model version and the prior model version.
     */

    public String getPriorModelMetrics() {
        return this.priorModelMetrics;
    }

    /**
     * <p>
     * If the model version was retrained, this field shows a summary of the performance of the prior model on the new
     * training range. You can use the information in this JSON-formatted object to compare the new model version and
     * the prior model version.
     * </p>
     * <p>
     * This field's value must be valid JSON according to RFC 7159, including the opening and closing braces. For
     * example: '{"key": "value"}'.
     * </p>
     * <p>
     * The AWS SDK for Java performs a Base64 encoding on this field before sending this request to the AWS service.
     * Users of the SDK should not perform Base64 encoding on this field.
     * </p>
     * 
     * @param priorModelMetrics
     *        If the model version was retrained, this field shows a summary of the performance of the prior model on
     *        the new training range. You can use the information in this JSON-formatted object to compare the new model
     *        version and the prior model version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeModelResult withPriorModelMetrics(String priorModelMetrics) {
        setPriorModelMetrics(priorModelMetrics);
        return this;
    }

    /**
     * <p>
     * If the model version was generated by retraining and the training failed, this indicates the reason for that
     * failure.
     * </p>
     * 
     * @param latestScheduledRetrainingFailedReason
     *        If the model version was generated by retraining and the training failed, this indicates the reason for
     *        that failure.
     */

    public void setLatestScheduledRetrainingFailedReason(String latestScheduledRetrainingFailedReason) {
        this.latestScheduledRetrainingFailedReason = latestScheduledRetrainingFailedReason;
    }

    /**
     * <p>
     * If the model version was generated by retraining and the training failed, this indicates the reason for that
     * failure.
     * </p>
     * 
     * @return If the model version was generated by retraining and the training failed, this indicates the reason for
     *         that failure.
     */

    public String getLatestScheduledRetrainingFailedReason() {
        return this.latestScheduledRetrainingFailedReason;
    }

    /**
     * <p>
     * If the model version was generated by retraining and the training failed, this indicates the reason for that
     * failure.
     * </p>
     * 
     * @param latestScheduledRetrainingFailedReason
     *        If the model version was generated by retraining and the training failed, this indicates the reason for
     *        that failure.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeModelResult withLatestScheduledRetrainingFailedReason(String latestScheduledRetrainingFailedReason) {
        setLatestScheduledRetrainingFailedReason(latestScheduledRetrainingFailedReason);
        return this;
    }

    /**
     * <p>
     * Indicates the status of the most recent scheduled retraining run.
     * </p>
     * 
     * @param latestScheduledRetrainingStatus
     *        Indicates the status of the most recent scheduled retraining run.
     * @see ModelVersionStatus
     */

    public void setLatestScheduledRetrainingStatus(String latestScheduledRetrainingStatus) {
        this.latestScheduledRetrainingStatus = latestScheduledRetrainingStatus;
    }

    /**
     * <p>
     * Indicates the status of the most recent scheduled retraining run.
     * </p>
     * 
     * @return Indicates the status of the most recent scheduled retraining run.
     * @see ModelVersionStatus
     */

    public String getLatestScheduledRetrainingStatus() {
        return this.latestScheduledRetrainingStatus;
    }

    /**
     * <p>
     * Indicates the status of the most recent scheduled retraining run.
     * </p>
     * 
     * @param latestScheduledRetrainingStatus
     *        Indicates the status of the most recent scheduled retraining run.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ModelVersionStatus
     */

    public DescribeModelResult withLatestScheduledRetrainingStatus(String latestScheduledRetrainingStatus) {
        setLatestScheduledRetrainingStatus(latestScheduledRetrainingStatus);
        return this;
    }

    /**
     * <p>
     * Indicates the status of the most recent scheduled retraining run.
     * </p>
     * 
     * @param latestScheduledRetrainingStatus
     *        Indicates the status of the most recent scheduled retraining run.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ModelVersionStatus
     */

    public DescribeModelResult withLatestScheduledRetrainingStatus(ModelVersionStatus latestScheduledRetrainingStatus) {
        this.latestScheduledRetrainingStatus = latestScheduledRetrainingStatus.toString();
        return this;
    }

    /**
     * <p>
     * Indicates the most recent model version that was generated by retraining.
     * </p>
     * 
     * @param latestScheduledRetrainingModelVersion
     *        Indicates the most recent model version that was generated by retraining.
     */

    public void setLatestScheduledRetrainingModelVersion(Long latestScheduledRetrainingModelVersion) {
        this.latestScheduledRetrainingModelVersion = latestScheduledRetrainingModelVersion;
    }

    /**
     * <p>
     * Indicates the most recent model version that was generated by retraining.
     * </p>
     * 
     * @return Indicates the most recent model version that was generated by retraining.
     */

    public Long getLatestScheduledRetrainingModelVersion() {
        return this.latestScheduledRetrainingModelVersion;
    }

    /**
     * <p>
     * Indicates the most recent model version that was generated by retraining.
     * </p>
     * 
     * @param latestScheduledRetrainingModelVersion
     *        Indicates the most recent model version that was generated by retraining.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeModelResult withLatestScheduledRetrainingModelVersion(Long latestScheduledRetrainingModelVersion) {
        setLatestScheduledRetrainingModelVersion(latestScheduledRetrainingModelVersion);
        return this;
    }

    /**
     * <p>
     * Indicates the start time of the most recent scheduled retraining run.
     * </p>
     * 
     * @param latestScheduledRetrainingStartTime
     *        Indicates the start time of the most recent scheduled retraining run.
     */

    public void setLatestScheduledRetrainingStartTime(java.util.Date latestScheduledRetrainingStartTime) {
        this.latestScheduledRetrainingStartTime = latestScheduledRetrainingStartTime;
    }

    /**
     * <p>
     * Indicates the start time of the most recent scheduled retraining run.
     * </p>
     * 
     * @return Indicates the start time of the most recent scheduled retraining run.
     */

    public java.util.Date getLatestScheduledRetrainingStartTime() {
        return this.latestScheduledRetrainingStartTime;
    }

    /**
     * <p>
     * Indicates the start time of the most recent scheduled retraining run.
     * </p>
     * 
     * @param latestScheduledRetrainingStartTime
     *        Indicates the start time of the most recent scheduled retraining run.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeModelResult withLatestScheduledRetrainingStartTime(java.util.Date latestScheduledRetrainingStartTime) {
        setLatestScheduledRetrainingStartTime(latestScheduledRetrainingStartTime);
        return this;
    }

    /**
     * <p>
     * Indicates the number of days of data used in the most recent scheduled retraining run.
     * </p>
     * 
     * @param latestScheduledRetrainingAvailableDataInDays
     *        Indicates the number of days of data used in the most recent scheduled retraining run.
     */

    public void setLatestScheduledRetrainingAvailableDataInDays(Integer latestScheduledRetrainingAvailableDataInDays) {
        this.latestScheduledRetrainingAvailableDataInDays = latestScheduledRetrainingAvailableDataInDays;
    }

    /**
     * <p>
     * Indicates the number of days of data used in the most recent scheduled retraining run.
     * </p>
     * 
     * @return Indicates the number of days of data used in the most recent scheduled retraining run.
     */

    public Integer getLatestScheduledRetrainingAvailableDataInDays() {
        return this.latestScheduledRetrainingAvailableDataInDays;
    }

    /**
     * <p>
     * Indicates the number of days of data used in the most recent scheduled retraining run.
     * </p>
     * 
     * @param latestScheduledRetrainingAvailableDataInDays
     *        Indicates the number of days of data used in the most recent scheduled retraining run.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeModelResult withLatestScheduledRetrainingAvailableDataInDays(Integer latestScheduledRetrainingAvailableDataInDays) {
        setLatestScheduledRetrainingAvailableDataInDays(latestScheduledRetrainingAvailableDataInDays);
        return this;
    }

    /**
     * <p>
     * Indicates the date and time that the next scheduled retraining run will start on. Lookout for Equipment truncates
     * the time you provide to the nearest UTC day.
     * </p>
     * 
     * @param nextScheduledRetrainingStartDate
     *        Indicates the date and time that the next scheduled retraining run will start on. Lookout for Equipment
     *        truncates the time you provide to the nearest UTC day.
     */

    public void setNextScheduledRetrainingStartDate(java.util.Date nextScheduledRetrainingStartDate) {
        this.nextScheduledRetrainingStartDate = nextScheduledRetrainingStartDate;
    }

    /**
     * <p>
     * Indicates the date and time that the next scheduled retraining run will start on. Lookout for Equipment truncates
     * the time you provide to the nearest UTC day.
     * </p>
     * 
     * @return Indicates the date and time that the next scheduled retraining run will start on. Lookout for Equipment
     *         truncates the time you provide to the nearest UTC day.
     */

    public java.util.Date getNextScheduledRetrainingStartDate() {
        return this.nextScheduledRetrainingStartDate;
    }

    /**
     * <p>
     * Indicates the date and time that the next scheduled retraining run will start on. Lookout for Equipment truncates
     * the time you provide to the nearest UTC day.
     * </p>
     * 
     * @param nextScheduledRetrainingStartDate
     *        Indicates the date and time that the next scheduled retraining run will start on. Lookout for Equipment
     *        truncates the time you provide to the nearest UTC day.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeModelResult withNextScheduledRetrainingStartDate(java.util.Date nextScheduledRetrainingStartDate) {
        setNextScheduledRetrainingStartDate(nextScheduledRetrainingStartDate);
        return this;
    }

    /**
     * <p>
     * Indicates the start time of the inference data that has been accumulated.
     * </p>
     * 
     * @param accumulatedInferenceDataStartTime
     *        Indicates the start time of the inference data that has been accumulated.
     */

    public void setAccumulatedInferenceDataStartTime(java.util.Date accumulatedInferenceDataStartTime) {
        this.accumulatedInferenceDataStartTime = accumulatedInferenceDataStartTime;
    }

    /**
     * <p>
     * Indicates the start time of the inference data that has been accumulated.
     * </p>
     * 
     * @return Indicates the start time of the inference data that has been accumulated.
     */

    public java.util.Date getAccumulatedInferenceDataStartTime() {
        return this.accumulatedInferenceDataStartTime;
    }

    /**
     * <p>
     * Indicates the start time of the inference data that has been accumulated.
     * </p>
     * 
     * @param accumulatedInferenceDataStartTime
     *        Indicates the start time of the inference data that has been accumulated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeModelResult withAccumulatedInferenceDataStartTime(java.util.Date accumulatedInferenceDataStartTime) {
        setAccumulatedInferenceDataStartTime(accumulatedInferenceDataStartTime);
        return this;
    }

    /**
     * <p>
     * Indicates the end time of the inference data that has been accumulated.
     * </p>
     * 
     * @param accumulatedInferenceDataEndTime
     *        Indicates the end time of the inference data that has been accumulated.
     */

    public void setAccumulatedInferenceDataEndTime(java.util.Date accumulatedInferenceDataEndTime) {
        this.accumulatedInferenceDataEndTime = accumulatedInferenceDataEndTime;
    }

    /**
     * <p>
     * Indicates the end time of the inference data that has been accumulated.
     * </p>
     * 
     * @return Indicates the end time of the inference data that has been accumulated.
     */

    public java.util.Date getAccumulatedInferenceDataEndTime() {
        return this.accumulatedInferenceDataEndTime;
    }

    /**
     * <p>
     * Indicates the end time of the inference data that has been accumulated.
     * </p>
     * 
     * @param accumulatedInferenceDataEndTime
     *        Indicates the end time of the inference data that has been accumulated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeModelResult withAccumulatedInferenceDataEndTime(java.util.Date accumulatedInferenceDataEndTime) {
        setAccumulatedInferenceDataEndTime(accumulatedInferenceDataEndTime);
        return this;
    }

    /**
     * <p>
     * Indicates the status of the retraining scheduler.
     * </p>
     * 
     * @param retrainingSchedulerStatus
     *        Indicates the status of the retraining scheduler.
     * @see RetrainingSchedulerStatus
     */

    public void setRetrainingSchedulerStatus(String retrainingSchedulerStatus) {
        this.retrainingSchedulerStatus = retrainingSchedulerStatus;
    }

    /**
     * <p>
     * Indicates the status of the retraining scheduler.
     * </p>
     * 
     * @return Indicates the status of the retraining scheduler.
     * @see RetrainingSchedulerStatus
     */

    public String getRetrainingSchedulerStatus() {
        return this.retrainingSchedulerStatus;
    }

    /**
     * <p>
     * Indicates the status of the retraining scheduler.
     * </p>
     * 
     * @param retrainingSchedulerStatus
     *        Indicates the status of the retraining scheduler.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RetrainingSchedulerStatus
     */

    public DescribeModelResult withRetrainingSchedulerStatus(String retrainingSchedulerStatus) {
        setRetrainingSchedulerStatus(retrainingSchedulerStatus);
        return this;
    }

    /**
     * <p>
     * Indicates the status of the retraining scheduler.
     * </p>
     * 
     * @param retrainingSchedulerStatus
     *        Indicates the status of the retraining scheduler.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RetrainingSchedulerStatus
     */

    public DescribeModelResult withRetrainingSchedulerStatus(RetrainingSchedulerStatus retrainingSchedulerStatus) {
        this.retrainingSchedulerStatus = retrainingSchedulerStatus.toString();
        return this;
    }

    /**
     * <p>
     * Configuration information for the model's pointwise model diagnostics.
     * </p>
     * 
     * @param modelDiagnosticsOutputConfiguration
     *        Configuration information for the model's pointwise model diagnostics.
     */

    public void setModelDiagnosticsOutputConfiguration(ModelDiagnosticsOutputConfiguration modelDiagnosticsOutputConfiguration) {
        this.modelDiagnosticsOutputConfiguration = modelDiagnosticsOutputConfiguration;
    }

    /**
     * <p>
     * Configuration information for the model's pointwise model diagnostics.
     * </p>
     * 
     * @return Configuration information for the model's pointwise model diagnostics.
     */

    public ModelDiagnosticsOutputConfiguration getModelDiagnosticsOutputConfiguration() {
        return this.modelDiagnosticsOutputConfiguration;
    }

    /**
     * <p>
     * Configuration information for the model's pointwise model diagnostics.
     * </p>
     * 
     * @param modelDiagnosticsOutputConfiguration
     *        Configuration information for the model's pointwise model diagnostics.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeModelResult withModelDiagnosticsOutputConfiguration(ModelDiagnosticsOutputConfiguration modelDiagnosticsOutputConfiguration) {
        setModelDiagnosticsOutputConfiguration(modelDiagnosticsOutputConfiguration);
        return this;
    }

    /**
     * <p>
     * Provides a quality assessment for a model that uses labels. If Lookout for Equipment determines that the model
     * quality is poor based on training metrics, the value is <code>POOR_QUALITY_DETECTED</code>. Otherwise, the value
     * is <code>QUALITY_THRESHOLD_MET</code>.
     * </p>
     * <p>
     * If the model is unlabeled, the model quality can't be assessed and the value of <code>ModelQuality</code> is
     * <code>CANNOT_DETERMINE_QUALITY</code>. In this situation, you can get a model quality assessment by adding labels
     * to the input dataset and retraining the model.
     * </p>
     * <p>
     * For information about using labels with your models, see <a
     * href="https://docs.aws.amazon.com/lookout-for-equipment/latest/ug/understanding-labeling.html">Understanding
     * labeling</a>.
     * </p>
     * <p>
     * For information about improving the quality of a model, see <a
     * href="https://docs.aws.amazon.com/lookout-for-equipment/latest/ug/best-practices.html">Best practices with Amazon
     * Lookout for Equipment</a>.
     * </p>
     * 
     * @param modelQuality
     *        Provides a quality assessment for a model that uses labels. If Lookout for Equipment determines that the
     *        model quality is poor based on training metrics, the value is <code>POOR_QUALITY_DETECTED</code>.
     *        Otherwise, the value is <code>QUALITY_THRESHOLD_MET</code>.</p>
     *        <p>
     *        If the model is unlabeled, the model quality can't be assessed and the value of <code>ModelQuality</code>
     *        is <code>CANNOT_DETERMINE_QUALITY</code>. In this situation, you can get a model quality assessment by
     *        adding labels to the input dataset and retraining the model.
     *        </p>
     *        <p>
     *        For information about using labels with your models, see <a
     *        href="https://docs.aws.amazon.com/lookout-for-equipment/latest/ug/understanding-labeling.html"
     *        >Understanding labeling</a>.
     *        </p>
     *        <p>
     *        For information about improving the quality of a model, see <a
     *        href="https://docs.aws.amazon.com/lookout-for-equipment/latest/ug/best-practices.html">Best practices with
     *        Amazon Lookout for Equipment</a>.
     * @see ModelQuality
     */

    public void setModelQuality(String modelQuality) {
        this.modelQuality = modelQuality;
    }

    /**
     * <p>
     * Provides a quality assessment for a model that uses labels. If Lookout for Equipment determines that the model
     * quality is poor based on training metrics, the value is <code>POOR_QUALITY_DETECTED</code>. Otherwise, the value
     * is <code>QUALITY_THRESHOLD_MET</code>.
     * </p>
     * <p>
     * If the model is unlabeled, the model quality can't be assessed and the value of <code>ModelQuality</code> is
     * <code>CANNOT_DETERMINE_QUALITY</code>. In this situation, you can get a model quality assessment by adding labels
     * to the input dataset and retraining the model.
     * </p>
     * <p>
     * For information about using labels with your models, see <a
     * href="https://docs.aws.amazon.com/lookout-for-equipment/latest/ug/understanding-labeling.html">Understanding
     * labeling</a>.
     * </p>
     * <p>
     * For information about improving the quality of a model, see <a
     * href="https://docs.aws.amazon.com/lookout-for-equipment/latest/ug/best-practices.html">Best practices with Amazon
     * Lookout for Equipment</a>.
     * </p>
     * 
     * @return Provides a quality assessment for a model that uses labels. If Lookout for Equipment determines that the
     *         model quality is poor based on training metrics, the value is <code>POOR_QUALITY_DETECTED</code>.
     *         Otherwise, the value is <code>QUALITY_THRESHOLD_MET</code>.</p>
     *         <p>
     *         If the model is unlabeled, the model quality can't be assessed and the value of <code>ModelQuality</code>
     *         is <code>CANNOT_DETERMINE_QUALITY</code>. In this situation, you can get a model quality assessment by
     *         adding labels to the input dataset and retraining the model.
     *         </p>
     *         <p>
     *         For information about using labels with your models, see <a
     *         href="https://docs.aws.amazon.com/lookout-for-equipment/latest/ug/understanding-labeling.html"
     *         >Understanding labeling</a>.
     *         </p>
     *         <p>
     *         For information about improving the quality of a model, see <a
     *         href="https://docs.aws.amazon.com/lookout-for-equipment/latest/ug/best-practices.html">Best practices
     *         with Amazon Lookout for Equipment</a>.
     * @see ModelQuality
     */

    public String getModelQuality() {
        return this.modelQuality;
    }

    /**
     * <p>
     * Provides a quality assessment for a model that uses labels. If Lookout for Equipment determines that the model
     * quality is poor based on training metrics, the value is <code>POOR_QUALITY_DETECTED</code>. Otherwise, the value
     * is <code>QUALITY_THRESHOLD_MET</code>.
     * </p>
     * <p>
     * If the model is unlabeled, the model quality can't be assessed and the value of <code>ModelQuality</code> is
     * <code>CANNOT_DETERMINE_QUALITY</code>. In this situation, you can get a model quality assessment by adding labels
     * to the input dataset and retraining the model.
     * </p>
     * <p>
     * For information about using labels with your models, see <a
     * href="https://docs.aws.amazon.com/lookout-for-equipment/latest/ug/understanding-labeling.html">Understanding
     * labeling</a>.
     * </p>
     * <p>
     * For information about improving the quality of a model, see <a
     * href="https://docs.aws.amazon.com/lookout-for-equipment/latest/ug/best-practices.html">Best practices with Amazon
     * Lookout for Equipment</a>.
     * </p>
     * 
     * @param modelQuality
     *        Provides a quality assessment for a model that uses labels. If Lookout for Equipment determines that the
     *        model quality is poor based on training metrics, the value is <code>POOR_QUALITY_DETECTED</code>.
     *        Otherwise, the value is <code>QUALITY_THRESHOLD_MET</code>.</p>
     *        <p>
     *        If the model is unlabeled, the model quality can't be assessed and the value of <code>ModelQuality</code>
     *        is <code>CANNOT_DETERMINE_QUALITY</code>. In this situation, you can get a model quality assessment by
     *        adding labels to the input dataset and retraining the model.
     *        </p>
     *        <p>
     *        For information about using labels with your models, see <a
     *        href="https://docs.aws.amazon.com/lookout-for-equipment/latest/ug/understanding-labeling.html"
     *        >Understanding labeling</a>.
     *        </p>
     *        <p>
     *        For information about improving the quality of a model, see <a
     *        href="https://docs.aws.amazon.com/lookout-for-equipment/latest/ug/best-practices.html">Best practices with
     *        Amazon Lookout for Equipment</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ModelQuality
     */

    public DescribeModelResult withModelQuality(String modelQuality) {
        setModelQuality(modelQuality);
        return this;
    }

    /**
     * <p>
     * Provides a quality assessment for a model that uses labels. If Lookout for Equipment determines that the model
     * quality is poor based on training metrics, the value is <code>POOR_QUALITY_DETECTED</code>. Otherwise, the value
     * is <code>QUALITY_THRESHOLD_MET</code>.
     * </p>
     * <p>
     * If the model is unlabeled, the model quality can't be assessed and the value of <code>ModelQuality</code> is
     * <code>CANNOT_DETERMINE_QUALITY</code>. In this situation, you can get a model quality assessment by adding labels
     * to the input dataset and retraining the model.
     * </p>
     * <p>
     * For information about using labels with your models, see <a
     * href="https://docs.aws.amazon.com/lookout-for-equipment/latest/ug/understanding-labeling.html">Understanding
     * labeling</a>.
     * </p>
     * <p>
     * For information about improving the quality of a model, see <a
     * href="https://docs.aws.amazon.com/lookout-for-equipment/latest/ug/best-practices.html">Best practices with Amazon
     * Lookout for Equipment</a>.
     * </p>
     * 
     * @param modelQuality
     *        Provides a quality assessment for a model that uses labels. If Lookout for Equipment determines that the
     *        model quality is poor based on training metrics, the value is <code>POOR_QUALITY_DETECTED</code>.
     *        Otherwise, the value is <code>QUALITY_THRESHOLD_MET</code>.</p>
     *        <p>
     *        If the model is unlabeled, the model quality can't be assessed and the value of <code>ModelQuality</code>
     *        is <code>CANNOT_DETERMINE_QUALITY</code>. In this situation, you can get a model quality assessment by
     *        adding labels to the input dataset and retraining the model.
     *        </p>
     *        <p>
     *        For information about using labels with your models, see <a
     *        href="https://docs.aws.amazon.com/lookout-for-equipment/latest/ug/understanding-labeling.html"
     *        >Understanding labeling</a>.
     *        </p>
     *        <p>
     *        For information about improving the quality of a model, see <a
     *        href="https://docs.aws.amazon.com/lookout-for-equipment/latest/ug/best-practices.html">Best practices with
     *        Amazon Lookout for Equipment</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ModelQuality
     */

    public DescribeModelResult withModelQuality(ModelQuality modelQuality) {
        this.modelQuality = modelQuality.toString();
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
        if (getModelName() != null)
            sb.append("ModelName: ").append(getModelName()).append(",");
        if (getModelArn() != null)
            sb.append("ModelArn: ").append(getModelArn()).append(",");
        if (getDatasetName() != null)
            sb.append("DatasetName: ").append(getDatasetName()).append(",");
        if (getDatasetArn() != null)
            sb.append("DatasetArn: ").append(getDatasetArn()).append(",");
        if (getSchema() != null)
            sb.append("Schema: ").append(getSchema()).append(",");
        if (getLabelsInputConfiguration() != null)
            sb.append("LabelsInputConfiguration: ").append(getLabelsInputConfiguration()).append(",");
        if (getTrainingDataStartTime() != null)
            sb.append("TrainingDataStartTime: ").append(getTrainingDataStartTime()).append(",");
        if (getTrainingDataEndTime() != null)
            sb.append("TrainingDataEndTime: ").append(getTrainingDataEndTime()).append(",");
        if (getEvaluationDataStartTime() != null)
            sb.append("EvaluationDataStartTime: ").append(getEvaluationDataStartTime()).append(",");
        if (getEvaluationDataEndTime() != null)
            sb.append("EvaluationDataEndTime: ").append(getEvaluationDataEndTime()).append(",");
        if (getRoleArn() != null)
            sb.append("RoleArn: ").append(getRoleArn()).append(",");
        if (getDataPreProcessingConfiguration() != null)
            sb.append("DataPreProcessingConfiguration: ").append(getDataPreProcessingConfiguration()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getTrainingExecutionStartTime() != null)
            sb.append("TrainingExecutionStartTime: ").append(getTrainingExecutionStartTime()).append(",");
        if (getTrainingExecutionEndTime() != null)
            sb.append("TrainingExecutionEndTime: ").append(getTrainingExecutionEndTime()).append(",");
        if (getFailedReason() != null)
            sb.append("FailedReason: ").append(getFailedReason()).append(",");
        if (getModelMetrics() != null)
            sb.append("ModelMetrics: ").append(getModelMetrics()).append(",");
        if (getLastUpdatedTime() != null)
            sb.append("LastUpdatedTime: ").append(getLastUpdatedTime()).append(",");
        if (getCreatedAt() != null)
            sb.append("CreatedAt: ").append(getCreatedAt()).append(",");
        if (getServerSideKmsKeyId() != null)
            sb.append("ServerSideKmsKeyId: ").append(getServerSideKmsKeyId()).append(",");
        if (getOffCondition() != null)
            sb.append("OffCondition: ").append(getOffCondition()).append(",");
        if (getSourceModelVersionArn() != null)
            sb.append("SourceModelVersionArn: ").append(getSourceModelVersionArn()).append(",");
        if (getImportJobStartTime() != null)
            sb.append("ImportJobStartTime: ").append(getImportJobStartTime()).append(",");
        if (getImportJobEndTime() != null)
            sb.append("ImportJobEndTime: ").append(getImportJobEndTime()).append(",");
        if (getActiveModelVersion() != null)
            sb.append("ActiveModelVersion: ").append(getActiveModelVersion()).append(",");
        if (getActiveModelVersionArn() != null)
            sb.append("ActiveModelVersionArn: ").append(getActiveModelVersionArn()).append(",");
        if (getModelVersionActivatedAt() != null)
            sb.append("ModelVersionActivatedAt: ").append(getModelVersionActivatedAt()).append(",");
        if (getPreviousActiveModelVersion() != null)
            sb.append("PreviousActiveModelVersion: ").append(getPreviousActiveModelVersion()).append(",");
        if (getPreviousActiveModelVersionArn() != null)
            sb.append("PreviousActiveModelVersionArn: ").append(getPreviousActiveModelVersionArn()).append(",");
        if (getPreviousModelVersionActivatedAt() != null)
            sb.append("PreviousModelVersionActivatedAt: ").append(getPreviousModelVersionActivatedAt()).append(",");
        if (getPriorModelMetrics() != null)
            sb.append("PriorModelMetrics: ").append(getPriorModelMetrics()).append(",");
        if (getLatestScheduledRetrainingFailedReason() != null)
            sb.append("LatestScheduledRetrainingFailedReason: ").append(getLatestScheduledRetrainingFailedReason()).append(",");
        if (getLatestScheduledRetrainingStatus() != null)
            sb.append("LatestScheduledRetrainingStatus: ").append(getLatestScheduledRetrainingStatus()).append(",");
        if (getLatestScheduledRetrainingModelVersion() != null)
            sb.append("LatestScheduledRetrainingModelVersion: ").append(getLatestScheduledRetrainingModelVersion()).append(",");
        if (getLatestScheduledRetrainingStartTime() != null)
            sb.append("LatestScheduledRetrainingStartTime: ").append(getLatestScheduledRetrainingStartTime()).append(",");
        if (getLatestScheduledRetrainingAvailableDataInDays() != null)
            sb.append("LatestScheduledRetrainingAvailableDataInDays: ").append(getLatestScheduledRetrainingAvailableDataInDays()).append(",");
        if (getNextScheduledRetrainingStartDate() != null)
            sb.append("NextScheduledRetrainingStartDate: ").append(getNextScheduledRetrainingStartDate()).append(",");
        if (getAccumulatedInferenceDataStartTime() != null)
            sb.append("AccumulatedInferenceDataStartTime: ").append(getAccumulatedInferenceDataStartTime()).append(",");
        if (getAccumulatedInferenceDataEndTime() != null)
            sb.append("AccumulatedInferenceDataEndTime: ").append(getAccumulatedInferenceDataEndTime()).append(",");
        if (getRetrainingSchedulerStatus() != null)
            sb.append("RetrainingSchedulerStatus: ").append(getRetrainingSchedulerStatus()).append(",");
        if (getModelDiagnosticsOutputConfiguration() != null)
            sb.append("ModelDiagnosticsOutputConfiguration: ").append(getModelDiagnosticsOutputConfiguration()).append(",");
        if (getModelQuality() != null)
            sb.append("ModelQuality: ").append(getModelQuality());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeModelResult == false)
            return false;
        DescribeModelResult other = (DescribeModelResult) obj;
        if (other.getModelName() == null ^ this.getModelName() == null)
            return false;
        if (other.getModelName() != null && other.getModelName().equals(this.getModelName()) == false)
            return false;
        if (other.getModelArn() == null ^ this.getModelArn() == null)
            return false;
        if (other.getModelArn() != null && other.getModelArn().equals(this.getModelArn()) == false)
            return false;
        if (other.getDatasetName() == null ^ this.getDatasetName() == null)
            return false;
        if (other.getDatasetName() != null && other.getDatasetName().equals(this.getDatasetName()) == false)
            return false;
        if (other.getDatasetArn() == null ^ this.getDatasetArn() == null)
            return false;
        if (other.getDatasetArn() != null && other.getDatasetArn().equals(this.getDatasetArn()) == false)
            return false;
        if (other.getSchema() == null ^ this.getSchema() == null)
            return false;
        if (other.getSchema() != null && other.getSchema().equals(this.getSchema()) == false)
            return false;
        if (other.getLabelsInputConfiguration() == null ^ this.getLabelsInputConfiguration() == null)
            return false;
        if (other.getLabelsInputConfiguration() != null && other.getLabelsInputConfiguration().equals(this.getLabelsInputConfiguration()) == false)
            return false;
        if (other.getTrainingDataStartTime() == null ^ this.getTrainingDataStartTime() == null)
            return false;
        if (other.getTrainingDataStartTime() != null && other.getTrainingDataStartTime().equals(this.getTrainingDataStartTime()) == false)
            return false;
        if (other.getTrainingDataEndTime() == null ^ this.getTrainingDataEndTime() == null)
            return false;
        if (other.getTrainingDataEndTime() != null && other.getTrainingDataEndTime().equals(this.getTrainingDataEndTime()) == false)
            return false;
        if (other.getEvaluationDataStartTime() == null ^ this.getEvaluationDataStartTime() == null)
            return false;
        if (other.getEvaluationDataStartTime() != null && other.getEvaluationDataStartTime().equals(this.getEvaluationDataStartTime()) == false)
            return false;
        if (other.getEvaluationDataEndTime() == null ^ this.getEvaluationDataEndTime() == null)
            return false;
        if (other.getEvaluationDataEndTime() != null && other.getEvaluationDataEndTime().equals(this.getEvaluationDataEndTime()) == false)
            return false;
        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false)
            return false;
        if (other.getDataPreProcessingConfiguration() == null ^ this.getDataPreProcessingConfiguration() == null)
            return false;
        if (other.getDataPreProcessingConfiguration() != null
                && other.getDataPreProcessingConfiguration().equals(this.getDataPreProcessingConfiguration()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getTrainingExecutionStartTime() == null ^ this.getTrainingExecutionStartTime() == null)
            return false;
        if (other.getTrainingExecutionStartTime() != null && other.getTrainingExecutionStartTime().equals(this.getTrainingExecutionStartTime()) == false)
            return false;
        if (other.getTrainingExecutionEndTime() == null ^ this.getTrainingExecutionEndTime() == null)
            return false;
        if (other.getTrainingExecutionEndTime() != null && other.getTrainingExecutionEndTime().equals(this.getTrainingExecutionEndTime()) == false)
            return false;
        if (other.getFailedReason() == null ^ this.getFailedReason() == null)
            return false;
        if (other.getFailedReason() != null && other.getFailedReason().equals(this.getFailedReason()) == false)
            return false;
        if (other.getModelMetrics() == null ^ this.getModelMetrics() == null)
            return false;
        if (other.getModelMetrics() != null && other.getModelMetrics().equals(this.getModelMetrics()) == false)
            return false;
        if (other.getLastUpdatedTime() == null ^ this.getLastUpdatedTime() == null)
            return false;
        if (other.getLastUpdatedTime() != null && other.getLastUpdatedTime().equals(this.getLastUpdatedTime()) == false)
            return false;
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null)
            return false;
        if (other.getCreatedAt() != null && other.getCreatedAt().equals(this.getCreatedAt()) == false)
            return false;
        if (other.getServerSideKmsKeyId() == null ^ this.getServerSideKmsKeyId() == null)
            return false;
        if (other.getServerSideKmsKeyId() != null && other.getServerSideKmsKeyId().equals(this.getServerSideKmsKeyId()) == false)
            return false;
        if (other.getOffCondition() == null ^ this.getOffCondition() == null)
            return false;
        if (other.getOffCondition() != null && other.getOffCondition().equals(this.getOffCondition()) == false)
            return false;
        if (other.getSourceModelVersionArn() == null ^ this.getSourceModelVersionArn() == null)
            return false;
        if (other.getSourceModelVersionArn() != null && other.getSourceModelVersionArn().equals(this.getSourceModelVersionArn()) == false)
            return false;
        if (other.getImportJobStartTime() == null ^ this.getImportJobStartTime() == null)
            return false;
        if (other.getImportJobStartTime() != null && other.getImportJobStartTime().equals(this.getImportJobStartTime()) == false)
            return false;
        if (other.getImportJobEndTime() == null ^ this.getImportJobEndTime() == null)
            return false;
        if (other.getImportJobEndTime() != null && other.getImportJobEndTime().equals(this.getImportJobEndTime()) == false)
            return false;
        if (other.getActiveModelVersion() == null ^ this.getActiveModelVersion() == null)
            return false;
        if (other.getActiveModelVersion() != null && other.getActiveModelVersion().equals(this.getActiveModelVersion()) == false)
            return false;
        if (other.getActiveModelVersionArn() == null ^ this.getActiveModelVersionArn() == null)
            return false;
        if (other.getActiveModelVersionArn() != null && other.getActiveModelVersionArn().equals(this.getActiveModelVersionArn()) == false)
            return false;
        if (other.getModelVersionActivatedAt() == null ^ this.getModelVersionActivatedAt() == null)
            return false;
        if (other.getModelVersionActivatedAt() != null && other.getModelVersionActivatedAt().equals(this.getModelVersionActivatedAt()) == false)
            return false;
        if (other.getPreviousActiveModelVersion() == null ^ this.getPreviousActiveModelVersion() == null)
            return false;
        if (other.getPreviousActiveModelVersion() != null && other.getPreviousActiveModelVersion().equals(this.getPreviousActiveModelVersion()) == false)
            return false;
        if (other.getPreviousActiveModelVersionArn() == null ^ this.getPreviousActiveModelVersionArn() == null)
            return false;
        if (other.getPreviousActiveModelVersionArn() != null
                && other.getPreviousActiveModelVersionArn().equals(this.getPreviousActiveModelVersionArn()) == false)
            return false;
        if (other.getPreviousModelVersionActivatedAt() == null ^ this.getPreviousModelVersionActivatedAt() == null)
            return false;
        if (other.getPreviousModelVersionActivatedAt() != null
                && other.getPreviousModelVersionActivatedAt().equals(this.getPreviousModelVersionActivatedAt()) == false)
            return false;
        if (other.getPriorModelMetrics() == null ^ this.getPriorModelMetrics() == null)
            return false;
        if (other.getPriorModelMetrics() != null && other.getPriorModelMetrics().equals(this.getPriorModelMetrics()) == false)
            return false;
        if (other.getLatestScheduledRetrainingFailedReason() == null ^ this.getLatestScheduledRetrainingFailedReason() == null)
            return false;
        if (other.getLatestScheduledRetrainingFailedReason() != null
                && other.getLatestScheduledRetrainingFailedReason().equals(this.getLatestScheduledRetrainingFailedReason()) == false)
            return false;
        if (other.getLatestScheduledRetrainingStatus() == null ^ this.getLatestScheduledRetrainingStatus() == null)
            return false;
        if (other.getLatestScheduledRetrainingStatus() != null
                && other.getLatestScheduledRetrainingStatus().equals(this.getLatestScheduledRetrainingStatus()) == false)
            return false;
        if (other.getLatestScheduledRetrainingModelVersion() == null ^ this.getLatestScheduledRetrainingModelVersion() == null)
            return false;
        if (other.getLatestScheduledRetrainingModelVersion() != null
                && other.getLatestScheduledRetrainingModelVersion().equals(this.getLatestScheduledRetrainingModelVersion()) == false)
            return false;
        if (other.getLatestScheduledRetrainingStartTime() == null ^ this.getLatestScheduledRetrainingStartTime() == null)
            return false;
        if (other.getLatestScheduledRetrainingStartTime() != null
                && other.getLatestScheduledRetrainingStartTime().equals(this.getLatestScheduledRetrainingStartTime()) == false)
            return false;
        if (other.getLatestScheduledRetrainingAvailableDataInDays() == null ^ this.getLatestScheduledRetrainingAvailableDataInDays() == null)
            return false;
        if (other.getLatestScheduledRetrainingAvailableDataInDays() != null
                && other.getLatestScheduledRetrainingAvailableDataInDays().equals(this.getLatestScheduledRetrainingAvailableDataInDays()) == false)
            return false;
        if (other.getNextScheduledRetrainingStartDate() == null ^ this.getNextScheduledRetrainingStartDate() == null)
            return false;
        if (other.getNextScheduledRetrainingStartDate() != null
                && other.getNextScheduledRetrainingStartDate().equals(this.getNextScheduledRetrainingStartDate()) == false)
            return false;
        if (other.getAccumulatedInferenceDataStartTime() == null ^ this.getAccumulatedInferenceDataStartTime() == null)
            return false;
        if (other.getAccumulatedInferenceDataStartTime() != null
                && other.getAccumulatedInferenceDataStartTime().equals(this.getAccumulatedInferenceDataStartTime()) == false)
            return false;
        if (other.getAccumulatedInferenceDataEndTime() == null ^ this.getAccumulatedInferenceDataEndTime() == null)
            return false;
        if (other.getAccumulatedInferenceDataEndTime() != null
                && other.getAccumulatedInferenceDataEndTime().equals(this.getAccumulatedInferenceDataEndTime()) == false)
            return false;
        if (other.getRetrainingSchedulerStatus() == null ^ this.getRetrainingSchedulerStatus() == null)
            return false;
        if (other.getRetrainingSchedulerStatus() != null && other.getRetrainingSchedulerStatus().equals(this.getRetrainingSchedulerStatus()) == false)
            return false;
        if (other.getModelDiagnosticsOutputConfiguration() == null ^ this.getModelDiagnosticsOutputConfiguration() == null)
            return false;
        if (other.getModelDiagnosticsOutputConfiguration() != null
                && other.getModelDiagnosticsOutputConfiguration().equals(this.getModelDiagnosticsOutputConfiguration()) == false)
            return false;
        if (other.getModelQuality() == null ^ this.getModelQuality() == null)
            return false;
        if (other.getModelQuality() != null && other.getModelQuality().equals(this.getModelQuality()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getModelName() == null) ? 0 : getModelName().hashCode());
        hashCode = prime * hashCode + ((getModelArn() == null) ? 0 : getModelArn().hashCode());
        hashCode = prime * hashCode + ((getDatasetName() == null) ? 0 : getDatasetName().hashCode());
        hashCode = prime * hashCode + ((getDatasetArn() == null) ? 0 : getDatasetArn().hashCode());
        hashCode = prime * hashCode + ((getSchema() == null) ? 0 : getSchema().hashCode());
        hashCode = prime * hashCode + ((getLabelsInputConfiguration() == null) ? 0 : getLabelsInputConfiguration().hashCode());
        hashCode = prime * hashCode + ((getTrainingDataStartTime() == null) ? 0 : getTrainingDataStartTime().hashCode());
        hashCode = prime * hashCode + ((getTrainingDataEndTime() == null) ? 0 : getTrainingDataEndTime().hashCode());
        hashCode = prime * hashCode + ((getEvaluationDataStartTime() == null) ? 0 : getEvaluationDataStartTime().hashCode());
        hashCode = prime * hashCode + ((getEvaluationDataEndTime() == null) ? 0 : getEvaluationDataEndTime().hashCode());
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        hashCode = prime * hashCode + ((getDataPreProcessingConfiguration() == null) ? 0 : getDataPreProcessingConfiguration().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getTrainingExecutionStartTime() == null) ? 0 : getTrainingExecutionStartTime().hashCode());
        hashCode = prime * hashCode + ((getTrainingExecutionEndTime() == null) ? 0 : getTrainingExecutionEndTime().hashCode());
        hashCode = prime * hashCode + ((getFailedReason() == null) ? 0 : getFailedReason().hashCode());
        hashCode = prime * hashCode + ((getModelMetrics() == null) ? 0 : getModelMetrics().hashCode());
        hashCode = prime * hashCode + ((getLastUpdatedTime() == null) ? 0 : getLastUpdatedTime().hashCode());
        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        hashCode = prime * hashCode + ((getServerSideKmsKeyId() == null) ? 0 : getServerSideKmsKeyId().hashCode());
        hashCode = prime * hashCode + ((getOffCondition() == null) ? 0 : getOffCondition().hashCode());
        hashCode = prime * hashCode + ((getSourceModelVersionArn() == null) ? 0 : getSourceModelVersionArn().hashCode());
        hashCode = prime * hashCode + ((getImportJobStartTime() == null) ? 0 : getImportJobStartTime().hashCode());
        hashCode = prime * hashCode + ((getImportJobEndTime() == null) ? 0 : getImportJobEndTime().hashCode());
        hashCode = prime * hashCode + ((getActiveModelVersion() == null) ? 0 : getActiveModelVersion().hashCode());
        hashCode = prime * hashCode + ((getActiveModelVersionArn() == null) ? 0 : getActiveModelVersionArn().hashCode());
        hashCode = prime * hashCode + ((getModelVersionActivatedAt() == null) ? 0 : getModelVersionActivatedAt().hashCode());
        hashCode = prime * hashCode + ((getPreviousActiveModelVersion() == null) ? 0 : getPreviousActiveModelVersion().hashCode());
        hashCode = prime * hashCode + ((getPreviousActiveModelVersionArn() == null) ? 0 : getPreviousActiveModelVersionArn().hashCode());
        hashCode = prime * hashCode + ((getPreviousModelVersionActivatedAt() == null) ? 0 : getPreviousModelVersionActivatedAt().hashCode());
        hashCode = prime * hashCode + ((getPriorModelMetrics() == null) ? 0 : getPriorModelMetrics().hashCode());
        hashCode = prime * hashCode + ((getLatestScheduledRetrainingFailedReason() == null) ? 0 : getLatestScheduledRetrainingFailedReason().hashCode());
        hashCode = prime * hashCode + ((getLatestScheduledRetrainingStatus() == null) ? 0 : getLatestScheduledRetrainingStatus().hashCode());
        hashCode = prime * hashCode + ((getLatestScheduledRetrainingModelVersion() == null) ? 0 : getLatestScheduledRetrainingModelVersion().hashCode());
        hashCode = prime * hashCode + ((getLatestScheduledRetrainingStartTime() == null) ? 0 : getLatestScheduledRetrainingStartTime().hashCode());
        hashCode = prime * hashCode
                + ((getLatestScheduledRetrainingAvailableDataInDays() == null) ? 0 : getLatestScheduledRetrainingAvailableDataInDays().hashCode());
        hashCode = prime * hashCode + ((getNextScheduledRetrainingStartDate() == null) ? 0 : getNextScheduledRetrainingStartDate().hashCode());
        hashCode = prime * hashCode + ((getAccumulatedInferenceDataStartTime() == null) ? 0 : getAccumulatedInferenceDataStartTime().hashCode());
        hashCode = prime * hashCode + ((getAccumulatedInferenceDataEndTime() == null) ? 0 : getAccumulatedInferenceDataEndTime().hashCode());
        hashCode = prime * hashCode + ((getRetrainingSchedulerStatus() == null) ? 0 : getRetrainingSchedulerStatus().hashCode());
        hashCode = prime * hashCode + ((getModelDiagnosticsOutputConfiguration() == null) ? 0 : getModelDiagnosticsOutputConfiguration().hashCode());
        hashCode = prime * hashCode + ((getModelQuality() == null) ? 0 : getModelQuality().hashCode());
        return hashCode;
    }

    @Override
    public DescribeModelResult clone() {
        try {
            return (DescribeModelResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
