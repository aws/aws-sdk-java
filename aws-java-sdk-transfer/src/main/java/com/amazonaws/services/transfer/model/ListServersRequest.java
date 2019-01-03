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
package com.amazonaws.services.transfer.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transfer-2018-11-05/ListServers" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListServersRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Specifies the number of servers to return as a response to the <code>ListServers</code> query.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * When additional results are obtained from the ListServers command, a <code>NextToken</code> parameter is returned
     * in the output. You can then pass the <code>NextToken</code> parameter in a subsequent command to continue listing
     * additional servers.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Specifies the number of servers to return as a response to the <code>ListServers</code> query.
     * </p>
     * 
     * @param maxResults
     *        Specifies the number of servers to return as a response to the <code>ListServers</code> query.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * Specifies the number of servers to return as a response to the <code>ListServers</code> query.
     * </p>
     * 
     * @return Specifies the number of servers to return as a response to the <code>ListServers</code> query.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * Specifies the number of servers to return as a response to the <code>ListServers</code> query.
     * </p>
     * 
     * @param maxResults
     *        Specifies the number of servers to return as a response to the <code>ListServers</code> query.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListServersRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * When additional results are obtained from the ListServers command, a <code>NextToken</code> parameter is returned
     * in the output. You can then pass the <code>NextToken</code> parameter in a subsequent command to continue listing
     * additional servers.
     * </p>
     * 
     * @param nextToken
     *        When additional results are obtained from the ListServers command, a <code>NextToken</code> parameter is
     *        returned in the output. You can then pass the <code>NextToken</code> parameter in a subsequent command to
     *        continue listing additional servers.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * When additional results are obtained from the ListServers command, a <code>NextToken</code> parameter is returned
     * in the output. You can then pass the <code>NextToken</code> parameter in a subsequent command to continue listing
     * additional servers.
     * </p>
     * 
     * @return When additional results are obtained from the ListServers command, a <code>NextToken</code> parameter is
     *         returned in the output. You can then pass the <code>NextToken</code> parameter in a subsequent command to
     *         continue listing additional servers.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * When additional results are obtained from the ListServers command, a <code>NextToken</code> parameter is returned
     * in the output. You can then pass the <code>NextToken</code> parameter in a subsequent command to continue listing
     * additional servers.
     * </p>
     * 
     * @param nextToken
     *        When additional results are obtained from the ListServers command, a <code>NextToken</code> parameter is
     *        returned in the output. You can then pass the <code>NextToken</code> parameter in a subsequent command to
     *        continue listing additional servers.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListServersRequest withNextToken(String nextToken) {
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
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
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

        if (obj instanceof ListServersRequest == false)
            return false;
        ListServersRequest other = (ListServersRequest) obj;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
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

        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListServersRequest clone() {
        return (ListServersRequest) super.clone();
    }

}
