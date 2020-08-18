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
 * Details about an AWS Secrets Manager secret.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/AwsSecretsManagerSecretDetails"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsSecretsManagerSecretDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Defines the rotation schedule for the secret.
     * </p>
     */
    private AwsSecretsManagerSecretRotationRules rotationRules;
    /**
     * <p>
     * Whether the rotation occurred within the specified rotation frequency.
     * </p>
     */
    private Boolean rotationOccurredWithinFrequency;
    /**
     * <p>
     * The ARN, Key ID, or alias of the AWS KMS customer master key (CMK) used to encrypt the <code>SecretString</code>
     * or <code>SecretBinary</code> values for versions of this secret.
     * </p>
     */
    private String kmsKeyId;
    /**
     * <p>
     * Whether rotation is enabled.
     * </p>
     */
    private Boolean rotationEnabled;
    /**
     * <p>
     * The ARN of the Lambda function that rotates the secret.
     * </p>
     */
    private String rotationLambdaArn;
    /**
     * <p>
     * Whether the secret is deleted.
     * </p>
     */
    private Boolean deleted;
    /**
     * <p>
     * The name of the secret.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The user-provided description of the secret.
     * </p>
     */
    private String description;

    /**
     * <p>
     * Defines the rotation schedule for the secret.
     * </p>
     * 
     * @param rotationRules
     *        Defines the rotation schedule for the secret.
     */

    public void setRotationRules(AwsSecretsManagerSecretRotationRules rotationRules) {
        this.rotationRules = rotationRules;
    }

    /**
     * <p>
     * Defines the rotation schedule for the secret.
     * </p>
     * 
     * @return Defines the rotation schedule for the secret.
     */

    public AwsSecretsManagerSecretRotationRules getRotationRules() {
        return this.rotationRules;
    }

    /**
     * <p>
     * Defines the rotation schedule for the secret.
     * </p>
     * 
     * @param rotationRules
     *        Defines the rotation schedule for the secret.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsSecretsManagerSecretDetails withRotationRules(AwsSecretsManagerSecretRotationRules rotationRules) {
        setRotationRules(rotationRules);
        return this;
    }

    /**
     * <p>
     * Whether the rotation occurred within the specified rotation frequency.
     * </p>
     * 
     * @param rotationOccurredWithinFrequency
     *        Whether the rotation occurred within the specified rotation frequency.
     */

    public void setRotationOccurredWithinFrequency(Boolean rotationOccurredWithinFrequency) {
        this.rotationOccurredWithinFrequency = rotationOccurredWithinFrequency;
    }

    /**
     * <p>
     * Whether the rotation occurred within the specified rotation frequency.
     * </p>
     * 
     * @return Whether the rotation occurred within the specified rotation frequency.
     */

    public Boolean getRotationOccurredWithinFrequency() {
        return this.rotationOccurredWithinFrequency;
    }

    /**
     * <p>
     * Whether the rotation occurred within the specified rotation frequency.
     * </p>
     * 
     * @param rotationOccurredWithinFrequency
     *        Whether the rotation occurred within the specified rotation frequency.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsSecretsManagerSecretDetails withRotationOccurredWithinFrequency(Boolean rotationOccurredWithinFrequency) {
        setRotationOccurredWithinFrequency(rotationOccurredWithinFrequency);
        return this;
    }

    /**
     * <p>
     * Whether the rotation occurred within the specified rotation frequency.
     * </p>
     * 
     * @return Whether the rotation occurred within the specified rotation frequency.
     */

    public Boolean isRotationOccurredWithinFrequency() {
        return this.rotationOccurredWithinFrequency;
    }

    /**
     * <p>
     * The ARN, Key ID, or alias of the AWS KMS customer master key (CMK) used to encrypt the <code>SecretString</code>
     * or <code>SecretBinary</code> values for versions of this secret.
     * </p>
     * 
     * @param kmsKeyId
     *        The ARN, Key ID, or alias of the AWS KMS customer master key (CMK) used to encrypt the
     *        <code>SecretString</code> or <code>SecretBinary</code> values for versions of this secret.
     */

    public void setKmsKeyId(String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
    }

    /**
     * <p>
     * The ARN, Key ID, or alias of the AWS KMS customer master key (CMK) used to encrypt the <code>SecretString</code>
     * or <code>SecretBinary</code> values for versions of this secret.
     * </p>
     * 
     * @return The ARN, Key ID, or alias of the AWS KMS customer master key (CMK) used to encrypt the
     *         <code>SecretString</code> or <code>SecretBinary</code> values for versions of this secret.
     */

    public String getKmsKeyId() {
        return this.kmsKeyId;
    }

    /**
     * <p>
     * The ARN, Key ID, or alias of the AWS KMS customer master key (CMK) used to encrypt the <code>SecretString</code>
     * or <code>SecretBinary</code> values for versions of this secret.
     * </p>
     * 
     * @param kmsKeyId
     *        The ARN, Key ID, or alias of the AWS KMS customer master key (CMK) used to encrypt the
     *        <code>SecretString</code> or <code>SecretBinary</code> values for versions of this secret.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsSecretsManagerSecretDetails withKmsKeyId(String kmsKeyId) {
        setKmsKeyId(kmsKeyId);
        return this;
    }

    /**
     * <p>
     * Whether rotation is enabled.
     * </p>
     * 
     * @param rotationEnabled
     *        Whether rotation is enabled.
     */

    public void setRotationEnabled(Boolean rotationEnabled) {
        this.rotationEnabled = rotationEnabled;
    }

    /**
     * <p>
     * Whether rotation is enabled.
     * </p>
     * 
     * @return Whether rotation is enabled.
     */

    public Boolean getRotationEnabled() {
        return this.rotationEnabled;
    }

    /**
     * <p>
     * Whether rotation is enabled.
     * </p>
     * 
     * @param rotationEnabled
     *        Whether rotation is enabled.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsSecretsManagerSecretDetails withRotationEnabled(Boolean rotationEnabled) {
        setRotationEnabled(rotationEnabled);
        return this;
    }

    /**
     * <p>
     * Whether rotation is enabled.
     * </p>
     * 
     * @return Whether rotation is enabled.
     */

    public Boolean isRotationEnabled() {
        return this.rotationEnabled;
    }

    /**
     * <p>
     * The ARN of the Lambda function that rotates the secret.
     * </p>
     * 
     * @param rotationLambdaArn
     *        The ARN of the Lambda function that rotates the secret.
     */

    public void setRotationLambdaArn(String rotationLambdaArn) {
        this.rotationLambdaArn = rotationLambdaArn;
    }

    /**
     * <p>
     * The ARN of the Lambda function that rotates the secret.
     * </p>
     * 
     * @return The ARN of the Lambda function that rotates the secret.
     */

    public String getRotationLambdaArn() {
        return this.rotationLambdaArn;
    }

    /**
     * <p>
     * The ARN of the Lambda function that rotates the secret.
     * </p>
     * 
     * @param rotationLambdaArn
     *        The ARN of the Lambda function that rotates the secret.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsSecretsManagerSecretDetails withRotationLambdaArn(String rotationLambdaArn) {
        setRotationLambdaArn(rotationLambdaArn);
        return this;
    }

    /**
     * <p>
     * Whether the secret is deleted.
     * </p>
     * 
     * @param deleted
     *        Whether the secret is deleted.
     */

    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }

    /**
     * <p>
     * Whether the secret is deleted.
     * </p>
     * 
     * @return Whether the secret is deleted.
     */

    public Boolean getDeleted() {
        return this.deleted;
    }

    /**
     * <p>
     * Whether the secret is deleted.
     * </p>
     * 
     * @param deleted
     *        Whether the secret is deleted.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsSecretsManagerSecretDetails withDeleted(Boolean deleted) {
        setDeleted(deleted);
        return this;
    }

    /**
     * <p>
     * Whether the secret is deleted.
     * </p>
     * 
     * @return Whether the secret is deleted.
     */

    public Boolean isDeleted() {
        return this.deleted;
    }

    /**
     * <p>
     * The name of the secret.
     * </p>
     * 
     * @param name
     *        The name of the secret.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the secret.
     * </p>
     * 
     * @return The name of the secret.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the secret.
     * </p>
     * 
     * @param name
     *        The name of the secret.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsSecretsManagerSecretDetails withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The user-provided description of the secret.
     * </p>
     * 
     * @param description
     *        The user-provided description of the secret.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The user-provided description of the secret.
     * </p>
     * 
     * @return The user-provided description of the secret.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The user-provided description of the secret.
     * </p>
     * 
     * @param description
     *        The user-provided description of the secret.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsSecretsManagerSecretDetails withDescription(String description) {
        setDescription(description);
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
        if (getRotationRules() != null)
            sb.append("RotationRules: ").append(getRotationRules()).append(",");
        if (getRotationOccurredWithinFrequency() != null)
            sb.append("RotationOccurredWithinFrequency: ").append(getRotationOccurredWithinFrequency()).append(",");
        if (getKmsKeyId() != null)
            sb.append("KmsKeyId: ").append(getKmsKeyId()).append(",");
        if (getRotationEnabled() != null)
            sb.append("RotationEnabled: ").append(getRotationEnabled()).append(",");
        if (getRotationLambdaArn() != null)
            sb.append("RotationLambdaArn: ").append(getRotationLambdaArn()).append(",");
        if (getDeleted() != null)
            sb.append("Deleted: ").append(getDeleted()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AwsSecretsManagerSecretDetails == false)
            return false;
        AwsSecretsManagerSecretDetails other = (AwsSecretsManagerSecretDetails) obj;
        if (other.getRotationRules() == null ^ this.getRotationRules() == null)
            return false;
        if (other.getRotationRules() != null && other.getRotationRules().equals(this.getRotationRules()) == false)
            return false;
        if (other.getRotationOccurredWithinFrequency() == null ^ this.getRotationOccurredWithinFrequency() == null)
            return false;
        if (other.getRotationOccurredWithinFrequency() != null
                && other.getRotationOccurredWithinFrequency().equals(this.getRotationOccurredWithinFrequency()) == false)
            return false;
        if (other.getKmsKeyId() == null ^ this.getKmsKeyId() == null)
            return false;
        if (other.getKmsKeyId() != null && other.getKmsKeyId().equals(this.getKmsKeyId()) == false)
            return false;
        if (other.getRotationEnabled() == null ^ this.getRotationEnabled() == null)
            return false;
        if (other.getRotationEnabled() != null && other.getRotationEnabled().equals(this.getRotationEnabled()) == false)
            return false;
        if (other.getRotationLambdaArn() == null ^ this.getRotationLambdaArn() == null)
            return false;
        if (other.getRotationLambdaArn() != null && other.getRotationLambdaArn().equals(this.getRotationLambdaArn()) == false)
            return false;
        if (other.getDeleted() == null ^ this.getDeleted() == null)
            return false;
        if (other.getDeleted() != null && other.getDeleted().equals(this.getDeleted()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRotationRules() == null) ? 0 : getRotationRules().hashCode());
        hashCode = prime * hashCode + ((getRotationOccurredWithinFrequency() == null) ? 0 : getRotationOccurredWithinFrequency().hashCode());
        hashCode = prime * hashCode + ((getKmsKeyId() == null) ? 0 : getKmsKeyId().hashCode());
        hashCode = prime * hashCode + ((getRotationEnabled() == null) ? 0 : getRotationEnabled().hashCode());
        hashCode = prime * hashCode + ((getRotationLambdaArn() == null) ? 0 : getRotationLambdaArn().hashCode());
        hashCode = prime * hashCode + ((getDeleted() == null) ? 0 : getDeleted().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        return hashCode;
    }

    @Override
    public AwsSecretsManagerSecretDetails clone() {
        try {
            return (AwsSecretsManagerSecretDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.AwsSecretsManagerSecretDetailsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
