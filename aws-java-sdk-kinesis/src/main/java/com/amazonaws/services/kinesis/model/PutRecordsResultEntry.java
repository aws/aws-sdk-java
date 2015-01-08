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
 * Represents the result of an individual record from a
 * <code>PutRecords</code> request. A record that is successfully added
 * to your Amazon Kinesis stream includes SequenceNumber and ShardId in
 * the result. A record that fails to be added to your Amazon Kinesis
 * stream includes ErrorCode and ErrorMessage in the result.
 * </p>
 */
public class PutRecordsResultEntry implements Serializable {

    /**
     * The sequence number for an individual record result.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>0|([1-9]\d{0,128})<br/>
     */
    private String sequenceNumber;

    /**
     * The shard ID for an individual record result.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     */
    private String shardId;

    /**
     * The error code for an individual record result.
     * <code>ErrorCodes</code> can be either
     * <code>ProvisionedThroughputExceededException</code> or
     * <code>InternalFailure</code>.
     */
    private String errorCode;

    /**
     * The error message for an individual record result. An
     * <code>ErrorCode</code> value of
     * <code>ProvisionedThroughputExceededException</code> has an error
     * message that includes the account ID, stream name, and shard ID. An
     * <code>ErrorCode</code> value of <code>InternalFailure</code> has the
     * error message <code>"Internal Service Failure"</code>.
     */
    private String errorMessage;

    /**
     * The sequence number for an individual record result.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>0|([1-9]\d{0,128})<br/>
     *
     * @return The sequence number for an individual record result.
     */
    public String getSequenceNumber() {
        return sequenceNumber;
    }
    
    /**
     * The sequence number for an individual record result.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>0|([1-9]\d{0,128})<br/>
     *
     * @param sequenceNumber The sequence number for an individual record result.
     */
    public void setSequenceNumber(String sequenceNumber) {
        this.sequenceNumber = sequenceNumber;
    }
    
    /**
     * The sequence number for an individual record result.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>0|([1-9]\d{0,128})<br/>
     *
     * @param sequenceNumber The sequence number for an individual record result.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public PutRecordsResultEntry withSequenceNumber(String sequenceNumber) {
        this.sequenceNumber = sequenceNumber;
        return this;
    }

    /**
     * The shard ID for an individual record result.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @return The shard ID for an individual record result.
     */
    public String getShardId() {
        return shardId;
    }
    
    /**
     * The shard ID for an individual record result.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @param shardId The shard ID for an individual record result.
     */
    public void setShardId(String shardId) {
        this.shardId = shardId;
    }
    
    /**
     * The shard ID for an individual record result.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @param shardId The shard ID for an individual record result.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public PutRecordsResultEntry withShardId(String shardId) {
        this.shardId = shardId;
        return this;
    }

    /**
     * The error code for an individual record result.
     * <code>ErrorCodes</code> can be either
     * <code>ProvisionedThroughputExceededException</code> or
     * <code>InternalFailure</code>.
     *
     * @return The error code for an individual record result.
     *         <code>ErrorCodes</code> can be either
     *         <code>ProvisionedThroughputExceededException</code> or
     *         <code>InternalFailure</code>.
     */
    public String getErrorCode() {
        return errorCode;
    }
    
