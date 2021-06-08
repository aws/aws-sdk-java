/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.lexmodelsv2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Provides information about an event that occurred affecting the bot locale.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/BotLocaleHistoryEvent"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BotLocaleHistoryEvent implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A description of the event that occurred.
     * </p>
     */
    private String event;
    /**
     * <p>
     * A timestamp of the date and time that the event occurred.
     * </p>
     */
    private java.util.Date eventDate;

    /**
     * <p>
     * A description of the event that occurred.
     * </p>
     * 
     * @param event
     *        A description of the event that occurred.
     */

    public void setEvent(String event) {
        this.event = event;
    }

    /**
     * <p>
     * A description of the event that occurred.
     * </p>
     * 
     * @return A description of the event that occurred.
     */

    public String getEvent() {
        return this.event;
    }

    /**
     * <p>
     * A description of the event that occurred.
     * </p>
     * 
     * @param event
     *        A description of the event that occurred.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BotLocaleHistoryEvent withEvent(String event) {
        setEvent(event);
        return this;
    }

    /**
     * <p>
     * A timestamp of the date and time that the event occurred.
     * </p>
     * 
     * @param eventDate
     *        A timestamp of the date and time that the event occurred.
     */

    public void setEventDate(java.util.Date eventDate) {
        this.eventDate = eventDate;
    }

    /**
     * <p>
     * A timestamp of the date and time that the event occurred.
     * </p>
     * 
     * @return A timestamp of the date and time that the event occurred.
     */

    public java.util.Date getEventDate() {
        return this.eventDate;
    }

    /**
     * <p>
     * A timestamp of the date and time that the event occurred.
     * </p>
     * 
     * @param eventDate
     *        A timestamp of the date and time that the event occurred.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BotLocaleHistoryEvent withEventDate(java.util.Date eventDate) {
        setEventDate(eventDate);
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
        if (getEvent() != null)
            sb.append("Event: ").append(getEvent()).append(",");
        if (getEventDate() != null)
            sb.append("EventDate: ").append(getEventDate());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BotLocaleHistoryEvent == false)
            return false;
        BotLocaleHistoryEvent other = (BotLocaleHistoryEvent) obj;
        if (other.getEvent() == null ^ this.getEvent() == null)
            return false;
        if (other.getEvent() != null && other.getEvent().equals(this.getEvent()) == false)
            return false;
        if (other.getEventDate() == null ^ this.getEventDate() == null)
            return false;
        if (other.getEventDate() != null && other.getEventDate().equals(this.getEventDate()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEvent() == null) ? 0 : getEvent().hashCode());
        hashCode = prime * hashCode + ((getEventDate() == null) ? 0 : getEventDate().hashCode());
        return hashCode;
    }

    @Override
    public BotLocaleHistoryEvent clone() {
        try {
            return (BotLocaleHistoryEvent) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lexmodelsv2.model.transform.BotLocaleHistoryEventMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
