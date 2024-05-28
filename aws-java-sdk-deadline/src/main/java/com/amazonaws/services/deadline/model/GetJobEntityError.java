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
package com.amazonaws.services.deadline.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The error for the job entity.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/GetJobEntityError" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetJobEntityError implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The environment details for the failed job entity.
     * </p>
     */
    private EnvironmentDetailsError environmentDetails;
    /**
     * <p>
     * The job attachment details for the failed job entity.
     * </p>
     */
    private JobAttachmentDetailsError jobAttachmentDetails;
    /**
     * <p>
     * The job details for the failed job entity.
     * </p>
     */
    private JobDetailsError jobDetails;
    /**
     * <p>
     * The step details for the failed job entity.
     * </p>
     */
    private StepDetailsError stepDetails;

    /**
     * <p>
     * The environment details for the failed job entity.
     * </p>
     * 
     * @param environmentDetails
     *        The environment details for the failed job entity.
     */

    public void setEnvironmentDetails(EnvironmentDetailsError environmentDetails) {
        this.environmentDetails = environmentDetails;
    }

    /**
     * <p>
     * The environment details for the failed job entity.
     * </p>
     * 
     * @return The environment details for the failed job entity.
     */

    public EnvironmentDetailsError getEnvironmentDetails() {
        return this.environmentDetails;
    }

    /**
     * <p>
     * The environment details for the failed job entity.
     * </p>
     * 
     * @param environmentDetails
     *        The environment details for the failed job entity.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetJobEntityError withEnvironmentDetails(EnvironmentDetailsError environmentDetails) {
        setEnvironmentDetails(environmentDetails);
        return this;
    }

    /**
     * <p>
     * The job attachment details for the failed job entity.
     * </p>
     * 
     * @param jobAttachmentDetails
     *        The job attachment details for the failed job entity.
     */

    public void setJobAttachmentDetails(JobAttachmentDetailsError jobAttachmentDetails) {
        this.jobAttachmentDetails = jobAttachmentDetails;
    }

    /**
     * <p>
     * The job attachment details for the failed job entity.
     * </p>
     * 
     * @return The job attachment details for the failed job entity.
     */

    public JobAttachmentDetailsError getJobAttachmentDetails() {
        return this.jobAttachmentDetails;
    }

    /**
     * <p>
     * The job attachment details for the failed job entity.
     * </p>
     * 
     * @param jobAttachmentDetails
     *        The job attachment details for the failed job entity.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetJobEntityError withJobAttachmentDetails(JobAttachmentDetailsError jobAttachmentDetails) {
        setJobAttachmentDetails(jobAttachmentDetails);
        return this;
    }

    /**
     * <p>
     * The job details for the failed job entity.
     * </p>
     * 
     * @param jobDetails
     *        The job details for the failed job entity.
     */

    public void setJobDetails(JobDetailsError jobDetails) {
        this.jobDetails = jobDetails;
    }

    /**
     * <p>
     * The job details for the failed job entity.
     * </p>
     * 
     * @return The job details for the failed job entity.
     */

    public JobDetailsError getJobDetails() {
        return this.jobDetails;
    }

    /**
     * <p>
     * The job details for the failed job entity.
     * </p>
     * 
     * @param jobDetails
     *        The job details for the failed job entity.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetJobEntityError withJobDetails(JobDetailsError jobDetails) {
        setJobDetails(jobDetails);
        return this;
    }

    /**
     * <p>
     * The step details for the failed job entity.
     * </p>
     * 
     * @param stepDetails
     *        The step details for the failed job entity.
     */

    public void setStepDetails(StepDetailsError stepDetails) {
        this.stepDetails = stepDetails;
    }

    /**
     * <p>
     * The step details for the failed job entity.
     * </p>
     * 
     * @return The step details for the failed job entity.
     */

    public StepDetailsError getStepDetails() {
        return this.stepDetails;
    }

    /**
     * <p>
     * The step details for the failed job entity.
     * </p>
     * 
     * @param stepDetails
     *        The step details for the failed job entity.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetJobEntityError withStepDetails(StepDetailsError stepDetails) {
        setStepDetails(stepDetails);
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
        if (getEnvironmentDetails() != null)
            sb.append("EnvironmentDetails: ").append(getEnvironmentDetails()).append(",");
        if (getJobAttachmentDetails() != null)
            sb.append("JobAttachmentDetails: ").append(getJobAttachmentDetails()).append(",");
        if (getJobDetails() != null)
            sb.append("JobDetails: ").append(getJobDetails()).append(",");
        if (getStepDetails() != null)
            sb.append("StepDetails: ").append(getStepDetails());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetJobEntityError == false)
            return false;
        GetJobEntityError other = (GetJobEntityError) obj;
        if (other.getEnvironmentDetails() == null ^ this.getEnvironmentDetails() == null)
            return false;
        if (other.getEnvironmentDetails() != null && other.getEnvironmentDetails().equals(this.getEnvironmentDetails()) == false)
            return false;
        if (other.getJobAttachmentDetails() == null ^ this.getJobAttachmentDetails() == null)
            return false;
        if (other.getJobAttachmentDetails() != null && other.getJobAttachmentDetails().equals(this.getJobAttachmentDetails()) == false)
            return false;
        if (other.getJobDetails() == null ^ this.getJobDetails() == null)
            return false;
        if (other.getJobDetails() != null && other.getJobDetails().equals(this.getJobDetails()) == false)
            return false;
        if (other.getStepDetails() == null ^ this.getStepDetails() == null)
            return false;
        if (other.getStepDetails() != null && other.getStepDetails().equals(this.getStepDetails()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEnvironmentDetails() == null) ? 0 : getEnvironmentDetails().hashCode());
        hashCode = prime * hashCode + ((getJobAttachmentDetails() == null) ? 0 : getJobAttachmentDetails().hashCode());
        hashCode = prime * hashCode + ((getJobDetails() == null) ? 0 : getJobDetails().hashCode());
        hashCode = prime * hashCode + ((getStepDetails() == null) ? 0 : getStepDetails().hashCode());
        return hashCode;
    }

    @Override
    public GetJobEntityError clone() {
        try {
            return (GetJobEntityError) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.deadline.model.transform.GetJobEntityErrorMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