    /**
     * The error code for an individual record result.
     * <code>ErrorCodes</code> can be either
     * <code>ProvisionedThroughputExceededException</code> or
     * <code>InternalFailure</code>.
     *
     * @param errorCode The error code for an individual record result.
     *         <code>ErrorCodes</code> can be either
     *         <code>ProvisionedThroughputExceededException</code> or
     *         <code>InternalFailure</code>.
     */
    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }
    
    /**
     * The error code for an individual record result.
     * <code>ErrorCodes</code> can be either
     * <code>ProvisionedThroughputExceededException</code> or
     * <code>InternalFailure</code>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param errorCode The error code for an individual record result.
     *         <code>ErrorCodes</code> can be either
     *         <code>ProvisionedThroughputExceededException</code> or
     *         <code>InternalFailure</code>.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public PutRecordsResultEntry withErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }

    /**
     * The error message for an individual record result. An
     * <code>ErrorCode</code> value of
     * <code>ProvisionedThroughputExceededException</code> has an error
     * message that includes the account ID, stream name, and shard ID. An
     * <code>ErrorCode</code> value of <code>InternalFailure</code> has the
     * error message <code>"Internal Service Failure"</code>.
     *
     * @return The error message for an individual record result. An
     *         <code>ErrorCode</code> value of
     *         <code>ProvisionedThroughputExceededException</code> has an error
     *         message that includes the account ID, stream name, and shard ID. An
     *         <code>ErrorCode</code> value of <code>InternalFailure</code> has the
     *         error message <code>"Internal Service Failure"</code>.
     */
    public String getErrorMessage() {
        return errorMessage;
    }
    
    /**
     * The error message for an individual record result. An
     * <code>ErrorCode</code> value of
     * <code>ProvisionedThroughputExceededException</code> has an error
     * message that includes the account ID, stream name, and shard ID. An
     * <code>ErrorCode</code> value of <code>InternalFailure</code> has the
     * error message <code>"Internal Service Failure"</code>.
     *
     * @param errorMessage The error message for an individual record result. An
     *         <code>ErrorCode</code> value of
     *         <code>ProvisionedThroughputExceededException</code> has an error
     *         message that includes the account ID, stream name, and shard ID. An
     *         <code>ErrorCode</code> value of <code>InternalFailure</code> has the
     *         error message <code>"Internal Service Failure"</code>.
     */
    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }
    
    /**
     * The error message for an individual record result. An
     * <code>ErrorCode</code> value of
     * <code>ProvisionedThroughputExceededException</code> has an error
     * message that includes the account ID, stream name, and shard ID. An
     * <code>ErrorCode</code> value of <code>InternalFailure</code> has the
     * error message <code>"Internal Service Failure"</code>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param errorMessage The error message for an individual record result. An
     *         <code>ErrorCode</code> value of
     *         <code>ProvisionedThroughputExceededException</code> has an error
     *         message that includes the account ID, stream name, and shard ID. An
     *         <code>ErrorCode</code> value of <code>InternalFailure</code> has the
     *         error message <code>"Internal Service Failure"</code>.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public PutRecordsResultEntry withErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
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
        if (getShardId() != null) sb.append("ShardId: " + getShardId() + ",");
        if (getErrorCode() != null) sb.append("ErrorCode: " + getErrorCode() + ",");
        if (getErrorMessage() != null) sb.append("ErrorMessage: " + getErrorMessage() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getSequenceNumber() == null) ? 0 : getSequenceNumber().hashCode()); 
        hashCode = prime * hashCode + ((getShardId() == null) ? 0 : getShardId().hashCode()); 
        hashCode = prime * hashCode + ((getErrorCode() == null) ? 0 : getErrorCode().hashCode()); 
        hashCode = prime * hashCode + ((getErrorMessage() == null) ? 0 : getErrorMessage().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof PutRecordsResultEntry == false) return false;
        PutRecordsResultEntry other = (PutRecordsResultEntry)obj;
        
        if (other.getSequenceNumber() == null ^ this.getSequenceNumber() == null) return false;
        if (other.getSequenceNumber() != null && other.getSequenceNumber().equals(this.getSequenceNumber()) == false) return false; 
        if (other.getShardId() == null ^ this.getShardId() == null) return false;
        if (other.getShardId() != null && other.getShardId().equals(this.getShardId()) == false) return false; 
        if (other.getErrorCode() == null ^ this.getErrorCode() == null) return false;
        if (other.getErrorCode() != null && other.getErrorCode().equals(this.getErrorCode()) == false) return false; 
        if (other.getErrorMessage() == null ^ this.getErrorMessage() == null) return false;
        if (other.getErrorMessage() != null && other.getErrorMessage().equals(this.getErrorMessage()) == false) return false; 
        return true;
    }
    
}
    