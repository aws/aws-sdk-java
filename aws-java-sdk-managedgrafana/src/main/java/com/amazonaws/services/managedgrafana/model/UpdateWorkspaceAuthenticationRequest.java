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
package com.amazonaws.services.managedgrafana.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/grafana-2020-08-18/UpdateWorkspaceAuthentication"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateWorkspaceAuthenticationRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Specifies whether this workspace uses SAML 2.0, IAM Identity Center (successor to Single Sign-On), or both to
     * authenticate users for using the Grafana console within a workspace. For more information, see <a
     * href="https://docs.aws.amazon.com/grafana/latest/userguide/authentication-in-AMG.html">User authentication in
     * Amazon Managed Grafana</a>.
     * </p>
     */
    private java.util.List<String> authenticationProviders;
    /**
     * <p>
     * If the workspace uses SAML, use this structure to map SAML assertion attributes to workspace user information and
     * define which groups in the assertion attribute are to have the <code>Admin</code> and <code>Editor</code> roles
     * in the workspace.
     * </p>
     */
    private SamlConfiguration samlConfiguration;
    /**
     * <p>
     * The ID of the workspace to update the authentication for.
     * </p>
     */
    private String workspaceId;

    /**
     * <p>
     * Specifies whether this workspace uses SAML 2.0, IAM Identity Center (successor to Single Sign-On), or both to
     * authenticate users for using the Grafana console within a workspace. For more information, see <a
     * href="https://docs.aws.amazon.com/grafana/latest/userguide/authentication-in-AMG.html">User authentication in
     * Amazon Managed Grafana</a>.
     * </p>
     * 
     * @return Specifies whether this workspace uses SAML 2.0, IAM Identity Center (successor to Single Sign-On), or
     *         both to authenticate users for using the Grafana console within a workspace. For more information, see <a
     *         href="https://docs.aws.amazon.com/grafana/latest/userguide/authentication-in-AMG.html">User
     *         authentication in Amazon Managed Grafana</a>.
     * @see AuthenticationProviderTypes
     */

    public java.util.List<String> getAuthenticationProviders() {
        return authenticationProviders;
    }

    /**
     * <p>
     * Specifies whether this workspace uses SAML 2.0, IAM Identity Center (successor to Single Sign-On), or both to
     * authenticate users for using the Grafana console within a workspace. For more information, see <a
     * href="https://docs.aws.amazon.com/grafana/latest/userguide/authentication-in-AMG.html">User authentication in
     * Amazon Managed Grafana</a>.
     * </p>
     * 
     * @param authenticationProviders
     *        Specifies whether this workspace uses SAML 2.0, IAM Identity Center (successor to Single Sign-On), or both
     *        to authenticate users for using the Grafana console within a workspace. For more information, see <a
     *        href="https://docs.aws.amazon.com/grafana/latest/userguide/authentication-in-AMG.html">User authentication
     *        in Amazon Managed Grafana</a>.
     * @see AuthenticationProviderTypes
     */

    public void setAuthenticationProviders(java.util.Collection<String> authenticationProviders) {
        if (authenticationProviders == null) {
            this.authenticationProviders = null;
            return;
        }

        this.authenticationProviders = new java.util.ArrayList<String>(authenticationProviders);
    }

    /**
     * <p>
     * Specifies whether this workspace uses SAML 2.0, IAM Identity Center (successor to Single Sign-On), or both to
     * authenticate users for using the Grafana console within a workspace. For more information, see <a
     * href="https://docs.aws.amazon.com/grafana/latest/userguide/authentication-in-AMG.html">User authentication in
     * Amazon Managed Grafana</a>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAuthenticationProviders(java.util.Collection)} or
     * {@link #withAuthenticationProviders(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param authenticationProviders
     *        Specifies whether this workspace uses SAML 2.0, IAM Identity Center (successor to Single Sign-On), or both
     *        to authenticate users for using the Grafana console within a workspace. For more information, see <a
     *        href="https://docs.aws.amazon.com/grafana/latest/userguide/authentication-in-AMG.html">User authentication
     *        in Amazon Managed Grafana</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AuthenticationProviderTypes
     */

    public UpdateWorkspaceAuthenticationRequest withAuthenticationProviders(String... authenticationProviders) {
        if (this.authenticationProviders == null) {
            setAuthenticationProviders(new java.util.ArrayList<String>(authenticationProviders.length));
        }
        for (String ele : authenticationProviders) {
            this.authenticationProviders.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Specifies whether this workspace uses SAML 2.0, IAM Identity Center (successor to Single Sign-On), or both to
     * authenticate users for using the Grafana console within a workspace. For more information, see <a
     * href="https://docs.aws.amazon.com/grafana/latest/userguide/authentication-in-AMG.html">User authentication in
     * Amazon Managed Grafana</a>.
     * </p>
     * 
     * @param authenticationProviders
     *        Specifies whether this workspace uses SAML 2.0, IAM Identity Center (successor to Single Sign-On), or both
     *        to authenticate users for using the Grafana console within a workspace. For more information, see <a
     *        href="https://docs.aws.amazon.com/grafana/latest/userguide/authentication-in-AMG.html">User authentication
     *        in Amazon Managed Grafana</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AuthenticationProviderTypes
     */

    public UpdateWorkspaceAuthenticationRequest withAuthenticationProviders(java.util.Collection<String> authenticationProviders) {
        setAuthenticationProviders(authenticationProviders);
        return this;
    }

    /**
     * <p>
     * Specifies whether this workspace uses SAML 2.0, IAM Identity Center (successor to Single Sign-On), or both to
     * authenticate users for using the Grafana console within a workspace. For more information, see <a
     * href="https://docs.aws.amazon.com/grafana/latest/userguide/authentication-in-AMG.html">User authentication in
     * Amazon Managed Grafana</a>.
     * </p>
     * 
     * @param authenticationProviders
     *        Specifies whether this workspace uses SAML 2.0, IAM Identity Center (successor to Single Sign-On), or both
     *        to authenticate users for using the Grafana console within a workspace. For more information, see <a
     *        href="https://docs.aws.amazon.com/grafana/latest/userguide/authentication-in-AMG.html">User authentication
     *        in Amazon Managed Grafana</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AuthenticationProviderTypes
     */

    public UpdateWorkspaceAuthenticationRequest withAuthenticationProviders(AuthenticationProviderTypes... authenticationProviders) {
        java.util.ArrayList<String> authenticationProvidersCopy = new java.util.ArrayList<String>(authenticationProviders.length);
        for (AuthenticationProviderTypes value : authenticationProviders) {
            authenticationProvidersCopy.add(value.toString());
        }
        if (getAuthenticationProviders() == null) {
            setAuthenticationProviders(authenticationProvidersCopy);
        } else {
            getAuthenticationProviders().addAll(authenticationProvidersCopy);
        }
        return this;
    }

    /**
     * <p>
     * If the workspace uses SAML, use this structure to map SAML assertion attributes to workspace user information and
     * define which groups in the assertion attribute are to have the <code>Admin</code> and <code>Editor</code> roles
     * in the workspace.
     * </p>
     * 
     * @param samlConfiguration
     *        If the workspace uses SAML, use this structure to map SAML assertion attributes to workspace user
     *        information and define which groups in the assertion attribute are to have the <code>Admin</code> and
     *        <code>Editor</code> roles in the workspace.
     */

    public void setSamlConfiguration(SamlConfiguration samlConfiguration) {
        this.samlConfiguration = samlConfiguration;
    }

    /**
     * <p>
     * If the workspace uses SAML, use this structure to map SAML assertion attributes to workspace user information and
     * define which groups in the assertion attribute are to have the <code>Admin</code> and <code>Editor</code> roles
     * in the workspace.
     * </p>
     * 
     * @return If the workspace uses SAML, use this structure to map SAML assertion attributes to workspace user
     *         information and define which groups in the assertion attribute are to have the <code>Admin</code> and
     *         <code>Editor</code> roles in the workspace.
     */

    public SamlConfiguration getSamlConfiguration() {
        return this.samlConfiguration;
    }

    /**
     * <p>
     * If the workspace uses SAML, use this structure to map SAML assertion attributes to workspace user information and
     * define which groups in the assertion attribute are to have the <code>Admin</code> and <code>Editor</code> roles
     * in the workspace.
     * </p>
     * 
     * @param samlConfiguration
     *        If the workspace uses SAML, use this structure to map SAML assertion attributes to workspace user
     *        information and define which groups in the assertion attribute are to have the <code>Admin</code> and
     *        <code>Editor</code> roles in the workspace.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateWorkspaceAuthenticationRequest withSamlConfiguration(SamlConfiguration samlConfiguration) {
        setSamlConfiguration(samlConfiguration);
        return this;
    }

    /**
     * <p>
     * The ID of the workspace to update the authentication for.
     * </p>
     * 
     * @param workspaceId
     *        The ID of the workspace to update the authentication for.
     */

    public void setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
    }

    /**
     * <p>
     * The ID of the workspace to update the authentication for.
     * </p>
     * 
     * @return The ID of the workspace to update the authentication for.
     */

    public String getWorkspaceId() {
        return this.workspaceId;
    }

    /**
     * <p>
     * The ID of the workspace to update the authentication for.
     * </p>
     * 
     * @param workspaceId
     *        The ID of the workspace to update the authentication for.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateWorkspaceAuthenticationRequest withWorkspaceId(String workspaceId) {
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
        if (getAuthenticationProviders() != null)
            sb.append("AuthenticationProviders: ").append(getAuthenticationProviders()).append(",");
        if (getSamlConfiguration() != null)
            sb.append("SamlConfiguration: ").append(getSamlConfiguration()).append(",");
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

        if (obj instanceof UpdateWorkspaceAuthenticationRequest == false)
            return false;
        UpdateWorkspaceAuthenticationRequest other = (UpdateWorkspaceAuthenticationRequest) obj;
        if (other.getAuthenticationProviders() == null ^ this.getAuthenticationProviders() == null)
            return false;
        if (other.getAuthenticationProviders() != null && other.getAuthenticationProviders().equals(this.getAuthenticationProviders()) == false)
            return false;
        if (other.getSamlConfiguration() == null ^ this.getSamlConfiguration() == null)
            return false;
        if (other.getSamlConfiguration() != null && other.getSamlConfiguration().equals(this.getSamlConfiguration()) == false)
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

        hashCode = prime * hashCode + ((getAuthenticationProviders() == null) ? 0 : getAuthenticationProviders().hashCode());
        hashCode = prime * hashCode + ((getSamlConfiguration() == null) ? 0 : getSamlConfiguration().hashCode());
        hashCode = prime * hashCode + ((getWorkspaceId() == null) ? 0 : getWorkspaceId().hashCode());
        return hashCode;
    }

    @Override
    public UpdateWorkspaceAuthenticationRequest clone() {
        return (UpdateWorkspaceAuthenticationRequest) super.clone();
    }

}
