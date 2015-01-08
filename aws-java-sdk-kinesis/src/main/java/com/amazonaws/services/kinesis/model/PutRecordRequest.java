/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.kinesis.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.kinesis.AmazonKinesis#putRecord(PutRecordRequest) PutRecord operation}.
 * <p>
 * Puts (writes) a single data record from a producer into an Amazon
 * Kinesis stream. Call <code>PutRecord</code> to send data from the
 * producer into the Amazon Kinesis stream for real-time ingestion and
 * subsequent processing, one record at a time. Each shard can support up
 * to 1000 records written per second, up to a maximum total of 1 MB data
 * written per second.
 * </p>
 * <p>
 * You must specify the name of the stream that captures, stores, and
 * transports the data; a partition key; and the data blob itself.
 * </p>
 * <p>
 * The data blob can be any type of data; for example, a segment from a
 * log file, geographic/location data, website clickstream data, and so
 * on.
 * </p>
 * <p>
 * The partition key is used by Amazon Kinesis to distribute data across
 * shards. Amazon Kinesis segregates the data records that belong to a
 * data stream into multiple shards, using the partition key associated
 * with each data record to determine which shard a given data record
 * belongs to.
 * </p>
 * <p>
 * Partition keys are Unicode strings, with a maximum length limit of 256
 * bytes. An MD5 hash function is used to map partition keys to 128-bit
 * integer values and to map associated data records to shards using the
 * hash key ranges of the shards. You can override hashing the partition
 * key to determine the shard by explicitly specifying a hash value using
 * the <code>ExplicitHashKey</code> parameter. For more information, see
 * <a href="http://docs.aws.amazon.com/kinesis/latest/dev/kinesis-using-api-java.html#kinesis-using-api-defn-partition-key"> Partition Key </a>
 * in the <i>Amazon Kinesis Developer Guide</i> .
 * </p>
 * <p>
 * <code>PutRecord</code> returns the shard ID of where the data record
 * was placed and the sequence number that was assigned to the data
 * record.
 * </p>
 * <p>
 * Sequence numbers generally increase over time. To guarantee strictly
 * increasing ordering, use the <code>SequenceNumberForOrdering</code>
 * parameter. For more information, see
 * <a href="http://docs.aws.amazon.com/kinesis/latest/dev/kinesis-using-api-java.html#kinesis-using-api-defn-sequence-number"> Sequence Number </a>
 * in the <i>Amazon Kinesis Developer Guide</i> .
 * </p>
 * <p>
 * If a <code>PutRecord</code> request cannot be processed because of
 * insufficient provisioned throughput on the shard involved in the
 * request, <code>PutRecord</code> throws
 * <code>ProvisionedThroughputExceededException</code> .
 * </p>
 * <p>
 * Data records are accessible for only 24 hours from the time that they
 * are added to an Amazon Kinesis stream.
 * </p>
 *
 * @see com.amazonaws.services.kinesis.AmazonKinesis#putRecord(PutRecordRequest)
 */
