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
package com.amazonaws.services.glue.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/BatchGetJobs" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchGetJobsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A list of job definitions.
     * </p>
     */
    private java.util.List<Job> jobs;
    /**
     * <p>
     * A list of names of jobs not found.
     * </p>
     */
    private java.util.List<String> jobsNotFound;

    /**
     * <p>
     * A list of job definitions.
     * </p>
     * 
     * @return A list of job definitions.
     */

    public java.util.List<Job> getJobs() {
        return jobs;
    }

    /**
     * <p>
     * A list of job definitions.
     * </p>
     * 
     * @param jobs
     *        A list of job definitions.
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
     * A list of job definitions.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setJobs(java.util.Collection)} or {@link #withJobs(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param jobs
     *        A list of job definitions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetJobsResult withJobs(Job... jobs) {
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
     * A list of job definitions.
     * </p>
     * 
     * @param jobs
     *        A list of job definitions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetJobsResult withJobs(java.util.Collection<Job> jobs) {
        setJobs(jobs);
        return this;
    }

    /**
     * <p>
     * A list of names of jobs not found.
     * </p>
     * 
     * @return A list of names of jobs not found.
     */

    public java.util.List<String> getJobsNotFound() {
        return jobsNotFound;
    }

    /**
     * <p>
     * A list of names of jobs not found.
     * </p>
     * 
     * @param jobsNotFound
     *        A list of names of jobs not found.
     */

    public void setJobsNotFound(java.util.Collection<String> jobsNotFound) {
        if (jobsNotFound == null) {
            this.jobsNotFound = null;
            return;
        }

        this.jobsNotFound = new java.util.ArrayList<String>(jobsNotFound);
    }

    /**
     * <p>
     * A list of names of jobs not found.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setJobsNotFound(java.util.Collection)} or {@link #withJobsNotFound(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param jobsNotFound
     *        A list of names of jobs not found.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetJobsResult withJobsNotFound(String... jobsNotFound) {
        if (this.jobsNotFound == null) {
            setJobsNotFound(new java.util.ArrayList<String>(jobsNotFound.length));
        }
        for (String ele : jobsNotFound) {
            this.jobsNotFound.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of names of jobs not found.
     * </p>
     * 
     * @param jobsNotFound
     *        A list of names of jobs not found.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetJobsResult withJobsNotFound(java.util.Collection<String> jobsNotFound) {
        setJobsNotFound(jobsNotFound);
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
        if (getJobsNotFound() != null)
            sb.append("JobsNotFound: ").append(getJobsNotFound());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchGetJobsResult == false)
            return false;
        BatchGetJobsResult other = (BatchGetJobsResult) obj;
        if (other.getJobs() == null ^ this.getJobs() == null)
            return false;
        if (other.getJobs() != null && other.getJobs().equals(this.getJobs()) == false)
            return false;
        if (other.getJobsNotFound() == null ^ this.getJobsNotFound() == null)
            return false;
        if (other.getJobsNotFound() != null && other.getJobsNotFound().equals(this.getJobsNotFound()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getJobs() == null) ? 0 : getJobs().hashCode());
        hashCode = prime * hashCode + ((getJobsNotFound() == null) ? 0 : getJobsNotFound().hashCode());
        return hashCode;
    }

    @Override
    public BatchGetJobsResult clone() {
        try {
            return (BatchGetJobsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
