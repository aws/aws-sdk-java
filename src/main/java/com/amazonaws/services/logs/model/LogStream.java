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
package com.amazonaws.services.logs.model;

import java.io.Serializable;

/**
 * <p>
 * A log stream is sequence of log events that share the same emitter.
 * </p>
 */
public class LogStream implements Serializable {

    private String logStreamName;

    /**
     * A point in time expressed as the number milliseconds since Jan 1, 1970
     * 00:00:00 UTC.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     */
    private Long creationTime;

    /**
     * A point in time expressed as the number milliseconds since Jan 1, 1970
     * 00:00:00 UTC.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     */
    private Long firstEventTimestamp;

    /**
     * A point in time expressed as the number milliseconds since Jan 1, 1970
     * 00:00:00 UTC.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     */
    private Long lastEventTimestamp;

    /**
     * A point in time expressed as the number milliseconds since Jan 1, 1970
     * 00:00:00 UTC.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     */
    private Long lastIngestionTime;

    /**
     * A string token used for making PutLogEvents requests. A <code
     * class="code">sequenceToken</code> can only be used once, and
     * PutLogEvents requests must include the <code
     * class="code">sequenceToken</code> obtained from the response of the
     * previous request.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     */
    private String uploadSequenceToken;

    private String arn;

    private Long storedBytes;

    /**
     * Returns the value of the LogStreamName property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     * <b>Pattern: </b>[^:*]*<br/>
     *
     * @return The value of the LogStreamName property for this object.
     */
    public String getLogStreamName() {
        return logStreamName;
    }
    
    /**
     * Sets the value of the LogStreamName property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     * <b>Pattern: </b>[^:*]*<br/>
     *
     * @param logStreamName The new value for the LogStreamName property for this object.
     */
    public void setLogStreamName(String logStreamName) {
        this.logStreamName = logStreamName;
    }
    
    /**
     * Sets the value of the LogStreamName property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     * <b>Pattern: </b>[^:*]*<br/>
     *
     * @param logStreamName The new value for the LogStreamName property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public LogStream withLogStreamName(String logStreamName) {
        this.logStreamName = logStreamName;
        return this;
    }

    /**
     * A point in time expressed as the number milliseconds since Jan 1, 1970
     * 00:00:00 UTC.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @return A point in time expressed as the number milliseconds since Jan 1, 1970
     *         00:00:00 UTC.
     */
    public Long getCreationTime() {
        return creationTime;
    }
    
    /**
     * A point in time expressed as the number milliseconds since Jan 1, 1970
     * 00:00:00 UTC.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param creationTime A point in time expressed as the number milliseconds since Jan 1, 1970
     *         00:00:00 UTC.
     */
    public void setCreationTime(Long creationTime) {
        this.creationTime = creationTime;
    }
    
    /**
     * A point in time expressed as the number milliseconds since Jan 1, 1970
     * 00:00:00 UTC.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param creationTime A point in time expressed as the number milliseconds since Jan 1, 1970
     *         00:00:00 UTC.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public LogStream withCreationTime(Long creationTime) {
        this.creationTime = creationTime;
        return this;
    }

    /**
     * A point in time expressed as the number milliseconds since Jan 1, 1970
     * 00:00:00 UTC.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @return A point in time expressed as the number milliseconds since Jan 1, 1970
     *         00:00:00 UTC.
     */
    public Long getFirstEventTimestamp() {
        return firstEventTimestamp;
    }
    
    /**
     * A point in time expressed as the number milliseconds since Jan 1, 1970
     * 00:00:00 UTC.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param firstEventTimestamp A point in time expressed as the number milliseconds since Jan 1, 1970
     *         00:00:00 UTC.
     */
    public void setFirstEventTimestamp(Long firstEventTimestamp) {
        this.firstEventTimestamp = firstEventTimestamp;
    }
    
