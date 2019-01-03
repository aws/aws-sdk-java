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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Represents the result of an individual record from a <code>PutRecords</code> request. A record that is successfully
 * added to a stream includes <code>SequenceNumber</code> and <code>ShardId</code> in the result. A record that fails to
 * be added to the stream includes <code>ErrorCode</code> and <code>ErrorMessage</code> in the result.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesis-2013-12-02/PutRecordsResultEntry" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PutRecordsResultEntry implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The sequence number for an individual record result.
     * </p>
     */
    private String sequenceNumber;
    /**
     * <p>
     * The shard ID for an individual record result.
     * </p>
     */
    private String shardId;
    /**
     * <p>
     * The error code for an individual record result. <code>ErrorCodes</code> can be either
     * <code>ProvisionedThroughputExceededException</code> or <code>InternalFailure</code>.
     * </p>
     */
    private String errorCode;
    /**
     * <p>
     * The error message for an individual record result. An <code>ErrorCode</code> value of
     * <code>ProvisionedThroughputExceededException</code> has an error message that includes the account ID, stream
     * name, and shard ID. An <code>ErrorCode</code> value of <code>InternalFailure</code> has the error message
     * <code>"Internal Service Failure"</code>.
     * </p>
     */
    private String errorMessage;

    /**
     * <p>
     * The sequence number for an individual record result.
     * </p>
     * 
     * @param sequenceNumber
     *        The sequence number for an individual record result.
     */

    public void setSequenceNumber(String sequenceNumber) {
        this.sequenceNumber = sequenceNumber;
    }

    /**
     * <p>
     * The sequence number for an individual record result.
     * </p>
     * 
     * @return The sequence number for an individual record result.
     */

    public String getSequenceNumber() {
        return this.sequenceNumber;
    }

    /**
     * <p>
     * The sequence number for an individual record result.
     * </p>
     * 
     * @param sequenceNumber
     *        The sequence number for an individual record result.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutRecordsResultEntry withSequenceNumber(String sequenceNumber) {
        setSequenceNumber(sequenceNumber);
        return this;
    }

    /**
     * <p>
     * The shard ID for an individual record result.
     * </p>
     * 
     * @param shardId
     *        The shard ID for an individual record result.
     */

    public void setShardId(String shardId) {
        this.shardId = shardId;
    }

    /**
     * <p>
     * The shard ID for an individual record result.
     * </p>
     * 
     * @return The shard ID for an individual record result.
     */

    public String getShardId() {
        return this.shardId;
    }

    /**
     * <p>
     * The shard ID for an individual record result.
     * </p>
     * 
     * @param shardId
     *        The shard ID for an individual record result.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutRecordsResultEntry withShardId(String shardId) {
        setShardId(shardId);
        return this;
    }

    /**
     * <p>
     * The error code for an individual record result. <code>ErrorCodes</code> can be either
     * <code>ProvisionedThroughputExceededException</code> or <code>InternalFailure</code>.
     * </p>
     * 
     * @param errorCode
     *        The error code for an individual record result. <code>ErrorCodes</code> can be either
     *        <code>ProvisionedThroughputExceededException</code> or <code>InternalFailure</code>.
     */

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    /**
     * <p>
     * The error code for an individual record result. <code>ErrorCodes</code> can be either
     * <code>ProvisionedThroughputExceededException</code> or <code>InternalFailure</code>.
     * </p>
     * 
     * @return The error code for an individual record result. <code>ErrorCodes</code> can be either
     *         <code>ProvisionedThroughputExceededException</code> or <code>InternalFailure</code>.
     */

    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * <p>
     * The error code for an individual record result. <code>ErrorCodes</code> can be either
     * <code>ProvisionedThroughputExceededException</code> or <code>InternalFailure</code>.
     * </p>
     * 
     * @param errorCode
     *        The error code for an individual record result. <code>ErrorCodes</code> can be either
     *        <code>ProvisionedThroughputExceededException</code> or <code>InternalFailure</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutRecordsResultEntry withErrorCode(String errorCode) {
        setErrorCode(errorCode);
        return this;
    }

    /**
     * <p>
     * The error message for an individual record result. An <code>ErrorCode</code> value of
     * <code>ProvisionedThroughputExceededException</code> has an error message that includes the account ID, stream
     * name, and shard ID. An <code>ErrorCode</code> value of <code>InternalFailure</code> has the error message
     * <code>"Internal Service Failure"</code>.
     * </p>
     * 
     * @param errorMessage
     *        The error message for an individual record result. An <code>ErrorCode</code> value of
     *        <code>ProvisionedThroughputExceededException</code> has an error message that includes the account ID,
     *        stream name, and shard ID. An <code>ErrorCode</code> value of <code>InternalFailure</code> has the error
     *        message <code>"Internal Service Failure"</code>.
     */

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    /**
     * <p>
     * The error message for an individual record result. An <code>ErrorCode</code> value of
     * <code>ProvisionedThroughputExceededException</code> has an error message that includes the account ID, stream
     * name, and shard ID. An <code>ErrorCode</code> value of <code>InternalFailure</code> has the error message
     * <code>"Internal Service Failure"</code>.
     * </p>
     * 
     * @return The error message for an individual record result. An <code>ErrorCode</code> value of
     *         <code>ProvisionedThroughputExceededException</code> has an error message that includes the account ID,
     *         stream name, and shard ID. An <code>ErrorCode</code> value of <code>InternalFailure</code> has the error
     *         message <code>"Internal Service Failure"</code>.
     */

    public String getErrorMessage() {
        return this.errorMessage;
    }

    /**
     * <p>
     * The error message for an individual record result. An <code>ErrorCode</code> value of
     * <code>ProvisionedThroughputExceededException</code> has an error message that includes the account ID, stream
     * name, and shard ID. An <code>ErrorCode</code> value of <code>InternalFailure</code> has the error message
     * <code>"Internal Service Failure"</code>.
     * </p>
     * 
     * @param errorMessage
     *        The error message for an individual record result. An <code>ErrorCode</code> value of
     *        <code>ProvisionedThroughputExceededException</code> has an error message that includes the account ID,
     *        stream name, and shard ID. An <code>ErrorCode</code> value of <code>InternalFailure</code> has the error
     *        message <code>"Internal Service Failure"</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutRecordsResultEntry withErrorMessage(String errorMessage) {
        setErrorMessage(errorMessage);
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
        if (getSequenceNumber() != null)
            sb.append("SequenceNumber: ").append(getSequenceNumber()).append(",");
        if (getShardId() != null)
            sb.append("ShardId: ").append(getShardId()).append(",");
        if (getErrorCode() != null)
            sb.append("ErrorCode: ").append(getErrorCode()).append(",");
        if (getErrorMessage() != null)
            sb.append("ErrorMessage: ").append(getErrorMessage());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PutRecordsResultEntry == false)
            return false;
        PutRecordsResultEntry other = (PutRecordsResultEntry) obj;
        if (other.getSequenceNumber() == null ^ this.getSequenceNumber() == null)
            return false;
        if (other.getSequenceNumber() != null && other.getSequenceNumber().equals(this.getSequenceNumber()) == false)
            return false;
        if (other.getShardId() == null ^ this.getShardId() == null)
            return false;
        if (other.getShardId() != null && other.getShardId().equals(this.getShardId()) == false)
            return false;
        if (other.getErrorCode() == null ^ this.getErrorCode() == null)
            return false;
        if (other.getErrorCode() != null && other.getErrorCode().equals(this.getErrorCode()) == false)
            return false;
        if (other.getErrorMessage() == null ^ this.getErrorMessage() == null)
            return false;
        if (other.getErrorMessage() != null && other.getErrorMessage().equals(this.getErrorMessage()) == false)
            return false;
        return true;
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
    public PutRecordsResultEntry clone() {
        try {
            return (PutRecordsResultEntry) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.kinesis.model.transform.PutRecordsResultEntryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
