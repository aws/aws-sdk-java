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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutequipment-2020-12-15/ImportModelVersion"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ImportModelVersionResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The name for the machine learning model.
     * </p>
     */
    private String modelName;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the model being created.
     * </p>
     */
    private String modelArn;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the model version being created.
     * </p>
     */
    private String modelVersionArn;
    /**
     * <p>
     * The version of the model being created.
     * </p>
     */
    private Long modelVersion;
    /**
     * <p>
     * The status of the <code>ImportModelVersion</code> operation.
     * </p>
     */
    private String status;

    /**
     * <p>
     * The name for the machine learning model.
     * </p>
     * 
     * @param modelName
     *        The name for the machine learning model.
     */

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    /**
     * <p>
     * The name for the machine learning model.
     * </p>
     * 
     * @return The name for the machine learning model.
     */

    public String getModelName() {
        return this.modelName;
    }

    /**
     * <p>
     * The name for the machine learning model.
     * </p>
     * 
     * @param modelName
     *        The name for the machine learning model.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportModelVersionResult withModelName(String modelName) {
        setModelName(modelName);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the model being created.
     * </p>
     * 
     * @param modelArn
     *        The Amazon Resource Name (ARN) of the model being created.
     */

    public void setModelArn(String modelArn) {
        this.modelArn = modelArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the model being created.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the model being created.
     */

    public String getModelArn() {
        return this.modelArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the model being created.
     * </p>
     * 
     * @param modelArn
     *        The Amazon Resource Name (ARN) of the model being created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportModelVersionResult withModelArn(String modelArn) {
        setModelArn(modelArn);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the model version being created.
     * </p>
     * 
     * @param modelVersionArn
     *        The Amazon Resource Name (ARN) of the model version being created.
     */

    public void setModelVersionArn(String modelVersionArn) {
        this.modelVersionArn = modelVersionArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the model version being created.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the model version being created.
     */

    public String getModelVersionArn() {
        return this.modelVersionArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the model version being created.
     * </p>
     * 
     * @param modelVersionArn
     *        The Amazon Resource Name (ARN) of the model version being created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportModelVersionResult withModelVersionArn(String modelVersionArn) {
        setModelVersionArn(modelVersionArn);
        return this;
    }

    /**
     * <p>
     * The version of the model being created.
     * </p>
     * 
     * @param modelVersion
     *        The version of the model being created.
     */

    public void setModelVersion(Long modelVersion) {
        this.modelVersion = modelVersion;
    }

    /**
     * <p>
     * The version of the model being created.
     * </p>
     * 
     * @return The version of the model being created.
     */

    public Long getModelVersion() {
        return this.modelVersion;
    }

    /**
     * <p>
     * The version of the model being created.
     * </p>
     * 
     * @param modelVersion
     *        The version of the model being created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportModelVersionResult withModelVersion(Long modelVersion) {
        setModelVersion(modelVersion);
        return this;
    }

    /**
     * <p>
     * The status of the <code>ImportModelVersion</code> operation.
     * </p>
     * 
     * @param status
     *        The status of the <code>ImportModelVersion</code> operation.
     * @see ModelVersionStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the <code>ImportModelVersion</code> operation.
     * </p>
     * 
     * @return The status of the <code>ImportModelVersion</code> operation.
     * @see ModelVersionStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the <code>ImportModelVersion</code> operation.
     * </p>
     * 
     * @param status
     *        The status of the <code>ImportModelVersion</code> operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ModelVersionStatus
     */

    public ImportModelVersionResult withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the <code>ImportModelVersion</code> operation.
     * </p>
     * 
     * @param status
     *        The status of the <code>ImportModelVersion</code> operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ModelVersionStatus
     */

    public ImportModelVersionResult withStatus(ModelVersionStatus status) {
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
        if (getModelName() != null)
            sb.append("ModelName: ").append(getModelName()).append(",");
        if (getModelArn() != null)
            sb.append("ModelArn: ").append(getModelArn()).append(",");
        if (getModelVersionArn() != null)
            sb.append("ModelVersionArn: ").append(getModelVersionArn()).append(",");
        if (getModelVersion() != null)
            sb.append("ModelVersion: ").append(getModelVersion()).append(",");
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

        if (obj instanceof ImportModelVersionResult == false)
            return false;
        ImportModelVersionResult other = (ImportModelVersionResult) obj;
        if (other.getModelName() == null ^ this.getModelName() == null)
            return false;
        if (other.getModelName() != null && other.getModelName().equals(this.getModelName()) == false)
            return false;
        if (other.getModelArn() == null ^ this.getModelArn() == null)
            return false;
        if (other.getModelArn() != null && other.getModelArn().equals(this.getModelArn()) == false)
            return false;
        if (other.getModelVersionArn() == null ^ this.getModelVersionArn() == null)
            return false;
        if (other.getModelVersionArn() != null && other.getModelVersionArn().equals(this.getModelVersionArn()) == false)
            return false;
        if (other.getModelVersion() == null ^ this.getModelVersion() == null)
            return false;
        if (other.getModelVersion() != null && other.getModelVersion().equals(this.getModelVersion()) == false)
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

        hashCode = prime * hashCode + ((getModelName() == null) ? 0 : getModelName().hashCode());
        hashCode = prime * hashCode + ((getModelArn() == null) ? 0 : getModelArn().hashCode());
        hashCode = prime * hashCode + ((getModelVersionArn() == null) ? 0 : getModelVersionArn().hashCode());
        hashCode = prime * hashCode + ((getModelVersion() == null) ? 0 : getModelVersion().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return hashCode;
    }

    @Override
    public ImportModelVersionResult clone() {
        try {
            return (ImportModelVersionResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
