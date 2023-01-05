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
package com.amazonaws.services.braket.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Details about the type and time events occurred related to the Amazon Braket job.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/braket-2019-09-01/JobEventDetails" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class JobEventDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The type of event that occurred related to the Amazon Braket job.
     * </p>
     */
    private String eventType;
    /**
     * <p>
     * A message describing the event that occurred related to the Amazon Braket job.
     * </p>
     */
    private String message;
    /**
     * <p>
     * TThe type of event that occurred related to the Amazon Braket job.
     * </p>
     */
    private java.util.Date timeOfEvent;

    /**
     * <p>
     * The type of event that occurred related to the Amazon Braket job.
     * </p>
     * 
     * @param eventType
     *        The type of event that occurred related to the Amazon Braket job.
     * @see JobEventType
     */

    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

    /**
     * <p>
     * The type of event that occurred related to the Amazon Braket job.
     * </p>
     * 
     * @return The type of event that occurred related to the Amazon Braket job.
     * @see JobEventType
     */

    public String getEventType() {
        return this.eventType;
    }

    /**
     * <p>
     * The type of event that occurred related to the Amazon Braket job.
     * </p>
     * 
     * @param eventType
     *        The type of event that occurred related to the Amazon Braket job.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see JobEventType
     */

    public JobEventDetails withEventType(String eventType) {
        setEventType(eventType);
        return this;
    }

    /**
     * <p>
     * The type of event that occurred related to the Amazon Braket job.
     * </p>
     * 
     * @param eventType
     *        The type of event that occurred related to the Amazon Braket job.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see JobEventType
     */

    public JobEventDetails withEventType(JobEventType eventType) {
        this.eventType = eventType.toString();
        return this;
    }

    /**
     * <p>
     * A message describing the event that occurred related to the Amazon Braket job.
     * </p>
     * 
     * @param message
     *        A message describing the event that occurred related to the Amazon Braket job.
     */

    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * <p>
     * A message describing the event that occurred related to the Amazon Braket job.
     * </p>
     * 
     * @return A message describing the event that occurred related to the Amazon Braket job.
     */

    public String getMessage() {
        return this.message;
    }

    /**
     * <p>
     * A message describing the event that occurred related to the Amazon Braket job.
     * </p>
     * 
     * @param message
     *        A message describing the event that occurred related to the Amazon Braket job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobEventDetails withMessage(String message) {
        setMessage(message);
        return this;
    }

    /**
     * <p>
     * TThe type of event that occurred related to the Amazon Braket job.
     * </p>
     * 
     * @param timeOfEvent
     *        TThe type of event that occurred related to the Amazon Braket job.
     */

    public void setTimeOfEvent(java.util.Date timeOfEvent) {
        this.timeOfEvent = timeOfEvent;
    }

    /**
     * <p>
     * TThe type of event that occurred related to the Amazon Braket job.
     * </p>
     * 
     * @return TThe type of event that occurred related to the Amazon Braket job.
     */

    public java.util.Date getTimeOfEvent() {
        return this.timeOfEvent;
    }

    /**
     * <p>
     * TThe type of event that occurred related to the Amazon Braket job.
     * </p>
     * 
     * @param timeOfEvent
     *        TThe type of event that occurred related to the Amazon Braket job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobEventDetails withTimeOfEvent(java.util.Date timeOfEvent) {
        setTimeOfEvent(timeOfEvent);
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
        if (getEventType() != null)
            sb.append("EventType: ").append(getEventType()).append(",");
        if (getMessage() != null)
            sb.append("Message: ").append(getMessage()).append(",");
        if (getTimeOfEvent() != null)
            sb.append("TimeOfEvent: ").append(getTimeOfEvent());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof JobEventDetails == false)
            return false;
        JobEventDetails other = (JobEventDetails) obj;
        if (other.getEventType() == null ^ this.getEventType() == null)
            return false;
        if (other.getEventType() != null && other.getEventType().equals(this.getEventType()) == false)
            return false;
        if (other.getMessage() == null ^ this.getMessage() == null)
            return false;
        if (other.getMessage() != null && other.getMessage().equals(this.getMessage()) == false)
            return false;
        if (other.getTimeOfEvent() == null ^ this.getTimeOfEvent() == null)
            return false;
        if (other.getTimeOfEvent() != null && other.getTimeOfEvent().equals(this.getTimeOfEvent()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEventType() == null) ? 0 : getEventType().hashCode());
        hashCode = prime * hashCode + ((getMessage() == null) ? 0 : getMessage().hashCode());
        hashCode = prime * hashCode + ((getTimeOfEvent() == null) ? 0 : getTimeOfEvent().hashCode());
        return hashCode;
    }

    @Override
    public JobEventDetails clone() {
        try {
            return (JobEventDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.braket.model.transform.JobEventDetailsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
