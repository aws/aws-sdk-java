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
package com.amazonaws.services.paymentcryptography.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/payment-cryptography-2021-09-14/CreateKey" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateKeyRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The role of the key, the algorithm it supports, and the cryptographic operations allowed with the key. This data
     * is immutable after the key is created.
     * </p>
     */
    private KeyAttributes keyAttributes;
    /**
     * <p>
     * The algorithm that Amazon Web Services Payment Cryptography uses to calculate the key check value (KCV). It is
     * used to validate the key integrity.
     * </p>
     * <p>
     * For TDES keys, the KCV is computed by encrypting 8 bytes, each with value of zero, with the key to be checked and
     * retaining the 3 highest order bytes of the encrypted result. For AES keys, the KCV is computed using a CMAC
     * algorithm where the input data is 16 bytes of zero and retaining the 3 highest order bytes of the encrypted
     * result.
     * </p>
     */
    private String keyCheckValueAlgorithm;
    /**
     * <p>
     * Specifies whether the key is exportable from the service.
     * </p>
     */
    private Boolean exportable;
    /**
     * <p>
     * Specifies whether to enable the key. If the key is enabled, it is activated for use within the service. If the
     * key is not enabled, then it is created but not activated. The default value is enabled.
     * </p>
     */
    private Boolean enabled;
    /**
     * <p>
     * Assigns one or more tags to the Amazon Web Services Payment Cryptography key. Use this parameter to tag a key
     * when it is created. To tag an existing Amazon Web Services Payment Cryptography key, use the <a
     * href="https://docs.aws.amazon.com/payment-cryptography/latest/APIReference/API_TagResource.html">TagResource</a>
     * operation.
     * </p>
     * <p>
     * Each tag consists of a tag key and a tag value. Both the tag key and the tag value are required, but the tag
     * value can be an empty (null) string. You can't have more than one tag on an Amazon Web Services Payment
     * Cryptography key with the same tag key.
     * </p>
     * <important>
     * <p>
     * Don't include personal, confidential or sensitive information in this field. This field may be displayed in
     * plaintext in CloudTrail logs and other output.
     * </p>
     * </important> <note>
     * <p>
     * Tagging or untagging an Amazon Web Services Payment Cryptography key can allow or deny permission to the key.
     * </p>
     * </note>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * The role of the key, the algorithm it supports, and the cryptographic operations allowed with the key. This data
     * is immutable after the key is created.
     * </p>
     * 
     * @param keyAttributes
     *        The role of the key, the algorithm it supports, and the cryptographic operations allowed with the key.
     *        This data is immutable after the key is created.
     */

    public void setKeyAttributes(KeyAttributes keyAttributes) {
        this.keyAttributes = keyAttributes;
    }

    /**
     * <p>
     * The role of the key, the algorithm it supports, and the cryptographic operations allowed with the key. This data
     * is immutable after the key is created.
     * </p>
     * 
     * @return The role of the key, the algorithm it supports, and the cryptographic operations allowed with the key.
     *         This data is immutable after the key is created.
     */

    public KeyAttributes getKeyAttributes() {
        return this.keyAttributes;
    }

    /**
     * <p>
     * The role of the key, the algorithm it supports, and the cryptographic operations allowed with the key. This data
     * is immutable after the key is created.
     * </p>
     * 
     * @param keyAttributes
     *        The role of the key, the algorithm it supports, and the cryptographic operations allowed with the key.
     *        This data is immutable after the key is created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateKeyRequest withKeyAttributes(KeyAttributes keyAttributes) {
        setKeyAttributes(keyAttributes);
        return this;
    }

    /**
     * <p>
     * The algorithm that Amazon Web Services Payment Cryptography uses to calculate the key check value (KCV). It is
     * used to validate the key integrity.
     * </p>
     * <p>
     * For TDES keys, the KCV is computed by encrypting 8 bytes, each with value of zero, with the key to be checked and
     * retaining the 3 highest order bytes of the encrypted result. For AES keys, the KCV is computed using a CMAC
     * algorithm where the input data is 16 bytes of zero and retaining the 3 highest order bytes of the encrypted
     * result.
     * </p>
     * 
     * @param keyCheckValueAlgorithm
     *        The algorithm that Amazon Web Services Payment Cryptography uses to calculate the key check value (KCV).
     *        It is used to validate the key integrity.</p>
     *        <p>
     *        For TDES keys, the KCV is computed by encrypting 8 bytes, each with value of zero, with the key to be
     *        checked and retaining the 3 highest order bytes of the encrypted result. For AES keys, the KCV is computed
     *        using a CMAC algorithm where the input data is 16 bytes of zero and retaining the 3 highest order bytes of
     *        the encrypted result.
     * @see KeyCheckValueAlgorithm
     */

    public void setKeyCheckValueAlgorithm(String keyCheckValueAlgorithm) {
        this.keyCheckValueAlgorithm = keyCheckValueAlgorithm;
    }

    /**
     * <p>
     * The algorithm that Amazon Web Services Payment Cryptography uses to calculate the key check value (KCV). It is
     * used to validate the key integrity.
     * </p>
     * <p>
     * For TDES keys, the KCV is computed by encrypting 8 bytes, each with value of zero, with the key to be checked and
     * retaining the 3 highest order bytes of the encrypted result. For AES keys, the KCV is computed using a CMAC
     * algorithm where the input data is 16 bytes of zero and retaining the 3 highest order bytes of the encrypted
     * result.
     * </p>
     * 
     * @return The algorithm that Amazon Web Services Payment Cryptography uses to calculate the key check value (KCV).
     *         It is used to validate the key integrity.</p>
     *         <p>
     *         For TDES keys, the KCV is computed by encrypting 8 bytes, each with value of zero, with the key to be
     *         checked and retaining the 3 highest order bytes of the encrypted result. For AES keys, the KCV is
     *         computed using a CMAC algorithm where the input data is 16 bytes of zero and retaining the 3 highest
     *         order bytes of the encrypted result.
     * @see KeyCheckValueAlgorithm
     */

    public String getKeyCheckValueAlgorithm() {
        return this.keyCheckValueAlgorithm;
    }

    /**
     * <p>
     * The algorithm that Amazon Web Services Payment Cryptography uses to calculate the key check value (KCV). It is
     * used to validate the key integrity.
     * </p>
     * <p>
     * For TDES keys, the KCV is computed by encrypting 8 bytes, each with value of zero, with the key to be checked and
     * retaining the 3 highest order bytes of the encrypted result. For AES keys, the KCV is computed using a CMAC
     * algorithm where the input data is 16 bytes of zero and retaining the 3 highest order bytes of the encrypted
     * result.
     * </p>
     * 
     * @param keyCheckValueAlgorithm
     *        The algorithm that Amazon Web Services Payment Cryptography uses to calculate the key check value (KCV).
     *        It is used to validate the key integrity.</p>
     *        <p>
     *        For TDES keys, the KCV is computed by encrypting 8 bytes, each with value of zero, with the key to be
     *        checked and retaining the 3 highest order bytes of the encrypted result. For AES keys, the KCV is computed
     *        using a CMAC algorithm where the input data is 16 bytes of zero and retaining the 3 highest order bytes of
     *        the encrypted result.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see KeyCheckValueAlgorithm
     */

    public CreateKeyRequest withKeyCheckValueAlgorithm(String keyCheckValueAlgorithm) {
        setKeyCheckValueAlgorithm(keyCheckValueAlgorithm);
        return this;
    }

    /**
     * <p>
     * The algorithm that Amazon Web Services Payment Cryptography uses to calculate the key check value (KCV). It is
     * used to validate the key integrity.
     * </p>
     * <p>
     * For TDES keys, the KCV is computed by encrypting 8 bytes, each with value of zero, with the key to be checked and
     * retaining the 3 highest order bytes of the encrypted result. For AES keys, the KCV is computed using a CMAC
     * algorithm where the input data is 16 bytes of zero and retaining the 3 highest order bytes of the encrypted
     * result.
     * </p>
     * 
     * @param keyCheckValueAlgorithm
     *        The algorithm that Amazon Web Services Payment Cryptography uses to calculate the key check value (KCV).
     *        It is used to validate the key integrity.</p>
     *        <p>
     *        For TDES keys, the KCV is computed by encrypting 8 bytes, each with value of zero, with the key to be
     *        checked and retaining the 3 highest order bytes of the encrypted result. For AES keys, the KCV is computed
     *        using a CMAC algorithm where the input data is 16 bytes of zero and retaining the 3 highest order bytes of
     *        the encrypted result.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see KeyCheckValueAlgorithm
     */

    public CreateKeyRequest withKeyCheckValueAlgorithm(KeyCheckValueAlgorithm keyCheckValueAlgorithm) {
        this.keyCheckValueAlgorithm = keyCheckValueAlgorithm.toString();
        return this;
    }

    /**
     * <p>
     * Specifies whether the key is exportable from the service.
     * </p>
     * 
     * @param exportable
     *        Specifies whether the key is exportable from the service.
     */

    public void setExportable(Boolean exportable) {
        this.exportable = exportable;
    }

    /**
     * <p>
     * Specifies whether the key is exportable from the service.
     * </p>
     * 
     * @return Specifies whether the key is exportable from the service.
     */

    public Boolean getExportable() {
        return this.exportable;
    }

    /**
     * <p>
     * Specifies whether the key is exportable from the service.
     * </p>
     * 
     * @param exportable
     *        Specifies whether the key is exportable from the service.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateKeyRequest withExportable(Boolean exportable) {
        setExportable(exportable);
        return this;
    }

    /**
     * <p>
     * Specifies whether the key is exportable from the service.
     * </p>
     * 
     * @return Specifies whether the key is exportable from the service.
     */

    public Boolean isExportable() {
        return this.exportable;
    }

    /**
     * <p>
     * Specifies whether to enable the key. If the key is enabled, it is activated for use within the service. If the
     * key is not enabled, then it is created but not activated. The default value is enabled.
     * </p>
     * 
     * @param enabled
     *        Specifies whether to enable the key. If the key is enabled, it is activated for use within the service. If
     *        the key is not enabled, then it is created but not activated. The default value is enabled.
     */

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    /**
     * <p>
     * Specifies whether to enable the key. If the key is enabled, it is activated for use within the service. If the
     * key is not enabled, then it is created but not activated. The default value is enabled.
     * </p>
     * 
     * @return Specifies whether to enable the key. If the key is enabled, it is activated for use within the service.
     *         If the key is not enabled, then it is created but not activated. The default value is enabled.
     */

    public Boolean getEnabled() {
        return this.enabled;
    }

    /**
     * <p>
     * Specifies whether to enable the key. If the key is enabled, it is activated for use within the service. If the
     * key is not enabled, then it is created but not activated. The default value is enabled.
     * </p>
     * 
     * @param enabled
     *        Specifies whether to enable the key. If the key is enabled, it is activated for use within the service. If
     *        the key is not enabled, then it is created but not activated. The default value is enabled.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateKeyRequest withEnabled(Boolean enabled) {
        setEnabled(enabled);
        return this;
    }

    /**
     * <p>
     * Specifies whether to enable the key. If the key is enabled, it is activated for use within the service. If the
     * key is not enabled, then it is created but not activated. The default value is enabled.
     * </p>
     * 
     * @return Specifies whether to enable the key. If the key is enabled, it is activated for use within the service.
     *         If the key is not enabled, then it is created but not activated. The default value is enabled.
     */

    public Boolean isEnabled() {
        return this.enabled;
    }

    /**
     * <p>
     * Assigns one or more tags to the Amazon Web Services Payment Cryptography key. Use this parameter to tag a key
     * when it is created. To tag an existing Amazon Web Services Payment Cryptography key, use the <a
     * href="https://docs.aws.amazon.com/payment-cryptography/latest/APIReference/API_TagResource.html">TagResource</a>
     * operation.
     * </p>
     * <p>
     * Each tag consists of a tag key and a tag value. Both the tag key and the tag value are required, but the tag
     * value can be an empty (null) string. You can't have more than one tag on an Amazon Web Services Payment
     * Cryptography key with the same tag key.
     * </p>
     * <important>
     * <p>
     * Don't include personal, confidential or sensitive information in this field. This field may be displayed in
     * plaintext in CloudTrail logs and other output.
     * </p>
     * </important> <note>
     * <p>
     * Tagging or untagging an Amazon Web Services Payment Cryptography key can allow or deny permission to the key.
     * </p>
     * </note>
     * 
     * @return Assigns one or more tags to the Amazon Web Services Payment Cryptography key. Use this parameter to tag a
     *         key when it is created. To tag an existing Amazon Web Services Payment Cryptography key, use the <a
     *         href="https://docs.aws.amazon.com/payment-cryptography/latest/APIReference/API_TagResource.html"
     *         >TagResource</a> operation.</p>
     *         <p>
     *         Each tag consists of a tag key and a tag value. Both the tag key and the tag value are required, but the
     *         tag value can be an empty (null) string. You can't have more than one tag on an Amazon Web Services
     *         Payment Cryptography key with the same tag key.
     *         </p>
     *         <important>
     *         <p>
     *         Don't include personal, confidential or sensitive information in this field. This field may be displayed
     *         in plaintext in CloudTrail logs and other output.
     *         </p>
     *         </important> <note>
     *         <p>
     *         Tagging or untagging an Amazon Web Services Payment Cryptography key can allow or deny permission to the
     *         key.
     *         </p>
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * Assigns one or more tags to the Amazon Web Services Payment Cryptography key. Use this parameter to tag a key
     * when it is created. To tag an existing Amazon Web Services Payment Cryptography key, use the <a
     * href="https://docs.aws.amazon.com/payment-cryptography/latest/APIReference/API_TagResource.html">TagResource</a>
     * operation.
     * </p>
     * <p>
     * Each tag consists of a tag key and a tag value. Both the tag key and the tag value are required, but the tag
     * value can be an empty (null) string. You can't have more than one tag on an Amazon Web Services Payment
     * Cryptography key with the same tag key.
     * </p>
     * <important>
     * <p>
     * Don't include personal, confidential or sensitive information in this field. This field may be displayed in
     * plaintext in CloudTrail logs and other output.
     * </p>
     * </important> <note>
     * <p>
     * Tagging or untagging an Amazon Web Services Payment Cryptography key can allow or deny permission to the key.
     * </p>
     * </note>
     * 
     * @param tags
     *        Assigns one or more tags to the Amazon Web Services Payment Cryptography key. Use this parameter to tag a
     *        key when it is created. To tag an existing Amazon Web Services Payment Cryptography key, use the <a
     *        href="https://docs.aws.amazon.com/payment-cryptography/latest/APIReference/API_TagResource.html"
     *        >TagResource</a> operation.</p>
     *        <p>
     *        Each tag consists of a tag key and a tag value. Both the tag key and the tag value are required, but the
     *        tag value can be an empty (null) string. You can't have more than one tag on an Amazon Web Services
     *        Payment Cryptography key with the same tag key.
     *        </p>
     *        <important>
     *        <p>
     *        Don't include personal, confidential or sensitive information in this field. This field may be displayed
     *        in plaintext in CloudTrail logs and other output.
     *        </p>
     *        </important> <note>
     *        <p>
     *        Tagging or untagging an Amazon Web Services Payment Cryptography key can allow or deny permission to the
     *        key.
     *        </p>
     */

    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<Tag>(tags);
    }

    /**
     * <p>
     * Assigns one or more tags to the Amazon Web Services Payment Cryptography key. Use this parameter to tag a key
     * when it is created. To tag an existing Amazon Web Services Payment Cryptography key, use the <a
     * href="https://docs.aws.amazon.com/payment-cryptography/latest/APIReference/API_TagResource.html">TagResource</a>
     * operation.
     * </p>
     * <p>
     * Each tag consists of a tag key and a tag value. Both the tag key and the tag value are required, but the tag
     * value can be an empty (null) string. You can't have more than one tag on an Amazon Web Services Payment
     * Cryptography key with the same tag key.
     * </p>
     * <important>
     * <p>
     * Don't include personal, confidential or sensitive information in this field. This field may be displayed in
     * plaintext in CloudTrail logs and other output.
     * </p>
     * </important> <note>
     * <p>
     * Tagging or untagging an Amazon Web Services Payment Cryptography key can allow or deny permission to the key.
     * </p>
     * </note>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        Assigns one or more tags to the Amazon Web Services Payment Cryptography key. Use this parameter to tag a
     *        key when it is created. To tag an existing Amazon Web Services Payment Cryptography key, use the <a
     *        href="https://docs.aws.amazon.com/payment-cryptography/latest/APIReference/API_TagResource.html"
     *        >TagResource</a> operation.</p>
     *        <p>
     *        Each tag consists of a tag key and a tag value. Both the tag key and the tag value are required, but the
     *        tag value can be an empty (null) string. You can't have more than one tag on an Amazon Web Services
     *        Payment Cryptography key with the same tag key.
     *        </p>
     *        <important>
     *        <p>
     *        Don't include personal, confidential or sensitive information in this field. This field may be displayed
     *        in plaintext in CloudTrail logs and other output.
     *        </p>
     *        </important> <note>
     *        <p>
     *        Tagging or untagging an Amazon Web Services Payment Cryptography key can allow or deny permission to the
     *        key.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateKeyRequest withTags(Tag... tags) {
        if (this.tags == null) {
            setTags(new java.util.ArrayList<Tag>(tags.length));
        }
        for (Tag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Assigns one or more tags to the Amazon Web Services Payment Cryptography key. Use this parameter to tag a key
     * when it is created. To tag an existing Amazon Web Services Payment Cryptography key, use the <a
     * href="https://docs.aws.amazon.com/payment-cryptography/latest/APIReference/API_TagResource.html">TagResource</a>
     * operation.
     * </p>
     * <p>
     * Each tag consists of a tag key and a tag value. Both the tag key and the tag value are required, but the tag
     * value can be an empty (null) string. You can't have more than one tag on an Amazon Web Services Payment
     * Cryptography key with the same tag key.
     * </p>
     * <important>
     * <p>
     * Don't include personal, confidential or sensitive information in this field. This field may be displayed in
     * plaintext in CloudTrail logs and other output.
     * </p>
     * </important> <note>
     * <p>
     * Tagging or untagging an Amazon Web Services Payment Cryptography key can allow or deny permission to the key.
     * </p>
     * </note>
     * 
     * @param tags
     *        Assigns one or more tags to the Amazon Web Services Payment Cryptography key. Use this parameter to tag a
     *        key when it is created. To tag an existing Amazon Web Services Payment Cryptography key, use the <a
     *        href="https://docs.aws.amazon.com/payment-cryptography/latest/APIReference/API_TagResource.html"
     *        >TagResource</a> operation.</p>
     *        <p>
     *        Each tag consists of a tag key and a tag value. Both the tag key and the tag value are required, but the
     *        tag value can be an empty (null) string. You can't have more than one tag on an Amazon Web Services
     *        Payment Cryptography key with the same tag key.
     *        </p>
     *        <important>
     *        <p>
     *        Don't include personal, confidential or sensitive information in this field. This field may be displayed
     *        in plaintext in CloudTrail logs and other output.
     *        </p>
     *        </important> <note>
     *        <p>
     *        Tagging or untagging an Amazon Web Services Payment Cryptography key can allow or deny permission to the
     *        key.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateKeyRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
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
        if (getKeyAttributes() != null)
            sb.append("KeyAttributes: ").append(getKeyAttributes()).append(",");
        if (getKeyCheckValueAlgorithm() != null)
            sb.append("KeyCheckValueAlgorithm: ").append(getKeyCheckValueAlgorithm()).append(",");
        if (getExportable() != null)
            sb.append("Exportable: ").append(getExportable()).append(",");
        if (getEnabled() != null)
            sb.append("Enabled: ").append(getEnabled()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateKeyRequest == false)
            return false;
        CreateKeyRequest other = (CreateKeyRequest) obj;
        if (other.getKeyAttributes() == null ^ this.getKeyAttributes() == null)
            return false;
        if (other.getKeyAttributes() != null && other.getKeyAttributes().equals(this.getKeyAttributes()) == false)
            return false;
        if (other.getKeyCheckValueAlgorithm() == null ^ this.getKeyCheckValueAlgorithm() == null)
            return false;
        if (other.getKeyCheckValueAlgorithm() != null && other.getKeyCheckValueAlgorithm().equals(this.getKeyCheckValueAlgorithm()) == false)
            return false;
        if (other.getExportable() == null ^ this.getExportable() == null)
            return false;
        if (other.getExportable() != null && other.getExportable().equals(this.getExportable()) == false)
            return false;
        if (other.getEnabled() == null ^ this.getEnabled() == null)
            return false;
        if (other.getEnabled() != null && other.getEnabled().equals(this.getEnabled()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getKeyAttributes() == null) ? 0 : getKeyAttributes().hashCode());
        hashCode = prime * hashCode + ((getKeyCheckValueAlgorithm() == null) ? 0 : getKeyCheckValueAlgorithm().hashCode());
        hashCode = prime * hashCode + ((getExportable() == null) ? 0 : getExportable().hashCode());
        hashCode = prime * hashCode + ((getEnabled() == null) ? 0 : getEnabled().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateKeyRequest clone() {
        return (CreateKeyRequest) super.clone();
    }

}
