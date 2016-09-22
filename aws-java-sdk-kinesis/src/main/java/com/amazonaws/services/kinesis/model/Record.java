/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

/**
 * <p>
 * The unit of data of the Amazon Kinesis stream, which is composed of a sequence number, a partition key, and a data
 * blob.
 * </p>
 */
public class Record implements Serializable, Cloneable {

    /**
     * <p>
     * The unique identifier of the record in the stream.
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
     * The data blob. The data in the blob is both opaque and immutable to the Amazon Kinesis service, which does not
     * inspect, interpret, or change the data in the blob in any way. When the data blob (the payload before
     * base64-encoding) is added to the partition key size, the total size must not exceed the maximum record size (1
     * MB).
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
     * The unique identifier of the record in the stream.
     * </p>
     * 
     * @param sequenceNumber
     *        The unique identifier of the record in the stream.
     */

    public void setSequenceNumber(String sequenceNumber) {
        this.sequenceNumber = sequenceNumber;
    }

    /**
     * <p>
     * The unique identifier of the record in the stream.
     * </p>
     * 
     * @return The unique identifier of the record in the stream.
     */

    public String getSequenceNumber() {
        return this.sequenceNumber;
    }

    /**
     * <p>
     * The unique identifier of the record in the stream.
     * </p>
     * 
     * @param sequenceNumber
     *        The unique identifier of the record in the stream.
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
     * The data blob. The data in the blob is both opaque and immutable to the Amazon Kinesis service, which does not
     * inspect, interpret, or change the data in the blob in any way. When the data blob (the payload before
     * base64-encoding) is added to the partition key size, the total size must not exceed the maximum record size (1
     * MB).
     * </p>
     * <p>
     * AWS SDK for Java performs a Base64 encoding on this field before sending this request to AWS service by default.
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
     *        The data blob. The data in the blob is both opaque and immutable to the Amazon Kinesis service, which does
     *        not inspect, interpret, or change the data in the blob in any way. When the data blob (the payload before
     *        base64-encoding) is added to the partition key size, the total size must not exceed the maximum record
     *        size (1 MB).
     */

    public void setData(java.nio.ByteBuffer data) {
        this.data = data;
    }

    /**
     * <p>
     * The data blob. The data in the blob is both opaque and immutable to the Amazon Kinesis service, which does not
     * inspect, interpret, or change the data in the blob in any way. When the data blob (the payload before
     * base64-encoding) is added to the partition key size, the total size must not exceed the maximum record size (1
     * MB).
     * </p>
     * <p>
     * {@code ByteBuffer}s are stateful. Calling their {@code get} methods changes their {@code position}. We recommend
     * using {@link java.nio.ByteBuffer#asReadOnlyBuffer()} to create a read-only view of the buffer with an independent
     * {@code position}, and calling {@code get} methods on this rather than directly on the returned {@code ByteBuffer}.
     * Doing so will ensure that anyone else using the {@code ByteBuffer} will not be affected by changes to the
     * {@code position}.
     * </p>
     * 
     * @return The data blob. The data in the blob is both opaque and immutable to the Amazon Kinesis service, which
     *         does not inspect, interpret, or change the data in the blob in any way. When the data blob (the payload
     *         before base64-encoding) is added to the partition key size, the total size must not exceed the maximum
     *         record size (1 MB).
     */

    public java.nio.ByteBuffer getData() {
        return this.data;
    }

    /**
     * <p>
     * The data blob. The data in the blob is both opaque and immutable to the Amazon Kinesis service, which does not
     * inspect, interpret, or change the data in the blob in any way. When the data blob (the payload before
     * base64-encoding) is added to the partition key size, the total size must not exceed the maximum record size (1
     * MB).
     * </p>
     * 
     * @param data
     *        The data blob. The data in the blob is both opaque and immutable to the Amazon Kinesis service, which does
     *        not inspect, interpret, or change the data in the blob in any way. When the data blob (the payload before
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
     * Returns a string representation of this object; useful for testing and debugging.
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
            sb.append("SequenceNumber: " + getSequenceNumber() + ",");
        if (getApproximateArrivalTimestamp() != null)
            sb.append("ApproximateArrivalTimestamp: " + getApproximateArrivalTimestamp() + ",");
        if (getData() != null)
            sb.append("Data: " + getData() + ",");
        if (getPartitionKey() != null)
            sb.append("PartitionKey: " + getPartitionKey());
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
}
