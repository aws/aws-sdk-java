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
package com.amazonaws.services.redshift.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Describes an event.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/Event" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Event implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier for the source of the event.
     * </p>
     */
    private String sourceIdentifier;
    /**
     * <p>
     * The source type for this event.
     * </p>
     */
    private String sourceType;
    /**
     * <p>
     * The text of this event.
     * </p>
     */
    private String message;
    /**
     * <p>
     * A list of the event categories.
     * </p>
     * <p>
     * Values: Configuration, Management, Monitoring, Security
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> eventCategories;
    /**
     * <p>
     * The severity of the event.
     * </p>
     * <p>
     * Values: ERROR, INFO
     * </p>
     */
    private String severity;
    /**
     * <p>
     * The date and time of the event.
     * </p>
     */
    private java.util.Date date;
    /**
     * <p>
     * The identifier of the event.
     * </p>
     */
    private String eventId;

    /**
     * <p>
     * The identifier for the source of the event.
     * </p>
     * 
     * @param sourceIdentifier
     *        The identifier for the source of the event.
     */

    public void setSourceIdentifier(String sourceIdentifier) {
        this.sourceIdentifier = sourceIdentifier;
    }

    /**
     * <p>
     * The identifier for the source of the event.
     * </p>
     * 
     * @return The identifier for the source of the event.
     */

    public String getSourceIdentifier() {
        return this.sourceIdentifier;
    }

    /**
     * <p>
     * The identifier for the source of the event.
     * </p>
     * 
     * @param sourceIdentifier
     *        The identifier for the source of the event.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Event withSourceIdentifier(String sourceIdentifier) {
        setSourceIdentifier(sourceIdentifier);
        return this;
    }

    /**
     * <p>
     * The source type for this event.
     * </p>
     * 
     * @param sourceType
     *        The source type for this event.
     * @see SourceType
     */

    public void setSourceType(String sourceType) {
        this.sourceType = sourceType;
    }

    /**
     * <p>
     * The source type for this event.
     * </p>
     * 
     * @return The source type for this event.
     * @see SourceType
     */

    public String getSourceType() {
        return this.sourceType;
    }

    /**
     * <p>
     * The source type for this event.
     * </p>
     * 
     * @param sourceType
     *        The source type for this event.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SourceType
     */

    public Event withSourceType(String sourceType) {
        setSourceType(sourceType);
        return this;
    }

    /**
     * <p>
     * The source type for this event.
     * </p>
     * 
     * @param sourceType
     *        The source type for this event.
     * @see SourceType
     */

    public void setSourceType(SourceType sourceType) {
        withSourceType(sourceType);
    }

    /**
     * <p>
     * The source type for this event.
     * </p>
     * 
     * @param sourceType
     *        The source type for this event.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SourceType
     */

    public Event withSourceType(SourceType sourceType) {
        this.sourceType = sourceType.toString();
        return this;
    }

    /**
     * <p>
     * The text of this event.
     * </p>
     * 
     * @param message
     *        The text of this event.
     */

    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * <p>
     * The text of this event.
     * </p>
     * 
     * @return The text of this event.
     */

    public String getMessage() {
        return this.message;
    }

    /**
     * <p>
     * The text of this event.
     * </p>
     * 
     * @param message
     *        The text of this event.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Event withMessage(String message) {
        setMessage(message);
        return this;
    }

    /**
     * <p>
     * A list of the event categories.
     * </p>
     * <p>
     * Values: Configuration, Management, Monitoring, Security
     * </p>
     * 
     * @return A list of the event categories.</p>
     *         <p>
     *         Values: Configuration, Management, Monitoring, Security
     */

    public java.util.List<String> getEventCategories() {
        if (eventCategories == null) {
            eventCategories = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return eventCategories;
    }

    /**
     * <p>
     * A list of the event categories.
     * </p>
     * <p>
     * Values: Configuration, Management, Monitoring, Security
     * </p>
     * 
     * @param eventCategories
     *        A list of the event categories.</p>
     *        <p>
     *        Values: Configuration, Management, Monitoring, Security
     */

    public void setEventCategories(java.util.Collection<String> eventCategories) {
        if (eventCategories == null) {
            this.eventCategories = null;
            return;
        }

        this.eventCategories = new com.amazonaws.internal.SdkInternalList<String>(eventCategories);
    }

    /**
     * <p>
     * A list of the event categories.
     * </p>
     * <p>
     * Values: Configuration, Management, Monitoring, Security
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEventCategories(java.util.Collection)} or {@link #withEventCategories(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param eventCategories
     *        A list of the event categories.</p>
     *        <p>
     *        Values: Configuration, Management, Monitoring, Security
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Event withEventCategories(String... eventCategories) {
        if (this.eventCategories == null) {
            setEventCategories(new com.amazonaws.internal.SdkInternalList<String>(eventCategories.length));
        }
        for (String ele : eventCategories) {
            this.eventCategories.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of the event categories.
     * </p>
     * <p>
     * Values: Configuration, Management, Monitoring, Security
     * </p>
     * 
     * @param eventCategories
     *        A list of the event categories.</p>
     *        <p>
     *        Values: Configuration, Management, Monitoring, Security
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Event withEventCategories(java.util.Collection<String> eventCategories) {
        setEventCategories(eventCategories);
        return this;
    }

    /**
     * <p>
     * The severity of the event.
     * </p>
     * <p>
     * Values: ERROR, INFO
     * </p>
     * 
     * @param severity
     *        The severity of the event.</p>
     *        <p>
     *        Values: ERROR, INFO
     */

    public void setSeverity(String severity) {
        this.severity = severity;
    }

    /**
     * <p>
     * The severity of the event.
     * </p>
     * <p>
     * Values: ERROR, INFO
     * </p>
     * 
     * @return The severity of the event.</p>
     *         <p>
     *         Values: ERROR, INFO
     */

    public String getSeverity() {
        return this.severity;
    }

    /**
     * <p>
     * The severity of the event.
     * </p>
     * <p>
     * Values: ERROR, INFO
     * </p>
     * 
     * @param severity
     *        The severity of the event.</p>
     *        <p>
     *        Values: ERROR, INFO
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Event withSeverity(String severity) {
        setSeverity(severity);
        return this;
    }

    /**
     * <p>
     * The date and time of the event.
     * </p>
     * 
     * @param date
     *        The date and time of the event.
     */

    public void setDate(java.util.Date date) {
        this.date = date;
    }

    /**
     * <p>
     * The date and time of the event.
     * </p>
     * 
     * @return The date and time of the event.
     */

    public java.util.Date getDate() {
        return this.date;
    }

    /**
     * <p>
     * The date and time of the event.
     * </p>
     * 
     * @param date
     *        The date and time of the event.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Event withDate(java.util.Date date) {
        setDate(date);
        return this;
    }

    /**
     * <p>
     * The identifier of the event.
     * </p>
     * 
     * @param eventId
     *        The identifier of the event.
     */

    public void setEventId(String eventId) {
        this.eventId = eventId;
    }

    /**
     * <p>
     * The identifier of the event.
     * </p>
     * 
     * @return The identifier of the event.
     */

    public String getEventId() {
        return this.eventId;
    }

    /**
     * <p>
     * The identifier of the event.
     * </p>
     * 
     * @param eventId
     *        The identifier of the event.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Event withEventId(String eventId) {
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
        if (getSourceIdentifier() != null)
            sb.append("SourceIdentifier: ").append(getSourceIdentifier()).append(",");
        if (getSourceType() != null)
            sb.append("SourceType: ").append(getSourceType()).append(",");
        if (getMessage() != null)
            sb.append("Message: ").append(getMessage()).append(",");
        if (getEventCategories() != null)
            sb.append("EventCategories: ").append(getEventCategories()).append(",");
        if (getSeverity() != null)
            sb.append("Severity: ").append(getSeverity()).append(",");
        if (getDate() != null)
            sb.append("Date: ").append(getDate()).append(",");
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

        if (obj instanceof Event == false)
            return false;
        Event other = (Event) obj;
        if (other.getSourceIdentifier() == null ^ this.getSourceIdentifier() == null)
            return false;
        if (other.getSourceIdentifier() != null && other.getSourceIdentifier().equals(this.getSourceIdentifier()) == false)
            return false;
        if (other.getSourceType() == null ^ this.getSourceType() == null)
            return false;
        if (other.getSourceType() != null && other.getSourceType().equals(this.getSourceType()) == false)
            return false;
        if (other.getMessage() == null ^ this.getMessage() == null)
            return false;
        if (other.getMessage() != null && other.getMessage().equals(this.getMessage()) == false)
            return false;
        if (other.getEventCategories() == null ^ this.getEventCategories() == null)
            return false;
        if (other.getEventCategories() != null && other.getEventCategories().equals(this.getEventCategories()) == false)
            return false;
        if (other.getSeverity() == null ^ this.getSeverity() == null)
            return false;
        if (other.getSeverity() != null && other.getSeverity().equals(this.getSeverity()) == false)
            return false;
        if (other.getDate() == null ^ this.getDate() == null)
            return false;
        if (other.getDate() != null && other.getDate().equals(this.getDate()) == false)
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

        hashCode = prime * hashCode + ((getSourceIdentifier() == null) ? 0 : getSourceIdentifier().hashCode());
        hashCode = prime * hashCode + ((getSourceType() == null) ? 0 : getSourceType().hashCode());
        hashCode = prime * hashCode + ((getMessage() == null) ? 0 : getMessage().hashCode());
        hashCode = prime * hashCode + ((getEventCategories() == null) ? 0 : getEventCategories().hashCode());
        hashCode = prime * hashCode + ((getSeverity() == null) ? 0 : getSeverity().hashCode());
        hashCode = prime * hashCode + ((getDate() == null) ? 0 : getDate().hashCode());
        hashCode = prime * hashCode + ((getEventId() == null) ? 0 : getEventId().hashCode());
        return hashCode;
    }

    @Override
    public Event clone() {
        try {
            return (Event) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
