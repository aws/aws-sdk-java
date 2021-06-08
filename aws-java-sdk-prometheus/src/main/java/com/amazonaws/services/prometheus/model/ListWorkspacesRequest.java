/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.prometheus.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Represents the input of a ListWorkspaces operation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amp-2020-08-01/ListWorkspaces" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListWorkspacesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Optional filter for workspace alias. Only the workspaces with aliases that begin with this value will be
     * returned.
     * </p>
     */
    private String alias;
    /**
     * <p>
     * Maximum results to return in response (default=100, maximum=1000).
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * Pagination token to request the next page in a paginated list. This token is obtained from the output of the
     * previous ListWorkspaces request.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Optional filter for workspace alias. Only the workspaces with aliases that begin with this value will be
     * returned.
     * </p>
     * 
     * @param alias
     *        Optional filter for workspace alias. Only the workspaces with aliases that begin with this value will be
     *        returned.
     */

    public void setAlias(String alias) {
        this.alias = alias;
    }

    /**
     * <p>
     * Optional filter for workspace alias. Only the workspaces with aliases that begin with this value will be
     * returned.
     * </p>
     * 
     * @return Optional filter for workspace alias. Only the workspaces with aliases that begin with this value will be
     *         returned.
     */

    public String getAlias() {
        return this.alias;
    }

    /**
     * <p>
     * Optional filter for workspace alias. Only the workspaces with aliases that begin with this value will be
     * returned.
     * </p>
     * 
     * @param alias
     *        Optional filter for workspace alias. Only the workspaces with aliases that begin with this value will be
     *        returned.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListWorkspacesRequest withAlias(String alias) {
        setAlias(alias);
        return this;
    }

    /**
     * <p>
     * Maximum results to return in response (default=100, maximum=1000).
     * </p>
     * 
     * @param maxResults
     *        Maximum results to return in response (default=100, maximum=1000).
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * Maximum results to return in response (default=100, maximum=1000).
     * </p>
     * 
     * @return Maximum results to return in response (default=100, maximum=1000).
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * Maximum results to return in response (default=100, maximum=1000).
     * </p>
     * 
     * @param maxResults
     *        Maximum results to return in response (default=100, maximum=1000).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListWorkspacesRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * Pagination token to request the next page in a paginated list. This token is obtained from the output of the
     * previous ListWorkspaces request.
     * </p>
     * 
     * @param nextToken
     *        Pagination token to request the next page in a paginated list. This token is obtained from the output of
     *        the previous ListWorkspaces request.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * Pagination token to request the next page in a paginated list. This token is obtained from the output of the
     * previous ListWorkspaces request.
     * </p>
     * 
     * @return Pagination token to request the next page in a paginated list. This token is obtained from the output of
     *         the previous ListWorkspaces request.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * Pagination token to request the next page in a paginated list. This token is obtained from the output of the
     * previous ListWorkspaces request.
     * </p>
     * 
     * @param nextToken
     *        Pagination token to request the next page in a paginated list. This token is obtained from the output of
     *        the previous ListWorkspaces request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListWorkspacesRequest withNextToken(String nextToken) {
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
        if (getAlias() != null)
            sb.append("Alias: ").append(getAlias()).append(",");
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

        if (obj instanceof ListWorkspacesRequest == false)
            return false;
        ListWorkspacesRequest other = (ListWorkspacesRequest) obj;
        if (other.getAlias() == null ^ this.getAlias() == null)
            return false;
        if (other.getAlias() != null && other.getAlias().equals(this.getAlias()) == false)
            return false;
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

        hashCode = prime * hashCode + ((getAlias() == null) ? 0 : getAlias().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListWorkspacesRequest clone() {
        return (ListWorkspacesRequest) super.clone();
    }

}
