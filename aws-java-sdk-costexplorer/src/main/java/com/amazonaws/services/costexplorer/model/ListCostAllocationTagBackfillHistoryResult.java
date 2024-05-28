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
package com.amazonaws.services.costexplorer.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ce-2017-10-25/ListCostAllocationTagBackfillHistory"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListCostAllocationTagBackfillHistoryResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * The list of historical cost allocation tag backfill requests.
     * </p>
     */
    private java.util.List<CostAllocationTagBackfillRequest> backfillRequests;
    /**
     * <p>
     * The token to retrieve the next set of results. Amazon Web Services provides the token when the response from a
     * previous call has more results than the maximum page size.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The list of historical cost allocation tag backfill requests.
     * </p>
     * 
     * @return The list of historical cost allocation tag backfill requests.
     */

    public java.util.List<CostAllocationTagBackfillRequest> getBackfillRequests() {
        return backfillRequests;
    }

    /**
     * <p>
     * The list of historical cost allocation tag backfill requests.
     * </p>
     * 
     * @param backfillRequests
     *        The list of historical cost allocation tag backfill requests.
     */

    public void setBackfillRequests(java.util.Collection<CostAllocationTagBackfillRequest> backfillRequests) {
        if (backfillRequests == null) {
            this.backfillRequests = null;
            return;
        }

        this.backfillRequests = new java.util.ArrayList<CostAllocationTagBackfillRequest>(backfillRequests);
    }

    /**
     * <p>
     * The list of historical cost allocation tag backfill requests.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setBackfillRequests(java.util.Collection)} or {@link #withBackfillRequests(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param backfillRequests
     *        The list of historical cost allocation tag backfill requests.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListCostAllocationTagBackfillHistoryResult withBackfillRequests(CostAllocationTagBackfillRequest... backfillRequests) {
        if (this.backfillRequests == null) {
            setBackfillRequests(new java.util.ArrayList<CostAllocationTagBackfillRequest>(backfillRequests.length));
        }
        for (CostAllocationTagBackfillRequest ele : backfillRequests) {
            this.backfillRequests.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of historical cost allocation tag backfill requests.
     * </p>
     * 
     * @param backfillRequests
     *        The list of historical cost allocation tag backfill requests.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListCostAllocationTagBackfillHistoryResult withBackfillRequests(java.util.Collection<CostAllocationTagBackfillRequest> backfillRequests) {
        setBackfillRequests(backfillRequests);
        return this;
    }

    /**
     * <p>
     * The token to retrieve the next set of results. Amazon Web Services provides the token when the response from a
     * previous call has more results than the maximum page size.
     * </p>
     * 
     * @param nextToken
     *        The token to retrieve the next set of results. Amazon Web Services provides the token when the response
     *        from a previous call has more results than the maximum page size.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token to retrieve the next set of results. Amazon Web Services provides the token when the response from a
     * previous call has more results than the maximum page size.
     * </p>
     * 
     * @return The token to retrieve the next set of results. Amazon Web Services provides the token when the response
     *         from a previous call has more results than the maximum page size.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token to retrieve the next set of results. Amazon Web Services provides the token when the response from a
     * previous call has more results than the maximum page size.
     * </p>
     * 
     * @param nextToken
     *        The token to retrieve the next set of results. Amazon Web Services provides the token when the response
     *        from a previous call has more results than the maximum page size.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListCostAllocationTagBackfillHistoryResult withNextToken(String nextToken) {
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
        if (getBackfillRequests() != null)
            sb.append("BackfillRequests: ").append(getBackfillRequests()).append(",");
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

        if (obj instanceof ListCostAllocationTagBackfillHistoryResult == false)
            return false;
        ListCostAllocationTagBackfillHistoryResult other = (ListCostAllocationTagBackfillHistoryResult) obj;
        if (other.getBackfillRequests() == null ^ this.getBackfillRequests() == null)
            return false;
        if (other.getBackfillRequests() != null && other.getBackfillRequests().equals(this.getBackfillRequests()) == false)
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

        hashCode = prime * hashCode + ((getBackfillRequests() == null) ? 0 : getBackfillRequests().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListCostAllocationTagBackfillHistoryResult clone() {
        try {
            return (ListCostAllocationTagBackfillHistoryResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
