/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.devopsguru.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about the KMS encryption used with DevOps Guru.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devops-guru-2020-12-01/KMSServerSideEncryptionIntegration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class KMSServerSideEncryptionIntegration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Describes the specified KMS key.
     * </p>
     * <p>
     * To specify a KMS key, use its key ID, key ARN, alias name, or alias ARN. When using an alias name, prefix it with
     * "alias/". If you specify a predefined Amazon Web Services alias (an Amazon Web Services alias with no key ID),
     * Amazon Web Services KMS associates the alias with an Amazon Web Services managed key and returns its KeyId and
     * Arn in the response. To specify a KMS key in a different Amazon Web Services account, you must use the key ARN or
     * alias ARN.
     * </p>
     * <p>
     * For example:
     * </p>
     * <p>
     * Key ID: 1234abcd-12ab-34cd-56ef-1234567890ab
     * </p>
     * <p>
     * Key ARN: arn:aws:kms:us-east-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab
     * </p>
     * <p>
     * Alias name: alias/ExampleAlias
     * </p>
     * <p>
     * Alias ARN: arn:aws:kms:us-east-2:111122223333:alias/ExampleAlias
     * </p>
     */
    private String kMSKeyId;
    /**
     * <p>
     * Specifies if DevOps Guru is enabled for customer managed keys.
     * </p>
     */
    private String optInStatus;
    /**
     * <p>
     * The type of KMS key used. Customer managed keys are the KMS keys that you create. Amazon Web Services owned keys
     * are keys that are owned and managed by DevOps Guru.
     * </p>
     */
    private String type;

    /**
     * <p>
     * Describes the specified KMS key.
     * </p>
     * <p>
     * To specify a KMS key, use its key ID, key ARN, alias name, or alias ARN. When using an alias name, prefix it with
     * "alias/". If you specify a predefined Amazon Web Services alias (an Amazon Web Services alias with no key ID),
     * Amazon Web Services KMS associates the alias with an Amazon Web Services managed key and returns its KeyId and
     * Arn in the response. To specify a KMS key in a different Amazon Web Services account, you must use the key ARN or
     * alias ARN.
     * </p>
     * <p>
     * For example:
     * </p>
     * <p>
     * Key ID: 1234abcd-12ab-34cd-56ef-1234567890ab
     * </p>
     * <p>
     * Key ARN: arn:aws:kms:us-east-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab
     * </p>
     * <p>
     * Alias name: alias/ExampleAlias
     * </p>
     * <p>
     * Alias ARN: arn:aws:kms:us-east-2:111122223333:alias/ExampleAlias
     * </p>
     * 
     * @param kMSKeyId
     *        Describes the specified KMS key. </p>
     *        <p>
     *        To specify a KMS key, use its key ID, key ARN, alias name, or alias ARN. When using an alias name, prefix
     *        it with "alias/". If you specify a predefined Amazon Web Services alias (an Amazon Web Services alias with
     *        no key ID), Amazon Web Services KMS associates the alias with an Amazon Web Services managed key and
     *        returns its KeyId and Arn in the response. To specify a KMS key in a different Amazon Web Services
     *        account, you must use the key ARN or alias ARN.
     *        </p>
     *        <p>
     *        For example:
     *        </p>
     *        <p>
     *        Key ID: 1234abcd-12ab-34cd-56ef-1234567890ab
     *        </p>
     *        <p>
     *        Key ARN: arn:aws:kms:us-east-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab
     *        </p>
     *        <p>
     *        Alias name: alias/ExampleAlias
     *        </p>
     *        <p>
     *        Alias ARN: arn:aws:kms:us-east-2:111122223333:alias/ExampleAlias
     */

    public void setKMSKeyId(String kMSKeyId) {
        this.kMSKeyId = kMSKeyId;
    }

    /**
     * <p>
     * Describes the specified KMS key.
     * </p>
     * <p>
     * To specify a KMS key, use its key ID, key ARN, alias name, or alias ARN. When using an alias name, prefix it with
     * "alias/". If you specify a predefined Amazon Web Services alias (an Amazon Web Services alias with no key ID),
     * Amazon Web Services KMS associates the alias with an Amazon Web Services managed key and returns its KeyId and
     * Arn in the response. To specify a KMS key in a different Amazon Web Services account, you must use the key ARN or
     * alias ARN.
     * </p>
     * <p>
     * For example:
     * </p>
     * <p>
     * Key ID: 1234abcd-12ab-34cd-56ef-1234567890ab
     * </p>
     * <p>
     * Key ARN: arn:aws:kms:us-east-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab
     * </p>
     * <p>
     * Alias name: alias/ExampleAlias
     * </p>
     * <p>
     * Alias ARN: arn:aws:kms:us-east-2:111122223333:alias/ExampleAlias
     * </p>
     * 
     * @return Describes the specified KMS key. </p>
     *         <p>
     *         To specify a KMS key, use its key ID, key ARN, alias name, or alias ARN. When using an alias name, prefix
     *         it with "alias/". If you specify a predefined Amazon Web Services alias (an Amazon Web Services alias
     *         with no key ID), Amazon Web Services KMS associates the alias with an Amazon Web Services managed key and
     *         returns its KeyId and Arn in the response. To specify a KMS key in a different Amazon Web Services
     *         account, you must use the key ARN or alias ARN.
     *         </p>
     *         <p>
     *         For example:
     *         </p>
     *         <p>
     *         Key ID: 1234abcd-12ab-34cd-56ef-1234567890ab
     *         </p>
     *         <p>
     *         Key ARN: arn:aws:kms:us-east-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab
     *         </p>
     *         <p>
     *         Alias name: alias/ExampleAlias
     *         </p>
     *         <p>
     *         Alias ARN: arn:aws:kms:us-east-2:111122223333:alias/ExampleAlias
     */

    public String getKMSKeyId() {
        return this.kMSKeyId;
    }

    /**
     * <p>
     * Describes the specified KMS key.
     * </p>
     * <p>
     * To specify a KMS key, use its key ID, key ARN, alias name, or alias ARN. When using an alias name, prefix it with
     * "alias/". If you specify a predefined Amazon Web Services alias (an Amazon Web Services alias with no key ID),
     * Amazon Web Services KMS associates the alias with an Amazon Web Services managed key and returns its KeyId and
     * Arn in the response. To specify a KMS key in a different Amazon Web Services account, you must use the key ARN or
     * alias ARN.
     * </p>
     * <p>
     * For example:
     * </p>
     * <p>
     * Key ID: 1234abcd-12ab-34cd-56ef-1234567890ab
     * </p>
     * <p>
     * Key ARN: arn:aws:kms:us-east-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab
     * </p>
     * <p>
     * Alias name: alias/ExampleAlias
     * </p>
     * <p>
     * Alias ARN: arn:aws:kms:us-east-2:111122223333:alias/ExampleAlias
     * </p>
     * 
     * @param kMSKeyId
     *        Describes the specified KMS key. </p>
     *        <p>
     *        To specify a KMS key, use its key ID, key ARN, alias name, or alias ARN. When using an alias name, prefix
     *        it with "alias/". If you specify a predefined Amazon Web Services alias (an Amazon Web Services alias with
     *        no key ID), Amazon Web Services KMS associates the alias with an Amazon Web Services managed key and
     *        returns its KeyId and Arn in the response. To specify a KMS key in a different Amazon Web Services
     *        account, you must use the key ARN or alias ARN.
     *        </p>
     *        <p>
     *        For example:
     *        </p>
     *        <p>
     *        Key ID: 1234abcd-12ab-34cd-56ef-1234567890ab
     *        </p>
     *        <p>
     *        Key ARN: arn:aws:kms:us-east-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab
     *        </p>
     *        <p>
     *        Alias name: alias/ExampleAlias
     *        </p>
     *        <p>
     *        Alias ARN: arn:aws:kms:us-east-2:111122223333:alias/ExampleAlias
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KMSServerSideEncryptionIntegration withKMSKeyId(String kMSKeyId) {
        setKMSKeyId(kMSKeyId);
        return this;
    }

    /**
     * <p>
     * Specifies if DevOps Guru is enabled for customer managed keys.
     * </p>
     * 
     * @param optInStatus
     *        Specifies if DevOps Guru is enabled for customer managed keys.
     * @see OptInStatus
     */

    public void setOptInStatus(String optInStatus) {
        this.optInStatus = optInStatus;
    }

    /**
     * <p>
     * Specifies if DevOps Guru is enabled for customer managed keys.
     * </p>
     * 
     * @return Specifies if DevOps Guru is enabled for customer managed keys.
     * @see OptInStatus
     */

    public String getOptInStatus() {
        return this.optInStatus;
    }

    /**
     * <p>
     * Specifies if DevOps Guru is enabled for customer managed keys.
     * </p>
     * 
     * @param optInStatus
     *        Specifies if DevOps Guru is enabled for customer managed keys.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OptInStatus
     */

    public KMSServerSideEncryptionIntegration withOptInStatus(String optInStatus) {
        setOptInStatus(optInStatus);
        return this;
    }

    /**
     * <p>
     * Specifies if DevOps Guru is enabled for customer managed keys.
     * </p>
     * 
     * @param optInStatus
     *        Specifies if DevOps Guru is enabled for customer managed keys.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OptInStatus
     */

    public KMSServerSideEncryptionIntegration withOptInStatus(OptInStatus optInStatus) {
        this.optInStatus = optInStatus.toString();
        return this;
    }

    /**
     * <p>
     * The type of KMS key used. Customer managed keys are the KMS keys that you create. Amazon Web Services owned keys
     * are keys that are owned and managed by DevOps Guru.
     * </p>
     * 
     * @param type
     *        The type of KMS key used. Customer managed keys are the KMS keys that you create. Amazon Web Services
     *        owned keys are keys that are owned and managed by DevOps Guru.
     * @see ServerSideEncryptionType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of KMS key used. Customer managed keys are the KMS keys that you create. Amazon Web Services owned keys
     * are keys that are owned and managed by DevOps Guru.
     * </p>
     * 
     * @return The type of KMS key used. Customer managed keys are the KMS keys that you create. Amazon Web Services
     *         owned keys are keys that are owned and managed by DevOps Guru.
     * @see ServerSideEncryptionType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of KMS key used. Customer managed keys are the KMS keys that you create. Amazon Web Services owned keys
     * are keys that are owned and managed by DevOps Guru.
     * </p>
     * 
     * @param type
     *        The type of KMS key used. Customer managed keys are the KMS keys that you create. Amazon Web Services
     *        owned keys are keys that are owned and managed by DevOps Guru.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ServerSideEncryptionType
     */

    public KMSServerSideEncryptionIntegration withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The type of KMS key used. Customer managed keys are the KMS keys that you create. Amazon Web Services owned keys
     * are keys that are owned and managed by DevOps Guru.
     * </p>
     * 
     * @param type
     *        The type of KMS key used. Customer managed keys are the KMS keys that you create. Amazon Web Services
     *        owned keys are keys that are owned and managed by DevOps Guru.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ServerSideEncryptionType
     */

    public KMSServerSideEncryptionIntegration withType(ServerSideEncryptionType type) {
        this.type = type.toString();
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
        if (getKMSKeyId() != null)
            sb.append("KMSKeyId: ").append(getKMSKeyId()).append(",");
        if (getOptInStatus() != null)
            sb.append("OptInStatus: ").append(getOptInStatus()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof KMSServerSideEncryptionIntegration == false)
            return false;
        KMSServerSideEncryptionIntegration other = (KMSServerSideEncryptionIntegration) obj;
        if (other.getKMSKeyId() == null ^ this.getKMSKeyId() == null)
            return false;
        if (other.getKMSKeyId() != null && other.getKMSKeyId().equals(this.getKMSKeyId()) == false)
            return false;
        if (other.getOptInStatus() == null ^ this.getOptInStatus() == null)
            return false;
        if (other.getOptInStatus() != null && other.getOptInStatus().equals(this.getOptInStatus()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getKMSKeyId() == null) ? 0 : getKMSKeyId().hashCode());
        hashCode = prime * hashCode + ((getOptInStatus() == null) ? 0 : getOptInStatus().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        return hashCode;
    }

    @Override
    public KMSServerSideEncryptionIntegration clone() {
        try {
            return (KMSServerSideEncryptionIntegration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.devopsguru.model.transform.KMSServerSideEncryptionIntegrationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
