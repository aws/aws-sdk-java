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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Represents the input for <a>GetRecords</a>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesis-2013-12-02/GetRecords" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetRecordsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The position in the shard from which you want to start sequentially reading data records. A shard iterator
     * specifies this position using the sequence number of a data record in the shard.
     * </p>
     */
    private String shardIterator;
    /**
     * <p>
     * The maximum number of records to return. Specify a value of up to 10,000. If you specify a value that is greater
     * than 10,000, <a>GetRecords</a> throws <code>InvalidArgumentException</code>.
     * </p>
     */
    private Integer limit;

    /**
     * <p>
     * The position in the shard from which you want to start sequentially reading data records. A shard iterator
     * specifies this position using the sequence number of a data record in the shard.
     * </p>
     * 
     * @param shardIterator
     *        The position in the shard from which you want to start sequentially reading data records. A shard iterator
     *        specifies this position using the sequence number of a data record in the shard.
     */

    public void setShardIterator(String shardIterator) {
        this.shardIterator = shardIterator;
    }

    /**
     * <p>
     * The position in the shard from which you want to start sequentially reading data records. A shard iterator
     * specifies this position using the sequence number of a data record in the shard.
     * </p>
     * 
     * @return The position in the shard from which you want to start sequentially reading data records. A shard
     *         iterator specifies this position using the sequence number of a data record in the shard.
     */

    public String getShardIterator() {
        return this.shardIterator;
    }

    /**
     * <p>
     * The position in the shard from which you want to start sequentially reading data records. A shard iterator
     * specifies this position using the sequence number of a data record in the shard.
     * </p>
     * 
     * @param shardIterator
     *        The position in the shard from which you want to start sequentially reading data records. A shard iterator
     *        specifies this position using the sequence number of a data record in the shard.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetRecordsRequest withShardIterator(String shardIterator) {
        setShardIterator(shardIterator);
        return this;
    }

    /**
     * <p>
     * The maximum number of records to return. Specify a value of up to 10,000. If you specify a value that is greater
     * than 10,000, <a>GetRecords</a> throws <code>InvalidArgumentException</code>.
     * </p>
     * 
     * @param limit
     *        The maximum number of records to return. Specify a value of up to 10,000. If you specify a value that is
     *        greater than 10,000, <a>GetRecords</a> throws <code>InvalidArgumentException</code>.
     */

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    /**
     * <p>
     * The maximum number of records to return. Specify a value of up to 10,000. If you specify a value that is greater
     * than 10,000, <a>GetRecords</a> throws <code>InvalidArgumentException</code>.
     * </p>
     * 
     * @return The maximum number of records to return. Specify a value of up to 10,000. If you specify a value that is
     *         greater than 10,000, <a>GetRecords</a> throws <code>InvalidArgumentException</code>.
     */

    public Integer getLimit() {
        return this.limit;
    }

    /**
     * <p>
     * The maximum number of records to return. Specify a value of up to 10,000. If you specify a value that is greater
     * than 10,000, <a>GetRecords</a> throws <code>InvalidArgumentException</code>.
     * </p>
     * 
     * @param limit
     *        The maximum number of records to return. Specify a value of up to 10,000. If you specify a value that is
     *        greater than 10,000, <a>GetRecords</a> throws <code>InvalidArgumentException</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetRecordsRequest withLimit(Integer limit) {
        setLimit(limit);
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
        if (getShardIterator() != null)
            sb.append("ShardIterator: ").append(getShardIterator()).append(",");
        if (getLimit() != null)
            sb.append("Limit: ").append(getLimit());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetRecordsRequest == false)
            return false;
        GetRecordsRequest other = (GetRecordsRequest) obj;
        if (other.getShardIterator() == null ^ this.getShardIterator() == null)
            return false;
        if (other.getShardIterator() != null && other.getShardIterator().equals(this.getShardIterator()) == false)
            return false;
        if (other.getLimit() == null ^ this.getLimit() == null)
            return false;
        if (other.getLimit() != null && other.getLimit().equals(this.getLimit()) == false)
            return false;
        return true;
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
    public GetRecordsRequest clone() {
        return (GetRecordsRequest) super.clone();
    }

}
