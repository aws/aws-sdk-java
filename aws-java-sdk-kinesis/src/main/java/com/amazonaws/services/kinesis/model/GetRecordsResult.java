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

/**
 * <p>
 * Represents the output for GetRecords.
 * </p>
 */
public class GetRecordsResult implements Serializable, Cloneable {

    /**
     * <P>The data records retrieved from the shard.</P>
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<Record> records;

    /**
     * The next position in the shard from which to start sequentially
     * reading data records. If set to <code>null</code>, the shard has been
     * closed and the requested iterator will not return any more data.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     */
    private String nextShardIterator;

    /**
     * The number of milliseconds the <a>GetRecords</a> response is from the
     * tip of the stream, indicating how far behind current time the consumer
     * is. A value of zero indicates record processing is caught up, and
     * there are no new records to process at this moment.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     */
    private Long millisBehindLatest;

    /**
     * <P>The data records retrieved from the shard.</P>
     *
     * @return <P>The data records retrieved from the shard.</P>
     */
    public java.util.List<Record> getRecords() {
        if (records == null) {
              records = new com.amazonaws.internal.ListWithAutoConstructFlag<Record>();
              records.setAutoConstruct(true);
        }
        return records;
    }
    
    /**
     * <P>The data records retrieved from the shard.</P>
     *
     * @param records <P>The data records retrieved from the shard.</P>
     */
    public void setRecords(java.util.Collection<Record> records) {
        if (records == null) {
            this.records = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<Record> recordsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<Record>(records.size());
        recordsCopy.addAll(records);
        this.records = recordsCopy;
    }
    
    /**
     * <P>The data records retrieved from the shard.</P>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setRecords(java.util.Collection)} or {@link
     * #withRecords(java.util.Collection)} if you want to override the
     * existing values.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param records <P>The data records retrieved from the shard.</P>
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public GetRecordsResult withRecords(Record... records) {
        if (getRecords() == null) setRecords(new java.util.ArrayList<Record>(records.length));
        for (Record value : records) {
            getRecords().add(value);
        }
        return this;
    }
    
    /**
     * <P>The data records retrieved from the shard.</P>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param records <P>The data records retrieved from the shard.</P>
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public GetRecordsResult withRecords(java.util.Collection<Record> records) {
        if (records == null) {
            this.records = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<Record> recordsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<Record>(records.size());
            recordsCopy.addAll(records);
            this.records = recordsCopy;
        }

        return this;
    }

    /**
     * The next position in the shard from which to start sequentially
     * reading data records. If set to <code>null</code>, the shard has been
     * closed and the requested iterator will not return any more data.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     *
     * @return The next position in the shard from which to start sequentially
     *         reading data records. If set to <code>null</code>, the shard has been
     *         closed and the requested iterator will not return any more data.
     */
    public String getNextShardIterator() {
        return nextShardIterator;
    }
    
    /**
     * The next position in the shard from which to start sequentially
     * reading data records. If set to <code>null</code>, the shard has been
     * closed and the requested iterator will not return any more data.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     *
     * @param nextShardIterator The next position in the shard from which to start sequentially
     *         reading data records. If set to <code>null</code>, the shard has been
     *         closed and the requested iterator will not return any more data.
     */
    public void setNextShardIterator(String nextShardIterator) {
        this.nextShardIterator = nextShardIterator;
    }
    
    /**
     * The next position in the shard from which to start sequentially
     * reading data records. If set to <code>null</code>, the shard has been
     * closed and the requested iterator will not return any more data.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     *
     * @param nextShardIterator The next position in the shard from which to start sequentially
     *         reading data records. If set to <code>null</code>, the shard has been
     *         closed and the requested iterator will not return any more data.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public GetRecordsResult withNextShardIterator(String nextShardIterator) {
        this.nextShardIterator = nextShardIterator;
        return this;
    }

    /**
     * The number of milliseconds the <a>GetRecords</a> response is from the
     * tip of the stream, indicating how far behind current time the consumer
     * is. A value of zero indicates record processing is caught up, and
     * there are no new records to process at this moment.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @return The number of milliseconds the <a>GetRecords</a> response is from the
     *         tip of the stream, indicating how far behind current time the consumer
     *         is. A value of zero indicates record processing is caught up, and
     *         there are no new records to process at this moment.
     */
    public Long getMillisBehindLatest() {
        return millisBehindLatest;
    }
    
    /**
     * The number of milliseconds the <a>GetRecords</a> response is from the
     * tip of the stream, indicating how far behind current time the consumer
     * is. A value of zero indicates record processing is caught up, and
     * there are no new records to process at this moment.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param millisBehindLatest The number of milliseconds the <a>GetRecords</a> response is from the
     *         tip of the stream, indicating how far behind current time the consumer
     *         is. A value of zero indicates record processing is caught up, and
     *         there are no new records to process at this moment.
     */
    public void setMillisBehindLatest(Long millisBehindLatest) {
        this.millisBehindLatest = millisBehindLatest;
    }
    
    /**
     * The number of milliseconds the <a>GetRecords</a> response is from the
     * tip of the stream, indicating how far behind current time the consumer
     * is. A value of zero indicates record processing is caught up, and
     * there are no new records to process at this moment.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param millisBehindLatest The number of milliseconds the <a>GetRecords</a> response is from the
     *         tip of the stream, indicating how far behind current time the consumer
     *         is. A value of zero indicates record processing is caught up, and
     *         there are no new records to process at this moment.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public GetRecordsResult withMillisBehindLatest(Long millisBehindLatest) {
        this.millisBehindLatest = millisBehindLatest;
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
        if (getNextShardIterator() != null) sb.append("NextShardIterator: " + getNextShardIterator() + ",");
        if (getMillisBehindLatest() != null) sb.append("MillisBehindLatest: " + getMillisBehindLatest() );
        sb.append("}");
        return sb.toString();
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
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof GetRecordsResult == false) return false;
        GetRecordsResult other = (GetRecordsResult)obj;
        
        if (other.getRecords() == null ^ this.getRecords() == null) return false;
        if (other.getRecords() != null && other.getRecords().equals(this.getRecords()) == false) return false; 
        if (other.getNextShardIterator() == null ^ this.getNextShardIterator() == null) return false;
        if (other.getNextShardIterator() != null && other.getNextShardIterator().equals(this.getNextShardIterator()) == false) return false; 
        if (other.getMillisBehindLatest() == null ^ this.getMillisBehindLatest() == null) return false;
        if (other.getMillisBehindLatest() != null && other.getMillisBehindLatest().equals(this.getMillisBehindLatest()) == false) return false; 
        return true;
    }
    
    @Override
    public GetRecordsResult clone() {
        try {
            return (GetRecordsResult) super.clone();
        
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                    + "even though we're Cloneable!",
                    e);
        }
        
    }

}
    