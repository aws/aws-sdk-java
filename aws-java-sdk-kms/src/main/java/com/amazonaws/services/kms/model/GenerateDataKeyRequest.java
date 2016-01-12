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
public class GenerateDataKeyRequest extends AmazonWebServiceRequest implements
        Serializable, Cloneable {

    /**
     * <p>
     * A unique identifier for the customer master key. This value can be a
     * globally unique identifier, a fully specified ARN to either an alias or a
     * key, or an alias name prefixed by "alias/".
     * <ul>
     * <li>Key ARN Example -
     * arn:aws:kms:us-east-1:123456789012:key/12345678-1234
     * -1234-1234-123456789012</li>
     * <li>Alias ARN Example -
     * arn:aws:kms:us-east-1:123456789012:alias/MyAliasName</li>
     * <li>Globally Unique Key ID Example - 12345678-1234-1234-1234-123456789012
     * </li>
     * <li>Alias Name Example - alias/MyAliasName</li>
     * </ul>
     * </p>
     */
    private String keyId;
    /**
     * <p>
     * Name/value pair that contains additional data to be authenticated during
     * the encryption and decryption processes that use the key. This value is
     * logged by AWS CloudTrail to provide context around the data encrypted by
     * the key.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalMap<String, String> encryptionContext;
    /**
     * <p>
     * Integer that contains the number of bytes to generate. Common values are
     * 128, 256, 512, and 1024. 1024 is the current limit. We recommend that you
     * use the <code>KeySpec</code> parameter instead.
     * </p>
     */
    private Integer numberOfBytes;
    /**
     * <p>
     * Value that identifies the encryption algorithm and key size to generate a
     * data key for. Currently this can be AES_128 or AES_256.
     * </p>
     */
    private String keySpec;
    /**
     * <p>
     * A list of grant tokens.
     * </p>
     * <p>
     * For more information, go to <a href=
     * "http://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#grant_token"
     * >Grant Tokens</a> in the <i>AWS Key Management Service Developer
     * Guide</i>.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> grantTokens;

    /**
     * <p>
     * A unique identifier for the customer master key. This value can be a
     * globally unique identifier, a fully specified ARN to either an alias or a
     * key, or an alias name prefixed by "alias/".
     * <ul>
     * <li>Key ARN Example -
     * arn:aws:kms:us-east-1:123456789012:key/12345678-1234
     * -1234-1234-123456789012</li>
     * <li>Alias ARN Example -
     * arn:aws:kms:us-east-1:123456789012:alias/MyAliasName</li>
     * <li>Globally Unique Key ID Example - 12345678-1234-1234-1234-123456789012
     * </li>
     * <li>Alias Name Example - alias/MyAliasName</li>
     * </ul>
     * </p>
     * 
     * @param keyId
     *        A unique identifier for the customer master key. This value can be
     *        a globally unique identifier, a fully specified ARN to either an
     *        alias or a key, or an alias name prefixed by "alias/".
     *        <ul>
     *        <li>Key ARN Example -
     *        arn:aws:kms:us-east-1:123456789012:key/12345678
     *        -1234-1234-1234-123456789012</li>
     *        <li>Alias ARN Example -
     *        arn:aws:kms:us-east-1:123456789012:alias/MyAliasName</li>
     *        <li>Globally Unique Key ID Example -
     *        12345678-1234-1234-1234-123456789012</li>
     *        <li>Alias Name Example - alias/MyAliasName</li>
     *        </ul>
     */
    public void setKeyId(String keyId) {
        this.keyId = keyId;
    }

    /**
     * <p>
     * A unique identifier for the customer master key. This value can be a
     * globally unique identifier, a fully specified ARN to either an alias or a
     * key, or an alias name prefixed by "alias/".
     * <ul>
     * <li>Key ARN Example -
     * arn:aws:kms:us-east-1:123456789012:key/12345678-1234
     * -1234-1234-123456789012</li>
     * <li>Alias ARN Example -
     * arn:aws:kms:us-east-1:123456789012:alias/MyAliasName</li>
     * <li>Globally Unique Key ID Example - 12345678-1234-1234-1234-123456789012
     * </li>
     * <li>Alias Name Example - alias/MyAliasName</li>
     * </ul>
     * </p>
     * 
     * @return A unique identifier for the customer master key. This value can
     *         be a globally unique identifier, a fully specified ARN to either
     *         an alias or a key, or an alias name prefixed by "alias/".
     *         <ul>
     *         <li>Key ARN Example -
     *         arn:aws:kms:us-east-1:123456789012:key/12345678
     *         -1234-1234-1234-123456789012</li>
     *         <li>Alias ARN Example -
     *         arn:aws:kms:us-east-1:123456789012:alias/MyAliasName</li>
     *         <li>Globally Unique Key ID Example -
     *         12345678-1234-1234-1234-123456789012</li>
     *         <li>Alias Name Example - alias/MyAliasName</li>
     *         </ul>
     */
    public String getKeyId() {
        return this.keyId;
    }

    /**
     * <p>
     * A unique identifier for the customer master key. This value can be a
     * globally unique identifier, a fully specified ARN to either an alias or a
     * key, or an alias name prefixed by "alias/".
     * <ul>
     * <li>Key ARN Example -
     * arn:aws:kms:us-east-1:123456789012:key/12345678-1234
     * -1234-1234-123456789012</li>
     * <li>Alias ARN Example -
     * arn:aws:kms:us-east-1:123456789012:alias/MyAliasName</li>
     * <li>Globally Unique Key ID Example - 12345678-1234-1234-1234-123456789012
     * </li>
     * <li>Alias Name Example - alias/MyAliasName</li>
     * </ul>
     * </p>
     * 
     * @param keyId
     *        A unique identifier for the customer master key. This value can be
     *        a globally unique identifier, a fully specified ARN to either an
     *        alias or a key, or an alias name prefixed by "alias/".
     *        <ul>
     *        <li>Key ARN Example -
     *        arn:aws:kms:us-east-1:123456789012:key/12345678
     *        -1234-1234-1234-123456789012</li>
     *        <li>Alias ARN Example -
     *        arn:aws:kms:us-east-1:123456789012:alias/MyAliasName</li>
     *        <li>Globally Unique Key ID Example -
     *        12345678-1234-1234-1234-123456789012</li>
     *        <li>Alias Name Example - alias/MyAliasName</li>
     *        </ul>
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public GenerateDataKeyRequest withKeyId(String keyId) {
        setKeyId(keyId);
        return this;
    }

    /**
     * <p>
     * Name/value pair that contains additional data to be authenticated during
     * the encryption and decryption processes that use the key. This value is
     * logged by AWS CloudTrail to provide context around the data encrypted by
     * the key.
     * </p>
     * 
     * @return Name/value pair that contains additional data to be authenticated
     *         during the encryption and decryption processes that use the key.
     *         This value is logged by AWS CloudTrail to provide context around
     *         the data encrypted by the key.
     */
    public java.util.Map<String, String> getEncryptionContext() {
        if (encryptionContext == null) {
            encryptionContext = new com.amazonaws.internal.SdkInternalMap<String, String>();
        }
        return encryptionContext;
    }

    /**
     * <p>
     * Name/value pair that contains additional data to be authenticated during
     * the encryption and decryption processes that use the key. This value is
     * logged by AWS CloudTrail to provide context around the data encrypted by
     * the key.
     * </p>
     * 
     * @param encryptionContext
     *        Name/value pair that contains additional data to be authenticated
     *        during the encryption and decryption processes that use the key.
     *        This value is logged by AWS CloudTrail to provide context around
     *        the data encrypted by the key.
     */
    public void setEncryptionContext(
            java.util.Map<String, String> encryptionContext) {
        this.encryptionContext = encryptionContext == null ? null
                : new com.amazonaws.internal.SdkInternalMap<String, String>(
                        encryptionContext);
    }

    /**
     * <p>
     * Name/value pair that contains additional data to be authenticated during
     * the encryption and decryption processes that use the key. This value is
     * logged by AWS CloudTrail to provide context around the data encrypted by
     * the key.
     * </p>
     * 
     * @param encryptionContext
     *        Name/value pair that contains additional data to be authenticated
     *        during the encryption and decryption processes that use the key.
     *        This value is logged by AWS CloudTrail to provide context around
     *        the data encrypted by the key.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public GenerateDataKeyRequest withEncryptionContext(
            java.util.Map<String, String> encryptionContext) {
        setEncryptionContext(encryptionContext);
        return this;
    }

    public GenerateDataKeyRequest addEncryptionContextEntry(String key,
            String value) {
        if (null == this.encryptionContext) {
            this.encryptionContext = new com.amazonaws.internal.SdkInternalMap<String, String>();
        }
        if (this.encryptionContext.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys ("
                    + key.toString() + ") are provided.");
        this.encryptionContext.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into EncryptionContext. &lt;p> Returns a
     * reference to this object so that method calls can be chained together.
     */
    public GenerateDataKeyRequest clearEncryptionContextEntries() {
        this.encryptionContext = null;
        return this;
    }

    /**
     * <p>
     * Integer that contains the number of bytes to generate. Common values are
     * 128, 256, 512, and 1024. 1024 is the current limit. We recommend that you
     * use the <code>KeySpec</code> parameter instead.
     * </p>
     * 
     * @param numberOfBytes
     *        Integer that contains the number of bytes to generate. Common
     *        values are 128, 256, 512, and 1024. 1024 is the current limit. We
     *        recommend that you use the <code>KeySpec</code> parameter instead.
     */
    public void setNumberOfBytes(Integer numberOfBytes) {
        this.numberOfBytes = numberOfBytes;
    }

    /**
     * <p>
     * Integer that contains the number of bytes to generate. Common values are
     * 128, 256, 512, and 1024. 1024 is the current limit. We recommend that you
     * use the <code>KeySpec</code> parameter instead.
     * </p>
     * 
     * @return Integer that contains the number of bytes to generate. Common
     *         values are 128, 256, 512, and 1024. 1024 is the current limit. We
     *         recommend that you use the <code>KeySpec</code> parameter
     *         instead.
     */
    public Integer getNumberOfBytes() {
        return this.numberOfBytes;
    }

    /**
     * <p>
     * Integer that contains the number of bytes to generate. Common values are
     * 128, 256, 512, and 1024. 1024 is the current limit. We recommend that you
     * use the <code>KeySpec</code> parameter instead.
     * </p>
     * 
     * @param numberOfBytes
     *        Integer that contains the number of bytes to generate. Common
     *        values are 128, 256, 512, and 1024. 1024 is the current limit. We
     *        recommend that you use the <code>KeySpec</code> parameter instead.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public GenerateDataKeyRequest withNumberOfBytes(Integer numberOfBytes) {
        setNumberOfBytes(numberOfBytes);
        return this;
    }

    /**
     * <p>
     * Value that identifies the encryption algorithm and key size to generate a
     * data key for. Currently this can be AES_128 or AES_256.
     * </p>
     * 
     * @param keySpec
     *        Value that identifies the encryption algorithm and key size to
     *        generate a data key for. Currently this can be AES_128 or AES_256.
     * @see DataKeySpec
     */
    public void setKeySpec(String keySpec) {
        this.keySpec = keySpec;
    }

    /**
     * <p>
     * Value that identifies the encryption algorithm and key size to generate a
     * data key for. Currently this can be AES_128 or AES_256.
     * </p>
     * 
     * @return Value that identifies the encryption algorithm and key size to
     *         generate a data key for. Currently this can be AES_128 or
     *         AES_256.
     * @see DataKeySpec
     */
    public String getKeySpec() {
        return this.keySpec;
    }

    /**
     * <p>
     * Value that identifies the encryption algorithm and key size to generate a
     * data key for. Currently this can be AES_128 or AES_256.
     * </p>
     * 
     * @param keySpec
     *        Value that identifies the encryption algorithm and key size to
     *        generate a data key for. Currently this can be AES_128 or AES_256.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see DataKeySpec
     */
    public GenerateDataKeyRequest withKeySpec(String keySpec) {
        setKeySpec(keySpec);
        return this;
    }

    /**
     * <p>
     * Value that identifies the encryption algorithm and key size to generate a
     * data key for. Currently this can be AES_128 or AES_256.
     * </p>
     * 
     * @param keySpec
     *        Value that identifies the encryption algorithm and key size to
     *        generate a data key for. Currently this can be AES_128 or AES_256.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see DataKeySpec
     */
    public void setKeySpec(DataKeySpec keySpec) {
        this.keySpec = keySpec.toString();
    }

    /**
     * <p>
     * Value that identifies the encryption algorithm and key size to generate a
     * data key for. Currently this can be AES_128 or AES_256.
     * </p>
     * 
     * @param keySpec
     *        Value that identifies the encryption algorithm and key size to
     *        generate a data key for. Currently this can be AES_128 or AES_256.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see DataKeySpec
     */
    public GenerateDataKeyRequest withKeySpec(DataKeySpec keySpec) {
        setKeySpec(keySpec);
        return this;
    }

    /**
     * <p>
     * A list of grant tokens.
     * </p>
     * <p>
     * For more information, go to <a href=
     * "http://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#grant_token"
     * >Grant Tokens</a> in the <i>AWS Key Management Service Developer
     * Guide</i>.
     * </p>
     * 
     * @return A list of grant tokens.</p>
     *         <p>
     *         For more information, go to <a href=
     *         "http://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#grant_token"
     *         >Grant Tokens</a> in the <i>AWS Key Management Service Developer
     *         Guide</i>.
     */
    public java.util.List<String> getGrantTokens() {
        if (grantTokens == null) {
            grantTokens = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return grantTokens;
    }

    /**
     * <p>
     * A list of grant tokens.
     * </p>
     * <p>
     * For more information, go to <a href=
     * "http://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#grant_token"
     * >Grant Tokens</a> in the <i>AWS Key Management Service Developer
     * Guide</i>.
     * </p>
     * 
     * @param grantTokens
     *        A list of grant tokens.</p>
     *        <p>
     *        For more information, go to <a href=
     *        "http://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#grant_token"
     *        >Grant Tokens</a> in the <i>AWS Key Management Service Developer
     *        Guide</i>.
     */
    public void setGrantTokens(java.util.Collection<String> grantTokens) {
        if (grantTokens == null) {
            this.grantTokens = null;
            return;
        }

        this.grantTokens = new com.amazonaws.internal.SdkInternalList<String>(
                grantTokens);
    }

    /**
     * <p>
     * A list of grant tokens.
     * </p>
     * <p>
     * For more information, go to <a href=
     * "http://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#grant_token"
     * >Grant Tokens</a> in the <i>AWS Key Management Service Developer
     * Guide</i>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setGrantTokens(java.util.Collection)} or
     * {@link #withGrantTokens(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param grantTokens
     *        A list of grant tokens.</p>
     *        <p>
     *        For more information, go to <a href=
     *        "http://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#grant_token"
     *        >Grant Tokens</a> in the <i>AWS Key Management Service Developer
     *        Guide</i>.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public GenerateDataKeyRequest withGrantTokens(String... grantTokens) {
        if (this.grantTokens == null) {
            setGrantTokens(new com.amazonaws.internal.SdkInternalList<String>(
                    grantTokens.length));
        }
        for (String ele : grantTokens) {
            this.grantTokens.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of grant tokens.
     * </p>
     * <p>
     * For more information, go to <a href=
     * "http://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#grant_token"
     * >Grant Tokens</a> in the <i>AWS Key Management Service Developer
     * Guide</i>.
     * </p>
     * 
     * @param grantTokens
     *        A list of grant tokens.</p>
     *        <p>
     *        For more information, go to <a href=
     *        "http://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#grant_token"
     *        >Grant Tokens</a> in the <i>AWS Key Management Service Developer
     *        Guide</i>.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public GenerateDataKeyRequest withGrantTokens(
            java.util.Collection<String> grantTokens) {
        setGrantTokens(grantTokens);
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
        if (getEncryptionContext() != null)
            sb.append("EncryptionContext: " + getEncryptionContext() + ",");
        if (getNumberOfBytes() != null)
            sb.append("NumberOfBytes: " + getNumberOfBytes() + ",");
        if (getKeySpec() != null)
            sb.append("KeySpec: " + getKeySpec() + ",");
        if (getGrantTokens() != null)
            sb.append("GrantTokens: " + getGrantTokens());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GenerateDataKeyRequest == false)
            return false;
        GenerateDataKeyRequest other = (GenerateDataKeyRequest) obj;
        if (other.getKeyId() == null ^ this.getKeyId() == null)
            return false;
        if (other.getKeyId() != null
                && other.getKeyId().equals(this.getKeyId()) == false)
            return false;
        if (other.getEncryptionContext() == null
                ^ this.getEncryptionContext() == null)
            return false;
        if (other.getEncryptionContext() != null
                && other.getEncryptionContext().equals(
                        this.getEncryptionContext()) == false)
            return false;
        if (other.getNumberOfBytes() == null ^ this.getNumberOfBytes() == null)
            return false;
        if (other.getNumberOfBytes() != null
                && other.getNumberOfBytes().equals(this.getNumberOfBytes()) == false)
            return false;
        if (other.getKeySpec() == null ^ this.getKeySpec() == null)
            return false;
        if (other.getKeySpec() != null
                && other.getKeySpec().equals(this.getKeySpec()) == false)
            return false;
        if (other.getGrantTokens() == null ^ this.getGrantTokens() == null)
            return false;
        if (other.getGrantTokens() != null
                && other.getGrantTokens().equals(this.getGrantTokens()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getKeyId() == null) ? 0 : getKeyId().hashCode());
        hashCode = prime
                * hashCode
                + ((getEncryptionContext() == null) ? 0
                        : getEncryptionContext().hashCode());
        hashCode = prime
                * hashCode
                + ((getNumberOfBytes() == null) ? 0 : getNumberOfBytes()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getKeySpec() == null) ? 0 : getKeySpec().hashCode());
        hashCode = prime
                * hashCode
                + ((getGrantTokens() == null) ? 0 : getGrantTokens().hashCode());
        return hashCode;
    }

    @Override
    public GenerateDataKeyRequest clone() {
        return (GenerateDataKeyRequest) super.clone();
    }
}