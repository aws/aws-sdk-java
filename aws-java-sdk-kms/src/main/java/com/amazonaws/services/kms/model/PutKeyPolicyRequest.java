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
public class PutKeyPolicyRequest extends AmazonWebServiceRequest implements
        Serializable, Cloneable {

    /**
     * <p>
     * A unique identifier for the customer master key. This value can be a
     * globally unique identifier or the fully specified ARN to a key.
     * <ul>
     * <li>Key ARN Example -
     * arn:aws:kms:us-east-1:123456789012:key/12345678-1234
     * -1234-1234-123456789012</li>
     * <li>Globally Unique Key ID Example - 12345678-1234-1234-1234-123456789012
     * </li>
     * </ul>
     * </p>
     */
    private String keyId;
    /**
     * <p>
     * Name of the policy to be attached. Currently, the only supported name is
     * "default".
     * </p>
     */
    private String policyName;
    /**
     * <p>
     * The policy to attach to the key. This is required and delegates back to
     * the account. The key is the root of trust. The policy size limit is 32
     * KiB (32768 bytes).
     * </p>
     */
    private String policy;

    /**
     * <p>
     * A unique identifier for the customer master key. This value can be a
     * globally unique identifier or the fully specified ARN to a key.
     * <ul>
     * <li>Key ARN Example -
     * arn:aws:kms:us-east-1:123456789012:key/12345678-1234
     * -1234-1234-123456789012</li>
     * <li>Globally Unique Key ID Example - 12345678-1234-1234-1234-123456789012
     * </li>
     * </ul>
     * </p>
     * 
     * @param keyId
     *        A unique identifier for the customer master key. This value can be
     *        a globally unique identifier or the fully specified ARN to a key.
     *        <ul>
     *        <li>Key ARN Example -
     *        arn:aws:kms:us-east-1:123456789012:key/12345678
     *        -1234-1234-1234-123456789012</li>
     *        <li>Globally Unique Key ID Example -
     *        12345678-1234-1234-1234-123456789012</li>
     *        </ul>
     */
    public void setKeyId(String keyId) {
        this.keyId = keyId;
    }

    /**
     * <p>
     * A unique identifier for the customer master key. This value can be a
     * globally unique identifier or the fully specified ARN to a key.
     * <ul>
     * <li>Key ARN Example -
     * arn:aws:kms:us-east-1:123456789012:key/12345678-1234
     * -1234-1234-123456789012</li>
     * <li>Globally Unique Key ID Example - 12345678-1234-1234-1234-123456789012
     * </li>
     * </ul>
     * </p>
     * 
     * @return A unique identifier for the customer master key. This value can
     *         be a globally unique identifier or the fully specified ARN to a
     *         key.
     *         <ul>
     *         <li>Key ARN Example -
     *         arn:aws:kms:us-east-1:123456789012:key/12345678
     *         -1234-1234-1234-123456789012</li>
     *         <li>Globally Unique Key ID Example -
     *         12345678-1234-1234-1234-123456789012</li>
     *         </ul>
     */
    public String getKeyId() {
        return this.keyId;
    }

    /**
     * <p>
     * A unique identifier for the customer master key. This value can be a
     * globally unique identifier or the fully specified ARN to a key.
     * <ul>
     * <li>Key ARN Example -
     * arn:aws:kms:us-east-1:123456789012:key/12345678-1234
     * -1234-1234-123456789012</li>
     * <li>Globally Unique Key ID Example - 12345678-1234-1234-1234-123456789012
     * </li>
     * </ul>
     * </p>
     * 
     * @param keyId
     *        A unique identifier for the customer master key. This value can be
     *        a globally unique identifier or the fully specified ARN to a key.
     *        <ul>
     *        <li>Key ARN Example -
     *        arn:aws:kms:us-east-1:123456789012:key/12345678
     *        -1234-1234-1234-123456789012</li>
     *        <li>Globally Unique Key ID Example -
     *        12345678-1234-1234-1234-123456789012</li>
     *        </ul>
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public PutKeyPolicyRequest withKeyId(String keyId) {
        setKeyId(keyId);
        return this;
    }

    /**
     * <p>
     * Name of the policy to be attached. Currently, the only supported name is
     * "default".
     * </p>
     * 
     * @param policyName
     *        Name of the policy to be attached. Currently, the only supported
     *        name is "default".
     */
    public void setPolicyName(String policyName) {
        this.policyName = policyName;
    }

    /**
     * <p>
     * Name of the policy to be attached. Currently, the only supported name is
     * "default".
     * </p>
     * 
     * @return Name of the policy to be attached. Currently, the only supported
     *         name is "default".
     */
    public String getPolicyName() {
        return this.policyName;
    }

    /**
     * <p>
     * Name of the policy to be attached. Currently, the only supported name is
     * "default".
     * </p>
     * 
     * @param policyName
     *        Name of the policy to be attached. Currently, the only supported
     *        name is "default".
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public PutKeyPolicyRequest withPolicyName(String policyName) {
        setPolicyName(policyName);
        return this;
    }

    /**
     * <p>
     * The policy to attach to the key. This is required and delegates back to
     * the account. The key is the root of trust. The policy size limit is 32
     * KiB (32768 bytes).
     * </p>
     * 
     * @param policy
     *        The policy to attach to the key. This is required and delegates
     *        back to the account. The key is the root of trust. The policy size
     *        limit is 32 KiB (32768 bytes).
     */
    public void setPolicy(String policy) {
        this.policy = policy;
    }

    /**
     * <p>
     * The policy to attach to the key. This is required and delegates back to
     * the account. The key is the root of trust. The policy size limit is 32
     * KiB (32768 bytes).
     * </p>
     * 
     * @return The policy to attach to the key. This is required and delegates
     *         back to the account. The key is the root of trust. The policy
     *         size limit is 32 KiB (32768 bytes).
     */
    public String getPolicy() {
        return this.policy;
    }

    /**
     * <p>
     * The policy to attach to the key. This is required and delegates back to
     * the account. The key is the root of trust. The policy size limit is 32
     * KiB (32768 bytes).
     * </p>
     * 
     * @param policy
     *        The policy to attach to the key. This is required and delegates
     *        back to the account. The key is the root of trust. The policy size
     *        limit is 32 KiB (32768 bytes).
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public PutKeyPolicyRequest withPolicy(String policy) {
        setPolicy(policy);
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
        if (getKeyId() != null)
            sb.append("KeyId: " + getKeyId() + ",");
        if (getPolicyName() != null)
            sb.append("PolicyName: " + getPolicyName() + ",");
        if (getPolicy() != null)
            sb.append("Policy: " + getPolicy());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PutKeyPolicyRequest == false)
            return false;
        PutKeyPolicyRequest other = (PutKeyPolicyRequest) obj;
        if (other.getKeyId() == null ^ this.getKeyId() == null)
            return false;
        if (other.getKeyId() != null
                && other.getKeyId().equals(this.getKeyId()) == false)
            return false;
        if (other.getPolicyName() == null ^ this.getPolicyName() == null)
            return false;
        if (other.getPolicyName() != null
                && other.getPolicyName().equals(this.getPolicyName()) == false)
            return false;
        if (other.getPolicy() == null ^ this.getPolicy() == null)
            return false;
        if (other.getPolicy() != null
                && other.getPolicy().equals(this.getPolicy()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getKeyId() == null) ? 0 : getKeyId().hashCode());
        hashCode = prime * hashCode
                + ((getPolicyName() == null) ? 0 : getPolicyName().hashCode());
        hashCode = prime * hashCode
                + ((getPolicy() == null) ? 0 : getPolicy().hashCode());
        return hashCode;
    }

    @Override
    public PutKeyPolicyRequest clone() {
        return (PutKeyPolicyRequest) super.clone();
    }
}