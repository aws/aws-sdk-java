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
package com.amazonaws.services.connectparticipant.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An item - message or event - that has been sent.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connectparticipant-2018-09-07/Item" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Item implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The time when the message or event was sent.
     * </p>
     * <p>
     * It's specified in ISO 8601 format: yyyy-MM-ddThh:mm:ss.SSSZ. For example, 2019-11-08T02:41:28.172Z.
     * </p>
     */
    private String absoluteTime;
    /**
     * <p>
     * The content of the message or event.
     * </p>
     */
    private String content;
    /**
     * <p>
     * The type of content of the item.
     * </p>
     */
    private String contentType;
    /**
     * <p>
     * The ID of the item.
     * </p>
     */
    private String id;
    /**
     * <p>
     * Type of the item: message or event.
     * </p>
     */
    private String type;
    /**
     * <p>
     * The ID of the sender in the session.
     * </p>
     */
    private String participantId;
    /**
     * <p>
     * The chat display name of the sender.
     * </p>
     */
    private String displayName;
    /**
     * <p>
     * The role of the sender. For example, is it a customer, agent, or system.
     * </p>
     */
    private String participantRole;

    /**
     * <p>
     * The time when the message or event was sent.
     * </p>
     * <p>
     * It's specified in ISO 8601 format: yyyy-MM-ddThh:mm:ss.SSSZ. For example, 2019-11-08T02:41:28.172Z.
     * </p>
     * 
     * @param absoluteTime
     *        The time when the message or event was sent.</p>
     *        <p>
     *        It's specified in ISO 8601 format: yyyy-MM-ddThh:mm:ss.SSSZ. For example, 2019-11-08T02:41:28.172Z.
     */

    public void setAbsoluteTime(String absoluteTime) {
        this.absoluteTime = absoluteTime;
    }

    /**
     * <p>
     * The time when the message or event was sent.
     * </p>
     * <p>
     * It's specified in ISO 8601 format: yyyy-MM-ddThh:mm:ss.SSSZ. For example, 2019-11-08T02:41:28.172Z.
     * </p>
     * 
     * @return The time when the message or event was sent.</p>
     *         <p>
     *         It's specified in ISO 8601 format: yyyy-MM-ddThh:mm:ss.SSSZ. For example, 2019-11-08T02:41:28.172Z.
     */

    public String getAbsoluteTime() {
        return this.absoluteTime;
    }

    /**
     * <p>
     * The time when the message or event was sent.
     * </p>
     * <p>
     * It's specified in ISO 8601 format: yyyy-MM-ddThh:mm:ss.SSSZ. For example, 2019-11-08T02:41:28.172Z.
     * </p>
     * 
     * @param absoluteTime
     *        The time when the message or event was sent.</p>
     *        <p>
     *        It's specified in ISO 8601 format: yyyy-MM-ddThh:mm:ss.SSSZ. For example, 2019-11-08T02:41:28.172Z.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Item withAbsoluteTime(String absoluteTime) {
        setAbsoluteTime(absoluteTime);
        return this;
    }

    /**
     * <p>
     * The content of the message or event.
     * </p>
     * 
     * @param content
     *        The content of the message or event.
     */

    public void setContent(String content) {
        this.content = content;
    }

    /**
     * <p>
     * The content of the message or event.
     * </p>
     * 
     * @return The content of the message or event.
     */

    public String getContent() {
        return this.content;
    }

    /**
     * <p>
     * The content of the message or event.
     * </p>
     * 
     * @param content
     *        The content of the message or event.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Item withContent(String content) {
        setContent(content);
        return this;
    }

    /**
     * <p>
     * The type of content of the item.
     * </p>
     * 
     * @param contentType
     *        The type of content of the item.
     */

    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    /**
     * <p>
     * The type of content of the item.
     * </p>
     * 
     * @return The type of content of the item.
     */

    public String getContentType() {
        return this.contentType;
    }

    /**
     * <p>
     * The type of content of the item.
     * </p>
     * 
     * @param contentType
     *        The type of content of the item.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Item withContentType(String contentType) {
        setContentType(contentType);
        return this;
    }

    /**
     * <p>
     * The ID of the item.
     * </p>
     * 
     * @param id
     *        The ID of the item.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The ID of the item.
     * </p>
     * 
     * @return The ID of the item.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The ID of the item.
     * </p>
     * 
     * @param id
     *        The ID of the item.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Item withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * Type of the item: message or event.
     * </p>
     * 
     * @param type
     *        Type of the item: message or event.
     * @see ChatItemType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * Type of the item: message or event.
     * </p>
     * 
     * @return Type of the item: message or event.
     * @see ChatItemType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * Type of the item: message or event.
     * </p>
     * 
     * @param type
     *        Type of the item: message or event.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ChatItemType
     */

    public Item withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * Type of the item: message or event.
     * </p>
     * 
     * @param type
     *        Type of the item: message or event.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ChatItemType
     */

    public Item withType(ChatItemType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * The ID of the sender in the session.
     * </p>
     * 
     * @param participantId
     *        The ID of the sender in the session.
     */

    public void setParticipantId(String participantId) {
        this.participantId = participantId;
    }

    /**
     * <p>
     * The ID of the sender in the session.
     * </p>
     * 
     * @return The ID of the sender in the session.
     */

    public String getParticipantId() {
        return this.participantId;
    }

    /**
     * <p>
     * The ID of the sender in the session.
     * </p>
     * 
     * @param participantId
     *        The ID of the sender in the session.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Item withParticipantId(String participantId) {
        setParticipantId(participantId);
        return this;
    }

    /**
     * <p>
     * The chat display name of the sender.
     * </p>
     * 
     * @param displayName
     *        The chat display name of the sender.
     */

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    /**
     * <p>
     * The chat display name of the sender.
     * </p>
     * 
     * @return The chat display name of the sender.
     */

    public String getDisplayName() {
        return this.displayName;
    }

    /**
     * <p>
     * The chat display name of the sender.
     * </p>
     * 
     * @param displayName
     *        The chat display name of the sender.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Item withDisplayName(String displayName) {
        setDisplayName(displayName);
        return this;
    }

    /**
     * <p>
     * The role of the sender. For example, is it a customer, agent, or system.
     * </p>
     * 
     * @param participantRole
     *        The role of the sender. For example, is it a customer, agent, or system.
     * @see ParticipantRole
     */

    public void setParticipantRole(String participantRole) {
        this.participantRole = participantRole;
    }

    /**
     * <p>
     * The role of the sender. For example, is it a customer, agent, or system.
     * </p>
     * 
     * @return The role of the sender. For example, is it a customer, agent, or system.
     * @see ParticipantRole
     */

    public String getParticipantRole() {
        return this.participantRole;
    }

    /**
     * <p>
     * The role of the sender. For example, is it a customer, agent, or system.
     * </p>
     * 
     * @param participantRole
     *        The role of the sender. For example, is it a customer, agent, or system.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ParticipantRole
     */

    public Item withParticipantRole(String participantRole) {
        setParticipantRole(participantRole);
        return this;
    }

    /**
     * <p>
     * The role of the sender. For example, is it a customer, agent, or system.
     * </p>
     * 
     * @param participantRole
     *        The role of the sender. For example, is it a customer, agent, or system.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ParticipantRole
     */

    public Item withParticipantRole(ParticipantRole participantRole) {
        this.participantRole = participantRole.toString();
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
        if (getAbsoluteTime() != null)
            sb.append("AbsoluteTime: ").append(getAbsoluteTime()).append(",");
        if (getContent() != null)
            sb.append("Content: ").append(getContent()).append(",");
        if (getContentType() != null)
            sb.append("ContentType: ").append(getContentType()).append(",");
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getParticipantId() != null)
            sb.append("ParticipantId: ").append(getParticipantId()).append(",");
        if (getDisplayName() != null)
            sb.append("DisplayName: ").append(getDisplayName()).append(",");
        if (getParticipantRole() != null)
            sb.append("ParticipantRole: ").append(getParticipantRole());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Item == false)
            return false;
        Item other = (Item) obj;
        if (other.getAbsoluteTime() == null ^ this.getAbsoluteTime() == null)
            return false;
        if (other.getAbsoluteTime() != null && other.getAbsoluteTime().equals(this.getAbsoluteTime()) == false)
            return false;
        if (other.getContent() == null ^ this.getContent() == null)
            return false;
        if (other.getContent() != null && other.getContent().equals(this.getContent()) == false)
            return false;
        if (other.getContentType() == null ^ this.getContentType() == null)
            return false;
        if (other.getContentType() != null && other.getContentType().equals(this.getContentType()) == false)
            return false;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getParticipantId() == null ^ this.getParticipantId() == null)
            return false;
        if (other.getParticipantId() != null && other.getParticipantId().equals(this.getParticipantId()) == false)
            return false;
        if (other.getDisplayName() == null ^ this.getDisplayName() == null)
            return false;
        if (other.getDisplayName() != null && other.getDisplayName().equals(this.getDisplayName()) == false)
            return false;
        if (other.getParticipantRole() == null ^ this.getParticipantRole() == null)
            return false;
        if (other.getParticipantRole() != null && other.getParticipantRole().equals(this.getParticipantRole()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAbsoluteTime() == null) ? 0 : getAbsoluteTime().hashCode());
        hashCode = prime * hashCode + ((getContent() == null) ? 0 : getContent().hashCode());
        hashCode = prime * hashCode + ((getContentType() == null) ? 0 : getContentType().hashCode());
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getParticipantId() == null) ? 0 : getParticipantId().hashCode());
        hashCode = prime * hashCode + ((getDisplayName() == null) ? 0 : getDisplayName().hashCode());
        hashCode = prime * hashCode + ((getParticipantRole() == null) ? 0 : getParticipantRole().hashCode());
        return hashCode;
    }

    @Override
    public Item clone() {
        try {
            return (Item) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.connectparticipant.model.transform.ItemMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
