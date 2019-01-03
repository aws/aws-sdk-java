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
package com.amazonaws.services.iotjobsdataplane.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iot-jobs-data-2017-09-29/GetPendingJobExecutions"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetPendingJobExecutionsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A list of JobExecutionSummary objects with status IN_PROGRESS.
     * </p>
     */
    private java.util.List<JobExecutionSummary> inProgressJobs;
    /**
     * <p>
     * A list of JobExecutionSummary objects with status QUEUED.
     * </p>
     */
    private java.util.List<JobExecutionSummary> queuedJobs;

    /**
     * <p>
     * A list of JobExecutionSummary objects with status IN_PROGRESS.
     * </p>
     * 
     * @return A list of JobExecutionSummary objects with status IN_PROGRESS.
     */

    public java.util.List<JobExecutionSummary> getInProgressJobs() {
        return inProgressJobs;
    }

    /**
     * <p>
     * A list of JobExecutionSummary objects with status IN_PROGRESS.
     * </p>
     * 
     * @param inProgressJobs
     *        A list of JobExecutionSummary objects with status IN_PROGRESS.
     */

    public void setInProgressJobs(java.util.Collection<JobExecutionSummary> inProgressJobs) {
        if (inProgressJobs == null) {
            this.inProgressJobs = null;
            return;
        }

        this.inProgressJobs = new java.util.ArrayList<JobExecutionSummary>(inProgressJobs);
    }

    /**
     * <p>
     * A list of JobExecutionSummary objects with status IN_PROGRESS.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setInProgressJobs(java.util.Collection)} or {@link #withInProgressJobs(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param inProgressJobs
     *        A list of JobExecutionSummary objects with status IN_PROGRESS.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetPendingJobExecutionsResult withInProgressJobs(JobExecutionSummary... inProgressJobs) {
        if (this.inProgressJobs == null) {
            setInProgressJobs(new java.util.ArrayList<JobExecutionSummary>(inProgressJobs.length));
        }
        for (JobExecutionSummary ele : inProgressJobs) {
            this.inProgressJobs.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of JobExecutionSummary objects with status IN_PROGRESS.
     * </p>
     * 
     * @param inProgressJobs
     *        A list of JobExecutionSummary objects with status IN_PROGRESS.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetPendingJobExecutionsResult withInProgressJobs(java.util.Collection<JobExecutionSummary> inProgressJobs) {
        setInProgressJobs(inProgressJobs);
        return this;
    }

    /**
     * <p>
     * A list of JobExecutionSummary objects with status QUEUED.
     * </p>
     * 
     * @return A list of JobExecutionSummary objects with status QUEUED.
     */

    public java.util.List<JobExecutionSummary> getQueuedJobs() {
        return queuedJobs;
    }

    /**
     * <p>
     * A list of JobExecutionSummary objects with status QUEUED.
     * </p>
     * 
     * @param queuedJobs
     *        A list of JobExecutionSummary objects with status QUEUED.
     */

    public void setQueuedJobs(java.util.Collection<JobExecutionSummary> queuedJobs) {
        if (queuedJobs == null) {
            this.queuedJobs = null;
            return;
        }

        this.queuedJobs = new java.util.ArrayList<JobExecutionSummary>(queuedJobs);
    }

    /**
     * <p>
     * A list of JobExecutionSummary objects with status QUEUED.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setQueuedJobs(java.util.Collection)} or {@link #withQueuedJobs(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param queuedJobs
     *        A list of JobExecutionSummary objects with status QUEUED.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetPendingJobExecutionsResult withQueuedJobs(JobExecutionSummary... queuedJobs) {
        if (this.queuedJobs == null) {
            setQueuedJobs(new java.util.ArrayList<JobExecutionSummary>(queuedJobs.length));
        }
        for (JobExecutionSummary ele : queuedJobs) {
            this.queuedJobs.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of JobExecutionSummary objects with status QUEUED.
     * </p>
     * 
     * @param queuedJobs
     *        A list of JobExecutionSummary objects with status QUEUED.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetPendingJobExecutionsResult withQueuedJobs(java.util.Collection<JobExecutionSummary> queuedJobs) {
        setQueuedJobs(queuedJobs);
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
        if (getInProgressJobs() != null)
            sb.append("InProgressJobs: ").append(getInProgressJobs()).append(",");
        if (getQueuedJobs() != null)
            sb.append("QueuedJobs: ").append(getQueuedJobs());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetPendingJobExecutionsResult == false)
            return false;
        GetPendingJobExecutionsResult other = (GetPendingJobExecutionsResult) obj;
        if (other.getInProgressJobs() == null ^ this.getInProgressJobs() == null)
            return false;
        if (other.getInProgressJobs() != null && other.getInProgressJobs().equals(this.getInProgressJobs()) == false)
            return false;
        if (other.getQueuedJobs() == null ^ this.getQueuedJobs() == null)
            return false;
        if (other.getQueuedJobs() != null && other.getQueuedJobs().equals(this.getQueuedJobs()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInProgressJobs() == null) ? 0 : getInProgressJobs().hashCode());
        hashCode = prime * hashCode + ((getQueuedJobs() == null) ? 0 : getQueuedJobs().hashCode());
        return hashCode;
    }

    @Override
    public GetPendingJobExecutionsResult clone() {
        try {
            return (GetPendingJobExecutionsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
