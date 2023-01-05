/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * The model version evaluated for generating prediction.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/frauddetector-2019-11-15/EvaluatedModelVersion"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EvaluatedModelVersion implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The model ID.
     * </p>
     */
    private String modelId;
    /**
     * <p>
     * The model version.
     * </p>
     */
    private String modelVersion;
    /**
     * <p>
     * The model type.
     * </p>
     * <p>
     * Valid values: <code>ONLINE_FRAUD_INSIGHTS</code> | <code>TRANSACTION_FRAUD_INSIGHTS</code>
     * </p>
     */
    private String modelType;
    /**
     * <p>
     * Evaluations generated for the model version.
     * </p>
     */
    private java.util.List<ModelVersionEvaluation> evaluations;

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

    public EvaluatedModelVersion withModelId(String modelId) {
        setModelId(modelId);
        return this;
    }

    /**
     * <p>
     * The model version.
     * </p>
     * 
     * @param modelVersion
     *        The model version.
     */

    public void setModelVersion(String modelVersion) {
        this.modelVersion = modelVersion;
    }

    /**
     * <p>
     * The model version.
     * </p>
     * 
     * @return The model version.
     */

    public String getModelVersion() {
        return this.modelVersion;
    }

    /**
     * <p>
     * The model version.
     * </p>
     * 
     * @param modelVersion
     *        The model version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EvaluatedModelVersion withModelVersion(String modelVersion) {
        setModelVersion(modelVersion);
        return this;
    }

    /**
     * <p>
     * The model type.
     * </p>
     * <p>
     * Valid values: <code>ONLINE_FRAUD_INSIGHTS</code> | <code>TRANSACTION_FRAUD_INSIGHTS</code>
     * </p>
     * 
     * @param modelType
     *        The model type. </p>
     *        <p>
     *        Valid values: <code>ONLINE_FRAUD_INSIGHTS</code> | <code>TRANSACTION_FRAUD_INSIGHTS</code>
     */

    public void setModelType(String modelType) {
        this.modelType = modelType;
    }

    /**
     * <p>
     * The model type.
     * </p>
     * <p>
     * Valid values: <code>ONLINE_FRAUD_INSIGHTS</code> | <code>TRANSACTION_FRAUD_INSIGHTS</code>
     * </p>
     * 
     * @return The model type. </p>
     *         <p>
     *         Valid values: <code>ONLINE_FRAUD_INSIGHTS</code> | <code>TRANSACTION_FRAUD_INSIGHTS</code>
     */

    public String getModelType() {
        return this.modelType;
    }

    /**
     * <p>
     * The model type.
     * </p>
     * <p>
     * Valid values: <code>ONLINE_FRAUD_INSIGHTS</code> | <code>TRANSACTION_FRAUD_INSIGHTS</code>
     * </p>
     * 
     * @param modelType
     *        The model type. </p>
     *        <p>
     *        Valid values: <code>ONLINE_FRAUD_INSIGHTS</code> | <code>TRANSACTION_FRAUD_INSIGHTS</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EvaluatedModelVersion withModelType(String modelType) {
        setModelType(modelType);
        return this;
    }

    /**
     * <p>
     * Evaluations generated for the model version.
     * </p>
     * 
     * @return Evaluations generated for the model version.
     */

    public java.util.List<ModelVersionEvaluation> getEvaluations() {
        return evaluations;
    }

    /**
     * <p>
     * Evaluations generated for the model version.
     * </p>
     * 
     * @param evaluations
     *        Evaluations generated for the model version.
     */

    public void setEvaluations(java.util.Collection<ModelVersionEvaluation> evaluations) {
        if (evaluations == null) {
            this.evaluations = null;
            return;
        }

        this.evaluations = new java.util.ArrayList<ModelVersionEvaluation>(evaluations);
    }

    /**
     * <p>
     * Evaluations generated for the model version.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEvaluations(java.util.Collection)} or {@link #withEvaluations(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param evaluations
     *        Evaluations generated for the model version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EvaluatedModelVersion withEvaluations(ModelVersionEvaluation... evaluations) {
        if (this.evaluations == null) {
            setEvaluations(new java.util.ArrayList<ModelVersionEvaluation>(evaluations.length));
        }
        for (ModelVersionEvaluation ele : evaluations) {
            this.evaluations.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Evaluations generated for the model version.
     * </p>
     * 
     * @param evaluations
     *        Evaluations generated for the model version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EvaluatedModelVersion withEvaluations(java.util.Collection<ModelVersionEvaluation> evaluations) {
        setEvaluations(evaluations);
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
        if (getModelVersion() != null)
            sb.append("ModelVersion: ").append(getModelVersion()).append(",");
        if (getModelType() != null)
            sb.append("ModelType: ").append(getModelType()).append(",");
        if (getEvaluations() != null)
            sb.append("Evaluations: ").append(getEvaluations());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EvaluatedModelVersion == false)
            return false;
        EvaluatedModelVersion other = (EvaluatedModelVersion) obj;
        if (other.getModelId() == null ^ this.getModelId() == null)
            return false;
        if (other.getModelId() != null && other.getModelId().equals(this.getModelId()) == false)
            return false;
        if (other.getModelVersion() == null ^ this.getModelVersion() == null)
            return false;
        if (other.getModelVersion() != null && other.getModelVersion().equals(this.getModelVersion()) == false)
            return false;
        if (other.getModelType() == null ^ this.getModelType() == null)
            return false;
        if (other.getModelType() != null && other.getModelType().equals(this.getModelType()) == false)
            return false;
        if (other.getEvaluations() == null ^ this.getEvaluations() == null)
            return false;
        if (other.getEvaluations() != null && other.getEvaluations().equals(this.getEvaluations()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getModelId() == null) ? 0 : getModelId().hashCode());
        hashCode = prime * hashCode + ((getModelVersion() == null) ? 0 : getModelVersion().hashCode());
        hashCode = prime * hashCode + ((getModelType() == null) ? 0 : getModelType().hashCode());
        hashCode = prime * hashCode + ((getEvaluations() == null) ? 0 : getEvaluations().hashCode());
        return hashCode;
    }

    @Override
    public EvaluatedModelVersion clone() {
        try {
            return (EvaluatedModelVersion) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.frauddetector.model.transform.EvaluatedModelVersionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
