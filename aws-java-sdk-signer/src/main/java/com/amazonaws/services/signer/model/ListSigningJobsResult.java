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
package com.amazonaws.services.signer.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/signer-2017-08-25/ListSigningJobs" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListSigningJobsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A list of your signing jobs.
     * </p>
     */
    private java.util.List<SigningJob> jobs;
    /**
     * <p>
     * String for specifying the next set of paginated results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * A list of your signing jobs.
     * </p>
     * 
     * @return A list of your signing jobs.
     */

    public java.util.List<SigningJob> getJobs() {
        return jobs;
    }

    /**
     * <p>
     * A list of your signing jobs.
     * </p>
     * 
     * @param jobs
     *        A list of your signing jobs.
     */

    public void setJobs(java.util.Collection<SigningJob> jobs) {
        if (jobs == null) {
            this.jobs = null;
            return;
        }

        this.jobs = new java.util.ArrayList<SigningJob>(jobs);
    }

    /**
     * <p>
     * A list of your signing jobs.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setJobs(java.util.Collection)} or {@link #withJobs(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param jobs
     *        A list of your signing jobs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListSigningJobsResult withJobs(SigningJob... jobs) {
        if (this.jobs == null) {
            setJobs(new java.util.ArrayList<SigningJob>(jobs.length));
        }
        for (SigningJob ele : jobs) {
            this.jobs.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of your signing jobs.
     * </p>
     * 
     * @param jobs
     *        A list of your signing jobs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListSigningJobsResult withJobs(java.util.Collection<SigningJob> jobs) {
        setJobs(jobs);
        return this;
    }

    /**
     * <p>
     * String for specifying the next set of paginated results.
     * </p>
     * 
     * @param nextToken
     *        String for specifying the next set of paginated results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * String for specifying the next set of paginated results.
     * </p>
     * 
     * @return String for specifying the next set of paginated results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * String for specifying the next set of paginated results.
     * </p>
     * 
     * @param nextToken
     *        String for specifying the next set of paginated results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListSigningJobsResult withNextToken(String nextToken) {
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

        if (obj instanceof ListSigningJobsResult == false)
            return false;
        ListSigningJobsResult other = (ListSigningJobsResult) obj;
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
    public ListSigningJobsResult clone() {
        try {
            return (ListSigningJobsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
