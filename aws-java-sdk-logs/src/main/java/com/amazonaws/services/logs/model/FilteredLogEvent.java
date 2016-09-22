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
 * Represents a matched event from a <code>FilterLogEvents</code> request.
 * </p>
 */
public class FilteredLogEvent implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the log stream this event belongs to.
     * </p>
     */
    private String logStreamName;

    private Long timestamp;
    /**
     * <p>
     * The data contained in the log event.
     * </p>
     */
    private String message;

    private Long ingestionTime;
    /**
     * <p>
     * A unique identifier for this event.
     * </p>
     */
    private String eventId;

    /**
     * <p>
     * The name of the log stream this event belongs to.
     * </p>
     * 
     * @param logStreamName
     *        The name of the log stream this event belongs to.
     */

    public void setLogStreamName(String logStreamName) {
        this.logStreamName = logStreamName;
    }

    /**
     * <p>
     * The name of the log stream this event belongs to.
     * </p>
     * 
     * @return The name of the log stream this event belongs to.
     */

    public String getLogStreamName() {
        return this.logStreamName;
    }

    /**
     * <p>
     * The name of the log stream this event belongs to.
     * </p>
     * 
     * @param logStreamName
     *        The name of the log stream this event belongs to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FilteredLogEvent withLogStreamName(String logStreamName) {
        setLogStreamName(logStreamName);
        return this;
    }

    /**
     * @param timestamp
     */

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    /**
     * @return
     */

    public Long getTimestamp() {
        return this.timestamp;
    }

    /**
     * @param timestamp
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FilteredLogEvent withTimestamp(Long timestamp) {
        setTimestamp(timestamp);
        return this;
    }

    /**
     * <p>
     * The data contained in the log event.
     * </p>
     * 
     * @param message
     *        The data contained in the log event.
     */

    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * <p>
     * The data contained in the log event.
     * </p>
     * 
     * @return The data contained in the log event.
     */

    public String getMessage() {
        return this.message;
    }

    /**
     * <p>
     * The data contained in the log event.
     * </p>
     * 
     * @param message
     *        The data contained in the log event.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FilteredLogEvent withMessage(String message) {
        setMessage(message);
        return this;
    }

    /**
     * @param ingestionTime
     */

    public void setIngestionTime(Long ingestionTime) {
        this.ingestionTime = ingestionTime;
    }

    /**
     * @return
     */

    public Long getIngestionTime() {
        return this.ingestionTime;
    }

    /**
     * @param ingestionTime
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FilteredLogEvent withIngestionTime(Long ingestionTime) {
        setIngestionTime(ingestionTime);
        return this;
    }

    /**
     * <p>
     * A unique identifier for this event.
     * </p>
     * 
     * @param eventId
     *        A unique identifier for this event.
     */

    public void setEventId(String eventId) {
        this.eventId = eventId;
    }

    /**
     * <p>
     * A unique identifier for this event.
     * </p>
     * 
     * @return A unique identifier for this event.
     */

    public String getEventId() {
        return this.eventId;
    }

    /**
     * <p>
     * A unique identifier for this event.
     * </p>
     * 
     * @param eventId
     *        A unique identifier for this event.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FilteredLogEvent withEventId(String eventId) {
        setEventId(eventId);
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
        if (getTimestamp() != null)
            sb.append("Timestamp: " + getTimestamp() + ",");
        if (getMessage() != null)
            sb.append("Message: " + getMessage() + ",");
        if (getIngestionTime() != null)
            sb.append("IngestionTime: " + getIngestionTime() + ",");
        if (getEventId() != null)
            sb.append("EventId: " + getEventId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof FilteredLogEvent == false)
            return false;
        FilteredLogEvent other = (FilteredLogEvent) obj;
        if (other.getLogStreamName() == null ^ this.getLogStreamName() == null)
            return false;
        if (other.getLogStreamName() != null && other.getLogStreamName().equals(this.getLogStreamName()) == false)
            return false;
        if (other.getTimestamp() == null ^ this.getTimestamp() == null)
            return false;
        if (other.getTimestamp() != null && other.getTimestamp().equals(this.getTimestamp()) == false)
            return false;
        if (other.getMessage() == null ^ this.getMessage() == null)
            return false;
        if (other.getMessage() != null && other.getMessage().equals(this.getMessage()) == false)
            return false;
        if (other.getIngestionTime() == null ^ this.getIngestionTime() == null)
            return false;
        if (other.getIngestionTime() != null && other.getIngestionTime().equals(this.getIngestionTime()) == false)
            return false;
        if (other.getEventId() == null ^ this.getEventId() == null)
            return false;
        if (other.getEventId() != null && other.getEventId().equals(this.getEventId()) == false)
            return false;
        return true;
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
    public FilteredLogEvent clone() {
        try {
            return (FilteredLogEvent) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