    /**
     * A point in time expressed as the number milliseconds since Jan 1, 1970
     * 00:00:00 UTC.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param firstEventTimestamp A point in time expressed as the number milliseconds since Jan 1, 1970
     *         00:00:00 UTC.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public LogStream withFirstEventTimestamp(Long firstEventTimestamp) {
        this.firstEventTimestamp = firstEventTimestamp;
        return this;
    }

    /**
     * A point in time expressed as the number milliseconds since Jan 1, 1970
     * 00:00:00 UTC.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @return A point in time expressed as the number milliseconds since Jan 1, 1970
     *         00:00:00 UTC.
     */
    public Long getLastEventTimestamp() {
        return lastEventTimestamp;
    }
    
    /**
     * A point in time expressed as the number milliseconds since Jan 1, 1970
     * 00:00:00 UTC.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param lastEventTimestamp A point in time expressed as the number milliseconds since Jan 1, 1970
     *         00:00:00 UTC.
     */
    public void setLastEventTimestamp(Long lastEventTimestamp) {
        this.lastEventTimestamp = lastEventTimestamp;
    }
    
    /**
     * A point in time expressed as the number milliseconds since Jan 1, 1970
     * 00:00:00 UTC.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param lastEventTimestamp A point in time expressed as the number milliseconds since Jan 1, 1970
     *         00:00:00 UTC.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public LogStream withLastEventTimestamp(Long lastEventTimestamp) {
        this.lastEventTimestamp = lastEventTimestamp;
        return this;
    }

    /**
     * A point in time expressed as the number milliseconds since Jan 1, 1970
     * 00:00:00 UTC.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @return A point in time expressed as the number milliseconds since Jan 1, 1970
     *         00:00:00 UTC.
     */
    public Long getLastIngestionTime() {
        return lastIngestionTime;
    }
    
    /**
     * A point in time expressed as the number milliseconds since Jan 1, 1970
     * 00:00:00 UTC.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param lastIngestionTime A point in time expressed as the number milliseconds since Jan 1, 1970
     *         00:00:00 UTC.
     */
    public void setLastIngestionTime(Long lastIngestionTime) {
        this.lastIngestionTime = lastIngestionTime;
    }
    
    /**
     * A point in time expressed as the number milliseconds since Jan 1, 1970
     * 00:00:00 UTC.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param lastIngestionTime A point in time expressed as the number milliseconds since Jan 1, 1970
     *         00:00:00 UTC.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public LogStream withLastIngestionTime(Long lastIngestionTime) {
        this.lastIngestionTime = lastIngestionTime;
        return this;
    }

    /**
     * A string token used for making PutLogEvents requests. A <code
     * class="code">sequenceToken</code> can only be used once, and
     * PutLogEvents requests must include the <code
     * class="code">sequenceToken</code> obtained from the response of the
     * previous request.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @return A string token used for making PutLogEvents requests. A <code
     *         class="code">sequenceToken</code> can only be used once, and
     *         PutLogEvents requests must include the <code
     *         class="code">sequenceToken</code> obtained from the response of the
     *         previous request.
     */
    public String getUploadSequenceToken() {
        return uploadSequenceToken;
    }
    
    /**
     * A string token used for making PutLogEvents requests. A <code
     * class="code">sequenceToken</code> can only be used once, and
     * PutLogEvents requests must include the <code
     * class="code">sequenceToken</code> obtained from the response of the
     * previous request.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param uploadSequenceToken A string token used for making PutLogEvents requests. A <code
     *         class="code">sequenceToken</code> can only be used once, and
     *         PutLogEvents requests must include the <code
     *         class="code">sequenceToken</code> obtained from the response of the
     *         previous request.
     */
    public void setUploadSequenceToken(String uploadSequenceToken) {
        this.uploadSequenceToken = uploadSequenceToken;
    }
    
    /**
     * A string token used for making PutLogEvents requests. A <code
     * class="code">sequenceToken</code> can only be used once, and
     * PutLogEvents requests must include the <code
     * class="code">sequenceToken</code> obtained from the response of the
     * previous request.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param uploadSequenceToken A string token used for making PutLogEvents requests. A <code
     *         class="code">sequenceToken</code> can only be used once, and
     *         PutLogEvents requests must include the <code
     *         class="code">sequenceToken</code> obtained from the response of the
     *         previous request.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public LogStream withUploadSequenceToken(String uploadSequenceToken) {
        this.uploadSequenceToken = uploadSequenceToken;
        return this;
    }

    /**
     * Returns the value of the Arn property for this object.
     *
     * @return The value of the Arn property for this object.
     */
    public String getArn() {
        return arn;
    }
    
