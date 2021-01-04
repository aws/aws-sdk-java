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
     * Channel name.
     * </p>
     */
    private String name;
    /**
     * <p>
     * Channel latency mode. Default: <code>LOW</code>.
     * </p>
     */
    private String latencyMode;
    /**
     * <p>
     * Channel type, which determines the allowable resolution and bitrate. <i>If you exceed the allowable resolution or
     * bitrate, the stream probably will disconnect immediately.</i> Valid values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>STANDARD</code>: Multiple qualities are generated from the original input, to automatically give viewers
     * the best experience for their devices and network conditions. Vertical resolution can be up to 1080 and bitrate
     * can be up to 8.5 Mbps.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>BASIC</code>: Amazon IVS delivers the original input to viewers. The viewer’s video-quality choice is
     * limited to the original input. Vertical resolution can be up to 480 and bitrate can be up to 1.5 Mbps.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Default: <code>STANDARD</code>.
     * </p>
     */
    private String type;
    /**
     * <p>
     * Channel ingest endpoint, part of the definition of an ingest server, used when you set up streaming software.
     * </p>
     */
    private String ingestEndpoint;
    /**
     * <p>
     * Channel playback URL.
     * </p>
     */
    private String playbackUrl;
    /**
     * <p>
     * Whether the channel is authorized.
     * </p>
     */
    private Boolean authorized;
    /**
     * <p>
     * Array of 1-50 maps, each of the form <code>string:string (key:value)</code>.
     * </p>
     */
    private java.util.Map<String, String> tags;

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
     * Channel latency mode. Default: <code>LOW</code>.
     * </p>
     * 
     * @param latencyMode
     *        Channel latency mode. Default: <code>LOW</code>.
     * @see ChannelLatencyMode
     */

    public void setLatencyMode(String latencyMode) {
        this.latencyMode = latencyMode;
    }

    /**
     * <p>
     * Channel latency mode. Default: <code>LOW</code>.
     * </p>
     * 
     * @return Channel latency mode. Default: <code>LOW</code>.
     * @see ChannelLatencyMode
     */

    public String getLatencyMode() {
        return this.latencyMode;
    }

    /**
     * <p>
     * Channel latency mode. Default: <code>LOW</code>.
     * </p>
     * 
     * @param latencyMode
     *        Channel latency mode. Default: <code>LOW</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ChannelLatencyMode
     */

    public Channel withLatencyMode(String latencyMode) {
        setLatencyMode(latencyMode);
        return this;
    }

    /**
     * <p>
     * Channel latency mode. Default: <code>LOW</code>.
     * </p>
     * 
     * @param latencyMode
     *        Channel latency mode. Default: <code>LOW</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ChannelLatencyMode
     */

    public Channel withLatencyMode(ChannelLatencyMode latencyMode) {
        this.latencyMode = latencyMode.toString();
        return this;
    }

    /**
     * <p>
     * Channel type, which determines the allowable resolution and bitrate. <i>If you exceed the allowable resolution or
     * bitrate, the stream probably will disconnect immediately.</i> Valid values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>STANDARD</code>: Multiple qualities are generated from the original input, to automatically give viewers
     * the best experience for their devices and network conditions. Vertical resolution can be up to 1080 and bitrate
     * can be up to 8.5 Mbps.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>BASIC</code>: Amazon IVS delivers the original input to viewers. The viewer’s video-quality choice is
     * limited to the original input. Vertical resolution can be up to 480 and bitrate can be up to 1.5 Mbps.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Default: <code>STANDARD</code>.
     * </p>
     * 
     * @param type
     *        Channel type, which determines the allowable resolution and bitrate. <i>If you exceed the allowable
     *        resolution or bitrate, the stream probably will disconnect immediately.</i> Valid values:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>STANDARD</code>: Multiple qualities are generated from the original input, to automatically give
     *        viewers the best experience for their devices and network conditions. Vertical resolution can be up to
     *        1080 and bitrate can be up to 8.5 Mbps.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>BASIC</code>: Amazon IVS delivers the original input to viewers. The viewer’s video-quality choice
     *        is limited to the original input. Vertical resolution can be up to 480 and bitrate can be up to 1.5 Mbps.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Default: <code>STANDARD</code>.
     * @see ChannelType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * Channel type, which determines the allowable resolution and bitrate. <i>If you exceed the allowable resolution or
     * bitrate, the stream probably will disconnect immediately.</i> Valid values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>STANDARD</code>: Multiple qualities are generated from the original input, to automatically give viewers
     * the best experience for their devices and network conditions. Vertical resolution can be up to 1080 and bitrate
     * can be up to 8.5 Mbps.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>BASIC</code>: Amazon IVS delivers the original input to viewers. The viewer’s video-quality choice is
     * limited to the original input. Vertical resolution can be up to 480 and bitrate can be up to 1.5 Mbps.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Default: <code>STANDARD</code>.
     * </p>
     * 
     * @return Channel type, which determines the allowable resolution and bitrate. <i>If you exceed the allowable
     *         resolution or bitrate, the stream probably will disconnect immediately.</i> Valid values:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>STANDARD</code>: Multiple qualities are generated from the original input, to automatically give
     *         viewers the best experience for their devices and network conditions. Vertical resolution can be up to
     *         1080 and bitrate can be up to 8.5 Mbps.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>BASIC</code>: Amazon IVS delivers the original input to viewers. The viewer’s video-quality choice
     *         is limited to the original input. Vertical resolution can be up to 480 and bitrate can be up to 1.5 Mbps.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         Default: <code>STANDARD</code>.
     * @see ChannelType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * Channel type, which determines the allowable resolution and bitrate. <i>If you exceed the allowable resolution or
     * bitrate, the stream probably will disconnect immediately.</i> Valid values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>STANDARD</code>: Multiple qualities are generated from the original input, to automatically give viewers
     * the best experience for their devices and network conditions. Vertical resolution can be up to 1080 and bitrate
     * can be up to 8.5 Mbps.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>BASIC</code>: Amazon IVS delivers the original input to viewers. The viewer’s video-quality choice is
     * limited to the original input. Vertical resolution can be up to 480 and bitrate can be up to 1.5 Mbps.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Default: <code>STANDARD</code>.
     * </p>
     * 
     * @param type
     *        Channel type, which determines the allowable resolution and bitrate. <i>If you exceed the allowable
     *        resolution or bitrate, the stream probably will disconnect immediately.</i> Valid values:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>STANDARD</code>: Multiple qualities are generated from the original input, to automatically give
     *        viewers the best experience for their devices and network conditions. Vertical resolution can be up to
     *        1080 and bitrate can be up to 8.5 Mbps.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>BASIC</code>: Amazon IVS delivers the original input to viewers. The viewer’s video-quality choice
     *        is limited to the original input. Vertical resolution can be up to 480 and bitrate can be up to 1.5 Mbps.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Default: <code>STANDARD</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ChannelType
     */

    public Channel withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * Channel type, which determines the allowable resolution and bitrate. <i>If you exceed the allowable resolution or
     * bitrate, the stream probably will disconnect immediately.</i> Valid values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>STANDARD</code>: Multiple qualities are generated from the original input, to automatically give viewers
     * the best experience for their devices and network conditions. Vertical resolution can be up to 1080 and bitrate
     * can be up to 8.5 Mbps.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>BASIC</code>: Amazon IVS delivers the original input to viewers. The viewer’s video-quality choice is
     * limited to the original input. Vertical resolution can be up to 480 and bitrate can be up to 1.5 Mbps.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Default: <code>STANDARD</code>.
     * </p>
     * 
     * @param type
     *        Channel type, which determines the allowable resolution and bitrate. <i>If you exceed the allowable
     *        resolution or bitrate, the stream probably will disconnect immediately.</i> Valid values:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>STANDARD</code>: Multiple qualities are generated from the original input, to automatically give
     *        viewers the best experience for their devices and network conditions. Vertical resolution can be up to
     *        1080 and bitrate can be up to 8.5 Mbps.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>BASIC</code>: Amazon IVS delivers the original input to viewers. The viewer’s video-quality choice
     *        is limited to the original input. Vertical resolution can be up to 480 and bitrate can be up to 1.5 Mbps.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Default: <code>STANDARD</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ChannelType
     */

    public Channel withType(ChannelType type) {
        this.type = type.toString();
        return this;
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
     * Whether the channel is authorized.
     * </p>
     * 
     * @param authorized
     *        Whether the channel is authorized.
     */

    public void setAuthorized(Boolean authorized) {
        this.authorized = authorized;
    }

    /**
     * <p>
     * Whether the channel is authorized.
     * </p>
     * 
     * @return Whether the channel is authorized.
     */

    public Boolean getAuthorized() {
        return this.authorized;
    }

    /**
     * <p>
     * Whether the channel is authorized.
     * </p>
     * 
     * @param authorized
     *        Whether the channel is authorized.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Channel withAuthorized(Boolean authorized) {
        setAuthorized(authorized);
        return this;
    }

    /**
     * <p>
     * Whether the channel is authorized.
     * </p>
     * 
     * @return Whether the channel is authorized.
     */

    public Boolean isAuthorized() {
        return this.authorized;
    }

    /**
     * <p>
     * Array of 1-50 maps, each of the form <code>string:string (key:value)</code>.
     * </p>
     * 
     * @return Array of 1-50 maps, each of the form <code>string:string (key:value)</code>.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * Array of 1-50 maps, each of the form <code>string:string (key:value)</code>.
     * </p>
     * 
     * @param tags
     *        Array of 1-50 maps, each of the form <code>string:string (key:value)</code>.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * Array of 1-50 maps, each of the form <code>string:string (key:value)</code>.
     * </p>
     * 
     * @param tags
     *        Array of 1-50 maps, each of the form <code>string:string (key:value)</code>.
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getLatencyMode() != null)
            sb.append("LatencyMode: ").append(getLatencyMode()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getIngestEndpoint() != null)
            sb.append("IngestEndpoint: ").append(getIngestEndpoint()).append(",");
        if (getPlaybackUrl() != null)
            sb.append("PlaybackUrl: ").append(getPlaybackUrl()).append(",");
        if (getAuthorized() != null)
            sb.append("Authorized: ").append(getAuthorized()).append(",");
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

        if (obj instanceof Channel == false)
            return false;
        Channel other = (Channel) obj;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getLatencyMode() == null ^ this.getLatencyMode() == null)
            return false;
        if (other.getLatencyMode() != null && other.getLatencyMode().equals(this.getLatencyMode()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getIngestEndpoint() == null ^ this.getIngestEndpoint() == null)
            return false;
        if (other.getIngestEndpoint() != null && other.getIngestEndpoint().equals(this.getIngestEndpoint()) == false)
            return false;
        if (other.getPlaybackUrl() == null ^ this.getPlaybackUrl() == null)
            return false;
        if (other.getPlaybackUrl() != null && other.getPlaybackUrl().equals(this.getPlaybackUrl()) == false)
            return false;
        if (other.getAuthorized() == null ^ this.getAuthorized() == null)
            return false;
        if (other.getAuthorized() != null && other.getAuthorized().equals(this.getAuthorized()) == false)
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

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getLatencyMode() == null) ? 0 : getLatencyMode().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getIngestEndpoint() == null) ? 0 : getIngestEndpoint().hashCode());
        hashCode = prime * hashCode + ((getPlaybackUrl() == null) ? 0 : getPlaybackUrl().hashCode());
        hashCode = prime * hashCode + ((getAuthorized() == null) ? 0 : getAuthorized().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
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
