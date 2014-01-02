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
 * Represents the output of a <code>DescribeStream</code> operation.
 * </p>
 */
public class StreamDescription implements Serializable {

    /**
     * The name of the stream being described.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     */
    private String streamName;

    /**
     * The Amazon Resource Name (ARN) for the stream being described.
     */
    private String streamARN;

    /**
     * The current status of the stream being described. <p>The stream status
     * is one of the following states: <ul> <li>CREATING - The stream is
     * being created. Upon receiving a <a>CreateStream</a> request, Amazon
     * Kinesis immediately returns and sets <code>StreamStatus</code> to
     * CREATING.</li> <li>DELETING - The stream is being deleted. After a
     * <a>DeleteStream</a> request, the specified stream is in the DELETING
     * state until Amazon Kinesis completes the deletion.</li> <li>ACTIVE -
     * The stream exists and is ready for read and write operations or
     * deletion. You should perform read and write operations only on an
     * ACTIVE stream.</li> <li>UPDATING - Shards in the stream are being
     * merged or split. Read and write operations continue to work while the
     * stream is in the UPDATING state.</li> </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATING, DELETING, ACTIVE, UPDATING
     */
    private String streamStatus;

    /**
     * The shards that comprise the stream.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<Shard> shards;

    /**
     * If set to <code>true</code> there are more shards in the stream
     * available to describe.
     */
    private Boolean hasMoreShards;

    /**
     * The name of the stream being described.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @return The name of the stream being described.
     */
    public String getStreamName() {
        return streamName;
    }
    
    /**
     * The name of the stream being described.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @param streamName The name of the stream being described.
     */
    public void setStreamName(String streamName) {
        this.streamName = streamName;
    }
    
    /**
     * The name of the stream being described.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @param streamName The name of the stream being described.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public StreamDescription withStreamName(String streamName) {
        this.streamName = streamName;
        return this;
    }

    /**
     * The Amazon Resource Name (ARN) for the stream being described.
     *
     * @return The Amazon Resource Name (ARN) for the stream being described.
     */
    public String getStreamARN() {
        return streamARN;
    }
    
    /**
     * The Amazon Resource Name (ARN) for the stream being described.
     *
     * @param streamARN The Amazon Resource Name (ARN) for the stream being described.
     */
    public void setStreamARN(String streamARN) {
        this.streamARN = streamARN;
    }
    
    /**
     * The Amazon Resource Name (ARN) for the stream being described.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param streamARN The Amazon Resource Name (ARN) for the stream being described.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public StreamDescription withStreamARN(String streamARN) {
        this.streamARN = streamARN;
        return this;
    }

    /**
     * The current status of the stream being described. <p>The stream status
     * is one of the following states: <ul> <li>CREATING - The stream is
     * being created. Upon receiving a <a>CreateStream</a> request, Amazon
     * Kinesis immediately returns and sets <code>StreamStatus</code> to
     * CREATING.</li> <li>DELETING - The stream is being deleted. After a
     * <a>DeleteStream</a> request, the specified stream is in the DELETING
     * state until Amazon Kinesis completes the deletion.</li> <li>ACTIVE -
     * The stream exists and is ready for read and write operations or
     * deletion. You should perform read and write operations only on an
     * ACTIVE stream.</li> <li>UPDATING - Shards in the stream are being
     * merged or split. Read and write operations continue to work while the
     * stream is in the UPDATING state.</li> </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATING, DELETING, ACTIVE, UPDATING
     *
     * @return The current status of the stream being described. <p>The stream status
     *         is one of the following states: <ul> <li>CREATING - The stream is
     *         being created. Upon receiving a <a>CreateStream</a> request, Amazon
     *         Kinesis immediately returns and sets <code>StreamStatus</code> to
     *         CREATING.</li> <li>DELETING - The stream is being deleted. After a
     *         <a>DeleteStream</a> request, the specified stream is in the DELETING
     *         state until Amazon Kinesis completes the deletion.</li> <li>ACTIVE -
     *         The stream exists and is ready for read and write operations or
     *         deletion. You should perform read and write operations only on an
     *         ACTIVE stream.</li> <li>UPDATING - Shards in the stream are being
     *         merged or split. Read and write operations continue to work while the
     *         stream is in the UPDATING state.</li> </ul>
     *
     * @see StreamStatus
     */
    public String getStreamStatus() {
        return streamStatus;
    }
    
