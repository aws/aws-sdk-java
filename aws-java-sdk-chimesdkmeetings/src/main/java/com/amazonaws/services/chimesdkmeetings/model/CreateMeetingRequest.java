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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-meetings-2021-07-15/CreateMeeting" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateMeetingRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

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
     * The configuration for resource targets to receive notifications when meeting and attendee events occur.
     * </p>
     */
    private NotificationsConfiguration notificationsConfiguration;
    /**
     * <p>
     * Lists the audio and video features enabled for a meeting, such as echo reduction.
     * </p>
     */
    private MeetingFeaturesConfiguration meetingFeatures;
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
     * Applies one or more tags to an Amazon Chime SDK meeting. Note the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Not all resources have tags. For a list of services with resources that support tagging using this operation, see
     * <a href="https://docs.aws.amazon.com/resourcegroupstagging/latest/APIReference/supported-services.html">Services
     * that support the Resource Groups Tagging API</a>. If the resource doesn't yet support this operation, the
     * resource's service might support tagging using its own API operations. For more information, refer to the
     * documentation for that service.
     * </p>
     * </li>
     * <li>
     * <p>
     * Each resource can have up to 50 tags. For other limits, see <a
     * href="https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html#tag-conventions">Tag Naming and Usage
     * Conventions</a> in the <i>AWS General Reference</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * You can only tag resources that are located in the specified AWS Region for the AWS account.
     * </p>
     * </li>
     * <li>
     * <p>
     * To add tags to a resource, you need the necessary permissions for the service that the resource belongs to as
     * well as permissions for adding tags. For more information, see the documentation for each service.
     * </p>
     * </li>
     * </ul>
     * <important>
     * <p>
     * Do not store personally identifiable information (PII) or other confidential or sensitive information in tags. We
     * use tags to provide you with billing and administration services. Tags are not intended to be used for private or
     * sensitive data.
     * </p>
     * </important>
     * <p>
     * <b>Minimum permissions</b>
     * </p>
     * <p>
     * In addition to the <code>tag:TagResources </code>permission required by this operation, you must also have the
     * tagging permission defined by the service that created the resource. For example, to tag a
     * <code>ChimeSDKMeetings</code> instance using the <code>TagResources</code> operation, you must have both of the
     * following permissions:
     * </p>
     * <p>
     * <code>tag:TagResources</code>
     * </p>
     * <p>
     * <code>ChimeSDKMeetings:CreateTags</code>
     * </p>
     * <note>
     * <p>
     * Some services might have specific requirements for tagging some resources. For example, to tag an Amazon S3
     * bucket, you must also have the <code>s3:GetBucketTagging</code> permission. If the expected minimum permissions
     * don't work, check the documentation for that service's tagging APIs for more information.
     * </p>
     * </note>
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

    public CreateMeetingRequest withClientRequestToken(String clientRequestToken) {
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

    public CreateMeetingRequest withMediaRegion(String mediaRegion) {
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

    public CreateMeetingRequest withMeetingHostId(String meetingHostId) {
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

    public CreateMeetingRequest withExternalMeetingId(String externalMeetingId) {
        setExternalMeetingId(externalMeetingId);
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

    public CreateMeetingRequest withNotificationsConfiguration(NotificationsConfiguration notificationsConfiguration) {
        setNotificationsConfiguration(notificationsConfiguration);
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

    public CreateMeetingRequest withMeetingFeatures(MeetingFeaturesConfiguration meetingFeatures) {
        setMeetingFeatures(meetingFeatures);
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

    public CreateMeetingRequest withPrimaryMeetingId(String primaryMeetingId) {
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

    public CreateMeetingRequest withTenantIds(String... tenantIds) {
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

    public CreateMeetingRequest withTenantIds(java.util.Collection<String> tenantIds) {
        setTenantIds(tenantIds);
        return this;
    }

    /**
     * <p>
     * Applies one or more tags to an Amazon Chime SDK meeting. Note the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Not all resources have tags. For a list of services with resources that support tagging using this operation, see
     * <a href="https://docs.aws.amazon.com/resourcegroupstagging/latest/APIReference/supported-services.html">Services
     * that support the Resource Groups Tagging API</a>. If the resource doesn't yet support this operation, the
     * resource's service might support tagging using its own API operations. For more information, refer to the
     * documentation for that service.
     * </p>
     * </li>
     * <li>
     * <p>
     * Each resource can have up to 50 tags. For other limits, see <a
     * href="https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html#tag-conventions">Tag Naming and Usage
     * Conventions</a> in the <i>AWS General Reference</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * You can only tag resources that are located in the specified AWS Region for the AWS account.
     * </p>
     * </li>
     * <li>
     * <p>
     * To add tags to a resource, you need the necessary permissions for the service that the resource belongs to as
     * well as permissions for adding tags. For more information, see the documentation for each service.
     * </p>
     * </li>
     * </ul>
     * <important>
     * <p>
     * Do not store personally identifiable information (PII) or other confidential or sensitive information in tags. We
     * use tags to provide you with billing and administration services. Tags are not intended to be used for private or
     * sensitive data.
     * </p>
     * </important>
     * <p>
     * <b>Minimum permissions</b>
     * </p>
     * <p>
     * In addition to the <code>tag:TagResources </code>permission required by this operation, you must also have the
     * tagging permission defined by the service that created the resource. For example, to tag a
     * <code>ChimeSDKMeetings</code> instance using the <code>TagResources</code> operation, you must have both of the
     * following permissions:
     * </p>
     * <p>
     * <code>tag:TagResources</code>
     * </p>
     * <p>
     * <code>ChimeSDKMeetings:CreateTags</code>
     * </p>
     * <note>
     * <p>
     * Some services might have specific requirements for tagging some resources. For example, to tag an Amazon S3
     * bucket, you must also have the <code>s3:GetBucketTagging</code> permission. If the expected minimum permissions
     * don't work, check the documentation for that service's tagging APIs for more information.
     * </p>
     * </note>
     * 
     * @return Applies one or more tags to an Amazon Chime SDK meeting. Note the following:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         Not all resources have tags. For a list of services with resources that support tagging using this
     *         operation, see <a
     *         href="https://docs.aws.amazon.com/resourcegroupstagging/latest/APIReference/supported-services.html"
     *         >Services that support the Resource Groups Tagging API</a>. If the resource doesn't yet support this
     *         operation, the resource's service might support tagging using its own API operations. For more
     *         information, refer to the documentation for that service.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Each resource can have up to 50 tags. For other limits, see <a
     *         href="https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html#tag-conventions">Tag Naming and
     *         Usage Conventions</a> in the <i>AWS General Reference</i>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You can only tag resources that are located in the specified AWS Region for the AWS account.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         To add tags to a resource, you need the necessary permissions for the service that the resource belongs
     *         to as well as permissions for adding tags. For more information, see the documentation for each service.
     *         </p>
     *         </li>
     *         </ul>
     *         <important>
     *         <p>
     *         Do not store personally identifiable information (PII) or other confidential or sensitive information in
     *         tags. We use tags to provide you with billing and administration services. Tags are not intended to be
     *         used for private or sensitive data.
     *         </p>
     *         </important>
     *         <p>
     *         <b>Minimum permissions</b>
     *         </p>
     *         <p>
     *         In addition to the <code>tag:TagResources </code>permission required by this operation, you must also
     *         have the tagging permission defined by the service that created the resource. For example, to tag a
     *         <code>ChimeSDKMeetings</code> instance using the <code>TagResources</code> operation, you must have both
     *         of the following permissions:
     *         </p>
     *         <p>
     *         <code>tag:TagResources</code>
     *         </p>
     *         <p>
     *         <code>ChimeSDKMeetings:CreateTags</code>
     *         </p>
     *         <note>
     *         <p>
     *         Some services might have specific requirements for tagging some resources. For example, to tag an Amazon
     *         S3 bucket, you must also have the <code>s3:GetBucketTagging</code> permission. If the expected minimum
     *         permissions don't work, check the documentation for that service's tagging APIs for more information.
     *         </p>
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * Applies one or more tags to an Amazon Chime SDK meeting. Note the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Not all resources have tags. For a list of services with resources that support tagging using this operation, see
     * <a href="https://docs.aws.amazon.com/resourcegroupstagging/latest/APIReference/supported-services.html">Services
     * that support the Resource Groups Tagging API</a>. If the resource doesn't yet support this operation, the
     * resource's service might support tagging using its own API operations. For more information, refer to the
     * documentation for that service.
     * </p>
     * </li>
     * <li>
     * <p>
     * Each resource can have up to 50 tags. For other limits, see <a
     * href="https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html#tag-conventions">Tag Naming and Usage
     * Conventions</a> in the <i>AWS General Reference</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * You can only tag resources that are located in the specified AWS Region for the AWS account.
     * </p>
     * </li>
     * <li>
     * <p>
     * To add tags to a resource, you need the necessary permissions for the service that the resource belongs to as
     * well as permissions for adding tags. For more information, see the documentation for each service.
     * </p>
     * </li>
     * </ul>
     * <important>
     * <p>
     * Do not store personally identifiable information (PII) or other confidential or sensitive information in tags. We
     * use tags to provide you with billing and administration services. Tags are not intended to be used for private or
     * sensitive data.
     * </p>
     * </important>
     * <p>
     * <b>Minimum permissions</b>
     * </p>
     * <p>
     * In addition to the <code>tag:TagResources </code>permission required by this operation, you must also have the
     * tagging permission defined by the service that created the resource. For example, to tag a
     * <code>ChimeSDKMeetings</code> instance using the <code>TagResources</code> operation, you must have both of the
     * following permissions:
     * </p>
     * <p>
     * <code>tag:TagResources</code>
     * </p>
     * <p>
     * <code>ChimeSDKMeetings:CreateTags</code>
     * </p>
     * <note>
     * <p>
     * Some services might have specific requirements for tagging some resources. For example, to tag an Amazon S3
     * bucket, you must also have the <code>s3:GetBucketTagging</code> permission. If the expected minimum permissions
     * don't work, check the documentation for that service's tagging APIs for more information.
     * </p>
     * </note>
     * 
     * @param tags
     *        Applies one or more tags to an Amazon Chime SDK meeting. Note the following:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        Not all resources have tags. For a list of services with resources that support tagging using this
     *        operation, see <a
     *        href="https://docs.aws.amazon.com/resourcegroupstagging/latest/APIReference/supported-services.html"
     *        >Services that support the Resource Groups Tagging API</a>. If the resource doesn't yet support this
     *        operation, the resource's service might support tagging using its own API operations. For more
     *        information, refer to the documentation for that service.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Each resource can have up to 50 tags. For other limits, see <a
     *        href="https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html#tag-conventions">Tag Naming and Usage
     *        Conventions</a> in the <i>AWS General Reference</i>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        You can only tag resources that are located in the specified AWS Region for the AWS account.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        To add tags to a resource, you need the necessary permissions for the service that the resource belongs to
     *        as well as permissions for adding tags. For more information, see the documentation for each service.
     *        </p>
     *        </li>
     *        </ul>
     *        <important>
     *        <p>
     *        Do not store personally identifiable information (PII) or other confidential or sensitive information in
     *        tags. We use tags to provide you with billing and administration services. Tags are not intended to be
     *        used for private or sensitive data.
     *        </p>
     *        </important>
     *        <p>
     *        <b>Minimum permissions</b>
     *        </p>
     *        <p>
     *        In addition to the <code>tag:TagResources </code>permission required by this operation, you must also have
     *        the tagging permission defined by the service that created the resource. For example, to tag a
     *        <code>ChimeSDKMeetings</code> instance using the <code>TagResources</code> operation, you must have both
     *        of the following permissions:
     *        </p>
     *        <p>
     *        <code>tag:TagResources</code>
     *        </p>
     *        <p>
     *        <code>ChimeSDKMeetings:CreateTags</code>
     *        </p>
     *        <note>
     *        <p>
     *        Some services might have specific requirements for tagging some resources. For example, to tag an Amazon
     *        S3 bucket, you must also have the <code>s3:GetBucketTagging</code> permission. If the expected minimum
     *        permissions don't work, check the documentation for that service's tagging APIs for more information.
     *        </p>
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
     * Applies one or more tags to an Amazon Chime SDK meeting. Note the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Not all resources have tags. For a list of services with resources that support tagging using this operation, see
     * <a href="https://docs.aws.amazon.com/resourcegroupstagging/latest/APIReference/supported-services.html">Services
     * that support the Resource Groups Tagging API</a>. If the resource doesn't yet support this operation, the
     * resource's service might support tagging using its own API operations. For more information, refer to the
     * documentation for that service.
     * </p>
     * </li>
     * <li>
     * <p>
     * Each resource can have up to 50 tags. For other limits, see <a
     * href="https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html#tag-conventions">Tag Naming and Usage
     * Conventions</a> in the <i>AWS General Reference</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * You can only tag resources that are located in the specified AWS Region for the AWS account.
     * </p>
     * </li>
     * <li>
     * <p>
     * To add tags to a resource, you need the necessary permissions for the service that the resource belongs to as
     * well as permissions for adding tags. For more information, see the documentation for each service.
     * </p>
     * </li>
     * </ul>
     * <important>
     * <p>
     * Do not store personally identifiable information (PII) or other confidential or sensitive information in tags. We
     * use tags to provide you with billing and administration services. Tags are not intended to be used for private or
     * sensitive data.
     * </p>
     * </important>
     * <p>
     * <b>Minimum permissions</b>
     * </p>
     * <p>
     * In addition to the <code>tag:TagResources </code>permission required by this operation, you must also have the
     * tagging permission defined by the service that created the resource. For example, to tag a
     * <code>ChimeSDKMeetings</code> instance using the <code>TagResources</code> operation, you must have both of the
     * following permissions:
     * </p>
     * <p>
     * <code>tag:TagResources</code>
     * </p>
     * <p>
     * <code>ChimeSDKMeetings:CreateTags</code>
     * </p>
     * <note>
     * <p>
     * Some services might have specific requirements for tagging some resources. For example, to tag an Amazon S3
     * bucket, you must also have the <code>s3:GetBucketTagging</code> permission. If the expected minimum permissions
     * don't work, check the documentation for that service's tagging APIs for more information.
     * </p>
     * </note>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        Applies one or more tags to an Amazon Chime SDK meeting. Note the following:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        Not all resources have tags. For a list of services with resources that support tagging using this
     *        operation, see <a
     *        href="https://docs.aws.amazon.com/resourcegroupstagging/latest/APIReference/supported-services.html"
     *        >Services that support the Resource Groups Tagging API</a>. If the resource doesn't yet support this
     *        operation, the resource's service might support tagging using its own API operations. For more
     *        information, refer to the documentation for that service.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Each resource can have up to 50 tags. For other limits, see <a
     *        href="https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html#tag-conventions">Tag Naming and Usage
     *        Conventions</a> in the <i>AWS General Reference</i>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        You can only tag resources that are located in the specified AWS Region for the AWS account.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        To add tags to a resource, you need the necessary permissions for the service that the resource belongs to
     *        as well as permissions for adding tags. For more information, see the documentation for each service.
     *        </p>
     *        </li>
     *        </ul>
     *        <important>
     *        <p>
     *        Do not store personally identifiable information (PII) or other confidential or sensitive information in
     *        tags. We use tags to provide you with billing and administration services. Tags are not intended to be
     *        used for private or sensitive data.
     *        </p>
     *        </important>
     *        <p>
     *        <b>Minimum permissions</b>
     *        </p>
     *        <p>
     *        In addition to the <code>tag:TagResources </code>permission required by this operation, you must also have
     *        the tagging permission defined by the service that created the resource. For example, to tag a
     *        <code>ChimeSDKMeetings</code> instance using the <code>TagResources</code> operation, you must have both
     *        of the following permissions:
     *        </p>
     *        <p>
     *        <code>tag:TagResources</code>
     *        </p>
     *        <p>
     *        <code>ChimeSDKMeetings:CreateTags</code>
     *        </p>
     *        <note>
     *        <p>
     *        Some services might have specific requirements for tagging some resources. For example, to tag an Amazon
     *        S3 bucket, you must also have the <code>s3:GetBucketTagging</code> permission. If the expected minimum
     *        permissions don't work, check the documentation for that service's tagging APIs for more information.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateMeetingRequest withTags(Tag... tags) {
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
     * Applies one or more tags to an Amazon Chime SDK meeting. Note the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Not all resources have tags. For a list of services with resources that support tagging using this operation, see
     * <a href="https://docs.aws.amazon.com/resourcegroupstagging/latest/APIReference/supported-services.html">Services
     * that support the Resource Groups Tagging API</a>. If the resource doesn't yet support this operation, the
     * resource's service might support tagging using its own API operations. For more information, refer to the
     * documentation for that service.
     * </p>
     * </li>
     * <li>
     * <p>
     * Each resource can have up to 50 tags. For other limits, see <a
     * href="https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html#tag-conventions">Tag Naming and Usage
     * Conventions</a> in the <i>AWS General Reference</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * You can only tag resources that are located in the specified AWS Region for the AWS account.
     * </p>
     * </li>
     * <li>
     * <p>
     * To add tags to a resource, you need the necessary permissions for the service that the resource belongs to as
     * well as permissions for adding tags. For more information, see the documentation for each service.
     * </p>
     * </li>
     * </ul>
     * <important>
     * <p>
     * Do not store personally identifiable information (PII) or other confidential or sensitive information in tags. We
     * use tags to provide you with billing and administration services. Tags are not intended to be used for private or
     * sensitive data.
     * </p>
     * </important>
     * <p>
     * <b>Minimum permissions</b>
     * </p>
     * <p>
     * In addition to the <code>tag:TagResources </code>permission required by this operation, you must also have the
     * tagging permission defined by the service that created the resource. For example, to tag a
     * <code>ChimeSDKMeetings</code> instance using the <code>TagResources</code> operation, you must have both of the
     * following permissions:
     * </p>
     * <p>
     * <code>tag:TagResources</code>
     * </p>
     * <p>
     * <code>ChimeSDKMeetings:CreateTags</code>
     * </p>
     * <note>
     * <p>
     * Some services might have specific requirements for tagging some resources. For example, to tag an Amazon S3
     * bucket, you must also have the <code>s3:GetBucketTagging</code> permission. If the expected minimum permissions
     * don't work, check the documentation for that service's tagging APIs for more information.
     * </p>
     * </note>
     * 
     * @param tags
     *        Applies one or more tags to an Amazon Chime SDK meeting. Note the following:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        Not all resources have tags. For a list of services with resources that support tagging using this
     *        operation, see <a
     *        href="https://docs.aws.amazon.com/resourcegroupstagging/latest/APIReference/supported-services.html"
     *        >Services that support the Resource Groups Tagging API</a>. If the resource doesn't yet support this
     *        operation, the resource's service might support tagging using its own API operations. For more
     *        information, refer to the documentation for that service.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Each resource can have up to 50 tags. For other limits, see <a
     *        href="https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html#tag-conventions">Tag Naming and Usage
     *        Conventions</a> in the <i>AWS General Reference</i>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        You can only tag resources that are located in the specified AWS Region for the AWS account.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        To add tags to a resource, you need the necessary permissions for the service that the resource belongs to
     *        as well as permissions for adding tags. For more information, see the documentation for each service.
     *        </p>
     *        </li>
     *        </ul>
     *        <important>
     *        <p>
     *        Do not store personally identifiable information (PII) or other confidential or sensitive information in
     *        tags. We use tags to provide you with billing and administration services. Tags are not intended to be
     *        used for private or sensitive data.
     *        </p>
     *        </important>
     *        <p>
     *        <b>Minimum permissions</b>
     *        </p>
     *        <p>
     *        In addition to the <code>tag:TagResources </code>permission required by this operation, you must also have
     *        the tagging permission defined by the service that created the resource. For example, to tag a
     *        <code>ChimeSDKMeetings</code> instance using the <code>TagResources</code> operation, you must have both
     *        of the following permissions:
     *        </p>
     *        <p>
     *        <code>tag:TagResources</code>
     *        </p>
     *        <p>
     *        <code>ChimeSDKMeetings:CreateTags</code>
     *        </p>
     *        <note>
     *        <p>
     *        Some services might have specific requirements for tagging some resources. For example, to tag an Amazon
     *        S3 bucket, you must also have the <code>s3:GetBucketTagging</code> permission. If the expected minimum
     *        permissions don't work, check the documentation for that service's tagging APIs for more information.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateMeetingRequest withTags(java.util.Collection<Tag> tags) {
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
        if (getNotificationsConfiguration() != null)
            sb.append("NotificationsConfiguration: ").append(getNotificationsConfiguration()).append(",");
        if (getMeetingFeatures() != null)
            sb.append("MeetingFeatures: ").append(getMeetingFeatures()).append(",");
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

        if (obj instanceof CreateMeetingRequest == false)
            return false;
        CreateMeetingRequest other = (CreateMeetingRequest) obj;
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
        if (other.getNotificationsConfiguration() == null ^ this.getNotificationsConfiguration() == null)
            return false;
        if (other.getNotificationsConfiguration() != null && other.getNotificationsConfiguration().equals(this.getNotificationsConfiguration()) == false)
            return false;
        if (other.getMeetingFeatures() == null ^ this.getMeetingFeatures() == null)
            return false;
        if (other.getMeetingFeatures() != null && other.getMeetingFeatures().equals(this.getMeetingFeatures()) == false)
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
        hashCode = prime * hashCode + ((getNotificationsConfiguration() == null) ? 0 : getNotificationsConfiguration().hashCode());
        hashCode = prime * hashCode + ((getMeetingFeatures() == null) ? 0 : getMeetingFeatures().hashCode());
        hashCode = prime * hashCode + ((getPrimaryMeetingId() == null) ? 0 : getPrimaryMeetingId().hashCode());
        hashCode = prime * hashCode + ((getTenantIds() == null) ? 0 : getTenantIds().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateMeetingRequest clone() {
        return (CreateMeetingRequest) super.clone();
    }

}
