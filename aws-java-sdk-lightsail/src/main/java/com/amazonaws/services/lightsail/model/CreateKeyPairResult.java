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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/CreateKeyPair" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateKeyPairResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * An array of key-value pairs containing information about the new key pair you just created.
     * </p>
     */
    private KeyPair keyPair;
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
     * An array of key-value pairs containing information about the results of your create key pair request.
     * </p>
     */
    private Operation operation;

    /**
     * <p>
     * An array of key-value pairs containing information about the new key pair you just created.
     * </p>
     * 
     * @param keyPair
     *        An array of key-value pairs containing information about the new key pair you just created.
     */

    public void setKeyPair(KeyPair keyPair) {
        this.keyPair = keyPair;
    }

    /**
     * <p>
     * An array of key-value pairs containing information about the new key pair you just created.
     * </p>
     * 
     * @return An array of key-value pairs containing information about the new key pair you just created.
     */

    public KeyPair getKeyPair() {
        return this.keyPair;
    }

    /**
     * <p>
     * An array of key-value pairs containing information about the new key pair you just created.
     * </p>
     * 
     * @param keyPair
     *        An array of key-value pairs containing information about the new key pair you just created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateKeyPairResult withKeyPair(KeyPair keyPair) {
        setKeyPair(keyPair);
        return this;
    }

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

    public CreateKeyPairResult withPublicKeyBase64(String publicKeyBase64) {
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

    public CreateKeyPairResult withPrivateKeyBase64(String privateKeyBase64) {
        setPrivateKeyBase64(privateKeyBase64);
        return this;
    }

    /**
     * <p>
     * An array of key-value pairs containing information about the results of your create key pair request.
     * </p>
     * 
     * @param operation
     *        An array of key-value pairs containing information about the results of your create key pair request.
     */

    public void setOperation(Operation operation) {
        this.operation = operation;
    }

    /**
     * <p>
     * An array of key-value pairs containing information about the results of your create key pair request.
     * </p>
     * 
     * @return An array of key-value pairs containing information about the results of your create key pair request.
     */

    public Operation getOperation() {
        return this.operation;
    }

    /**
     * <p>
     * An array of key-value pairs containing information about the results of your create key pair request.
     * </p>
     * 
     * @param operation
     *        An array of key-value pairs containing information about the results of your create key pair request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateKeyPairResult withOperation(Operation operation) {
        setOperation(operation);
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
        if (getKeyPair() != null)
            sb.append("KeyPair: ").append(getKeyPair()).append(",");
        if (getPublicKeyBase64() != null)
            sb.append("PublicKeyBase64: ").append(getPublicKeyBase64()).append(",");
        if (getPrivateKeyBase64() != null)
            sb.append("PrivateKeyBase64: ").append(getPrivateKeyBase64()).append(",");
        if (getOperation() != null)
            sb.append("Operation: ").append(getOperation());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateKeyPairResult == false)
            return false;
        CreateKeyPairResult other = (CreateKeyPairResult) obj;
        if (other.getKeyPair() == null ^ this.getKeyPair() == null)
            return false;
        if (other.getKeyPair() != null && other.getKeyPair().equals(this.getKeyPair()) == false)
            return false;
        if (other.getPublicKeyBase64() == null ^ this.getPublicKeyBase64() == null)
            return false;
        if (other.getPublicKeyBase64() != null && other.getPublicKeyBase64().equals(this.getPublicKeyBase64()) == false)
            return false;
        if (other.getPrivateKeyBase64() == null ^ this.getPrivateKeyBase64() == null)
            return false;
        if (other.getPrivateKeyBase64() != null && other.getPrivateKeyBase64().equals(this.getPrivateKeyBase64()) == false)
            return false;
        if (other.getOperation() == null ^ this.getOperation() == null)
            return false;
        if (other.getOperation() != null && other.getOperation().equals(this.getOperation()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getKeyPair() == null) ? 0 : getKeyPair().hashCode());
        hashCode = prime * hashCode + ((getPublicKeyBase64() == null) ? 0 : getPublicKeyBase64().hashCode());
        hashCode = prime * hashCode + ((getPrivateKeyBase64() == null) ? 0 : getPrivateKeyBase64().hashCode());
        hashCode = prime * hashCode + ((getOperation() == null) ? 0 : getOperation().hashCode());
        return hashCode;
    }

    @Override
    public CreateKeyPairResult clone() {
        try {
            return (CreateKeyPairResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
