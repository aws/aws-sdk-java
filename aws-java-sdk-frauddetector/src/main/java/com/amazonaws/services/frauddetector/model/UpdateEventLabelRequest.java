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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/frauddetector-2019-11-15/UpdateEventLabel" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateEventLabelRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the event associated with the label to update.
     * </p>
     */
    private String eventId;
    /**
     * <p>
     * The event type of the event associated with the label to update.
     * </p>
     */
    private String eventTypeName;
    /**
     * <p>
     * The new label to assign to the event.
     * </p>
     */
    private String assignedLabel;
    /**
     * <p>
     * The timestamp associated with the label. The timestamp must be specified using ISO 8601 standard in UTC.
     * </p>
     */
    private String labelTimestamp;

    /**
     * <p>
     * The ID of the event associated with the label to update.
     * </p>
     * 
     * @param eventId
     *        The ID of the event associated with the label to update.
     */

    public void setEventId(String eventId) {
        this.eventId = eventId;
    }

    /**
     * <p>
     * The ID of the event associated with the label to update.
     * </p>
     * 
     * @return The ID of the event associated with the label to update.
     */

    public String getEventId() {
        return this.eventId;
    }

    /**
     * <p>
     * The ID of the event associated with the label to update.
     * </p>
     * 
     * @param eventId
     *        The ID of the event associated with the label to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateEventLabelRequest withEventId(String eventId) {
        setEventId(eventId);
        return this;
    }

    /**
     * <p>
     * The event type of the event associated with the label to update.
     * </p>
     * 
     * @param eventTypeName
     *        The event type of the event associated with the label to update.
     */

    public void setEventTypeName(String eventTypeName) {
        this.eventTypeName = eventTypeName;
    }

    /**
     * <p>
     * The event type of the event associated with the label to update.
     * </p>
     * 
     * @return The event type of the event associated with the label to update.
     */

    public String getEventTypeName() {
        return this.eventTypeName;
    }

    /**
     * <p>
     * The event type of the event associated with the label to update.
     * </p>
     * 
     * @param eventTypeName
     *        The event type of the event associated with the label to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateEventLabelRequest withEventTypeName(String eventTypeName) {
        setEventTypeName(eventTypeName);
        return this;
    }

    /**
     * <p>
     * The new label to assign to the event.
     * </p>
     * 
     * @param assignedLabel
     *        The new label to assign to the event.
     */

    public void setAssignedLabel(String assignedLabel) {
        this.assignedLabel = assignedLabel;
    }

    /**
     * <p>
     * The new label to assign to the event.
     * </p>
     * 
     * @return The new label to assign to the event.
     */

    public String getAssignedLabel() {
        return this.assignedLabel;
    }

    /**
     * <p>
     * The new label to assign to the event.
     * </p>
     * 
     * @param assignedLabel
     *        The new label to assign to the event.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateEventLabelRequest withAssignedLabel(String assignedLabel) {
        setAssignedLabel(assignedLabel);
        return this;
    }

    /**
     * <p>
     * The timestamp associated with the label. The timestamp must be specified using ISO 8601 standard in UTC.
     * </p>
     * 
     * @param labelTimestamp
     *        The timestamp associated with the label. The timestamp must be specified using ISO 8601 standard in UTC.
     */

    public void setLabelTimestamp(String labelTimestamp) {
        this.labelTimestamp = labelTimestamp;
    }

    /**
     * <p>
     * The timestamp associated with the label. The timestamp must be specified using ISO 8601 standard in UTC.
     * </p>
     * 
     * @return The timestamp associated with the label. The timestamp must be specified using ISO 8601 standard in UTC.
     */

    public String getLabelTimestamp() {
        return this.labelTimestamp;
    }

    /**
     * <p>
     * The timestamp associated with the label. The timestamp must be specified using ISO 8601 standard in UTC.
     * </p>
     * 
     * @param labelTimestamp
     *        The timestamp associated with the label. The timestamp must be specified using ISO 8601 standard in UTC.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateEventLabelRequest withLabelTimestamp(String labelTimestamp) {
        setLabelTimestamp(labelTimestamp);
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
        if (getAssignedLabel() != null)
            sb.append("AssignedLabel: ").append(getAssignedLabel()).append(",");
        if (getLabelTimestamp() != null)
            sb.append("LabelTimestamp: ").append(getLabelTimestamp());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateEventLabelRequest == false)
            return false;
        UpdateEventLabelRequest other = (UpdateEventLabelRequest) obj;
        if (other.getEventId() == null ^ this.getEventId() == null)
            return false;
        if (other.getEventId() != null && other.getEventId().equals(this.getEventId()) == false)
            return false;
        if (other.getEventTypeName() == null ^ this.getEventTypeName() == null)
            return false;
        if (other.getEventTypeName() != null && other.getEventTypeName().equals(this.getEventTypeName()) == false)
            return false;
        if (other.getAssignedLabel() == null ^ this.getAssignedLabel() == null)
            return false;
        if (other.getAssignedLabel() != null && other.getAssignedLabel().equals(this.getAssignedLabel()) == false)
            return false;
        if (other.getLabelTimestamp() == null ^ this.getLabelTimestamp() == null)
            return false;
        if (other.getLabelTimestamp() != null && other.getLabelTimestamp().equals(this.getLabelTimestamp()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEventId() == null) ? 0 : getEventId().hashCode());
        hashCode = prime * hashCode + ((getEventTypeName() == null) ? 0 : getEventTypeName().hashCode());
        hashCode = prime * hashCode + ((getAssignedLabel() == null) ? 0 : getAssignedLabel().hashCode());
        hashCode = prime * hashCode + ((getLabelTimestamp() == null) ? 0 : getLabelTimestamp().hashCode());
        return hashCode;
    }

    @Override
    public UpdateEventLabelRequest clone() {
        return (UpdateEventLabelRequest) super.clone();
    }

}
