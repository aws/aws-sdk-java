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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/frauddetector-2019-11-15/DeleteModelVersion" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteModelVersionRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The model ID of the model version to delete.
     * </p>
     */
    private String modelId;
    /**
     * <p>
     * The model type of the model version to delete.
     * </p>
     */
    private String modelType;
    /**
     * <p>
     * The model version number of the model version to delete.
     * </p>
     */
    private String modelVersionNumber;

    /**
     * <p>
     * The model ID of the model version to delete.
     * </p>
     * 
     * @param modelId
     *        The model ID of the model version to delete.
     */

    public void setModelId(String modelId) {
        this.modelId = modelId;
    }

    /**
     * <p>
     * The model ID of the model version to delete.
     * </p>
     * 
     * @return The model ID of the model version to delete.
     */

    public String getModelId() {
        return this.modelId;
    }

    /**
     * <p>
     * The model ID of the model version to delete.
     * </p>
     * 
     * @param modelId
     *        The model ID of the model version to delete.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteModelVersionRequest withModelId(String modelId) {
        setModelId(modelId);
        return this;
    }

    /**
     * <p>
     * The model type of the model version to delete.
     * </p>
     * 
     * @param modelType
     *        The model type of the model version to delete.
     * @see ModelTypeEnum
     */

    public void setModelType(String modelType) {
        this.modelType = modelType;
    }

    /**
     * <p>
     * The model type of the model version to delete.
     * </p>
     * 
     * @return The model type of the model version to delete.
     * @see ModelTypeEnum
     */

    public String getModelType() {
        return this.modelType;
    }

    /**
     * <p>
     * The model type of the model version to delete.
     * </p>
     * 
     * @param modelType
     *        The model type of the model version to delete.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ModelTypeEnum
     */

    public DeleteModelVersionRequest withModelType(String modelType) {
        setModelType(modelType);
        return this;
    }

    /**
     * <p>
     * The model type of the model version to delete.
     * </p>
     * 
     * @param modelType
     *        The model type of the model version to delete.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ModelTypeEnum
     */

    public DeleteModelVersionRequest withModelType(ModelTypeEnum modelType) {
        this.modelType = modelType.toString();
        return this;
    }

    /**
     * <p>
     * The model version number of the model version to delete.
     * </p>
     * 
     * @param modelVersionNumber
     *        The model version number of the model version to delete.
     */

    public void setModelVersionNumber(String modelVersionNumber) {
        this.modelVersionNumber = modelVersionNumber;
    }

    /**
     * <p>
     * The model version number of the model version to delete.
     * </p>
     * 
     * @return The model version number of the model version to delete.
     */

    public String getModelVersionNumber() {
        return this.modelVersionNumber;
    }

    /**
     * <p>
     * The model version number of the model version to delete.
     * </p>
     * 
     * @param modelVersionNumber
     *        The model version number of the model version to delete.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteModelVersionRequest withModelVersionNumber(String modelVersionNumber) {
        setModelVersionNumber(modelVersionNumber);
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
            sb.append("ModelVersionNumber: ").append(getModelVersionNumber());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteModelVersionRequest == false)
            return false;
        DeleteModelVersionRequest other = (DeleteModelVersionRequest) obj;
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
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getModelId() == null) ? 0 : getModelId().hashCode());
        hashCode = prime * hashCode + ((getModelType() == null) ? 0 : getModelType().hashCode());
        hashCode = prime * hashCode + ((getModelVersionNumber() == null) ? 0 : getModelVersionNumber().hashCode());
        return hashCode;
    }

    @Override
    public DeleteModelVersionRequest clone() {
        return (DeleteModelVersionRequest) super.clone();
    }

}
