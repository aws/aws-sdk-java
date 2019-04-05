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
package com.amazonaws.services.codedeploy.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about a configuration for automatically rolling back to a previous version of an application revision
 * when a deployment is not completed successfully.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codedeploy-2014-10-06/AutoRollbackConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AutoRollbackConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Indicates whether a defined automatic rollback configuration is currently enabled.
     * </p>
     */
    private Boolean enabled;
    /**
     * <p>
     * The event type or types that trigger a rollback.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> events;

    /**
     * <p>
     * Indicates whether a defined automatic rollback configuration is currently enabled.
     * </p>
     * 
     * @param enabled
     *        Indicates whether a defined automatic rollback configuration is currently enabled.
     */

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    /**
     * <p>
     * Indicates whether a defined automatic rollback configuration is currently enabled.
     * </p>
     * 
     * @return Indicates whether a defined automatic rollback configuration is currently enabled.
     */

    public Boolean getEnabled() {
        return this.enabled;
    }

    /**
     * <p>
     * Indicates whether a defined automatic rollback configuration is currently enabled.
     * </p>
     * 
     * @param enabled
     *        Indicates whether a defined automatic rollback configuration is currently enabled.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AutoRollbackConfiguration withEnabled(Boolean enabled) {
        setEnabled(enabled);
        return this;
    }

    /**
     * <p>
     * Indicates whether a defined automatic rollback configuration is currently enabled.
     * </p>
     * 
     * @return Indicates whether a defined automatic rollback configuration is currently enabled.
     */

    public Boolean isEnabled() {
        return this.enabled;
    }

    /**
     * <p>
     * The event type or types that trigger a rollback.
     * </p>
     * 
     * @return The event type or types that trigger a rollback.
     * @see AutoRollbackEvent
     */

    public java.util.List<String> getEvents() {
        if (events == null) {
            events = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return events;
    }

    /**
     * <p>
     * The event type or types that trigger a rollback.
     * </p>
     * 
     * @param events
     *        The event type or types that trigger a rollback.
     * @see AutoRollbackEvent
     */

    public void setEvents(java.util.Collection<String> events) {
        if (events == null) {
            this.events = null;
            return;
        }

        this.events = new com.amazonaws.internal.SdkInternalList<String>(events);
    }

    /**
     * <p>
     * The event type or types that trigger a rollback.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEvents(java.util.Collection)} or {@link #withEvents(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param events
     *        The event type or types that trigger a rollback.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AutoRollbackEvent
     */

    public AutoRollbackConfiguration withEvents(String... events) {
        if (this.events == null) {
            setEvents(new com.amazonaws.internal.SdkInternalList<String>(events.length));
        }
        for (String ele : events) {
            this.events.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The event type or types that trigger a rollback.
     * </p>
     * 
     * @param events
     *        The event type or types that trigger a rollback.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AutoRollbackEvent
     */

    public AutoRollbackConfiguration withEvents(java.util.Collection<String> events) {
        setEvents(events);
        return this;
    }

    /**
     * <p>
     * The event type or types that trigger a rollback.
     * </p>
     * 
     * @param events
     *        The event type or types that trigger a rollback.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AutoRollbackEvent
     */

    public AutoRollbackConfiguration withEvents(AutoRollbackEvent... events) {
        com.amazonaws.internal.SdkInternalList<String> eventsCopy = new com.amazonaws.internal.SdkInternalList<String>(events.length);
        for (AutoRollbackEvent value : events) {
            eventsCopy.add(value.toString());
        }
        if (getEvents() == null) {
            setEvents(eventsCopy);
        } else {
            getEvents().addAll(eventsCopy);
        }
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
        if (getEnabled() != null)
            sb.append("Enabled: ").append(getEnabled()).append(",");
        if (getEvents() != null)
            sb.append("Events: ").append(getEvents());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AutoRollbackConfiguration == false)
            return false;
        AutoRollbackConfiguration other = (AutoRollbackConfiguration) obj;
        if (other.getEnabled() == null ^ this.getEnabled() == null)
            return false;
        if (other.getEnabled() != null && other.getEnabled().equals(this.getEnabled()) == false)
            return false;
        if (other.getEvents() == null ^ this.getEvents() == null)
            return false;
        if (other.getEvents() != null && other.getEvents().equals(this.getEvents()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEnabled() == null) ? 0 : getEnabled().hashCode());
        hashCode = prime * hashCode + ((getEvents() == null) ? 0 : getEvents().hashCode());
        return hashCode;
    }

    @Override
    public AutoRollbackConfiguration clone() {
        try {
            return (AutoRollbackConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.codedeploy.model.transform.AutoRollbackConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
