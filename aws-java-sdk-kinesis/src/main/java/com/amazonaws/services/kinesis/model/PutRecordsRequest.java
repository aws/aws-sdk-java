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
 * Container for the parameters to the {@link com.amazonaws.services.kinesis.AmazonKinesis#putRecords(PutRecordsRequest) PutRecords operation}.
 * <p>
 * Puts (writes) multiple data records from a producer into an Amazon
 * Kinesis stream in a single call (also referred to as a
 * <code>PutRecords</code> request). Use this operation to send data from
 * a data producer into the Amazon Kinesis stream for real-time ingestion
 * and processing. Each shard can support up to 1000 records written per
 * second, up to a maximum total of 1 MB data written per second.
 * </p>
 * <p>
 * You must specify the name of the stream that captures, stores, and
 * transports the data; and an array of request <code>Records</code> ,
 * with each record in the array requiring a partition key
 * and data blob.
 * </p>
 * <p>
 * The data blob can be any type of data; for example, a segment from a
 * log file, geographic/location data, website clickstream data, and so
 * on.
 * </p>
 * <p>
 * The partition key is used by Amazon Kinesis as input to a hash
 * function that maps the partition key and associated data to a specific
 * shard. An MD5 hash function is used to map partition keys to 128-bit
 * integer values and to map associated data records to shards. As a
 * result of this hashing mechanism, all data records with the same
 * partition key map to the same shard within the stream. For more
 * information, see
 * <a href="http://docs.aws.amazon.com/kinesis/latest/dev/kinesis-using-api-java.html#kinesis-using-api-defn-partition-key"> Partition Key </a>
 * in the <i>Amazon Kinesis Developer Guide</i> .
 * </p>
 * <p>
 * Each record in the <code>Records</code> array may include an optional
 * parameter, <code>ExplicitHashKey</code> , which overrides the
 * partition key to shard mapping. This parameter allows a data producer
 * to determine explicitly the shard where the record is stored. For more
 * information, see
 * <a href="http://docs.aws.amazon.com/kinesis/latest/dev/kinesis-using-api-java.html#kinesis-using-api-putrecords"> Adding Multiple Records with PutRecords </a>
 * in the <i>Amazon Kinesis Developer Guide</i> .
 * </p>
 * <p>
 * The <code>PutRecords</code> response includes an array of response
 * <code>Records</code> . Each record in the response array directly
 * correlates with a record in the request array using natural ordering,
 * from the top to the bottom of the request and response. The response
 * <code>Records</code> array always includes the same number of records
 * as the request array.
 * </p>
 * <p>
 * The response <code>Records</code> array includes both successfully and
 * unsuccessfully processed records. Amazon Kinesis attempts to process
 * all records in each <code>PutRecords</code> request. A single record
 * failure does not stop the processing of subsequent records.
 * </p>
 * <p>
 * A successfully-processed record includes <code>ShardId</code> and
 * <code>SequenceNumber</code> values. The <code>ShardId</code> parameter
 * identifies the shard in the stream where the record is stored. The
 * <code>SequenceNumber</code> parameter is an identifier assigned to the
 * put record, unique to all records in the stream.
 * </p>
 * <p>
 * An unsuccessfully-processed record includes <code>ErrorCode</code> and
 * <code>ErrorMessage</code> values. <code>ErrorCode</code> reflects the
 * type of error and can be one of the following values:
 * <code>ProvisionedThroughputExceededException</code> or
 * <code>InternalFailure</code> .
 * 
 * <code>ErrorMessage</code> provides more detailed
 * information about the
 * <code>ProvisionedThroughputExceededException</code> exception
 * including the account ID, stream name, and shard ID of the record that
 * was throttled.
 * </p>
 * <p>
 * Data records are accessible for only 24 hours from the time that they
 * are added to an Amazon Kinesis stream.
 * </p>
 *
 * @see com.amazonaws.services.kinesis.AmazonKinesis#putRecords(PutRecordsRequest)
 */
public class PutRecordsRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * The records associated with the request.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 500<br/>
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<PutRecordsRequestEntry> records;

    /**
     * The stream name associated with the request.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     */
    private String streamName;

    /**
     * The records associated with the request.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 500<br/>
     *
     * @return The records associated with the request.
     */
    public java.util.List<PutRecordsRequestEntry> getRecords() {
        if (records == null) {
              records = new com.amazonaws.internal.ListWithAutoConstructFlag<PutRecordsRequestEntry>();
              records.setAutoConstruct(true);
        }
        return records;
    }
    
    /**
     * The records associated with the request.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 500<br/>
     *
     * @param records The records associated with the request.
     */
    public void setRecords(java.util.Collection<PutRecordsRequestEntry> records) {
        if (records == null) {
            this.records = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<PutRecordsRequestEntry> recordsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<PutRecordsRequestEntry>(records.size());
        recordsCopy.addAll(records);
        this.records = recordsCopy;
    }
    
    /**
     * The records associated with the request.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 500<br/>
     *
     * @param records The records associated with the request.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public PutRecordsRequest withRecords(PutRecordsRequestEntry... records) {
        if (getRecords() == null) setRecords(new java.util.ArrayList<PutRecordsRequestEntry>(records.length));
        for (PutRecordsRequestEntry value : records) {
            getRecords().add(value);
        }
        return this;
    }
    
    /**
     * The records associated with the request.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 500<br/>
     *
     * @param records The records associated with the request.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public PutRecordsRequest withRecords(java.util.Collection<PutRecordsRequestEntry> records) {
        if (records == null) {
            this.records = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<PutRecordsRequestEntry> recordsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<PutRecordsRequestEntry>(records.size());
            recordsCopy.addAll(records);
            this.records = recordsCopy;
        }

        return this;
    }

    /**
     * The stream name associated with the request.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @return The stream name associated with the request.
     */
    public String getStreamName() {
        return streamName;
    }
    
    /**
     * The stream name associated with the request.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @param streamName The stream name associated with the request.
     */
    public void setStreamName(String streamName) {
        this.streamName = streamName;
    }
    
    /**
     * The stream name associated with the request.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @param streamName The stream name associated with the request.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public PutRecordsRequest withStreamName(String streamName) {
        this.streamName = streamName;
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
        if (getRecords() != null) sb.append("Records: " + getRecords() + ",");
        if (getStreamName() != null) sb.append("StreamName: " + getStreamName() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getRecords() == null) ? 0 : getRecords().hashCode()); 
        hashCode = prime * hashCode + ((getStreamName() == null) ? 0 : getStreamName().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof PutRecordsRequest == false) return false;
        PutRecordsRequest other = (PutRecordsRequest)obj;
        
        if (other.getRecords() == null ^ this.getRecords() == null) return false;
        if (other.getRecords() != null && other.getRecords().equals(this.getRecords()) == false) return false; 
        if (other.getStreamName() == null ^ this.getStreamName() == null) return false;
        if (other.getStreamName() != null && other.getStreamName().equals(this.getStreamName()) == false) return false; 
        return true;
    }
    
}
    