/*
 * Copyright 2012-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.glue.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Details about the job run and the error that occurred while trying to submit it for stopping.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/BatchStopJobRunError" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchStopJobRunError implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the job.
     * </p>
     */
    private String jobName;
    /**
     * <p>
     * The job run Id.
     * </p>
     */
    private String jobRunId;
    /**
     * <p>
     * The details of the error that occurred.
     * </p>
     */
    private ErrorDetail errorDetail;

    /**
     * <p>
     * The name of the job.
     * </p>
     * 
     * @param jobName
     *        The name of the job.
     */

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    /**
     * <p>
     * The name of the job.
     * </p>
     * 
     * @return The name of the job.
     */

    public String getJobName() {
        return this.jobName;
    }

    /**
     * <p>
     * The name of the job.
     * </p>
     * 
     * @param jobName
     *        The name of the job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchStopJobRunError withJobName(String jobName) {
        setJobName(jobName);
        return this;
    }

    /**
     * <p>
     * The job run Id.
     * </p>
     * 
     * @param jobRunId
     *        The job run Id.
     */

    public void setJobRunId(String jobRunId) {
        this.jobRunId = jobRunId;
    }

    /**
     * <p>
     * The job run Id.
     * </p>
     * 
     * @return The job run Id.
     */

    public String getJobRunId() {
        return this.jobRunId;
    }

    /**
     * <p>
     * The job run Id.
     * </p>
     * 
     * @param jobRunId
     *        The job run Id.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchStopJobRunError withJobRunId(String jobRunId) {
        setJobRunId(jobRunId);
        return this;
    }

    /**
     * <p>
     * The details of the error that occurred.
     * </p>
     * 
     * @param errorDetail
     *        The details of the error that occurred.
     */

    public void setErrorDetail(ErrorDetail errorDetail) {
        this.errorDetail = errorDetail;
    }

    /**
     * <p>
     * The details of the error that occurred.
     * </p>
     * 
     * @return The details of the error that occurred.
     */

    public ErrorDetail getErrorDetail() {
        return this.errorDetail;
    }

    /**
     * <p>
     * The details of the error that occurred.
     * </p>
     * 
     * @param errorDetail
     *        The details of the error that occurred.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchStopJobRunError withErrorDetail(ErrorDetail errorDetail) {
        setErrorDetail(errorDetail);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getJobName() != null)
            sb.append("JobName: ").append(getJobName()).append(",");
        if (getJobRunId() != null)
            sb.append("JobRunId: ").append(getJobRunId()).append(",");
        if (getErrorDetail() != null)
            sb.append("ErrorDetail: ").append(getErrorDetail());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchStopJobRunError == false)
            return false;
        BatchStopJobRunError other = (BatchStopJobRunError) obj;
        if (other.getJobName() == null ^ this.getJobName() == null)
            return false;
        if (other.getJobName() != null && other.getJobName().equals(this.getJobName()) == false)
            return false;
        if (other.getJobRunId() == null ^ this.getJobRunId() == null)
            return false;
        if (other.getJobRunId() != null && other.getJobRunId().equals(this.getJobRunId()) == false)
            return false;
        if (other.getErrorDetail() == null ^ this.getErrorDetail() == null)
            return false;
        if (other.getErrorDetail() != null && other.getErrorDetail().equals(this.getErrorDetail()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getJobName() == null) ? 0 : getJobName().hashCode());
        hashCode = prime * hashCode + ((getJobRunId() == null) ? 0 : getJobRunId().hashCode());
        hashCode = prime * hashCode + ((getErrorDetail() == null) ? 0 : getErrorDetail().hashCode());
        return hashCode;
    }

    @Override
    public BatchStopJobRunError clone() {
        try {
            return (BatchStopJobRunError) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.glue.model.transform.BatchStopJobRunErrorMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
