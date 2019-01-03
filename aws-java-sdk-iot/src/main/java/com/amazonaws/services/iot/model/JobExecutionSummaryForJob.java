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
 * Contains a summary of information about job executions for a specific job.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class JobExecutionSummaryForJob implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ARN of the thing on which the job execution is running.
     * </p>
     */
    private String thingArn;
    /**
     * <p>
     * Contains a subset of information about a job execution.
     * </p>
     */
    private JobExecutionSummary jobExecutionSummary;

    /**
     * <p>
     * The ARN of the thing on which the job execution is running.
     * </p>
     * 
     * @param thingArn
     *        The ARN of the thing on which the job execution is running.
     */

    public void setThingArn(String thingArn) {
        this.thingArn = thingArn;
    }

    /**
     * <p>
     * The ARN of the thing on which the job execution is running.
     * </p>
     * 
     * @return The ARN of the thing on which the job execution is running.
     */

    public String getThingArn() {
        return this.thingArn;
    }

    /**
     * <p>
     * The ARN of the thing on which the job execution is running.
     * </p>
     * 
     * @param thingArn
     *        The ARN of the thing on which the job execution is running.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobExecutionSummaryForJob withThingArn(String thingArn) {
        setThingArn(thingArn);
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

    public JobExecutionSummaryForJob withJobExecutionSummary(JobExecutionSummary jobExecutionSummary) {
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
        if (getThingArn() != null)
            sb.append("ThingArn: ").append(getThingArn()).append(",");
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

        if (obj instanceof JobExecutionSummaryForJob == false)
            return false;
        JobExecutionSummaryForJob other = (JobExecutionSummaryForJob) obj;
        if (other.getThingArn() == null ^ this.getThingArn() == null)
            return false;
        if (other.getThingArn() != null && other.getThingArn().equals(this.getThingArn()) == false)
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

        hashCode = prime * hashCode + ((getThingArn() == null) ? 0 : getThingArn().hashCode());
        hashCode = prime * hashCode + ((getJobExecutionSummary() == null) ? 0 : getJobExecutionSummary().hashCode());
        return hashCode;
    }

    @Override
    public JobExecutionSummaryForJob clone() {
        try {
            return (JobExecutionSummaryForJob) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iot.model.transform.JobExecutionSummaryForJobMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
