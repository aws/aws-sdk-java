/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.services.importexport.model;

import java.io.Serializable;

/**
 * Output structure for the ListJobs operation.
 */
public class ListJobsResult implements Serializable, Cloneable {

    private com.amazonaws.internal.SdkInternalList<Job> jobs;

    private Boolean isTruncated;

    /**
     * Returns the value of the Jobs property for this object.
     * 
     * @return The value of the Jobs property for this object.
     */
    public java.util.List<Job> getJobs() {
        if (jobs == null) {
            jobs = new com.amazonaws.internal.SdkInternalList<Job>();
        }
        return jobs;
    }

    /**
     * Sets the value of the Jobs property for this object.
     * 
     * @param jobs
     *        The new value for the Jobs property for this object.
     */
    public void setJobs(java.util.Collection<Job> jobs) {
        if (jobs == null) {
            this.jobs = null;
            return;
        }

        this.jobs = new com.amazonaws.internal.SdkInternalList<Job>(jobs);
    }

    /**
     * Sets the value of the Jobs property for this object.
     * 
     * @param jobs
     *        The new value for the Jobs property for this object.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
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
     * Sets the value of the Jobs property for this object.
     * 
     * @param jobs
     *        The new value for the Jobs property for this object.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public ListJobsResult withJobs(java.util.Collection<Job> jobs) {
        setJobs(jobs);
        return this;
    }

    /**
     * Sets the value of the IsTruncated property for this object.
     * 
     * @param isTruncated
     *        The new value for the IsTruncated property for this object.
     */
    public void setIsTruncated(Boolean isTruncated) {
        this.isTruncated = isTruncated;
    }

    /**
     * Returns the value of the IsTruncated property for this object.
     * 
     * @return The value of the IsTruncated property for this object.
     */
    public Boolean getIsTruncated() {
        return this.isTruncated;
    }

    /**
     * Sets the value of the IsTruncated property for this object.
     * 
     * @param isTruncated
     *        The new value for the IsTruncated property for this object.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public ListJobsResult withIsTruncated(Boolean isTruncated) {
        setIsTruncated(isTruncated);
        return this;
    }

    /**
     * Returns the value of the IsTruncated property for this object.
     * 
     * @return The value of the IsTruncated property for this object.
     */
    public Boolean isTruncated() {
        return this.isTruncated;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
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
            sb.append("Jobs: " + getJobs() + ",");
        if (getIsTruncated() != null)
            sb.append("IsTruncated: " + getIsTruncated());
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
        if (other.getJobs() != null
                && other.getJobs().equals(this.getJobs()) == false)
            return false;
        if (other.getIsTruncated() == null ^ this.getIsTruncated() == null)
            return false;
        if (other.getIsTruncated() != null
                && other.getIsTruncated().equals(this.getIsTruncated()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getJobs() == null) ? 0 : getJobs().hashCode());
        hashCode = prime
                * hashCode
                + ((getIsTruncated() == null) ? 0 : getIsTruncated().hashCode());
        return hashCode;
    }

    @Override
    public ListJobsResult clone() {
        try {
            return (ListJobsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}