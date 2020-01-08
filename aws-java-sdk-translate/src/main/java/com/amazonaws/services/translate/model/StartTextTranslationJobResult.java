/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.translate.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/translate-2017-07-01/StartTextTranslationJob" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StartTextTranslationJobResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier generated for the job. To get the status of a job, use this ID with the
     * <a>DescribeTextTranslationJob</a> operation.
     * </p>
     */
    private String jobId;
    /**
     * <p>
     * The status of the job. Possible values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>SUBMITTED</code> - The job has been received and is queued for processing.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IN_PROGRESS</code> - Amazon Translate is processing the job.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>COMPLETED</code> - The job was successfully completed and the output is available.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>COMPLETED_WITH_ERRORS</code> - The job was completed with errors. The errors can be analyzed in the job's
     * output.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAILED</code> - The job did not complete. To get details, use the <a>DescribeTextTranslationJob</a>
     * operation.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>STOP_REQUESTED</code> - The user who started the job has requested that it be stopped.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>STOPPED</code> - The job has been stopped.
     * </p>
     * </li>
     * </ul>
     */
    private String jobStatus;

    /**
     * <p>
     * The identifier generated for the job. To get the status of a job, use this ID with the
     * <a>DescribeTextTranslationJob</a> operation.
     * </p>
     * 
     * @param jobId
     *        The identifier generated for the job. To get the status of a job, use this ID with the
     *        <a>DescribeTextTranslationJob</a> operation.
     */

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    /**
     * <p>
     * The identifier generated for the job. To get the status of a job, use this ID with the
     * <a>DescribeTextTranslationJob</a> operation.
     * </p>
     * 
     * @return The identifier generated for the job. To get the status of a job, use this ID with the
     *         <a>DescribeTextTranslationJob</a> operation.
     */

    public String getJobId() {
        return this.jobId;
    }

    /**
     * <p>
     * The identifier generated for the job. To get the status of a job, use this ID with the
     * <a>DescribeTextTranslationJob</a> operation.
     * </p>
     * 
     * @param jobId
     *        The identifier generated for the job. To get the status of a job, use this ID with the
     *        <a>DescribeTextTranslationJob</a> operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartTextTranslationJobResult withJobId(String jobId) {
        setJobId(jobId);
        return this;
    }

    /**
     * <p>
     * The status of the job. Possible values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>SUBMITTED</code> - The job has been received and is queued for processing.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IN_PROGRESS</code> - Amazon Translate is processing the job.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>COMPLETED</code> - The job was successfully completed and the output is available.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>COMPLETED_WITH_ERRORS</code> - The job was completed with errors. The errors can be analyzed in the job's
     * output.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAILED</code> - The job did not complete. To get details, use the <a>DescribeTextTranslationJob</a>
     * operation.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>STOP_REQUESTED</code> - The user who started the job has requested that it be stopped.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>STOPPED</code> - The job has been stopped.
     * </p>
     * </li>
     * </ul>
     * 
     * @param jobStatus
     *        The status of the job. Possible values include:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>SUBMITTED</code> - The job has been received and is queued for processing.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>IN_PROGRESS</code> - Amazon Translate is processing the job.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>COMPLETED</code> - The job was successfully completed and the output is available.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>COMPLETED_WITH_ERRORS</code> - The job was completed with errors. The errors can be analyzed in the
     *        job's output.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>FAILED</code> - The job did not complete. To get details, use the <a>DescribeTextTranslationJob</a>
     *        operation.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>STOP_REQUESTED</code> - The user who started the job has requested that it be stopped.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>STOPPED</code> - The job has been stopped.
     *        </p>
     *        </li>
     * @see JobStatus
     */

    public void setJobStatus(String jobStatus) {
        this.jobStatus = jobStatus;
    }

    /**
     * <p>
     * The status of the job. Possible values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>SUBMITTED</code> - The job has been received and is queued for processing.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IN_PROGRESS</code> - Amazon Translate is processing the job.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>COMPLETED</code> - The job was successfully completed and the output is available.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>COMPLETED_WITH_ERRORS</code> - The job was completed with errors. The errors can be analyzed in the job's
     * output.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAILED</code> - The job did not complete. To get details, use the <a>DescribeTextTranslationJob</a>
     * operation.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>STOP_REQUESTED</code> - The user who started the job has requested that it be stopped.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>STOPPED</code> - The job has been stopped.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The status of the job. Possible values include:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>SUBMITTED</code> - The job has been received and is queued for processing.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>IN_PROGRESS</code> - Amazon Translate is processing the job.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>COMPLETED</code> - The job was successfully completed and the output is available.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>COMPLETED_WITH_ERRORS</code> - The job was completed with errors. The errors can be analyzed in the
     *         job's output.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>FAILED</code> - The job did not complete. To get details, use the <a>DescribeTextTranslationJob</a>
     *         operation.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>STOP_REQUESTED</code> - The user who started the job has requested that it be stopped.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>STOPPED</code> - The job has been stopped.
     *         </p>
     *         </li>
     * @see JobStatus
     */

    public String getJobStatus() {
        return this.jobStatus;
    }

    /**
     * <p>
     * The status of the job. Possible values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>SUBMITTED</code> - The job has been received and is queued for processing.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IN_PROGRESS</code> - Amazon Translate is processing the job.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>COMPLETED</code> - The job was successfully completed and the output is available.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>COMPLETED_WITH_ERRORS</code> - The job was completed with errors. The errors can be analyzed in the job's
     * output.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAILED</code> - The job did not complete. To get details, use the <a>DescribeTextTranslationJob</a>
     * operation.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>STOP_REQUESTED</code> - The user who started the job has requested that it be stopped.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>STOPPED</code> - The job has been stopped.
     * </p>
     * </li>
     * </ul>
     * 
     * @param jobStatus
     *        The status of the job. Possible values include:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>SUBMITTED</code> - The job has been received and is queued for processing.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>IN_PROGRESS</code> - Amazon Translate is processing the job.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>COMPLETED</code> - The job was successfully completed and the output is available.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>COMPLETED_WITH_ERRORS</code> - The job was completed with errors. The errors can be analyzed in the
     *        job's output.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>FAILED</code> - The job did not complete. To get details, use the <a>DescribeTextTranslationJob</a>
     *        operation.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>STOP_REQUESTED</code> - The user who started the job has requested that it be stopped.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>STOPPED</code> - The job has been stopped.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see JobStatus
     */

    public StartTextTranslationJobResult withJobStatus(String jobStatus) {
        setJobStatus(jobStatus);
        return this;
    }

    /**
     * <p>
     * The status of the job. Possible values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>SUBMITTED</code> - The job has been received and is queued for processing.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IN_PROGRESS</code> - Amazon Translate is processing the job.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>COMPLETED</code> - The job was successfully completed and the output is available.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>COMPLETED_WITH_ERRORS</code> - The job was completed with errors. The errors can be analyzed in the job's
     * output.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAILED</code> - The job did not complete. To get details, use the <a>DescribeTextTranslationJob</a>
     * operation.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>STOP_REQUESTED</code> - The user who started the job has requested that it be stopped.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>STOPPED</code> - The job has been stopped.
     * </p>
     * </li>
     * </ul>
     * 
     * @param jobStatus
     *        The status of the job. Possible values include:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>SUBMITTED</code> - The job has been received and is queued for processing.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>IN_PROGRESS</code> - Amazon Translate is processing the job.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>COMPLETED</code> - The job was successfully completed and the output is available.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>COMPLETED_WITH_ERRORS</code> - The job was completed with errors. The errors can be analyzed in the
     *        job's output.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>FAILED</code> - The job did not complete. To get details, use the <a>DescribeTextTranslationJob</a>
     *        operation.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>STOP_REQUESTED</code> - The user who started the job has requested that it be stopped.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>STOPPED</code> - The job has been stopped.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see JobStatus
     */

    public StartTextTranslationJobResult withJobStatus(JobStatus jobStatus) {
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

        if (obj instanceof StartTextTranslationJobResult == false)
            return false;
        StartTextTranslationJobResult other = (StartTextTranslationJobResult) obj;
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
    public StartTextTranslationJobResult clone() {
        try {
            return (StartTextTranslationJobResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
