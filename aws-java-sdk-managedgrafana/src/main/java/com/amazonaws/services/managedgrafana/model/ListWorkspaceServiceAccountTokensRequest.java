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
package com.amazonaws.services.managedgrafana.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/grafana-2020-08-18/ListWorkspaceServiceAccountTokens"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListWorkspaceServiceAccountTokensRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The maximum number of tokens to include in the results.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * The token for the next set of service accounts to return. (You receive this token from a previous
     * <code>ListWorkspaceServiceAccountTokens</code> operation.)
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The ID of the service account for which to return tokens.
     * </p>
     */
    private String serviceAccountId;
    /**
     * <p>
     * The ID of the workspace for which to return tokens.
     * </p>
     */
    private String workspaceId;

    /**
     * <p>
     * The maximum number of tokens to include in the results.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of tokens to include in the results.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of tokens to include in the results.
     * </p>
     * 
     * @return The maximum number of tokens to include in the results.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of tokens to include in the results.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of tokens to include in the results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListWorkspaceServiceAccountTokensRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * The token for the next set of service accounts to return. (You receive this token from a previous
     * <code>ListWorkspaceServiceAccountTokens</code> operation.)
     * </p>
     * 
     * @param nextToken
     *        The token for the next set of service accounts to return. (You receive this token from a previous
     *        <code>ListWorkspaceServiceAccountTokens</code> operation.)
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token for the next set of service accounts to return. (You receive this token from a previous
     * <code>ListWorkspaceServiceAccountTokens</code> operation.)
     * </p>
     * 
     * @return The token for the next set of service accounts to return. (You receive this token from a previous
     *         <code>ListWorkspaceServiceAccountTokens</code> operation.)
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token for the next set of service accounts to return. (You receive this token from a previous
     * <code>ListWorkspaceServiceAccountTokens</code> operation.)
     * </p>
     * 
     * @param nextToken
     *        The token for the next set of service accounts to return. (You receive this token from a previous
     *        <code>ListWorkspaceServiceAccountTokens</code> operation.)
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListWorkspaceServiceAccountTokensRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The ID of the service account for which to return tokens.
     * </p>
     * 
     * @param serviceAccountId
     *        The ID of the service account for which to return tokens.
     */

    public void setServiceAccountId(String serviceAccountId) {
        this.serviceAccountId = serviceAccountId;
    }

    /**
     * <p>
     * The ID of the service account for which to return tokens.
     * </p>
     * 
     * @return The ID of the service account for which to return tokens.
     */

    public String getServiceAccountId() {
        return this.serviceAccountId;
    }

    /**
     * <p>
     * The ID of the service account for which to return tokens.
     * </p>
     * 
     * @param serviceAccountId
     *        The ID of the service account for which to return tokens.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListWorkspaceServiceAccountTokensRequest withServiceAccountId(String serviceAccountId) {
        setServiceAccountId(serviceAccountId);
        return this;
    }

    /**
     * <p>
     * The ID of the workspace for which to return tokens.
     * </p>
     * 
     * @param workspaceId
     *        The ID of the workspace for which to return tokens.
     */

    public void setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
    }

    /**
     * <p>
     * The ID of the workspace for which to return tokens.
     * </p>
     * 
     * @return The ID of the workspace for which to return tokens.
     */

    public String getWorkspaceId() {
        return this.workspaceId;
    }

    /**
     * <p>
     * The ID of the workspace for which to return tokens.
     * </p>
     * 
     * @param workspaceId
     *        The ID of the workspace for which to return tokens.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListWorkspaceServiceAccountTokensRequest withWorkspaceId(String workspaceId) {
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
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getServiceAccountId() != null)
            sb.append("ServiceAccountId: ").append(getServiceAccountId()).append(",");
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

        if (obj instanceof ListWorkspaceServiceAccountTokensRequest == false)
            return false;
        ListWorkspaceServiceAccountTokensRequest other = (ListWorkspaceServiceAccountTokensRequest) obj;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getServiceAccountId() == null ^ this.getServiceAccountId() == null)
            return false;
        if (other.getServiceAccountId() != null && other.getServiceAccountId().equals(this.getServiceAccountId()) == false)
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
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getServiceAccountId() == null) ? 0 : getServiceAccountId().hashCode());
        hashCode = prime * hashCode + ((getWorkspaceId() == null) ? 0 : getWorkspaceId().hashCode());
        return hashCode;
    }

    @Override
    public ListWorkspaceServiceAccountTokensRequest clone() {
        return (ListWorkspaceServiceAccountTokensRequest) super.clone();
    }

}
