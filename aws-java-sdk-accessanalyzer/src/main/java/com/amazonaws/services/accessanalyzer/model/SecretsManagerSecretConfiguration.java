/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.accessanalyzer.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The configuration for a Secrets Manager secret. For more information, see <a
 * href="https://docs.aws.amazon.com/secretsmanager/latest/apireference/API_CreateSecret.html">CreateSecret</a>.
 * </p>
 * <p>
 * You can propose a configuration for a new secret or an existing secret that you own by specifying the secret policy
 * and optional KMS encryption key. If the configuration is for an existing secret and you do not specify the secret
 * policy, the access preview uses the existing policy for the secret. If the access preview is for a new resource and
 * you do not specify the policy, the access preview assumes a secret without a policy. To propose deletion of an
 * existing policy, you can specify an empty string. If the proposed configuration is for a new secret and you do not
 * specify the KMS key ID, the access preview uses the default CMK of the AWS account. If you specify an empty string
 * for the KMS key ID, the access preview uses the default CMK of the AWS account. For more information about secret
 * policy limits, see <a href="https://docs.aws.amazon.com/secretsmanager/latest/userguide/reference_limits.html">Quotas
 * for AWS Secrets Manager.</a>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/accessanalyzer-2019-11-01/SecretsManagerSecretConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SecretsManagerSecretConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The proposed ARN, key ID, or alias of the AWS KMS customer master key (CMK).
     * </p>
     */
    private String kmsKeyId;
    /**
     * <p>
     * The proposed resource policy defining who can access or manage the secret.
     * </p>
     */
    private String secretPolicy;

    /**
     * <p>
     * The proposed ARN, key ID, or alias of the AWS KMS customer master key (CMK).
     * </p>
     * 
     * @param kmsKeyId
     *        The proposed ARN, key ID, or alias of the AWS KMS customer master key (CMK).
     */

    public void setKmsKeyId(String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
    }

    /**
     * <p>
     * The proposed ARN, key ID, or alias of the AWS KMS customer master key (CMK).
     * </p>
     * 
     * @return The proposed ARN, key ID, or alias of the AWS KMS customer master key (CMK).
     */

    public String getKmsKeyId() {
        return this.kmsKeyId;
    }

    /**
     * <p>
     * The proposed ARN, key ID, or alias of the AWS KMS customer master key (CMK).
     * </p>
     * 
     * @param kmsKeyId
     *        The proposed ARN, key ID, or alias of the AWS KMS customer master key (CMK).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SecretsManagerSecretConfiguration withKmsKeyId(String kmsKeyId) {
        setKmsKeyId(kmsKeyId);
        return this;
    }

    /**
     * <p>
     * The proposed resource policy defining who can access or manage the secret.
     * </p>
     * 
     * @param secretPolicy
     *        The proposed resource policy defining who can access or manage the secret.
     */

    public void setSecretPolicy(String secretPolicy) {
        this.secretPolicy = secretPolicy;
    }

    /**
     * <p>
     * The proposed resource policy defining who can access or manage the secret.
     * </p>
     * 
     * @return The proposed resource policy defining who can access or manage the secret.
     */

    public String getSecretPolicy() {
        return this.secretPolicy;
    }

    /**
     * <p>
     * The proposed resource policy defining who can access or manage the secret.
     * </p>
     * 
     * @param secretPolicy
     *        The proposed resource policy defining who can access or manage the secret.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SecretsManagerSecretConfiguration withSecretPolicy(String secretPolicy) {
        setSecretPolicy(secretPolicy);
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
        if (getKmsKeyId() != null)
            sb.append("KmsKeyId: ").append(getKmsKeyId()).append(",");
        if (getSecretPolicy() != null)
            sb.append("SecretPolicy: ").append(getSecretPolicy());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SecretsManagerSecretConfiguration == false)
            return false;
        SecretsManagerSecretConfiguration other = (SecretsManagerSecretConfiguration) obj;
        if (other.getKmsKeyId() == null ^ this.getKmsKeyId() == null)
            return false;
        if (other.getKmsKeyId() != null && other.getKmsKeyId().equals(this.getKmsKeyId()) == false)
            return false;
        if (other.getSecretPolicy() == null ^ this.getSecretPolicy() == null)
            return false;
        if (other.getSecretPolicy() != null && other.getSecretPolicy().equals(this.getSecretPolicy()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getKmsKeyId() == null) ? 0 : getKmsKeyId().hashCode());
        hashCode = prime * hashCode + ((getSecretPolicy() == null) ? 0 : getSecretPolicy().hashCode());
        return hashCode;
    }

    @Override
    public SecretsManagerSecretConfiguration clone() {
        try {
            return (SecretsManagerSecretConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.accessanalyzer.model.transform.SecretsManagerSecretConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
