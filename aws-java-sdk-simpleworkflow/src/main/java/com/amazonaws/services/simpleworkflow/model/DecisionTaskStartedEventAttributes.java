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
 * Provides the details of the <code>DecisionTaskStarted</code> event.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/swf-2012-01-25/DecisionTaskStartedEventAttributes"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DecisionTaskStartedEventAttributes implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Identity of the decider making the request. This enables diagnostic tracing when problems arise. The form of this
     * identity is user defined.
     * </p>
     */
    private String identity;
    /**
     * <p>
     * The ID of the <code>DecisionTaskScheduled</code> event that was recorded when this decision task was scheduled.
     * This information can be useful for diagnosing problems by tracing back the chain of events leading up to this
     * event.
     * </p>
     */
    private Long scheduledEventId;

    /**
     * <p>
     * Identity of the decider making the request. This enables diagnostic tracing when problems arise. The form of this
     * identity is user defined.
     * </p>
     * 
     * @param identity
     *        Identity of the decider making the request. This enables diagnostic tracing when problems arise. The form
     *        of this identity is user defined.
     */

    public void setIdentity(String identity) {
        this.identity = identity;
    }

    /**
     * <p>
     * Identity of the decider making the request. This enables diagnostic tracing when problems arise. The form of this
     * identity is user defined.
     * </p>
     * 
     * @return Identity of the decider making the request. This enables diagnostic tracing when problems arise. The form
     *         of this identity is user defined.
     */

    public String getIdentity() {
        return this.identity;
    }

    /**
     * <p>
     * Identity of the decider making the request. This enables diagnostic tracing when problems arise. The form of this
     * identity is user defined.
     * </p>
     * 
     * @param identity
     *        Identity of the decider making the request. This enables diagnostic tracing when problems arise. The form
     *        of this identity is user defined.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DecisionTaskStartedEventAttributes withIdentity(String identity) {
        setIdentity(identity);
        return this;
    }

    /**
     * <p>
     * The ID of the <code>DecisionTaskScheduled</code> event that was recorded when this decision task was scheduled.
     * This information can be useful for diagnosing problems by tracing back the chain of events leading up to this
     * event.
     * </p>
     * 
     * @param scheduledEventId
     *        The ID of the <code>DecisionTaskScheduled</code> event that was recorded when this decision task was
     *        scheduled. This information can be useful for diagnosing problems by tracing back the chain of events
     *        leading up to this event.
     */

    public void setScheduledEventId(Long scheduledEventId) {
        this.scheduledEventId = scheduledEventId;
    }

    /**
     * <p>
     * The ID of the <code>DecisionTaskScheduled</code> event that was recorded when this decision task was scheduled.
     * This information can be useful for diagnosing problems by tracing back the chain of events leading up to this
     * event.
     * </p>
     * 
     * @return The ID of the <code>DecisionTaskScheduled</code> event that was recorded when this decision task was
     *         scheduled. This information can be useful for diagnosing problems by tracing back the chain of events
     *         leading up to this event.
     */

    public Long getScheduledEventId() {
        return this.scheduledEventId;
    }

    /**
     * <p>
     * The ID of the <code>DecisionTaskScheduled</code> event that was recorded when this decision task was scheduled.
     * This information can be useful for diagnosing problems by tracing back the chain of events leading up to this
     * event.
     * </p>
     * 
     * @param scheduledEventId
     *        The ID of the <code>DecisionTaskScheduled</code> event that was recorded when this decision task was
     *        scheduled. This information can be useful for diagnosing problems by tracing back the chain of events
     *        leading up to this event.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DecisionTaskStartedEventAttributes withScheduledEventId(Long scheduledEventId) {
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
        if (getIdentity() != null)
            sb.append("Identity: ").append(getIdentity()).append(",");
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

        if (obj instanceof DecisionTaskStartedEventAttributes == false)
            return false;
        DecisionTaskStartedEventAttributes other = (DecisionTaskStartedEventAttributes) obj;
        if (other.getIdentity() == null ^ this.getIdentity() == null)
            return false;
        if (other.getIdentity() != null && other.getIdentity().equals(this.getIdentity()) == false)
            return false;
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

        hashCode = prime * hashCode + ((getIdentity() == null) ? 0 : getIdentity().hashCode());
        hashCode = prime * hashCode + ((getScheduledEventId() == null) ? 0 : getScheduledEventId().hashCode());
        return hashCode;
    }

    @Override
    public DecisionTaskStartedEventAttributes clone() {
        try {
            return (DecisionTaskStartedEventAttributes) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.simpleworkflow.model.transform.DecisionTaskStartedEventAttributesMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
