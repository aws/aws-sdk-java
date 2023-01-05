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
package com.amazonaws.services.ivschat.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ivschat-2020-07-14/SendEvent" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SendEventRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Application-defined metadata to attach to the event sent to clients. The maximum length of the metadata is 1 KB
     * total.
     * </p>
     */
    private java.util.Map<String, String> attributes;
    /**
     * <p>
     * Application-defined name of the event to send to clients.
     * </p>
     */
    private String eventName;
    /**
     * <p>
     * Identifier of the room to which the event will be sent. Currently this must be an ARN.
     * </p>
     */
    private String roomIdentifier;

    /**
     * <p>
     * Application-defined metadata to attach to the event sent to clients. The maximum length of the metadata is 1 KB
     * total.
     * </p>
     * 
     * @return Application-defined metadata to attach to the event sent to clients. The maximum length of the metadata
     *         is 1 KB total.
     */

    public java.util.Map<String, String> getAttributes() {
        return attributes;
    }

    /**
     * <p>
     * Application-defined metadata to attach to the event sent to clients. The maximum length of the metadata is 1 KB
     * total.
     * </p>
     * 
     * @param attributes
     *        Application-defined metadata to attach to the event sent to clients. The maximum length of the metadata is
     *        1 KB total.
     */

    public void setAttributes(java.util.Map<String, String> attributes) {
        this.attributes = attributes;
    }

    /**
     * <p>
     * Application-defined metadata to attach to the event sent to clients. The maximum length of the metadata is 1 KB
     * total.
     * </p>
     * 
     * @param attributes
     *        Application-defined metadata to attach to the event sent to clients. The maximum length of the metadata is
     *        1 KB total.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SendEventRequest withAttributes(java.util.Map<String, String> attributes) {
        setAttributes(attributes);
        return this;
    }

    /**
     * Add a single Attributes entry
     *
     * @see SendEventRequest#withAttributes
     * @returns a reference to this object so that method calls can be chained together.
     */

    public SendEventRequest addAttributesEntry(String key, String value) {
        if (null == this.attributes) {
            this.attributes = new java.util.HashMap<String, String>();
        }
        if (this.attributes.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.attributes.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Attributes.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SendEventRequest clearAttributesEntries() {
        this.attributes = null;
        return this;
    }

    /**
     * <p>
     * Application-defined name of the event to send to clients.
     * </p>
     * 
     * @param eventName
     *        Application-defined name of the event to send to clients.
     */

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    /**
     * <p>
     * Application-defined name of the event to send to clients.
     * </p>
     * 
     * @return Application-defined name of the event to send to clients.
     */

    public String getEventName() {
        return this.eventName;
    }

    /**
     * <p>
     * Application-defined name of the event to send to clients.
     * </p>
     * 
     * @param eventName
     *        Application-defined name of the event to send to clients.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SendEventRequest withEventName(String eventName) {
        setEventName(eventName);
        return this;
    }

    /**
     * <p>
     * Identifier of the room to which the event will be sent. Currently this must be an ARN.
     * </p>
     * 
     * @param roomIdentifier
     *        Identifier of the room to which the event will be sent. Currently this must be an ARN.
     */

    public void setRoomIdentifier(String roomIdentifier) {
        this.roomIdentifier = roomIdentifier;
    }

    /**
     * <p>
     * Identifier of the room to which the event will be sent. Currently this must be an ARN.
     * </p>
     * 
     * @return Identifier of the room to which the event will be sent. Currently this must be an ARN.
     */

    public String getRoomIdentifier() {
        return this.roomIdentifier;
    }

    /**
     * <p>
     * Identifier of the room to which the event will be sent. Currently this must be an ARN.
     * </p>
     * 
     * @param roomIdentifier
     *        Identifier of the room to which the event will be sent. Currently this must be an ARN.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SendEventRequest withRoomIdentifier(String roomIdentifier) {
        setRoomIdentifier(roomIdentifier);
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
        if (getAttributes() != null)
            sb.append("Attributes: ").append(getAttributes()).append(",");
        if (getEventName() != null)
            sb.append("EventName: ").append(getEventName()).append(",");
        if (getRoomIdentifier() != null)
            sb.append("RoomIdentifier: ").append(getRoomIdentifier());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SendEventRequest == false)
            return false;
        SendEventRequest other = (SendEventRequest) obj;
        if (other.getAttributes() == null ^ this.getAttributes() == null)
            return false;
        if (other.getAttributes() != null && other.getAttributes().equals(this.getAttributes()) == false)
            return false;
        if (other.getEventName() == null ^ this.getEventName() == null)
            return false;
        if (other.getEventName() != null && other.getEventName().equals(this.getEventName()) == false)
            return false;
        if (other.getRoomIdentifier() == null ^ this.getRoomIdentifier() == null)
            return false;
        if (other.getRoomIdentifier() != null && other.getRoomIdentifier().equals(this.getRoomIdentifier()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAttributes() == null) ? 0 : getAttributes().hashCode());
        hashCode = prime * hashCode + ((getEventName() == null) ? 0 : getEventName().hashCode());
        hashCode = prime * hashCode + ((getRoomIdentifier() == null) ? 0 : getRoomIdentifier().hashCode());
        return hashCode;
    }

    @Override
    public SendEventRequest clone() {
        return (SendEventRequest) super.clone();
    }

}
