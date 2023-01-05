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
package com.amazonaws.services.chimesdkmeetings.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-meetings-2021-07-15/CreateMeetingWithAttendees"
 *      target="_top">AWS API Documentation</a>
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
     * The Region in which to create the meeting.
     * </p>
     * <p>
     * Available values: <code>af-south-1</code>, <code>ap-northeast-1</code>, <code>ap-northeast-2</code>,
     * <code>ap-south-1</code>, <code>ap-southeast-1</code>, <code>ap-southeast-2</code>, <code>ca-central-1</code>,
     * <code>eu-central-1</code>, <code>eu-north-1</code>, <code>eu-south-1</code>, <code>eu-west-1</code>,
     * <code>eu-west-2</code>, <code>eu-west-3</code>, <code>sa-east-1</code>, <code>us-east-1</code>,
     * <code>us-east-2</code>, <code>us-west-1</code>, <code>us-west-2</code>.
     * </p>
     * <p>
     * Available values in AWS GovCloud (US) Regions: <code>us-gov-east-1</code>, <code>us-gov-west-1</code>.
     * </p>
     */
    private String mediaRegion;
    /**
     * <p>
     * Reserved.
     * </p>
     */
    private String meetingHostId;
    /**
     * <p>
     * The external meeting ID.
     * </p>
     */
    private String externalMeetingId;
    /**
     * <p>
     * Lists the audio and video features enabled for a meeting, such as echo reduction.
     * </p>
     */
    private MeetingFeaturesConfiguration meetingFeatures;
    /**
     * <p>
     * The configuration for resource targets to receive notifications when meeting and attendee events occur.
     * </p>
     */
    private NotificationsConfiguration notificationsConfiguration;
    /**
     * <p>
     * The attendee information, including attendees' IDs and join tokens.
     * </p>
     */
    private java.util.List<CreateAttendeeRequestItem> attendees;
    /**
     * <p>
     * When specified, replicates the media from the primary meeting to the new meeting.
     * </p>
     */
    private String primaryMeetingId;
    /**
     * <p>
     * A consistent and opaque identifier, created and maintained by the builder to represent a segment of their users.
     * </p>
     */
    private java.util.List<String> tenantIds;
    /**
     * <p>
     * The tags in the request.
     * </p>
     */
    private java.util.List<Tag> tags;

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
     * The Region in which to create the meeting.
     * </p>
     * <p>
     * Available values: <code>af-south-1</code>, <code>ap-northeast-1</code>, <code>ap-northeast-2</code>,
     * <code>ap-south-1</code>, <code>ap-southeast-1</code>, <code>ap-southeast-2</code>, <code>ca-central-1</code>,
     * <code>eu-central-1</code>, <code>eu-north-1</code>, <code>eu-south-1</code>, <code>eu-west-1</code>,
     * <code>eu-west-2</code>, <code>eu-west-3</code>, <code>sa-east-1</code>, <code>us-east-1</code>,
     * <code>us-east-2</code>, <code>us-west-1</code>, <code>us-west-2</code>.
     * </p>
     * <p>
     * Available values in AWS GovCloud (US) Regions: <code>us-gov-east-1</code>, <code>us-gov-west-1</code>.
     * </p>
     * 
     * @param mediaRegion
     *        The Region in which to create the meeting.</p>
     *        <p>
     *        Available values: <code>af-south-1</code>, <code>ap-northeast-1</code>, <code>ap-northeast-2</code>,
     *        <code>ap-south-1</code>, <code>ap-southeast-1</code>, <code>ap-southeast-2</code>,
     *        <code>ca-central-1</code>, <code>eu-central-1</code>, <code>eu-north-1</code>, <code>eu-south-1</code>,
     *        <code>eu-west-1</code>, <code>eu-west-2</code>, <code>eu-west-3</code>, <code>sa-east-1</code>,
     *        <code>us-east-1</code>, <code>us-east-2</code>, <code>us-west-1</code>, <code>us-west-2</code>.
     *        </p>
     *        <p>
     *        Available values in AWS GovCloud (US) Regions: <code>us-gov-east-1</code>, <code>us-gov-west-1</code>.
     */

    public void setMediaRegion(String mediaRegion) {
        this.mediaRegion = mediaRegion;
    }

    /**
     * <p>
     * The Region in which to create the meeting.
     * </p>
     * <p>
     * Available values: <code>af-south-1</code>, <code>ap-northeast-1</code>, <code>ap-northeast-2</code>,
     * <code>ap-south-1</code>, <code>ap-southeast-1</code>, <code>ap-southeast-2</code>, <code>ca-central-1</code>,
     * <code>eu-central-1</code>, <code>eu-north-1</code>, <code>eu-south-1</code>, <code>eu-west-1</code>,
     * <code>eu-west-2</code>, <code>eu-west-3</code>, <code>sa-east-1</code>, <code>us-east-1</code>,
     * <code>us-east-2</code>, <code>us-west-1</code>, <code>us-west-2</code>.
     * </p>
     * <p>
     * Available values in AWS GovCloud (US) Regions: <code>us-gov-east-1</code>, <code>us-gov-west-1</code>.
     * </p>
     * 
     * @return The Region in which to create the meeting.</p>
     *         <p>
     *         Available values: <code>af-south-1</code>, <code>ap-northeast-1</code>, <code>ap-northeast-2</code>,
     *         <code>ap-south-1</code>, <code>ap-southeast-1</code>, <code>ap-southeast-2</code>,
     *         <code>ca-central-1</code>, <code>eu-central-1</code>, <code>eu-north-1</code>, <code>eu-south-1</code>,
     *         <code>eu-west-1</code>, <code>eu-west-2</code>, <code>eu-west-3</code>, <code>sa-east-1</code>,
     *         <code>us-east-1</code>, <code>us-east-2</code>, <code>us-west-1</code>, <code>us-west-2</code>.
     *         </p>
     *         <p>
     *         Available values in AWS GovCloud (US) Regions: <code>us-gov-east-1</code>, <code>us-gov-west-1</code>.
     */

    public String getMediaRegion() {
        return this.mediaRegion;
    }

    /**
     * <p>
     * The Region in which to create the meeting.
     * </p>
     * <p>
     * Available values: <code>af-south-1</code>, <code>ap-northeast-1</code>, <code>ap-northeast-2</code>,
     * <code>ap-south-1</code>, <code>ap-southeast-1</code>, <code>ap-southeast-2</code>, <code>ca-central-1</code>,
     * <code>eu-central-1</code>, <code>eu-north-1</code>, <code>eu-south-1</code>, <code>eu-west-1</code>,
     * <code>eu-west-2</code>, <code>eu-west-3</code>, <code>sa-east-1</code>, <code>us-east-1</code>,
     * <code>us-east-2</code>, <code>us-west-1</code>, <code>us-west-2</code>.
     * </p>
     * <p>
     * Available values in AWS GovCloud (US) Regions: <code>us-gov-east-1</code>, <code>us-gov-west-1</code>.
     * </p>
     * 
     * @param mediaRegion
     *        The Region in which to create the meeting.</p>
     *        <p>
     *        Available values: <code>af-south-1</code>, <code>ap-northeast-1</code>, <code>ap-northeast-2</code>,
     *        <code>ap-south-1</code>, <code>ap-southeast-1</code>, <code>ap-southeast-2</code>,
     *        <code>ca-central-1</code>, <code>eu-central-1</code>, <code>eu-north-1</code>, <code>eu-south-1</code>,
     *        <code>eu-west-1</code>, <code>eu-west-2</code>, <code>eu-west-3</code>, <code>sa-east-1</code>,
     *        <code>us-east-1</code>, <code>us-east-2</code>, <code>us-west-1</code>, <code>us-west-2</code>.
     *        </p>
     *        <p>
     *        Available values in AWS GovCloud (US) Regions: <code>us-gov-east-1</code>, <code>us-gov-west-1</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateMeetingWithAttendeesRequest withMediaRegion(String mediaRegion) {
        setMediaRegion(mediaRegion);
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
     * Lists the audio and video features enabled for a meeting, such as echo reduction.
     * </p>
     * 
     * @param meetingFeatures
     *        Lists the audio and video features enabled for a meeting, such as echo reduction.
     */

    public void setMeetingFeatures(MeetingFeaturesConfiguration meetingFeatures) {
        this.meetingFeatures = meetingFeatures;
    }

    /**
     * <p>
     * Lists the audio and video features enabled for a meeting, such as echo reduction.
     * </p>
     * 
     * @return Lists the audio and video features enabled for a meeting, such as echo reduction.
     */

    public MeetingFeaturesConfiguration getMeetingFeatures() {
        return this.meetingFeatures;
    }

    /**
     * <p>
     * Lists the audio and video features enabled for a meeting, such as echo reduction.
     * </p>
     * 
     * @param meetingFeatures
     *        Lists the audio and video features enabled for a meeting, such as echo reduction.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateMeetingWithAttendeesRequest withMeetingFeatures(MeetingFeaturesConfiguration meetingFeatures) {
        setMeetingFeatures(meetingFeatures);
        return this;
    }

    /**
     * <p>
     * The configuration for resource targets to receive notifications when meeting and attendee events occur.
     * </p>
     * 
     * @param notificationsConfiguration
     *        The configuration for resource targets to receive notifications when meeting and attendee events occur.
     */

    public void setNotificationsConfiguration(NotificationsConfiguration notificationsConfiguration) {
        this.notificationsConfiguration = notificationsConfiguration;
    }

    /**
     * <p>
     * The configuration for resource targets to receive notifications when meeting and attendee events occur.
     * </p>
     * 
     * @return The configuration for resource targets to receive notifications when meeting and attendee events occur.
     */

    public NotificationsConfiguration getNotificationsConfiguration() {
        return this.notificationsConfiguration;
    }

    /**
     * <p>
     * The configuration for resource targets to receive notifications when meeting and attendee events occur.
     * </p>
     * 
     * @param notificationsConfiguration
     *        The configuration for resource targets to receive notifications when meeting and attendee events occur.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateMeetingWithAttendeesRequest withNotificationsConfiguration(NotificationsConfiguration notificationsConfiguration) {
        setNotificationsConfiguration(notificationsConfiguration);
        return this;
    }

    /**
     * <p>
     * The attendee information, including attendees' IDs and join tokens.
     * </p>
     * 
     * @return The attendee information, including attendees' IDs and join tokens.
     */

    public java.util.List<CreateAttendeeRequestItem> getAttendees() {
        return attendees;
    }

    /**
     * <p>
     * The attendee information, including attendees' IDs and join tokens.
     * </p>
     * 
     * @param attendees
     *        The attendee information, including attendees' IDs and join tokens.
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
     * The attendee information, including attendees' IDs and join tokens.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAttendees(java.util.Collection)} or {@link #withAttendees(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param attendees
     *        The attendee information, including attendees' IDs and join tokens.
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
     * The attendee information, including attendees' IDs and join tokens.
     * </p>
     * 
     * @param attendees
     *        The attendee information, including attendees' IDs and join tokens.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateMeetingWithAttendeesRequest withAttendees(java.util.Collection<CreateAttendeeRequestItem> attendees) {
        setAttendees(attendees);
        return this;
    }

    /**
     * <p>
     * When specified, replicates the media from the primary meeting to the new meeting.
     * </p>
     * 
     * @param primaryMeetingId
     *        When specified, replicates the media from the primary meeting to the new meeting.
     */

    public void setPrimaryMeetingId(String primaryMeetingId) {
        this.primaryMeetingId = primaryMeetingId;
    }

    /**
     * <p>
     * When specified, replicates the media from the primary meeting to the new meeting.
     * </p>
     * 
     * @return When specified, replicates the media from the primary meeting to the new meeting.
     */

    public String getPrimaryMeetingId() {
        return this.primaryMeetingId;
    }

    /**
     * <p>
     * When specified, replicates the media from the primary meeting to the new meeting.
     * </p>
     * 
     * @param primaryMeetingId
     *        When specified, replicates the media from the primary meeting to the new meeting.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateMeetingWithAttendeesRequest withPrimaryMeetingId(String primaryMeetingId) {
        setPrimaryMeetingId(primaryMeetingId);
        return this;
    }

    /**
     * <p>
     * A consistent and opaque identifier, created and maintained by the builder to represent a segment of their users.
     * </p>
     * 
     * @return A consistent and opaque identifier, created and maintained by the builder to represent a segment of their
     *         users.
     */

    public java.util.List<String> getTenantIds() {
        return tenantIds;
    }

    /**
     * <p>
     * A consistent and opaque identifier, created and maintained by the builder to represent a segment of their users.
     * </p>
     * 
     * @param tenantIds
     *        A consistent and opaque identifier, created and maintained by the builder to represent a segment of their
     *        users.
     */

    public void setTenantIds(java.util.Collection<String> tenantIds) {
        if (tenantIds == null) {
            this.tenantIds = null;
            return;
        }

        this.tenantIds = new java.util.ArrayList<String>(tenantIds);
    }

    /**
     * <p>
     * A consistent and opaque identifier, created and maintained by the builder to represent a segment of their users.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTenantIds(java.util.Collection)} or {@link #withTenantIds(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param tenantIds
     *        A consistent and opaque identifier, created and maintained by the builder to represent a segment of their
     *        users.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateMeetingWithAttendeesRequest withTenantIds(String... tenantIds) {
        if (this.tenantIds == null) {
            setTenantIds(new java.util.ArrayList<String>(tenantIds.length));
        }
        for (String ele : tenantIds) {
            this.tenantIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A consistent and opaque identifier, created and maintained by the builder to represent a segment of their users.
     * </p>
     * 
     * @param tenantIds
     *        A consistent and opaque identifier, created and maintained by the builder to represent a segment of their
     *        users.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateMeetingWithAttendeesRequest withTenantIds(java.util.Collection<String> tenantIds) {
        setTenantIds(tenantIds);
        return this;
    }

    /**
     * <p>
     * The tags in the request.
     * </p>
     * 
     * @return The tags in the request.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * The tags in the request.
     * </p>
     * 
     * @param tags
     *        The tags in the request.
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
     * The tags in the request.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        The tags in the request.
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
     * The tags in the request.
     * </p>
     * 
     * @param tags
     *        The tags in the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateMeetingWithAttendeesRequest withTags(java.util.Collection<Tag> tags) {
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
        if (getClientRequestToken() != null)
            sb.append("ClientRequestToken: ").append("***Sensitive Data Redacted***").append(",");
        if (getMediaRegion() != null)
            sb.append("MediaRegion: ").append(getMediaRegion()).append(",");
        if (getMeetingHostId() != null)
            sb.append("MeetingHostId: ").append("***Sensitive Data Redacted***").append(",");
        if (getExternalMeetingId() != null)
            sb.append("ExternalMeetingId: ").append("***Sensitive Data Redacted***").append(",");
        if (getMeetingFeatures() != null)
            sb.append("MeetingFeatures: ").append(getMeetingFeatures()).append(",");
        if (getNotificationsConfiguration() != null)
            sb.append("NotificationsConfiguration: ").append(getNotificationsConfiguration()).append(",");
        if (getAttendees() != null)
            sb.append("Attendees: ").append(getAttendees()).append(",");
        if (getPrimaryMeetingId() != null)
            sb.append("PrimaryMeetingId: ").append(getPrimaryMeetingId()).append(",");
        if (getTenantIds() != null)
            sb.append("TenantIds: ").append(getTenantIds()).append(",");
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

        if (obj instanceof CreateMeetingWithAttendeesRequest == false)
            return false;
        CreateMeetingWithAttendeesRequest other = (CreateMeetingWithAttendeesRequest) obj;
        if (other.getClientRequestToken() == null ^ this.getClientRequestToken() == null)
            return false;
        if (other.getClientRequestToken() != null && other.getClientRequestToken().equals(this.getClientRequestToken()) == false)
            return false;
        if (other.getMediaRegion() == null ^ this.getMediaRegion() == null)
            return false;
        if (other.getMediaRegion() != null && other.getMediaRegion().equals(this.getMediaRegion()) == false)
            return false;
        if (other.getMeetingHostId() == null ^ this.getMeetingHostId() == null)
            return false;
        if (other.getMeetingHostId() != null && other.getMeetingHostId().equals(this.getMeetingHostId()) == false)
            return false;
        if (other.getExternalMeetingId() == null ^ this.getExternalMeetingId() == null)
            return false;
        if (other.getExternalMeetingId() != null && other.getExternalMeetingId().equals(this.getExternalMeetingId()) == false)
            return false;
        if (other.getMeetingFeatures() == null ^ this.getMeetingFeatures() == null)
            return false;
        if (other.getMeetingFeatures() != null && other.getMeetingFeatures().equals(this.getMeetingFeatures()) == false)
            return false;
        if (other.getNotificationsConfiguration() == null ^ this.getNotificationsConfiguration() == null)
            return false;
        if (other.getNotificationsConfiguration() != null && other.getNotificationsConfiguration().equals(this.getNotificationsConfiguration()) == false)
            return false;
        if (other.getAttendees() == null ^ this.getAttendees() == null)
            return false;
        if (other.getAttendees() != null && other.getAttendees().equals(this.getAttendees()) == false)
            return false;
        if (other.getPrimaryMeetingId() == null ^ this.getPrimaryMeetingId() == null)
            return false;
        if (other.getPrimaryMeetingId() != null && other.getPrimaryMeetingId().equals(this.getPrimaryMeetingId()) == false)
            return false;
        if (other.getTenantIds() == null ^ this.getTenantIds() == null)
            return false;
        if (other.getTenantIds() != null && other.getTenantIds().equals(this.getTenantIds()) == false)
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

        hashCode = prime * hashCode + ((getClientRequestToken() == null) ? 0 : getClientRequestToken().hashCode());
        hashCode = prime * hashCode + ((getMediaRegion() == null) ? 0 : getMediaRegion().hashCode());
        hashCode = prime * hashCode + ((getMeetingHostId() == null) ? 0 : getMeetingHostId().hashCode());
        hashCode = prime * hashCode + ((getExternalMeetingId() == null) ? 0 : getExternalMeetingId().hashCode());
        hashCode = prime * hashCode + ((getMeetingFeatures() == null) ? 0 : getMeetingFeatures().hashCode());
        hashCode = prime * hashCode + ((getNotificationsConfiguration() == null) ? 0 : getNotificationsConfiguration().hashCode());
        hashCode = prime * hashCode + ((getAttendees() == null) ? 0 : getAttendees().hashCode());
        hashCode = prime * hashCode + ((getPrimaryMeetingId() == null) ? 0 : getPrimaryMeetingId().hashCode());
        hashCode = prime * hashCode + ((getTenantIds() == null) ? 0 : getTenantIds().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateMeetingWithAttendeesRequest clone() {
        return (CreateMeetingWithAttendeesRequest) super.clone();
    }

}
