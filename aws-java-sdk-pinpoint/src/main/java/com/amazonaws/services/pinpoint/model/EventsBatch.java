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
package com.amazonaws.services.pinpoint.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * A batch of PublicEndpoints and Events to process.
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/EventsBatch" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EventsBatch implements Serializable, Cloneable, StructuredPojo {

    /** The PublicEndpoint attached to the EndpointId from the request. */
    private PublicEndpoint endpoint;
    /** An object that contains a set of events associated with the endpoint. */
    private java.util.Map<String, Event> events;

    /**
     * The PublicEndpoint attached to the EndpointId from the request.
     * 
     * @param endpoint
     *        The PublicEndpoint attached to the EndpointId from the request.
     */

    public void setEndpoint(PublicEndpoint endpoint) {
        this.endpoint = endpoint;
    }

    /**
     * The PublicEndpoint attached to the EndpointId from the request.
     * 
     * @return The PublicEndpoint attached to the EndpointId from the request.
     */

    public PublicEndpoint getEndpoint() {
        return this.endpoint;
    }

    /**
     * The PublicEndpoint attached to the EndpointId from the request.
     * 
     * @param endpoint
     *        The PublicEndpoint attached to the EndpointId from the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EventsBatch withEndpoint(PublicEndpoint endpoint) {
        setEndpoint(endpoint);
        return this;
    }

    /**
     * An object that contains a set of events associated with the endpoint.
     * 
     * @return An object that contains a set of events associated with the endpoint.
     */

    public java.util.Map<String, Event> getEvents() {
        return events;
    }

    /**
     * An object that contains a set of events associated with the endpoint.
     * 
     * @param events
     *        An object that contains a set of events associated with the endpoint.
     */

    public void setEvents(java.util.Map<String, Event> events) {
        this.events = events;
    }

    /**
     * An object that contains a set of events associated with the endpoint.
     * 
     * @param events
     *        An object that contains a set of events associated with the endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EventsBatch withEvents(java.util.Map<String, Event> events) {
        setEvents(events);
        return this;
    }

    public EventsBatch addEventsEntry(String key, Event value) {
        if (null == this.events) {
            this.events = new java.util.HashMap<String, Event>();
        }
        if (this.events.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.events.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Events.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EventsBatch clearEventsEntries() {
        this.events = null;
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
        if (getEndpoint() != null)
            sb.append("Endpoint: ").append(getEndpoint()).append(",");
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

        if (obj instanceof EventsBatch == false)
            return false;
        EventsBatch other = (EventsBatch) obj;
        if (other.getEndpoint() == null ^ this.getEndpoint() == null)
            return false;
        if (other.getEndpoint() != null && other.getEndpoint().equals(this.getEndpoint()) == false)
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

        hashCode = prime * hashCode + ((getEndpoint() == null) ? 0 : getEndpoint().hashCode());
        hashCode = prime * hashCode + ((getEvents() == null) ? 0 : getEvents().hashCode());
        return hashCode;
    }

    @Override
    public EventsBatch clone() {
        try {
            return (EventsBatch) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.pinpoint.model.transform.EventsBatchMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