    /**
     * The current status of the stream being described. <p>The stream status
     * is one of the following states: <ul> <li>CREATING - The stream is
     * being created. Upon receiving a <a>CreateStream</a> request, Amazon
     * Kinesis immediately returns and sets <code>StreamStatus</code> to
     * CREATING.</li> <li>DELETING - The stream is being deleted. After a
     * <a>DeleteStream</a> request, the specified stream is in the DELETING
     * state until Amazon Kinesis completes the deletion.</li> <li>ACTIVE -
     * The stream exists and is ready for read and write operations or
     * deletion. You should perform read and write operations only on an
     * ACTIVE stream.</li> <li>UPDATING - Shards in the stream are being
     * merged or split. Read and write operations continue to work while the
     * stream is in the UPDATING state.</li> </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATING, DELETING, ACTIVE, UPDATING
     *
     * @param streamStatus The current status of the stream being described. <p>The stream status
     *         is one of the following states: <ul> <li>CREATING - The stream is
     *         being created. Upon receiving a <a>CreateStream</a> request, Amazon
     *         Kinesis immediately returns and sets <code>StreamStatus</code> to
     *         CREATING.</li> <li>DELETING - The stream is being deleted. After a
     *         <a>DeleteStream</a> request, the specified stream is in the DELETING
     *         state until Amazon Kinesis completes the deletion.</li> <li>ACTIVE -
     *         The stream exists and is ready for read and write operations or
     *         deletion. You should perform read and write operations only on an
     *         ACTIVE stream.</li> <li>UPDATING - Shards in the stream are being
     *         merged or split. Read and write operations continue to work while the
     *         stream is in the UPDATING state.</li> </ul>
     *
     * @see StreamStatus
     */
    public void setStreamStatus(String streamStatus) {
        this.streamStatus = streamStatus;
    }
    
    /**
     * The current status of the stream being described. <p>The stream status
     * is one of the following states: <ul> <li>CREATING - The stream is
     * being created. Upon receiving a <a>CreateStream</a> request, Amazon
     * Kinesis immediately returns and sets <code>StreamStatus</code> to
     * CREATING.</li> <li>DELETING - The stream is being deleted. After a
     * <a>DeleteStream</a> request, the specified stream is in the DELETING
     * state until Amazon Kinesis completes the deletion.</li> <li>ACTIVE -
     * The stream exists and is ready for read and write operations or
     * deletion. You should perform read and write operations only on an
     * ACTIVE stream.</li> <li>UPDATING - Shards in the stream are being
     * merged or split. Read and write operations continue to work while the
     * stream is in the UPDATING state.</li> </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATING, DELETING, ACTIVE, UPDATING
     *
     * @param streamStatus The current status of the stream being described. <p>The stream status
     *         is one of the following states: <ul> <li>CREATING - The stream is
     *         being created. Upon receiving a <a>CreateStream</a> request, Amazon
     *         Kinesis immediately returns and sets <code>StreamStatus</code> to
     *         CREATING.</li> <li>DELETING - The stream is being deleted. After a
     *         <a>DeleteStream</a> request, the specified stream is in the DELETING
     *         state until Amazon Kinesis completes the deletion.</li> <li>ACTIVE -
     *         The stream exists and is ready for read and write operations or
     *         deletion. You should perform read and write operations only on an
     *         ACTIVE stream.</li> <li>UPDATING - Shards in the stream are being
     *         merged or split. Read and write operations continue to work while the
     *         stream is in the UPDATING state.</li> </ul>
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     *
     * @see StreamStatus
     */
    public StreamDescription withStreamStatus(String streamStatus) {
        this.streamStatus = streamStatus;
        return this;
    }

