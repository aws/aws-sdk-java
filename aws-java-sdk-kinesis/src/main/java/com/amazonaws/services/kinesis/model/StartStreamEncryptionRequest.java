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
package com.amazonaws.services.kinesis.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesis-2013-12-02/StartStreamEncryption" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StartStreamEncryptionRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the stream for which to start encrypting records.
     * </p>
     */
    private String streamName;
    /**
     * <p>
     * The encryption type to use. The only valid value is <code>KMS</code>.
     * </p>
     */
    private String encryptionType;
    /**
     * <p>
     * The GUID for the customer-managed AWS KMS key to use for encryption. This value can be a globally unique
     * identifier, a fully specified Amazon Resource Name (ARN) to either an alias or a key, or an alias name prefixed
     * by "alias/".You can also use a master key owned by Kinesis Data Streams by specifying the alias
     * <code>aws/kinesis</code>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Key ARN example: <code>arn:aws:kms:us-east-1:123456789012:key/12345678-1234-1234-1234-123456789012</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Alias ARN example: <code>arn:aws:kms:us-east-1:123456789012:alias/MyAliasName</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Globally unique key ID example: <code>12345678-1234-1234-1234-123456789012</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Alias name example: <code>alias/MyAliasName</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Master key owned by Kinesis Data Streams: <code>alias/aws/kinesis</code>
     * </p>
     * </li>
     * </ul>
     */
    private String keyId;

    /**
     * <p>
     * The name of the stream for which to start encrypting records.
     * </p>
     * 
     * @param streamName
     *        The name of the stream for which to start encrypting records.
     */

    public void setStreamName(String streamName) {
        this.streamName = streamName;
    }

    /**
     * <p>
     * The name of the stream for which to start encrypting records.
     * </p>
     * 
     * @return The name of the stream for which to start encrypting records.
     */

    public String getStreamName() {
        return this.streamName;
    }

    /**
     * <p>
     * The name of the stream for which to start encrypting records.
     * </p>
     * 
     * @param streamName
     *        The name of the stream for which to start encrypting records.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartStreamEncryptionRequest withStreamName(String streamName) {
        setStreamName(streamName);
        return this;
    }

    /**
     * <p>
     * The encryption type to use. The only valid value is <code>KMS</code>.
     * </p>
     * 
     * @param encryptionType
     *        The encryption type to use. The only valid value is <code>KMS</code>.
     * @see EncryptionType
     */

    public void setEncryptionType(String encryptionType) {
        this.encryptionType = encryptionType;
    }

    /**
     * <p>
     * The encryption type to use. The only valid value is <code>KMS</code>.
     * </p>
     * 
     * @return The encryption type to use. The only valid value is <code>KMS</code>.
     * @see EncryptionType
     */

    public String getEncryptionType() {
        return this.encryptionType;
    }

    /**
     * <p>
     * The encryption type to use. The only valid value is <code>KMS</code>.
     * </p>
     * 
     * @param encryptionType
     *        The encryption type to use. The only valid value is <code>KMS</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EncryptionType
     */

    public StartStreamEncryptionRequest withEncryptionType(String encryptionType) {
        setEncryptionType(encryptionType);
        return this;
    }

    /**
     * <p>
     * The encryption type to use. The only valid value is <code>KMS</code>.
     * </p>
     * 
     * @param encryptionType
     *        The encryption type to use. The only valid value is <code>KMS</code>.
     * @see EncryptionType
     */

    public void setEncryptionType(EncryptionType encryptionType) {
        withEncryptionType(encryptionType);
    }

    /**
     * <p>
     * The encryption type to use. The only valid value is <code>KMS</code>.
     * </p>
     * 
     * @param encryptionType
     *        The encryption type to use. The only valid value is <code>KMS</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EncryptionType
     */

    public StartStreamEncryptionRequest withEncryptionType(EncryptionType encryptionType) {
        this.encryptionType = encryptionType.toString();
        return this;
    }

    /**
     * <p>
     * The GUID for the customer-managed AWS KMS key to use for encryption. This value can be a globally unique
     * identifier, a fully specified Amazon Resource Name (ARN) to either an alias or a key, or an alias name prefixed
     * by "alias/".You can also use a master key owned by Kinesis Data Streams by specifying the alias
     * <code>aws/kinesis</code>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Key ARN example: <code>arn:aws:kms:us-east-1:123456789012:key/12345678-1234-1234-1234-123456789012</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Alias ARN example: <code>arn:aws:kms:us-east-1:123456789012:alias/MyAliasName</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Globally unique key ID example: <code>12345678-1234-1234-1234-123456789012</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Alias name example: <code>alias/MyAliasName</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Master key owned by Kinesis Data Streams: <code>alias/aws/kinesis</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param keyId
     *        The GUID for the customer-managed AWS KMS key to use for encryption. This value can be a globally unique
     *        identifier, a fully specified Amazon Resource Name (ARN) to either an alias or a key, or an alias name
     *        prefixed by "alias/".You can also use a master key owned by Kinesis Data Streams by specifying the alias
     *        <code>aws/kinesis</code>.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        Key ARN example: <code>arn:aws:kms:us-east-1:123456789012:key/12345678-1234-1234-1234-123456789012</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Alias ARN example: <code>arn:aws:kms:us-east-1:123456789012:alias/MyAliasName</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Globally unique key ID example: <code>12345678-1234-1234-1234-123456789012</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Alias name example: <code>alias/MyAliasName</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Master key owned by Kinesis Data Streams: <code>alias/aws/kinesis</code>
     *        </p>
     *        </li>
     */

    public void setKeyId(String keyId) {
        this.keyId = keyId;
    }

    /**
     * <p>
     * The GUID for the customer-managed AWS KMS key to use for encryption. This value can be a globally unique
     * identifier, a fully specified Amazon Resource Name (ARN) to either an alias or a key, or an alias name prefixed
     * by "alias/".You can also use a master key owned by Kinesis Data Streams by specifying the alias
     * <code>aws/kinesis</code>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Key ARN example: <code>arn:aws:kms:us-east-1:123456789012:key/12345678-1234-1234-1234-123456789012</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Alias ARN example: <code>arn:aws:kms:us-east-1:123456789012:alias/MyAliasName</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Globally unique key ID example: <code>12345678-1234-1234-1234-123456789012</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Alias name example: <code>alias/MyAliasName</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Master key owned by Kinesis Data Streams: <code>alias/aws/kinesis</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @return The GUID for the customer-managed AWS KMS key to use for encryption. This value can be a globally unique
     *         identifier, a fully specified Amazon Resource Name (ARN) to either an alias or a key, or an alias name
     *         prefixed by "alias/".You can also use a master key owned by Kinesis Data Streams by specifying the alias
     *         <code>aws/kinesis</code>.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         Key ARN example: <code>arn:aws:kms:us-east-1:123456789012:key/12345678-1234-1234-1234-123456789012</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Alias ARN example: <code>arn:aws:kms:us-east-1:123456789012:alias/MyAliasName</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Globally unique key ID example: <code>12345678-1234-1234-1234-123456789012</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Alias name example: <code>alias/MyAliasName</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Master key owned by Kinesis Data Streams: <code>alias/aws/kinesis</code>
     *         </p>
     *         </li>
     */

    public String getKeyId() {
        return this.keyId;
    }

    /**
     * <p>
     * The GUID for the customer-managed AWS KMS key to use for encryption. This value can be a globally unique
     * identifier, a fully specified Amazon Resource Name (ARN) to either an alias or a key, or an alias name prefixed
     * by "alias/".You can also use a master key owned by Kinesis Data Streams by specifying the alias
     * <code>aws/kinesis</code>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Key ARN example: <code>arn:aws:kms:us-east-1:123456789012:key/12345678-1234-1234-1234-123456789012</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Alias ARN example: <code>arn:aws:kms:us-east-1:123456789012:alias/MyAliasName</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Globally unique key ID example: <code>12345678-1234-1234-1234-123456789012</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Alias name example: <code>alias/MyAliasName</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Master key owned by Kinesis Data Streams: <code>alias/aws/kinesis</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param keyId
     *        The GUID for the customer-managed AWS KMS key to use for encryption. This value can be a globally unique
     *        identifier, a fully specified Amazon Resource Name (ARN) to either an alias or a key, or an alias name
     *        prefixed by "alias/".You can also use a master key owned by Kinesis Data Streams by specifying the alias
     *        <code>aws/kinesis</code>.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        Key ARN example: <code>arn:aws:kms:us-east-1:123456789012:key/12345678-1234-1234-1234-123456789012</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Alias ARN example: <code>arn:aws:kms:us-east-1:123456789012:alias/MyAliasName</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Globally unique key ID example: <code>12345678-1234-1234-1234-123456789012</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Alias name example: <code>alias/MyAliasName</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Master key owned by Kinesis Data Streams: <code>alias/aws/kinesis</code>
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartStreamEncryptionRequest withKeyId(String keyId) {
        setKeyId(keyId);
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
        if (getStreamName() != null)
            sb.append("StreamName: ").append(getStreamName()).append(",");
        if (getEncryptionType() != null)
            sb.append("EncryptionType: ").append(getEncryptionType()).append(",");
        if (getKeyId() != null)
            sb.append("KeyId: ").append(getKeyId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StartStreamEncryptionRequest == false)
            return false;
        StartStreamEncryptionRequest other = (StartStreamEncryptionRequest) obj;
        if (other.getStreamName() == null ^ this.getStreamName() == null)
            return false;
        if (other.getStreamName() != null && other.getStreamName().equals(this.getStreamName()) == false)
            return false;
        if (other.getEncryptionType() == null ^ this.getEncryptionType() == null)
            return false;
        if (other.getEncryptionType() != null && other.getEncryptionType().equals(this.getEncryptionType()) == false)
            return false;
        if (other.getKeyId() == null ^ this.getKeyId() == null)
            return false;
        if (other.getKeyId() != null && other.getKeyId().equals(this.getKeyId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStreamName() == null) ? 0 : getStreamName().hashCode());
        hashCode = prime * hashCode + ((getEncryptionType() == null) ? 0 : getEncryptionType().hashCode());
        hashCode = prime * hashCode + ((getKeyId() == null) ? 0 : getKeyId().hashCode());
        return hashCode;
    }

    @Override
    public StartStreamEncryptionRequest clone() {
        return (StartStreamEncryptionRequest) super.clone();
    }

}
