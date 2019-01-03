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
 * Describes event information.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/EventInfoMap" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EventInfoMap implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier of an Amazon Redshift event.
     * </p>
     */
    private String eventId;
    /**
     * <p>
     * The category of an Amazon Redshift event.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> eventCategories;
    /**
     * <p>
     * The description of an Amazon Redshift event.
     * </p>
     */
    private String eventDescription;
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
     * The identifier of an Amazon Redshift event.
     * </p>
     * 
     * @param eventId
     *        The identifier of an Amazon Redshift event.
     */

    public void setEventId(String eventId) {
        this.eventId = eventId;
    }

    /**
     * <p>
     * The identifier of an Amazon Redshift event.
     * </p>
     * 
     * @return The identifier of an Amazon Redshift event.
     */

    public String getEventId() {
        return this.eventId;
    }

    /**
     * <p>
     * The identifier of an Amazon Redshift event.
     * </p>
     * 
     * @param eventId
     *        The identifier of an Amazon Redshift event.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EventInfoMap withEventId(String eventId) {
        setEventId(eventId);
        return this;
    }

    /**
     * <p>
     * The category of an Amazon Redshift event.
     * </p>
     * 
     * @return The category of an Amazon Redshift event.
     */

    public java.util.List<String> getEventCategories() {
        if (eventCategories == null) {
            eventCategories = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return eventCategories;
    }

    /**
     * <p>
     * The category of an Amazon Redshift event.
     * </p>
     * 
     * @param eventCategories
     *        The category of an Amazon Redshift event.
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
     * The category of an Amazon Redshift event.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEventCategories(java.util.Collection)} or {@link #withEventCategories(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param eventCategories
     *        The category of an Amazon Redshift event.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EventInfoMap withEventCategories(String... eventCategories) {
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
     * The category of an Amazon Redshift event.
     * </p>
     * 
     * @param eventCategories
     *        The category of an Amazon Redshift event.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EventInfoMap withEventCategories(java.util.Collection<String> eventCategories) {
        setEventCategories(eventCategories);
        return this;
    }

    /**
     * <p>
     * The description of an Amazon Redshift event.
     * </p>
     * 
     * @param eventDescription
     *        The description of an Amazon Redshift event.
     */

    public void setEventDescription(String eventDescription) {
        this.eventDescription = eventDescription;
    }

    /**
     * <p>
     * The description of an Amazon Redshift event.
     * </p>
     * 
     * @return The description of an Amazon Redshift event.
     */

    public String getEventDescription() {
        return this.eventDescription;
    }

    /**
     * <p>
     * The description of an Amazon Redshift event.
     * </p>
     * 
     * @param eventDescription
     *        The description of an Amazon Redshift event.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EventInfoMap withEventDescription(String eventDescription) {
        setEventDescription(eventDescription);
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

    public EventInfoMap withSeverity(String severity) {
        setSeverity(severity);
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
        if (getEventCategories() != null)
            sb.append("EventCategories: ").append(getEventCategories()).append(",");
        if (getEventDescription() != null)
            sb.append("EventDescription: ").append(getEventDescription()).append(",");
        if (getSeverity() != null)
            sb.append("Severity: ").append(getSeverity());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EventInfoMap == false)
            return false;
        EventInfoMap other = (EventInfoMap) obj;
        if (other.getEventId() == null ^ this.getEventId() == null)
            return false;
        if (other.getEventId() != null && other.getEventId().equals(this.getEventId()) == false)
            return false;
        if (other.getEventCategories() == null ^ this.getEventCategories() == null)
            return false;
        if (other.getEventCategories() != null && other.getEventCategories().equals(this.getEventCategories()) == false)
            return false;
        if (other.getEventDescription() == null ^ this.getEventDescription() == null)
            return false;
        if (other.getEventDescription() != null && other.getEventDescription().equals(this.getEventDescription()) == false)
            return false;
        if (other.getSeverity() == null ^ this.getSeverity() == null)
            return false;
        if (other.getSeverity() != null && other.getSeverity().equals(this.getSeverity()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEventId() == null) ? 0 : getEventId().hashCode());
        hashCode = prime * hashCode + ((getEventCategories() == null) ? 0 : getEventCategories().hashCode());
        hashCode = prime * hashCode + ((getEventDescription() == null) ? 0 : getEventDescription().hashCode());
        hashCode = prime * hashCode + ((getSeverity() == null) ? 0 : getSeverity().hashCode());
        return hashCode;
    }

    @Override
    public EventInfoMap clone() {
        try {
            return (EventInfoMap) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
