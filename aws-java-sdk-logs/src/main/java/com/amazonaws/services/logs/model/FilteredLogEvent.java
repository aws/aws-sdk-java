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
package com.amazonaws.services.logs.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Represents a matched event.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/logs-2014-03-28/FilteredLogEvent" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FilteredLogEvent implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the log stream to which this event belongs.
     * </p>
     */
    private String logStreamName;
    /**
     * <p>
     * The time the event occurred, expressed as the number of milliseconds after Jan 1, 1970 00:00:00 UTC.
     * </p>
     */
    private Long timestamp;
    /**
     * <p>
     * The data contained in the log event.
     * </p>
     */
    private String message;
    /**
     * <p>
     * The time the event was ingested, expressed as the number of milliseconds after Jan 1, 1970 00:00:00 UTC.
     * </p>
     */
    private Long ingestionTime;
    /**
     * <p>
     * The ID of the event.
     * </p>
     */
    private String eventId;

    /**
     * <p>
     * The name of the log stream to which this event belongs.
     * </p>
     * 
     * @param logStreamName
     *        The name of the log stream to which this event belongs.
     */

    public void setLogStreamName(String logStreamName) {
        this.logStreamName = logStreamName;
    }

    /**
     * <p>
     * The name of the log stream to which this event belongs.
     * </p>
     * 
     * @return The name of the log stream to which this event belongs.
     */

    public String getLogStreamName() {
        return this.logStreamName;
    }

    /**
     * <p>
     * The name of the log stream to which this event belongs.
     * </p>
     * 
     * @param logStreamName
     *        The name of the log stream to which this event belongs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FilteredLogEvent withLogStreamName(String logStreamName) {
        setLogStreamName(logStreamName);
        return this;
    }

    /**
     * <p>
     * The time the event occurred, expressed as the number of milliseconds after Jan 1, 1970 00:00:00 UTC.
     * </p>
     * 
     * @param timestamp
     *        The time the event occurred, expressed as the number of milliseconds after Jan 1, 1970 00:00:00 UTC.
     */

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    /**
     * <p>
     * The time the event occurred, expressed as the number of milliseconds after Jan 1, 1970 00:00:00 UTC.
     * </p>
     * 
     * @return The time the event occurred, expressed as the number of milliseconds after Jan 1, 1970 00:00:00 UTC.
     */

    public Long getTimestamp() {
        return this.timestamp;
    }

    /**
     * <p>
     * The time the event occurred, expressed as the number of milliseconds after Jan 1, 1970 00:00:00 UTC.
     * </p>
     * 
     * @param timestamp
     *        The time the event occurred, expressed as the number of milliseconds after Jan 1, 1970 00:00:00 UTC.
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
     * <p>
     * The time the event was ingested, expressed as the number of milliseconds after Jan 1, 1970 00:00:00 UTC.
     * </p>
     * 
     * @param ingestionTime
     *        The time the event was ingested, expressed as the number of milliseconds after Jan 1, 1970 00:00:00 UTC.
     */

    public void setIngestionTime(Long ingestionTime) {
        this.ingestionTime = ingestionTime;
    }

    /**
     * <p>
     * The time the event was ingested, expressed as the number of milliseconds after Jan 1, 1970 00:00:00 UTC.
     * </p>
     * 
     * @return The time the event was ingested, expressed as the number of milliseconds after Jan 1, 1970 00:00:00 UTC.
     */

    public Long getIngestionTime() {
        return this.ingestionTime;
    }

    /**
     * <p>
     * The time the event was ingested, expressed as the number of milliseconds after Jan 1, 1970 00:00:00 UTC.
     * </p>
     * 
     * @param ingestionTime
     *        The time the event was ingested, expressed as the number of milliseconds after Jan 1, 1970 00:00:00 UTC.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FilteredLogEvent withIngestionTime(Long ingestionTime) {
        setIngestionTime(ingestionTime);
        return this;
    }

    /**
     * <p>
     * The ID of the event.
     * </p>
     * 
     * @param eventId
     *        The ID of the event.
     */

    public void setEventId(String eventId) {
        this.eventId = eventId;
    }

    /**
     * <p>
     * The ID of the event.
     * </p>
     * 
     * @return The ID of the event.
     */

    public String getEventId() {
        return this.eventId;
    }

    /**
     * <p>
     * The ID of the event.
     * </p>
     * 
     * @param eventId
     *        The ID of the event.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FilteredLogEvent withEventId(String eventId) {
        setEventId(eventId);
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
        if (getLogStreamName() != null)
            sb.append("LogStreamName: ").append(getLogStreamName()).append(",");
        if (getTimestamp() != null)
            sb.append("Timestamp: ").append(getTimestamp()).append(",");
        if (getMessage() != null)
            sb.append("Message: ").append(getMessage()).append(",");
        if (getIngestionTime() != null)
            sb.append("IngestionTime: ").append(getIngestionTime()).append(",");
        if (getEventId() != null)
            sb.append("EventId: ").append(getEventId());
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

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.logs.model.transform.FilteredLogEventMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
