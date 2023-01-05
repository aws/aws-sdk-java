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
package com.amazonaws.services.migrationhubstrategyrecommendations.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/migrationhubstrategy-2020-02-19/GetServerDetails"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetServerDetailsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The maximum number of items to include in the response. The maximum value is 100.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * The token from a previous call that you use to retrieve the next set of results. For example, if a previous call
     * to this action returned 100 items, but you set <code>maxResults</code> to 10. You'll receive a set of 10 results
     * along with a token. You then use the returned token to retrieve the next set of 10.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The ID of the server.
     * </p>
     */
    private String serverId;

    /**
     * <p>
     * The maximum number of items to include in the response. The maximum value is 100.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of items to include in the response. The maximum value is 100.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of items to include in the response. The maximum value is 100.
     * </p>
     * 
     * @return The maximum number of items to include in the response. The maximum value is 100.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of items to include in the response. The maximum value is 100.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of items to include in the response. The maximum value is 100.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetServerDetailsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * The token from a previous call that you use to retrieve the next set of results. For example, if a previous call
     * to this action returned 100 items, but you set <code>maxResults</code> to 10. You'll receive a set of 10 results
     * along with a token. You then use the returned token to retrieve the next set of 10.
     * </p>
     * 
     * @param nextToken
     *        The token from a previous call that you use to retrieve the next set of results. For example, if a
     *        previous call to this action returned 100 items, but you set <code>maxResults</code> to 10. You'll receive
     *        a set of 10 results along with a token. You then use the returned token to retrieve the next set of 10.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token from a previous call that you use to retrieve the next set of results. For example, if a previous call
     * to this action returned 100 items, but you set <code>maxResults</code> to 10. You'll receive a set of 10 results
     * along with a token. You then use the returned token to retrieve the next set of 10.
     * </p>
     * 
     * @return The token from a previous call that you use to retrieve the next set of results. For example, if a
     *         previous call to this action returned 100 items, but you set <code>maxResults</code> to 10. You'll
     *         receive a set of 10 results along with a token. You then use the returned token to retrieve the next set
     *         of 10.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token from a previous call that you use to retrieve the next set of results. For example, if a previous call
     * to this action returned 100 items, but you set <code>maxResults</code> to 10. You'll receive a set of 10 results
     * along with a token. You then use the returned token to retrieve the next set of 10.
     * </p>
     * 
     * @param nextToken
     *        The token from a previous call that you use to retrieve the next set of results. For example, if a
     *        previous call to this action returned 100 items, but you set <code>maxResults</code> to 10. You'll receive
     *        a set of 10 results along with a token. You then use the returned token to retrieve the next set of 10.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetServerDetailsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The ID of the server.
     * </p>
     * 
     * @param serverId
     *        The ID of the server.
     */

    public void setServerId(String serverId) {
        this.serverId = serverId;
    }

    /**
     * <p>
     * The ID of the server.
     * </p>
     * 
     * @return The ID of the server.
     */

    public String getServerId() {
        return this.serverId;
    }

    /**
     * <p>
     * The ID of the server.
     * </p>
     * 
     * @param serverId
     *        The ID of the server.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetServerDetailsRequest withServerId(String serverId) {
        setServerId(serverId);
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
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getServerId() != null)
            sb.append("ServerId: ").append(getServerId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetServerDetailsRequest == false)
            return false;
        GetServerDetailsRequest other = (GetServerDetailsRequest) obj;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getServerId() == null ^ this.getServerId() == null)
            return false;
        if (other.getServerId() != null && other.getServerId().equals(this.getServerId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getServerId() == null) ? 0 : getServerId().hashCode());
        return hashCode;
    }

    @Override
    public GetServerDetailsRequest clone() {
        return (GetServerDetailsRequest) super.clone();
    }

}