    /**
     * The current status of the stream being described. <p>The stream status
     * is one of the following states: <ul> <li>CREATING - The stream is
     * being created. Upon receiving a <a>CreateStream</a> request, Amazon
     * Kinesis immediately returns and sets <code>StreamStatus</code> to
     * CREATING.</li> <li>DELETING - The stream is being deleted. After a
     * <a>DeleteStream</a> request, the specified stream is in the DELETING
     * state until Amazon Kinesis completes the deletion.</li> <li>ACTIVE -
     * The stream exists and is ready for read and write operations or
     * deletion. You should perform read and write operations only on an
     * ACTIVE stream.</li> <li>UPDATING - Shards in the stream are being
     * merged or split. Read and write operations continue to work while the
     * stream is in the UPDATING state.</li> </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATING, DELETING, ACTIVE, UPDATING
     *
     * @param streamStatus The current status of the stream being described. <p>The stream status
     *         is one of the following states: <ul> <li>CREATING - The stream is
     *         being created. Upon receiving a <a>CreateStream</a> request, Amazon
     *         Kinesis immediately returns and sets <code>StreamStatus</code> to
     *         CREATING.</li> <li>DELETING - The stream is being deleted. After a
     *         <a>DeleteStream</a> request, the specified stream is in the DELETING
     *         state until Amazon Kinesis completes the deletion.</li> <li>ACTIVE -
     *         The stream exists and is ready for read and write operations or
     *         deletion. You should perform read and write operations only on an
     *         ACTIVE stream.</li> <li>UPDATING - Shards in the stream are being
     *         merged or split. Read and write operations continue to work while the
     *         stream is in the UPDATING state.</li> </ul>
     *
     * @see StreamStatus
     */
    public void setStreamStatus(StreamStatus streamStatus) {
        this.streamStatus = streamStatus.toString();
    }
    
    /**
     * The current status of the stream being described. <p>The stream status
     * is one of the following states: <ul> <li>CREATING - The stream is
     * being created. Upon receiving a <a>CreateStream</a> request, Amazon
     * Kinesis immediately returns and sets <code>StreamStatus</code> to
     * CREATING.</li> <li>DELETING - The stream is being deleted. After a
     * <a>DeleteStream</a> request, the specified stream is in the DELETING
     * state until Amazon Kinesis completes the deletion.</li> <li>ACTIVE -
     * The stream exists and is ready for read and write operations or
     * deletion. You should perform read and write operations only on an
     * ACTIVE stream.</li> <li>UPDATING - Shards in the stream are being
     * merged or split. Read and write operations continue to work while the
     * stream is in the UPDATING state.</li> </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATING, DELETING, ACTIVE, UPDATING
     *
     * @param streamStatus The current status of the stream being described. <p>The stream status
     *         is one of the following states: <ul> <li>CREATING - The stream is
     *         being created. Upon receiving a <a>CreateStream</a> request, Amazon
     *         Kinesis immediately returns and sets <code>StreamStatus</code> to
     *         CREATING.</li> <li>DELETING - The stream is being deleted. After a
     *         <a>DeleteStream</a> request, the specified stream is in the DELETING
     *         state until Amazon Kinesis completes the deletion.</li> <li>ACTIVE -
     *         The stream exists and is ready for read and write operations or
     *         deletion. You should perform read and write operations only on an
     *         ACTIVE stream.</li> <li>UPDATING - Shards in the stream are being
     *         merged or split. Read and write operations continue to work while the
     *         stream is in the UPDATING state.</li> </ul>
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     *
     * @see StreamStatus
     */
    public StreamDescription withStreamStatus(StreamStatus streamStatus) {
        this.streamStatus = streamStatus.toString();
        return this;
    }

    /**
     * The shards that comprise the stream.
     *
     * @return The shards that comprise the stream.
     */
    public java.util.List<Shard> getShards() {
        if (shards == null) {
              shards = new com.amazonaws.internal.ListWithAutoConstructFlag<Shard>();
              shards.setAutoConstruct(true);
        }
        return shards;
    }
    
