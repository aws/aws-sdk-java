/*
 * Copyright 2010-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.securitytoken.model;

import java.io.Serializable;


/**
 * <p>
 * AWS credentials for API authentication.
 * </p>
 */
public class Credentials implements Serializable {

    /**
     * The access key ID that identifies the temporary security credentials.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>16 - 32<br/>
     * <b>Pattern: </b>[\w]*<br/>
     */
    private String accessKeyId;

    /**
     * The secret access key that can be used to sign requests.
     */
    private String secretAccessKey;

    /**
     * The token that users must pass to the service API to use the temporary
     * credentials.
     */
    private String sessionToken;

    /**
     * The date on which the current credentials expire.
     */
    private java.util.Date expiration;

    /**
     * Default constructor for a new Credentials object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public Credentials() {}
    
    /**
     * Constructs a new Credentials object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param accessKeyId The access key ID that identifies the temporary
     * security credentials.
     * @param secretAccessKey The secret access key that can be used to sign
     * requests.
     * @param sessionToken The token that users must pass to the service API
     * to use the temporary credentials.
     * @param expiration The date on which the current credentials expire.
     */
    public Credentials(String accessKeyId, String secretAccessKey, String sessionToken, java.util.Date expiration) {
        setAccessKeyId(accessKeyId);
        setSecretAccessKey(secretAccessKey);
        setSessionToken(sessionToken);
        setExpiration(expiration);
    }

    /**
     * The access key ID that identifies the temporary security credentials.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>16 - 32<br/>
     * <b>Pattern: </b>[\w]*<br/>
     *
     * @return The access key ID that identifies the temporary security credentials.
     */
    public String getAccessKeyId() {
        return accessKeyId;
    }
    
    /**
     * The access key ID that identifies the temporary security credentials.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>16 - 32<br/>
     * <b>Pattern: </b>[\w]*<br/>
     *
     * @param accessKeyId The access key ID that identifies the temporary security credentials.
     */
    public void setAccessKeyId(String accessKeyId) {
        this.accessKeyId = accessKeyId;
    }
    
    /**
     * The access key ID that identifies the temporary security credentials.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>16 - 32<br/>
     * <b>Pattern: </b>[\w]*<br/>
     *
     * @param accessKeyId The access key ID that identifies the temporary security credentials.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Credentials withAccessKeyId(String accessKeyId) {
        this.accessKeyId = accessKeyId;
        return this;
    }

    /**
     * The secret access key that can be used to sign requests.
     *
     * @return The secret access key that can be used to sign requests.
     */
    public String getSecretAccessKey() {
        return secretAccessKey;
    }
    
    /**
     * The secret access key that can be used to sign requests.
     *
     * @param secretAccessKey The secret access key that can be used to sign requests.
     */
    public void setSecretAccessKey(String secretAccessKey) {
        this.secretAccessKey = secretAccessKey;
    }
    
    /**
     * The secret access key that can be used to sign requests.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param secretAccessKey The secret access key that can be used to sign requests.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Credentials withSecretAccessKey(String secretAccessKey) {
        this.secretAccessKey = secretAccessKey;
        return this;
    }

    /**
     * The token that users must pass to the service API to use the temporary
     * credentials.
     *
     * @return The token that users must pass to the service API to use the temporary
     *         credentials.
     */
    public String getSessionToken() {
        return sessionToken;
    }
    
    /**
     * The token that users must pass to the service API to use the temporary
     * credentials.
     *
     * @param sessionToken The token that users must pass to the service API to use the temporary
     *         credentials.
     */
    public void setSessionToken(String sessionToken) {
        this.sessionToken = sessionToken;
    }
    
    /**
     * The token that users must pass to the service API to use the temporary
     * credentials.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param sessionToken The token that users must pass to the service API to use the temporary
     *         credentials.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Credentials withSessionToken(String sessionToken) {
        this.sessionToken = sessionToken;
        return this;
    }

    /**
     * The date on which the current credentials expire.
     *
     * @return The date on which the current credentials expire.
     */
    public java.util.Date getExpiration() {
        return expiration;
    }
    
    /**
     * The date on which the current credentials expire.
     *
     * @param expiration The date on which the current credentials expire.
     */
    public void setExpiration(java.util.Date expiration) {
        this.expiration = expiration;
    }
    
    /**
     * The date on which the current credentials expire.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param expiration The date on which the current credentials expire.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Credentials withExpiration(java.util.Date expiration) {
        this.expiration = expiration;
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
        if (getAccessKeyId() != null) sb.append("AccessKeyId: " + getAccessKeyId() + ",");
        if (getSecretAccessKey() != null) sb.append("SecretAccessKey: " + getSecretAccessKey() + ",");
        if (getSessionToken() != null) sb.append("SessionToken: " + getSessionToken() + ",");
        if (getExpiration() != null) sb.append("Expiration: " + getExpiration() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getAccessKeyId() == null) ? 0 : getAccessKeyId().hashCode()); 
        hashCode = prime * hashCode + ((getSecretAccessKey() == null) ? 0 : getSecretAccessKey().hashCode()); 
        hashCode = prime * hashCode + ((getSessionToken() == null) ? 0 : getSessionToken().hashCode()); 
        hashCode = prime * hashCode + ((getExpiration() == null) ? 0 : getExpiration().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof Credentials == false) return false;
        Credentials other = (Credentials)obj;
        
        if (other.getAccessKeyId() == null ^ this.getAccessKeyId() == null) return false;
        if (other.getAccessKeyId() != null && other.getAccessKeyId().equals(this.getAccessKeyId()) == false) return false; 
        if (other.getSecretAccessKey() == null ^ this.getSecretAccessKey() == null) return false;
        if (other.getSecretAccessKey() != null && other.getSecretAccessKey().equals(this.getSecretAccessKey()) == false) return false; 
        if (other.getSessionToken() == null ^ this.getSessionToken() == null) return false;
        if (other.getSessionToken() != null && other.getSessionToken().equals(this.getSessionToken()) == false) return false; 
        if (other.getExpiration() == null ^ this.getExpiration() == null) return false;
        if (other.getExpiration() != null && other.getExpiration().equals(this.getExpiration()) == false) return false; 
        return true;
    }
    
}
    