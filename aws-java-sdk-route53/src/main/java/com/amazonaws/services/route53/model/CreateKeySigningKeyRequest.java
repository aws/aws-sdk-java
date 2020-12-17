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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-2013-04-01/CreateKeySigningKey" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateKeySigningKeyRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A unique string that identifies the request.
     * </p>
     */
    private String callerReference;
    /**
     * <p>
     * The unique string (ID) used to identify a hosted zone.
     * </p>
     */
    private String hostedZoneId;
    /**
     * <p>
     * The Amazon resource name (ARN) for a customer managed key (CMK) in AWS Key Management Service (KMS). The
     * <code>KeyManagementServiceArn</code> must be unique for each key signing key (KSK) in a single hosted zone. To
     * see an example of <code>KeyManagementServiceArn</code> that grants the correct permissions for DNSSEC, scroll
     * down to <b>Example</b>.
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
     * For more information about working with CMK in KMS, see <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html">AWS Key Management Service
     * concepts</a>.
     * </p>
     */
    private String keyManagementServiceArn;
    /**
     * <p>
     * An alphanumeric string used to identify a key signing key (KSK). <code>Name</code> must be unique for each key
     * signing key in the same hosted zone.
     * </p>
     */
    private String name;
    /**
     * <p>
     * A string specifying the initial status of the key signing key (KSK). You can set the value to <code>ACTIVE</code>
     * or <code>INACTIVE</code>.
     * </p>
     */
    private String status;

    /**
     * <p>
     * A unique string that identifies the request.
     * </p>
     * 
     * @param callerReference
     *        A unique string that identifies the request.
     */

    public void setCallerReference(String callerReference) {
        this.callerReference = callerReference;
    }

    /**
     * <p>
     * A unique string that identifies the request.
     * </p>
     * 
     * @return A unique string that identifies the request.
     */

    public String getCallerReference() {
        return this.callerReference;
    }

    /**
     * <p>
     * A unique string that identifies the request.
     * </p>
     * 
     * @param callerReference
     *        A unique string that identifies the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateKeySigningKeyRequest withCallerReference(String callerReference) {
        setCallerReference(callerReference);
        return this;
    }

    /**
     * <p>
     * The unique string (ID) used to identify a hosted zone.
     * </p>
     * 
     * @param hostedZoneId
     *        The unique string (ID) used to identify a hosted zone.
     */

    public void setHostedZoneId(String hostedZoneId) {
        this.hostedZoneId = hostedZoneId;
    }

    /**
     * <p>
     * The unique string (ID) used to identify a hosted zone.
     * </p>
     * 
     * @return The unique string (ID) used to identify a hosted zone.
     */

    public String getHostedZoneId() {
        return this.hostedZoneId;
    }

    /**
     * <p>
     * The unique string (ID) used to identify a hosted zone.
     * </p>
     * 
     * @param hostedZoneId
     *        The unique string (ID) used to identify a hosted zone.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateKeySigningKeyRequest withHostedZoneId(String hostedZoneId) {
        setHostedZoneId(hostedZoneId);
        return this;
    }

    /**
     * <p>
     * The Amazon resource name (ARN) for a customer managed key (CMK) in AWS Key Management Service (KMS). The
     * <code>KeyManagementServiceArn</code> must be unique for each key signing key (KSK) in a single hosted zone. To
     * see an example of <code>KeyManagementServiceArn</code> that grants the correct permissions for DNSSEC, scroll
     * down to <b>Example</b>.
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
     * For more information about working with CMK in KMS, see <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html">AWS Key Management Service
     * concepts</a>.
     * </p>
     * 
     * @param keyManagementServiceArn
     *        The Amazon resource name (ARN) for a customer managed key (CMK) in AWS Key Management Service (KMS). The
     *        <code>KeyManagementServiceArn</code> must be unique for each key signing key (KSK) in a single hosted
     *        zone. To see an example of <code>KeyManagementServiceArn</code> that grants the correct permissions for
     *        DNSSEC, scroll down to <b>Example</b>. </p>
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
     *        For more information about working with CMK in KMS, see <a
     *        href="https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html">AWS Key Management Service
     *        concepts</a>.
     */

    public void setKeyManagementServiceArn(String keyManagementServiceArn) {
        this.keyManagementServiceArn = keyManagementServiceArn;
    }

    /**
     * <p>
     * The Amazon resource name (ARN) for a customer managed key (CMK) in AWS Key Management Service (KMS). The
     * <code>KeyManagementServiceArn</code> must be unique for each key signing key (KSK) in a single hosted zone. To
     * see an example of <code>KeyManagementServiceArn</code> that grants the correct permissions for DNSSEC, scroll
     * down to <b>Example</b>.
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
     * For more information about working with CMK in KMS, see <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html">AWS Key Management Service
     * concepts</a>.
     * </p>
     * 
     * @return The Amazon resource name (ARN) for a customer managed key (CMK) in AWS Key Management Service (KMS). The
     *         <code>KeyManagementServiceArn</code> must be unique for each key signing key (KSK) in a single hosted
     *         zone. To see an example of <code>KeyManagementServiceArn</code> that grants the correct permissions for
     *         DNSSEC, scroll down to <b>Example</b>. </p>
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
     *         For more information about working with CMK in KMS, see <a
     *         href="https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html">AWS Key Management Service
     *         concepts</a>.
     */

    public String getKeyManagementServiceArn() {
        return this.keyManagementServiceArn;
    }

    /**
     * <p>
     * The Amazon resource name (ARN) for a customer managed key (CMK) in AWS Key Management Service (KMS). The
     * <code>KeyManagementServiceArn</code> must be unique for each key signing key (KSK) in a single hosted zone. To
     * see an example of <code>KeyManagementServiceArn</code> that grants the correct permissions for DNSSEC, scroll
     * down to <b>Example</b>.
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
     * For more information about working with CMK in KMS, see <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html">AWS Key Management Service
     * concepts</a>.
     * </p>
     * 
     * @param keyManagementServiceArn
     *        The Amazon resource name (ARN) for a customer managed key (CMK) in AWS Key Management Service (KMS). The
     *        <code>KeyManagementServiceArn</code> must be unique for each key signing key (KSK) in a single hosted
     *        zone. To see an example of <code>KeyManagementServiceArn</code> that grants the correct permissions for
     *        DNSSEC, scroll down to <b>Example</b>. </p>
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
     *        For more information about working with CMK in KMS, see <a
     *        href="https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html">AWS Key Management Service
     *        concepts</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateKeySigningKeyRequest withKeyManagementServiceArn(String keyManagementServiceArn) {
        setKeyManagementServiceArn(keyManagementServiceArn);
        return this;
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

    public CreateKeySigningKeyRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * A string specifying the initial status of the key signing key (KSK). You can set the value to <code>ACTIVE</code>
     * or <code>INACTIVE</code>.
     * </p>
     * 
     * @param status
     *        A string specifying the initial status of the key signing key (KSK). You can set the value to
     *        <code>ACTIVE</code> or <code>INACTIVE</code>.
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * A string specifying the initial status of the key signing key (KSK). You can set the value to <code>ACTIVE</code>
     * or <code>INACTIVE</code>.
     * </p>
     * 
     * @return A string specifying the initial status of the key signing key (KSK). You can set the value to
     *         <code>ACTIVE</code> or <code>INACTIVE</code>.
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * A string specifying the initial status of the key signing key (KSK). You can set the value to <code>ACTIVE</code>
     * or <code>INACTIVE</code>.
     * </p>
     * 
     * @param status
     *        A string specifying the initial status of the key signing key (KSK). You can set the value to
     *        <code>ACTIVE</code> or <code>INACTIVE</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateKeySigningKeyRequest withStatus(String status) {
        setStatus(status);
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
        if (getCallerReference() != null)
            sb.append("CallerReference: ").append(getCallerReference()).append(",");
        if (getHostedZoneId() != null)
            sb.append("HostedZoneId: ").append(getHostedZoneId()).append(",");
        if (getKeyManagementServiceArn() != null)
            sb.append("KeyManagementServiceArn: ").append(getKeyManagementServiceArn()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
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

        if (obj instanceof CreateKeySigningKeyRequest == false)
            return false;
        CreateKeySigningKeyRequest other = (CreateKeySigningKeyRequest) obj;
        if (other.getCallerReference() == null ^ this.getCallerReference() == null)
            return false;
        if (other.getCallerReference() != null && other.getCallerReference().equals(this.getCallerReference()) == false)
            return false;
        if (other.getHostedZoneId() == null ^ this.getHostedZoneId() == null)
            return false;
        if (other.getHostedZoneId() != null && other.getHostedZoneId().equals(this.getHostedZoneId()) == false)
            return false;
        if (other.getKeyManagementServiceArn() == null ^ this.getKeyManagementServiceArn() == null)
            return false;
        if (other.getKeyManagementServiceArn() != null && other.getKeyManagementServiceArn().equals(this.getKeyManagementServiceArn()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
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

        hashCode = prime * hashCode + ((getCallerReference() == null) ? 0 : getCallerReference().hashCode());
        hashCode = prime * hashCode + ((getHostedZoneId() == null) ? 0 : getHostedZoneId().hashCode());
        hashCode = prime * hashCode + ((getKeyManagementServiceArn() == null) ? 0 : getKeyManagementServiceArn().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return hashCode;
    }

    @Override
    public CreateKeySigningKeyRequest clone() {
        return (CreateKeySigningKeyRequest) super.clone();
    }

}
