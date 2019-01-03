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
package com.amazonaws.services.iot.model;

import java.io.Serializable;
import javax.annotation.Generated;

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListJobExecutionsForJobResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A list of job execution summaries.
     * </p>
     */
    private java.util.List<JobExecutionSummaryForJob> executionSummaries;
    /**
     * <p>
     * The token for the next set of results, or <b>null</b> if there are no additional results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * A list of job execution summaries.
     * </p>
     * 
     * @return A list of job execution summaries.
     */

    public java.util.List<JobExecutionSummaryForJob> getExecutionSummaries() {
        return executionSummaries;
    }

    /**
     * <p>
     * A list of job execution summaries.
     * </p>
     * 
     * @param executionSummaries
     *        A list of job execution summaries.
     */

    public void setExecutionSummaries(java.util.Collection<JobExecutionSummaryForJob> executionSummaries) {
        if (executionSummaries == null) {
            this.executionSummaries = null;
            return;
        }

        this.executionSummaries = new java.util.ArrayList<JobExecutionSummaryForJob>(executionSummaries);
    }

    /**
     * <p>
     * A list of job execution summaries.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setExecutionSummaries(java.util.Collection)} or {@link #withExecutionSummaries(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param executionSummaries
     *        A list of job execution summaries.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListJobExecutionsForJobResult withExecutionSummaries(JobExecutionSummaryForJob... executionSummaries) {
        if (this.executionSummaries == null) {
            setExecutionSummaries(new java.util.ArrayList<JobExecutionSummaryForJob>(executionSummaries.length));
        }
        for (JobExecutionSummaryForJob ele : executionSummaries) {
            this.executionSummaries.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of job execution summaries.
     * </p>
     * 
     * @param executionSummaries
     *        A list of job execution summaries.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListJobExecutionsForJobResult withExecutionSummaries(java.util.Collection<JobExecutionSummaryForJob> executionSummaries) {
        setExecutionSummaries(executionSummaries);
        return this;
    }

    /**
     * <p>
     * The token for the next set of results, or <b>null</b> if there are no additional results.
     * </p>
     * 
     * @param nextToken
     *        The token for the next set of results, or <b>null</b> if there are no additional results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token for the next set of results, or <b>null</b> if there are no additional results.
     * </p>
     * 
     * @return The token for the next set of results, or <b>null</b> if there are no additional results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token for the next set of results, or <b>null</b> if there are no additional results.
     * </p>
     * 
     * @param nextToken
     *        The token for the next set of results, or <b>null</b> if there are no additional results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListJobExecutionsForJobResult withNextToken(String nextToken) {
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
        if (getExecutionSummaries() != null)
            sb.append("ExecutionSummaries: ").append(getExecutionSummaries()).append(",");
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

        if (obj instanceof ListJobExecutionsForJobResult == false)
            return false;
        ListJobExecutionsForJobResult other = (ListJobExecutionsForJobResult) obj;
        if (other.getExecutionSummaries() == null ^ this.getExecutionSummaries() == null)
            return false;
        if (other.getExecutionSummaries() != null && other.getExecutionSummaries().equals(this.getExecutionSummaries()) == false)
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

        hashCode = prime * hashCode + ((getExecutionSummaries() == null) ? 0 : getExecutionSummaries().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListJobExecutionsForJobResult clone() {
        try {
            return (ListJobExecutionsForJobResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
