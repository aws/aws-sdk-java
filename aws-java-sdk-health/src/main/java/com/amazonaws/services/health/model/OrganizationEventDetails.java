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
package com.amazonaws.services.health.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Detailed information about an event. A combination of an <a>Event</a> object, an <a>EventDescription</a> object, and
 * additional metadata about the event. Returned by the <a>DescribeEventDetailsForOrganization</a> operation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/health-2016-08-04/OrganizationEventDetails" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class OrganizationEventDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The 12-digit AWS account numbers that contains the affected entities.
     * </p>
     */
    private String awsAccountId;

    private Event event;

    private EventDescription eventDescription;
    /**
     * <p>
     * Additional metadata about the event.
     * </p>
     */
    private java.util.Map<String, String> eventMetadata;

    /**
     * <p>
     * The 12-digit AWS account numbers that contains the affected entities.
     * </p>
     * 
     * @param awsAccountId
     *        The 12-digit AWS account numbers that contains the affected entities.
     */

    public void setAwsAccountId(String awsAccountId) {
        this.awsAccountId = awsAccountId;
    }

    /**
     * <p>
     * The 12-digit AWS account numbers that contains the affected entities.
     * </p>
     * 
     * @return The 12-digit AWS account numbers that contains the affected entities.
     */

    public String getAwsAccountId() {
        return this.awsAccountId;
    }

    /**
     * <p>
     * The 12-digit AWS account numbers that contains the affected entities.
     * </p>
     * 
     * @param awsAccountId
     *        The 12-digit AWS account numbers that contains the affected entities.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OrganizationEventDetails withAwsAccountId(String awsAccountId) {
        setAwsAccountId(awsAccountId);
        return this;
    }

    /**
     * @param event
     */

    public void setEvent(Event event) {
        this.event = event;
    }

    /**
     * @return
     */

    public Event getEvent() {
        return this.event;
    }

    /**
     * @param event
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OrganizationEventDetails withEvent(Event event) {
        setEvent(event);
        return this;
    }

    /**
     * @param eventDescription
     */

    public void setEventDescription(EventDescription eventDescription) {
        this.eventDescription = eventDescription;
    }

    /**
     * @return
     */

    public EventDescription getEventDescription() {
        return this.eventDescription;
    }

    /**
     * @param eventDescription
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OrganizationEventDetails withEventDescription(EventDescription eventDescription) {
        setEventDescription(eventDescription);
        return this;
    }

    /**
     * <p>
     * Additional metadata about the event.
     * </p>
     * 
     * @return Additional metadata about the event.
     */

    public java.util.Map<String, String> getEventMetadata() {
        return eventMetadata;
    }

    /**
     * <p>
     * Additional metadata about the event.
     * </p>
     * 
     * @param eventMetadata
     *        Additional metadata about the event.
     */

    public void setEventMetadata(java.util.Map<String, String> eventMetadata) {
        this.eventMetadata = eventMetadata;
    }

    /**
     * <p>
     * Additional metadata about the event.
     * </p>
     * 
     * @param eventMetadata
     *        Additional metadata about the event.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OrganizationEventDetails withEventMetadata(java.util.Map<String, String> eventMetadata) {
        setEventMetadata(eventMetadata);
        return this;
    }

    /**
     * Add a single EventMetadata entry
     *
     * @see OrganizationEventDetails#withEventMetadata
     * @returns a reference to this object so that method calls can be chained together.
     */

    public OrganizationEventDetails addEventMetadataEntry(String key, String value) {
        if (null == this.eventMetadata) {
            this.eventMetadata = new java.util.HashMap<String, String>();
        }
        if (this.eventMetadata.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.eventMetadata.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into EventMetadata.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OrganizationEventDetails clearEventMetadataEntries() {
        this.eventMetadata = null;
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
        if (getAwsAccountId() != null)
            sb.append("AwsAccountId: ").append(getAwsAccountId()).append(",");
        if (getEvent() != null)
            sb.append("Event: ").append(getEvent()).append(",");
        if (getEventDescription() != null)
            sb.append("EventDescription: ").append(getEventDescription()).append(",");
        if (getEventMetadata() != null)
            sb.append("EventMetadata: ").append(getEventMetadata());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof OrganizationEventDetails == false)
            return false;
        OrganizationEventDetails other = (OrganizationEventDetails) obj;
        if (other.getAwsAccountId() == null ^ this.getAwsAccountId() == null)
            return false;
        if (other.getAwsAccountId() != null && other.getAwsAccountId().equals(this.getAwsAccountId()) == false)
            return false;
        if (other.getEvent() == null ^ this.getEvent() == null)
            return false;
        if (other.getEvent() != null && other.getEvent().equals(this.getEvent()) == false)
            return false;
        if (other.getEventDescription() == null ^ this.getEventDescription() == null)
            return false;
        if (other.getEventDescription() != null && other.getEventDescription().equals(this.getEventDescription()) == false)
            return false;
        if (other.getEventMetadata() == null ^ this.getEventMetadata() == null)
            return false;
        if (other.getEventMetadata() != null && other.getEventMetadata().equals(this.getEventMetadata()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAwsAccountId() == null) ? 0 : getAwsAccountId().hashCode());
        hashCode = prime * hashCode + ((getEvent() == null) ? 0 : getEvent().hashCode());
        hashCode = prime * hashCode + ((getEventDescription() == null) ? 0 : getEventDescription().hashCode());
        hashCode = prime * hashCode + ((getEventMetadata() == null) ? 0 : getEventMetadata().hashCode());
        return hashCode;
    }

    @Override
    public OrganizationEventDetails clone() {
        try {
            return (OrganizationEventDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.health.model.transform.OrganizationEventDetailsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
