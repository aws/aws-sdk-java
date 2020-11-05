/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/frauddetector-2019-11-15/GetModelVersion" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetModelVersionResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

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
     * The training data source.
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
     * The model version status.
     * </p>
     * <p>
     * Possible values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>TRAINING_IN_PROGRESS</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TRAINING_COMPLETE</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ACTIVATE_REQUESTED</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ACTIVATE_IN_PROGRESS</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ACTIVE</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>INACTIVATE_REQUESTED</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>INACTIVATE_IN_PROGRESS</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>INACTIVE</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ERROR</code>
     * </p>
     * </li>
     * </ul>
     */
    private String status;
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

    public GetModelVersionResult withModelId(String modelId) {
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

    public GetModelVersionResult withModelType(String modelType) {
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

    public GetModelVersionResult withModelType(ModelTypeEnum modelType) {
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

    public GetModelVersionResult withModelVersionNumber(String modelVersionNumber) {
        setModelVersionNumber(modelVersionNumber);
        return this;
    }

    /**
     * <p>
     * The training data source.
     * </p>
     * 
     * @param trainingDataSource
     *        The training data source.
     * @see TrainingDataSourceEnum
     */

    public void setTrainingDataSource(String trainingDataSource) {
        this.trainingDataSource = trainingDataSource;
    }

    /**
     * <p>
     * The training data source.
     * </p>
     * 
     * @return The training data source.
     * @see TrainingDataSourceEnum
     */

    public String getTrainingDataSource() {
        return this.trainingDataSource;
    }

    /**
     * <p>
     * The training data source.
     * </p>
     * 
     * @param trainingDataSource
     *        The training data source.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TrainingDataSourceEnum
     */

    public GetModelVersionResult withTrainingDataSource(String trainingDataSource) {
        setTrainingDataSource(trainingDataSource);
        return this;
    }

    /**
     * <p>
     * The training data source.
     * </p>
     * 
     * @param trainingDataSource
     *        The training data source.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TrainingDataSourceEnum
     */

    public GetModelVersionResult withTrainingDataSource(TrainingDataSourceEnum trainingDataSource) {
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

    public GetModelVersionResult withTrainingDataSchema(TrainingDataSchema trainingDataSchema) {
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

    public GetModelVersionResult withExternalEventsDetail(ExternalEventsDetail externalEventsDetail) {
        setExternalEventsDetail(externalEventsDetail);
        return this;
    }

    /**
     * <p>
     * The model version status.
     * </p>
     * <p>
     * Possible values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>TRAINING_IN_PROGRESS</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TRAINING_COMPLETE</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ACTIVATE_REQUESTED</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ACTIVATE_IN_PROGRESS</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ACTIVE</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>INACTIVATE_REQUESTED</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>INACTIVATE_IN_PROGRESS</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>INACTIVE</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ERROR</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        The model version status.</p>
     *        <p>
     *        Possible values are:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>TRAINING_IN_PROGRESS</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>TRAINING_COMPLETE</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ACTIVATE_REQUESTED</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ACTIVATE_IN_PROGRESS</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ACTIVE</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>INACTIVATE_REQUESTED</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>INACTIVATE_IN_PROGRESS</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>INACTIVE</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ERROR</code>
     *        </p>
     *        </li>
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The model version status.
     * </p>
     * <p>
     * Possible values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>TRAINING_IN_PROGRESS</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TRAINING_COMPLETE</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ACTIVATE_REQUESTED</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ACTIVATE_IN_PROGRESS</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ACTIVE</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>INACTIVATE_REQUESTED</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>INACTIVATE_IN_PROGRESS</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>INACTIVE</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ERROR</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @return The model version status.</p>
     *         <p>
     *         Possible values are:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>TRAINING_IN_PROGRESS</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>TRAINING_COMPLETE</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ACTIVATE_REQUESTED</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ACTIVATE_IN_PROGRESS</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ACTIVE</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>INACTIVATE_REQUESTED</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>INACTIVATE_IN_PROGRESS</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>INACTIVE</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ERROR</code>
     *         </p>
     *         </li>
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The model version status.
     * </p>
     * <p>
     * Possible values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>TRAINING_IN_PROGRESS</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TRAINING_COMPLETE</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ACTIVATE_REQUESTED</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ACTIVATE_IN_PROGRESS</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ACTIVE</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>INACTIVATE_REQUESTED</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>INACTIVATE_IN_PROGRESS</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>INACTIVE</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ERROR</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        The model version status.</p>
     *        <p>
     *        Possible values are:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>TRAINING_IN_PROGRESS</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>TRAINING_COMPLETE</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ACTIVATE_REQUESTED</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ACTIVATE_IN_PROGRESS</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ACTIVE</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>INACTIVATE_REQUESTED</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>INACTIVATE_IN_PROGRESS</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>INACTIVE</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ERROR</code>
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetModelVersionResult withStatus(String status) {
        setStatus(status);
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

    public GetModelVersionResult withArn(String arn) {
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
        if (getTrainingDataSource() != null)
            sb.append("TrainingDataSource: ").append(getTrainingDataSource()).append(",");
        if (getTrainingDataSchema() != null)
            sb.append("TrainingDataSchema: ").append(getTrainingDataSchema()).append(",");
        if (getExternalEventsDetail() != null)
            sb.append("ExternalEventsDetail: ").append(getExternalEventsDetail()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
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

        if (obj instanceof GetModelVersionResult == false)
            return false;
        GetModelVersionResult other = (GetModelVersionResult) obj;
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
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
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
        hashCode = prime * hashCode + ((getTrainingDataSource() == null) ? 0 : getTrainingDataSource().hashCode());
        hashCode = prime * hashCode + ((getTrainingDataSchema() == null) ? 0 : getTrainingDataSchema().hashCode());
        hashCode = prime * hashCode + ((getExternalEventsDetail() == null) ? 0 : getExternalEventsDetail().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        return hashCode;
    }

    @Override
    public GetModelVersionResult clone() {
        try {
            return (GetModelVersionResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
