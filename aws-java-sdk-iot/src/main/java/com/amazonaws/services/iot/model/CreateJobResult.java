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
package com.amazonaws.services.iot.model;

import java.io.Serializable;
import javax.annotation.Generated;

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateJobResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The job ARN.
     * </p>
     */
    private String jobArn;
    /**
     * <p>
     * The unique identifier you assigned to this job.
     * </p>
     */
    private String jobId;
    /**
     * <p>
     * The job description.
     * </p>
     */
    private String description;

    /**
     * <p>
     * The job ARN.
     * </p>
     * 
     * @param jobArn
     *        The job ARN.
     */

    public void setJobArn(String jobArn) {
        this.jobArn = jobArn;
    }

    /**
     * <p>
     * The job ARN.
     * </p>
     * 
     * @return The job ARN.
     */

    public String getJobArn() {
        return this.jobArn;
    }

    /**
     * <p>
     * The job ARN.
     * </p>
     * 
     * @param jobArn
     *        The job ARN.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateJobResult withJobArn(String jobArn) {
        setJobArn(jobArn);
        return this;
    }

    /**
     * <p>
     * The unique identifier you assigned to this job.
     * </p>
     * 
     * @param jobId
     *        The unique identifier you assigned to this job.
     */

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    /**
     * <p>
     * The unique identifier you assigned to this job.
     * </p>
     * 
     * @return The unique identifier you assigned to this job.
     */

    public String getJobId() {
        return this.jobId;
    }

    /**
     * <p>
     * The unique identifier you assigned to this job.
     * </p>
     * 
     * @param jobId
     *        The unique identifier you assigned to this job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateJobResult withJobId(String jobId) {
        setJobId(jobId);
        return this;
    }

    /**
     * <p>
     * The job description.
     * </p>
     * 
     * @param description
     *        The job description.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The job description.
     * </p>
     * 
     * @return The job description.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The job description.
     * </p>
     * 
     * @param description
     *        The job description.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateJobResult withDescription(String description) {
        setDescription(description);
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
        if (getJobArn() != null)
            sb.append("JobArn: ").append(getJobArn()).append(",");
        if (getJobId() != null)
            sb.append("JobId: ").append(getJobId()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateJobResult == false)
            return false;
        CreateJobResult other = (CreateJobResult) obj;
        if (other.getJobArn() == null ^ this.getJobArn() == null)
            return false;
        if (other.getJobArn() != null && other.getJobArn().equals(this.getJobArn()) == false)
            return false;
        if (other.getJobId() == null ^ this.getJobId() == null)
            return false;
        if (other.getJobId() != null && other.getJobId().equals(this.getJobId()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getJobArn() == null) ? 0 : getJobArn().hashCode());
        hashCode = prime * hashCode + ((getJobId() == null) ? 0 : getJobId().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        return hashCode;
    }

    @Override
    public CreateJobResult clone() {
        try {
            return (CreateJobResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
