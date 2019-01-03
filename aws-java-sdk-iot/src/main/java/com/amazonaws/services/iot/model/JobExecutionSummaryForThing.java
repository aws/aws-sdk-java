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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The job execution summary for a thing.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class JobExecutionSummaryForThing implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The unique identifier you assigned to this job when it was created.
     * </p>
     */
    private String jobId;
    /**
     * <p>
     * Contains a subset of information about a job execution.
     * </p>
     */
    private JobExecutionSummary jobExecutionSummary;

    /**
     * <p>
     * The unique identifier you assigned to this job when it was created.
     * </p>
     * 
     * @param jobId
     *        The unique identifier you assigned to this job when it was created.
     */

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    /**
     * <p>
     * The unique identifier you assigned to this job when it was created.
     * </p>
     * 
     * @return The unique identifier you assigned to this job when it was created.
     */

    public String getJobId() {
        return this.jobId;
    }

    /**
     * <p>
     * The unique identifier you assigned to this job when it was created.
     * </p>
     * 
     * @param jobId
     *        The unique identifier you assigned to this job when it was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobExecutionSummaryForThing withJobId(String jobId) {
        setJobId(jobId);
        return this;
    }

    /**
     * <p>
     * Contains a subset of information about a job execution.
     * </p>
     * 
     * @param jobExecutionSummary
     *        Contains a subset of information about a job execution.
     */

    public void setJobExecutionSummary(JobExecutionSummary jobExecutionSummary) {
        this.jobExecutionSummary = jobExecutionSummary;
    }

    /**
     * <p>
     * Contains a subset of information about a job execution.
     * </p>
     * 
     * @return Contains a subset of information about a job execution.
     */

    public JobExecutionSummary getJobExecutionSummary() {
        return this.jobExecutionSummary;
    }

    /**
     * <p>
     * Contains a subset of information about a job execution.
     * </p>
     * 
     * @param jobExecutionSummary
     *        Contains a subset of information about a job execution.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobExecutionSummaryForThing withJobExecutionSummary(JobExecutionSummary jobExecutionSummary) {
        setJobExecutionSummary(jobExecutionSummary);
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
        if (getJobExecutionSummary() != null)
            sb.append("JobExecutionSummary: ").append(getJobExecutionSummary());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof JobExecutionSummaryForThing == false)
            return false;
        JobExecutionSummaryForThing other = (JobExecutionSummaryForThing) obj;
        if (other.getJobId() == null ^ this.getJobId() == null)
            return false;
        if (other.getJobId() != null && other.getJobId().equals(this.getJobId()) == false)
            return false;
        if (other.getJobExecutionSummary() == null ^ this.getJobExecutionSummary() == null)
            return false;
        if (other.getJobExecutionSummary() != null && other.getJobExecutionSummary().equals(this.getJobExecutionSummary()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getJobId() == null) ? 0 : getJobId().hashCode());
        hashCode = prime * hashCode + ((getJobExecutionSummary() == null) ? 0 : getJobExecutionSummary().hashCode());
        return hashCode;
    }

    @Override
    public JobExecutionSummaryForThing clone() {
        try {
            return (JobExecutionSummaryForThing) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iot.model.transform.JobExecutionSummaryForThingMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
