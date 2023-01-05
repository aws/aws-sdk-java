/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.frauddetector.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The event details.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/frauddetector-2019-11-15/Event" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Event implements Serializable, Cloneable, StructuredPojo {

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
    private String eventTypeName;
    /**
     * <p>
     * The timestamp that defines when the event under evaluation occurred. The timestamp must be specified using ISO
     * 8601 standard in UTC.
     * </p>
     */
    private String eventTimestamp;
    /**
     * <p>
     * Names of the event type's variables you defined in Amazon Fraud Detector to represent data elements and their
     * corresponding values for the event you are sending for evaluation.
     * </p>
     */
    private java.util.Map<String, String> eventVariables;
    /**
     * <p>
     * The label associated with the event.
     * </p>
     */
    private String currentLabel;
    /**
     * <p>
     * The timestamp associated with the label to update. The timestamp must be specified using ISO 8601 standard in
     * UTC.
     * </p>
     */
    private String labelTimestamp;
    /**
     * <p>
     * The event entities.
     * </p>
     */
    private java.util.List<Entity> entities;

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

    public Event withEventId(String eventId) {
        setEventId(eventId);
        return this;
    }

    /**
     * <p>
     * The event type.
     * </p>
     * 
     * @param eventTypeName
     *        The event type.
     */

    public void setEventTypeName(String eventTypeName) {
        this.eventTypeName = eventTypeName;
    }

    /**
     * <p>
     * The event type.
     * </p>
     * 
     * @return The event type.
     */

    public String getEventTypeName() {
        return this.eventTypeName;
    }

    /**
     * <p>
     * The event type.
     * </p>
     * 
     * @param eventTypeName
     *        The event type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Event withEventTypeName(String eventTypeName) {
        setEventTypeName(eventTypeName);
        return this;
    }

    /**
     * <p>
     * The timestamp that defines when the event under evaluation occurred. The timestamp must be specified using ISO
     * 8601 standard in UTC.
     * </p>
     * 
     * @param eventTimestamp
     *        The timestamp that defines when the event under evaluation occurred. The timestamp must be specified using
     *        ISO 8601 standard in UTC.
     */

    public void setEventTimestamp(String eventTimestamp) {
        this.eventTimestamp = eventTimestamp;
    }

    /**
     * <p>
     * The timestamp that defines when the event under evaluation occurred. The timestamp must be specified using ISO
     * 8601 standard in UTC.
     * </p>
     * 
     * @return The timestamp that defines when the event under evaluation occurred. The timestamp must be specified
     *         using ISO 8601 standard in UTC.
     */

    public String getEventTimestamp() {
        return this.eventTimestamp;
    }

    /**
     * <p>
     * The timestamp that defines when the event under evaluation occurred. The timestamp must be specified using ISO
     * 8601 standard in UTC.
     * </p>
     * 
     * @param eventTimestamp
     *        The timestamp that defines when the event under evaluation occurred. The timestamp must be specified using
     *        ISO 8601 standard in UTC.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Event withEventTimestamp(String eventTimestamp) {
        setEventTimestamp(eventTimestamp);
        return this;
    }

    /**
     * <p>
     * Names of the event type's variables you defined in Amazon Fraud Detector to represent data elements and their
     * corresponding values for the event you are sending for evaluation.
     * </p>
     * 
     * @return Names of the event type's variables you defined in Amazon Fraud Detector to represent data elements and
     *         their corresponding values for the event you are sending for evaluation.
     */

    public java.util.Map<String, String> getEventVariables() {
        return eventVariables;
    }

    /**
     * <p>
     * Names of the event type's variables you defined in Amazon Fraud Detector to represent data elements and their
     * corresponding values for the event you are sending for evaluation.
     * </p>
     * 
     * @param eventVariables
     *        Names of the event type's variables you defined in Amazon Fraud Detector to represent data elements and
     *        their corresponding values for the event you are sending for evaluation.
     */

    public void setEventVariables(java.util.Map<String, String> eventVariables) {
        this.eventVariables = eventVariables;
    }

    /**
     * <p>
     * Names of the event type's variables you defined in Amazon Fraud Detector to represent data elements and their
     * corresponding values for the event you are sending for evaluation.
     * </p>
     * 
     * @param eventVariables
     *        Names of the event type's variables you defined in Amazon Fraud Detector to represent data elements and
     *        their corresponding values for the event you are sending for evaluation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Event withEventVariables(java.util.Map<String, String> eventVariables) {
        setEventVariables(eventVariables);
        return this;
    }

    /**
     * Add a single EventVariables entry
     *
     * @see Event#withEventVariables
     * @returns a reference to this object so that method calls can be chained together.
     */

    public Event addEventVariablesEntry(String key, String value) {
        if (null == this.eventVariables) {
            this.eventVariables = new java.util.HashMap<String, String>();
        }
        if (this.eventVariables.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.eventVariables.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into EventVariables.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Event clearEventVariablesEntries() {
        this.eventVariables = null;
        return this;
    }

    /**
     * <p>
     * The label associated with the event.
     * </p>
     * 
     * @param currentLabel
     *        The label associated with the event.
     */

    public void setCurrentLabel(String currentLabel) {
        this.currentLabel = currentLabel;
    }

    /**
     * <p>
     * The label associated with the event.
     * </p>
     * 
     * @return The label associated with the event.
     */

    public String getCurrentLabel() {
        return this.currentLabel;
    }

    /**
     * <p>
     * The label associated with the event.
     * </p>
     * 
     * @param currentLabel
     *        The label associated with the event.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Event withCurrentLabel(String currentLabel) {
        setCurrentLabel(currentLabel);
        return this;
    }

    /**
     * <p>
     * The timestamp associated with the label to update. The timestamp must be specified using ISO 8601 standard in
     * UTC.
     * </p>
     * 
     * @param labelTimestamp
     *        The timestamp associated with the label to update. The timestamp must be specified using ISO 8601 standard
     *        in UTC.
     */

    public void setLabelTimestamp(String labelTimestamp) {
        this.labelTimestamp = labelTimestamp;
    }

    /**
     * <p>
     * The timestamp associated with the label to update. The timestamp must be specified using ISO 8601 standard in
     * UTC.
     * </p>
     * 
     * @return The timestamp associated with the label to update. The timestamp must be specified using ISO 8601
     *         standard in UTC.
     */

    public String getLabelTimestamp() {
        return this.labelTimestamp;
    }

    /**
     * <p>
     * The timestamp associated with the label to update. The timestamp must be specified using ISO 8601 standard in
     * UTC.
     * </p>
     * 
     * @param labelTimestamp
     *        The timestamp associated with the label to update. The timestamp must be specified using ISO 8601 standard
     *        in UTC.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Event withLabelTimestamp(String labelTimestamp) {
        setLabelTimestamp(labelTimestamp);
        return this;
    }

    /**
     * <p>
     * The event entities.
     * </p>
     * 
     * @return The event entities.
     */

    public java.util.List<Entity> getEntities() {
        return entities;
    }

    /**
     * <p>
     * The event entities.
     * </p>
     * 
     * @param entities
     *        The event entities.
     */

    public void setEntities(java.util.Collection<Entity> entities) {
        if (entities == null) {
            this.entities = null;
            return;
        }

        this.entities = new java.util.ArrayList<Entity>(entities);
    }

    /**
     * <p>
     * The event entities.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEntities(java.util.Collection)} or {@link #withEntities(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param entities
     *        The event entities.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Event withEntities(Entity... entities) {
        if (this.entities == null) {
            setEntities(new java.util.ArrayList<Entity>(entities.length));
        }
        for (Entity ele : entities) {
            this.entities.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The event entities.
     * </p>
     * 
     * @param entities
     *        The event entities.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Event withEntities(java.util.Collection<Entity> entities) {
        setEntities(entities);
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
        if (getEventTypeName() != null)
            sb.append("EventTypeName: ").append(getEventTypeName()).append(",");
        if (getEventTimestamp() != null)
            sb.append("EventTimestamp: ").append(getEventTimestamp()).append(",");
        if (getEventVariables() != null)
            sb.append("EventVariables: ").append("***Sensitive Data Redacted***").append(",");
        if (getCurrentLabel() != null)
            sb.append("CurrentLabel: ").append(getCurrentLabel()).append(",");
        if (getLabelTimestamp() != null)
            sb.append("LabelTimestamp: ").append(getLabelTimestamp()).append(",");
        if (getEntities() != null)
            sb.append("Entities: ").append("***Sensitive Data Redacted***");
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
        if (other.getEventId() == null ^ this.getEventId() == null)
            return false;
        if (other.getEventId() != null && other.getEventId().equals(this.getEventId()) == false)
            return false;
        if (other.getEventTypeName() == null ^ this.getEventTypeName() == null)
            return false;
        if (other.getEventTypeName() != null && other.getEventTypeName().equals(this.getEventTypeName()) == false)
            return false;
        if (other.getEventTimestamp() == null ^ this.getEventTimestamp() == null)
            return false;
        if (other.getEventTimestamp() != null && other.getEventTimestamp().equals(this.getEventTimestamp()) == false)
            return false;
        if (other.getEventVariables() == null ^ this.getEventVariables() == null)
            return false;
        if (other.getEventVariables() != null && other.getEventVariables().equals(this.getEventVariables()) == false)
            return false;
        if (other.getCurrentLabel() == null ^ this.getCurrentLabel() == null)
            return false;
        if (other.getCurrentLabel() != null && other.getCurrentLabel().equals(this.getCurrentLabel()) == false)
            return false;
        if (other.getLabelTimestamp() == null ^ this.getLabelTimestamp() == null)
            return false;
        if (other.getLabelTimestamp() != null && other.getLabelTimestamp().equals(this.getLabelTimestamp()) == false)
            return false;
        if (other.getEntities() == null ^ this.getEntities() == null)
            return false;
        if (other.getEntities() != null && other.getEntities().equals(this.getEntities()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEventId() == null) ? 0 : getEventId().hashCode());
        hashCode = prime * hashCode + ((getEventTypeName() == null) ? 0 : getEventTypeName().hashCode());
        hashCode = prime * hashCode + ((getEventTimestamp() == null) ? 0 : getEventTimestamp().hashCode());
        hashCode = prime * hashCode + ((getEventVariables() == null) ? 0 : getEventVariables().hashCode());
        hashCode = prime * hashCode + ((getCurrentLabel() == null) ? 0 : getCurrentLabel().hashCode());
        hashCode = prime * hashCode + ((getLabelTimestamp() == null) ? 0 : getLabelTimestamp().hashCode());
        hashCode = prime * hashCode + ((getEntities() == null) ? 0 : getEntities().hashCode());
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
        com.amazonaws.services.frauddetector.model.transform.EventMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
