/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.deadline.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/SearchJobs" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SearchJobsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The jobs in the search.
     * </p>
     */
    private java.util.List<JobSearchSummary> jobs;
    /**
     * <p>
     * The next incremental starting point after the defined <code>itemOffset</code>.
     * </p>
     */
    private Integer nextItemOffset;
    /**
     * <p>
     * The total number of results in the search.
     * </p>
     */
    private Integer totalResults;

    /**
     * <p>
     * The jobs in the search.
     * </p>
     * 
     * @return The jobs in the search.
     */

    public java.util.List<JobSearchSummary> getJobs() {
        return jobs;
    }

    /**
     * <p>
     * The jobs in the search.
     * </p>
     * 
     * @param jobs
     *        The jobs in the search.
     */

    public void setJobs(java.util.Collection<JobSearchSummary> jobs) {
        if (jobs == null) {
            this.jobs = null;
            return;
        }

        this.jobs = new java.util.ArrayList<JobSearchSummary>(jobs);
    }

    /**
     * <p>
     * The jobs in the search.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setJobs(java.util.Collection)} or {@link #withJobs(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param jobs
     *        The jobs in the search.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchJobsResult withJobs(JobSearchSummary... jobs) {
        if (this.jobs == null) {
            setJobs(new java.util.ArrayList<JobSearchSummary>(jobs.length));
        }
        for (JobSearchSummary ele : jobs) {
            this.jobs.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The jobs in the search.
     * </p>
     * 
     * @param jobs
     *        The jobs in the search.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchJobsResult withJobs(java.util.Collection<JobSearchSummary> jobs) {
        setJobs(jobs);
        return this;
    }

    /**
     * <p>
     * The next incremental starting point after the defined <code>itemOffset</code>.
     * </p>
     * 
     * @param nextItemOffset
     *        The next incremental starting point after the defined <code>itemOffset</code>.
     */

    public void setNextItemOffset(Integer nextItemOffset) {
        this.nextItemOffset = nextItemOffset;
    }

    /**
     * <p>
     * The next incremental starting point after the defined <code>itemOffset</code>.
     * </p>
     * 
     * @return The next incremental starting point after the defined <code>itemOffset</code>.
     */

    public Integer getNextItemOffset() {
        return this.nextItemOffset;
    }

    /**
     * <p>
     * The next incremental starting point after the defined <code>itemOffset</code>.
     * </p>
     * 
     * @param nextItemOffset
     *        The next incremental starting point after the defined <code>itemOffset</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchJobsResult withNextItemOffset(Integer nextItemOffset) {
        setNextItemOffset(nextItemOffset);
        return this;
    }

    /**
     * <p>
     * The total number of results in the search.
     * </p>
     * 
     * @param totalResults
     *        The total number of results in the search.
     */

    public void setTotalResults(Integer totalResults) {
        this.totalResults = totalResults;
    }

    /**
     * <p>
     * The total number of results in the search.
     * </p>
     * 
     * @return The total number of results in the search.
     */

    public Integer getTotalResults() {
        return this.totalResults;
    }

    /**
     * <p>
     * The total number of results in the search.
     * </p>
     * 
     * @param totalResults
     *        The total number of results in the search.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchJobsResult withTotalResults(Integer totalResults) {
        setTotalResults(totalResults);
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
        if (getJobs() != null)
            sb.append("Jobs: ").append(getJobs()).append(",");
        if (getNextItemOffset() != null)
            sb.append("NextItemOffset: ").append(getNextItemOffset()).append(",");
        if (getTotalResults() != null)
            sb.append("TotalResults: ").append(getTotalResults());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SearchJobsResult == false)
            return false;
        SearchJobsResult other = (SearchJobsResult) obj;
        if (other.getJobs() == null ^ this.getJobs() == null)
            return false;
        if (other.getJobs() != null && other.getJobs().equals(this.getJobs()) == false)
            return false;
        if (other.getNextItemOffset() == null ^ this.getNextItemOffset() == null)
            return false;
        if (other.getNextItemOffset() != null && other.getNextItemOffset().equals(this.getNextItemOffset()) == false)
            return false;
        if (other.getTotalResults() == null ^ this.getTotalResults() == null)
            return false;
        if (other.getTotalResults() != null && other.getTotalResults().equals(this.getTotalResults()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getJobs() == null) ? 0 : getJobs().hashCode());
        hashCode = prime * hashCode + ((getNextItemOffset() == null) ? 0 : getNextItemOffset().hashCode());
        hashCode = prime * hashCode + ((getTotalResults() == null) ? 0 : getTotalResults().hashCode());
        return hashCode;
    }

    @Override
    public SearchJobsResult clone() {
        try {
            return (SearchJobsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
