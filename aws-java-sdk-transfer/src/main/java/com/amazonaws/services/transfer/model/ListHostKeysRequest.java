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
package com.amazonaws.services.transfer.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transfer-2018-11-05/ListHostKeys" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListHostKeysRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The maximum number of host keys to return.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * When there are additional results that were not returned, a <code>NextToken</code> parameter is returned. You can
     * use that value for a subsequent call to <code>ListHostKeys</code> to continue listing results.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The identifier of the server that contains the host keys that you want to view.
     * </p>
     */
    private String serverId;

    /**
     * <p>
     * The maximum number of host keys to return.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of host keys to return.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of host keys to return.
     * </p>
     * 
     * @return The maximum number of host keys to return.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of host keys to return.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of host keys to return.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListHostKeysRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * When there are additional results that were not returned, a <code>NextToken</code> parameter is returned. You can
     * use that value for a subsequent call to <code>ListHostKeys</code> to continue listing results.
     * </p>
     * 
     * @param nextToken
     *        When there are additional results that were not returned, a <code>NextToken</code> parameter is returned.
     *        You can use that value for a subsequent call to <code>ListHostKeys</code> to continue listing results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * When there are additional results that were not returned, a <code>NextToken</code> parameter is returned. You can
     * use that value for a subsequent call to <code>ListHostKeys</code> to continue listing results.
     * </p>
     * 
     * @return When there are additional results that were not returned, a <code>NextToken</code> parameter is returned.
     *         You can use that value for a subsequent call to <code>ListHostKeys</code> to continue listing results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * When there are additional results that were not returned, a <code>NextToken</code> parameter is returned. You can
     * use that value for a subsequent call to <code>ListHostKeys</code> to continue listing results.
     * </p>
     * 
     * @param nextToken
     *        When there are additional results that were not returned, a <code>NextToken</code> parameter is returned.
     *        You can use that value for a subsequent call to <code>ListHostKeys</code> to continue listing results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListHostKeysRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The identifier of the server that contains the host keys that you want to view.
     * </p>
     * 
     * @param serverId
     *        The identifier of the server that contains the host keys that you want to view.
     */

    public void setServerId(String serverId) {
        this.serverId = serverId;
    }

    /**
     * <p>
     * The identifier of the server that contains the host keys that you want to view.
     * </p>
     * 
     * @return The identifier of the server that contains the host keys that you want to view.
     */

    public String getServerId() {
        return this.serverId;
    }

    /**
     * <p>
     * The identifier of the server that contains the host keys that you want to view.
     * </p>
     * 
     * @param serverId
     *        The identifier of the server that contains the host keys that you want to view.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListHostKeysRequest withServerId(String serverId) {
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

        if (obj instanceof ListHostKeysRequest == false)
            return false;
        ListHostKeysRequest other = (ListHostKeysRequest) obj;
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
    public ListHostKeysRequest clone() {
        return (ListHostKeysRequest) super.clone();
    }

}
