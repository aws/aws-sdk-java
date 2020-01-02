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
package com.amazonaws.services.glue.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Specifies configuration properties for a Find Matches task run.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/FindMatchesTaskRunProperties" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FindMatchesTaskRunProperties implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The job ID for the Find Matches task run.
     * </p>
     */
    private String jobId;
    /**
     * <p>
     * The name assigned to the job for the Find Matches task run.
     * </p>
     */
    private String jobName;
    /**
     * <p>
     * The job run ID for the Find Matches task run.
     * </p>
     */
    private String jobRunId;

    /**
     * <p>
     * The job ID for the Find Matches task run.
     * </p>
     * 
     * @param jobId
     *        The job ID for the Find Matches task run.
     */

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    /**
     * <p>
     * The job ID for the Find Matches task run.
     * </p>
     * 
     * @return The job ID for the Find Matches task run.
     */

    public String getJobId() {
        return this.jobId;
    }

    /**
     * <p>
     * The job ID for the Find Matches task run.
     * </p>
     * 
     * @param jobId
     *        The job ID for the Find Matches task run.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FindMatchesTaskRunProperties withJobId(String jobId) {
        setJobId(jobId);
        return this;
    }

    /**
     * <p>
     * The name assigned to the job for the Find Matches task run.
     * </p>
     * 
     * @param jobName
     *        The name assigned to the job for the Find Matches task run.
     */

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    /**
     * <p>
     * The name assigned to the job for the Find Matches task run.
     * </p>
     * 
     * @return The name assigned to the job for the Find Matches task run.
     */

    public String getJobName() {
        return this.jobName;
    }

    /**
     * <p>
     * The name assigned to the job for the Find Matches task run.
     * </p>
     * 
     * @param jobName
     *        The name assigned to the job for the Find Matches task run.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FindMatchesTaskRunProperties withJobName(String jobName) {
        setJobName(jobName);
        return this;
    }

    /**
     * <p>
     * The job run ID for the Find Matches task run.
     * </p>
     * 
     * @param jobRunId
     *        The job run ID for the Find Matches task run.
     */

    public void setJobRunId(String jobRunId) {
        this.jobRunId = jobRunId;
    }

    /**
     * <p>
     * The job run ID for the Find Matches task run.
     * </p>
     * 
     * @return The job run ID for the Find Matches task run.
     */

    public String getJobRunId() {
        return this.jobRunId;
    }

    /**
     * <p>
     * The job run ID for the Find Matches task run.
     * </p>
     * 
     * @param jobRunId
     *        The job run ID for the Find Matches task run.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FindMatchesTaskRunProperties withJobRunId(String jobRunId) {
        setJobRunId(jobRunId);
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
        if (getJobName() != null)
            sb.append("JobName: ").append(getJobName()).append(",");
        if (getJobRunId() != null)
            sb.append("JobRunId: ").append(getJobRunId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof FindMatchesTaskRunProperties == false)
            return false;
        FindMatchesTaskRunProperties other = (FindMatchesTaskRunProperties) obj;
        if (other.getJobId() == null ^ this.getJobId() == null)
            return false;
        if (other.getJobId() != null && other.getJobId().equals(this.getJobId()) == false)
            return false;
        if (other.getJobName() == null ^ this.getJobName() == null)
            return false;
        if (other.getJobName() != null && other.getJobName().equals(this.getJobName()) == false)
            return false;
        if (other.getJobRunId() == null ^ this.getJobRunId() == null)
            return false;
        if (other.getJobRunId() != null && other.getJobRunId().equals(this.getJobRunId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getJobId() == null) ? 0 : getJobId().hashCode());
        hashCode = prime * hashCode + ((getJobName() == null) ? 0 : getJobName().hashCode());
        hashCode = prime * hashCode + ((getJobRunId() == null) ? 0 : getJobRunId().hashCode());
        return hashCode;
    }

    @Override
    public FindMatchesTaskRunProperties clone() {
        try {
            return (FindMatchesTaskRunProperties) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.glue.model.transform.FindMatchesTaskRunPropertiesMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
