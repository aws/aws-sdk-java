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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Provides information about the specified ML model, including dataset and model names and ARNs, as well as status.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutequipment-2020-12-15/ModelSummary" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ModelSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the ML model.
     * </p>
     */
    private String modelName;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the ML model.
     * </p>
     */
    private String modelArn;
    /**
     * <p>
     * The name of the dataset being used for the ML model.
     * </p>
     */
    private String datasetName;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the dataset used to create the model.
     * </p>
     */
    private String datasetArn;
    /**
     * <p>
     * Indicates the status of the ML model.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The time at which the specific model was created.
     * </p>
     */
    private java.util.Date createdAt;

    /**
     * <p>
     * The name of the ML model.
     * </p>
     * 
     * @param modelName
     *        The name of the ML model.
     */

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    /**
     * <p>
     * The name of the ML model.
     * </p>
     * 
     * @return The name of the ML model.
     */

    public String getModelName() {
        return this.modelName;
    }

    /**
     * <p>
     * The name of the ML model.
     * </p>
     * 
     * @param modelName
     *        The name of the ML model.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModelSummary withModelName(String modelName) {
        setModelName(modelName);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the ML model.
     * </p>
     * 
     * @param modelArn
     *        The Amazon Resource Name (ARN) of the ML model.
     */

    public void setModelArn(String modelArn) {
        this.modelArn = modelArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the ML model.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the ML model.
     */

    public String getModelArn() {
        return this.modelArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the ML model.
     * </p>
     * 
     * @param modelArn
     *        The Amazon Resource Name (ARN) of the ML model.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModelSummary withModelArn(String modelArn) {
        setModelArn(modelArn);
        return this;
    }

    /**
     * <p>
     * The name of the dataset being used for the ML model.
     * </p>
     * 
     * @param datasetName
     *        The name of the dataset being used for the ML model.
     */

    public void setDatasetName(String datasetName) {
        this.datasetName = datasetName;
    }

    /**
     * <p>
     * The name of the dataset being used for the ML model.
     * </p>
     * 
     * @return The name of the dataset being used for the ML model.
     */

    public String getDatasetName() {
        return this.datasetName;
    }

    /**
     * <p>
     * The name of the dataset being used for the ML model.
     * </p>
     * 
     * @param datasetName
     *        The name of the dataset being used for the ML model.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModelSummary withDatasetName(String datasetName) {
        setDatasetName(datasetName);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the dataset used to create the model.
     * </p>
     * 
     * @param datasetArn
     *        The Amazon Resource Name (ARN) of the dataset used to create the model.
     */

    public void setDatasetArn(String datasetArn) {
        this.datasetArn = datasetArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the dataset used to create the model.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the dataset used to create the model.
     */

    public String getDatasetArn() {
        return this.datasetArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the dataset used to create the model.
     * </p>
     * 
     * @param datasetArn
     *        The Amazon Resource Name (ARN) of the dataset used to create the model.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModelSummary withDatasetArn(String datasetArn) {
        setDatasetArn(datasetArn);
        return this;
    }

    /**
     * <p>
     * Indicates the status of the ML model.
     * </p>
     * 
     * @param status
     *        Indicates the status of the ML model.
     * @see ModelStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * Indicates the status of the ML model.
     * </p>
     * 
     * @return Indicates the status of the ML model.
     * @see ModelStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * Indicates the status of the ML model.
     * </p>
     * 
     * @param status
     *        Indicates the status of the ML model.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ModelStatus
     */

    public ModelSummary withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * Indicates the status of the ML model.
     * </p>
     * 
     * @param status
     *        Indicates the status of the ML model.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ModelStatus
     */

    public ModelSummary withStatus(ModelStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The time at which the specific model was created.
     * </p>
     * 
     * @param createdAt
     *        The time at which the specific model was created.
     */

    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * The time at which the specific model was created.
     * </p>
     * 
     * @return The time at which the specific model was created.
     */

    public java.util.Date getCreatedAt() {
        return this.createdAt;
    }

    /**
     * <p>
     * The time at which the specific model was created.
     * </p>
     * 
     * @param createdAt
     *        The time at which the specific model was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModelSummary withCreatedAt(java.util.Date createdAt) {
        setCreatedAt(createdAt);
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
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getCreatedAt() != null)
            sb.append("CreatedAt: ").append(getCreatedAt());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ModelSummary == false)
            return false;
        ModelSummary other = (ModelSummary) obj;
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
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null)
            return false;
        if (other.getCreatedAt() != null && other.getCreatedAt().equals(this.getCreatedAt()) == false)
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
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        return hashCode;
    }

    @Override
    public ModelSummary clone() {
        try {
            return (ModelSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lookoutequipment.model.transform.ModelSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
