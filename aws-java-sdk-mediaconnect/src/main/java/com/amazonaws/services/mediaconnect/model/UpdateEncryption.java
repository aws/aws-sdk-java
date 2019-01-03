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
package com.amazonaws.services.mediaconnect.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * Information about the encryption of the flow.
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconnect-2018-11-14/UpdateEncryption" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateEncryption implements Serializable, Cloneable, StructuredPojo {

    /** The type of algorithm that is used for the encryption (such as aes128, aes192, or aes256). */
    private String algorithm;
    /**
     * The type of key that is used for the encryption. If no keyType is provided, the service will use the default
     * setting (static-key).
     */
    private String keyType;
    /**
     * The ARN of the role that you created during setup (when you set up AWS Elemental MediaConnect as a trusted
     * entity).
     */
    private String roleArn;
    /** The ARN that was assigned to the secret that you created in AWS Secrets Manager to store the encryption key. */
    private String secretArn;

    /**
     * The type of algorithm that is used for the encryption (such as aes128, aes192, or aes256).
     * 
     * @param algorithm
     *        The type of algorithm that is used for the encryption (such as aes128, aes192, or aes256).
     * @see Algorithm
     */

    public void setAlgorithm(String algorithm) {
        this.algorithm = algorithm;
    }

    /**
     * The type of algorithm that is used for the encryption (such as aes128, aes192, or aes256).
     * 
     * @return The type of algorithm that is used for the encryption (such as aes128, aes192, or aes256).
     * @see Algorithm
     */

    public String getAlgorithm() {
        return this.algorithm;
    }

    /**
     * The type of algorithm that is used for the encryption (such as aes128, aes192, or aes256).
     * 
     * @param algorithm
     *        The type of algorithm that is used for the encryption (such as aes128, aes192, or aes256).
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Algorithm
     */

    public UpdateEncryption withAlgorithm(String algorithm) {
        setAlgorithm(algorithm);
        return this;
    }

    /**
     * The type of algorithm that is used for the encryption (such as aes128, aes192, or aes256).
     * 
     * @param algorithm
     *        The type of algorithm that is used for the encryption (such as aes128, aes192, or aes256).
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Algorithm
     */

    public UpdateEncryption withAlgorithm(Algorithm algorithm) {
        this.algorithm = algorithm.toString();
        return this;
    }

    /**
     * The type of key that is used for the encryption. If no keyType is provided, the service will use the default
     * setting (static-key).
     * 
     * @param keyType
     *        The type of key that is used for the encryption. If no keyType is provided, the service will use the
     *        default setting (static-key).
     * @see KeyType
     */

    public void setKeyType(String keyType) {
        this.keyType = keyType;
    }

    /**
     * The type of key that is used for the encryption. If no keyType is provided, the service will use the default
     * setting (static-key).
     * 
     * @return The type of key that is used for the encryption. If no keyType is provided, the service will use the
     *         default setting (static-key).
     * @see KeyType
     */

    public String getKeyType() {
        return this.keyType;
    }

    /**
     * The type of key that is used for the encryption. If no keyType is provided, the service will use the default
     * setting (static-key).
     * 
     * @param keyType
     *        The type of key that is used for the encryption. If no keyType is provided, the service will use the
     *        default setting (static-key).
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see KeyType
     */

    public UpdateEncryption withKeyType(String keyType) {
        setKeyType(keyType);
        return this;
    }

    /**
     * The type of key that is used for the encryption. If no keyType is provided, the service will use the default
     * setting (static-key).
     * 
     * @param keyType
     *        The type of key that is used for the encryption. If no keyType is provided, the service will use the
     *        default setting (static-key).
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see KeyType
     */

    public UpdateEncryption withKeyType(KeyType keyType) {
        this.keyType = keyType.toString();
        return this;
    }

    /**
     * The ARN of the role that you created during setup (when you set up AWS Elemental MediaConnect as a trusted
     * entity).
     * 
     * @param roleArn
     *        The ARN of the role that you created during setup (when you set up AWS Elemental MediaConnect as a trusted
     *        entity).
     */

    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * The ARN of the role that you created during setup (when you set up AWS Elemental MediaConnect as a trusted
     * entity).
     * 
     * @return The ARN of the role that you created during setup (when you set up AWS Elemental MediaConnect as a
     *         trusted entity).
     */

    public String getRoleArn() {
        return this.roleArn;
    }

    /**
     * The ARN of the role that you created during setup (when you set up AWS Elemental MediaConnect as a trusted
     * entity).
     * 
     * @param roleArn
     *        The ARN of the role that you created during setup (when you set up AWS Elemental MediaConnect as a trusted
     *        entity).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateEncryption withRoleArn(String roleArn) {
        setRoleArn(roleArn);
        return this;
    }

    /**
     * The ARN that was assigned to the secret that you created in AWS Secrets Manager to store the encryption key.
     * 
     * @param secretArn
     *        The ARN that was assigned to the secret that you created in AWS Secrets Manager to store the encryption
     *        key.
     */

    public void setSecretArn(String secretArn) {
        this.secretArn = secretArn;
    }

    /**
     * The ARN that was assigned to the secret that you created in AWS Secrets Manager to store the encryption key.
     * 
     * @return The ARN that was assigned to the secret that you created in AWS Secrets Manager to store the encryption
     *         key.
     */

    public String getSecretArn() {
        return this.secretArn;
    }

    /**
     * The ARN that was assigned to the secret that you created in AWS Secrets Manager to store the encryption key.
     * 
     * @param secretArn
     *        The ARN that was assigned to the secret that you created in AWS Secrets Manager to store the encryption
     *        key.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateEncryption withSecretArn(String secretArn) {
        setSecretArn(secretArn);
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
        if (getAlgorithm() != null)
            sb.append("Algorithm: ").append(getAlgorithm()).append(",");
        if (getKeyType() != null)
            sb.append("KeyType: ").append(getKeyType()).append(",");
        if (getRoleArn() != null)
            sb.append("RoleArn: ").append(getRoleArn()).append(",");
        if (getSecretArn() != null)
            sb.append("SecretArn: ").append(getSecretArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateEncryption == false)
            return false;
        UpdateEncryption other = (UpdateEncryption) obj;
        if (other.getAlgorithm() == null ^ this.getAlgorithm() == null)
            return false;
        if (other.getAlgorithm() != null && other.getAlgorithm().equals(this.getAlgorithm()) == false)
            return false;
        if (other.getKeyType() == null ^ this.getKeyType() == null)
            return false;
        if (other.getKeyType() != null && other.getKeyType().equals(this.getKeyType()) == false)
            return false;
        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false)
            return false;
        if (other.getSecretArn() == null ^ this.getSecretArn() == null)
            return false;
        if (other.getSecretArn() != null && other.getSecretArn().equals(this.getSecretArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAlgorithm() == null) ? 0 : getAlgorithm().hashCode());
        hashCode = prime * hashCode + ((getKeyType() == null) ? 0 : getKeyType().hashCode());
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        hashCode = prime * hashCode + ((getSecretArn() == null) ? 0 : getSecretArn().hashCode());
        return hashCode;
    }

    @Override
    public UpdateEncryption clone() {
        try {
            return (UpdateEncryption) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mediaconnect.model.transform.UpdateEncryptionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
