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
package com.amazonaws.services.mediatailor.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediatailor-2018-04-23/CreateChannel" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateChannelRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the channel.
     * </p>
     */
    private String channelName;
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
     * The channel's output properties.
     * </p>
     */
    private java.util.List<RequestOutputItem> outputs;
    /**
     * <p>
     * The type of playback mode to use for this channel.
     * </p>
     * <p>
     * <code>LINEAR</code> - The programs in the schedule play once back-to-back in the schedule.
     * </p>
     * <p>
     * <code>LOOP</code> - The programs in the schedule play back-to-back in an endless loop. When the last program in
     * the schedule stops playing, playback loops back to the first program in the schedule.
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
     * The tier of the channel.
     * </p>
     */
    private String tier;

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

    public CreateChannelRequest withChannelName(String channelName) {
        setChannelName(channelName);
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

    public CreateChannelRequest withFillerSlate(SlateSource fillerSlate) {
        setFillerSlate(fillerSlate);
        return this;
    }

    /**
     * <p>
     * The channel's output properties.
     * </p>
     * 
     * @return The channel's output properties.
     */

    public java.util.List<RequestOutputItem> getOutputs() {
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

    public void setOutputs(java.util.Collection<RequestOutputItem> outputs) {
        if (outputs == null) {
            this.outputs = null;
            return;
        }

        this.outputs = new java.util.ArrayList<RequestOutputItem>(outputs);
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

    public CreateChannelRequest withOutputs(RequestOutputItem... outputs) {
        if (this.outputs == null) {
            setOutputs(new java.util.ArrayList<RequestOutputItem>(outputs.length));
        }
        for (RequestOutputItem ele : outputs) {
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

    public CreateChannelRequest withOutputs(java.util.Collection<RequestOutputItem> outputs) {
        setOutputs(outputs);
        return this;
    }

    /**
     * <p>
     * The type of playback mode to use for this channel.
     * </p>
     * <p>
     * <code>LINEAR</code> - The programs in the schedule play once back-to-back in the schedule.
     * </p>
     * <p>
     * <code>LOOP</code> - The programs in the schedule play back-to-back in an endless loop. When the last program in
     * the schedule stops playing, playback loops back to the first program in the schedule.
     * </p>
     * 
     * @param playbackMode
     *        The type of playback mode to use for this channel.</p>
     *        <p>
     *        <code>LINEAR</code> - The programs in the schedule play once back-to-back in the schedule.
     *        </p>
     *        <p>
     *        <code>LOOP</code> - The programs in the schedule play back-to-back in an endless loop. When the last
     *        program in the schedule stops playing, playback loops back to the first program in the schedule.
     * @see PlaybackMode
     */

    public void setPlaybackMode(String playbackMode) {
        this.playbackMode = playbackMode;
    }

    /**
     * <p>
     * The type of playback mode to use for this channel.
     * </p>
     * <p>
     * <code>LINEAR</code> - The programs in the schedule play once back-to-back in the schedule.
     * </p>
     * <p>
     * <code>LOOP</code> - The programs in the schedule play back-to-back in an endless loop. When the last program in
     * the schedule stops playing, playback loops back to the first program in the schedule.
     * </p>
     * 
     * @return The type of playback mode to use for this channel.</p>
     *         <p>
     *         <code>LINEAR</code> - The programs in the schedule play once back-to-back in the schedule.
     *         </p>
     *         <p>
     *         <code>LOOP</code> - The programs in the schedule play back-to-back in an endless loop. When the last
     *         program in the schedule stops playing, playback loops back to the first program in the schedule.
     * @see PlaybackMode
     */

    public String getPlaybackMode() {
        return this.playbackMode;
    }

    /**
     * <p>
     * The type of playback mode to use for this channel.
     * </p>
     * <p>
     * <code>LINEAR</code> - The programs in the schedule play once back-to-back in the schedule.
     * </p>
     * <p>
     * <code>LOOP</code> - The programs in the schedule play back-to-back in an endless loop. When the last program in
     * the schedule stops playing, playback loops back to the first program in the schedule.
     * </p>
     * 
     * @param playbackMode
     *        The type of playback mode to use for this channel.</p>
     *        <p>
     *        <code>LINEAR</code> - The programs in the schedule play once back-to-back in the schedule.
     *        </p>
     *        <p>
     *        <code>LOOP</code> - The programs in the schedule play back-to-back in an endless loop. When the last
     *        program in the schedule stops playing, playback loops back to the first program in the schedule.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PlaybackMode
     */

    public CreateChannelRequest withPlaybackMode(String playbackMode) {
        setPlaybackMode(playbackMode);
        return this;
    }

    /**
     * <p>
     * The type of playback mode to use for this channel.
     * </p>
     * <p>
     * <code>LINEAR</code> - The programs in the schedule play once back-to-back in the schedule.
     * </p>
     * <p>
     * <code>LOOP</code> - The programs in the schedule play back-to-back in an endless loop. When the last program in
     * the schedule stops playing, playback loops back to the first program in the schedule.
     * </p>
     * 
     * @param playbackMode
     *        The type of playback mode to use for this channel.</p>
     *        <p>
     *        <code>LINEAR</code> - The programs in the schedule play once back-to-back in the schedule.
     *        </p>
     *        <p>
     *        <code>LOOP</code> - The programs in the schedule play back-to-back in an endless loop. When the last
     *        program in the schedule stops playing, playback loops back to the first program in the schedule.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PlaybackMode
     */

    public CreateChannelRequest withPlaybackMode(PlaybackMode playbackMode) {
        this.playbackMode = playbackMode.toString();
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
     * The tier of the channel.
     * </p>
     * 
     * @param tier
     *        The tier of the channel.
     * @see Tier
     */

    public void setTier(String tier) {
        this.tier = tier;
    }

    /**
     * <p>
     * The tier of the channel.
     * </p>
     * 
     * @return The tier of the channel.
     * @see Tier
     */

    public String getTier() {
        return this.tier;
    }

    /**
     * <p>
     * The tier of the channel.
     * </p>
     * 
     * @param tier
     *        The tier of the channel.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Tier
     */

    public CreateChannelRequest withTier(String tier) {
        setTier(tier);
        return this;
    }

    /**
     * <p>
     * The tier of the channel.
     * </p>
     * 
     * @param tier
     *        The tier of the channel.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Tier
     */

    public CreateChannelRequest withTier(Tier tier) {
        this.tier = tier.toString();
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
        if (getChannelName() != null)
            sb.append("ChannelName: ").append(getChannelName()).append(",");
        if (getFillerSlate() != null)
            sb.append("FillerSlate: ").append(getFillerSlate()).append(",");
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

        if (obj instanceof CreateChannelRequest == false)
            return false;
        CreateChannelRequest other = (CreateChannelRequest) obj;
        if (other.getChannelName() == null ^ this.getChannelName() == null)
            return false;
        if (other.getChannelName() != null && other.getChannelName().equals(this.getChannelName()) == false)
            return false;
        if (other.getFillerSlate() == null ^ this.getFillerSlate() == null)
            return false;
        if (other.getFillerSlate() != null && other.getFillerSlate().equals(this.getFillerSlate()) == false)
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

        hashCode = prime * hashCode + ((getChannelName() == null) ? 0 : getChannelName().hashCode());
        hashCode = prime * hashCode + ((getFillerSlate() == null) ? 0 : getFillerSlate().hashCode());
        hashCode = prime * hashCode + ((getOutputs() == null) ? 0 : getOutputs().hashCode());
        hashCode = prime * hashCode + ((getPlaybackMode() == null) ? 0 : getPlaybackMode().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getTier() == null) ? 0 : getTier().hashCode());
        return hashCode;
    }

    @Override
    public CreateChannelRequest clone() {
        return (CreateChannelRequest) super.clone();
    }

}
