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
package com.amazonaws.services.dataexchange.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An event action is an object that defines the relationship between a specific event and an automated action that will
 * be taken on behalf of the customer.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dataexchange-2017-07-25/EventActionEntry" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EventActionEntry implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * What occurs after a certain event.
     * </p>
     */
    private Action action;
    /**
     * <p>
     * The Amazon Resource Name (ARN) for the event action.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The date and time that the event action was created, in ISO 8601 format.
     * </p>
     */
    private java.util.Date createdAt;
    /**
     * <p>
     * What occurs to start an action.
     * </p>
     */
    private Event event;
    /**
     * <p>
     * The unique identifier for the event action.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The date and time that the event action was last updated, in ISO 8601 format.
     * </p>
     */
    private java.util.Date updatedAt;

    /**
     * <p>
     * What occurs after a certain event.
     * </p>
     * 
     * @param action
     *        What occurs after a certain event.
     */

    public void setAction(Action action) {
        this.action = action;
    }

    /**
     * <p>
     * What occurs after a certain event.
     * </p>
     * 
     * @return What occurs after a certain event.
     */

    public Action getAction() {
        return this.action;
    }

    /**
     * <p>
     * What occurs after a certain event.
     * </p>
     * 
     * @param action
     *        What occurs after a certain event.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EventActionEntry withAction(Action action) {
        setAction(action);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the event action.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) for the event action.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the event action.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) for the event action.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the event action.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) for the event action.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EventActionEntry withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The date and time that the event action was created, in ISO 8601 format.
     * </p>
     * 
     * @param createdAt
     *        The date and time that the event action was created, in ISO 8601 format.
     */

    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * The date and time that the event action was created, in ISO 8601 format.
     * </p>
     * 
     * @return The date and time that the event action was created, in ISO 8601 format.
     */

    public java.util.Date getCreatedAt() {
        return this.createdAt;
    }

    /**
     * <p>
     * The date and time that the event action was created, in ISO 8601 format.
     * </p>
     * 
     * @param createdAt
     *        The date and time that the event action was created, in ISO 8601 format.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EventActionEntry withCreatedAt(java.util.Date createdAt) {
        setCreatedAt(createdAt);
        return this;
    }

    /**
     * <p>
     * What occurs to start an action.
     * </p>
     * 
     * @param event
     *        What occurs to start an action.
     */

    public void setEvent(Event event) {
        this.event = event;
    }

    /**
     * <p>
     * What occurs to start an action.
     * </p>
     * 
     * @return What occurs to start an action.
     */

    public Event getEvent() {
        return this.event;
    }

    /**
     * <p>
     * What occurs to start an action.
     * </p>
     * 
     * @param event
     *        What occurs to start an action.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EventActionEntry withEvent(Event event) {
        setEvent(event);
        return this;
    }

    /**
     * <p>
     * The unique identifier for the event action.
     * </p>
     * 
     * @param id
     *        The unique identifier for the event action.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The unique identifier for the event action.
     * </p>
     * 
     * @return The unique identifier for the event action.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The unique identifier for the event action.
     * </p>
     * 
     * @param id
     *        The unique identifier for the event action.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EventActionEntry withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The date and time that the event action was last updated, in ISO 8601 format.
     * </p>
     * 
     * @param updatedAt
     *        The date and time that the event action was last updated, in ISO 8601 format.
     */

    public void setUpdatedAt(java.util.Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
     * <p>
     * The date and time that the event action was last updated, in ISO 8601 format.
     * </p>
     * 
     * @return The date and time that the event action was last updated, in ISO 8601 format.
     */

    public java.util.Date getUpdatedAt() {
        return this.updatedAt;
    }

    /**
     * <p>
     * The date and time that the event action was last updated, in ISO 8601 format.
     * </p>
     * 
     * @param updatedAt
     *        The date and time that the event action was last updated, in ISO 8601 format.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EventActionEntry withUpdatedAt(java.util.Date updatedAt) {
        setUpdatedAt(updatedAt);
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
        if (getAction() != null)
            sb.append("Action: ").append(getAction()).append(",");
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getCreatedAt() != null)
            sb.append("CreatedAt: ").append(getCreatedAt()).append(",");
        if (getEvent() != null)
            sb.append("Event: ").append(getEvent()).append(",");
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getUpdatedAt() != null)
            sb.append("UpdatedAt: ").append(getUpdatedAt());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EventActionEntry == false)
            return false;
        EventActionEntry other = (EventActionEntry) obj;
        if (other.getAction() == null ^ this.getAction() == null)
            return false;
        if (other.getAction() != null && other.getAction().equals(this.getAction()) == false)
            return false;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null)
            return false;
        if (other.getCreatedAt() != null && other.getCreatedAt().equals(this.getCreatedAt()) == false)
            return false;
        if (other.getEvent() == null ^ this.getEvent() == null)
            return false;
        if (other.getEvent() != null && other.getEvent().equals(this.getEvent()) == false)
            return false;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getUpdatedAt() == null ^ this.getUpdatedAt() == null)
            return false;
        if (other.getUpdatedAt() != null && other.getUpdatedAt().equals(this.getUpdatedAt()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAction() == null) ? 0 : getAction().hashCode());
        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        hashCode = prime * hashCode + ((getEvent() == null) ? 0 : getEvent().hashCode());
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getUpdatedAt() == null) ? 0 : getUpdatedAt().hashCode());
        return hashCode;
    }

    @Override
    public EventActionEntry clone() {
        try {
            return (EventActionEntry) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.dataexchange.model.transform.EventActionEntryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
