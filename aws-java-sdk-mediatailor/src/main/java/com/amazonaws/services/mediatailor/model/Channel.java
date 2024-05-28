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
package com.amazonaws.services.mediatailor.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The configuration parameters for a channel. For information about MediaTailor channels, see <a
 * href="https://docs.aws.amazon.com/mediatailor/latest/ug/channel-assembly-channels.html">Working with channels</a> in
 * the <i>MediaTailor User Guide</i>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediatailor-2018-04-23/Channel" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Channel implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ARN of the channel.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The list of audiences defined in channel.
     * </p>
     */
    private java.util.List<String> audiences;
    /**
     * <p>
     * The name of the channel.
     * </p>
     */
    private String channelName;
    /**
     * <p>
     * Returns the state whether the channel is running or not.
     * </p>
     */
    private String channelState;
    /**
     * <p>
     * The timestamp of when the channel was created.
     * </p>
     */
    private java.util.Date creationTime;
    /**
     * <p>
     * The slate used to fill gaps between programs in the schedule. You must configure filler slate if your channel
     * uses the <code>LINEAR</code> <code>PlaybackMode</code>. MediaTailor doesn't support filler slate for channels
     * using the <code>LOOP</code> <code>PlaybackMode</code>.
     * </p>
     */
    private SlateSource fillerSlate;
    /**
     * <p>
     * The timestamp of when the channel was last modified.
     * </p>
     */
    private java.util.Date lastModifiedTime;
    /**
     * <p>
     * The log configuration.
     * </p>
     */
    private LogConfigurationForChannel logConfiguration;
    /**
     * <p>
     * The channel's output properties.
     * </p>
     */
    private java.util.List<ResponseOutputItem> outputs;
    /**
     * <p>
     * The type of playback mode for this channel.
     * </p>
     * <p>
     * <code>LINEAR</code> - Programs play back-to-back only once.
     * </p>
     * <p>
     * <code>LOOP</code> - Programs play back-to-back in an endless loop. When the last program in the schedule plays,
     * playback loops back to the first program in the schedule.
     * </p>
     */
    private String playbackMode;
    /**
     * <p>
     * The tags to assign to the channel. Tags are key-value pairs that you can associate with Amazon resources to help
     * with organization, access control, and cost tracking. For more information, see <a
     * href="https://docs.aws.amazon.com/mediatailor/latest/ug/tagging.html">Tagging AWS Elemental MediaTailor
     * Resources</a>.
     * </p>
     */
    private java.util.Map<String, String> tags;
    /**
     * <p>
     * The tier for this channel. STANDARD tier channels can contain live programs.
     * </p>
     */
    private String tier;

    /**
     * <p>
     * The ARN of the channel.
     * </p>
     * 
     * @param arn
     *        The ARN of the channel.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The ARN of the channel.
     * </p>
     * 
     * @return The ARN of the channel.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The ARN of the channel.
     * </p>
     * 
     * @param arn
     *        The ARN of the channel.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Channel withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The list of audiences defined in channel.
     * </p>
     * 
     * @return The list of audiences defined in channel.
     */

    public java.util.List<String> getAudiences() {
        return audiences;
    }

    /**
     * <p>
     * The list of audiences defined in channel.
     * </p>
     * 
     * @param audiences
     *        The list of audiences defined in channel.
     */

    public void setAudiences(java.util.Collection<String> audiences) {
        if (audiences == null) {
            this.audiences = null;
            return;
        }

        this.audiences = new java.util.ArrayList<String>(audiences);
    }

    /**
     * <p>
     * The list of audiences defined in channel.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAudiences(java.util.Collection)} or {@link #withAudiences(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param audiences
     *        The list of audiences defined in channel.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Channel withAudiences(String... audiences) {
        if (this.audiences == null) {
            setAudiences(new java.util.ArrayList<String>(audiences.length));
        }
        for (String ele : audiences) {
            this.audiences.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of audiences defined in channel.
     * </p>
     * 
     * @param audiences
     *        The list of audiences defined in channel.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Channel withAudiences(java.util.Collection<String> audiences) {
        setAudiences(audiences);
        return this;
    }

    /**
     * <p>
     * The name of the channel.
     * </p>
     * 
     * @param channelName
     *        The name of the channel.
     */

    public void setChannelName(String channelName) {
        this.channelName = channelName;
    }

    /**
     * <p>
     * The name of the channel.
     * </p>
     * 
     * @return The name of the channel.
     */

    public String getChannelName() {
        return this.channelName;
    }

    /**
     * <p>
     * The name of the channel.
     * </p>
     * 
     * @param channelName
     *        The name of the channel.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Channel withChannelName(String channelName) {
        setChannelName(channelName);
        return this;
    }

    /**
     * <p>
     * Returns the state whether the channel is running or not.
     * </p>
     * 
     * @param channelState
     *        Returns the state whether the channel is running or not.
     */

    public void setChannelState(String channelState) {
        this.channelState = channelState;
    }

    /**
     * <p>
     * Returns the state whether the channel is running or not.
     * </p>
     * 
     * @return Returns the state whether the channel is running or not.
     */

    public String getChannelState() {
        return this.channelState;
    }

    /**
     * <p>
     * Returns the state whether the channel is running or not.
     * </p>
     * 
     * @param channelState
     *        Returns the state whether the channel is running or not.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Channel withChannelState(String channelState) {
        setChannelState(channelState);
        return this;
    }

    /**
     * <p>
     * The timestamp of when the channel was created.
     * </p>
     * 
     * @param creationTime
     *        The timestamp of when the channel was created.
     */

    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * The timestamp of when the channel was created.
     * </p>
     * 
     * @return The timestamp of when the channel was created.
     */

    public java.util.Date getCreationTime() {
        return this.creationTime;
    }

    /**
     * <p>
     * The timestamp of when the channel was created.
     * </p>
     * 
     * @param creationTime
     *        The timestamp of when the channel was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Channel withCreationTime(java.util.Date creationTime) {
        setCreationTime(creationTime);
        return this;
    }

    /**
     * <p>
     * The slate used to fill gaps between programs in the schedule. You must configure filler slate if your channel
     * uses the <code>LINEAR</code> <code>PlaybackMode</code>. MediaTailor doesn't support filler slate for channels
     * using the <code>LOOP</code> <code>PlaybackMode</code>.
     * </p>
     * 
     * @param fillerSlate
     *        The slate used to fill gaps between programs in the schedule. You must configure filler slate if your
     *        channel uses the <code>LINEAR</code> <code>PlaybackMode</code>. MediaTailor doesn't support filler slate
     *        for channels using the <code>LOOP</code> <code>PlaybackMode</code>.
     */

    public void setFillerSlate(SlateSource fillerSlate) {
        this.fillerSlate = fillerSlate;
    }

    /**
     * <p>
     * The slate used to fill gaps between programs in the schedule. You must configure filler slate if your channel
     * uses the <code>LINEAR</code> <code>PlaybackMode</code>. MediaTailor doesn't support filler slate for channels
     * using the <code>LOOP</code> <code>PlaybackMode</code>.
     * </p>
     * 
     * @return The slate used to fill gaps between programs in the schedule. You must configure filler slate if your
     *         channel uses the <code>LINEAR</code> <code>PlaybackMode</code>. MediaTailor doesn't support filler slate
     *         for channels using the <code>LOOP</code> <code>PlaybackMode</code>.
     */

    public SlateSource getFillerSlate() {
        return this.fillerSlate;
    }

    /**
     * <p>
     * The slate used to fill gaps between programs in the schedule. You must configure filler slate if your channel
     * uses the <code>LINEAR</code> <code>PlaybackMode</code>. MediaTailor doesn't support filler slate for channels
     * using the <code>LOOP</code> <code>PlaybackMode</code>.
     * </p>
     * 
     * @param fillerSlate
     *        The slate used to fill gaps between programs in the schedule. You must configure filler slate if your
     *        channel uses the <code>LINEAR</code> <code>PlaybackMode</code>. MediaTailor doesn't support filler slate
     *        for channels using the <code>LOOP</code> <code>PlaybackMode</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Channel withFillerSlate(SlateSource fillerSlate) {
        setFillerSlate(fillerSlate);
        return this;
    }

    /**
     * <p>
     * The timestamp of when the channel was last modified.
     * </p>
     * 
     * @param lastModifiedTime
     *        The timestamp of when the channel was last modified.
     */

    public void setLastModifiedTime(java.util.Date lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
    }

    /**
     * <p>
     * The timestamp of when the channel was last modified.
     * </p>
     * 
     * @return The timestamp of when the channel was last modified.
     */

    public java.util.Date getLastModifiedTime() {
        return this.lastModifiedTime;
    }

    /**
     * <p>
     * The timestamp of when the channel was last modified.
     * </p>
     * 
     * @param lastModifiedTime
     *        The timestamp of when the channel was last modified.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Channel withLastModifiedTime(java.util.Date lastModifiedTime) {
        setLastModifiedTime(lastModifiedTime);
        return this;
    }

    /**
     * <p>
     * The log configuration.
     * </p>
     * 
     * @param logConfiguration
     *        The log configuration.
     */

    public void setLogConfiguration(LogConfigurationForChannel logConfiguration) {
        this.logConfiguration = logConfiguration;
    }

    /**
     * <p>
     * The log configuration.
     * </p>
     * 
     * @return The log configuration.
     */

    public LogConfigurationForChannel getLogConfiguration() {
        return this.logConfiguration;
    }

    /**
     * <p>
     * The log configuration.
     * </p>
     * 
     * @param logConfiguration
     *        The log configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Channel withLogConfiguration(LogConfigurationForChannel logConfiguration) {
        setLogConfiguration(logConfiguration);
        return this;
    }

    /**
     * <p>
     * The channel's output properties.
     * </p>
     * 
     * @return The channel's output properties.
     */

    public java.util.List<ResponseOutputItem> getOutputs() {
        return outputs;
    }

    /**
     * <p>
     * The channel's output properties.
     * </p>
     * 
     * @param outputs
     *        The channel's output properties.
     */

    public void setOutputs(java.util.Collection<ResponseOutputItem> outputs) {
        if (outputs == null) {
            this.outputs = null;
            return;
        }

        this.outputs = new java.util.ArrayList<ResponseOutputItem>(outputs);
    }

    /**
     * <p>
     * The channel's output properties.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setOutputs(java.util.Collection)} or {@link #withOutputs(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param outputs
     *        The channel's output properties.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Channel withOutputs(ResponseOutputItem... outputs) {
        if (this.outputs == null) {
            setOutputs(new java.util.ArrayList<ResponseOutputItem>(outputs.length));
        }
        for (ResponseOutputItem ele : outputs) {
            this.outputs.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The channel's output properties.
     * </p>
     * 
     * @param outputs
     *        The channel's output properties.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Channel withOutputs(java.util.Collection<ResponseOutputItem> outputs) {
        setOutputs(outputs);
        return this;
    }

    /**
     * <p>
     * The type of playback mode for this channel.
     * </p>
     * <p>
     * <code>LINEAR</code> - Programs play back-to-back only once.
     * </p>
     * <p>
     * <code>LOOP</code> - Programs play back-to-back in an endless loop. When the last program in the schedule plays,
     * playback loops back to the first program in the schedule.
     * </p>
     * 
     * @param playbackMode
     *        The type of playback mode for this channel.</p>
     *        <p>
     *        <code>LINEAR</code> - Programs play back-to-back only once.
     *        </p>
     *        <p>
     *        <code>LOOP</code> - Programs play back-to-back in an endless loop. When the last program in the schedule
     *        plays, playback loops back to the first program in the schedule.
     */

    public void setPlaybackMode(String playbackMode) {
        this.playbackMode = playbackMode;
    }

    /**
     * <p>
     * The type of playback mode for this channel.
     * </p>
     * <p>
     * <code>LINEAR</code> - Programs play back-to-back only once.
     * </p>
     * <p>
     * <code>LOOP</code> - Programs play back-to-back in an endless loop. When the last program in the schedule plays,
     * playback loops back to the first program in the schedule.
     * </p>
     * 
     * @return The type of playback mode for this channel.</p>
     *         <p>
     *         <code>LINEAR</code> - Programs play back-to-back only once.
     *         </p>
     *         <p>
     *         <code>LOOP</code> - Programs play back-to-back in an endless loop. When the last program in the schedule
     *         plays, playback loops back to the first program in the schedule.
     */

    public String getPlaybackMode() {
        return this.playbackMode;
    }

    /**
     * <p>
     * The type of playback mode for this channel.
     * </p>
     * <p>
     * <code>LINEAR</code> - Programs play back-to-back only once.
     * </p>
     * <p>
     * <code>LOOP</code> - Programs play back-to-back in an endless loop. When the last program in the schedule plays,
     * playback loops back to the first program in the schedule.
     * </p>
     * 
     * @param playbackMode
     *        The type of playback mode for this channel.</p>
     *        <p>
     *        <code>LINEAR</code> - Programs play back-to-back only once.
     *        </p>
     *        <p>
     *        <code>LOOP</code> - Programs play back-to-back in an endless loop. When the last program in the schedule
     *        plays, playback loops back to the first program in the schedule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Channel withPlaybackMode(String playbackMode) {
        setPlaybackMode(playbackMode);
        return this;
    }

    /**
     * <p>
     * The tags to assign to the channel. Tags are key-value pairs that you can associate with Amazon resources to help
     * with organization, access control, and cost tracking. For more information, see <a
     * href="https://docs.aws.amazon.com/mediatailor/latest/ug/tagging.html">Tagging AWS Elemental MediaTailor
     * Resources</a>.
     * </p>
     * 
     * @return The tags to assign to the channel. Tags are key-value pairs that you can associate with Amazon resources
     *         to help with organization, access control, and cost tracking. For more information, see <a
     *         href="https://docs.aws.amazon.com/mediatailor/latest/ug/tagging.html">Tagging AWS Elemental MediaTailor
     *         Resources</a>.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * The tags to assign to the channel. Tags are key-value pairs that you can associate with Amazon resources to help
     * with organization, access control, and cost tracking. For more information, see <a
     * href="https://docs.aws.amazon.com/mediatailor/latest/ug/tagging.html">Tagging AWS Elemental MediaTailor
     * Resources</a>.
     * </p>
     * 
     * @param tags
     *        The tags to assign to the channel. Tags are key-value pairs that you can associate with Amazon resources
     *        to help with organization, access control, and cost tracking. For more information, see <a
     *        href="https://docs.aws.amazon.com/mediatailor/latest/ug/tagging.html">Tagging AWS Elemental MediaTailor
     *        Resources</a>.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * The tags to assign to the channel. Tags are key-value pairs that you can associate with Amazon resources to help
     * with organization, access control, and cost tracking. For more information, see <a
     * href="https://docs.aws.amazon.com/mediatailor/latest/ug/tagging.html">Tagging AWS Elemental MediaTailor
     * Resources</a>.
     * </p>
     * 
     * @param tags
     *        The tags to assign to the channel. Tags are key-value pairs that you can associate with Amazon resources
     *        to help with organization, access control, and cost tracking. For more information, see <a
     *        href="https://docs.aws.amazon.com/mediatailor/latest/ug/tagging.html">Tagging AWS Elemental MediaTailor
     *        Resources</a>.
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
     * The tier for this channel. STANDARD tier channels can contain live programs.
     * </p>
     * 
     * @param tier
     *        The tier for this channel. STANDARD tier channels can contain live programs.
     */

    public void setTier(String tier) {
        this.tier = tier;
    }

    /**
     * <p>
     * The tier for this channel. STANDARD tier channels can contain live programs.
     * </p>
     * 
     * @return The tier for this channel. STANDARD tier channels can contain live programs.
     */

    public String getTier() {
        return this.tier;
    }

    /**
     * <p>
     * The tier for this channel. STANDARD tier channels can contain live programs.
     * </p>
     * 
     * @param tier
     *        The tier for this channel. STANDARD tier channels can contain live programs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Channel withTier(String tier) {
        setTier(tier);
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
        if (getAudiences() != null)
            sb.append("Audiences: ").append(getAudiences()).append(",");
        if (getChannelName() != null)
            sb.append("ChannelName: ").append(getChannelName()).append(",");
        if (getChannelState() != null)
            sb.append("ChannelState: ").append(getChannelState()).append(",");
        if (getCreationTime() != null)
            sb.append("CreationTime: ").append(getCreationTime()).append(",");
        if (getFillerSlate() != null)
            sb.append("FillerSlate: ").append(getFillerSlate()).append(",");
        if (getLastModifiedTime() != null)
            sb.append("LastModifiedTime: ").append(getLastModifiedTime()).append(",");
        if (getLogConfiguration() != null)
            sb.append("LogConfiguration: ").append(getLogConfiguration()).append(",");
        if (getOutputs() != null)
            sb.append("Outputs: ").append(getOutputs()).append(",");
        if (getPlaybackMode() != null)
            sb.append("PlaybackMode: ").append(getPlaybackMode()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
        if (getTier() != null)
            sb.append("Tier: ").append(getTier());
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
        if (other.getAudiences() == null ^ this.getAudiences() == null)
            return false;
        if (other.getAudiences() != null && other.getAudiences().equals(this.getAudiences()) == false)
            return false;
        if (other.getChannelName() == null ^ this.getChannelName() == null)
            return false;
        if (other.getChannelName() != null && other.getChannelName().equals(this.getChannelName()) == false)
            return false;
        if (other.getChannelState() == null ^ this.getChannelState() == null)
            return false;
        if (other.getChannelState() != null && other.getChannelState().equals(this.getChannelState()) == false)
            return false;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        if (other.getFillerSlate() == null ^ this.getFillerSlate() == null)
            return false;
        if (other.getFillerSlate() != null && other.getFillerSlate().equals(this.getFillerSlate()) == false)
            return false;
        if (other.getLastModifiedTime() == null ^ this.getLastModifiedTime() == null)
            return false;
        if (other.getLastModifiedTime() != null && other.getLastModifiedTime().equals(this.getLastModifiedTime()) == false)
            return false;
        if (other.getLogConfiguration() == null ^ this.getLogConfiguration() == null)
            return false;
        if (other.getLogConfiguration() != null && other.getLogConfiguration().equals(this.getLogConfiguration()) == false)
            return false;
        if (other.getOutputs() == null ^ this.getOutputs() == null)
            return false;
        if (other.getOutputs() != null && other.getOutputs().equals(this.getOutputs()) == false)
            return false;
        if (other.getPlaybackMode() == null ^ this.getPlaybackMode() == null)
            return false;
        if (other.getPlaybackMode() != null && other.getPlaybackMode().equals(this.getPlaybackMode()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getTier() == null ^ this.getTier() == null)
            return false;
        if (other.getTier() != null && other.getTier().equals(this.getTier()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getAudiences() == null) ? 0 : getAudiences().hashCode());
        hashCode = prime * hashCode + ((getChannelName() == null) ? 0 : getChannelName().hashCode());
        hashCode = prime * hashCode + ((getChannelState() == null) ? 0 : getChannelState().hashCode());
        hashCode = prime * hashCode + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode + ((getFillerSlate() == null) ? 0 : getFillerSlate().hashCode());
        hashCode = prime * hashCode + ((getLastModifiedTime() == null) ? 0 : getLastModifiedTime().hashCode());
        hashCode = prime * hashCode + ((getLogConfiguration() == null) ? 0 : getLogConfiguration().hashCode());
        hashCode = prime * hashCode + ((getOutputs() == null) ? 0 : getOutputs().hashCode());
        hashCode = prime * hashCode + ((getPlaybackMode() == null) ? 0 : getPlaybackMode().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getTier() == null) ? 0 : getTier().hashCode());
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
        com.amazonaws.services.mediatailor.model.transform.ChannelMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
