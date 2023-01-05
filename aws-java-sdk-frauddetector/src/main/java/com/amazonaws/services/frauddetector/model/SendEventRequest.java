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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/frauddetector-2019-11-15/SendEvent" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SendEventRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The event ID to upload.
     * </p>
     */
    private String eventId;
    /**
     * <p>
     * The event type name of the event.
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
     * The label to associate with the event. Required if specifying <code>labelTimestamp</code>.
     * </p>
     */
    private String assignedLabel;
    /**
     * <p>
     * The timestamp associated with the label. Required if specifying <code>assignedLabel</code>.
     * </p>
     */
    private String labelTimestamp;
    /**
     * <p>
     * An array of entities.
     * </p>
     */
    private java.util.List<Entity> entities;

    /**
     * <p>
     * The event ID to upload.
     * </p>
     * 
     * @param eventId
     *        The event ID to upload.
     */

    public void setEventId(String eventId) {
        this.eventId = eventId;
    }

    /**
     * <p>
     * The event ID to upload.
     * </p>
     * 
     * @return The event ID to upload.
     */

    public String getEventId() {
        return this.eventId;
    }

    /**
     * <p>
     * The event ID to upload.
     * </p>
     * 
     * @param eventId
     *        The event ID to upload.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SendEventRequest withEventId(String eventId) {
        setEventId(eventId);
        return this;
    }

    /**
     * <p>
     * The event type name of the event.
     * </p>
     * 
     * @param eventTypeName
     *        The event type name of the event.
     */

    public void setEventTypeName(String eventTypeName) {
        this.eventTypeName = eventTypeName;
    }

    /**
     * <p>
     * The event type name of the event.
     * </p>
     * 
     * @return The event type name of the event.
     */

    public String getEventTypeName() {
        return this.eventTypeName;
    }

    /**
     * <p>
     * The event type name of the event.
     * </p>
     * 
     * @param eventTypeName
     *        The event type name of the event.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SendEventRequest withEventTypeName(String eventTypeName) {
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

    public SendEventRequest withEventTimestamp(String eventTimestamp) {
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

    public SendEventRequest withEventVariables(java.util.Map<String, String> eventVariables) {
        setEventVariables(eventVariables);
        return this;
    }

    /**
     * Add a single EventVariables entry
     *
     * @see SendEventRequest#withEventVariables
     * @returns a reference to this object so that method calls can be chained together.
     */

    public SendEventRequest addEventVariablesEntry(String key, String value) {
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

    public SendEventRequest clearEventVariablesEntries() {
        this.eventVariables = null;
        return this;
    }

    /**
     * <p>
     * The label to associate with the event. Required if specifying <code>labelTimestamp</code>.
     * </p>
     * 
     * @param assignedLabel
     *        The label to associate with the event. Required if specifying <code>labelTimestamp</code>.
     */

    public void setAssignedLabel(String assignedLabel) {
        this.assignedLabel = assignedLabel;
    }

    /**
     * <p>
     * The label to associate with the event. Required if specifying <code>labelTimestamp</code>.
     * </p>
     * 
     * @return The label to associate with the event. Required if specifying <code>labelTimestamp</code>.
     */

    public String getAssignedLabel() {
        return this.assignedLabel;
    }

    /**
     * <p>
     * The label to associate with the event. Required if specifying <code>labelTimestamp</code>.
     * </p>
     * 
     * @param assignedLabel
     *        The label to associate with the event. Required if specifying <code>labelTimestamp</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SendEventRequest withAssignedLabel(String assignedLabel) {
        setAssignedLabel(assignedLabel);
        return this;
    }

    /**
     * <p>
     * The timestamp associated with the label. Required if specifying <code>assignedLabel</code>.
     * </p>
     * 
     * @param labelTimestamp
     *        The timestamp associated with the label. Required if specifying <code>assignedLabel</code>.
     */

    public void setLabelTimestamp(String labelTimestamp) {
        this.labelTimestamp = labelTimestamp;
    }

    /**
     * <p>
     * The timestamp associated with the label. Required if specifying <code>assignedLabel</code>.
     * </p>
     * 
     * @return The timestamp associated with the label. Required if specifying <code>assignedLabel</code>.
     */

    public String getLabelTimestamp() {
        return this.labelTimestamp;
    }

    /**
     * <p>
     * The timestamp associated with the label. Required if specifying <code>assignedLabel</code>.
     * </p>
     * 
     * @param labelTimestamp
     *        The timestamp associated with the label. Required if specifying <code>assignedLabel</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SendEventRequest withLabelTimestamp(String labelTimestamp) {
        setLabelTimestamp(labelTimestamp);
        return this;
    }

    /**
     * <p>
     * An array of entities.
     * </p>
     * 
     * @return An array of entities.
     */

    public java.util.List<Entity> getEntities() {
        return entities;
    }

    /**
     * <p>
     * An array of entities.
     * </p>
     * 
     * @param entities
     *        An array of entities.
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
     * An array of entities.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEntities(java.util.Collection)} or {@link #withEntities(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param entities
     *        An array of entities.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SendEventRequest withEntities(Entity... entities) {
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
     * An array of entities.
     * </p>
     * 
     * @param entities
     *        An array of entities.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SendEventRequest withEntities(java.util.Collection<Entity> entities) {
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
        if (getAssignedLabel() != null)
            sb.append("AssignedLabel: ").append(getAssignedLabel()).append(",");
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

        if (obj instanceof SendEventRequest == false)
            return false;
        SendEventRequest other = (SendEventRequest) obj;
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
        if (other.getAssignedLabel() == null ^ this.getAssignedLabel() == null)
            return false;
        if (other.getAssignedLabel() != null && other.getAssignedLabel().equals(this.getAssignedLabel()) == false)
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
        hashCode = prime * hashCode + ((getAssignedLabel() == null) ? 0 : getAssignedLabel().hashCode());
        hashCode = prime * hashCode + ((getLabelTimestamp() == null) ? 0 : getLabelTimestamp().hashCode());
        hashCode = prime * hashCode + ((getEntities() == null) ? 0 : getEntities().hashCode());
        return hashCode;
    }

    @Override
    public SendEventRequest clone() {
        return (SendEventRequest) super.clone();
    }

}
