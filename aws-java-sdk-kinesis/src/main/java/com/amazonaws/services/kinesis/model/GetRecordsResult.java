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

/**
 * <p>
 * Represents the output for <a>GetRecords</a>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesis-2013-12-02/GetRecords" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetRecordsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The data records retrieved from the shard.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Record> records;
    /**
     * <p>
     * The next position in the shard from which to start sequentially reading data records. If set to <code>null</code>
     * , the shard has been closed and the requested iterator does not return any more data.
     * </p>
     */
    private String nextShardIterator;
    /**
     * <p>
     * The number of milliseconds the <a>GetRecords</a> response is from the tip of the stream, indicating how far
     * behind current time the consumer is. A value of zero indicates that record processing is caught up, and there are
     * no new records to process at this moment.
     * </p>
     */
    private Long millisBehindLatest;

    /**
     * <p>
     * The data records retrieved from the shard.
     * </p>
     * 
     * @return The data records retrieved from the shard.
     */

    public java.util.List<Record> getRecords() {
        if (records == null) {
            records = new com.amazonaws.internal.SdkInternalList<Record>();
        }
        return records;
    }

    /**
     * <p>
     * The data records retrieved from the shard.
     * </p>
     * 
     * @param records
     *        The data records retrieved from the shard.
     */

    public void setRecords(java.util.Collection<Record> records) {
        if (records == null) {
            this.records = null;
            return;
        }

        this.records = new com.amazonaws.internal.SdkInternalList<Record>(records);
    }

    /**
     * <p>
     * The data records retrieved from the shard.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRecords(java.util.Collection)} or {@link #withRecords(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param records
     *        The data records retrieved from the shard.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetRecordsResult withRecords(Record... records) {
        if (this.records == null) {
            setRecords(new com.amazonaws.internal.SdkInternalList<Record>(records.length));
        }
        for (Record ele : records) {
            this.records.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The data records retrieved from the shard.
     * </p>
     * 
     * @param records
     *        The data records retrieved from the shard.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetRecordsResult withRecords(java.util.Collection<Record> records) {
        setRecords(records);
        return this;
    }

    /**
     * <p>
     * The next position in the shard from which to start sequentially reading data records. If set to <code>null</code>
     * , the shard has been closed and the requested iterator does not return any more data.
     * </p>
     * 
     * @param nextShardIterator
     *        The next position in the shard from which to start sequentially reading data records. If set to
     *        <code>null</code>, the shard has been closed and the requested iterator does not return any more data.
     */

    public void setNextShardIterator(String nextShardIterator) {
        this.nextShardIterator = nextShardIterator;
    }

    /**
     * <p>
     * The next position in the shard from which to start sequentially reading data records. If set to <code>null</code>
     * , the shard has been closed and the requested iterator does not return any more data.
     * </p>
     * 
     * @return The next position in the shard from which to start sequentially reading data records. If set to
     *         <code>null</code>, the shard has been closed and the requested iterator does not return any more data.
     */

    public String getNextShardIterator() {
        return this.nextShardIterator;
    }

    /**
     * <p>
     * The next position in the shard from which to start sequentially reading data records. If set to <code>null</code>
     * , the shard has been closed and the requested iterator does not return any more data.
     * </p>
     * 
     * @param nextShardIterator
     *        The next position in the shard from which to start sequentially reading data records. If set to
     *        <code>null</code>, the shard has been closed and the requested iterator does not return any more data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetRecordsResult withNextShardIterator(String nextShardIterator) {
        setNextShardIterator(nextShardIterator);
        return this;
    }

    /**
     * <p>
     * The number of milliseconds the <a>GetRecords</a> response is from the tip of the stream, indicating how far
     * behind current time the consumer is. A value of zero indicates that record processing is caught up, and there are
     * no new records to process at this moment.
     * </p>
     * 
     * @param millisBehindLatest
     *        The number of milliseconds the <a>GetRecords</a> response is from the tip of the stream, indicating how
     *        far behind current time the consumer is. A value of zero indicates that record processing is caught up,
     *        and there are no new records to process at this moment.
     */

    public void setMillisBehindLatest(Long millisBehindLatest) {
        this.millisBehindLatest = millisBehindLatest;
    }

    /**
     * <p>
     * The number of milliseconds the <a>GetRecords</a> response is from the tip of the stream, indicating how far
     * behind current time the consumer is. A value of zero indicates that record processing is caught up, and there are
     * no new records to process at this moment.
     * </p>
     * 
     * @return The number of milliseconds the <a>GetRecords</a> response is from the tip of the stream, indicating how
     *         far behind current time the consumer is. A value of zero indicates that record processing is caught up,
     *         and there are no new records to process at this moment.
     */

    public Long getMillisBehindLatest() {
        return this.millisBehindLatest;
    }

    /**
     * <p>
     * The number of milliseconds the <a>GetRecords</a> response is from the tip of the stream, indicating how far
     * behind current time the consumer is. A value of zero indicates that record processing is caught up, and there are
     * no new records to process at this moment.
     * </p>
     * 
     * @param millisBehindLatest
     *        The number of milliseconds the <a>GetRecords</a> response is from the tip of the stream, indicating how
     *        far behind current time the consumer is. A value of zero indicates that record processing is caught up,
     *        and there are no new records to process at this moment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetRecordsResult withMillisBehindLatest(Long millisBehindLatest) {
        setMillisBehindLatest(millisBehindLatest);
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
        if (getRecords() != null)
            sb.append("Records: ").append(getRecords()).append(",");
        if (getNextShardIterator() != null)
            sb.append("NextShardIterator: ").append(getNextShardIterator()).append(",");
        if (getMillisBehindLatest() != null)
            sb.append("MillisBehindLatest: ").append(getMillisBehindLatest());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetRecordsResult == false)
            return false;
        GetRecordsResult other = (GetRecordsResult) obj;
        if (other.getRecords() == null ^ this.getRecords() == null)
            return false;
        if (other.getRecords() != null && other.getRecords().equals(this.getRecords()) == false)
            return false;
        if (other.getNextShardIterator() == null ^ this.getNextShardIterator() == null)
            return false;
        if (other.getNextShardIterator() != null && other.getNextShardIterator().equals(this.getNextShardIterator()) == false)
            return false;
        if (other.getMillisBehindLatest() == null ^ this.getMillisBehindLatest() == null)
            return false;
        if (other.getMillisBehindLatest() != null && other.getMillisBehindLatest().equals(this.getMillisBehindLatest()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRecords() == null) ? 0 : getRecords().hashCode());
        hashCode = prime * hashCode + ((getNextShardIterator() == null) ? 0 : getNextShardIterator().hashCode());
        hashCode = prime * hashCode + ((getMillisBehindLatest() == null) ? 0 : getMillisBehindLatest().hashCode());
        return hashCode;
    }

    @Override
    public GetRecordsResult clone() {
        try {
            return (GetRecordsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
