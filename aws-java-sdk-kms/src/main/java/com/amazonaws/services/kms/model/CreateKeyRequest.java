/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights
 * Reserved.
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

package com.amazonaws.services.kms.model;

import java.io.Serializable;
import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 */
public class CreateKeyRequest extends AmazonWebServiceRequest implements
        Serializable, Cloneable {

    /**
     * <p>
     * Policy to attach to the key. This is required and delegates back to the
     * account. The key is the root of trust. The policy size limit is 32 KiB
     * (32768 bytes).
     * </p>
     */
    private String policy;
    /**
     * <p>
     * Description of the key. We recommend that you choose a description that
     * helps your customer decide whether the key is appropriate for a task.
     * </p>
     */
    private String description;
    /**
     * <p>
     * Specifies the intended use of the key. Currently this defaults to
     * ENCRYPT/DECRYPT, and only symmetric encryption and decryption are
     * supported.
     * </p>
     */
    private String keyUsage;

    /**
     * <p>
     * Policy to attach to the key. This is required and delegates back to the
     * account. The key is the root of trust. The policy size limit is 32 KiB
     * (32768 bytes).
     * </p>
     * 
     * @param policy
     *        Policy to attach to the key. This is required and delegates back
     *        to the account. The key is the root of trust. The policy size
     *        limit is 32 KiB (32768 bytes).
     */
    public void setPolicy(String policy) {
        this.policy = policy;
    }

    /**
     * <p>
     * Policy to attach to the key. This is required and delegates back to the
     * account. The key is the root of trust. The policy size limit is 32 KiB
     * (32768 bytes).
     * </p>
     * 
     * @return Policy to attach to the key. This is required and delegates back
     *         to the account. The key is the root of trust. The policy size
     *         limit is 32 KiB (32768 bytes).
     */
    public String getPolicy() {
        return this.policy;
    }

    /**
     * <p>
     * Policy to attach to the key. This is required and delegates back to the
     * account. The key is the root of trust. The policy size limit is 32 KiB
     * (32768 bytes).
     * </p>
     * 
     * @param policy
     *        Policy to attach to the key. This is required and delegates back
     *        to the account. The key is the root of trust. The policy size
     *        limit is 32 KiB (32768 bytes).
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public CreateKeyRequest withPolicy(String policy) {
        setPolicy(policy);
        return this;
    }

    /**
     * <p>
     * Description of the key. We recommend that you choose a description that
     * helps your customer decide whether the key is appropriate for a task.
     * </p>
     * 
     * @param description
     *        Description of the key. We recommend that you choose a description
     *        that helps your customer decide whether the key is appropriate for
     *        a task.
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * Description of the key. We recommend that you choose a description that
     * helps your customer decide whether the key is appropriate for a task.
     * </p>
     * 
     * @return Description of the key. We recommend that you choose a
     *         description that helps your customer decide whether the key is
     *         appropriate for a task.
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * Description of the key. We recommend that you choose a description that
     * helps your customer decide whether the key is appropriate for a task.
     * </p>
     * 
     * @param description
     *        Description of the key. We recommend that you choose a description
     *        that helps your customer decide whether the key is appropriate for
     *        a task.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public CreateKeyRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * Specifies the intended use of the key. Currently this defaults to
     * ENCRYPT/DECRYPT, and only symmetric encryption and decryption are
     * supported.
     * </p>
     * 
     * @param keyUsage
     *        Specifies the intended use of the key. Currently this defaults to
     *        ENCRYPT/DECRYPT, and only symmetric encryption and decryption are
     *        supported.
     * @see KeyUsageType
     */
    public void setKeyUsage(String keyUsage) {
        this.keyUsage = keyUsage;
    }

    /**
     * <p>
     * Specifies the intended use of the key. Currently this defaults to
     * ENCRYPT/DECRYPT, and only symmetric encryption and decryption are
     * supported.
     * </p>
     * 
     * @return Specifies the intended use of the key. Currently this defaults to
     *         ENCRYPT/DECRYPT, and only symmetric encryption and decryption are
     *         supported.
     * @see KeyUsageType
     */
    public String getKeyUsage() {
        return this.keyUsage;
    }

    /**
     * <p>
     * Specifies the intended use of the key. Currently this defaults to
     * ENCRYPT/DECRYPT, and only symmetric encryption and decryption are
     * supported.
     * </p>
     * 
     * @param keyUsage
     *        Specifies the intended use of the key. Currently this defaults to
     *        ENCRYPT/DECRYPT, and only symmetric encryption and decryption are
     *        supported.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see KeyUsageType
     */
    public CreateKeyRequest withKeyUsage(String keyUsage) {
        setKeyUsage(keyUsage);
        return this;
    }

    /**
     * <p>
     * Specifies the intended use of the key. Currently this defaults to
     * ENCRYPT/DECRYPT, and only symmetric encryption and decryption are
     * supported.
     * </p>
     * 
     * @param keyUsage
     *        Specifies the intended use of the key. Currently this defaults to
     *        ENCRYPT/DECRYPT, and only symmetric encryption and decryption are
     *        supported.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see KeyUsageType
     */
    public void setKeyUsage(KeyUsageType keyUsage) {
        this.keyUsage = keyUsage.toString();
    }

    /**
     * <p>
     * Specifies the intended use of the key. Currently this defaults to
     * ENCRYPT/DECRYPT, and only symmetric encryption and decryption are
     * supported.
     * </p>
     * 
     * @param keyUsage
     *        Specifies the intended use of the key. Currently this defaults to
     *        ENCRYPT/DECRYPT, and only symmetric encryption and decryption are
     *        supported.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see KeyUsageType
     */
    public CreateKeyRequest withKeyUsage(KeyUsageType keyUsage) {
        setKeyUsage(keyUsage);
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
        if (getPolicy() != null)
            sb.append("Policy: " + getPolicy() + ",");
        if (getDescription() != null)
            sb.append("Description: " + getDescription() + ",");
        if (getKeyUsage() != null)
            sb.append("KeyUsage: " + getKeyUsage());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateKeyRequest == false)
            return false;
        CreateKeyRequest other = (CreateKeyRequest) obj;
        if (other.getPolicy() == null ^ this.getPolicy() == null)
            return false;
        if (other.getPolicy() != null
                && other.getPolicy().equals(this.getPolicy()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null
                && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getKeyUsage() == null ^ this.getKeyUsage() == null)
            return false;
        if (other.getKeyUsage() != null
                && other.getKeyUsage().equals(this.getKeyUsage()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getPolicy() == null) ? 0 : getPolicy().hashCode());
        hashCode = prime
                * hashCode
                + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode
                + ((getKeyUsage() == null) ? 0 : getKeyUsage().hashCode());
        return hashCode;
    }

    @Override
    public CreateKeyRequest clone() {
        return (CreateKeyRequest) super.clone();
    }
}