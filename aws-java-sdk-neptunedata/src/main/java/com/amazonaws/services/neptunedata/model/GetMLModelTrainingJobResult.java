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
package com.amazonaws.services.neptunedata.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/neptunedata-2023-08-01/GetMLModelTrainingJob" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetMLModelTrainingJobResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The status of the model training job.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The unique identifier of this model-training job.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The data processing job.
     * </p>
     */
    private MlResourceDefinition processingJob;
    /**
     * <p>
     * The HPO job.
     * </p>
     */
    private MlResourceDefinition hpoJob;
    /**
     * <p>
     * The model transform job.
     * </p>
     */
    private MlResourceDefinition modelTransformJob;
    /**
     * <p>
     * A list of the configurations of the ML models being used.
     * </p>
     */
    private java.util.List<MlConfigDefinition> mlModels;

    /**
     * <p>
     * The status of the model training job.
     * </p>
     * 
     * @param status
     *        The status of the model training job.
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the model training job.
     * </p>
     * 
     * @return The status of the model training job.
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the model training job.
     * </p>
     * 
     * @param status
     *        The status of the model training job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetMLModelTrainingJobResult withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The unique identifier of this model-training job.
     * </p>
     * 
     * @param id
     *        The unique identifier of this model-training job.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The unique identifier of this model-training job.
     * </p>
     * 
     * @return The unique identifier of this model-training job.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The unique identifier of this model-training job.
     * </p>
     * 
     * @param id
     *        The unique identifier of this model-training job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetMLModelTrainingJobResult withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The data processing job.
     * </p>
     * 
     * @param processingJob
     *        The data processing job.
     */

    public void setProcessingJob(MlResourceDefinition processingJob) {
        this.processingJob = processingJob;
    }

    /**
     * <p>
     * The data processing job.
     * </p>
     * 
     * @return The data processing job.
     */

    public MlResourceDefinition getProcessingJob() {
        return this.processingJob;
    }

    /**
     * <p>
     * The data processing job.
     * </p>
     * 
     * @param processingJob
     *        The data processing job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetMLModelTrainingJobResult withProcessingJob(MlResourceDefinition processingJob) {
        setProcessingJob(processingJob);
        return this;
    }

    /**
     * <p>
     * The HPO job.
     * </p>
     * 
     * @param hpoJob
     *        The HPO job.
     */

    public void setHpoJob(MlResourceDefinition hpoJob) {
        this.hpoJob = hpoJob;
    }

    /**
     * <p>
     * The HPO job.
     * </p>
     * 
     * @return The HPO job.
     */

    public MlResourceDefinition getHpoJob() {
        return this.hpoJob;
    }

    /**
     * <p>
     * The HPO job.
     * </p>
     * 
     * @param hpoJob
     *        The HPO job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetMLModelTrainingJobResult withHpoJob(MlResourceDefinition hpoJob) {
        setHpoJob(hpoJob);
        return this;
    }

    /**
     * <p>
     * The model transform job.
     * </p>
     * 
     * @param modelTransformJob
     *        The model transform job.
     */

    public void setModelTransformJob(MlResourceDefinition modelTransformJob) {
        this.modelTransformJob = modelTransformJob;
    }

    /**
     * <p>
     * The model transform job.
     * </p>
     * 
     * @return The model transform job.
     */

    public MlResourceDefinition getModelTransformJob() {
        return this.modelTransformJob;
    }

    /**
     * <p>
     * The model transform job.
     * </p>
     * 
     * @param modelTransformJob
     *        The model transform job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetMLModelTrainingJobResult withModelTransformJob(MlResourceDefinition modelTransformJob) {
        setModelTransformJob(modelTransformJob);
        return this;
    }

    /**
     * <p>
     * A list of the configurations of the ML models being used.
     * </p>
     * 
     * @return A list of the configurations of the ML models being used.
     */

    public java.util.List<MlConfigDefinition> getMlModels() {
        return mlModels;
    }

    /**
     * <p>
     * A list of the configurations of the ML models being used.
     * </p>
     * 
     * @param mlModels
     *        A list of the configurations of the ML models being used.
     */

    public void setMlModels(java.util.Collection<MlConfigDefinition> mlModels) {
        if (mlModels == null) {
            this.mlModels = null;
            return;
        }

        this.mlModels = new java.util.ArrayList<MlConfigDefinition>(mlModels);
    }

    /**
     * <p>
     * A list of the configurations of the ML models being used.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setMlModels(java.util.Collection)} or {@link #withMlModels(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param mlModels
     *        A list of the configurations of the ML models being used.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetMLModelTrainingJobResult withMlModels(MlConfigDefinition... mlModels) {
        if (this.mlModels == null) {
            setMlModels(new java.util.ArrayList<MlConfigDefinition>(mlModels.length));
        }
        for (MlConfigDefinition ele : mlModels) {
            this.mlModels.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of the configurations of the ML models being used.
     * </p>
     * 
     * @param mlModels
     *        A list of the configurations of the ML models being used.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetMLModelTrainingJobResult withMlModels(java.util.Collection<MlConfigDefinition> mlModels) {
        setMlModels(mlModels);
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
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getProcessingJob() != null)
            sb.append("ProcessingJob: ").append(getProcessingJob()).append(",");
        if (getHpoJob() != null)
            sb.append("HpoJob: ").append(getHpoJob()).append(",");
        if (getModelTransformJob() != null)
            sb.append("ModelTransformJob: ").append(getModelTransformJob()).append(",");
        if (getMlModels() != null)
            sb.append("MlModels: ").append(getMlModels());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetMLModelTrainingJobResult == false)
            return false;
        GetMLModelTrainingJobResult other = (GetMLModelTrainingJobResult) obj;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getProcessingJob() == null ^ this.getProcessingJob() == null)
            return false;
        if (other.getProcessingJob() != null && other.getProcessingJob().equals(this.getProcessingJob()) == false)
            return false;
        if (other.getHpoJob() == null ^ this.getHpoJob() == null)
            return false;
        if (other.getHpoJob() != null && other.getHpoJob().equals(this.getHpoJob()) == false)
            return false;
        if (other.getModelTransformJob() == null ^ this.getModelTransformJob() == null)
            return false;
        if (other.getModelTransformJob() != null && other.getModelTransformJob().equals(this.getModelTransformJob()) == false)
            return false;
        if (other.getMlModels() == null ^ this.getMlModels() == null)
            return false;
        if (other.getMlModels() != null && other.getMlModels().equals(this.getMlModels()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getProcessingJob() == null) ? 0 : getProcessingJob().hashCode());
        hashCode = prime * hashCode + ((getHpoJob() == null) ? 0 : getHpoJob().hashCode());
        hashCode = prime * hashCode + ((getModelTransformJob() == null) ? 0 : getModelTransformJob().hashCode());
        hashCode = prime * hashCode + ((getMlModels() == null) ? 0 : getMlModels().hashCode());
        return hashCode;
    }

    @Override
    public GetMLModelTrainingJobResult clone() {
        try {
            return (GetMLModelTrainingJobResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
