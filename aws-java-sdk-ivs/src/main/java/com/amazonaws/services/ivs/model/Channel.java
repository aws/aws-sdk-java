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
package com.amazonaws.services.ivs.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Object specifying a channel.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ivs-2020-07-14/Channel" target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Channel implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Channel ARN.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * Whether the channel is private (enabled for playback authorization). Default: <code>false</code>.
     * </p>
     */
    private Boolean authorized;
    /**
     * <p>
     * Channel ingest endpoint, part of the definition of an ingest server, used when you set up streaming software.
     * </p>
     */
    private String ingestEndpoint;
    /**
     * <p>
     * Whether the channel allows insecure RTMP ingest. Default: <code>false</code>.
     * </p>
     */
    private Boolean insecureIngest;
    /**
     * <p>
     * Channel latency mode. Use <code>NORMAL</code> to broadcast and deliver live video up to Full HD. Use
     * <code>LOW</code> for near-real-time interaction with viewers. Default: <code>LOW</code>.
     * </p>
     */
    private String latencyMode;
    /**
     * <p>
     * Channel name.
     * </p>
     */
    private String name;
    /**
     * <p>
     * Playback-restriction-policy ARN. A valid ARN value here both specifies the ARN and enables playback restriction.
     * Default: "" (empty string, no playback restriction policy is applied).
     * </p>
     */
    private String playbackRestrictionPolicyArn;
    /**
     * <p>
     * Channel playback URL.
     * </p>
     */
    private String playbackUrl;
    /**
     * <p>
     * Optional transcode preset for the channel. This is selectable only for <code>ADVANCED_HD</code> and
     * <code>ADVANCED_SD</code> channel types. For those channel types, the default <code>preset</code> is
     * <code>HIGHER_BANDWIDTH_DELIVERY</code>. For other channel types (<code>BASIC</code> and <code>STANDARD</code>),
     * <code>preset</code> is the empty string (<code>""</code>).
     * </p>
     */
    private String preset;
    /**
     * <p>
     * Recording-configuration ARN. A valid ARN value here both specifies the ARN and enables recording. Default: ""
     * (empty string, recording is disabled).
     * </p>
     */
    private String recordingConfigurationArn;
    /**
     * <p>
     * Specifies the endpoint and optional passphrase for streaming with the SRT protocol.
     * </p>
     */
    private Srt srt;
    /**
     * <p>
     * Tags attached to the resource. Array of 1-50 maps, each of the form <code>string:string (key:value)</code>. See
     * <a href="https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html">Tagging Amazon Web Services
     * Resources</a> for more information, including restrictions that apply to tags and
     * "Tag naming limits and requirements"; Amazon IVS has no service-specific constraints beyond what is documented
     * there.
     * </p>
     */
    private java.util.Map<String, String> tags;
    /**
     * <p>
     * Channel type, which determines the allowable resolution and bitrate. <i>If you exceed the allowable input
     * resolution or bitrate, the stream probably will disconnect immediately.</i> Default: <code>STANDARD</code>. For
     * details, see <a href="https://docs.aws.amazon.com/ivs/latest/LowLatencyAPIReference/channel-types.html">Channel
     * Types</a>.
     * </p>
     */
    private String type;

    /**
     * <p>
     * Channel ARN.
     * </p>
     * 
     * @param arn
     *        Channel ARN.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * Channel ARN.
     * </p>
     * 
     * @return Channel ARN.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * Channel ARN.
     * </p>
     * 
     * @param arn
     *        Channel ARN.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Channel withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * Whether the channel is private (enabled for playback authorization). Default: <code>false</code>.
     * </p>
     * 
     * @param authorized
     *        Whether the channel is private (enabled for playback authorization). Default: <code>false</code>.
     */

    public void setAuthorized(Boolean authorized) {
        this.authorized = authorized;
    }

    /**
     * <p>
     * Whether the channel is private (enabled for playback authorization). Default: <code>false</code>.
     * </p>
     * 
     * @return Whether the channel is private (enabled for playback authorization). Default: <code>false</code>.
     */

    public Boolean getAuthorized() {
        return this.authorized;
    }

    /**
     * <p>
     * Whether the channel is private (enabled for playback authorization). Default: <code>false</code>.
     * </p>
     * 
     * @param authorized
     *        Whether the channel is private (enabled for playback authorization). Default: <code>false</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Channel withAuthorized(Boolean authorized) {
        setAuthorized(authorized);
        return this;
    }

    /**
     * <p>
     * Whether the channel is private (enabled for playback authorization). Default: <code>false</code>.
     * </p>
     * 
     * @return Whether the channel is private (enabled for playback authorization). Default: <code>false</code>.
     */

    public Boolean isAuthorized() {
        return this.authorized;
    }

    /**
     * <p>
     * Channel ingest endpoint, part of the definition of an ingest server, used when you set up streaming software.
     * </p>
     * 
     * @param ingestEndpoint
     *        Channel ingest endpoint, part of the definition of an ingest server, used when you set up streaming
     *        software.
     */

    public void setIngestEndpoint(String ingestEndpoint) {
        this.ingestEndpoint = ingestEndpoint;
    }

    /**
     * <p>
     * Channel ingest endpoint, part of the definition of an ingest server, used when you set up streaming software.
     * </p>
     * 
     * @return Channel ingest endpoint, part of the definition of an ingest server, used when you set up streaming
     *         software.
     */

    public String getIngestEndpoint() {
        return this.ingestEndpoint;
    }

    /**
     * <p>
     * Channel ingest endpoint, part of the definition of an ingest server, used when you set up streaming software.
     * </p>
     * 
     * @param ingestEndpoint
     *        Channel ingest endpoint, part of the definition of an ingest server, used when you set up streaming
     *        software.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Channel withIngestEndpoint(String ingestEndpoint) {
        setIngestEndpoint(ingestEndpoint);
        return this;
    }

    /**
     * <p>
     * Whether the channel allows insecure RTMP ingest. Default: <code>false</code>.
     * </p>
     * 
     * @param insecureIngest
     *        Whether the channel allows insecure RTMP ingest. Default: <code>false</code>.
     */

    public void setInsecureIngest(Boolean insecureIngest) {
        this.insecureIngest = insecureIngest;
    }

    /**
     * <p>
     * Whether the channel allows insecure RTMP ingest. Default: <code>false</code>.
     * </p>
     * 
     * @return Whether the channel allows insecure RTMP ingest. Default: <code>false</code>.
     */

    public Boolean getInsecureIngest() {
        return this.insecureIngest;
    }

    /**
     * <p>
     * Whether the channel allows insecure RTMP ingest. Default: <code>false</code>.
     * </p>
     * 
     * @param insecureIngest
     *        Whether the channel allows insecure RTMP ingest. Default: <code>false</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Channel withInsecureIngest(Boolean insecureIngest) {
        setInsecureIngest(insecureIngest);
        return this;
    }

    /**
     * <p>
     * Whether the channel allows insecure RTMP ingest. Default: <code>false</code>.
     * </p>
     * 
     * @return Whether the channel allows insecure RTMP ingest. Default: <code>false</code>.
     */

    public Boolean isInsecureIngest() {
        return this.insecureIngest;
    }

    /**
     * <p>
     * Channel latency mode. Use <code>NORMAL</code> to broadcast and deliver live video up to Full HD. Use
     * <code>LOW</code> for near-real-time interaction with viewers. Default: <code>LOW</code>.
     * </p>
     * 
     * @param latencyMode
     *        Channel latency mode. Use <code>NORMAL</code> to broadcast and deliver live video up to Full HD. Use
     *        <code>LOW</code> for near-real-time interaction with viewers. Default: <code>LOW</code>.
     * @see ChannelLatencyMode
     */

    public void setLatencyMode(String latencyMode) {
        this.latencyMode = latencyMode;
    }

    /**
     * <p>
     * Channel latency mode. Use <code>NORMAL</code> to broadcast and deliver live video up to Full HD. Use
     * <code>LOW</code> for near-real-time interaction with viewers. Default: <code>LOW</code>.
     * </p>
     * 
     * @return Channel latency mode. Use <code>NORMAL</code> to broadcast and deliver live video up to Full HD. Use
     *         <code>LOW</code> for near-real-time interaction with viewers. Default: <code>LOW</code>.
     * @see ChannelLatencyMode
     */

    public String getLatencyMode() {
        return this.latencyMode;
    }

    /**
     * <p>
     * Channel latency mode. Use <code>NORMAL</code> to broadcast and deliver live video up to Full HD. Use
     * <code>LOW</code> for near-real-time interaction with viewers. Default: <code>LOW</code>.
     * </p>
     * 
     * @param latencyMode
     *        Channel latency mode. Use <code>NORMAL</code> to broadcast and deliver live video up to Full HD. Use
     *        <code>LOW</code> for near-real-time interaction with viewers. Default: <code>LOW</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ChannelLatencyMode
     */

    public Channel withLatencyMode(String latencyMode) {
        setLatencyMode(latencyMode);
        return this;
    }

    /**
     * <p>
     * Channel latency mode. Use <code>NORMAL</code> to broadcast and deliver live video up to Full HD. Use
     * <code>LOW</code> for near-real-time interaction with viewers. Default: <code>LOW</code>.
     * </p>
     * 
     * @param latencyMode
     *        Channel latency mode. Use <code>NORMAL</code> to broadcast and deliver live video up to Full HD. Use
     *        <code>LOW</code> for near-real-time interaction with viewers. Default: <code>LOW</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ChannelLatencyMode
     */

    public Channel withLatencyMode(ChannelLatencyMode latencyMode) {
        this.latencyMode = latencyMode.toString();
        return this;
    }

    /**
     * <p>
     * Channel name.
     * </p>
     * 
     * @param name
     *        Channel name.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * Channel name.
     * </p>
     * 
     * @return Channel name.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * Channel name.
     * </p>
     * 
     * @param name
     *        Channel name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Channel withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * Playback-restriction-policy ARN. A valid ARN value here both specifies the ARN and enables playback restriction.
     * Default: "" (empty string, no playback restriction policy is applied).
     * </p>
     * 
     * @param playbackRestrictionPolicyArn
     *        Playback-restriction-policy ARN. A valid ARN value here both specifies the ARN and enables playback
     *        restriction. Default: "" (empty string, no playback restriction policy is applied).
     */

    public void setPlaybackRestrictionPolicyArn(String playbackRestrictionPolicyArn) {
        this.playbackRestrictionPolicyArn = playbackRestrictionPolicyArn;
    }

    /**
     * <p>
     * Playback-restriction-policy ARN. A valid ARN value here both specifies the ARN and enables playback restriction.
     * Default: "" (empty string, no playback restriction policy is applied).
     * </p>
     * 
     * @return Playback-restriction-policy ARN. A valid ARN value here both specifies the ARN and enables playback
     *         restriction. Default: "" (empty string, no playback restriction policy is applied).
     */

    public String getPlaybackRestrictionPolicyArn() {
        return this.playbackRestrictionPolicyArn;
    }

    /**
     * <p>
     * Playback-restriction-policy ARN. A valid ARN value here both specifies the ARN and enables playback restriction.
     * Default: "" (empty string, no playback restriction policy is applied).
     * </p>
     * 
     * @param playbackRestrictionPolicyArn
     *        Playback-restriction-policy ARN. A valid ARN value here both specifies the ARN and enables playback
     *        restriction. Default: "" (empty string, no playback restriction policy is applied).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Channel withPlaybackRestrictionPolicyArn(String playbackRestrictionPolicyArn) {
        setPlaybackRestrictionPolicyArn(playbackRestrictionPolicyArn);
        return this;
    }

    /**
     * <p>
     * Channel playback URL.
     * </p>
     * 
     * @param playbackUrl
     *        Channel playback URL.
     */

    public void setPlaybackUrl(String playbackUrl) {
        this.playbackUrl = playbackUrl;
    }

    /**
     * <p>
     * Channel playback URL.
     * </p>
     * 
     * @return Channel playback URL.
     */

    public String getPlaybackUrl() {
        return this.playbackUrl;
    }

    /**
     * <p>
     * Channel playback URL.
     * </p>
     * 
     * @param playbackUrl
     *        Channel playback URL.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Channel withPlaybackUrl(String playbackUrl) {
        setPlaybackUrl(playbackUrl);
        return this;
    }

    /**
     * <p>
     * Optional transcode preset for the channel. This is selectable only for <code>ADVANCED_HD</code> and
     * <code>ADVANCED_SD</code> channel types. For those channel types, the default <code>preset</code> is
     * <code>HIGHER_BANDWIDTH_DELIVERY</code>. For other channel types (<code>BASIC</code> and <code>STANDARD</code>),
     * <code>preset</code> is the empty string (<code>""</code>).
     * </p>
     * 
     * @param preset
     *        Optional transcode preset for the channel. This is selectable only for <code>ADVANCED_HD</code> and
     *        <code>ADVANCED_SD</code> channel types. For those channel types, the default <code>preset</code> is
     *        <code>HIGHER_BANDWIDTH_DELIVERY</code>. For other channel types (<code>BASIC</code> and
     *        <code>STANDARD</code>), <code>preset</code> is the empty string (<code>""</code>).
     * @see TranscodePreset
     */

    public void setPreset(String preset) {
        this.preset = preset;
    }

    /**
     * <p>
     * Optional transcode preset for the channel. This is selectable only for <code>ADVANCED_HD</code> and
     * <code>ADVANCED_SD</code> channel types. For those channel types, the default <code>preset</code> is
     * <code>HIGHER_BANDWIDTH_DELIVERY</code>. For other channel types (<code>BASIC</code> and <code>STANDARD</code>),
     * <code>preset</code> is the empty string (<code>""</code>).
     * </p>
     * 
     * @return Optional transcode preset for the channel. This is selectable only for <code>ADVANCED_HD</code> and
     *         <code>ADVANCED_SD</code> channel types. For those channel types, the default <code>preset</code> is
     *         <code>HIGHER_BANDWIDTH_DELIVERY</code>. For other channel types (<code>BASIC</code> and
     *         <code>STANDARD</code>), <code>preset</code> is the empty string (<code>""</code>).
     * @see TranscodePreset
     */

    public String getPreset() {
        return this.preset;
    }

    /**
     * <p>
     * Optional transcode preset for the channel. This is selectable only for <code>ADVANCED_HD</code> and
     * <code>ADVANCED_SD</code> channel types. For those channel types, the default <code>preset</code> is
     * <code>HIGHER_BANDWIDTH_DELIVERY</code>. For other channel types (<code>BASIC</code> and <code>STANDARD</code>),
     * <code>preset</code> is the empty string (<code>""</code>).
     * </p>
     * 
     * @param preset
     *        Optional transcode preset for the channel. This is selectable only for <code>ADVANCED_HD</code> and
     *        <code>ADVANCED_SD</code> channel types. For those channel types, the default <code>preset</code> is
     *        <code>HIGHER_BANDWIDTH_DELIVERY</code>. For other channel types (<code>BASIC</code> and
     *        <code>STANDARD</code>), <code>preset</code> is the empty string (<code>""</code>).
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TranscodePreset
     */

    public Channel withPreset(String preset) {
        setPreset(preset);
        return this;
    }

    /**
     * <p>
     * Optional transcode preset for the channel. This is selectable only for <code>ADVANCED_HD</code> and
     * <code>ADVANCED_SD</code> channel types. For those channel types, the default <code>preset</code> is
     * <code>HIGHER_BANDWIDTH_DELIVERY</code>. For other channel types (<code>BASIC</code> and <code>STANDARD</code>),
     * <code>preset</code> is the empty string (<code>""</code>).
     * </p>
     * 
     * @param preset
     *        Optional transcode preset for the channel. This is selectable only for <code>ADVANCED_HD</code> and
     *        <code>ADVANCED_SD</code> channel types. For those channel types, the default <code>preset</code> is
     *        <code>HIGHER_BANDWIDTH_DELIVERY</code>. For other channel types (<code>BASIC</code> and
     *        <code>STANDARD</code>), <code>preset</code> is the empty string (<code>""</code>).
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TranscodePreset
     */

    public Channel withPreset(TranscodePreset preset) {
        this.preset = preset.toString();
        return this;
    }

    /**
     * <p>
     * Recording-configuration ARN. A valid ARN value here both specifies the ARN and enables recording. Default: ""
     * (empty string, recording is disabled).
     * </p>
     * 
     * @param recordingConfigurationArn
     *        Recording-configuration ARN. A valid ARN value here both specifies the ARN and enables recording. Default:
     *        "" (empty string, recording is disabled).
     */

    public void setRecordingConfigurationArn(String recordingConfigurationArn) {
        this.recordingConfigurationArn = recordingConfigurationArn;
    }

    /**
     * <p>
     * Recording-configuration ARN. A valid ARN value here both specifies the ARN and enables recording. Default: ""
     * (empty string, recording is disabled).
     * </p>
     * 
     * @return Recording-configuration ARN. A valid ARN value here both specifies the ARN and enables recording.
     *         Default: "" (empty string, recording is disabled).
     */

    public String getRecordingConfigurationArn() {
        return this.recordingConfigurationArn;
    }

    /**
     * <p>
     * Recording-configuration ARN. A valid ARN value here both specifies the ARN and enables recording. Default: ""
     * (empty string, recording is disabled).
     * </p>
     * 
     * @param recordingConfigurationArn
     *        Recording-configuration ARN. A valid ARN value here both specifies the ARN and enables recording. Default:
     *        "" (empty string, recording is disabled).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Channel withRecordingConfigurationArn(String recordingConfigurationArn) {
        setRecordingConfigurationArn(recordingConfigurationArn);
        return this;
    }

    /**
     * <p>
     * Specifies the endpoint and optional passphrase for streaming with the SRT protocol.
     * </p>
     * 
     * @param srt
     *        Specifies the endpoint and optional passphrase for streaming with the SRT protocol.
     */

    public void setSrt(Srt srt) {
        this.srt = srt;
    }

    /**
     * <p>
     * Specifies the endpoint and optional passphrase for streaming with the SRT protocol.
     * </p>
     * 
     * @return Specifies the endpoint and optional passphrase for streaming with the SRT protocol.
     */

    public Srt getSrt() {
        return this.srt;
    }

    /**
     * <p>
     * Specifies the endpoint and optional passphrase for streaming with the SRT protocol.
     * </p>
     * 
     * @param srt
     *        Specifies the endpoint and optional passphrase for streaming with the SRT protocol.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Channel withSrt(Srt srt) {
        setSrt(srt);
        return this;
    }

    /**
     * <p>
     * Tags attached to the resource. Array of 1-50 maps, each of the form <code>string:string (key:value)</code>. See
     * <a href="https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html">Tagging Amazon Web Services
     * Resources</a> for more information, including restrictions that apply to tags and
     * "Tag naming limits and requirements"; Amazon IVS has no service-specific constraints beyond what is documented
     * there.
     * </p>
     * 
     * @return Tags attached to the resource. Array of 1-50 maps, each of the form
     *         <code>string:string (key:value)</code>. See <a
     *         href="https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html">Tagging Amazon Web Services
     *         Resources</a> for more information, including restrictions that apply to tags and
     *         "Tag naming limits and requirements"; Amazon IVS has no service-specific constraints beyond what is
     *         documented there.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * Tags attached to the resource. Array of 1-50 maps, each of the form <code>string:string (key:value)</code>. See
     * <a href="https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html">Tagging Amazon Web Services
     * Resources</a> for more information, including restrictions that apply to tags and
     * "Tag naming limits and requirements"; Amazon IVS has no service-specific constraints beyond what is documented
     * there.
     * </p>
     * 
     * @param tags
     *        Tags attached to the resource. Array of 1-50 maps, each of the form <code>string:string (key:value)</code>
     *        . See <a href="https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html">Tagging Amazon Web Services
     *        Resources</a> for more information, including restrictions that apply to tags and
     *        "Tag naming limits and requirements"; Amazon IVS has no service-specific constraints beyond what is
     *        documented there.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * Tags attached to the resource. Array of 1-50 maps, each of the form <code>string:string (key:value)</code>. See
     * <a href="https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html">Tagging Amazon Web Services
     * Resources</a> for more information, including restrictions that apply to tags and
     * "Tag naming limits and requirements"; Amazon IVS has no service-specific constraints beyond what is documented
     * there.
     * </p>
     * 
     * @param tags
     *        Tags attached to the resource. Array of 1-50 maps, each of the form <code>string:string (key:value)</code>
     *        . See <a href="https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html">Tagging Amazon Web Services
     *        Resources</a> for more information, including restrictions that apply to tags and
     *        "Tag naming limits and requirements"; Amazon IVS has no service-specific constraints beyond what is
     *        documented there.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Channel withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see Channel#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public Channel addTagsEntry(String key, String value) {
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

    public Channel clearTagsEntries() {
        this.tags = null;
        return this;
    }

    /**
     * <p>
     * Channel type, which determines the allowable resolution and bitrate. <i>If you exceed the allowable input
     * resolution or bitrate, the stream probably will disconnect immediately.</i> Default: <code>STANDARD</code>. For
     * details, see <a href="https://docs.aws.amazon.com/ivs/latest/LowLatencyAPIReference/channel-types.html">Channel
     * Types</a>.
     * </p>
     * 
     * @param type
     *        Channel type, which determines the allowable resolution and bitrate. <i>If you exceed the allowable input
     *        resolution or bitrate, the stream probably will disconnect immediately.</i> Default: <code>STANDARD</code>
     *        . For details, see <a
     *        href="https://docs.aws.amazon.com/ivs/latest/LowLatencyAPIReference/channel-types.html">Channel Types</a>.
     * @see ChannelType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * Channel type, which determines the allowable resolution and bitrate. <i>If you exceed the allowable input
     * resolution or bitrate, the stream probably will disconnect immediately.</i> Default: <code>STANDARD</code>. For
     * details, see <a href="https://docs.aws.amazon.com/ivs/latest/LowLatencyAPIReference/channel-types.html">Channel
     * Types</a>.
     * </p>
     * 
     * @return Channel type, which determines the allowable resolution and bitrate. <i>If you exceed the allowable input
     *         resolution or bitrate, the stream probably will disconnect immediately.</i> Default:
     *         <code>STANDARD</code>. For details, see <a
     *         href="https://docs.aws.amazon.com/ivs/latest/LowLatencyAPIReference/channel-types.html">Channel
     *         Types</a>.
     * @see ChannelType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * Channel type, which determines the allowable resolution and bitrate. <i>If you exceed the allowable input
     * resolution or bitrate, the stream probably will disconnect immediately.</i> Default: <code>STANDARD</code>. For
     * details, see <a href="https://docs.aws.amazon.com/ivs/latest/LowLatencyAPIReference/channel-types.html">Channel
     * Types</a>.
     * </p>
     * 
     * @param type
     *        Channel type, which determines the allowable resolution and bitrate. <i>If you exceed the allowable input
     *        resolution or bitrate, the stream probably will disconnect immediately.</i> Default: <code>STANDARD</code>
     *        . For details, see <a
     *        href="https://docs.aws.amazon.com/ivs/latest/LowLatencyAPIReference/channel-types.html">Channel Types</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ChannelType
     */

    public Channel withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * Channel type, which determines the allowable resolution and bitrate. <i>If you exceed the allowable input
     * resolution or bitrate, the stream probably will disconnect immediately.</i> Default: <code>STANDARD</code>. For
     * details, see <a href="https://docs.aws.amazon.com/ivs/latest/LowLatencyAPIReference/channel-types.html">Channel
     * Types</a>.
     * </p>
     * 
     * @param type
     *        Channel type, which determines the allowable resolution and bitrate. <i>If you exceed the allowable input
     *        resolution or bitrate, the stream probably will disconnect immediately.</i> Default: <code>STANDARD</code>
     *        . For details, see <a
     *        href="https://docs.aws.amazon.com/ivs/latest/LowLatencyAPIReference/channel-types.html">Channel Types</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ChannelType
     */

    public Channel withType(ChannelType type) {
        this.type = type.toString();
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
        if (getAuthorized() != null)
            sb.append("Authorized: ").append(getAuthorized()).append(",");
        if (getIngestEndpoint() != null)
            sb.append("IngestEndpoint: ").append(getIngestEndpoint()).append(",");
        if (getInsecureIngest() != null)
            sb.append("InsecureIngest: ").append(getInsecureIngest()).append(",");
        if (getLatencyMode() != null)
            sb.append("LatencyMode: ").append(getLatencyMode()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getPlaybackRestrictionPolicyArn() != null)
            sb.append("PlaybackRestrictionPolicyArn: ").append(getPlaybackRestrictionPolicyArn()).append(",");
        if (getPlaybackUrl() != null)
            sb.append("PlaybackUrl: ").append(getPlaybackUrl()).append(",");
        if (getPreset() != null)
            sb.append("Preset: ").append(getPreset()).append(",");
        if (getRecordingConfigurationArn() != null)
            sb.append("RecordingConfigurationArn: ").append(getRecordingConfigurationArn()).append(",");
        if (getSrt() != null)
            sb.append("Srt: ").append(getSrt()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Channel == false)
            return false;
        Channel other = (Channel) obj;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getAuthorized() == null ^ this.getAuthorized() == null)
            return false;
        if (other.getAuthorized() != null && other.getAuthorized().equals(this.getAuthorized()) == false)
            return false;
        if (other.getIngestEndpoint() == null ^ this.getIngestEndpoint() == null)
            return false;
        if (other.getIngestEndpoint() != null && other.getIngestEndpoint().equals(this.getIngestEndpoint()) == false)
            return false;
        if (other.getInsecureIngest() == null ^ this.getInsecureIngest() == null)
            return false;
        if (other.getInsecureIngest() != null && other.getInsecureIngest().equals(this.getInsecureIngest()) == false)
            return false;
        if (other.getLatencyMode() == null ^ this.getLatencyMode() == null)
            return false;
        if (other.getLatencyMode() != null && other.getLatencyMode().equals(this.getLatencyMode()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getPlaybackRestrictionPolicyArn() == null ^ this.getPlaybackRestrictionPolicyArn() == null)
            return false;
        if (other.getPlaybackRestrictionPolicyArn() != null && other.getPlaybackRestrictionPolicyArn().equals(this.getPlaybackRestrictionPolicyArn()) == false)
            return false;
        if (other.getPlaybackUrl() == null ^ this.getPlaybackUrl() == null)
            return false;
        if (other.getPlaybackUrl() != null && other.getPlaybackUrl().equals(this.getPlaybackUrl()) == false)
            return false;
        if (other.getPreset() == null ^ this.getPreset() == null)
            return false;
        if (other.getPreset() != null && other.getPreset().equals(this.getPreset()) == false)
            return false;
        if (other.getRecordingConfigurationArn() == null ^ this.getRecordingConfigurationArn() == null)
            return false;
        if (other.getRecordingConfigurationArn() != null && other.getRecordingConfigurationArn().equals(this.getRecordingConfigurationArn()) == false)
            return false;
        if (other.getSrt() == null ^ this.getSrt() == null)
            return false;
        if (other.getSrt() != null && other.getSrt().equals(this.getSrt()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getAuthorized() == null) ? 0 : getAuthorized().hashCode());
        hashCode = prime * hashCode + ((getIngestEndpoint() == null) ? 0 : getIngestEndpoint().hashCode());
        hashCode = prime * hashCode + ((getInsecureIngest() == null) ? 0 : getInsecureIngest().hashCode());
        hashCode = prime * hashCode + ((getLatencyMode() == null) ? 0 : getLatencyMode().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getPlaybackRestrictionPolicyArn() == null) ? 0 : getPlaybackRestrictionPolicyArn().hashCode());
        hashCode = prime * hashCode + ((getPlaybackUrl() == null) ? 0 : getPlaybackUrl().hashCode());
        hashCode = prime * hashCode + ((getPreset() == null) ? 0 : getPreset().hashCode());
        hashCode = prime * hashCode + ((getRecordingConfigurationArn() == null) ? 0 : getRecordingConfigurationArn().hashCode());
        hashCode = prime * hashCode + ((getSrt() == null) ? 0 : getSrt().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        return hashCode;
    }

    @Override
    public Channel clone() {
        try {
            return (Channel) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.ivs.model.transform.ChannelMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
