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
 * Gets data records from a shard.
 * </p>
 * <p>
 * You specify a shard iterator for the shard using the
 * <code>ShardIterator</code> parameter. The shard iterator specifies the
 * position in the shard from which you want to start reading data
 * records sequentially. <code>GetRecords</code> returns a new shard
 * iterator in <code>NextShardIterator</code> .
 * If the shard has been closed, the shard iterator can't
 * return more data and <code>GetRecords</code> returns <code>null</code>
 * in <code>NextShardIterator</code> .
 * To read from an Amazon Kinesis stream continually, use
 * GetShardIterator to get the shard iterator to specify in the first
 * <code>GetRecords</code> call, and then specify the shard iterator
 * returned in <code>NextShardIterator</code> in subsequent calls.
 * </p>
 * <p>
 * If there are no records available, <code>GetRecords</code> returns an
 * empty list.
 * </p>
 * <p>
 * The size of the data returned by <code>GetRecords</code> will vary,
 * but the maximum size is 10 MB. Each data record can be up to 50 KB in
 * size, and each shard can read up to 2 MB per second. You can ensure
 * that your calls don't exceed the maximum size or throughput by using
 * the <code>Limit</code> parameter to specify the maximum number of
 * records that <code>GetRecords</code> can return. Consider your average
 * record size when specifying a limit. For example, if your average
 * record size is 40 KB, you can limit the data returned to about 1 MB
 * per call using a limit of 25.
 * </p>
 * <p>
 * If there is insufficient provisioned throughput on the shard involved
 * in the request, subsequent calls to <code>GetRecords</code> made
 * within the next one second throw
 * <code>ProvisionedThroughputExceededException</code> .
 * <code>GetRecords</code> won't return data when it
 * throws an exception, so wait one second before making another call or
 * the application won't get any records. Also, you can scale by
 * provisioning multiple shards.
 * </p>
 * <p>
 * To detect whether you are falling behind in processing, add a
 * timestamp to your records and note how long it takes to process them.
 * </p>
 *
 * @see com.amazonaws.services.kinesis.AmazonKinesis#getRecords(GetRecordsRequest)
 */
public class GetRecordsRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * The position in the shard from which you want to start sequentially
     * reading data records. A shard iterator specifies this position using
     * the sequence number of a data record in the shard.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     */
    private String shardIterator;

    /**
     * The maximum size of data to return, in MB. Specify a value of up to
     * 10,000. If you specify a value that is greater than 10,000,
     * <code>GetRecords</code> throws <code>InvalidArgumentException</code>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 10000<br/>
     */
    private Integer limit;

    /**
     * The position in the shard from which you want to start sequentially
     * reading data records. A shard iterator specifies this position using
     * the sequence number of a data record in the shard.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     *
     * @return The position in the shard from which you want to start sequentially
     *         reading data records. A shard iterator specifies this position using
     *         the sequence number of a data record in the shard.
     */
    public String getShardIterator() {
        return shardIterator;
    }
    
    /**
     * The position in the shard from which you want to start sequentially
     * reading data records. A shard iterator specifies this position using
     * the sequence number of a data record in the shard.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     *
     * @param shardIterator The position in the shard from which you want to start sequentially
     *         reading data records. A shard iterator specifies this position using
     *         the sequence number of a data record in the shard.
     */
    public void setShardIterator(String shardIterator) {
        this.shardIterator = shardIterator;
    }
    
    /**
     * The position in the shard from which you want to start sequentially
     * reading data records. A shard iterator specifies this position using
     * the sequence number of a data record in the shard.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     *
     * @param shardIterator The position in the shard from which you want to start sequentially
     *         reading data records. A shard iterator specifies this position using
     *         the sequence number of a data record in the shard.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public GetRecordsRequest withShardIterator(String shardIterator) {
        this.shardIterator = shardIterator;
        return this;
    }

    /**
     * The maximum size of data to return, in MB. Specify a value of up to
     * 10,000. If you specify a value that is greater than 10,000,
     * <code>GetRecords</code> throws <code>InvalidArgumentException</code>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 10000<br/>
     *
     * @return The maximum size of data to return, in MB. Specify a value of up to
     *         10,000. If you specify a value that is greater than 10,000,
     *         <code>GetRecords</code> throws <code>InvalidArgumentException</code>.
     */
    public Integer getLimit() {
        return limit;
    }
    
    /**
     * The maximum size of data to return, in MB. Specify a value of up to
     * 10,000. If you specify a value that is greater than 10,000,
     * <code>GetRecords</code> throws <code>InvalidArgumentException</code>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 10000<br/>
     *
     * @param limit The maximum size of data to return, in MB. Specify a value of up to
     *         10,000. If you specify a value that is greater than 10,000,
     *         <code>GetRecords</code> throws <code>InvalidArgumentException</code>.
     */
    public void setLimit(Integer limit) {
        this.limit = limit;
    }
    
    /**
     * The maximum size of data to return, in MB. Specify a value of up to
     * 10,000. If you specify a value that is greater than 10,000,
     * <code>GetRecords</code> throws <code>InvalidArgumentException</code>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 10000<br/>
     *
     * @param limit The maximum size of data to return, in MB. Specify a value of up to
     *         10,000. If you specify a value that is greater than 10,000,
     *         <code>GetRecords</code> throws <code>InvalidArgumentException</code>.
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
    