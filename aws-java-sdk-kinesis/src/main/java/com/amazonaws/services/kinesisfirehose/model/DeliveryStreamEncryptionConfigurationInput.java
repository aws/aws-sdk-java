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
 * Used to specify the type and Amazon Resource Name (ARN) of the CMK needed for Server-Side Encryption (SSE).
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/firehose-2015-08-04/DeliveryStreamEncryptionConfigurationInput"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeliveryStreamEncryptionConfigurationInput implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * If you set <code>KeyType</code> to <code>CUSTOMER_MANAGED_CMK</code>, you must specify the Amazon Resource Name
     * (ARN) of the CMK. If you set <code>KeyType</code> to <code>AWS_OWNED_CMK</code>, Kinesis Data Firehose uses a
     * service-account CMK.
     * </p>
     */
    private String keyARN;
    /**
     * <p>
     * Indicates the type of customer master key (CMK) to use for encryption. The default setting is
     * <code>AWS_OWNED_CMK</code>. For more information about CMKs, see <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#master_keys">Customer Master Keys
     * (CMKs)</a>. When you invoke <a>CreateDeliveryStream</a> or <a>StartDeliveryStreamEncryption</a> with
     * <code>KeyType</code> set to CUSTOMER_MANAGED_CMK, Kinesis Data Firehose invokes the Amazon KMS operation <a
     * href="https://docs.aws.amazon.com/kms/latest/APIReference/API_CreateGrant.html">CreateGrant</a> to create a grant
     * that allows the Kinesis Data Firehose service to use the customer managed CMK to perform encryption and
     * decryption. Kinesis Data Firehose manages that grant.
     * </p>
     * <p>
     * When you invoke <a>StartDeliveryStreamEncryption</a> to change the CMK for a delivery stream that is already
     * encrypted with a customer managed CMK, Kinesis Data Firehose schedules the grant it had on the old CMK for
     * retirement.
     * </p>
     */
    private String keyType;

    /**
     * <p>
     * If you set <code>KeyType</code> to <code>CUSTOMER_MANAGED_CMK</code>, you must specify the Amazon Resource Name
     * (ARN) of the CMK. If you set <code>KeyType</code> to <code>AWS_OWNED_CMK</code>, Kinesis Data Firehose uses a
     * service-account CMK.
     * </p>
     * 
     * @param keyARN
     *        If you set <code>KeyType</code> to <code>CUSTOMER_MANAGED_CMK</code>, you must specify the Amazon Resource
     *        Name (ARN) of the CMK. If you set <code>KeyType</code> to <code>AWS_OWNED_CMK</code>, Kinesis Data
     *        Firehose uses a service-account CMK.
     */

    public void setKeyARN(String keyARN) {
        this.keyARN = keyARN;
    }

    /**
     * <p>
     * If you set <code>KeyType</code> to <code>CUSTOMER_MANAGED_CMK</code>, you must specify the Amazon Resource Name
     * (ARN) of the CMK. If you set <code>KeyType</code> to <code>AWS_OWNED_CMK</code>, Kinesis Data Firehose uses a
     * service-account CMK.
     * </p>
     * 
     * @return If you set <code>KeyType</code> to <code>CUSTOMER_MANAGED_CMK</code>, you must specify the Amazon
     *         Resource Name (ARN) of the CMK. If you set <code>KeyType</code> to <code>AWS_OWNED_CMK</code>, Kinesis
     *         Data Firehose uses a service-account CMK.
     */

    public String getKeyARN() {
        return this.keyARN;
    }

    /**
     * <p>
     * If you set <code>KeyType</code> to <code>CUSTOMER_MANAGED_CMK</code>, you must specify the Amazon Resource Name
     * (ARN) of the CMK. If you set <code>KeyType</code> to <code>AWS_OWNED_CMK</code>, Kinesis Data Firehose uses a
     * service-account CMK.
     * </p>
     * 
     * @param keyARN
     *        If you set <code>KeyType</code> to <code>CUSTOMER_MANAGED_CMK</code>, you must specify the Amazon Resource
     *        Name (ARN) of the CMK. If you set <code>KeyType</code> to <code>AWS_OWNED_CMK</code>, Kinesis Data
     *        Firehose uses a service-account CMK.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeliveryStreamEncryptionConfigurationInput withKeyARN(String keyARN) {
        setKeyARN(keyARN);
        return this;
    }

    /**
     * <p>
     * Indicates the type of customer master key (CMK) to use for encryption. The default setting is
     * <code>AWS_OWNED_CMK</code>. For more information about CMKs, see <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#master_keys">Customer Master Keys
     * (CMKs)</a>. When you invoke <a>CreateDeliveryStream</a> or <a>StartDeliveryStreamEncryption</a> with
     * <code>KeyType</code> set to CUSTOMER_MANAGED_CMK, Kinesis Data Firehose invokes the Amazon KMS operation <a
     * href="https://docs.aws.amazon.com/kms/latest/APIReference/API_CreateGrant.html">CreateGrant</a> to create a grant
     * that allows the Kinesis Data Firehose service to use the customer managed CMK to perform encryption and
     * decryption. Kinesis Data Firehose manages that grant.
     * </p>
     * <p>
     * When you invoke <a>StartDeliveryStreamEncryption</a> to change the CMK for a delivery stream that is already
     * encrypted with a customer managed CMK, Kinesis Data Firehose schedules the grant it had on the old CMK for
     * retirement.
     * </p>
     * 
     * @param keyType
     *        Indicates the type of customer master key (CMK) to use for encryption. The default setting is
     *        <code>AWS_OWNED_CMK</code>. For more information about CMKs, see <a
     *        href="https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#master_keys">Customer Master
     *        Keys (CMKs)</a>. When you invoke <a>CreateDeliveryStream</a> or <a>StartDeliveryStreamEncryption</a> with
     *        <code>KeyType</code> set to CUSTOMER_MANAGED_CMK, Kinesis Data Firehose invokes the Amazon KMS operation
     *        <a href="https://docs.aws.amazon.com/kms/latest/APIReference/API_CreateGrant.html">CreateGrant</a> to
     *        create a grant that allows the Kinesis Data Firehose service to use the customer managed CMK to perform
     *        encryption and decryption. Kinesis Data Firehose manages that grant. </p>
     *        <p>
     *        When you invoke <a>StartDeliveryStreamEncryption</a> to change the CMK for a delivery stream that is
     *        already encrypted with a customer managed CMK, Kinesis Data Firehose schedules the grant it had on the old
     *        CMK for retirement.
     * @see KeyType
     */

    public void setKeyType(String keyType) {
        this.keyType = keyType;
    }

    /**
     * <p>
     * Indicates the type of customer master key (CMK) to use for encryption. The default setting is
     * <code>AWS_OWNED_CMK</code>. For more information about CMKs, see <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#master_keys">Customer Master Keys
     * (CMKs)</a>. When you invoke <a>CreateDeliveryStream</a> or <a>StartDeliveryStreamEncryption</a> with
     * <code>KeyType</code> set to CUSTOMER_MANAGED_CMK, Kinesis Data Firehose invokes the Amazon KMS operation <a
     * href="https://docs.aws.amazon.com/kms/latest/APIReference/API_CreateGrant.html">CreateGrant</a> to create a grant
     * that allows the Kinesis Data Firehose service to use the customer managed CMK to perform encryption and
     * decryption. Kinesis Data Firehose manages that grant.
     * </p>
     * <p>
     * When you invoke <a>StartDeliveryStreamEncryption</a> to change the CMK for a delivery stream that is already
     * encrypted with a customer managed CMK, Kinesis Data Firehose schedules the grant it had on the old CMK for
     * retirement.
     * </p>
     * 
     * @return Indicates the type of customer master key (CMK) to use for encryption. The default setting is
     *         <code>AWS_OWNED_CMK</code>. For more information about CMKs, see <a
     *         href="https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#master_keys">Customer Master
     *         Keys (CMKs)</a>. When you invoke <a>CreateDeliveryStream</a> or <a>StartDeliveryStreamEncryption</a> with
     *         <code>KeyType</code> set to CUSTOMER_MANAGED_CMK, Kinesis Data Firehose invokes the Amazon KMS operation
     *         <a href="https://docs.aws.amazon.com/kms/latest/APIReference/API_CreateGrant.html">CreateGrant</a> to
     *         create a grant that allows the Kinesis Data Firehose service to use the customer managed CMK to perform
     *         encryption and decryption. Kinesis Data Firehose manages that grant. </p>
     *         <p>
     *         When you invoke <a>StartDeliveryStreamEncryption</a> to change the CMK for a delivery stream that is
     *         already encrypted with a customer managed CMK, Kinesis Data Firehose schedules the grant it had on the
     *         old CMK for retirement.
     * @see KeyType
     */

    public String getKeyType() {
        return this.keyType;
    }

    /**
     * <p>
     * Indicates the type of customer master key (CMK) to use for encryption. The default setting is
     * <code>AWS_OWNED_CMK</code>. For more information about CMKs, see <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#master_keys">Customer Master Keys
     * (CMKs)</a>. When you invoke <a>CreateDeliveryStream</a> or <a>StartDeliveryStreamEncryption</a> with
     * <code>KeyType</code> set to CUSTOMER_MANAGED_CMK, Kinesis Data Firehose invokes the Amazon KMS operation <a
     * href="https://docs.aws.amazon.com/kms/latest/APIReference/API_CreateGrant.html">CreateGrant</a> to create a grant
     * that allows the Kinesis Data Firehose service to use the customer managed CMK to perform encryption and
     * decryption. Kinesis Data Firehose manages that grant.
     * </p>
     * <p>
     * When you invoke <a>StartDeliveryStreamEncryption</a> to change the CMK for a delivery stream that is already
     * encrypted with a customer managed CMK, Kinesis Data Firehose schedules the grant it had on the old CMK for
     * retirement.
     * </p>
     * 
     * @param keyType
     *        Indicates the type of customer master key (CMK) to use for encryption. The default setting is
     *        <code>AWS_OWNED_CMK</code>. For more information about CMKs, see <a
     *        href="https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#master_keys">Customer Master
     *        Keys (CMKs)</a>. When you invoke <a>CreateDeliveryStream</a> or <a>StartDeliveryStreamEncryption</a> with
     *        <code>KeyType</code> set to CUSTOMER_MANAGED_CMK, Kinesis Data Firehose invokes the Amazon KMS operation
     *        <a href="https://docs.aws.amazon.com/kms/latest/APIReference/API_CreateGrant.html">CreateGrant</a> to
     *        create a grant that allows the Kinesis Data Firehose service to use the customer managed CMK to perform
     *        encryption and decryption. Kinesis Data Firehose manages that grant. </p>
     *        <p>
     *        When you invoke <a>StartDeliveryStreamEncryption</a> to change the CMK for a delivery stream that is
     *        already encrypted with a customer managed CMK, Kinesis Data Firehose schedules the grant it had on the old
     *        CMK for retirement.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see KeyType
     */

    public DeliveryStreamEncryptionConfigurationInput withKeyType(String keyType) {
        setKeyType(keyType);
        return this;
    }

    /**
     * <p>
     * Indicates the type of customer master key (CMK) to use for encryption. The default setting is
     * <code>AWS_OWNED_CMK</code>. For more information about CMKs, see <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#master_keys">Customer Master Keys
     * (CMKs)</a>. When you invoke <a>CreateDeliveryStream</a> or <a>StartDeliveryStreamEncryption</a> with
     * <code>KeyType</code> set to CUSTOMER_MANAGED_CMK, Kinesis Data Firehose invokes the Amazon KMS operation <a
     * href="https://docs.aws.amazon.com/kms/latest/APIReference/API_CreateGrant.html">CreateGrant</a> to create a grant
     * that allows the Kinesis Data Firehose service to use the customer managed CMK to perform encryption and
     * decryption. Kinesis Data Firehose manages that grant.
     * </p>
     * <p>
     * When you invoke <a>StartDeliveryStreamEncryption</a> to change the CMK for a delivery stream that is already
     * encrypted with a customer managed CMK, Kinesis Data Firehose schedules the grant it had on the old CMK for
     * retirement.
     * </p>
     * 
     * @param keyType
     *        Indicates the type of customer master key (CMK) to use for encryption. The default setting is
     *        <code>AWS_OWNED_CMK</code>. For more information about CMKs, see <a
     *        href="https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#master_keys">Customer Master
     *        Keys (CMKs)</a>. When you invoke <a>CreateDeliveryStream</a> or <a>StartDeliveryStreamEncryption</a> with
     *        <code>KeyType</code> set to CUSTOMER_MANAGED_CMK, Kinesis Data Firehose invokes the Amazon KMS operation
     *        <a href="https://docs.aws.amazon.com/kms/latest/APIReference/API_CreateGrant.html">CreateGrant</a> to
     *        create a grant that allows the Kinesis Data Firehose service to use the customer managed CMK to perform
     *        encryption and decryption. Kinesis Data Firehose manages that grant. </p>
     *        <p>
     *        When you invoke <a>StartDeliveryStreamEncryption</a> to change the CMK for a delivery stream that is
     *        already encrypted with a customer managed CMK, Kinesis Data Firehose schedules the grant it had on the old
     *        CMK for retirement.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see KeyType
     */

    public DeliveryStreamEncryptionConfigurationInput withKeyType(KeyType keyType) {
        this.keyType = keyType.toString();
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
            sb.append("KeyType: ").append(getKeyType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeliveryStreamEncryptionConfigurationInput == false)
            return false;
        DeliveryStreamEncryptionConfigurationInput other = (DeliveryStreamEncryptionConfigurationInput) obj;
        if (other.getKeyARN() == null ^ this.getKeyARN() == null)
            return false;
        if (other.getKeyARN() != null && other.getKeyARN().equals(this.getKeyARN()) == false)
            return false;
        if (other.getKeyType() == null ^ this.getKeyType() == null)
            return false;
        if (other.getKeyType() != null && other.getKeyType().equals(this.getKeyType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getKeyARN() == null) ? 0 : getKeyARN().hashCode());
        hashCode = prime * hashCode + ((getKeyType() == null) ? 0 : getKeyType().hashCode());
        return hashCode;
    }

    @Override
    public DeliveryStreamEncryptionConfigurationInput clone() {
        try {
            return (DeliveryStreamEncryptionConfigurationInput) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.kinesisfirehose.model.transform.DeliveryStreamEncryptionConfigurationInputMarshaller.getInstance().marshall(this,
                protocolMarshaller);
    }
}
