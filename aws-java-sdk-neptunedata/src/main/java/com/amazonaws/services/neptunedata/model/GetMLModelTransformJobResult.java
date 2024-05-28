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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/neptunedata-2023-08-01/GetMLModelTransformJob" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetMLModelTransformJobResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The status of the model-transform job.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The unique identifier of the model-transform job to be retrieved.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The base data processing job.
     * </p>
     */
    private MlResourceDefinition baseProcessingJob;
    /**
     * <p>
     * The remote model transform job.
     * </p>
     */
    private MlResourceDefinition remoteModelTransformJob;
    /**
     * <p>
     * A list of the configuration information for the models being used.
     * </p>
     */
    private java.util.List<MlConfigDefinition> models;

    /**
     * <p>
     * The status of the model-transform job.
     * </p>
     * 
     * @param status
     *        The status of the model-transform job.
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the model-transform job.
     * </p>
     * 
     * @return The status of the model-transform job.
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the model-transform job.
     * </p>
     * 
     * @param status
     *        The status of the model-transform job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetMLModelTransformJobResult withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The unique identifier of the model-transform job to be retrieved.
     * </p>
     * 
     * @param id
     *        The unique identifier of the model-transform job to be retrieved.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The unique identifier of the model-transform job to be retrieved.
     * </p>
     * 
     * @return The unique identifier of the model-transform job to be retrieved.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The unique identifier of the model-transform job to be retrieved.
     * </p>
     * 
     * @param id
     *        The unique identifier of the model-transform job to be retrieved.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetMLModelTransformJobResult withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The base data processing job.
     * </p>
     * 
     * @param baseProcessingJob
     *        The base data processing job.
     */

    public void setBaseProcessingJob(MlResourceDefinition baseProcessingJob) {
        this.baseProcessingJob = baseProcessingJob;
    }

    /**
     * <p>
     * The base data processing job.
     * </p>
     * 
     * @return The base data processing job.
     */

    public MlResourceDefinition getBaseProcessingJob() {
        return this.baseProcessingJob;
    }

    /**
     * <p>
     * The base data processing job.
     * </p>
     * 
     * @param baseProcessingJob
     *        The base data processing job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetMLModelTransformJobResult withBaseProcessingJob(MlResourceDefinition baseProcessingJob) {
        setBaseProcessingJob(baseProcessingJob);
        return this;
    }

    /**
     * <p>
     * The remote model transform job.
     * </p>
     * 
     * @param remoteModelTransformJob
     *        The remote model transform job.
     */

    public void setRemoteModelTransformJob(MlResourceDefinition remoteModelTransformJob) {
        this.remoteModelTransformJob = remoteModelTransformJob;
    }

    /**
     * <p>
     * The remote model transform job.
     * </p>
     * 
     * @return The remote model transform job.
     */

    public MlResourceDefinition getRemoteModelTransformJob() {
        return this.remoteModelTransformJob;
    }

    /**
     * <p>
     * The remote model transform job.
     * </p>
     * 
     * @param remoteModelTransformJob
     *        The remote model transform job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetMLModelTransformJobResult withRemoteModelTransformJob(MlResourceDefinition remoteModelTransformJob) {
        setRemoteModelTransformJob(remoteModelTransformJob);
        return this;
    }

    /**
     * <p>
     * A list of the configuration information for the models being used.
     * </p>
     * 
     * @return A list of the configuration information for the models being used.
     */

    public java.util.List<MlConfigDefinition> getModels() {
        return models;
    }

    /**
     * <p>
     * A list of the configuration information for the models being used.
     * </p>
     * 
     * @param models
     *        A list of the configuration information for the models being used.
     */

    public void setModels(java.util.Collection<MlConfigDefinition> models) {
        if (models == null) {
            this.models = null;
            return;
        }

        this.models = new java.util.ArrayList<MlConfigDefinition>(models);
    }

    /**
     * <p>
     * A list of the configuration information for the models being used.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setModels(java.util.Collection)} or {@link #withModels(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param models
     *        A list of the configuration information for the models being used.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetMLModelTransformJobResult withModels(MlConfigDefinition... models) {
        if (this.models == null) {
            setModels(new java.util.ArrayList<MlConfigDefinition>(models.length));
        }
        for (MlConfigDefinition ele : models) {
            this.models.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of the configuration information for the models being used.
     * </p>
     * 
     * @param models
     *        A list of the configuration information for the models being used.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetMLModelTransformJobResult withModels(java.util.Collection<MlConfigDefinition> models) {
        setModels(models);
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
        if (getBaseProcessingJob() != null)
            sb.append("BaseProcessingJob: ").append(getBaseProcessingJob()).append(",");
        if (getRemoteModelTransformJob() != null)
            sb.append("RemoteModelTransformJob: ").append(getRemoteModelTransformJob()).append(",");
        if (getModels() != null)
            sb.append("Models: ").append(getModels());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetMLModelTransformJobResult == false)
            return false;
        GetMLModelTransformJobResult other = (GetMLModelTransformJobResult) obj;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getBaseProcessingJob() == null ^ this.getBaseProcessingJob() == null)
            return false;
        if (other.getBaseProcessingJob() != null && other.getBaseProcessingJob().equals(this.getBaseProcessingJob()) == false)
            return false;
        if (other.getRemoteModelTransformJob() == null ^ this.getRemoteModelTransformJob() == null)
            return false;
        if (other.getRemoteModelTransformJob() != null && other.getRemoteModelTransformJob().equals(this.getRemoteModelTransformJob()) == false)
            return false;
        if (other.getModels() == null ^ this.getModels() == null)
            return false;
        if (other.getModels() != null && other.getModels().equals(this.getModels()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getBaseProcessingJob() == null) ? 0 : getBaseProcessingJob().hashCode());
        hashCode = prime * hashCode + ((getRemoteModelTransformJob() == null) ? 0 : getRemoteModelTransformJob().hashCode());
        hashCode = prime * hashCode + ((getModels() == null) ? 0 : getModels().hashCode());
        return hashCode;
    }

    @Override
    public GetMLModelTransformJobResult clone() {
        try {
            return (GetMLModelTransformJobResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
