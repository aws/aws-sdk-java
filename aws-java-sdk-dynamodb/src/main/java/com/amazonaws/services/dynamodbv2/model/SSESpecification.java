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
package com.amazonaws.services.dynamodbv2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Represents the settings used to enable server-side encryption.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dynamodb-2012-08-10/SSESpecification" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SSESpecification implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Indicates whether server-side encryption is enabled (true) or disabled (false) on the table. If enabled (true),
     * server-side encryption type is set to <code>KMS</code>. If disabled (false) or not specified, server-side
     * encryption is set to AWS owned CMK.
     * </p>
     */
    private Boolean enabled;
    /**
     * <p>
     * Server-side encryption type:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>AES256</code> - Server-side encryption which uses the AES256 algorithm (not applicable).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>KMS</code> - Server-side encryption which uses AWS Key Management Service. Key is stored in your account
     * and is managed by AWS KMS (KMS charges apply).
     * </p>
     * </li>
     * </ul>
     */
    private String sSEType;
    /**
     * <p>
     * The KMS Master Key (CMK) which should be used for the KMS encryption. To specify a CMK, use its key ID, Amazon
     * Resource Name (ARN), alias name, or alias ARN. Note that you should only provide this parameter if the key is
     * different from the default DynamoDB KMS Master Key alias/aws/dynamodb.
     * </p>
     */
    private String kMSMasterKeyId;

    /**
     * <p>
     * Indicates whether server-side encryption is enabled (true) or disabled (false) on the table. If enabled (true),
     * server-side encryption type is set to <code>KMS</code>. If disabled (false) or not specified, server-side
     * encryption is set to AWS owned CMK.
     * </p>
     * 
     * @param enabled
     *        Indicates whether server-side encryption is enabled (true) or disabled (false) on the table. If enabled
     *        (true), server-side encryption type is set to <code>KMS</code>. If disabled (false) or not specified,
     *        server-side encryption is set to AWS owned CMK.
     */

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    /**
     * <p>
     * Indicates whether server-side encryption is enabled (true) or disabled (false) on the table. If enabled (true),
     * server-side encryption type is set to <code>KMS</code>. If disabled (false) or not specified, server-side
     * encryption is set to AWS owned CMK.
     * </p>
     * 
     * @return Indicates whether server-side encryption is enabled (true) or disabled (false) on the table. If enabled
     *         (true), server-side encryption type is set to <code>KMS</code>. If disabled (false) or not specified,
     *         server-side encryption is set to AWS owned CMK.
     */

    public Boolean getEnabled() {
        return this.enabled;
    }

    /**
     * <p>
     * Indicates whether server-side encryption is enabled (true) or disabled (false) on the table. If enabled (true),
     * server-side encryption type is set to <code>KMS</code>. If disabled (false) or not specified, server-side
     * encryption is set to AWS owned CMK.
     * </p>
     * 
     * @param enabled
     *        Indicates whether server-side encryption is enabled (true) or disabled (false) on the table. If enabled
     *        (true), server-side encryption type is set to <code>KMS</code>. If disabled (false) or not specified,
     *        server-side encryption is set to AWS owned CMK.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SSESpecification withEnabled(Boolean enabled) {
        setEnabled(enabled);
        return this;
    }

    /**
     * <p>
     * Indicates whether server-side encryption is enabled (true) or disabled (false) on the table. If enabled (true),
     * server-side encryption type is set to <code>KMS</code>. If disabled (false) or not specified, server-side
     * encryption is set to AWS owned CMK.
     * </p>
     * 
     * @return Indicates whether server-side encryption is enabled (true) or disabled (false) on the table. If enabled
     *         (true), server-side encryption type is set to <code>KMS</code>. If disabled (false) or not specified,
     *         server-side encryption is set to AWS owned CMK.
     */

    public Boolean isEnabled() {
        return this.enabled;
    }

    /**
     * <p>
     * Server-side encryption type:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>AES256</code> - Server-side encryption which uses the AES256 algorithm (not applicable).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>KMS</code> - Server-side encryption which uses AWS Key Management Service. Key is stored in your account
     * and is managed by AWS KMS (KMS charges apply).
     * </p>
     * </li>
     * </ul>
     * 
     * @param sSEType
     *        Server-side encryption type:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>AES256</code> - Server-side encryption which uses the AES256 algorithm (not applicable).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>KMS</code> - Server-side encryption which uses AWS Key Management Service. Key is stored in your
     *        account and is managed by AWS KMS (KMS charges apply).
     *        </p>
     *        </li>
     * @see SSEType
     */

    public void setSSEType(String sSEType) {
        this.sSEType = sSEType;
    }

    /**
     * <p>
     * Server-side encryption type:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>AES256</code> - Server-side encryption which uses the AES256 algorithm (not applicable).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>KMS</code> - Server-side encryption which uses AWS Key Management Service. Key is stored in your account
     * and is managed by AWS KMS (KMS charges apply).
     * </p>
     * </li>
     * </ul>
     * 
     * @return Server-side encryption type:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>AES256</code> - Server-side encryption which uses the AES256 algorithm (not applicable).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>KMS</code> - Server-side encryption which uses AWS Key Management Service. Key is stored in your
     *         account and is managed by AWS KMS (KMS charges apply).
     *         </p>
     *         </li>
     * @see SSEType
     */

    public String getSSEType() {
        return this.sSEType;
    }

    /**
     * <p>
     * Server-side encryption type:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>AES256</code> - Server-side encryption which uses the AES256 algorithm (not applicable).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>KMS</code> - Server-side encryption which uses AWS Key Management Service. Key is stored in your account
     * and is managed by AWS KMS (KMS charges apply).
     * </p>
     * </li>
     * </ul>
     * 
     * @param sSEType
     *        Server-side encryption type:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>AES256</code> - Server-side encryption which uses the AES256 algorithm (not applicable).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>KMS</code> - Server-side encryption which uses AWS Key Management Service. Key is stored in your
     *        account and is managed by AWS KMS (KMS charges apply).
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SSEType
     */

    public SSESpecification withSSEType(String sSEType) {
        setSSEType(sSEType);
        return this;
    }

    /**
     * <p>
     * Server-side encryption type:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>AES256</code> - Server-side encryption which uses the AES256 algorithm (not applicable).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>KMS</code> - Server-side encryption which uses AWS Key Management Service. Key is stored in your account
     * and is managed by AWS KMS (KMS charges apply).
     * </p>
     * </li>
     * </ul>
     * 
     * @param sSEType
     *        Server-side encryption type:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>AES256</code> - Server-side encryption which uses the AES256 algorithm (not applicable).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>KMS</code> - Server-side encryption which uses AWS Key Management Service. Key is stored in your
     *        account and is managed by AWS KMS (KMS charges apply).
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SSEType
     */

    public SSESpecification withSSEType(SSEType sSEType) {
        this.sSEType = sSEType.toString();
        return this;
    }

    /**
     * <p>
     * The KMS Master Key (CMK) which should be used for the KMS encryption. To specify a CMK, use its key ID, Amazon
     * Resource Name (ARN), alias name, or alias ARN. Note that you should only provide this parameter if the key is
     * different from the default DynamoDB KMS Master Key alias/aws/dynamodb.
     * </p>
     * 
     * @param kMSMasterKeyId
     *        The KMS Master Key (CMK) which should be used for the KMS encryption. To specify a CMK, use its key ID,
     *        Amazon Resource Name (ARN), alias name, or alias ARN. Note that you should only provide this parameter if
     *        the key is different from the default DynamoDB KMS Master Key alias/aws/dynamodb.
     */

    public void setKMSMasterKeyId(String kMSMasterKeyId) {
        this.kMSMasterKeyId = kMSMasterKeyId;
    }

    /**
     * <p>
     * The KMS Master Key (CMK) which should be used for the KMS encryption. To specify a CMK, use its key ID, Amazon
     * Resource Name (ARN), alias name, or alias ARN. Note that you should only provide this parameter if the key is
     * different from the default DynamoDB KMS Master Key alias/aws/dynamodb.
     * </p>
     * 
     * @return The KMS Master Key (CMK) which should be used for the KMS encryption. To specify a CMK, use its key ID,
     *         Amazon Resource Name (ARN), alias name, or alias ARN. Note that you should only provide this parameter if
     *         the key is different from the default DynamoDB KMS Master Key alias/aws/dynamodb.
     */

    public String getKMSMasterKeyId() {
        return this.kMSMasterKeyId;
    }

    /**
     * <p>
     * The KMS Master Key (CMK) which should be used for the KMS encryption. To specify a CMK, use its key ID, Amazon
     * Resource Name (ARN), alias name, or alias ARN. Note that you should only provide this parameter if the key is
     * different from the default DynamoDB KMS Master Key alias/aws/dynamodb.
     * </p>
     * 
     * @param kMSMasterKeyId
     *        The KMS Master Key (CMK) which should be used for the KMS encryption. To specify a CMK, use its key ID,
     *        Amazon Resource Name (ARN), alias name, or alias ARN. Note that you should only provide this parameter if
     *        the key is different from the default DynamoDB KMS Master Key alias/aws/dynamodb.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SSESpecification withKMSMasterKeyId(String kMSMasterKeyId) {
        setKMSMasterKeyId(kMSMasterKeyId);
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
        if (getEnabled() != null)
            sb.append("Enabled: ").append(getEnabled()).append(",");
        if (getSSEType() != null)
            sb.append("SSEType: ").append(getSSEType()).append(",");
        if (getKMSMasterKeyId() != null)
            sb.append("KMSMasterKeyId: ").append(getKMSMasterKeyId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SSESpecification == false)
            return false;
        SSESpecification other = (SSESpecification) obj;
        if (other.getEnabled() == null ^ this.getEnabled() == null)
            return false;
        if (other.getEnabled() != null && other.getEnabled().equals(this.getEnabled()) == false)
            return false;
        if (other.getSSEType() == null ^ this.getSSEType() == null)
            return false;
        if (other.getSSEType() != null && other.getSSEType().equals(this.getSSEType()) == false)
            return false;
        if (other.getKMSMasterKeyId() == null ^ this.getKMSMasterKeyId() == null)
            return false;
        if (other.getKMSMasterKeyId() != null && other.getKMSMasterKeyId().equals(this.getKMSMasterKeyId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEnabled() == null) ? 0 : getEnabled().hashCode());
        hashCode = prime * hashCode + ((getSSEType() == null) ? 0 : getSSEType().hashCode());
        hashCode = prime * hashCode + ((getKMSMasterKeyId() == null) ? 0 : getKMSMasterKeyId().hashCode());
        return hashCode;
    }

    @Override
    public SSESpecification clone() {
        try {
            return (SSESpecification) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.dynamodbv2.model.transform.SSESpecificationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
