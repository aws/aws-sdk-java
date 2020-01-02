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
package com.amazonaws.services.s3control.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/UpdateJobPriority" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateJobPriorityResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.services.s3control.S3ControlResponseMetadata> implements
        Serializable, Cloneable {

    /**
     * <p>
     * The ID for the job whose priority Amazon S3 updated.
     * </p>
     */
    private String jobId;
    /**
     * <p>
     * The new priority assigned to the specified job.
     * </p>
     */
    private Integer priority;

    /**
     * <p>
     * The ID for the job whose priority Amazon S3 updated.
     * </p>
     * 
     * @param jobId
     *        The ID for the job whose priority Amazon S3 updated.
     */

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    /**
     * <p>
     * The ID for the job whose priority Amazon S3 updated.
     * </p>
     * 
     * @return The ID for the job whose priority Amazon S3 updated.
     */

    public String getJobId() {
        return this.jobId;
    }

    /**
     * <p>
     * The ID for the job whose priority Amazon S3 updated.
     * </p>
     * 
     * @param jobId
     *        The ID for the job whose priority Amazon S3 updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateJobPriorityResult withJobId(String jobId) {
        setJobId(jobId);
        return this;
    }

    /**
     * <p>
     * The new priority assigned to the specified job.
     * </p>
     * 
     * @param priority
     *        The new priority assigned to the specified job.
     */

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    /**
     * <p>
     * The new priority assigned to the specified job.
     * </p>
     * 
     * @return The new priority assigned to the specified job.
     */

    public Integer getPriority() {
        return this.priority;
    }

    /**
     * <p>
     * The new priority assigned to the specified job.
     * </p>
     * 
     * @param priority
     *        The new priority assigned to the specified job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateJobPriorityResult withPriority(Integer priority) {
        setPriority(priority);
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
        if (getPriority() != null)
            sb.append("Priority: ").append(getPriority());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateJobPriorityResult == false)
            return false;
        UpdateJobPriorityResult other = (UpdateJobPriorityResult) obj;
        if (other.getJobId() == null ^ this.getJobId() == null)
            return false;
        if (other.getJobId() != null && other.getJobId().equals(this.getJobId()) == false)
            return false;
        if (other.getPriority() == null ^ this.getPriority() == null)
            return false;
        if (other.getPriority() != null && other.getPriority().equals(this.getPriority()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getJobId() == null) ? 0 : getJobId().hashCode());
        hashCode = prime * hashCode + ((getPriority() == null) ? 0 : getPriority().hashCode());
        return hashCode;
    }

    @Override
    public UpdateJobPriorityResult clone() {
        try {
            return (UpdateJobPriorityResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
