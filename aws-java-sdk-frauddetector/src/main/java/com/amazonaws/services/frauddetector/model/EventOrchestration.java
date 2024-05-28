/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.frauddetector.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The event orchestration status.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/frauddetector-2019-11-15/EventOrchestration" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EventOrchestration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Specifies if event orchestration is enabled through Amazon EventBridge.
     * </p>
     */
    private Boolean eventBridgeEnabled;

    /**
     * <p>
     * Specifies if event orchestration is enabled through Amazon EventBridge.
     * </p>
     * 
     * @param eventBridgeEnabled
     *        Specifies if event orchestration is enabled through Amazon EventBridge.
     */

    public void setEventBridgeEnabled(Boolean eventBridgeEnabled) {
        this.eventBridgeEnabled = eventBridgeEnabled;
    }

    /**
     * <p>
     * Specifies if event orchestration is enabled through Amazon EventBridge.
     * </p>
     * 
     * @return Specifies if event orchestration is enabled through Amazon EventBridge.
     */

    public Boolean getEventBridgeEnabled() {
        return this.eventBridgeEnabled;
    }

    /**
     * <p>
     * Specifies if event orchestration is enabled through Amazon EventBridge.
     * </p>
     * 
     * @param eventBridgeEnabled
     *        Specifies if event orchestration is enabled through Amazon EventBridge.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EventOrchestration withEventBridgeEnabled(Boolean eventBridgeEnabled) {
        setEventBridgeEnabled(eventBridgeEnabled);
        return this;
    }

    /**
     * <p>
     * Specifies if event orchestration is enabled through Amazon EventBridge.
     * </p>
     * 
     * @return Specifies if event orchestration is enabled through Amazon EventBridge.
     */

    public Boolean isEventBridgeEnabled() {
        return this.eventBridgeEnabled;
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
        if (getEventBridgeEnabled() != null)
            sb.append("EventBridgeEnabled: ").append(getEventBridgeEnabled());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EventOrchestration == false)
            return false;
        EventOrchestration other = (EventOrchestration) obj;
        if (other.getEventBridgeEnabled() == null ^ this.getEventBridgeEnabled() == null)
            return false;
        if (other.getEventBridgeEnabled() != null && other.getEventBridgeEnabled().equals(this.getEventBridgeEnabled()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEventBridgeEnabled() == null) ? 0 : getEventBridgeEnabled().hashCode());
        return hashCode;
    }

    @Override
    public EventOrchestration clone() {
        try {
            return (EventOrchestration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.frauddetector.model.transform.EventOrchestrationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
