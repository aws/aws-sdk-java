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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/databrew-2017-07-25/ListJobRuns" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListJobRunsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A list of job runs that have occurred for the specified job.
     * </p>
     */
    private java.util.List<JobRun> jobRuns;
    /**
     * <p>
     * A token that you can use in a subsequent call to retrieve the next set of results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * A list of job runs that have occurred for the specified job.
     * </p>
     * 
     * @return A list of job runs that have occurred for the specified job.
     */

    public java.util.List<JobRun> getJobRuns() {
        return jobRuns;
    }

    /**
     * <p>
     * A list of job runs that have occurred for the specified job.
     * </p>
     * 
     * @param jobRuns
     *        A list of job runs that have occurred for the specified job.
     */

    public void setJobRuns(java.util.Collection<JobRun> jobRuns) {
        if (jobRuns == null) {
            this.jobRuns = null;
            return;
        }

        this.jobRuns = new java.util.ArrayList<JobRun>(jobRuns);
    }

    /**
     * <p>
     * A list of job runs that have occurred for the specified job.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setJobRuns(java.util.Collection)} or {@link #withJobRuns(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param jobRuns
     *        A list of job runs that have occurred for the specified job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListJobRunsResult withJobRuns(JobRun... jobRuns) {
        if (this.jobRuns == null) {
            setJobRuns(new java.util.ArrayList<JobRun>(jobRuns.length));
        }
        for (JobRun ele : jobRuns) {
            this.jobRuns.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of job runs that have occurred for the specified job.
     * </p>
     * 
     * @param jobRuns
     *        A list of job runs that have occurred for the specified job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListJobRunsResult withJobRuns(java.util.Collection<JobRun> jobRuns) {
        setJobRuns(jobRuns);
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

    public ListJobRunsResult withNextToken(String nextToken) {
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
        if (getJobRuns() != null)
            sb.append("JobRuns: ").append(getJobRuns()).append(",");
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

        if (obj instanceof ListJobRunsResult == false)
            return false;
        ListJobRunsResult other = (ListJobRunsResult) obj;
        if (other.getJobRuns() == null ^ this.getJobRuns() == null)
            return false;
        if (other.getJobRuns() != null && other.getJobRuns().equals(this.getJobRuns()) == false)
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

        hashCode = prime * hashCode + ((getJobRuns() == null) ? 0 : getJobRuns().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListJobRunsResult clone() {
        try {
            return (ListJobRunsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
