/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.cognitoidentity.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Input to the <code>SetIdentityPoolRoles</code> action.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-identity-2014-06-30/SetIdentityPoolRoles"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SetIdentityPoolRolesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * An identity pool ID in the format REGION:GUID.
     * </p>
     */
    private String identityPoolId;
    /**
     * <p>
     * The map of roles associated with this pool. For a given role, the key will be either "authenticated" or
     * "unauthenticated" and the value will be the Role ARN.
     * </p>
     */
    private java.util.Map<String, String> roles;
    /**
     * <p>
     * How users for a specific identity provider are to mapped to roles. This is a string to <a>RoleMapping</a> object
     * map. The string identifies the identity provider, for example, "graph.facebook.com" or
     * "cognito-idp-east-1.amazonaws.com/us-east-1_abcdefghi:app_client_id".
     * </p>
     * <p>
     * Up to 25 rules can be specified per identity provider.
     * </p>
     */
    private java.util.Map<String, RoleMapping> roleMappings;

    /**
     * <p>
     * An identity pool ID in the format REGION:GUID.
     * </p>
     * 
     * @param identityPoolId
     *        An identity pool ID in the format REGION:GUID.
     */

    public void setIdentityPoolId(String identityPoolId) {
        this.identityPoolId = identityPoolId;
    }

    /**
     * <p>
     * An identity pool ID in the format REGION:GUID.
     * </p>
     * 
     * @return An identity pool ID in the format REGION:GUID.
     */

    public String getIdentityPoolId() {
        return this.identityPoolId;
    }

    /**
     * <p>
     * An identity pool ID in the format REGION:GUID.
     * </p>
     * 
     * @param identityPoolId
     *        An identity pool ID in the format REGION:GUID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SetIdentityPoolRolesRequest withIdentityPoolId(String identityPoolId) {
        setIdentityPoolId(identityPoolId);
        return this;
    }

    /**
     * <p>
     * The map of roles associated with this pool. For a given role, the key will be either "authenticated" or
     * "unauthenticated" and the value will be the Role ARN.
     * </p>
     * 
     * @return The map of roles associated with this pool. For a given role, the key will be either "authenticated" or
     *         "unauthenticated" and the value will be the Role ARN.
     */

    public java.util.Map<String, String> getRoles() {
        return roles;
    }

    /**
     * <p>
     * The map of roles associated with this pool. For a given role, the key will be either "authenticated" or
     * "unauthenticated" and the value will be the Role ARN.
     * </p>
     * 
     * @param roles
     *        The map of roles associated with this pool. For a given role, the key will be either "authenticated" or
     *        "unauthenticated" and the value will be the Role ARN.
     */

    public void setRoles(java.util.Map<String, String> roles) {
        this.roles = roles;
    }

    /**
     * <p>
     * The map of roles associated with this pool. For a given role, the key will be either "authenticated" or
     * "unauthenticated" and the value will be the Role ARN.
     * </p>
     * 
     * @param roles
     *        The map of roles associated with this pool. For a given role, the key will be either "authenticated" or
     *        "unauthenticated" and the value will be the Role ARN.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SetIdentityPoolRolesRequest withRoles(java.util.Map<String, String> roles) {
        setRoles(roles);
        return this;
    }

    public SetIdentityPoolRolesRequest addRolesEntry(String key, String value) {
        if (null == this.roles) {
            this.roles = new java.util.HashMap<String, String>();
        }
        if (this.roles.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.roles.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Roles.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SetIdentityPoolRolesRequest clearRolesEntries() {
        this.roles = null;
        return this;
    }

    /**
     * <p>
     * How users for a specific identity provider are to mapped to roles. This is a string to <a>RoleMapping</a> object
     * map. The string identifies the identity provider, for example, "graph.facebook.com" or
     * "cognito-idp-east-1.amazonaws.com/us-east-1_abcdefghi:app_client_id".
     * </p>
     * <p>
     * Up to 25 rules can be specified per identity provider.
     * </p>
     * 
     * @return How users for a specific identity provider are to mapped to roles. This is a string to <a>RoleMapping</a>
     *         object map. The string identifies the identity provider, for example, "graph.facebook.com" or
     *         "cognito-idp-east-1.amazonaws.com/us-east-1_abcdefghi:app_client_id".</p>
     *         <p>
     *         Up to 25 rules can be specified per identity provider.
     */

    public java.util.Map<String, RoleMapping> getRoleMappings() {
        return roleMappings;
    }

    /**
     * <p>
     * How users for a specific identity provider are to mapped to roles. This is a string to <a>RoleMapping</a> object
     * map. The string identifies the identity provider, for example, "graph.facebook.com" or
     * "cognito-idp-east-1.amazonaws.com/us-east-1_abcdefghi:app_client_id".
     * </p>
     * <p>
     * Up to 25 rules can be specified per identity provider.
     * </p>
     * 
     * @param roleMappings
     *        How users for a specific identity provider are to mapped to roles. This is a string to <a>RoleMapping</a>
     *        object map. The string identifies the identity provider, for example, "graph.facebook.com" or
     *        "cognito-idp-east-1.amazonaws.com/us-east-1_abcdefghi:app_client_id".</p>
     *        <p>
     *        Up to 25 rules can be specified per identity provider.
     */

    public void setRoleMappings(java.util.Map<String, RoleMapping> roleMappings) {
        this.roleMappings = roleMappings;
    }

    /**
     * <p>
     * How users for a specific identity provider are to mapped to roles. This is a string to <a>RoleMapping</a> object
     * map. The string identifies the identity provider, for example, "graph.facebook.com" or
     * "cognito-idp-east-1.amazonaws.com/us-east-1_abcdefghi:app_client_id".
     * </p>
     * <p>
     * Up to 25 rules can be specified per identity provider.
     * </p>
     * 
     * @param roleMappings
     *        How users for a specific identity provider are to mapped to roles. This is a string to <a>RoleMapping</a>
     *        object map. The string identifies the identity provider, for example, "graph.facebook.com" or
     *        "cognito-idp-east-1.amazonaws.com/us-east-1_abcdefghi:app_client_id".</p>
     *        <p>
     *        Up to 25 rules can be specified per identity provider.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SetIdentityPoolRolesRequest withRoleMappings(java.util.Map<String, RoleMapping> roleMappings) {
        setRoleMappings(roleMappings);
        return this;
    }

    public SetIdentityPoolRolesRequest addRoleMappingsEntry(String key, RoleMapping value) {
        if (null == this.roleMappings) {
            this.roleMappings = new java.util.HashMap<String, RoleMapping>();
        }
        if (this.roleMappings.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.roleMappings.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into RoleMappings.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SetIdentityPoolRolesRequest clearRoleMappingsEntries() {
        this.roleMappings = null;
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
        if (getIdentityPoolId() != null)
            sb.append("IdentityPoolId: ").append(getIdentityPoolId()).append(",");
        if (getRoles() != null)
            sb.append("Roles: ").append(getRoles()).append(",");
        if (getRoleMappings() != null)
            sb.append("RoleMappings: ").append(getRoleMappings());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SetIdentityPoolRolesRequest == false)
            return false;
        SetIdentityPoolRolesRequest other = (SetIdentityPoolRolesRequest) obj;
        if (other.getIdentityPoolId() == null ^ this.getIdentityPoolId() == null)
            return false;
        if (other.getIdentityPoolId() != null && other.getIdentityPoolId().equals(this.getIdentityPoolId()) == false)
            return false;
        if (other.getRoles() == null ^ this.getRoles() == null)
            return false;
        if (other.getRoles() != null && other.getRoles().equals(this.getRoles()) == false)
            return false;
        if (other.getRoleMappings() == null ^ this.getRoleMappings() == null)
            return false;
        if (other.getRoleMappings() != null && other.getRoleMappings().equals(this.getRoleMappings()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIdentityPoolId() == null) ? 0 : getIdentityPoolId().hashCode());
        hashCode = prime * hashCode + ((getRoles() == null) ? 0 : getRoles().hashCode());
        hashCode = prime * hashCode + ((getRoleMappings() == null) ? 0 : getRoleMappings().hashCode());
        return hashCode;
    }

    @Override
    public SetIdentityPoolRolesRequest clone() {
        return (SetIdentityPoolRolesRequest) super.clone();
    }

}
