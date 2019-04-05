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
package com.amazonaws.services.importexport.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * Output structure for the ListJobs operation.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListJobsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    private com.amazonaws.internal.SdkInternalList<Job> jobs;

    private Boolean isTruncated;

    /**
     * @return
     */

    public java.util.List<Job> getJobs() {
        if (jobs == null) {
            jobs = new com.amazonaws.internal.SdkInternalList<Job>();
        }
        return jobs;
    }

    /**
     * @param jobs
     */

    public void setJobs(java.util.Collection<Job> jobs) {
        if (jobs == null) {
            this.jobs = null;
            return;
        }

        this.jobs = new com.amazonaws.internal.SdkInternalList<Job>(jobs);
    }

    /**
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setJobs(java.util.Collection)} or {@link #withJobs(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param jobs
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListJobsResult withJobs(Job... jobs) {
        if (this.jobs == null) {
            setJobs(new com.amazonaws.internal.SdkInternalList<Job>(jobs.length));
        }
        for (Job ele : jobs) {
            this.jobs.add(ele);
        }
        return this;
    }

    /**
     * @param jobs
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListJobsResult withJobs(java.util.Collection<Job> jobs) {
        setJobs(jobs);
        return this;
    }

    /**
     * @param isTruncated
     */

    public void setIsTruncated(Boolean isTruncated) {
        this.isTruncated = isTruncated;
    }

    /**
     * @return
     */

    public Boolean getIsTruncated() {
        return this.isTruncated;
    }

    /**
     * @param isTruncated
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListJobsResult withIsTruncated(Boolean isTruncated) {
        setIsTruncated(isTruncated);
        return this;
    }

    /**
     * @return
     */

    public Boolean isTruncated() {
        return this.isTruncated;
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
        if (getJobs() != null)
            sb.append("Jobs: ").append(getJobs()).append(",");
        if (getIsTruncated() != null)
            sb.append("IsTruncated: ").append(getIsTruncated());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListJobsResult == false)
            return false;
        ListJobsResult other = (ListJobsResult) obj;
        if (other.getJobs() == null ^ this.getJobs() == null)
            return false;
        if (other.getJobs() != null && other.getJobs().equals(this.getJobs()) == false)
            return false;
        if (other.getIsTruncated() == null ^ this.getIsTruncated() == null)
            return false;
        if (other.getIsTruncated() != null && other.getIsTruncated().equals(this.getIsTruncated()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getJobs() == null) ? 0 : getJobs().hashCode());
        hashCode = prime * hashCode + ((getIsTruncated() == null) ? 0 : getIsTruncated().hashCode());
        return hashCode;
    }

    @Override
    public ListJobsResult clone() {
        try {
            return (ListJobsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
