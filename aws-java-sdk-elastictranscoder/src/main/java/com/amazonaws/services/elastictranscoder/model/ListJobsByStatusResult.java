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
package com.amazonaws.services.elastictranscoder.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * The <code>ListJobsByStatusResponse</code> structure.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListJobsByStatusResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * An array of <code>Job</code> objects that have the specified status.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Job> jobs;
    /**
     * <p>
     * A value that you use to access the second and subsequent pages of results, if any. When the jobs in the specified
     * pipeline fit on one page or when you've reached the last page of results, the value of <code>NextPageToken</code>
     * is <code>null</code>.
     * </p>
     */
    private String nextPageToken;

    /**
     * <p>
     * An array of <code>Job</code> objects that have the specified status.
     * </p>
     * 
     * @return An array of <code>Job</code> objects that have the specified status.
     */

    public java.util.List<Job> getJobs() {
        if (jobs == null) {
            jobs = new com.amazonaws.internal.SdkInternalList<Job>();
        }
        return jobs;
    }

    /**
     * <p>
     * An array of <code>Job</code> objects that have the specified status.
     * </p>
     * 
     * @param jobs
     *        An array of <code>Job</code> objects that have the specified status.
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
     * An array of <code>Job</code> objects that have the specified status.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setJobs(java.util.Collection)} or {@link #withJobs(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param jobs
     *        An array of <code>Job</code> objects that have the specified status.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListJobsByStatusResult withJobs(Job... jobs) {
        if (this.jobs == null) {
            setJobs(new com.amazonaws.internal.SdkInternalList<Job>(jobs.length));
        }
        for (Job ele : jobs) {
            this.jobs.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of <code>Job</code> objects that have the specified status.
     * </p>
     * 
     * @param jobs
     *        An array of <code>Job</code> objects that have the specified status.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListJobsByStatusResult withJobs(java.util.Collection<Job> jobs) {
        setJobs(jobs);
        return this;
    }

    /**
     * <p>
     * A value that you use to access the second and subsequent pages of results, if any. When the jobs in the specified
     * pipeline fit on one page or when you've reached the last page of results, the value of <code>NextPageToken</code>
     * is <code>null</code>.
     * </p>
     * 
     * @param nextPageToken
     *        A value that you use to access the second and subsequent pages of results, if any. When the jobs in the
     *        specified pipeline fit on one page or when you've reached the last page of results, the value of
     *        <code>NextPageToken</code> is <code>null</code>.
     */

    public void setNextPageToken(String nextPageToken) {
        this.nextPageToken = nextPageToken;
    }

    /**
     * <p>
     * A value that you use to access the second and subsequent pages of results, if any. When the jobs in the specified
     * pipeline fit on one page or when you've reached the last page of results, the value of <code>NextPageToken</code>
     * is <code>null</code>.
     * </p>
     * 
     * @return A value that you use to access the second and subsequent pages of results, if any. When the jobs in the
     *         specified pipeline fit on one page or when you've reached the last page of results, the value of
     *         <code>NextPageToken</code> is <code>null</code>.
     */

    public String getNextPageToken() {
        return this.nextPageToken;
    }

    /**
     * <p>
     * A value that you use to access the second and subsequent pages of results, if any. When the jobs in the specified
     * pipeline fit on one page or when you've reached the last page of results, the value of <code>NextPageToken</code>
     * is <code>null</code>.
     * </p>
     * 
     * @param nextPageToken
     *        A value that you use to access the second and subsequent pages of results, if any. When the jobs in the
     *        specified pipeline fit on one page or when you've reached the last page of results, the value of
     *        <code>NextPageToken</code> is <code>null</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListJobsByStatusResult withNextPageToken(String nextPageToken) {
        setNextPageToken(nextPageToken);
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
        if (getNextPageToken() != null)
            sb.append("NextPageToken: ").append(getNextPageToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListJobsByStatusResult == false)
            return false;
        ListJobsByStatusResult other = (ListJobsByStatusResult) obj;
        if (other.getJobs() == null ^ this.getJobs() == null)
            return false;
        if (other.getJobs() != null && other.getJobs().equals(this.getJobs()) == false)
            return false;
        if (other.getNextPageToken() == null ^ this.getNextPageToken() == null)
            return false;
        if (other.getNextPageToken() != null && other.getNextPageToken().equals(this.getNextPageToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getJobs() == null) ? 0 : getJobs().hashCode());
        hashCode = prime * hashCode + ((getNextPageToken() == null) ? 0 : getNextPageToken().hashCode());
        return hashCode;
    }

    @Override
    public ListJobsByStatusResult clone() {
        try {
            return (ListJobsByStatusResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
