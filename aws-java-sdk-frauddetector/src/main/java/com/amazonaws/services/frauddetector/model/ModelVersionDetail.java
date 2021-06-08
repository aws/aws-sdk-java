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
package com.amazonaws.services.frauddetector.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The details of the model version.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/frauddetector-2019-11-15/ModelVersionDetail" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ModelVersionDetail implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The model ID.
     * </p>
     */
    private String modelId;
    /**
     * <p>
     * The model type.
     * </p>
     */
    private String modelType;
    /**
     * <p>
     * The model version number.
     * </p>
     */
    private String modelVersionNumber;
    /**
     * <p>
     * The status of the model version.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The model version training data source.
     * </p>
     */
    private String trainingDataSource;
    /**
     * <p>
     * The training data schema.
     * </p>
     */
    private TrainingDataSchema trainingDataSchema;
    /**
     * <p>
     * The event details.
     * </p>
     */
    private ExternalEventsDetail externalEventsDetail;
    /**
     * <p>
     * The training results.
     * </p>
     */
    private TrainingResult trainingResult;
    /**
     * <p>
     * The timestamp when the model was last updated.
     * </p>
     */
    private String lastUpdatedTime;
    /**
     * <p>
     * The timestamp when the model was created.
     * </p>
     */
    private String createdTime;
    /**
     * <p>
     * The model version ARN.
     * </p>
     */
    private String arn;

    /**
     * <p>
     * The model ID.
     * </p>
     * 
     * @param modelId
     *        The model ID.
     */

    public void setModelId(String modelId) {
        this.modelId = modelId;
    }

    /**
     * <p>
     * The model ID.
     * </p>
     * 
     * @return The model ID.
     */

    public String getModelId() {
        return this.modelId;
    }

    /**
     * <p>
     * The model ID.
     * </p>
     * 
     * @param modelId
     *        The model ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModelVersionDetail withModelId(String modelId) {
        setModelId(modelId);
        return this;
    }

    /**
     * <p>
     * The model type.
     * </p>
     * 
     * @param modelType
     *        The model type.
     * @see ModelTypeEnum
     */

    public void setModelType(String modelType) {
        this.modelType = modelType;
    }

    /**
     * <p>
     * The model type.
     * </p>
     * 
     * @return The model type.
     * @see ModelTypeEnum
     */

    public String getModelType() {
        return this.modelType;
    }

    /**
     * <p>
     * The model type.
     * </p>
     * 
     * @param modelType
     *        The model type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ModelTypeEnum
     */

    public ModelVersionDetail withModelType(String modelType) {
        setModelType(modelType);
        return this;
    }

    /**
     * <p>
     * The model type.
     * </p>
     * 
     * @param modelType
     *        The model type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ModelTypeEnum
     */

    public ModelVersionDetail withModelType(ModelTypeEnum modelType) {
        this.modelType = modelType.toString();
        return this;
    }

    /**
     * <p>
     * The model version number.
     * </p>
     * 
     * @param modelVersionNumber
     *        The model version number.
     */

    public void setModelVersionNumber(String modelVersionNumber) {
        this.modelVersionNumber = modelVersionNumber;
    }

    /**
     * <p>
     * The model version number.
     * </p>
     * 
     * @return The model version number.
     */

    public String getModelVersionNumber() {
        return this.modelVersionNumber;
    }

    /**
     * <p>
     * The model version number.
     * </p>
     * 
     * @param modelVersionNumber
     *        The model version number.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModelVersionDetail withModelVersionNumber(String modelVersionNumber) {
        setModelVersionNumber(modelVersionNumber);
        return this;
    }

    /**
     * <p>
     * The status of the model version.
     * </p>
     * 
     * @param status
     *        The status of the model version.
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the model version.
     * </p>
     * 
     * @return The status of the model version.
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the model version.
     * </p>
     * 
     * @param status
     *        The status of the model version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModelVersionDetail withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The model version training data source.
     * </p>
     * 
     * @param trainingDataSource
     *        The model version training data source.
     * @see TrainingDataSourceEnum
     */

    public void setTrainingDataSource(String trainingDataSource) {
        this.trainingDataSource = trainingDataSource;
    }

    /**
     * <p>
     * The model version training data source.
     * </p>
     * 
     * @return The model version training data source.
     * @see TrainingDataSourceEnum
     */

    public String getTrainingDataSource() {
        return this.trainingDataSource;
    }

    /**
     * <p>
     * The model version training data source.
     * </p>
     * 
     * @param trainingDataSource
     *        The model version training data source.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TrainingDataSourceEnum
     */

    public ModelVersionDetail withTrainingDataSource(String trainingDataSource) {
        setTrainingDataSource(trainingDataSource);
        return this;
    }

    /**
     * <p>
     * The model version training data source.
     * </p>
     * 
     * @param trainingDataSource
     *        The model version training data source.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TrainingDataSourceEnum
     */

    public ModelVersionDetail withTrainingDataSource(TrainingDataSourceEnum trainingDataSource) {
        this.trainingDataSource = trainingDataSource.toString();
        return this;
    }

    /**
     * <p>
     * The training data schema.
     * </p>
     * 
     * @param trainingDataSchema
     *        The training data schema.
     */

    public void setTrainingDataSchema(TrainingDataSchema trainingDataSchema) {
        this.trainingDataSchema = trainingDataSchema;
    }

    /**
     * <p>
     * The training data schema.
     * </p>
     * 
     * @return The training data schema.
     */

    public TrainingDataSchema getTrainingDataSchema() {
        return this.trainingDataSchema;
    }

    /**
     * <p>
     * The training data schema.
     * </p>
     * 
     * @param trainingDataSchema
     *        The training data schema.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModelVersionDetail withTrainingDataSchema(TrainingDataSchema trainingDataSchema) {
        setTrainingDataSchema(trainingDataSchema);
        return this;
    }

    /**
     * <p>
     * The event details.
     * </p>
     * 
     * @param externalEventsDetail
     *        The event details.
     */

    public void setExternalEventsDetail(ExternalEventsDetail externalEventsDetail) {
        this.externalEventsDetail = externalEventsDetail;
    }

    /**
     * <p>
     * The event details.
     * </p>
     * 
     * @return The event details.
     */

    public ExternalEventsDetail getExternalEventsDetail() {
        return this.externalEventsDetail;
    }

    /**
     * <p>
     * The event details.
     * </p>
     * 
     * @param externalEventsDetail
     *        The event details.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModelVersionDetail withExternalEventsDetail(ExternalEventsDetail externalEventsDetail) {
        setExternalEventsDetail(externalEventsDetail);
        return this;
    }

    /**
     * <p>
     * The training results.
     * </p>
     * 
     * @param trainingResult
     *        The training results.
     */

    public void setTrainingResult(TrainingResult trainingResult) {
        this.trainingResult = trainingResult;
    }

    /**
     * <p>
     * The training results.
     * </p>
     * 
     * @return The training results.
     */

    public TrainingResult getTrainingResult() {
        return this.trainingResult;
    }

    /**
     * <p>
     * The training results.
     * </p>
     * 
     * @param trainingResult
     *        The training results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModelVersionDetail withTrainingResult(TrainingResult trainingResult) {
        setTrainingResult(trainingResult);
        return this;
    }

    /**
     * <p>
     * The timestamp when the model was last updated.
     * </p>
     * 
     * @param lastUpdatedTime
     *        The timestamp when the model was last updated.
     */

    public void setLastUpdatedTime(String lastUpdatedTime) {
        this.lastUpdatedTime = lastUpdatedTime;
    }

    /**
     * <p>
     * The timestamp when the model was last updated.
     * </p>
     * 
     * @return The timestamp when the model was last updated.
     */

    public String getLastUpdatedTime() {
        return this.lastUpdatedTime;
    }

    /**
     * <p>
     * The timestamp when the model was last updated.
     * </p>
     * 
     * @param lastUpdatedTime
     *        The timestamp when the model was last updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModelVersionDetail withLastUpdatedTime(String lastUpdatedTime) {
        setLastUpdatedTime(lastUpdatedTime);
        return this;
    }

    /**
     * <p>
     * The timestamp when the model was created.
     * </p>
     * 
     * @param createdTime
     *        The timestamp when the model was created.
     */

    public void setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
    }

    /**
     * <p>
     * The timestamp when the model was created.
     * </p>
     * 
     * @return The timestamp when the model was created.
     */

    public String getCreatedTime() {
        return this.createdTime;
    }

    /**
     * <p>
     * The timestamp when the model was created.
     * </p>
     * 
     * @param createdTime
     *        The timestamp when the model was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModelVersionDetail withCreatedTime(String createdTime) {
        setCreatedTime(createdTime);
        return this;
    }

    /**
     * <p>
     * The model version ARN.
     * </p>
     * 
     * @param arn
     *        The model version ARN.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The model version ARN.
     * </p>
     * 
     * @return The model version ARN.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The model version ARN.
     * </p>
     * 
     * @param arn
     *        The model version ARN.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModelVersionDetail withArn(String arn) {
        setArn(arn);
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
        if (getModelId() != null)
            sb.append("ModelId: ").append(getModelId()).append(",");
        if (getModelType() != null)
            sb.append("ModelType: ").append(getModelType()).append(",");
        if (getModelVersionNumber() != null)
            sb.append("ModelVersionNumber: ").append(getModelVersionNumber()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getTrainingDataSource() != null)
            sb.append("TrainingDataSource: ").append(getTrainingDataSource()).append(",");
        if (getTrainingDataSchema() != null)
            sb.append("TrainingDataSchema: ").append(getTrainingDataSchema()).append(",");
        if (getExternalEventsDetail() != null)
            sb.append("ExternalEventsDetail: ").append(getExternalEventsDetail()).append(",");
        if (getTrainingResult() != null)
            sb.append("TrainingResult: ").append(getTrainingResult()).append(",");
        if (getLastUpdatedTime() != null)
            sb.append("LastUpdatedTime: ").append(getLastUpdatedTime()).append(",");
        if (getCreatedTime() != null)
            sb.append("CreatedTime: ").append(getCreatedTime()).append(",");
        if (getArn() != null)
            sb.append("Arn: ").append(getArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ModelVersionDetail == false)
            return false;
        ModelVersionDetail other = (ModelVersionDetail) obj;
        if (other.getModelId() == null ^ this.getModelId() == null)
            return false;
        if (other.getModelId() != null && other.getModelId().equals(this.getModelId()) == false)
            return false;
        if (other.getModelType() == null ^ this.getModelType() == null)
            return false;
        if (other.getModelType() != null && other.getModelType().equals(this.getModelType()) == false)
            return false;
        if (other.getModelVersionNumber() == null ^ this.getModelVersionNumber() == null)
            return false;
        if (other.getModelVersionNumber() != null && other.getModelVersionNumber().equals(this.getModelVersionNumber()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getTrainingDataSource() == null ^ this.getTrainingDataSource() == null)
            return false;
        if (other.getTrainingDataSource() != null && other.getTrainingDataSource().equals(this.getTrainingDataSource()) == false)
            return false;
        if (other.getTrainingDataSchema() == null ^ this.getTrainingDataSchema() == null)
            return false;
        if (other.getTrainingDataSchema() != null && other.getTrainingDataSchema().equals(this.getTrainingDataSchema()) == false)
            return false;
        if (other.getExternalEventsDetail() == null ^ this.getExternalEventsDetail() == null)
            return false;
        if (other.getExternalEventsDetail() != null && other.getExternalEventsDetail().equals(this.getExternalEventsDetail()) == false)
            return false;
        if (other.getTrainingResult() == null ^ this.getTrainingResult() == null)
            return false;
        if (other.getTrainingResult() != null && other.getTrainingResult().equals(this.getTrainingResult()) == false)
            return false;
        if (other.getLastUpdatedTime() == null ^ this.getLastUpdatedTime() == null)
            return false;
        if (other.getLastUpdatedTime() != null && other.getLastUpdatedTime().equals(this.getLastUpdatedTime()) == false)
            return false;
        if (other.getCreatedTime() == null ^ this.getCreatedTime() == null)
            return false;
        if (other.getCreatedTime() != null && other.getCreatedTime().equals(this.getCreatedTime()) == false)
            return false;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getModelId() == null) ? 0 : getModelId().hashCode());
        hashCode = prime * hashCode + ((getModelType() == null) ? 0 : getModelType().hashCode());
        hashCode = prime * hashCode + ((getModelVersionNumber() == null) ? 0 : getModelVersionNumber().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getTrainingDataSource() == null) ? 0 : getTrainingDataSource().hashCode());
        hashCode = prime * hashCode + ((getTrainingDataSchema() == null) ? 0 : getTrainingDataSchema().hashCode());
        hashCode = prime * hashCode + ((getExternalEventsDetail() == null) ? 0 : getExternalEventsDetail().hashCode());
        hashCode = prime * hashCode + ((getTrainingResult() == null) ? 0 : getTrainingResult().hashCode());
        hashCode = prime * hashCode + ((getLastUpdatedTime() == null) ? 0 : getLastUpdatedTime().hashCode());
        hashCode = prime * hashCode + ((getCreatedTime() == null) ? 0 : getCreatedTime().hashCode());
        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        return hashCode;
    }

    @Override
    public ModelVersionDetail clone() {
        try {
            return (ModelVersionDetail) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.frauddetector.model.transform.ModelVersionDetailMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
