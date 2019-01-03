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
package com.amazonaws.services.amplify.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Maximum number of records to list in a single response.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplify-2017-07-25/ListJobs" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListJobsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Result structure for list job result request.
     * </p>
     */
    private java.util.List<JobSummary> jobSummaries;
    /**
     * <p>
     * Pagination token. If non-null pagination token is returned in a result, then pass its value in another request to
     * fetch more entries.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Result structure for list job result request.
     * </p>
     * 
     * @return Result structure for list job result request.
     */

    public java.util.List<JobSummary> getJobSummaries() {
        return jobSummaries;
    }

    /**
     * <p>
     * Result structure for list job result request.
     * </p>
     * 
     * @param jobSummaries
     *        Result structure for list job result request.
     */

    public void setJobSummaries(java.util.Collection<JobSummary> jobSummaries) {
        if (jobSummaries == null) {
            this.jobSummaries = null;
            return;
        }

        this.jobSummaries = new java.util.ArrayList<JobSummary>(jobSummaries);
    }

    /**
     * <p>
     * Result structure for list job result request.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setJobSummaries(java.util.Collection)} or {@link #withJobSummaries(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param jobSummaries
     *        Result structure for list job result request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListJobsResult withJobSummaries(JobSummary... jobSummaries) {
        if (this.jobSummaries == null) {
            setJobSummaries(new java.util.ArrayList<JobSummary>(jobSummaries.length));
        }
        for (JobSummary ele : jobSummaries) {
            this.jobSummaries.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Result structure for list job result request.
     * </p>
     * 
     * @param jobSummaries
     *        Result structure for list job result request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListJobsResult withJobSummaries(java.util.Collection<JobSummary> jobSummaries) {
        setJobSummaries(jobSummaries);
        return this;
    }

    /**
     * <p>
     * Pagination token. If non-null pagination token is returned in a result, then pass its value in another request to
     * fetch more entries.
     * </p>
     * 
     * @param nextToken
     *        Pagination token. If non-null pagination token is returned in a result, then pass its value in another
     *        request to fetch more entries.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * Pagination token. If non-null pagination token is returned in a result, then pass its value in another request to
     * fetch more entries.
     * </p>
     * 
     * @return Pagination token. If non-null pagination token is returned in a result, then pass its value in another
     *         request to fetch more entries.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * Pagination token. If non-null pagination token is returned in a result, then pass its value in another request to
     * fetch more entries.
     * </p>
     * 
     * @param nextToken
     *        Pagination token. If non-null pagination token is returned in a result, then pass its value in another
     *        request to fetch more entries.
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
        if (getJobSummaries() != null)
            sb.append("JobSummaries: ").append(getJobSummaries()).append(",");
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
        if (other.getJobSummaries() == null ^ this.getJobSummaries() == null)
            return false;
        if (other.getJobSummaries() != null && other.getJobSummaries().equals(this.getJobSummaries()) == false)
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

        hashCode = prime * hashCode + ((getJobSummaries() == null) ? 0 : getJobSummaries().hashCode());
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
