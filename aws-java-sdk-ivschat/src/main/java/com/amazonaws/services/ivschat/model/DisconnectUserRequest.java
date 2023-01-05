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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ivschat-2020-07-14/DisconnectUser" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DisconnectUserRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Reason for disconnecting the user.
     * </p>
     */
    private String reason;
    /**
     * <p>
     * Identifier of the room from which the user's clients should be disconnected. Currently this must be an ARN.
     * </p>
     */
    private String roomIdentifier;
    /**
     * <p>
     * ID of the user (connection) to disconnect from the room.
     * </p>
     */
    private String userId;

    /**
     * <p>
     * Reason for disconnecting the user.
     * </p>
     * 
     * @param reason
     *        Reason for disconnecting the user.
     */

    public void setReason(String reason) {
        this.reason = reason;
    }

    /**
     * <p>
     * Reason for disconnecting the user.
     * </p>
     * 
     * @return Reason for disconnecting the user.
     */

    public String getReason() {
        return this.reason;
    }

    /**
     * <p>
     * Reason for disconnecting the user.
     * </p>
     * 
     * @param reason
     *        Reason for disconnecting the user.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DisconnectUserRequest withReason(String reason) {
        setReason(reason);
        return this;
    }

    /**
     * <p>
     * Identifier of the room from which the user's clients should be disconnected. Currently this must be an ARN.
     * </p>
     * 
     * @param roomIdentifier
     *        Identifier of the room from which the user's clients should be disconnected. Currently this must be an
     *        ARN.
     */

    public void setRoomIdentifier(String roomIdentifier) {
        this.roomIdentifier = roomIdentifier;
    }

    /**
     * <p>
     * Identifier of the room from which the user's clients should be disconnected. Currently this must be an ARN.
     * </p>
     * 
     * @return Identifier of the room from which the user's clients should be disconnected. Currently this must be an
     *         ARN.
     */

    public String getRoomIdentifier() {
        return this.roomIdentifier;
    }

    /**
     * <p>
     * Identifier of the room from which the user's clients should be disconnected. Currently this must be an ARN.
     * </p>
     * 
     * @param roomIdentifier
     *        Identifier of the room from which the user's clients should be disconnected. Currently this must be an
     *        ARN.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DisconnectUserRequest withRoomIdentifier(String roomIdentifier) {
        setRoomIdentifier(roomIdentifier);
        return this;
    }

    /**
     * <p>
     * ID of the user (connection) to disconnect from the room.
     * </p>
     * 
     * @param userId
     *        ID of the user (connection) to disconnect from the room.
     */

    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * <p>
     * ID of the user (connection) to disconnect from the room.
     * </p>
     * 
     * @return ID of the user (connection) to disconnect from the room.
     */

    public String getUserId() {
        return this.userId;
    }

    /**
     * <p>
     * ID of the user (connection) to disconnect from the room.
     * </p>
     * 
     * @param userId
     *        ID of the user (connection) to disconnect from the room.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DisconnectUserRequest withUserId(String userId) {
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
        if (getReason() != null)
            sb.append("Reason: ").append(getReason()).append(",");
        if (getRoomIdentifier() != null)
            sb.append("RoomIdentifier: ").append(getRoomIdentifier()).append(",");
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

        if (obj instanceof DisconnectUserRequest == false)
            return false;
        DisconnectUserRequest other = (DisconnectUserRequest) obj;
        if (other.getReason() == null ^ this.getReason() == null)
            return false;
        if (other.getReason() != null && other.getReason().equals(this.getReason()) == false)
            return false;
        if (other.getRoomIdentifier() == null ^ this.getRoomIdentifier() == null)
            return false;
        if (other.getRoomIdentifier() != null && other.getRoomIdentifier().equals(this.getRoomIdentifier()) == false)
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

        hashCode = prime * hashCode + ((getReason() == null) ? 0 : getReason().hashCode());
        hashCode = prime * hashCode + ((getRoomIdentifier() == null) ? 0 : getRoomIdentifier().hashCode());
        hashCode = prime * hashCode + ((getUserId() == null) ? 0 : getUserId().hashCode());
        return hashCode;
    }

    @Override
    public DisconnectUserRequest clone() {
        return (DisconnectUserRequest) super.clone();
    }

}
