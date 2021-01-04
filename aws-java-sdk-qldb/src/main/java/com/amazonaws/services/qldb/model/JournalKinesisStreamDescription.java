/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.qldb.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The information about an Amazon QLDB journal stream, including the Amazon Resource Name (ARN), stream name, creation
 * time, current status, and the parameters of your original stream creation request.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qldb-2019-01-02/JournalKinesisStreamDescription"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class JournalKinesisStreamDescription implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the ledger.
     * </p>
     */
    private String ledgerName;
    /**
     * <p>
     * The date and time, in epoch time format, when the QLDB journal stream was created. (Epoch time format is the
     * number of seconds elapsed since 12:00:00 AM January 1, 1970 UTC.)
     * </p>
     */
    private java.util.Date creationTime;
    /**
     * <p>
     * The inclusive start date and time from which to start streaming journal data.
     * </p>
     */
    private java.util.Date inclusiveStartTime;
    /**
     * <p>
     * The exclusive date and time that specifies when the stream ends. If this parameter is blank, the stream runs
     * indefinitely until you cancel it.
     * </p>
     */
    private java.util.Date exclusiveEndTime;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role that grants QLDB permissions for a journal stream to write data
     * records to a Kinesis Data Streams resource.
     * </p>
     */
    private String roleArn;
    /**
     * <p>
     * The unique ID that QLDB assigns to each QLDB journal stream.
     * </p>
     */
    private String streamId;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the QLDB journal stream.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The current state of the QLDB journal stream.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The configuration settings of the Amazon Kinesis Data Streams destination for your QLDB journal stream.
     * </p>
     */
    private KinesisConfiguration kinesisConfiguration;
    /**
     * <p>
     * The error message that describes the reason that a stream has a status of <code>IMPAIRED</code> or
     * <code>FAILED</code>. This is not applicable to streams that have other status values.
     * </p>
     */
    private String errorCause;
    /**
     * <p>
     * The user-defined name of the QLDB journal stream.
     * </p>
     */
    private String streamName;

    /**
     * <p>
     * The name of the ledger.
     * </p>
     * 
     * @param ledgerName
     *        The name of the ledger.
     */

    public void setLedgerName(String ledgerName) {
        this.ledgerName = ledgerName;
    }

    /**
     * <p>
     * The name of the ledger.
     * </p>
     * 
     * @return The name of the ledger.
     */

    public String getLedgerName() {
        return this.ledgerName;
    }

    /**
     * <p>
     * The name of the ledger.
     * </p>
     * 
     * @param ledgerName
     *        The name of the ledger.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JournalKinesisStreamDescription withLedgerName(String ledgerName) {
        setLedgerName(ledgerName);
        return this;
    }

    /**
     * <p>
     * The date and time, in epoch time format, when the QLDB journal stream was created. (Epoch time format is the
     * number of seconds elapsed since 12:00:00 AM January 1, 1970 UTC.)
     * </p>
     * 
     * @param creationTime
     *        The date and time, in epoch time format, when the QLDB journal stream was created. (Epoch time format is
     *        the number of seconds elapsed since 12:00:00 AM January 1, 1970 UTC.)
     */

    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * The date and time, in epoch time format, when the QLDB journal stream was created. (Epoch time format is the
     * number of seconds elapsed since 12:00:00 AM January 1, 1970 UTC.)
     * </p>
     * 
     * @return The date and time, in epoch time format, when the QLDB journal stream was created. (Epoch time format is
     *         the number of seconds elapsed since 12:00:00 AM January 1, 1970 UTC.)
     */

    public java.util.Date getCreationTime() {
        return this.creationTime;
    }

    /**
     * <p>
     * The date and time, in epoch time format, when the QLDB journal stream was created. (Epoch time format is the
     * number of seconds elapsed since 12:00:00 AM January 1, 1970 UTC.)
     * </p>
     * 
     * @param creationTime
     *        The date and time, in epoch time format, when the QLDB journal stream was created. (Epoch time format is
     *        the number of seconds elapsed since 12:00:00 AM January 1, 1970 UTC.)
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JournalKinesisStreamDescription withCreationTime(java.util.Date creationTime) {
        setCreationTime(creationTime);
        return this;
    }

    /**
     * <p>
     * The inclusive start date and time from which to start streaming journal data.
     * </p>
     * 
     * @param inclusiveStartTime
     *        The inclusive start date and time from which to start streaming journal data.
     */

    public void setInclusiveStartTime(java.util.Date inclusiveStartTime) {
        this.inclusiveStartTime = inclusiveStartTime;
    }

    /**
     * <p>
     * The inclusive start date and time from which to start streaming journal data.
     * </p>
     * 
     * @return The inclusive start date and time from which to start streaming journal data.
     */

    public java.util.Date getInclusiveStartTime() {
        return this.inclusiveStartTime;
    }

    /**
     * <p>
     * The inclusive start date and time from which to start streaming journal data.
     * </p>
     * 
     * @param inclusiveStartTime
     *        The inclusive start date and time from which to start streaming journal data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JournalKinesisStreamDescription withInclusiveStartTime(java.util.Date inclusiveStartTime) {
        setInclusiveStartTime(inclusiveStartTime);
        return this;
    }

    /**
     * <p>
     * The exclusive date and time that specifies when the stream ends. If this parameter is blank, the stream runs
     * indefinitely until you cancel it.
     * </p>
     * 
     * @param exclusiveEndTime
     *        The exclusive date and time that specifies when the stream ends. If this parameter is blank, the stream
     *        runs indefinitely until you cancel it.
     */

    public void setExclusiveEndTime(java.util.Date exclusiveEndTime) {
        this.exclusiveEndTime = exclusiveEndTime;
    }

    /**
     * <p>
     * The exclusive date and time that specifies when the stream ends. If this parameter is blank, the stream runs
     * indefinitely until you cancel it.
     * </p>
     * 
     * @return The exclusive date and time that specifies when the stream ends. If this parameter is blank, the stream
     *         runs indefinitely until you cancel it.
     */

    public java.util.Date getExclusiveEndTime() {
        return this.exclusiveEndTime;
    }

    /**
     * <p>
     * The exclusive date and time that specifies when the stream ends. If this parameter is blank, the stream runs
     * indefinitely until you cancel it.
     * </p>
     * 
     * @param exclusiveEndTime
     *        The exclusive date and time that specifies when the stream ends. If this parameter is blank, the stream
     *        runs indefinitely until you cancel it.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JournalKinesisStreamDescription withExclusiveEndTime(java.util.Date exclusiveEndTime) {
        setExclusiveEndTime(exclusiveEndTime);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role that grants QLDB permissions for a journal stream to write data
     * records to a Kinesis Data Streams resource.
     * </p>
     * 
     * @param roleArn
     *        The Amazon Resource Name (ARN) of the IAM role that grants QLDB permissions for a journal stream to write
     *        data records to a Kinesis Data Streams resource.
     */

    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role that grants QLDB permissions for a journal stream to write data
     * records to a Kinesis Data Streams resource.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the IAM role that grants QLDB permissions for a journal stream to write
     *         data records to a Kinesis Data Streams resource.
     */

    public String getRoleArn() {
        return this.roleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role that grants QLDB permissions for a journal stream to write data
     * records to a Kinesis Data Streams resource.
     * </p>
     * 
     * @param roleArn
     *        The Amazon Resource Name (ARN) of the IAM role that grants QLDB permissions for a journal stream to write
     *        data records to a Kinesis Data Streams resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JournalKinesisStreamDescription withRoleArn(String roleArn) {
        setRoleArn(roleArn);
        return this;
    }

    /**
     * <p>
     * The unique ID that QLDB assigns to each QLDB journal stream.
     * </p>
     * 
     * @param streamId
     *        The unique ID that QLDB assigns to each QLDB journal stream.
     */

    public void setStreamId(String streamId) {
        this.streamId = streamId;
    }

    /**
     * <p>
     * The unique ID that QLDB assigns to each QLDB journal stream.
     * </p>
     * 
     * @return The unique ID that QLDB assigns to each QLDB journal stream.
     */

    public String getStreamId() {
        return this.streamId;
    }

    /**
     * <p>
     * The unique ID that QLDB assigns to each QLDB journal stream.
     * </p>
     * 
     * @param streamId
     *        The unique ID that QLDB assigns to each QLDB journal stream.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JournalKinesisStreamDescription withStreamId(String streamId) {
        setStreamId(streamId);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the QLDB journal stream.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the QLDB journal stream.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the QLDB journal stream.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the QLDB journal stream.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the QLDB journal stream.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the QLDB journal stream.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JournalKinesisStreamDescription withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The current state of the QLDB journal stream.
     * </p>
     * 
     * @param status
     *        The current state of the QLDB journal stream.
     * @see StreamStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The current state of the QLDB journal stream.
     * </p>
     * 
     * @return The current state of the QLDB journal stream.
     * @see StreamStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The current state of the QLDB journal stream.
     * </p>
     * 
     * @param status
     *        The current state of the QLDB journal stream.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StreamStatus
     */

    public JournalKinesisStreamDescription withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The current state of the QLDB journal stream.
     * </p>
     * 
     * @param status
     *        The current state of the QLDB journal stream.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StreamStatus
     */

    public JournalKinesisStreamDescription withStatus(StreamStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The configuration settings of the Amazon Kinesis Data Streams destination for your QLDB journal stream.
     * </p>
     * 
     * @param kinesisConfiguration
     *        The configuration settings of the Amazon Kinesis Data Streams destination for your QLDB journal stream.
     */

    public void setKinesisConfiguration(KinesisConfiguration kinesisConfiguration) {
        this.kinesisConfiguration = kinesisConfiguration;
    }

    /**
     * <p>
     * The configuration settings of the Amazon Kinesis Data Streams destination for your QLDB journal stream.
     * </p>
     * 
     * @return The configuration settings of the Amazon Kinesis Data Streams destination for your QLDB journal stream.
     */

    public KinesisConfiguration getKinesisConfiguration() {
        return this.kinesisConfiguration;
    }

    /**
     * <p>
     * The configuration settings of the Amazon Kinesis Data Streams destination for your QLDB journal stream.
     * </p>
     * 
     * @param kinesisConfiguration
     *        The configuration settings of the Amazon Kinesis Data Streams destination for your QLDB journal stream.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JournalKinesisStreamDescription withKinesisConfiguration(KinesisConfiguration kinesisConfiguration) {
        setKinesisConfiguration(kinesisConfiguration);
        return this;
    }

    /**
     * <p>
     * The error message that describes the reason that a stream has a status of <code>IMPAIRED</code> or
     * <code>FAILED</code>. This is not applicable to streams that have other status values.
     * </p>
     * 
     * @param errorCause
     *        The error message that describes the reason that a stream has a status of <code>IMPAIRED</code> or
     *        <code>FAILED</code>. This is not applicable to streams that have other status values.
     * @see ErrorCause
     */

    public void setErrorCause(String errorCause) {
        this.errorCause = errorCause;
    }

    /**
     * <p>
     * The error message that describes the reason that a stream has a status of <code>IMPAIRED</code> or
     * <code>FAILED</code>. This is not applicable to streams that have other status values.
     * </p>
     * 
     * @return The error message that describes the reason that a stream has a status of <code>IMPAIRED</code> or
     *         <code>FAILED</code>. This is not applicable to streams that have other status values.
     * @see ErrorCause
     */

    public String getErrorCause() {
        return this.errorCause;
    }

    /**
     * <p>
     * The error message that describes the reason that a stream has a status of <code>IMPAIRED</code> or
     * <code>FAILED</code>. This is not applicable to streams that have other status values.
     * </p>
     * 
     * @param errorCause
     *        The error message that describes the reason that a stream has a status of <code>IMPAIRED</code> or
     *        <code>FAILED</code>. This is not applicable to streams that have other status values.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ErrorCause
     */

    public JournalKinesisStreamDescription withErrorCause(String errorCause) {
        setErrorCause(errorCause);
        return this;
    }

    /**
     * <p>
     * The error message that describes the reason that a stream has a status of <code>IMPAIRED</code> or
     * <code>FAILED</code>. This is not applicable to streams that have other status values.
     * </p>
     * 
     * @param errorCause
     *        The error message that describes the reason that a stream has a status of <code>IMPAIRED</code> or
     *        <code>FAILED</code>. This is not applicable to streams that have other status values.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ErrorCause
     */

    public JournalKinesisStreamDescription withErrorCause(ErrorCause errorCause) {
        this.errorCause = errorCause.toString();
        return this;
    }

    /**
     * <p>
     * The user-defined name of the QLDB journal stream.
     * </p>
     * 
     * @param streamName
     *        The user-defined name of the QLDB journal stream.
     */

    public void setStreamName(String streamName) {
        this.streamName = streamName;
    }

    /**
     * <p>
     * The user-defined name of the QLDB journal stream.
     * </p>
     * 
     * @return The user-defined name of the QLDB journal stream.
     */

    public String getStreamName() {
        return this.streamName;
    }

    /**
     * <p>
     * The user-defined name of the QLDB journal stream.
     * </p>
     * 
     * @param streamName
     *        The user-defined name of the QLDB journal stream.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JournalKinesisStreamDescription withStreamName(String streamName) {
        setStreamName(streamName);
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
        if (getLedgerName() != null)
            sb.append("LedgerName: ").append(getLedgerName()).append(",");
        if (getCreationTime() != null)
            sb.append("CreationTime: ").append(getCreationTime()).append(",");
        if (getInclusiveStartTime() != null)
            sb.append("InclusiveStartTime: ").append(getInclusiveStartTime()).append(",");
        if (getExclusiveEndTime() != null)
            sb.append("ExclusiveEndTime: ").append(getExclusiveEndTime()).append(",");
        if (getRoleArn() != null)
            sb.append("RoleArn: ").append(getRoleArn()).append(",");
        if (getStreamId() != null)
            sb.append("StreamId: ").append(getStreamId()).append(",");
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getKinesisConfiguration() != null)
            sb.append("KinesisConfiguration: ").append(getKinesisConfiguration()).append(",");
        if (getErrorCause() != null)
            sb.append("ErrorCause: ").append(getErrorCause()).append(",");
        if (getStreamName() != null)
            sb.append("StreamName: ").append(getStreamName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof JournalKinesisStreamDescription == false)
            return false;
        JournalKinesisStreamDescription other = (JournalKinesisStreamDescription) obj;
        if (other.getLedgerName() == null ^ this.getLedgerName() == null)
            return false;
        if (other.getLedgerName() != null && other.getLedgerName().equals(this.getLedgerName()) == false)
            return false;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        if (other.getInclusiveStartTime() == null ^ this.getInclusiveStartTime() == null)
            return false;
        if (other.getInclusiveStartTime() != null && other.getInclusiveStartTime().equals(this.getInclusiveStartTime()) == false)
            return false;
        if (other.getExclusiveEndTime() == null ^ this.getExclusiveEndTime() == null)
            return false;
        if (other.getExclusiveEndTime() != null && other.getExclusiveEndTime().equals(this.getExclusiveEndTime()) == false)
            return false;
        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false)
            return false;
        if (other.getStreamId() == null ^ this.getStreamId() == null)
            return false;
        if (other.getStreamId() != null && other.getStreamId().equals(this.getStreamId()) == false)
            return false;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getKinesisConfiguration() == null ^ this.getKinesisConfiguration() == null)
            return false;
        if (other.getKinesisConfiguration() != null && other.getKinesisConfiguration().equals(this.getKinesisConfiguration()) == false)
            return false;
        if (other.getErrorCause() == null ^ this.getErrorCause() == null)
            return false;
        if (other.getErrorCause() != null && other.getErrorCause().equals(this.getErrorCause()) == false)
            return false;
        if (other.getStreamName() == null ^ this.getStreamName() == null)
            return false;
        if (other.getStreamName() != null && other.getStreamName().equals(this.getStreamName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLedgerName() == null) ? 0 : getLedgerName().hashCode());
        hashCode = prime * hashCode + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode + ((getInclusiveStartTime() == null) ? 0 : getInclusiveStartTime().hashCode());
        hashCode = prime * hashCode + ((getExclusiveEndTime() == null) ? 0 : getExclusiveEndTime().hashCode());
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        hashCode = prime * hashCode + ((getStreamId() == null) ? 0 : getStreamId().hashCode());
        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getKinesisConfiguration() == null) ? 0 : getKinesisConfiguration().hashCode());
        hashCode = prime * hashCode + ((getErrorCause() == null) ? 0 : getErrorCause().hashCode());
        hashCode = prime * hashCode + ((getStreamName() == null) ? 0 : getStreamName().hashCode());
        return hashCode;
    }

    @Override
    public JournalKinesisStreamDescription clone() {
        try {
            return (JournalKinesisStreamDescription) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.qldb.model.transform.JournalKinesisStreamDescriptionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
