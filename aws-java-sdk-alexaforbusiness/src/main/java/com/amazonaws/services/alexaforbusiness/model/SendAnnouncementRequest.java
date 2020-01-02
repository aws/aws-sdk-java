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
package com.amazonaws.services.alexaforbusiness.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/SendAnnouncement" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SendAnnouncementRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The filters to use to send an announcement to a specified list of rooms. The supported filter keys are RoomName,
     * ProfileName, RoomArn, and ProfileArn. To send to all rooms, specify an empty RoomFilters list.
     * </p>
     */
    private java.util.List<Filter> roomFilters;
    /**
     * <p>
     * The announcement content. This can contain only one of the three possible announcement types (text, SSML or
     * audio).
     * </p>
     */
    private Content content;
    /**
     * <p>
     * The time to live for an announcement. Default is 300. If delivery doesn't occur within this time, the
     * announcement is not delivered.
     * </p>
     */
    private Integer timeToLiveInSeconds;
    /**
     * <p>
     * The unique, user-specified identifier for the request that ensures idempotency.
     * </p>
     */
    private String clientRequestToken;

    /**
     * <p>
     * The filters to use to send an announcement to a specified list of rooms. The supported filter keys are RoomName,
     * ProfileName, RoomArn, and ProfileArn. To send to all rooms, specify an empty RoomFilters list.
     * </p>
     * 
     * @return The filters to use to send an announcement to a specified list of rooms. The supported filter keys are
     *         RoomName, ProfileName, RoomArn, and ProfileArn. To send to all rooms, specify an empty RoomFilters list.
     */

    public java.util.List<Filter> getRoomFilters() {
        return roomFilters;
    }

    /**
     * <p>
     * The filters to use to send an announcement to a specified list of rooms. The supported filter keys are RoomName,
     * ProfileName, RoomArn, and ProfileArn. To send to all rooms, specify an empty RoomFilters list.
     * </p>
     * 
     * @param roomFilters
     *        The filters to use to send an announcement to a specified list of rooms. The supported filter keys are
     *        RoomName, ProfileName, RoomArn, and ProfileArn. To send to all rooms, specify an empty RoomFilters list.
     */

    public void setRoomFilters(java.util.Collection<Filter> roomFilters) {
        if (roomFilters == null) {
            this.roomFilters = null;
            return;
        }

        this.roomFilters = new java.util.ArrayList<Filter>(roomFilters);
    }

    /**
     * <p>
     * The filters to use to send an announcement to a specified list of rooms. The supported filter keys are RoomName,
     * ProfileName, RoomArn, and ProfileArn. To send to all rooms, specify an empty RoomFilters list.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRoomFilters(java.util.Collection)} or {@link #withRoomFilters(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param roomFilters
     *        The filters to use to send an announcement to a specified list of rooms. The supported filter keys are
     *        RoomName, ProfileName, RoomArn, and ProfileArn. To send to all rooms, specify an empty RoomFilters list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SendAnnouncementRequest withRoomFilters(Filter... roomFilters) {
        if (this.roomFilters == null) {
            setRoomFilters(new java.util.ArrayList<Filter>(roomFilters.length));
        }
        for (Filter ele : roomFilters) {
            this.roomFilters.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The filters to use to send an announcement to a specified list of rooms. The supported filter keys are RoomName,
     * ProfileName, RoomArn, and ProfileArn. To send to all rooms, specify an empty RoomFilters list.
     * </p>
     * 
     * @param roomFilters
     *        The filters to use to send an announcement to a specified list of rooms. The supported filter keys are
     *        RoomName, ProfileName, RoomArn, and ProfileArn. To send to all rooms, specify an empty RoomFilters list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SendAnnouncementRequest withRoomFilters(java.util.Collection<Filter> roomFilters) {
        setRoomFilters(roomFilters);
        return this;
    }

    /**
     * <p>
     * The announcement content. This can contain only one of the three possible announcement types (text, SSML or
     * audio).
     * </p>
     * 
     * @param content
     *        The announcement content. This can contain only one of the three possible announcement types (text, SSML
     *        or audio).
     */

    public void setContent(Content content) {
        this.content = content;
    }

    /**
     * <p>
     * The announcement content. This can contain only one of the three possible announcement types (text, SSML or
     * audio).
     * </p>
     * 
     * @return The announcement content. This can contain only one of the three possible announcement types (text, SSML
     *         or audio).
     */

    public Content getContent() {
        return this.content;
    }

    /**
     * <p>
     * The announcement content. This can contain only one of the three possible announcement types (text, SSML or
     * audio).
     * </p>
     * 
     * @param content
     *        The announcement content. This can contain only one of the three possible announcement types (text, SSML
     *        or audio).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SendAnnouncementRequest withContent(Content content) {
        setContent(content);
        return this;
    }

    /**
     * <p>
     * The time to live for an announcement. Default is 300. If delivery doesn't occur within this time, the
     * announcement is not delivered.
     * </p>
     * 
     * @param timeToLiveInSeconds
     *        The time to live for an announcement. Default is 300. If delivery doesn't occur within this time, the
     *        announcement is not delivered.
     */

    public void setTimeToLiveInSeconds(Integer timeToLiveInSeconds) {
        this.timeToLiveInSeconds = timeToLiveInSeconds;
    }

    /**
     * <p>
     * The time to live for an announcement. Default is 300. If delivery doesn't occur within this time, the
     * announcement is not delivered.
     * </p>
     * 
     * @return The time to live for an announcement. Default is 300. If delivery doesn't occur within this time, the
     *         announcement is not delivered.
     */

    public Integer getTimeToLiveInSeconds() {
        return this.timeToLiveInSeconds;
    }

    /**
     * <p>
     * The time to live for an announcement. Default is 300. If delivery doesn't occur within this time, the
     * announcement is not delivered.
     * </p>
     * 
     * @param timeToLiveInSeconds
     *        The time to live for an announcement. Default is 300. If delivery doesn't occur within this time, the
     *        announcement is not delivered.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SendAnnouncementRequest withTimeToLiveInSeconds(Integer timeToLiveInSeconds) {
        setTimeToLiveInSeconds(timeToLiveInSeconds);
        return this;
    }

    /**
     * <p>
     * The unique, user-specified identifier for the request that ensures idempotency.
     * </p>
     * 
     * @param clientRequestToken
     *        The unique, user-specified identifier for the request that ensures idempotency.
     */

    public void setClientRequestToken(String clientRequestToken) {
        this.clientRequestToken = clientRequestToken;
    }

    /**
     * <p>
     * The unique, user-specified identifier for the request that ensures idempotency.
     * </p>
     * 
     * @return The unique, user-specified identifier for the request that ensures idempotency.
     */

    public String getClientRequestToken() {
        return this.clientRequestToken;
    }

    /**
     * <p>
     * The unique, user-specified identifier for the request that ensures idempotency.
     * </p>
     * 
     * @param clientRequestToken
     *        The unique, user-specified identifier for the request that ensures idempotency.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SendAnnouncementRequest withClientRequestToken(String clientRequestToken) {
        setClientRequestToken(clientRequestToken);
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
        if (getRoomFilters() != null)
            sb.append("RoomFilters: ").append(getRoomFilters()).append(",");
        if (getContent() != null)
            sb.append("Content: ").append(getContent()).append(",");
        if (getTimeToLiveInSeconds() != null)
            sb.append("TimeToLiveInSeconds: ").append(getTimeToLiveInSeconds()).append(",");
        if (getClientRequestToken() != null)
            sb.append("ClientRequestToken: ").append(getClientRequestToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SendAnnouncementRequest == false)
            return false;
        SendAnnouncementRequest other = (SendAnnouncementRequest) obj;
        if (other.getRoomFilters() == null ^ this.getRoomFilters() == null)
            return false;
        if (other.getRoomFilters() != null && other.getRoomFilters().equals(this.getRoomFilters()) == false)
            return false;
        if (other.getContent() == null ^ this.getContent() == null)
            return false;
        if (other.getContent() != null && other.getContent().equals(this.getContent()) == false)
            return false;
        if (other.getTimeToLiveInSeconds() == null ^ this.getTimeToLiveInSeconds() == null)
            return false;
        if (other.getTimeToLiveInSeconds() != null && other.getTimeToLiveInSeconds().equals(this.getTimeToLiveInSeconds()) == false)
            return false;
        if (other.getClientRequestToken() == null ^ this.getClientRequestToken() == null)
            return false;
        if (other.getClientRequestToken() != null && other.getClientRequestToken().equals(this.getClientRequestToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRoomFilters() == null) ? 0 : getRoomFilters().hashCode());
        hashCode = prime * hashCode + ((getContent() == null) ? 0 : getContent().hashCode());
        hashCode = prime * hashCode + ((getTimeToLiveInSeconds() == null) ? 0 : getTimeToLiveInSeconds().hashCode());
        hashCode = prime * hashCode + ((getClientRequestToken() == null) ? 0 : getClientRequestToken().hashCode());
        return hashCode;
    }

    @Override
    public SendAnnouncementRequest clone() {
        return (SendAnnouncementRequest) super.clone();
    }

}
