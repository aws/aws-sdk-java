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
 * Represents a matched event from a <code>FilterLogEvents</code>
 * request.
 * </p>
 */
public class FilteredLogEvent implements Serializable, Cloneable {

    /**
     * The name of the log stream this event belongs to.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     * <b>Pattern: </b>[^:*]*<br/>
     */
    private String logStreamName;

    /**
     * A point in time expressed as the number of milliseconds since Jan 1,
     * 1970 00:00:00 UTC.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     */
    private Long timestamp;

    /**
     * The data contained in the log event.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     */
    private String message;

    /**
     * A point in time expressed as the number of milliseconds since Jan 1,
     * 1970 00:00:00 UTC.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     */
    private Long ingestionTime;

    /**
     * A unique identifier for this event.
     */
    private String eventId;

    /**
     * The name of the log stream this event belongs to.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     * <b>Pattern: </b>[^:*]*<br/>
     *
     * @return The name of the log stream this event belongs to.
     */
    public String getLogStreamName() {
        return logStreamName;
    }
    
    /**
     * The name of the log stream this event belongs to.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     * <b>Pattern: </b>[^:*]*<br/>
     *
     * @param logStreamName The name of the log stream this event belongs to.
     */
    public void setLogStreamName(String logStreamName) {
        this.logStreamName = logStreamName;
    }
    
    /**
     * The name of the log stream this event belongs to.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     * <b>Pattern: </b>[^:*]*<br/>
     *
     * @param logStreamName The name of the log stream this event belongs to.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public FilteredLogEvent withLogStreamName(String logStreamName) {
        this.logStreamName = logStreamName;
        return this;
    }

    /**
     * A point in time expressed as the number of milliseconds since Jan 1,
     * 1970 00:00:00 UTC.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @return A point in time expressed as the number of milliseconds since Jan 1,
     *         1970 00:00:00 UTC.
     */
    public Long getTimestamp() {
        return timestamp;
    }
    
    /**
     * A point in time expressed as the number of milliseconds since Jan 1,
     * 1970 00:00:00 UTC.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param timestamp A point in time expressed as the number of milliseconds since Jan 1,
     *         1970 00:00:00 UTC.
     */
    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }
    
    /**
     * A point in time expressed as the number of milliseconds since Jan 1,
     * 1970 00:00:00 UTC.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param timestamp A point in time expressed as the number of milliseconds since Jan 1,
     *         1970 00:00:00 UTC.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public FilteredLogEvent withTimestamp(Long timestamp) {
        this.timestamp = timestamp;
        return this;
    }

    /**
     * The data contained in the log event.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @return The data contained in the log event.
     */
    public String getMessage() {
        return message;
    }
    
    /**
     * The data contained in the log event.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param message The data contained in the log event.
     */
    public void setMessage(String message) {
        this.message = message;
    }
    
    /**
     * The data contained in the log event.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param message The data contained in the log event.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public FilteredLogEvent withMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     * A point in time expressed as the number of milliseconds since Jan 1,
     * 1970 00:00:00 UTC.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @return A point in time expressed as the number of milliseconds since Jan 1,
     *         1970 00:00:00 UTC.
     */
    public Long getIngestionTime() {
        return ingestionTime;
    }
    
    /**
     * A point in time expressed as the number of milliseconds since Jan 1,
     * 1970 00:00:00 UTC.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param ingestionTime A point in time expressed as the number of milliseconds since Jan 1,
     *         1970 00:00:00 UTC.
     */
    public void setIngestionTime(Long ingestionTime) {
        this.ingestionTime = ingestionTime;
    }
    
    /**
     * A point in time expressed as the number of milliseconds since Jan 1,
     * 1970 00:00:00 UTC.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param ingestionTime A point in time expressed as the number of milliseconds since Jan 1,
     *         1970 00:00:00 UTC.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public FilteredLogEvent withIngestionTime(Long ingestionTime) {
        this.ingestionTime = ingestionTime;
        return this;
    }

    /**
     * A unique identifier for this event.
     *
     * @return A unique identifier for this event.
     */
    public String getEventId() {
        return eventId;
    }
    
    /**
     * A unique identifier for this event.
     *
     * @param eventId A unique identifier for this event.
     */
    public void setEventId(String eventId) {
        this.eventId = eventId;
    }
    
    /**
     * A unique identifier for this event.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param eventId A unique identifier for this event.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public FilteredLogEvent withEventId(String eventId) {
        this.eventId = eventId;
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
        if (getTimestamp() != null) sb.append("Timestamp: " + getTimestamp() + ",");
        if (getMessage() != null) sb.append("Message: " + getMessage() + ",");
        if (getIngestionTime() != null) sb.append("IngestionTime: " + getIngestionTime() + ",");
        if (getEventId() != null) sb.append("EventId: " + getEventId() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getLogStreamName() == null) ? 0 : getLogStreamName().hashCode()); 
        hashCode = prime * hashCode + ((getTimestamp() == null) ? 0 : getTimestamp().hashCode()); 
        hashCode = prime * hashCode + ((getMessage() == null) ? 0 : getMessage().hashCode()); 
        hashCode = prime * hashCode + ((getIngestionTime() == null) ? 0 : getIngestionTime().hashCode()); 
        hashCode = prime * hashCode + ((getEventId() == null) ? 0 : getEventId().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof FilteredLogEvent == false) return false;
        FilteredLogEvent other = (FilteredLogEvent)obj;
        
        if (other.getLogStreamName() == null ^ this.getLogStreamName() == null) return false;
        if (other.getLogStreamName() != null && other.getLogStreamName().equals(this.getLogStreamName()) == false) return false; 
        if (other.getTimestamp() == null ^ this.getTimestamp() == null) return false;
        if (other.getTimestamp() != null && other.getTimestamp().equals(this.getTimestamp()) == false) return false; 
        if (other.getMessage() == null ^ this.getMessage() == null) return false;
        if (other.getMessage() != null && other.getMessage().equals(this.getMessage()) == false) return false; 
        if (other.getIngestionTime() == null ^ this.getIngestionTime() == null) return false;
        if (other.getIngestionTime() != null && other.getIngestionTime().equals(this.getIngestionTime()) == false) return false; 
        if (other.getEventId() == null ^ this.getEventId() == null) return false;
        if (other.getEventId() != null && other.getEventId().equals(this.getEventId()) == false) return false; 
        return true;
    }
    
    @Override
    public FilteredLogEvent clone() {
        try {
            return (FilteredLogEvent) super.clone();
        
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                    + "even though we're Cloneable!",
                    e);
        }
        
    }

}
    