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
package com.amazonaws.services.securitytoken.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * AWS credentials for API authentication.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sts-2011-06-15/Credentials" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Credentials implements Serializable, Cloneable {

    /**
     * <p>
     * The access key ID that identifies the temporary security credentials.
     * </p>
     */
    private String accessKeyId;
    /**
     * <p>
     * The secret access key that can be used to sign requests.
     * </p>
     */
    private String secretAccessKey;
    /**
     * <p>
     * The token that users must pass to the service API to use the temporary credentials.
     * </p>
     */
    private String sessionToken;
    /**
     * <p>
     * The date on which the current credentials expire.
     * </p>
     */
    private java.util.Date expiration;

    /**
     * Default constructor for Credentials object. Callers should use the setter or fluent setter (with...) methods to
     * initialize the object after creating it.
     */
    public Credentials() {
    }

    /**
     * Constructs a new Credentials object. Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param accessKeyId
     *        The access key ID that identifies the temporary security credentials.
     * @param secretAccessKey
     *        The secret access key that can be used to sign requests.
     * @param sessionToken
     *        The token that users must pass to the service API to use the temporary credentials.
     * @param expiration
     *        The date on which the current credentials expire.
     */
    public Credentials(String accessKeyId, String secretAccessKey, String sessionToken, java.util.Date expiration) {
        setAccessKeyId(accessKeyId);
        setSecretAccessKey(secretAccessKey);
        setSessionToken(sessionToken);
        setExpiration(expiration);
    }

    /**
     * <p>
     * The access key ID that identifies the temporary security credentials.
     * </p>
     * 
     * @param accessKeyId
     *        The access key ID that identifies the temporary security credentials.
     */

    public void setAccessKeyId(String accessKeyId) {
        this.accessKeyId = accessKeyId;
    }

    /**
     * <p>
     * The access key ID that identifies the temporary security credentials.
     * </p>
     * 
     * @return The access key ID that identifies the temporary security credentials.
     */

    public String getAccessKeyId() {
        return this.accessKeyId;
    }

    /**
     * <p>
     * The access key ID that identifies the temporary security credentials.
     * </p>
     * 
     * @param accessKeyId
     *        The access key ID that identifies the temporary security credentials.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Credentials withAccessKeyId(String accessKeyId) {
        setAccessKeyId(accessKeyId);
        return this;
    }

    /**
     * <p>
     * The secret access key that can be used to sign requests.
     * </p>
     * 
     * @param secretAccessKey
     *        The secret access key that can be used to sign requests.
     */

    public void setSecretAccessKey(String secretAccessKey) {
        this.secretAccessKey = secretAccessKey;
    }

    /**
     * <p>
     * The secret access key that can be used to sign requests.
     * </p>
     * 
     * @return The secret access key that can be used to sign requests.
     */

    public String getSecretAccessKey() {
        return this.secretAccessKey;
    }

    /**
     * <p>
     * The secret access key that can be used to sign requests.
     * </p>
     * 
     * @param secretAccessKey
     *        The secret access key that can be used to sign requests.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Credentials withSecretAccessKey(String secretAccessKey) {
        setSecretAccessKey(secretAccessKey);
        return this;
    }

    /**
     * <p>
     * The token that users must pass to the service API to use the temporary credentials.
     * </p>
     * 
     * @param sessionToken
     *        The token that users must pass to the service API to use the temporary credentials.
     */

    public void setSessionToken(String sessionToken) {
        this.sessionToken = sessionToken;
    }

    /**
     * <p>
     * The token that users must pass to the service API to use the temporary credentials.
     * </p>
     * 
     * @return The token that users must pass to the service API to use the temporary credentials.
     */

    public String getSessionToken() {
        return this.sessionToken;
    }

    /**
     * <p>
     * The token that users must pass to the service API to use the temporary credentials.
     * </p>
     * 
     * @param sessionToken
     *        The token that users must pass to the service API to use the temporary credentials.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Credentials withSessionToken(String sessionToken) {
        setSessionToken(sessionToken);
        return this;
    }

    /**
     * <p>
     * The date on which the current credentials expire.
     * </p>
     * 
     * @param expiration
     *        The date on which the current credentials expire.
     */

    public void setExpiration(java.util.Date expiration) {
        this.expiration = expiration;
    }

    /**
     * <p>
     * The date on which the current credentials expire.
     * </p>
     * 
     * @return The date on which the current credentials expire.
     */

    public java.util.Date getExpiration() {
        return this.expiration;
    }

    /**
     * <p>
     * The date on which the current credentials expire.
     * </p>
     * 
     * @param expiration
     *        The date on which the current credentials expire.
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
        if (getSecretAccessKey() != null)
            sb.append("SecretAccessKey: ").append(getSecretAccessKey()).append(",");
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
        if (other.getSecretAccessKey() == null ^ this.getSecretAccessKey() == null)
            return false;
        if (other.getSecretAccessKey() != null && other.getSecretAccessKey().equals(this.getSecretAccessKey()) == false)
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
        hashCode = prime * hashCode + ((getSecretAccessKey() == null) ? 0 : getSecretAccessKey().hashCode());
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

}
