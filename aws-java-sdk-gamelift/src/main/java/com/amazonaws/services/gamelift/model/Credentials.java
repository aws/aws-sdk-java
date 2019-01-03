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
package com.amazonaws.services.gamelift.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Temporary access credentials used for uploading game build files to Amazon GameLift. They are valid for a limited
 * time. If they expire before you upload your game build, get a new set by calling <a>RequestUploadCredentials</a>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/Credentials" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Credentials implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Temporary key allowing access to the Amazon GameLift S3 account.
     * </p>
     */
    private String accessKeyId;
    /**
     * <p>
     * Temporary secret key allowing access to the Amazon GameLift S3 account.
     * </p>
     */
    private String secretAccessKey;
    /**
     * <p>
     * Token used to associate a specific build ID with the files uploaded using these credentials.
     * </p>
     */
    private String sessionToken;

    /**
     * <p>
     * Temporary key allowing access to the Amazon GameLift S3 account.
     * </p>
     * 
     * @param accessKeyId
     *        Temporary key allowing access to the Amazon GameLift S3 account.
     */

    public void setAccessKeyId(String accessKeyId) {
        this.accessKeyId = accessKeyId;
    }

    /**
     * <p>
     * Temporary key allowing access to the Amazon GameLift S3 account.
     * </p>
     * 
     * @return Temporary key allowing access to the Amazon GameLift S3 account.
     */

    public String getAccessKeyId() {
        return this.accessKeyId;
    }

    /**
     * <p>
     * Temporary key allowing access to the Amazon GameLift S3 account.
     * </p>
     * 
     * @param accessKeyId
     *        Temporary key allowing access to the Amazon GameLift S3 account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Credentials withAccessKeyId(String accessKeyId) {
        setAccessKeyId(accessKeyId);
        return this;
    }

    /**
     * <p>
     * Temporary secret key allowing access to the Amazon GameLift S3 account.
     * </p>
     * 
     * @param secretAccessKey
     *        Temporary secret key allowing access to the Amazon GameLift S3 account.
     */

    public void setSecretAccessKey(String secretAccessKey) {
        this.secretAccessKey = secretAccessKey;
    }

    /**
     * <p>
     * Temporary secret key allowing access to the Amazon GameLift S3 account.
     * </p>
     * 
     * @return Temporary secret key allowing access to the Amazon GameLift S3 account.
     */

    public String getSecretAccessKey() {
        return this.secretAccessKey;
    }

    /**
     * <p>
     * Temporary secret key allowing access to the Amazon GameLift S3 account.
     * </p>
     * 
     * @param secretAccessKey
     *        Temporary secret key allowing access to the Amazon GameLift S3 account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Credentials withSecretAccessKey(String secretAccessKey) {
        setSecretAccessKey(secretAccessKey);
        return this;
    }

    /**
     * <p>
     * Token used to associate a specific build ID with the files uploaded using these credentials.
     * </p>
     * 
     * @param sessionToken
     *        Token used to associate a specific build ID with the files uploaded using these credentials.
     */

    public void setSessionToken(String sessionToken) {
        this.sessionToken = sessionToken;
    }

    /**
     * <p>
     * Token used to associate a specific build ID with the files uploaded using these credentials.
     * </p>
     * 
     * @return Token used to associate a specific build ID with the files uploaded using these credentials.
     */

    public String getSessionToken() {
        return this.sessionToken;
    }

    /**
     * <p>
     * Token used to associate a specific build ID with the files uploaded using these credentials.
     * </p>
     * 
     * @param sessionToken
     *        Token used to associate a specific build ID with the files uploaded using these credentials.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Credentials withSessionToken(String sessionToken) {
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
            sb.append("AccessKeyId: ").append(getAccessKeyId()).append(",");
        if (getSecretAccessKey() != null)
            sb.append("SecretAccessKey: ").append(getSecretAccessKey()).append(",");
        if (getSessionToken() != null)
            sb.append("SessionToken: ").append(getSessionToken());
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
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAccessKeyId() == null) ? 0 : getAccessKeyId().hashCode());
        hashCode = prime * hashCode + ((getSecretAccessKey() == null) ? 0 : getSecretAccessKey().hashCode());
        hashCode = prime * hashCode + ((getSessionToken() == null) ? 0 : getSessionToken().hashCode());
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
        com.amazonaws.services.gamelift.model.transform.CredentialsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
