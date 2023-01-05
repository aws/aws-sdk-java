/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/personalize-2018-05-22/ListBatchSegmentJobs" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListBatchSegmentJobsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A list containing information on each job that is returned.
     * </p>
     */
    private java.util.List<BatchSegmentJobSummary> batchSegmentJobs;
    /**
     * <p>
     * The token to use to retrieve the next page of results. The value is <code>null</code> when there are no more
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

    public java.util.List<BatchSegmentJobSummary> getBatchSegmentJobs() {
        return batchSegmentJobs;
    }

    /**
     * <p>
     * A list containing information on each job that is returned.
     * </p>
     * 
     * @param batchSegmentJobs
     *        A list containing information on each job that is returned.
     */

    public void setBatchSegmentJobs(java.util.Collection<BatchSegmentJobSummary> batchSegmentJobs) {
        if (batchSegmentJobs == null) {
            this.batchSegmentJobs = null;
            return;
        }

        this.batchSegmentJobs = new java.util.ArrayList<BatchSegmentJobSummary>(batchSegmentJobs);
    }

    /**
     * <p>
     * A list containing information on each job that is returned.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setBatchSegmentJobs(java.util.Collection)} or {@link #withBatchSegmentJobs(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param batchSegmentJobs
     *        A list containing information on each job that is returned.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListBatchSegmentJobsResult withBatchSegmentJobs(BatchSegmentJobSummary... batchSegmentJobs) {
        if (this.batchSegmentJobs == null) {
            setBatchSegmentJobs(new java.util.ArrayList<BatchSegmentJobSummary>(batchSegmentJobs.length));
        }
        for (BatchSegmentJobSummary ele : batchSegmentJobs) {
            this.batchSegmentJobs.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list containing information on each job that is returned.
     * </p>
     * 
     * @param batchSegmentJobs
     *        A list containing information on each job that is returned.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListBatchSegmentJobsResult withBatchSegmentJobs(java.util.Collection<BatchSegmentJobSummary> batchSegmentJobs) {
        setBatchSegmentJobs(batchSegmentJobs);
        return this;
    }

    /**
     * <p>
     * The token to use to retrieve the next page of results. The value is <code>null</code> when there are no more
     * results to return.
     * </p>
     * 
     * @param nextToken
     *        The token to use to retrieve the next page of results. The value is <code>null</code> when there are no
     *        more results to return.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token to use to retrieve the next page of results. The value is <code>null</code> when there are no more
     * results to return.
     * </p>
     * 
     * @return The token to use to retrieve the next page of results. The value is <code>null</code> when there are no
     *         more results to return.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token to use to retrieve the next page of results. The value is <code>null</code> when there are no more
     * results to return.
     * </p>
     * 
     * @param nextToken
     *        The token to use to retrieve the next page of results. The value is <code>null</code> when there are no
     *        more results to return.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListBatchSegmentJobsResult withNextToken(String nextToken) {
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
        if (getBatchSegmentJobs() != null)
            sb.append("BatchSegmentJobs: ").append(getBatchSegmentJobs()).append(",");
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

        if (obj instanceof ListBatchSegmentJobsResult == false)
            return false;
        ListBatchSegmentJobsResult other = (ListBatchSegmentJobsResult) obj;
        if (other.getBatchSegmentJobs() == null ^ this.getBatchSegmentJobs() == null)
            return false;
        if (other.getBatchSegmentJobs() != null && other.getBatchSegmentJobs().equals(this.getBatchSegmentJobs()) == false)
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

        hashCode = prime * hashCode + ((getBatchSegmentJobs() == null) ? 0 : getBatchSegmentJobs().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListBatchSegmentJobsResult clone() {
        try {
            return (ListBatchSegmentJobsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
