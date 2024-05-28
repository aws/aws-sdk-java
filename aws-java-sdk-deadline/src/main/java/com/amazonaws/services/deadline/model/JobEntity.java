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
 * The details of a job entity.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/JobEntity" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class JobEntity implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The job attachment details.
     * </p>
     */
    private JobAttachmentDetailsEntity jobAttachmentDetails;
    /**
     * <p>
     * The job details.
     * </p>
     */
    private JobDetailsEntity jobDetails;

    /**
     * <p>
     * The job attachment details.
     * </p>
     * 
     * @param jobAttachmentDetails
     *        The job attachment details.
     */

    public void setJobAttachmentDetails(JobAttachmentDetailsEntity jobAttachmentDetails) {
        this.jobAttachmentDetails = jobAttachmentDetails;
    }

    /**
     * <p>
     * The job attachment details.
     * </p>
     * 
     * @return The job attachment details.
     */

    public JobAttachmentDetailsEntity getJobAttachmentDetails() {
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

    public JobEntity withJobAttachmentDetails(JobAttachmentDetailsEntity jobAttachmentDetails) {
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

    public void setJobDetails(JobDetailsEntity jobDetails) {
        this.jobDetails = jobDetails;
    }

    /**
     * <p>
     * The job details.
     * </p>
     * 
     * @return The job details.
     */

    public JobDetailsEntity getJobDetails() {
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

    public JobEntity withJobDetails(JobDetailsEntity jobDetails) {
        setJobDetails(jobDetails);
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
        if (getJobAttachmentDetails() != null)
            sb.append("JobAttachmentDetails: ").append(getJobAttachmentDetails()).append(",");
        if (getJobDetails() != null)
            sb.append("JobDetails: ").append(getJobDetails());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof JobEntity == false)
            return false;
        JobEntity other = (JobEntity) obj;
        if (other.getJobAttachmentDetails() == null ^ this.getJobAttachmentDetails() == null)
            return false;
        if (other.getJobAttachmentDetails() != null && other.getJobAttachmentDetails().equals(this.getJobAttachmentDetails()) == false)
            return false;
        if (other.getJobDetails() == null ^ this.getJobDetails() == null)
            return false;
        if (other.getJobDetails() != null && other.getJobDetails().equals(this.getJobDetails()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getJobAttachmentDetails() == null) ? 0 : getJobAttachmentDetails().hashCode());
        hashCode = prime * hashCode + ((getJobDetails() == null) ? 0 : getJobDetails().hashCode());
        return hashCode;
    }

    @Override
    public JobEntity clone() {
        try {
            return (JobEntity) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.deadline.model.transform.JobEntityMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
