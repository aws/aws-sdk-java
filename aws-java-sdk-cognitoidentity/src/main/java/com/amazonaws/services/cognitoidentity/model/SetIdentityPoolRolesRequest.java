/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Input to the <code>SetIdentityPoolRoles</code> action.
 * </p>
 */
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
     * Returns a string representation of this object; useful for testing and debugging.
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
            sb.append("IdentityPoolId: " + getIdentityPoolId() + ",");
        if (getRoles() != null)
            sb.append("Roles: " + getRoles());
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
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIdentityPoolId() == null) ? 0 : getIdentityPoolId().hashCode());
        hashCode = prime * hashCode + ((getRoles() == null) ? 0 : getRoles().hashCode());
        return hashCode;
    }

    @Override
    public SetIdentityPoolRolesRequest clone() {
        return (SetIdentityPoolRolesRequest) super.clone();
    }
}
