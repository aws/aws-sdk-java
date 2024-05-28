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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/grafana-2020-08-18/CreateWorkspaceServiceAccount"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateWorkspaceServiceAccountRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The permission level to use for this service account.
     * </p>
     * <note>
     * <p>
     * For more information about the roles and the permissions each has, see <a
     * href="https://docs.aws.amazon.com/grafana/latest/userguide/Grafana-user-roles.html">User roles</a> in the
     * <i>Amazon Managed Grafana User Guide</i>.
     * </p>
     * </note>
     */
    private String grafanaRole;
    /**
     * <p>
     * A name for the service account. The name must be unique within the workspace, as it determines the ID associated
     * with the service account.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The ID of the workspace within which to create the service account.
     * </p>
     */
    private String workspaceId;

    /**
     * <p>
     * The permission level to use for this service account.
     * </p>
     * <note>
     * <p>
     * For more information about the roles and the permissions each has, see <a
     * href="https://docs.aws.amazon.com/grafana/latest/userguide/Grafana-user-roles.html">User roles</a> in the
     * <i>Amazon Managed Grafana User Guide</i>.
     * </p>
     * </note>
     * 
     * @param grafanaRole
     *        The permission level to use for this service account.</p> <note>
     *        <p>
     *        For more information about the roles and the permissions each has, see <a
     *        href="https://docs.aws.amazon.com/grafana/latest/userguide/Grafana-user-roles.html">User roles</a> in the
     *        <i>Amazon Managed Grafana User Guide</i>.
     *        </p>
     * @see Role
     */

    public void setGrafanaRole(String grafanaRole) {
        this.grafanaRole = grafanaRole;
    }

    /**
     * <p>
     * The permission level to use for this service account.
     * </p>
     * <note>
     * <p>
     * For more information about the roles and the permissions each has, see <a
     * href="https://docs.aws.amazon.com/grafana/latest/userguide/Grafana-user-roles.html">User roles</a> in the
     * <i>Amazon Managed Grafana User Guide</i>.
     * </p>
     * </note>
     * 
     * @return The permission level to use for this service account.</p> <note>
     *         <p>
     *         For more information about the roles and the permissions each has, see <a
     *         href="https://docs.aws.amazon.com/grafana/latest/userguide/Grafana-user-roles.html">User roles</a> in the
     *         <i>Amazon Managed Grafana User Guide</i>.
     *         </p>
     * @see Role
     */

    public String getGrafanaRole() {
        return this.grafanaRole;
    }

    /**
     * <p>
     * The permission level to use for this service account.
     * </p>
     * <note>
     * <p>
     * For more information about the roles and the permissions each has, see <a
     * href="https://docs.aws.amazon.com/grafana/latest/userguide/Grafana-user-roles.html">User roles</a> in the
     * <i>Amazon Managed Grafana User Guide</i>.
     * </p>
     * </note>
     * 
     * @param grafanaRole
     *        The permission level to use for this service account.</p> <note>
     *        <p>
     *        For more information about the roles and the permissions each has, see <a
     *        href="https://docs.aws.amazon.com/grafana/latest/userguide/Grafana-user-roles.html">User roles</a> in the
     *        <i>Amazon Managed Grafana User Guide</i>.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Role
     */

    public CreateWorkspaceServiceAccountRequest withGrafanaRole(String grafanaRole) {
        setGrafanaRole(grafanaRole);
        return this;
    }

    /**
     * <p>
     * The permission level to use for this service account.
     * </p>
     * <note>
     * <p>
     * For more information about the roles and the permissions each has, see <a
     * href="https://docs.aws.amazon.com/grafana/latest/userguide/Grafana-user-roles.html">User roles</a> in the
     * <i>Amazon Managed Grafana User Guide</i>.
     * </p>
     * </note>
     * 
     * @param grafanaRole
     *        The permission level to use for this service account.</p> <note>
     *        <p>
     *        For more information about the roles and the permissions each has, see <a
     *        href="https://docs.aws.amazon.com/grafana/latest/userguide/Grafana-user-roles.html">User roles</a> in the
     *        <i>Amazon Managed Grafana User Guide</i>.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Role
     */

    public CreateWorkspaceServiceAccountRequest withGrafanaRole(Role grafanaRole) {
        this.grafanaRole = grafanaRole.toString();
        return this;
    }

    /**
     * <p>
     * A name for the service account. The name must be unique within the workspace, as it determines the ID associated
     * with the service account.
     * </p>
     * 
     * @param name
     *        A name for the service account. The name must be unique within the workspace, as it determines the ID
     *        associated with the service account.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * A name for the service account. The name must be unique within the workspace, as it determines the ID associated
     * with the service account.
     * </p>
     * 
     * @return A name for the service account. The name must be unique within the workspace, as it determines the ID
     *         associated with the service account.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * A name for the service account. The name must be unique within the workspace, as it determines the ID associated
     * with the service account.
     * </p>
     * 
     * @param name
     *        A name for the service account. The name must be unique within the workspace, as it determines the ID
     *        associated with the service account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateWorkspaceServiceAccountRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The ID of the workspace within which to create the service account.
     * </p>
     * 
     * @param workspaceId
     *        The ID of the workspace within which to create the service account.
     */

    public void setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
    }

    /**
     * <p>
     * The ID of the workspace within which to create the service account.
     * </p>
     * 
     * @return The ID of the workspace within which to create the service account.
     */

    public String getWorkspaceId() {
        return this.workspaceId;
    }

    /**
     * <p>
     * The ID of the workspace within which to create the service account.
     * </p>
     * 
     * @param workspaceId
     *        The ID of the workspace within which to create the service account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateWorkspaceServiceAccountRequest withWorkspaceId(String workspaceId) {
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
        if (getGrafanaRole() != null)
            sb.append("GrafanaRole: ").append(getGrafanaRole()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
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

        if (obj instanceof CreateWorkspaceServiceAccountRequest == false)
            return false;
        CreateWorkspaceServiceAccountRequest other = (CreateWorkspaceServiceAccountRequest) obj;
        if (other.getGrafanaRole() == null ^ this.getGrafanaRole() == null)
            return false;
        if (other.getGrafanaRole() != null && other.getGrafanaRole().equals(this.getGrafanaRole()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
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

        hashCode = prime * hashCode + ((getGrafanaRole() == null) ? 0 : getGrafanaRole().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getWorkspaceId() == null) ? 0 : getWorkspaceId().hashCode());
        return hashCode;
    }

    @Override
    public CreateWorkspaceServiceAccountRequest clone() {
        return (CreateWorkspaceServiceAccountRequest) super.clone();
    }

}
