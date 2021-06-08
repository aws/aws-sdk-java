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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/frauddetector-2019-11-15/UpdateModelVersionStatus"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateModelVersionStatusRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The model ID of the model version to update.
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
     * The model version status.
     * </p>
     */
    private String status;

    /**
     * <p>
     * The model ID of the model version to update.
     * </p>
     * 
     * @param modelId
     *        The model ID of the model version to update.
     */

    public void setModelId(String modelId) {
        this.modelId = modelId;
    }

    /**
     * <p>
     * The model ID of the model version to update.
     * </p>
     * 
     * @return The model ID of the model version to update.
     */

    public String getModelId() {
        return this.modelId;
    }

    /**
     * <p>
     * The model ID of the model version to update.
     * </p>
     * 
     * @param modelId
     *        The model ID of the model version to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateModelVersionStatusRequest withModelId(String modelId) {
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

    public UpdateModelVersionStatusRequest withModelType(String modelType) {
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

    public UpdateModelVersionStatusRequest withModelType(ModelTypeEnum modelType) {
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

    public UpdateModelVersionStatusRequest withModelVersionNumber(String modelVersionNumber) {
        setModelVersionNumber(modelVersionNumber);
        return this;
    }

    /**
     * <p>
     * The model version status.
     * </p>
     * 
     * @param status
     *        The model version status.
     * @see ModelVersionStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The model version status.
     * </p>
     * 
     * @return The model version status.
     * @see ModelVersionStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The model version status.
     * </p>
     * 
     * @param status
     *        The model version status.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ModelVersionStatus
     */

    public UpdateModelVersionStatusRequest withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The model version status.
     * </p>
     * 
     * @param status
     *        The model version status.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ModelVersionStatus
     */

    public UpdateModelVersionStatusRequest withStatus(ModelVersionStatus status) {
        this.status = status.toString();
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
            sb.append("Status: ").append(getStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateModelVersionStatusRequest == false)
            return false;
        UpdateModelVersionStatusRequest other = (UpdateModelVersionStatusRequest) obj;
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
        return hashCode;
    }

    @Override
    public UpdateModelVersionStatusRequest clone() {
        return (UpdateModelVersionStatusRequest) super.clone();
    }

}
