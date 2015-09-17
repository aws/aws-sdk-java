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

package com.amazonaws.services.logs.model;

import java.io.Serializable;

/**
 * <p>
 * A log stream is sequence of log events from a single emitter of logs.
 * </p>
 */
public class LogStream implements Serializable, Cloneable {

    private String logStreamName;

    private Long creationTime;

    private Long firstEventTimestamp;

    private Long lastEventTimestamp;

    private Long lastIngestionTime;

    private String uploadSequenceToken;

    private String arn;

    private Long storedBytes;

    /**
     * Sets the value of the LogStreamName property for this object.
     * 
     * @param logStreamName
     *        The new value for the LogStreamName property for this object.
     */
    public void setLogStreamName(String logStreamName) {
        this.logStreamName = logStreamName;
    }

    /**
     * Returns the value of the LogStreamName property for this object.
     * 
     * @return The value of the LogStreamName property for this object.
     */
    public String getLogStreamName() {
        return this.logStreamName;
    }

    /**
     * Sets the value of the LogStreamName property for this object.
     * 
     * @param logStreamName
     *        The new value for the LogStreamName property for this object.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public LogStream withLogStreamName(String logStreamName) {
        setLogStreamName(logStreamName);
        return this;
    }

    /**
     * Sets the value of the CreationTime property for this object.
     * 
     * @param creationTime
     *        The new value for the CreationTime property for this object.
     */
    public void setCreationTime(Long creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * Returns the value of the CreationTime property for this object.
     * 
     * @return The value of the CreationTime property for this object.
     */
    public Long getCreationTime() {
        return this.creationTime;
    }

    /**
     * Sets the value of the CreationTime property for this object.
     * 
     * @param creationTime
     *        The new value for the CreationTime property for this object.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public LogStream withCreationTime(Long creationTime) {
        setCreationTime(creationTime);
        return this;
    }

    /**
     * Sets the value of the FirstEventTimestamp property for this object.
     * 
     * @param firstEventTimestamp
     *        The new value for the FirstEventTimestamp property for this
     *        object.
     */
    public void setFirstEventTimestamp(Long firstEventTimestamp) {
        this.firstEventTimestamp = firstEventTimestamp;
    }

    /**
     * Returns the value of the FirstEventTimestamp property for this object.
     * 
     * @return The value of the FirstEventTimestamp property for this object.
     */
    public Long getFirstEventTimestamp() {
        return this.firstEventTimestamp;
    }

    /**
     * Sets the value of the FirstEventTimestamp property for this object.
     * 
     * @param firstEventTimestamp
     *        The new value for the FirstEventTimestamp property for this
     *        object.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public LogStream withFirstEventTimestamp(Long firstEventTimestamp) {
        setFirstEventTimestamp(firstEventTimestamp);
        return this;
    }

    /**
     * Sets the value of the LastEventTimestamp property for this object.
     * 
     * @param lastEventTimestamp
     *        The new value for the LastEventTimestamp property for this object.
     */
    public void setLastEventTimestamp(Long lastEventTimestamp) {
        this.lastEventTimestamp = lastEventTimestamp;
    }

    /**
     * Returns the value of the LastEventTimestamp property for this object.
     * 
     * @return The value of the LastEventTimestamp property for this object.
     */
    public Long getLastEventTimestamp() {
        return this.lastEventTimestamp;
    }

    /**
     * Sets the value of the LastEventTimestamp property for this object.
     * 
     * @param lastEventTimestamp
     *        The new value for the LastEventTimestamp property for this object.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public LogStream withLastEventTimestamp(Long lastEventTimestamp) {
        setLastEventTimestamp(lastEventTimestamp);
        return this;
    }

    /**
     * Sets the value of the LastIngestionTime property for this object.
     * 
     * @param lastIngestionTime
     *        The new value for the LastIngestionTime property for this object.
     */
    public void setLastIngestionTime(Long lastIngestionTime) {
        this.lastIngestionTime = lastIngestionTime;
    }

    /**
     * Returns the value of the LastIngestionTime property for this object.
     * 
     * @return The value of the LastIngestionTime property for this object.
     */
    public Long getLastIngestionTime() {
        return this.lastIngestionTime;
    }

    /**
     * Sets the value of the LastIngestionTime property for this object.
     * 
     * @param lastIngestionTime
     *        The new value for the LastIngestionTime property for this object.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public LogStream withLastIngestionTime(Long lastIngestionTime) {
        setLastIngestionTime(lastIngestionTime);
        return this;
    }

    /**
     * Sets the value of the UploadSequenceToken property for this object.
     * 
     * @param uploadSequenceToken
     *        The new value for the UploadSequenceToken property for this
     *        object.
     */
    public void setUploadSequenceToken(String uploadSequenceToken) {
        this.uploadSequenceToken = uploadSequenceToken;
    }

    /**
     * Returns the value of the UploadSequenceToken property for this object.
     * 
     * @return The value of the UploadSequenceToken property for this object.
     */
    public String getUploadSequenceToken() {
        return this.uploadSequenceToken;
    }

    /**
     * Sets the value of the UploadSequenceToken property for this object.
     * 
     * @param uploadSequenceToken
     *        The new value for the UploadSequenceToken property for this
     *        object.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public LogStream withUploadSequenceToken(String uploadSequenceToken) {
        setUploadSequenceToken(uploadSequenceToken);
        return this;
    }

    /**
     * Sets the value of the Arn property for this object.
     * 
     * @param arn
     *        The new value for the Arn property for this object.
     */
    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * Returns the value of the Arn property for this object.
     * 
     * @return The value of the Arn property for this object.
     */
    public String getArn() {
        return this.arn;
    }

    /**
     * Sets the value of the Arn property for this object.
     * 
     * @param arn
     *        The new value for the Arn property for this object.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public LogStream withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * Sets the value of the StoredBytes property for this object.
     * 
     * @param storedBytes
     *        The new value for the StoredBytes property for this object.
     */
    public void setStoredBytes(Long storedBytes) {
        this.storedBytes = storedBytes;
    }

    /**
     * Returns the value of the StoredBytes property for this object.
     * 
     * @return The value of the StoredBytes property for this object.
     */
    public Long getStoredBytes() {
        return this.storedBytes;
    }

    /**
     * Sets the value of the StoredBytes property for this object.
     * 
     * @param storedBytes
     *        The new value for the StoredBytes property for this object.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public LogStream withStoredBytes(Long storedBytes) {
        setStoredBytes(storedBytes);
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
        if (other.getLogStreamName() != null
                && other.getLogStreamName().equals(this.getLogStreamName()) == false)
            return false;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null
                && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        if (other.getFirstEventTimestamp() == null
                ^ this.getFirstEventTimestamp() == null)
            return false;
        if (other.getFirstEventTimestamp() != null
                && other.getFirstEventTimestamp().equals(
                        this.getFirstEventTimestamp()) == false)
            return false;
        if (other.getLastEventTimestamp() == null
                ^ this.getLastEventTimestamp() == null)
            return false;
        if (other.getLastEventTimestamp() != null
                && other.getLastEventTimestamp().equals(
                        this.getLastEventTimestamp()) == false)
            return false;
        if (other.getLastIngestionTime() == null
                ^ this.getLastIngestionTime() == null)
            return false;
        if (other.getLastIngestionTime() != null
                && other.getLastIngestionTime().equals(
                        this.getLastIngestionTime()) == false)
            return false;
        if (other.getUploadSequenceToken() == null
                ^ this.getUploadSequenceToken() == null)
            return false;
        if (other.getUploadSequenceToken() != null
                && other.getUploadSequenceToken().equals(
                        this.getUploadSequenceToken()) == false)
            return false;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null
                && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getStoredBytes() == null ^ this.getStoredBytes() == null)
            return false;
        if (other.getStoredBytes() != null
                && other.getStoredBytes().equals(this.getStoredBytes()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getLogStreamName() == null) ? 0 : getLogStreamName()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getCreationTime() == null) ? 0 : getCreationTime()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getFirstEventTimestamp() == null) ? 0
                        : getFirstEventTimestamp().hashCode());
        hashCode = prime
                * hashCode
                + ((getLastEventTimestamp() == null) ? 0
                        : getLastEventTimestamp().hashCode());
        hashCode = prime
                * hashCode
                + ((getLastIngestionTime() == null) ? 0
                        : getLastIngestionTime().hashCode());
        hashCode = prime
                * hashCode
                + ((getUploadSequenceToken() == null) ? 0
                        : getUploadSequenceToken().hashCode());
        hashCode = prime * hashCode
                + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime
                * hashCode
                + ((getStoredBytes() == null) ? 0 : getStoredBytes().hashCode());
        return hashCode;
    }

    @Override
    public LogStream clone() {
        try {
            return (LogStream) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}