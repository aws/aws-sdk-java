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
package com.amazonaws.services.glue.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Records an error that occurred when attempting to stop a specified job run.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/BatchStopJobRunError" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchStopJobRunError implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the job definition used in the job run in question.
     * </p>
     */
    private String jobName;
    /**
     * <p>
     * The JobRunId of the job run in question.
     * </p>
     */
    private String jobRunId;
    /**
     * <p>
     * Specifies details about the error that was encountered.
     * </p>
     */
    private ErrorDetail errorDetail;

    /**
     * <p>
     * The name of the job definition used in the job run in question.
     * </p>
     * 
     * @param jobName
     *        The name of the job definition used in the job run in question.
     */

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    /**
     * <p>
     * The name of the job definition used in the job run in question.
     * </p>
     * 
     * @return The name of the job definition used in the job run in question.
     */

    public String getJobName() {
        return this.jobName;
    }

    /**
     * <p>
     * The name of the job definition used in the job run in question.
     * </p>
     * 
     * @param jobName
     *        The name of the job definition used in the job run in question.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchStopJobRunError withJobName(String jobName) {
        setJobName(jobName);
        return this;
    }

    /**
     * <p>
     * The JobRunId of the job run in question.
     * </p>
     * 
     * @param jobRunId
     *        The JobRunId of the job run in question.
     */

    public void setJobRunId(String jobRunId) {
        this.jobRunId = jobRunId;
    }

    /**
     * <p>
     * The JobRunId of the job run in question.
     * </p>
     * 
     * @return The JobRunId of the job run in question.
     */

    public String getJobRunId() {
        return this.jobRunId;
    }

    /**
     * <p>
     * The JobRunId of the job run in question.
     * </p>
     * 
     * @param jobRunId
     *        The JobRunId of the job run in question.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchStopJobRunError withJobRunId(String jobRunId) {
        setJobRunId(jobRunId);
        return this;
    }

    /**
     * <p>
     * Specifies details about the error that was encountered.
     * </p>
     * 
     * @param errorDetail
     *        Specifies details about the error that was encountered.
     */

    public void setErrorDetail(ErrorDetail errorDetail) {
        this.errorDetail = errorDetail;
    }

    /**
     * <p>
     * Specifies details about the error that was encountered.
     * </p>
     * 
     * @return Specifies details about the error that was encountered.
     */

    public ErrorDetail getErrorDetail() {
        return this.errorDetail;
    }

    /**
     * <p>
     * Specifies details about the error that was encountered.
     * </p>
     * 
     * @param errorDetail
     *        Specifies details about the error that was encountered.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchStopJobRunError withErrorDetail(ErrorDetail errorDetail) {
        setErrorDetail(errorDetail);
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
