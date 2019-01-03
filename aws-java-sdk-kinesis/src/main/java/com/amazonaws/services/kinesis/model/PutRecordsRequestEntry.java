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
 * Represents the output for <code>PutRecords</code>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesis-2013-12-02/PutRecordsRequestEntry" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PutRecordsRequestEntry implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The data blob to put into the record, which is base64-encoded when the blob is serialized. When the data blob
     * (the payload before base64-encoding) is added to the partition key size, the total size must not exceed the
     * maximum record size (1 MB).
     * </p>
     */
    private java.nio.ByteBuffer data;
    /**
     * <p>
     * The hash value used to determine explicitly the shard that the data record is assigned to by overriding the
     * partition key hash.
     * </p>
     */
    private String explicitHashKey;
    /**
     * <p>
     * Determines which shard in the stream the data record is assigned to. Partition keys are Unicode strings with a
     * maximum length limit of 256 characters for each key. Amazon Kinesis Data Streams uses the partition key as input
     * to a hash function that maps the partition key and associated data to a specific shard. Specifically, an MD5 hash
     * function is used to map partition keys to 128-bit integer values and to map associated data records to shards. As
     * a result of this hashing mechanism, all data records with the same partition key map to the same shard within the
     * stream.
     * </p>
     */
    private String partitionKey;

    /**
     * <p>
     * The data blob to put into the record, which is base64-encoded when the blob is serialized. When the data blob
     * (the payload before base64-encoding) is added to the partition key size, the total size must not exceed the
     * maximum record size (1 MB).
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
     *        The data blob to put into the record, which is base64-encoded when the blob is serialized. When the data
     *        blob (the payload before base64-encoding) is added to the partition key size, the total size must not
     *        exceed the maximum record size (1 MB).
     */

    public void setData(java.nio.ByteBuffer data) {
        this.data = data;
    }

    /**
     * <p>
     * The data blob to put into the record, which is base64-encoded when the blob is serialized. When the data blob
     * (the payload before base64-encoding) is added to the partition key size, the total size must not exceed the
     * maximum record size (1 MB).
     * </p>
     * <p>
     * {@code ByteBuffer}s are stateful. Calling their {@code get} methods changes their {@code position}. We recommend
     * using {@link java.nio.ByteBuffer#asReadOnlyBuffer()} to create a read-only view of the buffer with an independent
     * {@code position}, and calling {@code get} methods on this rather than directly on the returned {@code ByteBuffer}.
     * Doing so will ensure that anyone else using the {@code ByteBuffer} will not be affected by changes to the
     * {@code position}.
     * </p>
     * 
     * @return The data blob to put into the record, which is base64-encoded when the blob is serialized. When the data
     *         blob (the payload before base64-encoding) is added to the partition key size, the total size must not
     *         exceed the maximum record size (1 MB).
     */

    public java.nio.ByteBuffer getData() {
        return this.data;
    }

    /**
     * <p>
     * The data blob to put into the record, which is base64-encoded when the blob is serialized. When the data blob
     * (the payload before base64-encoding) is added to the partition key size, the total size must not exceed the
     * maximum record size (1 MB).
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
     *        The data blob to put into the record, which is base64-encoded when the blob is serialized. When the data
     *        blob (the payload before base64-encoding) is added to the partition key size, the total size must not
     *        exceed the maximum record size (1 MB).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutRecordsRequestEntry withData(java.nio.ByteBuffer data) {
        setData(data);
        return this;
    }

    /**
     * <p>
     * The hash value used to determine explicitly the shard that the data record is assigned to by overriding the
     * partition key hash.
     * </p>
     * 
     * @param explicitHashKey
     *        The hash value used to determine explicitly the shard that the data record is assigned to by overriding
     *        the partition key hash.
     */

    public void setExplicitHashKey(String explicitHashKey) {
        this.explicitHashKey = explicitHashKey;
    }

    /**
     * <p>
     * The hash value used to determine explicitly the shard that the data record is assigned to by overriding the
     * partition key hash.
     * </p>
     * 
     * @return The hash value used to determine explicitly the shard that the data record is assigned to by overriding
     *         the partition key hash.
     */

    public String getExplicitHashKey() {
        return this.explicitHashKey;
    }

    /**
     * <p>
     * The hash value used to determine explicitly the shard that the data record is assigned to by overriding the
     * partition key hash.
     * </p>
     * 
     * @param explicitHashKey
     *        The hash value used to determine explicitly the shard that the data record is assigned to by overriding
     *        the partition key hash.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutRecordsRequestEntry withExplicitHashKey(String explicitHashKey) {
        setExplicitHashKey(explicitHashKey);
        return this;
    }

    /**
     * <p>
     * Determines which shard in the stream the data record is assigned to. Partition keys are Unicode strings with a
     * maximum length limit of 256 characters for each key. Amazon Kinesis Data Streams uses the partition key as input
     * to a hash function that maps the partition key and associated data to a specific shard. Specifically, an MD5 hash
     * function is used to map partition keys to 128-bit integer values and to map associated data records to shards. As
     * a result of this hashing mechanism, all data records with the same partition key map to the same shard within the
     * stream.
     * </p>
     * 
     * @param partitionKey
     *        Determines which shard in the stream the data record is assigned to. Partition keys are Unicode strings
     *        with a maximum length limit of 256 characters for each key. Amazon Kinesis Data Streams uses the partition
     *        key as input to a hash function that maps the partition key and associated data to a specific shard.
     *        Specifically, an MD5 hash function is used to map partition keys to 128-bit integer values and to map
     *        associated data records to shards. As a result of this hashing mechanism, all data records with the same
     *        partition key map to the same shard within the stream.
     */

    public void setPartitionKey(String partitionKey) {
        this.partitionKey = partitionKey;
    }

    /**
     * <p>
     * Determines which shard in the stream the data record is assigned to. Partition keys are Unicode strings with a
     * maximum length limit of 256 characters for each key. Amazon Kinesis Data Streams uses the partition key as input
     * to a hash function that maps the partition key and associated data to a specific shard. Specifically, an MD5 hash
     * function is used to map partition keys to 128-bit integer values and to map associated data records to shards. As
     * a result of this hashing mechanism, all data records with the same partition key map to the same shard within the
     * stream.
     * </p>
     * 
     * @return Determines which shard in the stream the data record is assigned to. Partition keys are Unicode strings
     *         with a maximum length limit of 256 characters for each key. Amazon Kinesis Data Streams uses the
     *         partition key as input to a hash function that maps the partition key and associated data to a specific
     *         shard. Specifically, an MD5 hash function is used to map partition keys to 128-bit integer values and to
     *         map associated data records to shards. As a result of this hashing mechanism, all data records with the
     *         same partition key map to the same shard within the stream.
     */

    public String getPartitionKey() {
        return this.partitionKey;
    }

    /**
     * <p>
     * Determines which shard in the stream the data record is assigned to. Partition keys are Unicode strings with a
     * maximum length limit of 256 characters for each key. Amazon Kinesis Data Streams uses the partition key as input
     * to a hash function that maps the partition key and associated data to a specific shard. Specifically, an MD5 hash
     * function is used to map partition keys to 128-bit integer values and to map associated data records to shards. As
     * a result of this hashing mechanism, all data records with the same partition key map to the same shard within the
     * stream.
     * </p>
     * 
     * @param partitionKey
     *        Determines which shard in the stream the data record is assigned to. Partition keys are Unicode strings
     *        with a maximum length limit of 256 characters for each key. Amazon Kinesis Data Streams uses the partition
     *        key as input to a hash function that maps the partition key and associated data to a specific shard.
     *        Specifically, an MD5 hash function is used to map partition keys to 128-bit integer values and to map
     *        associated data records to shards. As a result of this hashing mechanism, all data records with the same
     *        partition key map to the same shard within the stream.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutRecordsRequestEntry withPartitionKey(String partitionKey) {
        setPartitionKey(partitionKey);
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
        if (getData() != null)
            sb.append("Data: ").append(getData()).append(",");
        if (getExplicitHashKey() != null)
            sb.append("ExplicitHashKey: ").append(getExplicitHashKey()).append(",");
        if (getPartitionKey() != null)
            sb.append("PartitionKey: ").append(getPartitionKey());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PutRecordsRequestEntry == false)
            return false;
        PutRecordsRequestEntry other = (PutRecordsRequestEntry) obj;
        if (other.getData() == null ^ this.getData() == null)
            return false;
        if (other.getData() != null && other.getData().equals(this.getData()) == false)
            return false;
        if (other.getExplicitHashKey() == null ^ this.getExplicitHashKey() == null)
            return false;
        if (other.getExplicitHashKey() != null && other.getExplicitHashKey().equals(this.getExplicitHashKey()) == false)
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

        hashCode = prime * hashCode + ((getData() == null) ? 0 : getData().hashCode());
        hashCode = prime * hashCode + ((getExplicitHashKey() == null) ? 0 : getExplicitHashKey().hashCode());
        hashCode = prime * hashCode + ((getPartitionKey() == null) ? 0 : getPartitionKey().hashCode());
        return hashCode;
    }

    @Override
    public PutRecordsRequestEntry clone() {
        try {
            return (PutRecordsRequestEntry) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.kinesis.model.transform.PutRecordsRequestEntryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
