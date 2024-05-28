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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutequipment-2020-12-15/DescribeModelVersion"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeModelVersionResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the machine learning model that this version belongs to.
     * </p>
     */
    private String modelName;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the parent machine learning model that this version belong to.
     * </p>
     */
    private String modelArn;
    /**
     * <p>
     * The version of the machine learning model.
     * </p>
     */
    private Long modelVersion;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the model version.
     * </p>
     */
    private String modelVersionArn;
    /**
     * <p>
     * The current status of the model version.
     * </p>
     */
    private String status;
    /**
     * <p>
     * Indicates whether this model version was created by training or by importing.
     * </p>
     */
    private String sourceType;
    /**
     * <p>
     * The name of the dataset used to train the model version.
     * </p>
     */
    private String datasetName;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the dataset used to train the model version.
     * </p>
     */
    private String datasetArn;
    /**
     * <p>
     * The schema of the data used to train the model version.
     * </p>
     */
    private String schema;

    private LabelsInputConfiguration labelsInputConfiguration;
    /**
     * <p>
     * The date on which the training data began being gathered. If you imported the version, this is the date that the
     * training data in the source version began being gathered.
     * </p>
     */
    private java.util.Date trainingDataStartTime;
    /**
     * <p>
     * The date on which the training data finished being gathered. If you imported the version, this is the date that
     * the training data in the source version finished being gathered.
     * </p>
     */
    private java.util.Date trainingDataEndTime;
    /**
     * <p>
     * The date on which the data in the evaluation set began being gathered. If you imported the version, this is the
     * date that the evaluation set data in the source version began being gathered.
     * </p>
     */
    private java.util.Date evaluationDataStartTime;
    /**
     * <p>
     * The date on which the data in the evaluation set began being gathered. If you imported the version, this is the
     * date that the evaluation set data in the source version finished being gathered.
     * </p>
     */
    private java.util.Date evaluationDataEndTime;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the role that was used to train the model version.
     * </p>
     */
    private String roleArn;

    private DataPreProcessingConfiguration dataPreProcessingConfiguration;
    /**
     * <p>
     * The time when the training of the version began.
     * </p>
     */
    private java.util.Date trainingExecutionStartTime;
    /**
     * <p>
     * The time when the training of the version completed.
     * </p>
     */
    private java.util.Date trainingExecutionEndTime;
    /**
     * <p>
     * The failure message if the training of the model version failed.
     * </p>
     */
    private String failedReason;
    /**
     * <p>
     * Shows an aggregated summary, in JSON format, of the model's performance within the evaluation time range. These
     * metrics are created when evaluating the model.
     * </p>
     */
    private String modelMetrics;
    /**
     * <p>
     * Indicates the last time the machine learning model version was updated.
     * </p>
     */
    private java.util.Date lastUpdatedTime;
    /**
     * <p>
     * Indicates the time and date at which the machine learning model version was created.
     * </p>
     */
    private java.util.Date createdAt;
    /**
     * <p>
     * The identifier of the KMS key key used to encrypt model version data by Amazon Lookout for Equipment.
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
     * If model version was imported, then this field is the arn of the source model version.
     * </p>
     */
    private String sourceModelVersionArn;
    /**
     * <p>
     * The date and time when the import job began. This field appears if the model version was imported.
     * </p>
     */
    private java.util.Date importJobStartTime;
    /**
     * <p>
     * The date and time when the import job completed. This field appears if the model version was imported.
     * </p>
     */
    private java.util.Date importJobEndTime;
    /**
     * <p>
     * The size in bytes of the imported data. This field appears if the model version was imported.
     * </p>
     */
    private Long importedDataSizeInBytes;
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
     * Indicates the number of days of data used in the most recent scheduled retraining run.
     * </p>
     */
    private Integer retrainingAvailableDataInDays;
    /**
     * <p>
     * Indicates whether the model version was promoted to be the active version after retraining or if there was an
     * error with or cancellation of the retraining.
     * </p>
     */
    private String autoPromotionResult;
    /**
     * <p>
     * Indicates the reason for the <code>AutoPromotionResult</code>. For example, a model might not be promoted if its
     * performance was worse than the active version, if there was an error during training, or if the retraining
     * scheduler was using <code>MANUAL</code> promote mode. The model will be promoted in <code>MANAGED</code> promote
     * mode if the performance is better than the previous model.
     * </p>
     */
    private String autoPromotionResultReason;
    /**
     * <p>
     * The Amazon S3 location where Amazon Lookout for Equipment saves the pointwise model diagnostics for the model
     * version.
     * </p>
     */
    private ModelDiagnosticsOutputConfiguration modelDiagnosticsOutputConfiguration;
    /**
     * <p>
     * The Amazon S3 output prefix for where Lookout for Equipment saves the pointwise model diagnostics for the model
     * version.
     * </p>
     */
    private S3Object modelDiagnosticsResultsObject;
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
     * The name of the machine learning model that this version belongs to.
     * </p>
     * 
     * @param modelName
     *        The name of the machine learning model that this version belongs to.
     */

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    /**
     * <p>
     * The name of the machine learning model that this version belongs to.
     * </p>
     * 
     * @return The name of the machine learning model that this version belongs to.
     */

    public String getModelName() {
        return this.modelName;
    }

    /**
     * <p>
     * The name of the machine learning model that this version belongs to.
     * </p>
     * 
     * @param modelName
     *        The name of the machine learning model that this version belongs to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeModelVersionResult withModelName(String modelName) {
        setModelName(modelName);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the parent machine learning model that this version belong to.
     * </p>
     * 
     * @param modelArn
     *        The Amazon Resource Name (ARN) of the parent machine learning model that this version belong to.
     */

    public void setModelArn(String modelArn) {
        this.modelArn = modelArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the parent machine learning model that this version belong to.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the parent machine learning model that this version belong to.
     */

    public String getModelArn() {
        return this.modelArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the parent machine learning model that this version belong to.
     * </p>
     * 
     * @param modelArn
     *        The Amazon Resource Name (ARN) of the parent machine learning model that this version belong to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeModelVersionResult withModelArn(String modelArn) {
        setModelArn(modelArn);
        return this;
    }

    /**
     * <p>
     * The version of the machine learning model.
     * </p>
     * 
     * @param modelVersion
     *        The version of the machine learning model.
     */

    public void setModelVersion(Long modelVersion) {
        this.modelVersion = modelVersion;
    }

    /**
     * <p>
     * The version of the machine learning model.
     * </p>
     * 
     * @return The version of the machine learning model.
     */

    public Long getModelVersion() {
        return this.modelVersion;
    }

    /**
     * <p>
     * The version of the machine learning model.
     * </p>
     * 
     * @param modelVersion
     *        The version of the machine learning model.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeModelVersionResult withModelVersion(Long modelVersion) {
        setModelVersion(modelVersion);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the model version.
     * </p>
     * 
     * @param modelVersionArn
     *        The Amazon Resource Name (ARN) of the model version.
     */

    public void setModelVersionArn(String modelVersionArn) {
        this.modelVersionArn = modelVersionArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the model version.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the model version.
     */

    public String getModelVersionArn() {
        return this.modelVersionArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the model version.
     * </p>
     * 
     * @param modelVersionArn
     *        The Amazon Resource Name (ARN) of the model version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeModelVersionResult withModelVersionArn(String modelVersionArn) {
        setModelVersionArn(modelVersionArn);
        return this;
    }

    /**
     * <p>
     * The current status of the model version.
     * </p>
     * 
     * @param status
     *        The current status of the model version.
     * @see ModelVersionStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The current status of the model version.
     * </p>
     * 
     * @return The current status of the model version.
     * @see ModelVersionStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The current status of the model version.
     * </p>
     * 
     * @param status
     *        The current status of the model version.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ModelVersionStatus
     */

    public DescribeModelVersionResult withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The current status of the model version.
     * </p>
     * 
     * @param status
     *        The current status of the model version.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ModelVersionStatus
     */

    public DescribeModelVersionResult withStatus(ModelVersionStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * Indicates whether this model version was created by training or by importing.
     * </p>
     * 
     * @param sourceType
     *        Indicates whether this model version was created by training or by importing.
     * @see ModelVersionSourceType
     */

    public void setSourceType(String sourceType) {
        this.sourceType = sourceType;
    }

    /**
     * <p>
     * Indicates whether this model version was created by training or by importing.
     * </p>
     * 
     * @return Indicates whether this model version was created by training or by importing.
     * @see ModelVersionSourceType
     */

    public String getSourceType() {
        return this.sourceType;
    }

    /**
     * <p>
     * Indicates whether this model version was created by training or by importing.
     * </p>
     * 
     * @param sourceType
     *        Indicates whether this model version was created by training or by importing.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ModelVersionSourceType
     */

    public DescribeModelVersionResult withSourceType(String sourceType) {
        setSourceType(sourceType);
        return this;
    }

    /**
     * <p>
     * Indicates whether this model version was created by training or by importing.
     * </p>
     * 
     * @param sourceType
     *        Indicates whether this model version was created by training or by importing.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ModelVersionSourceType
     */

    public DescribeModelVersionResult withSourceType(ModelVersionSourceType sourceType) {
        this.sourceType = sourceType.toString();
        return this;
    }

    /**
     * <p>
     * The name of the dataset used to train the model version.
     * </p>
     * 
     * @param datasetName
     *        The name of the dataset used to train the model version.
     */

    public void setDatasetName(String datasetName) {
        this.datasetName = datasetName;
    }

    /**
     * <p>
     * The name of the dataset used to train the model version.
     * </p>
     * 
     * @return The name of the dataset used to train the model version.
     */

    public String getDatasetName() {
        return this.datasetName;
    }

    /**
     * <p>
     * The name of the dataset used to train the model version.
     * </p>
     * 
     * @param datasetName
     *        The name of the dataset used to train the model version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeModelVersionResult withDatasetName(String datasetName) {
        setDatasetName(datasetName);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the dataset used to train the model version.
     * </p>
     * 
     * @param datasetArn
     *        The Amazon Resource Name (ARN) of the dataset used to train the model version.
     */

    public void setDatasetArn(String datasetArn) {
        this.datasetArn = datasetArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the dataset used to train the model version.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the dataset used to train the model version.
     */

    public String getDatasetArn() {
        return this.datasetArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the dataset used to train the model version.
     * </p>
     * 
     * @param datasetArn
     *        The Amazon Resource Name (ARN) of the dataset used to train the model version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeModelVersionResult withDatasetArn(String datasetArn) {
        setDatasetArn(datasetArn);
        return this;
    }

    /**
     * <p>
     * The schema of the data used to train the model version.
     * </p>
     * 
     * @param schema
     *        The schema of the data used to train the model version.
     */

    public void setSchema(String schema) {
        this.schema = schema;
    }

    /**
     * <p>
     * The schema of the data used to train the model version.
     * </p>
     * 
     * @return The schema of the data used to train the model version.
     */

    public String getSchema() {
        return this.schema;
    }

    /**
     * <p>
     * The schema of the data used to train the model version.
     * </p>
     * 
     * @param schema
     *        The schema of the data used to train the model version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeModelVersionResult withSchema(String schema) {
        setSchema(schema);
        return this;
    }

    /**
     * @param labelsInputConfiguration
     */

    public void setLabelsInputConfiguration(LabelsInputConfiguration labelsInputConfiguration) {
        this.labelsInputConfiguration = labelsInputConfiguration;
    }

    /**
     * @return
     */

    public LabelsInputConfiguration getLabelsInputConfiguration() {
        return this.labelsInputConfiguration;
    }

    /**
     * @param labelsInputConfiguration
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeModelVersionResult withLabelsInputConfiguration(LabelsInputConfiguration labelsInputConfiguration) {
        setLabelsInputConfiguration(labelsInputConfiguration);
        return this;
    }

    /**
     * <p>
     * The date on which the training data began being gathered. If you imported the version, this is the date that the
     * training data in the source version began being gathered.
     * </p>
     * 
     * @param trainingDataStartTime
     *        The date on which the training data began being gathered. If you imported the version, this is the date
     *        that the training data in the source version began being gathered.
     */

    public void setTrainingDataStartTime(java.util.Date trainingDataStartTime) {
        this.trainingDataStartTime = trainingDataStartTime;
    }

    /**
     * <p>
     * The date on which the training data began being gathered. If you imported the version, this is the date that the
     * training data in the source version began being gathered.
     * </p>
     * 
     * @return The date on which the training data began being gathered. If you imported the version, this is the date
     *         that the training data in the source version began being gathered.
     */

    public java.util.Date getTrainingDataStartTime() {
        return this.trainingDataStartTime;
    }

    /**
     * <p>
     * The date on which the training data began being gathered. If you imported the version, this is the date that the
     * training data in the source version began being gathered.
     * </p>
     * 
     * @param trainingDataStartTime
     *        The date on which the training data began being gathered. If you imported the version, this is the date
     *        that the training data in the source version began being gathered.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeModelVersionResult withTrainingDataStartTime(java.util.Date trainingDataStartTime) {
        setTrainingDataStartTime(trainingDataStartTime);
        return this;
    }

    /**
     * <p>
     * The date on which the training data finished being gathered. If you imported the version, this is the date that
     * the training data in the source version finished being gathered.
     * </p>
     * 
     * @param trainingDataEndTime
     *        The date on which the training data finished being gathered. If you imported the version, this is the date
     *        that the training data in the source version finished being gathered.
     */

    public void setTrainingDataEndTime(java.util.Date trainingDataEndTime) {
        this.trainingDataEndTime = trainingDataEndTime;
    }

    /**
     * <p>
     * The date on which the training data finished being gathered. If you imported the version, this is the date that
     * the training data in the source version finished being gathered.
     * </p>
     * 
     * @return The date on which the training data finished being gathered. If you imported the version, this is the
     *         date that the training data in the source version finished being gathered.
     */

    public java.util.Date getTrainingDataEndTime() {
        return this.trainingDataEndTime;
    }

    /**
     * <p>
     * The date on which the training data finished being gathered. If you imported the version, this is the date that
     * the training data in the source version finished being gathered.
     * </p>
     * 
     * @param trainingDataEndTime
     *        The date on which the training data finished being gathered. If you imported the version, this is the date
     *        that the training data in the source version finished being gathered.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeModelVersionResult withTrainingDataEndTime(java.util.Date trainingDataEndTime) {
        setTrainingDataEndTime(trainingDataEndTime);
        return this;
    }

    /**
     * <p>
     * The date on which the data in the evaluation set began being gathered. If you imported the version, this is the
     * date that the evaluation set data in the source version began being gathered.
     * </p>
     * 
     * @param evaluationDataStartTime
     *        The date on which the data in the evaluation set began being gathered. If you imported the version, this
     *        is the date that the evaluation set data in the source version began being gathered.
     */

    public void setEvaluationDataStartTime(java.util.Date evaluationDataStartTime) {
        this.evaluationDataStartTime = evaluationDataStartTime;
    }

    /**
     * <p>
     * The date on which the data in the evaluation set began being gathered. If you imported the version, this is the
     * date that the evaluation set data in the source version began being gathered.
     * </p>
     * 
     * @return The date on which the data in the evaluation set began being gathered. If you imported the version, this
     *         is the date that the evaluation set data in the source version began being gathered.
     */

    public java.util.Date getEvaluationDataStartTime() {
        return this.evaluationDataStartTime;
    }

    /**
     * <p>
     * The date on which the data in the evaluation set began being gathered. If you imported the version, this is the
     * date that the evaluation set data in the source version began being gathered.
     * </p>
     * 
     * @param evaluationDataStartTime
     *        The date on which the data in the evaluation set began being gathered. If you imported the version, this
     *        is the date that the evaluation set data in the source version began being gathered.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeModelVersionResult withEvaluationDataStartTime(java.util.Date evaluationDataStartTime) {
        setEvaluationDataStartTime(evaluationDataStartTime);
        return this;
    }

    /**
     * <p>
     * The date on which the data in the evaluation set began being gathered. If you imported the version, this is the
     * date that the evaluation set data in the source version finished being gathered.
     * </p>
     * 
     * @param evaluationDataEndTime
     *        The date on which the data in the evaluation set began being gathered. If you imported the version, this
     *        is the date that the evaluation set data in the source version finished being gathered.
     */

    public void setEvaluationDataEndTime(java.util.Date evaluationDataEndTime) {
        this.evaluationDataEndTime = evaluationDataEndTime;
    }

    /**
     * <p>
     * The date on which the data in the evaluation set began being gathered. If you imported the version, this is the
     * date that the evaluation set data in the source version finished being gathered.
     * </p>
     * 
     * @return The date on which the data in the evaluation set began being gathered. If you imported the version, this
     *         is the date that the evaluation set data in the source version finished being gathered.
     */

    public java.util.Date getEvaluationDataEndTime() {
        return this.evaluationDataEndTime;
    }

    /**
     * <p>
     * The date on which the data in the evaluation set began being gathered. If you imported the version, this is the
     * date that the evaluation set data in the source version finished being gathered.
     * </p>
     * 
     * @param evaluationDataEndTime
     *        The date on which the data in the evaluation set began being gathered. If you imported the version, this
     *        is the date that the evaluation set data in the source version finished being gathered.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeModelVersionResult withEvaluationDataEndTime(java.util.Date evaluationDataEndTime) {
        setEvaluationDataEndTime(evaluationDataEndTime);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the role that was used to train the model version.
     * </p>
     * 
     * @param roleArn
     *        The Amazon Resource Name (ARN) of the role that was used to train the model version.
     */

    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the role that was used to train the model version.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the role that was used to train the model version.
     */

    public String getRoleArn() {
        return this.roleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the role that was used to train the model version.
     * </p>
     * 
     * @param roleArn
     *        The Amazon Resource Name (ARN) of the role that was used to train the model version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeModelVersionResult withRoleArn(String roleArn) {
        setRoleArn(roleArn);
        return this;
    }

    /**
     * @param dataPreProcessingConfiguration
     */

    public void setDataPreProcessingConfiguration(DataPreProcessingConfiguration dataPreProcessingConfiguration) {
        this.dataPreProcessingConfiguration = dataPreProcessingConfiguration;
    }

    /**
     * @return
     */

    public DataPreProcessingConfiguration getDataPreProcessingConfiguration() {
        return this.dataPreProcessingConfiguration;
    }

    /**
     * @param dataPreProcessingConfiguration
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeModelVersionResult withDataPreProcessingConfiguration(DataPreProcessingConfiguration dataPreProcessingConfiguration) {
        setDataPreProcessingConfiguration(dataPreProcessingConfiguration);
        return this;
    }

    /**
     * <p>
     * The time when the training of the version began.
     * </p>
     * 
     * @param trainingExecutionStartTime
     *        The time when the training of the version began.
     */

    public void setTrainingExecutionStartTime(java.util.Date trainingExecutionStartTime) {
        this.trainingExecutionStartTime = trainingExecutionStartTime;
    }

    /**
     * <p>
     * The time when the training of the version began.
     * </p>
     * 
     * @return The time when the training of the version began.
     */

    public java.util.Date getTrainingExecutionStartTime() {
        return this.trainingExecutionStartTime;
    }

    /**
     * <p>
     * The time when the training of the version began.
     * </p>
     * 
     * @param trainingExecutionStartTime
     *        The time when the training of the version began.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeModelVersionResult withTrainingExecutionStartTime(java.util.Date trainingExecutionStartTime) {
        setTrainingExecutionStartTime(trainingExecutionStartTime);
        return this;
    }

    /**
     * <p>
     * The time when the training of the version completed.
     * </p>
     * 
     * @param trainingExecutionEndTime
     *        The time when the training of the version completed.
     */

    public void setTrainingExecutionEndTime(java.util.Date trainingExecutionEndTime) {
        this.trainingExecutionEndTime = trainingExecutionEndTime;
    }

    /**
     * <p>
     * The time when the training of the version completed.
     * </p>
     * 
     * @return The time when the training of the version completed.
     */

    public java.util.Date getTrainingExecutionEndTime() {
        return this.trainingExecutionEndTime;
    }

    /**
     * <p>
     * The time when the training of the version completed.
     * </p>
     * 
     * @param trainingExecutionEndTime
     *        The time when the training of the version completed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeModelVersionResult withTrainingExecutionEndTime(java.util.Date trainingExecutionEndTime) {
        setTrainingExecutionEndTime(trainingExecutionEndTime);
        return this;
    }

    /**
     * <p>
     * The failure message if the training of the model version failed.
     * </p>
     * 
     * @param failedReason
     *        The failure message if the training of the model version failed.
     */

    public void setFailedReason(String failedReason) {
        this.failedReason = failedReason;
    }

    /**
     * <p>
     * The failure message if the training of the model version failed.
     * </p>
     * 
     * @return The failure message if the training of the model version failed.
     */

    public String getFailedReason() {
        return this.failedReason;
    }

    /**
     * <p>
     * The failure message if the training of the model version failed.
     * </p>
     * 
     * @param failedReason
     *        The failure message if the training of the model version failed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeModelVersionResult withFailedReason(String failedReason) {
        setFailedReason(failedReason);
        return this;
    }

    /**
     * <p>
     * Shows an aggregated summary, in JSON format, of the model's performance within the evaluation time range. These
     * metrics are created when evaluating the model.
     * </p>
     * 
     * @param modelMetrics
     *        Shows an aggregated summary, in JSON format, of the model's performance within the evaluation time range.
     *        These metrics are created when evaluating the model.
     */

    public void setModelMetrics(String modelMetrics) {
        this.modelMetrics = modelMetrics;
    }

    /**
     * <p>
     * Shows an aggregated summary, in JSON format, of the model's performance within the evaluation time range. These
     * metrics are created when evaluating the model.
     * </p>
     * 
     * @return Shows an aggregated summary, in JSON format, of the model's performance within the evaluation time range.
     *         These metrics are created when evaluating the model.
     */

    public String getModelMetrics() {
        return this.modelMetrics;
    }

    /**
     * <p>
     * Shows an aggregated summary, in JSON format, of the model's performance within the evaluation time range. These
     * metrics are created when evaluating the model.
     * </p>
     * 
     * @param modelMetrics
     *        Shows an aggregated summary, in JSON format, of the model's performance within the evaluation time range.
     *        These metrics are created when evaluating the model.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeModelVersionResult withModelMetrics(String modelMetrics) {
        setModelMetrics(modelMetrics);
        return this;
    }

    /**
     * <p>
     * Indicates the last time the machine learning model version was updated.
     * </p>
     * 
     * @param lastUpdatedTime
     *        Indicates the last time the machine learning model version was updated.
     */

    public void setLastUpdatedTime(java.util.Date lastUpdatedTime) {
        this.lastUpdatedTime = lastUpdatedTime;
    }

    /**
     * <p>
     * Indicates the last time the machine learning model version was updated.
     * </p>
     * 
     * @return Indicates the last time the machine learning model version was updated.
     */

    public java.util.Date getLastUpdatedTime() {
        return this.lastUpdatedTime;
    }

    /**
     * <p>
     * Indicates the last time the machine learning model version was updated.
     * </p>
     * 
     * @param lastUpdatedTime
     *        Indicates the last time the machine learning model version was updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeModelVersionResult withLastUpdatedTime(java.util.Date lastUpdatedTime) {
        setLastUpdatedTime(lastUpdatedTime);
        return this;
    }

    /**
     * <p>
     * Indicates the time and date at which the machine learning model version was created.
     * </p>
     * 
     * @param createdAt
     *        Indicates the time and date at which the machine learning model version was created.
     */

    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * Indicates the time and date at which the machine learning model version was created.
     * </p>
     * 
     * @return Indicates the time and date at which the machine learning model version was created.
     */

    public java.util.Date getCreatedAt() {
        return this.createdAt;
    }

    /**
     * <p>
     * Indicates the time and date at which the machine learning model version was created.
     * </p>
     * 
     * @param createdAt
     *        Indicates the time and date at which the machine learning model version was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeModelVersionResult withCreatedAt(java.util.Date createdAt) {
        setCreatedAt(createdAt);
        return this;
    }

    /**
     * <p>
     * The identifier of the KMS key key used to encrypt model version data by Amazon Lookout for Equipment.
     * </p>
     * 
     * @param serverSideKmsKeyId
     *        The identifier of the KMS key key used to encrypt model version data by Amazon Lookout for Equipment.
     */

    public void setServerSideKmsKeyId(String serverSideKmsKeyId) {
        this.serverSideKmsKeyId = serverSideKmsKeyId;
    }

    /**
     * <p>
     * The identifier of the KMS key key used to encrypt model version data by Amazon Lookout for Equipment.
     * </p>
     * 
     * @return The identifier of the KMS key key used to encrypt model version data by Amazon Lookout for Equipment.
     */

    public String getServerSideKmsKeyId() {
        return this.serverSideKmsKeyId;
    }

    /**
     * <p>
     * The identifier of the KMS key key used to encrypt model version data by Amazon Lookout for Equipment.
     * </p>
     * 
     * @param serverSideKmsKeyId
     *        The identifier of the KMS key key used to encrypt model version data by Amazon Lookout for Equipment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeModelVersionResult withServerSideKmsKeyId(String serverSideKmsKeyId) {
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

    public DescribeModelVersionResult withOffCondition(String offCondition) {
        setOffCondition(offCondition);
        return this;
    }

    /**
     * <p>
     * If model version was imported, then this field is the arn of the source model version.
     * </p>
     * 
     * @param sourceModelVersionArn
     *        If model version was imported, then this field is the arn of the source model version.
     */

    public void setSourceModelVersionArn(String sourceModelVersionArn) {
        this.sourceModelVersionArn = sourceModelVersionArn;
    }

    /**
     * <p>
     * If model version was imported, then this field is the arn of the source model version.
     * </p>
     * 
     * @return If model version was imported, then this field is the arn of the source model version.
     */

    public String getSourceModelVersionArn() {
        return this.sourceModelVersionArn;
    }

    /**
     * <p>
     * If model version was imported, then this field is the arn of the source model version.
     * </p>
     * 
     * @param sourceModelVersionArn
     *        If model version was imported, then this field is the arn of the source model version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeModelVersionResult withSourceModelVersionArn(String sourceModelVersionArn) {
        setSourceModelVersionArn(sourceModelVersionArn);
        return this;
    }

    /**
     * <p>
     * The date and time when the import job began. This field appears if the model version was imported.
     * </p>
     * 
     * @param importJobStartTime
     *        The date and time when the import job began. This field appears if the model version was imported.
     */

    public void setImportJobStartTime(java.util.Date importJobStartTime) {
        this.importJobStartTime = importJobStartTime;
    }

    /**
     * <p>
     * The date and time when the import job began. This field appears if the model version was imported.
     * </p>
     * 
     * @return The date and time when the import job began. This field appears if the model version was imported.
     */

    public java.util.Date getImportJobStartTime() {
        return this.importJobStartTime;
    }

    /**
     * <p>
     * The date and time when the import job began. This field appears if the model version was imported.
     * </p>
     * 
     * @param importJobStartTime
     *        The date and time when the import job began. This field appears if the model version was imported.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeModelVersionResult withImportJobStartTime(java.util.Date importJobStartTime) {
        setImportJobStartTime(importJobStartTime);
        return this;
    }

    /**
     * <p>
     * The date and time when the import job completed. This field appears if the model version was imported.
     * </p>
     * 
     * @param importJobEndTime
     *        The date and time when the import job completed. This field appears if the model version was imported.
     */

    public void setImportJobEndTime(java.util.Date importJobEndTime) {
        this.importJobEndTime = importJobEndTime;
    }

    /**
     * <p>
     * The date and time when the import job completed. This field appears if the model version was imported.
     * </p>
     * 
     * @return The date and time when the import job completed. This field appears if the model version was imported.
     */

    public java.util.Date getImportJobEndTime() {
        return this.importJobEndTime;
    }

    /**
     * <p>
     * The date and time when the import job completed. This field appears if the model version was imported.
     * </p>
     * 
     * @param importJobEndTime
     *        The date and time when the import job completed. This field appears if the model version was imported.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeModelVersionResult withImportJobEndTime(java.util.Date importJobEndTime) {
        setImportJobEndTime(importJobEndTime);
        return this;
    }

    /**
     * <p>
     * The size in bytes of the imported data. This field appears if the model version was imported.
     * </p>
     * 
     * @param importedDataSizeInBytes
     *        The size in bytes of the imported data. This field appears if the model version was imported.
     */

    public void setImportedDataSizeInBytes(Long importedDataSizeInBytes) {
        this.importedDataSizeInBytes = importedDataSizeInBytes;
    }

    /**
     * <p>
     * The size in bytes of the imported data. This field appears if the model version was imported.
     * </p>
     * 
     * @return The size in bytes of the imported data. This field appears if the model version was imported.
     */

    public Long getImportedDataSizeInBytes() {
        return this.importedDataSizeInBytes;
    }

    /**
     * <p>
     * The size in bytes of the imported data. This field appears if the model version was imported.
     * </p>
     * 
     * @param importedDataSizeInBytes
     *        The size in bytes of the imported data. This field appears if the model version was imported.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeModelVersionResult withImportedDataSizeInBytes(Long importedDataSizeInBytes) {
        setImportedDataSizeInBytes(importedDataSizeInBytes);
        return this;
    }

    /**
     * <p>
     * If the model version was retrained, this field shows a summary of the performance of the prior model on the new
     * training range. You can use the information in this JSON-formatted object to compare the new model version and
     * the prior model version.
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
     * 
     * @param priorModelMetrics
     *        If the model version was retrained, this field shows a summary of the performance of the prior model on
     *        the new training range. You can use the information in this JSON-formatted object to compare the new model
     *        version and the prior model version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeModelVersionResult withPriorModelMetrics(String priorModelMetrics) {
        setPriorModelMetrics(priorModelMetrics);
        return this;
    }

    /**
     * <p>
     * Indicates the number of days of data used in the most recent scheduled retraining run.
     * </p>
     * 
     * @param retrainingAvailableDataInDays
     *        Indicates the number of days of data used in the most recent scheduled retraining run.
     */

    public void setRetrainingAvailableDataInDays(Integer retrainingAvailableDataInDays) {
        this.retrainingAvailableDataInDays = retrainingAvailableDataInDays;
    }

    /**
     * <p>
     * Indicates the number of days of data used in the most recent scheduled retraining run.
     * </p>
     * 
     * @return Indicates the number of days of data used in the most recent scheduled retraining run.
     */

    public Integer getRetrainingAvailableDataInDays() {
        return this.retrainingAvailableDataInDays;
    }

    /**
     * <p>
     * Indicates the number of days of data used in the most recent scheduled retraining run.
     * </p>
     * 
     * @param retrainingAvailableDataInDays
     *        Indicates the number of days of data used in the most recent scheduled retraining run.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeModelVersionResult withRetrainingAvailableDataInDays(Integer retrainingAvailableDataInDays) {
        setRetrainingAvailableDataInDays(retrainingAvailableDataInDays);
        return this;
    }

    /**
     * <p>
     * Indicates whether the model version was promoted to be the active version after retraining or if there was an
     * error with or cancellation of the retraining.
     * </p>
     * 
     * @param autoPromotionResult
     *        Indicates whether the model version was promoted to be the active version after retraining or if there was
     *        an error with or cancellation of the retraining.
     * @see AutoPromotionResult
     */

    public void setAutoPromotionResult(String autoPromotionResult) {
        this.autoPromotionResult = autoPromotionResult;
    }

    /**
     * <p>
     * Indicates whether the model version was promoted to be the active version after retraining or if there was an
     * error with or cancellation of the retraining.
     * </p>
     * 
     * @return Indicates whether the model version was promoted to be the active version after retraining or if there
     *         was an error with or cancellation of the retraining.
     * @see AutoPromotionResult
     */

    public String getAutoPromotionResult() {
        return this.autoPromotionResult;
    }

    /**
     * <p>
     * Indicates whether the model version was promoted to be the active version after retraining or if there was an
     * error with or cancellation of the retraining.
     * </p>
     * 
     * @param autoPromotionResult
     *        Indicates whether the model version was promoted to be the active version after retraining or if there was
     *        an error with or cancellation of the retraining.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AutoPromotionResult
     */

    public DescribeModelVersionResult withAutoPromotionResult(String autoPromotionResult) {
        setAutoPromotionResult(autoPromotionResult);
        return this;
    }

    /**
     * <p>
     * Indicates whether the model version was promoted to be the active version after retraining or if there was an
     * error with or cancellation of the retraining.
     * </p>
     * 
     * @param autoPromotionResult
     *        Indicates whether the model version was promoted to be the active version after retraining or if there was
     *        an error with or cancellation of the retraining.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AutoPromotionResult
     */

    public DescribeModelVersionResult withAutoPromotionResult(AutoPromotionResult autoPromotionResult) {
        this.autoPromotionResult = autoPromotionResult.toString();
        return this;
    }

    /**
     * <p>
     * Indicates the reason for the <code>AutoPromotionResult</code>. For example, a model might not be promoted if its
     * performance was worse than the active version, if there was an error during training, or if the retraining
     * scheduler was using <code>MANUAL</code> promote mode. The model will be promoted in <code>MANAGED</code> promote
     * mode if the performance is better than the previous model.
     * </p>
     * 
     * @param autoPromotionResultReason
     *        Indicates the reason for the <code>AutoPromotionResult</code>. For example, a model might not be promoted
     *        if its performance was worse than the active version, if there was an error during training, or if the
     *        retraining scheduler was using <code>MANUAL</code> promote mode. The model will be promoted in
     *        <code>MANAGED</code> promote mode if the performance is better than the previous model.
     */

    public void setAutoPromotionResultReason(String autoPromotionResultReason) {
        this.autoPromotionResultReason = autoPromotionResultReason;
    }

    /**
     * <p>
     * Indicates the reason for the <code>AutoPromotionResult</code>. For example, a model might not be promoted if its
     * performance was worse than the active version, if there was an error during training, or if the retraining
     * scheduler was using <code>MANUAL</code> promote mode. The model will be promoted in <code>MANAGED</code> promote
     * mode if the performance is better than the previous model.
     * </p>
     * 
     * @return Indicates the reason for the <code>AutoPromotionResult</code>. For example, a model might not be promoted
     *         if its performance was worse than the active version, if there was an error during training, or if the
     *         retraining scheduler was using <code>MANUAL</code> promote mode. The model will be promoted in
     *         <code>MANAGED</code> promote mode if the performance is better than the previous model.
     */

    public String getAutoPromotionResultReason() {
        return this.autoPromotionResultReason;
    }

    /**
     * <p>
     * Indicates the reason for the <code>AutoPromotionResult</code>. For example, a model might not be promoted if its
     * performance was worse than the active version, if there was an error during training, or if the retraining
     * scheduler was using <code>MANUAL</code> promote mode. The model will be promoted in <code>MANAGED</code> promote
     * mode if the performance is better than the previous model.
     * </p>
     * 
     * @param autoPromotionResultReason
     *        Indicates the reason for the <code>AutoPromotionResult</code>. For example, a model might not be promoted
     *        if its performance was worse than the active version, if there was an error during training, or if the
     *        retraining scheduler was using <code>MANUAL</code> promote mode. The model will be promoted in
     *        <code>MANAGED</code> promote mode if the performance is better than the previous model.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeModelVersionResult withAutoPromotionResultReason(String autoPromotionResultReason) {
        setAutoPromotionResultReason(autoPromotionResultReason);
        return this;
    }

    /**
     * <p>
     * The Amazon S3 location where Amazon Lookout for Equipment saves the pointwise model diagnostics for the model
     * version.
     * </p>
     * 
     * @param modelDiagnosticsOutputConfiguration
     *        The Amazon S3 location where Amazon Lookout for Equipment saves the pointwise model diagnostics for the
     *        model version.
     */

    public void setModelDiagnosticsOutputConfiguration(ModelDiagnosticsOutputConfiguration modelDiagnosticsOutputConfiguration) {
        this.modelDiagnosticsOutputConfiguration = modelDiagnosticsOutputConfiguration;
    }

    /**
     * <p>
     * The Amazon S3 location where Amazon Lookout for Equipment saves the pointwise model diagnostics for the model
     * version.
     * </p>
     * 
     * @return The Amazon S3 location where Amazon Lookout for Equipment saves the pointwise model diagnostics for the
     *         model version.
     */

    public ModelDiagnosticsOutputConfiguration getModelDiagnosticsOutputConfiguration() {
        return this.modelDiagnosticsOutputConfiguration;
    }

    /**
     * <p>
     * The Amazon S3 location where Amazon Lookout for Equipment saves the pointwise model diagnostics for the model
     * version.
     * </p>
     * 
     * @param modelDiagnosticsOutputConfiguration
     *        The Amazon S3 location where Amazon Lookout for Equipment saves the pointwise model diagnostics for the
     *        model version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeModelVersionResult withModelDiagnosticsOutputConfiguration(ModelDiagnosticsOutputConfiguration modelDiagnosticsOutputConfiguration) {
        setModelDiagnosticsOutputConfiguration(modelDiagnosticsOutputConfiguration);
        return this;
    }

    /**
     * <p>
     * The Amazon S3 output prefix for where Lookout for Equipment saves the pointwise model diagnostics for the model
     * version.
     * </p>
     * 
     * @param modelDiagnosticsResultsObject
     *        The Amazon S3 output prefix for where Lookout for Equipment saves the pointwise model diagnostics for the
     *        model version.
     */

    public void setModelDiagnosticsResultsObject(S3Object modelDiagnosticsResultsObject) {
        this.modelDiagnosticsResultsObject = modelDiagnosticsResultsObject;
    }

    /**
     * <p>
     * The Amazon S3 output prefix for where Lookout for Equipment saves the pointwise model diagnostics for the model
     * version.
     * </p>
     * 
     * @return The Amazon S3 output prefix for where Lookout for Equipment saves the pointwise model diagnostics for the
     *         model version.
     */

    public S3Object getModelDiagnosticsResultsObject() {
        return this.modelDiagnosticsResultsObject;
    }

    /**
     * <p>
     * The Amazon S3 output prefix for where Lookout for Equipment saves the pointwise model diagnostics for the model
     * version.
     * </p>
     * 
     * @param modelDiagnosticsResultsObject
     *        The Amazon S3 output prefix for where Lookout for Equipment saves the pointwise model diagnostics for the
     *        model version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeModelVersionResult withModelDiagnosticsResultsObject(S3Object modelDiagnosticsResultsObject) {
        setModelDiagnosticsResultsObject(modelDiagnosticsResultsObject);
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

    public DescribeModelVersionResult withModelQuality(String modelQuality) {
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

    public DescribeModelVersionResult withModelQuality(ModelQuality modelQuality) {
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
        if (getModelVersion() != null)
            sb.append("ModelVersion: ").append(getModelVersion()).append(",");
        if (getModelVersionArn() != null)
            sb.append("ModelVersionArn: ").append(getModelVersionArn()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getSourceType() != null)
            sb.append("SourceType: ").append(getSourceType()).append(",");
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
        if (getImportedDataSizeInBytes() != null)
            sb.append("ImportedDataSizeInBytes: ").append(getImportedDataSizeInBytes()).append(",");
        if (getPriorModelMetrics() != null)
            sb.append("PriorModelMetrics: ").append(getPriorModelMetrics()).append(",");
        if (getRetrainingAvailableDataInDays() != null)
            sb.append("RetrainingAvailableDataInDays: ").append(getRetrainingAvailableDataInDays()).append(",");
        if (getAutoPromotionResult() != null)
            sb.append("AutoPromotionResult: ").append(getAutoPromotionResult()).append(",");
        if (getAutoPromotionResultReason() != null)
            sb.append("AutoPromotionResultReason: ").append(getAutoPromotionResultReason()).append(",");
        if (getModelDiagnosticsOutputConfiguration() != null)
            sb.append("ModelDiagnosticsOutputConfiguration: ").append(getModelDiagnosticsOutputConfiguration()).append(",");
        if (getModelDiagnosticsResultsObject() != null)
            sb.append("ModelDiagnosticsResultsObject: ").append(getModelDiagnosticsResultsObject()).append(",");
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

        if (obj instanceof DescribeModelVersionResult == false)
            return false;
        DescribeModelVersionResult other = (DescribeModelVersionResult) obj;
        if (other.getModelName() == null ^ this.getModelName() == null)
            return false;
        if (other.getModelName() != null && other.getModelName().equals(this.getModelName()) == false)
            return false;
        if (other.getModelArn() == null ^ this.getModelArn() == null)
            return false;
        if (other.getModelArn() != null && other.getModelArn().equals(this.getModelArn()) == false)
            return false;
        if (other.getModelVersion() == null ^ this.getModelVersion() == null)
            return false;
        if (other.getModelVersion() != null && other.getModelVersion().equals(this.getModelVersion()) == false)
            return false;
        if (other.getModelVersionArn() == null ^ this.getModelVersionArn() == null)
            return false;
        if (other.getModelVersionArn() != null && other.getModelVersionArn().equals(this.getModelVersionArn()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getSourceType() == null ^ this.getSourceType() == null)
            return false;
        if (other.getSourceType() != null && other.getSourceType().equals(this.getSourceType()) == false)
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
        if (other.getImportedDataSizeInBytes() == null ^ this.getImportedDataSizeInBytes() == null)
            return false;
        if (other.getImportedDataSizeInBytes() != null && other.getImportedDataSizeInBytes().equals(this.getImportedDataSizeInBytes()) == false)
            return false;
        if (other.getPriorModelMetrics() == null ^ this.getPriorModelMetrics() == null)
            return false;
        if (other.getPriorModelMetrics() != null && other.getPriorModelMetrics().equals(this.getPriorModelMetrics()) == false)
            return false;
        if (other.getRetrainingAvailableDataInDays() == null ^ this.getRetrainingAvailableDataInDays() == null)
            return false;
        if (other.getRetrainingAvailableDataInDays() != null
                && other.getRetrainingAvailableDataInDays().equals(this.getRetrainingAvailableDataInDays()) == false)
            return false;
        if (other.getAutoPromotionResult() == null ^ this.getAutoPromotionResult() == null)
            return false;
        if (other.getAutoPromotionResult() != null && other.getAutoPromotionResult().equals(this.getAutoPromotionResult()) == false)
            return false;
        if (other.getAutoPromotionResultReason() == null ^ this.getAutoPromotionResultReason() == null)
            return false;
        if (other.getAutoPromotionResultReason() != null && other.getAutoPromotionResultReason().equals(this.getAutoPromotionResultReason()) == false)
            return false;
        if (other.getModelDiagnosticsOutputConfiguration() == null ^ this.getModelDiagnosticsOutputConfiguration() == null)
            return false;
        if (other.getModelDiagnosticsOutputConfiguration() != null
                && other.getModelDiagnosticsOutputConfiguration().equals(this.getModelDiagnosticsOutputConfiguration()) == false)
            return false;
        if (other.getModelDiagnosticsResultsObject() == null ^ this.getModelDiagnosticsResultsObject() == null)
            return false;
        if (other.getModelDiagnosticsResultsObject() != null
                && other.getModelDiagnosticsResultsObject().equals(this.getModelDiagnosticsResultsObject()) == false)
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
        hashCode = prime * hashCode + ((getModelVersion() == null) ? 0 : getModelVersion().hashCode());
        hashCode = prime * hashCode + ((getModelVersionArn() == null) ? 0 : getModelVersionArn().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getSourceType() == null) ? 0 : getSourceType().hashCode());
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
        hashCode = prime * hashCode + ((getImportedDataSizeInBytes() == null) ? 0 : getImportedDataSizeInBytes().hashCode());
        hashCode = prime * hashCode + ((getPriorModelMetrics() == null) ? 0 : getPriorModelMetrics().hashCode());
        hashCode = prime * hashCode + ((getRetrainingAvailableDataInDays() == null) ? 0 : getRetrainingAvailableDataInDays().hashCode());
        hashCode = prime * hashCode + ((getAutoPromotionResult() == null) ? 0 : getAutoPromotionResult().hashCode());
        hashCode = prime * hashCode + ((getAutoPromotionResultReason() == null) ? 0 : getAutoPromotionResultReason().hashCode());
        hashCode = prime * hashCode + ((getModelDiagnosticsOutputConfiguration() == null) ? 0 : getModelDiagnosticsOutputConfiguration().hashCode());
        hashCode = prime * hashCode + ((getModelDiagnosticsResultsObject() == null) ? 0 : getModelDiagnosticsResultsObject().hashCode());
        hashCode = prime * hashCode + ((getModelQuality() == null) ? 0 : getModelQuality().hashCode());
        return hashCode;
    }

    @Override
    public DescribeModelVersionResult clone() {
        try {
            return (DescribeModelVersionResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
