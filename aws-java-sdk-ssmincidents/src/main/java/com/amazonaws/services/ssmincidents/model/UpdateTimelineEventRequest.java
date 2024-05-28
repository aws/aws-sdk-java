/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-incidents-2018-05-10/UpdateTimelineEvent" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateTimelineEventRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A token that ensures that a client calls the operation only once with the specified details.
     * </p>
     */
    private String clientToken;
    /**
     * <p>
     * A short description of the event.
     * </p>
     */
    private String eventData;
    /**
     * <p>
     * The ID of the event to update. You can use <code>ListTimelineEvents</code> to find an event's ID.
     * </p>
     */
    private String eventId;
    /**
     * <p>
     * Updates all existing references in a <code>TimelineEvent</code>. A reference is an Amazon Web Services resource
     * involved or associated with the incident. To specify a reference, enter its Amazon Resource Name (ARN). You can
     * also specify a related item associated with that resource. For example, to specify an Amazon DynamoDB (DynamoDB)
     * table as a resource, use its ARN. You can also specify an Amazon CloudWatch metric associated with the DynamoDB
     * table as a related item.
     * </p>
     * <important>
     * <p>
     * This update action overrides all existing references. If you want to keep existing references, you must specify
     * them in the call. If you don't, this action removes any existing references and enters only new references.
     * </p>
     * </important>
     */
    private java.util.List<EventReference> eventReferences;
    /**
     * <p>
     * The timestamp for when the event occurred.
     * </p>
     */
    private java.util.Date eventTime;
    /**
     * <p>
     * The type of event. You can update events of type <code>Custom Event</code> and <code>Note</code>.
     * </p>
     */
    private String eventType;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the incident that includes the timeline event.
     * </p>
     */
    private String incidentRecordArn;

    /**
     * <p>
     * A token that ensures that a client calls the operation only once with the specified details.
     * </p>
     * 
     * @param clientToken
     *        A token that ensures that a client calls the operation only once with the specified details.
     */

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * A token that ensures that a client calls the operation only once with the specified details.
     * </p>
     * 
     * @return A token that ensures that a client calls the operation only once with the specified details.
     */

    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * <p>
     * A token that ensures that a client calls the operation only once with the specified details.
     * </p>
     * 
     * @param clientToken
     *        A token that ensures that a client calls the operation only once with the specified details.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateTimelineEventRequest withClientToken(String clientToken) {
        setClientToken(clientToken);
        return this;
    }

    /**
     * <p>
     * A short description of the event.
     * </p>
     * 
     * @param eventData
     *        A short description of the event.
     */

    public void setEventData(String eventData) {
        this.eventData = eventData;
    }

    /**
     * <p>
     * A short description of the event.
     * </p>
     * 
     * @return A short description of the event.
     */

    public String getEventData() {
        return this.eventData;
    }

    /**
     * <p>
     * A short description of the event.
     * </p>
     * 
     * @param eventData
     *        A short description of the event.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateTimelineEventRequest withEventData(String eventData) {
        setEventData(eventData);
        return this;
    }

    /**
     * <p>
     * The ID of the event to update. You can use <code>ListTimelineEvents</code> to find an event's ID.
     * </p>
     * 
     * @param eventId
     *        The ID of the event to update. You can use <code>ListTimelineEvents</code> to find an event's ID.
     */

    public void setEventId(String eventId) {
        this.eventId = eventId;
    }

    /**
     * <p>
     * The ID of the event to update. You can use <code>ListTimelineEvents</code> to find an event's ID.
     * </p>
     * 
     * @return The ID of the event to update. You can use <code>ListTimelineEvents</code> to find an event's ID.
     */

    public String getEventId() {
        return this.eventId;
    }

    /**
     * <p>
     * The ID of the event to update. You can use <code>ListTimelineEvents</code> to find an event's ID.
     * </p>
     * 
     * @param eventId
     *        The ID of the event to update. You can use <code>ListTimelineEvents</code> to find an event's ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateTimelineEventRequest withEventId(String eventId) {
        setEventId(eventId);
        return this;
    }

    /**
     * <p>
     * Updates all existing references in a <code>TimelineEvent</code>. A reference is an Amazon Web Services resource
     * involved or associated with the incident. To specify a reference, enter its Amazon Resource Name (ARN). You can
     * also specify a related item associated with that resource. For example, to specify an Amazon DynamoDB (DynamoDB)
     * table as a resource, use its ARN. You can also specify an Amazon CloudWatch metric associated with the DynamoDB
     * table as a related item.
     * </p>
     * <important>
     * <p>
     * This update action overrides all existing references. If you want to keep existing references, you must specify
     * them in the call. If you don't, this action removes any existing references and enters only new references.
     * </p>
     * </important>
     * 
     * @return Updates all existing references in a <code>TimelineEvent</code>. A reference is an Amazon Web Services
     *         resource involved or associated with the incident. To specify a reference, enter its Amazon Resource Name
     *         (ARN). You can also specify a related item associated with that resource. For example, to specify an
     *         Amazon DynamoDB (DynamoDB) table as a resource, use its ARN. You can also specify an Amazon CloudWatch
     *         metric associated with the DynamoDB table as a related item.</p> <important>
     *         <p>
     *         This update action overrides all existing references. If you want to keep existing references, you must
     *         specify them in the call. If you don't, this action removes any existing references and enters only new
     *         references.
     *         </p>
     */

    public java.util.List<EventReference> getEventReferences() {
        return eventReferences;
    }

    /**
     * <p>
     * Updates all existing references in a <code>TimelineEvent</code>. A reference is an Amazon Web Services resource
     * involved or associated with the incident. To specify a reference, enter its Amazon Resource Name (ARN). You can
     * also specify a related item associated with that resource. For example, to specify an Amazon DynamoDB (DynamoDB)
     * table as a resource, use its ARN. You can also specify an Amazon CloudWatch metric associated with the DynamoDB
     * table as a related item.
     * </p>
     * <important>
     * <p>
     * This update action overrides all existing references. If you want to keep existing references, you must specify
     * them in the call. If you don't, this action removes any existing references and enters only new references.
     * </p>
     * </important>
     * 
     * @param eventReferences
     *        Updates all existing references in a <code>TimelineEvent</code>. A reference is an Amazon Web Services
     *        resource involved or associated with the incident. To specify a reference, enter its Amazon Resource Name
     *        (ARN). You can also specify a related item associated with that resource. For example, to specify an
     *        Amazon DynamoDB (DynamoDB) table as a resource, use its ARN. You can also specify an Amazon CloudWatch
     *        metric associated with the DynamoDB table as a related item.</p> <important>
     *        <p>
     *        This update action overrides all existing references. If you want to keep existing references, you must
     *        specify them in the call. If you don't, this action removes any existing references and enters only new
     *        references.
     *        </p>
     */

    public void setEventReferences(java.util.Collection<EventReference> eventReferences) {
        if (eventReferences == null) {
            this.eventReferences = null;
            return;
        }

        this.eventReferences = new java.util.ArrayList<EventReference>(eventReferences);
    }

    /**
     * <p>
     * Updates all existing references in a <code>TimelineEvent</code>. A reference is an Amazon Web Services resource
     * involved or associated with the incident. To specify a reference, enter its Amazon Resource Name (ARN). You can
     * also specify a related item associated with that resource. For example, to specify an Amazon DynamoDB (DynamoDB)
     * table as a resource, use its ARN. You can also specify an Amazon CloudWatch metric associated with the DynamoDB
     * table as a related item.
     * </p>
     * <important>
     * <p>
     * This update action overrides all existing references. If you want to keep existing references, you must specify
     * them in the call. If you don't, this action removes any existing references and enters only new references.
     * </p>
     * </important>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEventReferences(java.util.Collection)} or {@link #withEventReferences(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param eventReferences
     *        Updates all existing references in a <code>TimelineEvent</code>. A reference is an Amazon Web Services
     *        resource involved or associated with the incident. To specify a reference, enter its Amazon Resource Name
     *        (ARN). You can also specify a related item associated with that resource. For example, to specify an
     *        Amazon DynamoDB (DynamoDB) table as a resource, use its ARN. You can also specify an Amazon CloudWatch
     *        metric associated with the DynamoDB table as a related item.</p> <important>
     *        <p>
     *        This update action overrides all existing references. If you want to keep existing references, you must
     *        specify them in the call. If you don't, this action removes any existing references and enters only new
     *        references.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateTimelineEventRequest withEventReferences(EventReference... eventReferences) {
        if (this.eventReferences == null) {
            setEventReferences(new java.util.ArrayList<EventReference>(eventReferences.length));
        }
        for (EventReference ele : eventReferences) {
            this.eventReferences.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Updates all existing references in a <code>TimelineEvent</code>. A reference is an Amazon Web Services resource
     * involved or associated with the incident. To specify a reference, enter its Amazon Resource Name (ARN). You can
     * also specify a related item associated with that resource. For example, to specify an Amazon DynamoDB (DynamoDB)
     * table as a resource, use its ARN. You can also specify an Amazon CloudWatch metric associated with the DynamoDB
     * table as a related item.
     * </p>
     * <important>
     * <p>
     * This update action overrides all existing references. If you want to keep existing references, you must specify
     * them in the call. If you don't, this action removes any existing references and enters only new references.
     * </p>
     * </important>
     * 
     * @param eventReferences
     *        Updates all existing references in a <code>TimelineEvent</code>. A reference is an Amazon Web Services
     *        resource involved or associated with the incident. To specify a reference, enter its Amazon Resource Name
     *        (ARN). You can also specify a related item associated with that resource. For example, to specify an
     *        Amazon DynamoDB (DynamoDB) table as a resource, use its ARN. You can also specify an Amazon CloudWatch
     *        metric associated with the DynamoDB table as a related item.</p> <important>
     *        <p>
     *        This update action overrides all existing references. If you want to keep existing references, you must
     *        specify them in the call. If you don't, this action removes any existing references and enters only new
     *        references.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateTimelineEventRequest withEventReferences(java.util.Collection<EventReference> eventReferences) {
        setEventReferences(eventReferences);
        return this;
    }

    /**
     * <p>
     * The timestamp for when the event occurred.
     * </p>
     * 
     * @param eventTime
     *        The timestamp for when the event occurred.
     */

    public void setEventTime(java.util.Date eventTime) {
        this.eventTime = eventTime;
    }

    /**
     * <p>
     * The timestamp for when the event occurred.
     * </p>
     * 
     * @return The timestamp for when the event occurred.
     */

    public java.util.Date getEventTime() {
        return this.eventTime;
    }

    /**
     * <p>
     * The timestamp for when the event occurred.
     * </p>
     * 
     * @param eventTime
     *        The timestamp for when the event occurred.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateTimelineEventRequest withEventTime(java.util.Date eventTime) {
        setEventTime(eventTime);
        return this;
    }

    /**
     * <p>
     * The type of event. You can update events of type <code>Custom Event</code> and <code>Note</code>.
     * </p>
     * 
     * @param eventType
     *        The type of event. You can update events of type <code>Custom Event</code> and <code>Note</code>.
     */

    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

    /**
     * <p>
     * The type of event. You can update events of type <code>Custom Event</code> and <code>Note</code>.
     * </p>
     * 
     * @return The type of event. You can update events of type <code>Custom Event</code> and <code>Note</code>.
     */

    public String getEventType() {
        return this.eventType;
    }

    /**
     * <p>
     * The type of event. You can update events of type <code>Custom Event</code> and <code>Note</code>.
     * </p>
     * 
     * @param eventType
     *        The type of event. You can update events of type <code>Custom Event</code> and <code>Note</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateTimelineEventRequest withEventType(String eventType) {
        setEventType(eventType);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the incident that includes the timeline event.
     * </p>
     * 
     * @param incidentRecordArn
     *        The Amazon Resource Name (ARN) of the incident that includes the timeline event.
     */

    public void setIncidentRecordArn(String incidentRecordArn) {
        this.incidentRecordArn = incidentRecordArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the incident that includes the timeline event.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the incident that includes the timeline event.
     */

    public String getIncidentRecordArn() {
        return this.incidentRecordArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the incident that includes the timeline event.
     * </p>
     * 
     * @param incidentRecordArn
     *        The Amazon Resource Name (ARN) of the incident that includes the timeline event.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateTimelineEventRequest withIncidentRecordArn(String incidentRecordArn) {
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
        if (getClientToken() != null)
            sb.append("ClientToken: ").append(getClientToken()).append(",");
        if (getEventData() != null)
            sb.append("EventData: ").append(getEventData()).append(",");
        if (getEventId() != null)
            sb.append("EventId: ").append(getEventId()).append(",");
        if (getEventReferences() != null)
            sb.append("EventReferences: ").append(getEventReferences()).append(",");
        if (getEventTime() != null)
            sb.append("EventTime: ").append(getEventTime()).append(",");
        if (getEventType() != null)
            sb.append("EventType: ").append(getEventType()).append(",");
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

        if (obj instanceof UpdateTimelineEventRequest == false)
            return false;
        UpdateTimelineEventRequest other = (UpdateTimelineEventRequest) obj;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        if (other.getEventData() == null ^ this.getEventData() == null)
            return false;
        if (other.getEventData() != null && other.getEventData().equals(this.getEventData()) == false)
            return false;
        if (other.getEventId() == null ^ this.getEventId() == null)
            return false;
        if (other.getEventId() != null && other.getEventId().equals(this.getEventId()) == false)
            return false;
        if (other.getEventReferences() == null ^ this.getEventReferences() == null)
            return false;
        if (other.getEventReferences() != null && other.getEventReferences().equals(this.getEventReferences()) == false)
            return false;
        if (other.getEventTime() == null ^ this.getEventTime() == null)
            return false;
        if (other.getEventTime() != null && other.getEventTime().equals(this.getEventTime()) == false)
            return false;
        if (other.getEventType() == null ^ this.getEventType() == null)
            return false;
        if (other.getEventType() != null && other.getEventType().equals(this.getEventType()) == false)
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

        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        hashCode = prime * hashCode + ((getEventData() == null) ? 0 : getEventData().hashCode());
        hashCode = prime * hashCode + ((getEventId() == null) ? 0 : getEventId().hashCode());
        hashCode = prime * hashCode + ((getEventReferences() == null) ? 0 : getEventReferences().hashCode());
        hashCode = prime * hashCode + ((getEventTime() == null) ? 0 : getEventTime().hashCode());
        hashCode = prime * hashCode + ((getEventType() == null) ? 0 : getEventType().hashCode());
        hashCode = prime * hashCode + ((getIncidentRecordArn() == null) ? 0 : getIncidentRecordArn().hashCode());
        return hashCode;
    }

    @Override
    public UpdateTimelineEventRequest clone() {
        return (UpdateTimelineEventRequest) super.clone();
    }

}
