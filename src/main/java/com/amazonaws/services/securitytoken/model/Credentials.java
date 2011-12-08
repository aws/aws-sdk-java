/*
 * Copyright 2010-2011 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

/**
 * <p>
 * AWS credentials for API authentication.
 * </p>
 */
public class Credentials {

    /**
     * AccessKeyId ID that identifies the temporary credentials.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>16 - 32<br/>
     * <b>Pattern: </b>[\w]*<br/>
     */
    private String accessKeyId;

    /**
     * The Secret Access Key to sign requests.
     */
    private String secretAccessKey;

    /**
     * The security token that users must pass to the service API to use the
     * temporary credentials.
     */
    private String sessionToken;

    /**
     * The date on which these credentials expire.
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
     * @param accessKeyId AccessKeyId ID that identifies the temporary
     * credentials.
     * @param secretAccessKey The Secret Access Key to sign requests.
     * @param sessionToken The security token that users must pass to the
     * service API to use the temporary credentials.
     * @param expiration The date on which these credentials expire.
     */
    public Credentials(String accessKeyId, String secretAccessKey, String sessionToken, java.util.Date expiration) {
        this.accessKeyId = accessKeyId;
        this.secretAccessKey = secretAccessKey;
        this.sessionToken = sessionToken;
        this.expiration = expiration;
    }

    
    
    /**
     * AccessKeyId ID that identifies the temporary credentials.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>16 - 32<br/>
     * <b>Pattern: </b>[\w]*<br/>
     *
     * @return AccessKeyId ID that identifies the temporary credentials.
     */
    public String getAccessKeyId() {
        return accessKeyId;
    }
    
    /**
     * AccessKeyId ID that identifies the temporary credentials.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>16 - 32<br/>
     * <b>Pattern: </b>[\w]*<br/>
     *
     * @param accessKeyId AccessKeyId ID that identifies the temporary credentials.
     */
    public void setAccessKeyId(String accessKeyId) {
        this.accessKeyId = accessKeyId;
    }
    
    /**
     * AccessKeyId ID that identifies the temporary credentials.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>16 - 32<br/>
     * <b>Pattern: </b>[\w]*<br/>
     *
     * @param accessKeyId AccessKeyId ID that identifies the temporary credentials.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public Credentials withAccessKeyId(String accessKeyId) {
        this.accessKeyId = accessKeyId;
        return this;
    }
    
    
    /**
     * The Secret Access Key to sign requests.
     *
     * @return The Secret Access Key to sign requests.
     */
    public String getSecretAccessKey() {
        return secretAccessKey;
    }
    
    /**
     * The Secret Access Key to sign requests.
     *
     * @param secretAccessKey The Secret Access Key to sign requests.
     */
    public void setSecretAccessKey(String secretAccessKey) {
        this.secretAccessKey = secretAccessKey;
    }
    
    /**
     * The Secret Access Key to sign requests.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param secretAccessKey The Secret Access Key to sign requests.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public Credentials withSecretAccessKey(String secretAccessKey) {
        this.secretAccessKey = secretAccessKey;
        return this;
    }
    
    
    /**
     * The security token that users must pass to the service API to use the
     * temporary credentials.
     *
     * @return The security token that users must pass to the service API to use the
     *         temporary credentials.
     */
    public String getSessionToken() {
        return sessionToken;
    }
    
    /**
     * The security token that users must pass to the service API to use the
     * temporary credentials.
     *
     * @param sessionToken The security token that users must pass to the service API to use the
     *         temporary credentials.
     */
    public void setSessionToken(String sessionToken) {
        this.sessionToken = sessionToken;
    }
    
    /**
     * The security token that users must pass to the service API to use the
     * temporary credentials.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param sessionToken The security token that users must pass to the service API to use the
     *         temporary credentials.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public Credentials withSessionToken(String sessionToken) {
        this.sessionToken = sessionToken;
        return this;
    }
    
    
    /**
     * The date on which these credentials expire.
     *
     * @return The date on which these credentials expire.
     */
    public java.util.Date getExpiration() {
        return expiration;
    }
    
    /**
     * The date on which these credentials expire.
     *
     * @param expiration The date on which these credentials expire.
     */
    public void setExpiration(java.util.Date expiration) {
        this.expiration = expiration;
    }
    
    /**
     * The date on which these credentials expire.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param expiration The date on which these credentials expire.
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
        sb.append("AccessKeyId: " + accessKeyId + ", ");
        sb.append("SecretAccessKey: " + secretAccessKey + ", ");
        sb.append("SessionToken: " + sessionToken + ", ");
        sb.append("Expiration: " + expiration + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    