    /**
     * Sets the value of the Arn property for this object.
     *
     * @param arn The new value for the Arn property for this object.
     */
    public void setArn(String arn) {
        this.arn = arn;
    }
    
    /**
     * Sets the value of the Arn property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param arn The new value for the Arn property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public LogStream withArn(String arn) {
        this.arn = arn;
        return this;
    }

    /**
     * Returns the value of the StoredBytes property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @return The value of the StoredBytes property for this object.
     */
    public Long getStoredBytes() {
        return storedBytes;
    }
    
    /**
     * Sets the value of the StoredBytes property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param storedBytes The new value for the StoredBytes property for this object.
     */
    public void setStoredBytes(Long storedBytes) {
        this.storedBytes = storedBytes;
    }
    
    /**
     * Sets the value of the StoredBytes property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param storedBytes The new value for the StoredBytes property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public LogStream withStoredBytes(Long storedBytes) {
        this.storedBytes = storedBytes;
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
        if (getLogStreamName() != null) sb.append("LogStreamName: " + getLogStreamName() + ",");
        if (getCreationTime() != null) sb.append("CreationTime: " + getCreationTime() + ",");
        if (getFirstEventTimestamp() != null) sb.append("FirstEventTimestamp: " + getFirstEventTimestamp() + ",");
        if (getLastEventTimestamp() != null) sb.append("LastEventTimestamp: " + getLastEventTimestamp() + ",");
        if (getLastIngestionTime() != null) sb.append("LastIngestionTime: " + getLastIngestionTime() + ",");
        if (getUploadSequenceToken() != null) sb.append("UploadSequenceToken: " + getUploadSequenceToken() + ",");
        if (getArn() != null) sb.append("Arn: " + getArn() + ",");
        if (getStoredBytes() != null) sb.append("StoredBytes: " + getStoredBytes() );
        sb.append("}");
        return sb.toString();
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
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof LogStream == false) return false;
        LogStream other = (LogStream)obj;
        
        if (other.getLogStreamName() == null ^ this.getLogStreamName() == null) return false;
        if (other.getLogStreamName() != null && other.getLogStreamName().equals(this.getLogStreamName()) == false) return false; 
        if (other.getCreationTime() == null ^ this.getCreationTime() == null) return false;
        if (other.getCreationTime() != null && other.getCreationTime().equals(this.getCreationTime()) == false) return false; 
        if (other.getFirstEventTimestamp() == null ^ this.getFirstEventTimestamp() == null) return false;
        if (other.getFirstEventTimestamp() != null && other.getFirstEventTimestamp().equals(this.getFirstEventTimestamp()) == false) return false; 
        if (other.getLastEventTimestamp() == null ^ this.getLastEventTimestamp() == null) return false;
        if (other.getLastEventTimestamp() != null && other.getLastEventTimestamp().equals(this.getLastEventTimestamp()) == false) return false; 
        if (other.getLastIngestionTime() == null ^ this.getLastIngestionTime() == null) return false;
        if (other.getLastIngestionTime() != null && other.getLastIngestionTime().equals(this.getLastIngestionTime()) == false) return false; 
        if (other.getUploadSequenceToken() == null ^ this.getUploadSequenceToken() == null) return false;
        if (other.getUploadSequenceToken() != null && other.getUploadSequenceToken().equals(this.getUploadSequenceToken()) == false) return false; 
        if (other.getArn() == null ^ this.getArn() == null) return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false) return false; 
        if (other.getStoredBytes() == null ^ this.getStoredBytes() == null) return false;
        if (other.getStoredBytes() != null && other.getStoredBytes().equals(this.getStoredBytes()) == false) return false; 
        return true;
    }
    
}
    