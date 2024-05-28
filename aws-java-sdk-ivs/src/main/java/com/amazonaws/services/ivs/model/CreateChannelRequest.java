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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ivs-2020-07-14/CreateChannel" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateChannelRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Whether the channel is private (enabled for playback authorization). Default: <code>false</code>.
     * </p>
     */
    private Boolean authorized;
    /**
     * <p>
     * Whether the channel allows insecure RTMP and SRT ingest. Default: <code>false</code>.
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
     * Array of 1-50 maps, each of the form <code>string:string (key:value)</code>. See <a
     * href="https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html">Tagging Amazon Web Services Resources</a>
     * for more information, including restrictions that apply to tags and "Tag naming limits and requirements"; Amazon
     * IVS has no service-specific constraints beyond what is documented there.
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

    public CreateChannelRequest withAuthorized(Boolean authorized) {
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
     * Whether the channel allows insecure RTMP and SRT ingest. Default: <code>false</code>.
     * </p>
     * 
     * @param insecureIngest
     *        Whether the channel allows insecure RTMP and SRT ingest. Default: <code>false</code>.
     */

    public void setInsecureIngest(Boolean insecureIngest) {
        this.insecureIngest = insecureIngest;
    }

    /**
     * <p>
     * Whether the channel allows insecure RTMP and SRT ingest. Default: <code>false</code>.
     * </p>
     * 
     * @return Whether the channel allows insecure RTMP and SRT ingest. Default: <code>false</code>.
     */

    public Boolean getInsecureIngest() {
        return this.insecureIngest;
    }

    /**
     * <p>
     * Whether the channel allows insecure RTMP and SRT ingest. Default: <code>false</code>.
     * </p>
     * 
     * @param insecureIngest
     *        Whether the channel allows insecure RTMP and SRT ingest. Default: <code>false</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateChannelRequest withInsecureIngest(Boolean insecureIngest) {
        setInsecureIngest(insecureIngest);
        return this;
    }

    /**
     * <p>
     * Whether the channel allows insecure RTMP and SRT ingest. Default: <code>false</code>.
     * </p>
     * 
     * @return Whether the channel allows insecure RTMP and SRT ingest. Default: <code>false</code>.
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

    public CreateChannelRequest withLatencyMode(String latencyMode) {
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

    public CreateChannelRequest withLatencyMode(ChannelLatencyMode latencyMode) {
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

    public CreateChannelRequest withName(String name) {
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

    public CreateChannelRequest withPlaybackRestrictionPolicyArn(String playbackRestrictionPolicyArn) {
        setPlaybackRestrictionPolicyArn(playbackRestrictionPolicyArn);
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

    public CreateChannelRequest withPreset(String preset) {
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

    public CreateChannelRequest withPreset(TranscodePreset preset) {
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

    public CreateChannelRequest withRecordingConfigurationArn(String recordingConfigurationArn) {
        setRecordingConfigurationArn(recordingConfigurationArn);
        return this;
    }

    /**
     * <p>
     * Array of 1-50 maps, each of the form <code>string:string (key:value)</code>. See <a
     * href="https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html">Tagging Amazon Web Services Resources</a>
     * for more information, including restrictions that apply to tags and "Tag naming limits and requirements"; Amazon
     * IVS has no service-specific constraints beyond what is documented there.
     * </p>
     * 
     * @return Array of 1-50 maps, each of the form <code>string:string (key:value)</code>. See <a
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
     * Array of 1-50 maps, each of the form <code>string:string (key:value)</code>. See <a
     * href="https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html">Tagging Amazon Web Services Resources</a>
     * for more information, including restrictions that apply to tags and "Tag naming limits and requirements"; Amazon
     * IVS has no service-specific constraints beyond what is documented there.
     * </p>
     * 
     * @param tags
     *        Array of 1-50 maps, each of the form <code>string:string (key:value)</code>. See <a
     *        href="https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html">Tagging Amazon Web Services
     *        Resources</a> for more information, including restrictions that apply to tags and
     *        "Tag naming limits and requirements"; Amazon IVS has no service-specific constraints beyond what is
     *        documented there.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * Array of 1-50 maps, each of the form <code>string:string (key:value)</code>. See <a
     * href="https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html">Tagging Amazon Web Services Resources</a>
     * for more information, including restrictions that apply to tags and "Tag naming limits and requirements"; Amazon
     * IVS has no service-specific constraints beyond what is documented there.
     * </p>
     * 
     * @param tags
     *        Array of 1-50 maps, each of the form <code>string:string (key:value)</code>. See <a
     *        href="https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html">Tagging Amazon Web Services
     *        Resources</a> for more information, including restrictions that apply to tags and
     *        "Tag naming limits and requirements"; Amazon IVS has no service-specific constraints beyond what is
     *        documented there.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateChannelRequest withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see CreateChannelRequest#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public CreateChannelRequest addTagsEntry(String key, String value) {
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

    public CreateChannelRequest clearTagsEntries() {
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

    public CreateChannelRequest withType(String type) {
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

    public CreateChannelRequest withType(ChannelType type) {
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
        if (getAuthorized() != null)
            sb.append("Authorized: ").append(getAuthorized()).append(",");
        if (getInsecureIngest() != null)
            sb.append("InsecureIngest: ").append(getInsecureIngest()).append(",");
        if (getLatencyMode() != null)
            sb.append("LatencyMode: ").append(getLatencyMode()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getPlaybackRestrictionPolicyArn() != null)
            sb.append("PlaybackRestrictionPolicyArn: ").append(getPlaybackRestrictionPolicyArn()).append(",");
        if (getPreset() != null)
            sb.append("Preset: ").append(getPreset()).append(",");
        if (getRecordingConfigurationArn() != null)
            sb.append("RecordingConfigurationArn: ").append(getRecordingConfigurationArn()).append(",");
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

        if (obj instanceof CreateChannelRequest == false)
            return false;
        CreateChannelRequest other = (CreateChannelRequest) obj;
        if (other.getAuthorized() == null ^ this.getAuthorized() == null)
            return false;
        if (other.getAuthorized() != null && other.getAuthorized().equals(this.getAuthorized()) == false)
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
        if (other.getPreset() == null ^ this.getPreset() == null)
            return false;
        if (other.getPreset() != null && other.getPreset().equals(this.getPreset()) == false)
            return false;
        if (other.getRecordingConfigurationArn() == null ^ this.getRecordingConfigurationArn() == null)
            return false;
        if (other.getRecordingConfigurationArn() != null && other.getRecordingConfigurationArn().equals(this.getRecordingConfigurationArn()) == false)
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

        hashCode = prime * hashCode + ((getAuthorized() == null) ? 0 : getAuthorized().hashCode());
        hashCode = prime * hashCode + ((getInsecureIngest() == null) ? 0 : getInsecureIngest().hashCode());
        hashCode = prime * hashCode + ((getLatencyMode() == null) ? 0 : getLatencyMode().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getPlaybackRestrictionPolicyArn() == null) ? 0 : getPlaybackRestrictionPolicyArn().hashCode());
        hashCode = prime * hashCode + ((getPreset() == null) ? 0 : getPreset().hashCode());
        hashCode = prime * hashCode + ((getRecordingConfigurationArn() == null) ? 0 : getRecordingConfigurationArn().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        return hashCode;
    }

    @Override
    public CreateChannelRequest clone() {
        return (CreateChannelRequest) super.clone();
    }

}
