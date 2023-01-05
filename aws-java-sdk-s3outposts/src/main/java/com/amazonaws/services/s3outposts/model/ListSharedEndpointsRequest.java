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
package com.amazonaws.services.s3outposts.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3outposts-2017-07-25/ListSharedEndpoints" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListSharedEndpointsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * If a previous response from this operation included a <code>NextToken</code> value, you can provide that value
     * here to retrieve the next page of results.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The maximum number of endpoints that will be returned in the response.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * The ID of the Amazon Web Services Outpost.
     * </p>
     */
    private String outpostId;

    /**
     * <p>
     * If a previous response from this operation included a <code>NextToken</code> value, you can provide that value
     * here to retrieve the next page of results.
     * </p>
     * 
     * @param nextToken
     *        If a previous response from this operation included a <code>NextToken</code> value, you can provide that
     *        value here to retrieve the next page of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If a previous response from this operation included a <code>NextToken</code> value, you can provide that value
     * here to retrieve the next page of results.
     * </p>
     * 
     * @return If a previous response from this operation included a <code>NextToken</code> value, you can provide that
     *         value here to retrieve the next page of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If a previous response from this operation included a <code>NextToken</code> value, you can provide that value
     * here to retrieve the next page of results.
     * </p>
     * 
     * @param nextToken
     *        If a previous response from this operation included a <code>NextToken</code> value, you can provide that
     *        value here to retrieve the next page of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListSharedEndpointsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The maximum number of endpoints that will be returned in the response.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of endpoints that will be returned in the response.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of endpoints that will be returned in the response.
     * </p>
     * 
     * @return The maximum number of endpoints that will be returned in the response.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of endpoints that will be returned in the response.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of endpoints that will be returned in the response.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListSharedEndpointsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * The ID of the Amazon Web Services Outpost.
     * </p>
     * 
     * @param outpostId
     *        The ID of the Amazon Web Services Outpost.
     */

    public void setOutpostId(String outpostId) {
        this.outpostId = outpostId;
    }

    /**
     * <p>
     * The ID of the Amazon Web Services Outpost.
     * </p>
     * 
     * @return The ID of the Amazon Web Services Outpost.
     */

    public String getOutpostId() {
        return this.outpostId;
    }

    /**
     * <p>
     * The ID of the Amazon Web Services Outpost.
     * </p>
     * 
     * @param outpostId
     *        The ID of the Amazon Web Services Outpost.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListSharedEndpointsRequest withOutpostId(String outpostId) {
        setOutpostId(outpostId);
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
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
        if (getOutpostId() != null)
            sb.append("OutpostId: ").append(getOutpostId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListSharedEndpointsRequest == false)
            return false;
        ListSharedEndpointsRequest other = (ListSharedEndpointsRequest) obj;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getOutpostId() == null ^ this.getOutpostId() == null)
            return false;
        if (other.getOutpostId() != null && other.getOutpostId().equals(this.getOutpostId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getOutpostId() == null) ? 0 : getOutpostId().hashCode());
        return hashCode;
    }

    @Override
    public ListSharedEndpointsRequest clone() {
        return (ListSharedEndpointsRequest) super.clone();
    }

}
