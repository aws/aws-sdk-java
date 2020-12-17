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
package com.amazonaws.services.route53.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * A key signing key (KSK) is a complex type that represents a public/private key pair. The private key is used to
 * generate a digital signature for the zone signing key (ZSK). The public key is stored in the DNS and is used to
 * authenticate the ZSK. A KSK is always associated with a hosted zone; it cannot exist by itself.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-2013-04-01/KeySigningKey" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class KeySigningKey implements Serializable, Cloneable {

    /**
     * <p>
     * An alphanumeric string used to identify a key signing key (KSK). <code>Name</code> must be unique for each key
     * signing key in the same hosted zone.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The Amazon resource name (ARN) used to identify the customer managed key (CMK) in AWS Key Management Service
     * (KMS). The <code>KmsArn</code> must be unique for each key signing key (KSK) in a single hosted zone.
     * </p>
     * <p>
     * You must configure the CMK as follows:
     * </p>
     * <dl>
     * <dt>Status</dt>
     * <dd>
     * <p>
     * Enabled
     * </p>
     * </dd>
     * <dt>Key spec</dt>
     * <dd>
     * <p>
     * ECC_NIST_P256
     * </p>
     * </dd>
     * <dt>Key usage</dt>
     * <dd>
     * <p>
     * Sign and verify
     * </p>
     * </dd>
     * <dt>Key policy</dt>
     * <dd>
     * <p>
     * The key policy must give permission for the following actions:
     * </p>
     * <ul>
     * <li>
     * <p>
     * DescribeKey
     * </p>
     * </li>
     * <li>
     * <p>
     * GetPublicKey
     * </p>
     * </li>
     * <li>
     * <p>
     * Sign
     * </p>
     * </li>
     * </ul>
     * <p>
     * The key policy must also include the Amazon Route 53 service in the principal for your account. Specify the
     * following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>"Service": "api-service.dnssec.route53.aws.internal"</code>
     * </p>
     * </li>
     * </ul>
     * </dd>
     * </dl>
     * <p>
     * For more information about working with the customer managed key (CMK) in KMS, see <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html">AWS Key Management Service
     * concepts</a>.
     * </p>
     */
    private String kmsArn;
    /**
     * <p>
     * An integer that specifies how the key is used. For key signing key (KSK), this value is always 257.
     * </p>
     */
    private Integer flag;
    /**
     * <p>
     * A string used to represent the signing algorithm. This value must follow the guidelines provided by <a
     * href="https://tools.ietf.org/html/rfc8624#section-3.1">RFC-8624 Section 3.1</a>.
     * </p>
     */
    private String signingAlgorithmMnemonic;
    /**
     * <p>
     * An integer used to represent the signing algorithm. This value must follow the guidelines provided by <a
     * href="https://tools.ietf.org/html/rfc8624#section-3.1">RFC-8624 Section 3.1</a>.
     * </p>
     */
    private Integer signingAlgorithmType;
    /**
     * <p>
     * A string used to represent the delegation signer digest algorithm. This value must follow the guidelines provided
     * by <a href="https://tools.ietf.org/html/rfc8624#section-3.3">RFC-8624 Section 3.3</a>.
     * </p>
     */
    private String digestAlgorithmMnemonic;
    /**
     * <p>
     * An integer used to represent the delegation signer digest algorithm. This value must follow the guidelines
     * provided by <a href="https://tools.ietf.org/html/rfc8624#section-3.3">RFC-8624 Section 3.3</a>.
     * </p>
     */
    private Integer digestAlgorithmType;
    /**
     * <p>
     * An integer used to identify the DNSSEC record for the domain name. The process used to calculate the value is
     * described in <a href="https://tools.ietf.org/rfc/rfc4034.txt">RFC-4034 Appendix B</a>.
     * </p>
     */
    private Integer keyTag;
    /**
     * <p>
     * A cryptographic digest of a DNSKEY resource record (RR). DNSKEY records are used to publish the public key that
     * resolvers can use to verify DNSSEC signatures that are used to secure certain kinds of information provided by
     * the DNS system.
     * </p>
     */
    private String digestValue;
    /**
     * <p>
     * The public key, represented as a Base64 encoding, as required by <a
     * href="https://tools.ietf.org/rfc/rfc4034.txt"> RFC-4034 Page 5</a>.
     * </p>
     */
    private String publicKey;
    /**
     * <p>
     * A string that represents a delegation signer (DS) record.
     * </p>
     */
    private String dSRecord;
    /**
     * <p>
     * A string that represents a DNSKEY record.
     * </p>
     */
    private String dNSKEYRecord;
    /**
     * <p>
     * A string that represents the current key signing key (KSK) status.
     * </p>
     * <p>
     * Status can have one of the following values:
     * </p>
     * <dl>
     * <dt>ACTIVE</dt>
     * <dd>
     * <p>
     * The KSK is being used for signing.
     * </p>
     * </dd>
     * <dt>INACTIVE</dt>
     * <dd>
     * <p>
     * The KSK is not being used for signing.
     * </p>
     * </dd>
     * <dt>ACTION_NEEDED</dt>
     * <dd>
     * <p>
     * There is an error in the KSK that requires you to take action to resolve.
     * </p>
     * </dd>
     * <dt>INTERNAL_FAILURE</dt>
     * <dd>
     * <p>
     * There was an error during a request. Before you can continue to work with DNSSEC signing, including actions that
     * involve this KSK, you must correct the problem. For example, you may need to activate or deactivate the KSK.
     * </p>
     * </dd>
     * </dl>
     */
    private String status;
    /**
     * <p>
     * The status message provided for the following key signing key (KSK) statuses: <code>ACTION_NEEDED</code> or
     * <code>INTERNAL_FAILURE</code>. The status message includes information about what the problem might be and steps
     * that you can take to correct the issue.
     * </p>
     */
    private String statusMessage;
    /**
     * <p>
     * The date when the key signing key (KSK) was created.
     * </p>
     */
    private java.util.Date createdDate;
    /**
     * <p>
     * The last time that the key signing key (KSK) was changed.
     * </p>
     */
    private java.util.Date lastModifiedDate;

    /**
     * <p>
     * An alphanumeric string used to identify a key signing key (KSK). <code>Name</code> must be unique for each key
     * signing key in the same hosted zone.
     * </p>
     * 
     * @param name
     *        An alphanumeric string used to identify a key signing key (KSK). <code>Name</code> must be unique for each
     *        key signing key in the same hosted zone.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * An alphanumeric string used to identify a key signing key (KSK). <code>Name</code> must be unique for each key
     * signing key in the same hosted zone.
     * </p>
     * 
     * @return An alphanumeric string used to identify a key signing key (KSK). <code>Name</code> must be unique for
     *         each key signing key in the same hosted zone.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * An alphanumeric string used to identify a key signing key (KSK). <code>Name</code> must be unique for each key
     * signing key in the same hosted zone.
     * </p>
     * 
     * @param name
     *        An alphanumeric string used to identify a key signing key (KSK). <code>Name</code> must be unique for each
     *        key signing key in the same hosted zone.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KeySigningKey withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The Amazon resource name (ARN) used to identify the customer managed key (CMK) in AWS Key Management Service
     * (KMS). The <code>KmsArn</code> must be unique for each key signing key (KSK) in a single hosted zone.
     * </p>
     * <p>
     * You must configure the CMK as follows:
     * </p>
     * <dl>
     * <dt>Status</dt>
     * <dd>
     * <p>
     * Enabled
     * </p>
     * </dd>
     * <dt>Key spec</dt>
     * <dd>
     * <p>
     * ECC_NIST_P256
     * </p>
     * </dd>
     * <dt>Key usage</dt>
     * <dd>
     * <p>
     * Sign and verify
     * </p>
     * </dd>
     * <dt>Key policy</dt>
     * <dd>
     * <p>
     * The key policy must give permission for the following actions:
     * </p>
     * <ul>
     * <li>
     * <p>
     * DescribeKey
     * </p>
     * </li>
     * <li>
     * <p>
     * GetPublicKey
     * </p>
     * </li>
     * <li>
     * <p>
     * Sign
     * </p>
     * </li>
     * </ul>
     * <p>
     * The key policy must also include the Amazon Route 53 service in the principal for your account. Specify the
     * following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>"Service": "api-service.dnssec.route53.aws.internal"</code>
     * </p>
     * </li>
     * </ul>
     * </dd>
     * </dl>
     * <p>
     * For more information about working with the customer managed key (CMK) in KMS, see <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html">AWS Key Management Service
     * concepts</a>.
     * </p>
     * 
     * @param kmsArn
     *        The Amazon resource name (ARN) used to identify the customer managed key (CMK) in AWS Key Management
     *        Service (KMS). The <code>KmsArn</code> must be unique for each key signing key (KSK) in a single hosted
     *        zone.</p>
     *        <p>
     *        You must configure the CMK as follows:
     *        </p>
     *        <dl>
     *        <dt>Status</dt>
     *        <dd>
     *        <p>
     *        Enabled
     *        </p>
     *        </dd>
     *        <dt>Key spec</dt>
     *        <dd>
     *        <p>
     *        ECC_NIST_P256
     *        </p>
     *        </dd>
     *        <dt>Key usage</dt>
     *        <dd>
     *        <p>
     *        Sign and verify
     *        </p>
     *        </dd>
     *        <dt>Key policy</dt>
     *        <dd>
     *        <p>
     *        The key policy must give permission for the following actions:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        DescribeKey
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        GetPublicKey
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Sign
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        The key policy must also include the Amazon Route 53 service in the principal for your account. Specify
     *        the following:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>"Service": "api-service.dnssec.route53.aws.internal"</code>
     *        </p>
     *        </li>
     *        </ul>
     *        </dd>
     *        </dl>
     *        <p>
     *        For more information about working with the customer managed key (CMK) in KMS, see <a
     *        href="https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html">AWS Key Management Service
     *        concepts</a>.
     */

    public void setKmsArn(String kmsArn) {
        this.kmsArn = kmsArn;
    }

    /**
     * <p>
     * The Amazon resource name (ARN) used to identify the customer managed key (CMK) in AWS Key Management Service
     * (KMS). The <code>KmsArn</code> must be unique for each key signing key (KSK) in a single hosted zone.
     * </p>
     * <p>
     * You must configure the CMK as follows:
     * </p>
     * <dl>
     * <dt>Status</dt>
     * <dd>
     * <p>
     * Enabled
     * </p>
     * </dd>
     * <dt>Key spec</dt>
     * <dd>
     * <p>
     * ECC_NIST_P256
     * </p>
     * </dd>
     * <dt>Key usage</dt>
     * <dd>
     * <p>
     * Sign and verify
     * </p>
     * </dd>
     * <dt>Key policy</dt>
     * <dd>
     * <p>
     * The key policy must give permission for the following actions:
     * </p>
     * <ul>
     * <li>
     * <p>
     * DescribeKey
     * </p>
     * </li>
     * <li>
     * <p>
     * GetPublicKey
     * </p>
     * </li>
     * <li>
     * <p>
     * Sign
     * </p>
     * </li>
     * </ul>
     * <p>
     * The key policy must also include the Amazon Route 53 service in the principal for your account. Specify the
     * following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>"Service": "api-service.dnssec.route53.aws.internal"</code>
     * </p>
     * </li>
     * </ul>
     * </dd>
     * </dl>
     * <p>
     * For more information about working with the customer managed key (CMK) in KMS, see <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html">AWS Key Management Service
     * concepts</a>.
     * </p>
     * 
     * @return The Amazon resource name (ARN) used to identify the customer managed key (CMK) in AWS Key Management
     *         Service (KMS). The <code>KmsArn</code> must be unique for each key signing key (KSK) in a single hosted
     *         zone.</p>
     *         <p>
     *         You must configure the CMK as follows:
     *         </p>
     *         <dl>
     *         <dt>Status</dt>
     *         <dd>
     *         <p>
     *         Enabled
     *         </p>
     *         </dd>
     *         <dt>Key spec</dt>
     *         <dd>
     *         <p>
     *         ECC_NIST_P256
     *         </p>
     *         </dd>
     *         <dt>Key usage</dt>
     *         <dd>
     *         <p>
     *         Sign and verify
     *         </p>
     *         </dd>
     *         <dt>Key policy</dt>
     *         <dd>
     *         <p>
     *         The key policy must give permission for the following actions:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         DescribeKey
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         GetPublicKey
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Sign
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         The key policy must also include the Amazon Route 53 service in the principal for your account. Specify
     *         the following:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>"Service": "api-service.dnssec.route53.aws.internal"</code>
     *         </p>
     *         </li>
     *         </ul>
     *         </dd>
     *         </dl>
     *         <p>
     *         For more information about working with the customer managed key (CMK) in KMS, see <a
     *         href="https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html">AWS Key Management Service
     *         concepts</a>.
     */

    public String getKmsArn() {
        return this.kmsArn;
    }

    /**
     * <p>
     * The Amazon resource name (ARN) used to identify the customer managed key (CMK) in AWS Key Management Service
     * (KMS). The <code>KmsArn</code> must be unique for each key signing key (KSK) in a single hosted zone.
     * </p>
     * <p>
     * You must configure the CMK as follows:
     * </p>
     * <dl>
     * <dt>Status</dt>
     * <dd>
     * <p>
     * Enabled
     * </p>
     * </dd>
     * <dt>Key spec</dt>
     * <dd>
     * <p>
     * ECC_NIST_P256
     * </p>
     * </dd>
     * <dt>Key usage</dt>
     * <dd>
     * <p>
     * Sign and verify
     * </p>
     * </dd>
     * <dt>Key policy</dt>
     * <dd>
     * <p>
     * The key policy must give permission for the following actions:
     * </p>
     * <ul>
     * <li>
     * <p>
     * DescribeKey
     * </p>
     * </li>
     * <li>
     * <p>
     * GetPublicKey
     * </p>
     * </li>
     * <li>
     * <p>
     * Sign
     * </p>
     * </li>
     * </ul>
     * <p>
     * The key policy must also include the Amazon Route 53 service in the principal for your account. Specify the
     * following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>"Service": "api-service.dnssec.route53.aws.internal"</code>
     * </p>
     * </li>
     * </ul>
     * </dd>
     * </dl>
     * <p>
     * For more information about working with the customer managed key (CMK) in KMS, see <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html">AWS Key Management Service
     * concepts</a>.
     * </p>
     * 
     * @param kmsArn
     *        The Amazon resource name (ARN) used to identify the customer managed key (CMK) in AWS Key Management
     *        Service (KMS). The <code>KmsArn</code> must be unique for each key signing key (KSK) in a single hosted
     *        zone.</p>
     *        <p>
     *        You must configure the CMK as follows:
     *        </p>
     *        <dl>
     *        <dt>Status</dt>
     *        <dd>
     *        <p>
     *        Enabled
     *        </p>
     *        </dd>
     *        <dt>Key spec</dt>
     *        <dd>
     *        <p>
     *        ECC_NIST_P256
     *        </p>
     *        </dd>
     *        <dt>Key usage</dt>
     *        <dd>
     *        <p>
     *        Sign and verify
     *        </p>
     *        </dd>
     *        <dt>Key policy</dt>
     *        <dd>
     *        <p>
     *        The key policy must give permission for the following actions:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        DescribeKey
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        GetPublicKey
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Sign
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        The key policy must also include the Amazon Route 53 service in the principal for your account. Specify
     *        the following:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>"Service": "api-service.dnssec.route53.aws.internal"</code>
     *        </p>
     *        </li>
     *        </ul>
     *        </dd>
     *        </dl>
     *        <p>
     *        For more information about working with the customer managed key (CMK) in KMS, see <a
     *        href="https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html">AWS Key Management Service
     *        concepts</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KeySigningKey withKmsArn(String kmsArn) {
        setKmsArn(kmsArn);
        return this;
    }

    /**
     * <p>
     * An integer that specifies how the key is used. For key signing key (KSK), this value is always 257.
     * </p>
     * 
     * @param flag
     *        An integer that specifies how the key is used. For key signing key (KSK), this value is always 257.
     */

    public void setFlag(Integer flag) {
        this.flag = flag;
    }

    /**
     * <p>
     * An integer that specifies how the key is used. For key signing key (KSK), this value is always 257.
     * </p>
     * 
     * @return An integer that specifies how the key is used. For key signing key (KSK), this value is always 257.
     */

    public Integer getFlag() {
        return this.flag;
    }

    /**
     * <p>
     * An integer that specifies how the key is used. For key signing key (KSK), this value is always 257.
     * </p>
     * 
     * @param flag
     *        An integer that specifies how the key is used. For key signing key (KSK), this value is always 257.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KeySigningKey withFlag(Integer flag) {
        setFlag(flag);
        return this;
    }

    /**
     * <p>
     * A string used to represent the signing algorithm. This value must follow the guidelines provided by <a
     * href="https://tools.ietf.org/html/rfc8624#section-3.1">RFC-8624 Section 3.1</a>.
     * </p>
     * 
     * @param signingAlgorithmMnemonic
     *        A string used to represent the signing algorithm. This value must follow the guidelines provided by <a
     *        href="https://tools.ietf.org/html/rfc8624#section-3.1">RFC-8624 Section 3.1</a>.
     */

    public void setSigningAlgorithmMnemonic(String signingAlgorithmMnemonic) {
        this.signingAlgorithmMnemonic = signingAlgorithmMnemonic;
    }

    /**
     * <p>
     * A string used to represent the signing algorithm. This value must follow the guidelines provided by <a
     * href="https://tools.ietf.org/html/rfc8624#section-3.1">RFC-8624 Section 3.1</a>.
     * </p>
     * 
     * @return A string used to represent the signing algorithm. This value must follow the guidelines provided by <a
     *         href="https://tools.ietf.org/html/rfc8624#section-3.1">RFC-8624 Section 3.1</a>.
     */

    public String getSigningAlgorithmMnemonic() {
        return this.signingAlgorithmMnemonic;
    }

    /**
     * <p>
     * A string used to represent the signing algorithm. This value must follow the guidelines provided by <a
     * href="https://tools.ietf.org/html/rfc8624#section-3.1">RFC-8624 Section 3.1</a>.
     * </p>
     * 
     * @param signingAlgorithmMnemonic
     *        A string used to represent the signing algorithm. This value must follow the guidelines provided by <a
     *        href="https://tools.ietf.org/html/rfc8624#section-3.1">RFC-8624 Section 3.1</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KeySigningKey withSigningAlgorithmMnemonic(String signingAlgorithmMnemonic) {
        setSigningAlgorithmMnemonic(signingAlgorithmMnemonic);
        return this;
    }

    /**
     * <p>
     * An integer used to represent the signing algorithm. This value must follow the guidelines provided by <a
     * href="https://tools.ietf.org/html/rfc8624#section-3.1">RFC-8624 Section 3.1</a>.
     * </p>
     * 
     * @param signingAlgorithmType
     *        An integer used to represent the signing algorithm. This value must follow the guidelines provided by <a
     *        href="https://tools.ietf.org/html/rfc8624#section-3.1">RFC-8624 Section 3.1</a>.
     */

    public void setSigningAlgorithmType(Integer signingAlgorithmType) {
        this.signingAlgorithmType = signingAlgorithmType;
    }

    /**
     * <p>
     * An integer used to represent the signing algorithm. This value must follow the guidelines provided by <a
     * href="https://tools.ietf.org/html/rfc8624#section-3.1">RFC-8624 Section 3.1</a>.
     * </p>
     * 
     * @return An integer used to represent the signing algorithm. This value must follow the guidelines provided by <a
     *         href="https://tools.ietf.org/html/rfc8624#section-3.1">RFC-8624 Section 3.1</a>.
     */

    public Integer getSigningAlgorithmType() {
        return this.signingAlgorithmType;
    }

    /**
     * <p>
     * An integer used to represent the signing algorithm. This value must follow the guidelines provided by <a
     * href="https://tools.ietf.org/html/rfc8624#section-3.1">RFC-8624 Section 3.1</a>.
     * </p>
     * 
     * @param signingAlgorithmType
     *        An integer used to represent the signing algorithm. This value must follow the guidelines provided by <a
     *        href="https://tools.ietf.org/html/rfc8624#section-3.1">RFC-8624 Section 3.1</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KeySigningKey withSigningAlgorithmType(Integer signingAlgorithmType) {
        setSigningAlgorithmType(signingAlgorithmType);
        return this;
    }

    /**
     * <p>
     * A string used to represent the delegation signer digest algorithm. This value must follow the guidelines provided
     * by <a href="https://tools.ietf.org/html/rfc8624#section-3.3">RFC-8624 Section 3.3</a>.
     * </p>
     * 
     * @param digestAlgorithmMnemonic
     *        A string used to represent the delegation signer digest algorithm. This value must follow the guidelines
     *        provided by <a href="https://tools.ietf.org/html/rfc8624#section-3.3">RFC-8624 Section 3.3</a>.
     */

    public void setDigestAlgorithmMnemonic(String digestAlgorithmMnemonic) {
        this.digestAlgorithmMnemonic = digestAlgorithmMnemonic;
    }

    /**
     * <p>
     * A string used to represent the delegation signer digest algorithm. This value must follow the guidelines provided
     * by <a href="https://tools.ietf.org/html/rfc8624#section-3.3">RFC-8624 Section 3.3</a>.
     * </p>
     * 
     * @return A string used to represent the delegation signer digest algorithm. This value must follow the guidelines
     *         provided by <a href="https://tools.ietf.org/html/rfc8624#section-3.3">RFC-8624 Section 3.3</a>.
     */

    public String getDigestAlgorithmMnemonic() {
        return this.digestAlgorithmMnemonic;
    }

    /**
     * <p>
     * A string used to represent the delegation signer digest algorithm. This value must follow the guidelines provided
     * by <a href="https://tools.ietf.org/html/rfc8624#section-3.3">RFC-8624 Section 3.3</a>.
     * </p>
     * 
     * @param digestAlgorithmMnemonic
     *        A string used to represent the delegation signer digest algorithm. This value must follow the guidelines
     *        provided by <a href="https://tools.ietf.org/html/rfc8624#section-3.3">RFC-8624 Section 3.3</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KeySigningKey withDigestAlgorithmMnemonic(String digestAlgorithmMnemonic) {
        setDigestAlgorithmMnemonic(digestAlgorithmMnemonic);
        return this;
    }

    /**
     * <p>
     * An integer used to represent the delegation signer digest algorithm. This value must follow the guidelines
     * provided by <a href="https://tools.ietf.org/html/rfc8624#section-3.3">RFC-8624 Section 3.3</a>.
     * </p>
     * 
     * @param digestAlgorithmType
     *        An integer used to represent the delegation signer digest algorithm. This value must follow the guidelines
     *        provided by <a href="https://tools.ietf.org/html/rfc8624#section-3.3">RFC-8624 Section 3.3</a>.
     */

    public void setDigestAlgorithmType(Integer digestAlgorithmType) {
        this.digestAlgorithmType = digestAlgorithmType;
    }

    /**
     * <p>
     * An integer used to represent the delegation signer digest algorithm. This value must follow the guidelines
     * provided by <a href="https://tools.ietf.org/html/rfc8624#section-3.3">RFC-8624 Section 3.3</a>.
     * </p>
     * 
     * @return An integer used to represent the delegation signer digest algorithm. This value must follow the
     *         guidelines provided by <a href="https://tools.ietf.org/html/rfc8624#section-3.3">RFC-8624 Section
     *         3.3</a>.
     */

    public Integer getDigestAlgorithmType() {
        return this.digestAlgorithmType;
    }

    /**
     * <p>
     * An integer used to represent the delegation signer digest algorithm. This value must follow the guidelines
     * provided by <a href="https://tools.ietf.org/html/rfc8624#section-3.3">RFC-8624 Section 3.3</a>.
     * </p>
     * 
     * @param digestAlgorithmType
     *        An integer used to represent the delegation signer digest algorithm. This value must follow the guidelines
     *        provided by <a href="https://tools.ietf.org/html/rfc8624#section-3.3">RFC-8624 Section 3.3</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KeySigningKey withDigestAlgorithmType(Integer digestAlgorithmType) {
        setDigestAlgorithmType(digestAlgorithmType);
        return this;
    }

    /**
     * <p>
     * An integer used to identify the DNSSEC record for the domain name. The process used to calculate the value is
     * described in <a href="https://tools.ietf.org/rfc/rfc4034.txt">RFC-4034 Appendix B</a>.
     * </p>
     * 
     * @param keyTag
     *        An integer used to identify the DNSSEC record for the domain name. The process used to calculate the value
     *        is described in <a href="https://tools.ietf.org/rfc/rfc4034.txt">RFC-4034 Appendix B</a>.
     */

    public void setKeyTag(Integer keyTag) {
        this.keyTag = keyTag;
    }

    /**
     * <p>
     * An integer used to identify the DNSSEC record for the domain name. The process used to calculate the value is
     * described in <a href="https://tools.ietf.org/rfc/rfc4034.txt">RFC-4034 Appendix B</a>.
     * </p>
     * 
     * @return An integer used to identify the DNSSEC record for the domain name. The process used to calculate the
     *         value is described in <a href="https://tools.ietf.org/rfc/rfc4034.txt">RFC-4034 Appendix B</a>.
     */

    public Integer getKeyTag() {
        return this.keyTag;
    }

    /**
     * <p>
     * An integer used to identify the DNSSEC record for the domain name. The process used to calculate the value is
     * described in <a href="https://tools.ietf.org/rfc/rfc4034.txt">RFC-4034 Appendix B</a>.
     * </p>
     * 
     * @param keyTag
     *        An integer used to identify the DNSSEC record for the domain name. The process used to calculate the value
     *        is described in <a href="https://tools.ietf.org/rfc/rfc4034.txt">RFC-4034 Appendix B</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KeySigningKey withKeyTag(Integer keyTag) {
        setKeyTag(keyTag);
        return this;
    }

    /**
     * <p>
     * A cryptographic digest of a DNSKEY resource record (RR). DNSKEY records are used to publish the public key that
     * resolvers can use to verify DNSSEC signatures that are used to secure certain kinds of information provided by
     * the DNS system.
     * </p>
     * 
     * @param digestValue
     *        A cryptographic digest of a DNSKEY resource record (RR). DNSKEY records are used to publish the public key
     *        that resolvers can use to verify DNSSEC signatures that are used to secure certain kinds of information
     *        provided by the DNS system.
     */

    public void setDigestValue(String digestValue) {
        this.digestValue = digestValue;
    }

    /**
     * <p>
     * A cryptographic digest of a DNSKEY resource record (RR). DNSKEY records are used to publish the public key that
     * resolvers can use to verify DNSSEC signatures that are used to secure certain kinds of information provided by
     * the DNS system.
     * </p>
     * 
     * @return A cryptographic digest of a DNSKEY resource record (RR). DNSKEY records are used to publish the public
     *         key that resolvers can use to verify DNSSEC signatures that are used to secure certain kinds of
     *         information provided by the DNS system.
     */

    public String getDigestValue() {
        return this.digestValue;
    }

    /**
     * <p>
     * A cryptographic digest of a DNSKEY resource record (RR). DNSKEY records are used to publish the public key that
     * resolvers can use to verify DNSSEC signatures that are used to secure certain kinds of information provided by
     * the DNS system.
     * </p>
     * 
     * @param digestValue
     *        A cryptographic digest of a DNSKEY resource record (RR). DNSKEY records are used to publish the public key
     *        that resolvers can use to verify DNSSEC signatures that are used to secure certain kinds of information
     *        provided by the DNS system.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KeySigningKey withDigestValue(String digestValue) {
        setDigestValue(digestValue);
        return this;
    }

    /**
     * <p>
     * The public key, represented as a Base64 encoding, as required by <a
     * href="https://tools.ietf.org/rfc/rfc4034.txt"> RFC-4034 Page 5</a>.
     * </p>
     * 
     * @param publicKey
     *        The public key, represented as a Base64 encoding, as required by <a
     *        href="https://tools.ietf.org/rfc/rfc4034.txt"> RFC-4034 Page 5</a>.
     */

    public void setPublicKey(String publicKey) {
        this.publicKey = publicKey;
    }

    /**
     * <p>
     * The public key, represented as a Base64 encoding, as required by <a
     * href="https://tools.ietf.org/rfc/rfc4034.txt"> RFC-4034 Page 5</a>.
     * </p>
     * 
     * @return The public key, represented as a Base64 encoding, as required by <a
     *         href="https://tools.ietf.org/rfc/rfc4034.txt"> RFC-4034 Page 5</a>.
     */

    public String getPublicKey() {
        return this.publicKey;
    }

    /**
     * <p>
     * The public key, represented as a Base64 encoding, as required by <a
     * href="https://tools.ietf.org/rfc/rfc4034.txt"> RFC-4034 Page 5</a>.
     * </p>
     * 
     * @param publicKey
     *        The public key, represented as a Base64 encoding, as required by <a
     *        href="https://tools.ietf.org/rfc/rfc4034.txt"> RFC-4034 Page 5</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KeySigningKey withPublicKey(String publicKey) {
        setPublicKey(publicKey);
        return this;
    }

    /**
     * <p>
     * A string that represents a delegation signer (DS) record.
     * </p>
     * 
     * @param dSRecord
     *        A string that represents a delegation signer (DS) record.
     */

    public void setDSRecord(String dSRecord) {
        this.dSRecord = dSRecord;
    }

    /**
     * <p>
     * A string that represents a delegation signer (DS) record.
     * </p>
     * 
     * @return A string that represents a delegation signer (DS) record.
     */

    public String getDSRecord() {
        return this.dSRecord;
    }

    /**
     * <p>
     * A string that represents a delegation signer (DS) record.
     * </p>
     * 
     * @param dSRecord
     *        A string that represents a delegation signer (DS) record.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KeySigningKey withDSRecord(String dSRecord) {
        setDSRecord(dSRecord);
        return this;
    }

    /**
     * <p>
     * A string that represents a DNSKEY record.
     * </p>
     * 
     * @param dNSKEYRecord
     *        A string that represents a DNSKEY record.
     */

    public void setDNSKEYRecord(String dNSKEYRecord) {
        this.dNSKEYRecord = dNSKEYRecord;
    }

    /**
     * <p>
     * A string that represents a DNSKEY record.
     * </p>
     * 
     * @return A string that represents a DNSKEY record.
     */

    public String getDNSKEYRecord() {
        return this.dNSKEYRecord;
    }

    /**
     * <p>
     * A string that represents a DNSKEY record.
     * </p>
     * 
     * @param dNSKEYRecord
     *        A string that represents a DNSKEY record.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KeySigningKey withDNSKEYRecord(String dNSKEYRecord) {
        setDNSKEYRecord(dNSKEYRecord);
        return this;
    }

    /**
     * <p>
     * A string that represents the current key signing key (KSK) status.
     * </p>
     * <p>
     * Status can have one of the following values:
     * </p>
     * <dl>
     * <dt>ACTIVE</dt>
     * <dd>
     * <p>
     * The KSK is being used for signing.
     * </p>
     * </dd>
     * <dt>INACTIVE</dt>
     * <dd>
     * <p>
     * The KSK is not being used for signing.
     * </p>
     * </dd>
     * <dt>ACTION_NEEDED</dt>
     * <dd>
     * <p>
     * There is an error in the KSK that requires you to take action to resolve.
     * </p>
     * </dd>
     * <dt>INTERNAL_FAILURE</dt>
     * <dd>
     * <p>
     * There was an error during a request. Before you can continue to work with DNSSEC signing, including actions that
     * involve this KSK, you must correct the problem. For example, you may need to activate or deactivate the KSK.
     * </p>
     * </dd>
     * </dl>
     * 
     * @param status
     *        A string that represents the current key signing key (KSK) status.</p>
     *        <p>
     *        Status can have one of the following values:
     *        </p>
     *        <dl>
     *        <dt>ACTIVE</dt>
     *        <dd>
     *        <p>
     *        The KSK is being used for signing.
     *        </p>
     *        </dd>
     *        <dt>INACTIVE</dt>
     *        <dd>
     *        <p>
     *        The KSK is not being used for signing.
     *        </p>
     *        </dd>
     *        <dt>ACTION_NEEDED</dt>
     *        <dd>
     *        <p>
     *        There is an error in the KSK that requires you to take action to resolve.
     *        </p>
     *        </dd>
     *        <dt>INTERNAL_FAILURE</dt>
     *        <dd>
     *        <p>
     *        There was an error during a request. Before you can continue to work with DNSSEC signing, including
     *        actions that involve this KSK, you must correct the problem. For example, you may need to activate or
     *        deactivate the KSK.
     *        </p>
     *        </dd>
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * A string that represents the current key signing key (KSK) status.
     * </p>
     * <p>
     * Status can have one of the following values:
     * </p>
     * <dl>
     * <dt>ACTIVE</dt>
     * <dd>
     * <p>
     * The KSK is being used for signing.
     * </p>
     * </dd>
     * <dt>INACTIVE</dt>
     * <dd>
     * <p>
     * The KSK is not being used for signing.
     * </p>
     * </dd>
     * <dt>ACTION_NEEDED</dt>
     * <dd>
     * <p>
     * There is an error in the KSK that requires you to take action to resolve.
     * </p>
     * </dd>
     * <dt>INTERNAL_FAILURE</dt>
     * <dd>
     * <p>
     * There was an error during a request. Before you can continue to work with DNSSEC signing, including actions that
     * involve this KSK, you must correct the problem. For example, you may need to activate or deactivate the KSK.
     * </p>
     * </dd>
     * </dl>
     * 
     * @return A string that represents the current key signing key (KSK) status.</p>
     *         <p>
     *         Status can have one of the following values:
     *         </p>
     *         <dl>
     *         <dt>ACTIVE</dt>
     *         <dd>
     *         <p>
     *         The KSK is being used for signing.
     *         </p>
     *         </dd>
     *         <dt>INACTIVE</dt>
     *         <dd>
     *         <p>
     *         The KSK is not being used for signing.
     *         </p>
     *         </dd>
     *         <dt>ACTION_NEEDED</dt>
     *         <dd>
     *         <p>
     *         There is an error in the KSK that requires you to take action to resolve.
     *         </p>
     *         </dd>
     *         <dt>INTERNAL_FAILURE</dt>
     *         <dd>
     *         <p>
     *         There was an error during a request. Before you can continue to work with DNSSEC signing, including
     *         actions that involve this KSK, you must correct the problem. For example, you may need to activate or
     *         deactivate the KSK.
     *         </p>
     *         </dd>
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * A string that represents the current key signing key (KSK) status.
     * </p>
     * <p>
     * Status can have one of the following values:
     * </p>
     * <dl>
     * <dt>ACTIVE</dt>
     * <dd>
     * <p>
     * The KSK is being used for signing.
     * </p>
     * </dd>
     * <dt>INACTIVE</dt>
     * <dd>
     * <p>
     * The KSK is not being used for signing.
     * </p>
     * </dd>
     * <dt>ACTION_NEEDED</dt>
     * <dd>
     * <p>
     * There is an error in the KSK that requires you to take action to resolve.
     * </p>
     * </dd>
     * <dt>INTERNAL_FAILURE</dt>
     * <dd>
     * <p>
     * There was an error during a request. Before you can continue to work with DNSSEC signing, including actions that
     * involve this KSK, you must correct the problem. For example, you may need to activate or deactivate the KSK.
     * </p>
     * </dd>
     * </dl>
     * 
     * @param status
     *        A string that represents the current key signing key (KSK) status.</p>
     *        <p>
     *        Status can have one of the following values:
     *        </p>
     *        <dl>
     *        <dt>ACTIVE</dt>
     *        <dd>
     *        <p>
     *        The KSK is being used for signing.
     *        </p>
     *        </dd>
     *        <dt>INACTIVE</dt>
     *        <dd>
     *        <p>
     *        The KSK is not being used for signing.
     *        </p>
     *        </dd>
     *        <dt>ACTION_NEEDED</dt>
     *        <dd>
     *        <p>
     *        There is an error in the KSK that requires you to take action to resolve.
     *        </p>
     *        </dd>
     *        <dt>INTERNAL_FAILURE</dt>
     *        <dd>
     *        <p>
     *        There was an error during a request. Before you can continue to work with DNSSEC signing, including
     *        actions that involve this KSK, you must correct the problem. For example, you may need to activate or
     *        deactivate the KSK.
     *        </p>
     *        </dd>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KeySigningKey withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status message provided for the following key signing key (KSK) statuses: <code>ACTION_NEEDED</code> or
     * <code>INTERNAL_FAILURE</code>. The status message includes information about what the problem might be and steps
     * that you can take to correct the issue.
     * </p>
     * 
     * @param statusMessage
     *        The status message provided for the following key signing key (KSK) statuses: <code>ACTION_NEEDED</code>
     *        or <code>INTERNAL_FAILURE</code>. The status message includes information about what the problem might be
     *        and steps that you can take to correct the issue.
     */

    public void setStatusMessage(String statusMessage) {
        this.statusMessage = statusMessage;
    }

    /**
     * <p>
     * The status message provided for the following key signing key (KSK) statuses: <code>ACTION_NEEDED</code> or
     * <code>INTERNAL_FAILURE</code>. The status message includes information about what the problem might be and steps
     * that you can take to correct the issue.
     * </p>
     * 
     * @return The status message provided for the following key signing key (KSK) statuses: <code>ACTION_NEEDED</code>
     *         or <code>INTERNAL_FAILURE</code>. The status message includes information about what the problem might be
     *         and steps that you can take to correct the issue.
     */

    public String getStatusMessage() {
        return this.statusMessage;
    }

    /**
     * <p>
     * The status message provided for the following key signing key (KSK) statuses: <code>ACTION_NEEDED</code> or
     * <code>INTERNAL_FAILURE</code>. The status message includes information about what the problem might be and steps
     * that you can take to correct the issue.
     * </p>
     * 
     * @param statusMessage
     *        The status message provided for the following key signing key (KSK) statuses: <code>ACTION_NEEDED</code>
     *        or <code>INTERNAL_FAILURE</code>. The status message includes information about what the problem might be
     *        and steps that you can take to correct the issue.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KeySigningKey withStatusMessage(String statusMessage) {
        setStatusMessage(statusMessage);
        return this;
    }

    /**
     * <p>
     * The date when the key signing key (KSK) was created.
     * </p>
     * 
     * @param createdDate
     *        The date when the key signing key (KSK) was created.
     */

    public void setCreatedDate(java.util.Date createdDate) {
        this.createdDate = createdDate;
    }

    /**
     * <p>
     * The date when the key signing key (KSK) was created.
     * </p>
     * 
     * @return The date when the key signing key (KSK) was created.
     */

    public java.util.Date getCreatedDate() {
        return this.createdDate;
    }

    /**
     * <p>
     * The date when the key signing key (KSK) was created.
     * </p>
     * 
     * @param createdDate
     *        The date when the key signing key (KSK) was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KeySigningKey withCreatedDate(java.util.Date createdDate) {
        setCreatedDate(createdDate);
        return this;
    }

    /**
     * <p>
     * The last time that the key signing key (KSK) was changed.
     * </p>
     * 
     * @param lastModifiedDate
     *        The last time that the key signing key (KSK) was changed.
     */

    public void setLastModifiedDate(java.util.Date lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    /**
     * <p>
     * The last time that the key signing key (KSK) was changed.
     * </p>
     * 
     * @return The last time that the key signing key (KSK) was changed.
     */

    public java.util.Date getLastModifiedDate() {
        return this.lastModifiedDate;
    }

    /**
     * <p>
     * The last time that the key signing key (KSK) was changed.
     * </p>
     * 
     * @param lastModifiedDate
     *        The last time that the key signing key (KSK) was changed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KeySigningKey withLastModifiedDate(java.util.Date lastModifiedDate) {
        setLastModifiedDate(lastModifiedDate);
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getKmsArn() != null)
            sb.append("KmsArn: ").append(getKmsArn()).append(",");
        if (getFlag() != null)
            sb.append("Flag: ").append(getFlag()).append(",");
        if (getSigningAlgorithmMnemonic() != null)
            sb.append("SigningAlgorithmMnemonic: ").append(getSigningAlgorithmMnemonic()).append(",");
        if (getSigningAlgorithmType() != null)
            sb.append("SigningAlgorithmType: ").append(getSigningAlgorithmType()).append(",");
        if (getDigestAlgorithmMnemonic() != null)
            sb.append("DigestAlgorithmMnemonic: ").append(getDigestAlgorithmMnemonic()).append(",");
        if (getDigestAlgorithmType() != null)
            sb.append("DigestAlgorithmType: ").append(getDigestAlgorithmType()).append(",");
        if (getKeyTag() != null)
            sb.append("KeyTag: ").append(getKeyTag()).append(",");
        if (getDigestValue() != null)
            sb.append("DigestValue: ").append(getDigestValue()).append(",");
        if (getPublicKey() != null)
            sb.append("PublicKey: ").append(getPublicKey()).append(",");
        if (getDSRecord() != null)
            sb.append("DSRecord: ").append(getDSRecord()).append(",");
        if (getDNSKEYRecord() != null)
            sb.append("DNSKEYRecord: ").append(getDNSKEYRecord()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getStatusMessage() != null)
            sb.append("StatusMessage: ").append(getStatusMessage()).append(",");
        if (getCreatedDate() != null)
            sb.append("CreatedDate: ").append(getCreatedDate()).append(",");
        if (getLastModifiedDate() != null)
            sb.append("LastModifiedDate: ").append(getLastModifiedDate());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof KeySigningKey == false)
            return false;
        KeySigningKey other = (KeySigningKey) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getKmsArn() == null ^ this.getKmsArn() == null)
            return false;
        if (other.getKmsArn() != null && other.getKmsArn().equals(this.getKmsArn()) == false)
            return false;
        if (other.getFlag() == null ^ this.getFlag() == null)
            return false;
        if (other.getFlag() != null && other.getFlag().equals(this.getFlag()) == false)
            return false;
        if (other.getSigningAlgorithmMnemonic() == null ^ this.getSigningAlgorithmMnemonic() == null)
            return false;
        if (other.getSigningAlgorithmMnemonic() != null && other.getSigningAlgorithmMnemonic().equals(this.getSigningAlgorithmMnemonic()) == false)
            return false;
        if (other.getSigningAlgorithmType() == null ^ this.getSigningAlgorithmType() == null)
            return false;
        if (other.getSigningAlgorithmType() != null && other.getSigningAlgorithmType().equals(this.getSigningAlgorithmType()) == false)
            return false;
        if (other.getDigestAlgorithmMnemonic() == null ^ this.getDigestAlgorithmMnemonic() == null)
            return false;
        if (other.getDigestAlgorithmMnemonic() != null && other.getDigestAlgorithmMnemonic().equals(this.getDigestAlgorithmMnemonic()) == false)
            return false;
        if (other.getDigestAlgorithmType() == null ^ this.getDigestAlgorithmType() == null)
            return false;
        if (other.getDigestAlgorithmType() != null && other.getDigestAlgorithmType().equals(this.getDigestAlgorithmType()) == false)
            return false;
        if (other.getKeyTag() == null ^ this.getKeyTag() == null)
            return false;
        if (other.getKeyTag() != null && other.getKeyTag().equals(this.getKeyTag()) == false)
            return false;
        if (other.getDigestValue() == null ^ this.getDigestValue() == null)
            return false;
        if (other.getDigestValue() != null && other.getDigestValue().equals(this.getDigestValue()) == false)
            return false;
        if (other.getPublicKey() == null ^ this.getPublicKey() == null)
            return false;
        if (other.getPublicKey() != null && other.getPublicKey().equals(this.getPublicKey()) == false)
            return false;
        if (other.getDSRecord() == null ^ this.getDSRecord() == null)
            return false;
        if (other.getDSRecord() != null && other.getDSRecord().equals(this.getDSRecord()) == false)
            return false;
        if (other.getDNSKEYRecord() == null ^ this.getDNSKEYRecord() == null)
            return false;
        if (other.getDNSKEYRecord() != null && other.getDNSKEYRecord().equals(this.getDNSKEYRecord()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getStatusMessage() == null ^ this.getStatusMessage() == null)
            return false;
        if (other.getStatusMessage() != null && other.getStatusMessage().equals(this.getStatusMessage()) == false)
            return false;
        if (other.getCreatedDate() == null ^ this.getCreatedDate() == null)
            return false;
        if (other.getCreatedDate() != null && other.getCreatedDate().equals(this.getCreatedDate()) == false)
            return false;
        if (other.getLastModifiedDate() == null ^ this.getLastModifiedDate() == null)
            return false;
        if (other.getLastModifiedDate() != null && other.getLastModifiedDate().equals(this.getLastModifiedDate()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getKmsArn() == null) ? 0 : getKmsArn().hashCode());
        hashCode = prime * hashCode + ((getFlag() == null) ? 0 : getFlag().hashCode());
        hashCode = prime * hashCode + ((getSigningAlgorithmMnemonic() == null) ? 0 : getSigningAlgorithmMnemonic().hashCode());
        hashCode = prime * hashCode + ((getSigningAlgorithmType() == null) ? 0 : getSigningAlgorithmType().hashCode());
        hashCode = prime * hashCode + ((getDigestAlgorithmMnemonic() == null) ? 0 : getDigestAlgorithmMnemonic().hashCode());
        hashCode = prime * hashCode + ((getDigestAlgorithmType() == null) ? 0 : getDigestAlgorithmType().hashCode());
        hashCode = prime * hashCode + ((getKeyTag() == null) ? 0 : getKeyTag().hashCode());
        hashCode = prime * hashCode + ((getDigestValue() == null) ? 0 : getDigestValue().hashCode());
        hashCode = prime * hashCode + ((getPublicKey() == null) ? 0 : getPublicKey().hashCode());
        hashCode = prime * hashCode + ((getDSRecord() == null) ? 0 : getDSRecord().hashCode());
        hashCode = prime * hashCode + ((getDNSKEYRecord() == null) ? 0 : getDNSKEYRecord().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getStatusMessage() == null) ? 0 : getStatusMessage().hashCode());
        hashCode = prime * hashCode + ((getCreatedDate() == null) ? 0 : getCreatedDate().hashCode());
        hashCode = prime * hashCode + ((getLastModifiedDate() == null) ? 0 : getLastModifiedDate().hashCode());
        return hashCode;
    }

    @Override
    public KeySigningKey clone() {
        try {
            return (KeySigningKey) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
