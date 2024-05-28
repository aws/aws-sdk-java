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
 * The details of a job entity identifier.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/JobEntityIdentifiersUnion" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class JobEntityIdentifiersUnion implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The environment details.
     * </p>
     */
    private EnvironmentDetailsIdentifiers environmentDetails;
    /**
     * <p>
     * The job attachment details.
     * </p>
     */
    private JobAttachmentDetailsIdentifiers jobAttachmentDetails;
    /**
     * <p>
     * The job details.
     * </p>
     */
    private JobDetailsIdentifiers jobDetails;
    /**
     * <p>
     * The step details.
     * </p>
     */
    private StepDetailsIdentifiers stepDetails;

    /**
     * <p>
     * The environment details.
     * </p>
     * 
     * @param environmentDetails
     *        The environment details.
     */

    public void setEnvironmentDetails(EnvironmentDetailsIdentifiers environmentDetails) {
        this.environmentDetails = environmentDetails;
    }

    /**
     * <p>
     * The environment details.
     * </p>
     * 
     * @return The environment details.
     */

    public EnvironmentDetailsIdentifiers getEnvironmentDetails() {
        return this.environmentDetails;
    }

    /**
     * <p>
     * The environment details.
     * </p>
     * 
     * @param environmentDetails
     *        The environment details.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobEntityIdentifiersUnion withEnvironmentDetails(EnvironmentDetailsIdentifiers environmentDetails) {
        setEnvironmentDetails(environmentDetails);
        return this;
    }

    /**
     * <p>
     * The job attachment details.
     * </p>
     * 
     * @param jobAttachmentDetails
     *        The job attachment details.
     */

    public void setJobAttachmentDetails(JobAttachmentDetailsIdentifiers jobAttachmentDetails) {
        this.jobAttachmentDetails = jobAttachmentDetails;
    }

    /**
     * <p>
     * The job attachment details.
     * </p>
     * 
     * @return The job attachment details.
     */

    public JobAttachmentDetailsIdentifiers getJobAttachmentDetails() {
        return this.jobAttachmentDetails;
    }

    /**
     * <p>
     * The job attachment details.
     * </p>
     * 
     * @param jobAttachmentDetails
     *        The job attachment details.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobEntityIdentifiersUnion withJobAttachmentDetails(JobAttachmentDetailsIdentifiers jobAttachmentDetails) {
        setJobAttachmentDetails(jobAttachmentDetails);
        return this;
    }

    /**
     * <p>
     * The job details.
     * </p>
     * 
     * @param jobDetails
     *        The job details.
     */

    public void setJobDetails(JobDetailsIdentifiers jobDetails) {
        this.jobDetails = jobDetails;
    }

    /**
     * <p>
     * The job details.
     * </p>
     * 
     * @return The job details.
     */

    public JobDetailsIdentifiers getJobDetails() {
        return this.jobDetails;
    }

    /**
     * <p>
     * The job details.
     * </p>
     * 
     * @param jobDetails
     *        The job details.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobEntityIdentifiersUnion withJobDetails(JobDetailsIdentifiers jobDetails) {
        setJobDetails(jobDetails);
        return this;
    }

    /**
     * <p>
     * The step details.
     * </p>
     * 
     * @param stepDetails
     *        The step details.
     */

    public void setStepDetails(StepDetailsIdentifiers stepDetails) {
        this.stepDetails = stepDetails;
    }

    /**
     * <p>
     * The step details.
     * </p>
     * 
     * @return The step details.
     */

    public StepDetailsIdentifiers getStepDetails() {
        return this.stepDetails;
    }

    /**
     * <p>
     * The step details.
     * </p>
     * 
     * @param stepDetails
     *        The step details.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobEntityIdentifiersUnion withStepDetails(StepDetailsIdentifiers stepDetails) {
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

        if (obj instanceof JobEntityIdentifiersUnion == false)
            return false;
        JobEntityIdentifiersUnion other = (JobEntityIdentifiersUnion) obj;
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
    public JobEntityIdentifiersUnion clone() {
        try {
            return (JobEntityIdentifiersUnion) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.deadline.model.transform.JobEntityIdentifiersUnionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
