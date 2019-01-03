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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Credentials for the provided identity ID.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-identity-2014-06-30/Credentials" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Credentials implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Access Key portion of the credentials.
     * </p>
     */
    private String accessKeyId;
    /**
     * <p>
     * The Secret Access Key portion of the credentials
     * </p>
     */
    private String secretKey;
    /**
     * <p>
     * The Session Token portion of the credentials
     * </p>
     */
    private String sessionToken;
    /**
     * <p>
     * The date at which these credentials will expire.
     * </p>
     */
    private java.util.Date expiration;

    /**
     * <p>
     * The Access Key portion of the credentials.
     * </p>
     * 
     * @param accessKeyId
     *        The Access Key portion of the credentials.
     */

    public void setAccessKeyId(String accessKeyId) {
        this.accessKeyId = accessKeyId;
    }

    /**
     * <p>
     * The Access Key portion of the credentials.
     * </p>
     * 
     * @return The Access Key portion of the credentials.
     */

    public String getAccessKeyId() {
        return this.accessKeyId;
    }

    /**
     * <p>
     * The Access Key portion of the credentials.
     * </p>
     * 
     * @param accessKeyId
     *        The Access Key portion of the credentials.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Credentials withAccessKeyId(String accessKeyId) {
        setAccessKeyId(accessKeyId);
        return this;
    }

    /**
     * <p>
     * The Secret Access Key portion of the credentials
     * </p>
     * 
     * @param secretKey
     *        The Secret Access Key portion of the credentials
     */

    public void setSecretKey(String secretKey) {
        this.secretKey = secretKey;
    }

    /**
     * <p>
     * The Secret Access Key portion of the credentials
     * </p>
     * 
     * @return The Secret Access Key portion of the credentials
     */

    public String getSecretKey() {
        return this.secretKey;
    }

    /**
     * <p>
     * The Secret Access Key portion of the credentials
     * </p>
     * 
     * @param secretKey
     *        The Secret Access Key portion of the credentials
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Credentials withSecretKey(String secretKey) {
        setSecretKey(secretKey);
        return this;
    }

    /**
     * <p>
     * The Session Token portion of the credentials
     * </p>
     * 
     * @param sessionToken
     *        The Session Token portion of the credentials
     */

    public void setSessionToken(String sessionToken) {
        this.sessionToken = sessionToken;
    }

    /**
     * <p>
     * The Session Token portion of the credentials
     * </p>
     * 
     * @return The Session Token portion of the credentials
     */

    public String getSessionToken() {
        return this.sessionToken;
    }

    /**
     * <p>
     * The Session Token portion of the credentials
     * </p>
     * 
     * @param sessionToken
     *        The Session Token portion of the credentials
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Credentials withSessionToken(String sessionToken) {
        setSessionToken(sessionToken);
        return this;
    }

    /**
     * <p>
     * The date at which these credentials will expire.
     * </p>
     * 
     * @param expiration
     *        The date at which these credentials will expire.
     */

    public void setExpiration(java.util.Date expiration) {
        this.expiration = expiration;
    }

    /**
     * <p>
     * The date at which these credentials will expire.
     * </p>
     * 
     * @return The date at which these credentials will expire.
     */

    public java.util.Date getExpiration() {
        return this.expiration;
    }

    /**
     * <p>
     * The date at which these credentials will expire.
     * </p>
     * 
     * @param expiration
     *        The date at which these credentials will expire.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Credentials withExpiration(java.util.Date expiration) {
        setExpiration(expiration);
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
        if (getAccessKeyId() != null)
            sb.append("AccessKeyId: ").append(getAccessKeyId()).append(",");
        if (getSecretKey() != null)
            sb.append("SecretKey: ").append(getSecretKey()).append(",");
        if (getSessionToken() != null)
            sb.append("SessionToken: ").append(getSessionToken()).append(",");
        if (getExpiration() != null)
            sb.append("Expiration: ").append(getExpiration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Credentials == false)
            return false;
        Credentials other = (Credentials) obj;
        if (other.getAccessKeyId() == null ^ this.getAccessKeyId() == null)
            return false;
        if (other.getAccessKeyId() != null && other.getAccessKeyId().equals(this.getAccessKeyId()) == false)
            return false;
        if (other.getSecretKey() == null ^ this.getSecretKey() == null)
            return false;
        if (other.getSecretKey() != null && other.getSecretKey().equals(this.getSecretKey()) == false)
            return false;
        if (other.getSessionToken() == null ^ this.getSessionToken() == null)
            return false;
        if (other.getSessionToken() != null && other.getSessionToken().equals(this.getSessionToken()) == false)
            return false;
        if (other.getExpiration() == null ^ this.getExpiration() == null)
            return false;
        if (other.getExpiration() != null && other.getExpiration().equals(this.getExpiration()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAccessKeyId() == null) ? 0 : getAccessKeyId().hashCode());
        hashCode = prime * hashCode + ((getSecretKey() == null) ? 0 : getSecretKey().hashCode());
        hashCode = prime * hashCode + ((getSessionToken() == null) ? 0 : getSessionToken().hashCode());
        hashCode = prime * hashCode + ((getExpiration() == null) ? 0 : getExpiration().hashCode());
        return hashCode;
    }

    @Override
    public Credentials clone() {
        try {
            return (Credentials) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.cognitoidentity.model.transform.CredentialsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
