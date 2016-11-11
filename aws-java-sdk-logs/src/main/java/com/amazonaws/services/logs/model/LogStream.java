/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.logs.model;

import java.io.Serializable;

/**
 * <p>
 * Represents a log stream, which is a sequence of log events from a single emitter of logs.
 * </p>
 */
public class LogStream implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the log stream.
     * </p>
     */
    private String logStreamName;
    /**
     * <p>
     * The creation time of the stream.
     * </p>
     */
    private Long creationTime;
    /**
     * <p>
     * The time of the first event.
     * </p>
     */
    private Long firstEventTimestamp;
    /**
     * <p>
     * The time of the last event.
     * </p>
     */
    private Long lastEventTimestamp;
    /**
     * <p>
     * The ingestion time.
     * </p>
     */
    private Long lastIngestionTime;
    /**
     * <p>
     * The sequence token.
     * </p>
     */
    private String uploadSequenceToken;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the log stream.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The number of bytes stored.
     * </p>
     */
    private Long storedBytes;

    /**
     * <p>
     * The name of the log stream.
     * </p>
     * 
     * @param logStreamName
     *        The name of the log stream.
     */

    public void setLogStreamName(String logStreamName) {
        this.logStreamName = logStreamName;
    }

    /**
     * <p>
     * The name of the log stream.
     * </p>
     * 
     * @return The name of the log stream.
     */

    public String getLogStreamName() {
        return this.logStreamName;
    }

    /**
     * <p>
     * The name of the log stream.
     * </p>
     * 
     * @param logStreamName
     *        The name of the log stream.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LogStream withLogStreamName(String logStreamName) {
        setLogStreamName(logStreamName);
        return this;
    }

    /**
     * <p>
     * The creation time of the stream.
     * </p>
     * 
     * @param creationTime
     *        The creation time of the stream.
     */

    public void setCreationTime(Long creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * The creation time of the stream.
     * </p>
     * 
     * @return The creation time of the stream.
     */

    public Long getCreationTime() {
        return this.creationTime;
    }

    /**
     * <p>
     * The creation time of the stream.
     * </p>
     * 
     * @param creationTime
     *        The creation time of the stream.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LogStream withCreationTime(Long creationTime) {
        setCreationTime(creationTime);
        return this;
    }

    /**
     * <p>
     * The time of the first event.
     * </p>
     * 
     * @param firstEventTimestamp
     *        The time of the first event.
     */

    public void setFirstEventTimestamp(Long firstEventTimestamp) {
        this.firstEventTimestamp = firstEventTimestamp;
    }

    /**
     * <p>
     * The time of the first event.
     * </p>
     * 
     * @return The time of the first event.
     */

    public Long getFirstEventTimestamp() {
        return this.firstEventTimestamp;
    }

    /**
     * <p>
     * The time of the first event.
     * </p>
     * 
     * @param firstEventTimestamp
     *        The time of the first event.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LogStream withFirstEventTimestamp(Long firstEventTimestamp) {
        setFirstEventTimestamp(firstEventTimestamp);
        return this;
    }

    /**
     * <p>
     * The time of the last event.
     * </p>
     * 
     * @param lastEventTimestamp
     *        The time of the last event.
     */

    public void setLastEventTimestamp(Long lastEventTimestamp) {
        this.lastEventTimestamp = lastEventTimestamp;
    }

    /**
     * <p>
     * The time of the last event.
     * </p>
     * 
     * @return The time of the last event.
     */

    public Long getLastEventTimestamp() {
        return this.lastEventTimestamp;
    }

    /**
     * <p>
     * The time of the last event.
     * </p>
     * 
     * @param lastEventTimestamp
     *        The time of the last event.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LogStream withLastEventTimestamp(Long lastEventTimestamp) {
        setLastEventTimestamp(lastEventTimestamp);
        return this;
    }

    /**
     * <p>
     * The ingestion time.
     * </p>
     * 
     * @param lastIngestionTime
     *        The ingestion time.
     */

    public void setLastIngestionTime(Long lastIngestionTime) {
        this.lastIngestionTime = lastIngestionTime;
    }

    /**
     * <p>
     * The ingestion time.
     * </p>
     * 
     * @return The ingestion time.
     */

    public Long getLastIngestionTime() {
        return this.lastIngestionTime;
    }

    /**
     * <p>
     * The ingestion time.
     * </p>
     * 
     * @param lastIngestionTime
     *        The ingestion time.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LogStream withLastIngestionTime(Long lastIngestionTime) {
        setLastIngestionTime(lastIngestionTime);
        return this;
    }

    /**
     * <p>
     * The sequence token.
     * </p>
     * 
     * @param uploadSequenceToken
     *        The sequence token.
     */

    public void setUploadSequenceToken(String uploadSequenceToken) {
        this.uploadSequenceToken = uploadSequenceToken;
    }

    /**
     * <p>
     * The sequence token.
     * </p>
     * 
     * @return The sequence token.
     */

    public String getUploadSequenceToken() {
        return this.uploadSequenceToken;
    }

    /**
     * <p>
     * The sequence token.
     * </p>
     * 
     * @param uploadSequenceToken
     *        The sequence token.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LogStream withUploadSequenceToken(String uploadSequenceToken) {
        setUploadSequenceToken(uploadSequenceToken);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the log stream.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the log stream.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the log stream.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the log stream.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the log stream.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the log stream.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LogStream withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The number of bytes stored.
     * </p>
     * 
     * @param storedBytes
     *        The number of bytes stored.
     */

    public void setStoredBytes(Long storedBytes) {
        this.storedBytes = storedBytes;
    }

    /**
     * <p>
     * The number of bytes stored.
     * </p>
     * 
     * @return The number of bytes stored.
     */

    public Long getStoredBytes() {
        return this.storedBytes;
    }

    /**
     * <p>
     * The number of bytes stored.
     * </p>
     * 
     * @param storedBytes
     *        The number of bytes stored.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LogStream withStoredBytes(Long storedBytes) {
        setStoredBytes(storedBytes);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getLogStreamName() != null)
            sb.append("LogStreamName: " + getLogStreamName() + ",");
        if (getCreationTime() != null)
            sb.append("CreationTime: " + getCreationTime() + ",");
        if (getFirstEventTimestamp() != null)
            sb.append("FirstEventTimestamp: " + getFirstEventTimestamp() + ",");
        if (getLastEventTimestamp() != null)
            sb.append("LastEventTimestamp: " + getLastEventTimestamp() + ",");
        if (getLastIngestionTime() != null)
            sb.append("LastIngestionTime: " + getLastIngestionTime() + ",");
        if (getUploadSequenceToken() != null)
            sb.append("UploadSequenceToken: " + getUploadSequenceToken() + ",");
        if (getArn() != null)
            sb.append("Arn: " + getArn() + ",");
        if (getStoredBytes() != null)
            sb.append("StoredBytes: " + getStoredBytes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LogStream == false)
            return false;
        LogStream other = (LogStream) obj;
        if (other.getLogStreamName() == null ^ this.getLogStreamName() == null)
            return false;
        if (other.getLogStreamName() != null && other.getLogStreamName().equals(this.getLogStreamName()) == false)
            return false;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        if (other.getFirstEventTimestamp() == null ^ this.getFirstEventTimestamp() == null)
            return false;
        if (other.getFirstEventTimestamp() != null && other.getFirstEventTimestamp().equals(this.getFirstEventTimestamp()) == false)
            return false;
        if (other.getLastEventTimestamp() == null ^ this.getLastEventTimestamp() == null)
            return false;
        if (other.getLastEventTimestamp() != null && other.getLastEventTimestamp().equals(this.getLastEventTimestamp()) == false)
            return false;
        if (other.getLastIngestionTime() == null ^ this.getLastIngestionTime() == null)
            return false;
        if (other.getLastIngestionTime() != null && other.getLastIngestionTime().equals(this.getLastIngestionTime()) == false)
            return false;
        if (other.getUploadSequenceToken() == null ^ this.getUploadSequenceToken() == null)
            return false;
        if (other.getUploadSequenceToken() != null && other.getUploadSequenceToken().equals(this.getUploadSequenceToken()) == false)
            return false;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getStoredBytes() == null ^ this.getStoredBytes() == null)
            return false;
        if (other.getStoredBytes() != null && other.getStoredBytes().equals(this.getStoredBytes()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLogStreamName() == null) ? 0 : getLogStreamName().hashCode());
        hashCode = prime * hashCode + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode + ((getFirstEventTimestamp() == null) ? 0 : getFirstEventTimestamp().hashCode());
        hashCode = prime * hashCode + ((getLastEventTimestamp() == null) ? 0 : getLastEventTimestamp().hashCode());
        hashCode = prime * hashCode + ((getLastIngestionTime() == null) ? 0 : getLastIngestionTime().hashCode());
        hashCode = prime * hashCode + ((getUploadSequenceToken() == null) ? 0 : getUploadSequenceToken().hashCode());
        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getStoredBytes() == null) ? 0 : getStoredBytes().hashCode());
        return hashCode;
    }

    @Override
    public LogStream clone() {
        try {
            return (LogStream) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
