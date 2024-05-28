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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/grafana-2020-08-18/ListWorkspaceServiceAccounts"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListWorkspaceServiceAccountsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The token to use when requesting the next set of service accounts.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * An array of structures containing information about the service accounts.
     * </p>
     */
    private java.util.List<ServiceAccountSummary> serviceAccounts;
    /**
     * <p>
     * The workspace to which the service accounts are associated.
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

    public ListWorkspaceServiceAccountsResult withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * An array of structures containing information about the service accounts.
     * </p>
     * 
     * @return An array of structures containing information about the service accounts.
     */

    public java.util.List<ServiceAccountSummary> getServiceAccounts() {
        return serviceAccounts;
    }

    /**
     * <p>
     * An array of structures containing information about the service accounts.
     * </p>
     * 
     * @param serviceAccounts
     *        An array of structures containing information about the service accounts.
     */

    public void setServiceAccounts(java.util.Collection<ServiceAccountSummary> serviceAccounts) {
        if (serviceAccounts == null) {
            this.serviceAccounts = null;
            return;
        }

        this.serviceAccounts = new java.util.ArrayList<ServiceAccountSummary>(serviceAccounts);
    }

    /**
     * <p>
     * An array of structures containing information about the service accounts.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setServiceAccounts(java.util.Collection)} or {@link #withServiceAccounts(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param serviceAccounts
     *        An array of structures containing information about the service accounts.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListWorkspaceServiceAccountsResult withServiceAccounts(ServiceAccountSummary... serviceAccounts) {
        if (this.serviceAccounts == null) {
            setServiceAccounts(new java.util.ArrayList<ServiceAccountSummary>(serviceAccounts.length));
        }
        for (ServiceAccountSummary ele : serviceAccounts) {
            this.serviceAccounts.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of structures containing information about the service accounts.
     * </p>
     * 
     * @param serviceAccounts
     *        An array of structures containing information about the service accounts.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListWorkspaceServiceAccountsResult withServiceAccounts(java.util.Collection<ServiceAccountSummary> serviceAccounts) {
        setServiceAccounts(serviceAccounts);
        return this;
    }

    /**
     * <p>
     * The workspace to which the service accounts are associated.
     * </p>
     * 
     * @param workspaceId
     *        The workspace to which the service accounts are associated.
     */

    public void setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
    }

    /**
     * <p>
     * The workspace to which the service accounts are associated.
     * </p>
     * 
     * @return The workspace to which the service accounts are associated.
     */

    public String getWorkspaceId() {
        return this.workspaceId;
    }

    /**
     * <p>
     * The workspace to which the service accounts are associated.
     * </p>
     * 
     * @param workspaceId
     *        The workspace to which the service accounts are associated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListWorkspaceServiceAccountsResult withWorkspaceId(String workspaceId) {
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
        if (getServiceAccounts() != null)
            sb.append("ServiceAccounts: ").append(getServiceAccounts()).append(",");
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

        if (obj instanceof ListWorkspaceServiceAccountsResult == false)
            return false;
        ListWorkspaceServiceAccountsResult other = (ListWorkspaceServiceAccountsResult) obj;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getServiceAccounts() == null ^ this.getServiceAccounts() == null)
            return false;
        if (other.getServiceAccounts() != null && other.getServiceAccounts().equals(this.getServiceAccounts()) == false)
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
        hashCode = prime * hashCode + ((getServiceAccounts() == null) ? 0 : getServiceAccounts().hashCode());
        hashCode = prime * hashCode + ((getWorkspaceId() == null) ? 0 : getWorkspaceId().hashCode());
        return hashCode;
    }

    @Override
    public ListWorkspaceServiceAccountsResult clone() {
        try {
            return (ListWorkspaceServiceAccountsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
