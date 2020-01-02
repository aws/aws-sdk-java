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
package com.amazonaws.services.codestarnotifications.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Returns information about an event that has triggered a notification rule.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codestar-notifications-2019-10-15/EventTypeSummary"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EventTypeSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The system-generated ID of the event.
     * </p>
     */
    private String eventTypeId;
    /**
     * <p>
     * The name of the service for which the event applies.
     * </p>
     */
    private String serviceName;
    /**
     * <p>
     * The name of the event.
     * </p>
     */
    private String eventTypeName;
    /**
     * <p>
     * The resource type of the event.
     * </p>
     */
    private String resourceType;

    /**
     * <p>
     * The system-generated ID of the event.
     * </p>
     * 
     * @param eventTypeId
     *        The system-generated ID of the event.
     */

    public void setEventTypeId(String eventTypeId) {
        this.eventTypeId = eventTypeId;
    }

    /**
     * <p>
     * The system-generated ID of the event.
     * </p>
     * 
     * @return The system-generated ID of the event.
     */

    public String getEventTypeId() {
        return this.eventTypeId;
    }

    /**
     * <p>
     * The system-generated ID of the event.
     * </p>
     * 
     * @param eventTypeId
     *        The system-generated ID of the event.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EventTypeSummary withEventTypeId(String eventTypeId) {
        setEventTypeId(eventTypeId);
        return this;
    }

    /**
     * <p>
     * The name of the service for which the event applies.
     * </p>
     * 
     * @param serviceName
     *        The name of the service for which the event applies.
     */

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    /**
     * <p>
     * The name of the service for which the event applies.
     * </p>
     * 
     * @return The name of the service for which the event applies.
     */

    public String getServiceName() {
        return this.serviceName;
    }

    /**
     * <p>
     * The name of the service for which the event applies.
     * </p>
     * 
     * @param serviceName
     *        The name of the service for which the event applies.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EventTypeSummary withServiceName(String serviceName) {
        setServiceName(serviceName);
        return this;
    }

    /**
     * <p>
     * The name of the event.
     * </p>
     * 
     * @param eventTypeName
     *        The name of the event.
     */

    public void setEventTypeName(String eventTypeName) {
        this.eventTypeName = eventTypeName;
    }

    /**
     * <p>
     * The name of the event.
     * </p>
     * 
     * @return The name of the event.
     */

    public String getEventTypeName() {
        return this.eventTypeName;
    }

    /**
     * <p>
     * The name of the event.
     * </p>
     * 
     * @param eventTypeName
     *        The name of the event.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EventTypeSummary withEventTypeName(String eventTypeName) {
        setEventTypeName(eventTypeName);
        return this;
    }

    /**
     * <p>
     * The resource type of the event.
     * </p>
     * 
     * @param resourceType
     *        The resource type of the event.
     */

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * <p>
     * The resource type of the event.
     * </p>
     * 
     * @return The resource type of the event.
     */

    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * <p>
     * The resource type of the event.
     * </p>
     * 
     * @param resourceType
     *        The resource type of the event.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EventTypeSummary withResourceType(String resourceType) {
        setResourceType(resourceType);
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
        if (getEventTypeId() != null)
            sb.append("EventTypeId: ").append(getEventTypeId()).append(",");
        if (getServiceName() != null)
            sb.append("ServiceName: ").append(getServiceName()).append(",");
        if (getEventTypeName() != null)
            sb.append("EventTypeName: ").append(getEventTypeName()).append(",");
        if (getResourceType() != null)
            sb.append("ResourceType: ").append(getResourceType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EventTypeSummary == false)
            return false;
        EventTypeSummary other = (EventTypeSummary) obj;
        if (other.getEventTypeId() == null ^ this.getEventTypeId() == null)
            return false;
        if (other.getEventTypeId() != null && other.getEventTypeId().equals(this.getEventTypeId()) == false)
            return false;
        if (other.getServiceName() == null ^ this.getServiceName() == null)
            return false;
        if (other.getServiceName() != null && other.getServiceName().equals(this.getServiceName()) == false)
            return false;
        if (other.getEventTypeName() == null ^ this.getEventTypeName() == null)
            return false;
        if (other.getEventTypeName() != null && other.getEventTypeName().equals(this.getEventTypeName()) == false)
            return false;
        if (other.getResourceType() == null ^ this.getResourceType() == null)
            return false;
        if (other.getResourceType() != null && other.getResourceType().equals(this.getResourceType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEventTypeId() == null) ? 0 : getEventTypeId().hashCode());
        hashCode = prime * hashCode + ((getServiceName() == null) ? 0 : getServiceName().hashCode());
        hashCode = prime * hashCode + ((getEventTypeName() == null) ? 0 : getEventTypeName().hashCode());
        hashCode = prime * hashCode + ((getResourceType() == null) ? 0 : getResourceType().hashCode());
        return hashCode;
    }

    @Override
    public EventTypeSummary clone() {
        try {
            return (EventTypeSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.codestarnotifications.model.transform.EventTypeSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
