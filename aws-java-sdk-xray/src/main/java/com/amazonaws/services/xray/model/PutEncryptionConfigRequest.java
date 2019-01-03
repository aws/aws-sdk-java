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
package com.amazonaws.services.xray.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/xray-2016-04-12/PutEncryptionConfig" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PutEncryptionConfigRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * An AWS KMS customer master key (CMK) in one of the following formats:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>Alias</b> - The name of the key. For example, <code>alias/MyKey</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Key ID</b> - The KMS key ID of the key. For example, <code>ae4aa6d49-a4d8-9df9-a475-4ff6d7898456</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>ARN</b> - The full Amazon Resource Name of the key ID or alias. For example,
     * <code>arn:aws:kms:us-east-2:123456789012:key/ae4aa6d49-a4d8-9df9-a475-4ff6d7898456</code>. Use this format to
     * specify a key in a different account.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Omit this key if you set <code>Type</code> to <code>NONE</code>.
     * </p>
     */
    private String keyId;
    /**
     * <p>
     * The type of encryption. Set to <code>KMS</code> to use your own key for encryption. Set to <code>NONE</code> for
     * default encryption.
     * </p>
     */
    private String type;

    /**
     * <p>
     * An AWS KMS customer master key (CMK) in one of the following formats:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>Alias</b> - The name of the key. For example, <code>alias/MyKey</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Key ID</b> - The KMS key ID of the key. For example, <code>ae4aa6d49-a4d8-9df9-a475-4ff6d7898456</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>ARN</b> - The full Amazon Resource Name of the key ID or alias. For example,
     * <code>arn:aws:kms:us-east-2:123456789012:key/ae4aa6d49-a4d8-9df9-a475-4ff6d7898456</code>. Use this format to
     * specify a key in a different account.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Omit this key if you set <code>Type</code> to <code>NONE</code>.
     * </p>
     * 
     * @param keyId
     *        An AWS KMS customer master key (CMK) in one of the following formats:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>Alias</b> - The name of the key. For example, <code>alias/MyKey</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>Key ID</b> - The KMS key ID of the key. For example, <code>ae4aa6d49-a4d8-9df9-a475-4ff6d7898456</code>
     *        .
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>ARN</b> - The full Amazon Resource Name of the key ID or alias. For example,
     *        <code>arn:aws:kms:us-east-2:123456789012:key/ae4aa6d49-a4d8-9df9-a475-4ff6d7898456</code>. Use this format
     *        to specify a key in a different account.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Omit this key if you set <code>Type</code> to <code>NONE</code>.
     */

    public void setKeyId(String keyId) {
        this.keyId = keyId;
    }

    /**
     * <p>
     * An AWS KMS customer master key (CMK) in one of the following formats:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>Alias</b> - The name of the key. For example, <code>alias/MyKey</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Key ID</b> - The KMS key ID of the key. For example, <code>ae4aa6d49-a4d8-9df9-a475-4ff6d7898456</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>ARN</b> - The full Amazon Resource Name of the key ID or alias. For example,
     * <code>arn:aws:kms:us-east-2:123456789012:key/ae4aa6d49-a4d8-9df9-a475-4ff6d7898456</code>. Use this format to
     * specify a key in a different account.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Omit this key if you set <code>Type</code> to <code>NONE</code>.
     * </p>
     * 
     * @return An AWS KMS customer master key (CMK) in one of the following formats:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <b>Alias</b> - The name of the key. For example, <code>alias/MyKey</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>Key ID</b> - The KMS key ID of the key. For example,
     *         <code>ae4aa6d49-a4d8-9df9-a475-4ff6d7898456</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>ARN</b> - The full Amazon Resource Name of the key ID or alias. For example,
     *         <code>arn:aws:kms:us-east-2:123456789012:key/ae4aa6d49-a4d8-9df9-a475-4ff6d7898456</code>. Use this
     *         format to specify a key in a different account.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         Omit this key if you set <code>Type</code> to <code>NONE</code>.
     */

    public String getKeyId() {
        return this.keyId;
    }

    /**
     * <p>
     * An AWS KMS customer master key (CMK) in one of the following formats:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>Alias</b> - The name of the key. For example, <code>alias/MyKey</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Key ID</b> - The KMS key ID of the key. For example, <code>ae4aa6d49-a4d8-9df9-a475-4ff6d7898456</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>ARN</b> - The full Amazon Resource Name of the key ID or alias. For example,
     * <code>arn:aws:kms:us-east-2:123456789012:key/ae4aa6d49-a4d8-9df9-a475-4ff6d7898456</code>. Use this format to
     * specify a key in a different account.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Omit this key if you set <code>Type</code> to <code>NONE</code>.
     * </p>
     * 
     * @param keyId
     *        An AWS KMS customer master key (CMK) in one of the following formats:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>Alias</b> - The name of the key. For example, <code>alias/MyKey</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>Key ID</b> - The KMS key ID of the key. For example, <code>ae4aa6d49-a4d8-9df9-a475-4ff6d7898456</code>
     *        .
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>ARN</b> - The full Amazon Resource Name of the key ID or alias. For example,
     *        <code>arn:aws:kms:us-east-2:123456789012:key/ae4aa6d49-a4d8-9df9-a475-4ff6d7898456</code>. Use this format
     *        to specify a key in a different account.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Omit this key if you set <code>Type</code> to <code>NONE</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutEncryptionConfigRequest withKeyId(String keyId) {
        setKeyId(keyId);
        return this;
    }

    /**
     * <p>
     * The type of encryption. Set to <code>KMS</code> to use your own key for encryption. Set to <code>NONE</code> for
     * default encryption.
     * </p>
     * 
     * @param type
     *        The type of encryption. Set to <code>KMS</code> to use your own key for encryption. Set to
     *        <code>NONE</code> for default encryption.
     * @see EncryptionType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of encryption. Set to <code>KMS</code> to use your own key for encryption. Set to <code>NONE</code> for
     * default encryption.
     * </p>
     * 
     * @return The type of encryption. Set to <code>KMS</code> to use your own key for encryption. Set to
     *         <code>NONE</code> for default encryption.
     * @see EncryptionType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of encryption. Set to <code>KMS</code> to use your own key for encryption. Set to <code>NONE</code> for
     * default encryption.
     * </p>
     * 
     * @param type
     *        The type of encryption. Set to <code>KMS</code> to use your own key for encryption. Set to
     *        <code>NONE</code> for default encryption.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EncryptionType
     */

    public PutEncryptionConfigRequest withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The type of encryption. Set to <code>KMS</code> to use your own key for encryption. Set to <code>NONE</code> for
     * default encryption.
     * </p>
     * 
     * @param type
     *        The type of encryption. Set to <code>KMS</code> to use your own key for encryption. Set to
     *        <code>NONE</code> for default encryption.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EncryptionType
     */

    public PutEncryptionConfigRequest withType(EncryptionType type) {
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
        if (getKeyId() != null)
            sb.append("KeyId: ").append(getKeyId()).append(",");
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

        if (obj instanceof PutEncryptionConfigRequest == false)
            return false;
        PutEncryptionConfigRequest other = (PutEncryptionConfigRequest) obj;
        if (other.getKeyId() == null ^ this.getKeyId() == null)
            return false;
        if (other.getKeyId() != null && other.getKeyId().equals(this.getKeyId()) == false)
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

        hashCode = prime * hashCode + ((getKeyId() == null) ? 0 : getKeyId().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        return hashCode;
    }

    @Override
    public PutEncryptionConfigRequest clone() {
        return (PutEncryptionConfigRequest) super.clone();
    }

}
