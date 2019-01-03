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
package com.amazonaws.services.lightsail.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/DownloadDefaultKeyPair" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DownloadDefaultKeyPairResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A base64-encoded public key of the <code>ssh-rsa</code> type.
     * </p>
     */
    private String publicKeyBase64;
    /**
     * <p>
     * A base64-encoded RSA private key.
     * </p>
     */
    private String privateKeyBase64;

    /**
     * <p>
     * A base64-encoded public key of the <code>ssh-rsa</code> type.
     * </p>
     * 
     * @param publicKeyBase64
     *        A base64-encoded public key of the <code>ssh-rsa</code> type.
     */

    public void setPublicKeyBase64(String publicKeyBase64) {
        this.publicKeyBase64 = publicKeyBase64;
    }

    /**
     * <p>
     * A base64-encoded public key of the <code>ssh-rsa</code> type.
     * </p>
     * 
     * @return A base64-encoded public key of the <code>ssh-rsa</code> type.
     */

    public String getPublicKeyBase64() {
        return this.publicKeyBase64;
    }

    /**
     * <p>
     * A base64-encoded public key of the <code>ssh-rsa</code> type.
     * </p>
     * 
     * @param publicKeyBase64
     *        A base64-encoded public key of the <code>ssh-rsa</code> type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DownloadDefaultKeyPairResult withPublicKeyBase64(String publicKeyBase64) {
        setPublicKeyBase64(publicKeyBase64);
        return this;
    }

    /**
     * <p>
     * A base64-encoded RSA private key.
     * </p>
     * 
     * @param privateKeyBase64
     *        A base64-encoded RSA private key.
     */

    public void setPrivateKeyBase64(String privateKeyBase64) {
        this.privateKeyBase64 = privateKeyBase64;
    }

    /**
     * <p>
     * A base64-encoded RSA private key.
     * </p>
     * 
     * @return A base64-encoded RSA private key.
     */

    public String getPrivateKeyBase64() {
        return this.privateKeyBase64;
    }

    /**
     * <p>
     * A base64-encoded RSA private key.
     * </p>
     * 
     * @param privateKeyBase64
     *        A base64-encoded RSA private key.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DownloadDefaultKeyPairResult withPrivateKeyBase64(String privateKeyBase64) {
        setPrivateKeyBase64(privateKeyBase64);
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
        if (getPublicKeyBase64() != null)
            sb.append("PublicKeyBase64: ").append(getPublicKeyBase64()).append(",");
        if (getPrivateKeyBase64() != null)
            sb.append("PrivateKeyBase64: ").append(getPrivateKeyBase64());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DownloadDefaultKeyPairResult == false)
            return false;
        DownloadDefaultKeyPairResult other = (DownloadDefaultKeyPairResult) obj;
        if (other.getPublicKeyBase64() == null ^ this.getPublicKeyBase64() == null)
            return false;
        if (other.getPublicKeyBase64() != null && other.getPublicKeyBase64().equals(this.getPublicKeyBase64()) == false)
            return false;
        if (other.getPrivateKeyBase64() == null ^ this.getPrivateKeyBase64() == null)
            return false;
        if (other.getPrivateKeyBase64() != null && other.getPrivateKeyBase64().equals(this.getPrivateKeyBase64()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPublicKeyBase64() == null) ? 0 : getPublicKeyBase64().hashCode());
        hashCode = prime * hashCode + ((getPrivateKeyBase64() == null) ? 0 : getPrivateKeyBase64().hashCode());
        return hashCode;
    }

    @Override
    public DownloadDefaultKeyPairResult clone() {
        try {
            return (DownloadDefaultKeyPairResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
