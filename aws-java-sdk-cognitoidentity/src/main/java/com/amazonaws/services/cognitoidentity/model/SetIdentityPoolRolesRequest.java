/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.cognitoidentity.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.cognitoidentity.AmazonCognitoIdentity#setIdentityPoolRoles(SetIdentityPoolRolesRequest) SetIdentityPoolRoles operation}.
 * <p>
 * Sets the roles for an identity pool. These roles are used when making
 * calls to <code>GetCredentialsForIdentity</code> action.
 * </p>
 * <p>
 * You must use AWS Developer credentials to call this API.
 * </p>
 *
 * @see com.amazonaws.services.cognitoidentity.AmazonCognitoIdentity#setIdentityPoolRoles(SetIdentityPoolRolesRequest)
 */
public class SetIdentityPoolRolesRequest extends AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * An identity pool ID in the format REGION:GUID.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 50<br/>
     * <b>Pattern: </b>[\w-]+:[0-9a-f-]+<br/>
     */
    private String identityPoolId;

    /**
     * The map of roles associated with this pool. For a given role, the key
     * will be either "authenticated" or "unauthenticated" and the value will
     * be the Role ARN.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 2<br/>
     */
    private java.util.Map<String,String> roles;

    /**
     * An identity pool ID in the format REGION:GUID.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 50<br/>
     * <b>Pattern: </b>[\w-]+:[0-9a-f-]+<br/>
     *
     * @return An identity pool ID in the format REGION:GUID.
     */
    public String getIdentityPoolId() {
        return identityPoolId;
    }
    
    /**
     * An identity pool ID in the format REGION:GUID.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 50<br/>
     * <b>Pattern: </b>[\w-]+:[0-9a-f-]+<br/>
     *
     * @param identityPoolId An identity pool ID in the format REGION:GUID.
     */
    public void setIdentityPoolId(String identityPoolId) {
        this.identityPoolId = identityPoolId;
    }
    
    /**
     * An identity pool ID in the format REGION:GUID.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 50<br/>
     * <b>Pattern: </b>[\w-]+:[0-9a-f-]+<br/>
     *
     * @param identityPoolId An identity pool ID in the format REGION:GUID.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public SetIdentityPoolRolesRequest withIdentityPoolId(String identityPoolId) {
        this.identityPoolId = identityPoolId;
        return this;
    }

    /**
     * The map of roles associated with this pool. For a given role, the key
     * will be either "authenticated" or "unauthenticated" and the value will
     * be the Role ARN.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 2<br/>
     *
     * @return The map of roles associated with this pool. For a given role, the key
     *         will be either "authenticated" or "unauthenticated" and the value will
     *         be the Role ARN.
     */
    public java.util.Map<String,String> getRoles() {
        
        return roles;
    }
    
    /**
     * The map of roles associated with this pool. For a given role, the key
     * will be either "authenticated" or "unauthenticated" and the value will
     * be the Role ARN.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 2<br/>
     *
     * @param roles The map of roles associated with this pool. For a given role, the key
     *         will be either "authenticated" or "unauthenticated" and the value will
     *         be the Role ARN.
     */
    public void setRoles(java.util.Map<String,String> roles) {
        this.roles = roles;
    }
    
    /**
     * The map of roles associated with this pool. For a given role, the key
     * will be either "authenticated" or "unauthenticated" and the value will
     * be the Role ARN.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 2<br/>
     *
     * @param roles The map of roles associated with this pool. For a given role, the key
     *         will be either "authenticated" or "unauthenticated" and the value will
     *         be the Role ARN.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public SetIdentityPoolRolesRequest withRoles(java.util.Map<String,String> roles) {
        setRoles(roles);
        return this;
    }

    /**
     * The map of roles associated with this pool. For a given role, the key
     * will be either "authenticated" or "unauthenticated" and the value will
     * be the Role ARN.
     * <p>
     * The method adds a new key-value pair into Roles parameter, and returns
     * a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 2<br/>
     *
     * @param key The key of the entry to be added into Roles.
     * @param value The corresponding value of the entry to be added into Roles.
     */
  public SetIdentityPoolRolesRequest addRolesEntry(String key, String value) {
    if (null == this.roles) {
      this.roles = new java.util.HashMap<String,String>();
    }
    if (this.roles.containsKey(key))
      throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
    this.roles.put(key, value);
    return this;
  }

  /**
   * Removes all the entries added into Roles.
   * <p>
   * Returns a reference to this object so that method calls can be chained together.
   */
  public SetIdentityPoolRolesRequest clearRolesEntries() {
    this.roles = null;
    return this;
  }
  
    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getIdentityPoolId() != null) sb.append("IdentityPoolId: " + getIdentityPoolId() + ",");
        if (getRoles() != null) sb.append("Roles: " + getRoles() );
        sb.append("}");
        return sb.toString();
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
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof SetIdentityPoolRolesRequest == false) return false;
        SetIdentityPoolRolesRequest other = (SetIdentityPoolRolesRequest)obj;
        
        if (other.getIdentityPoolId() == null ^ this.getIdentityPoolId() == null) return false;
        if (other.getIdentityPoolId() != null && other.getIdentityPoolId().equals(this.getIdentityPoolId()) == false) return false; 
        if (other.getRoles() == null ^ this.getRoles() == null) return false;
        if (other.getRoles() != null && other.getRoles().equals(this.getRoles()) == false) return false; 
        return true;
    }
    
    @Override
    public SetIdentityPoolRolesRequest clone() {
        
            return (SetIdentityPoolRolesRequest) super.clone();
    }

}
    