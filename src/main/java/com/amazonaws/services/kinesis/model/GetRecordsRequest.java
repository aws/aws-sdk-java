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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.kinesis.AmazonKinesis#getRecords(GetRecordsRequest) GetRecords operation}.
 * <p>
 * This operation returns one or more data records from a shard. A
 * <code>GetRecords</code> operation request can retrieve up to 10 MB of
 * data.
 * </p>
 * <p>
 * You specify a shard iterator for the shard that you want to read data
 * from in the <code>ShardIterator</code> parameter. The shard iterator
 * specifies the position in the shard from which you want to start
 * reading data records sequentially. A shard iterator specifies this
 * position using the sequence number of a data record in the shard. For
 * more information about the shard iterator, see GetShardIterator.
 * </p>
 * <p>
 * <code>GetRecords</code> may return a partial result if the response
 * size limit is exceeded. You will get an error, but not a partial
 * result if the shard's provisioned throughput is exceeded, the shard
 * iterator has expired, or an internal processing failure has occurred.
 * Clients can request a smaller amount of data by specifying a maximum
 * number of returned records using the <code>Limit</code> parameter. The
 * <code>Limit</code> parameter can be set to an integer value of up to
 * 10,000. If you set the value to an integer greater than 10,000, you
 * will receive <code>InvalidArgumentException</code> .
 * </p>
 * <p>
 * A new shard iterator is returned by every <code>GetRecords</code>
 * request in <code>NextShardIterator</code> ,
 * which you use in the <code>ShardIterator</code> parameter
 * of the next <code>GetRecords</code> request. When you repeatedly read
 * from an Amazon Kinesis stream use a GetShardIterator request to get
 * the first shard iterator to use in your first <code>GetRecords</code>
 * request and then use the shard iterator returned in
 * <code>NextShardIterator</code> for subsequent reads.
 * </p>
 * <p>
 * <code>GetRecords</code> can return <code>null</code> for the
 * <code>NextShardIterator</code> to reflect that the shard has been
 * closed and that the requested shard iterator would never have returned
 * more data.
 * </p>
 * <p>
 * If no items can be processed because of insufficient provisioned
 * throughput on the shard involved in the request,
 * <code>GetRecords</code> throws
 * <code>ProvisionedThroughputExceededException</code> .
 * </p>
 *
 * @see com.amazonaws.services.kinesis.AmazonKinesis#getRecords(GetRecordsRequest)
 */
public class GetRecordsRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * The position in the shard from which you want to start sequentially
     * reading data records.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     */
    private String shardIterator;

    /**
     * The maximum number of records to return, which can be set to a value
     * of up to 10,000.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 10000<br/>
     */
    private Integer limit;

    /**
     * The position in the shard from which you want to start sequentially
     * reading data records.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     *
     * @return The position in the shard from which you want to start sequentially
     *         reading data records.
     */
    public String getShardIterator() {
        return shardIterator;
    }
    
    /**
     * The position in the shard from which you want to start sequentially
     * reading data records.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     *
     * @param shardIterator The position in the shard from which you want to start sequentially
     *         reading data records.
     */
    public void setShardIterator(String shardIterator) {
        this.shardIterator = shardIterator;
    }
    
    /**
     * The position in the shard from which you want to start sequentially
     * reading data records.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     *
     * @param shardIterator The position in the shard from which you want to start sequentially
     *         reading data records.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public GetRecordsRequest withShardIterator(String shardIterator) {
        this.shardIterator = shardIterator;
        return this;
    }

    /**
     * The maximum number of records to return, which can be set to a value
     * of up to 10,000.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 10000<br/>
     *
     * @return The maximum number of records to return, which can be set to a value
     *         of up to 10,000.
     */
    public Integer getLimit() {
        return limit;
    }
    
    /**
     * The maximum number of records to return, which can be set to a value
     * of up to 10,000.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 10000<br/>
     *
     * @param limit The maximum number of records to return, which can be set to a value
     *         of up to 10,000.
     */
    public void setLimit(Integer limit) {
        this.limit = limit;
    }
    
    /**
     * The maximum number of records to return, which can be set to a value
     * of up to 10,000.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 10000<br/>
     *
     * @param limit The maximum number of records to return, which can be set to a value
     *         of up to 10,000.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public GetRecordsRequest withLimit(Integer limit) {
        this.limit = limit;
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
        if (getShardIterator() != null) sb.append("ShardIterator: " + getShardIterator() + ",");
        if (getLimit() != null) sb.append("Limit: " + getLimit() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getShardIterator() == null) ? 0 : getShardIterator().hashCode()); 
        hashCode = prime * hashCode + ((getLimit() == null) ? 0 : getLimit().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof GetRecordsRequest == false) return false;
        GetRecordsRequest other = (GetRecordsRequest)obj;
        
        if (other.getShardIterator() == null ^ this.getShardIterator() == null) return false;
        if (other.getShardIterator() != null && other.getShardIterator().equals(this.getShardIterator()) == false) return false; 
        if (other.getLimit() == null ^ this.getLimit() == null) return false;
        if (other.getLimit() != null && other.getLimit().equals(this.getLimit()) == false) return false; 
        return true;
    }
    
}
    