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
package com.amazonaws.services.ssmincidents.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Details about a timeline event during an incident.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-incidents-2018-05-10/EventSummary" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EventSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The timeline event ID.
     * </p>
     */
    private String eventId;
    /**
     * <p>
     * The time that the event occurred.
     * </p>
     */
    private java.util.Date eventTime;
    /**
     * <p>
     * The type of event. The timeline event must be <code>Custom Event</code>.
     * </p>
     */
    private String eventType;
    /**
     * <p>
     * The time that the timeline event was last updated.
     * </p>
     */
    private java.util.Date eventUpdatedTime;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the incident that the event happened during.
     * </p>
     */
    private String incidentRecordArn;

    /**
     * <p>
     * The timeline event ID.
     * </p>
     * 
     * @param eventId
     *        The timeline event ID.
     */

    public void setEventId(String eventId) {
        this.eventId = eventId;
    }

    /**
     * <p>
     * The timeline event ID.
     * </p>
     * 
     * @return The timeline event ID.
     */

    public String getEventId() {
        return this.eventId;
    }

    /**
     * <p>
     * The timeline event ID.
     * </p>
     * 
     * @param eventId
     *        The timeline event ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EventSummary withEventId(String eventId) {
        setEventId(eventId);
        return this;
    }

    /**
     * <p>
     * The time that the event occurred.
     * </p>
     * 
     * @param eventTime
     *        The time that the event occurred.
     */

    public void setEventTime(java.util.Date eventTime) {
        this.eventTime = eventTime;
    }

    /**
     * <p>
     * The time that the event occurred.
     * </p>
     * 
     * @return The time that the event occurred.
     */

    public java.util.Date getEventTime() {
        return this.eventTime;
    }

    /**
     * <p>
     * The time that the event occurred.
     * </p>
     * 
     * @param eventTime
     *        The time that the event occurred.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EventSummary withEventTime(java.util.Date eventTime) {
        setEventTime(eventTime);
        return this;
    }

    /**
     * <p>
     * The type of event. The timeline event must be <code>Custom Event</code>.
     * </p>
     * 
     * @param eventType
     *        The type of event. The timeline event must be <code>Custom Event</code>.
     */

    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

    /**
     * <p>
     * The type of event. The timeline event must be <code>Custom Event</code>.
     * </p>
     * 
     * @return The type of event. The timeline event must be <code>Custom Event</code>.
     */

    public String getEventType() {
        return this.eventType;
    }

    /**
     * <p>
     * The type of event. The timeline event must be <code>Custom Event</code>.
     * </p>
     * 
     * @param eventType
     *        The type of event. The timeline event must be <code>Custom Event</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EventSummary withEventType(String eventType) {
        setEventType(eventType);
        return this;
    }

    /**
     * <p>
     * The time that the timeline event was last updated.
     * </p>
     * 
     * @param eventUpdatedTime
     *        The time that the timeline event was last updated.
     */

    public void setEventUpdatedTime(java.util.Date eventUpdatedTime) {
        this.eventUpdatedTime = eventUpdatedTime;
    }

    /**
     * <p>
     * The time that the timeline event was last updated.
     * </p>
     * 
     * @return The time that the timeline event was last updated.
     */

    public java.util.Date getEventUpdatedTime() {
        return this.eventUpdatedTime;
    }

    /**
     * <p>
     * The time that the timeline event was last updated.
     * </p>
     * 
     * @param eventUpdatedTime
     *        The time that the timeline event was last updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EventSummary withEventUpdatedTime(java.util.Date eventUpdatedTime) {
        setEventUpdatedTime(eventUpdatedTime);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the incident that the event happened during.
     * </p>
     * 
     * @param incidentRecordArn
     *        The Amazon Resource Name (ARN) of the incident that the event happened during.
     */

    public void setIncidentRecordArn(String incidentRecordArn) {
        this.incidentRecordArn = incidentRecordArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the incident that the event happened during.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the incident that the event happened during.
     */

    public String getIncidentRecordArn() {
        return this.incidentRecordArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the incident that the event happened during.
     * </p>
     * 
     * @param incidentRecordArn
     *        The Amazon Resource Name (ARN) of the incident that the event happened during.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EventSummary withIncidentRecordArn(String incidentRecordArn) {
        setIncidentRecordArn(incidentRecordArn);
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
        if (getEventId() != null)
            sb.append("EventId: ").append(getEventId()).append(",");
        if (getEventTime() != null)
            sb.append("EventTime: ").append(getEventTime()).append(",");
        if (getEventType() != null)
            sb.append("EventType: ").append(getEventType()).append(",");
        if (getEventUpdatedTime() != null)
            sb.append("EventUpdatedTime: ").append(getEventUpdatedTime()).append(",");
        if (getIncidentRecordArn() != null)
            sb.append("IncidentRecordArn: ").append(getIncidentRecordArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EventSummary == false)
            return false;
        EventSummary other = (EventSummary) obj;
        if (other.getEventId() == null ^ this.getEventId() == null)
            return false;
        if (other.getEventId() != null && other.getEventId().equals(this.getEventId()) == false)
            return false;
        if (other.getEventTime() == null ^ this.getEventTime() == null)
            return false;
        if (other.getEventTime() != null && other.getEventTime().equals(this.getEventTime()) == false)
            return false;
        if (other.getEventType() == null ^ this.getEventType() == null)
            return false;
        if (other.getEventType() != null && other.getEventType().equals(this.getEventType()) == false)
            return false;
        if (other.getEventUpdatedTime() == null ^ this.getEventUpdatedTime() == null)
            return false;
        if (other.getEventUpdatedTime() != null && other.getEventUpdatedTime().equals(this.getEventUpdatedTime()) == false)
            return false;
        if (other.getIncidentRecordArn() == null ^ this.getIncidentRecordArn() == null)
            return false;
        if (other.getIncidentRecordArn() != null && other.getIncidentRecordArn().equals(this.getIncidentRecordArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEventId() == null) ? 0 : getEventId().hashCode());
        hashCode = prime * hashCode + ((getEventTime() == null) ? 0 : getEventTime().hashCode());
        hashCode = prime * hashCode + ((getEventType() == null) ? 0 : getEventType().hashCode());
        hashCode = prime * hashCode + ((getEventUpdatedTime() == null) ? 0 : getEventUpdatedTime().hashCode());
        hashCode = prime * hashCode + ((getIncidentRecordArn() == null) ? 0 : getIncidentRecordArn().hashCode());
        return hashCode;
    }

    @Override
    public EventSummary clone() {
        try {
            return (EventSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.ssmincidents.model.transform.EventSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
