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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Describes a volume status event.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/VolumeStatusEvent" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class VolumeStatusEvent implements Serializable, Cloneable {

    /**
     * <p>
     * A description of the event.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The ID of this event.
     * </p>
     */
    private String eventId;
    /**
     * <p>
     * The type of this event.
     * </p>
     */
    private String eventType;
    /**
     * <p>
     * The latest end time of the event.
     * </p>
     */
    private java.util.Date notAfter;
    /**
     * <p>
     * The earliest start time of the event.
     * </p>
     */
    private java.util.Date notBefore;

    /**
     * <p>
     * A description of the event.
     * </p>
     * 
     * @param description
     *        A description of the event.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description of the event.
     * </p>
     * 
     * @return A description of the event.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A description of the event.
     * </p>
     * 
     * @param description
     *        A description of the event.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VolumeStatusEvent withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The ID of this event.
     * </p>
     * 
     * @param eventId
     *        The ID of this event.
     */

    public void setEventId(String eventId) {
        this.eventId = eventId;
    }

    /**
     * <p>
     * The ID of this event.
     * </p>
     * 
     * @return The ID of this event.
     */

    public String getEventId() {
        return this.eventId;
    }

    /**
     * <p>
     * The ID of this event.
     * </p>
     * 
     * @param eventId
     *        The ID of this event.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VolumeStatusEvent withEventId(String eventId) {
        setEventId(eventId);
        return this;
    }

    /**
     * <p>
     * The type of this event.
     * </p>
     * 
     * @param eventType
     *        The type of this event.
     */

    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

    /**
     * <p>
     * The type of this event.
     * </p>
     * 
     * @return The type of this event.
     */

    public String getEventType() {
        return this.eventType;
    }

    /**
     * <p>
     * The type of this event.
     * </p>
     * 
     * @param eventType
     *        The type of this event.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VolumeStatusEvent withEventType(String eventType) {
        setEventType(eventType);
        return this;
    }

    /**
     * <p>
     * The latest end time of the event.
     * </p>
     * 
     * @param notAfter
     *        The latest end time of the event.
     */

    public void setNotAfter(java.util.Date notAfter) {
        this.notAfter = notAfter;
    }

    /**
     * <p>
     * The latest end time of the event.
     * </p>
     * 
     * @return The latest end time of the event.
     */

    public java.util.Date getNotAfter() {
        return this.notAfter;
    }

    /**
     * <p>
     * The latest end time of the event.
     * </p>
     * 
     * @param notAfter
     *        The latest end time of the event.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VolumeStatusEvent withNotAfter(java.util.Date notAfter) {
        setNotAfter(notAfter);
        return this;
    }

    /**
     * <p>
     * The earliest start time of the event.
     * </p>
     * 
     * @param notBefore
     *        The earliest start time of the event.
     */

    public void setNotBefore(java.util.Date notBefore) {
        this.notBefore = notBefore;
    }

    /**
     * <p>
     * The earliest start time of the event.
     * </p>
     * 
     * @return The earliest start time of the event.
     */

    public java.util.Date getNotBefore() {
        return this.notBefore;
    }

    /**
     * <p>
     * The earliest start time of the event.
     * </p>
     * 
     * @param notBefore
     *        The earliest start time of the event.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VolumeStatusEvent withNotBefore(java.util.Date notBefore) {
        setNotBefore(notBefore);
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
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getEventId() != null)
            sb.append("EventId: ").append(getEventId()).append(",");
        if (getEventType() != null)
            sb.append("EventType: ").append(getEventType()).append(",");
        if (getNotAfter() != null)
            sb.append("NotAfter: ").append(getNotAfter()).append(",");
        if (getNotBefore() != null)
            sb.append("NotBefore: ").append(getNotBefore());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof VolumeStatusEvent == false)
            return false;
        VolumeStatusEvent other = (VolumeStatusEvent) obj;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getEventId() == null ^ this.getEventId() == null)
            return false;
        if (other.getEventId() != null && other.getEventId().equals(this.getEventId()) == false)
            return false;
        if (other.getEventType() == null ^ this.getEventType() == null)
            return false;
        if (other.getEventType() != null && other.getEventType().equals(this.getEventType()) == false)
            return false;
        if (other.getNotAfter() == null ^ this.getNotAfter() == null)
            return false;
        if (other.getNotAfter() != null && other.getNotAfter().equals(this.getNotAfter()) == false)
            return false;
        if (other.getNotBefore() == null ^ this.getNotBefore() == null)
            return false;
        if (other.getNotBefore() != null && other.getNotBefore().equals(this.getNotBefore()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getEventId() == null) ? 0 : getEventId().hashCode());
        hashCode = prime * hashCode + ((getEventType() == null) ? 0 : getEventType().hashCode());
        hashCode = prime * hashCode + ((getNotAfter() == null) ? 0 : getNotAfter().hashCode());
        hashCode = prime * hashCode + ((getNotBefore() == null) ? 0 : getNotBefore().hashCode());
        return hashCode;
    }

    @Override
    public VolumeStatusEvent clone() {
        try {
            return (VolumeStatusEvent) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
