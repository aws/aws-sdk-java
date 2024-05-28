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
package com.amazonaws.services.mainframemodernization.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An identifier for the StartBatchJob API to show that it is a restart operation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/m2-2021-04-28/RestartBatchJobIdentifier" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RestartBatchJobIdentifier implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The executionId from the StartBatchJob response when the job ran for the first time.
     * </p>
     */
    private String executionId;
    /**
     * <p>
     * The restart step information for the most recent restart operation.
     * </p>
     */
    private JobStepRestartMarker jobStepRestartMarker;

    /**
     * <p>
     * The executionId from the StartBatchJob response when the job ran for the first time.
     * </p>
     * 
     * @param executionId
     *        The executionId from the StartBatchJob response when the job ran for the first time.
     */

    public void setExecutionId(String executionId) {
        this.executionId = executionId;
    }

    /**
     * <p>
     * The executionId from the StartBatchJob response when the job ran for the first time.
     * </p>
     * 
     * @return The executionId from the StartBatchJob response when the job ran for the first time.
     */

    public String getExecutionId() {
        return this.executionId;
    }

    /**
     * <p>
     * The executionId from the StartBatchJob response when the job ran for the first time.
     * </p>
     * 
     * @param executionId
     *        The executionId from the StartBatchJob response when the job ran for the first time.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RestartBatchJobIdentifier withExecutionId(String executionId) {
        setExecutionId(executionId);
        return this;
    }

    /**
     * <p>
     * The restart step information for the most recent restart operation.
     * </p>
     * 
     * @param jobStepRestartMarker
     *        The restart step information for the most recent restart operation.
     */

    public void setJobStepRestartMarker(JobStepRestartMarker jobStepRestartMarker) {
        this.jobStepRestartMarker = jobStepRestartMarker;
    }

    /**
     * <p>
     * The restart step information for the most recent restart operation.
     * </p>
     * 
     * @return The restart step information for the most recent restart operation.
     */

    public JobStepRestartMarker getJobStepRestartMarker() {
        return this.jobStepRestartMarker;
    }

    /**
     * <p>
     * The restart step information for the most recent restart operation.
     * </p>
     * 
     * @param jobStepRestartMarker
     *        The restart step information for the most recent restart operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RestartBatchJobIdentifier withJobStepRestartMarker(JobStepRestartMarker jobStepRestartMarker) {
        setJobStepRestartMarker(jobStepRestartMarker);
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
        if (getExecutionId() != null)
            sb.append("ExecutionId: ").append(getExecutionId()).append(",");
        if (getJobStepRestartMarker() != null)
            sb.append("JobStepRestartMarker: ").append(getJobStepRestartMarker());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RestartBatchJobIdentifier == false)
            return false;
        RestartBatchJobIdentifier other = (RestartBatchJobIdentifier) obj;
        if (other.getExecutionId() == null ^ this.getExecutionId() == null)
            return false;
        if (other.getExecutionId() != null && other.getExecutionId().equals(this.getExecutionId()) == false)
            return false;
        if (other.getJobStepRestartMarker() == null ^ this.getJobStepRestartMarker() == null)
            return false;
        if (other.getJobStepRestartMarker() != null && other.getJobStepRestartMarker().equals(this.getJobStepRestartMarker()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getExecutionId() == null) ? 0 : getExecutionId().hashCode());
        hashCode = prime * hashCode + ((getJobStepRestartMarker() == null) ? 0 : getJobStepRestartMarker().hashCode());
        return hashCode;
    }

    @Override
    public RestartBatchJobIdentifier clone() {
        try {
            return (RestartBatchJobIdentifier) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mainframemodernization.model.transform.RestartBatchJobIdentifierMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
