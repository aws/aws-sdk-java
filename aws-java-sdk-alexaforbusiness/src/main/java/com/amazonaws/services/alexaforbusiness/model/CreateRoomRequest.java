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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/CreateRoom" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateRoomRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name for the room.
     * </p>
     */
    private String roomName;
    /**
     * <p>
     * The description for the room.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The profile ARN for the room.
     * </p>
     */
    private String profileArn;
    /**
     * <p>
     * The calendar ARN for the room.
     * </p>
     */
    private String providerCalendarId;
    /**
     * <p>
     * A unique, user-specified identifier for this request that ensures idempotency.
     * </p>
     */
    private String clientRequestToken;
    /**
     * <p>
     * The tags for the room.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * The name for the room.
     * </p>
     * 
     * @param roomName
     *        The name for the room.
     */

    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }

    /**
     * <p>
     * The name for the room.
     * </p>
     * 
     * @return The name for the room.
     */

    public String getRoomName() {
        return this.roomName;
    }

    /**
     * <p>
     * The name for the room.
     * </p>
     * 
     * @param roomName
     *        The name for the room.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateRoomRequest withRoomName(String roomName) {
        setRoomName(roomName);
        return this;
    }

    /**
     * <p>
     * The description for the room.
     * </p>
     * 
     * @param description
     *        The description for the room.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description for the room.
     * </p>
     * 
     * @return The description for the room.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description for the room.
     * </p>
     * 
     * @param description
     *        The description for the room.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateRoomRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The profile ARN for the room.
     * </p>
     * 
     * @param profileArn
     *        The profile ARN for the room.
     */

    public void setProfileArn(String profileArn) {
        this.profileArn = profileArn;
    }

    /**
     * <p>
     * The profile ARN for the room.
     * </p>
     * 
     * @return The profile ARN for the room.
     */

    public String getProfileArn() {
        return this.profileArn;
    }

    /**
     * <p>
     * The profile ARN for the room.
     * </p>
     * 
     * @param profileArn
     *        The profile ARN for the room.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateRoomRequest withProfileArn(String profileArn) {
        setProfileArn(profileArn);
        return this;
    }

    /**
     * <p>
     * The calendar ARN for the room.
     * </p>
     * 
     * @param providerCalendarId
     *        The calendar ARN for the room.
     */

    public void setProviderCalendarId(String providerCalendarId) {
        this.providerCalendarId = providerCalendarId;
    }

    /**
     * <p>
     * The calendar ARN for the room.
     * </p>
     * 
     * @return The calendar ARN for the room.
     */

    public String getProviderCalendarId() {
        return this.providerCalendarId;
    }

    /**
     * <p>
     * The calendar ARN for the room.
     * </p>
     * 
     * @param providerCalendarId
     *        The calendar ARN for the room.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateRoomRequest withProviderCalendarId(String providerCalendarId) {
        setProviderCalendarId(providerCalendarId);
        return this;
    }

    /**
     * <p>
     * A unique, user-specified identifier for this request that ensures idempotency.
     * </p>
     * 
     * @param clientRequestToken
     *        A unique, user-specified identifier for this request that ensures idempotency.
     */

    public void setClientRequestToken(String clientRequestToken) {
        this.clientRequestToken = clientRequestToken;
    }

    /**
     * <p>
     * A unique, user-specified identifier for this request that ensures idempotency.
     * </p>
     * 
     * @return A unique, user-specified identifier for this request that ensures idempotency.
     */

    public String getClientRequestToken() {
        return this.clientRequestToken;
    }

    /**
     * <p>
     * A unique, user-specified identifier for this request that ensures idempotency.
     * </p>
     * 
     * @param clientRequestToken
     *        A unique, user-specified identifier for this request that ensures idempotency.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateRoomRequest withClientRequestToken(String clientRequestToken) {
        setClientRequestToken(clientRequestToken);
        return this;
    }

    /**
     * <p>
     * The tags for the room.
     * </p>
     * 
     * @return The tags for the room.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * The tags for the room.
     * </p>
     * 
     * @param tags
     *        The tags for the room.
     */

    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<Tag>(tags);
    }

    /**
     * <p>
     * The tags for the room.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        The tags for the room.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateRoomRequest withTags(Tag... tags) {
        if (this.tags == null) {
            setTags(new java.util.ArrayList<Tag>(tags.length));
        }
        for (Tag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The tags for the room.
     * </p>
     * 
     * @param tags
     *        The tags for the room.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateRoomRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
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
        if (getRoomName() != null)
            sb.append("RoomName: ").append(getRoomName()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getProfileArn() != null)
            sb.append("ProfileArn: ").append(getProfileArn()).append(",");
        if (getProviderCalendarId() != null)
            sb.append("ProviderCalendarId: ").append(getProviderCalendarId()).append(",");
        if (getClientRequestToken() != null)
            sb.append("ClientRequestToken: ").append(getClientRequestToken()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateRoomRequest == false)
            return false;
        CreateRoomRequest other = (CreateRoomRequest) obj;
        if (other.getRoomName() == null ^ this.getRoomName() == null)
            return false;
        if (other.getRoomName() != null && other.getRoomName().equals(this.getRoomName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getProfileArn() == null ^ this.getProfileArn() == null)
            return false;
        if (other.getProfileArn() != null && other.getProfileArn().equals(this.getProfileArn()) == false)
            return false;
        if (other.getProviderCalendarId() == null ^ this.getProviderCalendarId() == null)
            return false;
        if (other.getProviderCalendarId() != null && other.getProviderCalendarId().equals(this.getProviderCalendarId()) == false)
            return false;
        if (other.getClientRequestToken() == null ^ this.getClientRequestToken() == null)
            return false;
        if (other.getClientRequestToken() != null && other.getClientRequestToken().equals(this.getClientRequestToken()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRoomName() == null) ? 0 : getRoomName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getProfileArn() == null) ? 0 : getProfileArn().hashCode());
        hashCode = prime * hashCode + ((getProviderCalendarId() == null) ? 0 : getProviderCalendarId().hashCode());
        hashCode = prime * hashCode + ((getClientRequestToken() == null) ? 0 : getClientRequestToken().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateRoomRequest clone() {
        return (CreateRoomRequest) super.clone();
    }

}
