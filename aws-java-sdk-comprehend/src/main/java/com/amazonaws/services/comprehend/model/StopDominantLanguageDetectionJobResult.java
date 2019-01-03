/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.comprehend.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/comprehend-2017-11-27/StopDominantLanguageDetectionJob"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StopDominantLanguageDetectionJobResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * The identifier of the dominant language detection job to stop.
     * </p>
     */
    private String jobId;
    /**
     * <p>
     * Either <code>STOP_REQUESTED</code> if the job is currently running, or <code>STOPPED</code> if the job was
     * previously stopped with the <code>StopDominantLanguageDetectionJob</code> operation.
     * </p>
     */
    private String jobStatus;

    /**
     * <p>
     * The identifier of the dominant language detection job to stop.
     * </p>
     * 
     * @param jobId
     *        The identifier of the dominant language detection job to stop.
     */

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    /**
     * <p>
     * The identifier of the dominant language detection job to stop.
     * </p>
     * 
     * @return The identifier of the dominant language detection job to stop.
     */

    public String getJobId() {
        return this.jobId;
    }

    /**
     * <p>
     * The identifier of the dominant language detection job to stop.
     * </p>
     * 
     * @param jobId
     *        The identifier of the dominant language detection job to stop.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StopDominantLanguageDetectionJobResult withJobId(String jobId) {
        setJobId(jobId);
        return this;
    }

    /**
     * <p>
     * Either <code>STOP_REQUESTED</code> if the job is currently running, or <code>STOPPED</code> if the job was
     * previously stopped with the <code>StopDominantLanguageDetectionJob</code> operation.
     * </p>
     * 
     * @param jobStatus
     *        Either <code>STOP_REQUESTED</code> if the job is currently running, or <code>STOPPED</code> if the job was
     *        previously stopped with the <code>StopDominantLanguageDetectionJob</code> operation.
     * @see JobStatus
     */

    public void setJobStatus(String jobStatus) {
        this.jobStatus = jobStatus;
    }

    /**
     * <p>
     * Either <code>STOP_REQUESTED</code> if the job is currently running, or <code>STOPPED</code> if the job was
     * previously stopped with the <code>StopDominantLanguageDetectionJob</code> operation.
     * </p>
     * 
     * @return Either <code>STOP_REQUESTED</code> if the job is currently running, or <code>STOPPED</code> if the job
     *         was previously stopped with the <code>StopDominantLanguageDetectionJob</code> operation.
     * @see JobStatus
     */

    public String getJobStatus() {
        return this.jobStatus;
    }

    /**
     * <p>
     * Either <code>STOP_REQUESTED</code> if the job is currently running, or <code>STOPPED</code> if the job was
     * previously stopped with the <code>StopDominantLanguageDetectionJob</code> operation.
     * </p>
     * 
     * @param jobStatus
     *        Either <code>STOP_REQUESTED</code> if the job is currently running, or <code>STOPPED</code> if the job was
     *        previously stopped with the <code>StopDominantLanguageDetectionJob</code> operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see JobStatus
     */

    public StopDominantLanguageDetectionJobResult withJobStatus(String jobStatus) {
        setJobStatus(jobStatus);
        return this;
    }

    /**
     * <p>
     * Either <code>STOP_REQUESTED</code> if the job is currently running, or <code>STOPPED</code> if the job was
     * previously stopped with the <code>StopDominantLanguageDetectionJob</code> operation.
     * </p>
     * 
     * @param jobStatus
     *        Either <code>STOP_REQUESTED</code> if the job is currently running, or <code>STOPPED</code> if the job was
     *        previously stopped with the <code>StopDominantLanguageDetectionJob</code> operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see JobStatus
     */

    public StopDominantLanguageDetectionJobResult withJobStatus(JobStatus jobStatus) {
        this.jobStatus = jobStatus.toString();
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
        if (getJobStatus() != null)
            sb.append("JobStatus: ").append(getJobStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StopDominantLanguageDetectionJobResult == false)
            return false;
        StopDominantLanguageDetectionJobResult other = (StopDominantLanguageDetectionJobResult) obj;
        if (other.getJobId() == null ^ this.getJobId() == null)
            return false;
        if (other.getJobId() != null && other.getJobId().equals(this.getJobId()) == false)
            return false;
        if (other.getJobStatus() == null ^ this.getJobStatus() == null)
            return false;
        if (other.getJobStatus() != null && other.getJobStatus().equals(this.getJobStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getJobId() == null) ? 0 : getJobId().hashCode());
        hashCode = prime * hashCode + ((getJobStatus() == null) ? 0 : getJobStatus().hashCode());
        return hashCode;
    }

    @Override
    public StopDominantLanguageDetectionJobResult clone() {
        try {
            return (StopDominantLanguageDetectionJobResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
