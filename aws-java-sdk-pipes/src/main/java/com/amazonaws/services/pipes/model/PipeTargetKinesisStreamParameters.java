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
package com.amazonaws.services.pipes.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The parameters for using a Kinesis stream as a source.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pipes-2015-10-07/PipeTargetKinesisStreamParameters"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PipeTargetKinesisStreamParameters implements Serializable, Cloneable, StructuredPojo {

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

    public PipeTargetKinesisStreamParameters withPartitionKey(String partitionKey) {
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
        if (getPartitionKey() != null)
            sb.append("PartitionKey: ").append("***Sensitive Data Redacted***");
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PipeTargetKinesisStreamParameters == false)
            return false;
        PipeTargetKinesisStreamParameters other = (PipeTargetKinesisStreamParameters) obj;
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

        hashCode = prime * hashCode + ((getPartitionKey() == null) ? 0 : getPartitionKey().hashCode());
        return hashCode;
    }

    @Override
    public PipeTargetKinesisStreamParameters clone() {
        try {
            return (PipeTargetKinesisStreamParameters) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.pipes.model.transform.PipeTargetKinesisStreamParametersMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
