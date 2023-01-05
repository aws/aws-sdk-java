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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ivschat-2020-07-14/DeleteMessage" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteMessageRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * ID of the message to be deleted. This is the <code>Id</code> field in the received message (see <a
     * href="https://docs.aws.amazon.com/ivs/latest/chatmsgapireference/actions-message-subscribe.html"> Message
     * (Subscribe)</a> in the Chat Messaging API).
     * </p>
     */
    private String id;
    /**
     * <p>
     * Reason for deleting the message.
     * </p>
     */
    private String reason;
    /**
     * <p>
     * Identifier of the room where the message should be deleted. Currently this must be an ARN.
     * </p>
     */
    private String roomIdentifier;

    /**
     * <p>
     * ID of the message to be deleted. This is the <code>Id</code> field in the received message (see <a
     * href="https://docs.aws.amazon.com/ivs/latest/chatmsgapireference/actions-message-subscribe.html"> Message
     * (Subscribe)</a> in the Chat Messaging API).
     * </p>
     * 
     * @param id
     *        ID of the message to be deleted. This is the <code>Id</code> field in the received message (see <a
     *        href="https://docs.aws.amazon.com/ivs/latest/chatmsgapireference/actions-message-subscribe.html"> Message
     *        (Subscribe)</a> in the Chat Messaging API).
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * ID of the message to be deleted. This is the <code>Id</code> field in the received message (see <a
     * href="https://docs.aws.amazon.com/ivs/latest/chatmsgapireference/actions-message-subscribe.html"> Message
     * (Subscribe)</a> in the Chat Messaging API).
     * </p>
     * 
     * @return ID of the message to be deleted. This is the <code>Id</code> field in the received message (see <a
     *         href="https://docs.aws.amazon.com/ivs/latest/chatmsgapireference/actions-message-subscribe.html"> Message
     *         (Subscribe)</a> in the Chat Messaging API).
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * ID of the message to be deleted. This is the <code>Id</code> field in the received message (see <a
     * href="https://docs.aws.amazon.com/ivs/latest/chatmsgapireference/actions-message-subscribe.html"> Message
     * (Subscribe)</a> in the Chat Messaging API).
     * </p>
     * 
     * @param id
     *        ID of the message to be deleted. This is the <code>Id</code> field in the received message (see <a
     *        href="https://docs.aws.amazon.com/ivs/latest/chatmsgapireference/actions-message-subscribe.html"> Message
     *        (Subscribe)</a> in the Chat Messaging API).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteMessageRequest withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * Reason for deleting the message.
     * </p>
     * 
     * @param reason
     *        Reason for deleting the message.
     */

    public void setReason(String reason) {
        this.reason = reason;
    }

    /**
     * <p>
     * Reason for deleting the message.
     * </p>
     * 
     * @return Reason for deleting the message.
     */

    public String getReason() {
        return this.reason;
    }

    /**
     * <p>
     * Reason for deleting the message.
     * </p>
     * 
     * @param reason
     *        Reason for deleting the message.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteMessageRequest withReason(String reason) {
        setReason(reason);
        return this;
    }

    /**
     * <p>
     * Identifier of the room where the message should be deleted. Currently this must be an ARN.
     * </p>
     * 
     * @param roomIdentifier
     *        Identifier of the room where the message should be deleted. Currently this must be an ARN.
     */

    public void setRoomIdentifier(String roomIdentifier) {
        this.roomIdentifier = roomIdentifier;
    }

    /**
     * <p>
     * Identifier of the room where the message should be deleted. Currently this must be an ARN.
     * </p>
     * 
     * @return Identifier of the room where the message should be deleted. Currently this must be an ARN.
     */

    public String getRoomIdentifier() {
        return this.roomIdentifier;
    }

    /**
     * <p>
     * Identifier of the room where the message should be deleted. Currently this must be an ARN.
     * </p>
     * 
     * @param roomIdentifier
     *        Identifier of the room where the message should be deleted. Currently this must be an ARN.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteMessageRequest withRoomIdentifier(String roomIdentifier) {
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
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getReason() != null)
            sb.append("Reason: ").append(getReason()).append(",");
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

        if (obj instanceof DeleteMessageRequest == false)
            return false;
        DeleteMessageRequest other = (DeleteMessageRequest) obj;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getReason() == null ^ this.getReason() == null)
            return false;
        if (other.getReason() != null && other.getReason().equals(this.getReason()) == false)
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

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getReason() == null) ? 0 : getReason().hashCode());
        hashCode = prime * hashCode + ((getRoomIdentifier() == null) ? 0 : getRoomIdentifier().hashCode());
        return hashCode;
    }

    @Override
    public DeleteMessageRequest clone() {
        return (DeleteMessageRequest) super.clone();
    }

}
