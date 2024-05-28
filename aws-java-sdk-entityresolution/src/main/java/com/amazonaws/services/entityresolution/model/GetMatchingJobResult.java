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
package com.amazonaws.services.entityresolution.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/entityresolution-2018-05-10/GetMatchingJob" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetMatchingJobResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The time at which the job has finished.
     * </p>
     */
    private java.util.Date endTime;
    /**
     * <p>
     * An object containing an error message, if there was an error.
     * </p>
     */
    private ErrorDetails errorDetails;
    /**
     * <p>
     * The ID of the job.
     * </p>
     */
    private String jobId;
    /**
     * <p>
     * Metrics associated with the execution, specifically total records processed, unique IDs generated, and records
     * the execution skipped.
     * </p>
     */
    private JobMetrics metrics;
    /**
     * <p>
     * A list of <code>OutputSource</code> objects.
     * </p>
     */
    private java.util.List<JobOutputSource> outputSourceConfig;
    /**
     * <p>
     * The time at which the job was started.
     * </p>
     */
    private java.util.Date startTime;
    /**
     * <p>
     * The current status of the job.
     * </p>
     */
    private String status;

    /**
     * <p>
     * The time at which the job has finished.
     * </p>
     * 
     * @param endTime
     *        The time at which the job has finished.
     */

    public void setEndTime(java.util.Date endTime) {
        this.endTime = endTime;
    }

    /**
     * <p>
     * The time at which the job has finished.
     * </p>
     * 
     * @return The time at which the job has finished.
     */

    public java.util.Date getEndTime() {
        return this.endTime;
    }

    /**
     * <p>
     * The time at which the job has finished.
     * </p>
     * 
     * @param endTime
     *        The time at which the job has finished.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetMatchingJobResult withEndTime(java.util.Date endTime) {
        setEndTime(endTime);
        return this;
    }

    /**
     * <p>
     * An object containing an error message, if there was an error.
     * </p>
     * 
     * @param errorDetails
     *        An object containing an error message, if there was an error.
     */

    public void setErrorDetails(ErrorDetails errorDetails) {
        this.errorDetails = errorDetails;
    }

    /**
     * <p>
     * An object containing an error message, if there was an error.
     * </p>
     * 
     * @return An object containing an error message, if there was an error.
     */

    public ErrorDetails getErrorDetails() {
        return this.errorDetails;
    }

    /**
     * <p>
     * An object containing an error message, if there was an error.
     * </p>
     * 
     * @param errorDetails
     *        An object containing an error message, if there was an error.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetMatchingJobResult withErrorDetails(ErrorDetails errorDetails) {
        setErrorDetails(errorDetails);
        return this;
    }

    /**
     * <p>
     * The ID of the job.
     * </p>
     * 
     * @param jobId
     *        The ID of the job.
     */

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    /**
     * <p>
     * The ID of the job.
     * </p>
     * 
     * @return The ID of the job.
     */

    public String getJobId() {
        return this.jobId;
    }

    /**
     * <p>
     * The ID of the job.
     * </p>
     * 
     * @param jobId
     *        The ID of the job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetMatchingJobResult withJobId(String jobId) {
        setJobId(jobId);
        return this;
    }

    /**
     * <p>
     * Metrics associated with the execution, specifically total records processed, unique IDs generated, and records
     * the execution skipped.
     * </p>
     * 
     * @param metrics
     *        Metrics associated with the execution, specifically total records processed, unique IDs generated, and
     *        records the execution skipped.
     */

    public void setMetrics(JobMetrics metrics) {
        this.metrics = metrics;
    }

    /**
     * <p>
     * Metrics associated with the execution, specifically total records processed, unique IDs generated, and records
     * the execution skipped.
     * </p>
     * 
     * @return Metrics associated with the execution, specifically total records processed, unique IDs generated, and
     *         records the execution skipped.
     */

    public JobMetrics getMetrics() {
        return this.metrics;
    }

    /**
     * <p>
     * Metrics associated with the execution, specifically total records processed, unique IDs generated, and records
     * the execution skipped.
     * </p>
     * 
     * @param metrics
     *        Metrics associated with the execution, specifically total records processed, unique IDs generated, and
     *        records the execution skipped.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetMatchingJobResult withMetrics(JobMetrics metrics) {
        setMetrics(metrics);
        return this;
    }

    /**
     * <p>
     * A list of <code>OutputSource</code> objects.
     * </p>
     * 
     * @return A list of <code>OutputSource</code> objects.
     */

    public java.util.List<JobOutputSource> getOutputSourceConfig() {
        return outputSourceConfig;
    }

    /**
     * <p>
     * A list of <code>OutputSource</code> objects.
     * </p>
     * 
     * @param outputSourceConfig
     *        A list of <code>OutputSource</code> objects.
     */

    public void setOutputSourceConfig(java.util.Collection<JobOutputSource> outputSourceConfig) {
        if (outputSourceConfig == null) {
            this.outputSourceConfig = null;
            return;
        }

        this.outputSourceConfig = new java.util.ArrayList<JobOutputSource>(outputSourceConfig);
    }

    /**
     * <p>
     * A list of <code>OutputSource</code> objects.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setOutputSourceConfig(java.util.Collection)} or {@link #withOutputSourceConfig(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param outputSourceConfig
     *        A list of <code>OutputSource</code> objects.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetMatchingJobResult withOutputSourceConfig(JobOutputSource... outputSourceConfig) {
        if (this.outputSourceConfig == null) {
            setOutputSourceConfig(new java.util.ArrayList<JobOutputSource>(outputSourceConfig.length));
        }
        for (JobOutputSource ele : outputSourceConfig) {
            this.outputSourceConfig.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of <code>OutputSource</code> objects.
     * </p>
     * 
     * @param outputSourceConfig
     *        A list of <code>OutputSource</code> objects.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetMatchingJobResult withOutputSourceConfig(java.util.Collection<JobOutputSource> outputSourceConfig) {
        setOutputSourceConfig(outputSourceConfig);
        return this;
    }

    /**
     * <p>
     * The time at which the job was started.
     * </p>
     * 
     * @param startTime
     *        The time at which the job was started.
     */

    public void setStartTime(java.util.Date startTime) {
        this.startTime = startTime;
    }

    /**
     * <p>
     * The time at which the job was started.
     * </p>
     * 
     * @return The time at which the job was started.
     */

    public java.util.Date getStartTime() {
        return this.startTime;
    }

    /**
     * <p>
     * The time at which the job was started.
     * </p>
     * 
     * @param startTime
     *        The time at which the job was started.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetMatchingJobResult withStartTime(java.util.Date startTime) {
        setStartTime(startTime);
        return this;
    }

    /**
     * <p>
     * The current status of the job.
     * </p>
     * 
     * @param status
     *        The current status of the job.
     * @see JobStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The current status of the job.
     * </p>
     * 
     * @return The current status of the job.
     * @see JobStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The current status of the job.
     * </p>
     * 
     * @param status
     *        The current status of the job.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see JobStatus
     */

    public GetMatchingJobResult withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The current status of the job.
     * </p>
     * 
     * @param status
     *        The current status of the job.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see JobStatus
     */

    public GetMatchingJobResult withStatus(JobStatus status) {
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
        if (getEndTime() != null)
            sb.append("EndTime: ").append(getEndTime()).append(",");
        if (getErrorDetails() != null)
            sb.append("ErrorDetails: ").append(getErrorDetails()).append(",");
        if (getJobId() != null)
            sb.append("JobId: ").append(getJobId()).append(",");
        if (getMetrics() != null)
            sb.append("Metrics: ").append(getMetrics()).append(",");
        if (getOutputSourceConfig() != null)
            sb.append("OutputSourceConfig: ").append(getOutputSourceConfig()).append(",");
        if (getStartTime() != null)
            sb.append("StartTime: ").append(getStartTime()).append(",");
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

        if (obj instanceof GetMatchingJobResult == false)
            return false;
        GetMatchingJobResult other = (GetMatchingJobResult) obj;
        if (other.getEndTime() == null ^ this.getEndTime() == null)
            return false;
        if (other.getEndTime() != null && other.getEndTime().equals(this.getEndTime()) == false)
            return false;
        if (other.getErrorDetails() == null ^ this.getErrorDetails() == null)
            return false;
        if (other.getErrorDetails() != null && other.getErrorDetails().equals(this.getErrorDetails()) == false)
            return false;
        if (other.getJobId() == null ^ this.getJobId() == null)
            return false;
        if (other.getJobId() != null && other.getJobId().equals(this.getJobId()) == false)
            return false;
        if (other.getMetrics() == null ^ this.getMetrics() == null)
            return false;
        if (other.getMetrics() != null && other.getMetrics().equals(this.getMetrics()) == false)
            return false;
        if (other.getOutputSourceConfig() == null ^ this.getOutputSourceConfig() == null)
            return false;
        if (other.getOutputSourceConfig() != null && other.getOutputSourceConfig().equals(this.getOutputSourceConfig()) == false)
            return false;
        if (other.getStartTime() == null ^ this.getStartTime() == null)
            return false;
        if (other.getStartTime() != null && other.getStartTime().equals(this.getStartTime()) == false)
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

        hashCode = prime * hashCode + ((getEndTime() == null) ? 0 : getEndTime().hashCode());
        hashCode = prime * hashCode + ((getErrorDetails() == null) ? 0 : getErrorDetails().hashCode());
        hashCode = prime * hashCode + ((getJobId() == null) ? 0 : getJobId().hashCode());
        hashCode = prime * hashCode + ((getMetrics() == null) ? 0 : getMetrics().hashCode());
        hashCode = prime * hashCode + ((getOutputSourceConfig() == null) ? 0 : getOutputSourceConfig().hashCode());
        hashCode = prime * hashCode + ((getStartTime() == null) ? 0 : getStartTime().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return hashCode;
    }

    @Override
    public GetMatchingJobResult clone() {
        try {
            return (GetMatchingJobResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
