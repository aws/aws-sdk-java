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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ivschat-2020-07-14/CreateChatToken" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateChatTokenRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Application-provided attributes to encode into the token and attach to a chat session. Map keys and values can
     * contain UTF-8 encoded text. The maximum length of this field is 1 KB total.
     * </p>
     */
    private java.util.Map<String, String> attributes;
    /**
     * <p>
     * Set of capabilities that the user is allowed to perform in the room. Default: None (the capability to view
     * messages is implicitly included in all requests).
     * </p>
     */
    private java.util.List<String> capabilities;
    /**
     * <p>
     * Identifier of the room that the client is trying to access. Currently this must be an ARN.
     * </p>
     */
    private String roomIdentifier;
    /**
     * <p>
     * Session duration (in minutes), after which the session expires. Default: 60 (1 hour).
     * </p>
     */
    private Integer sessionDurationInMinutes;
    /**
     * <p>
     * Application-provided ID that uniquely identifies the user associated with this token. This can be any UTF-8
     * encoded text.
     * </p>
     */
    private String userId;

    /**
     * <p>
     * Application-provided attributes to encode into the token and attach to a chat session. Map keys and values can
     * contain UTF-8 encoded text. The maximum length of this field is 1 KB total.
     * </p>
     * 
     * @return Application-provided attributes to encode into the token and attach to a chat session. Map keys and
     *         values can contain UTF-8 encoded text. The maximum length of this field is 1 KB total.
     */

    public java.util.Map<String, String> getAttributes() {
        return attributes;
    }

    /**
     * <p>
     * Application-provided attributes to encode into the token and attach to a chat session. Map keys and values can
     * contain UTF-8 encoded text. The maximum length of this field is 1 KB total.
     * </p>
     * 
     * @param attributes
     *        Application-provided attributes to encode into the token and attach to a chat session. Map keys and values
     *        can contain UTF-8 encoded text. The maximum length of this field is 1 KB total.
     */

    public void setAttributes(java.util.Map<String, String> attributes) {
        this.attributes = attributes;
    }

    /**
     * <p>
     * Application-provided attributes to encode into the token and attach to a chat session. Map keys and values can
     * contain UTF-8 encoded text. The maximum length of this field is 1 KB total.
     * </p>
     * 
     * @param attributes
     *        Application-provided attributes to encode into the token and attach to a chat session. Map keys and values
     *        can contain UTF-8 encoded text. The maximum length of this field is 1 KB total.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateChatTokenRequest withAttributes(java.util.Map<String, String> attributes) {
        setAttributes(attributes);
        return this;
    }

    /**
     * Add a single Attributes entry
     *
     * @see CreateChatTokenRequest#withAttributes
     * @returns a reference to this object so that method calls can be chained together.
     */

    public CreateChatTokenRequest addAttributesEntry(String key, String value) {
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

    public CreateChatTokenRequest clearAttributesEntries() {
        this.attributes = null;
        return this;
    }

    /**
     * <p>
     * Set of capabilities that the user is allowed to perform in the room. Default: None (the capability to view
     * messages is implicitly included in all requests).
     * </p>
     * 
     * @return Set of capabilities that the user is allowed to perform in the room. Default: None (the capability to
     *         view messages is implicitly included in all requests).
     * @see ChatTokenCapability
     */

    public java.util.List<String> getCapabilities() {
        return capabilities;
    }

    /**
     * <p>
     * Set of capabilities that the user is allowed to perform in the room. Default: None (the capability to view
     * messages is implicitly included in all requests).
     * </p>
     * 
     * @param capabilities
     *        Set of capabilities that the user is allowed to perform in the room. Default: None (the capability to view
     *        messages is implicitly included in all requests).
     * @see ChatTokenCapability
     */

    public void setCapabilities(java.util.Collection<String> capabilities) {
        if (capabilities == null) {
            this.capabilities = null;
            return;
        }

        this.capabilities = new java.util.ArrayList<String>(capabilities);
    }

    /**
     * <p>
     * Set of capabilities that the user is allowed to perform in the room. Default: None (the capability to view
     * messages is implicitly included in all requests).
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCapabilities(java.util.Collection)} or {@link #withCapabilities(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param capabilities
     *        Set of capabilities that the user is allowed to perform in the room. Default: None (the capability to view
     *        messages is implicitly included in all requests).
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ChatTokenCapability
     */

    public CreateChatTokenRequest withCapabilities(String... capabilities) {
        if (this.capabilities == null) {
            setCapabilities(new java.util.ArrayList<String>(capabilities.length));
        }
        for (String ele : capabilities) {
            this.capabilities.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Set of capabilities that the user is allowed to perform in the room. Default: None (the capability to view
     * messages is implicitly included in all requests).
     * </p>
     * 
     * @param capabilities
     *        Set of capabilities that the user is allowed to perform in the room. Default: None (the capability to view
     *        messages is implicitly included in all requests).
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ChatTokenCapability
     */

    public CreateChatTokenRequest withCapabilities(java.util.Collection<String> capabilities) {
        setCapabilities(capabilities);
        return this;
    }

    /**
     * <p>
     * Set of capabilities that the user is allowed to perform in the room. Default: None (the capability to view
     * messages is implicitly included in all requests).
     * </p>
     * 
     * @param capabilities
     *        Set of capabilities that the user is allowed to perform in the room. Default: None (the capability to view
     *        messages is implicitly included in all requests).
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ChatTokenCapability
     */

    public CreateChatTokenRequest withCapabilities(ChatTokenCapability... capabilities) {
        java.util.ArrayList<String> capabilitiesCopy = new java.util.ArrayList<String>(capabilities.length);
        for (ChatTokenCapability value : capabilities) {
            capabilitiesCopy.add(value.toString());
        }
        if (getCapabilities() == null) {
            setCapabilities(capabilitiesCopy);
        } else {
            getCapabilities().addAll(capabilitiesCopy);
        }
        return this;
    }

    /**
     * <p>
     * Identifier of the room that the client is trying to access. Currently this must be an ARN.
     * </p>
     * 
     * @param roomIdentifier
     *        Identifier of the room that the client is trying to access. Currently this must be an ARN.
     */

    public void setRoomIdentifier(String roomIdentifier) {
        this.roomIdentifier = roomIdentifier;
    }

    /**
     * <p>
     * Identifier of the room that the client is trying to access. Currently this must be an ARN.
     * </p>
     * 
     * @return Identifier of the room that the client is trying to access. Currently this must be an ARN.
     */

    public String getRoomIdentifier() {
        return this.roomIdentifier;
    }

    /**
     * <p>
     * Identifier of the room that the client is trying to access. Currently this must be an ARN.
     * </p>
     * 
     * @param roomIdentifier
     *        Identifier of the room that the client is trying to access. Currently this must be an ARN.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateChatTokenRequest withRoomIdentifier(String roomIdentifier) {
        setRoomIdentifier(roomIdentifier);
        return this;
    }

    /**
     * <p>
     * Session duration (in minutes), after which the session expires. Default: 60 (1 hour).
     * </p>
     * 
     * @param sessionDurationInMinutes
     *        Session duration (in minutes), after which the session expires. Default: 60 (1 hour).
     */

    public void setSessionDurationInMinutes(Integer sessionDurationInMinutes) {
        this.sessionDurationInMinutes = sessionDurationInMinutes;
    }

    /**
     * <p>
     * Session duration (in minutes), after which the session expires. Default: 60 (1 hour).
     * </p>
     * 
     * @return Session duration (in minutes), after which the session expires. Default: 60 (1 hour).
     */

    public Integer getSessionDurationInMinutes() {
        return this.sessionDurationInMinutes;
    }

    /**
     * <p>
     * Session duration (in minutes), after which the session expires. Default: 60 (1 hour).
     * </p>
     * 
     * @param sessionDurationInMinutes
     *        Session duration (in minutes), after which the session expires. Default: 60 (1 hour).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateChatTokenRequest withSessionDurationInMinutes(Integer sessionDurationInMinutes) {
        setSessionDurationInMinutes(sessionDurationInMinutes);
        return this;
    }

    /**
     * <p>
     * Application-provided ID that uniquely identifies the user associated with this token. This can be any UTF-8
     * encoded text.
     * </p>
     * 
     * @param userId
     *        Application-provided ID that uniquely identifies the user associated with this token. This can be any
     *        UTF-8 encoded text.
     */

    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * <p>
     * Application-provided ID that uniquely identifies the user associated with this token. This can be any UTF-8
     * encoded text.
     * </p>
     * 
     * @return Application-provided ID that uniquely identifies the user associated with this token. This can be any
     *         UTF-8 encoded text.
     */

    public String getUserId() {
        return this.userId;
    }

    /**
     * <p>
     * Application-provided ID that uniquely identifies the user associated with this token. This can be any UTF-8
     * encoded text.
     * </p>
     * 
     * @param userId
     *        Application-provided ID that uniquely identifies the user associated with this token. This can be any
     *        UTF-8 encoded text.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateChatTokenRequest withUserId(String userId) {
        setUserId(userId);
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
        if (getCapabilities() != null)
            sb.append("Capabilities: ").append(getCapabilities()).append(",");
        if (getRoomIdentifier() != null)
            sb.append("RoomIdentifier: ").append(getRoomIdentifier()).append(",");
        if (getSessionDurationInMinutes() != null)
            sb.append("SessionDurationInMinutes: ").append(getSessionDurationInMinutes()).append(",");
        if (getUserId() != null)
            sb.append("UserId: ").append(getUserId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateChatTokenRequest == false)
            return false;
        CreateChatTokenRequest other = (CreateChatTokenRequest) obj;
        if (other.getAttributes() == null ^ this.getAttributes() == null)
            return false;
        if (other.getAttributes() != null && other.getAttributes().equals(this.getAttributes()) == false)
            return false;
        if (other.getCapabilities() == null ^ this.getCapabilities() == null)
            return false;
        if (other.getCapabilities() != null && other.getCapabilities().equals(this.getCapabilities()) == false)
            return false;
        if (other.getRoomIdentifier() == null ^ this.getRoomIdentifier() == null)
            return false;
        if (other.getRoomIdentifier() != null && other.getRoomIdentifier().equals(this.getRoomIdentifier()) == false)
            return false;
        if (other.getSessionDurationInMinutes() == null ^ this.getSessionDurationInMinutes() == null)
            return false;
        if (other.getSessionDurationInMinutes() != null && other.getSessionDurationInMinutes().equals(this.getSessionDurationInMinutes()) == false)
            return false;
        if (other.getUserId() == null ^ this.getUserId() == null)
            return false;
        if (other.getUserId() != null && other.getUserId().equals(this.getUserId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAttributes() == null) ? 0 : getAttributes().hashCode());
        hashCode = prime * hashCode + ((getCapabilities() == null) ? 0 : getCapabilities().hashCode());
        hashCode = prime * hashCode + ((getRoomIdentifier() == null) ? 0 : getRoomIdentifier().hashCode());
        hashCode = prime * hashCode + ((getSessionDurationInMinutes() == null) ? 0 : getSessionDurationInMinutes().hashCode());
        hashCode = prime * hashCode + ((getUserId() == null) ? 0 : getUserId().hashCode());
        return hashCode;
    }

    @Override
    public CreateChatTokenRequest clone() {
        return (CreateChatTokenRequest) super.clone();
    }

}
