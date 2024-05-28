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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/neptunedata-2023-08-01/GetMLDataProcessingJob" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetMLDataProcessingJobResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Status of the data processing job.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The unique identifier of this data-processing job.
     * </p>
     */
    private String id;
    /**
     * <p>
     * Definition of the data processing job.
     * </p>
     */
    private MlResourceDefinition processingJob;

    /**
     * <p>
     * Status of the data processing job.
     * </p>
     * 
     * @param status
     *        Status of the data processing job.
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * Status of the data processing job.
     * </p>
     * 
     * @return Status of the data processing job.
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * Status of the data processing job.
     * </p>
     * 
     * @param status
     *        Status of the data processing job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetMLDataProcessingJobResult withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The unique identifier of this data-processing job.
     * </p>
     * 
     * @param id
     *        The unique identifier of this data-processing job.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The unique identifier of this data-processing job.
     * </p>
     * 
     * @return The unique identifier of this data-processing job.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The unique identifier of this data-processing job.
     * </p>
     * 
     * @param id
     *        The unique identifier of this data-processing job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetMLDataProcessingJobResult withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * Definition of the data processing job.
     * </p>
     * 
     * @param processingJob
     *        Definition of the data processing job.
     */

    public void setProcessingJob(MlResourceDefinition processingJob) {
        this.processingJob = processingJob;
    }

    /**
     * <p>
     * Definition of the data processing job.
     * </p>
     * 
     * @return Definition of the data processing job.
     */

    public MlResourceDefinition getProcessingJob() {
        return this.processingJob;
    }

    /**
     * <p>
     * Definition of the data processing job.
     * </p>
     * 
     * @param processingJob
     *        Definition of the data processing job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetMLDataProcessingJobResult withProcessingJob(MlResourceDefinition processingJob) {
        setProcessingJob(processingJob);
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
            sb.append("ProcessingJob: ").append(getProcessingJob());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetMLDataProcessingJobResult == false)
            return false;
        GetMLDataProcessingJobResult other = (GetMLDataProcessingJobResult) obj;
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
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getProcessingJob() == null) ? 0 : getProcessingJob().hashCode());
        return hashCode;
    }

    @Override
    public GetMLDataProcessingJobResult clone() {
        try {
            return (GetMLDataProcessingJobResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
