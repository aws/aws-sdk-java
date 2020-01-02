/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.pinpoint.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Specifies the conditions to evaluate for an event that applies to an activity in a journey.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/EventCondition" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EventCondition implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The dimensions for the event filter to use for the activity.
     * </p>
     */
    private EventDimensions dimensions;
    /**
     * <p>
     * The message identifier (message_id) for the message to use when determining whether message events meet the
     * condition.
     * </p>
     */
    private String messageActivity;

    /**
     * <p>
     * The dimensions for the event filter to use for the activity.
     * </p>
     * 
     * @param dimensions
     *        The dimensions for the event filter to use for the activity.
     */

    public void setDimensions(EventDimensions dimensions) {
        this.dimensions = dimensions;
    }

    /**
     * <p>
     * The dimensions for the event filter to use for the activity.
     * </p>
     * 
     * @return The dimensions for the event filter to use for the activity.
     */

    public EventDimensions getDimensions() {
        return this.dimensions;
    }

    /**
     * <p>
     * The dimensions for the event filter to use for the activity.
     * </p>
     * 
     * @param dimensions
     *        The dimensions for the event filter to use for the activity.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EventCondition withDimensions(EventDimensions dimensions) {
        setDimensions(dimensions);
        return this;
    }

    /**
     * <p>
     * The message identifier (message_id) for the message to use when determining whether message events meet the
     * condition.
     * </p>
     * 
     * @param messageActivity
     *        The message identifier (message_id) for the message to use when determining whether message events meet
     *        the condition.
     */

    public void setMessageActivity(String messageActivity) {
        this.messageActivity = messageActivity;
    }

    /**
     * <p>
     * The message identifier (message_id) for the message to use when determining whether message events meet the
     * condition.
     * </p>
     * 
     * @return The message identifier (message_id) for the message to use when determining whether message events meet
     *         the condition.
     */

    public String getMessageActivity() {
        return this.messageActivity;
    }

    /**
     * <p>
     * The message identifier (message_id) for the message to use when determining whether message events meet the
     * condition.
     * </p>
     * 
     * @param messageActivity
     *        The message identifier (message_id) for the message to use when determining whether message events meet
     *        the condition.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EventCondition withMessageActivity(String messageActivity) {
        setMessageActivity(messageActivity);
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
        if (getDimensions() != null)
            sb.append("Dimensions: ").append(getDimensions()).append(",");
        if (getMessageActivity() != null)
            sb.append("MessageActivity: ").append(getMessageActivity());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EventCondition == false)
            return false;
        EventCondition other = (EventCondition) obj;
        if (other.getDimensions() == null ^ this.getDimensions() == null)
            return false;
        if (other.getDimensions() != null && other.getDimensions().equals(this.getDimensions()) == false)
            return false;
        if (other.getMessageActivity() == null ^ this.getMessageActivity() == null)
            return false;
        if (other.getMessageActivity() != null && other.getMessageActivity().equals(this.getMessageActivity()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDimensions() == null) ? 0 : getDimensions().hashCode());
        hashCode = prime * hashCode + ((getMessageActivity() == null) ? 0 : getMessageActivity().hashCode());
        return hashCode;
    }

    @Override
    public EventCondition clone() {
        try {
            return (EventCondition) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.pinpoint.model.transform.EventConditionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
