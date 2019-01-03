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
package com.amazonaws.services.snowball.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/snowball-2016-06-30/ListClusterJobs" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListClusterJobsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Each <code>JobListEntry</code> object contains a job's state, a job's ID, and a value that indicates whether the
     * job is a job part, in the case of export jobs.
     * </p>
     */
    private java.util.List<JobListEntry> jobListEntries;
    /**
     * <p>
     * HTTP requests are stateless. If you use the automatically generated <code>NextToken</code> value in your next
     * <code>ListClusterJobsResult</code> call, your list of returned jobs will start from this point in the array.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Each <code>JobListEntry</code> object contains a job's state, a job's ID, and a value that indicates whether the
     * job is a job part, in the case of export jobs.
     * </p>
     * 
     * @return Each <code>JobListEntry</code> object contains a job's state, a job's ID, and a value that indicates
     *         whether the job is a job part, in the case of export jobs.
     */

    public java.util.List<JobListEntry> getJobListEntries() {
        return jobListEntries;
    }

    /**
     * <p>
     * Each <code>JobListEntry</code> object contains a job's state, a job's ID, and a value that indicates whether the
     * job is a job part, in the case of export jobs.
     * </p>
     * 
     * @param jobListEntries
     *        Each <code>JobListEntry</code> object contains a job's state, a job's ID, and a value that indicates
     *        whether the job is a job part, in the case of export jobs.
     */

    public void setJobListEntries(java.util.Collection<JobListEntry> jobListEntries) {
        if (jobListEntries == null) {
            this.jobListEntries = null;
            return;
        }

        this.jobListEntries = new java.util.ArrayList<JobListEntry>(jobListEntries);
    }

    /**
     * <p>
     * Each <code>JobListEntry</code> object contains a job's state, a job's ID, and a value that indicates whether the
     * job is a job part, in the case of export jobs.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setJobListEntries(java.util.Collection)} or {@link #withJobListEntries(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param jobListEntries
     *        Each <code>JobListEntry</code> object contains a job's state, a job's ID, and a value that indicates
     *        whether the job is a job part, in the case of export jobs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListClusterJobsResult withJobListEntries(JobListEntry... jobListEntries) {
        if (this.jobListEntries == null) {
            setJobListEntries(new java.util.ArrayList<JobListEntry>(jobListEntries.length));
        }
        for (JobListEntry ele : jobListEntries) {
            this.jobListEntries.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Each <code>JobListEntry</code> object contains a job's state, a job's ID, and a value that indicates whether the
     * job is a job part, in the case of export jobs.
     * </p>
     * 
     * @param jobListEntries
     *        Each <code>JobListEntry</code> object contains a job's state, a job's ID, and a value that indicates
     *        whether the job is a job part, in the case of export jobs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListClusterJobsResult withJobListEntries(java.util.Collection<JobListEntry> jobListEntries) {
        setJobListEntries(jobListEntries);
        return this;
    }

    /**
     * <p>
     * HTTP requests are stateless. If you use the automatically generated <code>NextToken</code> value in your next
     * <code>ListClusterJobsResult</code> call, your list of returned jobs will start from this point in the array.
     * </p>
     * 
     * @param nextToken
     *        HTTP requests are stateless. If you use the automatically generated <code>NextToken</code> value in your
     *        next <code>ListClusterJobsResult</code> call, your list of returned jobs will start from this point in the
     *        array.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * HTTP requests are stateless. If you use the automatically generated <code>NextToken</code> value in your next
     * <code>ListClusterJobsResult</code> call, your list of returned jobs will start from this point in the array.
     * </p>
     * 
     * @return HTTP requests are stateless. If you use the automatically generated <code>NextToken</code> value in your
     *         next <code>ListClusterJobsResult</code> call, your list of returned jobs will start from this point in
     *         the array.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * HTTP requests are stateless. If you use the automatically generated <code>NextToken</code> value in your next
     * <code>ListClusterJobsResult</code> call, your list of returned jobs will start from this point in the array.
     * </p>
     * 
     * @param nextToken
     *        HTTP requests are stateless. If you use the automatically generated <code>NextToken</code> value in your
     *        next <code>ListClusterJobsResult</code> call, your list of returned jobs will start from this point in the
     *        array.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListClusterJobsResult withNextToken(String nextToken) {
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
        if (getJobListEntries() != null)
            sb.append("JobListEntries: ").append(getJobListEntries()).append(",");
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

        if (obj instanceof ListClusterJobsResult == false)
            return false;
        ListClusterJobsResult other = (ListClusterJobsResult) obj;
        if (other.getJobListEntries() == null ^ this.getJobListEntries() == null)
            return false;
        if (other.getJobListEntries() != null && other.getJobListEntries().equals(this.getJobListEntries()) == false)
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

        hashCode = prime * hashCode + ((getJobListEntries() == null) ? 0 : getJobListEntries().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListClusterJobsResult clone() {
        try {
            return (ListClusterJobsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
