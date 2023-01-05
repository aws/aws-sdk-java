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
package com.amazonaws.services.drs.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A log outputted by a Job.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/drs-2020-02-26/JobLog" target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class JobLog implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The event represents the type of a log.
     * </p>
     */
    private String event;
    /**
     * <p>
     * Metadata associated with a Job log.
     * </p>
     */
    private JobLogEventData eventData;
    /**
     * <p>
     * The date and time the log was taken.
     * </p>
     */
    private String logDateTime;

    /**
     * <p>
     * The event represents the type of a log.
     * </p>
     * 
     * @param event
     *        The event represents the type of a log.
     * @see JobLogEvent
     */

    public void setEvent(String event) {
        this.event = event;
    }

    /**
     * <p>
     * The event represents the type of a log.
     * </p>
     * 
     * @return The event represents the type of a log.
     * @see JobLogEvent
     */

    public String getEvent() {
        return this.event;
    }

    /**
     * <p>
     * The event represents the type of a log.
     * </p>
     * 
     * @param event
     *        The event represents the type of a log.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see JobLogEvent
     */

    public JobLog withEvent(String event) {
        setEvent(event);
        return this;
    }

    /**
     * <p>
     * The event represents the type of a log.
     * </p>
     * 
     * @param event
     *        The event represents the type of a log.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see JobLogEvent
     */

    public JobLog withEvent(JobLogEvent event) {
        this.event = event.toString();
        return this;
    }

    /**
     * <p>
     * Metadata associated with a Job log.
     * </p>
     * 
     * @param eventData
     *        Metadata associated with a Job log.
     */

    public void setEventData(JobLogEventData eventData) {
        this.eventData = eventData;
    }

    /**
     * <p>
     * Metadata associated with a Job log.
     * </p>
     * 
     * @return Metadata associated with a Job log.
     */

    public JobLogEventData getEventData() {
        return this.eventData;
    }

    /**
     * <p>
     * Metadata associated with a Job log.
     * </p>
     * 
     * @param eventData
     *        Metadata associated with a Job log.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobLog withEventData(JobLogEventData eventData) {
        setEventData(eventData);
        return this;
    }

    /**
     * <p>
     * The date and time the log was taken.
     * </p>
     * 
     * @param logDateTime
     *        The date and time the log was taken.
     */

    public void setLogDateTime(String logDateTime) {
        this.logDateTime = logDateTime;
    }

    /**
     * <p>
     * The date and time the log was taken.
     * </p>
     * 
     * @return The date and time the log was taken.
     */

    public String getLogDateTime() {
        return this.logDateTime;
    }

    /**
     * <p>
     * The date and time the log was taken.
     * </p>
     * 
     * @param logDateTime
     *        The date and time the log was taken.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobLog withLogDateTime(String logDateTime) {
        setLogDateTime(logDateTime);
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
        if (getEventData() != null)
            sb.append("EventData: ").append(getEventData()).append(",");
        if (getLogDateTime() != null)
            sb.append("LogDateTime: ").append(getLogDateTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof JobLog == false)
            return false;
        JobLog other = (JobLog) obj;
        if (other.getEvent() == null ^ this.getEvent() == null)
            return false;
        if (other.getEvent() != null && other.getEvent().equals(this.getEvent()) == false)
            return false;
        if (other.getEventData() == null ^ this.getEventData() == null)
            return false;
        if (other.getEventData() != null && other.getEventData().equals(this.getEventData()) == false)
            return false;
        if (other.getLogDateTime() == null ^ this.getLogDateTime() == null)
            return false;
        if (other.getLogDateTime() != null && other.getLogDateTime().equals(this.getLogDateTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEvent() == null) ? 0 : getEvent().hashCode());
        hashCode = prime * hashCode + ((getEventData() == null) ? 0 : getEventData().hashCode());
        hashCode = prime * hashCode + ((getLogDateTime() == null) ? 0 : getLogDateTime().hashCode());
        return hashCode;
    }

    @Override
    public JobLog clone() {
        try {
            return (JobLog) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.drs.model.transform.JobLogMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
