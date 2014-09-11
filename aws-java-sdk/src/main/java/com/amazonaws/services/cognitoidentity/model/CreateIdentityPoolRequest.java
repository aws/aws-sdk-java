/*
 * Copyright 2010-2014 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Container for the parameters to the {@link com.amazonaws.services.cognitoidentity.AmazonCognitoIdentity#createIdentityPool(CreateIdentityPoolRequest) CreateIdentityPool operation}.
 * <p>
 * Creates a new identity pool. The identity pool is a store of user
 * identity information that is specific to your AWS account.
 * </p>
 *
 * @see com.amazonaws.services.cognitoidentity.AmazonCognitoIdentity#createIdentityPool(CreateIdentityPoolRequest)
 */
public class CreateIdentityPoolRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * A string that you provide.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w ]+<br/>
     */
    private String identityPoolName;

    /**
     * TRUE if the identity pool supports unauthenticated logins.
     */
    private Boolean allowUnauthenticatedIdentities;

    /**
     * Optional key:value pairs mapping provider names to provider app IDs.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 3<br/>
     */
    private java.util.Map<String,String> supportedLoginProviders;

    /**
     * A string that you provide.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w ]+<br/>
     *
     * @return A string that you provide.
     */
    public String getIdentityPoolName() {
        return identityPoolName;
    }
    
    /**
     * A string that you provide.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w ]+<br/>
     *
     * @param identityPoolName A string that you provide.
     */
    public void setIdentityPoolName(String identityPoolName) {
        this.identityPoolName = identityPoolName;
    }
    
    /**
     * A string that you provide.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w ]+<br/>
     *
     * @param identityPoolName A string that you provide.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateIdentityPoolRequest withIdentityPoolName(String identityPoolName) {
        this.identityPoolName = identityPoolName;
        return this;
    }

    /**
     * TRUE if the identity pool supports unauthenticated logins.
     *
     * @return TRUE if the identity pool supports unauthenticated logins.
     */
    public Boolean isAllowUnauthenticatedIdentities() {
        return allowUnauthenticatedIdentities;
    }
    
    /**
     * TRUE if the identity pool supports unauthenticated logins.
     *
     * @param allowUnauthenticatedIdentities TRUE if the identity pool supports unauthenticated logins.
     */
    public void setAllowUnauthenticatedIdentities(Boolean allowUnauthenticatedIdentities) {
        this.allowUnauthenticatedIdentities = allowUnauthenticatedIdentities;
    }
    
    /**
     * TRUE if the identity pool supports unauthenticated logins.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param allowUnauthenticatedIdentities TRUE if the identity pool supports unauthenticated logins.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateIdentityPoolRequest withAllowUnauthenticatedIdentities(Boolean allowUnauthenticatedIdentities) {
        this.allowUnauthenticatedIdentities = allowUnauthenticatedIdentities;
        return this;
    }

    /**
     * TRUE if the identity pool supports unauthenticated logins.
     *
     * @return TRUE if the identity pool supports unauthenticated logins.
     */
    public Boolean getAllowUnauthenticatedIdentities() {
        return allowUnauthenticatedIdentities;
    }

    /**
     * Optional key:value pairs mapping provider names to provider app IDs.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 3<br/>
     *
     * @return Optional key:value pairs mapping provider names to provider app IDs.
     */
    public java.util.Map<String,String> getSupportedLoginProviders() {
        
        return supportedLoginProviders;
    }
    
    /**
     * Optional key:value pairs mapping provider names to provider app IDs.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 3<br/>
     *
     * @param supportedLoginProviders Optional key:value pairs mapping provider names to provider app IDs.
     */
    public void setSupportedLoginProviders(java.util.Map<String,String> supportedLoginProviders) {
        this.supportedLoginProviders = supportedLoginProviders;
    }
    
    /**
     * Optional key:value pairs mapping provider names to provider app IDs.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 3<br/>
     *
     * @param supportedLoginProviders Optional key:value pairs mapping provider names to provider app IDs.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateIdentityPoolRequest withSupportedLoginProviders(java.util.Map<String,String> supportedLoginProviders) {
        setSupportedLoginProviders(supportedLoginProviders);
        return this;
    }

    /**
     * Optional key:value pairs mapping provider names to provider app IDs.
     * <p>
     * The method adds a new key-value pair into SupportedLoginProviders
     * parameter, and returns a reference to this object so that method calls
     * can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 3<br/>
     *
     * @param key The key of the entry to be added into SupportedLoginProviders.
     * @param value The corresponding value of the entry to be added into SupportedLoginProviders.
     */
    public CreateIdentityPoolRequest addSupportedLoginProvidersEntry(String key, String value) {
        if (null == this.supportedLoginProviders) {
            this.supportedLoginProviders = new java.util.HashMap<String,String>();
        }
        if (this.supportedLoginProviders.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.supportedLoginProviders.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into SupportedLoginProviders.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     */
    public CreateIdentityPoolRequest clearSupportedLoginProvidersEntries() {
        this.supportedLoginProviders = null;
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
        if (getIdentityPoolName() != null) sb.append("IdentityPoolName: " + getIdentityPoolName() + ",");
        if (isAllowUnauthenticatedIdentities() != null) sb.append("AllowUnauthenticatedIdentities: " + isAllowUnauthenticatedIdentities() + ",");
        if (getSupportedLoginProviders() != null) sb.append("SupportedLoginProviders: " + getSupportedLoginProviders() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getIdentityPoolName() == null) ? 0 : getIdentityPoolName().hashCode()); 
        hashCode = prime * hashCode + ((isAllowUnauthenticatedIdentities() == null) ? 0 : isAllowUnauthenticatedIdentities().hashCode()); 
        hashCode = prime * hashCode + ((getSupportedLoginProviders() == null) ? 0 : getSupportedLoginProviders().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof CreateIdentityPoolRequest == false) return false;
        CreateIdentityPoolRequest other = (CreateIdentityPoolRequest)obj;
        
        if (other.getIdentityPoolName() == null ^ this.getIdentityPoolName() == null) return false;
        if (other.getIdentityPoolName() != null && other.getIdentityPoolName().equals(this.getIdentityPoolName()) == false) return false; 
        if (other.isAllowUnauthenticatedIdentities() == null ^ this.isAllowUnauthenticatedIdentities() == null) return false;
        if (other.isAllowUnauthenticatedIdentities() != null && other.isAllowUnauthenticatedIdentities().equals(this.isAllowUnauthenticatedIdentities()) == false) return false; 
        if (other.getSupportedLoginProviders() == null ^ this.getSupportedLoginProviders() == null) return false;
        if (other.getSupportedLoginProviders() != null && other.getSupportedLoginProviders().equals(this.getSupportedLoginProviders()) == false) return false; 
        return true;
    }
    
}
    