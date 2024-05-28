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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediapackagev2-2022-12-25/CreateOriginEndpoint"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateOriginEndpointRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

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
     * The name that describes the origin endpoint. The name is the primary identifier for the origin endpoint, and must
     * be unique for your account in the AWS Region and channel. You can't use spaces in the name. You can't change the
     * name after you create the endpoint.
     * </p>
     */
    private String originEndpointName;
    /**
     * <p>
     * The type of container to attach to this origin endpoint. A container type is a file format that encapsulates one
     * or more media streams, such as audio and video, into a single file. You can't change the container type after you
     * create the endpoint.
     * </p>
     */
    private String containerType;
    /**
     * <p>
     * The segment configuration, including the segment name, duration, and other configuration values.
     * </p>
     */
    private Segment segment;
    /**
     * <p>
     * A unique, case-sensitive token that you provide to ensure the idempotency of the request.
     * </p>
     */
    private String clientToken;
    /**
     * <p>
     * Enter any descriptive text that helps you to identify the origin endpoint.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The size of the window (in seconds) to create a window of the live stream that's available for on-demand viewing.
     * Viewers can start-over or catch-up on content that falls within the window. The maximum startover window is
     * 1,209,600 seconds (14 days).
     * </p>
     */
    private Integer startoverWindowSeconds;
    /**
     * <p>
     * An HTTP live streaming (HLS) manifest configuration.
     * </p>
     */
    private java.util.List<CreateHlsManifestConfiguration> hlsManifests;
    /**
     * <p>
     * A low-latency HLS manifest configuration.
     * </p>
     */
    private java.util.List<CreateLowLatencyHlsManifestConfiguration> lowLatencyHlsManifests;
    /**
     * <p>
     * A DASH manifest configuration.
     * </p>
     */
    private java.util.List<CreateDashManifestConfiguration> dashManifests;
    /**
     * <p>
     * A comma-separated list of tag key:value pairs that you define. For example:
     * </p>
     * <p>
     * <code>"Key1": "Value1",</code>
     * </p>
     * <p>
     * <code>"Key2": "Value2"</code>
     * </p>
     */
    private java.util.Map<String, String> tags;

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

    public CreateOriginEndpointRequest withChannelGroupName(String channelGroupName) {
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

    public CreateOriginEndpointRequest withChannelName(String channelName) {
        setChannelName(channelName);
        return this;
    }

    /**
     * <p>
     * The name that describes the origin endpoint. The name is the primary identifier for the origin endpoint, and must
     * be unique for your account in the AWS Region and channel. You can't use spaces in the name. You can't change the
     * name after you create the endpoint.
     * </p>
     * 
     * @param originEndpointName
     *        The name that describes the origin endpoint. The name is the primary identifier for the origin endpoint,
     *        and must be unique for your account in the AWS Region and channel. You can't use spaces in the name. You
     *        can't change the name after you create the endpoint.
     */

    public void setOriginEndpointName(String originEndpointName) {
        this.originEndpointName = originEndpointName;
    }

    /**
     * <p>
     * The name that describes the origin endpoint. The name is the primary identifier for the origin endpoint, and must
     * be unique for your account in the AWS Region and channel. You can't use spaces in the name. You can't change the
     * name after you create the endpoint.
     * </p>
     * 
     * @return The name that describes the origin endpoint. The name is the primary identifier for the origin endpoint,
     *         and must be unique for your account in the AWS Region and channel. You can't use spaces in the name. You
     *         can't change the name after you create the endpoint.
     */

    public String getOriginEndpointName() {
        return this.originEndpointName;
    }

    /**
     * <p>
     * The name that describes the origin endpoint. The name is the primary identifier for the origin endpoint, and must
     * be unique for your account in the AWS Region and channel. You can't use spaces in the name. You can't change the
     * name after you create the endpoint.
     * </p>
     * 
     * @param originEndpointName
     *        The name that describes the origin endpoint. The name is the primary identifier for the origin endpoint,
     *        and must be unique for your account in the AWS Region and channel. You can't use spaces in the name. You
     *        can't change the name after you create the endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateOriginEndpointRequest withOriginEndpointName(String originEndpointName) {
        setOriginEndpointName(originEndpointName);
        return this;
    }

    /**
     * <p>
     * The type of container to attach to this origin endpoint. A container type is a file format that encapsulates one
     * or more media streams, such as audio and video, into a single file. You can't change the container type after you
     * create the endpoint.
     * </p>
     * 
     * @param containerType
     *        The type of container to attach to this origin endpoint. A container type is a file format that
     *        encapsulates one or more media streams, such as audio and video, into a single file. You can't change the
     *        container type after you create the endpoint.
     * @see ContainerType
     */

    public void setContainerType(String containerType) {
        this.containerType = containerType;
    }

    /**
     * <p>
     * The type of container to attach to this origin endpoint. A container type is a file format that encapsulates one
     * or more media streams, such as audio and video, into a single file. You can't change the container type after you
     * create the endpoint.
     * </p>
     * 
     * @return The type of container to attach to this origin endpoint. A container type is a file format that
     *         encapsulates one or more media streams, such as audio and video, into a single file. You can't change the
     *         container type after you create the endpoint.
     * @see ContainerType
     */

    public String getContainerType() {
        return this.containerType;
    }

    /**
     * <p>
     * The type of container to attach to this origin endpoint. A container type is a file format that encapsulates one
     * or more media streams, such as audio and video, into a single file. You can't change the container type after you
     * create the endpoint.
     * </p>
     * 
     * @param containerType
     *        The type of container to attach to this origin endpoint. A container type is a file format that
     *        encapsulates one or more media streams, such as audio and video, into a single file. You can't change the
     *        container type after you create the endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ContainerType
     */

    public CreateOriginEndpointRequest withContainerType(String containerType) {
        setContainerType(containerType);
        return this;
    }

    /**
     * <p>
     * The type of container to attach to this origin endpoint. A container type is a file format that encapsulates one
     * or more media streams, such as audio and video, into a single file. You can't change the container type after you
     * create the endpoint.
     * </p>
     * 
     * @param containerType
     *        The type of container to attach to this origin endpoint. A container type is a file format that
     *        encapsulates one or more media streams, such as audio and video, into a single file. You can't change the
     *        container type after you create the endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ContainerType
     */

    public CreateOriginEndpointRequest withContainerType(ContainerType containerType) {
        this.containerType = containerType.toString();
        return this;
    }

    /**
     * <p>
     * The segment configuration, including the segment name, duration, and other configuration values.
     * </p>
     * 
     * @param segment
     *        The segment configuration, including the segment name, duration, and other configuration values.
     */

    public void setSegment(Segment segment) {
        this.segment = segment;
    }

    /**
     * <p>
     * The segment configuration, including the segment name, duration, and other configuration values.
     * </p>
     * 
     * @return The segment configuration, including the segment name, duration, and other configuration values.
     */

    public Segment getSegment() {
        return this.segment;
    }

    /**
     * <p>
     * The segment configuration, including the segment name, duration, and other configuration values.
     * </p>
     * 
     * @param segment
     *        The segment configuration, including the segment name, duration, and other configuration values.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateOriginEndpointRequest withSegment(Segment segment) {
        setSegment(segment);
        return this;
    }

    /**
     * <p>
     * A unique, case-sensitive token that you provide to ensure the idempotency of the request.
     * </p>
     * 
     * @param clientToken
     *        A unique, case-sensitive token that you provide to ensure the idempotency of the request.
     */

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * A unique, case-sensitive token that you provide to ensure the idempotency of the request.
     * </p>
     * 
     * @return A unique, case-sensitive token that you provide to ensure the idempotency of the request.
     */

    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * <p>
     * A unique, case-sensitive token that you provide to ensure the idempotency of the request.
     * </p>
     * 
     * @param clientToken
     *        A unique, case-sensitive token that you provide to ensure the idempotency of the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateOriginEndpointRequest withClientToken(String clientToken) {
        setClientToken(clientToken);
        return this;
    }

    /**
     * <p>
     * Enter any descriptive text that helps you to identify the origin endpoint.
     * </p>
     * 
     * @param description
     *        Enter any descriptive text that helps you to identify the origin endpoint.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * Enter any descriptive text that helps you to identify the origin endpoint.
     * </p>
     * 
     * @return Enter any descriptive text that helps you to identify the origin endpoint.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * Enter any descriptive text that helps you to identify the origin endpoint.
     * </p>
     * 
     * @param description
     *        Enter any descriptive text that helps you to identify the origin endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateOriginEndpointRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The size of the window (in seconds) to create a window of the live stream that's available for on-demand viewing.
     * Viewers can start-over or catch-up on content that falls within the window. The maximum startover window is
     * 1,209,600 seconds (14 days).
     * </p>
     * 
     * @param startoverWindowSeconds
     *        The size of the window (in seconds) to create a window of the live stream that's available for on-demand
     *        viewing. Viewers can start-over or catch-up on content that falls within the window. The maximum startover
     *        window is 1,209,600 seconds (14 days).
     */

    public void setStartoverWindowSeconds(Integer startoverWindowSeconds) {
        this.startoverWindowSeconds = startoverWindowSeconds;
    }

    /**
     * <p>
     * The size of the window (in seconds) to create a window of the live stream that's available for on-demand viewing.
     * Viewers can start-over or catch-up on content that falls within the window. The maximum startover window is
     * 1,209,600 seconds (14 days).
     * </p>
     * 
     * @return The size of the window (in seconds) to create a window of the live stream that's available for on-demand
     *         viewing. Viewers can start-over or catch-up on content that falls within the window. The maximum
     *         startover window is 1,209,600 seconds (14 days).
     */

    public Integer getStartoverWindowSeconds() {
        return this.startoverWindowSeconds;
    }

    /**
     * <p>
     * The size of the window (in seconds) to create a window of the live stream that's available for on-demand viewing.
     * Viewers can start-over or catch-up on content that falls within the window. The maximum startover window is
     * 1,209,600 seconds (14 days).
     * </p>
     * 
     * @param startoverWindowSeconds
     *        The size of the window (in seconds) to create a window of the live stream that's available for on-demand
     *        viewing. Viewers can start-over or catch-up on content that falls within the window. The maximum startover
     *        window is 1,209,600 seconds (14 days).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateOriginEndpointRequest withStartoverWindowSeconds(Integer startoverWindowSeconds) {
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

    public java.util.List<CreateHlsManifestConfiguration> getHlsManifests() {
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

    public void setHlsManifests(java.util.Collection<CreateHlsManifestConfiguration> hlsManifests) {
        if (hlsManifests == null) {
            this.hlsManifests = null;
            return;
        }

        this.hlsManifests = new java.util.ArrayList<CreateHlsManifestConfiguration>(hlsManifests);
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

    public CreateOriginEndpointRequest withHlsManifests(CreateHlsManifestConfiguration... hlsManifests) {
        if (this.hlsManifests == null) {
            setHlsManifests(new java.util.ArrayList<CreateHlsManifestConfiguration>(hlsManifests.length));
        }
        for (CreateHlsManifestConfiguration ele : hlsManifests) {
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

    public CreateOriginEndpointRequest withHlsManifests(java.util.Collection<CreateHlsManifestConfiguration> hlsManifests) {
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

    public java.util.List<CreateLowLatencyHlsManifestConfiguration> getLowLatencyHlsManifests() {
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

    public void setLowLatencyHlsManifests(java.util.Collection<CreateLowLatencyHlsManifestConfiguration> lowLatencyHlsManifests) {
        if (lowLatencyHlsManifests == null) {
            this.lowLatencyHlsManifests = null;
            return;
        }

        this.lowLatencyHlsManifests = new java.util.ArrayList<CreateLowLatencyHlsManifestConfiguration>(lowLatencyHlsManifests);
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

    public CreateOriginEndpointRequest withLowLatencyHlsManifests(CreateLowLatencyHlsManifestConfiguration... lowLatencyHlsManifests) {
        if (this.lowLatencyHlsManifests == null) {
            setLowLatencyHlsManifests(new java.util.ArrayList<CreateLowLatencyHlsManifestConfiguration>(lowLatencyHlsManifests.length));
        }
        for (CreateLowLatencyHlsManifestConfiguration ele : lowLatencyHlsManifests) {
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

    public CreateOriginEndpointRequest withLowLatencyHlsManifests(java.util.Collection<CreateLowLatencyHlsManifestConfiguration> lowLatencyHlsManifests) {
        setLowLatencyHlsManifests(lowLatencyHlsManifests);
        return this;
    }

    /**
     * <p>
     * A DASH manifest configuration.
     * </p>
     * 
     * @return A DASH manifest configuration.
     */

    public java.util.List<CreateDashManifestConfiguration> getDashManifests() {
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

    public void setDashManifests(java.util.Collection<CreateDashManifestConfiguration> dashManifests) {
        if (dashManifests == null) {
            this.dashManifests = null;
            return;
        }

        this.dashManifests = new java.util.ArrayList<CreateDashManifestConfiguration>(dashManifests);
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

    public CreateOriginEndpointRequest withDashManifests(CreateDashManifestConfiguration... dashManifests) {
        if (this.dashManifests == null) {
            setDashManifests(new java.util.ArrayList<CreateDashManifestConfiguration>(dashManifests.length));
        }
        for (CreateDashManifestConfiguration ele : dashManifests) {
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

    public CreateOriginEndpointRequest withDashManifests(java.util.Collection<CreateDashManifestConfiguration> dashManifests) {
        setDashManifests(dashManifests);
        return this;
    }

    /**
     * <p>
     * A comma-separated list of tag key:value pairs that you define. For example:
     * </p>
     * <p>
     * <code>"Key1": "Value1",</code>
     * </p>
     * <p>
     * <code>"Key2": "Value2"</code>
     * </p>
     * 
     * @return A comma-separated list of tag key:value pairs that you define. For example:</p>
     *         <p>
     *         <code>"Key1": "Value1",</code>
     *         </p>
     *         <p>
     *         <code>"Key2": "Value2"</code>
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * A comma-separated list of tag key:value pairs that you define. For example:
     * </p>
     * <p>
     * <code>"Key1": "Value1",</code>
     * </p>
     * <p>
     * <code>"Key2": "Value2"</code>
     * </p>
     * 
     * @param tags
     *        A comma-separated list of tag key:value pairs that you define. For example:</p>
     *        <p>
     *        <code>"Key1": "Value1",</code>
     *        </p>
     *        <p>
     *        <code>"Key2": "Value2"</code>
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * A comma-separated list of tag key:value pairs that you define. For example:
     * </p>
     * <p>
     * <code>"Key1": "Value1",</code>
     * </p>
     * <p>
     * <code>"Key2": "Value2"</code>
     * </p>
     * 
     * @param tags
     *        A comma-separated list of tag key:value pairs that you define. For example:</p>
     *        <p>
     *        <code>"Key1": "Value1",</code>
     *        </p>
     *        <p>
     *        <code>"Key2": "Value2"</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateOriginEndpointRequest withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see CreateOriginEndpointRequest#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public CreateOriginEndpointRequest addTagsEntry(String key, String value) {
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

    public CreateOriginEndpointRequest clearTagsEntries() {
        this.tags = null;
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
        if (getClientToken() != null)
            sb.append("ClientToken: ").append(getClientToken()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getStartoverWindowSeconds() != null)
            sb.append("StartoverWindowSeconds: ").append(getStartoverWindowSeconds()).append(",");
        if (getHlsManifests() != null)
            sb.append("HlsManifests: ").append(getHlsManifests()).append(",");
        if (getLowLatencyHlsManifests() != null)
            sb.append("LowLatencyHlsManifests: ").append(getLowLatencyHlsManifests()).append(",");
        if (getDashManifests() != null)
            sb.append("DashManifests: ").append(getDashManifests()).append(",");
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

        if (obj instanceof CreateOriginEndpointRequest == false)
            return false;
        CreateOriginEndpointRequest other = (CreateOriginEndpointRequest) obj;
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
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false)
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
        if (other.getDashManifests() == null ^ this.getDashManifests() == null)
            return false;
        if (other.getDashManifests() != null && other.getDashManifests().equals(this.getDashManifests()) == false)
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

        hashCode = prime * hashCode + ((getChannelGroupName() == null) ? 0 : getChannelGroupName().hashCode());
        hashCode = prime * hashCode + ((getChannelName() == null) ? 0 : getChannelName().hashCode());
        hashCode = prime * hashCode + ((getOriginEndpointName() == null) ? 0 : getOriginEndpointName().hashCode());
        hashCode = prime * hashCode + ((getContainerType() == null) ? 0 : getContainerType().hashCode());
        hashCode = prime * hashCode + ((getSegment() == null) ? 0 : getSegment().hashCode());
        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getStartoverWindowSeconds() == null) ? 0 : getStartoverWindowSeconds().hashCode());
        hashCode = prime * hashCode + ((getHlsManifests() == null) ? 0 : getHlsManifests().hashCode());
        hashCode = prime * hashCode + ((getLowLatencyHlsManifests() == null) ? 0 : getLowLatencyHlsManifests().hashCode());
        hashCode = prime * hashCode + ((getDashManifests() == null) ? 0 : getDashManifests().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateOriginEndpointRequest clone() {
        return (CreateOriginEndpointRequest) super.clone();
    }

}
