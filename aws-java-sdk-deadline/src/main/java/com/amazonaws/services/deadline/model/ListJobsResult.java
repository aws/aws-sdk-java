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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/ListJobs" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListJobsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The jobs on the list.
     * </p>
     */
    private java.util.List<JobSummary> jobs;
    /**
     * <p>
     * If Deadline Cloud returns <code>nextToken</code>, then there are more results available. The value of
     * <code>nextToken</code> is a unique pagination token for each page. To retrieve the next page, call the operation
     * again using the returned token. Keep all other arguments unchanged. If no results remain, then
     * <code>nextToken</code> is set to <code>null</code>. Each pagination token expires after 24 hours. If you provide
     * a token that isn't valid, then you receive an HTTP 400 <code>ValidationException</code> error.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The jobs on the list.
     * </p>
     * 
     * @return The jobs on the list.
     */

    public java.util.List<JobSummary> getJobs() {
        return jobs;
    }

    /**
     * <p>
     * The jobs on the list.
     * </p>
     * 
     * @param jobs
     *        The jobs on the list.
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
     * The jobs on the list.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setJobs(java.util.Collection)} or {@link #withJobs(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param jobs
     *        The jobs on the list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListJobsResult withJobs(JobSummary... jobs) {
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
     * The jobs on the list.
     * </p>
     * 
     * @param jobs
     *        The jobs on the list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListJobsResult withJobs(java.util.Collection<JobSummary> jobs) {
        setJobs(jobs);
        return this;
    }

    /**
     * <p>
     * If Deadline Cloud returns <code>nextToken</code>, then there are more results available. The value of
     * <code>nextToken</code> is a unique pagination token for each page. To retrieve the next page, call the operation
     * again using the returned token. Keep all other arguments unchanged. If no results remain, then
     * <code>nextToken</code> is set to <code>null</code>. Each pagination token expires after 24 hours. If you provide
     * a token that isn't valid, then you receive an HTTP 400 <code>ValidationException</code> error.
     * </p>
     * 
     * @param nextToken
     *        If Deadline Cloud returns <code>nextToken</code>, then there are more results available. The value of
     *        <code>nextToken</code> is a unique pagination token for each page. To retrieve the next page, call the
     *        operation again using the returned token. Keep all other arguments unchanged. If no results remain, then
     *        <code>nextToken</code> is set to <code>null</code>. Each pagination token expires after 24 hours. If you
     *        provide a token that isn't valid, then you receive an HTTP 400 <code>ValidationException</code> error.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If Deadline Cloud returns <code>nextToken</code>, then there are more results available. The value of
     * <code>nextToken</code> is a unique pagination token for each page. To retrieve the next page, call the operation
     * again using the returned token. Keep all other arguments unchanged. If no results remain, then
     * <code>nextToken</code> is set to <code>null</code>. Each pagination token expires after 24 hours. If you provide
     * a token that isn't valid, then you receive an HTTP 400 <code>ValidationException</code> error.
     * </p>
     * 
     * @return If Deadline Cloud returns <code>nextToken</code>, then there are more results available. The value of
     *         <code>nextToken</code> is a unique pagination token for each page. To retrieve the next page, call the
     *         operation again using the returned token. Keep all other arguments unchanged. If no results remain, then
     *         <code>nextToken</code> is set to <code>null</code>. Each pagination token expires after 24 hours. If you
     *         provide a token that isn't valid, then you receive an HTTP 400 <code>ValidationException</code> error.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If Deadline Cloud returns <code>nextToken</code>, then there are more results available. The value of
     * <code>nextToken</code> is a unique pagination token for each page. To retrieve the next page, call the operation
     * again using the returned token. Keep all other arguments unchanged. If no results remain, then
     * <code>nextToken</code> is set to <code>null</code>. Each pagination token expires after 24 hours. If you provide
     * a token that isn't valid, then you receive an HTTP 400 <code>ValidationException</code> error.
     * </p>
     * 
     * @param nextToken
     *        If Deadline Cloud returns <code>nextToken</code>, then there are more results available. The value of
     *        <code>nextToken</code> is a unique pagination token for each page. To retrieve the next page, call the
     *        operation again using the returned token. Keep all other arguments unchanged. If no results remain, then
     *        <code>nextToken</code> is set to <code>null</code>. Each pagination token expires after 24 hours. If you
     *        provide a token that isn't valid, then you receive an HTTP 400 <code>ValidationException</code> error.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListJobsResult withNextToken(String nextToken) {
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

        if (obj instanceof ListJobsResult == false)
            return false;
        ListJobsResult other = (ListJobsResult) obj;
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
    public ListJobsResult clone() {
        try {
            return (ListJobsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
