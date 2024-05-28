/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.mediapackagev2.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediapackagev2-2022-12-25/GetOriginEndpoint" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetOriginEndpointResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) associated with the resource.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The name that describes the channel group. The name is the primary identifier for the channel group, and must be
     * unique for your account in the AWS Region.
     * </p>
     */
    private String channelGroupName;
    /**
     * <p>
     * The name that describes the channel. The name is the primary identifier for the channel, and must be unique for
     * your account in the AWS Region and channel group.
     * </p>
     */
    private String channelName;
    /**
     * <p>
     * The name that describes the origin endpoint. The name is the primary identifier for the origin endpoint, and and
     * must be unique for your account in the AWS Region and channel.
     * </p>
     */
    private String originEndpointName;
    /**
     * <p>
     * The type of container attached to this origin endpoint.
     * </p>
     */
    private String containerType;

    private Segment segment;
    /**
     * <p>
     * The date and time the origin endpoint was created.
     * </p>
     */
    private java.util.Date createdAt;
    /**
     * <p>
     * The date and time the origin endpoint was modified.
     * </p>
     */
    private java.util.Date modifiedAt;
    /**
     * <p>
     * The description for your origin endpoint.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The size of the window (in seconds) to create a window of the live stream that's available for on-demand viewing.
     * Viewers can start-over or catch-up on content that falls within the window.
     * </p>
     */
    private Integer startoverWindowSeconds;
    /**
     * <p>
     * An HTTP live streaming (HLS) manifest configuration.
     * </p>
     */
    private java.util.List<GetHlsManifestConfiguration> hlsManifests;
    /**
     * <p>
     * A low-latency HLS manifest configuration.
     * </p>
     */
    private java.util.List<GetLowLatencyHlsManifestConfiguration> lowLatencyHlsManifests;
    /**
     * <p>
     * The current Entity Tag (ETag) associated with this resource. The entity tag can be used to safely make concurrent
     * updates to the resource.
     * </p>
     */
    private String eTag;
    /**
     * <p>
     * The comma-separated list of tag key:value pairs assigned to the origin endpoint.
     * </p>
     */
    private java.util.Map<String, String> tags;
    /**
     * <p>
     * A DASH manifest configuration.
     * </p>
     */
    private java.util.List<GetDashManifestConfiguration> dashManifests;

    /**
     * <p>
     * The Amazon Resource Name (ARN) associated with the resource.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) associated with the resource.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) associated with the resource.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) associated with the resource.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) associated with the resource.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) associated with the resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetOriginEndpointResult withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The name that describes the channel group. The name is the primary identifier for the channel group, and must be
     * unique for your account in the AWS Region.
     * </p>
     * 
     * @param channelGroupName
     *        The name that describes the channel group. The name is the primary identifier for the channel group, and
     *        must be unique for your account in the AWS Region.
     */

    public void setChannelGroupName(String channelGroupName) {
        this.channelGroupName = channelGroupName;
    }

    /**
     * <p>
     * The name that describes the channel group. The name is the primary identifier for the channel group, and must be
     * unique for your account in the AWS Region.
     * </p>
     * 
     * @return The name that describes the channel group. The name is the primary identifier for the channel group, and
     *         must be unique for your account in the AWS Region.
     */

    public String getChannelGroupName() {
        return this.channelGroupName;
    }

    /**
     * <p>
     * The name that describes the channel group. The name is the primary identifier for the channel group, and must be
     * unique for your account in the AWS Region.
     * </p>
     * 
     * @param channelGroupName
     *        The name that describes the channel group. The name is the primary identifier for the channel group, and
     *        must be unique for your account in the AWS Region.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetOriginEndpointResult withChannelGroupName(String channelGroupName) {
        setChannelGroupName(channelGroupName);
        return this;
    }

    /**
     * <p>
     * The name that describes the channel. The name is the primary identifier for the channel, and must be unique for
     * your account in the AWS Region and channel group.
     * </p>
     * 
     * @param channelName
     *        The name that describes the channel. The name is the primary identifier for the channel, and must be
     *        unique for your account in the AWS Region and channel group.
     */

    public void setChannelName(String channelName) {
        this.channelName = channelName;
    }

    /**
     * <p>
     * The name that describes the channel. The name is the primary identifier for the channel, and must be unique for
     * your account in the AWS Region and channel group.
     * </p>
     * 
     * @return The name that describes the channel. The name is the primary identifier for the channel, and must be
     *         unique for your account in the AWS Region and channel group.
     */

    public String getChannelName() {
        return this.channelName;
    }

    /**
     * <p>
     * The name that describes the channel. The name is the primary identifier for the channel, and must be unique for
     * your account in the AWS Region and channel group.
     * </p>
     * 
     * @param channelName
     *        The name that describes the channel. The name is the primary identifier for the channel, and must be
     *        unique for your account in the AWS Region and channel group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetOriginEndpointResult withChannelName(String channelName) {
        setChannelName(channelName);
        return this;
    }

    /**
     * <p>
     * The name that describes the origin endpoint. The name is the primary identifier for the origin endpoint, and and
     * must be unique for your account in the AWS Region and channel.
     * </p>
     * 
     * @param originEndpointName
     *        The name that describes the origin endpoint. The name is the primary identifier for the origin endpoint,
     *        and and must be unique for your account in the AWS Region and channel.
     */

    public void setOriginEndpointName(String originEndpointName) {
        this.originEndpointName = originEndpointName;
    }

    /**
     * <p>
     * The name that describes the origin endpoint. The name is the primary identifier for the origin endpoint, and and
     * must be unique for your account in the AWS Region and channel.
     * </p>
     * 
     * @return The name that describes the origin endpoint. The name is the primary identifier for the origin endpoint,
     *         and and must be unique for your account in the AWS Region and channel.
     */

    public String getOriginEndpointName() {
        return this.originEndpointName;
    }

    /**
     * <p>
     * The name that describes the origin endpoint. The name is the primary identifier for the origin endpoint, and and
     * must be unique for your account in the AWS Region and channel.
     * </p>
     * 
     * @param originEndpointName
     *        The name that describes the origin endpoint. The name is the primary identifier for the origin endpoint,
     *        and and must be unique for your account in the AWS Region and channel.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetOriginEndpointResult withOriginEndpointName(String originEndpointName) {
        setOriginEndpointName(originEndpointName);
        return this;
    }

    /**
     * <p>
     * The type of container attached to this origin endpoint.
     * </p>
     * 
     * @param containerType
     *        The type of container attached to this origin endpoint.
     * @see ContainerType
     */

    public void setContainerType(String containerType) {
        this.containerType = containerType;
    }

    /**
     * <p>
     * The type of container attached to this origin endpoint.
     * </p>
     * 
     * @return The type of container attached to this origin endpoint.
     * @see ContainerType
     */

    public String getContainerType() {
        return this.containerType;
    }

    /**
     * <p>
     * The type of container attached to this origin endpoint.
     * </p>
     * 
     * @param containerType
     *        The type of container attached to this origin endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ContainerType
     */

    public GetOriginEndpointResult withContainerType(String containerType) {
        setContainerType(containerType);
        return this;
    }

    /**
     * <p>
     * The type of container attached to this origin endpoint.
     * </p>
     * 
     * @param containerType
     *        The type of container attached to this origin endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ContainerType
     */

    public GetOriginEndpointResult withContainerType(ContainerType containerType) {
        this.containerType = containerType.toString();
        return this;
    }

    /**
     * @param segment
     */

    public void setSegment(Segment segment) {
        this.segment = segment;
    }

    /**
     * @return
     */

    public Segment getSegment() {
        return this.segment;
    }

    /**
     * @param segment
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetOriginEndpointResult withSegment(Segment segment) {
        setSegment(segment);
        return this;
    }

    /**
     * <p>
     * The date and time the origin endpoint was created.
     * </p>
     * 
     * @param createdAt
     *        The date and time the origin endpoint was created.
     */

    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * The date and time the origin endpoint was created.
     * </p>
     * 
     * @return The date and time the origin endpoint was created.
     */

    public java.util.Date getCreatedAt() {
        return this.createdAt;
    }

    /**
     * <p>
     * The date and time the origin endpoint was created.
     * </p>
     * 
     * @param createdAt
     *        The date and time the origin endpoint was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetOriginEndpointResult withCreatedAt(java.util.Date createdAt) {
        setCreatedAt(createdAt);
        return this;
    }

    /**
     * <p>
     * The date and time the origin endpoint was modified.
     * </p>
     * 
     * @param modifiedAt
     *        The date and time the origin endpoint was modified.
     */

    public void setModifiedAt(java.util.Date modifiedAt) {
        this.modifiedAt = modifiedAt;
    }

    /**
     * <p>
     * The date and time the origin endpoint was modified.
     * </p>
     * 
     * @return The date and time the origin endpoint was modified.
     */

    public java.util.Date getModifiedAt() {
        return this.modifiedAt;
    }

    /**
     * <p>
     * The date and time the origin endpoint was modified.
     * </p>
     * 
     * @param modifiedAt
     *        The date and time the origin endpoint was modified.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetOriginEndpointResult withModifiedAt(java.util.Date modifiedAt) {
        setModifiedAt(modifiedAt);
        return this;
    }

    /**
     * <p>
     * The description for your origin endpoint.
     * </p>
     * 
     * @param description
     *        The description for your origin endpoint.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description for your origin endpoint.
     * </p>
     * 
     * @return The description for your origin endpoint.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description for your origin endpoint.
     * </p>
     * 
     * @param description
     *        The description for your origin endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetOriginEndpointResult withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The size of the window (in seconds) to create a window of the live stream that's available for on-demand viewing.
     * Viewers can start-over or catch-up on content that falls within the window.
     * </p>
     * 
     * @param startoverWindowSeconds
     *        The size of the window (in seconds) to create a window of the live stream that's available for on-demand
     *        viewing. Viewers can start-over or catch-up on content that falls within the window.
     */

    public void setStartoverWindowSeconds(Integer startoverWindowSeconds) {
        this.startoverWindowSeconds = startoverWindowSeconds;
    }

    /**
     * <p>
     * The size of the window (in seconds) to create a window of the live stream that's available for on-demand viewing.
     * Viewers can start-over or catch-up on content that falls within the window.
     * </p>
     * 
     * @return The size of the window (in seconds) to create a window of the live stream that's available for on-demand
     *         viewing. Viewers can start-over or catch-up on content that falls within the window.
     */

    public Integer getStartoverWindowSeconds() {
        return this.startoverWindowSeconds;
    }

    /**
     * <p>
     * The size of the window (in seconds) to create a window of the live stream that's available for on-demand viewing.
     * Viewers can start-over or catch-up on content that falls within the window.
     * </p>
     * 
     * @param startoverWindowSeconds
     *        The size of the window (in seconds) to create a window of the live stream that's available for on-demand
     *        viewing. Viewers can start-over or catch-up on content that falls within the window.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetOriginEndpointResult withStartoverWindowSeconds(Integer startoverWindowSeconds) {
        setStartoverWindowSeconds(startoverWindowSeconds);
        return this;
    }

    /**
     * <p>
     * An HTTP live streaming (HLS) manifest configuration.
     * </p>
     * 
     * @return An HTTP live streaming (HLS) manifest configuration.
     */

    public java.util.List<GetHlsManifestConfiguration> getHlsManifests() {
        return hlsManifests;
    }

    /**
     * <p>
     * An HTTP live streaming (HLS) manifest configuration.
     * </p>
     * 
     * @param hlsManifests
     *        An HTTP live streaming (HLS) manifest configuration.
     */

    public void setHlsManifests(java.util.Collection<GetHlsManifestConfiguration> hlsManifests) {
        if (hlsManifests == null) {
            this.hlsManifests = null;
            return;
        }

        this.hlsManifests = new java.util.ArrayList<GetHlsManifestConfiguration>(hlsManifests);
    }

    /**
     * <p>
     * An HTTP live streaming (HLS) manifest configuration.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setHlsManifests(java.util.Collection)} or {@link #withHlsManifests(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param hlsManifests
     *        An HTTP live streaming (HLS) manifest configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetOriginEndpointResult withHlsManifests(GetHlsManifestConfiguration... hlsManifests) {
        if (this.hlsManifests == null) {
            setHlsManifests(new java.util.ArrayList<GetHlsManifestConfiguration>(hlsManifests.length));
        }
        for (GetHlsManifestConfiguration ele : hlsManifests) {
            this.hlsManifests.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An HTTP live streaming (HLS) manifest configuration.
     * </p>
     * 
     * @param hlsManifests
     *        An HTTP live streaming (HLS) manifest configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetOriginEndpointResult withHlsManifests(java.util.Collection<GetHlsManifestConfiguration> hlsManifests) {
        setHlsManifests(hlsManifests);
        return this;
    }

    /**
     * <p>
     * A low-latency HLS manifest configuration.
     * </p>
     * 
     * @return A low-latency HLS manifest configuration.
     */

    public java.util.List<GetLowLatencyHlsManifestConfiguration> getLowLatencyHlsManifests() {
        return lowLatencyHlsManifests;
    }

    /**
     * <p>
     * A low-latency HLS manifest configuration.
     * </p>
     * 
     * @param lowLatencyHlsManifests
     *        A low-latency HLS manifest configuration.
     */

    public void setLowLatencyHlsManifests(java.util.Collection<GetLowLatencyHlsManifestConfiguration> lowLatencyHlsManifests) {
        if (lowLatencyHlsManifests == null) {
            this.lowLatencyHlsManifests = null;
            return;
        }

        this.lowLatencyHlsManifests = new java.util.ArrayList<GetLowLatencyHlsManifestConfiguration>(lowLatencyHlsManifests);
    }

    /**
     * <p>
     * A low-latency HLS manifest configuration.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setLowLatencyHlsManifests(java.util.Collection)} or
     * {@link #withLowLatencyHlsManifests(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param lowLatencyHlsManifests
     *        A low-latency HLS manifest configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetOriginEndpointResult withLowLatencyHlsManifests(GetLowLatencyHlsManifestConfiguration... lowLatencyHlsManifests) {
        if (this.lowLatencyHlsManifests == null) {
            setLowLatencyHlsManifests(new java.util.ArrayList<GetLowLatencyHlsManifestConfiguration>(lowLatencyHlsManifests.length));
        }
        for (GetLowLatencyHlsManifestConfiguration ele : lowLatencyHlsManifests) {
            this.lowLatencyHlsManifests.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A low-latency HLS manifest configuration.
     * </p>
     * 
     * @param lowLatencyHlsManifests
     *        A low-latency HLS manifest configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetOriginEndpointResult withLowLatencyHlsManifests(java.util.Collection<GetLowLatencyHlsManifestConfiguration> lowLatencyHlsManifests) {
        setLowLatencyHlsManifests(lowLatencyHlsManifests);
        return this;
    }

    /**
     * <p>
     * The current Entity Tag (ETag) associated with this resource. The entity tag can be used to safely make concurrent
     * updates to the resource.
     * </p>
     * 
     * @param eTag
     *        The current Entity Tag (ETag) associated with this resource. The entity tag can be used to safely make
     *        concurrent updates to the resource.
     */

    public void setETag(String eTag) {
        this.eTag = eTag;
    }

    /**
     * <p>
     * The current Entity Tag (ETag) associated with this resource. The entity tag can be used to safely make concurrent
     * updates to the resource.
     * </p>
     * 
     * @return The current Entity Tag (ETag) associated with this resource. The entity tag can be used to safely make
     *         concurrent updates to the resource.
     */

    public String getETag() {
        return this.eTag;
    }

    /**
     * <p>
     * The current Entity Tag (ETag) associated with this resource. The entity tag can be used to safely make concurrent
     * updates to the resource.
     * </p>
     * 
     * @param eTag
     *        The current Entity Tag (ETag) associated with this resource. The entity tag can be used to safely make
     *        concurrent updates to the resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetOriginEndpointResult withETag(String eTag) {
        setETag(eTag);
        return this;
    }

    /**
     * <p>
     * The comma-separated list of tag key:value pairs assigned to the origin endpoint.
     * </p>
     * 
     * @return The comma-separated list of tag key:value pairs assigned to the origin endpoint.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * The comma-separated list of tag key:value pairs assigned to the origin endpoint.
     * </p>
     * 
     * @param tags
     *        The comma-separated list of tag key:value pairs assigned to the origin endpoint.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * The comma-separated list of tag key:value pairs assigned to the origin endpoint.
     * </p>
     * 
     * @param tags
     *        The comma-separated list of tag key:value pairs assigned to the origin endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetOriginEndpointResult withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see GetOriginEndpointResult#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public GetOriginEndpointResult addTagsEntry(String key, String value) {
        if (null == this.tags) {
            this.tags = new java.util.HashMap<String, String>();
        }
        if (this.tags.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.tags.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Tags.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetOriginEndpointResult clearTagsEntries() {
        this.tags = null;
        return this;
    }

    /**
     * <p>
     * A DASH manifest configuration.
     * </p>
     * 
     * @return A DASH manifest configuration.
     */

    public java.util.List<GetDashManifestConfiguration> getDashManifests() {
        return dashManifests;
    }

    /**
     * <p>
     * A DASH manifest configuration.
     * </p>
     * 
     * @param dashManifests
     *        A DASH manifest configuration.
     */

    public void setDashManifests(java.util.Collection<GetDashManifestConfiguration> dashManifests) {
        if (dashManifests == null) {
            this.dashManifests = null;
            return;
        }

        this.dashManifests = new java.util.ArrayList<GetDashManifestConfiguration>(dashManifests);
    }

    /**
     * <p>
     * A DASH manifest configuration.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDashManifests(java.util.Collection)} or {@link #withDashManifests(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param dashManifests
     *        A DASH manifest configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetOriginEndpointResult withDashManifests(GetDashManifestConfiguration... dashManifests) {
        if (this.dashManifests == null) {
            setDashManifests(new java.util.ArrayList<GetDashManifestConfiguration>(dashManifests.length));
        }
        for (GetDashManifestConfiguration ele : dashManifests) {
            this.dashManifests.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A DASH manifest configuration.
     * </p>
     * 
     * @param dashManifests
     *        A DASH manifest configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetOriginEndpointResult withDashManifests(java.util.Collection<GetDashManifestConfiguration> dashManifests) {
        setDashManifests(dashManifests);
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
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getChannelGroupName() != null)
            sb.append("ChannelGroupName: ").append(getChannelGroupName()).append(",");
        if (getChannelName() != null)
            sb.append("ChannelName: ").append(getChannelName()).append(",");
        if (getOriginEndpointName() != null)
            sb.append("OriginEndpointName: ").append(getOriginEndpointName()).append(",");
        if (getContainerType() != null)
            sb.append("ContainerType: ").append(getContainerType()).append(",");
        if (getSegment() != null)
            sb.append("Segment: ").append(getSegment()).append(",");
        if (getCreatedAt() != null)
            sb.append("CreatedAt: ").append(getCreatedAt()).append(",");
        if (getModifiedAt() != null)
            sb.append("ModifiedAt: ").append(getModifiedAt()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getStartoverWindowSeconds() != null)
            sb.append("StartoverWindowSeconds: ").append(getStartoverWindowSeconds()).append(",");
        if (getHlsManifests() != null)
            sb.append("HlsManifests: ").append(getHlsManifests()).append(",");
        if (getLowLatencyHlsManifests() != null)
            sb.append("LowLatencyHlsManifests: ").append(getLowLatencyHlsManifests()).append(",");
        if (getETag() != null)
            sb.append("ETag: ").append(getETag()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
        if (getDashManifests() != null)
            sb.append("DashManifests: ").append(getDashManifests());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetOriginEndpointResult == false)
            return false;
        GetOriginEndpointResult other = (GetOriginEndpointResult) obj;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getChannelGroupName() == null ^ this.getChannelGroupName() == null)
            return false;
        if (other.getChannelGroupName() != null && other.getChannelGroupName().equals(this.getChannelGroupName()) == false)
            return false;
        if (other.getChannelName() == null ^ this.getChannelName() == null)
            return false;
        if (other.getChannelName() != null && other.getChannelName().equals(this.getChannelName()) == false)
            return false;
        if (other.getOriginEndpointName() == null ^ this.getOriginEndpointName() == null)
            return false;
        if (other.getOriginEndpointName() != null && other.getOriginEndpointName().equals(this.getOriginEndpointName()) == false)
            return false;
        if (other.getContainerType() == null ^ this.getContainerType() == null)
            return false;
        if (other.getContainerType() != null && other.getContainerType().equals(this.getContainerType()) == false)
            return false;
        if (other.getSegment() == null ^ this.getSegment() == null)
            return false;
        if (other.getSegment() != null && other.getSegment().equals(this.getSegment()) == false)
            return false;
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null)
            return false;
        if (other.getCreatedAt() != null && other.getCreatedAt().equals(this.getCreatedAt()) == false)
            return false;
        if (other.getModifiedAt() == null ^ this.getModifiedAt() == null)
            return false;
        if (other.getModifiedAt() != null && other.getModifiedAt().equals(this.getModifiedAt()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getStartoverWindowSeconds() == null ^ this.getStartoverWindowSeconds() == null)
            return false;
        if (other.getStartoverWindowSeconds() != null && other.getStartoverWindowSeconds().equals(this.getStartoverWindowSeconds()) == false)
            return false;
        if (other.getHlsManifests() == null ^ this.getHlsManifests() == null)
            return false;
        if (other.getHlsManifests() != null && other.getHlsManifests().equals(this.getHlsManifests()) == false)
            return false;
        if (other.getLowLatencyHlsManifests() == null ^ this.getLowLatencyHlsManifests() == null)
            return false;
        if (other.getLowLatencyHlsManifests() != null && other.getLowLatencyHlsManifests().equals(this.getLowLatencyHlsManifests()) == false)
            return false;
        if (other.getETag() == null ^ this.getETag() == null)
            return false;
        if (other.getETag() != null && other.getETag().equals(this.getETag()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getDashManifests() == null ^ this.getDashManifests() == null)
            return false;
        if (other.getDashManifests() != null && other.getDashManifests().equals(this.getDashManifests()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getChannelGroupName() == null) ? 0 : getChannelGroupName().hashCode());
        hashCode = prime * hashCode + ((getChannelName() == null) ? 0 : getChannelName().hashCode());
        hashCode = prime * hashCode + ((getOriginEndpointName() == null) ? 0 : getOriginEndpointName().hashCode());
        hashCode = prime * hashCode + ((getContainerType() == null) ? 0 : getContainerType().hashCode());
        hashCode = prime * hashCode + ((getSegment() == null) ? 0 : getSegment().hashCode());
        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        hashCode = prime * hashCode + ((getModifiedAt() == null) ? 0 : getModifiedAt().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getStartoverWindowSeconds() == null) ? 0 : getStartoverWindowSeconds().hashCode());
        hashCode = prime * hashCode + ((getHlsManifests() == null) ? 0 : getHlsManifests().hashCode());
        hashCode = prime * hashCode + ((getLowLatencyHlsManifests() == null) ? 0 : getLowLatencyHlsManifests().hashCode());
        hashCode = prime * hashCode + ((getETag() == null) ? 0 : getETag().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getDashManifests() == null) ? 0 : getDashManifests().hashCode());
        return hashCode;
    }

    @Override
    public GetOriginEndpointResult clone() {
        try {
            return (GetOriginEndpointResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
