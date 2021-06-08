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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutequipment-2020-12-15/CreateModel" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateModelRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name for the ML model to be created.
     * </p>
     */
    private String modelName;
    /**
     * <p>
     * The name of the dataset for the ML model being created.
     * </p>
     */
    private String datasetName;
    /**
     * <p>
     * The data schema for the ML model being created.
     * </p>
     */
    private DatasetSchema datasetSchema;
    /**
     * <p>
     * The input configuration for the labels being used for the ML model that's being created.
     * </p>
     */
    private LabelsInputConfiguration labelsInputConfiguration;
    /**
     * <p>
     * A unique identifier for the request. If you do not set the client request token, Amazon Lookout for Equipment
     * generates one.
     * </p>
     */
    private String clientToken;
    /**
     * <p>
     * Indicates the time reference in the dataset that should be used to begin the subset of training data for the ML
     * model.
     * </p>
     */
    private java.util.Date trainingDataStartTime;
    /**
     * <p>
     * Indicates the time reference in the dataset that should be used to end the subset of training data for the ML
     * model.
     * </p>
     */
    private java.util.Date trainingDataEndTime;
    /**
     * <p>
     * Indicates the time reference in the dataset that should be used to begin the subset of evaluation data for the ML
     * model.
     * </p>
     */
    private java.util.Date evaluationDataStartTime;
    /**
     * <p>
     * Indicates the time reference in the dataset that should be used to end the subset of evaluation data for the ML
     * model.
     * </p>
     */
    private java.util.Date evaluationDataEndTime;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of a role with permission to access the data source being used to create the ML
     * model.
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
     * Provides the identifier of the AWS KMS customer master key (CMK) used to encrypt model data by Amazon Lookout for
     * Equipment.
     * </p>
     */
    private String serverSideKmsKeyId;
    /**
     * <p>
     * Any tags associated with the ML model being created.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * The name for the ML model to be created.
     * </p>
     * 
     * @param modelName
     *        The name for the ML model to be created.
     */

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    /**
     * <p>
     * The name for the ML model to be created.
     * </p>
     * 
     * @return The name for the ML model to be created.
     */

    public String getModelName() {
        return this.modelName;
    }

    /**
     * <p>
     * The name for the ML model to be created.
     * </p>
     * 
     * @param modelName
     *        The name for the ML model to be created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateModelRequest withModelName(String modelName) {
        setModelName(modelName);
        return this;
    }

    /**
     * <p>
     * The name of the dataset for the ML model being created.
     * </p>
     * 
     * @param datasetName
     *        The name of the dataset for the ML model being created.
     */

    public void setDatasetName(String datasetName) {
        this.datasetName = datasetName;
    }

    /**
     * <p>
     * The name of the dataset for the ML model being created.
     * </p>
     * 
     * @return The name of the dataset for the ML model being created.
     */

    public String getDatasetName() {
        return this.datasetName;
    }

    /**
     * <p>
     * The name of the dataset for the ML model being created.
     * </p>
     * 
     * @param datasetName
     *        The name of the dataset for the ML model being created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateModelRequest withDatasetName(String datasetName) {
        setDatasetName(datasetName);
        return this;
    }

    /**
     * <p>
     * The data schema for the ML model being created.
     * </p>
     * 
     * @param datasetSchema
     *        The data schema for the ML model being created.
     */

    public void setDatasetSchema(DatasetSchema datasetSchema) {
        this.datasetSchema = datasetSchema;
    }

    /**
     * <p>
     * The data schema for the ML model being created.
     * </p>
     * 
     * @return The data schema for the ML model being created.
     */

    public DatasetSchema getDatasetSchema() {
        return this.datasetSchema;
    }

    /**
     * <p>
     * The data schema for the ML model being created.
     * </p>
     * 
     * @param datasetSchema
     *        The data schema for the ML model being created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateModelRequest withDatasetSchema(DatasetSchema datasetSchema) {
        setDatasetSchema(datasetSchema);
        return this;
    }

    /**
     * <p>
     * The input configuration for the labels being used for the ML model that's being created.
     * </p>
     * 
     * @param labelsInputConfiguration
     *        The input configuration for the labels being used for the ML model that's being created.
     */

    public void setLabelsInputConfiguration(LabelsInputConfiguration labelsInputConfiguration) {
        this.labelsInputConfiguration = labelsInputConfiguration;
    }

    /**
     * <p>
     * The input configuration for the labels being used for the ML model that's being created.
     * </p>
     * 
     * @return The input configuration for the labels being used for the ML model that's being created.
     */

    public LabelsInputConfiguration getLabelsInputConfiguration() {
        return this.labelsInputConfiguration;
    }

    /**
     * <p>
     * The input configuration for the labels being used for the ML model that's being created.
     * </p>
     * 
     * @param labelsInputConfiguration
     *        The input configuration for the labels being used for the ML model that's being created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateModelRequest withLabelsInputConfiguration(LabelsInputConfiguration labelsInputConfiguration) {
        setLabelsInputConfiguration(labelsInputConfiguration);
        return this;
    }

    /**
     * <p>
     * A unique identifier for the request. If you do not set the client request token, Amazon Lookout for Equipment
     * generates one.
     * </p>
     * 
     * @param clientToken
     *        A unique identifier for the request. If you do not set the client request token, Amazon Lookout for
     *        Equipment generates one.
     */

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * A unique identifier for the request. If you do not set the client request token, Amazon Lookout for Equipment
     * generates one.
     * </p>
     * 
     * @return A unique identifier for the request. If you do not set the client request token, Amazon Lookout for
     *         Equipment generates one.
     */

    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * <p>
     * A unique identifier for the request. If you do not set the client request token, Amazon Lookout for Equipment
     * generates one.
     * </p>
     * 
     * @param clientToken
     *        A unique identifier for the request. If you do not set the client request token, Amazon Lookout for
     *        Equipment generates one.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateModelRequest withClientToken(String clientToken) {
        setClientToken(clientToken);
        return this;
    }

    /**
     * <p>
     * Indicates the time reference in the dataset that should be used to begin the subset of training data for the ML
     * model.
     * </p>
     * 
     * @param trainingDataStartTime
     *        Indicates the time reference in the dataset that should be used to begin the subset of training data for
     *        the ML model.
     */

    public void setTrainingDataStartTime(java.util.Date trainingDataStartTime) {
        this.trainingDataStartTime = trainingDataStartTime;
    }

    /**
     * <p>
     * Indicates the time reference in the dataset that should be used to begin the subset of training data for the ML
     * model.
     * </p>
     * 
     * @return Indicates the time reference in the dataset that should be used to begin the subset of training data for
     *         the ML model.
     */

    public java.util.Date getTrainingDataStartTime() {
        return this.trainingDataStartTime;
    }

    /**
     * <p>
     * Indicates the time reference in the dataset that should be used to begin the subset of training data for the ML
     * model.
     * </p>
     * 
     * @param trainingDataStartTime
     *        Indicates the time reference in the dataset that should be used to begin the subset of training data for
     *        the ML model.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateModelRequest withTrainingDataStartTime(java.util.Date trainingDataStartTime) {
        setTrainingDataStartTime(trainingDataStartTime);
        return this;
    }

    /**
     * <p>
     * Indicates the time reference in the dataset that should be used to end the subset of training data for the ML
     * model.
     * </p>
     * 
     * @param trainingDataEndTime
     *        Indicates the time reference in the dataset that should be used to end the subset of training data for the
     *        ML model.
     */

    public void setTrainingDataEndTime(java.util.Date trainingDataEndTime) {
        this.trainingDataEndTime = trainingDataEndTime;
    }

    /**
     * <p>
     * Indicates the time reference in the dataset that should be used to end the subset of training data for the ML
     * model.
     * </p>
     * 
     * @return Indicates the time reference in the dataset that should be used to end the subset of training data for
     *         the ML model.
     */

    public java.util.Date getTrainingDataEndTime() {
        return this.trainingDataEndTime;
    }

    /**
     * <p>
     * Indicates the time reference in the dataset that should be used to end the subset of training data for the ML
     * model.
     * </p>
     * 
     * @param trainingDataEndTime
     *        Indicates the time reference in the dataset that should be used to end the subset of training data for the
     *        ML model.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateModelRequest withTrainingDataEndTime(java.util.Date trainingDataEndTime) {
        setTrainingDataEndTime(trainingDataEndTime);
        return this;
    }

    /**
     * <p>
     * Indicates the time reference in the dataset that should be used to begin the subset of evaluation data for the ML
     * model.
     * </p>
     * 
     * @param evaluationDataStartTime
     *        Indicates the time reference in the dataset that should be used to begin the subset of evaluation data for
     *        the ML model.
     */

    public void setEvaluationDataStartTime(java.util.Date evaluationDataStartTime) {
        this.evaluationDataStartTime = evaluationDataStartTime;
    }

    /**
     * <p>
     * Indicates the time reference in the dataset that should be used to begin the subset of evaluation data for the ML
     * model.
     * </p>
     * 
     * @return Indicates the time reference in the dataset that should be used to begin the subset of evaluation data
     *         for the ML model.
     */

    public java.util.Date getEvaluationDataStartTime() {
        return this.evaluationDataStartTime;
    }

    /**
     * <p>
     * Indicates the time reference in the dataset that should be used to begin the subset of evaluation data for the ML
     * model.
     * </p>
     * 
     * @param evaluationDataStartTime
     *        Indicates the time reference in the dataset that should be used to begin the subset of evaluation data for
     *        the ML model.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateModelRequest withEvaluationDataStartTime(java.util.Date evaluationDataStartTime) {
        setEvaluationDataStartTime(evaluationDataStartTime);
        return this;
    }

    /**
     * <p>
     * Indicates the time reference in the dataset that should be used to end the subset of evaluation data for the ML
     * model.
     * </p>
     * 
     * @param evaluationDataEndTime
     *        Indicates the time reference in the dataset that should be used to end the subset of evaluation data for
     *        the ML model.
     */

    public void setEvaluationDataEndTime(java.util.Date evaluationDataEndTime) {
        this.evaluationDataEndTime = evaluationDataEndTime;
    }

    /**
     * <p>
     * Indicates the time reference in the dataset that should be used to end the subset of evaluation data for the ML
     * model.
     * </p>
     * 
     * @return Indicates the time reference in the dataset that should be used to end the subset of evaluation data for
     *         the ML model.
     */

    public java.util.Date getEvaluationDataEndTime() {
        return this.evaluationDataEndTime;
    }

    /**
     * <p>
     * Indicates the time reference in the dataset that should be used to end the subset of evaluation data for the ML
     * model.
     * </p>
     * 
     * @param evaluationDataEndTime
     *        Indicates the time reference in the dataset that should be used to end the subset of evaluation data for
     *        the ML model.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateModelRequest withEvaluationDataEndTime(java.util.Date evaluationDataEndTime) {
        setEvaluationDataEndTime(evaluationDataEndTime);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of a role with permission to access the data source being used to create the ML
     * model.
     * </p>
     * 
     * @param roleArn
     *        The Amazon Resource Name (ARN) of a role with permission to access the data source being used to create
     *        the ML model.
     */

    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of a role with permission to access the data source being used to create the ML
     * model.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of a role with permission to access the data source being used to create
     *         the ML model.
     */

    public String getRoleArn() {
        return this.roleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of a role with permission to access the data source being used to create the ML
     * model.
     * </p>
     * 
     * @param roleArn
     *        The Amazon Resource Name (ARN) of a role with permission to access the data source being used to create
     *        the ML model.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateModelRequest withRoleArn(String roleArn) {
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

    public CreateModelRequest withDataPreProcessingConfiguration(DataPreProcessingConfiguration dataPreProcessingConfiguration) {
        setDataPreProcessingConfiguration(dataPreProcessingConfiguration);
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

    public CreateModelRequest withServerSideKmsKeyId(String serverSideKmsKeyId) {
        setServerSideKmsKeyId(serverSideKmsKeyId);
        return this;
    }

    /**
     * <p>
     * Any tags associated with the ML model being created.
     * </p>
     * 
     * @return Any tags associated with the ML model being created.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * Any tags associated with the ML model being created.
     * </p>
     * 
     * @param tags
     *        Any tags associated with the ML model being created.
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
     * Any tags associated with the ML model being created.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        Any tags associated with the ML model being created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateModelRequest withTags(Tag... tags) {
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
     * Any tags associated with the ML model being created.
     * </p>
     * 
     * @param tags
     *        Any tags associated with the ML model being created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateModelRequest withTags(java.util.Collection<Tag> tags) {
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
        if (getModelName() != null)
            sb.append("ModelName: ").append(getModelName()).append(",");
        if (getDatasetName() != null)
            sb.append("DatasetName: ").append(getDatasetName()).append(",");
        if (getDatasetSchema() != null)
            sb.append("DatasetSchema: ").append(getDatasetSchema()).append(",");
        if (getLabelsInputConfiguration() != null)
            sb.append("LabelsInputConfiguration: ").append(getLabelsInputConfiguration()).append(",");
        if (getClientToken() != null)
            sb.append("ClientToken: ").append(getClientToken()).append(",");
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
        if (getServerSideKmsKeyId() != null)
            sb.append("ServerSideKmsKeyId: ").append(getServerSideKmsKeyId()).append(",");
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

        if (obj instanceof CreateModelRequest == false)
            return false;
        CreateModelRequest other = (CreateModelRequest) obj;
        if (other.getModelName() == null ^ this.getModelName() == null)
            return false;
        if (other.getModelName() != null && other.getModelName().equals(this.getModelName()) == false)
            return false;
        if (other.getDatasetName() == null ^ this.getDatasetName() == null)
            return false;
        if (other.getDatasetName() != null && other.getDatasetName().equals(this.getDatasetName()) == false)
            return false;
        if (other.getDatasetSchema() == null ^ this.getDatasetSchema() == null)
            return false;
        if (other.getDatasetSchema() != null && other.getDatasetSchema().equals(this.getDatasetSchema()) == false)
            return false;
        if (other.getLabelsInputConfiguration() == null ^ this.getLabelsInputConfiguration() == null)
            return false;
        if (other.getLabelsInputConfiguration() != null && other.getLabelsInputConfiguration().equals(this.getLabelsInputConfiguration()) == false)
            return false;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false)
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
        if (other.getServerSideKmsKeyId() == null ^ this.getServerSideKmsKeyId() == null)
            return false;
        if (other.getServerSideKmsKeyId() != null && other.getServerSideKmsKeyId().equals(this.getServerSideKmsKeyId()) == false)
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

        hashCode = prime * hashCode + ((getModelName() == null) ? 0 : getModelName().hashCode());
        hashCode = prime * hashCode + ((getDatasetName() == null) ? 0 : getDatasetName().hashCode());
        hashCode = prime * hashCode + ((getDatasetSchema() == null) ? 0 : getDatasetSchema().hashCode());
        hashCode = prime * hashCode + ((getLabelsInputConfiguration() == null) ? 0 : getLabelsInputConfiguration().hashCode());
        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        hashCode = prime * hashCode + ((getTrainingDataStartTime() == null) ? 0 : getTrainingDataStartTime().hashCode());
        hashCode = prime * hashCode + ((getTrainingDataEndTime() == null) ? 0 : getTrainingDataEndTime().hashCode());
        hashCode = prime * hashCode + ((getEvaluationDataStartTime() == null) ? 0 : getEvaluationDataStartTime().hashCode());
        hashCode = prime * hashCode + ((getEvaluationDataEndTime() == null) ? 0 : getEvaluationDataEndTime().hashCode());
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        hashCode = prime * hashCode + ((getDataPreProcessingConfiguration() == null) ? 0 : getDataPreProcessingConfiguration().hashCode());
        hashCode = prime * hashCode + ((getServerSideKmsKeyId() == null) ? 0 : getServerSideKmsKeyId().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateModelRequest clone() {
        return (CreateModelRequest) super.clone();
    }

}
