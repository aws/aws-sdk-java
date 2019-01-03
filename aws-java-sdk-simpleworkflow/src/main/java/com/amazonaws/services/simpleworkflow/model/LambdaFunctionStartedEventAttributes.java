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
 * Provides the details of the <code>LambdaFunctionStarted</code> event. It isn't set for other event types.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/swf-2012-01-25/LambdaFunctionStartedEventAttributes"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LambdaFunctionStartedEventAttributes implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ID of the <code>LambdaFunctionScheduled</code> event that was recorded when this activity task was scheduled.
     * To help diagnose issues, use this information to trace back the chain of events leading up to this event.
     * </p>
     */
    private Long scheduledEventId;

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

    public LambdaFunctionStartedEventAttributes withScheduledEventId(Long scheduledEventId) {
        setScheduledEventId(scheduledEventId);
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
            sb.append("ScheduledEventId: ").append(getScheduledEventId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LambdaFunctionStartedEventAttributes == false)
            return false;
        LambdaFunctionStartedEventAttributes other = (LambdaFunctionStartedEventAttributes) obj;
        if (other.getScheduledEventId() == null ^ this.getScheduledEventId() == null)
            return false;
        if (other.getScheduledEventId() != null && other.getScheduledEventId().equals(this.getScheduledEventId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getScheduledEventId() == null) ? 0 : getScheduledEventId().hashCode());
        return hashCode;
    }

    @Override
    public LambdaFunctionStartedEventAttributes clone() {
        try {
            return (LambdaFunctionStartedEventAttributes) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.simpleworkflow.model.transform.LambdaFunctionStartedEventAttributesMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
