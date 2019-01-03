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
package com.amazonaws.services.config.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/DescribePendingAggregationRequests"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribePendingAggregationRequestsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * Returns a PendingAggregationRequests object.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<PendingAggregationRequest> pendingAggregationRequests;
    /**
     * <p>
     * The nextToken string returned on a previous page that you use to get the next page of results in a paginated
     * response.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Returns a PendingAggregationRequests object.
     * </p>
     * 
     * @return Returns a PendingAggregationRequests object.
     */

    public java.util.List<PendingAggregationRequest> getPendingAggregationRequests() {
        if (pendingAggregationRequests == null) {
            pendingAggregationRequests = new com.amazonaws.internal.SdkInternalList<PendingAggregationRequest>();
        }
        return pendingAggregationRequests;
    }

    /**
     * <p>
     * Returns a PendingAggregationRequests object.
     * </p>
     * 
     * @param pendingAggregationRequests
     *        Returns a PendingAggregationRequests object.
     */

    public void setPendingAggregationRequests(java.util.Collection<PendingAggregationRequest> pendingAggregationRequests) {
        if (pendingAggregationRequests == null) {
            this.pendingAggregationRequests = null;
            return;
        }

        this.pendingAggregationRequests = new com.amazonaws.internal.SdkInternalList<PendingAggregationRequest>(pendingAggregationRequests);
    }

    /**
     * <p>
     * Returns a PendingAggregationRequests object.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPendingAggregationRequests(java.util.Collection)} or
     * {@link #withPendingAggregationRequests(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param pendingAggregationRequests
     *        Returns a PendingAggregationRequests object.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribePendingAggregationRequestsResult withPendingAggregationRequests(PendingAggregationRequest... pendingAggregationRequests) {
        if (this.pendingAggregationRequests == null) {
            setPendingAggregationRequests(new com.amazonaws.internal.SdkInternalList<PendingAggregationRequest>(pendingAggregationRequests.length));
        }
        for (PendingAggregationRequest ele : pendingAggregationRequests) {
            this.pendingAggregationRequests.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Returns a PendingAggregationRequests object.
     * </p>
     * 
     * @param pendingAggregationRequests
     *        Returns a PendingAggregationRequests object.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribePendingAggregationRequestsResult withPendingAggregationRequests(java.util.Collection<PendingAggregationRequest> pendingAggregationRequests) {
        setPendingAggregationRequests(pendingAggregationRequests);
        return this;
    }

    /**
     * <p>
     * The nextToken string returned on a previous page that you use to get the next page of results in a paginated
     * response.
     * </p>
     * 
     * @param nextToken
     *        The nextToken string returned on a previous page that you use to get the next page of results in a
     *        paginated response.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The nextToken string returned on a previous page that you use to get the next page of results in a paginated
     * response.
     * </p>
     * 
     * @return The nextToken string returned on a previous page that you use to get the next page of results in a
     *         paginated response.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The nextToken string returned on a previous page that you use to get the next page of results in a paginated
     * response.
     * </p>
     * 
     * @param nextToken
     *        The nextToken string returned on a previous page that you use to get the next page of results in a
     *        paginated response.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribePendingAggregationRequestsResult withNextToken(String nextToken) {
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
        if (getPendingAggregationRequests() != null)
            sb.append("PendingAggregationRequests: ").append(getPendingAggregationRequests()).append(",");
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

        if (obj instanceof DescribePendingAggregationRequestsResult == false)
            return false;
        DescribePendingAggregationRequestsResult other = (DescribePendingAggregationRequestsResult) obj;
        if (other.getPendingAggregationRequests() == null ^ this.getPendingAggregationRequests() == null)
            return false;
        if (other.getPendingAggregationRequests() != null && other.getPendingAggregationRequests().equals(this.getPendingAggregationRequests()) == false)
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

        hashCode = prime * hashCode + ((getPendingAggregationRequests() == null) ? 0 : getPendingAggregationRequests().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public DescribePendingAggregationRequestsResult clone() {
        try {
            return (DescribePendingAggregationRequestsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
