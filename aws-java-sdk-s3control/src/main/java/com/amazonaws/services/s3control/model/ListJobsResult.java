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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/ListJobs" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListJobsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.services.s3control.S3ControlResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * If the <code>List Jobs</code> request produced more than the maximum number of results, you can pass this value
     * into a subsequent <code>List Jobs</code> request in order to retrieve the next page of results.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The list of current jobs and jobs that have ended within the last 30 days.
     * </p>
     */
    private java.util.List<JobListDescriptor> jobs;

    /**
     * <p>
     * If the <code>List Jobs</code> request produced more than the maximum number of results, you can pass this value
     * into a subsequent <code>List Jobs</code> request in order to retrieve the next page of results.
     * </p>
     * 
     * @param nextToken
     *        If the <code>List Jobs</code> request produced more than the maximum number of results, you can pass this
     *        value into a subsequent <code>List Jobs</code> request in order to retrieve the next page of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If the <code>List Jobs</code> request produced more than the maximum number of results, you can pass this value
     * into a subsequent <code>List Jobs</code> request in order to retrieve the next page of results.
     * </p>
     * 
     * @return If the <code>List Jobs</code> request produced more than the maximum number of results, you can pass this
     *         value into a subsequent <code>List Jobs</code> request in order to retrieve the next page of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If the <code>List Jobs</code> request produced more than the maximum number of results, you can pass this value
     * into a subsequent <code>List Jobs</code> request in order to retrieve the next page of results.
     * </p>
     * 
     * @param nextToken
     *        If the <code>List Jobs</code> request produced more than the maximum number of results, you can pass this
     *        value into a subsequent <code>List Jobs</code> request in order to retrieve the next page of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListJobsResult withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The list of current jobs and jobs that have ended within the last 30 days.
     * </p>
     * 
     * @return The list of current jobs and jobs that have ended within the last 30 days.
     */

    public java.util.List<JobListDescriptor> getJobs() {
        return jobs;
    }

    /**
     * <p>
     * The list of current jobs and jobs that have ended within the last 30 days.
     * </p>
     * 
     * @param jobs
     *        The list of current jobs and jobs that have ended within the last 30 days.
     */

    public void setJobs(java.util.Collection<JobListDescriptor> jobs) {
        if (jobs == null) {
            this.jobs = null;
            return;
        }

        this.jobs = new java.util.ArrayList<JobListDescriptor>(jobs);
    }

    /**
     * <p>
     * The list of current jobs and jobs that have ended within the last 30 days.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setJobs(java.util.Collection)} or {@link #withJobs(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param jobs
     *        The list of current jobs and jobs that have ended within the last 30 days.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListJobsResult withJobs(JobListDescriptor... jobs) {
        if (this.jobs == null) {
            setJobs(new java.util.ArrayList<JobListDescriptor>(jobs.length));
        }
        for (JobListDescriptor ele : jobs) {
            this.jobs.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of current jobs and jobs that have ended within the last 30 days.
     * </p>
     * 
     * @param jobs
     *        The list of current jobs and jobs that have ended within the last 30 days.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListJobsResult withJobs(java.util.Collection<JobListDescriptor> jobs) {
        setJobs(jobs);
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
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getJobs() != null)
            sb.append("Jobs: ").append(getJobs());
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
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getJobs() == null ^ this.getJobs() == null)
            return false;
        if (other.getJobs() != null && other.getJobs().equals(this.getJobs()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getJobs() == null) ? 0 : getJobs().hashCode());
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
