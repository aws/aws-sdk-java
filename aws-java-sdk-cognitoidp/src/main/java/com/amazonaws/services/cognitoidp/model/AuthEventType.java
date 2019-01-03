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
package com.amazonaws.services.cognitoidp.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The authentication event type.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/AuthEventType" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AuthEventType implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The event ID.
     * </p>
     */
    private String eventId;
    /**
     * <p>
     * The event type.
     * </p>
     */
    private String eventType;
    /**
     * <p>
     * The creation date
     * </p>
     */
    private java.util.Date creationDate;
    /**
     * <p>
     * The event response.
     * </p>
     */
    private String eventResponse;
    /**
     * <p>
     * The event risk.
     * </p>
     */
    private EventRiskType eventRisk;
    /**
     * <p>
     * The challenge responses.
     * </p>
     */
    private java.util.List<ChallengeResponseType> challengeResponses;
    /**
     * <p>
     * The user context data captured at the time of an event request. It provides additional information about the
     * client from which event the request is received.
     * </p>
     */
    private EventContextDataType eventContextData;
    /**
     * <p>
     * A flag specifying the user feedback captured at the time of an event request is good or bad.
     * </p>
     */
    private EventFeedbackType eventFeedback;

    /**
     * <p>
     * The event ID.
     * </p>
     * 
     * @param eventId
     *        The event ID.
     */

    public void setEventId(String eventId) {
        this.eventId = eventId;
    }

    /**
     * <p>
     * The event ID.
     * </p>
     * 
     * @return The event ID.
     */

    public String getEventId() {
        return this.eventId;
    }

    /**
     * <p>
     * The event ID.
     * </p>
     * 
     * @param eventId
     *        The event ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AuthEventType withEventId(String eventId) {
        setEventId(eventId);
        return this;
    }

    /**
     * <p>
     * The event type.
     * </p>
     * 
     * @param eventType
     *        The event type.
     * @see EventType
     */

    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

    /**
     * <p>
     * The event type.
     * </p>
     * 
     * @return The event type.
     * @see EventType
     */

    public String getEventType() {
        return this.eventType;
    }

    /**
     * <p>
     * The event type.
     * </p>
     * 
     * @param eventType
     *        The event type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EventType
     */

    public AuthEventType withEventType(String eventType) {
        setEventType(eventType);
        return this;
    }

    /**
     * <p>
     * The event type.
     * </p>
     * 
     * @param eventType
     *        The event type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EventType
     */

    public AuthEventType withEventType(EventType eventType) {
        this.eventType = eventType.toString();
        return this;
    }

    /**
     * <p>
     * The creation date
     * </p>
     * 
     * @param creationDate
     *        The creation date
     */

    public void setCreationDate(java.util.Date creationDate) {
        this.creationDate = creationDate;
    }

    /**
     * <p>
     * The creation date
     * </p>
     * 
     * @return The creation date
     */

    public java.util.Date getCreationDate() {
        return this.creationDate;
    }

    /**
     * <p>
     * The creation date
     * </p>
     * 
     * @param creationDate
     *        The creation date
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AuthEventType withCreationDate(java.util.Date creationDate) {
        setCreationDate(creationDate);
        return this;
    }

    /**
     * <p>
     * The event response.
     * </p>
     * 
     * @param eventResponse
     *        The event response.
     * @see EventResponseType
     */

    public void setEventResponse(String eventResponse) {
        this.eventResponse = eventResponse;
    }

    /**
     * <p>
     * The event response.
     * </p>
     * 
     * @return The event response.
     * @see EventResponseType
     */

    public String getEventResponse() {
        return this.eventResponse;
    }

    /**
     * <p>
     * The event response.
     * </p>
     * 
     * @param eventResponse
     *        The event response.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EventResponseType
     */

    public AuthEventType withEventResponse(String eventResponse) {
        setEventResponse(eventResponse);
        return this;
    }

    /**
     * <p>
     * The event response.
     * </p>
     * 
     * @param eventResponse
     *        The event response.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EventResponseType
     */

    public AuthEventType withEventResponse(EventResponseType eventResponse) {
        this.eventResponse = eventResponse.toString();
        return this;
    }

    /**
     * <p>
     * The event risk.
     * </p>
     * 
     * @param eventRisk
     *        The event risk.
     */

    public void setEventRisk(EventRiskType eventRisk) {
        this.eventRisk = eventRisk;
    }

    /**
     * <p>
     * The event risk.
     * </p>
     * 
     * @return The event risk.
     */

    public EventRiskType getEventRisk() {
        return this.eventRisk;
    }

    /**
     * <p>
     * The event risk.
     * </p>
     * 
     * @param eventRisk
     *        The event risk.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AuthEventType withEventRisk(EventRiskType eventRisk) {
        setEventRisk(eventRisk);
        return this;
    }

    /**
     * <p>
     * The challenge responses.
     * </p>
     * 
     * @return The challenge responses.
     */

    public java.util.List<ChallengeResponseType> getChallengeResponses() {
        return challengeResponses;
    }

    /**
     * <p>
     * The challenge responses.
     * </p>
     * 
     * @param challengeResponses
     *        The challenge responses.
     */

    public void setChallengeResponses(java.util.Collection<ChallengeResponseType> challengeResponses) {
        if (challengeResponses == null) {
            this.challengeResponses = null;
            return;
        }

        this.challengeResponses = new java.util.ArrayList<ChallengeResponseType>(challengeResponses);
    }

    /**
     * <p>
     * The challenge responses.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setChallengeResponses(java.util.Collection)} or {@link #withChallengeResponses(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param challengeResponses
     *        The challenge responses.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AuthEventType withChallengeResponses(ChallengeResponseType... challengeResponses) {
        if (this.challengeResponses == null) {
            setChallengeResponses(new java.util.ArrayList<ChallengeResponseType>(challengeResponses.length));
        }
        for (ChallengeResponseType ele : challengeResponses) {
            this.challengeResponses.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The challenge responses.
     * </p>
     * 
     * @param challengeResponses
     *        The challenge responses.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AuthEventType withChallengeResponses(java.util.Collection<ChallengeResponseType> challengeResponses) {
        setChallengeResponses(challengeResponses);
        return this;
    }

    /**
     * <p>
     * The user context data captured at the time of an event request. It provides additional information about the
     * client from which event the request is received.
     * </p>
     * 
     * @param eventContextData
     *        The user context data captured at the time of an event request. It provides additional information about
     *        the client from which event the request is received.
     */

    public void setEventContextData(EventContextDataType eventContextData) {
        this.eventContextData = eventContextData;
    }

    /**
     * <p>
     * The user context data captured at the time of an event request. It provides additional information about the
     * client from which event the request is received.
     * </p>
     * 
     * @return The user context data captured at the time of an event request. It provides additional information about
     *         the client from which event the request is received.
     */

    public EventContextDataType getEventContextData() {
        return this.eventContextData;
    }

    /**
     * <p>
     * The user context data captured at the time of an event request. It provides additional information about the
     * client from which event the request is received.
     * </p>
     * 
     * @param eventContextData
     *        The user context data captured at the time of an event request. It provides additional information about
     *        the client from which event the request is received.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AuthEventType withEventContextData(EventContextDataType eventContextData) {
        setEventContextData(eventContextData);
        return this;
    }

    /**
     * <p>
     * A flag specifying the user feedback captured at the time of an event request is good or bad.
     * </p>
     * 
     * @param eventFeedback
     *        A flag specifying the user feedback captured at the time of an event request is good or bad.
     */

    public void setEventFeedback(EventFeedbackType eventFeedback) {
        this.eventFeedback = eventFeedback;
    }

    /**
     * <p>
     * A flag specifying the user feedback captured at the time of an event request is good or bad.
     * </p>
     * 
     * @return A flag specifying the user feedback captured at the time of an event request is good or bad.
     */

    public EventFeedbackType getEventFeedback() {
        return this.eventFeedback;
    }

    /**
     * <p>
     * A flag specifying the user feedback captured at the time of an event request is good or bad.
     * </p>
     * 
     * @param eventFeedback
     *        A flag specifying the user feedback captured at the time of an event request is good or bad.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AuthEventType withEventFeedback(EventFeedbackType eventFeedback) {
        setEventFeedback(eventFeedback);
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
        if (getEventType() != null)
            sb.append("EventType: ").append(getEventType()).append(",");
        if (getCreationDate() != null)
            sb.append("CreationDate: ").append(getCreationDate()).append(",");
        if (getEventResponse() != null)
            sb.append("EventResponse: ").append(getEventResponse()).append(",");
        if (getEventRisk() != null)
            sb.append("EventRisk: ").append(getEventRisk()).append(",");
        if (getChallengeResponses() != null)
            sb.append("ChallengeResponses: ").append(getChallengeResponses()).append(",");
        if (getEventContextData() != null)
            sb.append("EventContextData: ").append(getEventContextData()).append(",");
        if (getEventFeedback() != null)
            sb.append("EventFeedback: ").append(getEventFeedback());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AuthEventType == false)
            return false;
        AuthEventType other = (AuthEventType) obj;
        if (other.getEventId() == null ^ this.getEventId() == null)
            return false;
        if (other.getEventId() != null && other.getEventId().equals(this.getEventId()) == false)
            return false;
        if (other.getEventType() == null ^ this.getEventType() == null)
            return false;
        if (other.getEventType() != null && other.getEventType().equals(this.getEventType()) == false)
            return false;
        if (other.getCreationDate() == null ^ this.getCreationDate() == null)
            return false;
        if (other.getCreationDate() != null && other.getCreationDate().equals(this.getCreationDate()) == false)
            return false;
        if (other.getEventResponse() == null ^ this.getEventResponse() == null)
            return false;
        if (other.getEventResponse() != null && other.getEventResponse().equals(this.getEventResponse()) == false)
            return false;
        if (other.getEventRisk() == null ^ this.getEventRisk() == null)
            return false;
        if (other.getEventRisk() != null && other.getEventRisk().equals(this.getEventRisk()) == false)
            return false;
        if (other.getChallengeResponses() == null ^ this.getChallengeResponses() == null)
            return false;
        if (other.getChallengeResponses() != null && other.getChallengeResponses().equals(this.getChallengeResponses()) == false)
            return false;
        if (other.getEventContextData() == null ^ this.getEventContextData() == null)
            return false;
        if (other.getEventContextData() != null && other.getEventContextData().equals(this.getEventContextData()) == false)
            return false;
        if (other.getEventFeedback() == null ^ this.getEventFeedback() == null)
            return false;
        if (other.getEventFeedback() != null && other.getEventFeedback().equals(this.getEventFeedback()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEventId() == null) ? 0 : getEventId().hashCode());
        hashCode = prime * hashCode + ((getEventType() == null) ? 0 : getEventType().hashCode());
        hashCode = prime * hashCode + ((getCreationDate() == null) ? 0 : getCreationDate().hashCode());
        hashCode = prime * hashCode + ((getEventResponse() == null) ? 0 : getEventResponse().hashCode());
        hashCode = prime * hashCode + ((getEventRisk() == null) ? 0 : getEventRisk().hashCode());
        hashCode = prime * hashCode + ((getChallengeResponses() == null) ? 0 : getChallengeResponses().hashCode());
        hashCode = prime * hashCode + ((getEventContextData() == null) ? 0 : getEventContextData().hashCode());
        hashCode = prime * hashCode + ((getEventFeedback() == null) ? 0 : getEventFeedback().hashCode());
        return hashCode;
    }

    @Override
    public AuthEventType clone() {
        try {
            return (AuthEventType) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.cognitoidp.model.transform.AuthEventTypeMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
