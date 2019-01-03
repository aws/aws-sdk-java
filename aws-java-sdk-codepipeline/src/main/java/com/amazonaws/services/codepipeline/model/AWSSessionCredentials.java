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
package com.amazonaws.services.codepipeline.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Represents an AWS session credentials object. These credentials are temporary credentials that are issued by AWS
 * Secure Token Service (STS). They can be used to access input and output artifacts in the Amazon S3 bucket used to
 * store artifact for the pipeline in AWS CodePipeline.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codepipeline-2015-07-09/AWSSessionCredentials" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AWSSessionCredentials implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The access key for the session.
     * </p>
     */
    private String accessKeyId;
    /**
     * <p>
     * The secret access key for the session.
     * </p>
     */
    private String secretAccessKey;
    /**
     * <p>
     * The token for the session.
     * </p>
     */
    private String sessionToken;

    /**
     * <p>
     * The access key for the session.
     * </p>
     * 
     * @param accessKeyId
     *        The access key for the session.
     */

    public void setAccessKeyId(String accessKeyId) {
        this.accessKeyId = accessKeyId;
    }

    /**
     * <p>
     * The access key for the session.
     * </p>
     * 
     * @return The access key for the session.
     */

    public String getAccessKeyId() {
        return this.accessKeyId;
    }

    /**
     * <p>
     * The access key for the session.
     * </p>
     * 
     * @param accessKeyId
     *        The access key for the session.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AWSSessionCredentials withAccessKeyId(String accessKeyId) {
        setAccessKeyId(accessKeyId);
        return this;
    }

    /**
     * <p>
     * The secret access key for the session.
     * </p>
     * 
     * @param secretAccessKey
     *        The secret access key for the session.
     */

    public void setSecretAccessKey(String secretAccessKey) {
        this.secretAccessKey = secretAccessKey;
    }

    /**
     * <p>
     * The secret access key for the session.
     * </p>
     * 
     * @return The secret access key for the session.
     */

    public String getSecretAccessKey() {
        return this.secretAccessKey;
    }

    /**
     * <p>
     * The secret access key for the session.
     * </p>
     * 
     * @param secretAccessKey
     *        The secret access key for the session.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AWSSessionCredentials withSecretAccessKey(String secretAccessKey) {
        setSecretAccessKey(secretAccessKey);
        return this;
    }

    /**
     * <p>
     * The token for the session.
     * </p>
     * 
     * @param sessionToken
     *        The token for the session.
     */

    public void setSessionToken(String sessionToken) {
        this.sessionToken = sessionToken;
    }

    /**
     * <p>
     * The token for the session.
     * </p>
     * 
     * @return The token for the session.
     */

    public String getSessionToken() {
        return this.sessionToken;
    }

    /**
     * <p>
     * The token for the session.
     * </p>
     * 
     * @param sessionToken
     *        The token for the session.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AWSSessionCredentials withSessionToken(String sessionToken) {
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

        if (obj instanceof AWSSessionCredentials == false)
            return false;
        AWSSessionCredentials other = (AWSSessionCredentials) obj;
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
    public AWSSessionCredentials clone() {
        try {
            return (AWSSessionCredentials) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.codepipeline.model.transform.AWSSessionCredentialsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
