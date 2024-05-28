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
package com.amazonaws.services.kms.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kms-2014-11-01/EnableKeyRotation" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EnableKeyRotationRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Identifies a symmetric encryption KMS key. You cannot enable automatic rotation of <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/symmetric-asymmetric.html">asymmetric KMS keys</a>,
     * <a href="https://docs.aws.amazon.com/kms/latest/developerguide/hmac.html">HMAC KMS keys</a>, KMS keys with <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/importing-keys.html">imported key material</a>, or
     * KMS keys in a <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/custom-key-store-overview.html">custom key store</a>.
     * To enable or disable automatic rotation of a set of related <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/multi-region-keys-manage.html#multi-region-rotate"
     * >multi-Region keys</a>, set the property on the primary key.
     * </p>
     * <p>
     * Specify the key ID or key ARN of the KMS key.
     * </p>
     * <p>
     * For example:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Key ID: <code>1234abcd-12ab-34cd-56ef-1234567890ab</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Key ARN: <code>arn:aws:kms:us-east-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * To get the key ID and key ARN for a KMS key, use <a>ListKeys</a> or <a>DescribeKey</a>.
     * </p>
     */
    private String keyId;
    /**
     * <p>
     * Use this parameter to specify a custom period of time between each rotation date. If no value is specified, the
     * default value is 365 days.
     * </p>
     * <p>
     * The rotation period defines the number of days after you enable automatic key rotation that KMS will rotate your
     * key material, and the number of days between each automatic rotation thereafter.
     * </p>
     * <p>
     * You can use the <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/conditions-kms.html#conditions-kms-rotation-period-in-days"
     * > <code>kms:RotationPeriodInDays</code> </a> condition key to further constrain the values that principals can
     * specify in the <code>RotationPeriodInDays</code> parameter.
     * </p>
     * <p>
     * </p>
     */
    private Integer rotationPeriodInDays;

    /**
     * <p>
     * Identifies a symmetric encryption KMS key. You cannot enable automatic rotation of <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/symmetric-asymmetric.html">asymmetric KMS keys</a>,
     * <a href="https://docs.aws.amazon.com/kms/latest/developerguide/hmac.html">HMAC KMS keys</a>, KMS keys with <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/importing-keys.html">imported key material</a>, or
     * KMS keys in a <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/custom-key-store-overview.html">custom key store</a>.
     * To enable or disable automatic rotation of a set of related <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/multi-region-keys-manage.html#multi-region-rotate"
     * >multi-Region keys</a>, set the property on the primary key.
     * </p>
     * <p>
     * Specify the key ID or key ARN of the KMS key.
     * </p>
     * <p>
     * For example:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Key ID: <code>1234abcd-12ab-34cd-56ef-1234567890ab</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Key ARN: <code>arn:aws:kms:us-east-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * To get the key ID and key ARN for a KMS key, use <a>ListKeys</a> or <a>DescribeKey</a>.
     * </p>
     * 
     * @param keyId
     *        Identifies a symmetric encryption KMS key. You cannot enable automatic rotation of <a
     *        href="https://docs.aws.amazon.com/kms/latest/developerguide/symmetric-asymmetric.html">asymmetric KMS
     *        keys</a>, <a href="https://docs.aws.amazon.com/kms/latest/developerguide/hmac.html">HMAC KMS keys</a>, KMS
     *        keys with <a href="https://docs.aws.amazon.com/kms/latest/developerguide/importing-keys.html">imported key
     *        material</a>, or KMS keys in a <a
     *        href="https://docs.aws.amazon.com/kms/latest/developerguide/custom-key-store-overview.html">custom key
     *        store</a>. To enable or disable automatic rotation of a set of related <a href=
     *        "https://docs.aws.amazon.com/kms/latest/developerguide/multi-region-keys-manage.html#multi-region-rotate"
     *        >multi-Region keys</a>, set the property on the primary key.</p>
     *        <p>
     *        Specify the key ID or key ARN of the KMS key.
     *        </p>
     *        <p>
     *        For example:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Key ID: <code>1234abcd-12ab-34cd-56ef-1234567890ab</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Key ARN: <code>arn:aws:kms:us-east-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab</code>
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        To get the key ID and key ARN for a KMS key, use <a>ListKeys</a> or <a>DescribeKey</a>.
     */

    public void setKeyId(String keyId) {
        this.keyId = keyId;
    }

    /**
     * <p>
     * Identifies a symmetric encryption KMS key. You cannot enable automatic rotation of <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/symmetric-asymmetric.html">asymmetric KMS keys</a>,
     * <a href="https://docs.aws.amazon.com/kms/latest/developerguide/hmac.html">HMAC KMS keys</a>, KMS keys with <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/importing-keys.html">imported key material</a>, or
     * KMS keys in a <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/custom-key-store-overview.html">custom key store</a>.
     * To enable or disable automatic rotation of a set of related <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/multi-region-keys-manage.html#multi-region-rotate"
     * >multi-Region keys</a>, set the property on the primary key.
     * </p>
     * <p>
     * Specify the key ID or key ARN of the KMS key.
     * </p>
     * <p>
     * For example:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Key ID: <code>1234abcd-12ab-34cd-56ef-1234567890ab</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Key ARN: <code>arn:aws:kms:us-east-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * To get the key ID and key ARN for a KMS key, use <a>ListKeys</a> or <a>DescribeKey</a>.
     * </p>
     * 
     * @return Identifies a symmetric encryption KMS key. You cannot enable automatic rotation of <a
     *         href="https://docs.aws.amazon.com/kms/latest/developerguide/symmetric-asymmetric.html">asymmetric KMS
     *         keys</a>, <a href="https://docs.aws.amazon.com/kms/latest/developerguide/hmac.html">HMAC KMS keys</a>,
     *         KMS keys with <a
     *         href="https://docs.aws.amazon.com/kms/latest/developerguide/importing-keys.html">imported key
     *         material</a>, or KMS keys in a <a
     *         href="https://docs.aws.amazon.com/kms/latest/developerguide/custom-key-store-overview.html">custom key
     *         store</a>. To enable or disable automatic rotation of a set of related <a href=
     *         "https://docs.aws.amazon.com/kms/latest/developerguide/multi-region-keys-manage.html#multi-region-rotate"
     *         >multi-Region keys</a>, set the property on the primary key.</p>
     *         <p>
     *         Specify the key ID or key ARN of the KMS key.
     *         </p>
     *         <p>
     *         For example:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Key ID: <code>1234abcd-12ab-34cd-56ef-1234567890ab</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Key ARN: <code>arn:aws:kms:us-east-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab</code>
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         To get the key ID and key ARN for a KMS key, use <a>ListKeys</a> or <a>DescribeKey</a>.
     */

    public String getKeyId() {
        return this.keyId;
    }

    /**
     * <p>
     * Identifies a symmetric encryption KMS key. You cannot enable automatic rotation of <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/symmetric-asymmetric.html">asymmetric KMS keys</a>,
     * <a href="https://docs.aws.amazon.com/kms/latest/developerguide/hmac.html">HMAC KMS keys</a>, KMS keys with <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/importing-keys.html">imported key material</a>, or
     * KMS keys in a <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/custom-key-store-overview.html">custom key store</a>.
     * To enable or disable automatic rotation of a set of related <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/multi-region-keys-manage.html#multi-region-rotate"
     * >multi-Region keys</a>, set the property on the primary key.
     * </p>
     * <p>
     * Specify the key ID or key ARN of the KMS key.
     * </p>
     * <p>
     * For example:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Key ID: <code>1234abcd-12ab-34cd-56ef-1234567890ab</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Key ARN: <code>arn:aws:kms:us-east-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * To get the key ID and key ARN for a KMS key, use <a>ListKeys</a> or <a>DescribeKey</a>.
     * </p>
     * 
     * @param keyId
     *        Identifies a symmetric encryption KMS key. You cannot enable automatic rotation of <a
     *        href="https://docs.aws.amazon.com/kms/latest/developerguide/symmetric-asymmetric.html">asymmetric KMS
     *        keys</a>, <a href="https://docs.aws.amazon.com/kms/latest/developerguide/hmac.html">HMAC KMS keys</a>, KMS
     *        keys with <a href="https://docs.aws.amazon.com/kms/latest/developerguide/importing-keys.html">imported key
     *        material</a>, or KMS keys in a <a
     *        href="https://docs.aws.amazon.com/kms/latest/developerguide/custom-key-store-overview.html">custom key
     *        store</a>. To enable or disable automatic rotation of a set of related <a href=
     *        "https://docs.aws.amazon.com/kms/latest/developerguide/multi-region-keys-manage.html#multi-region-rotate"
     *        >multi-Region keys</a>, set the property on the primary key.</p>
     *        <p>
     *        Specify the key ID or key ARN of the KMS key.
     *        </p>
     *        <p>
     *        For example:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Key ID: <code>1234abcd-12ab-34cd-56ef-1234567890ab</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Key ARN: <code>arn:aws:kms:us-east-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab</code>
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        To get the key ID and key ARN for a KMS key, use <a>ListKeys</a> or <a>DescribeKey</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EnableKeyRotationRequest withKeyId(String keyId) {
        setKeyId(keyId);
        return this;
    }

    /**
     * <p>
     * Use this parameter to specify a custom period of time between each rotation date. If no value is specified, the
     * default value is 365 days.
     * </p>
     * <p>
     * The rotation period defines the number of days after you enable automatic key rotation that KMS will rotate your
     * key material, and the number of days between each automatic rotation thereafter.
     * </p>
     * <p>
     * You can use the <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/conditions-kms.html#conditions-kms-rotation-period-in-days"
     * > <code>kms:RotationPeriodInDays</code> </a> condition key to further constrain the values that principals can
     * specify in the <code>RotationPeriodInDays</code> parameter.
     * </p>
     * <p>
     * </p>
     * 
     * @param rotationPeriodInDays
     *        Use this parameter to specify a custom period of time between each rotation date. If no value is
     *        specified, the default value is 365 days.</p>
     *        <p>
     *        The rotation period defines the number of days after you enable automatic key rotation that KMS will
     *        rotate your key material, and the number of days between each automatic rotation thereafter.
     *        </p>
     *        <p>
     *        You can use the <a href=
     *        "https://docs.aws.amazon.com/kms/latest/developerguide/conditions-kms.html#conditions-kms-rotation-period-in-days"
     *        > <code>kms:RotationPeriodInDays</code> </a> condition key to further constrain the values that principals
     *        can specify in the <code>RotationPeriodInDays</code> parameter.
     *        </p>
     *        <p>
     */

    public void setRotationPeriodInDays(Integer rotationPeriodInDays) {
        this.rotationPeriodInDays = rotationPeriodInDays;
    }

    /**
     * <p>
     * Use this parameter to specify a custom period of time between each rotation date. If no value is specified, the
     * default value is 365 days.
     * </p>
     * <p>
     * The rotation period defines the number of days after you enable automatic key rotation that KMS will rotate your
     * key material, and the number of days between each automatic rotation thereafter.
     * </p>
     * <p>
     * You can use the <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/conditions-kms.html#conditions-kms-rotation-period-in-days"
     * > <code>kms:RotationPeriodInDays</code> </a> condition key to further constrain the values that principals can
     * specify in the <code>RotationPeriodInDays</code> parameter.
     * </p>
     * <p>
     * </p>
     * 
     * @return Use this parameter to specify a custom period of time between each rotation date. If no value is
     *         specified, the default value is 365 days.</p>
     *         <p>
     *         The rotation period defines the number of days after you enable automatic key rotation that KMS will
     *         rotate your key material, and the number of days between each automatic rotation thereafter.
     *         </p>
     *         <p>
     *         You can use the <a href=
     *         "https://docs.aws.amazon.com/kms/latest/developerguide/conditions-kms.html#conditions-kms-rotation-period-in-days"
     *         > <code>kms:RotationPeriodInDays</code> </a> condition key to further constrain the values that
     *         principals can specify in the <code>RotationPeriodInDays</code> parameter.
     *         </p>
     *         <p>
     */

    public Integer getRotationPeriodInDays() {
        return this.rotationPeriodInDays;
    }

    /**
     * <p>
     * Use this parameter to specify a custom period of time between each rotation date. If no value is specified, the
     * default value is 365 days.
     * </p>
     * <p>
     * The rotation period defines the number of days after you enable automatic key rotation that KMS will rotate your
     * key material, and the number of days between each automatic rotation thereafter.
     * </p>
     * <p>
     * You can use the <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/conditions-kms.html#conditions-kms-rotation-period-in-days"
     * > <code>kms:RotationPeriodInDays</code> </a> condition key to further constrain the values that principals can
     * specify in the <code>RotationPeriodInDays</code> parameter.
     * </p>
     * <p>
     * </p>
     * 
     * @param rotationPeriodInDays
     *        Use this parameter to specify a custom period of time between each rotation date. If no value is
     *        specified, the default value is 365 days.</p>
     *        <p>
     *        The rotation period defines the number of days after you enable automatic key rotation that KMS will
     *        rotate your key material, and the number of days between each automatic rotation thereafter.
     *        </p>
     *        <p>
     *        You can use the <a href=
     *        "https://docs.aws.amazon.com/kms/latest/developerguide/conditions-kms.html#conditions-kms-rotation-period-in-days"
     *        > <code>kms:RotationPeriodInDays</code> </a> condition key to further constrain the values that principals
     *        can specify in the <code>RotationPeriodInDays</code> parameter.
     *        </p>
     *        <p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EnableKeyRotationRequest withRotationPeriodInDays(Integer rotationPeriodInDays) {
        setRotationPeriodInDays(rotationPeriodInDays);
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
        if (getRotationPeriodInDays() != null)
            sb.append("RotationPeriodInDays: ").append(getRotationPeriodInDays());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EnableKeyRotationRequest == false)
            return false;
        EnableKeyRotationRequest other = (EnableKeyRotationRequest) obj;
        if (other.getKeyId() == null ^ this.getKeyId() == null)
            return false;
        if (other.getKeyId() != null && other.getKeyId().equals(this.getKeyId()) == false)
            return false;
        if (other.getRotationPeriodInDays() == null ^ this.getRotationPeriodInDays() == null)
            return false;
        if (other.getRotationPeriodInDays() != null && other.getRotationPeriodInDays().equals(this.getRotationPeriodInDays()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getKeyId() == null) ? 0 : getKeyId().hashCode());
        hashCode = prime * hashCode + ((getRotationPeriodInDays() == null) ? 0 : getRotationPeriodInDays().hashCode());
        return hashCode;
    }

    @Override
    public EnableKeyRotationRequest clone() {
        return (EnableKeyRotationRequest) super.clone();
    }

}