    /**
     * The shards that comprise the stream.
     *
     * @param shards The shards that comprise the stream.
     */
    public void setShards(java.util.Collection<Shard> shards) {
        if (shards == null) {
            this.shards = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<Shard> shardsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<Shard>(shards.size());
        shardsCopy.addAll(shards);
        this.shards = shardsCopy;
    }
    
    /**
     * The shards that comprise the stream.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param shards The shards that comprise the stream.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public StreamDescription withShards(Shard... shards) {
        if (getShards() == null) setShards(new java.util.ArrayList<Shard>(shards.length));
        for (Shard value : shards) {
            getShards().add(value);
        }
        return this;
    }
    
    /**
     * The shards that comprise the stream.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param shards The shards that comprise the stream.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public StreamDescription withShards(java.util.Collection<Shard> shards) {
        if (shards == null) {
            this.shards = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<Shard> shardsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<Shard>(shards.size());
            shardsCopy.addAll(shards);
            this.shards = shardsCopy;
        }

        return this;
    }

    /**
     * If set to <code>true</code> there are more shards in the stream
     * available to describe.
     *
     * @return If set to <code>true</code> there are more shards in the stream
     *         available to describe.
     */
    public Boolean isHasMoreShards() {
        return hasMoreShards;
    }
    
    /**
     * If set to <code>true</code> there are more shards in the stream
     * available to describe.
     *
     * @param hasMoreShards If set to <code>true</code> there are more shards in the stream
     *         available to describe.
     */
    public void setHasMoreShards(Boolean hasMoreShards) {
        this.hasMoreShards = hasMoreShards;
    }
    
    /**
     * If set to <code>true</code> there are more shards in the stream
     * available to describe.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param hasMoreShards If set to <code>true</code> there are more shards in the stream
     *         available to describe.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public StreamDescription withHasMoreShards(Boolean hasMoreShards) {
        this.hasMoreShards = hasMoreShards;
        return this;
    }

    /**
     * If set to <code>true</code> there are more shards in the stream
     * available to describe.
     *
     * @return If set to <code>true</code> there are more shards in the stream
     *         available to describe.
     */
    public Boolean getHasMoreShards() {
        return hasMoreShards;
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
        if (getStreamARN() != null) sb.append("StreamARN: " + getStreamARN() + ",");
        if (getStreamStatus() != null) sb.append("StreamStatus: " + getStreamStatus() + ",");
        if (getShards() != null) sb.append("Shards: " + getShards() + ",");
        if (isHasMoreShards() != null) sb.append("HasMoreShards: " + isHasMoreShards() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getStreamName() == null) ? 0 : getStreamName().hashCode()); 
        hashCode = prime * hashCode + ((getStreamARN() == null) ? 0 : getStreamARN().hashCode()); 
        hashCode = prime * hashCode + ((getStreamStatus() == null) ? 0 : getStreamStatus().hashCode()); 
        hashCode = prime * hashCode + ((getShards() == null) ? 0 : getShards().hashCode()); 
        hashCode = prime * hashCode + ((isHasMoreShards() == null) ? 0 : isHasMoreShards().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof StreamDescription == false) return false;
        StreamDescription other = (StreamDescription)obj;
        
        if (other.getStreamName() == null ^ this.getStreamName() == null) return false;
        if (other.getStreamName() != null && other.getStreamName().equals(this.getStreamName()) == false) return false; 
        if (other.getStreamARN() == null ^ this.getStreamARN() == null) return false;
        if (other.getStreamARN() != null && other.getStreamARN().equals(this.getStreamARN()) == false) return false; 
        if (other.getStreamStatus() == null ^ this.getStreamStatus() == null) return false;
        if (other.getStreamStatus() != null && other.getStreamStatus().equals(this.getStreamStatus()) == false) return false; 
        if (other.getShards() == null ^ this.getShards() == null) return false;
        if (other.getShards() != null && other.getShards().equals(this.getShards()) == false) return false; 
        if (other.isHasMoreShards() == null ^ this.isHasMoreShards() == null) return false;
        if (other.isHasMoreShards() != null && other.isHasMoreShards().equals(this.isHasMoreShards()) == false) return false; 
        return true;
    }
    
}
    