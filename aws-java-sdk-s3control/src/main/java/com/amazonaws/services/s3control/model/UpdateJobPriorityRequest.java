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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/UpdateJobPriority" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateJobPriorityRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /** <p/> */
    private String accountId;
    /**
     * <p>
     * The ID for the job whose priority you want to update.
     * </p>
     */
    private String jobId;
    /**
     * <p>
     * The priority you want to assign to this job.
     * </p>
     */
    private Integer priority;

    /**
     * <p/>
     * 
     * @param accountId
     */

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    /**
     * <p/>
     * 
     * @return
     */

    public String getAccountId() {
        return this.accountId;
    }

    /**
     * <p/>
     * 
     * @param accountId
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateJobPriorityRequest withAccountId(String accountId) {
        setAccountId(accountId);
        return this;
    }

    /**
     * <p>
     * The ID for the job whose priority you want to update.
     * </p>
     * 
     * @param jobId
     *        The ID for the job whose priority you want to update.
     */

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    /**
     * <p>
     * The ID for the job whose priority you want to update.
     * </p>
     * 
     * @return The ID for the job whose priority you want to update.
     */

    public String getJobId() {
        return this.jobId;
    }

    /**
     * <p>
     * The ID for the job whose priority you want to update.
     * </p>
     * 
     * @param jobId
     *        The ID for the job whose priority you want to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateJobPriorityRequest withJobId(String jobId) {
        setJobId(jobId);
        return this;
    }

    /**
     * <p>
     * The priority you want to assign to this job.
     * </p>
     * 
     * @param priority
     *        The priority you want to assign to this job.
     */

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    /**
     * <p>
     * The priority you want to assign to this job.
     * </p>
     * 
     * @return The priority you want to assign to this job.
     */

    public Integer getPriority() {
        return this.priority;
    }

    /**
     * <p>
     * The priority you want to assign to this job.
     * </p>
     * 
     * @param priority
     *        The priority you want to assign to this job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateJobPriorityRequest withPriority(Integer priority) {
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
        if (getAccountId() != null)
            sb.append("AccountId: ").append(getAccountId()).append(",");
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

        if (obj instanceof UpdateJobPriorityRequest == false)
            return false;
        UpdateJobPriorityRequest other = (UpdateJobPriorityRequest) obj;
        if (other.getAccountId() == null ^ this.getAccountId() == null)
            return false;
        if (other.getAccountId() != null && other.getAccountId().equals(this.getAccountId()) == false)
            return false;
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

        hashCode = prime * hashCode + ((getAccountId() == null) ? 0 : getAccountId().hashCode());
        hashCode = prime * hashCode + ((getJobId() == null) ? 0 : getJobId().hashCode());
        hashCode = prime * hashCode + ((getPriority() == null) ? 0 : getPriority().hashCode());
        return hashCode;
    }

    @Override
    public UpdateJobPriorityRequest clone() {
        return (UpdateJobPriorityRequest) super.clone();
    }

}
