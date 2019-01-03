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
package com.amazonaws.services.databasemigrationservice.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p/>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dms-2016-01-01/Event" target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Event implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The identifier of the event source. An identifier must begin with a letter and must contain only ASCII letters,
     * digits, and hyphens; it cannot end with a hyphen or contain two consecutive hyphens.
     * </p>
     * <p>
     * Constraints:replication instance, endpoint, migration task
     * </p>
     */
    private String sourceIdentifier;
    /**
     * <p>
     * The type of AWS DMS resource that generates events.
     * </p>
     * <p>
     * Valid values: replication-instance | endpoint | migration-task
     * </p>
     */
    private String sourceType;
    /**
     * <p>
     * The event message.
     * </p>
     */
    private String message;
    /**
     * <p>
     * The event categories available for the specified source type.
     * </p>
     */
    private java.util.List<String> eventCategories;
    /**
     * <p>
     * The date of the event.
     * </p>
     */
    private java.util.Date date;

    /**
     * <p>
     * The identifier of the event source. An identifier must begin with a letter and must contain only ASCII letters,
     * digits, and hyphens; it cannot end with a hyphen or contain two consecutive hyphens.
     * </p>
     * <p>
     * Constraints:replication instance, endpoint, migration task
     * </p>
     * 
     * @param sourceIdentifier
     *        The identifier of the event source. An identifier must begin with a letter and must contain only ASCII
     *        letters, digits, and hyphens; it cannot end with a hyphen or contain two consecutive hyphens. </p>
     *        <p>
     *        Constraints:replication instance, endpoint, migration task
     */

    public void setSourceIdentifier(String sourceIdentifier) {
        this.sourceIdentifier = sourceIdentifier;
    }

    /**
     * <p>
     * The identifier of the event source. An identifier must begin with a letter and must contain only ASCII letters,
     * digits, and hyphens; it cannot end with a hyphen or contain two consecutive hyphens.
     * </p>
     * <p>
     * Constraints:replication instance, endpoint, migration task
     * </p>
     * 
     * @return The identifier of the event source. An identifier must begin with a letter and must contain only ASCII
     *         letters, digits, and hyphens; it cannot end with a hyphen or contain two consecutive hyphens. </p>
     *         <p>
     *         Constraints:replication instance, endpoint, migration task
     */

    public String getSourceIdentifier() {
        return this.sourceIdentifier;
    }

    /**
     * <p>
     * The identifier of the event source. An identifier must begin with a letter and must contain only ASCII letters,
     * digits, and hyphens; it cannot end with a hyphen or contain two consecutive hyphens.
     * </p>
     * <p>
     * Constraints:replication instance, endpoint, migration task
     * </p>
     * 
     * @param sourceIdentifier
     *        The identifier of the event source. An identifier must begin with a letter and must contain only ASCII
     *        letters, digits, and hyphens; it cannot end with a hyphen or contain two consecutive hyphens. </p>
     *        <p>
     *        Constraints:replication instance, endpoint, migration task
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Event withSourceIdentifier(String sourceIdentifier) {
        setSourceIdentifier(sourceIdentifier);
        return this;
    }

    /**
     * <p>
     * The type of AWS DMS resource that generates events.
     * </p>
     * <p>
     * Valid values: replication-instance | endpoint | migration-task
     * </p>
     * 
     * @param sourceType
     *        The type of AWS DMS resource that generates events. </p>
     *        <p>
     *        Valid values: replication-instance | endpoint | migration-task
     * @see SourceType
     */

    public void setSourceType(String sourceType) {
        this.sourceType = sourceType;
    }

    /**
     * <p>
     * The type of AWS DMS resource that generates events.
     * </p>
     * <p>
     * Valid values: replication-instance | endpoint | migration-task
     * </p>
     * 
     * @return The type of AWS DMS resource that generates events. </p>
     *         <p>
     *         Valid values: replication-instance | endpoint | migration-task
     * @see SourceType
     */

    public String getSourceType() {
        return this.sourceType;
    }

    /**
     * <p>
     * The type of AWS DMS resource that generates events.
     * </p>
     * <p>
     * Valid values: replication-instance | endpoint | migration-task
     * </p>
     * 
     * @param sourceType
     *        The type of AWS DMS resource that generates events. </p>
     *        <p>
     *        Valid values: replication-instance | endpoint | migration-task
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SourceType
     */

    public Event withSourceType(String sourceType) {
        setSourceType(sourceType);
        return this;
    }

    /**
     * <p>
     * The type of AWS DMS resource that generates events.
     * </p>
     * <p>
     * Valid values: replication-instance | endpoint | migration-task
     * </p>
     * 
     * @param sourceType
     *        The type of AWS DMS resource that generates events. </p>
     *        <p>
     *        Valid values: replication-instance | endpoint | migration-task
     * @see SourceType
     */

    public void setSourceType(SourceType sourceType) {
        withSourceType(sourceType);
    }

    /**
     * <p>
     * The type of AWS DMS resource that generates events.
     * </p>
     * <p>
     * Valid values: replication-instance | endpoint | migration-task
     * </p>
     * 
     * @param sourceType
     *        The type of AWS DMS resource that generates events. </p>
     *        <p>
     *        Valid values: replication-instance | endpoint | migration-task
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SourceType
     */

    public Event withSourceType(SourceType sourceType) {
        this.sourceType = sourceType.toString();
        return this;
    }

    /**
     * <p>
     * The event message.
     * </p>
     * 
     * @param message
     *        The event message.
     */

    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * <p>
     * The event message.
     * </p>
     * 
     * @return The event message.
     */

    public String getMessage() {
        return this.message;
    }

    /**
     * <p>
     * The event message.
     * </p>
     * 
     * @param message
     *        The event message.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Event withMessage(String message) {
        setMessage(message);
        return this;
    }

    /**
     * <p>
     * The event categories available for the specified source type.
     * </p>
     * 
     * @return The event categories available for the specified source type.
     */

    public java.util.List<String> getEventCategories() {
        return eventCategories;
    }

    /**
     * <p>
     * The event categories available for the specified source type.
     * </p>
     * 
     * @param eventCategories
     *        The event categories available for the specified source type.
     */

    public void setEventCategories(java.util.Collection<String> eventCategories) {
        if (eventCategories == null) {
            this.eventCategories = null;
            return;
        }

        this.eventCategories = new java.util.ArrayList<String>(eventCategories);
    }

    /**
     * <p>
     * The event categories available for the specified source type.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEventCategories(java.util.Collection)} or {@link #withEventCategories(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param eventCategories
     *        The event categories available for the specified source type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Event withEventCategories(String... eventCategories) {
        if (this.eventCategories == null) {
            setEventCategories(new java.util.ArrayList<String>(eventCategories.length));
        }
        for (String ele : eventCategories) {
            this.eventCategories.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The event categories available for the specified source type.
     * </p>
     * 
     * @param eventCategories
     *        The event categories available for the specified source type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Event withEventCategories(java.util.Collection<String> eventCategories) {
        setEventCategories(eventCategories);
        return this;
    }

    /**
     * <p>
     * The date of the event.
     * </p>
     * 
     * @param date
     *        The date of the event.
     */

    public void setDate(java.util.Date date) {
        this.date = date;
    }

    /**
     * <p>
     * The date of the event.
     * </p>
     * 
     * @return The date of the event.
     */

    public java.util.Date getDate() {
        return this.date;
    }

    /**
     * <p>
     * The date of the event.
     * </p>
     * 
     * @param date
     *        The date of the event.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Event withDate(java.util.Date date) {
        setDate(date);
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
        if (getDate() != null)
            sb.append("Date: ").append(getDate());
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
        if (other.getDate() == null ^ this.getDate() == null)
            return false;
        if (other.getDate() != null && other.getDate().equals(this.getDate()) == false)
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
        hashCode = prime * hashCode + ((getDate() == null) ? 0 : getDate().hashCode());
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

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.databasemigrationservice.model.transform.EventMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
