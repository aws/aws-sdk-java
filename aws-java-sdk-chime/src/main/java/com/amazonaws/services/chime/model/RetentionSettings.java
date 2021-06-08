/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.chime.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The retention settings for an Amazon Chime Enterprise account that determine how long to retain items such as
 * chat-room messages and chat-conversation messages.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/RetentionSettings" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RetentionSettings implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The chat room retention settings.
     * </p>
     */
    private RoomRetentionSettings roomRetentionSettings;
    /**
     * <p>
     * The chat conversation retention settings.
     * </p>
     */
    private ConversationRetentionSettings conversationRetentionSettings;

    /**
     * <p>
     * The chat room retention settings.
     * </p>
     * 
     * @param roomRetentionSettings
     *        The chat room retention settings.
     */

    public void setRoomRetentionSettings(RoomRetentionSettings roomRetentionSettings) {
        this.roomRetentionSettings = roomRetentionSettings;
    }

    /**
     * <p>
     * The chat room retention settings.
     * </p>
     * 
     * @return The chat room retention settings.
     */

    public RoomRetentionSettings getRoomRetentionSettings() {
        return this.roomRetentionSettings;
    }

    /**
     * <p>
     * The chat room retention settings.
     * </p>
     * 
     * @param roomRetentionSettings
     *        The chat room retention settings.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RetentionSettings withRoomRetentionSettings(RoomRetentionSettings roomRetentionSettings) {
        setRoomRetentionSettings(roomRetentionSettings);
        return this;
    }

    /**
     * <p>
     * The chat conversation retention settings.
     * </p>
     * 
     * @param conversationRetentionSettings
     *        The chat conversation retention settings.
     */

    public void setConversationRetentionSettings(ConversationRetentionSettings conversationRetentionSettings) {
        this.conversationRetentionSettings = conversationRetentionSettings;
    }

    /**
     * <p>
     * The chat conversation retention settings.
     * </p>
     * 
     * @return The chat conversation retention settings.
     */

    public ConversationRetentionSettings getConversationRetentionSettings() {
        return this.conversationRetentionSettings;
    }

    /**
     * <p>
     * The chat conversation retention settings.
     * </p>
     * 
     * @param conversationRetentionSettings
     *        The chat conversation retention settings.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RetentionSettings withConversationRetentionSettings(ConversationRetentionSettings conversationRetentionSettings) {
        setConversationRetentionSettings(conversationRetentionSettings);
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
        if (getRoomRetentionSettings() != null)
            sb.append("RoomRetentionSettings: ").append(getRoomRetentionSettings()).append(",");
        if (getConversationRetentionSettings() != null)
            sb.append("ConversationRetentionSettings: ").append(getConversationRetentionSettings());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RetentionSettings == false)
            return false;
        RetentionSettings other = (RetentionSettings) obj;
        if (other.getRoomRetentionSettings() == null ^ this.getRoomRetentionSettings() == null)
            return false;
        if (other.getRoomRetentionSettings() != null && other.getRoomRetentionSettings().equals(this.getRoomRetentionSettings()) == false)
            return false;
        if (other.getConversationRetentionSettings() == null ^ this.getConversationRetentionSettings() == null)
            return false;
        if (other.getConversationRetentionSettings() != null
                && other.getConversationRetentionSettings().equals(this.getConversationRetentionSettings()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRoomRetentionSettings() == null) ? 0 : getRoomRetentionSettings().hashCode());
        hashCode = prime * hashCode + ((getConversationRetentionSettings() == null) ? 0 : getConversationRetentionSettings().hashCode());
        return hashCode;
    }

    @Override
    public RetentionSettings clone() {
        try {
            return (RetentionSettings) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.chime.model.transform.RetentionSettingsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
