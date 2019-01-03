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
package com.amazonaws.services.simpleworkflow.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Provides the details of the <code>LambdaFunctionFailed</code> event. It isn't set for other event types.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/swf-2012-01-25/LambdaFunctionFailedEventAttributes"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LambdaFunctionFailedEventAttributes implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ID of the <code>LambdaFunctionScheduled</code> event that was recorded when this activity task was scheduled.
     * To help diagnose issues, use this information to trace back the chain of events leading up to this event.
     * </p>
     */
    private Long scheduledEventId;
    /**
     * <p>
     * The ID of the <code>LambdaFunctionStarted</code> event recorded when this activity task started. To help diagnose
     * issues, use this information to trace back the chain of events leading up to this event.
     * </p>
     */
    private Long startedEventId;
    /**
     * <p>
     * The reason provided for the failure.
     * </p>
     */
    private String reason;
    /**
     * <p>
     * The details of the failure.
     * </p>
     */
    private String details;

    /**
     * <p>
     * The ID of the <code>LambdaFunctionScheduled</code> event that was recorded when this activity task was scheduled.
     * To help diagnose issues, use this information to trace back the chain of events leading up to this event.
     * </p>
     * 
     * @param scheduledEventId
     *        The ID of the <code>LambdaFunctionScheduled</code> event that was recorded when this activity task was
     *        scheduled. To help diagnose issues, use this information to trace back the chain of events leading up to
     *        this event.
     */

    public void setScheduledEventId(Long scheduledEventId) {
        this.scheduledEventId = scheduledEventId;
    }

    /**
     * <p>
     * The ID of the <code>LambdaFunctionScheduled</code> event that was recorded when this activity task was scheduled.
     * To help diagnose issues, use this information to trace back the chain of events leading up to this event.
     * </p>
     * 
     * @return The ID of the <code>LambdaFunctionScheduled</code> event that was recorded when this activity task was
     *         scheduled. To help diagnose issues, use this information to trace back the chain of events leading up to
     *         this event.
     */

    public Long getScheduledEventId() {
        return this.scheduledEventId;
    }

    /**
     * <p>
     * The ID of the <code>LambdaFunctionScheduled</code> event that was recorded when this activity task was scheduled.
     * To help diagnose issues, use this information to trace back the chain of events leading up to this event.
     * </p>
     * 
     * @param scheduledEventId
     *        The ID of the <code>LambdaFunctionScheduled</code> event that was recorded when this activity task was
     *        scheduled. To help diagnose issues, use this information to trace back the chain of events leading up to
     *        this event.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LambdaFunctionFailedEventAttributes withScheduledEventId(Long scheduledEventId) {
        setScheduledEventId(scheduledEventId);
        return this;
    }

    /**
     * <p>
     * The ID of the <code>LambdaFunctionStarted</code> event recorded when this activity task started. To help diagnose
     * issues, use this information to trace back the chain of events leading up to this event.
     * </p>
     * 
     * @param startedEventId
     *        The ID of the <code>LambdaFunctionStarted</code> event recorded when this activity task started. To help
     *        diagnose issues, use this information to trace back the chain of events leading up to this event.
     */

    public void setStartedEventId(Long startedEventId) {
        this.startedEventId = startedEventId;
    }

    /**
     * <p>
     * The ID of the <code>LambdaFunctionStarted</code> event recorded when this activity task started. To help diagnose
     * issues, use this information to trace back the chain of events leading up to this event.
     * </p>
     * 
     * @return The ID of the <code>LambdaFunctionStarted</code> event recorded when this activity task started. To help
     *         diagnose issues, use this information to trace back the chain of events leading up to this event.
     */

    public Long getStartedEventId() {
        return this.startedEventId;
    }

    /**
     * <p>
     * The ID of the <code>LambdaFunctionStarted</code> event recorded when this activity task started. To help diagnose
     * issues, use this information to trace back the chain of events leading up to this event.
     * </p>
     * 
     * @param startedEventId
     *        The ID of the <code>LambdaFunctionStarted</code> event recorded when this activity task started. To help
     *        diagnose issues, use this information to trace back the chain of events leading up to this event.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LambdaFunctionFailedEventAttributes withStartedEventId(Long startedEventId) {
        setStartedEventId(startedEventId);
        return this;
    }

    /**
     * <p>
     * The reason provided for the failure.
     * </p>
     * 
     * @param reason
     *        The reason provided for the failure.
     */

    public void setReason(String reason) {
        this.reason = reason;
    }

    /**
     * <p>
     * The reason provided for the failure.
     * </p>
     * 
     * @return The reason provided for the failure.
     */

    public String getReason() {
        return this.reason;
    }

    /**
     * <p>
     * The reason provided for the failure.
     * </p>
     * 
     * @param reason
     *        The reason provided for the failure.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LambdaFunctionFailedEventAttributes withReason(String reason) {
        setReason(reason);
        return this;
    }

    /**
     * <p>
     * The details of the failure.
     * </p>
     * 
     * @param details
     *        The details of the failure.
     */

    public void setDetails(String details) {
        this.details = details;
    }

    /**
     * <p>
     * The details of the failure.
     * </p>
     * 
     * @return The details of the failure.
     */

    public String getDetails() {
        return this.details;
    }

    /**
     * <p>
     * The details of the failure.
     * </p>
     * 
     * @param details
     *        The details of the failure.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LambdaFunctionFailedEventAttributes withDetails(String details) {
        setDetails(details);
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
        if (getScheduledEventId() != null)
            sb.append("ScheduledEventId: ").append(getScheduledEventId()).append(",");
        if (getStartedEventId() != null)
            sb.append("StartedEventId: ").append(getStartedEventId()).append(",");
        if (getReason() != null)
            sb.append("Reason: ").append(getReason()).append(",");
        if (getDetails() != null)
            sb.append("Details: ").append(getDetails());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LambdaFunctionFailedEventAttributes == false)
            return false;
        LambdaFunctionFailedEventAttributes other = (LambdaFunctionFailedEventAttributes) obj;
        if (other.getScheduledEventId() == null ^ this.getScheduledEventId() == null)
            return false;
        if (other.getScheduledEventId() != null && other.getScheduledEventId().equals(this.getScheduledEventId()) == false)
            return false;
        if (other.getStartedEventId() == null ^ this.getStartedEventId() == null)
            return false;
        if (other.getStartedEventId() != null && other.getStartedEventId().equals(this.getStartedEventId()) == false)
            return false;
        if (other.getReason() == null ^ this.getReason() == null)
            return false;
        if (other.getReason() != null && other.getReason().equals(this.getReason()) == false)
            return false;
        if (other.getDetails() == null ^ this.getDetails() == null)
            return false;
        if (other.getDetails() != null && other.getDetails().equals(this.getDetails()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getScheduledEventId() == null) ? 0 : getScheduledEventId().hashCode());
        hashCode = prime * hashCode + ((getStartedEventId() == null) ? 0 : getStartedEventId().hashCode());
        hashCode = prime * hashCode + ((getReason() == null) ? 0 : getReason().hashCode());
        hashCode = prime * hashCode + ((getDetails() == null) ? 0 : getDetails().hashCode());
        return hashCode;
    }

    @Override
    public LambdaFunctionFailedEventAttributes clone() {
        try {
            return (LambdaFunctionFailedEventAttributes) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.simpleworkflow.model.transform.LambdaFunctionFailedEventAttributesMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
