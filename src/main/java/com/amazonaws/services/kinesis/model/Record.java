/*
 * Copyright 2010-2014 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

/**
 * <p>
 * The unit of data of the Amazon Kinesis stream, which is composed of a
 * sequence number, a partition key, and a data blob.
 * </p>
 */
public class Record implements Serializable {

    /**
     * The unique identifier for the record in the Amazon Kinesis stream.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>0|([1-9]\d{0,128})<br/>
     */
    private String sequenceNumber;

    /**
     * The data blob. The data in the blob is both opaque and immutable to
     * the Amazon Kinesis service, which does not inspect, interpret, or
     * change the data in the blob in any way. The maximum size of the data
     * blob (the payload after Base64-decoding) is 50 kilobytes (KB)
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 51200<br/>
     */
    private java.nio.ByteBuffer data;

    /**
     * Identifies which shard in the stream the data record is assigned to.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     */
    private String partitionKey;

    /**
     * The unique identifier for the record in the Amazon Kinesis stream.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>0|([1-9]\d{0,128})<br/>
     *
     * @return The unique identifier for the record in the Amazon Kinesis stream.
     */
    public String getSequenceNumber() {
        return sequenceNumber;
    }
    
    /**
     * The unique identifier for the record in the Amazon Kinesis stream.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>0|([1-9]\d{0,128})<br/>
     *
     * @param sequenceNumber The unique identifier for the record in the Amazon Kinesis stream.
     */
    public void setSequenceNumber(String sequenceNumber) {
        this.sequenceNumber = sequenceNumber;
    }
    
    /**
     * The unique identifier for the record in the Amazon Kinesis stream.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>0|([1-9]\d{0,128})<br/>
     *
     * @param sequenceNumber The unique identifier for the record in the Amazon Kinesis stream.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Record withSequenceNumber(String sequenceNumber) {
        this.sequenceNumber = sequenceNumber;
        return this;
    }

    /**
     * The data blob. The data in the blob is both opaque and immutable to
     * the Amazon Kinesis service, which does not inspect, interpret, or
     * change the data in the blob in any way. The maximum size of the data
     * blob (the payload after Base64-decoding) is 50 kilobytes (KB)
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 51200<br/>
     *
     * @return The data blob. The data in the blob is both opaque and immutable to
     *         the Amazon Kinesis service, which does not inspect, interpret, or
     *         change the data in the blob in any way. The maximum size of the data
     *         blob (the payload after Base64-decoding) is 50 kilobytes (KB)
     */
    public java.nio.ByteBuffer getData() {
        return data;
    }
    
    /**
     * The data blob. The data in the blob is both opaque and immutable to
     * the Amazon Kinesis service, which does not inspect, interpret, or
     * change the data in the blob in any way. The maximum size of the data
     * blob (the payload after Base64-decoding) is 50 kilobytes (KB)
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 51200<br/>
     *
     * @param data The data blob. The data in the blob is both opaque and immutable to
     *         the Amazon Kinesis service, which does not inspect, interpret, or
     *         change the data in the blob in any way. The maximum size of the data
     *         blob (the payload after Base64-decoding) is 50 kilobytes (KB)
     */
    public void setData(java.nio.ByteBuffer data) {
        this.data = data;
    }
    
    /**
     * The data blob. The data in the blob is both opaque and immutable to
     * the Amazon Kinesis service, which does not inspect, interpret, or
     * change the data in the blob in any way. The maximum size of the data
     * blob (the payload after Base64-decoding) is 50 kilobytes (KB)
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 51200<br/>
     *
     * @param data The data blob. The data in the blob is both opaque and immutable to
     *         the Amazon Kinesis service, which does not inspect, interpret, or
     *         change the data in the blob in any way. The maximum size of the data
     *         blob (the payload after Base64-decoding) is 50 kilobytes (KB)
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Record withData(java.nio.ByteBuffer data) {
        this.data = data;
        return this;
    }

    /**
     * Identifies which shard in the stream the data record is assigned to.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @return Identifies which shard in the stream the data record is assigned to.
     */
    public String getPartitionKey() {
        return partitionKey;
    }
    
    /**
     * Identifies which shard in the stream the data record is assigned to.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param partitionKey Identifies which shard in the stream the data record is assigned to.
     */
    public void setPartitionKey(String partitionKey) {
        this.partitionKey = partitionKey;
    }
    
    /**
     * Identifies which shard in the stream the data record is assigned to.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param partitionKey Identifies which shard in the stream the data record is assigned to.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Record withPartitionKey(String partitionKey) {
        this.partitionKey = partitionKey;
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
        if (getSequenceNumber() != null) sb.append("SequenceNumber: " + getSequenceNumber() + ",");
        if (getData() != null) sb.append("Data: " + getData() + ",");
        if (getPartitionKey() != null) sb.append("PartitionKey: " + getPartitionKey() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getSequenceNumber() == null) ? 0 : getSequenceNumber().hashCode()); 
        hashCode = prime * hashCode + ((getData() == null) ? 0 : getData().hashCode()); 
        hashCode = prime * hashCode + ((getPartitionKey() == null) ? 0 : getPartitionKey().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof Record == false) return false;
        Record other = (Record)obj;
        
        if (other.getSequenceNumber() == null ^ this.getSequenceNumber() == null) return false;
        if (other.getSequenceNumber() != null && other.getSequenceNumber().equals(this.getSequenceNumber()) == false) return false; 
        if (other.getData() == null ^ this.getData() == null) return false;
        if (other.getData() != null && other.getData().equals(this.getData()) == false) return false; 
        if (other.getPartitionKey() == null ^ this.getPartitionKey() == null) return false;
        if (other.getPartitionKey() != null && other.getPartitionKey().equals(this.getPartitionKey()) == false) return false; 
        return true;
    }
    
}
    