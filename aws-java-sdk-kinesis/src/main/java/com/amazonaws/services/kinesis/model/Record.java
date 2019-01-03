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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The unit of data of the Kinesis data stream, which is composed of a sequence number, a partition key, and a data
 * blob.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesis-2013-12-02/Record" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Record implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The unique identifier of the record within its shard.
     * </p>
     */
    private String sequenceNumber;
    /**
     * <p>
     * The approximate time that the record was inserted into the stream.
     * </p>
     */
    private java.util.Date approximateArrivalTimestamp;
    /**
     * <p>
     * The data blob. The data in the blob is both opaque and immutable to Kinesis Data Streams, which does not inspect,
     * interpret, or change the data in the blob in any way. When the data blob (the payload before base64-encoding) is
     * added to the partition key size, the total size must not exceed the maximum record size (1 MB).
     * </p>
     */
    private java.nio.ByteBuffer data;
    /**
     * <p>
     * Identifies which shard in the stream the data record is assigned to.
     * </p>
     */
    private String partitionKey;
    /**
     * <p>
     * The encryption type used on the record. This parameter can be one of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>NONE</code>: Do not encrypt the records in the stream.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>KMS</code>: Use server-side encryption on the records in the stream using a customer-managed AWS KMS key.
     * </p>
     * </li>
     * </ul>
     */
    private String encryptionType;

    /**
     * <p>
     * The unique identifier of the record within its shard.
     * </p>
     * 
     * @param sequenceNumber
     *        The unique identifier of the record within its shard.
     */

    public void setSequenceNumber(String sequenceNumber) {
        this.sequenceNumber = sequenceNumber;
    }

    /**
     * <p>
     * The unique identifier of the record within its shard.
     * </p>
     * 
     * @return The unique identifier of the record within its shard.
     */

    public String getSequenceNumber() {
        return this.sequenceNumber;
    }

    /**
     * <p>
     * The unique identifier of the record within its shard.
     * </p>
     * 
     * @param sequenceNumber
     *        The unique identifier of the record within its shard.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Record withSequenceNumber(String sequenceNumber) {
        setSequenceNumber(sequenceNumber);
        return this;
    }

    /**
     * <p>
     * The approximate time that the record was inserted into the stream.
     * </p>
     * 
     * @param approximateArrivalTimestamp
     *        The approximate time that the record was inserted into the stream.
     */

    public void setApproximateArrivalTimestamp(java.util.Date approximateArrivalTimestamp) {
        this.approximateArrivalTimestamp = approximateArrivalTimestamp;
    }

    /**
     * <p>
     * The approximate time that the record was inserted into the stream.
     * </p>
     * 
     * @return The approximate time that the record was inserted into the stream.
     */

    public java.util.Date getApproximateArrivalTimestamp() {
        return this.approximateArrivalTimestamp;
    }

    /**
     * <p>
     * The approximate time that the record was inserted into the stream.
     * </p>
     * 
     * @param approximateArrivalTimestamp
     *        The approximate time that the record was inserted into the stream.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Record withApproximateArrivalTimestamp(java.util.Date approximateArrivalTimestamp) {
        setApproximateArrivalTimestamp(approximateArrivalTimestamp);
        return this;
    }

    /**
     * <p>
     * The data blob. The data in the blob is both opaque and immutable to Kinesis Data Streams, which does not inspect,
     * interpret, or change the data in the blob in any way. When the data blob (the payload before base64-encoding) is
     * added to the partition key size, the total size must not exceed the maximum record size (1 MB).
     * </p>
     * <p>
     * The AWS SDK for Java performs a Base64 encoding on this field before sending this request to the AWS service.
     * Users of the SDK should not perform Base64 encoding on this field.
     * </p>
     * <p>
     * Warning: ByteBuffers returned by the SDK are mutable. Changes to the content or position of the byte buffer will
     * be seen by all objects that have a reference to this object. It is recommended to call ByteBuffer.duplicate() or
     * ByteBuffer.asReadOnlyBuffer() before using or reading from the buffer. This behavior will be changed in a future
     * major version of the SDK.
     * </p>
     * 
     * @param data
     *        The data blob. The data in the blob is both opaque and immutable to Kinesis Data Streams, which does not
     *        inspect, interpret, or change the data in the blob in any way. When the data blob (the payload before
     *        base64-encoding) is added to the partition key size, the total size must not exceed the maximum record
     *        size (1 MB).
     */

    public void setData(java.nio.ByteBuffer data) {
        this.data = data;
    }

    /**
     * <p>
     * The data blob. The data in the blob is both opaque and immutable to Kinesis Data Streams, which does not inspect,
     * interpret, or change the data in the blob in any way. When the data blob (the payload before base64-encoding) is
     * added to the partition key size, the total size must not exceed the maximum record size (1 MB).
     * </p>
     * <p>
     * {@code ByteBuffer}s are stateful. Calling their {@code get} methods changes their {@code position}. We recommend
     * using {@link java.nio.ByteBuffer#asReadOnlyBuffer()} to create a read-only view of the buffer with an independent
     * {@code position}, and calling {@code get} methods on this rather than directly on the returned {@code ByteBuffer}.
     * Doing so will ensure that anyone else using the {@code ByteBuffer} will not be affected by changes to the
     * {@code position}.
     * </p>
     * 
     * @return The data blob. The data in the blob is both opaque and immutable to Kinesis Data Streams, which does not
     *         inspect, interpret, or change the data in the blob in any way. When the data blob (the payload before
     *         base64-encoding) is added to the partition key size, the total size must not exceed the maximum record
     *         size (1 MB).
     */

    public java.nio.ByteBuffer getData() {
        return this.data;
    }

    /**
     * <p>
     * The data blob. The data in the blob is both opaque and immutable to Kinesis Data Streams, which does not inspect,
     * interpret, or change the data in the blob in any way. When the data blob (the payload before base64-encoding) is
     * added to the partition key size, the total size must not exceed the maximum record size (1 MB).
     * </p>
     * <p>
     * The AWS SDK for Java performs a Base64 encoding on this field before sending this request to the AWS service.
     * Users of the SDK should not perform Base64 encoding on this field.
     * </p>
     * <p>
     * Warning: ByteBuffers returned by the SDK are mutable. Changes to the content or position of the byte buffer will
     * be seen by all objects that have a reference to this object. It is recommended to call ByteBuffer.duplicate() or
     * ByteBuffer.asReadOnlyBuffer() before using or reading from the buffer. This behavior will be changed in a future
     * major version of the SDK.
     * </p>
     * 
     * @param data
     *        The data blob. The data in the blob is both opaque and immutable to Kinesis Data Streams, which does not
     *        inspect, interpret, or change the data in the blob in any way. When the data blob (the payload before
     *        base64-encoding) is added to the partition key size, the total size must not exceed the maximum record
     *        size (1 MB).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Record withData(java.nio.ByteBuffer data) {
        setData(data);
        return this;
    }

    /**
     * <p>
     * Identifies which shard in the stream the data record is assigned to.
     * </p>
     * 
     * @param partitionKey
     *        Identifies which shard in the stream the data record is assigned to.
     */

    public void setPartitionKey(String partitionKey) {
        this.partitionKey = partitionKey;
    }

    /**
     * <p>
     * Identifies which shard in the stream the data record is assigned to.
     * </p>
     * 
     * @return Identifies which shard in the stream the data record is assigned to.
     */

    public String getPartitionKey() {
        return this.partitionKey;
    }

    /**
     * <p>
     * Identifies which shard in the stream the data record is assigned to.
     * </p>
     * 
     * @param partitionKey
     *        Identifies which shard in the stream the data record is assigned to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Record withPartitionKey(String partitionKey) {
        setPartitionKey(partitionKey);
        return this;
    }

    /**
     * <p>
     * The encryption type used on the record. This parameter can be one of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>NONE</code>: Do not encrypt the records in the stream.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>KMS</code>: Use server-side encryption on the records in the stream using a customer-managed AWS KMS key.
     * </p>
     * </li>
     * </ul>
     * 
     * @param encryptionType
     *        The encryption type used on the record. This parameter can be one of the following values:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>NONE</code>: Do not encrypt the records in the stream.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>KMS</code>: Use server-side encryption on the records in the stream using a customer-managed AWS KMS
     *        key.
     *        </p>
     *        </li>
     * @see EncryptionType
     */

    public void setEncryptionType(String encryptionType) {
        this.encryptionType = encryptionType;
    }

    /**
     * <p>
     * The encryption type used on the record. This parameter can be one of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>NONE</code>: Do not encrypt the records in the stream.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>KMS</code>: Use server-side encryption on the records in the stream using a customer-managed AWS KMS key.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The encryption type used on the record. This parameter can be one of the following values:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>NONE</code>: Do not encrypt the records in the stream.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>KMS</code>: Use server-side encryption on the records in the stream using a customer-managed AWS
     *         KMS key.
     *         </p>
     *         </li>
     * @see EncryptionType
     */

    public String getEncryptionType() {
        return this.encryptionType;
    }

    /**
     * <p>
     * The encryption type used on the record. This parameter can be one of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>NONE</code>: Do not encrypt the records in the stream.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>KMS</code>: Use server-side encryption on the records in the stream using a customer-managed AWS KMS key.
     * </p>
     * </li>
     * </ul>
     * 
     * @param encryptionType
     *        The encryption type used on the record. This parameter can be one of the following values:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>NONE</code>: Do not encrypt the records in the stream.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>KMS</code>: Use server-side encryption on the records in the stream using a customer-managed AWS KMS
     *        key.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EncryptionType
     */

    public Record withEncryptionType(String encryptionType) {
        setEncryptionType(encryptionType);
        return this;
    }

    /**
     * <p>
     * The encryption type used on the record. This parameter can be one of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>NONE</code>: Do not encrypt the records in the stream.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>KMS</code>: Use server-side encryption on the records in the stream using a customer-managed AWS KMS key.
     * </p>
     * </li>
     * </ul>
     * 
     * @param encryptionType
     *        The encryption type used on the record. This parameter can be one of the following values:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>NONE</code>: Do not encrypt the records in the stream.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>KMS</code>: Use server-side encryption on the records in the stream using a customer-managed AWS KMS
     *        key.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EncryptionType
     */

    public Record withEncryptionType(EncryptionType encryptionType) {
        this.encryptionType = encryptionType.toString();
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
        if (getSequenceNumber() != null)
            sb.append("SequenceNumber: ").append(getSequenceNumber()).append(",");
        if (getApproximateArrivalTimestamp() != null)
            sb.append("ApproximateArrivalTimestamp: ").append(getApproximateArrivalTimestamp()).append(",");
        if (getData() != null)
            sb.append("Data: ").append(getData()).append(",");
        if (getPartitionKey() != null)
            sb.append("PartitionKey: ").append(getPartitionKey()).append(",");
        if (getEncryptionType() != null)
            sb.append("EncryptionType: ").append(getEncryptionType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Record == false)
            return false;
        Record other = (Record) obj;
        if (other.getSequenceNumber() == null ^ this.getSequenceNumber() == null)
            return false;
        if (other.getSequenceNumber() != null && other.getSequenceNumber().equals(this.getSequenceNumber()) == false)
            return false;
        if (other.getApproximateArrivalTimestamp() == null ^ this.getApproximateArrivalTimestamp() == null)
            return false;
        if (other.getApproximateArrivalTimestamp() != null && other.getApproximateArrivalTimestamp().equals(this.getApproximateArrivalTimestamp()) == false)
            return false;
        if (other.getData() == null ^ this.getData() == null)
            return false;
        if (other.getData() != null && other.getData().equals(this.getData()) == false)
            return false;
        if (other.getPartitionKey() == null ^ this.getPartitionKey() == null)
            return false;
        if (other.getPartitionKey() != null && other.getPartitionKey().equals(this.getPartitionKey()) == false)
            return false;
        if (other.getEncryptionType() == null ^ this.getEncryptionType() == null)
            return false;
        if (other.getEncryptionType() != null && other.getEncryptionType().equals(this.getEncryptionType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSequenceNumber() == null) ? 0 : getSequenceNumber().hashCode());
        hashCode = prime * hashCode + ((getApproximateArrivalTimestamp() == null) ? 0 : getApproximateArrivalTimestamp().hashCode());
        hashCode = prime * hashCode + ((getData() == null) ? 0 : getData().hashCode());
        hashCode = prime * hashCode + ((getPartitionKey() == null) ? 0 : getPartitionKey().hashCode());
        hashCode = prime * hashCode + ((getEncryptionType() == null) ? 0 : getEncryptionType().hashCode());
        return hashCode;
    }

    @Override
    public Record clone() {
        try {
            return (Record) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.kinesis.model.transform.RecordMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
