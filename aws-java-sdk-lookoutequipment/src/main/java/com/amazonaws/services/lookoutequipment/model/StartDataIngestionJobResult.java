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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutequipment-2020-12-15/StartDataIngestionJob"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StartDataIngestionJobResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Indicates the job ID of the data ingestion job.
     * </p>
     */
    private String jobId;
    /**
     * <p>
     * Indicates the status of the <code>StartDataIngestionJob</code> operation.
     * </p>
     */
    private String status;

    /**
     * <p>
     * Indicates the job ID of the data ingestion job.
     * </p>
     * 
     * @param jobId
     *        Indicates the job ID of the data ingestion job.
     */

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    /**
     * <p>
     * Indicates the job ID of the data ingestion job.
     * </p>
     * 
     * @return Indicates the job ID of the data ingestion job.
     */

    public String getJobId() {
        return this.jobId;
    }

    /**
     * <p>
     * Indicates the job ID of the data ingestion job.
     * </p>
     * 
     * @param jobId
     *        Indicates the job ID of the data ingestion job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartDataIngestionJobResult withJobId(String jobId) {
        setJobId(jobId);
        return this;
    }

    /**
     * <p>
     * Indicates the status of the <code>StartDataIngestionJob</code> operation.
     * </p>
     * 
     * @param status
     *        Indicates the status of the <code>StartDataIngestionJob</code> operation.
     * @see IngestionJobStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * Indicates the status of the <code>StartDataIngestionJob</code> operation.
     * </p>
     * 
     * @return Indicates the status of the <code>StartDataIngestionJob</code> operation.
     * @see IngestionJobStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * Indicates the status of the <code>StartDataIngestionJob</code> operation.
     * </p>
     * 
     * @param status
     *        Indicates the status of the <code>StartDataIngestionJob</code> operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see IngestionJobStatus
     */

    public StartDataIngestionJobResult withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * Indicates the status of the <code>StartDataIngestionJob</code> operation.
     * </p>
     * 
     * @param status
     *        Indicates the status of the <code>StartDataIngestionJob</code> operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see IngestionJobStatus
     */

    public StartDataIngestionJobResult withStatus(IngestionJobStatus status) {
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
        if (getJobId() != null)
            sb.append("JobId: ").append(getJobId()).append(",");
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

        if (obj instanceof StartDataIngestionJobResult == false)
            return false;
        StartDataIngestionJobResult other = (StartDataIngestionJobResult) obj;
        if (other.getJobId() == null ^ this.getJobId() == null)
            return false;
        if (other.getJobId() != null && other.getJobId().equals(this.getJobId()) == false)
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

        hashCode = prime * hashCode + ((getJobId() == null) ? 0 : getJobId().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return hashCode;
    }

    @Override
    public StartDataIngestionJobResult clone() {
        try {
            return (StartDataIngestionJobResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
