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
package com.amazonaws.services.marketplacemetering.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/meteringmarketplace-2016-01-14/RegisterUsage" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RegisterUsageResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * (Optional) Only included when public key version has expired
     * </p>
     */
    private java.util.Date publicKeyRotationTimestamp;
    /**
     * <p>
     * JWT Token
     * </p>
     */
    private String signature;

    /**
     * <p>
     * (Optional) Only included when public key version has expired
     * </p>
     * 
     * @param publicKeyRotationTimestamp
     *        (Optional) Only included when public key version has expired
     */

    public void setPublicKeyRotationTimestamp(java.util.Date publicKeyRotationTimestamp) {
        this.publicKeyRotationTimestamp = publicKeyRotationTimestamp;
    }

    /**
     * <p>
     * (Optional) Only included when public key version has expired
     * </p>
     * 
     * @return (Optional) Only included when public key version has expired
     */

    public java.util.Date getPublicKeyRotationTimestamp() {
        return this.publicKeyRotationTimestamp;
    }

    /**
     * <p>
     * (Optional) Only included when public key version has expired
     * </p>
     * 
     * @param publicKeyRotationTimestamp
     *        (Optional) Only included when public key version has expired
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RegisterUsageResult withPublicKeyRotationTimestamp(java.util.Date publicKeyRotationTimestamp) {
        setPublicKeyRotationTimestamp(publicKeyRotationTimestamp);
        return this;
    }

    /**
     * <p>
     * JWT Token
     * </p>
     * 
     * @param signature
     *        JWT Token
     */

    public void setSignature(String signature) {
        this.signature = signature;
    }

    /**
     * <p>
     * JWT Token
     * </p>
     * 
     * @return JWT Token
     */

    public String getSignature() {
        return this.signature;
    }

    /**
     * <p>
     * JWT Token
     * </p>
     * 
     * @param signature
     *        JWT Token
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RegisterUsageResult withSignature(String signature) {
        setSignature(signature);
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
        if (getPublicKeyRotationTimestamp() != null)
            sb.append("PublicKeyRotationTimestamp: ").append(getPublicKeyRotationTimestamp()).append(",");
        if (getSignature() != null)
            sb.append("Signature: ").append(getSignature());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RegisterUsageResult == false)
            return false;
        RegisterUsageResult other = (RegisterUsageResult) obj;
        if (other.getPublicKeyRotationTimestamp() == null ^ this.getPublicKeyRotationTimestamp() == null)
            return false;
        if (other.getPublicKeyRotationTimestamp() != null && other.getPublicKeyRotationTimestamp().equals(this.getPublicKeyRotationTimestamp()) == false)
            return false;
        if (other.getSignature() == null ^ this.getSignature() == null)
            return false;
        if (other.getSignature() != null && other.getSignature().equals(this.getSignature()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPublicKeyRotationTimestamp() == null) ? 0 : getPublicKeyRotationTimestamp().hashCode());
        hashCode = prime * hashCode + ((getSignature() == null) ? 0 : getSignature().hashCode());
        return hashCode;
    }

    @Override
    public RegisterUsageResult clone() {
        try {
            return (RegisterUsageResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
