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
 * Container for the parameters to the {@link com.amazonaws.services.cognitoidentity.AmazonCognitoIdentity#getOpenIdTokenForDeveloperIdentity(GetOpenIdTokenForDeveloperIdentityRequest) GetOpenIdTokenForDeveloperIdentity operation}.
 * <p>
 * Registers (or retrieves) a Cognito <code>IdentityId</code> and an
 * OpenID Connect token for a user authenticated by your backend
 * authentication process. Supplying multiple logins will create an
 * implicit linked account. You can only specify one developer provider
 * as part of the <code>Logins</code> map, which is linked to the
 * identity pool. The developer provider is the "domain" by which Cognito
 * will refer to your users.
 * </p>
 * <p>
 * You can use <code>GetOpenIdTokenForDeveloperIdentity</code> to create
 * a new identity and to link new logins (that is, user credentials
 * issued by a public provider or developer provider) to an existing
 * identity. When you want to create a new identity, the
 * <code>IdentityId</code> should be null. When you want to associate a
 * new login with an existing authenticated/unauthenticated identity, you
 * can do so by providing the existing <code>IdentityId</code> . This API
 * will create the identity in the specified <code>IdentityPoolId</code>
 * .
 * </p>
 *
 * @see com.amazonaws.services.cognitoidentity.AmazonCognitoIdentity#getOpenIdTokenForDeveloperIdentity(GetOpenIdTokenForDeveloperIdentityRequest)
 */
public class GetOpenIdTokenForDeveloperIdentityRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * An identity pool ID in the format REGION:GUID.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 50<br/>
     * <b>Pattern: </b>[\w-]+:[0-9a-f-]+<br/>
     */
    private String identityPoolId;

    /**
     * A unique identifier in the format REGION:GUID.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 50<br/>
     * <b>Pattern: </b>[\w-]+:[0-9a-f-]+<br/>
     */
    private String identityId;

    /**
     * A set of optional name-value pairs that map provider names to provider
     * tokens. Each name-value pair represents a user from a public provider
     * or developer provider. If the user is from a developer provider, the
     * name-value pair will follow the syntax
     * <code>"developer_provider_name": "developer_user_identifier"</code>.
     * The developer provider is the "domain" by which Cognito will refer to
     * your users; you provided this domain while creating/updating the
     * identity pool. The developer user identifier is an identifier from
     * your backend that uniquely identifies a user. When you create an
     * identity pool, you can specify the supported logins.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 10<br/>
     */
    private java.util.Map<String,String> logins;

    /**
     * The expiration time of the token, in seconds. You can specify a custom
     * expiration time for the token so that you can cache it. If you don't
     * provide an expiration time, the token is valid for 15 minutes. You can
     * exchange the token with Amazon STS for temporary AWS credentials,
     * which are valid for a maximum of one hour. The maximum token duration
     * you can set is 24 hours. You should take care in setting the
     * expiration time for a token, as there are significant security
     * implications: an attacker could use a leaked token to access your AWS
     * resources for the token's duration.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 86400<br/>
     */
    private Long tokenDuration;

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
    public GetOpenIdTokenForDeveloperIdentityRequest withIdentityPoolId(String identityPoolId) {
        this.identityPoolId = identityPoolId;
        return this;
    }

    /**
     * A unique identifier in the format REGION:GUID.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 50<br/>
     * <b>Pattern: </b>[\w-]+:[0-9a-f-]+<br/>
     *
     * @return A unique identifier in the format REGION:GUID.
     */
    public String getIdentityId() {
        return identityId;
    }
    
    /**
     * A unique identifier in the format REGION:GUID.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 50<br/>
     * <b>Pattern: </b>[\w-]+:[0-9a-f-]+<br/>
     *
     * @param identityId A unique identifier in the format REGION:GUID.
     */
    public void setIdentityId(String identityId) {
        this.identityId = identityId;
    }
    
    /**
     * A unique identifier in the format REGION:GUID.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 50<br/>
     * <b>Pattern: </b>[\w-]+:[0-9a-f-]+<br/>
     *
     * @param identityId A unique identifier in the format REGION:GUID.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public GetOpenIdTokenForDeveloperIdentityRequest withIdentityId(String identityId) {
        this.identityId = identityId;
        return this;
    }

    /**
     * A set of optional name-value pairs that map provider names to provider
     * tokens. Each name-value pair represents a user from a public provider
     * or developer provider. If the user is from a developer provider, the
     * name-value pair will follow the syntax
     * <code>"developer_provider_name": "developer_user_identifier"</code>.
     * The developer provider is the "domain" by which Cognito will refer to
     * your users; you provided this domain while creating/updating the
     * identity pool. The developer user identifier is an identifier from
     * your backend that uniquely identifies a user. When you create an
     * identity pool, you can specify the supported logins.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 10<br/>
     *
     * @return A set of optional name-value pairs that map provider names to provider
     *         tokens. Each name-value pair represents a user from a public provider
     *         or developer provider. If the user is from a developer provider, the
     *         name-value pair will follow the syntax
     *         <code>"developer_provider_name": "developer_user_identifier"</code>.
     *         The developer provider is the "domain" by which Cognito will refer to
     *         your users; you provided this domain while creating/updating the
     *         identity pool. The developer user identifier is an identifier from
     *         your backend that uniquely identifies a user. When you create an
     *         identity pool, you can specify the supported logins.
     */
    public java.util.Map<String,String> getLogins() {
        
        return logins;
    }
    
    /**
     * A set of optional name-value pairs that map provider names to provider
     * tokens. Each name-value pair represents a user from a public provider
     * or developer provider. If the user is from a developer provider, the
     * name-value pair will follow the syntax
     * <code>"developer_provider_name": "developer_user_identifier"</code>.
     * The developer provider is the "domain" by which Cognito will refer to
     * your users; you provided this domain while creating/updating the
     * identity pool. The developer user identifier is an identifier from
     * your backend that uniquely identifies a user. When you create an
     * identity pool, you can specify the supported logins.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 10<br/>
     *
     * @param logins A set of optional name-value pairs that map provider names to provider
     *         tokens. Each name-value pair represents a user from a public provider
     *         or developer provider. If the user is from a developer provider, the
     *         name-value pair will follow the syntax
     *         <code>"developer_provider_name": "developer_user_identifier"</code>.
     *         The developer provider is the "domain" by which Cognito will refer to
     *         your users; you provided this domain while creating/updating the
     *         identity pool. The developer user identifier is an identifier from
     *         your backend that uniquely identifies a user. When you create an
     *         identity pool, you can specify the supported logins.
     */
    public void setLogins(java.util.Map<String,String> logins) {
        this.logins = logins;
    }
    
    /**
     * A set of optional name-value pairs that map provider names to provider
     * tokens. Each name-value pair represents a user from a public provider
     * or developer provider. If the user is from a developer provider, the
     * name-value pair will follow the syntax
     * <code>"developer_provider_name": "developer_user_identifier"</code>.
     * The developer provider is the "domain" by which Cognito will refer to
     * your users; you provided this domain while creating/updating the
     * identity pool. The developer user identifier is an identifier from
     * your backend that uniquely identifies a user. When you create an
     * identity pool, you can specify the supported logins.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 10<br/>
     *
     * @param logins A set of optional name-value pairs that map provider names to provider
     *         tokens. Each name-value pair represents a user from a public provider
     *         or developer provider. If the user is from a developer provider, the
     *         name-value pair will follow the syntax
     *         <code>"developer_provider_name": "developer_user_identifier"</code>.
     *         The developer provider is the "domain" by which Cognito will refer to
     *         your users; you provided this domain while creating/updating the
     *         identity pool. The developer user identifier is an identifier from
     *         your backend that uniquely identifies a user. When you create an
     *         identity pool, you can specify the supported logins.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public GetOpenIdTokenForDeveloperIdentityRequest withLogins(java.util.Map<String,String> logins) {
        setLogins(logins);
        return this;
    }

    /**
     * A set of optional name-value pairs that map provider names to provider
     * tokens. Each name-value pair represents a user from a public provider
     * or developer provider. If the user is from a developer provider, the
     * name-value pair will follow the syntax
     * <code>"developer_provider_name": "developer_user_identifier"</code>.
     * The developer provider is the "domain" by which Cognito will refer to
     * your users; you provided this domain while creating/updating the
     * identity pool. The developer user identifier is an identifier from
     * your backend that uniquely identifies a user. When you create an
     * identity pool, you can specify the supported logins.
     * <p>
     * The method adds a new key-value pair into Logins parameter, and
     * returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 10<br/>
     *
     * @param key The key of the entry to be added into Logins.
     * @param value The corresponding value of the entry to be added into Logins.
     */
    public GetOpenIdTokenForDeveloperIdentityRequest addLoginsEntry(String key, String value) {
        if (null == this.logins) {
            this.logins = new java.util.HashMap<String,String>();
        }
        if (this.logins.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.logins.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Logins.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     */
    public GetOpenIdTokenForDeveloperIdentityRequest clearLoginsEntries() {
        this.logins = null;
        return this;
    }
    
    /**
     * The expiration time of the token, in seconds. You can specify a custom
     * expiration time for the token so that you can cache it. If you don't
     * provide an expiration time, the token is valid for 15 minutes. You can
     * exchange the token with Amazon STS for temporary AWS credentials,
     * which are valid for a maximum of one hour. The maximum token duration
     * you can set is 24 hours. You should take care in setting the
     * expiration time for a token, as there are significant security
     * implications: an attacker could use a leaked token to access your AWS
     * resources for the token's duration.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 86400<br/>
     *
     * @return The expiration time of the token, in seconds. You can specify a custom
     *         expiration time for the token so that you can cache it. If you don't
     *         provide an expiration time, the token is valid for 15 minutes. You can
     *         exchange the token with Amazon STS for temporary AWS credentials,
     *         which are valid for a maximum of one hour. The maximum token duration
     *         you can set is 24 hours. You should take care in setting the
     *         expiration time for a token, as there are significant security
     *         implications: an attacker could use a leaked token to access your AWS
     *         resources for the token's duration.
     */
    public Long getTokenDuration() {
        return tokenDuration;
    }
    
    /**
     * The expiration time of the token, in seconds. You can specify a custom
     * expiration time for the token so that you can cache it. If you don't
     * provide an expiration time, the token is valid for 15 minutes. You can
     * exchange the token with Amazon STS for temporary AWS credentials,
     * which are valid for a maximum of one hour. The maximum token duration
     * you can set is 24 hours. You should take care in setting the
     * expiration time for a token, as there are significant security
     * implications: an attacker could use a leaked token to access your AWS
     * resources for the token's duration.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 86400<br/>
     *
     * @param tokenDuration The expiration time of the token, in seconds. You can specify a custom
     *         expiration time for the token so that you can cache it. If you don't
     *         provide an expiration time, the token is valid for 15 minutes. You can
     *         exchange the token with Amazon STS for temporary AWS credentials,
     *         which are valid for a maximum of one hour. The maximum token duration
     *         you can set is 24 hours. You should take care in setting the
     *         expiration time for a token, as there are significant security
     *         implications: an attacker could use a leaked token to access your AWS
     *         resources for the token's duration.
     */
    public void setTokenDuration(Long tokenDuration) {
        this.tokenDuration = tokenDuration;
    }
    
    /**
     * The expiration time of the token, in seconds. You can specify a custom
     * expiration time for the token so that you can cache it. If you don't
     * provide an expiration time, the token is valid for 15 minutes. You can
     * exchange the token with Amazon STS for temporary AWS credentials,
     * which are valid for a maximum of one hour. The maximum token duration
     * you can set is 24 hours. You should take care in setting the
     * expiration time for a token, as there are significant security
     * implications: an attacker could use a leaked token to access your AWS
     * resources for the token's duration.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 86400<br/>
     *
     * @param tokenDuration The expiration time of the token, in seconds. You can specify a custom
     *         expiration time for the token so that you can cache it. If you don't
     *         provide an expiration time, the token is valid for 15 minutes. You can
     *         exchange the token with Amazon STS for temporary AWS credentials,
     *         which are valid for a maximum of one hour. The maximum token duration
     *         you can set is 24 hours. You should take care in setting the
     *         expiration time for a token, as there are significant security
     *         implications: an attacker could use a leaked token to access your AWS
     *         resources for the token's duration.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public GetOpenIdTokenForDeveloperIdentityRequest withTokenDuration(Long tokenDuration) {
        this.tokenDuration = tokenDuration;
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
        if (getIdentityId() != null) sb.append("IdentityId: " + getIdentityId() + ",");
        if (getLogins() != null) sb.append("Logins: " + getLogins() + ",");
        if (getTokenDuration() != null) sb.append("TokenDuration: " + getTokenDuration() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getIdentityPoolId() == null) ? 0 : getIdentityPoolId().hashCode()); 
        hashCode = prime * hashCode + ((getIdentityId() == null) ? 0 : getIdentityId().hashCode()); 
        hashCode = prime * hashCode + ((getLogins() == null) ? 0 : getLogins().hashCode()); 
        hashCode = prime * hashCode + ((getTokenDuration() == null) ? 0 : getTokenDuration().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof GetOpenIdTokenForDeveloperIdentityRequest == false) return false;
        GetOpenIdTokenForDeveloperIdentityRequest other = (GetOpenIdTokenForDeveloperIdentityRequest)obj;
        
        if (other.getIdentityPoolId() == null ^ this.getIdentityPoolId() == null) return false;
        if (other.getIdentityPoolId() != null && other.getIdentityPoolId().equals(this.getIdentityPoolId()) == false) return false; 
        if (other.getIdentityId() == null ^ this.getIdentityId() == null) return false;
        if (other.getIdentityId() != null && other.getIdentityId().equals(this.getIdentityId()) == false) return false; 
        if (other.getLogins() == null ^ this.getLogins() == null) return false;
        if (other.getLogins() != null && other.getLogins().equals(this.getLogins()) == false) return false; 
        if (other.getTokenDuration() == null ^ this.getTokenDuration() == null) return false;
        if (other.getTokenDuration() != null && other.getTokenDuration().equals(this.getTokenDuration()) == false) return false; 
        return true;
    }
    
}
    