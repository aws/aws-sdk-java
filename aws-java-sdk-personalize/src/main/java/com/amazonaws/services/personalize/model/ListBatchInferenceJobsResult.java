/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.personalize.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/personalize-2018-05-22/ListBatchInferenceJobs" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListBatchInferenceJobsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A list containing information on each job that is returned.
     * </p>
     */
    private java.util.List<BatchInferenceJobSummary> batchInferenceJobs;
    /**
     * <p>
     * The token to use to retreive the next page of results. The value is <code>null</code> when there are no more
     * results to return.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * A list containing information on each job that is returned.
     * </p>
     * 
     * @return A list containing information on each job that is returned.
     */

    public java.util.List<BatchInferenceJobSummary> getBatchInferenceJobs() {
        return batchInferenceJobs;
    }

    /**
     * <p>
     * A list containing information on each job that is returned.
     * </p>
     * 
     * @param batchInferenceJobs
     *        A list containing information on each job that is returned.
     */

    public void setBatchInferenceJobs(java.util.Collection<BatchInferenceJobSummary> batchInferenceJobs) {
        if (batchInferenceJobs == null) {
            this.batchInferenceJobs = null;
            return;
        }

        this.batchInferenceJobs = new java.util.ArrayList<BatchInferenceJobSummary>(batchInferenceJobs);
    }

    /**
     * <p>
     * A list containing information on each job that is returned.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setBatchInferenceJobs(java.util.Collection)} or {@link #withBatchInferenceJobs(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param batchInferenceJobs
     *        A list containing information on each job that is returned.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListBatchInferenceJobsResult withBatchInferenceJobs(BatchInferenceJobSummary... batchInferenceJobs) {
        if (this.batchInferenceJobs == null) {
            setBatchInferenceJobs(new java.util.ArrayList<BatchInferenceJobSummary>(batchInferenceJobs.length));
        }
        for (BatchInferenceJobSummary ele : batchInferenceJobs) {
            this.batchInferenceJobs.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list containing information on each job that is returned.
     * </p>
     * 
     * @param batchInferenceJobs
     *        A list containing information on each job that is returned.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListBatchInferenceJobsResult withBatchInferenceJobs(java.util.Collection<BatchInferenceJobSummary> batchInferenceJobs) {
        setBatchInferenceJobs(batchInferenceJobs);
        return this;
    }

    /**
     * <p>
     * The token to use to retreive the next page of results. The value is <code>null</code> when there are no more
     * results to return.
     * </p>
     * 
     * @param nextToken
     *        The token to use to retreive the next page of results. The value is <code>null</code> when there are no
     *        more results to return.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token to use to retreive the next page of results. The value is <code>null</code> when there are no more
     * results to return.
     * </p>
     * 
     * @return The token to use to retreive the next page of results. The value is <code>null</code> when there are no
     *         more results to return.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token to use to retreive the next page of results. The value is <code>null</code> when there are no more
     * results to return.
     * </p>
     * 
     * @param nextToken
     *        The token to use to retreive the next page of results. The value is <code>null</code> when there are no
     *        more results to return.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListBatchInferenceJobsResult withNextToken(String nextToken) {
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
        if (getBatchInferenceJobs() != null)
            sb.append("BatchInferenceJobs: ").append(getBatchInferenceJobs()).append(",");
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

        if (obj instanceof ListBatchInferenceJobsResult == false)
            return false;
        ListBatchInferenceJobsResult other = (ListBatchInferenceJobsResult) obj;
        if (other.getBatchInferenceJobs() == null ^ this.getBatchInferenceJobs() == null)
            return false;
        if (other.getBatchInferenceJobs() != null && other.getBatchInferenceJobs().equals(this.getBatchInferenceJobs()) == false)
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

        hashCode = prime * hashCode + ((getBatchInferenceJobs() == null) ? 0 : getBatchInferenceJobs().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListBatchInferenceJobsResult clone() {
        try {
            return (ListBatchInferenceJobsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
