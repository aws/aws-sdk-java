/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.securityhub.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains metadata about a customer master key (CMK).
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/AwsKmsKeyDetails" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsKmsKeyDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The twelve-digit account ID of the AWS account that owns the CMK.
     * </p>
     */
    private String aWSAccountId;
    /**
     * <p>
     * The date and time when the CMK was created.
     * </p>
     */
    private Double creationDate;
    /**
     * <p>
     * The globally unique identifier for the CMK.
     * </p>
     */
    private String keyId;
    /**
     * <p>
     * The manager of the CMK. CMKs in your AWS account are either customer managed or AWS managed.
     * </p>
     */
    private String keyManager;
    /**
     * <p>
     * The state of the CMK.
     * </p>
     */
    private String keyState;
    /**
     * <p>
     * The source of the CMK's key material.
     * </p>
     * <p>
     * When this value is <code>AWS_KMS</code>, AWS KMS created the key material.
     * </p>
     * <p>
     * When this value is <code>EXTERNAL</code>, the key material was imported from your existing key management
     * infrastructure or the CMK lacks key material.
     * </p>
     * <p>
     * When this value is <code>AWS_CLOUDHSM</code>, the key material was created in the AWS CloudHSM cluster associated
     * with a custom key store.
     * </p>
     */
    private String origin;

    /**
     * <p>
     * The twelve-digit account ID of the AWS account that owns the CMK.
     * </p>
     * 
     * @param aWSAccountId
     *        The twelve-digit account ID of the AWS account that owns the CMK.
     */

    public void setAWSAccountId(String aWSAccountId) {
        this.aWSAccountId = aWSAccountId;
    }

    /**
     * <p>
     * The twelve-digit account ID of the AWS account that owns the CMK.
     * </p>
     * 
     * @return The twelve-digit account ID of the AWS account that owns the CMK.
     */

    public String getAWSAccountId() {
        return this.aWSAccountId;
    }

    /**
     * <p>
     * The twelve-digit account ID of the AWS account that owns the CMK.
     * </p>
     * 
     * @param aWSAccountId
     *        The twelve-digit account ID of the AWS account that owns the CMK.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsKmsKeyDetails withAWSAccountId(String aWSAccountId) {
        setAWSAccountId(aWSAccountId);
        return this;
    }

    /**
     * <p>
     * The date and time when the CMK was created.
     * </p>
     * 
     * @param creationDate
     *        The date and time when the CMK was created.
     */

    public void setCreationDate(Double creationDate) {
        this.creationDate = creationDate;
    }

    /**
     * <p>
     * The date and time when the CMK was created.
     * </p>
     * 
     * @return The date and time when the CMK was created.
     */

    public Double getCreationDate() {
        return this.creationDate;
    }

    /**
     * <p>
     * The date and time when the CMK was created.
     * </p>
     * 
     * @param creationDate
     *        The date and time when the CMK was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsKmsKeyDetails withCreationDate(Double creationDate) {
        setCreationDate(creationDate);
        return this;
    }

    /**
     * <p>
     * The globally unique identifier for the CMK.
     * </p>
     * 
     * @param keyId
     *        The globally unique identifier for the CMK.
     */

    public void setKeyId(String keyId) {
        this.keyId = keyId;
    }

    /**
     * <p>
     * The globally unique identifier for the CMK.
     * </p>
     * 
     * @return The globally unique identifier for the CMK.
     */

    public String getKeyId() {
        return this.keyId;
    }

    /**
     * <p>
     * The globally unique identifier for the CMK.
     * </p>
     * 
     * @param keyId
     *        The globally unique identifier for the CMK.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsKmsKeyDetails withKeyId(String keyId) {
        setKeyId(keyId);
        return this;
    }

    /**
     * <p>
     * The manager of the CMK. CMKs in your AWS account are either customer managed or AWS managed.
     * </p>
     * 
     * @param keyManager
     *        The manager of the CMK. CMKs in your AWS account are either customer managed or AWS managed.
     */

    public void setKeyManager(String keyManager) {
        this.keyManager = keyManager;
    }

    /**
     * <p>
     * The manager of the CMK. CMKs in your AWS account are either customer managed or AWS managed.
     * </p>
     * 
     * @return The manager of the CMK. CMKs in your AWS account are either customer managed or AWS managed.
     */

    public String getKeyManager() {
        return this.keyManager;
    }

    /**
     * <p>
     * The manager of the CMK. CMKs in your AWS account are either customer managed or AWS managed.
     * </p>
     * 
     * @param keyManager
     *        The manager of the CMK. CMKs in your AWS account are either customer managed or AWS managed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsKmsKeyDetails withKeyManager(String keyManager) {
        setKeyManager(keyManager);
        return this;
    }

    /**
     * <p>
     * The state of the CMK.
     * </p>
     * 
     * @param keyState
     *        The state of the CMK.
     */

    public void setKeyState(String keyState) {
        this.keyState = keyState;
    }

    /**
     * <p>
     * The state of the CMK.
     * </p>
     * 
     * @return The state of the CMK.
     */

    public String getKeyState() {
        return this.keyState;
    }

    /**
     * <p>
     * The state of the CMK.
     * </p>
     * 
     * @param keyState
     *        The state of the CMK.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsKmsKeyDetails withKeyState(String keyState) {
        setKeyState(keyState);
        return this;
    }

    /**
     * <p>
     * The source of the CMK's key material.
     * </p>
     * <p>
     * When this value is <code>AWS_KMS</code>, AWS KMS created the key material.
     * </p>
     * <p>
     * When this value is <code>EXTERNAL</code>, the key material was imported from your existing key management
     * infrastructure or the CMK lacks key material.
     * </p>
     * <p>
     * When this value is <code>AWS_CLOUDHSM</code>, the key material was created in the AWS CloudHSM cluster associated
     * with a custom key store.
     * </p>
     * 
     * @param origin
     *        The source of the CMK's key material.</p>
     *        <p>
     *        When this value is <code>AWS_KMS</code>, AWS KMS created the key material.
     *        </p>
     *        <p>
     *        When this value is <code>EXTERNAL</code>, the key material was imported from your existing key management
     *        infrastructure or the CMK lacks key material.
     *        </p>
     *        <p>
     *        When this value is <code>AWS_CLOUDHSM</code>, the key material was created in the AWS CloudHSM cluster
     *        associated with a custom key store.
     */

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    /**
     * <p>
     * The source of the CMK's key material.
     * </p>
     * <p>
     * When this value is <code>AWS_KMS</code>, AWS KMS created the key material.
     * </p>
     * <p>
     * When this value is <code>EXTERNAL</code>, the key material was imported from your existing key management
     * infrastructure or the CMK lacks key material.
     * </p>
     * <p>
     * When this value is <code>AWS_CLOUDHSM</code>, the key material was created in the AWS CloudHSM cluster associated
     * with a custom key store.
     * </p>
     * 
     * @return The source of the CMK's key material.</p>
     *         <p>
     *         When this value is <code>AWS_KMS</code>, AWS KMS created the key material.
     *         </p>
     *         <p>
     *         When this value is <code>EXTERNAL</code>, the key material was imported from your existing key management
     *         infrastructure or the CMK lacks key material.
     *         </p>
     *         <p>
     *         When this value is <code>AWS_CLOUDHSM</code>, the key material was created in the AWS CloudHSM cluster
     *         associated with a custom key store.
     */

    public String getOrigin() {
        return this.origin;
    }

    /**
     * <p>
     * The source of the CMK's key material.
     * </p>
     * <p>
     * When this value is <code>AWS_KMS</code>, AWS KMS created the key material.
     * </p>
     * <p>
     * When this value is <code>EXTERNAL</code>, the key material was imported from your existing key management
     * infrastructure or the CMK lacks key material.
     * </p>
     * <p>
     * When this value is <code>AWS_CLOUDHSM</code>, the key material was created in the AWS CloudHSM cluster associated
     * with a custom key store.
     * </p>
     * 
     * @param origin
     *        The source of the CMK's key material.</p>
     *        <p>
     *        When this value is <code>AWS_KMS</code>, AWS KMS created the key material.
     *        </p>
     *        <p>
     *        When this value is <code>EXTERNAL</code>, the key material was imported from your existing key management
     *        infrastructure or the CMK lacks key material.
     *        </p>
     *        <p>
     *        When this value is <code>AWS_CLOUDHSM</code>, the key material was created in the AWS CloudHSM cluster
     *        associated with a custom key store.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsKmsKeyDetails withOrigin(String origin) {
        setOrigin(origin);
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
        if (getAWSAccountId() != null)
            sb.append("AWSAccountId: ").append(getAWSAccountId()).append(",");
        if (getCreationDate() != null)
            sb.append("CreationDate: ").append(getCreationDate()).append(",");
        if (getKeyId() != null)
            sb.append("KeyId: ").append(getKeyId()).append(",");
        if (getKeyManager() != null)
            sb.append("KeyManager: ").append(getKeyManager()).append(",");
        if (getKeyState() != null)
            sb.append("KeyState: ").append(getKeyState()).append(",");
        if (getOrigin() != null)
            sb.append("Origin: ").append(getOrigin());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AwsKmsKeyDetails == false)
            return false;
        AwsKmsKeyDetails other = (AwsKmsKeyDetails) obj;
        if (other.getAWSAccountId() == null ^ this.getAWSAccountId() == null)
            return false;
        if (other.getAWSAccountId() != null && other.getAWSAccountId().equals(this.getAWSAccountId()) == false)
            return false;
        if (other.getCreationDate() == null ^ this.getCreationDate() == null)
            return false;
        if (other.getCreationDate() != null && other.getCreationDate().equals(this.getCreationDate()) == false)
            return false;
        if (other.getKeyId() == null ^ this.getKeyId() == null)
            return false;
        if (other.getKeyId() != null && other.getKeyId().equals(this.getKeyId()) == false)
            return false;
        if (other.getKeyManager() == null ^ this.getKeyManager() == null)
            return false;
        if (other.getKeyManager() != null && other.getKeyManager().equals(this.getKeyManager()) == false)
            return false;
        if (other.getKeyState() == null ^ this.getKeyState() == null)
            return false;
        if (other.getKeyState() != null && other.getKeyState().equals(this.getKeyState()) == false)
            return false;
        if (other.getOrigin() == null ^ this.getOrigin() == null)
            return false;
        if (other.getOrigin() != null && other.getOrigin().equals(this.getOrigin()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAWSAccountId() == null) ? 0 : getAWSAccountId().hashCode());
        hashCode = prime * hashCode + ((getCreationDate() == null) ? 0 : getCreationDate().hashCode());
        hashCode = prime * hashCode + ((getKeyId() == null) ? 0 : getKeyId().hashCode());
        hashCode = prime * hashCode + ((getKeyManager() == null) ? 0 : getKeyManager().hashCode());
        hashCode = prime * hashCode + ((getKeyState() == null) ? 0 : getKeyState().hashCode());
        hashCode = prime * hashCode + ((getOrigin() == null) ? 0 : getOrigin().hashCode());
        return hashCode;
    }

    @Override
    public AwsKmsKeyDetails clone() {
        try {
            return (AwsKmsKeyDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.AwsKmsKeyDetailsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
