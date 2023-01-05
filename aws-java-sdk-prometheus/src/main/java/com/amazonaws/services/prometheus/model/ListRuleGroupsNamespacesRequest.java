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
package com.amazonaws.services.prometheus.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Represents the input of a ListRuleGroupsNamespaces operation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amp-2020-08-01/ListRuleGroupsNamespaces" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListRuleGroupsNamespacesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Maximum results to return in response (default=100, maximum=1000).
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * Optional filter for rule groups namespace name. Only the rule groups namespace that begin with this value will be
     * returned.
     * </p>
     */
    private String name;
    /**
     * <p>
     * Pagination token to request the next page in a paginated list. This token is obtained from the output of the
     * previous ListRuleGroupsNamespaces request.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The ID of the workspace.
     * </p>
     */
    private String workspaceId;

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

    public ListRuleGroupsNamespacesRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * Optional filter for rule groups namespace name. Only the rule groups namespace that begin with this value will be
     * returned.
     * </p>
     * 
     * @param name
     *        Optional filter for rule groups namespace name. Only the rule groups namespace that begin with this value
     *        will be returned.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * Optional filter for rule groups namespace name. Only the rule groups namespace that begin with this value will be
     * returned.
     * </p>
     * 
     * @return Optional filter for rule groups namespace name. Only the rule groups namespace that begin with this value
     *         will be returned.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * Optional filter for rule groups namespace name. Only the rule groups namespace that begin with this value will be
     * returned.
     * </p>
     * 
     * @param name
     *        Optional filter for rule groups namespace name. Only the rule groups namespace that begin with this value
     *        will be returned.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListRuleGroupsNamespacesRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * Pagination token to request the next page in a paginated list. This token is obtained from the output of the
     * previous ListRuleGroupsNamespaces request.
     * </p>
     * 
     * @param nextToken
     *        Pagination token to request the next page in a paginated list. This token is obtained from the output of
     *        the previous ListRuleGroupsNamespaces request.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * Pagination token to request the next page in a paginated list. This token is obtained from the output of the
     * previous ListRuleGroupsNamespaces request.
     * </p>
     * 
     * @return Pagination token to request the next page in a paginated list. This token is obtained from the output of
     *         the previous ListRuleGroupsNamespaces request.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * Pagination token to request the next page in a paginated list. This token is obtained from the output of the
     * previous ListRuleGroupsNamespaces request.
     * </p>
     * 
     * @param nextToken
     *        Pagination token to request the next page in a paginated list. This token is obtained from the output of
     *        the previous ListRuleGroupsNamespaces request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListRuleGroupsNamespacesRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The ID of the workspace.
     * </p>
     * 
     * @param workspaceId
     *        The ID of the workspace.
     */

    public void setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
    }

    /**
     * <p>
     * The ID of the workspace.
     * </p>
     * 
     * @return The ID of the workspace.
     */

    public String getWorkspaceId() {
        return this.workspaceId;
    }

    /**
     * <p>
     * The ID of the workspace.
     * </p>
     * 
     * @param workspaceId
     *        The ID of the workspace.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListRuleGroupsNamespacesRequest withWorkspaceId(String workspaceId) {
        setWorkspaceId(workspaceId);
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getWorkspaceId() != null)
            sb.append("WorkspaceId: ").append(getWorkspaceId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListRuleGroupsNamespacesRequest == false)
            return false;
        ListRuleGroupsNamespacesRequest other = (ListRuleGroupsNamespacesRequest) obj;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getWorkspaceId() == null ^ this.getWorkspaceId() == null)
            return false;
        if (other.getWorkspaceId() != null && other.getWorkspaceId().equals(this.getWorkspaceId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getWorkspaceId() == null) ? 0 : getWorkspaceId().hashCode());
        return hashCode;
    }

    @Override
    public ListRuleGroupsNamespacesRequest clone() {
        return (ListRuleGroupsNamespacesRequest) super.clone();
    }

}
