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
package com.amazonaws.services.entityresolution.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/entityresolution-2018-05-10/ListMatchingJobs" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListMatchingJobsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A list of <code>JobSummary</code> objects, each of which contain the ID, status, start time, and end time of a
     * job.
     * </p>
     */
    private java.util.List<JobSummary> jobs;
    /**
     * <p>
     * The pagination token from the previous API call.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * A list of <code>JobSummary</code> objects, each of which contain the ID, status, start time, and end time of a
     * job.
     * </p>
     * 
     * @return A list of <code>JobSummary</code> objects, each of which contain the ID, status, start time, and end time
     *         of a job.
     */

    public java.util.List<JobSummary> getJobs() {
        return jobs;
    }

    /**
     * <p>
     * A list of <code>JobSummary</code> objects, each of which contain the ID, status, start time, and end time of a
     * job.
     * </p>
     * 
     * @param jobs
     *        A list of <code>JobSummary</code> objects, each of which contain the ID, status, start time, and end time
     *        of a job.
     */

    public void setJobs(java.util.Collection<JobSummary> jobs) {
        if (jobs == null) {
            this.jobs = null;
            return;
        }

        this.jobs = new java.util.ArrayList<JobSummary>(jobs);
    }

    /**
     * <p>
     * A list of <code>JobSummary</code> objects, each of which contain the ID, status, start time, and end time of a
     * job.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setJobs(java.util.Collection)} or {@link #withJobs(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param jobs
     *        A list of <code>JobSummary</code> objects, each of which contain the ID, status, start time, and end time
     *        of a job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListMatchingJobsResult withJobs(JobSummary... jobs) {
        if (this.jobs == null) {
            setJobs(new java.util.ArrayList<JobSummary>(jobs.length));
        }
        for (JobSummary ele : jobs) {
            this.jobs.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of <code>JobSummary</code> objects, each of which contain the ID, status, start time, and end time of a
     * job.
     * </p>
     * 
     * @param jobs
     *        A list of <code>JobSummary</code> objects, each of which contain the ID, status, start time, and end time
     *        of a job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListMatchingJobsResult withJobs(java.util.Collection<JobSummary> jobs) {
        setJobs(jobs);
        return this;
    }

    /**
     * <p>
     * The pagination token from the previous API call.
     * </p>
     * 
     * @param nextToken
     *        The pagination token from the previous API call.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The pagination token from the previous API call.
     * </p>
     * 
     * @return The pagination token from the previous API call.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The pagination token from the previous API call.
     * </p>
     * 
     * @param nextToken
     *        The pagination token from the previous API call.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListMatchingJobsResult withNextToken(String nextToken) {
        setNextToken(nextToken);
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
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListMatchingJobsResult == false)
            return false;
        ListMatchingJobsResult other = (ListMatchingJobsResult) obj;
        if (other.getJobs() == null ^ this.getJobs() == null)
            return false;
        if (other.getJobs() != null && other.getJobs().equals(this.getJobs()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getJobs() == null) ? 0 : getJobs().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListMatchingJobsResult clone() {
        try {
            return (ListMatchingJobsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
