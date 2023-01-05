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
package com.amazonaws.services.route53domains.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about the DNSSEC key.
 * </p>
 * <p>
 * You get this from your DNS provider and then give it to Route 53 (by using <a
 * href="https://docs.aws.amazon.com/Route53/latest/APIReference/API_domains_AssociateDelegationSignerToDomain.html"
 * >AssociateDelegationSignerToDomain</a>) to pass it to the registry to establish the chain of trust.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53domains-2014-05-15/DnssecKey" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DnssecKey implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The number of the public key’s cryptographic algorithm according to an <a
     * href="https://www.iana.org/assignments/dns-sec-alg-numbers/dns-sec-alg-numbers.xml">IANA</a> assignment.
     * </p>
     * <p>
     * If Route 53 is your DNS service, set this to 13.
     * </p>
     * <p>
     * For more information about enabling DNSSEC signing, see <a
     * href="https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/dns-configuring-dnssec-enable-signing.html"
     * >Enabling DNSSEC signing and establishing a chain of trust</a>.
     * </p>
     */
    private Integer algorithm;
    /**
     * <p>
     * Defines the type of key. It can be either a KSK (key-signing-key, value 257) or ZSK (zone-signing-key, value
     * 256). Using KSK is always encouraged. Only use ZSK if your DNS provider isn't Route 53 and you don’t have KSK
     * available.
     * </p>
     * <p>
     * If you have KSK and ZSK keys, always use KSK to create a delegations signer (DS) record. If you have ZSK keys
     * only – use ZSK to create a DS record.
     * </p>
     */
    private Integer flags;
    /**
     * <p>
     * The base64-encoded public key part of the key pair that is passed to the registry .
     * </p>
     */
    private String publicKey;
    /**
     * <p>
     * The number of the DS digest algorithm according to an IANA assignment.
     * </p>
     * <p>
     * For more information, see <a href="https://www.iana.org/assignments/ds-rr-types/ds-rr-types.xhtml">IANA</a> for
     * DNSSEC Delegation Signer (DS) Resource Record (RR) Type Digest Algorithms.
     * </p>
     */
    private Integer digestType;
    /**
     * <p>
     * The delegation signer digest.
     * </p>
     * <p>
     * Digest is calculated from the public key provided using specified digest algorithm and this digest is the actual
     * value returned from the registry nameservers as the value of DS records.
     * </p>
     */
    private String digest;
    /**
     * <p>
     * A numeric identification of the DNSKEY record referred to by this DS record.
     * </p>
     */
    private Integer keyTag;
    /**
     * <p>
     * An ID assigned to each DS record created by <a href=
     * "https://docs.aws.amazon.com/Route53/latest/APIReference/API_domains_AssociateDelegationSignerToDomain.html"
     * >AssociateDelegationSignerToDomain</a>.
     * </p>
     */
    private String id;

    /**
     * <p>
     * The number of the public key’s cryptographic algorithm according to an <a
     * href="https://www.iana.org/assignments/dns-sec-alg-numbers/dns-sec-alg-numbers.xml">IANA</a> assignment.
     * </p>
     * <p>
     * If Route 53 is your DNS service, set this to 13.
     * </p>
     * <p>
     * For more information about enabling DNSSEC signing, see <a
     * href="https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/dns-configuring-dnssec-enable-signing.html"
     * >Enabling DNSSEC signing and establishing a chain of trust</a>.
     * </p>
     * 
     * @param algorithm
     *        The number of the public key’s cryptographic algorithm according to an <a
     *        href="https://www.iana.org/assignments/dns-sec-alg-numbers/dns-sec-alg-numbers.xml">IANA</a> assignment.
     *        </p>
     *        <p>
     *        If Route 53 is your DNS service, set this to 13.
     *        </p>
     *        <p>
     *        For more information about enabling DNSSEC signing, see <a href=
     *        "https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/dns-configuring-dnssec-enable-signing.html"
     *        >Enabling DNSSEC signing and establishing a chain of trust</a>.
     */

    public void setAlgorithm(Integer algorithm) {
        this.algorithm = algorithm;
    }

    /**
     * <p>
     * The number of the public key’s cryptographic algorithm according to an <a
     * href="https://www.iana.org/assignments/dns-sec-alg-numbers/dns-sec-alg-numbers.xml">IANA</a> assignment.
     * </p>
     * <p>
     * If Route 53 is your DNS service, set this to 13.
     * </p>
     * <p>
     * For more information about enabling DNSSEC signing, see <a
     * href="https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/dns-configuring-dnssec-enable-signing.html"
     * >Enabling DNSSEC signing and establishing a chain of trust</a>.
     * </p>
     * 
     * @return The number of the public key’s cryptographic algorithm according to an <a
     *         href="https://www.iana.org/assignments/dns-sec-alg-numbers/dns-sec-alg-numbers.xml">IANA</a> assignment.
     *         </p>
     *         <p>
     *         If Route 53 is your DNS service, set this to 13.
     *         </p>
     *         <p>
     *         For more information about enabling DNSSEC signing, see <a href=
     *         "https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/dns-configuring-dnssec-enable-signing.html"
     *         >Enabling DNSSEC signing and establishing a chain of trust</a>.
     */

    public Integer getAlgorithm() {
        return this.algorithm;
    }

    /**
     * <p>
     * The number of the public key’s cryptographic algorithm according to an <a
     * href="https://www.iana.org/assignments/dns-sec-alg-numbers/dns-sec-alg-numbers.xml">IANA</a> assignment.
     * </p>
     * <p>
     * If Route 53 is your DNS service, set this to 13.
     * </p>
     * <p>
     * For more information about enabling DNSSEC signing, see <a
     * href="https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/dns-configuring-dnssec-enable-signing.html"
     * >Enabling DNSSEC signing and establishing a chain of trust</a>.
     * </p>
     * 
     * @param algorithm
     *        The number of the public key’s cryptographic algorithm according to an <a
     *        href="https://www.iana.org/assignments/dns-sec-alg-numbers/dns-sec-alg-numbers.xml">IANA</a> assignment.
     *        </p>
     *        <p>
     *        If Route 53 is your DNS service, set this to 13.
     *        </p>
     *        <p>
     *        For more information about enabling DNSSEC signing, see <a href=
     *        "https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/dns-configuring-dnssec-enable-signing.html"
     *        >Enabling DNSSEC signing and establishing a chain of trust</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DnssecKey withAlgorithm(Integer algorithm) {
        setAlgorithm(algorithm);
        return this;
    }

    /**
     * <p>
     * Defines the type of key. It can be either a KSK (key-signing-key, value 257) or ZSK (zone-signing-key, value
     * 256). Using KSK is always encouraged. Only use ZSK if your DNS provider isn't Route 53 and you don’t have KSK
     * available.
     * </p>
     * <p>
     * If you have KSK and ZSK keys, always use KSK to create a delegations signer (DS) record. If you have ZSK keys
     * only – use ZSK to create a DS record.
     * </p>
     * 
     * @param flags
     *        Defines the type of key. It can be either a KSK (key-signing-key, value 257) or ZSK (zone-signing-key,
     *        value 256). Using KSK is always encouraged. Only use ZSK if your DNS provider isn't Route 53 and you don’t
     *        have KSK available.</p>
     *        <p>
     *        If you have KSK and ZSK keys, always use KSK to create a delegations signer (DS) record. If you have ZSK
     *        keys only – use ZSK to create a DS record.
     */

    public void setFlags(Integer flags) {
        this.flags = flags;
    }

    /**
     * <p>
     * Defines the type of key. It can be either a KSK (key-signing-key, value 257) or ZSK (zone-signing-key, value
     * 256). Using KSK is always encouraged. Only use ZSK if your DNS provider isn't Route 53 and you don’t have KSK
     * available.
     * </p>
     * <p>
     * If you have KSK and ZSK keys, always use KSK to create a delegations signer (DS) record. If you have ZSK keys
     * only – use ZSK to create a DS record.
     * </p>
     * 
     * @return Defines the type of key. It can be either a KSK (key-signing-key, value 257) or ZSK (zone-signing-key,
     *         value 256). Using KSK is always encouraged. Only use ZSK if your DNS provider isn't Route 53 and you
     *         don’t have KSK available.</p>
     *         <p>
     *         If you have KSK and ZSK keys, always use KSK to create a delegations signer (DS) record. If you have ZSK
     *         keys only – use ZSK to create a DS record.
     */

    public Integer getFlags() {
        return this.flags;
    }

    /**
     * <p>
     * Defines the type of key. It can be either a KSK (key-signing-key, value 257) or ZSK (zone-signing-key, value
     * 256). Using KSK is always encouraged. Only use ZSK if your DNS provider isn't Route 53 and you don’t have KSK
     * available.
     * </p>
     * <p>
     * If you have KSK and ZSK keys, always use KSK to create a delegations signer (DS) record. If you have ZSK keys
     * only – use ZSK to create a DS record.
     * </p>
     * 
     * @param flags
     *        Defines the type of key. It can be either a KSK (key-signing-key, value 257) or ZSK (zone-signing-key,
     *        value 256). Using KSK is always encouraged. Only use ZSK if your DNS provider isn't Route 53 and you don’t
     *        have KSK available.</p>
     *        <p>
     *        If you have KSK and ZSK keys, always use KSK to create a delegations signer (DS) record. If you have ZSK
     *        keys only – use ZSK to create a DS record.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DnssecKey withFlags(Integer flags) {
        setFlags(flags);
        return this;
    }

    /**
     * <p>
     * The base64-encoded public key part of the key pair that is passed to the registry .
     * </p>
     * 
     * @param publicKey
     *        The base64-encoded public key part of the key pair that is passed to the registry .
     */

    public void setPublicKey(String publicKey) {
        this.publicKey = publicKey;
    }

    /**
     * <p>
     * The base64-encoded public key part of the key pair that is passed to the registry .
     * </p>
     * 
     * @return The base64-encoded public key part of the key pair that is passed to the registry .
     */

    public String getPublicKey() {
        return this.publicKey;
    }

    /**
     * <p>
     * The base64-encoded public key part of the key pair that is passed to the registry .
     * </p>
     * 
     * @param publicKey
     *        The base64-encoded public key part of the key pair that is passed to the registry .
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DnssecKey withPublicKey(String publicKey) {
        setPublicKey(publicKey);
        return this;
    }

    /**
     * <p>
     * The number of the DS digest algorithm according to an IANA assignment.
     * </p>
     * <p>
     * For more information, see <a href="https://www.iana.org/assignments/ds-rr-types/ds-rr-types.xhtml">IANA</a> for
     * DNSSEC Delegation Signer (DS) Resource Record (RR) Type Digest Algorithms.
     * </p>
     * 
     * @param digestType
     *        The number of the DS digest algorithm according to an IANA assignment.</p>
     *        <p>
     *        For more information, see <a
     *        href="https://www.iana.org/assignments/ds-rr-types/ds-rr-types.xhtml">IANA</a> for DNSSEC Delegation
     *        Signer (DS) Resource Record (RR) Type Digest Algorithms.
     */

    public void setDigestType(Integer digestType) {
        this.digestType = digestType;
    }

    /**
     * <p>
     * The number of the DS digest algorithm according to an IANA assignment.
     * </p>
     * <p>
     * For more information, see <a href="https://www.iana.org/assignments/ds-rr-types/ds-rr-types.xhtml">IANA</a> for
     * DNSSEC Delegation Signer (DS) Resource Record (RR) Type Digest Algorithms.
     * </p>
     * 
     * @return The number of the DS digest algorithm according to an IANA assignment.</p>
     *         <p>
     *         For more information, see <a
     *         href="https://www.iana.org/assignments/ds-rr-types/ds-rr-types.xhtml">IANA</a> for DNSSEC Delegation
     *         Signer (DS) Resource Record (RR) Type Digest Algorithms.
     */

    public Integer getDigestType() {
        return this.digestType;
    }

    /**
     * <p>
     * The number of the DS digest algorithm according to an IANA assignment.
     * </p>
     * <p>
     * For more information, see <a href="https://www.iana.org/assignments/ds-rr-types/ds-rr-types.xhtml">IANA</a> for
     * DNSSEC Delegation Signer (DS) Resource Record (RR) Type Digest Algorithms.
     * </p>
     * 
     * @param digestType
     *        The number of the DS digest algorithm according to an IANA assignment.</p>
     *        <p>
     *        For more information, see <a
     *        href="https://www.iana.org/assignments/ds-rr-types/ds-rr-types.xhtml">IANA</a> for DNSSEC Delegation
     *        Signer (DS) Resource Record (RR) Type Digest Algorithms.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DnssecKey withDigestType(Integer digestType) {
        setDigestType(digestType);
        return this;
    }

    /**
     * <p>
     * The delegation signer digest.
     * </p>
     * <p>
     * Digest is calculated from the public key provided using specified digest algorithm and this digest is the actual
     * value returned from the registry nameservers as the value of DS records.
     * </p>
     * 
     * @param digest
     *        The delegation signer digest.</p>
     *        <p>
     *        Digest is calculated from the public key provided using specified digest algorithm and this digest is the
     *        actual value returned from the registry nameservers as the value of DS records.
     */

    public void setDigest(String digest) {
        this.digest = digest;
    }

    /**
     * <p>
     * The delegation signer digest.
     * </p>
     * <p>
     * Digest is calculated from the public key provided using specified digest algorithm and this digest is the actual
     * value returned from the registry nameservers as the value of DS records.
     * </p>
     * 
     * @return The delegation signer digest.</p>
     *         <p>
     *         Digest is calculated from the public key provided using specified digest algorithm and this digest is the
     *         actual value returned from the registry nameservers as the value of DS records.
     */

    public String getDigest() {
        return this.digest;
    }

    /**
     * <p>
     * The delegation signer digest.
     * </p>
     * <p>
     * Digest is calculated from the public key provided using specified digest algorithm and this digest is the actual
     * value returned from the registry nameservers as the value of DS records.
     * </p>
     * 
     * @param digest
     *        The delegation signer digest.</p>
     *        <p>
     *        Digest is calculated from the public key provided using specified digest algorithm and this digest is the
     *        actual value returned from the registry nameservers as the value of DS records.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DnssecKey withDigest(String digest) {
        setDigest(digest);
        return this;
    }

    /**
     * <p>
     * A numeric identification of the DNSKEY record referred to by this DS record.
     * </p>
     * 
     * @param keyTag
     *        A numeric identification of the DNSKEY record referred to by this DS record.
     */

    public void setKeyTag(Integer keyTag) {
        this.keyTag = keyTag;
    }

    /**
     * <p>
     * A numeric identification of the DNSKEY record referred to by this DS record.
     * </p>
     * 
     * @return A numeric identification of the DNSKEY record referred to by this DS record.
     */

    public Integer getKeyTag() {
        return this.keyTag;
    }

    /**
     * <p>
     * A numeric identification of the DNSKEY record referred to by this DS record.
     * </p>
     * 
     * @param keyTag
     *        A numeric identification of the DNSKEY record referred to by this DS record.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DnssecKey withKeyTag(Integer keyTag) {
        setKeyTag(keyTag);
        return this;
    }

    /**
     * <p>
     * An ID assigned to each DS record created by <a href=
     * "https://docs.aws.amazon.com/Route53/latest/APIReference/API_domains_AssociateDelegationSignerToDomain.html"
     * >AssociateDelegationSignerToDomain</a>.
     * </p>
     * 
     * @param id
     *        An ID assigned to each DS record created by <a href=
     *        "https://docs.aws.amazon.com/Route53/latest/APIReference/API_domains_AssociateDelegationSignerToDomain.html"
     *        >AssociateDelegationSignerToDomain</a>.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * An ID assigned to each DS record created by <a href=
     * "https://docs.aws.amazon.com/Route53/latest/APIReference/API_domains_AssociateDelegationSignerToDomain.html"
     * >AssociateDelegationSignerToDomain</a>.
     * </p>
     * 
     * @return An ID assigned to each DS record created by <a href=
     *         "https://docs.aws.amazon.com/Route53/latest/APIReference/API_domains_AssociateDelegationSignerToDomain.html"
     *         >AssociateDelegationSignerToDomain</a>.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * An ID assigned to each DS record created by <a href=
     * "https://docs.aws.amazon.com/Route53/latest/APIReference/API_domains_AssociateDelegationSignerToDomain.html"
     * >AssociateDelegationSignerToDomain</a>.
     * </p>
     * 
     * @param id
     *        An ID assigned to each DS record created by <a href=
     *        "https://docs.aws.amazon.com/Route53/latest/APIReference/API_domains_AssociateDelegationSignerToDomain.html"
     *        >AssociateDelegationSignerToDomain</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DnssecKey withId(String id) {
        setId(id);
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
        if (getAlgorithm() != null)
            sb.append("Algorithm: ").append(getAlgorithm()).append(",");
        if (getFlags() != null)
            sb.append("Flags: ").append(getFlags()).append(",");
        if (getPublicKey() != null)
            sb.append("PublicKey: ").append(getPublicKey()).append(",");
        if (getDigestType() != null)
            sb.append("DigestType: ").append(getDigestType()).append(",");
        if (getDigest() != null)
            sb.append("Digest: ").append(getDigest()).append(",");
        if (getKeyTag() != null)
            sb.append("KeyTag: ").append(getKeyTag()).append(",");
        if (getId() != null)
            sb.append("Id: ").append(getId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DnssecKey == false)
            return false;
        DnssecKey other = (DnssecKey) obj;
        if (other.getAlgorithm() == null ^ this.getAlgorithm() == null)
            return false;
        if (other.getAlgorithm() != null && other.getAlgorithm().equals(this.getAlgorithm()) == false)
            return false;
        if (other.getFlags() == null ^ this.getFlags() == null)
            return false;
        if (other.getFlags() != null && other.getFlags().equals(this.getFlags()) == false)
            return false;
        if (other.getPublicKey() == null ^ this.getPublicKey() == null)
            return false;
        if (other.getPublicKey() != null && other.getPublicKey().equals(this.getPublicKey()) == false)
            return false;
        if (other.getDigestType() == null ^ this.getDigestType() == null)
            return false;
        if (other.getDigestType() != null && other.getDigestType().equals(this.getDigestType()) == false)
            return false;
        if (other.getDigest() == null ^ this.getDigest() == null)
            return false;
        if (other.getDigest() != null && other.getDigest().equals(this.getDigest()) == false)
            return false;
        if (other.getKeyTag() == null ^ this.getKeyTag() == null)
            return false;
        if (other.getKeyTag() != null && other.getKeyTag().equals(this.getKeyTag()) == false)
            return false;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAlgorithm() == null) ? 0 : getAlgorithm().hashCode());
        hashCode = prime * hashCode + ((getFlags() == null) ? 0 : getFlags().hashCode());
        hashCode = prime * hashCode + ((getPublicKey() == null) ? 0 : getPublicKey().hashCode());
        hashCode = prime * hashCode + ((getDigestType() == null) ? 0 : getDigestType().hashCode());
        hashCode = prime * hashCode + ((getDigest() == null) ? 0 : getDigest().hashCode());
        hashCode = prime * hashCode + ((getKeyTag() == null) ? 0 : getKeyTag().hashCode());
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        return hashCode;
    }

    @Override
    public DnssecKey clone() {
        try {
            return (DnssecKey) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.route53domains.model.transform.DnssecKeyMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