public class PutRecordRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * The name of the stream to put the data record into.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     */
    private String streamName;

    /**
     * The data blob to put into the record, which is base64-encoded when the
     * blob is serialized. The maximum size of the data blob (the payload
     * before base64-encoding) is 50 kilobytes (KB)
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 51200<br/>
     */
    private java.nio.ByteBuffer data;

    /**
     * Determines which shard in the stream the data record is assigned to.
     * Partition keys are Unicode strings with a maximum length limit of 256
     * bytes. Amazon Kinesis uses the partition key as input to a hash
     * function that maps the partition key and associated data to a specific
     * shard. Specifically, an MD5 hash function is used to map partition
     * keys to 128-bit integer values and to map associated data records to
     * shards. As a result of this hashing mechanism, all data records with
     * the same partition key will map to the same shard within the stream.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     */
    private String partitionKey;

    /**
     * The hash value used to explicitly determine the shard the data record
     * is assigned to by overriding the partition key hash.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>0|([1-9]\d{0,38})<br/>
     */
    private String explicitHashKey;

    /**
     * Guarantees strictly increasing sequence numbers, for puts from the
     * same client and to the same partition key. Usage: set the
     * <code>SequenceNumberForOrdering</code> of record <i>n</i> to the
     * sequence number of record <i>n-1</i> (as returned in the
     * <a>PutRecordResult</a> when putting record <i>n-1</i>). If this
     * parameter is not set, records will be coarsely ordered based on
     * arrival time.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>0|([1-9]\d{0,128})<br/>
     */
    private String sequenceNumberForOrdering;

    /**
     * The name of the stream to put the data record into.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @return The name of the stream to put the data record into.
     */
    public String getStreamName() {
        return streamName;
    }
    
    /**
     * The name of the stream to put the data record into.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @param streamName The name of the stream to put the data record into.
     */
    public void setStreamName(String streamName) {
        this.streamName = streamName;
    }
    
    /**
     * The name of the stream to put the data record into.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @param streamName The name of the stream to put the data record into.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public PutRecordRequest withStreamName(String streamName) {
        this.streamName = streamName;
        return this;
    }

    /**
     * The data blob to put into the record, which is base64-encoded when the
     * blob is serialized. The maximum size of the data blob (the payload
     * before base64-encoding) is 50 kilobytes (KB)
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 51200<br/>
     *
     * @return The data blob to put into the record, which is base64-encoded when the
     *         blob is serialized. The maximum size of the data blob (the payload
     *         before base64-encoding) is 50 kilobytes (KB)
     */
    public java.nio.ByteBuffer getData() {
        return data;
    }
    
    /**
     * The data blob to put into the record, which is base64-encoded when the
     * blob is serialized. The maximum size of the data blob (the payload
     * before base64-encoding) is 50 kilobytes (KB)
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 51200<br/>
     *
     * @param data The data blob to put into the record, which is base64-encoded when the
     *         blob is serialized. The maximum size of the data blob (the payload
     *         before base64-encoding) is 50 kilobytes (KB)
     */
    public void setData(java.nio.ByteBuffer data) {
        this.data = data;
    }
    
    /**
     * The data blob to put into the record, which is base64-encoded when the
     * blob is serialized. The maximum size of the data blob (the payload
     * before base64-encoding) is 50 kilobytes (KB)
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 51200<br/>
     *
     * @param data The data blob to put into the record, which is base64-encoded when the
     *         blob is serialized. The maximum size of the data blob (the payload
     *         before base64-encoding) is 50 kilobytes (KB)
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public PutRecordRequest withData(java.nio.ByteBuffer data) {
        this.data = data;
        return this;
    }

    /**
     * Determines which shard in the stream the data record is assigned to.
     * Partition keys are Unicode strings with a maximum length limit of 256
     * bytes. Amazon Kinesis uses the partition key as input to a hash
     * function that maps the partition key and associated data to a specific
     * shard. Specifically, an MD5 hash function is used to map partition
     * keys to 128-bit integer values and to map associated data records to
     * shards. As a result of this hashing mechanism, all data records with
     * the same partition key will map to the same shard within the stream.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @return Determines which shard in the stream the data record is assigned to.
     *         Partition keys are Unicode strings with a maximum length limit of 256
     *         bytes. Amazon Kinesis uses the partition key as input to a hash
     *         function that maps the partition key and associated data to a specific
     *         shard. Specifically, an MD5 hash function is used to map partition
     *         keys to 128-bit integer values and to map associated data records to
     *         shards. As a result of this hashing mechanism, all data records with
     *         the same partition key will map to the same shard within the stream.
     */
    public String getPartitionKey() {
        return partitionKey;
    }
    
    /**
     * Determines which shard in the stream the data record is assigned to.
     * Partition keys are Unicode strings with a maximum length limit of 256
     * bytes. Amazon Kinesis uses the partition key as input to a hash
     * function that maps the partition key and associated data to a specific
     * shard. Specifically, an MD5 hash function is used to map partition
     * keys to 128-bit integer values and to map associated data records to
     * shards. As a result of this hashing mechanism, all data records with
     * the same partition key will map to the same shard within the stream.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param partitionKey Determines which shard in the stream the data record is assigned to.
     *         Partition keys are Unicode strings with a maximum length limit of 256
     *         bytes. Amazon Kinesis uses the partition key as input to a hash
     *         function that maps the partition key and associated data to a specific
     *         shard. Specifically, an MD5 hash function is used to map partition
     *         keys to 128-bit integer values and to map associated data records to
     *         shards. As a result of this hashing mechanism, all data records with
     *         the same partition key will map to the same shard within the stream.
     */
    public void setPartitionKey(String partitionKey) {
        this.partitionKey = partitionKey;
    }
    
    /**
     * Determines which shard in the stream the data record is assigned to.
     * Partition keys are Unicode strings with a maximum length limit of 256
     * bytes. Amazon Kinesis uses the partition key as input to a hash
     * function that maps the partition key and associated data to a specific
     * shard. Specifically, an MD5 hash function is used to map partition
     * keys to 128-bit integer values and to map associated data records to
     * shards. As a result of this hashing mechanism, all data records with
     * the same partition key will map to the same shard within the stream.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param partitionKey Determines which shard in the stream the data record is assigned to.
     *         Partition keys are Unicode strings with a maximum length limit of 256
     *         bytes. Amazon Kinesis uses the partition key as input to a hash
     *         function that maps the partition key and associated data to a specific
     *         shard. Specifically, an MD5 hash function is used to map partition
     *         keys to 128-bit integer values and to map associated data records to
     *         shards. As a result of this hashing mechanism, all data records with
     *         the same partition key will map to the same shard within the stream.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public PutRecordRequest withPartitionKey(String partitionKey) {
        this.partitionKey = partitionKey;
        return this;
    }

    /**
     * The hash value used to explicitly determine the shard the data record
     * is assigned to by overriding the partition key hash.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>0|([1-9]\d{0,38})<br/>
     *
     * @return The hash value used to explicitly determine the shard the data record
     *         is assigned to by overriding the partition key hash.
     */
    public String getExplicitHashKey() {
        return explicitHashKey;
    }
    
    /**
     * The hash value used to explicitly determine the shard the data record
     * is assigned to by overriding the partition key hash.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>0|([1-9]\d{0,38})<br/>
     *
     * @param explicitHashKey The hash value used to explicitly determine the shard the data record
     *         is assigned to by overriding the partition key hash.
     */
    public void setExplicitHashKey(String explicitHashKey) {
        this.explicitHashKey = explicitHashKey;
    }
    
    /**
     * The hash value used to explicitly determine the shard the data record
     * is assigned to by overriding the partition key hash.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>0|([1-9]\d{0,38})<br/>
     *
     * @param explicitHashKey The hash value used to explicitly determine the shard the data record
     *         is assigned to by overriding the partition key hash.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public PutRecordRequest withExplicitHashKey(String explicitHashKey) {
        this.explicitHashKey = explicitHashKey;
        return this;
    }

    /**
     * Guarantees strictly increasing sequence numbers, for puts from the
     * same client and to the same partition key. Usage: set the
     * <code>SequenceNumberForOrdering</code> of record <i>n</i> to the
     * sequence number of record <i>n-1</i> (as returned in the
     * <a>PutRecordResult</a> when putting record <i>n-1</i>). If this
     * parameter is not set, records will be coarsely ordered based on
     * arrival time.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>0|([1-9]\d{0,128})<br/>
     *
     * @return Guarantees strictly increasing sequence numbers, for puts from the
     *         same client and to the same partition key. Usage: set the
     *         <code>SequenceNumberForOrdering</code> of record <i>n</i> to the
     *         sequence number of record <i>n-1</i> (as returned in the
     *         <a>PutRecordResult</a> when putting record <i>n-1</i>). If this
     *         parameter is not set, records will be coarsely ordered based on
     *         arrival time.
     */
    public String getSequenceNumberForOrdering() {
        return sequenceNumberForOrdering;
    }
    
    /**
     * Guarantees strictly increasing sequence numbers, for puts from the
     * same client and to the same partition key. Usage: set the
     * <code>SequenceNumberForOrdering</code> of record <i>n</i> to the
     * sequence number of record <i>n-1</i> (as returned in the
     * <a>PutRecordResult</a> when putting record <i>n-1</i>). If this
     * parameter is not set, records will be coarsely ordered based on
     * arrival time.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>0|([1-9]\d{0,128})<br/>
     *
     * @param sequenceNumberForOrdering Guarantees strictly increasing sequence numbers, for puts from the
     *         same client and to the same partition key. Usage: set the
     *         <code>SequenceNumberForOrdering</code> of record <i>n</i> to the
     *         sequence number of record <i>n-1</i> (as returned in the
     *         <a>PutRecordResult</a> when putting record <i>n-1</i>). If this
     *         parameter is not set, records will be coarsely ordered based on
     *         arrival time.
     */
    public void setSequenceNumberForOrdering(String sequenceNumberForOrdering) {
        this.sequenceNumberForOrdering = sequenceNumberForOrdering;
    }
    
    /**
     * Guarantees strictly increasing sequence numbers, for puts from the
     * same client and to the same partition key. Usage: set the
     * <code>SequenceNumberForOrdering</code> of record <i>n</i> to the
     * sequence number of record <i>n-1</i> (as returned in the
     * <a>PutRecordResult</a> when putting record <i>n-1</i>). If this
     * parameter is not set, records will be coarsely ordered based on
     * arrival time.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>0|([1-9]\d{0,128})<br/>
     *
     * @param sequenceNumberForOrdering Guarantees strictly increasing sequence numbers, for puts from the
     *         same client and to the same partition key. Usage: set the
     *         <code>SequenceNumberForOrdering</code> of record <i>n</i> to the
     *         sequence number of record <i>n-1</i> (as returned in the
     *         <a>PutRecordResult</a> when putting record <i>n-1</i>). If this
     *         parameter is not set, records will be coarsely ordered based on
     *         arrival time.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public PutRecordRequest withSequenceNumberForOrdering(String sequenceNumberForOrdering) {
        this.sequenceNumberForOrdering = sequenceNumberForOrdering;
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getStreamName() != null) sb.append("StreamName: " + getStreamName() + ",");
        if (getData() != null) sb.append("Data: " + getData() + ",");
        if (getPartitionKey() != null) sb.append("PartitionKey: " + getPartitionKey() + ",");
        if (getExplicitHashKey() != null) sb.append("ExplicitHashKey: " + getExplicitHashKey() + ",");
        if (getSequenceNumberForOrdering() != null) sb.append("SequenceNumberForOrdering: " + getSequenceNumberForOrdering() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getStreamName() == null) ? 0 : getStreamName().hashCode()); 
        hashCode = prime * hashCode + ((getData() == null) ? 0 : getData().hashCode()); 
        hashCode = prime * hashCode + ((getPartitionKey() == null) ? 0 : getPartitionKey().hashCode()); 
        hashCode = prime * hashCode + ((getExplicitHashKey() == null) ? 0 : getExplicitHashKey().hashCode()); 
        hashCode = prime * hashCode + ((getSequenceNumberForOrdering() == null) ? 0 : getSequenceNumberForOrdering().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof PutRecordRequest == false) return false;
        PutRecordRequest other = (PutRecordRequest)obj;
        
        if (other.getStreamName() == null ^ this.getStreamName() == null) return false;
        if (other.getStreamName() != null && other.getStreamName().equals(this.getStreamName()) == false) return false; 
        if (other.getData() == null ^ this.getData() == null) return false;
        if (other.getData() != null && other.getData().equals(this.getData()) == false) return false; 
        if (other.getPartitionKey() == null ^ this.getPartitionKey() == null) return false;
        if (other.getPartitionKey() != null && other.getPartitionKey().equals(this.getPartitionKey()) == false) return false; 
        if (other.getExplicitHashKey() == null ^ this.getExplicitHashKey() == null) return false;
        if (other.getExplicitHashKey() != null && other.getExplicitHashKey().equals(this.getExplicitHashKey()) == false) return false; 
        if (other.getSequenceNumberForOrdering() == null ^ this.getSequenceNumberForOrdering() == null) return false;
        if (other.getSequenceNumberForOrdering() != null && other.getSequenceNumberForOrdering().equals(this.getSequenceNumberForOrdering()) == false) return false; 
        return true;
    }
    
}
    