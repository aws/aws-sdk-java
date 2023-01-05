/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.macie2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Specifies the configuration settings for retrieving occurrences of sensitive data reported by findings, and the
 * status of the configuration for an Amazon Macie account. When you enable the configuration for the first time, your
 * request must specify an Key Management Service (KMS) key. Otherwise, an error occurs. Macie uses the specified key to
 * encrypt the sensitive data that you retrieve.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/RevealConfiguration" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RevealConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN), ID, or alias of the KMS key to use to encrypt sensitive data that's retrieved.
     * The key must be an existing, customer managed, symmetric encryption key that's in the same Amazon Web Services
     * Region as the Amazon Macie account.
     * </p>
     * <p>
     * If this value specifies an alias, it must include the following prefix: alias/. If this value specifies a key
     * that's owned by another Amazon Web Services account, it must specify the ARN of the key or the ARN of the key's
     * alias.
     * </p>
     */
    private String kmsKeyId;
    /**
     * <p>
     * The status of the configuration for the Amazon Macie account. In a request, valid values are: ENABLED, enable the
     * configuration for the account; and, DISABLED, disable the configuration for the account. In a response, possible
     * values are: ENABLED, the configuration is currently enabled for the account; and, DISABLED, the configuration is
     * currently disabled for the account.
     * </p>
     */
    private String status;

    /**
     * <p>
     * The Amazon Resource Name (ARN), ID, or alias of the KMS key to use to encrypt sensitive data that's retrieved.
     * The key must be an existing, customer managed, symmetric encryption key that's in the same Amazon Web Services
     * Region as the Amazon Macie account.
     * </p>
     * <p>
     * If this value specifies an alias, it must include the following prefix: alias/. If this value specifies a key
     * that's owned by another Amazon Web Services account, it must specify the ARN of the key or the ARN of the key's
     * alias.
     * </p>
     * 
     * @param kmsKeyId
     *        The Amazon Resource Name (ARN), ID, or alias of the KMS key to use to encrypt sensitive data that's
     *        retrieved. The key must be an existing, customer managed, symmetric encryption key that's in the same
     *        Amazon Web Services Region as the Amazon Macie account.</p>
     *        <p>
     *        If this value specifies an alias, it must include the following prefix: alias/. If this value specifies a
     *        key that's owned by another Amazon Web Services account, it must specify the ARN of the key or the ARN of
     *        the key's alias.
     */

    public void setKmsKeyId(String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN), ID, or alias of the KMS key to use to encrypt sensitive data that's retrieved.
     * The key must be an existing, customer managed, symmetric encryption key that's in the same Amazon Web Services
     * Region as the Amazon Macie account.
     * </p>
     * <p>
     * If this value specifies an alias, it must include the following prefix: alias/. If this value specifies a key
     * that's owned by another Amazon Web Services account, it must specify the ARN of the key or the ARN of the key's
     * alias.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN), ID, or alias of the KMS key to use to encrypt sensitive data that's
     *         retrieved. The key must be an existing, customer managed, symmetric encryption key that's in the same
     *         Amazon Web Services Region as the Amazon Macie account.</p>
     *         <p>
     *         If this value specifies an alias, it must include the following prefix: alias/. If this value specifies a
     *         key that's owned by another Amazon Web Services account, it must specify the ARN of the key or the ARN of
     *         the key's alias.
     */

    public String getKmsKeyId() {
        return this.kmsKeyId;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN), ID, or alias of the KMS key to use to encrypt sensitive data that's retrieved.
     * The key must be an existing, customer managed, symmetric encryption key that's in the same Amazon Web Services
     * Region as the Amazon Macie account.
     * </p>
     * <p>
     * If this value specifies an alias, it must include the following prefix: alias/. If this value specifies a key
     * that's owned by another Amazon Web Services account, it must specify the ARN of the key or the ARN of the key's
     * alias.
     * </p>
     * 
     * @param kmsKeyId
     *        The Amazon Resource Name (ARN), ID, or alias of the KMS key to use to encrypt sensitive data that's
     *        retrieved. The key must be an existing, customer managed, symmetric encryption key that's in the same
     *        Amazon Web Services Region as the Amazon Macie account.</p>
     *        <p>
     *        If this value specifies an alias, it must include the following prefix: alias/. If this value specifies a
     *        key that's owned by another Amazon Web Services account, it must specify the ARN of the key or the ARN of
     *        the key's alias.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RevealConfiguration withKmsKeyId(String kmsKeyId) {
        setKmsKeyId(kmsKeyId);
        return this;
    }

    /**
     * <p>
     * The status of the configuration for the Amazon Macie account. In a request, valid values are: ENABLED, enable the
     * configuration for the account; and, DISABLED, disable the configuration for the account. In a response, possible
     * values are: ENABLED, the configuration is currently enabled for the account; and, DISABLED, the configuration is
     * currently disabled for the account.
     * </p>
     * 
     * @param status
     *        The status of the configuration for the Amazon Macie account. In a request, valid values are: ENABLED,
     *        enable the configuration for the account; and, DISABLED, disable the configuration for the account. In a
     *        response, possible values are: ENABLED, the configuration is currently enabled for the account; and,
     *        DISABLED, the configuration is currently disabled for the account.
     * @see RevealStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the configuration for the Amazon Macie account. In a request, valid values are: ENABLED, enable the
     * configuration for the account; and, DISABLED, disable the configuration for the account. In a response, possible
     * values are: ENABLED, the configuration is currently enabled for the account; and, DISABLED, the configuration is
     * currently disabled for the account.
     * </p>
     * 
     * @return The status of the configuration for the Amazon Macie account. In a request, valid values are: ENABLED,
     *         enable the configuration for the account; and, DISABLED, disable the configuration for the account. In a
     *         response, possible values are: ENABLED, the configuration is currently enabled for the account; and,
     *         DISABLED, the configuration is currently disabled for the account.
     * @see RevealStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the configuration for the Amazon Macie account. In a request, valid values are: ENABLED, enable the
     * configuration for the account; and, DISABLED, disable the configuration for the account. In a response, possible
     * values are: ENABLED, the configuration is currently enabled for the account; and, DISABLED, the configuration is
     * currently disabled for the account.
     * </p>
     * 
     * @param status
     *        The status of the configuration for the Amazon Macie account. In a request, valid values are: ENABLED,
     *        enable the configuration for the account; and, DISABLED, disable the configuration for the account. In a
     *        response, possible values are: ENABLED, the configuration is currently enabled for the account; and,
     *        DISABLED, the configuration is currently disabled for the account.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RevealStatus
     */

    public RevealConfiguration withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the configuration for the Amazon Macie account. In a request, valid values are: ENABLED, enable the
     * configuration for the account; and, DISABLED, disable the configuration for the account. In a response, possible
     * values are: ENABLED, the configuration is currently enabled for the account; and, DISABLED, the configuration is
     * currently disabled for the account.
     * </p>
     * 
     * @param status
     *        The status of the configuration for the Amazon Macie account. In a request, valid values are: ENABLED,
     *        enable the configuration for the account; and, DISABLED, disable the configuration for the account. In a
     *        response, possible values are: ENABLED, the configuration is currently enabled for the account; and,
     *        DISABLED, the configuration is currently disabled for the account.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RevealStatus
     */

    public RevealConfiguration withStatus(RevealStatus status) {
        this.status = status.toString();
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
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RevealConfiguration == false)
            return false;
        RevealConfiguration other = (RevealConfiguration) obj;
        if (other.getKmsKeyId() == null ^ this.getKmsKeyId() == null)
            return false;
        if (other.getKmsKeyId() != null && other.getKmsKeyId().equals(this.getKmsKeyId()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getKmsKeyId() == null) ? 0 : getKmsKeyId().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return hashCode;
    }

    @Override
    public RevealConfiguration clone() {
        try {
            return (RevealConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.macie2.model.transform.RevealConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
