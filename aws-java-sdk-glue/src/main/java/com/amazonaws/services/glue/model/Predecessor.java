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
 * A job run that was used in the predicate of a conditional trigger that triggered this job run.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/Predecessor" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Predecessor implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the job definition used by the predecessor job run.
     * </p>
     */
    private String jobName;
    /**
     * <p>
     * The job-run ID of the predecessor job run.
     * </p>
     */
    private String runId;

    /**
     * <p>
     * The name of the job definition used by the predecessor job run.
     * </p>
     * 
     * @param jobName
     *        The name of the job definition used by the predecessor job run.
     */

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    /**
     * <p>
     * The name of the job definition used by the predecessor job run.
     * </p>
     * 
     * @return The name of the job definition used by the predecessor job run.
     */

    public String getJobName() {
        return this.jobName;
    }

    /**
     * <p>
     * The name of the job definition used by the predecessor job run.
     * </p>
     * 
     * @param jobName
     *        The name of the job definition used by the predecessor job run.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Predecessor withJobName(String jobName) {
        setJobName(jobName);
        return this;
    }

    /**
     * <p>
     * The job-run ID of the predecessor job run.
     * </p>
     * 
     * @param runId
     *        The job-run ID of the predecessor job run.
     */

    public void setRunId(String runId) {
        this.runId = runId;
    }

    /**
     * <p>
     * The job-run ID of the predecessor job run.
     * </p>
     * 
     * @return The job-run ID of the predecessor job run.
     */

    public String getRunId() {
        return this.runId;
    }

    /**
     * <p>
     * The job-run ID of the predecessor job run.
     * </p>
     * 
     * @param runId
     *        The job-run ID of the predecessor job run.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Predecessor withRunId(String runId) {
        setRunId(runId);
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
        if (getRunId() != null)
            sb.append("RunId: ").append(getRunId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Predecessor == false)
            return false;
        Predecessor other = (Predecessor) obj;
        if (other.getJobName() == null ^ this.getJobName() == null)
            return false;
        if (other.getJobName() != null && other.getJobName().equals(this.getJobName()) == false)
            return false;
        if (other.getRunId() == null ^ this.getRunId() == null)
            return false;
        if (other.getRunId() != null && other.getRunId().equals(this.getRunId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getJobName() == null) ? 0 : getJobName().hashCode());
        hashCode = prime * hashCode + ((getRunId() == null) ? 0 : getRunId().hashCode());
        return hashCode;
    }

    @Override
    public Predecessor clone() {
        try {
            return (Predecessor) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.glue.model.transform.PredecessorMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
