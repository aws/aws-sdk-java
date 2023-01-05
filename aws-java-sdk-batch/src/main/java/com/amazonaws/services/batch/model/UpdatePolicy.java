/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.batch.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Specifies the infrastructure update policy for the compute environment. For more information about infrastructure
 * updates, see <a href="https://docs.aws.amazon.com/batch/latest/userguide/updating-compute-environments.html">Updating
 * compute environments</a> in the <i>Batch User Guide</i>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/batch-2016-08-10/UpdatePolicy" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdatePolicy implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Specifies whether jobs are automatically terminated when the computer environment infrastructure is updated. The
     * default value is <code>false</code>.
     * </p>
     */
    private Boolean terminateJobsOnUpdate;
    /**
     * <p>
     * Specifies the job timeout (in minutes) when the compute environment infrastructure is updated. The default value
     * is 30.
     * </p>
     */
    private Long jobExecutionTimeoutMinutes;

    /**
     * <p>
     * Specifies whether jobs are automatically terminated when the computer environment infrastructure is updated. The
     * default value is <code>false</code>.
     * </p>
     * 
     * @param terminateJobsOnUpdate
     *        Specifies whether jobs are automatically terminated when the computer environment infrastructure is
     *        updated. The default value is <code>false</code>.
     */

    public void setTerminateJobsOnUpdate(Boolean terminateJobsOnUpdate) {
        this.terminateJobsOnUpdate = terminateJobsOnUpdate;
    }

    /**
     * <p>
     * Specifies whether jobs are automatically terminated when the computer environment infrastructure is updated. The
     * default value is <code>false</code>.
     * </p>
     * 
     * @return Specifies whether jobs are automatically terminated when the computer environment infrastructure is
     *         updated. The default value is <code>false</code>.
     */

    public Boolean getTerminateJobsOnUpdate() {
        return this.terminateJobsOnUpdate;
    }

    /**
     * <p>
     * Specifies whether jobs are automatically terminated when the computer environment infrastructure is updated. The
     * default value is <code>false</code>.
     * </p>
     * 
     * @param terminateJobsOnUpdate
     *        Specifies whether jobs are automatically terminated when the computer environment infrastructure is
     *        updated. The default value is <code>false</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdatePolicy withTerminateJobsOnUpdate(Boolean terminateJobsOnUpdate) {
        setTerminateJobsOnUpdate(terminateJobsOnUpdate);
        return this;
    }

    /**
     * <p>
     * Specifies whether jobs are automatically terminated when the computer environment infrastructure is updated. The
     * default value is <code>false</code>.
     * </p>
     * 
     * @return Specifies whether jobs are automatically terminated when the computer environment infrastructure is
     *         updated. The default value is <code>false</code>.
     */

    public Boolean isTerminateJobsOnUpdate() {
        return this.terminateJobsOnUpdate;
    }

    /**
     * <p>
     * Specifies the job timeout (in minutes) when the compute environment infrastructure is updated. The default value
     * is 30.
     * </p>
     * 
     * @param jobExecutionTimeoutMinutes
     *        Specifies the job timeout (in minutes) when the compute environment infrastructure is updated. The default
     *        value is 30.
     */

    public void setJobExecutionTimeoutMinutes(Long jobExecutionTimeoutMinutes) {
        this.jobExecutionTimeoutMinutes = jobExecutionTimeoutMinutes;
    }

    /**
     * <p>
     * Specifies the job timeout (in minutes) when the compute environment infrastructure is updated. The default value
     * is 30.
     * </p>
     * 
     * @return Specifies the job timeout (in minutes) when the compute environment infrastructure is updated. The
     *         default value is 30.
     */

    public Long getJobExecutionTimeoutMinutes() {
        return this.jobExecutionTimeoutMinutes;
    }

    /**
     * <p>
     * Specifies the job timeout (in minutes) when the compute environment infrastructure is updated. The default value
     * is 30.
     * </p>
     * 
     * @param jobExecutionTimeoutMinutes
     *        Specifies the job timeout (in minutes) when the compute environment infrastructure is updated. The default
     *        value is 30.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdatePolicy withJobExecutionTimeoutMinutes(Long jobExecutionTimeoutMinutes) {
        setJobExecutionTimeoutMinutes(jobExecutionTimeoutMinutes);
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
        if (getTerminateJobsOnUpdate() != null)
            sb.append("TerminateJobsOnUpdate: ").append(getTerminateJobsOnUpdate()).append(",");
        if (getJobExecutionTimeoutMinutes() != null)
            sb.append("JobExecutionTimeoutMinutes: ").append(getJobExecutionTimeoutMinutes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdatePolicy == false)
            return false;
        UpdatePolicy other = (UpdatePolicy) obj;
        if (other.getTerminateJobsOnUpdate() == null ^ this.getTerminateJobsOnUpdate() == null)
            return false;
        if (other.getTerminateJobsOnUpdate() != null && other.getTerminateJobsOnUpdate().equals(this.getTerminateJobsOnUpdate()) == false)
            return false;
        if (other.getJobExecutionTimeoutMinutes() == null ^ this.getJobExecutionTimeoutMinutes() == null)
            return false;
        if (other.getJobExecutionTimeoutMinutes() != null && other.getJobExecutionTimeoutMinutes().equals(this.getJobExecutionTimeoutMinutes()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTerminateJobsOnUpdate() == null) ? 0 : getTerminateJobsOnUpdate().hashCode());
        hashCode = prime * hashCode + ((getJobExecutionTimeoutMinutes() == null) ? 0 : getJobExecutionTimeoutMinutes().hashCode());
        return hashCode;
    }

    @Override
    public UpdatePolicy clone() {
        try {
            return (UpdatePolicy) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.batch.model.transform.UpdatePolicyMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
