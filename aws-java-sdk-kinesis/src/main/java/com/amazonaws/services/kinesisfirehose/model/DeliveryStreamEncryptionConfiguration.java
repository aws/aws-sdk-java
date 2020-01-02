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
package com.amazonaws.services.kinesisfirehose.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains information about the server-side encryption (SSE) status for the delivery stream, the type customer master
 * key (CMK) in use, if any, and the ARN of the CMK. You can get <code>DeliveryStreamEncryptionConfiguration</code> by
 * invoking the <a>DescribeDeliveryStream</a> operation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/firehose-2015-08-04/DeliveryStreamEncryptionConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeliveryStreamEncryptionConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * If <code>KeyType</code> is <code>CUSTOMER_MANAGED_CMK</code>, this field contains the ARN of the customer managed
     * CMK. If <code>KeyType</code> is <code>AWS_OWNED_CMK</code>, <code>DeliveryStreamEncryptionConfiguration</code>
     * doesn't contain a value for <code>KeyARN</code>.
     * </p>
     */
    private String keyARN;
    /**
     * <p>
     * Indicates the type of customer master key (CMK) that is used for encryption. The default setting is
     * <code>AWS_OWNED_CMK</code>. For more information about CMKs, see <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#master_keys">Customer Master Keys
     * (CMKs)</a>.
     * </p>
     */
    private String keyType;
    /**
     * <p>
     * This is the server-side encryption (SSE) status for the delivery stream. For a full description of the different
     * values of this status, see <a>StartDeliveryStreamEncryption</a> and <a>StopDeliveryStreamEncryption</a>. If this
     * status is <code>ENABLING_FAILED</code> or <code>DISABLING_FAILED</code>, it is the status of the most recent
     * attempt to enable or disable SSE, respectively.
     * </p>
     */
    private String status;
    /**
     * <p>
     * Provides details in case one of the following operations fails due to an error related to KMS:
     * <a>CreateDeliveryStream</a>, <a>DeleteDeliveryStream</a>, <a>StartDeliveryStreamEncryption</a>,
     * <a>StopDeliveryStreamEncryption</a>.
     * </p>
     */
    private FailureDescription failureDescription;

    /**
     * <p>
     * If <code>KeyType</code> is <code>CUSTOMER_MANAGED_CMK</code>, this field contains the ARN of the customer managed
     * CMK. If <code>KeyType</code> is <code>AWS_OWNED_CMK</code>, <code>DeliveryStreamEncryptionConfiguration</code>
     * doesn't contain a value for <code>KeyARN</code>.
     * </p>
     * 
     * @param keyARN
     *        If <code>KeyType</code> is <code>CUSTOMER_MANAGED_CMK</code>, this field contains the ARN of the customer
     *        managed CMK. If <code>KeyType</code> is <code>AWS_OWNED_CMK</code>,
     *        <code>DeliveryStreamEncryptionConfiguration</code> doesn't contain a value for <code>KeyARN</code>.
     */

    public void setKeyARN(String keyARN) {
        this.keyARN = keyARN;
    }

    /**
     * <p>
     * If <code>KeyType</code> is <code>CUSTOMER_MANAGED_CMK</code>, this field contains the ARN of the customer managed
     * CMK. If <code>KeyType</code> is <code>AWS_OWNED_CMK</code>, <code>DeliveryStreamEncryptionConfiguration</code>
     * doesn't contain a value for <code>KeyARN</code>.
     * </p>
     * 
     * @return If <code>KeyType</code> is <code>CUSTOMER_MANAGED_CMK</code>, this field contains the ARN of the customer
     *         managed CMK. If <code>KeyType</code> is <code>AWS_OWNED_CMK</code>,
     *         <code>DeliveryStreamEncryptionConfiguration</code> doesn't contain a value for <code>KeyARN</code>.
     */

    public String getKeyARN() {
        return this.keyARN;
    }

    /**
     * <p>
     * If <code>KeyType</code> is <code>CUSTOMER_MANAGED_CMK</code>, this field contains the ARN of the customer managed
     * CMK. If <code>KeyType</code> is <code>AWS_OWNED_CMK</code>, <code>DeliveryStreamEncryptionConfiguration</code>
     * doesn't contain a value for <code>KeyARN</code>.
     * </p>
     * 
     * @param keyARN
     *        If <code>KeyType</code> is <code>CUSTOMER_MANAGED_CMK</code>, this field contains the ARN of the customer
     *        managed CMK. If <code>KeyType</code> is <code>AWS_OWNED_CMK</code>,
     *        <code>DeliveryStreamEncryptionConfiguration</code> doesn't contain a value for <code>KeyARN</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeliveryStreamEncryptionConfiguration withKeyARN(String keyARN) {
        setKeyARN(keyARN);
        return this;
    }

    /**
     * <p>
     * Indicates the type of customer master key (CMK) that is used for encryption. The default setting is
     * <code>AWS_OWNED_CMK</code>. For more information about CMKs, see <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#master_keys">Customer Master Keys
     * (CMKs)</a>.
     * </p>
     * 
     * @param keyType
     *        Indicates the type of customer master key (CMK) that is used for encryption. The default setting is
     *        <code>AWS_OWNED_CMK</code>. For more information about CMKs, see <a
     *        href="https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#master_keys">Customer Master
     *        Keys (CMKs)</a>.
     * @see KeyType
     */

    public void setKeyType(String keyType) {
        this.keyType = keyType;
    }

    /**
     * <p>
     * Indicates the type of customer master key (CMK) that is used for encryption. The default setting is
     * <code>AWS_OWNED_CMK</code>. For more information about CMKs, see <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#master_keys">Customer Master Keys
     * (CMKs)</a>.
     * </p>
     * 
     * @return Indicates the type of customer master key (CMK) that is used for encryption. The default setting is
     *         <code>AWS_OWNED_CMK</code>. For more information about CMKs, see <a
     *         href="https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#master_keys">Customer Master
     *         Keys (CMKs)</a>.
     * @see KeyType
     */

    public String getKeyType() {
        return this.keyType;
    }

    /**
     * <p>
     * Indicates the type of customer master key (CMK) that is used for encryption. The default setting is
     * <code>AWS_OWNED_CMK</code>. For more information about CMKs, see <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#master_keys">Customer Master Keys
     * (CMKs)</a>.
     * </p>
     * 
     * @param keyType
     *        Indicates the type of customer master key (CMK) that is used for encryption. The default setting is
     *        <code>AWS_OWNED_CMK</code>. For more information about CMKs, see <a
     *        href="https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#master_keys">Customer Master
     *        Keys (CMKs)</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see KeyType
     */

    public DeliveryStreamEncryptionConfiguration withKeyType(String keyType) {
        setKeyType(keyType);
        return this;
    }

    /**
     * <p>
     * Indicates the type of customer master key (CMK) that is used for encryption. The default setting is
     * <code>AWS_OWNED_CMK</code>. For more information about CMKs, see <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#master_keys">Customer Master Keys
     * (CMKs)</a>.
     * </p>
     * 
     * @param keyType
     *        Indicates the type of customer master key (CMK) that is used for encryption. The default setting is
     *        <code>AWS_OWNED_CMK</code>. For more information about CMKs, see <a
     *        href="https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#master_keys">Customer Master
     *        Keys (CMKs)</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see KeyType
     */

    public DeliveryStreamEncryptionConfiguration withKeyType(KeyType keyType) {
        this.keyType = keyType.toString();
        return this;
    }

    /**
     * <p>
     * This is the server-side encryption (SSE) status for the delivery stream. For a full description of the different
     * values of this status, see <a>StartDeliveryStreamEncryption</a> and <a>StopDeliveryStreamEncryption</a>. If this
     * status is <code>ENABLING_FAILED</code> or <code>DISABLING_FAILED</code>, it is the status of the most recent
     * attempt to enable or disable SSE, respectively.
     * </p>
     * 
     * @param status
     *        This is the server-side encryption (SSE) status for the delivery stream. For a full description of the
     *        different values of this status, see <a>StartDeliveryStreamEncryption</a> and
     *        <a>StopDeliveryStreamEncryption</a>. If this status is <code>ENABLING_FAILED</code> or
     *        <code>DISABLING_FAILED</code>, it is the status of the most recent attempt to enable or disable SSE,
     *        respectively.
     * @see DeliveryStreamEncryptionStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * This is the server-side encryption (SSE) status for the delivery stream. For a full description of the different
     * values of this status, see <a>StartDeliveryStreamEncryption</a> and <a>StopDeliveryStreamEncryption</a>. If this
     * status is <code>ENABLING_FAILED</code> or <code>DISABLING_FAILED</code>, it is the status of the most recent
     * attempt to enable or disable SSE, respectively.
     * </p>
     * 
     * @return This is the server-side encryption (SSE) status for the delivery stream. For a full description of the
     *         different values of this status, see <a>StartDeliveryStreamEncryption</a> and
     *         <a>StopDeliveryStreamEncryption</a>. If this status is <code>ENABLING_FAILED</code> or
     *         <code>DISABLING_FAILED</code>, it is the status of the most recent attempt to enable or disable SSE,
     *         respectively.
     * @see DeliveryStreamEncryptionStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * This is the server-side encryption (SSE) status for the delivery stream. For a full description of the different
     * values of this status, see <a>StartDeliveryStreamEncryption</a> and <a>StopDeliveryStreamEncryption</a>. If this
     * status is <code>ENABLING_FAILED</code> or <code>DISABLING_FAILED</code>, it is the status of the most recent
     * attempt to enable or disable SSE, respectively.
     * </p>
     * 
     * @param status
     *        This is the server-side encryption (SSE) status for the delivery stream. For a full description of the
     *        different values of this status, see <a>StartDeliveryStreamEncryption</a> and
     *        <a>StopDeliveryStreamEncryption</a>. If this status is <code>ENABLING_FAILED</code> or
     *        <code>DISABLING_FAILED</code>, it is the status of the most recent attempt to enable or disable SSE,
     *        respectively.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DeliveryStreamEncryptionStatus
     */

    public DeliveryStreamEncryptionConfiguration withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * This is the server-side encryption (SSE) status for the delivery stream. For a full description of the different
     * values of this status, see <a>StartDeliveryStreamEncryption</a> and <a>StopDeliveryStreamEncryption</a>. If this
     * status is <code>ENABLING_FAILED</code> or <code>DISABLING_FAILED</code>, it is the status of the most recent
     * attempt to enable or disable SSE, respectively.
     * </p>
     * 
     * @param status
     *        This is the server-side encryption (SSE) status for the delivery stream. For a full description of the
     *        different values of this status, see <a>StartDeliveryStreamEncryption</a> and
     *        <a>StopDeliveryStreamEncryption</a>. If this status is <code>ENABLING_FAILED</code> or
     *        <code>DISABLING_FAILED</code>, it is the status of the most recent attempt to enable or disable SSE,
     *        respectively.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DeliveryStreamEncryptionStatus
     */

    public DeliveryStreamEncryptionConfiguration withStatus(DeliveryStreamEncryptionStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * Provides details in case one of the following operations fails due to an error related to KMS:
     * <a>CreateDeliveryStream</a>, <a>DeleteDeliveryStream</a>, <a>StartDeliveryStreamEncryption</a>,
     * <a>StopDeliveryStreamEncryption</a>.
     * </p>
     * 
     * @param failureDescription
     *        Provides details in case one of the following operations fails due to an error related to KMS:
     *        <a>CreateDeliveryStream</a>, <a>DeleteDeliveryStream</a>, <a>StartDeliveryStreamEncryption</a>,
     *        <a>StopDeliveryStreamEncryption</a>.
     */

    public void setFailureDescription(FailureDescription failureDescription) {
        this.failureDescription = failureDescription;
    }

    /**
     * <p>
     * Provides details in case one of the following operations fails due to an error related to KMS:
     * <a>CreateDeliveryStream</a>, <a>DeleteDeliveryStream</a>, <a>StartDeliveryStreamEncryption</a>,
     * <a>StopDeliveryStreamEncryption</a>.
     * </p>
     * 
     * @return Provides details in case one of the following operations fails due to an error related to KMS:
     *         <a>CreateDeliveryStream</a>, <a>DeleteDeliveryStream</a>, <a>StartDeliveryStreamEncryption</a>,
     *         <a>StopDeliveryStreamEncryption</a>.
     */

    public FailureDescription getFailureDescription() {
        return this.failureDescription;
    }

    /**
     * <p>
     * Provides details in case one of the following operations fails due to an error related to KMS:
     * <a>CreateDeliveryStream</a>, <a>DeleteDeliveryStream</a>, <a>StartDeliveryStreamEncryption</a>,
     * <a>StopDeliveryStreamEncryption</a>.
     * </p>
     * 
     * @param failureDescription
     *        Provides details in case one of the following operations fails due to an error related to KMS:
     *        <a>CreateDeliveryStream</a>, <a>DeleteDeliveryStream</a>, <a>StartDeliveryStreamEncryption</a>,
     *        <a>StopDeliveryStreamEncryption</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeliveryStreamEncryptionConfiguration withFailureDescription(FailureDescription failureDescription) {
        setFailureDescription(failureDescription);
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
        if (getKeyARN() != null)
            sb.append("KeyARN: ").append(getKeyARN()).append(",");
        if (getKeyType() != null)
            sb.append("KeyType: ").append(getKeyType()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getFailureDescription() != null)
            sb.append("FailureDescription: ").append(getFailureDescription());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeliveryStreamEncryptionConfiguration == false)
            return false;
        DeliveryStreamEncryptionConfiguration other = (DeliveryStreamEncryptionConfiguration) obj;
        if (other.getKeyARN() == null ^ this.getKeyARN() == null)
            return false;
        if (other.getKeyARN() != null && other.getKeyARN().equals(this.getKeyARN()) == false)
            return false;
        if (other.getKeyType() == null ^ this.getKeyType() == null)
            return false;
        if (other.getKeyType() != null && other.getKeyType().equals(this.getKeyType()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getFailureDescription() == null ^ this.getFailureDescription() == null)
            return false;
        if (other.getFailureDescription() != null && other.getFailureDescription().equals(this.getFailureDescription()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getKeyARN() == null) ? 0 : getKeyARN().hashCode());
        hashCode = prime * hashCode + ((getKeyType() == null) ? 0 : getKeyType().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getFailureDescription() == null) ? 0 : getFailureDescription().hashCode());
        return hashCode;
    }

    @Override
    public DeliveryStreamEncryptionConfiguration clone() {
        try {
            return (DeliveryStreamEncryptionConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.kinesisfirehose.model.transform.DeliveryStreamEncryptionConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
