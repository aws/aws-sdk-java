/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.deadline.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The Identity and Access Management credentials.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/AwsCredentials" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsCredentials implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The IAM access key ID.
     * </p>
     */
    private String accessKeyId;
    /**
     * <p>
     * The expiration date and time of the IAM credentials.
     * </p>
     */
    private java.util.Date expiration;
    /**
     * <p>
     * The IAM secret access key.
     * </p>
     */
    private String secretAccessKey;
    /**
     * <p>
     * The IAM session token
     * </p>
     */
    private String sessionToken;

    /**
     * <p>
     * The IAM access key ID.
     * </p>
     * 
     * @param accessKeyId
     *        The IAM access key ID.
     */

    public void setAccessKeyId(String accessKeyId) {
        this.accessKeyId = accessKeyId;
    }

    /**
     * <p>
     * The IAM access key ID.
     * </p>
     * 
     * @return The IAM access key ID.
     */

    public String getAccessKeyId() {
        return this.accessKeyId;
    }

    /**
     * <p>
     * The IAM access key ID.
     * </p>
     * 
     * @param accessKeyId
     *        The IAM access key ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsCredentials withAccessKeyId(String accessKeyId) {
        setAccessKeyId(accessKeyId);
        return this;
    }

    /**
     * <p>
     * The expiration date and time of the IAM credentials.
     * </p>
     * 
     * @param expiration
     *        The expiration date and time of the IAM credentials.
     */

    public void setExpiration(java.util.Date expiration) {
        this.expiration = expiration;
    }

    /**
     * <p>
     * The expiration date and time of the IAM credentials.
     * </p>
     * 
     * @return The expiration date and time of the IAM credentials.
     */

    public java.util.Date getExpiration() {
        return this.expiration;
    }

    /**
     * <p>
     * The expiration date and time of the IAM credentials.
     * </p>
     * 
     * @param expiration
     *        The expiration date and time of the IAM credentials.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsCredentials withExpiration(java.util.Date expiration) {
        setExpiration(expiration);
        return this;
    }

    /**
     * <p>
     * The IAM secret access key.
     * </p>
     * 
     * @param secretAccessKey
     *        The IAM secret access key.
     */

    public void setSecretAccessKey(String secretAccessKey) {
        this.secretAccessKey = secretAccessKey;
    }

    /**
     * <p>
     * The IAM secret access key.
     * </p>
     * 
     * @return The IAM secret access key.
     */

    public String getSecretAccessKey() {
        return this.secretAccessKey;
    }

    /**
     * <p>
     * The IAM secret access key.
     * </p>
     * 
     * @param secretAccessKey
     *        The IAM secret access key.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsCredentials withSecretAccessKey(String secretAccessKey) {
        setSecretAccessKey(secretAccessKey);
        return this;
    }

    /**
     * <p>
     * The IAM session token
     * </p>
     * 
     * @param sessionToken
     *        The IAM session token
     */

    public void setSessionToken(String sessionToken) {
        this.sessionToken = sessionToken;
    }

    /**
     * <p>
     * The IAM session token
     * </p>
     * 
     * @return The IAM session token
     */

    public String getSessionToken() {
        return this.sessionToken;
    }

    /**
     * <p>
     * The IAM session token
     * </p>
     * 
     * @param sessionToken
     *        The IAM session token
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsCredentials withSessionToken(String sessionToken) {
        setSessionToken(sessionToken);
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
            sb.append("AccessKeyId: ").append("***Sensitive Data Redacted***").append(",");
        if (getExpiration() != null)
            sb.append("Expiration: ").append(getExpiration()).append(",");
        if (getSecretAccessKey() != null)
            sb.append("SecretAccessKey: ").append("***Sensitive Data Redacted***").append(",");
        if (getSessionToken() != null)
            sb.append("SessionToken: ").append("***Sensitive Data Redacted***");
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AwsCredentials == false)
            return false;
        AwsCredentials other = (AwsCredentials) obj;
        if (other.getAccessKeyId() == null ^ this.getAccessKeyId() == null)
            return false;
        if (other.getAccessKeyId() != null && other.getAccessKeyId().equals(this.getAccessKeyId()) == false)
            return false;
        if (other.getExpiration() == null ^ this.getExpiration() == null)
            return false;
        if (other.getExpiration() != null && other.getExpiration().equals(this.getExpiration()) == false)
            return false;
        if (other.getSecretAccessKey() == null ^ this.getSecretAccessKey() == null)
            return false;
        if (other.getSecretAccessKey() != null && other.getSecretAccessKey().equals(this.getSecretAccessKey()) == false)
            return false;
        if (other.getSessionToken() == null ^ this.getSessionToken() == null)
            return false;
        if (other.getSessionToken() != null && other.getSessionToken().equals(this.getSessionToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAccessKeyId() == null) ? 0 : getAccessKeyId().hashCode());
        hashCode = prime * hashCode + ((getExpiration() == null) ? 0 : getExpiration().hashCode());
        hashCode = prime * hashCode + ((getSecretAccessKey() == null) ? 0 : getSecretAccessKey().hashCode());
        hashCode = prime * hashCode + ((getSessionToken() == null) ? 0 : getSessionToken().hashCode());
        return hashCode;
    }

    @Override
    public AwsCredentials clone() {
        try {
            return (AwsCredentials) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.deadline.model.transform.AwsCredentialsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
