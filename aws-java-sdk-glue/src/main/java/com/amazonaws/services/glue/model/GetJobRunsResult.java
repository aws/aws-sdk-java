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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/GetJobRuns" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetJobRunsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A list of job-run metatdata objects.
     * </p>
     */
    private java.util.List<JobRun> jobRuns;
    /**
     * <p>
     * A continuation token, if not all reequested job runs have been returned.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * A list of job-run metatdata objects.
     * </p>
     * 
     * @return A list of job-run metatdata objects.
     */

    public java.util.List<JobRun> getJobRuns() {
        return jobRuns;
    }

    /**
     * <p>
     * A list of job-run metatdata objects.
     * </p>
     * 
     * @param jobRuns
     *        A list of job-run metatdata objects.
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
     * A list of job-run metatdata objects.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setJobRuns(java.util.Collection)} or {@link #withJobRuns(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param jobRuns
     *        A list of job-run metatdata objects.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetJobRunsResult withJobRuns(JobRun... jobRuns) {
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
     * A list of job-run metatdata objects.
     * </p>
     * 
     * @param jobRuns
     *        A list of job-run metatdata objects.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetJobRunsResult withJobRuns(java.util.Collection<JobRun> jobRuns) {
        setJobRuns(jobRuns);
        return this;
    }

    /**
     * <p>
     * A continuation token, if not all reequested job runs have been returned.
     * </p>
     * 
     * @param nextToken
     *        A continuation token, if not all reequested job runs have been returned.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A continuation token, if not all reequested job runs have been returned.
     * </p>
     * 
     * @return A continuation token, if not all reequested job runs have been returned.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * A continuation token, if not all reequested job runs have been returned.
     * </p>
     * 
     * @param nextToken
     *        A continuation token, if not all reequested job runs have been returned.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetJobRunsResult withNextToken(String nextToken) {
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

        if (obj instanceof GetJobRunsResult == false)
            return false;
        GetJobRunsResult other = (GetJobRunsResult) obj;
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
    public GetJobRunsResult clone() {
        try {
            return (GetJobRunsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
