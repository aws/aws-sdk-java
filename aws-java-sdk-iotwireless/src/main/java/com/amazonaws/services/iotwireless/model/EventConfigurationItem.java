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
package com.amazonaws.services.iotwireless.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Event configuration object for a single resource.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/EventConfigurationItem" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EventConfigurationItem implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Resource identifier opted in for event messaging.
     * </p>
     */
    private String identifier;
    /**
     * <p>
     * Identifier type of the particular resource identifier for event configuration.
     * </p>
     */
    private String identifierType;
    /**
     * <p>
     * Partner type of the resource if the identifier type is PartnerAccountId.
     * </p>
     */
    private String partnerType;

    private EventNotificationItemConfigurations events;

    /**
     * <p>
     * Resource identifier opted in for event messaging.
     * </p>
     * 
     * @param identifier
     *        Resource identifier opted in for event messaging.
     */

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    /**
     * <p>
     * Resource identifier opted in for event messaging.
     * </p>
     * 
     * @return Resource identifier opted in for event messaging.
     */

    public String getIdentifier() {
        return this.identifier;
    }

    /**
     * <p>
     * Resource identifier opted in for event messaging.
     * </p>
     * 
     * @param identifier
     *        Resource identifier opted in for event messaging.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EventConfigurationItem withIdentifier(String identifier) {
        setIdentifier(identifier);
        return this;
    }

    /**
     * <p>
     * Identifier type of the particular resource identifier for event configuration.
     * </p>
     * 
     * @param identifierType
     *        Identifier type of the particular resource identifier for event configuration.
     * @see IdentifierType
     */

    public void setIdentifierType(String identifierType) {
        this.identifierType = identifierType;
    }

    /**
     * <p>
     * Identifier type of the particular resource identifier for event configuration.
     * </p>
     * 
     * @return Identifier type of the particular resource identifier for event configuration.
     * @see IdentifierType
     */

    public String getIdentifierType() {
        return this.identifierType;
    }

    /**
     * <p>
     * Identifier type of the particular resource identifier for event configuration.
     * </p>
     * 
     * @param identifierType
     *        Identifier type of the particular resource identifier for event configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see IdentifierType
     */

    public EventConfigurationItem withIdentifierType(String identifierType) {
        setIdentifierType(identifierType);
        return this;
    }

    /**
     * <p>
     * Identifier type of the particular resource identifier for event configuration.
     * </p>
     * 
     * @param identifierType
     *        Identifier type of the particular resource identifier for event configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see IdentifierType
     */

    public EventConfigurationItem withIdentifierType(IdentifierType identifierType) {
        this.identifierType = identifierType.toString();
        return this;
    }

    /**
     * <p>
     * Partner type of the resource if the identifier type is PartnerAccountId.
     * </p>
     * 
     * @param partnerType
     *        Partner type of the resource if the identifier type is PartnerAccountId.
     * @see EventNotificationPartnerType
     */

    public void setPartnerType(String partnerType) {
        this.partnerType = partnerType;
    }

    /**
     * <p>
     * Partner type of the resource if the identifier type is PartnerAccountId.
     * </p>
     * 
     * @return Partner type of the resource if the identifier type is PartnerAccountId.
     * @see EventNotificationPartnerType
     */

    public String getPartnerType() {
        return this.partnerType;
    }

    /**
     * <p>
     * Partner type of the resource if the identifier type is PartnerAccountId.
     * </p>
     * 
     * @param partnerType
     *        Partner type of the resource if the identifier type is PartnerAccountId.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EventNotificationPartnerType
     */

    public EventConfigurationItem withPartnerType(String partnerType) {
        setPartnerType(partnerType);
        return this;
    }

    /**
     * <p>
     * Partner type of the resource if the identifier type is PartnerAccountId.
     * </p>
     * 
     * @param partnerType
     *        Partner type of the resource if the identifier type is PartnerAccountId.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EventNotificationPartnerType
     */

    public EventConfigurationItem withPartnerType(EventNotificationPartnerType partnerType) {
        this.partnerType = partnerType.toString();
        return this;
    }

    /**
     * @param events
     */

    public void setEvents(EventNotificationItemConfigurations events) {
        this.events = events;
    }

    /**
     * @return
     */

    public EventNotificationItemConfigurations getEvents() {
        return this.events;
    }

    /**
     * @param events
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EventConfigurationItem withEvents(EventNotificationItemConfigurations events) {
        setEvents(events);
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
        if (getIdentifier() != null)
            sb.append("Identifier: ").append(getIdentifier()).append(",");
        if (getIdentifierType() != null)
            sb.append("IdentifierType: ").append(getIdentifierType()).append(",");
        if (getPartnerType() != null)
            sb.append("PartnerType: ").append(getPartnerType()).append(",");
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

        if (obj instanceof EventConfigurationItem == false)
            return false;
        EventConfigurationItem other = (EventConfigurationItem) obj;
        if (other.getIdentifier() == null ^ this.getIdentifier() == null)
            return false;
        if (other.getIdentifier() != null && other.getIdentifier().equals(this.getIdentifier()) == false)
            return false;
        if (other.getIdentifierType() == null ^ this.getIdentifierType() == null)
            return false;
        if (other.getIdentifierType() != null && other.getIdentifierType().equals(this.getIdentifierType()) == false)
            return false;
        if (other.getPartnerType() == null ^ this.getPartnerType() == null)
            return false;
        if (other.getPartnerType() != null && other.getPartnerType().equals(this.getPartnerType()) == false)
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

        hashCode = prime * hashCode + ((getIdentifier() == null) ? 0 : getIdentifier().hashCode());
        hashCode = prime * hashCode + ((getIdentifierType() == null) ? 0 : getIdentifierType().hashCode());
        hashCode = prime * hashCode + ((getPartnerType() == null) ? 0 : getPartnerType().hashCode());
        hashCode = prime * hashCode + ((getEvents() == null) ? 0 : getEvents().hashCode());
        return hashCode;
    }

    @Override
    public EventConfigurationItem clone() {
        try {
            return (EventConfigurationItem) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iotwireless.model.transform.EventConfigurationItemMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
