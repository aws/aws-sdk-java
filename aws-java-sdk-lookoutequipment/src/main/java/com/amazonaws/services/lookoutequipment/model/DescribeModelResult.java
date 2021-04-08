/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
     * The name of the ML model being described.
     * </p>
     */
    private String modelName;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the ML model being described.
     * </p>
     */
    private String modelArn;
    /**
     * <p>
     * The name of the dataset being used by the ML being described.
     * </p>
     */
    private String datasetName;
    /**
     * <p>
     * The Amazon Resouce Name (ARN) of the dataset used to create the ML model being described.
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
     * Indicates the time reference in the dataset that was used to begin the subset of training data for the ML model.
     * </p>
     */
    private java.util.Date trainingDataStartTime;
    /**
     * <p>
     * Indicates the time reference in the dataset that was used to end the subset of training data for the ML model.
     * </p>
     */
    private java.util.Date trainingDataEndTime;
    /**
     * <p>
     * Indicates the time reference in the dataset that was used to begin the subset of evaluation data for the ML
     * model.
     * </p>
     */
    private java.util.Date evaluationDataStartTime;
    /**
     * <p>
     * Indicates the time reference in the dataset that was used to end the subset of evaluation data for the ML model.
     * </p>
     */
    private java.util.Date evaluationDataEndTime;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of a role with permission to access the data source for the ML model being
     * described.
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
     * Indicates the time at which the training of the ML model began.
     * </p>
     */
    private java.util.Date trainingExecutionStartTime;
    /**
     * <p>
     * Indicates the time at which the training of the ML model was completed.
     * </p>
     */
    private java.util.Date trainingExecutionEndTime;
    /**
     * <p>
     * If the training of the ML model failed, this indicates the reason for that failure.
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
     * Indicates the last time the ML model was updated. The type of update is not specified.
     * </p>
     */
    private java.util.Date lastUpdatedTime;
    /**
     * <p>
     * Indicates the time and date at which the ML model was created.
     * </p>
     */
    private java.util.Date createdAt;
    /**
     * <p>
     * Provides the identifier of the AWS KMS customer master key (CMK) used to encrypt model data by Amazon Lookout for
     * Equipment.
     * </p>
     */
    private String serverSideKmsKeyId;

    /**
     * <p>
     * The name of the ML model being described.
     * </p>
     * 
     * @param modelName
     *        The name of the ML model being described.
     */

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    /**
     * <p>
     * The name of the ML model being described.
     * </p>
     * 
     * @return The name of the ML model being described.
     */

    public String getModelName() {
        return this.modelName;
    }

    /**
     * <p>
     * The name of the ML model being described.
     * </p>
     * 
     * @param modelName
     *        The name of the ML model being described.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeModelResult withModelName(String modelName) {
        setModelName(modelName);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the ML model being described.
     * </p>
     * 
     * @param modelArn
     *        The Amazon Resource Name (ARN) of the ML model being described.
     */

    public void setModelArn(String modelArn) {
        this.modelArn = modelArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the ML model being described.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the ML model being described.
     */

    public String getModelArn() {
        return this.modelArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the ML model being described.
     * </p>
     * 
     * @param modelArn
     *        The Amazon Resource Name (ARN) of the ML model being described.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeModelResult withModelArn(String modelArn) {
        setModelArn(modelArn);
        return this;
    }

    /**
     * <p>
     * The name of the dataset being used by the ML being described.
     * </p>
     * 
     * @param datasetName
     *        The name of the dataset being used by the ML being described.
     */

    public void setDatasetName(String datasetName) {
        this.datasetName = datasetName;
    }

    /**
     * <p>
     * The name of the dataset being used by the ML being described.
     * </p>
     * 
     * @return The name of the dataset being used by the ML being described.
     */

    public String getDatasetName() {
        return this.datasetName;
    }

    /**
     * <p>
     * The name of the dataset being used by the ML being described.
     * </p>
     * 
     * @param datasetName
     *        The name of the dataset being used by the ML being described.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeModelResult withDatasetName(String datasetName) {
        setDatasetName(datasetName);
        return this;
    }

    /**
     * <p>
     * The Amazon Resouce Name (ARN) of the dataset used to create the ML model being described.
     * </p>
     * 
     * @param datasetArn
     *        The Amazon Resouce Name (ARN) of the dataset used to create the ML model being described.
     */

    public void setDatasetArn(String datasetArn) {
        this.datasetArn = datasetArn;
    }

    /**
     * <p>
     * The Amazon Resouce Name (ARN) of the dataset used to create the ML model being described.
     * </p>
     * 
     * @return The Amazon Resouce Name (ARN) of the dataset used to create the ML model being described.
     */

    public String getDatasetArn() {
        return this.datasetArn;
    }

    /**
     * <p>
     * The Amazon Resouce Name (ARN) of the dataset used to create the ML model being described.
     * </p>
     * 
     * @param datasetArn
     *        The Amazon Resouce Name (ARN) of the dataset used to create the ML model being described.
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
     * Indicates the time reference in the dataset that was used to begin the subset of training data for the ML model.
     * </p>
     * 
     * @param trainingDataStartTime
     *        Indicates the time reference in the dataset that was used to begin the subset of training data for the ML
     *        model.
     */

    public void setTrainingDataStartTime(java.util.Date trainingDataStartTime) {
        this.trainingDataStartTime = trainingDataStartTime;
    }

    /**
     * <p>
     * Indicates the time reference in the dataset that was used to begin the subset of training data for the ML model.
     * </p>
     * 
     * @return Indicates the time reference in the dataset that was used to begin the subset of training data for the ML
     *         model.
     */

    public java.util.Date getTrainingDataStartTime() {
        return this.trainingDataStartTime;
    }

    /**
     * <p>
     * Indicates the time reference in the dataset that was used to begin the subset of training data for the ML model.
     * </p>
     * 
     * @param trainingDataStartTime
     *        Indicates the time reference in the dataset that was used to begin the subset of training data for the ML
     *        model.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeModelResult withTrainingDataStartTime(java.util.Date trainingDataStartTime) {
        setTrainingDataStartTime(trainingDataStartTime);
        return this;
    }

    /**
     * <p>
     * Indicates the time reference in the dataset that was used to end the subset of training data for the ML model.
     * </p>
     * 
     * @param trainingDataEndTime
     *        Indicates the time reference in the dataset that was used to end the subset of training data for the ML
     *        model.
     */

    public void setTrainingDataEndTime(java.util.Date trainingDataEndTime) {
        this.trainingDataEndTime = trainingDataEndTime;
    }

    /**
     * <p>
     * Indicates the time reference in the dataset that was used to end the subset of training data for the ML model.
     * </p>
     * 
     * @return Indicates the time reference in the dataset that was used to end the subset of training data for the ML
     *         model.
     */

    public java.util.Date getTrainingDataEndTime() {
        return this.trainingDataEndTime;
    }

    /**
     * <p>
     * Indicates the time reference in the dataset that was used to end the subset of training data for the ML model.
     * </p>
     * 
     * @param trainingDataEndTime
     *        Indicates the time reference in the dataset that was used to end the subset of training data for the ML
     *        model.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeModelResult withTrainingDataEndTime(java.util.Date trainingDataEndTime) {
        setTrainingDataEndTime(trainingDataEndTime);
        return this;
    }

    /**
     * <p>
     * Indicates the time reference in the dataset that was used to begin the subset of evaluation data for the ML
     * model.
     * </p>
     * 
     * @param evaluationDataStartTime
     *        Indicates the time reference in the dataset that was used to begin the subset of evaluation data for the
     *        ML model.
     */

    public void setEvaluationDataStartTime(java.util.Date evaluationDataStartTime) {
        this.evaluationDataStartTime = evaluationDataStartTime;
    }

    /**
     * <p>
     * Indicates the time reference in the dataset that was used to begin the subset of evaluation data for the ML
     * model.
     * </p>
     * 
     * @return Indicates the time reference in the dataset that was used to begin the subset of evaluation data for the
     *         ML model.
     */

    public java.util.Date getEvaluationDataStartTime() {
        return this.evaluationDataStartTime;
    }

    /**
     * <p>
     * Indicates the time reference in the dataset that was used to begin the subset of evaluation data for the ML
     * model.
     * </p>
     * 
     * @param evaluationDataStartTime
     *        Indicates the time reference in the dataset that was used to begin the subset of evaluation data for the
     *        ML model.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeModelResult withEvaluationDataStartTime(java.util.Date evaluationDataStartTime) {
        setEvaluationDataStartTime(evaluationDataStartTime);
        return this;
    }

    /**
     * <p>
     * Indicates the time reference in the dataset that was used to end the subset of evaluation data for the ML model.
     * </p>
     * 
     * @param evaluationDataEndTime
     *        Indicates the time reference in the dataset that was used to end the subset of evaluation data for the ML
     *        model.
     */

    public void setEvaluationDataEndTime(java.util.Date evaluationDataEndTime) {
        this.evaluationDataEndTime = evaluationDataEndTime;
    }

    /**
     * <p>
     * Indicates the time reference in the dataset that was used to end the subset of evaluation data for the ML model.
     * </p>
     * 
     * @return Indicates the time reference in the dataset that was used to end the subset of evaluation data for the ML
     *         model.
     */

    public java.util.Date getEvaluationDataEndTime() {
        return this.evaluationDataEndTime;
    }

    /**
     * <p>
     * Indicates the time reference in the dataset that was used to end the subset of evaluation data for the ML model.
     * </p>
     * 
     * @param evaluationDataEndTime
     *        Indicates the time reference in the dataset that was used to end the subset of evaluation data for the ML
     *        model.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeModelResult withEvaluationDataEndTime(java.util.Date evaluationDataEndTime) {
        setEvaluationDataEndTime(evaluationDataEndTime);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of a role with permission to access the data source for the ML model being
     * described.
     * </p>
     * 
     * @param roleArn
     *        The Amazon Resource Name (ARN) of a role with permission to access the data source for the ML model being
     *        described.
     */

    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of a role with permission to access the data source for the ML model being
     * described.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of a role with permission to access the data source for the ML model being
     *         described.
     */

    public String getRoleArn() {
        return this.roleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of a role with permission to access the data source for the ML model being
     * described.
     * </p>
     * 
     * @param roleArn
     *        The Amazon Resource Name (ARN) of a role with permission to access the data source for the ML model being
     *        described.
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
     * Indicates the time at which the training of the ML model began.
     * </p>
     * 
     * @param trainingExecutionStartTime
     *        Indicates the time at which the training of the ML model began.
     */

    public void setTrainingExecutionStartTime(java.util.Date trainingExecutionStartTime) {
        this.trainingExecutionStartTime = trainingExecutionStartTime;
    }

    /**
     * <p>
     * Indicates the time at which the training of the ML model began.
     * </p>
     * 
     * @return Indicates the time at which the training of the ML model began.
     */

    public java.util.Date getTrainingExecutionStartTime() {
        return this.trainingExecutionStartTime;
    }

    /**
     * <p>
     * Indicates the time at which the training of the ML model began.
     * </p>
     * 
     * @param trainingExecutionStartTime
     *        Indicates the time at which the training of the ML model began.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeModelResult withTrainingExecutionStartTime(java.util.Date trainingExecutionStartTime) {
        setTrainingExecutionStartTime(trainingExecutionStartTime);
        return this;
    }

    /**
     * <p>
     * Indicates the time at which the training of the ML model was completed.
     * </p>
     * 
     * @param trainingExecutionEndTime
     *        Indicates the time at which the training of the ML model was completed.
     */

    public void setTrainingExecutionEndTime(java.util.Date trainingExecutionEndTime) {
        this.trainingExecutionEndTime = trainingExecutionEndTime;
    }

    /**
     * <p>
     * Indicates the time at which the training of the ML model was completed.
     * </p>
     * 
     * @return Indicates the time at which the training of the ML model was completed.
     */

    public java.util.Date getTrainingExecutionEndTime() {
        return this.trainingExecutionEndTime;
    }

    /**
     * <p>
     * Indicates the time at which the training of the ML model was completed.
     * </p>
     * 
     * @param trainingExecutionEndTime
     *        Indicates the time at which the training of the ML model was completed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeModelResult withTrainingExecutionEndTime(java.util.Date trainingExecutionEndTime) {
        setTrainingExecutionEndTime(trainingExecutionEndTime);
        return this;
    }

    /**
     * <p>
     * If the training of the ML model failed, this indicates the reason for that failure.
     * </p>
     * 
     * @param failedReason
     *        If the training of the ML model failed, this indicates the reason for that failure.
     */

    public void setFailedReason(String failedReason) {
        this.failedReason = failedReason;
    }

    /**
     * <p>
     * If the training of the ML model failed, this indicates the reason for that failure.
     * </p>
     * 
     * @return If the training of the ML model failed, this indicates the reason for that failure.
     */

    public String getFailedReason() {
        return this.failedReason;
    }

    /**
     * <p>
     * If the training of the ML model failed, this indicates the reason for that failure.
     * </p>
     * 
     * @param failedReason
     *        If the training of the ML model failed, this indicates the reason for that failure.
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
     * Indicates the last time the ML model was updated. The type of update is not specified.
     * </p>
     * 
     * @param lastUpdatedTime
     *        Indicates the last time the ML model was updated. The type of update is not specified.
     */

    public void setLastUpdatedTime(java.util.Date lastUpdatedTime) {
        this.lastUpdatedTime = lastUpdatedTime;
    }

    /**
     * <p>
     * Indicates the last time the ML model was updated. The type of update is not specified.
     * </p>
     * 
     * @return Indicates the last time the ML model was updated. The type of update is not specified.
     */

    public java.util.Date getLastUpdatedTime() {
        return this.lastUpdatedTime;
    }

    /**
     * <p>
     * Indicates the last time the ML model was updated. The type of update is not specified.
     * </p>
     * 
     * @param lastUpdatedTime
     *        Indicates the last time the ML model was updated. The type of update is not specified.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeModelResult withLastUpdatedTime(java.util.Date lastUpdatedTime) {
        setLastUpdatedTime(lastUpdatedTime);
        return this;
    }

    /**
     * <p>
     * Indicates the time and date at which the ML model was created.
     * </p>
     * 
     * @param createdAt
     *        Indicates the time and date at which the ML model was created.
     */

    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * Indicates the time and date at which the ML model was created.
     * </p>
     * 
     * @return Indicates the time and date at which the ML model was created.
     */

    public java.util.Date getCreatedAt() {
        return this.createdAt;
    }

    /**
     * <p>
     * Indicates the time and date at which the ML model was created.
     * </p>
     * 
     * @param createdAt
     *        Indicates the time and date at which the ML model was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeModelResult withCreatedAt(java.util.Date createdAt) {
        setCreatedAt(createdAt);
        return this;
    }

    /**
     * <p>
     * Provides the identifier of the AWS KMS customer master key (CMK) used to encrypt model data by Amazon Lookout for
     * Equipment.
     * </p>
     * 
     * @param serverSideKmsKeyId
     *        Provides the identifier of the AWS KMS customer master key (CMK) used to encrypt model data by Amazon
     *        Lookout for Equipment.
     */

    public void setServerSideKmsKeyId(String serverSideKmsKeyId) {
        this.serverSideKmsKeyId = serverSideKmsKeyId;
    }

    /**
     * <p>
     * Provides the identifier of the AWS KMS customer master key (CMK) used to encrypt model data by Amazon Lookout for
     * Equipment.
     * </p>
     * 
     * @return Provides the identifier of the AWS KMS customer master key (CMK) used to encrypt model data by Amazon
     *         Lookout for Equipment.
     */

    public String getServerSideKmsKeyId() {
        return this.serverSideKmsKeyId;
    }

    /**
     * <p>
     * Provides the identifier of the AWS KMS customer master key (CMK) used to encrypt model data by Amazon Lookout for
     * Equipment.
     * </p>
     * 
     * @param serverSideKmsKeyId
     *        Provides the identifier of the AWS KMS customer master key (CMK) used to encrypt model data by Amazon
     *        Lookout for Equipment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeModelResult withServerSideKmsKeyId(String serverSideKmsKeyId) {
        setServerSideKmsKeyId(serverSideKmsKeyId);
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
            sb.append("ServerSideKmsKeyId: ").append(getServerSideKmsKeyId());
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
