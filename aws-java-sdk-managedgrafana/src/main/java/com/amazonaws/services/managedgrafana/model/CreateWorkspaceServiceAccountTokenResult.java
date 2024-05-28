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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/grafana-2020-08-18/CreateWorkspaceServiceAccountToken"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateWorkspaceServiceAccountTokenResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * The ID of the service account where the token was created.
     * </p>
     */
    private String serviceAccountId;
    /**
     * <p>
     * Information about the created token, including the key. Be sure to store the key securely.
     * </p>
     */
    private ServiceAccountTokenSummaryWithKey serviceAccountToken;
    /**
     * <p>
     * The ID of the workspace where the token was created.
     * </p>
     */
    private String workspaceId;

    /**
     * <p>
     * The ID of the service account where the token was created.
     * </p>
     * 
     * @param serviceAccountId
     *        The ID of the service account where the token was created.
     */

    public void setServiceAccountId(String serviceAccountId) {
        this.serviceAccountId = serviceAccountId;
    }

    /**
     * <p>
     * The ID of the service account where the token was created.
     * </p>
     * 
     * @return The ID of the service account where the token was created.
     */

    public String getServiceAccountId() {
        return this.serviceAccountId;
    }

    /**
     * <p>
     * The ID of the service account where the token was created.
     * </p>
     * 
     * @param serviceAccountId
     *        The ID of the service account where the token was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateWorkspaceServiceAccountTokenResult withServiceAccountId(String serviceAccountId) {
        setServiceAccountId(serviceAccountId);
        return this;
    }

    /**
     * <p>
     * Information about the created token, including the key. Be sure to store the key securely.
     * </p>
     * 
     * @param serviceAccountToken
     *        Information about the created token, including the key. Be sure to store the key securely.
     */

    public void setServiceAccountToken(ServiceAccountTokenSummaryWithKey serviceAccountToken) {
        this.serviceAccountToken = serviceAccountToken;
    }

    /**
     * <p>
     * Information about the created token, including the key. Be sure to store the key securely.
     * </p>
     * 
     * @return Information about the created token, including the key. Be sure to store the key securely.
     */

    public ServiceAccountTokenSummaryWithKey getServiceAccountToken() {
        return this.serviceAccountToken;
    }

    /**
     * <p>
     * Information about the created token, including the key. Be sure to store the key securely.
     * </p>
     * 
     * @param serviceAccountToken
     *        Information about the created token, including the key. Be sure to store the key securely.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateWorkspaceServiceAccountTokenResult withServiceAccountToken(ServiceAccountTokenSummaryWithKey serviceAccountToken) {
        setServiceAccountToken(serviceAccountToken);
        return this;
    }

    /**
     * <p>
     * The ID of the workspace where the token was created.
     * </p>
     * 
     * @param workspaceId
     *        The ID of the workspace where the token was created.
     */

    public void setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
    }

    /**
     * <p>
     * The ID of the workspace where the token was created.
     * </p>
     * 
     * @return The ID of the workspace where the token was created.
     */

    public String getWorkspaceId() {
        return this.workspaceId;
    }

    /**
     * <p>
     * The ID of the workspace where the token was created.
     * </p>
     * 
     * @param workspaceId
     *        The ID of the workspace where the token was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateWorkspaceServiceAccountTokenResult withWorkspaceId(String workspaceId) {
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
        if (getServiceAccountId() != null)
            sb.append("ServiceAccountId: ").append(getServiceAccountId()).append(",");
        if (getServiceAccountToken() != null)
            sb.append("ServiceAccountToken: ").append(getServiceAccountToken()).append(",");
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

        if (obj instanceof CreateWorkspaceServiceAccountTokenResult == false)
            return false;
        CreateWorkspaceServiceAccountTokenResult other = (CreateWorkspaceServiceAccountTokenResult) obj;
        if (other.getServiceAccountId() == null ^ this.getServiceAccountId() == null)
            return false;
        if (other.getServiceAccountId() != null && other.getServiceAccountId().equals(this.getServiceAccountId()) == false)
            return false;
        if (other.getServiceAccountToken() == null ^ this.getServiceAccountToken() == null)
            return false;
        if (other.getServiceAccountToken() != null && other.getServiceAccountToken().equals(this.getServiceAccountToken()) == false)
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

        hashCode = prime * hashCode + ((getServiceAccountId() == null) ? 0 : getServiceAccountId().hashCode());
        hashCode = prime * hashCode + ((getServiceAccountToken() == null) ? 0 : getServiceAccountToken().hashCode());
        hashCode = prime * hashCode + ((getWorkspaceId() == null) ? 0 : getWorkspaceId().hashCode());
        return hashCode;
    }

    @Override
    public CreateWorkspaceServiceAccountTokenResult clone() {
        try {
            return (CreateWorkspaceServiceAccountTokenResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
