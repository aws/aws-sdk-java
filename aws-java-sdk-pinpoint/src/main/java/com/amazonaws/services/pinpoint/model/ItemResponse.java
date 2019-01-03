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
 * The response that's provided after registering the endpoint.
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/ItemResponse" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ItemResponse implements Serializable, Cloneable, StructuredPojo {

    /** The response received after the endpoint was accepted. */
    private EndpointItemResponse endpointItemResponse;
    /**
     * A multipart response object that contains a key and value for each event ID in the request. In each object, the
     * event ID is the key, and an EventItemResponse object is the value.
     */
    private java.util.Map<String, EventItemResponse> eventsItemResponse;

    /**
     * The response received after the endpoint was accepted.
     * 
     * @param endpointItemResponse
     *        The response received after the endpoint was accepted.
     */

    public void setEndpointItemResponse(EndpointItemResponse endpointItemResponse) {
        this.endpointItemResponse = endpointItemResponse;
    }

    /**
     * The response received after the endpoint was accepted.
     * 
     * @return The response received after the endpoint was accepted.
     */

    public EndpointItemResponse getEndpointItemResponse() {
        return this.endpointItemResponse;
    }

    /**
     * The response received after the endpoint was accepted.
     * 
     * @param endpointItemResponse
     *        The response received after the endpoint was accepted.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ItemResponse withEndpointItemResponse(EndpointItemResponse endpointItemResponse) {
        setEndpointItemResponse(endpointItemResponse);
        return this;
    }

    /**
     * A multipart response object that contains a key and value for each event ID in the request. In each object, the
     * event ID is the key, and an EventItemResponse object is the value.
     * 
     * @return A multipart response object that contains a key and value for each event ID in the request. In each
     *         object, the event ID is the key, and an EventItemResponse object is the value.
     */

    public java.util.Map<String, EventItemResponse> getEventsItemResponse() {
        return eventsItemResponse;
    }

    /**
     * A multipart response object that contains a key and value for each event ID in the request. In each object, the
     * event ID is the key, and an EventItemResponse object is the value.
     * 
     * @param eventsItemResponse
     *        A multipart response object that contains a key and value for each event ID in the request. In each
     *        object, the event ID is the key, and an EventItemResponse object is the value.
     */

    public void setEventsItemResponse(java.util.Map<String, EventItemResponse> eventsItemResponse) {
        this.eventsItemResponse = eventsItemResponse;
    }

    /**
     * A multipart response object that contains a key and value for each event ID in the request. In each object, the
     * event ID is the key, and an EventItemResponse object is the value.
     * 
     * @param eventsItemResponse
     *        A multipart response object that contains a key and value for each event ID in the request. In each
     *        object, the event ID is the key, and an EventItemResponse object is the value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ItemResponse withEventsItemResponse(java.util.Map<String, EventItemResponse> eventsItemResponse) {
        setEventsItemResponse(eventsItemResponse);
        return this;
    }

    public ItemResponse addEventsItemResponseEntry(String key, EventItemResponse value) {
        if (null == this.eventsItemResponse) {
            this.eventsItemResponse = new java.util.HashMap<String, EventItemResponse>();
        }
        if (this.eventsItemResponse.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.eventsItemResponse.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into EventsItemResponse.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ItemResponse clearEventsItemResponseEntries() {
        this.eventsItemResponse = null;
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
        if (getEndpointItemResponse() != null)
            sb.append("EndpointItemResponse: ").append(getEndpointItemResponse()).append(",");
        if (getEventsItemResponse() != null)
            sb.append("EventsItemResponse: ").append(getEventsItemResponse());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ItemResponse == false)
            return false;
        ItemResponse other = (ItemResponse) obj;
        if (other.getEndpointItemResponse() == null ^ this.getEndpointItemResponse() == null)
            return false;
        if (other.getEndpointItemResponse() != null && other.getEndpointItemResponse().equals(this.getEndpointItemResponse()) == false)
            return false;
        if (other.getEventsItemResponse() == null ^ this.getEventsItemResponse() == null)
            return false;
        if (other.getEventsItemResponse() != null && other.getEventsItemResponse().equals(this.getEventsItemResponse()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEndpointItemResponse() == null) ? 0 : getEndpointItemResponse().hashCode());
        hashCode = prime * hashCode + ((getEventsItemResponse() == null) ? 0 : getEventsItemResponse().hashCode());
        return hashCode;
    }

    @Override
    public ItemResponse clone() {
        try {
            return (ItemResponse) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.pinpoint.model.transform.ItemResponseMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
