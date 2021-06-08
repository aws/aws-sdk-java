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
package com.amazonaws.services.codeartifact.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeartifact-2018-09-22/CreateDomain" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateDomainRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the domain to create. All domain names in an AWS Region that are in the same AWS account must be
     * unique. The domain name is used as the prefix in DNS hostnames. Do not use sensitive information in a domain name
     * because it is publicly discoverable.
     * </p>
     */
    private String domain;
    /**
     * <p>
     * The encryption key for the domain. This is used to encrypt content stored in a domain. An encryption key can be a
     * key ID, a key Amazon Resource Name (ARN), a key alias, or a key alias ARN. To specify an
     * <code>encryptionKey</code>, your IAM role must have <code>kms:DescribeKey</code> and <code>kms:CreateGrant</code>
     * permissions on the encryption key that is used. For more information, see <a
     * href="https://docs.aws.amazon.com/kms/latest/APIReference/API_DescribeKey.html#API_DescribeKey_RequestSyntax"
     * >DescribeKey</a> in the <i>AWS Key Management Service API Reference</i> and <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/kms-api-permissions-reference.html">AWS KMS API
     * Permissions Reference</a> in the <i>AWS Key Management Service Developer Guide</i>.
     * </p>
     * <important>
     * <p>
     * CodeArtifact supports only symmetric CMKs. Do not associate an asymmetric CMK with your domain. For more
     * information, see <a href="https://docs.aws.amazon.com/kms/latest/developerguide/symmetric-asymmetric.html">Using
     * symmetric and asymmetric keys</a> in the <i>AWS Key Management Service Developer Guide</i>.
     * </p>
     * </important>
     */
    private String encryptionKey;
    /**
     * <p>
     * One or more tag key-value pairs for the domain.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * The name of the domain to create. All domain names in an AWS Region that are in the same AWS account must be
     * unique. The domain name is used as the prefix in DNS hostnames. Do not use sensitive information in a domain name
     * because it is publicly discoverable.
     * </p>
     * 
     * @param domain
     *        The name of the domain to create. All domain names in an AWS Region that are in the same AWS account must
     *        be unique. The domain name is used as the prefix in DNS hostnames. Do not use sensitive information in a
     *        domain name because it is publicly discoverable.
     */

    public void setDomain(String domain) {
        this.domain = domain;
    }

    /**
     * <p>
     * The name of the domain to create. All domain names in an AWS Region that are in the same AWS account must be
     * unique. The domain name is used as the prefix in DNS hostnames. Do not use sensitive information in a domain name
     * because it is publicly discoverable.
     * </p>
     * 
     * @return The name of the domain to create. All domain names in an AWS Region that are in the same AWS account must
     *         be unique. The domain name is used as the prefix in DNS hostnames. Do not use sensitive information in a
     *         domain name because it is publicly discoverable.
     */

    public String getDomain() {
        return this.domain;
    }

    /**
     * <p>
     * The name of the domain to create. All domain names in an AWS Region that are in the same AWS account must be
     * unique. The domain name is used as the prefix in DNS hostnames. Do not use sensitive information in a domain name
     * because it is publicly discoverable.
     * </p>
     * 
     * @param domain
     *        The name of the domain to create. All domain names in an AWS Region that are in the same AWS account must
     *        be unique. The domain name is used as the prefix in DNS hostnames. Do not use sensitive information in a
     *        domain name because it is publicly discoverable.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDomainRequest withDomain(String domain) {
        setDomain(domain);
        return this;
    }

    /**
     * <p>
     * The encryption key for the domain. This is used to encrypt content stored in a domain. An encryption key can be a
     * key ID, a key Amazon Resource Name (ARN), a key alias, or a key alias ARN. To specify an
     * <code>encryptionKey</code>, your IAM role must have <code>kms:DescribeKey</code> and <code>kms:CreateGrant</code>
     * permissions on the encryption key that is used. For more information, see <a
     * href="https://docs.aws.amazon.com/kms/latest/APIReference/API_DescribeKey.html#API_DescribeKey_RequestSyntax"
     * >DescribeKey</a> in the <i>AWS Key Management Service API Reference</i> and <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/kms-api-permissions-reference.html">AWS KMS API
     * Permissions Reference</a> in the <i>AWS Key Management Service Developer Guide</i>.
     * </p>
     * <important>
     * <p>
     * CodeArtifact supports only symmetric CMKs. Do not associate an asymmetric CMK with your domain. For more
     * information, see <a href="https://docs.aws.amazon.com/kms/latest/developerguide/symmetric-asymmetric.html">Using
     * symmetric and asymmetric keys</a> in the <i>AWS Key Management Service Developer Guide</i>.
     * </p>
     * </important>
     * 
     * @param encryptionKey
     *        The encryption key for the domain. This is used to encrypt content stored in a domain. An encryption key
     *        can be a key ID, a key Amazon Resource Name (ARN), a key alias, or a key alias ARN. To specify an
     *        <code>encryptionKey</code>, your IAM role must have <code>kms:DescribeKey</code> and
     *        <code>kms:CreateGrant</code> permissions on the encryption key that is used. For more information, see <a
     *        href
     *        ="https://docs.aws.amazon.com/kms/latest/APIReference/API_DescribeKey.html#API_DescribeKey_RequestSyntax"
     *        >DescribeKey</a> in the <i>AWS Key Management Service API Reference</i> and <a
     *        href="https://docs.aws.amazon.com/kms/latest/developerguide/kms-api-permissions-reference.html">AWS KMS
     *        API Permissions Reference</a> in the <i>AWS Key Management Service Developer Guide</i>. </p> <important>
     *        <p>
     *        CodeArtifact supports only symmetric CMKs. Do not associate an asymmetric CMK with your domain. For more
     *        information, see <a
     *        href="https://docs.aws.amazon.com/kms/latest/developerguide/symmetric-asymmetric.html">Using symmetric and
     *        asymmetric keys</a> in the <i>AWS Key Management Service Developer Guide</i>.
     *        </p>
     */

    public void setEncryptionKey(String encryptionKey) {
        this.encryptionKey = encryptionKey;
    }

    /**
     * <p>
     * The encryption key for the domain. This is used to encrypt content stored in a domain. An encryption key can be a
     * key ID, a key Amazon Resource Name (ARN), a key alias, or a key alias ARN. To specify an
     * <code>encryptionKey</code>, your IAM role must have <code>kms:DescribeKey</code> and <code>kms:CreateGrant</code>
     * permissions on the encryption key that is used. For more information, see <a
     * href="https://docs.aws.amazon.com/kms/latest/APIReference/API_DescribeKey.html#API_DescribeKey_RequestSyntax"
     * >DescribeKey</a> in the <i>AWS Key Management Service API Reference</i> and <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/kms-api-permissions-reference.html">AWS KMS API
     * Permissions Reference</a> in the <i>AWS Key Management Service Developer Guide</i>.
     * </p>
     * <important>
     * <p>
     * CodeArtifact supports only symmetric CMKs. Do not associate an asymmetric CMK with your domain. For more
     * information, see <a href="https://docs.aws.amazon.com/kms/latest/developerguide/symmetric-asymmetric.html">Using
     * symmetric and asymmetric keys</a> in the <i>AWS Key Management Service Developer Guide</i>.
     * </p>
     * </important>
     * 
     * @return The encryption key for the domain. This is used to encrypt content stored in a domain. An encryption key
     *         can be a key ID, a key Amazon Resource Name (ARN), a key alias, or a key alias ARN. To specify an
     *         <code>encryptionKey</code>, your IAM role must have <code>kms:DescribeKey</code> and
     *         <code>kms:CreateGrant</code> permissions on the encryption key that is used. For more information, see <a
     *         href=
     *         "https://docs.aws.amazon.com/kms/latest/APIReference/API_DescribeKey.html#API_DescribeKey_RequestSyntax"
     *         >DescribeKey</a> in the <i>AWS Key Management Service API Reference</i> and <a
     *         href="https://docs.aws.amazon.com/kms/latest/developerguide/kms-api-permissions-reference.html">AWS KMS
     *         API Permissions Reference</a> in the <i>AWS Key Management Service Developer Guide</i>. </p> <important>
     *         <p>
     *         CodeArtifact supports only symmetric CMKs. Do not associate an asymmetric CMK with your domain. For more
     *         information, see <a
     *         href="https://docs.aws.amazon.com/kms/latest/developerguide/symmetric-asymmetric.html">Using symmetric
     *         and asymmetric keys</a> in the <i>AWS Key Management Service Developer Guide</i>.
     *         </p>
     */

    public String getEncryptionKey() {
        return this.encryptionKey;
    }

    /**
     * <p>
     * The encryption key for the domain. This is used to encrypt content stored in a domain. An encryption key can be a
     * key ID, a key Amazon Resource Name (ARN), a key alias, or a key alias ARN. To specify an
     * <code>encryptionKey</code>, your IAM role must have <code>kms:DescribeKey</code> and <code>kms:CreateGrant</code>
     * permissions on the encryption key that is used. For more information, see <a
     * href="https://docs.aws.amazon.com/kms/latest/APIReference/API_DescribeKey.html#API_DescribeKey_RequestSyntax"
     * >DescribeKey</a> in the <i>AWS Key Management Service API Reference</i> and <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/kms-api-permissions-reference.html">AWS KMS API
     * Permissions Reference</a> in the <i>AWS Key Management Service Developer Guide</i>.
     * </p>
     * <important>
     * <p>
     * CodeArtifact supports only symmetric CMKs. Do not associate an asymmetric CMK with your domain. For more
     * information, see <a href="https://docs.aws.amazon.com/kms/latest/developerguide/symmetric-asymmetric.html">Using
     * symmetric and asymmetric keys</a> in the <i>AWS Key Management Service Developer Guide</i>.
     * </p>
     * </important>
     * 
     * @param encryptionKey
     *        The encryption key for the domain. This is used to encrypt content stored in a domain. An encryption key
     *        can be a key ID, a key Amazon Resource Name (ARN), a key alias, or a key alias ARN. To specify an
     *        <code>encryptionKey</code>, your IAM role must have <code>kms:DescribeKey</code> and
     *        <code>kms:CreateGrant</code> permissions on the encryption key that is used. For more information, see <a
     *        href
     *        ="https://docs.aws.amazon.com/kms/latest/APIReference/API_DescribeKey.html#API_DescribeKey_RequestSyntax"
     *        >DescribeKey</a> in the <i>AWS Key Management Service API Reference</i> and <a
     *        href="https://docs.aws.amazon.com/kms/latest/developerguide/kms-api-permissions-reference.html">AWS KMS
     *        API Permissions Reference</a> in the <i>AWS Key Management Service Developer Guide</i>. </p> <important>
     *        <p>
     *        CodeArtifact supports only symmetric CMKs. Do not associate an asymmetric CMK with your domain. For more
     *        information, see <a
     *        href="https://docs.aws.amazon.com/kms/latest/developerguide/symmetric-asymmetric.html">Using symmetric and
     *        asymmetric keys</a> in the <i>AWS Key Management Service Developer Guide</i>.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDomainRequest withEncryptionKey(String encryptionKey) {
        setEncryptionKey(encryptionKey);
        return this;
    }

    /**
     * <p>
     * One or more tag key-value pairs for the domain.
     * </p>
     * 
     * @return One or more tag key-value pairs for the domain.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * One or more tag key-value pairs for the domain.
     * </p>
     * 
     * @param tags
     *        One or more tag key-value pairs for the domain.
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
     * One or more tag key-value pairs for the domain.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        One or more tag key-value pairs for the domain.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDomainRequest withTags(Tag... tags) {
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
     * One or more tag key-value pairs for the domain.
     * </p>
     * 
     * @param tags
     *        One or more tag key-value pairs for the domain.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDomainRequest withTags(java.util.Collection<Tag> tags) {
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
        if (getDomain() != null)
            sb.append("Domain: ").append(getDomain()).append(",");
        if (getEncryptionKey() != null)
            sb.append("EncryptionKey: ").append(getEncryptionKey()).append(",");
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

        if (obj instanceof CreateDomainRequest == false)
            return false;
        CreateDomainRequest other = (CreateDomainRequest) obj;
        if (other.getDomain() == null ^ this.getDomain() == null)
            return false;
        if (other.getDomain() != null && other.getDomain().equals(this.getDomain()) == false)
            return false;
        if (other.getEncryptionKey() == null ^ this.getEncryptionKey() == null)
            return false;
        if (other.getEncryptionKey() != null && other.getEncryptionKey().equals(this.getEncryptionKey()) == false)
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

        hashCode = prime * hashCode + ((getDomain() == null) ? 0 : getDomain().hashCode());
        hashCode = prime * hashCode + ((getEncryptionKey() == null) ? 0 : getEncryptionKey().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateDomainRequest clone() {
        return (CreateDomainRequest) super.clone();
    }

}
