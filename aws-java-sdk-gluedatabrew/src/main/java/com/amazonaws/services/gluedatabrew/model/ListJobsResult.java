/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.gluedatabrew.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/databrew-2017-07-25/ListJobs" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListJobsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A list of jobs that are defined.
     * </p>
     */
    private java.util.List<Job> jobs;
    /**
     * <p>
     * A token that you can use in a subsequent call to retrieve the next set of results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * A list of jobs that are defined.
     * </p>
     * 
     * @return A list of jobs that are defined.
     */

    public java.util.List<Job> getJobs() {
        return jobs;
    }

    /**
     * <p>
     * A list of jobs that are defined.
     * </p>
     * 
     * @param jobs
     *        A list of jobs that are defined.
     */

    public void setJobs(java.util.Collection<Job> jobs) {
        if (jobs == null) {
            this.jobs = null;
            return;
        }

        this.jobs = new java.util.ArrayList<Job>(jobs);
    }

    /**
     * <p>
     * A list of jobs that are defined.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setJobs(java.util.Collection)} or {@link #withJobs(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param jobs
     *        A list of jobs that are defined.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListJobsResult withJobs(Job... jobs) {
        if (this.jobs == null) {
            setJobs(new java.util.ArrayList<Job>(jobs.length));
        }
        for (Job ele : jobs) {
            this.jobs.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of jobs that are defined.
     * </p>
     * 
     * @param jobs
     *        A list of jobs that are defined.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListJobsResult withJobs(java.util.Collection<Job> jobs) {
        setJobs(jobs);
        return this;
    }

    /**
     * <p>
     * A token that you can use in a subsequent call to retrieve the next set of results.
     * </p>
     * 
     * @param nextToken
     *        A token that you can use in a subsequent call to retrieve the next set of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A token that you can use in a subsequent call to retrieve the next set of results.
     * </p>
     * 
     * @return A token that you can use in a subsequent call to retrieve the next set of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * A token that you can use in a subsequent call to retrieve the next set of results.
     * </p>
     * 
     * @param nextToken
     *        A token that you can use in a subsequent call to retrieve the next set of results.
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
