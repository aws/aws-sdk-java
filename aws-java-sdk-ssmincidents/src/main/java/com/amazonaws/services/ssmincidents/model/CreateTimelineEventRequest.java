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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-incidents-2018-05-10/CreateTimelineEvent" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateTimelineEventRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A token that ensures that a client calls the action only once with the specified details.
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
     * Adds one or more references to the <code>TimelineEvent</code>. A reference is an Amazon Web Services resource
     * involved or associated with the incident. To specify a reference, enter its Amazon Resource Name (ARN). You can
     * also specify a related item associated with a resource. For example, to specify an Amazon DynamoDB (DynamoDB)
     * table as a resource, use the table's ARN. You can also specify an Amazon CloudWatch metric associated with the
     * DynamoDB table as a related item.
     * </p>
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
     * The type of event. You can create timeline events of type <code>Custom Event</code> and <code>Note</code>.
     * </p>
     * <p>
     * To make a Note-type event appear on the <i>Incident notes</i> panel in the console, specify
     * <code>eventType</code> as <code>Note</code>and enter the Amazon Resource Name (ARN) of the incident as the value
     * for <code>eventReference</code>.
     * </p>
     */
    private String eventType;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the incident record that the action adds the incident to.
     * </p>
     */
    private String incidentRecordArn;

    /**
     * <p>
     * A token that ensures that a client calls the action only once with the specified details.
     * </p>
     * 
     * @param clientToken
     *        A token that ensures that a client calls the action only once with the specified details.
     */

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * A token that ensures that a client calls the action only once with the specified details.
     * </p>
     * 
     * @return A token that ensures that a client calls the action only once with the specified details.
     */

    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * <p>
     * A token that ensures that a client calls the action only once with the specified details.
     * </p>
     * 
     * @param clientToken
     *        A token that ensures that a client calls the action only once with the specified details.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTimelineEventRequest withClientToken(String clientToken) {
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

    public CreateTimelineEventRequest withEventData(String eventData) {
        setEventData(eventData);
        return this;
    }

    /**
     * <p>
     * Adds one or more references to the <code>TimelineEvent</code>. A reference is an Amazon Web Services resource
     * involved or associated with the incident. To specify a reference, enter its Amazon Resource Name (ARN). You can
     * also specify a related item associated with a resource. For example, to specify an Amazon DynamoDB (DynamoDB)
     * table as a resource, use the table's ARN. You can also specify an Amazon CloudWatch metric associated with the
     * DynamoDB table as a related item.
     * </p>
     * 
     * @return Adds one or more references to the <code>TimelineEvent</code>. A reference is an Amazon Web Services
     *         resource involved or associated with the incident. To specify a reference, enter its Amazon Resource Name
     *         (ARN). You can also specify a related item associated with a resource. For example, to specify an Amazon
     *         DynamoDB (DynamoDB) table as a resource, use the table's ARN. You can also specify an Amazon CloudWatch
     *         metric associated with the DynamoDB table as a related item.
     */

    public java.util.List<EventReference> getEventReferences() {
        return eventReferences;
    }

    /**
     * <p>
     * Adds one or more references to the <code>TimelineEvent</code>. A reference is an Amazon Web Services resource
     * involved or associated with the incident. To specify a reference, enter its Amazon Resource Name (ARN). You can
     * also specify a related item associated with a resource. For example, to specify an Amazon DynamoDB (DynamoDB)
     * table as a resource, use the table's ARN. You can also specify an Amazon CloudWatch metric associated with the
     * DynamoDB table as a related item.
     * </p>
     * 
     * @param eventReferences
     *        Adds one or more references to the <code>TimelineEvent</code>. A reference is an Amazon Web Services
     *        resource involved or associated with the incident. To specify a reference, enter its Amazon Resource Name
     *        (ARN). You can also specify a related item associated with a resource. For example, to specify an Amazon
     *        DynamoDB (DynamoDB) table as a resource, use the table's ARN. You can also specify an Amazon CloudWatch
     *        metric associated with the DynamoDB table as a related item.
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
     * Adds one or more references to the <code>TimelineEvent</code>. A reference is an Amazon Web Services resource
     * involved or associated with the incident. To specify a reference, enter its Amazon Resource Name (ARN). You can
     * also specify a related item associated with a resource. For example, to specify an Amazon DynamoDB (DynamoDB)
     * table as a resource, use the table's ARN. You can also specify an Amazon CloudWatch metric associated with the
     * DynamoDB table as a related item.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEventReferences(java.util.Collection)} or {@link #withEventReferences(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param eventReferences
     *        Adds one or more references to the <code>TimelineEvent</code>. A reference is an Amazon Web Services
     *        resource involved or associated with the incident. To specify a reference, enter its Amazon Resource Name
     *        (ARN). You can also specify a related item associated with a resource. For example, to specify an Amazon
     *        DynamoDB (DynamoDB) table as a resource, use the table's ARN. You can also specify an Amazon CloudWatch
     *        metric associated with the DynamoDB table as a related item.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTimelineEventRequest withEventReferences(EventReference... eventReferences) {
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
     * Adds one or more references to the <code>TimelineEvent</code>. A reference is an Amazon Web Services resource
     * involved or associated with the incident. To specify a reference, enter its Amazon Resource Name (ARN). You can
     * also specify a related item associated with a resource. For example, to specify an Amazon DynamoDB (DynamoDB)
     * table as a resource, use the table's ARN. You can also specify an Amazon CloudWatch metric associated with the
     * DynamoDB table as a related item.
     * </p>
     * 
     * @param eventReferences
     *        Adds one or more references to the <code>TimelineEvent</code>. A reference is an Amazon Web Services
     *        resource involved or associated with the incident. To specify a reference, enter its Amazon Resource Name
     *        (ARN). You can also specify a related item associated with a resource. For example, to specify an Amazon
     *        DynamoDB (DynamoDB) table as a resource, use the table's ARN. You can also specify an Amazon CloudWatch
     *        metric associated with the DynamoDB table as a related item.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTimelineEventRequest withEventReferences(java.util.Collection<EventReference> eventReferences) {
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

    public CreateTimelineEventRequest withEventTime(java.util.Date eventTime) {
        setEventTime(eventTime);
        return this;
    }

    /**
     * <p>
     * The type of event. You can create timeline events of type <code>Custom Event</code> and <code>Note</code>.
     * </p>
     * <p>
     * To make a Note-type event appear on the <i>Incident notes</i> panel in the console, specify
     * <code>eventType</code> as <code>Note</code>and enter the Amazon Resource Name (ARN) of the incident as the value
     * for <code>eventReference</code>.
     * </p>
     * 
     * @param eventType
     *        The type of event. You can create timeline events of type <code>Custom Event</code> and <code>Note</code>
     *        .</p>
     *        <p>
     *        To make a Note-type event appear on the <i>Incident notes</i> panel in the console, specify
     *        <code>eventType</code> as <code>Note</code>and enter the Amazon Resource Name (ARN) of the incident as the
     *        value for <code>eventReference</code>.
     */

    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

    /**
     * <p>
     * The type of event. You can create timeline events of type <code>Custom Event</code> and <code>Note</code>.
     * </p>
     * <p>
     * To make a Note-type event appear on the <i>Incident notes</i> panel in the console, specify
     * <code>eventType</code> as <code>Note</code>and enter the Amazon Resource Name (ARN) of the incident as the value
     * for <code>eventReference</code>.
     * </p>
     * 
     * @return The type of event. You can create timeline events of type <code>Custom Event</code> and <code>Note</code>
     *         .</p>
     *         <p>
     *         To make a Note-type event appear on the <i>Incident notes</i> panel in the console, specify
     *         <code>eventType</code> as <code>Note</code>and enter the Amazon Resource Name (ARN) of the incident as
     *         the value for <code>eventReference</code>.
     */

    public String getEventType() {
        return this.eventType;
    }

    /**
     * <p>
     * The type of event. You can create timeline events of type <code>Custom Event</code> and <code>Note</code>.
     * </p>
     * <p>
     * To make a Note-type event appear on the <i>Incident notes</i> panel in the console, specify
     * <code>eventType</code> as <code>Note</code>and enter the Amazon Resource Name (ARN) of the incident as the value
     * for <code>eventReference</code>.
     * </p>
     * 
     * @param eventType
     *        The type of event. You can create timeline events of type <code>Custom Event</code> and <code>Note</code>
     *        .</p>
     *        <p>
     *        To make a Note-type event appear on the <i>Incident notes</i> panel in the console, specify
     *        <code>eventType</code> as <code>Note</code>and enter the Amazon Resource Name (ARN) of the incident as the
     *        value for <code>eventReference</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTimelineEventRequest withEventType(String eventType) {
        setEventType(eventType);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the incident record that the action adds the incident to.
     * </p>
     * 
     * @param incidentRecordArn
     *        The Amazon Resource Name (ARN) of the incident record that the action adds the incident to.
     */

    public void setIncidentRecordArn(String incidentRecordArn) {
        this.incidentRecordArn = incidentRecordArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the incident record that the action adds the incident to.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the incident record that the action adds the incident to.
     */

    public String getIncidentRecordArn() {
        return this.incidentRecordArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the incident record that the action adds the incident to.
     * </p>
     * 
     * @param incidentRecordArn
     *        The Amazon Resource Name (ARN) of the incident record that the action adds the incident to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTimelineEventRequest withIncidentRecordArn(String incidentRecordArn) {
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

        if (obj instanceof CreateTimelineEventRequest == false)
            return false;
        CreateTimelineEventRequest other = (CreateTimelineEventRequest) obj;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        if (other.getEventData() == null ^ this.getEventData() == null)
            return false;
        if (other.getEventData() != null && other.getEventData().equals(this.getEventData()) == false)
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
        hashCode = prime * hashCode + ((getEventReferences() == null) ? 0 : getEventReferences().hashCode());
        hashCode = prime * hashCode + ((getEventTime() == null) ? 0 : getEventTime().hashCode());
        hashCode = prime * hashCode + ((getEventType() == null) ? 0 : getEventType().hashCode());
        hashCode = prime * hashCode + ((getIncidentRecordArn() == null) ? 0 : getIncidentRecordArn().hashCode());
        return hashCode;
    }

    @Override
    public CreateTimelineEventRequest clone() {
        return (CreateTimelineEventRequest) super.clone();
    }

}
