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
package com.amazonaws.services.bedrock.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-2023-04-20/ListEvaluationJobs" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListEvaluationJobsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Continuation token from the previous response, for Amazon Bedrock to list the next set of results.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * A summary of the model evaluation jobs.
     * </p>
     */
    private java.util.List<EvaluationSummary> jobSummaries;

    /**
     * <p>
     * Continuation token from the previous response, for Amazon Bedrock to list the next set of results.
     * </p>
     * 
     * @param nextToken
     *        Continuation token from the previous response, for Amazon Bedrock to list the next set of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * Continuation token from the previous response, for Amazon Bedrock to list the next set of results.
     * </p>
     * 
     * @return Continuation token from the previous response, for Amazon Bedrock to list the next set of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * Continuation token from the previous response, for Amazon Bedrock to list the next set of results.
     * </p>
     * 
     * @param nextToken
     *        Continuation token from the previous response, for Amazon Bedrock to list the next set of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListEvaluationJobsResult withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * A summary of the model evaluation jobs.
     * </p>
     * 
     * @return A summary of the model evaluation jobs.
     */

    public java.util.List<EvaluationSummary> getJobSummaries() {
        return jobSummaries;
    }

    /**
     * <p>
     * A summary of the model evaluation jobs.
     * </p>
     * 
     * @param jobSummaries
     *        A summary of the model evaluation jobs.
     */

    public void setJobSummaries(java.util.Collection<EvaluationSummary> jobSummaries) {
        if (jobSummaries == null) {
            this.jobSummaries = null;
            return;
        }

        this.jobSummaries = new java.util.ArrayList<EvaluationSummary>(jobSummaries);
    }

    /**
     * <p>
     * A summary of the model evaluation jobs.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setJobSummaries(java.util.Collection)} or {@link #withJobSummaries(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param jobSummaries
     *        A summary of the model evaluation jobs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListEvaluationJobsResult withJobSummaries(EvaluationSummary... jobSummaries) {
        if (this.jobSummaries == null) {
            setJobSummaries(new java.util.ArrayList<EvaluationSummary>(jobSummaries.length));
        }
        for (EvaluationSummary ele : jobSummaries) {
            this.jobSummaries.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A summary of the model evaluation jobs.
     * </p>
     * 
     * @param jobSummaries
     *        A summary of the model evaluation jobs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListEvaluationJobsResult withJobSummaries(java.util.Collection<EvaluationSummary> jobSummaries) {
        setJobSummaries(jobSummaries);
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
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getJobSummaries() != null)
            sb.append("JobSummaries: ").append(getJobSummaries());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListEvaluationJobsResult == false)
            return false;
        ListEvaluationJobsResult other = (ListEvaluationJobsResult) obj;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getJobSummaries() == null ^ this.getJobSummaries() == null)
            return false;
        if (other.getJobSummaries() != null && other.getJobSummaries().equals(this.getJobSummaries()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getJobSummaries() == null) ? 0 : getJobSummaries().hashCode());
        return hashCode;
    }

    @Override
    public ListEvaluationJobsResult clone() {
        try {
            return (ListEvaluationJobsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
