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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/grafana-2020-08-18/ListWorkspaceServiceAccountTokens"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListWorkspaceServiceAccountTokensResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * The token to use when requesting the next set of service accounts.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The ID of the service account where the tokens reside.
     * </p>
     */
    private String serviceAccountId;
    /**
     * <p>
     * An array of structures containing information about the tokens.
     * </p>
     */
    private java.util.List<ServiceAccountTokenSummary> serviceAccountTokens;
    /**
     * <p>
     * The ID of the workspace where the tokens reside.
     * </p>
     */
    private String workspaceId;

    /**
     * <p>
     * The token to use when requesting the next set of service accounts.
     * </p>
     * 
     * @param nextToken
     *        The token to use when requesting the next set of service accounts.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token to use when requesting the next set of service accounts.
     * </p>
     * 
     * @return The token to use when requesting the next set of service accounts.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token to use when requesting the next set of service accounts.
     * </p>
     * 
     * @param nextToken
     *        The token to use when requesting the next set of service accounts.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListWorkspaceServiceAccountTokensResult withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The ID of the service account where the tokens reside.
     * </p>
     * 
     * @param serviceAccountId
     *        The ID of the service account where the tokens reside.
     */

    public void setServiceAccountId(String serviceAccountId) {
        this.serviceAccountId = serviceAccountId;
    }

    /**
     * <p>
     * The ID of the service account where the tokens reside.
     * </p>
     * 
     * @return The ID of the service account where the tokens reside.
     */

    public String getServiceAccountId() {
        return this.serviceAccountId;
    }

    /**
     * <p>
     * The ID of the service account where the tokens reside.
     * </p>
     * 
     * @param serviceAccountId
     *        The ID of the service account where the tokens reside.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListWorkspaceServiceAccountTokensResult withServiceAccountId(String serviceAccountId) {
        setServiceAccountId(serviceAccountId);
        return this;
    }

    /**
     * <p>
     * An array of structures containing information about the tokens.
     * </p>
     * 
     * @return An array of structures containing information about the tokens.
     */

    public java.util.List<ServiceAccountTokenSummary> getServiceAccountTokens() {
        return serviceAccountTokens;
    }

    /**
     * <p>
     * An array of structures containing information about the tokens.
     * </p>
     * 
     * @param serviceAccountTokens
     *        An array of structures containing information about the tokens.
     */

    public void setServiceAccountTokens(java.util.Collection<ServiceAccountTokenSummary> serviceAccountTokens) {
        if (serviceAccountTokens == null) {
            this.serviceAccountTokens = null;
            return;
        }

        this.serviceAccountTokens = new java.util.ArrayList<ServiceAccountTokenSummary>(serviceAccountTokens);
    }

    /**
     * <p>
     * An array of structures containing information about the tokens.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setServiceAccountTokens(java.util.Collection)} or {@link #withServiceAccountTokens(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param serviceAccountTokens
     *        An array of structures containing information about the tokens.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListWorkspaceServiceAccountTokensResult withServiceAccountTokens(ServiceAccountTokenSummary... serviceAccountTokens) {
        if (this.serviceAccountTokens == null) {
            setServiceAccountTokens(new java.util.ArrayList<ServiceAccountTokenSummary>(serviceAccountTokens.length));
        }
        for (ServiceAccountTokenSummary ele : serviceAccountTokens) {
            this.serviceAccountTokens.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of structures containing information about the tokens.
     * </p>
     * 
     * @param serviceAccountTokens
     *        An array of structures containing information about the tokens.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListWorkspaceServiceAccountTokensResult withServiceAccountTokens(java.util.Collection<ServiceAccountTokenSummary> serviceAccountTokens) {
        setServiceAccountTokens(serviceAccountTokens);
        return this;
    }

    /**
     * <p>
     * The ID of the workspace where the tokens reside.
     * </p>
     * 
     * @param workspaceId
     *        The ID of the workspace where the tokens reside.
     */

    public void setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
    }

    /**
     * <p>
     * The ID of the workspace where the tokens reside.
     * </p>
     * 
     * @return The ID of the workspace where the tokens reside.
     */

    public String getWorkspaceId() {
        return this.workspaceId;
    }

    /**
     * <p>
     * The ID of the workspace where the tokens reside.
     * </p>
     * 
     * @param workspaceId
     *        The ID of the workspace where the tokens reside.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListWorkspaceServiceAccountTokensResult withWorkspaceId(String workspaceId) {
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
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getServiceAccountId() != null)
            sb.append("ServiceAccountId: ").append(getServiceAccountId()).append(",");
        if (getServiceAccountTokens() != null)
            sb.append("ServiceAccountTokens: ").append(getServiceAccountTokens()).append(",");
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

        if (obj instanceof ListWorkspaceServiceAccountTokensResult == false)
            return false;
        ListWorkspaceServiceAccountTokensResult other = (ListWorkspaceServiceAccountTokensResult) obj;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getServiceAccountId() == null ^ this.getServiceAccountId() == null)
            return false;
        if (other.getServiceAccountId() != null && other.getServiceAccountId().equals(this.getServiceAccountId()) == false)
            return false;
        if (other.getServiceAccountTokens() == null ^ this.getServiceAccountTokens() == null)
            return false;
        if (other.getServiceAccountTokens() != null && other.getServiceAccountTokens().equals(this.getServiceAccountTokens()) == false)
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

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getServiceAccountId() == null) ? 0 : getServiceAccountId().hashCode());
        hashCode = prime * hashCode + ((getServiceAccountTokens() == null) ? 0 : getServiceAccountTokens().hashCode());
        hashCode = prime * hashCode + ((getWorkspaceId() == null) ? 0 : getWorkspaceId().hashCode());
        return hashCode;
    }

    @Override
    public ListWorkspaceServiceAccountTokensResult clone() {
        try {
            return (ListWorkspaceServiceAccountTokensResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
