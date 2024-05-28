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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/grafana-2020-08-18/DeleteWorkspaceServiceAccount"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteWorkspaceServiceAccountRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the service account to delete.
     * </p>
     */
    private String serviceAccountId;
    /**
     * <p>
     * The ID of the workspace where the service account resides.
     * </p>
     */
    private String workspaceId;

    /**
     * <p>
     * The ID of the service account to delete.
     * </p>
     * 
     * @param serviceAccountId
     *        The ID of the service account to delete.
     */

    public void setServiceAccountId(String serviceAccountId) {
        this.serviceAccountId = serviceAccountId;
    }

    /**
     * <p>
     * The ID of the service account to delete.
     * </p>
     * 
     * @return The ID of the service account to delete.
     */

    public String getServiceAccountId() {
        return this.serviceAccountId;
    }

    /**
     * <p>
     * The ID of the service account to delete.
     * </p>
     * 
     * @param serviceAccountId
     *        The ID of the service account to delete.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteWorkspaceServiceAccountRequest withServiceAccountId(String serviceAccountId) {
        setServiceAccountId(serviceAccountId);
        return this;
    }

    /**
     * <p>
     * The ID of the workspace where the service account resides.
     * </p>
     * 
     * @param workspaceId
     *        The ID of the workspace where the service account resides.
     */

    public void setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
    }

    /**
     * <p>
     * The ID of the workspace where the service account resides.
     * </p>
     * 
     * @return The ID of the workspace where the service account resides.
     */

    public String getWorkspaceId() {
        return this.workspaceId;
    }

    /**
     * <p>
     * The ID of the workspace where the service account resides.
     * </p>
     * 
     * @param workspaceId
     *        The ID of the workspace where the service account resides.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteWorkspaceServiceAccountRequest withWorkspaceId(String workspaceId) {
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

        if (obj instanceof DeleteWorkspaceServiceAccountRequest == false)
            return false;
        DeleteWorkspaceServiceAccountRequest other = (DeleteWorkspaceServiceAccountRequest) obj;
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

        hashCode = prime * hashCode + ((getServiceAccountId() == null) ? 0 : getServiceAccountId().hashCode());
        hashCode = prime * hashCode + ((getWorkspaceId() == null) ? 0 : getWorkspaceId().hashCode());
        return hashCode;
    }

    @Override
    public DeleteWorkspaceServiceAccountRequest clone() {
        return (DeleteWorkspaceServiceAccountRequest) super.clone();
    }

}
