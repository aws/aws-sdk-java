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
package com.amazonaws.services.braket.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/braket-2019-09-01/SearchJobs" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SearchJobsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * An array of <code>JobSummary</code> objects for devices that match the specified filter values.
     * </p>
     */
    private java.util.List<JobSummary> jobs;
    /**
     * <p>
     * A token used for pagination of results, or <code>null</code> if there are no additional results. Use the token
     * value in a subsequent request to continue results where the previous request ended.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * An array of <code>JobSummary</code> objects for devices that match the specified filter values.
     * </p>
     * 
     * @return An array of <code>JobSummary</code> objects for devices that match the specified filter values.
     */

    public java.util.List<JobSummary> getJobs() {
        return jobs;
    }

    /**
     * <p>
     * An array of <code>JobSummary</code> objects for devices that match the specified filter values.
     * </p>
     * 
     * @param jobs
     *        An array of <code>JobSummary</code> objects for devices that match the specified filter values.
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
     * An array of <code>JobSummary</code> objects for devices that match the specified filter values.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setJobs(java.util.Collection)} or {@link #withJobs(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param jobs
     *        An array of <code>JobSummary</code> objects for devices that match the specified filter values.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchJobsResult withJobs(JobSummary... jobs) {
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
     * An array of <code>JobSummary</code> objects for devices that match the specified filter values.
     * </p>
     * 
     * @param jobs
     *        An array of <code>JobSummary</code> objects for devices that match the specified filter values.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchJobsResult withJobs(java.util.Collection<JobSummary> jobs) {
        setJobs(jobs);
        return this;
    }

    /**
     * <p>
     * A token used for pagination of results, or <code>null</code> if there are no additional results. Use the token
     * value in a subsequent request to continue results where the previous request ended.
     * </p>
     * 
     * @param nextToken
     *        A token used for pagination of results, or <code>null</code> if there are no additional results. Use the
     *        token value in a subsequent request to continue results where the previous request ended.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A token used for pagination of results, or <code>null</code> if there are no additional results. Use the token
     * value in a subsequent request to continue results where the previous request ended.
     * </p>
     * 
     * @return A token used for pagination of results, or <code>null</code> if there are no additional results. Use the
     *         token value in a subsequent request to continue results where the previous request ended.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * A token used for pagination of results, or <code>null</code> if there are no additional results. Use the token
     * value in a subsequent request to continue results where the previous request ended.
     * </p>
     * 
     * @param nextToken
     *        A token used for pagination of results, or <code>null</code> if there are no additional results. Use the
     *        token value in a subsequent request to continue results where the previous request ended.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchJobsResult withNextToken(String nextToken) {
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

        if (obj instanceof SearchJobsResult == false)
            return false;
        SearchJobsResult other = (SearchJobsResult) obj;
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
    public SearchJobsResult clone() {
        try {
            return (SearchJobsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
