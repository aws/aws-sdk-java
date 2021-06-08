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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/CreateMeetingWithAttendees" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateMeetingWithAttendeesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The unique identifier for the client request. Use a different token for different meetings.
     * </p>
     */
    private String clientRequestToken;
    /**
     * <p>
     * The external meeting ID.
     * </p>
     */
    private String externalMeetingId;
    /**
     * <p>
     * Reserved.
     * </p>
     */
    private String meetingHostId;
    /**
     * <p>
     * The Region in which to create the meeting. Default: <code>us-east-1</code> .
     * </p>
     * <p>
     * Available values: <code>af-south-1</code> , <code>ap-northeast-1</code> , <code>ap-northeast-2</code> ,
     * <code>ap-south-1</code> , <code>ap-southeast-1</code> , <code>ap-southeast-2</code> , <code>ca-central-1</code> ,
     * <code>eu-central-1</code> , <code>eu-north-1</code> , <code>eu-south-1</code> , <code>eu-west-1</code> ,
     * <code>eu-west-2</code> , <code>eu-west-3</code> , <code>sa-east-1</code> , <code>us-east-1</code> ,
     * <code>us-east-2</code> , <code>us-west-1</code> , <code>us-west-2</code> .
     * </p>
     */
    private String mediaRegion;
    /**
     * <p>
     * The tag key-value pairs.
     * </p>
     */
    private java.util.List<Tag> tags;

    private MeetingNotificationConfiguration notificationsConfiguration;
    /**
     * <p>
     * The request containing the attendees to create.
     * </p>
     */
    private java.util.List<CreateAttendeeRequestItem> attendees;

    /**
     * <p>
     * The unique identifier for the client request. Use a different token for different meetings.
     * </p>
     * 
     * @param clientRequestToken
     *        The unique identifier for the client request. Use a different token for different meetings.
     */

    public void setClientRequestToken(String clientRequestToken) {
        this.clientRequestToken = clientRequestToken;
    }

    /**
     * <p>
     * The unique identifier for the client request. Use a different token for different meetings.
     * </p>
     * 
     * @return The unique identifier for the client request. Use a different token for different meetings.
     */

    public String getClientRequestToken() {
        return this.clientRequestToken;
    }

    /**
     * <p>
     * The unique identifier for the client request. Use a different token for different meetings.
     * </p>
     * 
     * @param clientRequestToken
     *        The unique identifier for the client request. Use a different token for different meetings.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateMeetingWithAttendeesRequest withClientRequestToken(String clientRequestToken) {
        setClientRequestToken(clientRequestToken);
        return this;
    }

    /**
     * <p>
     * The external meeting ID.
     * </p>
     * 
     * @param externalMeetingId
     *        The external meeting ID.
     */

    public void setExternalMeetingId(String externalMeetingId) {
        this.externalMeetingId = externalMeetingId;
    }

    /**
     * <p>
     * The external meeting ID.
     * </p>
     * 
     * @return The external meeting ID.
     */

    public String getExternalMeetingId() {
        return this.externalMeetingId;
    }

    /**
     * <p>
     * The external meeting ID.
     * </p>
     * 
     * @param externalMeetingId
     *        The external meeting ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateMeetingWithAttendeesRequest withExternalMeetingId(String externalMeetingId) {
        setExternalMeetingId(externalMeetingId);
        return this;
    }

    /**
     * <p>
     * Reserved.
     * </p>
     * 
     * @param meetingHostId
     *        Reserved.
     */

    public void setMeetingHostId(String meetingHostId) {
        this.meetingHostId = meetingHostId;
    }

    /**
     * <p>
     * Reserved.
     * </p>
     * 
     * @return Reserved.
     */

    public String getMeetingHostId() {
        return this.meetingHostId;
    }

    /**
     * <p>
     * Reserved.
     * </p>
     * 
     * @param meetingHostId
     *        Reserved.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateMeetingWithAttendeesRequest withMeetingHostId(String meetingHostId) {
        setMeetingHostId(meetingHostId);
        return this;
    }

    /**
     * <p>
     * The Region in which to create the meeting. Default: <code>us-east-1</code> .
     * </p>
     * <p>
     * Available values: <code>af-south-1</code> , <code>ap-northeast-1</code> , <code>ap-northeast-2</code> ,
     * <code>ap-south-1</code> , <code>ap-southeast-1</code> , <code>ap-southeast-2</code> , <code>ca-central-1</code> ,
     * <code>eu-central-1</code> , <code>eu-north-1</code> , <code>eu-south-1</code> , <code>eu-west-1</code> ,
     * <code>eu-west-2</code> , <code>eu-west-3</code> , <code>sa-east-1</code> , <code>us-east-1</code> ,
     * <code>us-east-2</code> , <code>us-west-1</code> , <code>us-west-2</code> .
     * </p>
     * 
     * @param mediaRegion
     *        The Region in which to create the meeting. Default: <code>us-east-1</code> . </p>
     *        <p>
     *        Available values: <code>af-south-1</code> , <code>ap-northeast-1</code> , <code>ap-northeast-2</code> ,
     *        <code>ap-south-1</code> , <code>ap-southeast-1</code> , <code>ap-southeast-2</code> ,
     *        <code>ca-central-1</code> , <code>eu-central-1</code> , <code>eu-north-1</code> , <code>eu-south-1</code>
     *        , <code>eu-west-1</code> , <code>eu-west-2</code> , <code>eu-west-3</code> , <code>sa-east-1</code> ,
     *        <code>us-east-1</code> , <code>us-east-2</code> , <code>us-west-1</code> , <code>us-west-2</code> .
     */

    public void setMediaRegion(String mediaRegion) {
        this.mediaRegion = mediaRegion;
    }

    /**
     * <p>
     * The Region in which to create the meeting. Default: <code>us-east-1</code> .
     * </p>
     * <p>
     * Available values: <code>af-south-1</code> , <code>ap-northeast-1</code> , <code>ap-northeast-2</code> ,
     * <code>ap-south-1</code> , <code>ap-southeast-1</code> , <code>ap-southeast-2</code> , <code>ca-central-1</code> ,
     * <code>eu-central-1</code> , <code>eu-north-1</code> , <code>eu-south-1</code> , <code>eu-west-1</code> ,
     * <code>eu-west-2</code> , <code>eu-west-3</code> , <code>sa-east-1</code> , <code>us-east-1</code> ,
     * <code>us-east-2</code> , <code>us-west-1</code> , <code>us-west-2</code> .
     * </p>
     * 
     * @return The Region in which to create the meeting. Default: <code>us-east-1</code> . </p>
     *         <p>
     *         Available values: <code>af-south-1</code> , <code>ap-northeast-1</code> , <code>ap-northeast-2</code> ,
     *         <code>ap-south-1</code> , <code>ap-southeast-1</code> , <code>ap-southeast-2</code> ,
     *         <code>ca-central-1</code> , <code>eu-central-1</code> , <code>eu-north-1</code> , <code>eu-south-1</code>
     *         , <code>eu-west-1</code> , <code>eu-west-2</code> , <code>eu-west-3</code> , <code>sa-east-1</code> ,
     *         <code>us-east-1</code> , <code>us-east-2</code> , <code>us-west-1</code> , <code>us-west-2</code> .
     */

    public String getMediaRegion() {
        return this.mediaRegion;
    }

    /**
     * <p>
     * The Region in which to create the meeting. Default: <code>us-east-1</code> .
     * </p>
     * <p>
     * Available values: <code>af-south-1</code> , <code>ap-northeast-1</code> , <code>ap-northeast-2</code> ,
     * <code>ap-south-1</code> , <code>ap-southeast-1</code> , <code>ap-southeast-2</code> , <code>ca-central-1</code> ,
     * <code>eu-central-1</code> , <code>eu-north-1</code> , <code>eu-south-1</code> , <code>eu-west-1</code> ,
     * <code>eu-west-2</code> , <code>eu-west-3</code> , <code>sa-east-1</code> , <code>us-east-1</code> ,
     * <code>us-east-2</code> , <code>us-west-1</code> , <code>us-west-2</code> .
     * </p>
     * 
     * @param mediaRegion
     *        The Region in which to create the meeting. Default: <code>us-east-1</code> . </p>
     *        <p>
     *        Available values: <code>af-south-1</code> , <code>ap-northeast-1</code> , <code>ap-northeast-2</code> ,
     *        <code>ap-south-1</code> , <code>ap-southeast-1</code> , <code>ap-southeast-2</code> ,
     *        <code>ca-central-1</code> , <code>eu-central-1</code> , <code>eu-north-1</code> , <code>eu-south-1</code>
     *        , <code>eu-west-1</code> , <code>eu-west-2</code> , <code>eu-west-3</code> , <code>sa-east-1</code> ,
     *        <code>us-east-1</code> , <code>us-east-2</code> , <code>us-west-1</code> , <code>us-west-2</code> .
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateMeetingWithAttendeesRequest withMediaRegion(String mediaRegion) {
        setMediaRegion(mediaRegion);
        return this;
    }

    /**
     * <p>
     * The tag key-value pairs.
     * </p>
     * 
     * @return The tag key-value pairs.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * The tag key-value pairs.
     * </p>
     * 
     * @param tags
     *        The tag key-value pairs.
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
     * The tag key-value pairs.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        The tag key-value pairs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateMeetingWithAttendeesRequest withTags(Tag... tags) {
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
     * The tag key-value pairs.
     * </p>
     * 
     * @param tags
     *        The tag key-value pairs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateMeetingWithAttendeesRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
        return this;
    }

    /**
     * @param notificationsConfiguration
     */

    public void setNotificationsConfiguration(MeetingNotificationConfiguration notificationsConfiguration) {
        this.notificationsConfiguration = notificationsConfiguration;
    }

    /**
     * @return
     */

    public MeetingNotificationConfiguration getNotificationsConfiguration() {
        return this.notificationsConfiguration;
    }

    /**
     * @param notificationsConfiguration
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateMeetingWithAttendeesRequest withNotificationsConfiguration(MeetingNotificationConfiguration notificationsConfiguration) {
        setNotificationsConfiguration(notificationsConfiguration);
        return this;
    }

    /**
     * <p>
     * The request containing the attendees to create.
     * </p>
     * 
     * @return The request containing the attendees to create.
     */

    public java.util.List<CreateAttendeeRequestItem> getAttendees() {
        return attendees;
    }

    /**
     * <p>
     * The request containing the attendees to create.
     * </p>
     * 
     * @param attendees
     *        The request containing the attendees to create.
     */

    public void setAttendees(java.util.Collection<CreateAttendeeRequestItem> attendees) {
        if (attendees == null) {
            this.attendees = null;
            return;
        }

        this.attendees = new java.util.ArrayList<CreateAttendeeRequestItem>(attendees);
    }

    /**
     * <p>
     * The request containing the attendees to create.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAttendees(java.util.Collection)} or {@link #withAttendees(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param attendees
     *        The request containing the attendees to create.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateMeetingWithAttendeesRequest withAttendees(CreateAttendeeRequestItem... attendees) {
        if (this.attendees == null) {
            setAttendees(new java.util.ArrayList<CreateAttendeeRequestItem>(attendees.length));
        }
        for (CreateAttendeeRequestItem ele : attendees) {
            this.attendees.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The request containing the attendees to create.
     * </p>
     * 
     * @param attendees
     *        The request containing the attendees to create.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateMeetingWithAttendeesRequest withAttendees(java.util.Collection<CreateAttendeeRequestItem> attendees) {
        setAttendees(attendees);
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
        if (getClientRequestToken() != null)
            sb.append("ClientRequestToken: ").append("***Sensitive Data Redacted***").append(",");
        if (getExternalMeetingId() != null)
            sb.append("ExternalMeetingId: ").append("***Sensitive Data Redacted***").append(",");
        if (getMeetingHostId() != null)
            sb.append("MeetingHostId: ").append("***Sensitive Data Redacted***").append(",");
        if (getMediaRegion() != null)
            sb.append("MediaRegion: ").append(getMediaRegion()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
        if (getNotificationsConfiguration() != null)
            sb.append("NotificationsConfiguration: ").append(getNotificationsConfiguration()).append(",");
        if (getAttendees() != null)
            sb.append("Attendees: ").append(getAttendees());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateMeetingWithAttendeesRequest == false)
            return false;
        CreateMeetingWithAttendeesRequest other = (CreateMeetingWithAttendeesRequest) obj;
        if (other.getClientRequestToken() == null ^ this.getClientRequestToken() == null)
            return false;
        if (other.getClientRequestToken() != null && other.getClientRequestToken().equals(this.getClientRequestToken()) == false)
            return false;
        if (other.getExternalMeetingId() == null ^ this.getExternalMeetingId() == null)
            return false;
        if (other.getExternalMeetingId() != null && other.getExternalMeetingId().equals(this.getExternalMeetingId()) == false)
            return false;
        if (other.getMeetingHostId() == null ^ this.getMeetingHostId() == null)
            return false;
        if (other.getMeetingHostId() != null && other.getMeetingHostId().equals(this.getMeetingHostId()) == false)
            return false;
        if (other.getMediaRegion() == null ^ this.getMediaRegion() == null)
            return false;
        if (other.getMediaRegion() != null && other.getMediaRegion().equals(this.getMediaRegion()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getNotificationsConfiguration() == null ^ this.getNotificationsConfiguration() == null)
            return false;
        if (other.getNotificationsConfiguration() != null && other.getNotificationsConfiguration().equals(this.getNotificationsConfiguration()) == false)
            return false;
        if (other.getAttendees() == null ^ this.getAttendees() == null)
            return false;
        if (other.getAttendees() != null && other.getAttendees().equals(this.getAttendees()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getClientRequestToken() == null) ? 0 : getClientRequestToken().hashCode());
        hashCode = prime * hashCode + ((getExternalMeetingId() == null) ? 0 : getExternalMeetingId().hashCode());
        hashCode = prime * hashCode + ((getMeetingHostId() == null) ? 0 : getMeetingHostId().hashCode());
        hashCode = prime * hashCode + ((getMediaRegion() == null) ? 0 : getMediaRegion().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getNotificationsConfiguration() == null) ? 0 : getNotificationsConfiguration().hashCode());
        hashCode = prime * hashCode + ((getAttendees() == null) ? 0 : getAttendees().hashCode());
        return hashCode;
    }

    @Override
    public CreateMeetingWithAttendeesRequest clone() {
        return (CreateMeetingWithAttendeesRequest) super.clone();
    }

}
