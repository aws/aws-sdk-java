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
package com.amazonaws.services.alexaforbusiness.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/UpdateRoom" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateRoomRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ARN of the room to update.
     * </p>
     */
    private String roomArn;
    /**
     * <p>
     * The updated name for the room.
     * </p>
     */
    private String roomName;
    /**
     * <p>
     * The updated description for the room.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The updated provider calendar ARN for the room.
     * </p>
     */
    private String providerCalendarId;
    /**
     * <p>
     * The updated profile ARN for the room.
     * </p>
     */
    private String profileArn;

    /**
     * <p>
     * The ARN of the room to update.
     * </p>
     * 
     * @param roomArn
     *        The ARN of the room to update.
     */

    public void setRoomArn(String roomArn) {
        this.roomArn = roomArn;
    }

    /**
     * <p>
     * The ARN of the room to update.
     * </p>
     * 
     * @return The ARN of the room to update.
     */

    public String getRoomArn() {
        return this.roomArn;
    }

    /**
     * <p>
     * The ARN of the room to update.
     * </p>
     * 
     * @param roomArn
     *        The ARN of the room to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateRoomRequest withRoomArn(String roomArn) {
        setRoomArn(roomArn);
        return this;
    }

    /**
     * <p>
     * The updated name for the room.
     * </p>
     * 
     * @param roomName
     *        The updated name for the room.
     */

    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }

    /**
     * <p>
     * The updated name for the room.
     * </p>
     * 
     * @return The updated name for the room.
     */

    public String getRoomName() {
        return this.roomName;
    }

    /**
     * <p>
     * The updated name for the room.
     * </p>
     * 
     * @param roomName
     *        The updated name for the room.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateRoomRequest withRoomName(String roomName) {
        setRoomName(roomName);
        return this;
    }

    /**
     * <p>
     * The updated description for the room.
     * </p>
     * 
     * @param description
     *        The updated description for the room.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The updated description for the room.
     * </p>
     * 
     * @return The updated description for the room.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The updated description for the room.
     * </p>
     * 
     * @param description
     *        The updated description for the room.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateRoomRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The updated provider calendar ARN for the room.
     * </p>
     * 
     * @param providerCalendarId
     *        The updated provider calendar ARN for the room.
     */

    public void setProviderCalendarId(String providerCalendarId) {
        this.providerCalendarId = providerCalendarId;
    }

    /**
     * <p>
     * The updated provider calendar ARN for the room.
     * </p>
     * 
     * @return The updated provider calendar ARN for the room.
     */

    public String getProviderCalendarId() {
        return this.providerCalendarId;
    }

    /**
     * <p>
     * The updated provider calendar ARN for the room.
     * </p>
     * 
     * @param providerCalendarId
     *        The updated provider calendar ARN for the room.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateRoomRequest withProviderCalendarId(String providerCalendarId) {
        setProviderCalendarId(providerCalendarId);
        return this;
    }

    /**
     * <p>
     * The updated profile ARN for the room.
     * </p>
     * 
     * @param profileArn
     *        The updated profile ARN for the room.
     */

    public void setProfileArn(String profileArn) {
        this.profileArn = profileArn;
    }

    /**
     * <p>
     * The updated profile ARN for the room.
     * </p>
     * 
     * @return The updated profile ARN for the room.
     */

    public String getProfileArn() {
        return this.profileArn;
    }

    /**
     * <p>
     * The updated profile ARN for the room.
     * </p>
     * 
     * @param profileArn
     *        The updated profile ARN for the room.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateRoomRequest withProfileArn(String profileArn) {
        setProfileArn(profileArn);
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
        if (getRoomArn() != null)
            sb.append("RoomArn: ").append(getRoomArn()).append(",");
        if (getRoomName() != null)
            sb.append("RoomName: ").append(getRoomName()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getProviderCalendarId() != null)
            sb.append("ProviderCalendarId: ").append(getProviderCalendarId()).append(",");
        if (getProfileArn() != null)
            sb.append("ProfileArn: ").append(getProfileArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateRoomRequest == false)
            return false;
        UpdateRoomRequest other = (UpdateRoomRequest) obj;
        if (other.getRoomArn() == null ^ this.getRoomArn() == null)
            return false;
        if (other.getRoomArn() != null && other.getRoomArn().equals(this.getRoomArn()) == false)
            return false;
        if (other.getRoomName() == null ^ this.getRoomName() == null)
            return false;
        if (other.getRoomName() != null && other.getRoomName().equals(this.getRoomName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getProviderCalendarId() == null ^ this.getProviderCalendarId() == null)
            return false;
        if (other.getProviderCalendarId() != null && other.getProviderCalendarId().equals(this.getProviderCalendarId()) == false)
            return false;
        if (other.getProfileArn() == null ^ this.getProfileArn() == null)
            return false;
        if (other.getProfileArn() != null && other.getProfileArn().equals(this.getProfileArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRoomArn() == null) ? 0 : getRoomArn().hashCode());
        hashCode = prime * hashCode + ((getRoomName() == null) ? 0 : getRoomName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getProviderCalendarId() == null) ? 0 : getProviderCalendarId().hashCode());
        hashCode = prime * hashCode + ((getProfileArn() == null) ? 0 : getProfileArn().hashCode());
        return hashCode;
    }

    @Override
    public UpdateRoomRequest clone() {
        return (UpdateRoomRequest) super.clone();
    }

}
